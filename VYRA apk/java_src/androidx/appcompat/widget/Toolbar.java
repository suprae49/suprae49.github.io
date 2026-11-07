package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import androidx.emoji2.text.t;
import androidx.fragment.app.n0;
import androidx.fragment.app.q;
import co.median.android.eeqadjy.R;
import com.google.android.material.datepicker.k;
import d3.d0;
import e.j0;
import e.k0;
import i.h;
import j.m;
import j.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.d3;
import k.e3;
import k.f3;
import k.g1;
import k.g3;
import k.h3;
import k.i3;
import k.j2;
import k.k3;
import k.l3;
import k.p3;
import k.y;
import k.y0;
import k.z;
import p0.l;
import p0.p0;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements l {
    public int A;
    public final int B;
    public CharSequence C;
    public CharSequence D;
    public ColorStateList E;
    public ColorStateList F;
    public boolean G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public final int[] K;
    public final t L;
    public ArrayList M;
    public i3 N;
    public final e3 O;
    public k3 P;
    public b Q;
    public g3 R;
    public k0 S;
    public j0 T;
    public boolean U;
    public OnBackInvokedCallback V;
    public OnBackInvokedDispatcher W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f379a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final d0 f380b0;
    public ActionMenuView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y0 f381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y0 f382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y f383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Drawable f385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CharSequence f386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y f387m;
    public View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f388o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f392s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f393t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f394u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f395v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f397x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j2 f398y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f399z;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new f();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f400h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f401i;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f400h = parcel.readInt();
            this.f401i = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f400h);
            parcel.writeInt(this.f401i ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.B = 8388627;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new int[2];
        this.L = new t(new d3(this, 1));
        this.M = new ArrayList();
        this.O = new e3(this);
        this.f380b0 = new d0(6, this);
        Context context2 = getContext();
        int[] iArr = d.a.f1654z;
        t tVarS = t.s(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        p0.l(this, context, iArr, attributeSet, (TypedArray) tVarS.f579c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        this.f390q = typedArray.getResourceId(28, 0);
        this.f391r = typedArray.getResourceId(19, 0);
        this.B = typedArray.getInteger(0, 8388627);
        this.f392s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f397x = dimensionPixelOffset;
        this.f396w = dimensionPixelOffset;
        this.f395v = dimensionPixelOffset;
        this.f394u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f394u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f395v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f396w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f397x = dimensionPixelOffset5;
        }
        this.f393t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        e();
        j2 j2Var = this.f398y;
        j2Var.f2557h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            j2Var.f2555e = dimensionPixelSize;
            j2Var.f2551a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            j2Var.f = dimensionPixelSize2;
            j2Var.f2552b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            j2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f399z = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.A = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f385k = tVarS.i(4);
        this.f386l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f388o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableI = tVarS.i(16);
        if (drawableI != null) {
            setNavigationIcon(drawableI);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableI2 = tVarS.i(11);
        if (drawableI2 != null) {
            setLogo(drawableI2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(tVarS.h(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(tVarS.h(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        tVarS.v();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i4 = 0; i4 < menu.size(); i4++) {
            arrayList.add(menu.getItem(i4));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static h3 j() {
        return new h3(-2);
    }

    public static h3 k(ViewGroup.LayoutParams layoutParams) {
        boolean z4 = layoutParams instanceof h3;
        if (z4) {
            h3 h3Var = (h3) layoutParams;
            h3 h3Var2 = new h3(h3Var);
            h3Var2.f2543b = 0;
            h3Var2.f2543b = h3Var.f2543b;
            return h3Var2;
        }
        if (z4) {
            h3 h3Var3 = new h3((h3) layoutParams);
            h3Var3.f2543b = 0;
            return h3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            h3 h3Var4 = new h3(layoutParams);
            h3Var4.f2543b = 0;
            return h3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        h3 h3Var5 = new h3(marginLayoutParams);
        h3Var5.f2543b = 0;
        ((ViewGroup.MarginLayoutParams) h3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) h3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) h3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) h3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return h3Var5;
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int n(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i4, ArrayList arrayList) {
        boolean z4 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection());
        arrayList.clear();
        if (!z4) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                h3 h3Var = (h3) childAt.getLayoutParams();
                if (h3Var.f2543b == 0 && v(childAt)) {
                    int i6 = h3Var.f2542a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt2 = getChildAt(i7);
            h3 h3Var2 = (h3) childAt2.getLayoutParams();
            if (h3Var2.f2543b == 0 && v(childAt2)) {
                int i8 = h3Var2.f2542a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i8, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z4) {
        h3 h3VarK;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            h3VarK = j();
        } else {
            h3VarK = !checkLayoutParams(layoutParams) ? k(layoutParams) : (h3) layoutParams;
        }
        h3VarK.f2543b = 1;
        if (!z4 || this.n == null) {
            addView(view, h3VarK);
        } else {
            view.setLayoutParams(h3VarK);
            this.J.add(view);
        }
    }

    public final void c() {
        if (this.f387m == null) {
            y yVar = new y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f387m = yVar;
            yVar.setImageDrawable(this.f385k);
            this.f387m.setContentDescription(this.f386l);
            h3 h3VarJ = j();
            h3VarJ.f2542a = (this.f392s & 112) | 8388611;
            h3VarJ.f2543b = 2;
            this.f387m.setLayoutParams(h3VarJ);
            this.f387m.setOnClickListener(new k(4, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof h3);
    }

    @Override // p0.l
    public final void d(n0 n0Var) {
        t tVar = this.L;
        ((CopyOnWriteArrayList) tVar.f579c).add(n0Var);
        ((Runnable) tVar.f578b).run();
    }

    public final void e() {
        if (this.f398y == null) {
            j2 j2Var = new j2();
            j2Var.f2551a = 0;
            j2Var.f2552b = 0;
            j2Var.f2553c = Integer.MIN_VALUE;
            j2Var.f2554d = Integer.MIN_VALUE;
            j2Var.f2555e = 0;
            j2Var.f = 0;
            j2Var.f2556g = false;
            j2Var.f2557h = false;
            this.f398y = j2Var;
        }
    }

    public final void f() {
        g();
        ActionMenuView actionMenuView = this.f;
        if (actionMenuView.f326u == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.R == null) {
                this.R = new g3(this);
            }
            this.f.setExpandedActionViewsExclusive(true);
            mVar.b(this.R, this.f388o);
            x();
        }
    }

    public final void g() {
        if (this.f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f = actionMenuView;
            actionMenuView.setPopupTheme(this.f389p);
            this.f.setOnMenuItemClickListener(this.O);
            ActionMenuView actionMenuView2 = this.f;
            k0 k0Var = this.S;
            e3 e3Var = new e3(this);
            actionMenuView2.f331z = k0Var;
            actionMenuView2.A = e3Var;
            h3 h3VarJ = j();
            h3VarJ.f2542a = (this.f392s & 112) | 8388613;
            this.f.setLayoutParams(h3VarJ);
            b(this.f, false);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        h3 h3Var = new h3(context, attributeSet);
        h3Var.f2542a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f1632b);
        h3Var.f2542a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        h3Var.f2543b = 0;
        return h3Var;
    }

    public CharSequence getCollapseContentDescription() {
        y yVar = this.f387m;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        y yVar = this.f387m;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        j2 j2Var = this.f398y;
        if (j2Var != null) {
            return j2Var.f2556g ? j2Var.f2551a : j2Var.f2552b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.A;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        j2 j2Var = this.f398y;
        if (j2Var != null) {
            return j2Var.f2551a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        j2 j2Var = this.f398y;
        if (j2Var != null) {
            return j2Var.f2552b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        j2 j2Var = this.f398y;
        if (j2Var != null) {
            return j2Var.f2556g ? j2Var.f2552b : j2Var.f2551a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f399z;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f;
        return (actionMenuView == null || (mVar = actionMenuView.f326u) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.A, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f399z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        z zVar = this.f384j;
        if (zVar != null) {
            return zVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        z zVar = this.f384j;
        if (zVar != null) {
            return zVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        f();
        return this.f.getMenu();
    }

    public View getNavButtonView() {
        return this.f383i;
    }

    public CharSequence getNavigationContentDescription() {
        y yVar = this.f383i;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        y yVar = this.f383i;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public b getOuterActionMenuPresenter() {
        return this.Q;
    }

    public Drawable getOverflowIcon() {
        f();
        return this.f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f388o;
    }

    public int getPopupTheme() {
        return this.f389p;
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    public final TextView getSubtitleTextView() {
        return this.f382h;
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public int getTitleMarginBottom() {
        return this.f397x;
    }

    public int getTitleMarginEnd() {
        return this.f395v;
    }

    public int getTitleMarginStart() {
        return this.f394u;
    }

    public int getTitleMarginTop() {
        return this.f396w;
    }

    public final TextView getTitleTextView() {
        return this.f381g;
    }

    public g1 getWrapper() {
        if (this.P == null) {
            this.P = new k3(this, true);
        }
        return this.P;
    }

    public final void h() {
        if (this.f383i == null) {
            this.f383i = new y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            h3 h3VarJ = j();
            h3VarJ.f2542a = (this.f392s & 112) | 8388611;
            this.f383i.setLayoutParams(h3VarJ);
        }
    }

    @Override // p0.l
    public final void i(n0 n0Var) {
        t tVar = this.L;
        ((CopyOnWriteArrayList) tVar.f579c).remove(n0Var);
        if (((HashMap) tVar.f580d).remove(n0Var) == null) {
            ((Runnable) tVar.f578b).run();
        } else {
            q.c();
        }
    }

    public final int l(View view, int i4) {
        h3 h3Var = (h3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int i6 = h3Var.f2542a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.B & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i5;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) h3Var).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) h3Var).topMargin;
        if (iMax < i7) {
            iMax = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) h3Var).bottomMargin;
            if (i8 < i9) {
                iMax = Math.max(0, iMax - (i9 - i8));
            }
        }
        return paddingTop + iMax;
    }

    public final void o() {
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.L.f579c).iterator();
        while (it.hasNext()) {
            ((n0) it.next()).f730a.j(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f380b0);
        x();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.H = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int iR;
        int iS;
        int iMax;
        int iMin;
        boolean zV;
        boolean zV2;
        int measuredHeight;
        y0 y0Var;
        y0 y0Var2;
        h3 h3Var;
        h3 h3Var2;
        int i8;
        boolean z5;
        int i9;
        int i10;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iMax2;
        int i17;
        int i18;
        int i19;
        int i20;
        ArrayList arrayList;
        int size;
        int iR2;
        int i21;
        int size2;
        int i22;
        int i23;
        int size3;
        int i24;
        int i25;
        int measuredWidth;
        int i26;
        int i27;
        int i28;
        int size4;
        z zVar;
        View view;
        ActionMenuView actionMenuView;
        y yVar;
        boolean z6 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i29 = width - paddingRight;
        int[] iArr = this.K;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = p0.f3233a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i7 - i5) : 0;
        if (v(this.f383i)) {
            y yVar2 = this.f383i;
            if (z6) {
                iS = s(yVar2, i29, iMin2, iArr);
                iR = paddingLeft;
            } else {
                iR = r(yVar2, paddingLeft, iMin2, iArr);
            }
            if (v(this.f387m)) {
                yVar = this.f387m;
                if (z6) {
                    iS = s(yVar, iS, iMin2, iArr);
                } else {
                    iR = r(yVar, iR, iMin2, iArr);
                }
            }
            if (v(this.f)) {
                actionMenuView = this.f;
                if (z6) {
                    iR = r(actionMenuView, iR, iMin2, iArr);
                } else {
                    iS = s(actionMenuView, iS, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iR);
            iArr[1] = Math.max(0, currentContentInsetRight - (i29 - iS));
            iMax = Math.max(iR, currentContentInsetLeft);
            iMin = Math.min(iS, i29 - currentContentInsetRight);
            if (v(this.n)) {
                view = this.n;
                if (z6) {
                    iMin = s(view, iMin, iMin2, iArr);
                } else {
                    iMax = r(view, iMax, iMin2, iArr);
                }
            }
            if (v(this.f384j)) {
                zVar = this.f384j;
                if (z6) {
                    iMin = s(zVar, iMin, iMin2, iArr);
                } else {
                    iMax = r(zVar, iMax, iMin2, iArr);
                }
            }
            zV = v(this.f381g);
            zV2 = v(this.f382h);
            if (zV) {
                h3 h3Var3 = (h3) this.f381g.getLayoutParams();
                measuredHeight = this.f381g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) h3Var3).topMargin + ((ViewGroup.MarginLayoutParams) h3Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zV2) {
                h3 h3Var4 = (h3) this.f382h.getLayoutParams();
                measuredHeight = this.f382h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) h3Var4).topMargin + ((ViewGroup.MarginLayoutParams) h3Var4).bottomMargin + measuredHeight;
            }
            if (zV || zV2) {
                if (zV) {
                    y0Var = this.f381g;
                } else {
                    y0Var = this.f382h;
                }
                if (zV2) {
                    y0Var2 = this.f382h;
                } else {
                    y0Var2 = this.f381g;
                }
                h3Var = (h3) y0Var.getLayoutParams();
                h3Var2 = (h3) y0Var2.getLayoutParams();
                i8 = measuredHeight;
                z5 = (!zV && this.f381g.getMeasuredWidth() > 0) || (zV2 && this.f382h.getMeasuredWidth() > 0);
                i9 = this.B & 112;
                i10 = iMax;
                if (i9 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) h3Var).topMargin + this.f396w;
                } else if (i9 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                    i17 = ((ViewGroup.MarginLayoutParams) h3Var).topMargin + this.f396w;
                    if (iMax2 < i17) {
                        iMax2 = i17;
                    } else {
                        i18 = (((height - paddingBottom) - i8) - iMax2) - paddingTop2;
                        i19 = ((ViewGroup.MarginLayoutParams) h3Var).bottomMargin;
                        i20 = this.f397x;
                        if (i18 < i19 + i20) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) h3Var2).bottomMargin + i20) - i18));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) h3Var2).bottomMargin) - this.f397x) - i8;
                }
                if (z6) {
                    if (z5) {
                        i14 = this.f394u;
                    } else {
                        i14 = 0;
                    }
                    int i30 = i14 - iArr[1];
                    iMin -= Math.max(0, i30);
                    iArr[1] = Math.max(0, -i30);
                    if (zV) {
                        h3 h3Var5 = (h3) this.f381g.getLayoutParams();
                        int measuredWidth2 = iMin - this.f381g.getMeasuredWidth();
                        int measuredHeight2 = this.f381g.getMeasuredHeight() + paddingTop;
                        this.f381g.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i15 = measuredWidth2 - this.f395v;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) h3Var5).bottomMargin;
                    } else {
                        i15 = iMin;
                    }
                    if (zV2) {
                        int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((h3) this.f382h.getLayoutParams())).topMargin;
                        this.f382h.layout(iMin - this.f382h.getMeasuredWidth(), i31, iMin, this.f382h.getMeasuredHeight() + i31);
                        i16 = iMin - this.f395v;
                    } else {
                        i16 = iMin;
                    }
                    if (z5) {
                        iMin = Math.min(i15, i16);
                    }
                    iMax = i10;
                } else {
                    if (z5) {
                        i11 = this.f394u;
                    } else {
                        i11 = 0;
                    }
                    int i32 = i11 - iArr[0];
                    iMax = Math.max(0, i32) + i10;
                    iArr[0] = Math.max(0, -i32);
                    if (zV) {
                        h3 h3Var6 = (h3) this.f381g.getLayoutParams();
                        int measuredWidth3 = this.f381g.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f381g.getMeasuredHeight() + paddingTop;
                        this.f381g.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i12 = measuredWidth3 + this.f395v;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) h3Var6).bottomMargin;
                    } else {
                        i12 = iMax;
                    }
                    if (zV2) {
                        int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((h3) this.f382h.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f382h.getMeasuredWidth() + iMax;
                        this.f382h.layout(iMax, i33, measuredWidth4, this.f382h.getMeasuredHeight() + i33);
                        i13 = measuredWidth4 + this.f395v;
                    } else {
                        i13 = iMax;
                    }
                    if (z5) {
                        iMax = Math.max(i12, i13);
                    }
                }
            }
            arrayList = this.I;
            a(3, arrayList);
            size = arrayList.size();
            iR2 = iMax;
            for (i21 = 0; i21 < size; i21++) {
                iR2 = r((View) arrayList.get(i21), iR2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i22 = 0; i22 < size2; i22++) {
                iMin = s((View) arrayList.get(i22), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i34 = iArr[0];
            i23 = iArr[1];
            size3 = arrayList.size();
            i24 = i34;
            i25 = 0;
            measuredWidth = 0;
            while (i25 < size3) {
                View view2 = (View) arrayList.get(i25);
                h3 h3Var7 = (h3) view2.getLayoutParams();
                int i35 = i23;
                int i36 = ((ViewGroup.MarginLayoutParams) h3Var7).leftMargin - i24;
                int i37 = ((ViewGroup.MarginLayoutParams) h3Var7).rightMargin - i35;
                int iMax3 = Math.max(0, i36);
                int iMax4 = Math.max(0, i37);
                int iMax5 = Math.max(0, -i36);
                int iMax6 = Math.max(0, -i37);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i25++;
                i24 = iMax5;
                i23 = iMax6;
            }
            i27 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i28 = measuredWidth + i27;
            if (i27 >= iR2) {
                if (i28 > iMin) {
                    iR2 = i27 - (i28 - iMin);
                } else {
                    iR2 = i27;
                }
            }
            size4 = arrayList.size();
            for (i26 = 0; i26 < size4; i26++) {
                iR2 = r((View) arrayList.get(i26), iR2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iR = paddingLeft;
        iS = i29;
        if (v(this.f387m)) {
            yVar = this.f387m;
            if (z6) {
                iS = s(yVar, iS, iMin2, iArr);
            } else {
                iR = r(yVar, iR, iMin2, iArr);
            }
        }
        if (v(this.f)) {
            actionMenuView = this.f;
            if (z6) {
                iR = r(actionMenuView, iR, iMin2, iArr);
            } else {
                iS = s(actionMenuView, iS, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iR);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i29 - iS));
        iMax = Math.max(iR, currentContentInsetLeft2);
        iMin = Math.min(iS, i29 - currentContentInsetRight2);
        if (v(this.n)) {
            view = this.n;
            if (z6) {
                iMin = s(view, iMin, iMin2, iArr);
            } else {
                iMax = r(view, iMax, iMin2, iArr);
            }
        }
        if (v(this.f384j)) {
            zVar = this.f384j;
            if (z6) {
                iMin = s(zVar, iMin, iMin2, iArr);
            } else {
                iMax = r(zVar, iMax, iMin2, iArr);
            }
        }
        zV = v(this.f381g);
        zV2 = v(this.f382h);
        if (zV) {
            h3 h3Var8 = (h3) this.f381g.getLayoutParams();
            measuredHeight = this.f381g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) h3Var8).topMargin + ((ViewGroup.MarginLayoutParams) h3Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zV2) {
            h3 h3Var9 = (h3) this.f382h.getLayoutParams();
            measuredHeight = this.f382h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) h3Var9).topMargin + ((ViewGroup.MarginLayoutParams) h3Var9).bottomMargin + measuredHeight;
        }
        if (zV) {
            if (zV) {
                y0Var = this.f381g;
            } else {
                y0Var = this.f382h;
            }
            if (zV2) {
                y0Var2 = this.f382h;
            } else {
                y0Var2 = this.f381g;
            }
            h3Var = (h3) y0Var.getLayoutParams();
            h3Var2 = (h3) y0Var2.getLayoutParams();
            i8 = measuredHeight;
            if (zV) {
            }
            i9 = this.B & 112;
            i10 = iMax;
            if (i9 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) h3Var).topMargin + this.f396w;
            } else if (i9 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                i17 = ((ViewGroup.MarginLayoutParams) h3Var).topMargin + this.f396w;
                if (iMax2 < i17) {
                    iMax2 = i17;
                } else {
                    i18 = (((height - paddingBottom) - i8) - iMax2) - paddingTop2;
                    i19 = ((ViewGroup.MarginLayoutParams) h3Var).bottomMargin;
                    i20 = this.f397x;
                    if (i18 < i19 + i20) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) h3Var2).bottomMargin + i20) - i18));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) h3Var2).bottomMargin) - this.f397x) - i8;
            }
            if (z6) {
                if (z5) {
                    i14 = this.f394u;
                } else {
                    i14 = 0;
                }
                int i38 = i14 - iArr[1];
                iMin -= Math.max(0, i38);
                iArr[1] = Math.max(0, -i38);
                if (zV) {
                    h3 h3Var10 = (h3) this.f381g.getLayoutParams();
                    int measuredWidth5 = iMin - this.f381g.getMeasuredWidth();
                    int measuredHeight4 = this.f381g.getMeasuredHeight() + paddingTop;
                    this.f381g.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i15 = measuredWidth5 - this.f395v;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) h3Var10).bottomMargin;
                } else {
                    i15 = iMin;
                }
                if (zV2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((h3) this.f382h.getLayoutParams())).topMargin;
                    this.f382h.layout(iMin - this.f382h.getMeasuredWidth(), i39, iMin, this.f382h.getMeasuredHeight() + i39);
                    i16 = iMin - this.f395v;
                } else {
                    i16 = iMin;
                }
                if (z5) {
                    iMin = Math.min(i15, i16);
                }
                iMax = i10;
            } else {
                if (z5) {
                    i11 = this.f394u;
                } else {
                    i11 = 0;
                }
                int i310 = i11 - iArr[0];
                iMax = Math.max(0, i310) + i10;
                iArr[0] = Math.max(0, -i310);
                if (zV) {
                    h3 h3Var11 = (h3) this.f381g.getLayoutParams();
                    int measuredWidth6 = this.f381g.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f381g.getMeasuredHeight() + paddingTop;
                    this.f381g.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i12 = measuredWidth6 + this.f395v;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) h3Var11).bottomMargin;
                } else {
                    i12 = iMax;
                }
                if (zV2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((h3) this.f382h.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f382h.getMeasuredWidth() + iMax;
                    this.f382h.layout(iMax, i311, measuredWidth7, this.f382h.getMeasuredHeight() + i311);
                    i13 = measuredWidth7 + this.f395v;
                } else {
                    i13 = iMax;
                }
                if (z5) {
                    iMax = Math.max(i12, i13);
                }
            }
        } else {
            if (zV) {
                y0Var = this.f381g;
            } else {
                y0Var = this.f382h;
            }
            if (zV2) {
                y0Var2 = this.f382h;
            } else {
                y0Var2 = this.f381g;
            }
            h3Var = (h3) y0Var.getLayoutParams();
            h3Var2 = (h3) y0Var2.getLayoutParams();
            i8 = measuredHeight;
            if (zV) {
            }
            i9 = this.B & 112;
            i10 = iMax;
            if (i9 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) h3Var).topMargin + this.f396w;
            } else if (i9 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                i17 = ((ViewGroup.MarginLayoutParams) h3Var).topMargin + this.f396w;
                if (iMax2 < i17) {
                    iMax2 = i17;
                } else {
                    i18 = (((height - paddingBottom) - i8) - iMax2) - paddingTop2;
                    i19 = ((ViewGroup.MarginLayoutParams) h3Var).bottomMargin;
                    i20 = this.f397x;
                    if (i18 < i19 + i20) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) h3Var2).bottomMargin + i20) - i18));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) h3Var2).bottomMargin) - this.f397x) - i8;
            }
            if (z6) {
                if (z5) {
                    i14 = this.f394u;
                } else {
                    i14 = 0;
                }
                int i312 = i14 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zV) {
                    h3 h3Var12 = (h3) this.f381g.getLayoutParams();
                    int measuredWidth8 = iMin - this.f381g.getMeasuredWidth();
                    int measuredHeight6 = this.f381g.getMeasuredHeight() + paddingTop;
                    this.f381g.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i15 = measuredWidth8 - this.f395v;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) h3Var12).bottomMargin;
                } else {
                    i15 = iMin;
                }
                if (zV2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((h3) this.f382h.getLayoutParams())).topMargin;
                    this.f382h.layout(iMin - this.f382h.getMeasuredWidth(), i313, iMin, this.f382h.getMeasuredHeight() + i313);
                    i16 = iMin - this.f395v;
                } else {
                    i16 = iMin;
                }
                if (z5) {
                    iMin = Math.min(i15, i16);
                }
                iMax = i10;
            } else {
                if (z5) {
                    i11 = this.f394u;
                } else {
                    i11 = 0;
                }
                int i314 = i11 - iArr[0];
                iMax = Math.max(0, i314) + i10;
                iArr[0] = Math.max(0, -i314);
                if (zV) {
                    h3 h3Var13 = (h3) this.f381g.getLayoutParams();
                    int measuredWidth9 = this.f381g.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f381g.getMeasuredHeight() + paddingTop;
                    this.f381g.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i12 = measuredWidth9 + this.f395v;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) h3Var13).bottomMargin;
                } else {
                    i12 = iMax;
                }
                if (zV2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((h3) this.f382h.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f382h.getMeasuredWidth() + iMax;
                    this.f382h.layout(iMax, i315, measuredWidth10, this.f382h.getMeasuredHeight() + i315);
                    i13 = measuredWidth10 + this.f395v;
                } else {
                    i13 = iMax;
                }
                if (z5) {
                    iMax = Math.max(i12, i13);
                }
            }
        }
        arrayList = this.I;
        a(3, arrayList);
        size = arrayList.size();
        iR2 = iMax;
        while (i21 < size) {
            iR2 = r((View) arrayList.get(i21), iR2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i22 < size2) {
            iMin = s((View) arrayList.get(i22), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i316 = iArr[0];
        i23 = iArr[1];
        size3 = arrayList.size();
        i24 = i316;
        i25 = 0;
        measuredWidth = 0;
        while (i25 < size3) {
            View view3 = (View) arrayList.get(i25);
            h3 h3Var14 = (h3) view3.getLayoutParams();
            int i317 = i23;
            int i318 = ((ViewGroup.MarginLayoutParams) h3Var14).leftMargin - i24;
            int i319 = ((ViewGroup.MarginLayoutParams) h3Var14).rightMargin - i317;
            int iMax7 = Math.max(0, i318);
            int iMax8 = Math.max(0, i319);
            int iMax9 = Math.max(0, -i318);
            int iMax10 = Math.max(0, -i319);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i25++;
            i24 = iMax9;
            i23 = iMax10;
        }
        i27 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i28 = measuredWidth + i27;
        if (i27 >= iR2) {
            if (i28 > iMin) {
                iR2 = i27 - (i28 - iMin);
            } else {
                iR2 = i27;
            }
        }
        size4 = arrayList.size();
        while (i26 < size4) {
            iR2 = r((View) arrayList.get(i26), iR2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        char c4;
        Object[] objArr;
        int iM;
        int iMax;
        int iCombineMeasuredStates;
        int iM2;
        int iN;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z4 = p3.f2612a;
        int i6 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c4 = 0;
        } else {
            c4 = 1;
            objArr = false;
        }
        if (v(this.f383i)) {
            u(this.f383i, i4, 0, i5, this.f393t);
            iM = m(this.f383i) + this.f383i.getMeasuredWidth();
            iMax = Math.max(0, n(this.f383i) + this.f383i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f383i.getMeasuredState());
        } else {
            iM = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (v(this.f387m)) {
            u(this.f387m, i4, 0, i5, this.f393t);
            iM = m(this.f387m) + this.f387m.getMeasuredWidth();
            iMax = Math.max(iMax, n(this.f387m) + this.f387m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f387m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM);
        int iMax4 = Math.max(0, currentContentInsetStart - iM);
        Object[] objArr2 = objArr;
        int[] iArr = this.K;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (v(this.f)) {
            u(this.f, i4, iMax3, i5, this.f393t);
            iM2 = m(this.f) + this.f.getMeasuredWidth();
            iMax = Math.max(iMax, n(this.f) + this.f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f.getMeasuredState());
        } else {
            iM2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM2);
        iArr[c4] = Math.max(0, currentContentInsetEnd - iM2);
        if (v(this.n)) {
            iMax5 += t(this.n, i4, iMax5, i5, 0, iArr);
            iMax = Math.max(iMax, n(this.n) + this.n.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        }
        if (v(this.f384j)) {
            iMax5 += t(this.f384j, i4, iMax5, i5, 0, iArr);
            iMax = Math.max(iMax, n(this.f384j) + this.f384j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f384j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (((h3) childAt.getLayoutParams()).f2543b == 0 && v(childAt)) {
                iMax5 += t(childAt, i4, iMax5, i5, 0, iArr);
                int iMax6 = Math.max(iMax, n(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i8 = iMax5;
        int i9 = this.f396w + this.f397x;
        int i10 = this.f394u + this.f395v;
        if (v(this.f381g)) {
            t(this.f381g, i4, i8 + i10, i5, i9, iArr);
            int iM3 = m(this.f381g) + this.f381g.getMeasuredWidth();
            iN = n(this.f381g) + this.f381g.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f381g.getMeasuredState());
            iMax2 = iM3;
        } else {
            iN = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (v(this.f382h)) {
            iMax2 = Math.max(iMax2, t(this.f382h, i4, i8 + i10, i5, i9 + iN, iArr));
            iN += n(this.f382h) + this.f382h.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f382h.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iN);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i8 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i4, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, iCombineMeasuredStates2 << 16);
        if (!this.U) {
            i6 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (v(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i6 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i6);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f);
        ActionMenuView actionMenuView = this.f;
        m mVar = actionMenuView != null ? actionMenuView.f326u : null;
        int i4 = savedState.f400h;
        if (i4 != 0 && this.R != null && mVar != null && (menuItemFindItem = mVar.findItem(i4)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f401i) {
            d0 d0Var = this.f380b0;
            removeCallbacks(d0Var);
            post(d0Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        e();
        j2 j2Var = this.f398y;
        boolean z4 = i4 == 1;
        if (z4 == j2Var.f2556g) {
            return;
        }
        j2Var.f2556g = z4;
        if (!j2Var.f2557h) {
            j2Var.f2551a = j2Var.f2555e;
            j2Var.f2552b = j2Var.f;
            return;
        }
        if (z4) {
            int i5 = j2Var.f2554d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = j2Var.f2555e;
            }
            j2Var.f2551a = i5;
            int i6 = j2Var.f2553c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = j2Var.f;
            }
            j2Var.f2552b = i6;
            return;
        }
        int i7 = j2Var.f2553c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = j2Var.f2555e;
        }
        j2Var.f2551a = i7;
        int i8 = j2Var.f2554d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = j2Var.f;
        }
        j2Var.f2552b = i8;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o oVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        g3 g3Var = this.R;
        if (g3Var != null && (oVar = g3Var.f2522g) != null) {
            savedState.f400h = oVar.f2408a;
        }
        savedState.f401i = q();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.G = false;
        return true;
    }

    public final boolean p(View view) {
        return view.getParent() == this || this.J.contains(view);
    }

    public final boolean q() {
        b bVar;
        ActionMenuView actionMenuView = this.f;
        return (actionMenuView == null || (bVar = actionMenuView.f330y) == null || !bVar.g()) ? false : true;
    }

    public final int r(View view, int i4, int i5, int[] iArr) {
        h3 h3Var = (h3) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) h3Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i6) + i4;
        iArr[0] = Math.max(0, -i6);
        int iL = l(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iL, iMax + measuredWidth, view.getMeasuredHeight() + iL);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) h3Var).rightMargin + iMax;
    }

    public final int s(View view, int i4, int i5, int[] iArr) {
        h3 h3Var = (h3) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) h3Var).rightMargin - iArr[1];
        int iMax = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int iL = l(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iL, iMax, view.getMeasuredHeight() + iL);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) h3Var).leftMargin);
    }

    public void setBackInvokedCallbackEnabled(boolean z4) {
        if (this.f379a0 != z4) {
            this.f379a0 = z4;
            x();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        y yVar = this.f387m;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f387m.setImageDrawable(drawable);
        } else {
            y yVar = this.f387m;
            if (yVar != null) {
                yVar.setImageDrawable(this.f385k);
            }
        }
    }

    public void setCollapsible(boolean z4) {
        this.U = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.A) {
            this.A = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f399z) {
            this.f399z = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        z zVar = this.f384j;
        if (drawable != null) {
            if (zVar == null) {
                this.f384j = new z(getContext());
            }
            if (!p(this.f384j)) {
                b(this.f384j, true);
            }
        } else if (zVar != null && p(zVar)) {
            removeView(this.f384j);
            this.J.remove(this.f384j);
        }
        z zVar2 = this.f384j;
        if (zVar2 != null) {
            zVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f384j == null) {
            this.f384j = new z(getContext());
        }
        z zVar = this.f384j;
        if (zVar != null) {
            zVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        y yVar = this.f383i;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
            l3.a(this.f383i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            if (!p(this.f383i)) {
                b(this.f383i, true);
            }
        } else {
            y yVar = this.f383i;
            if (yVar != null && p(yVar)) {
                removeView(this.f383i);
                this.J.remove(this.f383i);
            }
        }
        y yVar2 = this.f383i;
        if (yVar2 != null) {
            yVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        h();
        this.f383i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(i3 i3Var) {
        this.N = i3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        f();
        this.f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.f389p != i4) {
            this.f389p = i4;
            if (i4 == 0) {
                this.f388o = getContext();
            } else {
                this.f388o = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        y0 y0Var = this.f382h;
        if (!zIsEmpty) {
            if (y0Var == null) {
                Context context = getContext();
                y0 y0Var2 = new y0(context, null);
                this.f382h = y0Var2;
                y0Var2.setSingleLine();
                this.f382h.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f391r;
                if (i4 != 0) {
                    this.f382h.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.f382h.setTextColor(colorStateList);
                }
            }
            if (!p(this.f382h)) {
                b(this.f382h, true);
            }
        } else if (y0Var != null && p(y0Var)) {
            removeView(this.f382h);
            this.J.remove(this.f382h);
        }
        y0 y0Var3 = this.f382h;
        if (y0Var3 != null) {
            y0Var3.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        y0 y0Var = this.f382h;
        if (y0Var != null) {
            y0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        y0 y0Var = this.f381g;
        if (!zIsEmpty) {
            if (y0Var == null) {
                Context context = getContext();
                y0 y0Var2 = new y0(context, null);
                this.f381g = y0Var2;
                y0Var2.setSingleLine();
                this.f381g.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f390q;
                if (i4 != 0) {
                    this.f381g.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f381g.setTextColor(colorStateList);
                }
            }
            if (!p(this.f381g)) {
                b(this.f381g, true);
            }
        } else if (y0Var != null && p(y0Var)) {
            removeView(this.f381g);
            this.J.remove(this.f381g);
        }
        y0 y0Var3 = this.f381g;
        if (y0Var3 != null) {
            y0Var3.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setTitleMarginBottom(int i4) {
        this.f397x = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f395v = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f394u = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f396w = i4;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        y0 y0Var = this.f381g;
        if (y0Var != null) {
            y0Var.setTextColor(colorStateList);
        }
    }

    public final int t(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + iMax + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void u(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean w() {
        b bVar;
        ActionMenuView actionMenuView = this.f;
        return (actionMenuView == null || (bVar = actionMenuView.f330y) == null || !bVar.n()) ? false : true;
    }

    public final void x() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = f3.a(this);
            g3 g3Var = this.R;
            boolean z4 = (g3Var == null || g3Var.f2522g == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f379a0) ? false : true;
            if (z4 && this.W == null) {
                if (this.V == null) {
                    this.V = f3.b(new d3(this, 0));
                }
                f3.c(onBackInvokedDispatcherA, this.V);
                this.W = onBackInvokedDispatcherA;
                return;
            }
            if (z4 || (onBackInvokedDispatcher = this.W) == null) {
                return;
            }
            f3.d(onBackInvokedDispatcher, this.V);
            this.W = null;
        }
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(h0.w(getContext(), i4));
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(h0.w(getContext(), i4));
    }

    public void setLogo(int i4) {
        setLogo(h0.w(getContext(), i4));
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
