package p0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y1 f3247b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f3248a;

    static {
        j1 d1Var;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 36) {
            d1Var = new i1();
        } else if (i4 >= 35) {
            d1Var = new h1();
        } else if (i4 >= 34) {
            d1Var = new g1();
        } else if (i4 >= 31) {
            d1Var = new f1();
        } else if (i4 >= 30) {
            d1Var = new e1();
        } else {
            d1Var = i4 >= 29 ? new d1() : new b1();
        }
        f3247b = d1Var.b().f3268a.a().f3268a.b().f3268a.c();
    }

    public t1(y1 y1Var) {
        this.f3248a = y1Var;
    }

    public y1 a() {
        return this.f3248a;
    }

    public y1 b() {
        return this.f3248a;
    }

    public y1 c() {
        return this.f3248a;
    }

    public List<Rect> e(int i4) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return s() == t1Var.s() && r() == t1Var.r() && Objects.equals(m(), t1Var.m()) && Objects.equals(k(), t1Var.k()) && Objects.equals(g(), t1Var.g());
    }

    public List<Rect> f(int i4) {
        return Collections.EMPTY_LIST;
    }

    public h g() {
        return null;
    }

    public f0.c h(int i4) {
        return f0.c.f2066e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public f0.c i(int i4) {
        if ((i4 & 8) == 0) {
            return f0.c.f2066e;
        }
        androidx.fragment.app.q.q("Unable to query the maximum insets for IME");
        return null;
    }

    public f0.c j() {
        return m();
    }

    public f0.c k() {
        return f0.c.f2066e;
    }

    public f0.c l() {
        return m();
    }

    public f0.c m() {
        return f0.c.f2066e;
    }

    public f0.c n() {
        return m();
    }

    public y1 q(int i4, int i5, int i6, int i7) {
        return f3247b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public void d(View view) {
    }

    public void o(View view) {
    }

    public void t(j jVar) {
    }

    public void u(f0.c[] cVarArr) {
    }

    public void v(y1 y1Var) {
    }

    public void w(f0.c cVar) {
    }

    public void x(int i4) {
    }

    public void y(Rect[][] rectArr) {
    }

    public void z(Rect[][] rectArr) {
    }

    public void p() {
    }
}
