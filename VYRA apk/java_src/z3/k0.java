package z3;

import u1.f1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends b4.o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ThreadLocal f4912j;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public k0(i3.g gVar, f1 f1Var) {
        l0 l0Var = l0.f;
        super(gVar.a(l0Var) == null ? gVar.b(l0Var) : gVar, f1Var);
        this.f4912j = new ThreadLocal();
        i3.g gVar2 = f1Var.f2970g;
        gVar2.getClass();
        if (gVar2.a(i3.d.f) instanceof h) {
            return;
        }
        Object objG = b4.d.g(gVar, null);
        b4.d.c(gVar, objG);
        I(gVar, objG);
    }

    public final boolean H() {
        boolean z4 = this.threadLocalIsSet && this.f4912j.get() == null;
        this.f4912j.remove();
        return !z4;
    }

    public final void I(i3.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f4912j.set(new g3.b(gVar, obj));
    }

    @Override // b4.o, z3.e0
    public final void i(Object obj) {
        if (this.threadLocalIsSet) {
            g3.b bVar = (g3.b) this.f4912j.get();
            if (bVar != null) {
                b4.d.c((i3.g) bVar.f, bVar.f2150g);
            }
            this.f4912j.remove();
        }
        Object objD = l.d(obj);
        k3.e eVar = this.f1109i;
        i3.g gVar = eVar.f2970g;
        gVar.getClass();
        Object objG = b4.d.g(gVar, null);
        k0 k0VarF = objG != b4.d.f1086c ? l.f(eVar, gVar, objG) : null;
        try {
            this.f1109i.e(objD);
        } finally {
            if (k0VarF == null || k0VarF.H()) {
                b4.d.c(gVar, objG);
            }
        }
    }
}
