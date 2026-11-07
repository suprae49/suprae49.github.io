package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2494g;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i4) {
        this.f = i4;
        this.f2494g = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2494g;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.B = actionBarOverlayLayout.f309i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.C);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2494g;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.B = actionBarOverlayLayout2.f309i.animate().translationY(-actionBarOverlayLayout2.f309i.getHeight()).setListener(actionBarOverlayLayout2.C);
                break;
        }
    }
}
