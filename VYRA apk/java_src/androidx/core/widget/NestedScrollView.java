package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.fragment.app.q;
import com.google.android.gms.common.api.Api;
import com.google.android.material.datepicker.e;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import k1.g0;
import p0.a0;
import p0.b0;
import p0.g;
import p0.m;
import p0.n;
import p0.p;
import p0.p0;
import p0.w;
import r0.b;
import t0.d;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements p, m {
    public static final float H = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final e I = new e(4);
    public static final int[] J = {R.attr.fillViewport};
    public int A;
    public int B;
    public SavedState C;
    public final g0 D;
    public final n E;
    public float F;
    public final g G;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OverScroller f509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EdgeEffect f510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final EdgeEffect f511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w f512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f513m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f514o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f515p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public VelocityTracker f517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f519t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f520u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f521v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f522w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f523x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f524y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int[] f525z;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int f;

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, co.median.android.eeqadjy.R.attr.nestedScrollViewStyle);
        this.f508h = new Rect();
        this.n = true;
        this.f514o = false;
        this.f515p = null;
        this.f516q = false;
        this.f519t = true;
        this.f523x = -1;
        this.f524y = new int[2];
        this.f525z = new int[2];
        this.G = new g(getContext(), new b(this));
        int i4 = Build.VERSION.SDK_INT;
        this.f510j = i4 >= 31 ? t0.b.a(context, attributeSet) : new EdgeEffect(context);
        this.f511k = i4 >= 31 ? t0.b.a(context, attributeSet) : new EdgeEffect(context);
        this.f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f509i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f520u = viewConfiguration.getScaledTouchSlop();
        this.f521v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f522w = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J, co.median.android.eeqadjy.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.D = new g0();
        this.E = new n(this);
        setNestedScrollingEnabled(true);
        p0.m(this, I);
    }

    private w getScrollFeedbackProvider() {
        if (this.f512l == null) {
            this.f512l = new w(this);
        }
        return this.f512l;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // p0.o
    public final void a(View view, View view2, int i4, int i5) {
        g0 g0Var = this.D;
        if (i5 == 1) {
            g0Var.f2781b = i4;
        } else {
            g0Var.f2780a = i4;
        }
        this.E.h(2, i5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            q.j("ScrollView can host only one direct child");
        }
    }

    @Override // p0.o
    public final void b(View view, int i4) {
        g0 g0Var = this.D;
        if (i4 == 1) {
            g0Var.f2781b = 0;
        } else {
            g0Var.f2780a = 0;
        }
        w(i4);
    }

    @Override // p0.o
    public final void c(View view, int i4, int i5, int[] iArr, int i6) {
        this.E.c(i4, i5, i6, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i4;
        int scrollRange;
        int overScrollMode;
        if (this.f509i.isFinished()) {
            return;
        }
        this.f509i.computeScrollOffset();
        int currY = this.f509i.getCurrY();
        int i5 = currY - this.B;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f510j;
        EdgeEffect edgeEffect2 = this.f511k;
        if (i5 <= 0 || e4.a.y(edgeEffect) == 0.0f) {
            if (i5 < 0 && e4.a.y(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(e4.a.V(edgeEffect2, (i5 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i5) {
                    edgeEffect2.finish();
                }
            }
            int i6 = i5;
            this.B = currY;
            iArr = this.f525z;
            iArr[1] = 0;
            this.E.c(0, i6, 1, iArr, null);
            i4 = i6 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                d.a(this, Math.abs(this.f509i.getCurrVelocity()));
            }
            if (i4 != 0) {
                int scrollY = getScrollY();
                p(i4, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i7 = i4 - scrollY2;
                iArr[1] = 0;
                this.E.d(0, scrollY2, 0, i7, this.f524y, 1, iArr);
                i4 = i7 - iArr[1];
            }
            if (i4 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i4 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f509i.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f509i.getCurrVelocity());
                    }
                }
                this.f509i.abortAnimation();
                w(1);
            }
            if (this.f509i.isFinished()) {
                w(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(e4.a.V(edgeEffect, ((-i5) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i5) {
            edgeEffect.finish();
        }
        i5 -= iRound;
        int i8 = i5;
        this.B = currY;
        iArr = this.f525z;
        iArr[1] = 0;
        this.E.c(0, i8, 1, iArr, null);
        i4 = i8 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            d.a(this, Math.abs(this.f509i.getCurrVelocity()));
        }
        if (i4 != 0) {
            int scrollY3 = getScrollY();
            p(i4, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i9 = i4 - scrollY4;
            iArr[1] = 0;
            this.E.d(0, scrollY4, 0, i9, this.f524y, 1, iArr);
            i4 = i9 - iArr[1];
        }
        if (i4 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i4 < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f509i.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f509i.getCurrVelocity());
                }
            } else if (i4 < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f509i.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.f509i.getCurrVelocity());
            }
            this.f509i.abortAnimation();
            w(1);
        }
        if (this.f509i.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            w(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // p0.p
    public final void d(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        n(i7, i8, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f4, boolean z4) {
        return this.E.a(f, f4, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f4) {
        return this.E.b(f, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.E.c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.E.d(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f510j;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f511k;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p0.o
    public final void e(View view, int i4, int i5, int i6, int i7, int i8) {
        n(i7, i8, null);
    }

    @Override // p0.o
    public final boolean f(View view, View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    public final boolean g(int i4) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f508h;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(h(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i4);
        }
        if (view != null && view.isFocused() && !m(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        g0 g0Var = this.D;
        return g0Var.f2781b | g0Var.f2780a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.F == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                q.j("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.F = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.F;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.E.f(0);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean i(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f508h.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? k(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? k(130) : g(130);
                    }
                    if (keyCode == 62) {
                        q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return k(33);
                    }
                    if (keyCode == 93) {
                        return k(130);
                    }
                    if (keyCode == 122) {
                        q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        q(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.E.f3223d;
    }

    public final void j(int i4) {
        if (getChildCount() > 0) {
            this.f509i.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            this.E.h(2, 1);
            this.B = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                d.a(this, Math.abs(this.f509i.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i4) {
        int childCount;
        boolean z4 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f508h;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i4, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i4, int i5) {
        Rect rect = this.f508h;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i4 >= getScrollY() && rect.top - i4 <= getScrollY() + i5;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i4, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.E.d(0, scrollY2, 0, i4 - scrollY2, null, i5, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f523x) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f513m = (int) motionEvent.getY(i4);
            this.f523x = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f517r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f514o = false;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x029d  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i4;
        int width;
        int i5;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z4;
        float yVelocity;
        NestedScrollView nestedScrollView;
        float f4;
        long j4;
        float f5;
        int i6;
        float fSqrt;
        int i7;
        float f6;
        if (motionEvent.getAction() != 8 || this.f516q) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i4 = 9;
            f = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f = axisValue2;
            i4 = 26;
        } else {
            f = 0.0f;
            i4 = 0;
            width = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        s(-((int) (getVerticalScrollFactorCompat() * f)), i4, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i4 != 0) {
            g gVar = this.G;
            NestedScrollView nestedScrollView2 = (NestedScrollView) gVar.f3188b.f;
            int[] iArr = gVar.f3193h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i8 = 1;
            if (gVar.f == source && gVar.f3192g == deviceId && gVar.f3191e == i4) {
                z4 = false;
                i5 = 0;
            } else {
                Context context = gVar.f3187a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i5 = 0;
                int source2 = motionEvent.getSource();
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 34) {
                    scaledMinimumFlingVelocity = o.a.f(viewConfiguration, deviceId2, i4, source2);
                } else {
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i4, source2) == null) {
                        scaledMinimumFlingVelocity = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i4 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i9 >= 34) {
                    scaledMaximumFlingVelocity = o.a.e(viewConfiguration, deviceId3, i4, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i4, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i4 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                gVar.f = source;
                gVar.f3192g = deviceId;
                gVar.f3191e = i4;
                z4 = true;
            }
            int i10 = iArr[i5];
            VelocityTracker velocityTracker = gVar.f3189c;
            if (i10 == Integer.MAX_VALUE) {
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                gVar.f3189c = null;
                return true;
            }
            if (velocityTracker == null) {
                gVar.f3189c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = gVar.f3189c;
            Map map = a0.f3161a;
            velocityTracker2.addMovement(motionEvent);
            int i11 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = a0.f3161a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new b0());
                }
                b0 b0Var = (b0) map2.get(velocityTracker2);
                long[] jArr = b0Var.f3170b;
                long eventTime = motionEvent.getEventTime();
                if (b0Var.f3172d != 0 && eventTime - jArr[b0Var.f3173e] > 40) {
                    b0Var.f3172d = i5;
                    b0Var.f3171c = 0.0f;
                }
                int i12 = (b0Var.f3173e + 1) % 20;
                b0Var.f3173e = i12;
                int i13 = b0Var.f3172d;
                if (i13 != 20) {
                    b0Var.f3172d = i13 + 1;
                }
                b0Var.f3169a[i12] = motionEvent.getAxisValue(26);
                jArr[b0Var.f3173e] = eventTime;
            }
            float f7 = Float.MAX_VALUE;
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            b0 b0Var2 = (b0) a0.f3161a.get(velocityTracker2);
            if (b0Var2 != null) {
                float[] fArr = b0Var2.f3169a;
                long[] jArr2 = b0Var2.f3170b;
                int i14 = b0Var2.f3172d;
                if (i14 < 2) {
                    f5 = Float.MAX_VALUE;
                } else {
                    int i15 = b0Var2.f3173e;
                    int i16 = ((i15 + 20) - (i14 - 1)) % 20;
                    long j5 = jArr2[i15];
                    while (true) {
                        j4 = jArr2[i16];
                        long j6 = j5 - j4;
                        f5 = f7;
                        i6 = b0Var2.f3172d;
                        if (j6 <= 100) {
                            break;
                        }
                        b0Var2.f3172d = i6 - 1;
                        i16 = (i16 + 1) % 20;
                        f7 = f5;
                    }
                    if (i6 >= 2) {
                        if (i6 == 2) {
                            int i17 = (i16 + 1) % 20;
                            long j7 = jArr2[i17];
                            if (j4 != j7) {
                                nestedScrollView2 = nestedScrollView2;
                                i7 = 1000;
                                fSqrt = fArr[i17] / (j7 - j4);
                            }
                        } else {
                            float f8 = 0.0f;
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                if (i18 >= b0Var2.f3172d - 1) {
                                    break;
                                }
                                int i20 = i18 + i16;
                                long j8 = jArr2[i20 % 20];
                                int i21 = (i20 + 1) % i11;
                                if (jArr2[i21] != j8) {
                                    i19++;
                                    float fSqrt2 = (f8 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                                    float f9 = fArr[i21] / (jArr2[i21] - j8);
                                    float fAbs = (Math.abs(f9) * (f9 - fSqrt2)) + f8;
                                    if (i19 == i8) {
                                        fAbs *= 0.5f;
                                    }
                                    f8 = fAbs;
                                }
                                i18++;
                                nestedScrollView2 = nestedScrollView2;
                                i11 = 20;
                                i8 = 1;
                            }
                            nestedScrollView2 = nestedScrollView2;
                            fSqrt = ((float) Math.sqrt(Math.abs(f8) * 2.0f)) * (f8 < 0.0f ? -1.0f : 1.0f);
                            i7 = 1000;
                        }
                        f6 = fSqrt * i7;
                        b0Var2.f3171c = f6;
                        if (f6 < (-Math.abs(f5))) {
                            b0Var2.f3171c = -Math.abs(f5);
                        } else if (b0Var2.f3171c > Math.abs(f5)) {
                            b0Var2.f3171c = Math.abs(f5);
                        }
                    }
                }
                i7 = 1000;
                fSqrt = 0.0f;
                f6 = fSqrt * i7;
                b0Var2.f3171c = f6;
                if (f6 < (-Math.abs(f5))) {
                    b0Var2.f3171c = -Math.abs(f5);
                } else if (b0Var2.f3171c > Math.abs(f5)) {
                    b0Var2.f3171c = Math.abs(f5);
                }
            } else {
                nestedScrollView2 = nestedScrollView2;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = o.a.b(velocityTracker2, i4);
            } else if (i4 == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i4 == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                b0 b0Var3 = (b0) a0.f3161a.get(velocityTracker2);
                yVelocity = (b0Var3 == null || i4 != 26) ? 0.0f : b0Var3.f3171c;
            }
            float f10 = yVelocity * (-nestedScrollView2.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f10);
            if (z4 || !(fSignum == Math.signum(gVar.f3190d) || fSignum == 0.0f)) {
                nestedScrollView = nestedScrollView2;
                nestedScrollView.f509i.abortAnimation();
            } else {
                nestedScrollView = nestedScrollView2;
            }
            if (Math.abs(f10) >= iArr[0]) {
                int i22 = iArr[1];
                float fMax = Math.max(-i22, Math.min(f10, i22));
                if (fMax == 0.0f) {
                    f4 = 0.0f;
                } else {
                    nestedScrollView.f509i.abortAnimation();
                    nestedScrollView.j((int) fMax);
                    f4 = fMax;
                }
                gVar.f3190d = f4;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.f516q) {
            return true;
        }
        int i4 = action & 255;
        if (i4 == 0) {
            int y4 = (int) motionEvent.getY();
            int x4 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y4 < childAt.getTop() - scrollY || y4 >= childAt.getBottom() - scrollY || x4 < childAt.getLeft() || x4 >= childAt.getRight()) {
                    if (!v(motionEvent) && this.f509i.isFinished()) {
                        z4 = false;
                    }
                    this.f516q = z4;
                    velocityTracker = this.f517r;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f517r = null;
                    }
                } else {
                    this.f513m = y4;
                    this.f523x = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f517r;
                    if (velocityTracker3 == null) {
                        this.f517r = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f517r.addMovement(motionEvent);
                    this.f509i.computeScrollOffset();
                    if (!v(motionEvent) && this.f509i.isFinished()) {
                        z4 = false;
                    }
                    this.f516q = z4;
                    this.E.h(2, 0);
                }
            } else {
                if (!v(motionEvent)) {
                    z4 = false;
                }
                this.f516q = z4;
                velocityTracker = this.f517r;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f517r = null;
                }
            }
        } else if (i4 == 1) {
            this.f516q = false;
            this.f523x = -1;
            velocityTracker2 = this.f517r;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f517r = null;
            }
            if (this.f509i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i4 == 2) {
            int i5 = this.f523x;
            if (i5 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i5);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                } else {
                    int y5 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y5 - this.f513m) > this.f520u && (2 & getNestedScrollAxes()) == 0) {
                        this.f516q = true;
                        this.f513m = y5;
                        if (this.f517r == null) {
                            this.f517r = VelocityTracker.obtain();
                        }
                        this.f517r.addMovement(motionEvent);
                        this.A = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i4 == 3) {
            this.f516q = false;
            this.f523x = -1;
            velocityTracker2 = this.f517r;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f517r = null;
            }
            if (this.f509i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i4 == 6) {
            o(motionEvent);
        }
        return this.f516q;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int measuredHeight;
        super.onLayout(z4, i4, i5, i6, i7);
        int i8 = 0;
        this.n = false;
        View view = this.f515p;
        if (view != null && l(view, this)) {
            View view2 = this.f515p;
            Rect rect = this.f508h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f515p = null;
        if (!this.f514o) {
            if (this.C != null) {
                scrollTo(getScrollX(), this.C.f);
                this.C = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i8 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f514o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f518s && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f4, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f4, true);
        j((int) f4);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f4) {
        return this.E.b(f, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        this.E.c(i4, i5, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        n(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        super.scrollTo(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i4) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        if (viewFindNextFocus != null && m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i4, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.C = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m(viewFindFocus, 0, i7)) {
            return;
        }
        Rect rect = this.f508h;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f519t) {
                u(0, false, iH);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0120  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fV;
        int iRound;
        int i4;
        ViewParent parent2;
        int i5;
        if (this.f517r == null) {
            this.f517r = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.A);
        n nVar = this.E;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f510j;
            EdgeEffect edgeEffect2 = this.f511k;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f517r;
                velocityTracker.computeCurrentVelocity(1000, this.f522w);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f523x);
                if (Math.abs(yVelocity) >= this.f521v) {
                    if (e4.a.y(edgeEffect) != 0.0f) {
                        if (t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (e4.a.y(edgeEffect2) != 0.0f) {
                        int i6 = -yVelocity;
                        if (t(edgeEffect2, i6)) {
                            edgeEffect2.onAbsorb(i6);
                        } else {
                            j(i6);
                        }
                    } else {
                        int i7 = -yVelocity;
                        float f4 = i7;
                        if (!nVar.b(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            j(i7);
                        }
                    }
                } else if (this.f509i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f523x = -1;
                this.f516q = false;
                VelocityTracker velocityTracker2 = this.f517r;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f517r = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f523x);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f523x + " in onTouchEvent");
                } else {
                    int y4 = (int) motionEvent.getY(iFindPointerIndex);
                    int i8 = this.f513m - y4;
                    float x4 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i8 / getHeight();
                    if (e4.a.y(edgeEffect) != 0.0f) {
                        fV = -e4.a.V(edgeEffect, -height, x4);
                        if (e4.a.y(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (e4.a.y(edgeEffect2) != 0.0f) {
                        fV = e4.a.V(edgeEffect2, height, 1.0f - x4);
                        if (e4.a.y(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i4 = i8 - iRound;
                        if (!this.f516q && Math.abs(i4) > this.f520u) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f516q = true;
                            i5 = this.f520u;
                            if (i4 > 0) {
                                i4 -= i5;
                            } else {
                                i4 += i5;
                            }
                        }
                        if (this.f516q) {
                            int iS = s(i4, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f513m = y4 - iS;
                            this.A += iS;
                        }
                    }
                    f = fV;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i4 = i8 - iRound;
                    if (!this.f516q) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f516q = true;
                        i5 = this.f520u;
                        if (i4 > 0) {
                            i4 -= i5;
                        } else {
                            i4 += i5;
                        }
                    }
                    if (this.f516q) {
                        int iS2 = s(i4, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f513m = y4 - iS2;
                        this.A += iS2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f516q && getChildCount() > 0) {
                    if (this.f509i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f523x = -1;
                this.f516q = false;
                VelocityTracker velocityTracker3 = this.f517r;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f517r = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f513m = (int) motionEvent.getY(actionIndex);
                this.f523x = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f513m = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f523x));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f516q && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f509i.isFinished()) {
                this.f509i.abortAnimation();
                w(1);
            }
            int y5 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f513m = y5;
            this.f523x = pointerId;
            nVar.h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f517r;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i4, int i5, int i6, int i7) {
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i10 = i6 + i4;
        if (i5 <= 0 && i5 >= 0) {
            i8 = i5;
            z4 = false;
        } else {
            i8 = 0;
            z4 = true;
        }
        if (i10 <= i7) {
            if (i10 < 0) {
                i9 = 0;
            } else {
                i9 = i10;
                z5 = false;
            }
            if (z5 && !this.E.f(1)) {
                this.f509i.springBack(i8, i9, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i8, i9);
            return !z4 || z5;
        }
        i9 = i7;
        z5 = true;
        if (z5) {
            this.f509i.springBack(i8, i9, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i8, i9);
        if (z4) {
        }
    }

    public final void q(int i4) {
        boolean z4 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f508h;
        if (z4) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i5 = rect.top;
        int i6 = height + i5;
        rect.bottom = i6;
        r(i4, i5, i6);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean r(int i4, int i5, int i6) {
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z5 = i4 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z7 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z6 = z7;
                } else {
                    boolean z8 = (z5 && top < view.getTop()) || (!z5 && bottom > view.getBottom());
                    if (z6) {
                        if (z7 && z8) {
                            view = view2;
                        }
                    } else if (z7) {
                        view = view2;
                        z6 = true;
                    } else if (z8) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i5 < scrollY || i6 > i7) {
            s(z5 ? i5 - scrollY : i6 - i7, -1, null, 0, 1, true);
            z4 = true;
        } else {
            z4 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i4);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.n) {
            this.f515p = view2;
        } else {
            Rect rect = this.f508h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z5 = iH != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, iH);
                return z5;
            }
            u(0, false, iH);
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f517r) != null) {
            velocityTracker.recycle();
            this.f517r = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.n = true;
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    public final int s(int i4, int i5, MotionEvent motionEvent, int i6, int i7, boolean z4) {
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        VelocityTracker velocityTracker;
        n nVar = this.E;
        if (i7 == 1) {
            nVar.h(2, i7);
        }
        boolean zC = this.E.c(0, i4, i7, this.f525z, this.f524y);
        int[] iArr = this.f524y;
        int[] iArr2 = this.f525z;
        if (zC) {
            i8 = i4 - iArr2[1];
            i9 = iArr[1];
        } else {
            i8 = i4;
            i9 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z7 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z4;
        boolean z8 = p(i8, 0, scrollY, scrollRange) && !nVar.f(i7);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f3256a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i5, scrollY2);
        }
        iArr2[1] = 0;
        this.E.d(0, scrollY2, 0, i8 - scrollY2, this.f524y, i7, iArr2);
        int i10 = i9 + iArr[1];
        int i11 = i8 - iArr2[1];
        int i12 = scrollY + i11;
        EdgeEffect edgeEffect = this.f511k;
        EdgeEffect edgeEffect2 = this.f510j;
        if (i12 >= 0) {
            if (i12 > scrollRange && z7) {
                e4.a.V(edgeEffect, i11 / getHeight(), 1.0f - (i6 / getWidth()));
                if (motionEvent != null) {
                    z5 = false;
                    getScrollFeedbackProvider().f3256a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i5, false);
                } else {
                    z5 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z6 = z5;
            } else {
                z6 = z8;
            }
            if (z6 && i7 == 0 && (velocityTracker = this.f517r) != null) {
                velocityTracker.clear();
            }
            if (i7 == 1) {
                w(i7);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i10;
        }
        if (z7) {
            e4.a.V(edgeEffect2, (-i11) / getHeight(), i6 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f3256a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i5, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z5 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z6 = z5;
        } else {
            postInvalidateOnAnimation();
            z6 = z5;
        }
        if (z6) {
            velocityTracker.clear();
        }
        if (i7 == 1) {
            w(i7);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i10;
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i4 < 0) {
                i4 = 0;
            } else if (width + i4 > width2) {
                i4 = width2 - width;
            }
            if (height >= height2 || i5 < 0) {
                i5 = 0;
            } else if (height + i5 > height2) {
                i5 = height2 - height;
            }
            if (i4 == getScrollX() && i5 == getScrollY()) {
                return;
            }
            super.scrollTo(i4, i5);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f518s) {
            this.f518s = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        this.E.g(z4);
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f519t = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return this.E.h(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        float fY = e4.a.y(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i4) * 0.35f;
        float f = this.f * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d5 = H;
        return ((float) (Math.exp((d5 / (d5 - 1.0d)) * dLog) * ((double) f))) < fY;
    }

    public final void u(int i4, boolean z4, int i5) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f507g > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f509i.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z4) {
                this.E.h(2, 1);
            } else {
                w(1);
            }
            this.B = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f509i.isFinished()) {
                this.f509i.abortAnimation();
                w(1);
            }
            scrollBy(i4, i5);
        }
        this.f507g = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.f510j;
        if (e4.a.y(edgeEffect) != 0.0f) {
            e4.a.V(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f511k;
        if (e4.a.y(edgeEffect2) == 0.0f) {
            return z4;
        }
        e4.a.V(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i4) {
        this.E.i(i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
        } else {
            q.j("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            q.j("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
        } else {
            q.j("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(t0.e eVar) {
    }
}
