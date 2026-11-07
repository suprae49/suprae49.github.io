package p1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r implements Cloneable {
    public static final Animator[] D = new Animator[0];
    public static final int[] E = {2, 1, 3, 4};
    public static final a3.f F = new a3.f(20);
    public static final ThreadLocal G = new ThreadLocal();
    public u1.h0 B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f3337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f3338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p[] f3339s;
    public final String f = getClass().getName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3328g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3329h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TimeInterpolator f3330i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f3331j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f3332k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f3333l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.emoji2.text.x f3334m = new androidx.emoji2.text.x(2);
    public androidx.emoji2.text.x n = new androidx.emoji2.text.x(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x f3335o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f3336p = E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f3340t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Animator[] f3341u = D;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3342v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3343w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3344x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r f3345y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f3346z = null;
    public ArrayList A = new ArrayList();
    public a3.f C = F;

    public static void c(androidx.emoji2.text.x xVar, View view, a0 a0Var) {
        p.f fVar = (p.f) xVar.f592a;
        p.f fVar2 = (p.f) xVar.f595d;
        SparseArray sparseArray = (SparseArray) xVar.f593b;
        p.h hVar = (p.h) xVar.f594c;
        fVar.put(view, a0Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = p0.f3233a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (fVar2.containsKey(transitionName)) {
                fVar2.put(transitionName, null);
            } else {
                fVar2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (hVar.f) {
                    int i4 = hVar.f3153i;
                    long[] jArr = hVar.f3151g;
                    Object[] objArr = hVar.f3152h;
                    int i5 = 0;
                    for (int i6 = 0; i6 < i4; i6++) {
                        Object obj = objArr[i6];
                        if (obj != p.i.f3154a) {
                            if (i6 != i5) {
                                jArr[i5] = jArr[i6];
                                objArr[i5] = obj;
                                objArr[i6] = null;
                            }
                            i5++;
                        }
                    }
                    hVar.f = false;
                    hVar.f3153i = i5;
                }
                if (q.a.b(hVar.f3151g, hVar.f3153i, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    hVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) hVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    hVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static p.f r() {
        ThreadLocal threadLocal = G;
        p.f fVar = (p.f) threadLocal.get();
        if (fVar != null) {
            return fVar;
        }
        p.f fVar2 = new p.f(0);
        threadLocal.set(fVar2);
        return fVar2;
    }

    public static boolean w(a0 a0Var, a0 a0Var2, String str) {
        Object obj = a0Var.f3276a.get(str);
        Object obj2 = a0Var2.f3276a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        this.f3332k.remove(view);
    }

    public void B(View view) {
        if (this.f3343w) {
            if (!this.f3344x) {
                ArrayList arrayList = this.f3340t;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3341u);
                this.f3341u = D;
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    Animator animator = animatorArr[i4];
                    animatorArr[i4] = null;
                    animator.resume();
                }
                this.f3341u = animatorArr;
                x(this, q.f3327e);
            }
            this.f3343w = false;
        }
    }

    public void C() {
        J();
        p.f fVarR = r();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Animator animator = (Animator) obj;
            if (fVarR.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new e2.b(this, 3, fVarR));
                    long j4 = this.f3329h;
                    if (j4 >= 0) {
                        animator.setDuration(j4);
                    }
                    long j5 = this.f3328g;
                    if (j5 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j5);
                    }
                    TimeInterpolator timeInterpolator = this.f3330i;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new b3.f(5, this));
                    animator.start();
                }
            }
        }
        this.A.clear();
        n();
    }

    public void D(long j4) {
        this.f3329h = j4;
    }

    public void E(u1.h0 h0Var) {
        this.B = h0Var;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.f3330i = timeInterpolator;
    }

    public void G(a3.f fVar) {
        if (fVar == null) {
            this.C = F;
        } else {
            this.C = fVar;
        }
    }

    public void I(long j4) {
        this.f3328g = j4;
    }

    public final void J() {
        if (this.f3342v == 0) {
            x(this, q.f3323a);
            this.f3344x = false;
        }
        this.f3342v++;
    }

    public String K(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3329h != -1) {
            sb.append("dur(");
            sb.append(this.f3329h);
            sb.append(") ");
        }
        if (this.f3328g != -1) {
            sb.append("dly(");
            sb.append(this.f3328g);
            sb.append(") ");
        }
        if (this.f3330i != null) {
            sb.append("interp(");
            sb.append(this.f3330i);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3331j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3332k;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i4));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i5));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(p pVar) {
        if (this.f3346z == null) {
            this.f3346z = new ArrayList();
        }
        this.f3346z.add(pVar);
    }

    public void b(View view) {
        this.f3332k.add(view);
    }

    public void d() {
        ArrayList arrayList = this.f3340t;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3341u);
        this.f3341u = D;
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            animator.cancel();
        }
        this.f3341u = animatorArr;
        x(this, q.f3325c);
    }

    public abstract void e(a0 a0Var);

    public final void f(View view, boolean z4) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.f3333l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((Class) this.f3333l.get(i4)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            a0 a0Var = new a0(view);
            if (z4) {
                h(a0Var);
            } else {
                e(a0Var);
            }
            a0Var.f3278c.add(this);
            g(a0Var);
            if (z4) {
                c(this.f3334m, view, a0Var);
            } else {
                c(this.n, view, a0Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                f(viewGroup.getChildAt(i5), z4);
            }
        }
    }

    public abstract void h(a0 a0Var);

    public final void i(ViewGroup viewGroup, boolean z4) {
        j(z4);
        ArrayList arrayList = this.f3331j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3332k;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z4);
            return;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i4)).intValue());
            if (viewFindViewById != null) {
                a0 a0Var = new a0(viewFindViewById);
                if (z4) {
                    h(a0Var);
                } else {
                    e(a0Var);
                }
                a0Var.f3278c.add(this);
                g(a0Var);
                if (z4) {
                    c(this.f3334m, viewFindViewById, a0Var);
                } else {
                    c(this.n, viewFindViewById, a0Var);
                }
            }
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            View view = (View) arrayList2.get(i5);
            a0 a0Var2 = new a0(view);
            if (z4) {
                h(a0Var2);
            } else {
                e(a0Var2);
            }
            a0Var2.f3278c.add(this);
            g(a0Var2);
            if (z4) {
                c(this.f3334m, view, a0Var2);
            } else {
                c(this.n, view, a0Var2);
            }
        }
    }

    public final void j(boolean z4) {
        if (z4) {
            ((p.f) this.f3334m.f592a).clear();
            ((SparseArray) this.f3334m.f593b).clear();
            ((p.h) this.f3334m.f594c).a();
        } else {
            ((p.f) this.n.f592a).clear();
            ((SparseArray) this.n.f593b).clear();
            ((p.h) this.n.f594c).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public r clone() {
        try {
            r rVar = (r) super.clone();
            rVar.A = new ArrayList();
            rVar.f3334m = new androidx.emoji2.text.x(2);
            rVar.n = new androidx.emoji2.text.x(2);
            rVar.f3337q = null;
            rVar.f3338r = null;
            rVar.f3345y = this;
            rVar.f3346z = null;
            return rVar;
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    public Animator l(ViewGroup viewGroup, a0 a0Var, a0 a0Var2) {
        return null;
    }

    public void m(ViewGroup viewGroup, androidx.emoji2.text.x xVar, androidx.emoji2.text.x xVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i4;
        int i5;
        View view;
        a0 a0Var;
        Animator animator;
        a0 a0Var2;
        p.f fVarR = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        q().getClass();
        int i6 = 0;
        while (i6 < size) {
            a0 a0Var3 = (a0) arrayList.get(i6);
            a0 a0Var4 = (a0) arrayList2.get(i6);
            if (a0Var3 != null && !a0Var3.f3278c.contains(this)) {
                a0Var3 = null;
            }
            if (a0Var4 != null && !a0Var4.f3278c.contains(this)) {
                a0Var4 = null;
            }
            if ((a0Var3 != null || a0Var4 != null) && (a0Var3 == null || a0Var4 == null || u(a0Var3, a0Var4))) {
                Animator animatorL = l(viewGroup, a0Var3, a0Var4);
                if (animatorL != null) {
                    String str = this.f;
                    if (a0Var4 != null) {
                        view = a0Var4.f3277b;
                        String[] strArrS = s();
                        if (strArrS != null && strArrS.length > 0) {
                            a0Var2 = new a0(view);
                            a0 a0Var5 = (a0) ((p.f) xVar2.f592a).get(view);
                            i4 = size;
                            if (a0Var5 != null) {
                                int i7 = 0;
                                while (i7 < strArrS.length) {
                                    String str2 = strArrS[i7];
                                    int i8 = i6;
                                    a0Var2.f3276a.put(str2, a0Var5.f3276a.get(str2));
                                    i7++;
                                    i6 = i8;
                                    a0Var5 = a0Var5;
                                }
                            }
                            i5 = i6;
                            int i9 = fVarR.f3157h;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= i9) {
                                    animator = animatorL;
                                    break;
                                }
                                o oVar = (o) fVarR.get((Animator) fVarR.f(i10));
                                if (oVar.f3320c != null && oVar.f3318a == view && oVar.f3319b.equals(str) && oVar.f3320c.equals(a0Var2)) {
                                    animator = null;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            i4 = size;
                            i5 = i6;
                            animator = animatorL;
                            a0Var2 = null;
                        }
                        animatorL = animator;
                        a0Var = a0Var2;
                    } else {
                        i4 = size;
                        i5 = i6;
                        view = a0Var3.f3277b;
                        a0Var = null;
                    }
                    if (animatorL != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        o oVar2 = new o();
                        oVar2.f3318a = view;
                        oVar2.f3319b = str;
                        oVar2.f3320c = a0Var;
                        oVar2.f3321d = windowId;
                        oVar2.f3322e = this;
                        oVar2.f = animatorL;
                        fVarR.put(animatorL, oVar2);
                        this.A.add(animatorL);
                    }
                }
                i6 = i5 + 1;
                size = i4;
            }
            i4 = size;
            i5 = i6;
            i6 = i5 + 1;
            size = i4;
        }
        if (sparseIntArray.size() != 0) {
            for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                o oVar3 = (o) fVarR.get((Animator) this.A.get(sparseIntArray.keyAt(i11)));
                oVar3.f.setStartDelay(oVar3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i11)) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i4 = this.f3342v - 1;
        this.f3342v = i4;
        if (i4 == 0) {
            x(this, q.f3324b);
            for (int i5 = 0; i5 < ((p.h) this.f3334m.f594c).e(); i5++) {
                View view = (View) ((p.h) this.f3334m.f594c).f(i5);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i6 = 0; i6 < ((p.h) this.n.f594c).e(); i6++) {
                View view2 = (View) ((p.h) this.n.f594c).f(i6);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3344x = true;
        }
    }

    public void o() {
        ArrayList arrayList = this.f3333l;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(TextView.class)) {
            arrayList.add(TextView.class);
        }
        this.f3333l = arrayList;
    }

    public final a0 p(View view, boolean z4) {
        x xVar = this.f3335o;
        if (xVar != null) {
            return xVar.p(view, z4);
        }
        ArrayList arrayList = z4 ? this.f3337q : this.f3338r;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            }
            a0 a0Var = (a0) arrayList.get(i4);
            if (a0Var == null) {
                return null;
            }
            if (a0Var.f3277b == view) {
                break;
            }
            i4++;
        }
        if (i4 >= 0) {
            return (a0) (z4 ? this.f3338r : this.f3337q).get(i4);
        }
        return null;
    }

    public final r q() {
        x xVar = this.f3335o;
        return xVar != null ? xVar.q() : this;
    }

    public String[] s() {
        return null;
    }

    public final a0 t(View view, boolean z4) {
        x xVar = this.f3335o;
        if (xVar != null) {
            return xVar.t(view, z4);
        }
        return (a0) ((p.f) (z4 ? this.f3334m : this.n).f592a).get(view);
    }

    public final String toString() {
        return K("");
    }

    public boolean u(a0 a0Var, a0 a0Var2) {
        if (a0Var != null && a0Var2 != null) {
            String[] strArrS = s();
            if (strArrS != null) {
                for (String str : strArrS) {
                    if (w(a0Var, a0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = a0Var.f3276a.keySet().iterator();
                while (it.hasNext()) {
                    if (w(a0Var, a0Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean v(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f3333l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((Class) this.f3333l.get(i4)).isInstance(view)) {
                    return false;
                }
            }
        }
        ArrayList arrayList2 = this.f3331j;
        int size2 = arrayList2.size();
        ArrayList arrayList3 = this.f3332k;
        return (size2 == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || arrayList3.contains(view);
    }

    public final void x(r rVar, q qVar) {
        r rVar2 = this.f3345y;
        if (rVar2 != null) {
            rVar2.x(rVar, qVar);
        }
        ArrayList arrayList = this.f3346z;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3346z.size();
        p[] pVarArr = this.f3339s;
        if (pVarArr == null) {
            pVarArr = new p[size];
        }
        this.f3339s = null;
        p[] pVarArr2 = (p[]) this.f3346z.toArray(pVarArr);
        for (int i4 = 0; i4 < size; i4++) {
            qVar.a(pVarArr2[i4], rVar);
            pVarArr2[i4] = null;
        }
        this.f3339s = pVarArr2;
    }

    public void y(View view) {
        if (this.f3344x) {
            return;
        }
        ArrayList arrayList = this.f3340t;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3341u);
        this.f3341u = D;
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            animator.pause();
        }
        this.f3341u = animatorArr;
        x(this, q.f3326d);
        this.f3343w = true;
    }

    public r z(p pVar) {
        r rVar;
        ArrayList arrayList = this.f3346z;
        if (arrayList != null) {
            if (!arrayList.remove(pVar) && (rVar = this.f3345y) != null) {
                rVar.z(pVar);
            }
            if (this.f3346z.size() == 0) {
                this.f3346z = null;
            }
        }
        return this;
    }

    public void g(a0 a0Var) {
    }

    public void H() {
    }
}
