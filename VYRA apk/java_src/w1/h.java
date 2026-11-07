package w1;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import co.median.android.MySwipeRefreshLayout;
import java.util.WeakHashMap;
import k1.g0;
import p0.m;
import p0.n;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends ViewGroup implements m {
    public static final int[] P = {R.attr.enabled};
    public int A;
    public final int B;
    public final int C;
    public int D;
    public final n1.d E;
    public c F;
    public c G;
    public d H;
    public d I;
    public boolean J;
    public int K;
    public boolean L;
    public final b M;
    public final e N;
    public final e O;
    public View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f4457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f4460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g0 f4462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f4463m;
    public final int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f4464o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4465p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4466q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4467r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f4468s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f4469t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f4470u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4471v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final DecelerateInterpolator f4473x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f4474y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4475z;

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4458h = false;
        this.f4460j = -1.0f;
        this.n = new int[2];
        this.f4464o = new int[2];
        this.f4472w = -1;
        this.f4475z = -1;
        this.L = false;
        MySwipeRefreshLayout mySwipeRefreshLayout = (MySwipeRefreshLayout) this;
        int i4 = 0;
        this.M = new b(mySwipeRefreshLayout, i4);
        this.N = new e(mySwipeRefreshLayout, i4);
        this.O = new e(mySwipeRefreshLayout, 1);
        this.f4459i = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4466q = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f4473x = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.K = (int) (displayMetrics.density * 40.0f);
        a aVar = new a(getContext());
        float f = aVar.getContext().getResources().getDisplayMetrics().density;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        aVar.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        aVar.setBackground(shapeDrawable);
        this.f4474y = aVar;
        n1.d dVar = new n1.d(getContext());
        this.E = dVar;
        dVar.c(1);
        this.f4474y.setImageDrawable(this.E);
        this.f4474y.setVisibility(8);
        addView(this.f4474y);
        setChildrenDrawingOrderEnabled(true);
        int i5 = (int) (displayMetrics.density * 64.0f);
        this.C = i5;
        this.f4460j = i5;
        this.f4462l = new g0();
        this.f4463m = new n(this);
        setNestedScrollingEnabled(true);
        int i6 = -this.K;
        this.f4467r = i6;
        this.B = i6;
        e(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i4) {
        this.f4474y.getBackground().setAlpha(i4);
        this.E.setAlpha(i4);
    }

    public abstract boolean a();

    public final void b() {
        if (this.f == null) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (!childAt.equals(this.f4474y)) {
                    this.f = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f) {
        if (f > this.f4460j) {
            g(true, true);
            return;
        }
        this.f4458h = false;
        n1.d dVar = this.E;
        n1.c cVar = dVar.f;
        cVar.f3098e = 0.0f;
        cVar.f = 0.0f;
        dVar.invalidateSelf();
        b bVar = new b(this, 1);
        this.A = this.f4467r;
        e eVar = this.O;
        eVar.reset();
        eVar.setDuration(200L);
        eVar.setInterpolator(this.f4473x);
        a aVar = this.f4474y;
        aVar.f4450i = bVar;
        aVar.clearAnimation();
        this.f4474y.startAnimation(eVar);
        n1.d dVar2 = this.E;
        n1.c cVar2 = dVar2.f;
        if (cVar2.n) {
            cVar2.n = false;
        }
        dVar2.invalidateSelf();
    }

    public final void d(float f) {
        d dVar;
        d dVar2;
        n1.d dVar3 = this.E;
        n1.c cVar = dVar3.f;
        if (!cVar.n) {
            cVar.n = true;
        }
        dVar3.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.f4460j));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f4460j;
        int i4 = this.D;
        if (i4 <= 0) {
            i4 = this.C;
        }
        float f4 = i4;
        double dMax = Math.max(0.0f, Math.min(fAbs, f4 * 2.0f) / f4) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i5 = this.B + ((int) ((f4 * fMin) + (f4 * fPow * 2.0f)));
        if (this.f4474y.getVisibility() != 0) {
            this.f4474y.setVisibility(0);
        }
        this.f4474y.setScaleX(1.0f);
        this.f4474y.setScaleY(1.0f);
        float f5 = this.f4460j;
        n1.d dVar4 = this.E;
        if (f < f5) {
            if (dVar4.f.f3111t > 76 && ((dVar2 = this.H) == null || !dVar2.hasStarted() || dVar2.hasEnded())) {
                d dVar5 = new d(this, this.E.f.f3111t, 76);
                dVar5.setDuration(300L);
                a aVar = this.f4474y;
                aVar.f4450i = null;
                aVar.clearAnimation();
                this.f4474y.startAnimation(dVar5);
                this.H = dVar5;
            }
        } else if (dVar4.f.f3111t < 255 && ((dVar = this.I) == null || !dVar.hasStarted() || dVar.hasEnded())) {
            d dVar6 = new d(this, this.E.f.f3111t, 255);
            dVar6.setDuration(300L);
            a aVar2 = this.f4474y;
            aVar2.f4450i = null;
            aVar2.clearAnimation();
            this.f4474y.startAnimation(dVar6);
            this.I = dVar6;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        n1.d dVar7 = this.E;
        n1.c cVar2 = dVar7.f;
        cVar2.f3098e = 0.0f;
        cVar2.f = fMin2;
        dVar7.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        n1.d dVar8 = this.E;
        n1.c cVar3 = dVar8.f;
        if (fMin3 != cVar3.f3107p) {
            cVar3.f3107p = fMin3;
        }
        dVar8.invalidateSelf();
        n1.d dVar9 = this.E;
        dVar9.f.f3099g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        dVar9.invalidateSelf();
        setTargetOffsetTopAndBottom(i5 - this.f4467r);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f4, boolean z4) {
        return this.f4463m.a(f, f4, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f4) {
        return this.f4463m.b(f, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f4463m.c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f4463m.d(i4, i5, i6, i7, iArr, 0, null);
    }

    public final void e(float f) {
        int i4 = this.A;
        setTargetOffsetTopAndBottom((i4 + ((int) ((this.B - i4) * f))) - this.f4474y.getTop());
    }

    public final void f() {
        this.f4474y.clearAnimation();
        this.E.stop();
        this.f4474y.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.B - this.f4467r);
        this.f4467r = this.f4474y.getTop();
    }

    public final void g(boolean z4, boolean z5) {
        if (this.f4458h != z4) {
            this.J = z5;
            b();
            this.f4458h = z4;
            b bVar = this.M;
            if (!z4) {
                c cVar = new c(this, 1);
                this.G = cVar;
                cVar.setDuration(150L);
                a aVar = this.f4474y;
                aVar.f4450i = bVar;
                aVar.clearAnimation();
                this.f4474y.startAnimation(this.G);
                return;
            }
            this.A = this.f4467r;
            e eVar = this.N;
            eVar.reset();
            eVar.setDuration(200L);
            eVar.setInterpolator(this.f4473x);
            if (bVar != null) {
                this.f4474y.f4450i = bVar;
            }
            this.f4474y.clearAnimation();
            this.f4474y.startAnimation(eVar);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        int i6 = this.f4475z;
        if (i6 < 0) {
            return i5;
        }
        if (i5 == i4 - 1) {
            return i6;
        }
        return i5 >= i6 ? i5 + 1 : i5;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        g0 g0Var = this.f4462l;
        return g0Var.f2781b | g0Var.f2780a;
    }

    public int getProgressCircleDiameter() {
        return this.K;
    }

    public int getProgressViewEndOffset() {
        return this.C;
    }

    public int getProgressViewStartOffset() {
        return this.B;
    }

    public final void h(float f) {
        float f4 = this.f4469t;
        float f5 = f - f4;
        float f6 = this.f4459i;
        if (f5 <= f6 || this.f4471v) {
            return;
        }
        this.f4468s = f4 + f6;
        this.f4471v = true;
        this.E.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4463m.f(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4463m.f3223d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !this.f4458h && !this.f4465p && motionEvent.getPointerCount() <= 1) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.L = false;
                    this.f4471v = false;
                    this.f4472w = -1;
                } else if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.L = false;
                        this.f4471v = false;
                        this.f4472w = -1;
                    } else if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f4472w) {
                            this.f4472w = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        }
                    }
                } else if (!a() && !this.L) {
                    int i4 = this.f4472w;
                    if (i4 == -1) {
                        Log.w("h", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i4);
                    if (iFindPointerIndex >= 0) {
                        float x4 = motionEvent.getX() - this.f4470u;
                        float y4 = motionEvent.getY() - this.f4469t;
                        if (y4 < 0.0f) {
                            this.L = true;
                            return false;
                        }
                        if (Math.abs(y4) >= Math.abs(x4)) {
                            h(motionEvent.getY(iFindPointerIndex));
                        }
                    }
                }
                return this.f4471v;
            }
            if (!a()) {
                setTargetOffsetTopAndBottom(this.B - this.f4474y.getTop());
                int pointerId = motionEvent.getPointerId(0);
                this.f4472w = pointerId;
                this.f4471v = false;
                int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex2 >= 0) {
                    this.f4469t = motionEvent.getY(iFindPointerIndex2);
                    this.f4470u = motionEvent.getX(iFindPointerIndex2);
                    return this.f4471v;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f == null) {
            b();
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f4474y.getMeasuredWidth();
        int measuredHeight2 = this.f4474y.getMeasuredHeight();
        int i8 = measuredWidth / 2;
        int i9 = measuredWidth2 / 2;
        int i10 = this.f4467r;
        this.f4474y.layout(i8 - i9, i10, i8 + i9, measuredHeight2 + i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f == null) {
            b();
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f4474y.measure(View.MeasureSpec.makeMeasureSpec(this.K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.K, 1073741824));
        this.f4475z = -1;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6) == this.f4474y) {
                this.f4475z = i6;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f4, boolean z4) {
        return this.f4463m.a(f, f4, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f4) {
        return this.f4463m.b(f, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        if (i5 > 0) {
            float f = this.f4461k;
            if (f > 0.0f) {
                float f4 = i5;
                if (f4 > f) {
                    iArr[1] = i5 - ((int) f);
                    this.f4461k = 0.0f;
                } else {
                    this.f4461k = f - f4;
                    iArr[1] = i5;
                }
                d(this.f4461k);
            }
        }
        int i6 = i4 - iArr[0];
        int i7 = i5 - iArr[1];
        int[] iArr2 = this.n;
        if (dispatchNestedPreScroll(i6, i7, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        dispatchNestedScroll(i4, i5, i6, i7, this.f4464o);
        int i8 = i7 + this.f4464o[1];
        if (i8 >= 0 || a()) {
            return;
        }
        float fAbs = this.f4461k + Math.abs(i8);
        this.f4461k = fAbs;
        d(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f4462l.f2780a = i4;
        startNestedScroll(i4 & 2);
        this.f4461k = 0.0f;
        this.f4465p = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return (!isEnabled() || this.f4458h || (i4 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f4462l.f2780a = 0;
        this.f4465p = false;
        float f = this.f4461k;
        if (f > 0.0f) {
            c(f);
            this.f4461k = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f4458h && !this.f4465p) {
            if (actionMasked == 0) {
                this.f4472w = motionEvent.getPointerId(0);
                this.f4471v = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4472w);
                if (iFindPointerIndex < 0) {
                    Log.w("h", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f4471v) {
                    float y4 = (motionEvent.getY(iFindPointerIndex) - this.f4468s) * 0.5f;
                    this.f4471v = false;
                    c(y4);
                }
                this.f4472w = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f4472w);
                if (iFindPointerIndex2 < 0) {
                    Log.w("h", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                if (Math.abs(motionEvent.getY() - this.f4469t) >= Math.abs(motionEvent.getX() - this.f4470u)) {
                    float y5 = motionEvent.getY(iFindPointerIndex2);
                    h(y5);
                    if (this.f4471v) {
                        float f = (y5 - this.f4468s) * 0.5f;
                        if (f > 0.0f) {
                            d(f);
                        }
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f4472w) {
                            this.f4472w = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.w("h", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f4472w = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        View view = this.f;
        if (view != null) {
            WeakHashMap weakHashMap = p0.f3233a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    public void setAnimationProgress(float f) {
        this.f4474y.setScaleX(f);
        this.f4474y.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        n1.d dVar = this.E;
        n1.c cVar = dVar.f;
        cVar.f3101i = iArr;
        cVar.a(0);
        cVar.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr2[i4] = c0.c.getColor(context, iArr[i4]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i4) {
        this.f4460j = i4;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (z4) {
            return;
        }
        f();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        this.f4463m.g(z4);
    }

    public void setOnRefreshListener(g gVar) {
        this.f4457g = gVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i4) {
        setProgressBackgroundColorSchemeResource(i4);
    }

    public void setProgressBackgroundColorSchemeColor(int i4) {
        this.f4474y.setBackgroundColor(i4);
    }

    public void setProgressBackgroundColorSchemeResource(int i4) {
        setProgressBackgroundColorSchemeColor(c0.c.getColor(getContext(), i4));
    }

    public void setRefreshing(boolean z4) {
        if (!z4 || this.f4458h == z4) {
            g(z4, false);
            return;
        }
        this.f4458h = z4;
        setTargetOffsetTopAndBottom((this.C + this.B) - this.f4467r);
        this.J = false;
        this.f4474y.setVisibility(0);
        this.E.setAlpha(255);
        c cVar = new c(this, 0);
        this.F = cVar;
        cVar.setDuration(this.f4466q);
        b bVar = this.M;
        if (bVar != null) {
            this.f4474y.f4450i = bVar;
        }
        this.f4474y.clearAnimation();
        this.f4474y.startAnimation(this.F);
    }

    public void setSize(int i4) {
        if (i4 == 0 || i4 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i4 == 0) {
                this.K = (int) (displayMetrics.density * 56.0f);
            } else {
                this.K = (int) (displayMetrics.density * 40.0f);
            }
            this.f4474y.setImageDrawable(null);
            this.E.c(i4);
            this.f4474y.setImageDrawable(this.E);
        }
    }

    public void setSlingshotDistance(int i4) {
        this.D = i4;
    }

    public void setTargetOffsetTopAndBottom(int i4) {
        a aVar = this.f4474y;
        aVar.bringToFront();
        WeakHashMap weakHashMap = p0.f3233a;
        aVar.offsetTopAndBottom(i4);
        this.f4467r = aVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return this.f4463m.h(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f4463m.i(0);
    }

    public void setOnChildScrollUpCallback(f fVar) {
    }
}
