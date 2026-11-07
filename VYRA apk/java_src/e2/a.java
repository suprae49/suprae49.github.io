package e2;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z.b f2051c;

    public /* synthetic */ a(z.b bVar, View view, int i4) {
        this.f2049a = i4;
        this.f2051c = bVar;
        this.f2050b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        switch (this.f2049a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f2051c;
                if (z4 && hideBottomViewOnScrollBehavior.f1281o == 1) {
                    hideBottomViewOnScrollBehavior.w(this.f2050b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f2051c;
                if (z4 && hideViewOnScrollBehavior.f1292o == 1) {
                    hideViewOnScrollBehavior.x(this.f2050b);
                    break;
                }
                break;
        }
    }
}
