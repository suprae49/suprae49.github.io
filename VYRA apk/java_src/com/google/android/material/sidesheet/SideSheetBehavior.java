package com.google.android.material.sidesheet;

import a3.j;
import a3.o;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import b3.e;
import b3.f;
import b3.g;
import co.median.android.eeqadjy.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p0.p0;
import q0.c;
import q0.n;
import t2.h;
import t2.i;
import z.b;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends b implements t2.b {
    public final LinkedHashSet A;
    public final e B;
    public e4.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f1535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ColorStateList f1536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f1537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f1538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f1539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1541m;
    public w0.e n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f1543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1547t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public WeakReference f1548u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WeakReference f1549v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1550w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public VelocityTracker f1551x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f1552y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1553z;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f1538j = new g(this);
        this.f1540l = true;
        this.f1541m = 5;
        this.f1543p = 0.1f;
        this.f1550w = -1;
        this.A = new LinkedHashSet();
        this.B = new e(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a2.a.M);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f1536h = i.h(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f1537i = o.g(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f1550w = resourceId;
            WeakReference weakReference = this.f1549v;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1549v = null;
            WeakReference weakReference2 = this.f1548u;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        o oVar = this.f1537i;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.f1535g = jVar;
            jVar.n(context);
            ColorStateList colorStateList = this.f1536h;
            if (colorStateList != null) {
                this.f1535g.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1535g.setTint(typedValue.data);
            }
        }
        this.f1539k = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f1540l = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.f1548u;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        p0.j(view, 262144);
        p0.h(view, 0);
        p0.j(view, 1048576);
        p0.h(view, 0);
        final int i4 = 5;
        if (this.f1541m != 5) {
            p0.k(view, c.f3371k, new n() { // from class: b3.b
                @Override // q0.n
                public final boolean e(View view2) {
                    this.f.w(i4);
                    return true;
                }
            });
        }
        final int i5 = 3;
        if (this.f1541m != 3) {
            p0.k(view, c.f3370j, new n() { // from class: b3.b
                @Override // q0.n
                public final boolean e(View view2) {
                    this.f.w(i5);
                    return true;
                }
            });
        }
    }

    @Override // t2.b
    public final void a() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        h hVar = this.f1552y;
        if (hVar == null) {
            return;
        }
        androidx.activity.b bVar = hVar.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        hVar.f = null;
        int i4 = 5;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        e4.a aVar = this.f;
        if (aVar != null && aVar.I() != 0) {
            i4 = 3;
        }
        f fVar = new f(0, this);
        WeakReference weakReference = this.f1549v;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iV = this.f.v(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: b3.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f1064a.f.l0(marginLayoutParams, b2.a.c(iV, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        hVar.b(bVar, i4, fVar, animatorUpdateListener);
    }

    @Override // t2.b
    public final void b(androidx.activity.b bVar) {
        h hVar = this.f1552y;
        if (hVar == null) {
            return;
        }
        hVar.f = bVar;
    }

    @Override // t2.b
    public final void c(androidx.activity.b bVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        h hVar = this.f1552y;
        if (hVar == null) {
            return;
        }
        e4.a aVar = this.f;
        int i4 = (aVar == null || aVar.I() == 0) ? 5 : 3;
        if (hVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = hVar.f;
        hVar.f = bVar;
        if (bVar2 != null) {
            hVar.c(bVar.f181c, bVar.f182d == 0, i4);
        }
        WeakReference weakReference = this.f1548u;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f1548u.get();
        WeakReference weakReference2 = this.f1549v;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f.l0(marginLayoutParams, (int) ((view.getScaleX() * this.f1544q) + this.f1547t));
        view2.requestLayout();
    }

    @Override // t2.b
    public final void d() {
        h hVar = this.f1552y;
        if (hVar == null) {
            return;
        }
        hVar.a();
    }

    @Override // z.b
    public final void g(z.e eVar) {
        this.f1548u = null;
        this.n = null;
        this.f1552y = null;
    }

    @Override // z.b
    public final void j() {
        this.f1548u = null;
        this.n = null;
        this.f1552y = null;
    }

    @Override // z.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        w0.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && p0.e(view) == null) || !this.f1540l) {
            this.f1542o = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1551x) != null) {
            velocityTracker.recycle();
            this.f1551x = null;
        }
        if (this.f1551x == null) {
            this.f1551x = VelocityTracker.obtain();
        }
        this.f1551x.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1553z = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1542o) {
            this.f1542o = false;
            return false;
        }
        return (this.f1542o || (eVar = this.n) == null || !eVar.q(motionEvent)) ? false : true;
    }

    @Override // z.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        View view2;
        View view3;
        int iF;
        int i5;
        View viewFindViewById;
        int i6 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f1548u;
        j jVar = this.f1535g;
        int i7 = 0;
        if (weakReference == null) {
            this.f1548u = new WeakReference(view);
            this.f1552y = new h(view);
            if (jVar != null) {
                view.setBackground(jVar);
                float elevation = this.f1539k;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                jVar.q(elevation);
            } else {
                ColorStateList colorStateList = this.f1536h;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = p0.f3233a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i8 = this.f1541m == 5 ? 4 : 0;
            if (view.getVisibility() != i8) {
                view.setVisibility(i8);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (p0.e(view) == null) {
                p0.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i9 = Gravity.getAbsoluteGravity(((z.e) view.getLayoutParams()).f4805c, i4) == 3 ? 1 : 0;
        e4.a aVar = this.f;
        if (aVar == null || aVar.I() != i9) {
            z.e eVar = null;
            o oVar = this.f1537i;
            if (i9 == 0) {
                this.f = new b3.a(this, i6);
                if (oVar != null) {
                    WeakReference weakReference2 = this.f1548u;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof z.e)) {
                        eVar = (z.e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        a3.n nVarK = oVar.k();
                        nVarK.f = new a3.a(0.0f);
                        nVarK.f117g = new a3.a(0.0f);
                        o oVarA = nVarK.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(oVarA);
                        }
                    }
                }
            } else {
                if (i9 != 1) {
                    q.k("Invalid sheet edge position value: ", i9, ". Must be 0 or 1.");
                    return false;
                }
                this.f = new b3.a(this, i7);
                if (oVar != null) {
                    WeakReference weakReference3 = this.f1548u;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof z.e)) {
                        eVar = (z.e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        a3.n nVarK2 = oVar.k();
                        nVarK2.f116e = new a3.a(0.0f);
                        nVarK2.f118h = new a3.a(0.0f);
                        o oVarA2 = nVarK2.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(oVarA2);
                        }
                    }
                }
            }
        }
        if (this.n == null) {
            this.n = new w0.e(coordinatorLayout.getContext(), coordinatorLayout, this.B);
        }
        int iF2 = this.f.F(view);
        coordinatorLayout.q(view, i4);
        this.f1545r = coordinatorLayout.getWidth();
        this.f1546s = this.f.H(coordinatorLayout);
        this.f1544q = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1547t = marginLayoutParams != null ? this.f.d(marginLayoutParams) : 0;
        int i10 = this.f1541m;
        if (i10 == 1 || i10 == 2) {
            iF = iF2 - this.f.F(view);
        } else if (i10 == 3) {
            iF = 0;
        } else {
            if (i10 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f1541m);
            }
            iF = this.f.B();
        }
        WeakHashMap weakHashMap2 = p0.f3233a;
        view.offsetLeftAndRight(iF);
        if (this.f1549v == null && (i5 = this.f1550w) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i5)) != null) {
            this.f1549v = new WeakReference(viewFindViewById);
        }
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                q.c();
                return false;
            }
        }
        return true;
    }

    @Override // z.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // z.b
    public final void r(View view, Parcelable parcelable) {
        int i4 = ((SavedState) parcelable).f1554h;
        if (i4 == 1 || i4 == 2) {
            i4 = 5;
        }
        this.f1541m = i4;
    }

    @Override // z.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // z.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1541m == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.n.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1551x) != null) {
            velocityTracker.recycle();
            this.f1551x = null;
        }
        if (this.f1551x == null) {
            this.f1551x = VelocityTracker.obtain();
        }
        this.f1551x.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.f1542o && y()) {
            float fAbs = Math.abs(this.f1553z - motionEvent.getX());
            w0.e eVar = this.n;
            if (fAbs > eVar.f4429b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1542o;
    }

    public final void w(int i4) {
        if (i4 == 1 || i4 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i4 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f1548u;
        if (weakReference == null || weakReference.get() == null) {
            x(i4);
            return;
        }
        View view = (View) this.f1548u.get();
        b3.c cVar = new b3.c(i4, 0, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(cVar);
        } else {
            cVar.run();
        }
    }

    public final void x(int i4) {
        View view;
        if (this.f1541m == i4) {
            return;
        }
        this.f1541m = i4;
        WeakReference weakReference = this.f1548u;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i5 = this.f1541m == 5 ? 4 : 0;
        if (view.getVisibility() != i5) {
            view.setVisibility(i5);
        }
        Iterator it = this.A.iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        A();
    }

    public final boolean y() {
        if (this.n != null) {
            return this.f1540l || this.f1541m == 1;
        }
        return false;
    }

    public final void z(View view, int i4, boolean z4) {
        int iA;
        if (i4 == 3) {
            iA = this.f.A();
        } else {
            if (i4 != 5) {
                q.q(u.k(i4, "Invalid state to get outer edge offset: "));
                return;
            }
            iA = this.f.B();
        }
        w0.e eVar = this.n;
        if (eVar == null || (!z4 ? eVar.r(view, iA, view.getTop()) : eVar.p(iA, view.getTop()))) {
            x(i4);
        } else {
            x(2);
            this.f1538j.a(i4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f1554h;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1554h = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f1554h);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f1554h = sideSheetBehavior.f1541m;
        }
    }

    public SideSheetBehavior() {
        this.f1538j = new g(this);
        this.f1540l = true;
        this.f1541m = 5;
        this.f1543p = 0.1f;
        this.f1550w = -1;
        this.A = new LinkedHashSet();
        this.B = new e(this, 0);
    }
}
