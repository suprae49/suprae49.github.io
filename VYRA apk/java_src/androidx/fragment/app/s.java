package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Fragment f745g;

    public /* synthetic */ s(Fragment fragment, int i4) {
        this.f = i4;
        this.f745g = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                this.f745g.startPostponedEnterTransition();
                break;
            default:
                this.f745g.callStartTransitionListener(false);
                break;
        }
    }
}
