package p0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y1 f3267b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f3268a;

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            f3267b = q1.f3239w;
        } else if (i4 >= 30) {
            f3267b = o1.f3232v;
        } else {
            f3267b = t1.f3247b;
        }
    }

    public y1(WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            this.f3268a = new s1(this, windowInsets);
            return;
        }
        if (i4 >= 34) {
            this.f3268a = new q1(this, windowInsets);
            return;
        }
        if (i4 >= 31) {
            this.f3268a = new p1(this, windowInsets);
            return;
        }
        if (i4 >= 30) {
            this.f3268a = new o1(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f3268a = new n1(this, windowInsets);
        } else if (i4 >= 28) {
            this.f3268a = new m1(this, windowInsets);
        } else {
            this.f3268a = new l1(this, windowInsets);
        }
    }

    public static f0.c e(f0.c cVar, int i4, int i5, int i6, int i7) {
        int iMax = Math.max(0, cVar.f2067a - i4);
        int iMax2 = Math.max(0, cVar.f2068b - i5);
        int iMax3 = Math.max(0, cVar.f2069c - i6);
        int iMax4 = Math.max(0, cVar.f2070d - i7);
        return (iMax == i4 && iMax2 == i5 && iMax3 == i6 && iMax4 == i7) ? cVar : f0.c.c(iMax, iMax2, iMax3, iMax4);
    }

    public static y1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        y1 y1Var = new y1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = p0.f3233a;
            y1 y1VarA = i0.a(view);
            t1 t1Var = y1Var.f3268a;
            t1Var.v(y1VarA);
            View rootView = view.getRootView();
            t1Var.d(rootView);
            t1Var.o(rootView);
            t1Var.p();
            t1Var.x(view.getWindowSystemUiVisibility());
        }
        return y1Var;
    }

    public final int a() {
        return this.f3268a.m().f2070d;
    }

    public final int b() {
        return this.f3268a.m().f2067a;
    }

    public final int c() {
        return this.f3268a.m().f2069c;
    }

    public final int d() {
        return this.f3268a.m().f2068b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y1) {
            return Objects.equals(this.f3268a, ((y1) obj).f3268a);
        }
        return false;
    }

    public final y1 f(int i4, int i5, int i6, int i7) {
        j1 d1Var;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 36) {
            d1Var = new i1(this);
        } else if (i8 >= 35) {
            d1Var = new h1(this);
        } else if (i8 >= 34) {
            d1Var = new g1(this);
        } else if (i8 >= 31) {
            d1Var = new f1(this);
        } else if (i8 >= 30) {
            d1Var = new e1(this);
        } else {
            d1Var = i8 >= 29 ? new d1(this) : new b1(this);
        }
        d1Var.h(f0.c.c(i4, i5, i6, i7));
        return d1Var.b();
    }

    public final WindowInsets g() {
        t1 t1Var = this.f3268a;
        if (t1Var instanceof k1) {
            return ((k1) t1Var).f3210c;
        }
        return null;
    }

    public final int hashCode() {
        t1 t1Var = this.f3268a;
        if (t1Var == null) {
            return 0;
        }
        return t1Var.hashCode();
    }

    public y1() {
        this.f3268a = new t1(this);
    }
}
