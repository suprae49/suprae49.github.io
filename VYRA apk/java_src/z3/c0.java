package z3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f4895e;
    public final d0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f4896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4897h;

    public c0(e0 e0Var, d0 d0Var, d dVar, Object obj) {
        this.f4895e = e0Var;
        this.f = d0Var;
        this.f4896g = dVar;
        this.f4897h = obj;
    }

    @Override // z3.b0
    public final boolean k() {
        return false;
    }

    @Override // z3.b0
    public final void l(Throwable th) {
        d dVar = this.f4896g;
        d dVarY = e0.y(dVar);
        e0 e0Var = this.f4895e;
        d0 d0Var = this.f;
        Object obj = this.f4897h;
        if (dVarY == null || !e0Var.G(d0Var, dVarY, obj)) {
            d0Var.f4902a.e(new b4.f(2), 2);
            d dVarY2 = e0.y(dVar);
            if (dVarY2 == null || !e0Var.G(d0Var, dVarY2, obj)) {
                e0Var.h(e0Var.o(d0Var, obj));
            }
        }
    }
}
