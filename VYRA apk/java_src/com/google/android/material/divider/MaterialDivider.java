package com.google.android.material.divider;

import a3.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import c0.c;
import co.median.android.eeqadjy.R;
import f3.a;
import r2.a0;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1487j;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f = new j();
        TypedArray typedArrayF = a0.f(context2, attributeSet, a2.a.f33y, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f1484g = typedArrayF.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f1486i = typedArrayF.getDimensionPixelOffset(2, 0);
        this.f1487j = typedArrayF.getDimensionPixelOffset(1, 0);
        setDividerColor(i.h(context2, typedArrayF, 0).getDefaultColor());
        typedArrayF.recycle();
    }

    public int getDividerColor() {
        return this.f1485h;
    }

    public int getDividerInsetEnd() {
        return this.f1487j;
    }

    public int getDividerInsetStart() {
        return this.f1486i;
    }

    public int getDividerThickness() {
        return this.f1484g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i4;
        super.onDraw(canvas);
        boolean z4 = getLayoutDirection() == 1;
        int i5 = z4 ? this.f1487j : this.f1486i;
        if (z4) {
            width = getWidth();
            i4 = this.f1486i;
        } else {
            width = getWidth();
            i4 = this.f1487j;
        }
        int i6 = width - i4;
        int bottom = getBottom() - getTop();
        j jVar = this.f;
        jVar.setBounds(i5, 0, i6, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i6 = this.f1484g;
            if (i6 > 0 && measuredHeight != i6) {
                measuredHeight = i6;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i4) {
        if (this.f1485h != i4) {
            this.f1485h = i4;
            this.f.r(ColorStateList.valueOf(i4));
            invalidate();
        }
    }

    public void setDividerColorResource(int i4) {
        setDividerColor(c.getColor(getContext(), i4));
    }

    public void setDividerInsetEnd(int i4) {
        this.f1487j = i4;
    }

    public void setDividerInsetEndResource(int i4) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i4));
    }

    public void setDividerInsetStart(int i4) {
        this.f1486i = i4;
    }

    public void setDividerInsetStartResource(int i4) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i4));
    }

    public void setDividerThickness(int i4) {
        if (this.f1484g != i4) {
            this.f1484g = i4;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i4) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i4));
    }
}
