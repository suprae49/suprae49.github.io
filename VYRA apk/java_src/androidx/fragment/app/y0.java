package androidx.fragment.app;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View f;

    public y0(View view) {
        this.f = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f;
        view2.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = p0.p0.f3233a;
        view2.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
