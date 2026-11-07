package j;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends FrameLayout implements i.b {
    public final CollapsibleActionView f;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // i.b
    public final void onActionViewCollapsed() {
        this.f.onActionViewCollapsed();
    }

    @Override // i.b
    public final void onActionViewExpanded() {
        this.f.onActionViewExpanded();
    }
}
