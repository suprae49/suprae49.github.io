package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f746a;

    public t(Fragment fragment) {
        this.f746a = fragment;
    }

    @Override // androidx.fragment.app.a0
    public final void a() {
        Fragment fragment = this.f746a;
        fragment.mSavedStateRegistryController.a();
        androidx.lifecycle.k0.d(fragment);
    }
}
