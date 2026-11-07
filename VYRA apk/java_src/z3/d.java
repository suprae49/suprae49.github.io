package z3;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b0 implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f4898e;

    public d(e0 e0Var) {
        this.f4898e = e0Var;
    }

    @Override // z3.c
    public final boolean c(Throwable th) {
        e0 e0VarJ = j();
        if (th instanceof CancellationException) {
            return true;
        }
        return e0VarJ.j(th) && e0VarJ.q();
    }

    @Override // z3.b0
    public final boolean k() {
        return true;
    }

    @Override // z3.b0
    public final void l(Throwable th) {
        this.f4898e.j(j());
    }
}
