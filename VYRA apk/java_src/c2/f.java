package c2;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import p0.y1;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f1137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f1138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1140k;

    public f() {
        this.f1137h = new Rect();
        this.f1138i = new Rect();
        this.f1139j = 0;
    }

    @Override // z.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        AppBarLayout appBarLayoutZ;
        y1 lastWindowInsets;
        int i7 = view.getLayoutParams().height;
        if ((i7 != -1 && i7 != -2) || (appBarLayoutZ = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.j(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i6);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (appBarLayoutZ.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.a() + lastWindowInsets.d();
        }
        int totalScrollRange = appBarLayoutZ.getTotalScrollRange() + size;
        int measuredHeight = appBarLayoutZ.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.r(view, i4, i5, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i7 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // c2.g
    public final void x(CoordinatorLayout coordinatorLayout, View view, int i4) {
        AppBarLayout appBarLayoutZ = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.j(view));
        if (appBarLayoutZ == null) {
            coordinatorLayout.q(view, i4);
            this.f1139j = 0;
            return;
        }
        z.e eVar = (z.e) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int bottom = appBarLayoutZ.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int bottom2 = ((appBarLayoutZ.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
        Rect rect = this.f1137h;
        rect.set(paddingLeft, bottom, width, bottom2);
        y1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.b() + rect.left;
            rect.right -= lastWindowInsets.c();
        }
        int i5 = eVar.f4805c;
        if (i5 == 0) {
            i5 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f1138i;
        Gravity.apply(i5, measuredWidth, measuredHeight, rect, rect2, i4);
        int iY = y(appBarLayoutZ);
        view.layout(rect2.left, rect2.top - iY, rect2.right, rect2.bottom - iY);
        this.f1139j = rect2.top - appBarLayoutZ.getBottom();
    }

    public final int y(View view) {
        int i4;
        if (this.f1140k == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            z.b bVar = ((z.e) appBarLayout.getLayoutParams()).f4803a;
            int iY = bVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) bVar).y() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iY > downNestedPreScrollRange) && (i4 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (iY / i4) + 1.0f;
            }
        }
        int i5 = this.f1140k;
        return h0.j((int) (f * i5), 0, i5);
    }

    public f(int i4) {
        super(0);
        this.f1137h = new Rect();
        this.f1138i = new Rect();
        this.f1139j = 0;
    }
}
