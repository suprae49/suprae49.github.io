package z;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public boolean e(View view) {
        return false;
    }

    public boolean f(View view, View view2) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        return false;
    }

    public boolean n(View view) {
        return false;
    }

    public void p(int i4, int i5, int i6, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
        iArr[0] = iArr[0] + i5;
        iArr[1] = iArr[1] + i6;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z4) {
        return false;
    }

    public Parcelable s(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5) {
        return false;
    }

    public boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public void g(e eVar) {
    }

    public void j() {
    }

    public void i(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void r(View view, Parcelable parcelable) {
    }

    public void o(int i4, int i5, int i6, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
    }

    public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
    }
}
