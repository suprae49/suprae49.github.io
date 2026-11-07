package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements r {
    public final l0 f;

    public SavedStateHandleAttacher(l0 l0Var) {
        this.f = l0Var;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, m mVar) {
        if (mVar == m.ON_CREATE) {
            tVar.getLifecycle().b(this);
            this.f.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + mVar).toString());
        }
    }
}
