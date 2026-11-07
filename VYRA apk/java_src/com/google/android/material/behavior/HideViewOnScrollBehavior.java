package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c0.c;
import co.median.android.eeqadjy.R;
import d3.q;
import e4.a;
import java.util.LinkedHashSet;
import t2.i;
import u1.u1;
import u1.w1;
import z.b;
import z.e;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends b {
    public a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AccessibilityManager f1285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e2.a f1286h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TimeInterpolator f1290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TimeInterpolator f1291m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewPropertyAnimator f1293p;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f1287i = new LinkedHashSet();
    public int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1292o = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1294q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1295r = 0;

    public HideViewOnScrollBehavior() {
    }

    @Override // z.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        if (this.f1285g == null) {
            this.f1285g = (AccessibilityManager) c.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f1285g;
        if (accessibilityManager != null && this.f1286h == null) {
            e2.a aVar = new e2.a(this, view, 1);
            this.f1286h = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new q(2, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = ((e) view.getLayoutParams()).f4805c;
        if (i5 == 80 || i5 == 81) {
            w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i5, i4);
            w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.n = this.f.J(view, marginLayoutParams);
        this.f1288j = i.K(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1289k = i.K(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f1290l = i.L(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, b2.a.f1050d);
        this.f1291m = i.L(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, b2.a.f1049c);
        return false;
    }

    @Override // z.b
    public void p(int i4, int i5, int i6, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
        if (i4 > 0) {
            y(view);
        } else if (i4 < 0) {
            x(view);
        }
    }

    @Override // z.b
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5) {
        return i4 == 2;
    }

    public final void w(int i4) {
        a aVar = this.f;
        if (aVar == null || aVar.K() != i4) {
            if (i4 == 0) {
                this.f = new e2.c(2);
                return;
            }
            if (i4 == 1) {
                this.f = new e2.c(0);
            } else if (i4 == 2) {
                this.f = new e2.c(1);
            } else {
                androidx.fragment.app.q.k("Invalid view edge position value: ", i4, ". Must be 0, 1 or 2.");
            }
        }
    }

    public final void x(View view) {
        if (this.f1292o == 2) {
            return;
        }
        z(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f1293p;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f.getClass();
        this.f1293p = this.f.L(view, 0).setInterpolator(this.f1290l).setDuration(this.f1288j).setListener(new e2.b(this, 1, view));
    }

    public final void y(View view) {
        if (this.f1292o == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f1285g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f1293p;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            z(view, 1);
            this.f1293p = this.f.L(view, this.n).setInterpolator(this.f1291m).setDuration(this.f1289k).setListener(new e2.b(this, 1, view));
        }
    }

    public final void z(View view, int i4) {
        this.f1292o = i4;
        if (i4 == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f1294q = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f1295r = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i4 == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f1294q);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f1295r);
            }
        }
        for (u1 u1Var : this.f1287i) {
            int i5 = this.f1292o;
            w1 w1Var = u1Var.f4109a;
            RelativeLayout.LayoutParams layoutParams = w1Var.f;
            View view2 = w1Var.f4121c;
            if (w1Var.f4124g != i5) {
                w1Var.f4124g = i5;
                if (i5 == 2) {
                    int i6 = w1Var.n;
                    view2.getClass();
                    layoutParams.getClass();
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i6);
                    valueAnimatorOfInt.setDuration(250L);
                    valueAnimatorOfInt.addUpdateListener(new c2.b(layoutParams, 1, view2));
                    valueAnimatorOfInt.start();
                } else if (i5 == 1) {
                    int i7 = w1Var.n;
                    view2.getClass();
                    layoutParams.getClass();
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i7, 0);
                    valueAnimatorOfInt2.setDuration(150L);
                    valueAnimatorOfInt2.addUpdateListener(new c2.b(layoutParams, 1, view2));
                    valueAnimatorOfInt2.start();
                }
            }
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
