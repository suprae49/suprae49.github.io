package p1;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewGroup f3349g;

    /* JADX WARN: Code duplicated, block: B:100:0x021d  */
    /* JADX WARN: Code duplicated, block: B:102:0x022b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0237  */
    /* JADX WARN: Code duplicated, block: B:107:0x0249  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f5 A[EDGE_INSN: B:134:0x01f5->B:90:0x01f5 BREAK  A[LOOP:1: B:18:0x0084->B:89:0x01eb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[LOOP:0: B:15:0x0051->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:64:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x020a  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i4;
        androidx.emoji2.text.x xVar;
        androidx.emoji2.text.x xVar2;
        p.f fVar;
        p.f fVar2;
        int i5;
        int[] iArr;
        boolean z4;
        int i6;
        int i7;
        p.f fVarR;
        int i8;
        Animator animator;
        o oVar;
        a0 a0Var;
        a0 a0Var2;
        int i9;
        androidx.emoji2.text.x xVar3;
        boolean z5;
        int i10;
        View view;
        a0 a0Var3;
        p.f fVar3;
        int i11;
        int i12;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i13;
        View view4;
        View view5;
        p.h hVar;
        int iE;
        int i14;
        View view6;
        androidx.emoji2.text.x xVar4;
        int size2;
        int i15;
        r rVar = this.f;
        ViewGroup viewGroup = this.f3349g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z6 = true;
        if (!v.f3352c.remove(viewGroup)) {
            return true;
        }
        p.f fVarB = v.b();
        ArrayList arrayList2 = (ArrayList) fVarB.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(rVar);
            rVar.a(new t(this, fVarB));
            i4 = 0;
            rVar.i(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    ((r) obj).B(viewGroup);
                }
            }
            rVar.f3337q = new ArrayList();
            rVar.f3338r = new ArrayList();
            xVar = rVar.f3334m;
            xVar2 = rVar.n;
            fVar = new p.f((p.f) xVar.f592a);
            fVar2 = new p.f((p.f) xVar2.f592a);
            i5 = 0;
            while (true) {
                iArr = rVar.f3336p;
                if (i5 < iArr.length) {
                    break;
                }
                i9 = iArr[i5];
                if (i9 != z6) {
                    xVar3 = xVar2;
                    z5 = z6;
                    for (i10 = fVar.f3157h - 1; i10 >= 0; i10--) {
                        view = (View) fVar.f(i10);
                        if (view == null && rVar.v(view) && (a0Var3 = (a0) fVar2.remove(view)) != null && rVar.v(a0Var3.f3277b)) {
                            rVar.f3337q.add((a0) fVar.g(i10));
                            rVar.f3338r.add(a0Var3);
                        }
                    }
                } else if (i9 != 2) {
                    xVar3 = xVar2;
                    z5 = z6;
                    fVar3 = (p.f) xVar.f595d;
                    p.f fVar4 = (p.f) xVar3.f595d;
                    i11 = fVar3.f3157h;
                    for (i12 = 0; i12 < i11; i12++) {
                        view2 = (View) fVar3.i(i12);
                        if (view2 == null && rVar.v(view2) && (view3 = (View) fVar4.get(fVar3.f(i12))) != null && rVar.v(view3)) {
                            a0 a0Var4 = (a0) fVar.get(view2);
                            a0 a0Var5 = (a0) fVar2.get(view3);
                            if (a0Var4 != null && a0Var5 != null) {
                                rVar.f3337q.add(a0Var4);
                                rVar.f3338r.add(a0Var5);
                                fVar.remove(view2);
                                fVar2.remove(view3);
                            }
                        }
                    }
                } else if (i9 != 3) {
                    z5 = z6;
                    sparseArray = (SparseArray) xVar.f593b;
                    xVar3 = xVar2;
                    SparseArray sparseArray2 = (SparseArray) xVar3.f593b;
                    size = sparseArray.size();
                    for (i13 = 0; i13 < size; i13++) {
                        view4 = (View) sparseArray.valueAt(i13);
                        if (view4 == null && rVar.v(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i13))) != null && rVar.v(view5)) {
                            a0 a0Var6 = (a0) fVar.get(view4);
                            a0 a0Var7 = (a0) fVar2.get(view5);
                            if (a0Var6 != null && a0Var7 != null) {
                                rVar.f3337q.add(a0Var6);
                                rVar.f3338r.add(a0Var7);
                                fVar.remove(view4);
                                fVar2.remove(view5);
                            }
                        }
                    }
                } else if (i9 != 4) {
                    xVar3 = xVar2;
                    z5 = z6;
                } else {
                    hVar = (p.h) xVar.f594c;
                    p.h hVar2 = (p.h) xVar2.f594c;
                    iE = hVar.e();
                    i14 = i4;
                    while (i14 < iE) {
                        view6 = (View) hVar.f(i14);
                        if (view6 == null && rVar.v(view6)) {
                            xVar4 = xVar2;
                            View view7 = (View) hVar2.b(hVar.c(i14));
                            if (view7 != null && rVar.v(view7)) {
                                a0 a0Var8 = (a0) fVar.get(view6);
                                a0 a0Var9 = (a0) fVar2.get(view7);
                                if (a0Var8 != null && a0Var9 != null) {
                                    rVar.f3337q.add(a0Var8);
                                    rVar.f3338r.add(a0Var9);
                                    fVar.remove(view6);
                                    fVar2.remove(view7);
                                }
                            }
                            i14++;
                            xVar2 = xVar4;
                            z6 = z6;
                        } else {
                            xVar4 = xVar2;
                        }
                        i14++;
                        xVar2 = xVar4;
                        z6 = z6;
                    }
                    z5 = z6;
                    xVar3 = xVar2;
                }
                i5++;
                xVar2 = xVar3;
                z6 = z5;
                i4 = 0;
            }
            z4 = z6;
            for (i6 = 0; i6 < fVar.f3157h; i6++) {
                a0Var2 = (a0) fVar.i(i6);
                if (rVar.v(a0Var2.f3277b)) {
                    rVar.f3337q.add(a0Var2);
                    rVar.f3338r.add(null);
                }
            }
            for (i7 = 0; i7 < fVar2.f3157h; i7++) {
                a0Var = (a0) fVar2.i(i7);
                if (rVar.v(a0Var.f3277b)) {
                    rVar.f3338r.add(a0Var);
                    rVar.f3337q.add(null);
                }
            }
            fVarR = r.r();
            int i16 = fVarR.f3157h;
            WindowId windowId = viewGroup.getWindowId();
            i8 = i16 - 1;
            while (i8 >= 0) {
                animator = (Animator) fVarR.f(i8);
                if (animator == null && (oVar = (o) fVarR.get(animator)) != null) {
                    r rVar2 = oVar.f3322e;
                    View view8 = oVar.f3318a;
                    if (view8 != null && windowId.equals(oVar.f3321d)) {
                        a0 a0Var10 = oVar.f3320c;
                        boolean z7 = z4;
                        a0 a0VarT = rVar.t(view8, z7);
                        a0 a0VarP = rVar.p(view8, z7);
                        if (a0VarT == null && a0VarP == null) {
                            a0VarP = (a0) ((p.f) rVar.n.f592a).get(view8);
                        }
                        if ((a0VarT != null || a0VarP != null) && rVar2.u(a0Var10, a0VarP)) {
                            rVar2.q().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                fVarR.remove(animator);
                            }
                        }
                    }
                }
                i8--;
                z4 = true;
            }
            rVar.m(viewGroup, rVar.f3334m, rVar.n, rVar.f3337q, rVar.f3338r);
            rVar.C();
            return true;
        }
        arrayList2 = new ArrayList();
        fVarB.put(viewGroup, arrayList2);
        arrayList2.add(rVar);
        rVar.a(new t(this, fVarB));
        i4 = 0;
        rVar.i(viewGroup, false);
        if (arrayList != null) {
            size2 = arrayList.size();
            i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList.get(i15);
                i15++;
                ((r) obj2).B(viewGroup);
            }
        }
        rVar.f3337q = new ArrayList();
        rVar.f3338r = new ArrayList();
        xVar = rVar.f3334m;
        xVar2 = rVar.n;
        fVar = new p.f((p.f) xVar.f592a);
        fVar2 = new p.f((p.f) xVar2.f592a);
        i5 = 0;
        while (true) {
            iArr = rVar.f3336p;
            if (i5 < iArr.length) {
                break;
                break;
            }
            i9 = iArr[i5];
            if (i9 != z6) {
                xVar3 = xVar2;
                z5 = z6;
                while (i10 >= 0) {
                    view = (View) fVar.f(i10);
                    if (view == null) {
                    }
                }
            } else if (i9 != 2) {
                xVar3 = xVar2;
                z5 = z6;
                fVar3 = (p.f) xVar.f595d;
                p.f fVar5 = (p.f) xVar3.f595d;
                i11 = fVar3.f3157h;
                while (i12 < i11) {
                    view2 = (View) fVar3.i(i12);
                    if (view2 == null) {
                    }
                }
            } else if (i9 != 3) {
                z5 = z6;
                sparseArray = (SparseArray) xVar.f593b;
                xVar3 = xVar2;
                SparseArray sparseArray3 = (SparseArray) xVar3.f593b;
                size = sparseArray.size();
                while (i13 < size) {
                    view4 = (View) sparseArray.valueAt(i13);
                    if (view4 == null) {
                    }
                }
            } else if (i9 != 4) {
                xVar3 = xVar2;
                z5 = z6;
            } else {
                hVar = (p.h) xVar.f594c;
                p.h hVar3 = (p.h) xVar2.f594c;
                iE = hVar.e();
                i14 = i4;
                while (i14 < iE) {
                    view6 = (View) hVar.f(i14);
                    if (view6 == null) {
                        xVar4 = xVar2;
                    } else {
                        xVar4 = xVar2;
                    }
                    i14++;
                    xVar2 = xVar4;
                    z6 = z6;
                }
                z5 = z6;
                xVar3 = xVar2;
            }
            i5++;
            xVar2 = xVar3;
            z6 = z5;
            i4 = 0;
        }
        z4 = z6;
        while (i6 < fVar.f3157h) {
            a0Var2 = (a0) fVar.i(i6);
            if (rVar.v(a0Var2.f3277b)) {
                rVar.f3337q.add(a0Var2);
                rVar.f3338r.add(null);
            }
        }
        while (i7 < fVar2.f3157h) {
            a0Var = (a0) fVar2.i(i7);
            if (rVar.v(a0Var.f3277b)) {
                rVar.f3338r.add(a0Var);
                rVar.f3337q.add(null);
            }
        }
        fVarR = r.r();
        int i17 = fVarR.f3157h;
        WindowId windowId2 = viewGroup.getWindowId();
        i8 = i17 - 1;
        while (i8 >= 0) {
            animator = (Animator) fVarR.f(i8);
            if (animator == null) {
            }
            i8--;
            z4 = true;
        }
        rVar.m(viewGroup, rVar.f3334m, rVar.n, rVar.f3337q, rVar.f3338r);
        rVar.C();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f3349g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        v.f3352c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) v.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((r) obj).B(viewGroup);
            }
        }
        this.f.j(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
