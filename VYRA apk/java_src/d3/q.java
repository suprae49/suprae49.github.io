package d3;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1729g;

    public /* synthetic */ q(int i4, Object obj) {
        this.f = i4;
        this.f1729g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f) {
            case 0:
                s sVar = (s) this.f1729g;
                AccessibilityManager accessibilityManager = sVar.f1751y;
                if (sVar.f1752z != null && accessibilityManager != null && sVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(sVar.f1752z);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f) {
            case 0:
                s sVar = (s) this.f1729g;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = sVar.f1752z;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = sVar.f1751y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 1:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f1729g;
                e2.a aVar = hideBottomViewOnScrollBehavior.f1280m;
                if (aVar != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f1279l) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.f1280m = null;
                    break;
                }
                break;
            case 2:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f1729g;
                e2.a aVar2 = hideViewOnScrollBehavior.f1286h;
                if (aVar2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f1285g) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.f1286h = null;
                    break;
                }
                break;
            case 3:
                j.g gVar = (j.g) this.f1729g;
                ViewTreeObserver viewTreeObserver = gVar.D;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.D = view.getViewTreeObserver();
                    }
                    gVar.D.removeGlobalOnLayoutListener(gVar.f2360o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                j.d0 d0Var = (j.d0) this.f1729g;
                ViewTreeObserver viewTreeObserver2 = d0Var.f2339u;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.f2339u = view.getViewTreeObserver();
                    }
                    d0Var.f2339u.removeGlobalOnLayoutListener(d0Var.f2333o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
