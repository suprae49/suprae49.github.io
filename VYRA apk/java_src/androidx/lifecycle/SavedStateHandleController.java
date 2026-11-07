package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements r {
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j0 f810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f811h;

    public SavedStateHandleController(String str, j0 j0Var) {
        this.f = str;
        this.f810g = j0Var;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, m mVar) {
        if (mVar == m.ON_DESTROY) {
            this.f811h = false;
            tVar.getLifecycle().b(this);
        }
    }

    public final void b(o oVar, l1.c cVar) {
        cVar.getClass();
        oVar.getClass();
        if (this.f811h) {
            androidx.fragment.app.q.j("Already attached to lifecycleOwner");
            return;
        }
        this.f811h = true;
        oVar.a(this);
        cVar.c(this.f, this.f810g.f832e);
    }
}
