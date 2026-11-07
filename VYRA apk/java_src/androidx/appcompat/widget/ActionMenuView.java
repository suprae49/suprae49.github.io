package androidx.appcompat.widget;

import a3.h0;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.gms.common.api.Api;
import e.k0;
import j.a0;
import j.k;
import j.l;
import j.o;
import j.x;
import k.g;
import k.j;
import k.m;
import k.p3;
import k.t1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements l, a0 {
    public k A;
    public boolean B;
    public int C;
    public final int D;
    public final int E;
    public m F;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j.m f326u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Context f327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f329x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f330y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k0 f331z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.D = (int) (56.0f * f);
        this.E = (int) (f * 4.0f);
        this.f327v = context;
        this.f328w = 0;
    }

    public static k.l j() {
        k.l lVar = new k.l(-2, -2);
        lVar.f2575a = false;
        ((LinearLayout.LayoutParams) lVar).gravity = 16;
        return lVar;
    }

    public static k.l k(ViewGroup.LayoutParams layoutParams) {
        k.l lVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof k.l) {
            k.l lVar2 = (k.l) layoutParams;
            lVar = new k.l(lVar2);
            lVar.f2575a = lVar2.f2575a;
        } else {
            lVar = new k.l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) lVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) lVar).gravity = 16;
        }
        return lVar;
    }

    @Override // j.a0
    public final void a(j.m mVar) {
        this.f326u = mVar;
    }

    @Override // j.l
    public final boolean c(o oVar) {
        return this.f326u.q(oVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k.l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ t1 generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: g */
    public final t1 generateLayoutParams(AttributeSet attributeSet) {
        return new k.l(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new k.l(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f326u == null) {
            Context context = getContext();
            j.m mVar = new j.m(context);
            this.f326u = mVar;
            mVar.f2388e = new h0(18, this);
            b bVar = new b(context);
            this.f330y = bVar;
            bVar.f416r = true;
            bVar.f417s = true;
            x fVar = this.f331z;
            if (fVar == null) {
                fVar = new a3.f(17);
            }
            bVar.f409j = fVar;
            this.f326u.b(bVar, this.f327v);
            b bVar2 = this.f330y;
            bVar2.f412m = this;
            this.f326u = bVar2.f407h;
        }
        return this.f326u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        b bVar = this.f330y;
        j jVar = bVar.f413o;
        if (jVar != null) {
            return jVar.getDrawable();
        }
        if (bVar.f415q) {
            return bVar.f414p;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f328w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ t1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i4) {
        boolean zA = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof k.k)) {
            zA = ((k.k) childAt).a();
        }
        return (i4 <= 0 || !(childAt2 instanceof k.k)) ? zA : ((k.k) childAt2).c() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b bVar = this.f330y;
        if (bVar != null) {
            bVar.f(false);
            if (this.f330y.g()) {
                this.f330y.c();
                this.f330y.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f330y;
        if (bVar != null) {
            bVar.c();
            g gVar = bVar.f424z;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.f2449j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int width;
        int paddingLeft;
        if (!this.B) {
            super.onLayout(z4, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i6 - i4;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean z5 = p3.f2612a;
        boolean z6 = getLayoutDirection() == 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                k.l lVar = (k.l) childAt.getLayoutParams();
                if (lVar.f2575a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z6) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) lVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) lVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) lVar).leftMargin) + ((LinearLayout.LayoutParams) lVar).rightMargin;
                    l(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (z6) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                k.l lVar2 = (k.l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !lVar2.f2575a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) lVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) lVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            k.l lVar3 = (k.l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !lVar3.f2575a) {
                int i21 = paddingLeft2 + ((LinearLayout.LayoutParams) lVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) lVar3).rightMargin + iMax + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        ?? r11;
        int i8;
        int i9;
        j.m mVar;
        boolean z4 = this.B;
        boolean z5 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.B = z5;
        if (z4 != z5) {
            this.C = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.B && (mVar = this.f326u) != null && size != this.C) {
            this.C = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.B || childCount <= 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                k.l lVar = (k.l) getChildAt(i10).getLayoutParams();
                ((LinearLayout.LayoutParams) lVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) lVar).leftMargin = 0;
            }
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i4);
        int size3 = View.MeasureSpec.getSize(i5);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int i11 = size2 - paddingRight;
        int i12 = this.D;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = (i14 / i13) + i12;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i16 = 0;
        int iMax2 = 0;
        int i17 = 0;
        boolean z6 = false;
        int i18 = 0;
        long j4 = 0;
        while (true) {
            i6 = this.E;
            if (i17 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i17);
            int i19 = size3;
            int i20 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i8 = i15;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                i16++;
                if (z7) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                k.l lVar2 = (k.l) childAt.getLayoutParams();
                lVar2.f = false;
                lVar2.f2577c = 0;
                lVar2.f2576b = 0;
                lVar2.f2578d = false;
                ((LinearLayout.LayoutParams) lVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) lVar2).rightMargin = 0;
                lVar2.f2579e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i21 = lVar2.f2575a ? 1 : i13;
                k.l lVar3 = (k.l) childAt.getLayoutParams();
                int i22 = i13;
                i8 = i15;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i20, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z9 = z8;
                if (i21 <= 0 || (z8 && i21 < 2)) {
                    i9 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i21, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i9 = measuredWidth / i8;
                    if (measuredWidth % i8 != 0) {
                        i9++;
                    }
                    if (z9 && i9 < 2) {
                        i9 = 2;
                    }
                }
                lVar3.f2578d = !lVar3.f2575a && z9;
                lVar3.f2576b = i9;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i9);
                if (lVar2.f2578d) {
                    i18++;
                }
                if (lVar2.f2575a) {
                    z6 = true;
                }
                i13 = i22 - i9;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i9 == 1) {
                    j4 |= (long) (1 << i17);
                }
            }
            i17++;
            size3 = i19;
            paddingBottom = i20;
            i15 = i8;
        }
        int i23 = size3;
        int i24 = i13;
        int i25 = i15;
        boolean z10 = z6 && i16 == 2;
        int i26 = i24;
        boolean z11 = false;
        while (true) {
            if (i18 <= 0 || i26 <= 0) {
                i7 = iMax;
                break;
            }
            int i27 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            long j5 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i29 < childCount2) {
                int i30 = iMax;
                k.l lVar4 = (k.l) getChildAt(i29).getLayoutParams();
                boolean z12 = z10;
                if (lVar4.f2578d) {
                    int i31 = lVar4.f2576b;
                    if (i31 < i27) {
                        j5 = 1 << i29;
                        i27 = i31;
                        i28 = 1;
                    } else if (i31 == i27) {
                        j5 |= 1 << i29;
                        i28++;
                    }
                }
                i29++;
                z10 = z12;
                iMax = i30;
            }
            i7 = iMax;
            boolean z13 = z10;
            j4 |= j5;
            if (i28 > i26) {
                break;
            }
            int i32 = i27 + 1;
            int i33 = 0;
            while (i33 < childCount2) {
                View childAt2 = getChildAt(i33);
                k.l lVar5 = (k.l) childAt2.getLayoutParams();
                boolean z14 = z6;
                long j6 = 1 << i33;
                if ((j5 & j6) != 0) {
                    if (z13 && lVar5.f2579e) {
                        r11 = 1;
                        r11 = 1;
                        if (i26 == 1) {
                            childAt2.setPadding(i6 + i25, 0, i6, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    lVar5.f2576b += r11;
                    lVar5.f = r11;
                    i26--;
                } else if (lVar5.f2576b == i32) {
                    j4 |= j6;
                }
                i33++;
                z6 = z14;
            }
            z10 = z13;
            iMax = i7;
            z11 = true;
        }
        boolean z15 = !z6 && i16 == 1;
        if (i26 > 0 && j4 != 0 && (i26 < i16 - 1 || z15 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j4);
            if (!z15) {
                if ((j4 & 1) != 0 && !((k.l) getChildAt(0).getLayoutParams()).f2579e) {
                    fBitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j4 & ((long) (1 << i34))) != 0 && !((k.l) getChildAt(i34).getLayoutParams()).f2579e) {
                    fBitCount -= 0.5f;
                }
            }
            int i35 = fBitCount > 0.0f ? (int) ((i26 * i25) / fBitCount) : 0;
            boolean z16 = z11;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j4 & ((long) (1 << i36))) != 0) {
                    View childAt3 = getChildAt(i36);
                    k.l lVar6 = (k.l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        lVar6.f2577c = i35;
                        lVar6.f = true;
                        if (i36 == 0 && !lVar6.f2579e) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = (-i35) / 2;
                        }
                        z16 = true;
                    } else if (lVar6.f2575a) {
                        lVar6.f2577c = i35;
                        lVar6.f = true;
                        ((LinearLayout.LayoutParams) lVar6).rightMargin = (-i35) / 2;
                        z16 = true;
                    } else {
                        if (i36 != 0) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) lVar6).rightMargin = i35 / 2;
                        }
                    }
                }
            }
            z11 = z16;
        }
        if (z11) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                k.l lVar7 = (k.l) childAt4.getLayoutParams();
                if (lVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((lVar7.f2576b * i25) + lVar7.f2577c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i11, mode != 1073741824 ? i7 : i23);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f330y.f421w = z4;
    }

    public void setOnMenuItemClickListener(m mVar) {
        this.F = mVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        b bVar = this.f330y;
        j jVar = bVar.f413o;
        if (jVar != null) {
            jVar.setImageDrawable(drawable);
        } else {
            bVar.f415q = true;
            bVar.f414p = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
        this.f329x = z4;
    }

    public void setPopupTheme(int i4) {
        if (this.f328w != i4) {
            this.f328w = i4;
            if (i4 == 0) {
                this.f327v = getContext();
            } else {
                this.f327v = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(b bVar) {
        this.f330y = bVar;
        bVar.f412m = this;
        this.f326u = bVar.f407h;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
