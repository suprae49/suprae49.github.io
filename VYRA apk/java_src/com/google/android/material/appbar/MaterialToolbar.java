package com.google.android.material.appbar;

import a3.j;
import a3.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import java.util.Collections;
import k1.m;
import r2.a0;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f1246h0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Integer f1247c0;
    public boolean d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f1248e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ImageView.ScaleType f1249f0;
    public Boolean g0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(f3.a.b(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayF = a0.f(context2, attributeSet, a2.a.E, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayF.hasValue(2)) {
            setNavigationIconTint(typedArrayF.getColor(2, -1));
        }
        this.d0 = typedArrayF.getBoolean(6, false);
        this.f1248e0 = typedArrayF.getBoolean(5, false);
        int i4 = typedArrayF.getInt(1, -1);
        if (i4 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f1246h0;
            if (i4 < scaleTypeArr.length) {
                this.f1249f0 = scaleTypeArr[i4];
            }
        }
        if (typedArrayF.hasValue(0)) {
            this.g0 = Boolean.valueOf(typedArrayF.getBoolean(0, false));
        }
        typedArrayF.recycle();
        o oVarA = o.g(context2, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar).a();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : h0.u(background);
        if (colorStateListValueOf != null) {
            j jVar = new j(oVarA);
            jVar.r(colorStateListValueOf);
            jVar.n(context2);
            jVar.q(getElevation());
            setBackground(jVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f1249f0;
    }

    public Integer getNavigationIconTint() {
        return this.f1247c0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h0.j0(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z4, i4, i5, i6, i7);
        m mVar = a0.f3507c;
        ImageView imageView2 = null;
        if (this.d0 || this.f1248e0) {
            ArrayList arrayListE = a0.e(this, getTitle());
            TextView textView = arrayListE.isEmpty() ? null : (TextView) Collections.min(arrayListE, mVar);
            ArrayList arrayListE2 = a0.e(this, getSubtitle());
            TextView textView2 = arrayListE2.isEmpty() ? null : (TextView) Collections.max(arrayListE2, mVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i8 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i8 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i8 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.d0 && textView != null) {
                    y(textView, pair);
                }
                if (this.f1248e0 && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt2 = getChildAt(i10);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.g0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f1249f0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        h0.b0(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z4) {
        Boolean bool = this.g0;
        if (bool == null || bool.booleanValue() != z4) {
            this.g0 = Boolean.valueOf(z4);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f1249f0 != scaleType) {
            this.f1249f0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f1247c0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f1247c0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i4) {
        this.f1247c0 = Integer.valueOf(i4);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z4) {
        if (this.f1248e0 != z4) {
            this.f1248e0 = z4;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z4) {
        if (this.d0 != z4) {
            this.d0 = z4;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i4 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i5 = measuredWidth2 + i4;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i4, 0), Math.max(i5 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i4 += iMax;
            i5 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i5 - i4, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i4, textView.getTop(), i5, textView.getBottom());
    }
}
