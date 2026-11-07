package d3;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import co.median.android.eeqadjy.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends LinearLayout {
    public final TextInputLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f1683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f1684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CheckableImageButton f1685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f1686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f1687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView.ScaleType f1689m;
    public View.OnLongClickListener n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1690o;

    public b0(TextInputLayout textInputLayout, androidx.emoji2.text.t tVar) {
        super(textInputLayout.getContext());
        this.f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f1685i = checkableImageButton;
        y0 y0Var = new y0(getContext(), null);
        this.f1683g = y0Var;
        if (t2.i.v(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.n;
        checkableImageButton.setOnClickListener(null);
        e4.a.e0(checkableImageButton, onLongClickListener);
        this.n = null;
        checkableImageButton.setOnLongClickListener(null);
        e4.a.e0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) tVar.f579c;
        if (typedArray.hasValue(70)) {
            this.f1686j = t2.i.i(getContext(), tVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f1687k = r2.a0.h(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            c(tVar.i(67));
            if (typedArray.hasValue(66)) {
                b(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            androidx.fragment.app.q.q("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f1688l) {
            this.f1688l = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeL = e4.a.l(typedArray.getInt(69, -1));
            this.f1689m = scaleTypeL;
            checkableImageButton.setScaleType(scaleTypeL);
        }
        y0Var.setVisibility(8);
        y0Var.setId(R.id.textinput_prefix_text);
        y0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        y0Var.setAccessibilityLiveRegion(1);
        y0Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            y0Var.setTextColor(tVar.h(62));
        }
        CharSequence text = typedArray.getText(60);
        this.f1684h = TextUtils.isEmpty(text) ? null : text;
        y0Var.setText(text);
        f();
        addView(checkableImageButton);
        addView(y0Var);
        checkableImageButton.setOnFocusableChangedListener(new a0(0, this));
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f1685i;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f1683g.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1685i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            e4.a.n0(checkableImageButton, charSequence);
        }
    }

    public final void c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1685i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f1686j;
            PorterDuff.Mode mode = this.f1687k;
            TextInputLayout textInputLayout = this.f;
            e4.a.b(textInputLayout, checkableImageButton, colorStateList, mode);
            d(true);
            e4.a.Z(textInputLayout, checkableImageButton, this.f1686j);
            return;
        }
        d(false);
        View.OnLongClickListener onLongClickListener = this.n;
        checkableImageButton.setOnClickListener(null);
        e4.a.e0(checkableImageButton, onLongClickListener);
        this.n = null;
        checkableImageButton.setOnLongClickListener(null);
        e4.a.e0(checkableImageButton, null);
        b(null);
    }

    public final void d(boolean z4) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.f1685i;
        if ((checkableImageButton.getVisibility() == 0) != z4) {
            if (!z4 && checkableImageButton.hasFocus() && (editText = this.f.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z4 ? 0 : 8);
            e();
            f();
        }
    }

    public final void e() {
        EditText editText = this.f.f1571j;
        if (editText == null) {
            return;
        }
        this.f1683g.setPaddingRelative(this.f1685i.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void f() {
        int i4 = (this.f1684h == null || this.f1690o) ? 8 : 0;
        setVisibility((this.f1685i.getVisibility() == 0 || i4 == 0) ? 0 : 8);
        this.f1683g.setVisibility(i4);
        this.f.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        e();
    }
}
