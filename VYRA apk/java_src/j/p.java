package j;

import a3.h0;
import android.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f2432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionProvider f2433b;

    public p(t tVar, ActionProvider actionProvider) {
        this.f2433b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z4) {
        h0 h0Var = this.f2432a;
        if (h0Var != null) {
            m mVar = ((o) h0Var.f84g).n;
            mVar.f2390h = true;
            mVar.p(true);
        }
    }
}
