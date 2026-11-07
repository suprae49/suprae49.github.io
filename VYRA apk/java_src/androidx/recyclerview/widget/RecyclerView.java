package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.emoji2.text.g;
import androidx.emoji2.text.p;
import androidx.emoji2.text.t;
import androidx.fragment.app.q;
import c2.h;
import com.google.android.gms.common.api.Api;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.o;
import k1.a0;
import k1.b0;
import k1.e0;
import k1.f0;
import k1.f1;
import k1.g0;
import k1.h0;
import k1.i;
import k1.i0;
import k1.l;
import k1.l0;
import k1.m0;
import k1.n0;
import k1.o0;
import k1.q0;
import k1.r0;
import k1.t0;
import k1.u;
import k1.u0;
import k1.v0;
import k1.w;
import k1.w0;
import k1.x;
import k1.x0;
import k1.y;
import k1.z;
import k1.z0;
import p.k;
import p0.j0;
import p0.m;
import p0.n;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements m {
    public static final int[] D0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] E0;
    public static final z F0;
    public boolean A;
    public int A0;
    public boolean B;
    public int B0;
    public boolean C;
    public final a0 C0;
    public int D;
    public boolean E;
    public final AccessibilityManager F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public f0 K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public EdgeEffect O;
    public h0 P;
    public int Q;
    public int R;
    public VelocityTracker S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f908a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public n0 f909b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int f910c0;
    public final int d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float f911e0;
    public final b f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final float f912f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v1.b f913g;
    public boolean g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SavedState f914h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final w0 f915h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f916i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public k1.o f917i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f918j;
    public final h j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f919k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final u0 f920k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f921l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public o0 f922l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y f923m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ArrayList f924m0;
    public final Rect n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f925n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f926o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f927o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RectF f928p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final a0 f929p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b0 f930q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f931q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l0 f932r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public z0 f933r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f934s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int[] f935s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f936t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public n f937t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f938u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int[] f939u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l f940v;
    public final int[] v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f941w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int[] f942w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f943x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final ArrayList f944x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f945y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final y f946y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f947z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f948z0;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new c();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f949h;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f949h = parcel.readParcelable(classLoader == null ? l0.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeParcelable(this.f949h, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        E0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        F0 = new z(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i4) {
        int i5;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i4);
        this.f = new b(this);
        this.f913g = new v1.b(this);
        this.f919k = new p(8);
        this.f923m = new y(this, 0);
        this.n = new Rect();
        this.f926o = new Rect();
        this.f928p = new RectF();
        this.f934s = new ArrayList();
        this.f936t = new ArrayList();
        this.f938u = new ArrayList();
        this.f947z = 0;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        this.K = new f0();
        i iVar = new i();
        iVar.f2787a = null;
        iVar.f2788b = new ArrayList();
        iVar.f2789c = 120L;
        iVar.f2790d = 120L;
        iVar.f2791e = 250L;
        iVar.f = 250L;
        iVar.f2793g = true;
        iVar.f2794h = new ArrayList();
        iVar.f2795i = new ArrayList();
        iVar.f2796j = new ArrayList();
        iVar.f2797k = new ArrayList();
        iVar.f2798l = new ArrayList();
        iVar.f2799m = new ArrayList();
        iVar.n = new ArrayList();
        iVar.f2800o = new ArrayList();
        iVar.f2801p = new ArrayList();
        iVar.f2802q = new ArrayList();
        iVar.f2803r = new ArrayList();
        this.P = iVar;
        this.Q = 0;
        this.R = -1;
        this.f911e0 = Float.MIN_VALUE;
        this.f912f0 = Float.MIN_VALUE;
        this.g0 = true;
        this.f915h0 = new w0(this);
        this.j0 = new h();
        u0 u0Var = new u0();
        u0Var.f2920a = -1;
        u0Var.f2921b = 0;
        u0Var.f2922c = 0;
        u0Var.f2923d = 1;
        u0Var.f2924e = 0;
        u0Var.f = false;
        u0Var.f2925g = false;
        u0Var.f2926h = false;
        u0Var.f2927i = false;
        u0Var.f2928j = false;
        u0Var.f2929k = false;
        this.f920k0 = u0Var;
        this.f925n0 = false;
        this.f927o0 = false;
        a0 a0Var = new a0(this);
        this.f929p0 = a0Var;
        this.f931q0 = false;
        this.f935s0 = new int[2];
        this.f939u0 = new int[2];
        this.v0 = new int[2];
        this.f942w0 = new int[2];
        this.f944x0 = new ArrayList();
        this.f946y0 = new y(this, 1);
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new a0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f908a0 = viewConfiguration.getScaledTouchSlop();
        this.f911e0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f912f0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f910c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.P.f2787a = a0Var;
        this.f916i = new o(new a0(this));
        this.f918j = new t(new a0(this));
        WeakHashMap weakHashMap = p0.f3233a;
        if (j0.a(this) == 0) {
            j0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new z0(this));
        int[] iArr = j1.a.f2452a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        p0.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i4);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f921l = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                q.q("Trying to set fast scroller without both required drawables.".concat(y()));
                throw null;
            }
            Resources resources = getContext().getResources();
            i5 = 4;
            new l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(co.median.android.eeqadjy.R.dimen.fastscroll_margin));
        } else {
            i5 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(l0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(E0);
                        objArr = new Object[i5];
                        objArr[0] = context;
                        objArr[r11] = attributeSet;
                        objArr[2] = Integer.valueOf(i4);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e5) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e6) {
                            e6.initCause(e5);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e6);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((l0) constructor.newInstance(objArr));
                } catch (ClassCastException e7) {
                    q.g(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e7);
                    throw null;
                } catch (ClassNotFoundException e8) {
                    q.g(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e8);
                    throw null;
                } catch (IllegalAccessException e9) {
                    q.g(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e9);
                    throw null;
                } catch (InstantiationException e10) {
                    q.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e10);
                    throw null;
                } catch (InvocationTargetException e11) {
                    q.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e11);
                    throw null;
                }
            }
        }
        int[] iArr2 = D0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        p0.l(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i4);
        boolean z4 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z4);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView recyclerViewD = D(viewGroup.getChildAt(i4));
            if (recyclerViewD != null) {
                return recyclerViewD;
            }
        }
        return null;
    }

    public static x0 I(View view) {
        if (view == null) {
            return null;
        }
        return ((m0) view.getLayoutParams()).f2851a;
    }

    private n getScrollingChildHelper() {
        if (this.f937t0 == null) {
            this.f937t0 = new n(this);
        }
        return this.f937t0;
    }

    public static void j(x0 x0Var) {
        WeakReference weakReference = x0Var.f2946b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == x0Var.f2945a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            x0Var.f2946b = null;
        }
    }

    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[SYNTHETIC] */
    public final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f938u;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            l lVar = (l) arrayList.get(i4);
            int i5 = lVar.f2832v;
            if (i5 == 1) {
                boolean zD = lVar.d(motionEvent.getX(), motionEvent.getY());
                boolean zC = lVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zD || zC)) {
                    if (zC) {
                        lVar.f2833w = 1;
                        lVar.f2826p = (int) motionEvent.getX();
                    } else if (zD) {
                        lVar.f2833w = 2;
                        lVar.f2824m = (int) motionEvent.getY();
                    }
                    lVar.f(2);
                    if (action != 3) {
                        this.f940v = lVar;
                        return true;
                    }
                }
            } else if (i5 != 2) {
                continue;
            } else if (action != 3) {
                this.f940v = lVar;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int iG = this.f918j.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < iG; i6++) {
            x0 x0VarI = I(this.f918j.f(i6));
            if (!x0VarI.o()) {
                int iB = x0VarI.b();
                if (iB < i4) {
                    i4 = iB;
                }
                if (iB > i5) {
                    i5 = iB;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
    }

    public final x0 E(int i4) {
        x0 x0Var = null;
        if (this.G) {
            return null;
        }
        int iN = this.f918j.n();
        for (int i5 = 0; i5 < iN; i5++) {
            x0 x0VarI = I(this.f918j.m(i5));
            if (x0VarI != null && !x0VarI.h() && F(x0VarI) == i4) {
                if (!((ArrayList) this.f918j.f580d).contains(x0VarI.f2945a)) {
                    return x0VarI;
                }
                x0Var = x0VarI;
            }
        }
        return x0Var;
    }

    public final int F(x0 x0Var) {
        if ((x0Var.f2953j & 524) == 0 && x0Var.e()) {
            int i4 = x0Var.f2947c;
            ArrayList arrayList = (ArrayList) this.f916i.f2595c;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                k1.a aVar = (k1.a) arrayList.get(i5);
                int i6 = aVar.f2725a;
                if (i6 != 1) {
                    if (i6 == 2) {
                        int i7 = aVar.f2726b;
                        if (i7 <= i4) {
                            int i8 = aVar.f2728d;
                            if (i7 + i8 <= i4) {
                                i4 -= i8;
                            }
                        } else {
                            continue;
                        }
                    } else if (i6 == 8) {
                        int i9 = aVar.f2726b;
                        if (i9 == i4) {
                            i4 = aVar.f2728d;
                        } else {
                            if (i9 < i4) {
                                i4--;
                            }
                            if (aVar.f2728d <= i4) {
                                i4++;
                            }
                        }
                    }
                } else if (aVar.f2726b <= i4) {
                    i4 += aVar.f2728d;
                }
            }
            return i4;
        }
        return -1;
    }

    public final long G(x0 x0Var) {
        return this.f930q.f2735b ? x0Var.f2949e : x0Var.f2947c;
    }

    public final x0 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        q.m("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect J(View view) {
        m0 m0Var = (m0) view.getLayoutParams();
        boolean z4 = m0Var.f2853c;
        Rect rect = m0Var.f2852b;
        if (!z4 || (this.f920k0.f2925g && (m0Var.f2851a.k() || m0Var.f2851a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f936t;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Rect rect2 = this.n;
            rect2.set(0, 0, 0, 0);
            ((i0) arrayList.get(i4)).getClass();
            ((m0) view.getLayoutParams()).f2851a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        m0Var.f2853c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f945y || this.G || this.f916i.j();
    }

    public final boolean L() {
        return this.I > 0;
    }

    public final void M(int i4) {
        if (this.f932r == null) {
            return;
        }
        setScrollState(2);
        this.f932r.o0(i4);
        awakenScrollBars();
    }

    public final void N() {
        int iN = this.f918j.n();
        for (int i4 = 0; i4 < iN; i4++) {
            ((m0) this.f918j.m(i4).getLayoutParams()).f2853c = true;
        }
        ArrayList arrayList = (ArrayList) this.f913g.f4290e;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            m0 m0Var = (m0) ((x0) arrayList.get(i5)).f2945a.getLayoutParams();
            if (m0Var != null) {
                m0Var.f2853c = true;
            }
        }
    }

    public final void O(int i4, boolean z4, int i5) {
        int i6 = i4 + i5;
        int iN = this.f918j.n();
        for (int i7 = 0; i7 < iN; i7++) {
            x0 x0VarI = I(this.f918j.m(i7));
            if (x0VarI != null && !x0VarI.o()) {
                int i8 = x0VarI.f2947c;
                u0 u0Var = this.f920k0;
                if (i8 >= i6) {
                    x0VarI.l(-i5, z4);
                    u0Var.f = true;
                } else if (i8 >= i4) {
                    x0VarI.a(8);
                    x0VarI.l(-i5, z4);
                    x0VarI.f2947c = i4 - 1;
                    u0Var.f = true;
                }
            }
        }
        v1.b bVar = this.f913g;
        ArrayList arrayList = (ArrayList) bVar.f4290e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x0 x0Var = (x0) arrayList.get(size);
            if (x0Var != null) {
                int i9 = x0Var.f2947c;
                if (i9 >= i6) {
                    x0Var.l(-i5, z4);
                } else if (i9 >= i4) {
                    x0Var.a(8);
                    bVar.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.I++;
    }

    public final void Q(boolean z4) {
        int i4;
        AccessibilityManager accessibilityManager;
        int i5 = this.I - 1;
        this.I = i5;
        if (i5 < 1) {
            this.I = 0;
            if (z4) {
                int i6 = this.D;
                this.D = 0;
                if (i6 != 0 && (accessibilityManager = this.F) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i6);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f944x0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    x0 x0Var = (x0) arrayList.get(size);
                    if (x0Var.f2945a.getParent() == this && !x0Var.o() && (i4 = x0Var.f2959q) != -1) {
                        View view = x0Var.f2945a;
                        WeakHashMap weakHashMap = p0.f3233a;
                        view.setImportantForAccessibility(i4);
                        x0Var.f2959q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.R = motionEvent.getPointerId(i4);
            int x4 = (int) (motionEvent.getX(i4) + 0.5f);
            this.V = x4;
            this.T = x4;
            int y4 = (int) (motionEvent.getY(i4) + 0.5f);
            this.W = y4;
            this.U = y4;
        }
    }

    public final void S() {
        if (this.f931q0 || !this.f941w) {
            return;
        }
        WeakHashMap weakHashMap = p0.f3233a;
        postOnAnimation(this.f946y0);
        this.f931q0 = true;
    }

    public final void T() {
        boolean z4;
        boolean z5 = false;
        if (this.G) {
            o oVar = this.f916i;
            oVar.q((ArrayList) oVar.f2595c);
            oVar.q((ArrayList) oVar.f2596d);
            oVar.f2593a = 0;
            if (this.H) {
                this.f932r.Y();
            }
        }
        boolean z6 = this.P != null && this.f932r.A0();
        o oVar2 = this.f916i;
        if (z6) {
            oVar2.p();
        } else {
            oVar2.d();
        }
        boolean z7 = this.f925n0 || this.f927o0;
        boolean z8 = this.f945y && this.P != null && ((z4 = this.G) || z7 || this.f932r.f) && (!z4 || this.f930q.f2735b);
        u0 u0Var = this.f920k0;
        u0Var.f2928j = z8;
        if (z8 && z7 && !this.G && this.P != null && this.f932r.A0()) {
            z5 = true;
        }
        u0Var.f2929k = z5;
    }

    public final void U(boolean z4) {
        this.H = z4 | this.H;
        this.G = true;
        int iN = this.f918j.n();
        for (int i4 = 0; i4 < iN; i4++) {
            x0 x0VarI = I(this.f918j.m(i4));
            if (x0VarI != null && !x0VarI.o()) {
                x0VarI.a(6);
            }
        }
        N();
        v1.b bVar = this.f913g;
        ArrayList arrayList = (ArrayList) bVar.f4290e;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            x0 x0Var = (x0) arrayList.get(i5);
            if (x0Var != null) {
                x0Var.a(6);
                x0Var.a(1024);
            }
        }
        b0 b0Var = ((RecyclerView) bVar.f4292h).f930q;
        if (b0Var == null || !b0Var.f2735b) {
            bVar.g();
        }
    }

    public final void V(x0 x0Var, g0 g0Var) {
        x0Var.f2953j &= -8193;
        boolean z4 = this.f920k0.f2926h;
        p pVar = this.f919k;
        if (z4 && x0Var.k() && !x0Var.h() && !x0Var.o()) {
            ((p.h) pVar.f569h).d(G(x0Var), x0Var);
        }
        k kVar = (k) pVar.f568g;
        f1 f1VarA = (f1) kVar.get(x0Var);
        if (f1VarA == null) {
            f1VarA = f1.a();
            kVar.put(x0Var, f1VarA);
        }
        f1VarA.f2773b = g0Var;
        f1VarA.f2772a |= 4;
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.n;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m0) {
            m0 m0Var = (m0) layoutParams;
            if (!m0Var.f2853c) {
                Rect rect2 = m0Var.f2852b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f932r.l0(this, view, this.n, !this.f945y, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        e0(0);
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.O.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = p0.f3233a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc A[DONT_INVERT, PHI: r7
      0x00fc: PHI (r7v10 boolean) = (r7v8 boolean), (r7v11 boolean) binds: [B:34:0x00e3, B:32:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    public final boolean Y(int i4, int i5, MotionEvent motionEvent, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        boolean z5;
        m();
        b0 b0Var = this.f930q;
        int[] iArr = this.f942w0;
        if (b0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            Z(i4, i5, iArr);
            i7 = iArr[0];
            i8 = iArr[1];
            i9 = i4 - i7;
            i10 = i5 - i8;
        } else {
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
        }
        if (!this.f936t.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i7, i8, i9, i10, this.f939u0, i6, iArr);
        int i11 = iArr[0];
        int i12 = i9 - i11;
        int i13 = iArr[1];
        int i14 = i10 - i13;
        boolean z6 = (i11 == 0 && i13 == 0) ? false : true;
        int i15 = this.V;
        int[] iArr2 = this.f939u0;
        int i16 = iArr2[0];
        this.V = i15 - i16;
        int i17 = this.W;
        int i18 = iArr2[1];
        this.W = i17 - i18;
        int[] iArr3 = this.v0;
        iArr3[0] = iArr3[0] + i16;
        iArr3[1] = iArr3[1] + i18;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z4 = true;
            } else {
                float x4 = motionEvent.getX();
                float f = i12;
                float y4 = motionEvent.getY();
                float f4 = i14;
                if (f < 0.0f) {
                    v();
                    z4 = true;
                    this.L.onPull((-f) / getWidth(), 1.0f - (y4 / getHeight()));
                } else {
                    z4 = true;
                    if (f > 0.0f) {
                        w();
                        this.N.onPull(f / getWidth(), y4 / getHeight());
                    } else {
                        z5 = false;
                    }
                    if (f4 < 0.0f) {
                        x();
                        this.M.onPull((-f4) / getHeight(), x4 / getWidth());
                    } else if (f4 > 0.0f) {
                        u();
                        this.O.onPull(f4 / getHeight(), 1.0f - (x4 / getWidth()));
                    } else if (z5 || f != 0.0f || f4 != 0.0f) {
                        WeakHashMap weakHashMap = p0.f3233a;
                        postInvalidateOnAnimation();
                    }
                    z5 = z4;
                    if (z5) {
                        WeakHashMap weakHashMap2 = p0.f3233a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap weakHashMap3 = p0.f3233a;
                        postInvalidateOnAnimation();
                    }
                }
                z5 = z4;
                if (f4 < 0.0f) {
                    x();
                    this.M.onPull((-f4) / getHeight(), x4 / getWidth());
                } else if (f4 > 0.0f) {
                    u();
                    this.O.onPull(f4 / getHeight(), 1.0f - (x4 / getWidth()));
                } else if (z5) {
                    WeakHashMap weakHashMap4 = p0.f3233a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap5 = p0.f3233a;
                    postInvalidateOnAnimation();
                }
                z5 = z4;
                if (z5) {
                    WeakHashMap weakHashMap6 = p0.f3233a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap7 = p0.f3233a;
                    postInvalidateOnAnimation();
                }
            }
            l(i4, i5);
        } else {
            z4 = true;
        }
        if (i7 != 0 || i8 != 0) {
            t(i7, i8);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z6 && i7 == 0 && i8 == 0) {
            return false;
        }
        return z4;
    }

    public final void Z(int i4, int i5, int[] iArr) {
        x0 x0Var;
        c0();
        P();
        int i6 = k0.i.f2724a;
        Trace.beginSection("RV Scroll");
        u0 u0Var = this.f920k0;
        z(u0Var);
        v1.b bVar = this.f913g;
        int iN0 = i4 != 0 ? this.f932r.n0(i4, u0Var, bVar) : 0;
        int iP0 = i5 != 0 ? this.f932r.p0(i5, u0Var, bVar) : 0;
        Trace.endSection();
        t tVar = this.f918j;
        int iG = tVar.g();
        for (int i7 = 0; i7 < iG; i7++) {
            View viewF = tVar.f(i7);
            x0 x0VarH = H(viewF);
            if (x0VarH != null && (x0Var = x0VarH.f2952i) != null) {
                View view = x0Var.f2945a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = iN0;
            iArr[1] = iP0;
        }
    }

    public final void a0(int i4) {
        u uVar;
        if (this.B) {
            return;
        }
        setScrollState(0);
        w0 w0Var = this.f915h0;
        w0Var.f2939l.removeCallbacks(w0Var);
        w0Var.f2935h.abortAnimation();
        l0 l0Var = this.f932r;
        if (l0Var != null && (uVar = l0Var.f2841e) != null) {
            uVar.i();
        }
        l0 l0Var2 = this.f932r;
        if (l0Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            l0Var2.o0(i4);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i5) {
        l0 l0Var = this.f932r;
        if (l0Var != null) {
            l0Var.getClass();
        }
        super.addFocusables(arrayList, i4, i5);
    }

    public final void b0(int i4, boolean z4, int i5) {
        l0 l0Var = this.f932r;
        if (l0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        if (!l0Var.d()) {
            i4 = 0;
        }
        if (!this.f932r.e()) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        if (z4) {
            int i6 = i4 != 0 ? 1 : 0;
            if (i5 != 0) {
                i6 |= 2;
            }
            getScrollingChildHelper().h(i6, 1);
        }
        this.f915h0.b(i4, i5, Integer.MIN_VALUE, null);
    }

    public final void c0() {
        int i4 = this.f947z + 1;
        this.f947z = i4;
        if (i4 != 1 || this.B) {
            return;
        }
        this.A = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m0) && this.f932r.f((m0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        l0 l0Var = this.f932r;
        if (l0Var != null && l0Var.d()) {
            return this.f932r.j(this.f920k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        l0 l0Var = this.f932r;
        if (l0Var != null && l0Var.d()) {
            return this.f932r.k(this.f920k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        l0 l0Var = this.f932r;
        if (l0Var != null && l0Var.d()) {
            return this.f932r.l(this.f920k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        l0 l0Var = this.f932r;
        if (l0Var != null && l0Var.e()) {
            return this.f932r.m(this.f920k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        l0 l0Var = this.f932r;
        if (l0Var != null && l0Var.e()) {
            return this.f932r.n(this.f920k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        l0 l0Var = this.f932r;
        if (l0Var != null && l0Var.e()) {
            return this.f932r.o(this.f920k0);
        }
        return 0;
    }

    public final void d0(boolean z4) {
        if (this.f947z < 1) {
            this.f947z = 1;
        }
        if (!z4 && !this.B) {
            this.A = false;
        }
        if (this.f947z == 1) {
            if (z4 && this.A && !this.B && this.f932r != null && this.f930q != null) {
                o();
            }
            if (!this.B) {
                this.A = false;
            }
        }
        this.f947z--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f4, boolean z4) {
        return getScrollingChildHelper().a(f, f4, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f4) {
        return getScrollingChildHelper().b(f, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().d(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        ArrayList arrayList = this.f936t;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i4 = 0; i4 < size; i4++) {
            ((i0) arrayList.get(i4)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f921l ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.L;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f921l) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.M;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.N;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f921l ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.N;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f921l) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.O;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z4 |= z5;
            canvas.restoreToCount(iSave4);
        }
        if ((z4 || this.P == null || arrayList.size() <= 0 || !this.P.f()) ? z4 : true) {
            WeakHashMap weakHashMap = p0.f3233a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public final void e0(int i4) {
        getScrollingChildHelper().i(i4);
    }

    public final void f(x0 x0Var) {
        View view = x0Var.f2945a;
        boolean z4 = view.getParent() == this;
        this.f913g.n(H(view));
        boolean zJ = x0Var.j();
        t tVar = this.f918j;
        if (zJ) {
            tVar.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z4) {
            tVar.a(view, -1, true);
            return;
        }
        int iIndexOfChild = ((a0) tVar.f578b).f2729a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            q.p(view, "view is not a child, cannot hide ");
        } else {
            ((k1.b) tVar.f579c).h(iIndexOfChild);
            tVar.p(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:137:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x019b  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i4) {
        View viewT;
        int i5;
        byte b5;
        boolean z4;
        this.f932r.getClass();
        boolean z5 = true;
        boolean z6 = (this.f930q == null || this.f932r == null || L() || this.B) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        u0 u0Var = this.f920k0;
        v1.b bVar = this.f913g;
        if (z6 && (i4 == 2 || i4 == 1)) {
            if (this.f932r.e()) {
                if (focusFinder.findNextFocus(this, view, i4 == 2 ? 130 : 33) == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            if (!z4 && this.f932r.d()) {
                z4 = focusFinder.findNextFocus(this, view, (this.f932r.C() == 1) ^ (i4 == 2) ? 66 : 17) == null;
            }
            if (z4) {
                m();
                if (A(view) != null) {
                    c0();
                    this.f932r.T(view, i4, bVar, u0Var);
                    d0(false);
                }
                return null;
            }
            viewT = focusFinder.findNextFocus(this, view, i4);
            if (viewT == null) {
            }
            if (viewT != null) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (z5) {
                return viewT;
            }
            return super.focusSearch(view, i4);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i4);
        if (viewFindNextFocus == null && z6) {
            m();
            if (A(view) != null) {
                c0();
                viewT = this.f932r.T(view, i4, bVar, u0Var);
                d0(false);
            }
            return null;
        }
        viewT = viewFindNextFocus;
        if (viewT == null && !viewT.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i4);
            }
            W(viewT, null);
            return view;
        }
        if (viewT != null || viewT == this || viewT == view) {
            z5 = false;
        } else if (A(viewT) == null) {
            z5 = false;
        } else if (view != null && A(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.n;
            rect.set(0, 0, width, height);
            int width2 = viewT.getWidth();
            int height2 = viewT.getHeight();
            Rect rect2 = this.f926o;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewT, rect2);
            int i6 = this.f932r.C() == 1 ? -1 : 1;
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                i5 = 1;
            } else {
                int i9 = rect.right;
                int i10 = rect2.right;
                i5 = ((i9 > i10 || i7 >= i10) && i7 > i8) ? -1 : 0;
            }
            int i11 = rect.top;
            int i12 = rect2.top;
            if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
                b5 = 1;
            } else {
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                b5 = ((i13 > i14 || i11 >= i14) && i11 > i12) ? (byte) -1 : (byte) 0;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 17) {
                        if (i4 != 33) {
                            if (i4 != 66) {
                                if (i4 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i4 + y());
                                }
                                if (b5 <= 0) {
                                    z5 = false;
                                }
                            } else if (i5 <= 0) {
                                z5 = false;
                            }
                        } else if (b5 >= 0) {
                            z5 = false;
                        }
                    } else if (i5 >= 0) {
                        z5 = false;
                    }
                } else if (b5 <= 0 && (b5 != 0 || i5 * i6 <= 0)) {
                    z5 = false;
                }
            } else if (b5 >= 0 && (b5 != 0 || i5 * i6 >= 0)) {
                z5 = false;
            }
        }
        if (z5) {
            return viewT;
        }
        return super.focusSearch(view, i4);
    }

    public final void g(i0 i0Var) {
        l0 l0Var = this.f932r;
        if (l0Var != null) {
            l0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f936t;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(i0Var);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l0 l0Var = this.f932r;
        if (l0Var != null) {
            return l0Var.r();
        }
        q.j("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l0 l0Var = this.f932r;
        if (l0Var != null) {
            return l0Var.s(getContext(), attributeSet);
        }
        q.j("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public b0 getAdapter() {
        return this.f930q;
    }

    @Override // android.view.View
    public int getBaseline() {
        l0 l0Var = this.f932r;
        if (l0Var == null) {
            return super.getBaseline();
        }
        l0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        return super.getChildDrawingOrder(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f921l;
    }

    public z0 getCompatAccessibilityDelegate() {
        return this.f933r0;
    }

    public f0 getEdgeEffectFactory() {
        return this.K;
    }

    public h0 getItemAnimator() {
        return this.P;
    }

    public int getItemDecorationCount() {
        return this.f936t.size();
    }

    public l0 getLayoutManager() {
        return this.f932r;
    }

    public int getMaxFlingVelocity() {
        return this.d0;
    }

    public int getMinFlingVelocity() {
        return this.f910c0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public n0 getOnFlingListener() {
        return this.f909b0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.g0;
    }

    public q0 getRecycledViewPool() {
        return this.f913g.e();
    }

    public int getScrollState() {
        return this.Q;
    }

    public final void h(o0 o0Var) {
        if (this.f924m0 == null) {
            this.f924m0 = new ArrayList();
        }
        this.f924m0.add(o0Var);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (!L()) {
            if (this.J > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(y()));
            }
        } else if (str == null) {
            q.j("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(y()));
        } else {
            q.j(str);
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f941w;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.B;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3223d;
    }

    public final void k() {
        int iN = this.f918j.n();
        for (int i4 = 0; i4 < iN; i4++) {
            x0 x0VarI = I(this.f918j.m(i4));
            if (!x0VarI.o()) {
                x0VarI.f2948d = -1;
                x0VarI.f2950g = -1;
            }
        }
        v1.b bVar = this.f913g;
        ArrayList arrayList = (ArrayList) bVar.f4288c;
        ArrayList arrayList2 = (ArrayList) bVar.f4290e;
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            x0 x0Var = (x0) arrayList2.get(i5);
            x0Var.f2948d = -1;
            x0Var.f2950g = -1;
        }
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            x0 x0Var2 = (x0) arrayList.get(i6);
            x0Var2.f2948d = -1;
            x0Var2.f2950g = -1;
        }
        ArrayList arrayList3 = (ArrayList) bVar.f4289d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i7 = 0; i7 < size3; i7++) {
                x0 x0Var3 = (x0) ((ArrayList) bVar.f4289d).get(i7);
                x0Var3.f2948d = -1;
                x0Var3.f2950g = -1;
            }
        }
    }

    public final void l(int i4, int i5) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            zIsFinished = false;
        } else {
            this.L.onRelease();
            zIsFinished = this.L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.N.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.O.onRelease();
            zIsFinished |= this.O.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = p0.f3233a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.f945y || this.G) {
            int i4 = k0.i.f2724a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        o oVar = this.f916i;
        if (oVar.j()) {
            int i5 = oVar.f2593a;
            if ((i5 & 4) == 0 || (i5 & 11) != 0) {
                if (oVar.j()) {
                    int i6 = k0.i.f2724a;
                    Trace.beginSection("RV FullInvalidate");
                    o();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i7 = k0.i.f2724a;
            Trace.beginSection("RV PartialInvalidate");
            c0();
            P();
            oVar.p();
            if (!this.A) {
                t tVar = this.f918j;
                int iG = tVar.g();
                for (int i8 = 0; i8 < iG; i8++) {
                    x0 x0VarI = I(tVar.f(i8));
                    if (x0VarI != null && !x0VarI.o() && x0VarI.k()) {
                        o();
                    }
                }
                oVar.c();
            }
            d0(true);
            Q(true);
            Trace.endSection();
        }
    }

    public final void n(int i4, int i5) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = p0.f3233a;
        setMeasuredDimension(l0.g(i4, paddingRight, getMinimumWidth()), l0.g(i5, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0357  */
    /* JADX WARN: Code duplicated, block: B:185:0x039d  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:193:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:195:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:197:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:200:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:203:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:206:0x03dc A[LOOP:4: B:199:0x03c9->B:206:0x03dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:212:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:215:0x03fa A[LOOP:5: B:208:0x03e7->B:215:0x03fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:247:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x03da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x03fd A[EDGE_INSN: B:251:0x03fd->B:216:0x03fd BREAK  A[LOOP:5: B:208:0x03e7->B:215:0x03fa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x03f8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void o() {
        boolean z4;
        long j4;
        x0 x0Var;
        int i4;
        int iB;
        int i5;
        int iMin;
        x0 x0VarE;
        View view;
        x0 x0VarE2;
        View view2;
        int i6;
        View viewFindViewById;
        View view3;
        boolean z5;
        g0 g0Var;
        ?? r4;
        boolean zG;
        boolean z6;
        if (this.f930q == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f932r == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        u0 u0Var = this.f920k0;
        boolean z7 = false;
        u0Var.f2927i = false;
        boolean z8 = true;
        boolean z9 = this.f948z0 && !(this.A0 == getWidth() && this.B0 == getHeight());
        this.A0 = 0;
        this.B0 = 0;
        this.f948z0 = false;
        if (u0Var.f2923d == 1) {
            p();
            this.f932r.q0(this);
            q();
        } else {
            o oVar = this.f916i;
            if ((((ArrayList) oVar.f2596d).isEmpty() || ((ArrayList) oVar.f2595c).isEmpty()) && !z9 && this.f932r.n == getWidth() && this.f932r.f2849o == getHeight()) {
                this.f932r.q0(this);
            } else {
                this.f932r.q0(this);
                q();
            }
        }
        u0Var.a(4);
        c0();
        P();
        u0Var.f2923d = 1;
        boolean z10 = u0Var.f2928j;
        v1.b bVar = this.f913g;
        p pVar = this.f919k;
        if (z10) {
            int iG = this.f918j.g() - 1;
            while (iG >= 0) {
                x0 x0VarI = I(this.f918j.f(iG));
                if (x0VarI.o()) {
                    z6 = z8;
                } else {
                    long jG = G(x0VarI);
                    this.P.getClass();
                    g0 g0Var2 = new g0();
                    g0Var2.a(x0VarI);
                    p.h hVar = (p.h) pVar.f569h;
                    k kVar = (k) pVar.f568g;
                    x0 x0Var2 = (x0) hVar.b(jG);
                    if (x0Var2 == null || x0Var2.o()) {
                        z6 = z8;
                        pVar.h(x0VarI, g0Var2);
                    } else {
                        z6 = z8;
                        f1 f1Var = (f1) kVar.get(x0Var2);
                        boolean z11 = (f1Var == null || (f1Var.f2772a & 1) == 0) ? false : z6;
                        f1 f1Var2 = (f1) kVar.get(x0VarI);
                        boolean z12 = (f1Var2 == null || (f1Var2.f2772a & 1) == 0) ? false : z6;
                        if (z11 && x0Var2 == x0VarI) {
                            pVar.h(x0VarI, g0Var2);
                        } else {
                            g0 g0VarV = pVar.v(x0Var2, 4);
                            pVar.h(x0VarI, g0Var2);
                            g0 g0VarV2 = pVar.v(x0VarI, 8);
                            if (g0VarV == null) {
                                int iG2 = this.f918j.g();
                                for (int i7 = 0; i7 < iG2; i7++) {
                                    x0 x0VarI2 = I(this.f918j.f(i7));
                                    if (x0VarI2 != x0VarI && G(x0VarI2) == jG) {
                                        b0 b0Var = this.f930q;
                                        if (b0Var == null || !b0Var.f2735b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + x0VarI2 + " \n View Holder 2:" + x0VarI + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + x0VarI2 + " \n View Holder 2:" + x0VarI + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + x0Var2 + " cannot be found but it is necessary for " + x0VarI + y());
                            } else {
                                x0Var2.n(false);
                                if (z11) {
                                    f(x0Var2);
                                }
                                if (x0Var2 != x0VarI) {
                                    if (z12) {
                                        f(x0VarI);
                                    }
                                    x0Var2.f2951h = x0VarI;
                                    f(x0Var2);
                                    bVar.n(x0Var2);
                                    x0VarI.n(false);
                                    x0VarI.f2952i = x0Var2;
                                }
                                if (this.P.a(x0Var2, x0VarI, g0VarV, g0VarV2)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                iG--;
                z8 = z6;
            }
            z4 = z8;
            k kVar2 = (k) pVar.f568g;
            int i8 = kVar2.f3157h - 1;
            while (i8 >= 0) {
                x0 x0Var3 = (x0) kVar2.f(i8);
                f1 f1Var3 = (f1) kVar2.g(i8);
                int i9 = f1Var3.f2772a;
                int i10 = i9 & 3;
                a0 a0Var = this.C0;
                if (i10 == 3) {
                    RecyclerView recyclerView = a0Var.f2729a;
                    recyclerView.f932r.j0(x0Var3.f2945a, recyclerView.f913g);
                    r4 = z7;
                } else if ((i9 & 1) != 0) {
                    g0 g0Var3 = f1Var3.f2773b;
                    if (g0Var3 == null) {
                        RecyclerView recyclerView2 = a0Var.f2729a;
                        recyclerView2.f932r.j0(x0Var3.f2945a, recyclerView2.f913g);
                        r4 = z7;
                    } else {
                        a0Var.g(x0Var3, g0Var3, f1Var3.f2774c);
                        r4 = z7;
                    }
                } else if ((i9 & 14) == 14) {
                    a0Var.f(x0Var3, f1Var3.f2773b, f1Var3.f2774c);
                    r4 = z7;
                } else {
                    if ((i9 & 12) == 12) {
                        g0 g0Var4 = f1Var3.f2773b;
                        g0 g0Var5 = f1Var3.f2774c;
                        a0Var.getClass();
                        x0Var3.n(z7);
                        RecyclerView recyclerView3 = a0Var.f2729a;
                        boolean z13 = recyclerView3.G;
                        h0 h0Var = recyclerView3.P;
                        if (!z13) {
                            i iVar = (i) h0Var;
                            iVar.getClass();
                            int i11 = g0Var4.f2780a;
                            int i12 = g0Var5.f2780a;
                            if (i11 == i12 && g0Var4.f2781b == g0Var5.f2781b) {
                                iVar.c(x0Var3);
                                zG = false;
                            } else {
                                zG = iVar.g(x0Var3, i11, g0Var4.f2781b, i12, g0Var5.f2781b);
                            }
                            if (zG) {
                                recyclerView3.S();
                            }
                        } else if (h0Var.a(x0Var3, x0Var3, g0Var4, g0Var5)) {
                            recyclerView3.S();
                        }
                        r4 = 0;
                    } else {
                        if ((i9 & 4) != 0) {
                            g0Var = null;
                            a0Var.g(x0Var3, f1Var3.f2773b, null);
                        } else {
                            g0Var = null;
                            if ((i9 & 8) != 0) {
                                a0Var.f(x0Var3, f1Var3.f2773b, f1Var3.f2774c);
                            }
                        }
                        r4 = 0;
                    }
                    f1Var3.f2772a = r4;
                    f1Var3.f2773b = g0Var;
                    f1Var3.f2774c = g0Var;
                    f1.f2771d.c(f1Var3);
                    i8--;
                    z7 = false;
                }
                g0Var = null;
                f1Var3.f2772a = r4;
                f1Var3.f2773b = g0Var;
                f1Var3.f2774c = g0Var;
                f1.f2771d.c(f1Var3);
                i8--;
                z7 = false;
            }
        } else {
            z4 = true;
        }
        View view4 = null;
        this.f932r.i0(bVar);
        u0Var.f2921b = u0Var.f2924e;
        this.G = false;
        this.H = false;
        u0Var.f2928j = false;
        u0Var.f2929k = false;
        this.f932r.f = false;
        ArrayList arrayList = (ArrayList) bVar.f4289d;
        if (arrayList != null) {
            arrayList.clear();
        }
        l0 l0Var = this.f932r;
        if (l0Var.f2846k) {
            l0Var.f2845j = 0;
            l0Var.f2846k = false;
            bVar.o();
        }
        this.f932r.d0(u0Var);
        boolean z14 = z4;
        Q(z14);
        d0(false);
        ((k) pVar.f568g).clear();
        ((p.h) pVar.f569h).a();
        int[] iArr = this.f935s0;
        int i13 = iArr[0];
        int i14 = iArr[z14 ? 1 : 0];
        C(iArr);
        if ((iArr[0] == i13 && iArr[z14 ? 1 : 0] == i14) ? false : true) {
            t(0, 0);
        }
        if (this.g0 && this.f930q != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j4 = u0Var.f2931m;
                if (j4 == -1) {
                    x0Var = null;
                } else {
                    x0Var = null;
                }
                if (x0Var != null) {
                    view3 = x0Var.f2945a;
                    if (!((ArrayList) this.f918j.f580d).contains(view3)) {
                        if (this.f918j.g() > 0) {
                            int i15 = u0Var.f2930l;
                            if (i15 != -1) {
                            }
                            iB = u0Var.b();
                            i5 = i4;
                            while (true) {
                                if (i5 < iB) {
                                    x0VarE2 = E(i5);
                                    if (x0VarE2 != null) {
                                        view2 = x0VarE2.f2945a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i5++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i4) - 1; iMin >= 0; iMin--) {
                                    x0VarE = E(iMin);
                                    if (x0VarE == null) {
                                        break;
                                        break;
                                    }
                                    view = x0VarE.f2945a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.f918j.g() > 0) {
                        int i16 = u0Var.f2930l;
                        if (i16 != -1) {
                        }
                        iB = u0Var.b();
                        i5 = i4;
                        while (true) {
                            if (i5 < iB) {
                                x0VarE2 = E(i5);
                                if (x0VarE2 != null) {
                                    view2 = x0VarE2.f2945a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                x0VarE = E(iMin);
                                if (x0VarE == null) {
                                    break;
                                    break;
                                }
                                view = x0VarE.f2945a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f918j.g() > 0) {
                    int i17 = u0Var.f2930l;
                    if (i17 != -1) {
                    }
                    iB = u0Var.b();
                    i5 = i4;
                    while (true) {
                        if (i5 < iB) {
                            x0VarE2 = E(i5);
                            if (x0VarE2 != null) {
                                view2 = x0VarE2.f2945a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            x0VarE = E(iMin);
                            if (x0VarE == null) {
                                break;
                                break;
                            }
                            view = x0VarE.f2945a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i6 = u0Var.n;
                    if (i6 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (((ArrayList) this.f918j.f580d).contains(getFocusedChild())) {
                j4 = u0Var.f2931m;
                if (j4 == -1 && (z5 = this.f930q.f2735b) && z5) {
                    int iN = this.f918j.n();
                    x0Var = null;
                    for (int i18 = 0; i18 < iN; i18++) {
                        x0 x0VarI3 = I(this.f918j.m(i18));
                        if (x0VarI3 != null && !x0VarI3.h() && x0VarI3.f2949e == j4) {
                            if (!((ArrayList) this.f918j.f580d).contains(x0VarI3.f2945a)) {
                                x0Var = x0VarI3;
                                break;
                            }
                            x0Var = x0VarI3;
                        }
                    }
                } else {
                    x0Var = null;
                }
                if (x0Var != null) {
                    view3 = x0Var.f2945a;
                    if (!((ArrayList) this.f918j.f580d).contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.f918j.g() > 0) {
                        int i19 = u0Var.f2930l;
                        i4 = i19 != -1 ? i19 : 0;
                        iB = u0Var.b();
                        i5 = i4;
                        while (true) {
                            if (i5 < iB) {
                                x0VarE2 = E(i5);
                                if (x0VarE2 != null) {
                                    view2 = x0VarE2.f2945a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                x0VarE = E(iMin);
                                if (x0VarE == null) {
                                    break;
                                }
                                view = x0VarE.f2945a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f918j.g() > 0) {
                    int i110 = u0Var.f2930l;
                    if (i110 != -1) {
                    }
                    iB = u0Var.b();
                    i5 = i4;
                    while (true) {
                        if (i5 < iB) {
                            x0VarE2 = E(i5);
                            if (x0VarE2 != null) {
                                view2 = x0VarE2.f2945a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            x0VarE = E(iMin);
                            if (x0VarE == null) {
                                break;
                                break;
                            }
                            view = x0VarE.f2945a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i6 = u0Var.n;
                    if (i6 != -1 && (viewFindViewById = view4.findViewById(i6)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        u0Var.f2931m = -1L;
        u0Var.f2930l = -1;
        u0Var.n = -1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.I = 0;
        this.f941w = true;
        this.f945y = this.f945y && !isLayoutRequested();
        l0 l0Var = this.f932r;
        if (l0Var != null) {
            l0Var.f2842g = true;
            l0Var.R(this);
        }
        this.f931q0 = false;
        ThreadLocal threadLocal = k1.o.f2860j;
        k1.o oVar = (k1.o) threadLocal.get();
        this.f917i0 = oVar;
        if (oVar == null) {
            k1.o oVar2 = new k1.o();
            oVar2.f = new ArrayList();
            oVar2.f2864i = new ArrayList();
            this.f917i0 = oVar2;
            WeakHashMap weakHashMap = p0.f3233a;
            Display display = getDisplay();
            if (isInEditMode() || display == null) {
                refreshRate = 60.0f;
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                    refreshRate = 60.0f;
                }
            }
            k1.o oVar3 = this.f917i0;
            oVar3.f2863h = (long) (1.0E9f / refreshRate);
            threadLocal.set(oVar3);
        }
        this.f917i0.f.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        u uVar;
        super.onDetachedFromWindow();
        h0 h0Var = this.P;
        if (h0Var != null) {
            h0Var.e();
        }
        setScrollState(0);
        w0 w0Var = this.f915h0;
        w0Var.f2939l.removeCallbacks(w0Var);
        w0Var.f2935h.abortAnimation();
        l0 l0Var = this.f932r;
        if (l0Var != null && (uVar = l0Var.f2841e) != null) {
            uVar.i();
        }
        this.f941w = false;
        l0 l0Var2 = this.f932r;
        if (l0Var2 != null) {
            l0Var2.f2842g = false;
            l0Var2.S(this);
        }
        this.f944x0.clear();
        removeCallbacks(this.f946y0);
        this.f919k.getClass();
        while (f1.f2771d.a() != null) {
        }
        k1.o oVar = this.f917i0;
        if (oVar != null) {
            oVar.f.remove(this);
            this.f917i0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f936t;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((i0) arrayList.get(i4)).a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.f932r != null && !this.B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.f932r.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f932r.d() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f932r.e()) {
                    f = -axisValue2;
                } else if (this.f932r.d()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                int i4 = (int) (axisValue * this.f911e0);
                int i5 = (int) (f * this.f912f0);
                l0 l0Var = this.f932r;
                if (l0Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return false;
                }
                if (!this.B) {
                    int[] iArr = this.f942w0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zD = l0Var.d();
                    boolean zE = this.f932r.e();
                    getScrollingChildHelper().h(zE ? (zD ? 1 : 0) | 2 : zD ? 1 : 0, 1);
                    if (r(zD ? i4 : 0, zE ? i5 : 0, 1, this.f942w0, this.f939u0)) {
                        i4 -= iArr[0];
                        i5 -= iArr[1];
                    }
                    Y(zD ? i4 : 0, zE ? i5 : 0, motionEvent, 1);
                    k1.o oVar = this.f917i0;
                    if (oVar != null && (i4 != 0 || i5 != 0)) {
                        oVar.a(this, i4, i5);
                    }
                    e0(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (!this.B) {
            this.f940v = null;
            if (B(motionEvent)) {
                X();
                setScrollState(0);
                return true;
            }
            l0 l0Var = this.f932r;
            if (l0Var != null) {
                boolean zD = l0Var.d();
                boolean zE = this.f932r.e();
                if (this.S == null) {
                    this.S = VelocityTracker.obtain();
                }
                this.S.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.C) {
                        this.C = false;
                    }
                    this.R = motionEvent.getPointerId(0);
                    int x4 = (int) (motionEvent.getX() + 0.5f);
                    this.V = x4;
                    this.T = x4;
                    int y4 = (int) (motionEvent.getY() + 0.5f);
                    this.W = y4;
                    this.U = y4;
                    if (this.Q == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        e0(1);
                    }
                    int[] iArr = this.v0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i4 = zD;
                    if (zE) {
                        i4 = (zD ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().h(i4, 0);
                } else if (actionMasked == 1) {
                    this.S.clear();
                    e0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.R);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x5 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y5 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.Q != 1) {
                        int i5 = x5 - this.T;
                        int i6 = y5 - this.U;
                        if (!zD || Math.abs(i5) <= this.f908a0) {
                            z4 = false;
                        } else {
                            this.V = x5;
                            z4 = true;
                        }
                        if (zE && Math.abs(i6) > this.f908a0) {
                            this.W = y5;
                            z4 = true;
                        }
                        if (z4) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    X();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.R = motionEvent.getPointerId(actionIndex);
                    int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.V = x6;
                    this.T = x6;
                    int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.W = y6;
                    this.U = y6;
                } else if (actionMasked == 6) {
                    R(motionEvent);
                }
                if (this.Q == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8 = k0.i.f2724a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f945y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        l0 l0Var = this.f932r;
        if (l0Var == null) {
            n(i4, i5);
            return;
        }
        boolean zL = l0Var.L();
        boolean z4 = false;
        u0 u0Var = this.f920k0;
        if (zL) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.f932r.f2838b.n(i4, i5);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z4 = true;
            }
            this.f948z0 = z4;
            if (z4 || this.f930q == null) {
                return;
            }
            if (u0Var.f2923d == 1) {
                p();
            }
            this.f932r.r0(i4, i5);
            u0Var.f2927i = true;
            q();
            this.f932r.t0(i4, i5);
            if (this.f932r.w0()) {
                this.f932r.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                u0Var.f2927i = true;
                q();
                this.f932r.t0(i4, i5);
            }
            this.A0 = getMeasuredWidth();
            this.B0 = getMeasuredHeight();
            return;
        }
        if (this.f943x) {
            this.f932r.f2838b.n(i4, i5);
            return;
        }
        if (this.E) {
            c0();
            P();
            T();
            Q(true);
            if (u0Var.f2929k) {
                u0Var.f2925g = true;
            } else {
                this.f916i.d();
                u0Var.f2925g = false;
            }
            this.E = false;
            d0(false);
        } else if (u0Var.f2929k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        b0 b0Var = this.f930q;
        if (b0Var != null) {
            u0Var.f2924e = b0Var.a();
        } else {
            u0Var.f2924e = 0;
        }
        c0();
        this.f932r.f2838b.n(i4, i5);
        d0(false);
        u0Var.f2925g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f914h = savedState;
        super.onRestoreInstanceState(savedState.f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f914h;
        if (savedState2 != null) {
            savedState.f949h = savedState2.f949h;
            return savedState;
        }
        l0 l0Var = this.f932r;
        if (l0Var != null) {
            savedState.f949h = l0Var.f0();
            return savedState;
        }
        savedState.f949h = null;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    /* JADX WARN: Code duplicated, block: B:194:0x034d  */
    /* JADX WARN: Code duplicated, block: B:257:0x040f  */
    /* JADX WARN: Code duplicated, block: B:259:0x0413 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:260:0x0415  */
    /* JADX WARN: Code duplicated, block: B:263:0x0444  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f6 A[PHI: r1
      0x01f6: PHI (r1v53 int) = (r1v38 int), (r1v57 int) binds: [B:90:0x01e1, B:95:0x01f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zB;
        int i4;
        int i5;
        w0 w0Var;
        RecyclerView recyclerView;
        Interpolator interpolator;
        z zVar;
        int minFlingVelocity;
        boolean z4;
        g gVarD;
        int iH;
        PointF pointFA;
        int i6;
        int i7;
        boolean z5;
        if (!this.B && !this.C) {
            l lVar = this.f940v;
            if (lVar == null) {
                zB = motionEvent.getAction() == 0 ? false : B(motionEvent);
            } else {
                int i8 = lVar.f2814b;
                if (lVar.f2832v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean zD = lVar.d(motionEvent.getX(), motionEvent.getY());
                        boolean zC = lVar.c(motionEvent.getX(), motionEvent.getY());
                        if (zD || zC) {
                            if (zC) {
                                lVar.f2833w = 1;
                                lVar.f2826p = (int) motionEvent.getX();
                            } else if (zD) {
                                lVar.f2833w = 2;
                                lVar.f2824m = (int) motionEvent.getY();
                            }
                            lVar.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && lVar.f2832v == 2) {
                        lVar.f2824m = 0.0f;
                        lVar.f2826p = 0.0f;
                        lVar.f(1);
                        lVar.f2833w = 0;
                    } else if (motionEvent.getAction() == 2 && lVar.f2832v == 2) {
                        lVar.g();
                        if (lVar.f2833w == 1) {
                            float x4 = motionEvent.getX();
                            int[] iArr = lVar.f2835y;
                            iArr[0] = i8;
                            int i9 = lVar.f2827q - i8;
                            iArr[1] = i9;
                            float fMax = Math.max(i8, Math.min(i9, x4));
                            if (Math.abs(lVar.f2825o - fMax) >= 2.0f) {
                                int iE = l.e(lVar.f2826p, fMax, iArr, lVar.f2829s.computeHorizontalScrollRange(), lVar.f2829s.computeHorizontalScrollOffset(), lVar.f2827q);
                                if (iE != 0) {
                                    lVar.f2829s.scrollBy(iE, 0);
                                }
                                lVar.f2826p = fMax;
                            }
                        }
                        if (lVar.f2833w == 2) {
                            float y4 = motionEvent.getY();
                            int[] iArr2 = lVar.f2834x;
                            iArr2[0] = i8;
                            int i10 = lVar.f2828r - i8;
                            iArr2[1] = i10;
                            float fMax2 = Math.max(i8, Math.min(i10, y4));
                            if (Math.abs(lVar.f2823l - fMax2) >= 2.0f) {
                                int iE2 = l.e(lVar.f2824m, fMax2, iArr2, lVar.f2829s.computeVerticalScrollRange(), lVar.f2829s.computeVerticalScrollOffset(), lVar.f2828r);
                                if (iE2 != 0) {
                                    lVar.f2829s.scrollBy(0, iE2);
                                }
                                lVar.f2824m = fMax2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f940v = null;
                }
                zB = true;
            }
            if (zB) {
                X();
                setScrollState(0);
                return true;
            }
            l0 l0Var = this.f932r;
            if (l0Var != null) {
                boolean zD2 = l0Var.d();
                boolean zE = this.f932r.e();
                if (this.S == null) {
                    this.S = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.v0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.S.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker = this.S;
                        int i11 = this.d0;
                        velocityTracker.computeCurrentVelocity(1000, i11);
                        float f = zD2 ? -this.S.getXVelocity(this.R) : 0.0f;
                        float f4 = zE ? -this.S.getYVelocity(this.R) : 0.0f;
                        if (f == 0.0f && f4 == 0.0f) {
                            i7 = 0;
                        } else {
                            int i12 = (int) f;
                            int i13 = (int) f4;
                            l0 l0Var2 = this.f932r;
                            if (l0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.B) {
                                int iD = l0Var2.d();
                                boolean zE2 = this.f932r.e();
                                int i14 = this.f910c0;
                                if (iD == 0 || Math.abs(i12) < i14) {
                                    i12 = 0;
                                }
                                if (!zE2 || Math.abs(i13) < i14) {
                                    i13 = 0;
                                }
                                if (i12 != 0 || i13 != 0) {
                                    float f5 = i12;
                                    float f6 = i13;
                                    if (!dispatchNestedPreFling(f5, f6)) {
                                        boolean z6 = iD != 0 || zE2;
                                        dispatchNestedFling(f5, f6, z6);
                                        n0 n0Var = this.f909b0;
                                        if (n0Var != null) {
                                            x xVar = (x) n0Var;
                                            l0 layoutManager = xVar.f2940a.getLayoutManager();
                                            if (layoutManager == 0 || xVar.f2940a.getAdapter() == null || ((Math.abs(i13) <= (minFlingVelocity = xVar.f2940a.getMinFlingVelocity()) && Math.abs(i12) <= minFlingVelocity) || !((z4 = layoutManager instanceof t0)))) {
                                                i5 = 1;
                                                if (z6) {
                                                    if (zE2) {
                                                        iD = (iD == true ? 1 : 0) | 2;
                                                    }
                                                    getScrollingChildHelper().h(iD, i5);
                                                    int i15 = -i11;
                                                    int iMax = Math.max(i15, Math.min(i12, i11));
                                                    int iMax2 = Math.max(i15, Math.min(i13, i11));
                                                    w0Var = this.f915h0;
                                                    recyclerView = w0Var.f2939l;
                                                    recyclerView.setScrollState(2);
                                                    w0Var.f2934g = 0;
                                                    w0Var.f = 0;
                                                    interpolator = w0Var.f2936i;
                                                    zVar = F0;
                                                    if (interpolator != zVar) {
                                                        w0Var.f2936i = zVar;
                                                        w0Var.f2935h = new OverScroller(recyclerView.getContext(), zVar);
                                                    }
                                                    w0Var.f2935h.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                                                    w0Var.a();
                                                }
                                            } else {
                                                w wVar = !z4 ? null : new w(xVar, xVar.f2940a.getContext());
                                                if (wVar == null) {
                                                    i5 = 1;
                                                } else {
                                                    int iB = layoutManager.B();
                                                    if (iB != 0) {
                                                        if (layoutManager.e()) {
                                                            gVarD = xVar.e(layoutManager);
                                                        } else {
                                                            gVarD = layoutManager.d() ? xVar.d(layoutManager) : null;
                                                        }
                                                        if (gVarD == null) {
                                                            i5 = 1;
                                                        } else {
                                                            int iV = layoutManager.v();
                                                            int i16 = Integer.MIN_VALUE;
                                                            int i17 = Integer.MAX_VALUE;
                                                            View view = null;
                                                            View view2 = null;
                                                            i5 = 1;
                                                            int i18 = 0;
                                                            while (i18 < iV) {
                                                                int i19 = iV;
                                                                View viewU = layoutManager.u(i18);
                                                                if (viewU == null) {
                                                                    i6 = i18;
                                                                } else {
                                                                    i6 = i18;
                                                                    int iB2 = x.b(viewU, gVarD);
                                                                    if (iB2 <= 0 && iB2 > i16) {
                                                                        view2 = viewU;
                                                                        i16 = iB2;
                                                                    }
                                                                    if (iB2 >= 0 && iB2 < i17) {
                                                                        view = viewU;
                                                                        i17 = iB2;
                                                                    }
                                                                }
                                                                i18 = i6 + 1;
                                                                iV = i19;
                                                            }
                                                            boolean z7 = !layoutManager.d() ? i13 <= 0 : i12 <= 0;
                                                            if (z7 && view != null) {
                                                                iH = l0.H(view);
                                                            } else if (z7 || view2 == null) {
                                                                if (z7) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    iH = ((z4 && (pointFA = ((t0) layoutManager).a(layoutManager.B() + (-1))) != null && ((pointFA.x > r5 ? 1 : (pointFA.x == r5 ? 0 : -1)) < 0 || (pointFA.y > 0 ? 1 : (pointFA.y == 0 ? 0 : -1)) < 0)) == z7 ? -1 : 1) + l0.H(view);
                                                                    if (iH < 0 || iH >= iB) {
                                                                    }
                                                                }
                                                            } else {
                                                                iH = l0.H(view2);
                                                            }
                                                        }
                                                        iH = -1;
                                                    } else {
                                                        i5 = 1;
                                                        iH = -1;
                                                    }
                                                    if (iH != -1) {
                                                        wVar.f2906a = iH;
                                                        layoutManager.z0(wVar);
                                                    }
                                                }
                                                if (z6) {
                                                    if (zE2) {
                                                        iD = (iD == true ? 1 : 0) | 2;
                                                    }
                                                    getScrollingChildHelper().h(iD, i5);
                                                    int i110 = -i11;
                                                    int iMax3 = Math.max(i110, Math.min(i12, i11));
                                                    int iMax4 = Math.max(i110, Math.min(i13, i11));
                                                    w0Var = this.f915h0;
                                                    recyclerView = w0Var.f2939l;
                                                    recyclerView.setScrollState(2);
                                                    w0Var.f2934g = 0;
                                                    w0Var.f = 0;
                                                    interpolator = w0Var.f2936i;
                                                    zVar = F0;
                                                    if (interpolator != zVar) {
                                                        w0Var.f2936i = zVar;
                                                        w0Var.f2935h = new OverScroller(recyclerView.getContext(), zVar);
                                                    }
                                                    w0Var.f2935h.fling(0, 0, iMax3, iMax4, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                                                    w0Var.a();
                                                }
                                            }
                                        } else {
                                            i5 = 1;
                                            if (z6) {
                                                if (zE2) {
                                                    iD = (iD == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().h(iD, i5);
                                                int i111 = -i11;
                                                int iMax5 = Math.max(i111, Math.min(i12, i11));
                                                int iMax6 = Math.max(i111, Math.min(i13, i11));
                                                w0Var = this.f915h0;
                                                recyclerView = w0Var.f2939l;
                                                recyclerView.setScrollState(2);
                                                w0Var.f2934g = 0;
                                                w0Var.f = 0;
                                                interpolator = w0Var.f2936i;
                                                zVar = F0;
                                                if (interpolator != zVar) {
                                                    w0Var.f2936i = zVar;
                                                    w0Var.f2935h = new OverScroller(recyclerView.getContext(), zVar);
                                                }
                                                w0Var.f2935h.fling(0, 0, iMax5, iMax6, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                                                w0Var.a();
                                            }
                                        }
                                        X();
                                    }
                                }
                            }
                            i7 = 0;
                        }
                        setScrollState(i7);
                        X();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.R);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x5 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y5 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax7 = this.V - x5;
                        int iMax8 = this.W - y5;
                        if (this.Q != 1) {
                            if (zD2) {
                                int i20 = this.f908a0;
                                iMax7 = iMax7 > 0 ? Math.max(0, iMax7 - i20) : Math.min(0, iMax7 + i20);
                                if (iMax7 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                            } else {
                                z5 = false;
                            }
                            if (zE) {
                                int i21 = this.f908a0;
                                iMax8 = iMax8 > 0 ? Math.max(0, iMax8 - i21) : Math.min(0, iMax8 + i21);
                                if (iMax8 != 0) {
                                    z5 = true;
                                }
                            }
                            if (z5) {
                                setScrollState(1);
                            }
                        }
                        int i22 = iMax7;
                        int i23 = iMax8;
                        if (this.Q == 1) {
                            int[] iArr4 = this.f942w0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            boolean zR = r(zD2 ? i22 : 0, zE ? i23 : 0, 0, iArr4, this.f939u0);
                            int[] iArr5 = this.f939u0;
                            if (zR) {
                                i22 -= iArr4[0];
                                i23 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i24 = i23;
                            this.V = x5 - iArr5[0];
                            this.W = y5 - iArr5[1];
                            if (Y(zD2 ? i22 : 0, zE ? i24 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            k1.o oVar = this.f917i0;
                            if (oVar != null && (i22 != 0 || i24 != 0)) {
                                oVar.a(this, i22, i24);
                            }
                        }
                    } else if (actionMasked == 3) {
                        X();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.R = motionEvent.getPointerId(actionIndex);
                        int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.V = x6;
                        this.T = x6;
                        int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.W = y6;
                        this.U = y6;
                    } else if (actionMasked == 6) {
                        R(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.R = motionEvent.getPointerId(0);
                int x7 = (int) (motionEvent.getX() + 0.5f);
                this.V = x7;
                this.T = x7;
                int y7 = (int) (motionEvent.getY() + 0.5f);
                this.W = y7;
                this.U = y7;
                if (zE) {
                    i4 = zD2;
                    i4 = (zD2 ? 1 : 0) | 2;
                }
                i4 = zD2;
                getScrollingChildHelper().h(i4, 0);
                this.S.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    public final void p() {
        int iF;
        f1 f1Var;
        View viewA;
        u0 u0Var = this.f920k0;
        u0Var.a(1);
        z(u0Var);
        u0Var.f2927i = false;
        c0();
        p pVar = this.f919k;
        k kVar = (k) pVar.f568g;
        k kVar2 = (k) pVar.f568g;
        kVar.clear();
        p.h hVar = (p.h) pVar.f569h;
        hVar.a();
        P();
        T();
        x0 x0VarH = null;
        View focusedChild = (this.g0 && hasFocus() && this.f930q != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewA = A(focusedChild)) != null) {
            x0VarH = H(viewA);
        }
        if (x0VarH == null) {
            u0Var.f2931m = -1L;
            u0Var.f2930l = -1;
            u0Var.n = -1;
        } else {
            u0Var.f2931m = this.f930q.f2735b ? x0VarH.f2949e : -1L;
            if (this.G) {
                iF = -1;
            } else if (x0VarH.h()) {
                iF = x0VarH.f2948d;
            } else {
                RecyclerView recyclerView = x0VarH.f2960r;
                if (recyclerView == null) {
                    iF = -1;
                } else {
                    iF = recyclerView.F(x0VarH);
                }
            }
            u0Var.f2930l = iF;
            View focusedChild2 = x0VarH.f2945a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            u0Var.n = id;
        }
        u0Var.f2926h = u0Var.f2928j && this.f927o0;
        this.f927o0 = false;
        this.f925n0 = false;
        u0Var.f2925g = u0Var.f2929k;
        u0Var.f2924e = this.f930q.a();
        C(this.f935s0);
        if (u0Var.f2928j) {
            int iG = this.f918j.g();
            for (int i4 = 0; i4 < iG; i4++) {
                x0 x0VarI = I(this.f918j.f(i4));
                if (!x0VarI.o() && (!x0VarI.f() || this.f930q.f2735b)) {
                    h0 h0Var = this.P;
                    h0.b(x0VarI);
                    x0VarI.c();
                    h0Var.getClass();
                    g0 g0Var = new g0();
                    g0Var.a(x0VarI);
                    f1 f1VarA = (f1) kVar2.get(x0VarI);
                    if (f1VarA == null) {
                        f1VarA = f1.a();
                        kVar2.put(x0VarI, f1VarA);
                    }
                    f1VarA.f2773b = g0Var;
                    f1VarA.f2772a |= 4;
                    if (u0Var.f2926h && x0VarI.k() && !x0VarI.h() && !x0VarI.o() && !x0VarI.f()) {
                        hVar.d(G(x0VarI), x0VarI);
                    }
                }
            }
        }
        if (u0Var.f2929k) {
            int iN = this.f918j.n();
            for (int i5 = 0; i5 < iN; i5++) {
                x0 x0VarI2 = I(this.f918j.m(i5));
                if (!x0VarI2.o() && x0VarI2.f2948d == -1) {
                    x0VarI2.f2948d = x0VarI2.f2947c;
                }
            }
            boolean z4 = u0Var.f;
            u0Var.f = false;
            this.f932r.c0(this.f913g, u0Var);
            u0Var.f = z4;
            for (int i6 = 0; i6 < this.f918j.g(); i6++) {
                x0 x0VarI3 = I(this.f918j.f(i6));
                if (!x0VarI3.o() && ((f1Var = (f1) kVar2.get(x0VarI3)) == null || (f1Var.f2772a & 4) == 0)) {
                    h0.b(x0VarI3);
                    boolean z5 = (x0VarI3.f2953j & 8192) != 0;
                    h0 h0Var2 = this.P;
                    x0VarI3.c();
                    h0Var2.getClass();
                    g0 g0Var2 = new g0();
                    g0Var2.a(x0VarI3);
                    if (z5) {
                        V(x0VarI3, g0Var2);
                    } else {
                        f1 f1VarA2 = (f1) kVar2.get(x0VarI3);
                        if (f1VarA2 == null) {
                            f1VarA2 = f1.a();
                            kVar2.put(x0VarI3, f1VarA2);
                        }
                        f1VarA2.f2772a |= 2;
                        f1VarA2.f2773b = g0Var2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        d0(false);
        u0Var.f2923d = 2;
    }

    public final void q() {
        c0();
        P();
        u0 u0Var = this.f920k0;
        u0Var.a(6);
        this.f916i.d();
        u0Var.f2924e = this.f930q.a();
        u0Var.f2922c = 0;
        if (this.f914h != null) {
            b0 b0Var = this.f930q;
            int iB = s.e.b(b0Var.f2736c);
            if (iB == 1 ? b0Var.a() > 0 : iB != 2) {
                Parcelable parcelable = this.f914h.f949h;
                if (parcelable != null) {
                    this.f932r.e0(parcelable);
                }
                this.f914h = null;
            }
        }
        u0Var.f2925g = false;
        this.f932r.c0(this.f913g, u0Var);
        u0Var.f = false;
        u0Var.f2928j = u0Var.f2928j && this.P != null;
        u0Var.f2923d = 4;
        Q(true);
        d0(false);
    }

    public final boolean r(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, i6, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        x0 x0VarI = I(view);
        if (x0VarI != null) {
            if (x0VarI.j()) {
                x0VarI.f2953j &= -257;
            } else if (!x0VarI.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + x0VarI + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        u uVar = this.f932r.f2841e;
        if ((uVar == null || !uVar.f2910e) && !L() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.f932r.l0(this, view, rect, z4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        ArrayList arrayList = this.f938u;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((l) arrayList.get(i4)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f947z != 0 || this.B) {
            this.A = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        getScrollingChildHelper().d(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i4, int i5) {
        l0 l0Var = this.f932r;
        if (l0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        boolean zD = l0Var.d();
        boolean zE = this.f932r.e();
        if (zD || zE) {
            if (!zD) {
                i4 = 0;
            }
            if (!zE) {
                i5 = 0;
            }
            Y(i4, i5, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.D |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(z0 z0Var) {
        this.f933r0 = z0Var;
        p0.m(this, z0Var);
    }

    public void setAdapter(b0 b0Var) {
        setLayoutFrozen(false);
        b0 b0Var2 = this.f930q;
        b bVar = this.f;
        if (b0Var2 != null) {
            b0Var2.f2734a.unregisterObserver(bVar);
            this.f930q.getClass();
        }
        h0 h0Var = this.P;
        if (h0Var != null) {
            h0Var.e();
        }
        l0 l0Var = this.f932r;
        v1.b bVar2 = this.f913g;
        if (l0Var != null) {
            l0Var.h0(bVar2);
            this.f932r.i0(bVar2);
        }
        ((ArrayList) bVar2.f4288c).clear();
        bVar2.g();
        o oVar = this.f916i;
        oVar.q((ArrayList) oVar.f2595c);
        oVar.q((ArrayList) oVar.f2596d);
        oVar.f2593a = 0;
        b0 b0Var3 = this.f930q;
        this.f930q = b0Var;
        if (b0Var != null) {
            b0Var.f2734a.registerObserver(bVar);
        }
        l0 l0Var2 = this.f932r;
        if (l0Var2 != null) {
            l0Var2.Q();
        }
        b0 b0Var4 = this.f930q;
        ((ArrayList) bVar2.f4288c).clear();
        bVar2.g();
        q0 q0VarE = bVar2.e();
        if (b0Var3 != null) {
            q0VarE.f2879b--;
        }
        if (q0VarE.f2879b == 0) {
            SparseArray sparseArray = q0VarE.f2878a;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                ((k1.p0) sparseArray.valueAt(i4)).f2866a.clear();
            }
        }
        if (b0Var4 != null) {
            q0VarE.f2879b++;
        }
        this.f920k0.f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(e0 e0Var) {
        if (e0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.f921l) {
            this.O = null;
            this.M = null;
            this.N = null;
            this.L = null;
        }
        this.f921l = z4;
        super.setClipToPadding(z4);
        if (this.f945y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(f0 f0Var) {
        f0Var.getClass();
        this.K = f0Var;
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    public void setHasFixedSize(boolean z4) {
        this.f943x = z4;
    }

    public void setItemAnimator(h0 h0Var) {
        h0 h0Var2 = this.P;
        if (h0Var2 != null) {
            h0Var2.e();
            this.P.f2787a = null;
        }
        this.P = h0Var;
        if (h0Var != null) {
            h0Var.f2787a = this.f929p0;
        }
    }

    public void setItemViewCacheSize(int i4) {
        v1.b bVar = this.f913g;
        bVar.f4286a = i4;
        bVar.o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z4) {
        suppressLayout(z4);
    }

    public void setLayoutManager(l0 l0Var) {
        RecyclerView recyclerView;
        u uVar;
        if (l0Var == this.f932r) {
            return;
        }
        setScrollState(0);
        w0 w0Var = this.f915h0;
        w0Var.f2939l.removeCallbacks(w0Var);
        w0Var.f2935h.abortAnimation();
        l0 l0Var2 = this.f932r;
        if (l0Var2 != null && (uVar = l0Var2.f2841e) != null) {
            uVar.i();
        }
        l0 l0Var3 = this.f932r;
        v1.b bVar = this.f913g;
        if (l0Var3 != null) {
            h0 h0Var = this.P;
            if (h0Var != null) {
                h0Var.e();
            }
            this.f932r.h0(bVar);
            this.f932r.i0(bVar);
            ((ArrayList) bVar.f4288c).clear();
            bVar.g();
            if (this.f941w) {
                l0 l0Var4 = this.f932r;
                l0Var4.f2842g = false;
                l0Var4.S(this);
            }
            this.f932r.u0(null);
            this.f932r = null;
        } else {
            ((ArrayList) bVar.f4288c).clear();
            bVar.g();
        }
        t tVar = this.f918j;
        ((k1.b) tVar.f579c).g();
        ArrayList arrayList = (ArrayList) tVar.f580d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((a0) tVar.f578b).f2729a;
            if (size < 0) {
                break;
            }
            x0 x0VarI = I((View) arrayList.get(size));
            if (x0VarI != null) {
                int i4 = x0VarI.f2958p;
                if (recyclerView.L()) {
                    x0VarI.f2959q = i4;
                    recyclerView.f944x0.add(x0VarI);
                } else {
                    View view = x0VarI.f2945a;
                    WeakHashMap weakHashMap = p0.f3233a;
                    view.setImportantForAccessibility(i4);
                }
                x0VarI.f2958p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f932r = l0Var;
        if (l0Var != null) {
            if (l0Var.f2838b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(l0Var);
                String strY = l0Var.f2838b.y();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(strY);
                throw new IllegalArgumentException(sb.toString());
            }
            l0Var.u0(this);
            if (this.f941w) {
                l0 l0Var5 = this.f932r;
                l0Var5.f2842g = true;
                l0Var5.R(this);
            }
        }
        bVar.o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            q.q("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        getScrollingChildHelper().g(z4);
    }

    public void setOnFlingListener(n0 n0Var) {
        this.f909b0 = n0Var;
    }

    @Deprecated
    public void setOnScrollListener(o0 o0Var) {
        this.f922l0 = o0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.g0 = z4;
    }

    public void setRecycledViewPool(q0 q0Var) {
        v1.b bVar = this.f913g;
        q0 q0Var2 = (q0) bVar.f4291g;
        if (q0Var2 != null) {
            q0Var2.f2879b--;
        }
        bVar.f4291g = q0Var;
        if (q0Var == null || ((RecyclerView) bVar.f4292h).getAdapter() == null) {
            return;
        }
        ((q0) bVar.f4291g).f2879b++;
    }

    public void setScrollState(int i4) {
        u uVar;
        if (i4 == this.Q) {
            return;
        }
        this.Q = i4;
        if (i4 != 2) {
            w0 w0Var = this.f915h0;
            w0Var.f2939l.removeCallbacks(w0Var);
            w0Var.f2935h.abortAnimation();
            l0 l0Var = this.f932r;
            if (l0Var != null && (uVar = l0Var.f2841e) != null) {
                uVar.i();
            }
        }
        l0 l0Var2 = this.f932r;
        if (l0Var2 != null) {
            l0Var2.g0(i4);
        }
        o0 o0Var = this.f922l0;
        if (o0Var != null) {
            o0Var.a(this, i4);
        }
        ArrayList arrayList = this.f924m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o0) this.f924m0.get(size)).a(this, i4);
            }
        }
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 == 1) {
                this.f908a0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
        }
        this.f908a0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(v0 v0Var) {
        this.f913g.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().h(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z4) {
        u uVar;
        if (z4 != this.B) {
            i("Do not suppressLayout in layout or scroll");
            if (!z4) {
                this.B = false;
                if (this.A && this.f932r != null && this.f930q != null) {
                    requestLayout();
                }
                this.A = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.B = true;
            this.C = true;
            setScrollState(0);
            w0 w0Var = this.f915h0;
            w0Var.f2939l.removeCallbacks(w0Var);
            w0Var.f2935h.abortAnimation();
            l0 l0Var = this.f932r;
            if (l0Var == null || (uVar = l0Var.f2841e) == null) {
                return;
            }
            uVar.i();
        }
    }

    public final void t(int i4, int i5) {
        this.J++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i5);
        o0 o0Var = this.f922l0;
        if (o0Var != null) {
            o0Var.b(this, i4, i5);
        }
        ArrayList arrayList = this.f924m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o0) this.f924m0.get(size)).b(this, i4, i5);
            }
        }
        this.J--;
    }

    public final void u() {
        if (this.O != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.O = edgeEffect;
        if (this.f921l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.L != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.f921l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.N != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.f921l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.M != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.f921l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f930q + ", layout:" + this.f932r + ", context:" + getContext();
    }

    public final void z(u0 u0Var) {
        if (getScrollState() != 2) {
            u0Var.getClass();
            return;
        }
        OverScroller overScroller = this.f915h0.f2935h;
        overScroller.getFinalX();
        overScroller.getCurrX();
        u0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l0 l0Var = this.f932r;
        if (l0Var != null) {
            return l0Var.t(layoutParams);
        }
        q.j("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(r0 r0Var) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, co.median.android.eeqadjy.R.attr.recyclerViewStyle);
    }
}
