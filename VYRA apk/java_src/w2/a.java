package w2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import k.d0;
import r2.a0;
import t1.l;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[][] f4482l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f4483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4484k;

    public a(Context context, AttributeSet attributeSet) {
        super(f3.a.b(context, attributeSet, co.median.android.eeqadjy.R.attr.radioButtonStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayF = a0.f(context2, attributeSet, a2.a.f34z, co.median.android.eeqadjy.R.attr.radioButtonStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayF.hasValue(0)) {
            setButtonTintList(i.h(context2, typedArrayF, 0));
        }
        if (typedArrayF.hasValue(1)) {
            setRippleColor(i.h(context2, typedArrayF, 1));
        }
        this.f4484k = typedArrayF.getBoolean(2, false);
        typedArrayF.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4483j == null) {
            int iA0 = e4.a.a0(getContext(), l.s(this, co.median.android.eeqadjy.R.attr.colorControlActivated));
            int iA1 = e4.a.a0(getContext(), l.s(this, co.median.android.eeqadjy.R.attr.colorOnSurface));
            int iA2 = e4.a.a0(getContext(), l.s(this, co.median.android.eeqadjy.R.attr.colorSurface));
            this.f4483j = new ColorStateList(f4482l, new int[]{e4.a.U(iA2, iA0, 1.0f), e4.a.U(iA2, iA1, 0.54f), e4.a.U(iA2, iA1, 0.38f), e4.a.U(iA2, iA1, 0.38f)});
        }
        return this.f4483j;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4484k && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f4484k = z4;
        if (z4) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
