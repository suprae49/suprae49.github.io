package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.fragment.app.q;
import co.median.android.eeqadjy.R;
import com.google.android.gms.common.api.Api;
import e.q0;
import i.j;
import j.m;
import j.x;
import java.util.WeakHashMap;
import k.g1;
import k.g3;
import k.k3;
import k1.g0;
import p0.b1;
import p0.d1;
import p0.e1;
import p0.f1;
import p0.h0;
import p0.h1;
import p0.i1;
import p0.j1;
import p0.o;
import p0.p;
import p0.p0;
import p0.t1;
import p0.y1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements o, p {
    public static final int[] H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final y1 I;
    public static final Rect J;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final b3.f C;
    public final k.c D;
    public final k.c E;
    public final g0 F;
    public final k.f G;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ContentFrameLayout f308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ActionBarContainer f309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g1 f310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f313m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f314o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f319t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f320u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y1 f321v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y1 f322w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y1 f323x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y1 f324y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k.d f325z;

    static {
        j1 d1Var;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 36) {
            d1Var = new i1();
        } else if (i4 >= 35) {
            d1Var = new h1();
        } else if (i4 >= 34) {
            d1Var = new p0.g1();
        } else if (i4 >= 31) {
            d1Var = new f1();
        } else if (i4 >= 30) {
            d1Var = new e1();
        } else {
            d1Var = i4 >= 29 ? new d1() : new b1();
        }
        d1Var.h(f0.c.c(0, 1, 0, 1));
        I = d1Var.b();
        J = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f307g = 0;
        this.f317r = new Rect();
        this.f318s = new Rect();
        this.f319t = new Rect();
        this.f320u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        y1 y1Var = y1.f3267b;
        this.f321v = y1Var;
        this.f322w = y1Var;
        this.f323x = y1Var;
        this.f324y = y1Var;
        this.C = new b3.f(3, this);
        this.D = new k.c(this, 0);
        this.E = new k.c(this, 1);
        i(context);
        this.F = new g0();
        k.f fVar = new k.f(context);
        fVar.setWillNotDraw(true);
        this.G = fVar;
        addView(fVar);
    }

    public static boolean g(View view, Rect rect, boolean z4) {
        boolean z5;
        k.e eVar = (k.e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i5 = rect.left;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i5;
            z5 = true;
        } else {
            z5 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i7;
            z5 = true;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i9;
            z5 = true;
        }
        if (z4) {
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i11;
                return true;
            }
        }
        return z5;
    }

    @Override // p0.o
    public final void a(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // p0.o
    public final void b(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k.e;
    }

    @Override // p0.p
    public final void d(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        e(view, i4, i5, i6, i7, i8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f311k != null) {
            if (this.f309i.getVisibility() == 0) {
                translationY = (int) (this.f309i.getTranslationY() + this.f309i.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f311k.setBounds(0, translationY, getWidth(), this.f311k.getIntrinsicHeight() + translationY);
            this.f311k.draw(canvas);
        }
    }

    @Override // p0.o
    public final void e(View view, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i4, i5, i6, i7);
        }
    }

    @Override // p0.o
    public final boolean f(View view, View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new k.e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new k.e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f309i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        g0 g0Var = this.F;
        return g0Var.f2781b | g0Var.f2780a;
    }

    public CharSequence getTitle() {
        k();
        return ((k3) this.f310j).f2562a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(H);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f311k = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.A = new OverScroller(context);
    }

    public final void j(int i4) {
        k();
        if (i4 == 2) {
            ((k3) this.f310j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i4 == 5) {
            ((k3) this.f310j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i4 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        g1 wrapper;
        if (this.f308h == null) {
            this.f308h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f309i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof g1) {
                wrapper = (g1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    q.j("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f310j = wrapper;
        }
    }

    public final void l(Menu menu, x xVar) {
        k();
        k3 k3Var = (k3) this.f310j;
        Toolbar toolbar = k3Var.f2562a;
        if (k3Var.f2573m == null) {
            b bVar = new b(toolbar.getContext());
            k3Var.f2573m = bVar;
            bVar.n = R.id.action_menu_presenter;
        }
        b bVar2 = k3Var.f2573m;
        bVar2.f409j = xVar;
        m mVar = (m) menu;
        if (mVar == null && toolbar.f == null) {
            return;
        }
        toolbar.g();
        m mVar2 = toolbar.f.f326u;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.Q);
            mVar2.r(toolbar.R);
        }
        if (toolbar.R == null) {
            toolbar.R = new g3(toolbar);
        }
        bVar2.f421w = true;
        Context context = toolbar.f388o;
        if (mVar != null) {
            mVar.b(bVar2, context);
            mVar.b(toolbar.R, toolbar.f388o);
        } else {
            bVar2.h(context, null);
            toolbar.R.h(toolbar.f388o, null);
            bVar2.f(true);
            toolbar.R.f(true);
        }
        toolbar.f.setPopupTheme(toolbar.f389p);
        toolbar.f.setPresenter(bVar2);
        toolbar.Q = bVar2;
        toolbar.x();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        y1 y1VarH = y1.h(this, windowInsets);
        boolean zG = g(this.f309i, new Rect(y1VarH.b(), y1VarH.d(), y1VarH.c(), y1VarH.a()), false);
        WeakHashMap weakHashMap = p0.f3233a;
        Rect rect = this.f317r;
        h0.b(this, y1VarH, rect);
        int i4 = rect.left;
        int i5 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        t1 t1Var = y1VarH.f3268a;
        y1 y1VarQ = t1Var.q(i4, i5, i6, i7);
        this.f321v = y1VarQ;
        boolean z4 = true;
        if (!this.f322w.equals(y1VarQ)) {
            this.f322w = this.f321v;
            zG = true;
        }
        Rect rect2 = this.f318s;
        if (rect2.equals(rect)) {
            z4 = zG;
        } else {
            rect2.set(rect);
        }
        if (z4) {
            requestLayout();
        }
        return t1Var.a().f3268a.c().f3268a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = p0.f3233a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                k.e eVar = (k.e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00da  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int measuredHeight;
        y1 y1Var;
        int i6;
        j1 b1Var;
        k();
        measureChildWithMargins(this.f309i, i4, 0, i5, 0);
        k.e eVar = (k.e) this.f309i.getLayoutParams();
        int iMax = Math.max(0, this.f309i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f309i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f309i.getMeasuredState());
        WeakHashMap weakHashMap = p0.f3233a;
        boolean z4 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z4) {
            measuredHeight = this.f;
            if (this.f313m && this.f309i.getTabContainer() != null) {
                measuredHeight += this.f;
            }
        } else {
            measuredHeight = this.f309i.getVisibility() != 8 ? this.f309i.getMeasuredHeight() : 0;
        }
        Rect rect = this.f317r;
        Rect rect2 = this.f319t;
        rect2.set(rect);
        this.f323x = this.f321v;
        if (this.f312l || z4) {
            f0.c cVarC = f0.c.c(this.f323x.b(), this.f323x.d() + measuredHeight, this.f323x.c(), this.f323x.a());
            y1Var = this.f323x;
            i6 = Build.VERSION.SDK_INT;
            if (i6 >= 36) {
                b1Var = new i1(y1Var);
            } else if (i6 >= 35) {
                b1Var = new h1(y1Var);
            } else if (i6 >= 34) {
                b1Var = new p0.g1(y1Var);
            } else if (i6 >= 31) {
                b1Var = new f1(y1Var);
            } else if (i6 >= 30) {
                b1Var = new e1(y1Var);
            } else if (i6 >= 29) {
                b1Var = new d1(y1Var);
            } else {
                b1Var = new b1(y1Var);
            }
            b1Var.h(cVarC);
            this.f323x = b1Var.b();
        } else {
            k.f fVar = this.G;
            y1 y1Var2 = I;
            Rect rect3 = this.f320u;
            h0.b(fVar, y1Var2, rect3);
            if (rect3.equals(J)) {
                f0.c cVarC2 = f0.c.c(this.f323x.b(), this.f323x.d() + measuredHeight, this.f323x.c(), this.f323x.a());
                y1Var = this.f323x;
                i6 = Build.VERSION.SDK_INT;
                if (i6 >= 36) {
                    b1Var = new i1(y1Var);
                } else if (i6 >= 35) {
                    b1Var = new h1(y1Var);
                } else if (i6 >= 34) {
                    b1Var = new p0.g1(y1Var);
                } else if (i6 >= 31) {
                    b1Var = new f1(y1Var);
                } else if (i6 >= 30) {
                    b1Var = new e1(y1Var);
                } else if (i6 >= 29) {
                    b1Var = new d1(y1Var);
                } else {
                    b1Var = new b1(y1Var);
                }
                b1Var.h(cVarC2);
                this.f323x = b1Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f323x = this.f323x.f3268a.q(0, measuredHeight, 0, 0);
            }
        }
        g(this.f308h, rect2, true);
        if (!this.f324y.equals(this.f323x)) {
            y1 y1Var3 = this.f323x;
            this.f324y = y1Var3;
            p0.b(this.f308h, y1Var3);
        }
        measureChildWithMargins(this.f308h, i4, 0, i5, 0);
        k.e eVar2 = (k.e) this.f308h.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f308h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f308h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f308h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i4, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i5, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f4, boolean z4) {
        if (!this.n || !z4) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (this.A.getFinalY() > this.f309i.getHeight()) {
            h();
            this.E.run();
        } else {
            h();
            this.D.run();
        }
        this.f314o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f315p + i5;
        this.f315p = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        q0 q0Var;
        j jVar;
        this.F.f2780a = i4;
        this.f315p = getActionBarHideOffset();
        h();
        k.d dVar = this.f325z;
        if (dVar == null || (jVar = (q0Var = (q0) dVar).f1985x) == null) {
            return;
        }
        jVar.a();
        q0Var.f1985x = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f309i.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.n || this.f314o) {
            return;
        }
        if (this.f315p <= this.f309i.getHeight()) {
            h();
            postDelayed(this.D, 600L);
        } else {
            h();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        k();
        int i5 = this.f316q ^ i4;
        this.f316q = i4;
        boolean z4 = (i4 & 4) == 0;
        boolean z5 = (i4 & 256) != 0;
        k.d dVar = this.f325z;
        if (dVar != null) {
            q0 q0Var = (q0) dVar;
            q0Var.f1980s = !z5;
            if (z4 || !z5) {
                if (q0Var.f1982u) {
                    q0Var.f1982u = false;
                    q0Var.x0(true);
                }
            } else if (!q0Var.f1982u) {
                q0Var.f1982u = true;
                q0Var.x0(true);
            }
        }
        if ((i5 & 256) == 0 || this.f325z == null) {
            return;
        }
        WeakHashMap weakHashMap = p0.f3233a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.f307g = i4;
        k.d dVar = this.f325z;
        if (dVar != null) {
            ((q0) dVar).f1979r = i4;
        }
    }

    public void setActionBarHideOffset(int i4) {
        h();
        this.f309i.setTranslationY(-Math.max(0, Math.min(i4, this.f309i.getHeight())));
    }

    public void setActionBarVisibilityCallback(k.d dVar) {
        this.f325z = dVar;
        if (getWindowToken() != null) {
            ((q0) this.f325z).f1979r = this.f307g;
            int i4 = this.f316q;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                WeakHashMap weakHashMap = p0.f3233a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f313m = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.n) {
            this.n = z4;
            if (z4) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i4) {
        k();
        k3 k3Var = (k3) this.f310j;
        k3Var.f2565d = i4 != 0 ? u1.h0.w(k3Var.f2562a.getContext(), i4) : null;
        k3Var.d();
    }

    public void setLogo(int i4) {
        k();
        k3 k3Var = (k3) this.f310j;
        k3Var.f2566e = i4 != 0 ? u1.h0.w(k3Var.f2562a.getContext(), i4) : null;
        k3Var.d();
    }

    public void setOverlayMode(boolean z4) {
        this.f312l = z4;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((k3) this.f310j).f2571k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        k3 k3Var = (k3) this.f310j;
        if (k3Var.f2567g) {
            return;
        }
        Toolbar toolbar = k3Var.f2562a;
        k3Var.f2568h = charSequence;
        if ((k3Var.f2563b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (k3Var.f2567g) {
                p0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new k.e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        k3 k3Var = (k3) this.f310j;
        k3Var.f2565d = drawable;
        k3Var.d();
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    @Override // p0.o
    public final void c(View view, int i4, int i5, int[] iArr, int i6) {
    }
}
