package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import q0.e;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f1253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f1254e;
    public final /* synthetic */ AppBarLayout.BaseBehavior f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f = baseBehavior;
        this.f1253d = appBarLayout;
        this.f1254e = coordinatorLayout;
    }

    @Override // p0.b
    public final void d(View view, e eVar) {
        this.f3167a.onInitializeAccessibilityNodeInfo(view, eVar.f3378a);
        eVar.g(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f1253d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f1254e;
        AppBarLayout.BaseBehavior baseBehavior = this.f;
        View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
        if (viewB == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (((c2.c) appBarLayout.getChildAt(i4).getLayoutParams()).f1125a != 0) {
                if (baseBehavior.y() != (-appBarLayout.getTotalScrollRange())) {
                    eVar.b(q0.c.f3368h);
                    eVar.i(true);
                }
                if (baseBehavior.y() != 0) {
                    if (!viewB.canScrollVertically(-1)) {
                        eVar.b(q0.c.f3369i);
                        eVar.i(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            eVar.b(q0.c.f3369i);
                            eVar.i(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // p0.b
    public final boolean g(View view, int i4, Bundle bundle) {
        AppBarLayout appBarLayout = this.f1253d;
        if (i4 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i4 != 8192) {
            return super.g(view, i4, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f;
        if (baseBehavior.y() != 0) {
            CoordinatorLayout coordinatorLayout = this.f1254e;
            View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
            if (!viewB.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i5 = -appBarLayout.getDownNestedPreScrollRange();
            if (i5 != 0) {
                baseBehavior.E(coordinatorLayout, this.f1253d, viewB, i5, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
