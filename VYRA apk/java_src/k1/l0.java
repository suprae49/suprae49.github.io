package k1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.t f2837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f2838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.emoji2.text.p f2839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.emoji2.text.p f2840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f2841e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2848m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2849o;

    public l0() {
        j0 j0Var = new j0(this, 0);
        j0 j0Var2 = new j0(this, 1);
        this.f2839c = new androidx.emoji2.text.p(j0Var);
        this.f2840d = new androidx.emoji2.text.p(j0Var2);
        this.f = false;
        this.f2842g = false;
        this.f2843h = true;
        this.f2844i = true;
    }

    public static int A(View view) {
        Rect rect = ((m0) view.getLayoutParams()).f2852b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((m0) view.getLayoutParams()).f2851a.b();
    }

    public static k0 I(Context context, AttributeSet attributeSet, int i4, int i5) {
        k0 k0Var = new k0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.a.f2452a, i4, i5);
        k0Var.f2809a = typedArrayObtainStyledAttributes.getInt(0, 1);
        k0Var.f2810b = typedArrayObtainStyledAttributes.getInt(10, 1);
        k0Var.f2811c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        k0Var.f2812d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return k0Var;
    }

    public static boolean M(int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (i6 > 0 && i4 != i6) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i4;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i4;
        }
        return true;
    }

    public static void N(View view, int i4, int i5, int i6, int i7) {
        m0 m0Var = (m0) view.getLayoutParams();
        Rect rect = m0Var.f2852b;
        view.layout(i4 + rect.left + ((ViewGroup.MarginLayoutParams) m0Var).leftMargin, i5 + rect.top + ((ViewGroup.MarginLayoutParams) m0Var).topMargin, (i6 - rect.right) - ((ViewGroup.MarginLayoutParams) m0Var).rightMargin, (i7 - rect.bottom) - ((ViewGroup.MarginLayoutParams) m0Var).bottomMargin);
    }

    public static int g(int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i5, i6) : size;
        }
        return Math.min(size, Math.max(i5, i6));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int w(boolean z4, int i4, int i5, int i6, int i7) {
        int iMax = Math.max(0, i4 - i6);
        if (z4) {
            if (i7 >= 0) {
                i5 = 1073741824;
            } else if (i7 != -1 || (i5 != Integer.MIN_VALUE && (i5 == 0 || i5 != 1073741824))) {
                i5 = 0;
                i7 = 0;
            } else {
                i7 = iMax;
            }
        } else if (i7 >= 0) {
            i5 = 1073741824;
        } else if (i7 == -1) {
            i7 = iMax;
        } else if (i7 != -2) {
            i5 = 0;
            i7 = 0;
        } else if (i5 == Integer.MIN_VALUE || i5 == 1073741824) {
            i7 = iMax;
            i5 = Integer.MIN_VALUE;
        } else {
            i7 = iMax;
            i5 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i7, i5);
    }

    public static int z(View view) {
        Rect rect = ((m0) view.getLayoutParams()).f2852b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.f2838b;
        b0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f2838b;
        WeakHashMap weakHashMap = p0.p0.f3233a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f2838b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f2838b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f2838b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f2838b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(v1.b bVar, u0 u0Var) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((m0) view.getLayoutParams()).f2852b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2838b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2838b.f928p;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i4) {
        RecyclerView recyclerView = this.f2838b;
        if (recyclerView != null) {
            int iG = recyclerView.f918j.g();
            for (int i5 = 0; i5 < iG; i5++) {
                recyclerView.f918j.f(i5).offsetLeftAndRight(i4);
            }
        }
    }

    public void P(int i4) {
        RecyclerView recyclerView = this.f2838b;
        if (recyclerView != null) {
            int iG = recyclerView.f918j.g();
            for (int i5 = 0; i5 < iG; i5++) {
                recyclerView.f918j.f(i5).offsetTopAndBottom(i4);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i4, v1.b bVar, u0 u0Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2838b;
        v1.b bVar = recyclerView.f913g;
        u0 u0Var = recyclerView.f920k0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z4 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2838b.canScrollVertically(-1) && !this.f2838b.canScrollHorizontally(-1) && !this.f2838b.canScrollHorizontally(1)) {
            z4 = false;
        }
        accessibilityEvent.setScrollable(z4);
        b0 b0Var = this.f2838b.f930q;
        if (b0Var != null) {
            accessibilityEvent.setItemCount(b0Var.a());
        }
    }

    public final void V(View view, q0.e eVar) {
        x0 x0VarI = RecyclerView.I(view);
        if (x0VarI == null || x0VarI.h()) {
            return;
        }
        androidx.emoji2.text.t tVar = this.f2837a;
        if (((ArrayList) tVar.f580d).contains(x0VarI.f2945a)) {
            return;
        }
        RecyclerView recyclerView = this.f2838b;
        W(recyclerView.f913g, recyclerView.f920k0, view, eVar);
    }

    public final void b(View view, int i4, boolean z4) {
        x0 x0VarI = RecyclerView.I(view);
        if (z4 || x0VarI.h()) {
            p.k kVar = (p.k) this.f2838b.f919k.f568g;
            f1 f1VarA = (f1) kVar.get(x0VarI);
            if (f1VarA == null) {
                f1VarA = f1.a();
                kVar.put(x0VarI, f1VarA);
            }
            f1VarA.f2772a |= 1;
        } else {
            this.f2838b.f919k.x(x0VarI);
        }
        m0 m0Var = (m0) view.getLayoutParams();
        if (x0VarI.p() || x0VarI.i()) {
            if (x0VarI.i()) {
                x0VarI.n.n(x0VarI);
            } else {
                x0VarI.f2953j &= -33;
            }
            this.f2837a.b(view, i4, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f2838b;
            androidx.emoji2.text.t tVar = this.f2837a;
            if (parent == recyclerView) {
                b bVar = (b) tVar.f579c;
                int iIndexOfChild = ((a0) tVar.f578b).f2729a.indexOfChild(view);
                int iB = (iIndexOfChild == -1 || bVar.d(iIndexOfChild)) ? -1 : iIndexOfChild - bVar.b(iIndexOfChild);
                if (i4 == -1) {
                    i4 = this.f2837a.g();
                }
                if (iB == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f2838b.indexOfChild(view) + this.f2838b.y());
                }
                if (iB != i4) {
                    l0 l0Var = this.f2838b.f932r;
                    View viewU = l0Var.u(iB);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + l0Var.f2838b.toString());
                    }
                    l0Var.u(iB);
                    l0Var.f2837a.d(iB);
                    m0 m0Var2 = (m0) viewU.getLayoutParams();
                    x0 x0VarI2 = RecyclerView.I(viewU);
                    boolean zH = x0VarI2.h();
                    RecyclerView recyclerView2 = l0Var.f2838b;
                    if (zH) {
                        p.k kVar2 = (p.k) recyclerView2.f919k.f568g;
                        f1 f1VarA2 = (f1) kVar2.get(x0VarI2);
                        if (f1VarA2 == null) {
                            f1VarA2 = f1.a();
                            kVar2.put(x0VarI2, f1VarA2);
                        }
                        f1VarA2.f2772a = 1 | f1VarA2.f2772a;
                    } else {
                        recyclerView2.f919k.x(x0VarI2);
                    }
                    l0Var.f2837a.b(viewU, i4, m0Var2, x0VarI2.h());
                }
            } else {
                tVar.a(view, i4, false);
                m0Var.f2853c = true;
                u uVar = this.f2841e;
                if (uVar != null && uVar.f2910e) {
                    uVar.f2907b.getClass();
                    x0 x0VarI3 = RecyclerView.I(view);
                    if ((x0VarI3 != null ? x0VarI3.b() : -1) == uVar.f2906a) {
                        uVar.f = view;
                    }
                }
            }
        }
        if (m0Var.f2854d) {
            x0VarI.f2945a.invalidate();
            m0Var.f2854d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f2838b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(v1.b bVar, u0 u0Var);

    public abstract boolean d();

    public abstract void d0(u0 u0Var);

    public abstract boolean e();

    public boolean f(m0 m0Var) {
        return m0Var != null;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(v1.b bVar) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.I(u(iV)).o()) {
                View viewU = u(iV);
                k0(iV);
                bVar.i(viewU);
            }
        }
    }

    public final void i0(v1.b bVar) {
        ArrayList arrayList;
        int size = ((ArrayList) bVar.f4288c).size();
        int i4 = size - 1;
        while (true) {
            arrayList = (ArrayList) bVar.f4288c;
            if (i4 < 0) {
                break;
            }
            View view = ((x0) arrayList.get(i4)).f2945a;
            x0 x0VarI = RecyclerView.I(view);
            if (!x0VarI.o()) {
                x0VarI.n(false);
                if (x0VarI.j()) {
                    this.f2838b.removeDetachedView(view, false);
                }
                h0 h0Var = this.f2838b.P;
                if (h0Var != null) {
                    h0Var.d(x0VarI);
                }
                x0VarI.n(true);
                x0 x0VarI2 = RecyclerView.I(view);
                x0VarI2.n = null;
                x0VarI2.f2957o = false;
                x0VarI2.f2953j &= -33;
                bVar.j(x0VarI2);
            }
            i4--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) bVar.f4289d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2838b.invalidate();
        }
    }

    public abstract int j(u0 u0Var);

    public final void j0(View view, v1.b bVar) {
        androidx.emoji2.text.t tVar = this.f2837a;
        a0 a0Var = (a0) tVar.f578b;
        int iIndexOfChild = a0Var.f2729a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((b) tVar.f579c).f(iIndexOfChild)) {
                tVar.x(view);
            }
            a0Var.h(iIndexOfChild);
        }
        bVar.i(view);
    }

    public abstract int k(u0 u0Var);

    public final void k0(int i4) {
        if (u(i4) != null) {
            androidx.emoji2.text.t tVar = this.f2837a;
            int iL = tVar.l(i4);
            a0 a0Var = (a0) tVar.f578b;
            View childAt = a0Var.f2729a.getChildAt(iL);
            if (childAt == null) {
                return;
            }
            if (((b) tVar.f579c).f(iL)) {
                tVar.x(childAt);
            }
            a0Var.h(iL);
        }
    }

    public abstract int l(u0 u0Var);

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    public boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
        int iE = E();
        int iG = G();
        int iF = this.n - F();
        int iD = this.f2849o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i4 = left - iE;
        int iMin = Math.min(0, i4);
        int i5 = top - iG;
        int iMin2 = Math.min(0, i5);
        int i6 = iWidth - iF;
        int iMax = Math.max(0, i6);
        int iMax2 = Math.max(0, iHeight - iD);
        if (C() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i4, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i6);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i5, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i7 = iArr[0];
        int i8 = iArr[1];
        if (z5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iE2 = E();
                int iG2 = G();
                int iF2 = this.n - F();
                int iD2 = this.f2849o - D();
                Rect rect2 = this.f2838b.n;
                y(focusedChild, rect2);
                if (rect2.left - i7 < iF2 && rect2.right - i7 > iE2 && rect2.top - i8 < iD2 && rect2.bottom - i8 > iG2) {
                    if (i7 == 0) {
                    }
                    if (z4) {
                        recyclerView.scrollBy(i7, i8);
                        return true;
                    }
                    recyclerView.b0(i7, false, i8);
                    return true;
                }
            }
        } else if (i7 == 0 || i8 != 0) {
            if (z4) {
                recyclerView.scrollBy(i7, i8);
                return true;
            }
            recyclerView.b0(i7, false, i8);
            return true;
        }
        return false;
    }

    public abstract int m(u0 u0Var);

    public final void m0() {
        RecyclerView recyclerView = this.f2838b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(u0 u0Var);

    public abstract int n0(int i4, u0 u0Var, v1.b bVar);

    public abstract int o(u0 u0Var);

    public abstract void o0(int i4);

    public final void p(v1.b bVar) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            x0 x0VarI = RecyclerView.I(viewU);
            if (!x0VarI.o()) {
                if (!x0VarI.f() || x0VarI.h() || this.f2838b.f930q.f2735b) {
                    u(iV);
                    this.f2837a.d(iV);
                    bVar.l(viewU);
                    this.f2838b.f919k.x(x0VarI);
                } else {
                    k0(iV);
                    bVar.j(x0VarI);
                }
            }
        }
    }

    public abstract int p0(int i4, u0 u0Var, v1.b bVar);

    public View q(int i4) {
        int iV = v();
        for (int i5 = 0; i5 < iV; i5++) {
            View viewU = u(i5);
            x0 x0VarI = RecyclerView.I(viewU);
            if (x0VarI != null && x0VarI.b() == i4 && !x0VarI.o() && (this.f2838b.f920k0.f2925g || !x0VarI.h())) {
                return viewU;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract m0 r();

    public final void r0(int i4, int i5) {
        this.n = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        this.f2847l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.D0;
        }
        this.f2849o = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        this.f2848m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.D0;
        }
    }

    public m0 s(Context context, AttributeSet attributeSet) {
        return new m0(context, attributeSet);
    }

    public void s0(Rect rect, int i4, int i5) {
        int iF = F() + E() + rect.width();
        int iD = D() + G() + rect.height();
        RecyclerView recyclerView = this.f2838b;
        WeakHashMap weakHashMap = p0.p0.f3233a;
        this.f2838b.setMeasuredDimension(g(i4, iF, recyclerView.getMinimumWidth()), g(i5, iD, this.f2838b.getMinimumHeight()));
    }

    public m0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof m0) {
            return new m0((m0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new m0((ViewGroup.MarginLayoutParams) layoutParams) : new m0(layoutParams);
    }

    public final void t0(int i4, int i5) {
        int iV = v();
        if (iV == 0) {
            this.f2838b.n(i4, i5);
            return;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = u(i10);
            Rect rect = this.f2838b.n;
            y(viewU, rect);
            int i11 = rect.left;
            if (i11 < i9) {
                i9 = i11;
            }
            int i12 = rect.right;
            if (i12 > i6) {
                i6 = i12;
            }
            int i13 = rect.top;
            if (i13 < i7) {
                i7 = i13;
            }
            int i14 = rect.bottom;
            if (i14 > i8) {
                i8 = i14;
            }
        }
        this.f2838b.n.set(i9, i7, i6, i8);
        s0(this.f2838b.n, i4, i5);
    }

    public final View u(int i4) {
        androidx.emoji2.text.t tVar = this.f2837a;
        if (tVar != null) {
            return tVar.f(i4);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2838b = null;
            this.f2837a = null;
            this.n = 0;
            this.f2849o = 0;
        } else {
            this.f2838b = recyclerView;
            this.f2837a = recyclerView.f918j;
            this.n = recyclerView.getWidth();
            this.f2849o = recyclerView.getHeight();
        }
        this.f2847l = 1073741824;
        this.f2848m = 1073741824;
    }

    public final int v() {
        androidx.emoji2.text.t tVar = this.f2837a;
        if (tVar != null) {
            return tVar.g();
        }
        return 0;
    }

    public final boolean v0(View view, int i4, int i5, m0 m0Var) {
        return (!view.isLayoutRequested() && this.f2843h && M(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) m0Var).width) && M(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) m0Var).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(v1.b bVar, u0 u0Var) {
        return -1;
    }

    public final boolean x0(View view, int i4, int i5, m0 m0Var) {
        return (this.f2843h && M(view.getMeasuredWidth(), i4, ((ViewGroup.MarginLayoutParams) m0Var).width) && M(view.getMeasuredHeight(), i5, ((ViewGroup.MarginLayoutParams) m0Var).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.D0;
        m0 m0Var = (m0) view.getLayoutParams();
        Rect rect2 = m0Var.f2852b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) m0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) m0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) m0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) m0Var).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i4);

    public final void z0(u uVar) {
        u uVar2 = this.f2841e;
        if (uVar2 != null && uVar != uVar2 && uVar2.f2910e) {
            uVar2.i();
        }
        this.f2841e = uVar;
        RecyclerView recyclerView = this.f2838b;
        w0 w0Var = recyclerView.f915h0;
        w0Var.f2939l.removeCallbacks(w0Var);
        w0Var.f2935h.abortAnimation();
        if (uVar.f2912h) {
            Log.w("RecyclerView", "An instance of " + uVar.getClass().getSimpleName() + " was started more than once. Each instance of" + uVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        uVar.f2907b = recyclerView;
        uVar.f2908c = this;
        int i4 = uVar.f2906a;
        if (i4 == -1) {
            androidx.fragment.app.q.q("Invalid target position");
            return;
        }
        recyclerView.f920k0.f2920a = i4;
        uVar.f2910e = true;
        uVar.f2909d = true;
        uVar.f = recyclerView.f932r.q(i4);
        uVar.f2907b.f915h0.a();
        uVar.f2912h = true;
    }

    public void R(RecyclerView recyclerView) {
    }

    public void e0(Parcelable parcelable) {
    }

    public void g0(int i4) {
    }

    public void Q() {
    }

    public void Y() {
    }

    public void X(int i4, int i5) {
    }

    public void Z(int i4, int i5) {
    }

    public void a0(int i4, int i5) {
    }

    public void b0(int i4, int i5) {
    }

    public void i(int i4, c2.h hVar) {
    }

    public void W(v1.b bVar, u0 u0Var, View view, q0.e eVar) {
    }

    public void h(int i4, int i5, u0 u0Var, c2.h hVar) {
    }
}
