package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements x0 {
    public final /* synthetic */ Fragment f;

    public q0(Fragment fragment) {
        this.f = fragment;
    }

    @Override // androidx.fragment.app.x0
    public final void e(Fragment fragment) {
        this.f.onAttachFragment(fragment);
    }
}
