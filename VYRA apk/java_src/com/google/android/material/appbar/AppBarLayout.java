package com.google.android.material.appbar;

import a3.h0;
import a3.j;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.emoji2.text.p;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import c2.f;
import c2.h;
import c2.i;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import co.median.android.widget.BottomNavigationShowOnScrollBehavior;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import p.k;
import p0.m;
import p0.p0;
import p0.y1;
import r2.a0;
import u1.e;
import u1.w1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements z.a {
    public static final /* synthetic */ int G = 0;
    public int[] A;
    public int B;
    public Drawable C;
    public Integer D;
    public final float E;
    public Behavior F;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y1 f1222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f1223m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f1227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public WeakReference f1229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ValueAnimator f1230u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f1231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f1232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f1233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f1234y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TimeInterpolator f1235z;

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(f3.a.b(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.f1217g = -1;
        this.f1218h = -1;
        this.f1219i = -1;
        this.f1221k = 0;
        this.f1232w = new ArrayList();
        this.f1233x = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayF = a0.f(context3, attributeSet, i.f1146a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayF.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayF.getResourceId(0, 0)));
            }
            typedArrayF.recycle();
            TypedArray typedArrayF2 = a0.f(context2, attributeSet, a2.a.f11a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            int i4 = 6;
            this.f1227r = t2.i.h(context2, typedArrayF2, 6);
            this.f1234y = t2.i.K(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f1235z = t2.i.L(context2, R.attr.motionEasingStandardInterpolator, b2.a.f1047a);
            if (typedArrayF2.hasValue(4)) {
                e(typedArrayF2.getBoolean(4, false), false, false);
            }
            if (typedArrayF2.hasValue(3)) {
                i.a(this, typedArrayF2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayF2.getDrawable(0));
            if (typedArrayF2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayF2.getBoolean(2, false));
            }
            if (typedArrayF2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayF2.getBoolean(1, false));
            }
            this.E = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f1226q = typedArrayF2.getBoolean(5, false);
            this.f1228s = typedArrayF2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayF2.getDrawable(8));
            typedArrayF2.recycle();
            h0 h0Var = new h0(i4, this);
            WeakHashMap weakHashMap = p0.f3233a;
            p0.h0.c(this, h0Var);
        } catch (Throwable th) {
            typedArrayF.recycle();
            throw th;
        }
    }

    public static c2.c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            c2.c cVar = new c2.c((LinearLayout.LayoutParams) layoutParams);
            cVar.f1125a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c2.c cVar2 = new c2.c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.f1125a = 1;
            return cVar2;
        }
        c2.c cVar3 = new c2.c(layoutParams);
        cVar3.f1125a = 1;
        return cVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c2.c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c2.c cVar = new c2.c(context, attributeSet);
        cVar.f1125a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a2.a.f12b);
        cVar.f1125a = typedArrayObtainStyledAttributes.getInt(1, 0);
        cVar.f1126b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new p(3);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            cVar.f1127c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public final void c() {
        Behavior behavior = this.F;
        BaseBehavior.SavedState savedStateF = (behavior == null || this.f1217g == -1 || this.f1221k != 0) ? null : behavior.F(AbsSavedState.f526g, this);
        this.f1217g = -1;
        this.f1218h = -1;
        this.f1219i = -1;
        if (savedStateF != null) {
            Behavior behavior2 = this.F;
            if (behavior2.f1239r != null) {
                return;
            }
            behavior2.f1239r = savedStateF;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c2.c;
    }

    public final void d(int i4) {
        BottomNavigationShowOnScrollBehavior bottomNavigationShowOnScrollBehavior;
        this.f = i4;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f1223m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                u1.c cVar = (u1.c) this.f1223m.get(i5);
                if (cVar != null) {
                    e eVar = cVar.f3862a;
                    int i6 = eVar.f3889q;
                    MainActivity mainActivity = eVar.f3875a;
                    View view = eVar.f3880g;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.height = i6 + i4;
                    view.setLayoutParams(layoutParams);
                    int totalScrollRange = getTotalScrollRange() / 2;
                    if (eVar.f3891s) {
                        u1.h0 h0Var = eVar.f3877c;
                        if (h0Var != null ? h0Var.J() : false) {
                            if (Math.abs(i4) < totalScrollRange) {
                                mainActivity.Q.g();
                            } else if (Math.abs(i4) >= totalScrollRange) {
                                w1 w1Var = mainActivity.Q;
                                BottomNavigationView bottomNavigationView = w1Var.f4120b;
                                if (w1Var.f4122d.f4685o0 && bottomNavigationView.getVisibility() != 8 && (bottomNavigationShowOnScrollBehavior = w1Var.f4123e) != null && w1Var.f4124g != 1) {
                                    bottomNavigationShowOnScrollBehavior.y(bottomNavigationView);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.C == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f);
        this.C.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.C;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(boolean z4, boolean z5, boolean z6) {
        this.f1221k = (z4 ? 1 : 2) | (z5 ? 4 : 0) | (z6 ? 8 : 0);
        requestLayout();
    }

    public final boolean f(boolean z4) {
        if (this.n || this.f1225p == z4) {
            return false;
        }
        this.f1225p = z4;
        refreshDrawableState();
        if (!(getBackground() instanceof j)) {
            return true;
        }
        if (this.f1227r != null) {
            h(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f1226q) {
            return true;
        }
        float f = this.E;
        h(z4 ? 0.0f : f, z4 ? f : 0.0f);
        return true;
    }

    public final boolean g(View view) {
        int i4;
        if (this.f1229t == null && (i4 = this.f1228s) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i4) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f1228s);
            }
            if (viewFindViewById != null) {
                this.f1229t = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f1229t;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c2.c cVar = new c2.c(-1, -2);
        cVar.f1125a = 1;
        return cVar;
    }

    @Override // z.a
    public z.b getBehavior() {
        Behavior behavior = new Behavior();
        this.F = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i4 = this.f1218h;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                c2.c cVar = (c2.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = cVar.f1125a;
                if ((i6 & 5) != 5) {
                    if (i5 > 0) {
                        break;
                    }
                } else {
                    int i7 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i6 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i6 & 2) != 0) {
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i7 + measuredHeight;
                        }
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i5 += iMin;
                    }
                    iMin = minimumHeight + i7;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i5 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i5);
        this.f1218h = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i4 = this.f1219i;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                c2.c cVar = (c2.c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i6 = cVar.f1125a;
                if ((i6 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i6 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f1219i = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f1228s;
    }

    public j getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof j) {
            return (j) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i4 = (minimumHeight * 2) + topInset;
            return i4 < getHeight() ? i4 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i5 = (minimumHeight2 * 2) + topInset;
        return i5 < getHeight() ? i5 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f1221k;
    }

    public Drawable getStatusBarForeground() {
        return this.C;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        y1 y1Var = this.f1222l;
        if (y1Var != null) {
            return y1Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i4 = this.f1217g;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                c2.c cVar = (c2.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = cVar.f1125a;
                if ((i6 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + minimumHeight;
                if (i5 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i6 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f1217g = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void h(float f, float f4) {
        ValueAnimator valueAnimator = this.f1230u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f4);
        this.f1230u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f1234y);
        this.f1230u.setInterpolator(this.f1235z);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f1231v;
        if (animatorUpdateListener != null) {
            this.f1230u.addUpdateListener(animatorUpdateListener);
        }
        this.f1230u.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u1.h0.j0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        if (this.A == null) {
            this.A = new int[4];
        }
        int[] iArr = this.A;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + iArr.length);
        boolean z4 = this.f1224o;
        iArr[0] = z4 ? R.attr.state_liftable : -2130969840;
        iArr[1] = (z4 && this.f1225p) ? R.attr.state_lifted : -2130969841;
        iArr[2] = z4 ? R.attr.state_collapsible : -2130969836;
        iArr[3] = (z4 && this.f1225p) ? R.attr.state_collapsed : -2130969835;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f1229t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f1229t = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        boolean z5 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = p0.f3233a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f1220j = false;
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            if (((c2.c) getChildAt(i8).getLayoutParams()).f1127c != null) {
                this.f1220j = true;
                break;
            }
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.n) {
            return;
        }
        if (!this.f1226q) {
            int childCount3 = getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount3) {
                    z5 = false;
                    break;
                }
                int i10 = ((c2.c) getChildAt(i9).getLayoutParams()).f1125a;
                if ((i10 & 1) == 1 && (i10 & 10) != 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        if (this.f1224o != z5) {
            this.f1224o = z5;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = u1.h0.j(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i5));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final j jVar;
        ColorStateList colorStateList;
        Context context = getContext();
        if (drawable instanceof j) {
            jVar = (j) drawable;
        } else {
            ColorStateList colorStateListU = u1.h0.u(drawable);
            if (colorStateListU == null) {
                jVar = null;
            } else {
                j jVar2 = new j();
                jVar2.r(colorStateListU);
                jVar = jVar2;
            }
        }
        if (jVar != null && (colorStateList = jVar.f88g.f72c) != null) {
            this.B = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.f1227r;
            if (colorStateList2 != null) {
                final Integer numU = e4.a.u(getContext(), R.attr.colorSurface);
                this.f1231v = new ValueAnimator.AnimatorUpdateListener() { // from class: c2.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = this.f1118a;
                        LinkedHashSet linkedHashSet = appBarLayout.f1233x;
                        ArrayList arrayList = appBarLayout.f1232w;
                        int iU = e4.a.U(appBarLayout.B, colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iU);
                        j jVar3 = jVar;
                        jVar3.r(colorStateListValueOf);
                        if (appBarLayout.C != null && (num = appBarLayout.D) != null && num.equals(numU)) {
                            appBarLayout.C.setTint(iU);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                if (obj != null) {
                                    q.c();
                                    return;
                                } else if (jVar3.f88g.f72c != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            throw u.j(it);
                        }
                    }
                };
            } else {
                jVar.n(context);
                this.f1231v = new c2.b(this, 0, jVar);
            }
            drawable = jVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        u1.h0.b0(this, f);
    }

    public void setExpanded(boolean z4) {
        e(z4, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z4) {
        this.f1226q = z4;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f1227r != colorStateList) {
            this.f1227r = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f1228s = -1;
        if (view != null) {
            this.f1229t = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f1229t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f1229t = null;
    }

    public void setLiftOnScrollTargetViewId(int i4) {
        this.f1228s = i4;
        WeakReference weakReference = this.f1229t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f1229t = null;
    }

    public void setLiftableOverrideEnabled(boolean z4) {
        this.n = z4;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i4) {
        if (i4 == 1) {
            super.setOrientation(i4);
        } else {
            q.q("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setPendingAction(int i4) {
        this.f1221k = i4;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.C;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.C = drawableMutate;
            if (drawableMutate instanceof j) {
                numValueOf = Integer.valueOf(((j) drawableMutate).A);
            } else {
                ColorStateList colorStateListU = u1.h0.u(drawableMutate);
                if (colorStateListU != null) {
                    numValueOf = Integer.valueOf(colorStateListU.getDefaultColor());
                }
            }
            this.D = numValueOf;
            Drawable drawable3 = this.C;
            boolean z4 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.C.setState(getDrawableState());
                }
                this.C.setLayoutDirection(getLayoutDirection());
                this.C.setVisible(getVisibility() == 0, false);
                this.C.setCallback(this);
            }
            if (this.C != null && getTopInset() > 0) {
                z4 = true;
            }
            setWillNotDraw(!z4);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i4) {
        setStatusBarForeground(new ColorDrawable(i4));
    }

    public void setStatusBarForegroundResource(int i4) {
        setStatusBarForeground(u1.h0.w(getContext(), i4));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        i.a(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.C;
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class BaseBehavior<T extends AppBarLayout> extends c2.e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1236o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1237p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public ValueAnimator f1238q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public SavedState f1239r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public WeakReference f1240s;

        /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new c();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f1241h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f1242i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f1243j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public float f1244k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public boolean f1245l;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f1241h = parcel.readByte() != 0;
                this.f1242i = parcel.readByte() != 0;
                this.f1243j = parcel.readInt();
                this.f1244k = parcel.readFloat();
                this.f1245l = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i4) {
                super.writeToParcel(parcel, i4);
                parcel.writeByte(this.f1241h ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f1242i ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f1243j);
                parcel.writeFloat(this.f1244k);
                parcel.writeByte(this.f1245l ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f1134k = -1;
            this.f1136m = -1;
        }

        public static View B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (((z.e) childAt.getLayoutParams()).f4803a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if ((childAt instanceof m) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005a  */
        public static void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4, int i5, boolean z4) {
            View childAt;
            boolean zG;
            int iAbs = Math.abs(i4);
            int childCount = appBarLayout.getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i6);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (childAt != null) {
                int i7 = ((c2.c) childAt.getLayoutParams()).f1125a;
                if ((i7 & 1) != 0) {
                    int minimumHeight = childAt.getMinimumHeight();
                    zG = true;
                    if (i5 <= 0 || (i7 & 12) == 0 ? (i7 & 2) == 0 || (-i4) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i4) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zG = false;
                    }
                } else {
                    zG = false;
                }
            } else {
                zG = false;
            }
            if (appBarLayout.f1226q) {
                zG = appBarLayout.g(D(coordinatorLayout));
            }
            boolean zF = appBarLayout.f(zG);
            if (!z4) {
                if (zF) {
                    List list = (List) ((k) coordinatorLayout.f467g.f593b).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.f469i;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        z.b bVar = ((z.e) ((View) arrayList.get(i8)).getLayoutParams()).f4803a;
                        if (bVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) bVar).f1140k == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4) {
            int iAbs = Math.abs(y() - i4);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iY = y();
            ValueAnimator valueAnimator = this.f1238q;
            if (iY == i4) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f1238q.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f1238q = valueAnimator2;
                valueAnimator2.setInterpolator(b2.a.f1051e);
                this.f1238q.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.f1238q.setDuration(Math.min(iRound, 600));
            this.f1238q.setIntValues(iY, i4);
            this.f1238q.start();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i5;
            int downNestedPreScrollRange;
            if (i4 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i4 < 0) {
                    i5 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i6 = i5;
                int i7 = downNestedPreScrollRange;
                if (i6 != i7) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = z(coordinatorLayout, appBarLayout2, y() - i4, i6, i7);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.f1226q) {
                appBarLayout2.f(appBarLayout2.g(view));
            }
        }

        public final SavedState F(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iW = w();
            int childCount = appBarLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = appBarLayout.getChildAt(i4);
                int bottom = childAt.getBottom() + iW;
                if (childAt.getTop() + iW <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f526g;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z4 = iW == 0;
                    savedState.f1242i = z4;
                    savedState.f1241h = !z4 && (-iW) >= appBarLayout.getTotalScrollRange();
                    savedState.f1243j = i4;
                    savedState.f1245l = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.f1244k = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iY = y() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    i4 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i4);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c2.c cVar = (c2.c) childAt.getLayoutParams();
                if ((cVar.f1125a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i5 = -iY;
                if (top <= i5 && bottom >= i5) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i4);
                c2.c cVar2 = (c2.c) childAt2.getLayoutParams();
                int i6 = cVar2.f1125a;
                if ((i6 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i4 == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((i6 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i6 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iY < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i6 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (iY < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    C(coordinatorLayout, appBarLayout, u1.h0.j(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // c2.g, z.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i4);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f1239r;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z4 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i5 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z4) {
                            C(coordinatorLayout, appBarLayout, i5);
                        } else {
                            A(coordinatorLayout, appBarLayout, i5);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z4) {
                            C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f1241h) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f1242i) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f1243j);
                int i6 = -childAt.getBottom();
                if (this.f1239r.f1245l) {
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i6;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f1239r.f1244k) + i6;
                }
                A(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f1221k = 0;
            this.f1239r = null;
            int iJ = u1.h0.j(w(), -appBarLayout.getTotalScrollRange(), 0);
            h hVar = this.f;
            if (hVar == null) {
                this.f1141g = iJ;
            } else if (hVar.f1144c != iJ) {
                hVar.f1144c = iJ;
                hVar.b();
            }
            H(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.d(w());
            if (p0.d(coordinatorLayout) != null) {
                return true;
            }
            p0.m(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // z.b
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((z.e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.r(appBarLayout, i4, i5, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // z.b
        public final /* bridge */ /* synthetic */ void o(int i4, int i5, int i6, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i5, iArr);
        }

        @Override // z.b
        public final void p(int i4, int i5, int i6, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i6 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout, y() - i6, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i6 == 0 && p0.d(coordinatorLayout2) == null) {
                p0.m(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // z.b
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.f1239r = (SavedState) parcelable;
            } else {
                this.f1239r = null;
            }
        }

        @Override // z.b
        public final Parcelable s(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateF = F(absSavedState, (AppBarLayout) view);
            return savedStateF == null ? absSavedState : savedStateF;
        }

        @Override // z.b
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z4 = (i4 & 2) != 0 && (appBarLayout.f1226q || appBarLayout.f1225p || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z4 && (valueAnimator = this.f1238q) != null) {
                valueAnimator.cancel();
            }
            this.f1240s = null;
            this.f1237p = i5;
            return z4;
        }

        @Override // z.b
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f1237p == 0 || i4 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f1226q) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.f1240s = new WeakReference(view2);
        }

        @Override // c2.e
        public final int y() {
            return w() + this.f1236o;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:66:0x0163  */
        /* JADX WARN: Code duplicated, block: B:68:0x0173  */
        /* JADX WARN: Code duplicated, block: B:72:0x0182  */
        /* JADX WARN: Code duplicated, block: B:73:0x0184  */
        /* JADX WARN: Code duplicated, block: B:92:0x0176 A[SYNTHETIC] */
        @Override // c2.e
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
            int top;
            boolean z4;
            int i7;
            List list;
            int i8;
            View view2;
            z.b bVar;
            int i9;
            p pVar;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iY = y();
            int i10 = 0;
            if (i5 == 0 || iY < i5 || iY > i6) {
                this.f1236o = 0;
            } else {
                int iJ = u1.h0.j(i4, i5, i6);
                if (iY != iJ) {
                    if (!appBarLayout.f1220j) {
                        top = iJ;
                        break;
                    }
                    int iAbs = Math.abs(iJ);
                    int childCount = appBarLayout.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = appBarLayout.getChildAt(i11);
                            c2.c cVar = (c2.c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.f1127c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i11++;
                            } else if (interpolator != null) {
                                int i12 = cVar.f1125a;
                                if ((i12 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                                    if ((i12 & 2) != 0) {
                                        topInset -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iJ);
                                    break;
                                }
                            }
                        }
                        top = iJ;
                        break;
                    }
                    h hVar = this.f;
                    int i13 = 1;
                    if (hVar != null) {
                        if (hVar.f1144c != top) {
                            hVar.f1144c = top;
                            hVar.b();
                            z4 = true;
                        }
                        int i14 = iY - iJ;
                        this.f1236o = iJ - top;
                        if (z4) {
                            i9 = 0;
                            while (i9 < appBarLayout.getChildCount()) {
                                c2.c cVar2 = (c2.c) appBarLayout.getChildAt(i9).getLayoutParams();
                                pVar = cVar2.f1126b;
                                if (pVar == null && (cVar2.f1125a & i13) != 0) {
                                    View childAt2 = appBarLayout.getChildAt(i9);
                                    float fW = w();
                                    Rect rect = (Rect) pVar.f569h;
                                    Rect rect2 = (Rect) pVar.f568g;
                                    childAt2.getDrawingRect(rect2);
                                    appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                    rect2.offset(0, -appBarLayout.getTopInset());
                                    float fAbs = rect2.top - Math.abs(fW);
                                    if (fAbs <= 0.0f) {
                                        float fI = 1.0f - u1.h0.i(Math.abs(fAbs / rect2.height()), 0.0f, 1.0f);
                                        float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fI * fI)));
                                        childAt2.setTranslationY(fHeight);
                                        childAt2.getDrawingRect(rect);
                                        rect.offset(0, (int) (-fHeight));
                                        if (fHeight >= rect.height()) {
                                            childAt2.setAlpha(0.0f);
                                        } else {
                                            childAt2.setAlpha(1.0f);
                                        }
                                        childAt2.setClipBounds(rect);
                                    } else {
                                        childAt2.setClipBounds(null);
                                        childAt2.setTranslationY(0.0f);
                                        childAt2.setAlpha(1.0f);
                                    }
                                }
                                i9++;
                                i13 = 1;
                            }
                        }
                        if (!z4 && appBarLayout.f1220j && (list = (List) ((k) coordinatorLayout.f467g.f593b).get(appBarLayout)) != null && !list.isEmpty()) {
                            for (i8 = 0; i8 < list.size(); i8++) {
                                view2 = (View) list.get(i8);
                                bVar = ((z.e) view2.getLayoutParams()).f4803a;
                                if (bVar != null) {
                                    bVar.h(coordinatorLayout, view2, appBarLayout);
                                }
                            }
                        }
                        appBarLayout.d(w());
                        if (iJ < iY) {
                            i7 = -1;
                        } else {
                            i7 = 1;
                        }
                        H(coordinatorLayout, appBarLayout, iJ, i7, false);
                        i10 = i14;
                    } else {
                        this.f1141g = top;
                    }
                    z4 = false;
                    int i15 = iY - iJ;
                    this.f1236o = iJ - top;
                    if (z4) {
                        i9 = 0;
                        while (i9 < appBarLayout.getChildCount()) {
                            c2.c cVar3 = (c2.c) appBarLayout.getChildAt(i9).getLayoutParams();
                            pVar = cVar3.f1126b;
                            if (pVar == null) {
                            }
                            i9++;
                            i13 = 1;
                        }
                    }
                    if (!z4) {
                        while (i8 < list.size()) {
                            view2 = (View) list.get(i8);
                            bVar = ((z.e) view2.getLayoutParams()).f4803a;
                            if (bVar != null) {
                                bVar.h(coordinatorLayout, view2, appBarLayout);
                            }
                        }
                    }
                    appBarLayout.d(w());
                    if (iJ < iY) {
                        i7 = -1;
                    } else {
                        i7 = 1;
                    }
                    H(coordinatorLayout, appBarLayout, iJ, i7, false);
                    i10 = i15;
                }
            }
            if (p0.d(coordinatorLayout) != null) {
                return i10;
            }
            p0.m(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return i10;
        }

        public BaseBehavior() {
            this.f1134k = -1;
            this.f1136m = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        c2.c cVar = new c2.c(-1, -2);
        cVar.f1125a = 1;
        return cVar;
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class ScrollingViewBehavior extends f {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a2.a.K);
            this.f1140k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public static AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList.get(i4);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // z.b
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // z.b
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            z.b bVar = ((z.e) view2.getLayoutParams()).f4803a;
            if (bVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).f1236o) + this.f1139j) - y(view2);
                WeakHashMap weakHashMap = p0.f3233a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f1226q) {
                return false;
            }
            appBarLayout.f(appBarLayout.g(view));
            return false;
        }

        @Override // z.b
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                p0.m(coordinatorLayout, null);
            }
        }

        @Override // z.b
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z4) {
            AppBarLayout appBarLayoutZ = z(coordinatorLayout.j(view));
            if (appBarLayoutZ != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f1137h;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutZ.e(false, !z4, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }
}
