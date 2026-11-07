package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import androidx.emoji2.text.x;
import androidx.fragment.app.q;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import k1.g0;
import k1.m;
import o0.d;
import p.k;
import p0.h0;
import p0.o;
import p0.p;
import p0.p0;
import p0.y1;
import r0.b;
import z.c;
import z.e;
import z.f;
import z.g;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements o, p {
    public static final ThreadLocal A;
    public static final m B;
    public static final d C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f465y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Class[] f466z;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f473m;
    public final int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f477r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y1 f478s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f479t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f480u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f481v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f482w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g0 f483x;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public SparseArray f484h;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i4 = parcel.readInt();
            int[] iArr = new int[i4];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f484h = new SparseArray(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                this.f484h.append(iArr[i5], parcelableArray[i5]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            SparseArray sparseArray = this.f484h;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr[i5] = this.f484h.keyAt(i5);
                parcelableArr[i5] = (Parcelable) this.f484h.valueAt(i5);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i4);
        }
    }

    static {
        Package r4 = CoordinatorLayout.class.getPackage();
        f465y = r4 != null ? r4.getName() : null;
        B = new m(3);
        f466z = new Class[]{Context.class, AttributeSet.class};
        A = new ThreadLocal();
        C = new d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f = new ArrayList();
        this.f467g = new x(5);
        this.f468h = new ArrayList();
        this.f469i = new ArrayList();
        this.f470j = new int[2];
        this.f471k = new int[2];
        this.f483x = new g0();
        int[] iArr = y.a.f4764a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.n = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i4 = 0; i4 < length; i4++) {
                int[] iArr2 = this.n;
                iArr2[i4] = (int) (iArr2[i4] * f);
            }
        }
        this.f480u = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        x();
        super.setOnHierarchyChangeListener(new z.d(this));
        WeakHashMap weakHashMap = p0.f3233a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) C.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i4, Rect rect, Rect rect2, e eVar, int i5, int i6) {
        int iWidth;
        int iHeight;
        int i7 = eVar.f4805c;
        if (i7 == 0) {
            i7 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i4);
        int i8 = eVar.f4806d;
        if ((i8 & 7) == 0) {
            i8 |= 8388611;
        }
        if ((i8 & 112) == 0) {
            i8 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, i4);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int i11 = absoluteGravity2 & 7;
        int i12 = absoluteGravity2 & 112;
        if (i11 != 1) {
            iWidth = i11 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i12 != 16) {
            iHeight = i12 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i9 == 1) {
            iWidth -= i5 / 2;
        } else if (i9 != 5) {
            iWidth -= i5;
        }
        if (i10 == 16) {
            iHeight -= i6 / 2;
        } else if (i10 != 80) {
            iHeight -= i6;
        }
        rect2.set(iWidth, iHeight, i5 + iWidth, i6 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f4804b) {
            if (view instanceof z.a) {
                z.b behavior = ((z.a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.b(behavior);
                eVar.f4804b = true;
                return eVar;
            }
            c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (c) superclass.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.b((z.b) cVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e5) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e5);
                }
            }
            eVar.f4804b = true;
        }
        return eVar;
    }

    public static void v(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        int i5 = eVar.f4810i;
        if (i5 != i4) {
            WeakHashMap weakHashMap = p0.f3233a;
            view.offsetLeftAndRight(i4 - i5);
            eVar.f4810i = i4;
        }
    }

    public static void w(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        int i5 = eVar.f4811j;
        if (i5 != i4) {
            WeakHashMap weakHashMap = p0.f3233a;
            view.offsetTopAndBottom(i4 - i5);
            eVar.f4811j = i4;
        }
    }

    @Override // p0.o
    public final void a(View view, View view2, int i4, int i5) {
        g0 g0Var = this.f483x;
        if (i5 == 1) {
            g0Var.f2781b = i4;
        } else {
            g0Var.f2780a = i4;
        }
        this.f475p = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ((e) getChildAt(i6).getLayoutParams()).getClass();
        }
    }

    @Override // p0.o
    public final void b(View view, int i4) {
        g0 g0Var = this.f483x;
        if (i4 == 1) {
            g0Var.f2781b = 0;
        } else {
            g0Var.f2780a = 0;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i4)) {
                z.b bVar = eVar.f4803a;
                if (bVar != null) {
                    bVar.u(this, childAt, view, i4);
                }
                if (i4 == 0) {
                    eVar.f4814m = false;
                } else if (i4 == 1) {
                    eVar.n = false;
                }
                eVar.f4815o = false;
            }
        }
        this.f475p = null;
    }

    @Override // p0.o
    public final void c(View view, int i4, int i5, int[] iArr, int i6) {
        z.b bVar;
        int childCount = getChildCount();
        boolean z4 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i6) && (bVar = eVar.f4803a) != null) {
                    int[] iArr2 = this.f470j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.o(i4, i5, i6, childAt, view, this, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z4) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // p0.p
    public final void d(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        z.b bVar;
        int childCount = getChildCount();
        boolean z4 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i8) && (bVar = eVar.f4803a) != null) {
                    int[] iArr2 = this.f470j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.p(i5, i6, i7, childAt, view, this, iArr2);
                    iMax = i6 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i7 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z4) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        z.b bVar = ((e) view.getLayoutParams()).f4803a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f480u;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p0.o
    public final void e(View view, int i4, int i5, int i6, int i7, int i8) {
        d(view, i4, i5, i6, i7, 0, this.f471k);
    }

    @Override // p0.o
    public final boolean f(View view, View view2, int i4, int i5) {
        View view3;
        int i6;
        int i7;
        int childCount = getChildCount();
        int i8 = 0;
        boolean z4 = false;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                view3 = view;
                i6 = i4;
                i7 = i5;
            } else {
                e eVar = (e) childAt.getLayoutParams();
                z.b bVar = eVar.f4803a;
                if (bVar != null) {
                    view3 = view;
                    i6 = i4;
                    i7 = i5;
                    boolean zT = bVar.t(this, childAt, view3, i6, i7);
                    z4 |= zT;
                    if (i7 == 0) {
                        eVar.f4814m = zT;
                    } else if (i7 == 1) {
                        eVar.n = zT;
                    }
                } else {
                    view3 = view;
                    i6 = i4;
                    i7 = i5;
                    if (i7 == 0) {
                        eVar.f4814m = false;
                    } else if (i7 == 1) {
                        eVar.n = false;
                    }
                }
            }
            i8++;
            view = view3;
            i4 = i6;
            i5 = i7;
        }
        return z4;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.f);
    }

    public final y1 getLastWindowInsets() {
        return this.f478s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        g0 g0Var = this.f483x;
        return g0Var.f2781b | g0Var.f2780a;
    }

    public Drawable getStatusBarBackground() {
        return this.f480u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i4, int i5) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i4 + iMax, i5 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z4) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        k kVar = (k) this.f467g.f593b;
        int i4 = kVar.f3157h;
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < i4; i5++) {
            ArrayList arrayList2 = (ArrayList) kVar.i(i5);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVar.f(i5));
            }
        }
        ArrayList arrayList3 = this.f469i;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = g.f4817a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f4817a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f4818b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i4) {
        int[] iArr = this.n;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i4);
            return 0;
        }
        if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i4 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i4, int i5) {
        d dVar = C;
        Rect rectG = g();
        k(view, rectG);
        try {
            return rectG.contains(i4, i5);
        } finally {
            rectG.setEmpty();
            dVar.c(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
        if (this.f477r) {
            if (this.f476q == null) {
                this.f476q = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f476q);
        }
        if (this.f478s == null) {
            WeakHashMap weakHashMap = p0.f3233a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f473m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.f477r && this.f476q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f476q);
        }
        View view = this.f475p;
        if (view != null) {
            b(view, 0);
        }
        this.f473m = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f479t || this.f480u == null) {
            return;
        }
        y1 y1Var = this.f478s;
        int iD = y1Var != null ? y1Var.d() : 0;
        if (iD > 0) {
            this.f480u.setBounds(0, 0, getWidth(), iD);
            this.f480u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean zS = s(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zS;
        }
        u(true);
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        z.b bVar;
        WeakHashMap weakHashMap = p0.f3233a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f4803a) == null || !bVar.l(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        boolean z4;
        int i6;
        int i7;
        int i8;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        z.b bVar;
        int i9;
        int i10;
        boolean z5;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        View view;
        int i14;
        boolean zM;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.t();
        int childCount = coordinatorLayout.getChildCount();
        int i15 = 0;
        loop0: while (true) {
            if (i15 >= childCount) {
                z4 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i15);
            k kVar = (k) coordinatorLayout.f467g.f593b;
            int i16 = kVar.f3157h;
            for (int i17 = 0; i17 < i16; i17++) {
                ArrayList arrayList2 = (ArrayList) kVar.i(i17);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z4 = true;
                    break loop0;
                }
            }
            i15++;
        }
        if (z4 != coordinatorLayout.f477r) {
            boolean z6 = coordinatorLayout.f473m;
            if (z4) {
                if (z6) {
                    if (coordinatorLayout.f476q == null) {
                        coordinatorLayout.f476q = new f(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f476q);
                }
                coordinatorLayout.f477r = true;
            } else {
                if (z6 && coordinatorLayout.f476q != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f476q);
                }
                coordinatorLayout.f477r = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = p0.f3233a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z7 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        int i18 = paddingLeft + paddingRight;
        int i19 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z8 = coordinatorLayout.f478s != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f;
        int size3 = arrayList3.size();
        int i20 = 0;
        int iCombineMeasuredStates = 0;
        while (i20 < size3) {
            View view2 = (View) arrayList3.get(i20);
            int i21 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i7 = size3;
                i14 = i20;
                i9 = paddingLeft;
                suggestedMinimumWidth = i21;
                z5 = false;
                i11 = paddingRight;
            } else {
                e eVar = (e) view2.getLayoutParams();
                int i22 = eVar.f4807e;
                if (i22 < 0 || mode == 0) {
                    i6 = suggestedMinimumHeight;
                } else {
                    int iM = coordinatorLayout.m(i22);
                    int i23 = eVar.f4805c;
                    if (i23 == 0) {
                        i23 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, layoutDirection) & 7;
                    i6 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z7) && !(absoluteGravity == 5 && z7)) {
                        if ((absoluteGravity == 5 && !z7) || (absoluteGravity == 3 && z7)) {
                            iMax = Math.max(0, iM - paddingLeft);
                        }
                        if (z8 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i4;
                            iMakeMeasureSpec2 = i5;
                        } else {
                            int iC = coordinatorLayout.f478s.c() + coordinatorLayout.f478s.b();
                            int iA = coordinatorLayout.f478s.a() + coordinatorLayout.f478s.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        bVar = eVar.f4803a;
                        if (bVar != null) {
                            z5 = false;
                            i9 = paddingLeft;
                            i10 = i21;
                            i11 = paddingRight;
                            i12 = i6;
                            arrayList = arrayList3;
                            int i24 = iMakeMeasureSpec;
                            i14 = i20;
                            int i25 = iMakeMeasureSpec2;
                            zM = bVar.m(this, view2, i24, i8, i25);
                            view = view2;
                            iMakeMeasureSpec = i24;
                            i13 = i25;
                            if (zM) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i10, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                            int iMax3 = Math.max(i12, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i9 = paddingLeft;
                            i10 = i21;
                            z5 = false;
                            i11 = paddingRight;
                            i12 = i6;
                            arrayList = arrayList3;
                            i13 = iMakeMeasureSpec2;
                            view = view2;
                            i14 = i20;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i8, i13, 0);
                        int iMax4 = Math.max(i10, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                        int iMax5 = Math.max(i12, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM);
                    }
                    int i26 = size3;
                    i8 = iMax;
                    i7 = i26;
                    if (z8) {
                        iMakeMeasureSpec = i4;
                        iMakeMeasureSpec2 = i5;
                    } else {
                        iMakeMeasureSpec = i4;
                        iMakeMeasureSpec2 = i5;
                    }
                    bVar = eVar.f4803a;
                    if (bVar != null) {
                        z5 = false;
                        i9 = paddingLeft;
                        i10 = i21;
                        i11 = paddingRight;
                        i12 = i6;
                        arrayList = arrayList3;
                        int i27 = iMakeMeasureSpec;
                        i14 = i20;
                        int i28 = iMakeMeasureSpec2;
                        zM = bVar.m(this, view2, i27, i8, i28);
                        view = view2;
                        iMakeMeasureSpec = i27;
                        i13 = i28;
                        if (zM) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i10, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                        int iMax7 = Math.max(i12, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i9 = paddingLeft;
                        i10 = i21;
                        z5 = false;
                        i11 = paddingRight;
                        i12 = i6;
                        arrayList = arrayList3;
                        i13 = iMakeMeasureSpec2;
                        view = view2;
                        i14 = i20;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i8, i13, 0);
                    int iMax8 = Math.max(i10, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int iMax9 = Math.max(i12, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i7 = size3;
                i8 = 0;
                if (z8) {
                    iMakeMeasureSpec = i4;
                    iMakeMeasureSpec2 = i5;
                } else {
                    iMakeMeasureSpec = i4;
                    iMakeMeasureSpec2 = i5;
                }
                bVar = eVar.f4803a;
                if (bVar != null) {
                    z5 = false;
                    i9 = paddingLeft;
                    i10 = i21;
                    i11 = paddingRight;
                    i12 = i6;
                    arrayList = arrayList3;
                    int i29 = iMakeMeasureSpec;
                    i14 = i20;
                    int i210 = iMakeMeasureSpec2;
                    zM = bVar.m(this, view2, i29, i8, i210);
                    view = view2;
                    iMakeMeasureSpec = i29;
                    i13 = i210;
                    if (zM) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i10, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int iMax11 = Math.max(i12, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i9 = paddingLeft;
                    i10 = i21;
                    z5 = false;
                    i11 = paddingRight;
                    i12 = i6;
                    arrayList = arrayList3;
                    i13 = iMakeMeasureSpec2;
                    view = view2;
                    i14 = i20;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i8, i13, 0);
                int iMax12 = Math.max(i10, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                int iMax13 = Math.max(i12, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i20 = i14 + 1;
            paddingLeft = i9;
            paddingRight = i11;
            size3 = i7;
            arrayList3 = arrayList;
        }
        int i30 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i4, (-16777216) & i30), View.resolveSizeAndState(suggestedMinimumHeight, i5, i30 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f4, boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    z.b bVar = eVar.f4803a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f4) {
        z.b bVar;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f4803a) != null) {
                    zN |= bVar.n(view);
                }
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        c(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        e(view, i4, i5, i6, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f);
        SparseArray sparseArray = savedState.f484h;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            z.b bVar = n(childAt).f4803a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableS;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            z.b bVar = ((e) childAt.getLayoutParams()).f4803a;
            if (id != -1 && bVar != null && (parcelableS = bVar.s(childAt)) != null) {
                sparseArray.append(id, parcelableS);
            }
        }
        savedState.f484h = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zS;
        boolean zV;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f474o == null) {
            zS = s(motionEvent, 1);
            if (!zS) {
                zV = false;
            }
            motionEventObtain = null;
            if (this.f474o == null) {
                zV |= super.onTouchEvent(motionEvent);
            } else if (zS) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zV;
            }
            u(false);
            return zV;
        }
        zS = false;
        z.b bVar = ((e) this.f474o.getLayoutParams()).f4803a;
        if (bVar != null) {
            zV = bVar.v(this, this.f474o, motionEvent);
        } else {
            zV = false;
        }
        motionEventObtain = null;
        if (this.f474o == null) {
            zV |= super.onTouchEvent(motionEvent);
        } else if (zS) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        u(false);
        return zV;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    public final void p(int i4) {
        int i5;
        Rect rect;
        int i6;
        ArrayList arrayList;
        boolean zH;
        boolean z4;
        boolean z5;
        int width;
        int i7;
        int i8;
        int i9;
        int height;
        int i10;
        int i11;
        int i12;
        e eVar;
        int i13;
        View view;
        z.b bVar;
        WeakHashMap weakHashMap = p0.f3233a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        Rect rectG = g();
        Rect rectG2 = g();
        Rect rectG3 = g();
        int i14 = 0;
        while (true) {
            d dVar = C;
            if (i14 >= size) {
                Rect rect2 = rectG3;
                rectG.setEmpty();
                dVar.c(rectG);
                rectG2.setEmpty();
                dVar.c(rectG2);
                rect2.setEmpty();
                dVar.c(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i14);
            e eVar2 = (e) view2.getLayoutParams();
            if (i4 != 0 || view2.getVisibility() != 8) {
                int i15 = 0;
                while (i15 < i14) {
                    if (eVar2.f4813l == ((View) arrayList2.get(i15))) {
                        e eVar3 = (e) view2.getLayoutParams();
                        if (eVar3.f4812k != null) {
                            Rect rectG4 = g();
                            Rect rectG5 = g();
                            e eVar4 = eVar2;
                            Rect rectG6 = g();
                            k(eVar3.f4812k, rectG4);
                            i(view2, rectG5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            eVar = eVar4;
                            i13 = i15;
                            layoutDirection = layoutDirection;
                            view = view3;
                            l(layoutDirection, rectG4, rectG6, eVar3, measuredWidth, measuredHeight);
                            boolean z6 = (rectG6.left == rectG5.left && rectG6.top == rectG5.top) ? false : true;
                            h(eVar3, rectG6, measuredWidth, measuredHeight);
                            int i16 = rectG6.left - rectG5.left;
                            int i17 = rectG6.top - rectG5.top;
                            if (i16 != 0) {
                                WeakHashMap weakHashMap2 = p0.f3233a;
                                view.offsetLeftAndRight(i16);
                            }
                            if (i17 != 0) {
                                WeakHashMap weakHashMap3 = p0.f3233a;
                                view.offsetTopAndBottom(i17);
                            }
                            if (z6 && (bVar = eVar3.f4803a) != null) {
                                bVar.h(this, view, eVar3.f4812k);
                            }
                            rectG4.setEmpty();
                            dVar.c(rectG4);
                            rectG5.setEmpty();
                            dVar.c(rectG5);
                            rectG6.setEmpty();
                            dVar.c(rectG6);
                        } else {
                            eVar = eVar2;
                            i13 = i15;
                            view = view2;
                        }
                    } else {
                        eVar = eVar2;
                        i13 = i15;
                        view = view2;
                    }
                    i15 = i13 + 1;
                    eVar2 = eVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i14 = i14;
                    rectG3 = rectG3;
                }
                ArrayList arrayList3 = arrayList2;
                e eVar5 = eVar2;
                int i18 = size;
                Rect rect3 = rectG3;
                i5 = i14;
                View view4 = view2;
                i(view4, rectG2, true);
                if (eVar5.f4808g != 0 && !rectG2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar5.f4808g, layoutDirection);
                    int i19 = absoluteGravity & 112;
                    if (i19 == 48) {
                        rectG.top = Math.max(rectG.top, rectG2.bottom);
                    } else if (i19 == 80) {
                        rectG.bottom = Math.max(rectG.bottom, getHeight() - rectG2.top);
                    }
                    int i20 = absoluteGravity & 7;
                    if (i20 == 3) {
                        rectG.left = Math.max(rectG.left, rectG2.right);
                    } else if (i20 == 5) {
                        rectG.right = Math.max(rectG.right, getWidth() - rectG2.left);
                    }
                }
                if (eVar5.f4809h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = p0.f3233a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        e eVar6 = (e) view4.getLayoutParams();
                        z.b bVar2 = eVar6.f4803a;
                        Rect rectG7 = g();
                        Rect rectG8 = g();
                        rectG8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (bVar2 == null || !bVar2.e(view4)) {
                            rectG7.set(rectG8);
                        } else if (!rectG8.contains(rectG7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectG7.toShortString() + " | Bounds:" + rectG8.toShortString());
                        }
                        rectG8.setEmpty();
                        dVar.c(rectG8);
                        if (rectG7.isEmpty()) {
                            rectG7.setEmpty();
                            dVar.c(rectG7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar6.f4809h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i11 = (rectG7.top - ((ViewGroup.MarginLayoutParams) eVar6).topMargin) - eVar6.f4811j) >= (i12 = rectG.top)) {
                                z4 = false;
                            } else {
                                w(view4, i12 - i11);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectG7.bottom) - ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin) + eVar6.f4811j) < (i10 = rectG.bottom)) {
                                w(view4, height - i10);
                                z4 = true;
                            }
                            if (!z4) {
                                w(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i8 = (rectG7.left - ((ViewGroup.MarginLayoutParams) eVar6).leftMargin) - eVar6.f4810i) >= (i9 = rectG.left)) {
                                z5 = false;
                            } else {
                                v(view4, i9 - i8);
                                z5 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectG7.right) - ((ViewGroup.MarginLayoutParams) eVar6).rightMargin) + eVar6.f4810i) < (i7 = rectG.right)) {
                                v(view4, width - i7);
                                z5 = true;
                            }
                            if (!z5) {
                                v(view4, 0);
                            }
                            rectG7.setEmpty();
                            dVar.c(rectG7);
                        }
                    }
                }
                if (i4 != 2) {
                    rect = rect3;
                    rect.set(((e) view4.getLayoutParams()).f4816p);
                    if (rect.equals(rectG2)) {
                        arrayList = arrayList3;
                        i6 = i18;
                    } else {
                        ((e) view4.getLayoutParams()).f4816p.set(rectG2);
                    }
                } else {
                    rect = rect3;
                }
                int i21 = i5 + 1;
                i6 = i18;
                while (true) {
                    arrayList = arrayList3;
                    if (i21 >= i6) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i21);
                    e eVar7 = (e) view5.getLayoutParams();
                    z.b bVar3 = eVar7.f4803a;
                    if (bVar3 != null && bVar3.f(view5, view4)) {
                        if (i4 == 0 && eVar7.f4815o) {
                            eVar7.f4815o = false;
                        } else {
                            if (i4 != 2) {
                                zH = bVar3.h(this, view5, view4);
                            } else {
                                bVar3.i(this, view4);
                                zH = true;
                            }
                            if (i4 == 1) {
                                eVar7.f4815o = zH;
                            }
                        }
                    }
                    i21++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i6 = size;
                rect = rectG3;
                i5 = i14;
            }
            i14 = i5 + 1;
            rectG3 = rect;
            size = i6;
            arrayList2 = arrayList;
        }
    }

    public final void q(View view, int i4) {
        int i5;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f4812k;
        if (view2 == null && eVar.f != -1) {
            q.j("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        d dVar = C;
        if (view2 != null) {
            Rect rectG = g();
            Rect rectG2 = g();
            try {
                k(view2, rectG);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i4, rectG, rectG2, eVar2, measuredWidth, measuredHeight);
                h(eVar2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                dVar.c(rectG);
                rectG2.setEmpty();
                dVar.c(rectG2);
            }
        }
        int i6 = eVar.f4807e;
        if (i6 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            Rect rectG3 = g();
            rectG3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f478s != null) {
                WeakHashMap weakHashMap = p0.f3233a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG3.left = this.f478s.b() + rectG3.left;
                    rectG3.top = this.f478s.d() + rectG3.top;
                    rectG3.right -= this.f478s.c();
                    rectG3.bottom -= this.f478s.a();
                }
            }
            Rect rectG4 = g();
            int i7 = eVar3.f4805c;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            Gravity.apply(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG3, rectG4, i4);
            view.layout(rectG4.left, rectG4.top, rectG4.right, rectG4.bottom);
            rectG3.setEmpty();
            dVar.c(rectG3);
            rectG4.setEmpty();
            dVar.c(rectG4);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i8 = eVar4.f4805c;
        if (i8 == 0) {
            i8 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, i4);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i4 == 1) {
            i6 = width - i6;
        }
        int iM = m(i6) - measuredWidth2;
        if (i9 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i9 == 5) {
            iM += measuredWidth2;
        }
        if (i10 != 16) {
            i5 = i10 != 80 ? 0 : measuredHeight2;
        } else {
            i5 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final void r(View view, int i4, int i5, int i6) {
        measureChildWithMargins(view, i4, i5, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        z.b bVar = ((e) view.getLayoutParams()).f4803a;
        if (bVar == null || !bVar.q(this, view, rect, z4)) {
            return super.requestChildRectangleOnScreen(view, rect, z4);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (!z4 || this.f472l) {
            return;
        }
        u(false);
        this.f472l = true;
    }

    public final boolean s(MotionEvent motionEvent, int i4) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f468h;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i5) : i5));
        }
        m mVar = B;
        if (mVar != null) {
            Collections.sort(arrayList, mVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            z.b bVar = ((e) view.getLayoutParams()).f4803a;
            if (zK && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i4 == 0) {
                        bVar.k(this, view, motionEventObtain);
                    } else if (i4 == 1) {
                        bVar.v(this, view, motionEventObtain);
                    }
                }
            } else if (!zK && bVar != null) {
                if (i4 == 0) {
                    zK = bVar.k(this, view, motionEvent);
                } else if (i4 == 1) {
                    zK = bVar.v(this, view, motionEvent);
                }
                if (zK) {
                    this.f474o = view;
                }
            }
        }
        arrayList.clear();
        return zK;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f481v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f480u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f480u = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f480u.setState(getDrawableState());
                }
                Drawable drawable3 = this.f480u;
                WeakHashMap weakHashMap = p0.f3233a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f480u.setVisible(getVisibility() == 0, false);
                this.f480u.setCallback(this);
            }
            WeakHashMap weakHashMap2 = p0.f3233a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i4) {
        setStatusBarBackground(new ColorDrawable(i4));
    }

    public void setStatusBarBackgroundResource(int i4) {
        setStatusBarBackground(i4 != 0 ? c0.c.getDrawable(getContext(), i4) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f480u;
        if (drawable == null || drawable.isVisible() == z4) {
            return;
        }
        this.f480u.setVisible(z4, false);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void t() {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
    }

    public final void u(boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            z.b bVar = ((e) childAt.getLayoutParams()).f4803a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z4) {
                    bVar.k(this, childAt, motionEventObtain);
                } else {
                    bVar.v(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            ((e) getChildAt(i5).getLayoutParams()).getClass();
        }
        this.f474o = null;
        this.f472l = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f480u;
    }

    public final void x() {
        WeakHashMap weakHashMap = p0.f3233a;
        if (!getFitsSystemWindows()) {
            h0.c(this, null);
            return;
        }
        if (this.f482w == null) {
            this.f482w = new b(this);
        }
        h0.c(this, this.f482w);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }
}
