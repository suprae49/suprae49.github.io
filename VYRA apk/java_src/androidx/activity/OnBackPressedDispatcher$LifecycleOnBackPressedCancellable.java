package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.r, c {
    public final androidx.lifecycle.o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.fragment.app.m0 f172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h0 f173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j0 f174i;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(j0 j0Var, androidx.lifecycle.o oVar, androidx.fragment.app.m0 m0Var) {
        m0Var.getClass();
        this.f174i = j0Var;
        this.f = oVar;
        this.f172g = m0Var;
        oVar.a(this);
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        if (mVar == androidx.lifecycle.m.ON_START) {
            this.f173h = this.f174i.b(this.f172g);
            return;
        }
        if (mVar != androidx.lifecycle.m.ON_STOP) {
            if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                cancel();
            }
        } else {
            h0 h0Var = this.f173h;
            if (h0Var != null) {
                h0Var.cancel();
            }
        }
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f.b(this);
        androidx.fragment.app.m0 m0Var = this.f172g;
        m0Var.getClass();
        m0Var.f725b.remove(this);
        h0 h0Var = this.f173h;
        if (h0Var != null) {
            h0Var.cancel();
        }
        this.f173h = null;
    }
}
