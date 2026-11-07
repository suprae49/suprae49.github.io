package com.google.android.material.bottomsheet;

import a3.h;
import a3.j;
import a3.o;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import b3.g;
import co.median.android.eeqadjy.R;
import d3.e0;
import e.k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p0.i0;
import p0.p0;
import p0.y1;
import q0.c;
import r2.a0;
import t2.f;
import t2.i;
import w0.e;
import z.b;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b implements t2.b {
    public final boolean A;
    public int B;
    public int C;
    public final boolean D;
    public final o E;
    public boolean F;
    public final g G;
    public final ValueAnimator H;
    public final int I;
    public int J;
    public int K;
    public final float L;
    public int M;
    public final float N;
    public boolean O;
    public boolean P;
    public final boolean Q;
    public final boolean R;
    public boolean S;
    public final boolean T;
    public int U;
    public e V;
    public boolean W;
    public int X;
    public boolean Y;
    public final float Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1302a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f1303b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f1304c0;
    public WeakReference d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ArrayList f1305e0;
    public final int f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final ArrayList f1306f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1307g;
    public VelocityTracker g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1308h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public f f1309h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1310i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1311i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1312j;
    public int j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1313k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public WeakReference f1314k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1315l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f1316l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1317m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public HashMap f1318m0;
    public final int n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final SparseIntArray f1319n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f1320o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final SparseIntArray f1321o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ColorStateList f1322p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SparseIntArray f1323p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1324q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Rect f1325q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1326r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final b3.e f1327r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1328s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f1329t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f1330u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f1331v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f1332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f1333x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f1334y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f1335z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i4;
        this.f = 0;
        int i5 = 1;
        this.f1307g = true;
        this.f1324q = -1;
        this.f1326r = -1;
        this.G = new g(this);
        this.L = 0.5f;
        this.N = -1.0f;
        this.Q = true;
        this.R = true;
        this.T = true;
        this.U = 4;
        this.Z = 0.1f;
        this.f1305e0 = new ArrayList();
        this.f1306f0 = new ArrayList();
        this.j0 = -1;
        this.f1319n0 = new SparseIntArray();
        this.f1321o0 = new SparseIntArray();
        this.f1323p0 = new SparseIntArray();
        this.f1325q0 = new Rect();
        this.f1327r0 = new b3.e(this, i5);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a2.a.f);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f1322p = i.h(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.E = o.g(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        o oVar = this.E;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.f1320o = jVar;
            jVar.n(context);
            ColorStateList colorStateList = this.f1322p;
            if (colorStateList != null) {
                this.f1320o.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1320o.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(y(), 1.0f);
        this.H = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.H.addUpdateListener(new e0(i5, this));
        this.N = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f1324q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f1326r = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || (i4 = typedValuePeekValue.data) != -1) {
            I(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            I(i4);
        }
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.O != z4) {
            this.O = z4;
            if (!z4 && this.U == 5) {
                J(4);
            }
            N();
        }
        this.f1329t = typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.f1307g != z5) {
            this.f1307g = z5;
            if (this.d0 != null) {
                x();
            }
            K((this.f1307g && this.U == 6) ? 3 : this.U);
            O(this.U, true);
            N();
        }
        this.P = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.Q = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.R = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            q.q("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.L = f;
        if (this.d0 != null) {
            this.K = (int) ((1.0f - f) * this.f1304c0);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                q.q("offset must be greater than or equal to 0");
                throw null;
            }
            this.I = dimensionPixelOffset;
            O(this.U, true);
        } else {
            int i6 = typedValuePeekValue2.data;
            if (i6 < 0) {
                q.q("offset must be greater than or equal to 0");
                throw null;
            }
            this.I = i6;
            O(this.U, true);
        }
        this.f1310i = typedArrayObtainStyledAttributes.getInt(14, 500);
        this.f1312j = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.T = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f1330u = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.f1331v = typedArrayObtainStyledAttributes.getBoolean(21, false);
        this.f1332w = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.f1333x = typedArrayObtainStyledAttributes.getBoolean(23, true);
        this.f1334y = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f1335z = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.A = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.D = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f1308h = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View viewB = B(viewGroup.getChildAt(i4));
            if (viewB != null) {
                return viewB;
            }
        }
        return null;
    }

    public static int C(int i4, int i5, int i6, int i7) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, i5, i7);
        if (i6 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i6), 1073741824);
        }
        if (size != 0) {
            i6 = Math.min(size, i6);
        }
        return View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
    }

    public final void A(int i4) {
        if (((View) this.d0.get()) != null) {
            ArrayList arrayList = this.f1306f0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i5 = this.M;
            if (i4 <= i5 && i5 != D()) {
                D();
            }
            if (arrayList.size() > 0) {
                throw u.i(0, arrayList);
            }
        }
    }

    public final int D() {
        if (this.f1307g) {
            return this.J;
        }
        return Math.max(this.I, this.f1333x ? 0 : this.C);
    }

    public final int E(int i4) {
        if (i4 == 3) {
            return D();
        }
        if (i4 == 4) {
            return this.M;
        }
        if (i4 == 5) {
            return this.f1304c0;
        }
        if (i4 == 6) {
            return this.K;
        }
        q.q(u.k(i4, "Invalid state to get top offset: "));
        return 0;
    }

    public final boolean F() {
        WeakReference weakReference = this.d0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.d0.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean G(View view) {
        ArrayList arrayList = this.f1305e0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (((WeakReference) obj).get() == view) {
                return true;
            }
        }
        return false;
    }

    public final void H(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.f1305e0.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                H(viewGroup.getChildAt(i4));
            }
        }
    }

    public final void I(int i4) {
        boolean z4 = this.f1315l;
        if (i4 == -1) {
            if (z4) {
                return;
            } else {
                this.f1315l = true;
            }
        } else {
            if (!z4 && this.f1313k == i4) {
                return;
            }
            this.f1315l = false;
            this.f1313k = Math.max(0, i4);
        }
        Q();
    }

    public final void J(int i4) {
        if (i4 == 1 || i4 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i4 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.O && i4 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i4);
            return;
        }
        int i5 = (i4 == 6 && this.f1307g && E(i4) <= this.J) ? 3 : i4;
        WeakReference weakReference = this.d0;
        if (weakReference == null || weakReference.get() == null) {
            K(i4);
            return;
        }
        View view = (View) this.d0.get();
        h2.a aVar = new h2.a(this, view, i5);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(aVar);
        } else {
            aVar.run();
        }
    }

    public final void K(int i4) {
        if (this.U == i4) {
            return;
        }
        this.U = i4;
        if (i4 != 4 && i4 != 3 && i4 != 6) {
            boolean z4 = this.O;
        }
        WeakReference weakReference = this.d0;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i4 == 3) {
            P(true);
        } else if (i4 == 6 || i4 == 5 || i4 == 4) {
            P(false);
        }
        O(i4, true);
        ArrayList arrayList = this.f1306f0;
        if (arrayList.size() > 0) {
            throw u.i(0, arrayList);
        }
        N();
    }

    public final boolean L(View view, float f) {
        if (this.P) {
            return true;
        }
        if (view.getTop() < this.M) {
            return false;
        }
        return Math.abs(((f * this.Z) + ((float) view.getTop())) - ((float) this.M)) / ((float) z()) > 0.5f;
    }

    public final void M(View view, int i4, boolean z4) {
        int iE = E(i4);
        e eVar = this.V;
        if (eVar == null || (!z4 ? eVar.r(view, view.getLeft(), iE) : eVar.p(view.getLeft(), iE))) {
            K(i4);
            return;
        }
        K(2);
        O(i4, true);
        this.G.a(i4);
    }

    public final void N() {
        View view;
        WeakReference weakReference = this.d0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        p0.j(view, 1048576);
        p0.h(view, 0);
        p0.j(view, 524288);
        p0.h(view, 0);
        p0.j(view, 262144);
        p0.h(view, 0);
        SparseIntArray sparseIntArray = this.f1321o0;
        int i4 = sparseIntArray.get(0, -1);
        if (i4 != -1) {
            p0.j(view, i4);
            p0.h(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.f1319n0;
        int i5 = sparseIntArray2.get(0, -1);
        if (i5 != -1) {
            p0.j(view, i5);
            p0.h(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.f1323p0;
        int i6 = sparseIntArray3.get(0, -1);
        if (i6 != -1) {
            p0.j(view, i6);
            p0.h(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.f1307g && this.U != 6) {
            sparseIntArray2.put(0, w(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.O && this.U != 5) {
            p0.k(view, c.f3371k, new e.f(this, 5));
        }
        int i7 = this.U;
        if (i7 == 3) {
            if (this.P && this.O) {
                return;
            }
            sparseIntArray3.put(0, w(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i7 == 4) {
            sparseIntArray.put(0, w(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i7 != 6) {
                return;
            }
            if (!this.P || !this.O) {
                sparseIntArray3.put(0, w(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, w(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    public final void O(int i4, boolean z4) {
        j jVar;
        if (i4 == 2) {
            return;
        }
        boolean z5 = this.U == 3 && (this.D || F());
        if (this.F == z5 || (jVar = this.f1320o) == null) {
            return;
        }
        this.F = z5;
        ValueAnimator valueAnimator = this.H;
        if (z4 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(jVar.f88g.f77i, z5 ? y() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fY = this.F ? y() : 1.0f;
        h hVar = jVar.f88g;
        if (hVar.f77i != fY) {
            hVar.f77i = fY;
            jVar.f92k = true;
            jVar.f93l = true;
            jVar.invalidateSelf();
        }
    }

    public final void P(boolean z4) {
        WeakReference weakReference = this.d0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                if (this.f1318m0 != null) {
                    return;
                } else {
                    this.f1318m0 = new HashMap(childCount);
                }
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (childAt != this.d0.get() && z4) {
                    this.f1318m0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z4) {
                return;
            }
            this.f1318m0 = null;
        }
    }

    public final void Q() {
        View view;
        if (this.d0 != null) {
            x();
            if (this.U != 4 || (view = (View) this.d0.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // t2.b
    public final void a() {
        f fVar = this.f1309h0;
        if (fVar == null) {
            return;
        }
        int i4 = fVar.f3725d;
        int i5 = fVar.f3724c;
        androidx.activity.b bVar = fVar.f;
        fVar.f = null;
        if (bVar != null) {
            float f = bVar.f181c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.O) {
                    AnimatorSet animatorSetA = fVar.a();
                    animatorSetA.setDuration(b2.a.c(i5, i4, f));
                    animatorSetA.start();
                    J(4);
                    return;
                }
                b3.f fVar2 = new b3.f(2, this);
                View view = fVar.f3723b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new e1.a(1));
                objectAnimatorOfFloat.setDuration(b2.a.c(i5, i4, f));
                objectAnimatorOfFloat.addListener(new b3.f(8, fVar));
                objectAnimatorOfFloat.addListener(fVar2);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        J(this.O ? 5 : 4);
    }

    @Override // t2.b
    public final void b(androidx.activity.b bVar) {
        f fVar = this.f1309h0;
        if (fVar == null) {
            return;
        }
        fVar.f = bVar;
    }

    @Override // t2.b
    public final void c(androidx.activity.b bVar) {
        f fVar = this.f1309h0;
        if (fVar == null) {
            return;
        }
        if (fVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = fVar.f;
        fVar.f = bVar;
        if (bVar2 == null) {
            return;
        }
        fVar.b(bVar.f181c);
    }

    @Override // t2.b
    public final void d() {
        f fVar = this.f1309h0;
        if (fVar == null) {
            return;
        }
        if (fVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        androidx.activity.b bVar = fVar.f;
        fVar.f = null;
        if (bVar == null) {
            return;
        }
        AnimatorSet animatorSetA = fVar.a();
        animatorSetA.setDuration(fVar.f3726e);
        animatorSetA.start();
    }

    @Override // z.b
    public final void g(z.e eVar) {
        this.d0 = null;
        this.V = null;
        this.f1309h0 = null;
    }

    @Override // z.b
    public final void j() {
        this.d0 = null;
        this.V = null;
        this.f1309h0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    @Override // z.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i4;
        e eVar;
        if (!view.isShown() || !this.Q) {
            this.W = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.f1311i0 = -1;
            this.j0 = -1;
            this.f1314k0 = null;
            VelocityTracker velocityTracker = this.g0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.g0 = null;
            }
        }
        if (this.g0 == null) {
            this.g0 = VelocityTracker.obtain();
        }
        this.g0.addMovement(motionEvent);
        ArrayList arrayList = this.f1305e0;
        if (actionMasked == 0) {
            int x4 = (int) motionEvent.getX();
            this.j0 = (int) motionEvent.getY();
            int x5 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        view2 = null;
                        break;
                    }
                    Object obj = arrayList.get(i5);
                    i5++;
                    view2 = (View) ((WeakReference) obj).get();
                    if (view2 != null && coordinatorLayout.o(view2, x5, y4)) {
                        break;
                    }
                }
            }
            WeakReference weakReference = new WeakReference(view2);
            this.f1314k0 = weakReference;
            if (this.U != 2 && weakReference.get() != null) {
                this.f1311i0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f1316l0 = true;
            }
            this.W = this.f1311i0 == -1 && !coordinatorLayout.o(view, x4, this.j0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1316l0 = false;
            this.f1314k0 = null;
            this.f1311i0 = -1;
            if (this.W) {
                this.W = false;
                return false;
            }
        }
        if (this.W || (eVar = this.V) == null || !eVar.q(motionEvent)) {
            if (actionMasked == 2) {
                int size2 = arrayList.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    if (((WeakReference) obj2).get() != null) {
                        if (!this.W && this.U != 1) {
                            if (!this.f1312j) {
                                View view3 = !arrayList.isEmpty() ? (View) ((WeakReference) arrayList.get(0)).get() : null;
                                if (view3 != null && coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                                    break;
                                }
                                if (this.V == null) {
                                    break;
                                }
                            } else {
                                WeakReference weakReference2 = this.f1314k0;
                                if (weakReference2 != null && weakReference2.get() != null) {
                                    break;
                                }
                                if (this.V == null || (i4 = this.j0) == -1 || Math.abs(i4 - motionEvent.getY()) <= this.V.f4429b) {
                                    break;
                                }
                            }
                        } else {
                            break;
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // z.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.d0 == null) {
            this.f1317m = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z4 = (Build.VERSION.SDK_INT < 29 || this.f1329t || this.f1315l) ? false : true;
            if (this.f1330u || this.f1331v || this.f1332w || this.f1334y || this.f1335z || this.A || z4) {
                a0.d(view, new k0(this, z4));
            }
            p0.o(view, new h2.b(view));
            this.d0 = new WeakReference(view);
            this.f1309h0 = new f(view);
            j jVar = this.f1320o;
            if (jVar != null) {
                view.setBackground(jVar);
                float elevation = this.N;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                jVar.q(elevation);
            } else {
                ColorStateList colorStateList = this.f1322p;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            N();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.V == null) {
            this.V = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1327r0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i4);
        this.f1303b0 = coordinatorLayout.getWidth();
        this.f1304c0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f1302a0 = height;
        int iMin = this.f1304c0;
        int i5 = iMin - height;
        int i6 = this.C;
        if (i5 < i6) {
            boolean z5 = this.f1333x;
            int i7 = this.f1326r;
            if (z5) {
                if (i7 != -1) {
                    iMin = Math.min(iMin, i7);
                }
                this.f1302a0 = iMin;
            } else {
                int iMin2 = iMin - i6;
                if (i7 != -1) {
                    iMin2 = Math.min(iMin2, i7);
                }
                this.f1302a0 = iMin2;
            }
        }
        this.J = Math.max(0, this.f1304c0 - this.f1302a0);
        this.K = (int) ((1.0f - this.L) * this.f1304c0);
        x();
        int i8 = this.U;
        if (i8 == 3) {
            int iD = D();
            WeakHashMap weakHashMap = p0.f3233a;
            view.offsetTopAndBottom(iD);
        } else if (i8 == 6) {
            int i9 = this.K;
            WeakHashMap weakHashMap2 = p0.f3233a;
            view.offsetTopAndBottom(i9);
        } else if (this.O && i8 == 5) {
            int i10 = this.f1304c0;
            WeakHashMap weakHashMap3 = p0.f3233a;
            view.offsetTopAndBottom(i10);
        } else if (i8 == 4) {
            int i11 = this.M;
            WeakHashMap weakHashMap4 = p0.f3233a;
            view.offsetTopAndBottom(i11);
        } else if (i8 == 1 || i8 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap5 = p0.f3233a;
            view.offsetTopAndBottom(top2);
        }
        O(this.U, false);
        ArrayList arrayList = this.f1305e0;
        arrayList.clear();
        if (this.f1312j) {
            H(view);
        } else {
            arrayList.add(new WeakReference(B(view)));
        }
        ArrayList arrayList2 = this.f1306f0;
        if (arrayList2.size() <= 0) {
            return true;
        }
        throw u.i(0, arrayList2);
    }

    @Override // z.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(C(i4, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, this.f1324q, marginLayoutParams.width), C(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1326r, marginLayoutParams.height));
        return true;
    }

    @Override // z.b
    public final boolean n(View view) {
        ArrayList arrayList = this.f1305e0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (((WeakReference) obj).get() != null) {
                if (!G(view) || this.U == 3 || this.S) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // z.b
    public final void o(int i4, int i5, int i6, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
        boolean zG;
        if (i6 != 1 && (zG = G(view2))) {
            int top = view.getTop();
            int i7 = top - i5;
            boolean z4 = this.Q;
            boolean z5 = this.R;
            if (i5 > 0) {
                if (!this.Y && !z5 && zG && view2.canScrollVertically(1)) {
                    this.S = true;
                    return;
                }
                if (i7 < D()) {
                    int iD = top - D();
                    iArr[1] = iD;
                    WeakHashMap weakHashMap = p0.f3233a;
                    view.offsetTopAndBottom(-iD);
                    K(3);
                } else {
                    if (!z4) {
                        return;
                    }
                    iArr[1] = i5;
                    WeakHashMap weakHashMap2 = p0.f3233a;
                    view.offsetTopAndBottom(-i5);
                    K(1);
                }
            } else if (i5 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.Y && !z5 && zG && zCanScrollVertically) {
                    this.S = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    int i8 = this.M;
                    if (i7 > i8 && !this.O) {
                        int i9 = top - i8;
                        iArr[1] = i9;
                        WeakHashMap weakHashMap3 = p0.f3233a;
                        view.offsetTopAndBottom(-i9);
                        K(4);
                    } else {
                        if (!z4) {
                            return;
                        }
                        iArr[1] = i5;
                        WeakHashMap weakHashMap4 = p0.f3233a;
                        view.offsetTopAndBottom(-i5);
                        K(1);
                    }
                }
            }
            A(view.getTop());
            this.X = i5;
            this.Y = true;
            this.S = false;
        }
    }

    @Override // z.b
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z4) {
        if (!this.T || view.isInTouchMode()) {
            return false;
        }
        int i4 = this.U;
        if (i4 != 4 && i4 != 6) {
            return false;
        }
        Rect rect2 = this.f1325q0;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = p0.f3233a;
            y1 y1VarA = i0.a(view);
            if (y1VarA != null) {
                rect2.bottom -= y1VarA.f3268a.h(519).f2070d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        J(3);
        return true;
    }

    @Override // z.b
    public final void r(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i4 = this.f;
        if (i4 != 0) {
            if (i4 == -1 || (i4 & 1) == 1) {
                this.f1313k = savedState.f1337i;
            }
            if (i4 == -1 || (i4 & 2) == 2) {
                this.f1307g = savedState.f1338j;
            }
            if (i4 == -1 || (i4 & 4) == 4) {
                this.O = savedState.f1339k;
            }
            if (i4 == -1 || (i4 & 8) == 8) {
                this.P = savedState.f1340l;
            }
        }
        int i5 = savedState.f1336h;
        if (i5 == 1 || i5 == 2) {
            this.U = 4;
        } else {
            this.U = i5;
        }
    }

    @Override // z.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // z.b
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5) {
        this.X = 0;
        this.Y = false;
        return (i4 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    @Override // z.b
    public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
        int top;
        int top2;
        int i5;
        float yVelocity;
        int i6 = 3;
        if (view.getTop() == D()) {
            K(3);
            return;
        }
        if (G(view2) && this.Y) {
            if (this.X > 0) {
                if (!this.f1307g && view.getTop() > this.K) {
                    i6 = 6;
                }
            } else if (this.O) {
                VelocityTracker velocityTracker = this.g0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f1308h);
                    yVelocity = this.g0.getYVelocity(this.f1311i0);
                }
                if (L(view, yVelocity)) {
                    i6 = 5;
                } else if (this.X == 0) {
                    top2 = view.getTop();
                    if (this.f1307g) {
                        i5 = this.K;
                        if (top2 < i5) {
                            if (top2 >= Math.abs(top2 - this.M)) {
                            }
                        } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.M)) {
                            i6 = 4;
                        }
                        i6 = 6;
                    } else if (Math.abs(top2 - this.J) >= Math.abs(top2 - this.M)) {
                        i6 = 4;
                    }
                } else {
                    if (!this.f1307g) {
                        top = view.getTop();
                        if (Math.abs(top - this.K) < Math.abs(top - this.M)) {
                            i6 = 6;
                        }
                    }
                    i6 = 4;
                }
            } else if (this.X == 0) {
                top2 = view.getTop();
                if (this.f1307g) {
                    i5 = this.K;
                    if (top2 < i5) {
                        if (top2 >= Math.abs(top2 - this.M)) {
                        }
                    } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.M)) {
                        i6 = 4;
                    }
                    i6 = 6;
                } else if (Math.abs(top2 - this.J) >= Math.abs(top2 - this.M)) {
                    i6 = 4;
                }
            } else {
                if (!this.f1307g) {
                    top = view.getTop();
                    if (Math.abs(top - this.K) < Math.abs(top - this.M)) {
                        i6 = 6;
                    }
                }
                i6 = 4;
            }
            M(view, i6, false);
            this.Y = false;
        }
    }

    @Override // z.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i4 = this.U;
        if (i4 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.V;
        if (eVar != null && (this.Q || i4 == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1311i0 = -1;
            this.j0 = -1;
            this.f1314k0 = null;
            VelocityTracker velocityTracker = this.g0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.g0 = null;
            }
        }
        if (this.g0 == null) {
            this.g0 = VelocityTracker.obtain();
        }
        this.g0.addMovement(motionEvent);
        if (this.V != null && ((this.Q || this.U == 1) && actionMasked == 2 && !this.W)) {
            float fAbs = Math.abs(this.j0 - motionEvent.getY());
            e eVar2 = this.V;
            if (fAbs > eVar2.f4429b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.W;
    }

    public final int w(View view, int i4, int i5) {
        int iA;
        String string = view.getResources().getString(i4);
        e.f fVar = new e.f(this, i5);
        ArrayList arrayListF = p0.f(view);
        int i6 = 0;
        while (true) {
            if (i6 >= arrayListF.size()) {
                int i7 = 0;
                int i8 = -1;
                while (true) {
                    int[] iArr = p0.f3236d;
                    if (i7 >= 32 || i8 != -1) {
                        break;
                    }
                    int i9 = iArr[i7];
                    boolean z4 = true;
                    for (int i10 = 0; i10 < arrayListF.size(); i10++) {
                        z4 &= ((c) arrayListF.get(i10)).a() != i9;
                    }
                    if (z4) {
                        i8 = i9;
                    }
                    i7++;
                }
                iA = i8;
                break;
            }
            if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((c) arrayListF.get(i6)).f3374a).getLabel())) {
                iA = ((c) arrayListF.get(i6)).a();
                break;
            }
            i6++;
        }
        if (iA != -1) {
            c cVar = new c(null, iA, string, fVar, null);
            View.AccessibilityDelegate accessibilityDelegateD = p0.d(view);
            p0.b bVar = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof p0.a ? ((p0.a) accessibilityDelegateD).f3160a : new p0.b(accessibilityDelegateD);
            if (bVar == null) {
                bVar = new p0.b();
            }
            p0.m(view, bVar);
            p0.j(view, cVar.a());
            p0.f(view).add(cVar);
            p0.h(view, 0);
        }
        return iA;
    }

    public final void x() {
        int iZ = z();
        boolean z4 = this.f1307g;
        int i4 = this.f1304c0;
        if (z4) {
            this.M = Math.max(i4 - iZ, this.J);
        } else {
            this.M = i4 - iZ;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    public final float y() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f4 = 0.0f;
        if (this.f1320o != null && (weakReference = this.d0) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.d0.get();
            if (F() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                j jVar = this.f1320o;
                float[] fArr = jVar.H;
                float fA = fArr != null ? fArr[3] : jVar.f88g.f70a.c().f127e.a(jVar.h());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fA <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fA;
                    }
                } else {
                    f = 0.0f;
                }
                j jVar2 = this.f1320o;
                float[] fArr2 = jVar2.H;
                float fA2 = fArr2 != null ? fArr2[0] : jVar2.f88g.f70a.c().f.a(jVar2.h());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA2 > 0.0f) {
                        f4 = radius2 / fA2;
                    }
                }
                return Math.max(f, f4);
            }
        }
        return 0.0f;
    }

    public final int z() {
        int i4;
        if (this.f1315l) {
            return Math.min(Math.max(this.f1317m, this.f1304c0 - ((this.f1303b0 * 9) / 16)), this.f1302a0) + this.B;
        }
        return (this.f1329t || this.f1330u || (i4 = this.f1328s) <= 0) ? this.f1313k + this.B : Math.max(this.f1313k, i4 + this.n);
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f1336h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f1337i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f1338j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f1339k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f1340l;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1336h = parcel.readInt();
            this.f1337i = parcel.readInt();
            this.f1338j = parcel.readInt() == 1;
            this.f1339k = parcel.readInt() == 1;
            this.f1340l = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f1336h);
            parcel.writeInt(this.f1337i);
            parcel.writeInt(this.f1338j ? 1 : 0);
            parcel.writeInt(this.f1339k ? 1 : 0);
            parcel.writeInt(this.f1340l ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f1336h = bottomSheetBehavior.U;
            this.f1337i = bottomSheetBehavior.f1313k;
            this.f1338j = bottomSheetBehavior.f1307g;
            this.f1339k = bottomSheetBehavior.O;
            this.f1340l = bottomSheetBehavior.P;
        }
    }

    @Override // z.b
    public final void p(int i4, int i5, int i6, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
    }

    public BottomSheetBehavior() {
        this.f = 0;
        this.f1307g = true;
        this.f1324q = -1;
        this.f1326r = -1;
        this.G = new g(this);
        this.L = 0.5f;
        this.N = -1.0f;
        this.Q = true;
        this.R = true;
        this.T = true;
        this.U = 4;
        this.Z = 0.1f;
        this.f1305e0 = new ArrayList();
        this.f1306f0 = new ArrayList();
        this.j0 = -1;
        this.f1319n0 = new SparseIntArray();
        this.f1321o0 = new SparseIntArray();
        this.f1323p0 = new SparseIntArray();
        this.f1325q0 = new Rect();
        this.f1327r0 = new b3.e(this, 1);
    }
}
