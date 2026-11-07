package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.u;
import c0.c;
import co.median.android.eeqadjy.R;
import d3.q;
import e2.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import t2.i;
import z.b;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TimeInterpolator f1276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TimeInterpolator f1277j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AccessibilityManager f1279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f1280m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewPropertyAnimator f1282p;
    public final LinkedHashSet f = new LinkedHashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1278k = 0;
    public final boolean n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1281o = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1283q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1284r = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // z.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        this.f1278k = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1274g = i.K(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1275h = i.K(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f1276i = i.L(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, b2.a.f1050d);
        this.f1277j = i.L(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, b2.a.f1049c);
        if (this.f1279l == null) {
            this.f1279l = (AccessibilityManager) c.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f1279l;
        if (accessibilityManager == null || this.f1280m != null) {
            return false;
        }
        a aVar = new a(this, view, 0);
        this.f1280m = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        view.addOnAttachStateChangeListener(new q(1, this));
        return false;
    }

    @Override // z.b
    public final void p(int i4, int i5, int i6, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i4 <= 0) {
            if (i4 < 0) {
                w(view);
            }
        } else {
            if (this.f1281o == 1) {
                return;
            }
            if (this.n && (accessibilityManager = this.f1279l) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f1282p;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            x(view, 1);
            this.f1282p = view.animate().translationY(this.f1278k).setInterpolator(this.f1277j).setDuration(this.f1275h).setListener(new e2.b(this, 0, view));
        }
    }

    @Override // z.b
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5) {
        return i4 == 2;
    }

    public final void w(View view) {
        if (this.f1281o == 2) {
            return;
        }
        x(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f1282p;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f1282p = view.animate().translationY(0).setInterpolator(this.f1276i).setDuration(this.f1274g).setListener(new e2.b(this, 0, view));
    }

    public final void x(View view, int i4) {
        this.f1281o = i4;
        if (i4 == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f1283q = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f1284r = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i4 == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f1283q);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f1284r);
            }
        }
        Iterator it = this.f.iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
