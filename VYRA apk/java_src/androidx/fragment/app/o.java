package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends g0 {
    public final /* synthetic */ g0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f733g;

    public o(p pVar, g0 g0Var) {
        this.f733g = pVar;
        this.f = g0Var;
    }

    @Override // androidx.fragment.app.g0
    public final View n(int i4) {
        g0 g0Var = this.f;
        return g0Var.o() ? g0Var.n(i4) : this.f733g.onFindViewById(i4);
    }

    @Override // androidx.fragment.app.g0
    public final boolean o() {
        return this.f.o() || this.f733g.onHasView();
    }
}
