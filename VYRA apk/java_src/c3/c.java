package c3;

import a3.j;
import a3.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import co.median.android.eeqadjy.R;
import r2.a0;
import t1.l;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends FrameLayout {
    public static final b n = new b();
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f1152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f1153m;

    public c(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(f3.a.b(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a2.a.N);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f1147g = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f = o.g(context2, attributeSet, 0, 0).a();
        }
        this.f1148h = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(i.h(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(a0.h(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1149i = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f1150j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1151k = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(n);
        setFocusable(true);
        if (getBackground() == null) {
            int iU = e4.a.U(e4.a.a0(getContext(), l.s(this, R.attr.colorSurface)), e4.a.a0(getContext(), l.s(this, R.attr.colorOnSurface)), getBackgroundOverlayColorAlpha());
            o oVar = this.f;
            if (oVar != null) {
                int i4 = d.f1154a;
                j jVar = new j(oVar);
                jVar.r(ColorStateList.valueOf(iU));
                drawable = jVar;
            } else {
                Resources resources = getResources();
                int i5 = d.f1154a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iU);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f1152l;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f1149i;
    }

    public int getAnimationMode() {
        return this.f1147g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f1148h;
    }

    public int getMaxInlineActionWidth() {
        return this.f1151k;
    }

    public int getMaxWidth() {
        return this.f1150j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int i6 = this.f1150j;
        if (i6 <= 0 || getMeasuredWidth() <= i6) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
    }

    public void setAnimationMode(int i4) {
        this.f1147g = i4;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f1152l != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f1152l);
            drawable.setTintMode(this.f1153m);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f1152l = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f1153m);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f1153m = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : n);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
