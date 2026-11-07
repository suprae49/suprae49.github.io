package co.median.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import r3.g;
import u1.e;
import u1.h0;
import u1.w1;
import x1.a;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class BottomNavigationShowOnScrollBehavior extends HideViewOnScrollBehavior<BottomNavigationView> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f1194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w1 f1195t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationShowOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f1194s = a.u(context).f4685o0;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollBehavior, z.b
    public final void p(int i4, int i5, int i6, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) view;
        view2.getClass();
        iArr.getClass();
        if (this.f1194s) {
            w1 w1Var = this.f1195t;
            if (w1Var == null) {
                g.c("tabManager");
                throw null;
            }
            e eVar = w1Var.f4119a.R;
            h0 h0Var = eVar.f3877c;
            boolean z4 = false;
            if ((h0Var != null ? h0Var.J() : false) && eVar.f3890r) {
                z4 = true;
            }
            if (z4) {
                return;
            }
            if (i6 > 0 || i4 < -50) {
                y(bottomNavigationView);
            } else if (i6 < 0 || i4 > 50) {
                x(bottomNavigationView);
            }
        }
    }
}
