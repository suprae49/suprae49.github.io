package com.google.android.material.navigation;

import a3.j;
import a3.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.emoji2.text.t;
import co.median.android.eeqadjy.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import i.h;
import r2.a0;
import t2.i;
import u1.h0;
import u2.f;
import u2.g;
import u2.l;
import u2.m;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends FrameLayout {
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g2.b f1530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f1531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f1532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f1533j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    public d(Context context, AttributeSet attributeSet) {
        ?? r10;
        super(f3.a.b(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        b bVar = new b();
        bVar.f1528g = false;
        this.f1531h = bVar;
        Context context2 = getContext();
        t tVarG = a0.g(context2, attributeSet, a2.a.G, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 17, 15);
        g gVar = new g(context2, getClass(), getMaxItemCount());
        this.f = gVar;
        g2.b bVar2 = new g2.b(context2);
        this.f1530g = bVar2;
        bVar2.setMinimumHeight(getSuggestedMinimumHeight());
        bVar2.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        bVar.f = bVar2;
        bVar.f1529h = 1;
        bVar2.setPresenter(bVar);
        gVar.b(bVar, gVar.f2384a);
        bVar.h(getContext(), gVar);
        TypedArray typedArray = (TypedArray) tVarG.f579c;
        if (typedArray.hasValue(11)) {
            bVar2.setIconTintList(tVarG.h(11));
        } else {
            bVar2.setIconTintList(bVar2.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(17)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(17, 0));
        }
        if (typedArray.hasValue(15)) {
            setItemTextAppearanceActive(typedArray.getResourceId(15, 0));
        }
        if (typedArray.hasValue(4)) {
            setHorizontalItemTextAppearanceInactive(typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(3)) {
            setHorizontalItemTextAppearanceActive(typedArray.getResourceId(3, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(16, true));
        if (typedArray.hasValue(18)) {
            setItemTextColor(tVarG.h(18));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListU = h0.u(background);
        if (background == null || colorStateListU != null) {
            j jVar = new j(o.g(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).a());
            if (colorStateListU != null) {
                jVar.r(colorStateListU);
            }
            jVar.n(context2);
            setBackground(jVar);
        }
        if (typedArray.hasValue(13)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(13, 0));
        }
        if (typedArray.hasValue(12)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(12, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(5)) {
            setIconLabelHorizontalSpacing(typedArray.getDimensionPixelSize(5, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(i.i(context2, tVarG, 1));
        setLabelVisibilityMode(typedArray.getInteger(21, -1));
        setItemIconGravity(typedArray.getInteger(9, 0));
        setItemGravity(typedArray.getInteger(8, 49));
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            bVar2.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(i.i(context2, tVarG, 14));
        }
        setMeasureBottomPaddingFromLabelBaseline(typedArray.getBoolean(22, true));
        setLabelFontScalingEnabled(typedArray.getBoolean(19, false));
        setLabelMaxLines(typedArray.getInteger(20, 1));
        int resourceId2 = typedArray.getResourceId(6, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, a2.a.F);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = typedArrayObtainStyledAttributes.getString(9);
            int dimensionPixelSize2 = -2;
            if (string != null) {
                if (String.valueOf(-1).equals(string)) {
                    dimensionPixelSize2 = -1;
                } else if (!String.valueOf(-2).equals(string)) {
                    dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(dimensionPixelSize2);
            setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelOffset));
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize3);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize3);
            int i4 = getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            dimensionPixelOffset2 = getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset5 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            Rect rect = bVar2.d0;
            rect.left = i4;
            rect.top = dimensionPixelOffset4;
            rect.right = dimensionPixelOffset2;
            rect.bottom = dimensionPixelOffset5;
            u2.i[] iVarArr = bVar2.f4207l;
            if (iVarArr != null) {
                for (u2.i iVar : iVarArr) {
                    if (iVar instanceof f) {
                        ((f) iVar).setActiveIndicatorExpandedPadding(rect);
                    }
                }
            }
            setItemActiveIndicatorColor(i.h(context2, typedArrayObtainStyledAttributes, 2));
            r10 = 0;
            setItemActiveIndicatorShapeAppearance(o.f(context2, typedArrayObtainStyledAttributes.getResourceId(11, 0), 0).a());
            typedArrayObtainStyledAttributes.recycle();
        } else {
            r10 = 0;
        }
        if (typedArray.hasValue(23)) {
            int resourceId3 = typedArray.getResourceId(23, r10);
            b bVar3 = this.f1531h;
            bVar3.f1528g = true;
            getMenuInflater().inflate(resourceId3, this.f);
            bVar3.f1528g = r10;
            bVar3.f(true);
        }
        tVarG.v();
        addView(this.f1530g);
        this.f.f2388e = new r0.b((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f1532i == null) {
            this.f1532i = new h(getContext());
        }
        return this.f1532i;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z4) {
        this.f1530g.setMeasurePaddingFromLabelBaseline(z4);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f1530g.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f1530g.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f1530g.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f1530g.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f1530g.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f1530g.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f1530g.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f1530g.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f1530g.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f1530g.getItemActiveIndicatorMarginHorizontal();
    }

    public o getItemActiveIndicatorShapeAppearance() {
        return this.f1530g.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f1530g.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f1530g.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f1530g.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f1530g.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f1530g.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f1530g.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f1530g.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f1530g.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f1530g.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f1530g.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f1530g.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f1530g.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f1530g.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f1530g.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f;
    }

    public j.a0 getMenuView() {
        return this.f1530g;
    }

    public ViewGroup getMenuViewGroup() {
        return this.f1530g;
    }

    public b getPresenter() {
        return this.f1531h;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f1530g.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f1530g.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h0.j0(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof NavigationBarView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        NavigationBarView$SavedState navigationBarView$SavedState = (NavigationBarView$SavedState) parcelable;
        super.onRestoreInstanceState(navigationBarView$SavedState.f);
        this.f.t(navigationBarView$SavedState.f1513h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        NavigationBarView$SavedState navigationBarView$SavedState = new NavigationBarView$SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        navigationBarView$SavedState.f1513h = bundle;
        this.f.v(bundle);
        return navigationBarView$SavedState;
    }

    public void setActiveIndicatorLabelPadding(int i4) {
        this.f1530g.setActiveIndicatorLabelPadding(i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        h0.b0(this, f);
    }

    public void setHorizontalItemTextAppearanceActive(int i4) {
        this.f1530g.setHorizontalItemTextAppearanceActive(i4);
    }

    public void setHorizontalItemTextAppearanceInactive(int i4) {
        this.f1530g.setHorizontalItemTextAppearanceInactive(i4);
    }

    public void setIconLabelHorizontalSpacing(int i4) {
        this.f1530g.setIconLabelHorizontalSpacing(i4);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f1530g.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z4) {
        this.f1530g.setItemActiveIndicatorEnabled(z4);
    }

    public void setItemActiveIndicatorExpandedHeight(int i4) {
        this.f1530g.setItemActiveIndicatorExpandedHeight(i4);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i4) {
        this.f1530g.setItemActiveIndicatorExpandedMarginHorizontal(i4);
    }

    public void setItemActiveIndicatorExpandedWidth(int i4) {
        this.f1530g.setItemActiveIndicatorExpandedWidth(i4);
    }

    public void setItemActiveIndicatorHeight(int i4) {
        this.f1530g.setItemActiveIndicatorHeight(i4);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i4) {
        this.f1530g.setItemActiveIndicatorMarginHorizontal(i4);
    }

    public void setItemActiveIndicatorShapeAppearance(o oVar) {
        this.f1530g.setItemActiveIndicatorShapeAppearance(oVar);
    }

    public void setItemActiveIndicatorWidth(int i4) {
        this.f1530g.setItemActiveIndicatorWidth(i4);
    }

    public void setItemBackground(Drawable drawable) {
        this.f1530g.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i4) {
        this.f1530g.setItemBackgroundRes(i4);
    }

    public void setItemGravity(int i4) {
        g2.b bVar = this.f1530g;
        if (bVar.getItemGravity() != i4) {
            bVar.setItemGravity(i4);
            this.f1531h.f(false);
        }
    }

    public void setItemIconGravity(int i4) {
        g2.b bVar = this.f1530g;
        if (bVar.getItemIconGravity() != i4) {
            bVar.setItemIconGravity(i4);
            this.f1531h.f(false);
        }
    }

    public void setItemIconSize(int i4) {
        this.f1530g.setItemIconSize(i4);
    }

    public void setItemIconSizeRes(int i4) {
        setItemIconSize(getResources().getDimensionPixelSize(i4));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f1530g.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i4) {
        this.f1530g.setItemPaddingBottom(i4);
    }

    public void setItemPaddingTop(int i4) {
        this.f1530g.setItemPaddingTop(i4);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f1530g.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i4) {
        this.f1530g.setItemTextAppearanceActive(i4);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z4) {
        this.f1530g.setItemTextAppearanceActiveBoldEnabled(z4);
    }

    public void setItemTextAppearanceInactive(int i4) {
        this.f1530g.setItemTextAppearanceInactive(i4);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1530g.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z4) {
        this.f1530g.setLabelFontScalingEnabled(z4);
    }

    public void setLabelMaxLines(int i4) {
        this.f1530g.setLabelMaxLines(i4);
    }

    public void setLabelVisibilityMode(int i4) {
        g2.b bVar = this.f1530g;
        if (bVar.getLabelVisibilityMode() != i4) {
            bVar.setLabelVisibilityMode(i4);
            this.f1531h.f(false);
        }
    }

    public void setOnItemSelectedListener(m mVar) {
        this.f1533j = mVar;
    }

    public void setSelectedItemId(int i4) {
        g gVar = this.f;
        MenuItem menuItemFindItem = gVar.findItem(i4);
        if (menuItemFindItem != null) {
            boolean zQ = gVar.q(menuItemFindItem, this.f1531h, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zQ || menuItemFindItem.isChecked()) {
                    this.f1530g.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }

    public void setOnItemReselectedListener(l lVar) {
    }
}
