package androidx.activity;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements androidx.lifecycle.r {
    public final /* synthetic */ j0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.e0 f201g;

    public /* synthetic */ h(j0 j0Var, androidx.fragment.app.e0 e0Var) {
        this.f = j0Var;
        this.f201g = e0Var;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        if (mVar == androidx.lifecycle.m.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = i.f203a.a(this.f201g);
            onBackInvokedDispatcherA.getClass();
            j0 j0Var = this.f;
            j0Var.f211e = onBackInvokedDispatcherA;
            j0Var.e(j0Var.f212g);
        }
    }
}
