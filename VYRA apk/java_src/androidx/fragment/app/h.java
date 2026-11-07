package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ o1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o1 f694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f695h;

    public h(o1 o1Var, o1 o1Var2, boolean z4, p.f fVar) {
        this.f = o1Var;
        this.f694g = o1Var2;
        this.f695h = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment = this.f.f738c;
        Fragment fragment2 = this.f694g.f738c;
        i1 i1Var = d1.f671a;
        if (this.f695h) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }
}
