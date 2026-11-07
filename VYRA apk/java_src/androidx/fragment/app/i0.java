package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ z0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f703g;

    public i0(j0 j0Var, z0 z0Var) {
        this.f703g = j0Var;
        this.f = z0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        z0 z0Var = this.f;
        Fragment fragment = z0Var.f804c;
        z0Var.j();
        l.h((ViewGroup) fragment.mView.getParent(), this.f703g.f.E()).g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
