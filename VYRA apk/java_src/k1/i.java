package k1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2792s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f2794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f2795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f2796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f2797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f2798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f2799m;
    public ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f2800o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f2801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f2802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f2803r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((x0) arrayList.get(size)).f2945a.animate().cancel();
        }
    }

    @Override // k1.h0
    public final boolean a(x0 x0Var, x0 x0Var2, g0 g0Var, g0 g0Var2) {
        int i4;
        int i5;
        int i6 = g0Var.f2780a;
        int i7 = g0Var.f2781b;
        if (x0Var2.o()) {
            int i8 = g0Var.f2780a;
            i5 = g0Var.f2781b;
            i4 = i8;
        } else {
            i4 = g0Var2.f2780a;
            i5 = g0Var2.f2781b;
        }
        if (x0Var == x0Var2) {
            return g(x0Var, i6, i7, i4, i5);
        }
        View view = x0Var.f2945a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(x0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = x0Var2.f2945a;
        l(x0Var2);
        view2.setTranslationX(-((int) ((i4 - i6) - translationX)));
        view2.setTranslationY(-((int) ((i5 - i7) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f2797k;
        g gVar = new g();
        gVar.f2775a = x0Var;
        gVar.f2776b = x0Var2;
        gVar.f2777c = i6;
        gVar.f2778d = i7;
        gVar.f2779e = i4;
        gVar.f = i5;
        arrayList.add(gVar);
        return true;
    }

    @Override // k1.h0
    public final void d(x0 x0Var) {
        ArrayList arrayList = this.f2798l;
        ArrayList arrayList2 = this.f2799m;
        ArrayList arrayList3 = this.n;
        View view = x0Var.f2945a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f2796j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((h) arrayList4.get(size)).f2782a == x0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(x0Var);
                arrayList4.remove(size);
            }
        }
        j(this.f2797k, x0Var);
        if (this.f2794h.remove(x0Var)) {
            view.setAlpha(1.0f);
            c(x0Var);
        }
        if (this.f2795i.remove(x0Var)) {
            view.setAlpha(1.0f);
            c(x0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, x0Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((h) arrayList6.get(size4)).f2782a == x0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(x0Var);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(x0Var)) {
                view.setAlpha(1.0f);
                c(x0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f2802q.remove(x0Var);
        this.f2800o.remove(x0Var);
        this.f2803r.remove(x0Var);
        this.f2801p.remove(x0Var);
        i();
    }

    @Override // k1.h0
    public final void e() {
        ArrayList arrayList = this.f2797k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.f2798l;
        ArrayList arrayList4 = this.f2799m;
        ArrayList arrayList5 = this.f2795i;
        ArrayList arrayList6 = this.f2794h;
        ArrayList arrayList7 = this.f2796j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            h hVar = (h) arrayList7.get(size);
            View view = hVar.f2782a.f2945a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(hVar.f2782a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((x0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            x0 x0Var = (x0) arrayList5.get(size3);
            x0Var.f2945a.setAlpha(1.0f);
            c(x0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            g gVar = (g) arrayList.get(size4);
            x0 x0Var2 = gVar.f2775a;
            if (x0Var2 != null) {
                k(gVar, x0Var2);
            }
            x0 x0Var3 = gVar.f2776b;
            if (x0Var3 != null) {
                k(gVar, x0Var3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    h hVar2 = (h) arrayList8.get(size6);
                    View view2 = hVar2.f2782a.f2945a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(hVar2.f2782a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    x0 x0Var4 = (x0) arrayList9.get(size8);
                    x0Var4.f2945a.setAlpha(1.0f);
                    c(x0Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    g gVar2 = (g) arrayList10.get(size10);
                    x0 x0Var5 = gVar2.f2775a;
                    if (x0Var5 != null) {
                        k(gVar2, x0Var5);
                    }
                    x0 x0Var6 = gVar2.f2776b;
                    if (x0Var6 != null) {
                        k(gVar2, x0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.f2802q);
            h(this.f2801p);
            h(this.f2800o);
            h(this.f2803r);
            ArrayList arrayList11 = this.f2788b;
            if (arrayList11.size() > 0) {
                throw androidx.fragment.app.u.i(0, arrayList11);
            }
            arrayList11.clear();
        }
    }

    @Override // k1.h0
    public final boolean f() {
        return (this.f2795i.isEmpty() && this.f2797k.isEmpty() && this.f2796j.isEmpty() && this.f2794h.isEmpty() && this.f2801p.isEmpty() && this.f2802q.isEmpty() && this.f2800o.isEmpty() && this.f2803r.isEmpty() && this.f2799m.isEmpty() && this.f2798l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(x0 x0Var, int i4, int i5, int i6, int i7) {
        View view = x0Var.f2945a;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i5 + ((int) x0Var.f2945a.getTranslationY());
        l(x0Var);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            c(x0Var);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX(-i8);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        ArrayList arrayList = this.f2796j;
        h hVar = new h();
        hVar.f2782a = x0Var;
        hVar.f2783b = translationX;
        hVar.f2784c = translationY;
        hVar.f2785d = i6;
        hVar.f2786e = i7;
        arrayList.add(hVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2788b;
        if (arrayList.size() > 0) {
            throw androidx.fragment.app.u.i(0, arrayList);
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, x0 x0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g gVar = (g) arrayList.get(size);
            if (k(gVar, x0Var) && gVar.f2775a == null && gVar.f2776b == null) {
                arrayList.remove(gVar);
            }
        }
    }

    public final boolean k(g gVar, x0 x0Var) {
        if (gVar.f2776b == x0Var) {
            gVar.f2776b = null;
        } else {
            if (gVar.f2775a != x0Var) {
                return false;
            }
            gVar.f2775a = null;
        }
        View view = x0Var.f2945a;
        View view2 = x0Var.f2945a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(x0Var);
        return true;
    }

    public final void l(x0 x0Var) {
        if (f2792s == null) {
            f2792s = new ValueAnimator().getInterpolator();
        }
        x0Var.f2945a.animate().setInterpolator(f2792s);
        d(x0Var);
    }
}
