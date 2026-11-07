package y0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.k;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
import androidx.fragment.app.q;
import com.google.android.material.datepicker.i;
import d3.a0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p0.h0;
import p0.i0;
import p0.p0;
import p0.y1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends ViewGroup {
    public static final int[] J = {R.attr.colorPrimaryDark};
    public static final int[] K = {R.attr.layout_gravity};
    public static final boolean L;
    public float A;
    public float B;
    public Drawable C;
    public y1 D;
    public boolean E;
    public final ArrayList F;
    public Rect G;
    public Matrix H;
    public final a0 I;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f4777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w0.e f4778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w0.e f4779l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f4780m;
    public final e n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public OnBackInvokedCallback f4784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public OnBackInvokedDispatcher f4785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4786t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4788v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4789w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4790x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f4791y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f4792z;

    static {
        L = Build.VERSION.SDK_INT >= 29;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new com.google.android.material.datepicker.e(5);
        this.f4775h = -1728053248;
        this.f4777j = new Paint();
        this.f4783q = true;
        this.f4786t = 3;
        this.f4787u = 3;
        this.f4788v = 3;
        this.f4789w = 3;
        this.I = new a0(10, this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f4774g = (int) ((64.0f * f) + 0.5f);
        float f4 = f * 400.0f;
        e eVar = new e(this, 3);
        this.f4780m = eVar;
        e eVar2 = new e(this, 5);
        this.n = eVar2;
        w0.e eVar3 = new w0.e(getContext(), this, eVar);
        eVar3.f4429b = (int) (eVar3.f4429b * 1.0f);
        this.f4778k = eVar3;
        eVar3.f4442q = 1;
        eVar3.n = f4;
        eVar.f4771b = eVar3;
        w0.e eVar4 = new w0.e(getContext(), this, eVar2);
        eVar4.f4429b = (int) (1.0f * eVar4.f4429b);
        this.f4779l = eVar4;
        eVar4.f4442q = 2;
        eVar4.n = f4;
        eVar2.f4771b = eVar4;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = p0.f3233a;
        setImportantForAccessibility(1);
        p0.m(this, new i(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            h0.c(this, new q(26));
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(J);
            try {
                this.C = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, x0.a.f4645a, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f = getResources().getDimension(co.median.android.eeqadjy.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.F = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static String j(int i4) {
        if ((i4 & 3) == 3) {
            return "LEFT";
        }
        return (i4 & 5) == 5 ? "RIGHT" : Integer.toHexString(i4);
    }

    public static boolean k(View view) {
        return ((c) view.getLayoutParams()).f4766a == 0;
    }

    public static boolean l(View view) {
        if (m(view)) {
            return (((c) view.getLayoutParams()).f4769d & 1) == 1;
        }
        q.h(view, " is not a drawer", "View ");
        return false;
    }

    public static boolean m(View view) {
        int i4 = ((c) view.getLayoutParams()).f4766a;
        WeakHashMap weakHashMap = p0.f3233a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean n(View view) {
        if (m(view)) {
            return ((c) view.getLayoutParams()).f4767b > 0.0f;
        }
        q.h(view, " is not a drawer", "View ");
        return false;
    }

    public final void a(b bVar) {
        if (this.f4792z == null) {
            this.f4792z = new ArrayList();
        }
        this.f4792z.add(bVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i5) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i6 = 0;
        boolean z4 = false;
        while (true) {
            arrayList2 = this.F;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (!m(childAt)) {
                arrayList2.add(childAt);
            } else if (l(childAt)) {
                childAt.addFocusables(arrayList, i4, i5);
                z4 = true;
            }
            i6++;
        }
        if (!z4) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) arrayList2.get(i7);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i4, i5);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i4, layoutParams);
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i5);
            if ((((c) childAt.getLayoutParams()).f4769d & 1) == 1) {
                break;
            } else {
                i5++;
            }
        }
        if (childAt != null || m(view)) {
            WeakHashMap weakHashMap = p0.f3233a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = p0.f3233a;
            view.setImportantForAccessibility(1);
        }
    }

    public final boolean b(View view, int i4) {
        return (i(view) & i4) == i4;
    }

    public final void c(View view, boolean z4) {
        if (!m(view)) {
            q.h(view, " is not a sliding drawer", "View ");
            return;
        }
        c cVar = (c) view.getLayoutParams();
        if (this.f4783q) {
            cVar.f4767b = 0.0f;
            cVar.f4769d = 0;
        } else if (z4) {
            cVar.f4769d |= 4;
            if (b(view, 3)) {
                this.f4778k.r(view, -view.getWidth(), view.getTop());
            } else {
                this.f4779l.r(view, getWidth(), view.getTop());
            }
        } else {
            float f = ((c) view.getLayoutParams()).f4767b;
            float width = view.getWidth();
            int i4 = ((int) (width * 0.0f)) - ((int) (f * width));
            if (!b(view, 3)) {
                i4 = -i4;
            }
            view.offsetLeftAndRight(i4);
            r(view, 0.0f);
            v(view, 0);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            fMax = Math.max(fMax, ((c) getChildAt(i4).getLayoutParams()).f4767b);
        }
        this.f4776i = fMax;
        boolean zG = this.f4778k.g();
        boolean zG2 = this.f4779l.g();
        if (zG || zG2) {
            WeakHashMap weakHashMap = p0.f3233a;
            postInvalidateOnAnimation();
        }
    }

    public final void d(boolean z4) {
        int childCount = getChildCount();
        boolean zR = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            c cVar = (c) childAt.getLayoutParams();
            if (m(childAt) && (!z4 || cVar.f4768c)) {
                zR |= b(childAt, 3) ? this.f4778k.r(childAt, -childAt.getWidth(), childAt.getTop()) : this.f4779l.r(childAt, getWidth(), childAt.getTop());
                cVar.f4768c = false;
            }
        }
        e eVar = this.f4780m;
        eVar.f4773d.removeCallbacks(eVar.f4772c);
        e eVar2 = this.n;
        eVar2.f4773d.removeCallbacks(eVar2.f4772c);
        if (zR) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f4776i <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt = getChildAt(i4);
            if (this.G == null) {
                this.G = new Rect();
            }
            childAt.getHitRect(this.G);
            if (this.G.contains((int) x4, (int) y4) && !k(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.H == null) {
                            this.H = new Matrix();
                        }
                        matrix.invert(this.H);
                        motionEventObtain.transform(this.H);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        Drawable background;
        int height = getHeight();
        boolean zK = k(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i4 = 0;
        if (zK) {
            int childCount = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m(childAt) && childAt.getHeight() >= height) {
                    if (b(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i5) {
                            i5 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i5, 0, width, getHeight());
            i4 = i5;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j4);
        canvas.restoreToCount(iSave);
        float f = this.f4776i;
        if (f > 0.0f && zK) {
            int i7 = this.f4775h;
            Paint paint = this.f4777j;
            paint.setColor((((int) ((((-16777216) & i7) >>> 24) * f)) << 24) | (i7 & 16777215));
            canvas.drawRect(i4, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e(int i4) {
        WeakHashMap weakHashMap = p0.f3233a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (m(childAt) && n(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final int g(int i4) {
        WeakHashMap weakHashMap = p0.f3233a;
        int layoutDirection = getLayoutDirection();
        if (i4 == 3) {
            int i5 = this.f4786t;
            if (i5 != 3) {
                return i5;
            }
            int i6 = layoutDirection == 0 ? this.f4788v : this.f4789w;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i4 == 5) {
            int i7 = this.f4787u;
            if (i7 != 3) {
                return i7;
            }
            int i8 = layoutDirection == 0 ? this.f4789w : this.f4788v;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i4 == 8388611) {
            int i9 = this.f4788v;
            if (i9 != 3) {
                return i9;
            }
            int i10 = layoutDirection == 0 ? this.f4786t : this.f4787u;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
        if (i4 != 8388613) {
            return 0;
        }
        int i11 = this.f4789w;
        if (i11 != 3) {
            return i11;
        }
        int i12 = layoutDirection == 0 ? this.f4787u : this.f4786t;
        if (i12 != 3) {
            return i12;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -1);
        cVar.f4766a = 0;
        return cVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof c) {
            c cVar = (c) layoutParams;
            c cVar2 = new c(cVar);
            cVar2.f4766a = 0;
            cVar2.f4766a = cVar.f4766a;
            return cVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar3 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar3.f4766a = 0;
            return cVar3;
        }
        c cVar4 = new c(layoutParams);
        cVar4.f4766a = 0;
        return cVar4;
    }

    public float getDrawerElevation() {
        return this.f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.C;
    }

    public final int h(View view) {
        if (m(view)) {
            return g(((c) view.getLayoutParams()).f4766a);
        }
        q.h(view, " is not a drawer", "View ");
        return 0;
    }

    public final int i(View view) {
        int i4 = ((c) view.getLayoutParams()).f4766a;
        WeakHashMap weakHashMap = p0.f3233a;
        return Gravity.getAbsoluteGravity(i4, getLayoutDirection());
    }

    public final void o(View view) {
        if (!m(view)) {
            q.h(view, " is not a sliding drawer", "View ");
            return;
        }
        c cVar = (c) view.getLayoutParams();
        if (this.f4783q) {
            cVar.f4767b = 1.0f;
            cVar.f4769d = 1;
            u(view, true);
            t(view);
            s();
        } else {
            cVar.f4769d |= 2;
            if (b(view, 3)) {
                this.f4778k.r(view, 0, view.getTop());
            } else {
                this.f4779l.r(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4783q = true;
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4783q = true;
        s();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.E || this.C == null) {
            return;
        }
        y1 y1Var = this.D;
        int iD = y1Var != null ? y1Var.d() : 0;
        if (iD > 0) {
            this.C.setBounds(0, 0, getWidth(), iD);
            this.C.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        View viewH;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int actionMasked = motionEvent.getActionMasked();
        w0.e eVar = this.f4778k;
        boolean zQ = eVar.q(motionEvent) | this.f4779l.q(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                d(true);
                this.f4790x = false;
            } else if (actionMasked == 2) {
                float[] fArr4 = eVar.f4431d;
                if (fArr4 != null) {
                    int length = fArr4.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        if ((eVar.f4437k & (1 << i4)) != 0) {
                            float[] fArr5 = eVar.f4431d;
                            if (fArr5 != null && (fArr = eVar.f4432e) != null && (fArr2 = eVar.f) != null && (fArr3 = eVar.f4433g) != null) {
                                float f = fArr2[i4] - fArr5[i4];
                                float f4 = fArr3[i4] - fArr[i4];
                                float f5 = (f4 * f4) + (f * f);
                                int i5 = eVar.f4429b;
                                if (f5 > i5 * i5) {
                                    e eVar2 = this.f4780m;
                                    eVar2.f4773d.removeCallbacks(eVar2.f4772c);
                                    e eVar3 = this.n;
                                    eVar3.f4773d.removeCallbacks(eVar3.f4772c);
                                    break;
                                }
                            } else {
                                Log.w("ViewDragHelper", "Inconsistent pointer event stream: pointer is down, but there is no initial motion recorded. Is something intercepting or modifying events?");
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                d(true);
                this.f4790x = false;
            }
            z4 = false;
        } else {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            this.A = x4;
            this.B = y4;
            z4 = this.f4776i > 0.0f && (viewH = eVar.h((int) x4, (int) y4)) != null && k(viewH);
            this.f4790x = false;
        }
        if (!zQ && !z4) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                if (!((c) getChildAt(i6).getLayoutParams()).f4768c) {
                }
            }
            if (!this.f4790x) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 != 4 || f() == null) {
            return super.onKeyDown(i4, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (i4 != 4) {
            return super.onKeyUp(i4, keyEvent);
        }
        View viewF = f();
        if (viewF != null && h(viewF) == 0) {
            d(false);
        }
        return viewF != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        float f;
        int i8;
        boolean z5 = true;
        this.f4782p = true;
        int i9 = i6 - i4;
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (k(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) cVar).topMargin, childAt.getMeasuredWidth() + i11, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(childAt, 3)) {
                        float f4 = measuredWidth;
                        i8 = (-measuredWidth) + ((int) (cVar.f4767b * f4));
                        f = (measuredWidth + i8) / f4;
                    } else {
                        float f5 = measuredWidth;
                        int i12 = i9 - ((int) (cVar.f4767b * f5));
                        f = (i9 - i12) / f5;
                        i8 = i12;
                    }
                    boolean z6 = f != cVar.f4767b ? z5 : false;
                    int i13 = cVar.f4766a & 112;
                    if (i13 == 16) {
                        int i14 = i7 - i5;
                        int i15 = (i14 - measuredHeight) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight;
                            int i18 = i14 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
                            if (i17 > i18) {
                                i15 = i18 - measuredHeight;
                            }
                        }
                        childAt.layout(i8, i15, measuredWidth + i8, measuredHeight + i15);
                    } else if (i13 != 80) {
                        int i19 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                        childAt.layout(i8, i19, measuredWidth + i8, measuredHeight + i19);
                    } else {
                        int i20 = i7 - i5;
                        childAt.layout(i8, (i20 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i8, i20 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                    }
                    if (z6) {
                        r(childAt, f);
                    }
                    int i21 = cVar.f4767b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i21) {
                        childAt.setVisibility(i21);
                    }
                }
            }
            i10++;
            z5 = true;
        }
        if (L) {
            WeakHashMap weakHashMap = p0.f3233a;
            y1 y1VarA = i0.a(this);
            if (y1VarA != null) {
                f0.c cVarL = y1VarA.f3268a.l();
                w0.e eVar = this.f4778k;
                eVar.f4440o = Math.max(eVar.f4441p, cVarL.f2067a);
                w0.e eVar2 = this.f4779l;
                eVar2.f4440o = Math.max(eVar2.f4441p, cVarL.f2069c);
            }
        }
        this.f4782p = false;
        this.f4783q = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        boolean z4;
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                q.q("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
                return;
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.D != null) {
            WeakHashMap weakHashMap = p0.f3233a;
            if (getFitsSystemWindows()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        WeakHashMap weakHashMap2 = p0.f3233a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z5 = false;
        boolean z6 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (z4) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(cVar.f4766a, layoutDirection);
                    boolean fitsSystemWindows = childAt.getFitsSystemWindows();
                    y1 y1VarF = this.D;
                    if (fitsSystemWindows) {
                        if (absoluteGravity == 3) {
                            y1VarF = y1VarF.f(y1VarF.b(), y1VarF.d(), 0, y1VarF.a());
                        } else if (absoluteGravity == 5) {
                            y1VarF = y1VarF.f(0, y1VarF.d(), y1VarF.c(), y1VarF.a());
                        }
                        p0.b(childAt, y1VarF);
                    } else {
                        if (absoluteGravity == 3) {
                            y1VarF = y1VarF.f(y1VarF.b(), y1VarF.d(), 0, y1VarF.a());
                        } else if (absoluteGravity == 5) {
                            y1VarF = y1VarF.f(0, y1VarF.d(), y1VarF.c(), y1VarF.a());
                        }
                        ((ViewGroup.MarginLayoutParams) cVar).leftMargin = y1VarF.b();
                        ((ViewGroup.MarginLayoutParams) cVar).topMargin = y1VarF.d();
                        ((ViewGroup.MarginLayoutParams) cVar).rightMargin = y1VarF.c();
                        ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = y1VarF.a();
                    }
                }
                if (k(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) cVar).leftMargin) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) cVar).topMargin) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, 1073741824));
                } else {
                    if (!m(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i6 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    float elevation = childAt.getElevation();
                    float f = this.f;
                    if (elevation != f) {
                        childAt.setElevation(f);
                    }
                    int i7 = i(childAt) & 7;
                    boolean z7 = i7 == 3;
                    if ((z7 && z5) || (!z7 && z6)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + j(i7) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z7) {
                        z5 = true;
                    } else {
                        z6 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i4, this.f4774g + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin, ((ViewGroup.MarginLayoutParams) cVar).width), ViewGroup.getChildMeasureSpec(i5, ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, ((ViewGroup.MarginLayoutParams) cVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewE;
        if (!(parcelable instanceof DrawerLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DrawerLayout$SavedState drawerLayout$SavedState = (DrawerLayout$SavedState) parcelable;
        super.onRestoreInstanceState(drawerLayout$SavedState.f);
        int i4 = drawerLayout$SavedState.f527h;
        if (i4 != 0 && (viewE = e(i4)) != null) {
            o(viewE);
        }
        int i5 = drawerLayout$SavedState.f528i;
        if (i5 != 3) {
            q(i5, 3);
        }
        int i6 = drawerLayout$SavedState.f529j;
        if (i6 != 3) {
            q(i6, 5);
        }
        int i7 = drawerLayout$SavedState.f530k;
        if (i7 != 3) {
            q(i7, 8388611);
        }
        int i8 = drawerLayout$SavedState.f531l;
        if (i8 != 3) {
            q(i8, 8388613);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        DrawerLayout$SavedState drawerLayout$SavedState = new DrawerLayout$SavedState(super.onSaveInstanceState());
        drawerLayout$SavedState.f527h = 0;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            c cVar = (c) getChildAt(i4).getLayoutParams();
            int i5 = cVar.f4769d;
            boolean z4 = i5 == 1;
            boolean z5 = i5 == 2;
            if (z4 || z5) {
                drawerLayout$SavedState.f527h = cVar.f4766a;
                break;
            }
        }
        drawerLayout$SavedState.f528i = this.f4786t;
        drawerLayout$SavedState.f529j = this.f4787u;
        drawerLayout$SavedState.f530k = this.f4788v;
        drawerLayout$SavedState.f531l = this.f4789w;
        return drawerLayout$SavedState;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        View childAt;
        w0.e eVar = this.f4778k;
        eVar.j(motionEvent);
        this.f4779l.j(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            this.A = x4;
            this.B = y4;
            this.f4790x = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            d(true);
            this.f4790x = false;
            return true;
        }
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        View viewH = eVar.h((int) x5, (int) y5);
        if (viewH != null && k(viewH)) {
            float f = x5 - this.A;
            float f4 = y5 - this.B;
            int i4 = eVar.f4429b;
            if ((f4 * f4) + (f * f) < i4 * i4) {
                int childCount = getChildCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i5);
                    if ((((c) childAt.getLayoutParams()).f4769d & 1) == 1) {
                        break;
                    }
                    i5++;
                }
                z4 = childAt == null || h(childAt) == 2;
            }
        }
        d(z4);
        return true;
    }

    public final void p(b bVar) {
        ArrayList arrayList = this.f4792z;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(bVar);
    }

    public final void q(int i4, int i5) {
        View viewE;
        WeakHashMap weakHashMap = p0.f3233a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, getLayoutDirection());
        if (i5 == 3) {
            this.f4786t = i4;
        } else if (i5 == 5) {
            this.f4787u = i4;
        } else if (i5 == 8388611) {
            this.f4788v = i4;
        } else if (i5 == 8388613) {
            this.f4789w = i4;
        }
        if (i4 != 0) {
            (absoluteGravity == 3 ? this.f4778k : this.f4779l).a();
        }
        if (i4 != 1) {
            if (i4 == 2 && (viewE = e(absoluteGravity)) != null) {
                o(viewE);
                return;
            }
            return;
        }
        View viewE2 = e(absoluteGravity);
        if (viewE2 != null) {
            c(viewE2, true);
        }
    }

    public final void r(View view, float f) {
        c cVar = (c) view.getLayoutParams();
        if (f == cVar.f4767b) {
            return;
        }
        cVar.f4767b = f;
        ArrayList arrayList = this.f4792z;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) this.f4792z.get(size)).a(view, f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (z4) {
            d(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4782p) {
            return;
        }
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public final void s() {
        boolean z4;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            View viewF = f();
            OnBackInvokedDispatcher onBackInvokedDispatcherA = a.a(this);
            if (viewF == null || onBackInvokedDispatcherA == null || h(viewF) != 0) {
                z4 = false;
            } else {
                WeakHashMap weakHashMap = p0.f3233a;
                if (isAttachedToWindow()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z4 && this.f4785s == null) {
                if (this.f4784r == null) {
                    this.f4784r = a.b(new k(19, this));
                }
                a.c(onBackInvokedDispatcherA, this.f4784r);
                this.f4785s = onBackInvokedDispatcherA;
                return;
            }
            if (z4 || (onBackInvokedDispatcher = this.f4785s) == null) {
                return;
            }
            a.d(onBackInvokedDispatcher, this.f4784r);
            this.f4785s = null;
        }
    }

    public void setDrawerElevation(float f) {
        this.f = f;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (m(childAt)) {
                float f4 = this.f;
                WeakHashMap weakHashMap = p0.f3233a;
                childAt.setElevation(f4);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(b bVar) {
        b bVar2 = this.f4791y;
        if (bVar2 != null) {
            p(bVar2);
        }
        if (bVar != null) {
            a(bVar);
        }
        this.f4791y = bVar;
    }

    public void setDrawerLockMode(int i4) {
        q(i4, 3);
        q(i4, 5);
    }

    public void setScrimColor(int i4) {
        this.f4775h = i4;
        invalidate();
    }

    public void setStatusBarBackground(int i4) {
        this.C = i4 != 0 ? c0.c.getDrawable(getContext(), i4) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i4) {
        this.C = new ColorDrawable(i4);
        invalidate();
    }

    public final void t(View view) {
        q0.c cVar = q0.c.f3371k;
        p0.j(view, cVar.a());
        p0.h(view, 0);
        if (!l(view) || h(view) == 2) {
            return;
        }
        p0.k(view, cVar, this.I);
    }

    public final void u(View view, boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((z4 || m(childAt)) && !(z4 && childAt == view)) {
                WeakHashMap weakHashMap = p0.f3233a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = p0.f3233a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final void v(View view, int i4) {
        int i5;
        View rootView;
        int i6 = this.f4778k.f4428a;
        int i7 = this.f4779l.f4428a;
        if (i6 == 1 || i7 == 1) {
            i5 = 1;
        } else {
            i5 = 2;
            if (i6 != 2 && i7 != 2) {
                i5 = 0;
            }
        }
        if (view != null && i4 == 0) {
            float f = ((c) view.getLayoutParams()).f4767b;
            if (f == 0.0f) {
                c cVar = (c) view.getLayoutParams();
                if ((cVar.f4769d & 1) == 1) {
                    cVar.f4769d = 0;
                    ArrayList arrayList = this.f4792z;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((b) this.f4792z.get(size)).c(view);
                        }
                    }
                    u(view, false);
                    t(view);
                    s();
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                c cVar2 = (c) view.getLayoutParams();
                if ((cVar2.f4769d & 1) == 0) {
                    cVar2.f4769d = 1;
                    ArrayList arrayList2 = this.f4792z;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((b) this.f4792z.get(size2)).b(view);
                        }
                    }
                    u(view, true);
                    t(view);
                    s();
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i5 != this.f4781o) {
            this.f4781o = i5;
            ArrayList arrayList3 = this.f4792z;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((b) this.f4792z.get(size3)).getClass();
                }
            }
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.C = drawable;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.f4766a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K);
        cVar.f4766a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
    }
}
