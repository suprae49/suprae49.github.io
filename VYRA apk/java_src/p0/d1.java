package p0;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class d1 extends j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsets.Builder f3185e;

    public d1(y1 y1Var) {
        super(y1Var);
        WindowInsets windowInsetsG = y1Var.g();
        this.f3185e = windowInsetsG != null ? c1.d(windowInsetsG) : androidx.activity.x.l();
    }

    @Override // p0.j1
    public y1 b() {
        a();
        y1 y1VarH = y1.h(null, this.f3185e.build());
        f0.c[] cVarArr = this.f3203b;
        t1 t1Var = y1VarH.f3268a;
        t1Var.u(cVarArr);
        t1Var.t(null);
        t1Var.y(this.f3204c);
        t1Var.z(this.f3205d);
        return y1VarH;
    }

    @Override // p0.j1
    public void e(f0.c cVar) {
        this.f3185e.setMandatorySystemGestureInsets(cVar.e());
    }

    @Override // p0.j1
    public void f(f0.c cVar) {
        this.f3185e.setStableInsets(cVar.e());
    }

    @Override // p0.j1
    public void g(f0.c cVar) {
        this.f3185e.setSystemGestureInsets(cVar.e());
    }

    @Override // p0.j1
    public void h(f0.c cVar) {
        this.f3185e.setSystemWindowInsets(cVar.e());
    }

    @Override // p0.j1
    public void i(f0.c cVar) {
        this.f3185e.setTappableElementInsets(cVar.e());
    }

    public d1() {
        this.f3185e = androidx.activity.x.l();
    }
}
