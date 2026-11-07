package k1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class z0 extends p0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f2966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f2967e;

    public z0(RecyclerView recyclerView) {
        this.f2966d = recyclerView;
        y0 y0Var = this.f2967e;
        if (y0Var != null) {
            this.f2967e = y0Var;
        } else {
            this.f2967e = new y0(this);
        }
    }

    @Override // p0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f2966d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // p0.b
    public void d(View view, q0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f3378a;
        this.f3167a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f2966d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        l0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2838b;
        v1.b bVar = recyclerView2.f913g;
        u0 u0Var = recyclerView2.f920k0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f2838b.canScrollHorizontally(-1)) {
            eVar.a(8192);
            eVar.i(true);
        }
        if (layoutManager.f2838b.canScrollVertically(1) || layoutManager.f2838b.canScrollHorizontally(1)) {
            eVar.a(4096);
            eVar.i(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(bVar, u0Var), layoutManager.x(bVar, u0Var), false, 0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p0.b
    public final boolean g(View view, int i4, Bundle bundle) {
        int iG;
        int iE;
        if (super.g(view, i4, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f2966d;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            l0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f2838b;
            v1.b bVar = recyclerView2.f913g;
            if (i4 == 4096) {
                iG = recyclerView2.canScrollVertically(1) ? (layoutManager.f2849o - layoutManager.G()) - layoutManager.D() : 0;
                if (layoutManager.f2838b.canScrollHorizontally(1)) {
                    iE = (layoutManager.n - layoutManager.E()) - layoutManager.F();
                } else {
                    iE = 0;
                }
            } else if (i4 != 8192) {
                iE = 0;
                iG = 0;
            } else {
                iG = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f2849o - layoutManager.G()) - layoutManager.D()) : 0;
                if (layoutManager.f2838b.canScrollHorizontally(-1)) {
                    iE = -((layoutManager.n - layoutManager.E()) - layoutManager.F());
                } else {
                    iE = 0;
                }
            }
            if (iG != 0 || iE != 0) {
                layoutManager.f2838b.b0(iE, true, iG);
                return true;
            }
        }
        return false;
    }
}
