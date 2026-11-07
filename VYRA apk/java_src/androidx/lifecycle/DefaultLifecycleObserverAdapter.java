package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements r {
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f807g;

    public DefaultLifecycleObserverAdapter(e eVar, r rVar) {
        this.f = eVar;
        this.f807g = rVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, m mVar) {
        int i4 = f.f819a[mVar.ordinal()];
        if (i4 == 3) {
            this.f.onResume();
        } else if (i4 == 7) {
            androidx.fragment.app.q.q("ON_ANY must not been send by anybody");
            return;
        }
        r rVar = this.f807g;
        if (rVar != null) {
            rVar.a(tVar, mVar);
        }
    }
}
