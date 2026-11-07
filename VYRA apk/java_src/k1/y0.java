package k1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends p0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f2963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2964e = new WeakHashMap();

    public y0(z0 z0Var) {
        this.f2963d = z0Var;
    }

    @Override // p0.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        p0.b bVar = (p0.b) this.f2964e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f3167a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p0.b
    public final a3.h0 b(View view) {
        p0.b bVar = (p0.b) this.f2964e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // p0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        p0.b bVar = (p0.b) this.f2964e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // p0.b
    public final void d(View view, q0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f3378a;
        z0 z0Var = this.f2963d;
        RecyclerView recyclerView = z0Var.f2966d;
        RecyclerView recyclerView2 = z0Var.f2966d;
        boolean zK = recyclerView.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f3167a;
        if (zK || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().V(view, eVar);
        p0.b bVar = (p0.b) this.f2964e.get(view);
        if (bVar != null) {
            bVar.d(view, eVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // p0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        p0.b bVar = (p0.b) this.f2964e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // p0.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        p0.b bVar = (p0.b) this.f2964e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f3167a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p0.b
    public final boolean g(View view, int i4, Bundle bundle) {
        z0 z0Var = this.f2963d;
        RecyclerView recyclerView = z0Var.f2966d;
        RecyclerView recyclerView2 = z0Var.f2966d;
        if (recyclerView.K() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i4, bundle);
        }
        p0.b bVar = (p0.b) this.f2964e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i4, bundle)) {
                return true;
            }
        } else if (super.g(view, i4, bundle)) {
            return true;
        }
        v1.b bVar2 = recyclerView2.getLayoutManager().f2838b.f913g;
        return false;
    }

    @Override // p0.b
    public final void h(View view, int i4) {
        p0.b bVar = (p0.b) this.f2964e.get(view);
        if (bVar != null) {
            bVar.h(view, i4);
        } else {
            super.h(view, i4);
        }
    }

    @Override // p0.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        p0.b bVar = (p0.b) this.f2964e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
