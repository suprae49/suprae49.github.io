package com.google.android.material.navigation;

import a3.a0;
import a3.c0;
import a3.d0;
import a3.j;
import a3.o;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.customview.view.AbsSavedState;
import androidx.emoji2.text.t;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.NavigationMenuView;
import java.util.WeakHashMap;
import p0.h0;
import p0.p0;
import r2.f;
import r2.q;
import r2.u;
import t2.h;
import t2.i;
import u2.n;
import u2.p;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends u implements t2.b {
    public static final int[] G = {R.attr.state_checked};
    public static final int[] H = {-16842910};
    public final a0 A;
    public o B;
    public final h C;
    public final t D;
    public final n E;
    public final u2.o F;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f1514m;
    public final q n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p f1515o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1516p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f1517q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i.h f1518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j.d f1519s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1520t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1521u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1522v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1523w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1524x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f1525y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f1526z;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new e();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Bundle f1527h;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1527h = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeBundle(this.f1527h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01d2 A[PHI: r11
      0x01d2: PHI (r11v3 android.graphics.drawable.Drawable) = 
      (r11v2 android.graphics.drawable.Drawable)
      (r11v6 android.graphics.drawable.Drawable)
      (r11v2 android.graphics.drawable.Drawable)
     binds: [B:54:0x0189, B:60:0x01af, B:58:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet) {
        int i4;
        Context contextB = f3.a.b(context, attributeSet, co.median.android.eeqadjy.R.attr.navigationViewStyle, co.median.android.eeqadjy.R.style.Widget_Design_NavigationView);
        super(contextB, attributeSet, co.median.android.eeqadjy.R.attr.navigationViewStyle);
        this.f3582h = new Rect();
        this.f3583i = true;
        this.f3584j = true;
        this.f3585k = true;
        this.f3586l = true;
        TypedArray typedArrayF = r2.a0.f(contextB, attributeSet, a2.a.J, co.median.android.eeqadjy.R.attr.navigationViewStyle, co.median.android.eeqadjy.R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f = typedArrayF.getDrawable(0);
        typedArrayF.recycle();
        setWillNotDraw(true);
        r2.t tVar = new r2.t(this);
        WeakHashMap weakHashMap = p0.f3233a;
        h0.c(this, tVar);
        q qVar = new q();
        this.n = qVar;
        this.f1517q = new int[2];
        this.f1520t = true;
        this.f1521u = true;
        this.f1522v = true;
        this.f1523w = true;
        this.f1524x = 0;
        this.A = Build.VERSION.SDK_INT >= 33 ? new d0(this) : new c0(this);
        this.C = new h(this);
        this.D = new t(this);
        this.E = new n(this);
        this.F = new u2.o(this);
        Context context2 = getContext();
        f fVar = new f(context2);
        this.f1514m = fVar;
        t tVarG = r2.a0.g(context2, attributeSet, a2.a.H, co.median.android.eeqadjy.R.attr.navigationViewStyle, co.median.android.eeqadjy.R.style.Widget_Design_NavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) tVarG.f579c;
        if (typedArray.hasValue(1)) {
            setBackground(tVarG.i(1));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        this.f1524x = dimensionPixelSize;
        this.f1525y = dimensionPixelSize == 0;
        this.f1526z = getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListU = u1.h0.u(background);
        if (background == null || colorStateListU != null) {
            j jVar = new j(o.g(context2, attributeSet, co.median.android.eeqadjy.R.attr.navigationViewStyle, co.median.android.eeqadjy.R.style.Widget_Design_NavigationView).a());
            if (colorStateListU != null) {
                jVar.r(colorStateListU);
            }
            jVar.n(context2);
            setBackground(jVar);
        }
        if (typedArray.hasValue(8)) {
            setElevation(typedArray.getDimensionPixelSize(8, 0));
        }
        setFitsSystemWindows(typedArray.getBoolean(2, false));
        this.f1516p = typedArray.getDimensionPixelSize(3, 0);
        ColorStateList colorStateListH = typedArray.hasValue(33) ? tVarG.h(33) : null;
        int resourceId = typedArray.hasValue(36) ? typedArray.getResourceId(36, 0) : 0;
        if (resourceId == 0 && colorStateListH == null) {
            colorStateListH = e(R.attr.textColorSecondary);
        }
        ColorStateList colorStateListH2 = typedArray.hasValue(15) ? tVarG.h(15) : e(R.attr.textColorSecondary);
        int resourceId2 = typedArray.hasValue(25) ? typedArray.getResourceId(25, 0) : 0;
        boolean z4 = typedArray.getBoolean(26, true);
        if (typedArray.hasValue(14)) {
            setItemIconSize(typedArray.getDimensionPixelSize(14, 0));
        }
        ColorStateList colorStateListH3 = typedArray.hasValue(27) ? tVarG.h(27) : null;
        if (resourceId2 == 0 && colorStateListH3 == null) {
            colorStateListH3 = e(R.attr.textColorPrimary);
        }
        Drawable drawableI = tVarG.i(11);
        if (drawableI == null && (typedArray.hasValue(18) || typedArray.hasValue(19))) {
            drawableI = f(tVarG, i.i(getContext(), tVarG, 20));
            ColorStateList colorStateListI = i.i(context2, tVarG, 17);
            if (colorStateListI != null) {
                RippleDrawable rippleDrawable = new RippleDrawable(y2.a.b(colorStateListI), null, f(tVarG, null));
                FocusRingDrawable focusRingDrawableE = FocusRingDrawable.e(context2, rippleDrawable, null);
                if (focusRingDrawableE != null) {
                    focusRingDrawableE.f1504t.f3470t = this.B;
                }
                qVar.f3572s = rippleDrawable;
                qVar.g();
            }
        }
        if (typedArray.hasValue(12)) {
            i4 = 0;
            setItemHorizontalPadding(typedArray.getDimensionPixelSize(12, 0));
        } else {
            i4 = 0;
        }
        if (typedArray.hasValue(28)) {
            setItemVerticalPadding(typedArray.getDimensionPixelSize(28, i4));
        }
        setDividerInsetStart(typedArray.getDimensionPixelSize(6, i4));
        setDividerInsetEnd(typedArray.getDimensionPixelSize(5, i4));
        setSubheaderInsetStart(typedArray.getDimensionPixelSize(35, i4));
        setSubheaderInsetEnd(typedArray.getDimensionPixelSize(34, i4));
        setTopInsetScrimEnabled(typedArray.getBoolean(37, this.f1520t));
        setBottomInsetScrimEnabled(typedArray.getBoolean(4, this.f1521u));
        setStartInsetScrimEnabled(typedArray.getBoolean(32, this.f1522v));
        setEndInsetScrimEnabled(typedArray.getBoolean(9, this.f1523w));
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(13, 0);
        setItemMaxLines(typedArray.getInt(16, 1));
        fVar.f2388e = new r2.t(this);
        qVar.f3563i = 1;
        qVar.h(context2, fVar);
        if (resourceId != 0) {
            qVar.f3566l = resourceId;
            qVar.c();
        }
        qVar.f3567m = colorStateListH;
        qVar.c();
        qVar.f3570q = colorStateListH2;
        qVar.g();
        int overScrollMode = getOverScrollMode();
        qVar.G = overScrollMode;
        NavigationMenuView navigationMenuView = qVar.f;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (resourceId2 != 0) {
            qVar.n = resourceId2;
            qVar.g();
        }
        qVar.f3568o = z4;
        qVar.g();
        qVar.f3569p = colorStateListH3;
        qVar.g();
        qVar.f3571r = drawableI;
        qVar.g();
        qVar.f3575v = dimensionPixelSize2;
        qVar.g();
        fVar.b(qVar, fVar.f2384a);
        if (qVar.f == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) qVar.f3565k.inflate(co.median.android.eeqadjy.R.layout.design_navigation_menu, (ViewGroup) this, false);
            qVar.f = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(new r2.n(qVar, qVar.f));
            if (qVar.f3564j == null) {
                r2.i iVar = new r2.i(qVar);
                qVar.f3564j = iVar;
                if (iVar.f2734a.a()) {
                    androidx.fragment.app.q.j("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
                    throw null;
                }
                iVar.f2735b = true;
            }
            int i5 = qVar.G;
            if (i5 != -1) {
                qVar.f.setOverScrollMode(i5);
            }
            LinearLayout linearLayout = (LinearLayout) qVar.f3565k.inflate(co.median.android.eeqadjy.R.layout.design_navigation_item_header, (ViewGroup) qVar.f, false);
            qVar.f3561g = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            qVar.f.setAdapter(qVar.f3564j);
        }
        addView(qVar.f);
        if (typedArray.hasValue(29)) {
            int resourceId3 = typedArray.getResourceId(29, 0);
            r2.i iVar2 = qVar.f3564j;
            if (iVar2 != null) {
                iVar2.f = true;
            }
            getMenuInflater().inflate(resourceId3, fVar);
            r2.i iVar3 = qVar.f3564j;
            if (iVar3 != null) {
                iVar3.f = false;
            }
            qVar.f(false);
        }
        if (typedArray.hasValue(10)) {
            qVar.f3561g.addView(qVar.f3565k.inflate(typedArray.getResourceId(10, 0), (ViewGroup) qVar.f3561g, false));
            NavigationMenuView navigationMenuView3 = qVar.f;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        tVarG.v();
        this.f1519s = new j.d(4, this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1519s);
    }

    private MenuInflater getMenuInflater() {
        if (this.f1518r == null) {
            this.f1518r = new i.h(getContext());
        }
        return this.f1518r;
    }

    @Override // t2.b
    public final void a() {
        Pair pairH = h();
        y0.f fVar = (y0.f) pairH.first;
        h hVar = this.C;
        androidx.activity.b bVar = hVar.f;
        hVar.f = null;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            fVar.c(this, true);
            return;
        }
        int i4 = ((y0.c) pairH.second).f4766a;
        int i5 = u2.b.f4153a;
        hVar.b(bVar, i4, new e2.b(fVar, this), new d3.i(2, fVar));
    }

    @Override // t2.b
    public final void b(androidx.activity.b bVar) {
        h();
        this.C.f = bVar;
    }

    @Override // t2.b
    public final void c(androidx.activity.b bVar) {
        float f = bVar.f181c;
        int i4 = ((y0.c) h().second).f4766a;
        h hVar = this.C;
        if (hVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = hVar.f;
        hVar.f = bVar;
        if (bVar2 != null) {
            hVar.c(f, bVar.f182d == 0, i4);
        }
        if (this.f1525y) {
            this.f1524x = b2.a.c(0, this.f1526z, hVar.f3722a.getInterpolation(f));
            g(getWidth(), getHeight());
        }
    }

    @Override // t2.b
    public final void d() {
        h();
        this.C.a();
        if (!this.f1525y || this.f1524x == 0) {
            return;
        }
        this.f1524x = 0;
        g(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a0 a0Var = this.A;
        Path path = a0Var.f40e;
        if (!a0Var.b() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final ColorStateList e(int i4) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i4, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = c0.c.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(co.median.android.eeqadjy.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i5 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = G;
        int[] iArr2 = FrameLayout.EMPTY_STATE_SET;
        int[] iArr3 = H;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateList.getColorForState(iArr3, defaultColor), i5, defaultColor});
    }

    public final InsetDrawable f(t tVar, ColorStateList colorStateList) {
        TypedArray typedArray = (TypedArray) tVar.f579c;
        this.B = o.f(getContext(), typedArray.getResourceId(18, 0), typedArray.getResourceId(19, 0)).a();
        j jVar = new j(this.B);
        jVar.r(colorStateList);
        return new InsetDrawable((Drawable) jVar, typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(24, 0), typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(21, 0));
    }

    public final void g(int i4, int i5) {
        if ((getParent() instanceof y0.f) && (getLayoutParams() instanceof y0.c)) {
            if ((this.f1524x > 0 || this.f1525y) && (getBackground() instanceof j)) {
                boolean z4 = Gravity.getAbsoluteGravity(((y0.c) getLayoutParams()).f4766a, getLayoutDirection()) == 3;
                j jVar = (j) getBackground();
                a3.n nVarK = jVar.j().k();
                nVarK.b(this.f1524x);
                if (z4) {
                    nVarK.f116e = new a3.a(0.0f);
                    nVarK.f118h = new a3.a(0.0f);
                } else {
                    nVarK.f = new a3.a(0.0f);
                    nVarK.f117g = new a3.a(0.0f);
                }
                o oVarA = nVarK.a();
                jVar.setShapeAppearanceModel(oVarA);
                a0 a0Var = this.A;
                a0Var.f38c = oVarA;
                a0Var.c();
                a0Var.a(this);
                a0Var.f39d = new RectF(0.0f, 0.0f, i4, i5);
                a0Var.c();
                a0Var.a(this);
                a0Var.f37b = true;
                a0Var.a(this);
            }
        }
    }

    public h getBackHelper() {
        return this.C;
    }

    public MenuItem getCheckedItem() {
        return this.n.f3564j.f3555e;
    }

    public int getDividerInsetEnd() {
        return this.n.f3578y;
    }

    public int getDividerInsetStart() {
        return this.n.f3577x;
    }

    public int getHeaderCount() {
        return this.n.f3561g.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.n.f3571r;
    }

    public int getItemHorizontalPadding() {
        return this.n.f3573t;
    }

    public int getItemIconPadding() {
        return this.n.f3575v;
    }

    public ColorStateList getItemIconTintList() {
        return this.n.f3570q;
    }

    public int getItemMaxLines() {
        return this.n.D;
    }

    public ColorStateList getItemTextColor() {
        return this.n.f3569p;
    }

    public int getItemVerticalPadding() {
        return this.n.f3574u;
    }

    public Menu getMenu() {
        return this.f1514m;
    }

    public int getSubheaderInsetEnd() {
        return this.n.A;
    }

    public int getSubheaderInsetStart() {
        return this.n.f3579z;
    }

    public final Pair h() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof y0.f) && (layoutParams instanceof y0.c)) {
            return new Pair((y0.f) parent, (y0.c) layoutParams);
        }
        androidx.fragment.app.q.j("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
        return null;
    }

    @Override // r2.u, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t2.c cVar;
        super.onAttachedToWindow();
        u1.h0.j0(this);
        ViewParent parent = getParent();
        if (parent instanceof y0.f) {
            y0.f fVar = (y0.f) parent;
            u2.o oVar = this.F;
            oVar.f4226a = null;
            fVar.p(oVar);
            fVar.a(oVar);
            t tVar = this.D;
            if (((t2.c) tVar.f578b) != null) {
                n nVar = this.E;
                fVar.p(nVar);
                fVar.a(nVar);
                if (!y0.f.l(this) || (cVar = (t2.c) tVar.f578b) == null) {
                    return;
                }
                cVar.b((NavigationView) tVar.f579c, (NavigationView) tVar.f580d, true);
            }
        }
    }

    @Override // r2.u, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f1519s);
        ViewParent parent = getParent();
        if (parent instanceof y0.f) {
            y0.f fVar = (y0.f) parent;
            fVar.p(this.E);
            fVar.p(this.F);
        }
        t tVar = this.D;
        t2.c cVar = (t2.c) tVar.f578b;
        if (cVar != null) {
            cVar.c((NavigationView) tVar.f580d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int i6 = this.f1516p;
        if (mode == Integer.MIN_VALUE) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i4), i6), 1073741824);
        } else if (mode == 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f);
        this.f1514m.t(savedState.f1527h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f1527h = bundle;
        this.f1514m.v(bundle);
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        g(i4, i5);
    }

    public void setBottomInsetScrimEnabled(boolean z4) {
        this.f1521u = z4;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f1514m.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            androidx.fragment.app.q.q("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        } else {
            this.n.f3564j.h((j.o) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i4) {
        q qVar = this.n;
        qVar.f3578y = i4;
        qVar.b();
    }

    public void setDividerInsetStart(int i4) {
        q qVar = this.n;
        qVar.f3577x = i4;
        qVar.b();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        u1.h0.b0(this, f);
    }

    public void setEndInsetScrimEnabled(boolean z4) {
        this.f1523w = z4;
    }

    public void setForceCompatClippingEnabled(boolean z4) {
        a0 a0Var = this.A;
        if (z4 != a0Var.f36a) {
            a0Var.f36a = z4;
            a0Var.a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        q qVar = this.n;
        qVar.f3571r = drawable;
        qVar.g();
    }

    public void setItemBackgroundResource(int i4) {
        setItemBackground(getContext().getDrawable(i4));
    }

    public void setItemHorizontalPadding(int i4) {
        q qVar = this.n;
        qVar.f3573t = i4;
        qVar.g();
    }

    public void setItemHorizontalPaddingResource(int i4) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i4);
        q qVar = this.n;
        qVar.f3573t = dimensionPixelSize;
        qVar.g();
    }

    public void setItemIconPadding(int i4) {
        q qVar = this.n;
        qVar.f3575v = i4;
        qVar.g();
    }

    public void setItemIconPaddingResource(int i4) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i4);
        q qVar = this.n;
        qVar.f3575v = dimensionPixelSize;
        qVar.g();
    }

    public void setItemIconSize(int i4) {
        q qVar = this.n;
        if (qVar.f3576w != i4) {
            qVar.f3576w = i4;
            qVar.B = true;
            qVar.g();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        q qVar = this.n;
        qVar.f3570q = colorStateList;
        qVar.g();
    }

    public void setItemMaxLines(int i4) {
        q qVar = this.n;
        qVar.D = i4;
        qVar.g();
    }

    public void setItemTextAppearance(int i4) {
        q qVar = this.n;
        qVar.n = i4;
        qVar.g();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z4) {
        q qVar = this.n;
        qVar.f3568o = z4;
        qVar.g();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        q qVar = this.n;
        qVar.f3569p = colorStateList;
        qVar.g();
    }

    public void setItemVerticalPadding(int i4) {
        q qVar = this.n;
        qVar.f3574u = i4;
        qVar.g();
    }

    public void setItemVerticalPaddingResource(int i4) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i4);
        q qVar = this.n;
        qVar.f3574u = dimensionPixelSize;
        qVar.g();
    }

    public void setNavigationItemSelectedListener(p pVar) {
        this.f1515o = pVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i4) {
        super.setOverScrollMode(i4);
        q qVar = this.n;
        if (qVar != null) {
            qVar.G = i4;
            NavigationMenuView navigationMenuView = qVar.f;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i4);
            }
        }
    }

    public void setStartInsetScrimEnabled(boolean z4) {
        this.f1522v = z4;
    }

    public void setSubheaderInsetEnd(int i4) {
        q qVar = this.n;
        qVar.A = i4;
        qVar.c();
    }

    public void setSubheaderInsetStart(int i4) {
        q qVar = this.n;
        qVar.f3579z = i4;
        qVar.c();
    }

    public void setTopInsetScrimEnabled(boolean z4) {
        this.f1520t = z4;
    }

    public void setCheckedItem(int i4) {
        MenuItem menuItemFindItem = this.f1514m.findItem(i4);
        if (menuItemFindItem != null) {
            this.n.f3564j.h((j.o) menuItemFindItem);
        }
    }
}
