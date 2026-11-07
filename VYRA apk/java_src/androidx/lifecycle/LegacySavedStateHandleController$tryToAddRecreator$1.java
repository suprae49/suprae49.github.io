package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements r {
    public final /* synthetic */ o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l1.c f808g;

    public LegacySavedStateHandleController$tryToAddRecreator$1(o oVar, l1.c cVar) {
        this.f = oVar;
        this.f808g = cVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, m mVar) {
        if (mVar == m.ON_START) {
            this.f.b(this);
            this.f808g.d();
        }
    }
}
