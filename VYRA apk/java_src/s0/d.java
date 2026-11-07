package s0;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewGroup f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f3664g;

    public d(ViewGroup viewGroup, b bVar) {
        this.f = viewGroup;
        this.f3664g = bVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f.addView(this.f3664g, 0);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f.addView(this.f3664g, 0);
        view.removeOnAttachStateChangeListener(this);
    }
}
