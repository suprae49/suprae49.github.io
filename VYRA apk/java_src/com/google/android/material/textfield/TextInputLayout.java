package com.google.android.material.textfield;

import a3.d;
import a3.f;
import a3.h;
import a3.j;
import a3.n;
import a3.o;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.k;
import androidx.customview.view.AbsSavedState;
import androidx.emoji2.text.t;
import androidx.fragment.app.q;
import c0.c;
import com.google.android.material.datepicker.e;
import com.google.android.material.internal.CheckableImageButton;
import d3.b0;
import d3.c0;
import d3.d0;
import d3.e0;
import d3.f0;
import d3.g0;
import d3.m;
import d3.p;
import d3.s;
import d3.v;
import d3.y;
import e.k0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import k.j1;
import k.u;
import k.y0;
import p0.p0;
import p1.g;
import r2.a0;
import r2.b;
import t1.l;
import t2.i;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] I0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public int B;
    public final b B0;
    public g C;
    public boolean C0;
    public g D;
    public boolean D0;
    public ColorStateList E;
    public ValueAnimator E0;
    public ColorStateList F;
    public boolean F0;
    public ColorStateList G;
    public boolean G0;
    public ColorStateList H;
    public boolean H0;
    public boolean I;
    public CharSequence J;
    public boolean K;
    public j L;
    public j M;
    public StateListDrawable N;
    public boolean O;
    public j P;
    public j Q;
    public o R;
    public boolean S;
    public final int T;
    public int U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1561a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f1562b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f1563c0;
    public int d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Rect f1564e0;
    public final FrameLayout f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Rect f1565f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f1566g;
    public final RectF g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f1567h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Typeface f1568h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1569i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ColorDrawable f1570i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EditText f1571j;
    public int j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1572k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final LinkedHashSet f1573k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1574l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ColorDrawable f1575l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1576m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f1577m0;
    public int n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Drawable f1578n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1579o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ColorStateList f1580o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f1581p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ColorStateList f1582p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1583q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f1584q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1585r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f1586r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1587s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f1588s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g0 f1589t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ColorStateList f1590t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y0 f1591u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f1592u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1593v;
    public int v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1594w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f1595w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f1596x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f1597x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1598y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f1599y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public y0 f1600z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f1601z0;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f1602h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f1603i;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1602h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1603i = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f1602h) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            TextUtils.writeToParcel(this.f1602h, parcel, i4);
            parcel.writeInt(this.f1603i ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(f3.a.b(context, attributeSet, co.median.android.eeqadjy.R.attr.textInputStyle, co.median.android.eeqadjy.R.style.Widget_Design_TextInputLayout), attributeSet, co.median.android.eeqadjy.R.attr.textInputStyle);
        this.f1574l = -1;
        this.f1576m = -1;
        this.n = -1;
        this.f1579o = -1;
        this.f1581p = new v(this);
        this.f1589t = new q(9);
        this.f1564e0 = new Rect();
        this.f1565f0 = new Rect();
        this.g0 = new RectF();
        this.f1573k0 = new LinkedHashSet();
        b bVar = new b(this);
        this.B0 = bVar;
        this.H0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = b2.a.f1047a;
        bVar.R = linearInterpolator;
        bVar.j(false);
        bVar.Q = linearInterpolator;
        bVar.j(false);
        if (bVar.f3518g != 8388659) {
            bVar.f3518g = 8388659;
            bVar.j(false);
        }
        t tVarG = a0.g(context2, attributeSet, a2.a.Q, co.median.android.eeqadjy.R.attr.textInputStyle, co.median.android.eeqadjy.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        b0 b0Var = new b0(this, tVarG);
        this.f1566g = b0Var;
        TypedArray typedArray = (TypedArray) tVarG.f579c;
        this.I = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.D0 = typedArray.getBoolean(47, true);
        this.C0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.R = o.g(context2, attributeSet, co.median.android.eeqadjy.R.attr.textInputStyle, co.median.android.eeqadjy.R.style.Widget_Design_TextInputLayout).a();
        this.T = context2.getResources().getDimensionPixelOffset(co.median.android.eeqadjy.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = typedArray.getDimensionPixelOffset(9, 0);
        this.f1569i = getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f1561a0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1562b0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.f1561a0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        n nVarK = this.R.k();
        if (dimension >= 0.0f) {
            nVarK.f116e = new a3.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            nVarK.f = new a3.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            nVarK.f117g = new a3.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            nVarK.f118h = new a3.a(dimension4);
        }
        this.R = nVarK.a();
        ColorStateList colorStateListI = i.i(context2, tVarG, 7);
        if (colorStateListI != null) {
            int defaultColor = colorStateListI.getDefaultColor();
            this.f1592u0 = defaultColor;
            this.d0 = defaultColor;
            if (colorStateListI.isStateful()) {
                this.v0 = colorStateListI.getColorForState(new int[]{-16842910}, -1);
                this.f1595w0 = colorStateListI.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1597x0 = colorStateListI.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1595w0 = this.f1592u0;
                ColorStateList colorStateList = c.getColorStateList(context2, co.median.android.eeqadjy.R.color.mtrl_filled_background_color);
                this.v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f1597x0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.d0 = 0;
            this.f1592u0 = 0;
            this.v0 = 0;
            this.f1595w0 = 0;
            this.f1597x0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListH = tVarG.h(1);
            this.f1582p0 = colorStateListH;
            this.f1580o0 = colorStateListH;
        }
        ColorStateList colorStateListI2 = i.i(context2, tVarG, 14);
        this.f1588s0 = typedArray.getColor(14, 0);
        this.f1584q0 = c.getColor(context2, co.median.android.eeqadjy.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1599y0 = c.getColor(context2, co.median.android.eeqadjy.R.color.mtrl_textinput_disabled_color);
        this.f1586r0 = c.getColor(context2, co.median.android.eeqadjy.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListI2 != null) {
            setBoxStrokeColorStateList(colorStateListI2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(i.i(context2, tVarG, 15));
        }
        if (typedArray.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(50, 0));
        }
        this.G = tVarG.h(24);
        this.H = tVarG.h(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i4 = typedArray.getInt(34, 1);
        boolean z4 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z5 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(58, 0);
        CharSequence text3 = typedArray.getText(57);
        boolean z6 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f1594w = typedArray.getResourceId(22, 0);
        this.f1593v = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i4);
        setCounterOverflowTextAppearance(this.f1593v);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1594w);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(tVarG.h(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(tVarG.h(46));
        }
        if (typedArray.hasValue(51)) {
            setHintTextColor(tVarG.h(51));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(tVarG.h(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(tVarG.h(21));
        }
        if (typedArray.hasValue(59)) {
            setPlaceholderTextColor(tVarG.h(59));
        }
        s sVar = new s(this, tVarG);
        this.f1567h = sVar;
        boolean z7 = typedArray.getBoolean(0, true);
        setHintMaxLines(typedArray.getInt(49, 1));
        tVarG.v();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(b0Var);
        frameLayout.addView(sVar);
        addView(frameLayout);
        setEnabled(z7);
        setHelperTextEnabled(z5);
        setErrorEnabled(z4);
        setCounterEnabled(z6);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f1571j;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.L;
        }
        EditText editText2 = this.f1571j;
        int iA0 = e4.a.a0(editText2.getContext(), l.s(editText2, co.median.android.eeqadjy.R.attr.colorControlHighlight));
        int i4 = this.U;
        int[][] iArr = I0;
        if (i4 != 2) {
            if (i4 != 1) {
                return null;
            }
            j jVar = this.L;
            int i5 = this.d0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{e4.a.U(iA0, i5, 0.1f), i5}), jVar, jVar);
        }
        Context context = getContext();
        j jVar2 = this.L;
        int iA1 = e4.a.a0(context, l.r(context, co.median.android.eeqadjy.R.attr.colorSurface, "TextInputLayout"));
        j jVar3 = new j(jVar2.j());
        int iU = e4.a.U(iA0, iA1, 0.1f);
        jVar3.r(new ColorStateList(iArr, new int[]{iU, 0}));
        jVar3.setTint(iA1);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iU, iA1});
        j jVar4 = new j(jVar2.j());
        jVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar3, jVar4), jVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.N == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.N = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.N.addState(new int[0], h(false));
        }
        return this.N;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.M == null) {
            this.M = h(true);
        }
        return this.M;
    }

    public static void m(ViewGroup viewGroup, boolean z4) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setEnabled(z4);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z4);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1571j != null) {
            q.q("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f1571j = editText;
        int i4 = this.f1574l;
        if (i4 != -1) {
            setMinEms(i4);
        } else {
            setMinWidth(this.n);
        }
        int i5 = this.f1576m;
        if (i5 != -1) {
            setMaxEms(i5);
        } else {
            setMaxWidth(this.f1579o);
        }
        this.O = false;
        k();
        setTextInputAccessibilityDelegate(new f0(this));
        Typeface typeface = this.f1571j.getTypeface();
        b bVar = this.B0;
        bVar.n(typeface);
        float textSize = this.f1571j.getTextSize();
        if (bVar.f3519h != textSize) {
            bVar.f3519h = textSize;
            bVar.j(false);
        }
        float letterSpacing = this.f1571j.getLetterSpacing();
        if (bVar.X != letterSpacing) {
            bVar.X = letterSpacing;
            bVar.j(false);
        }
        int gravity = this.f1571j.getGravity();
        int i6 = (gravity & (-113)) | 48;
        if (bVar.f3518g != i6) {
            bVar.f3518g = i6;
            bVar.j(false);
        }
        if (bVar.f != gravity) {
            bVar.f = gravity;
            bVar.j(false);
        }
        this.f1601z0 = editText.getMinimumHeight();
        this.f1571j.addTextChangedListener(new c0(this, editText));
        if (this.f1580o0 == null) {
            this.f1580o0 = this.f1571j.getHintTextColors();
        }
        if (this.I) {
            if (TextUtils.isEmpty(this.J)) {
                CharSequence hint = this.f1571j.getHint();
                this.f1572k = hint;
                setHint(hint);
                this.f1571j.setHint((CharSequence) null);
            }
            this.K = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.f1591u != null) {
            p(this.f1571j.getText());
        }
        t();
        this.f1581p.b();
        this.f1566g.bringToFront();
        s sVar = this.f1567h;
        sVar.bringToFront();
        Iterator it = this.f1573k0.iterator();
        while (it.hasNext()) {
            ((p) it.next()).a(this);
        }
        sVar.n();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.J)) {
            return;
        }
        this.J = charSequence;
        b bVar = this.B0;
        if (charSequence == null || !TextUtils.equals(bVar.B, charSequence)) {
            bVar.B = charSequence;
            bVar.C = null;
            bVar.j(false);
        }
        if (this.A0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z4) {
        if (this.f1598y == z4) {
            return;
        }
        y0 y0Var = this.f1600z;
        if (!z4) {
            if (y0Var != null) {
                y0Var.setVisibility(8);
            }
            this.f1600z = null;
        } else if (y0Var != null) {
            this.f.addView(y0Var);
            this.f1600z.setVisibility(0);
        }
        this.f1598y = z4;
    }

    public final void a() {
        if (this.f1571j == null || this.U != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f1571j;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.B0.f() + this.f1569i), this.f1571j.getPaddingEnd(), getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f1571j;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f1571j.getPaddingEnd(), getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (i.v(getContext())) {
            EditText editText3 = this.f1571j;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f1571j.getPaddingEnd(), getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i4, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        b bVar = this.B0;
        if (bVar.f3510b == f) {
            return;
        }
        int i4 = 0;
        if (this.E0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.E0 = valueAnimator;
            valueAnimator.setInterpolator(i.L(getContext(), co.median.android.eeqadjy.R.attr.motionEasingEmphasizedInterpolator, b2.a.f1048b));
            this.E0.setDuration(i.K(getContext(), co.median.android.eeqadjy.R.attr.motionDurationMedium4, 167));
            this.E0.addUpdateListener(new e0(i4, this));
        }
        this.E0.setFloatValues(bVar.f3510b, f);
        this.E0.start();
    }

    public final void c() {
        int i4;
        int i5;
        j jVar = this.L;
        if (jVar == null) {
            return;
        }
        o oVarJ = jVar.j();
        o oVar = this.R;
        if (oVarJ != oVar) {
            this.L.setShapeAppearanceModel(oVar);
        }
        if (this.U == 2 && (i4 = this.W) > -1 && (i5 = this.f1563c0) != 0) {
            j jVar2 = this.L;
            jVar2.f88g.f78j = i4;
            jVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i5);
            h hVar = jVar2.f88g;
            if (hVar.f73d != colorStateListValueOf) {
                hVar.f73d = colorStateListValueOf;
                jVar2.onStateChange(jVar2.getState());
            }
        }
        int iB = this.d0;
        if (this.U == 1) {
            Integer numU = e4.a.u(getContext(), co.median.android.eeqadjy.R.attr.colorSurface);
            iB = f0.b.b(this.d0, numU != null ? numU.intValue() : 0);
        }
        this.d0 = iB;
        this.L.r(ColorStateList.valueOf(iB));
        j jVar3 = this.P;
        if (jVar3 != null && this.Q != null) {
            if (this.W > -1 && this.f1563c0 != 0) {
                jVar3.r(this.f1571j.isFocused() ? ColorStateList.valueOf(this.f1584q0) : ColorStateList.valueOf(this.f1563c0));
                this.Q.r(ColorStateList.valueOf(this.f1563c0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f1571j == null) {
            throw new IllegalStateException();
        }
        boolean z4 = getLayoutDirection() == 1;
        int i4 = rect.bottom;
        Rect rect2 = this.f1565f0;
        rect2.bottom = i4;
        int i5 = this.U;
        if (i5 == 1) {
            rect2.left = i(rect.left, z4);
            rect2.top = rect.top + this.V;
            rect2.right = j(rect.right, z4);
            return rect2;
        }
        int i6 = rect.left;
        if (i5 != 2) {
            rect2.left = i(i6, z4);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z4);
            return rect2;
        }
        rect2.left = this.f1571j.getPaddingLeft() + i6;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f1571j.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i4) {
        EditText editText = this.f1571j;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
            return;
        }
        if (this.f1572k != null) {
            boolean z4 = this.K;
            this.K = false;
            CharSequence hint = editText.getHint();
            this.f1571j.setHint(this.f1572k);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i4);
                return;
            } finally {
                this.f1571j.setHint(hint);
                this.K = z4;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i4);
        onProvideAutofillVirtualStructure(viewStructure, i4);
        FrameLayout frameLayout = this.f;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i5 = 0; i5 < frameLayout.getChildCount(); i5++) {
            View childAt = frameLayout.getChildAt(i5);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i5);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i4);
            if (childAt == this.f1571j) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.G0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.G0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j jVar;
        super.draw(canvas);
        boolean z4 = this.I;
        b bVar = this.B0;
        if (z4) {
            TextPaint textPaint = bVar.O;
            RectF rectF = bVar.f3515e;
            int iSave = canvas.save();
            if (bVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(bVar.G);
                float f = bVar.f3530q;
                float f4 = bVar.f3531r;
                float f5 = bVar.F;
                if (f5 != 1.0f) {
                    canvas.scale(f5, f5, f, f4);
                }
                if ((bVar.f3516e0 > 1 || bVar.f3517f0 > 1) && !bVar.D && bVar.o()) {
                    float lineStart = bVar.f3530q - bVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f4);
                    float f6 = alpha;
                    textPaint.setAlpha((int) (bVar.f3513c0 * f6));
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, e4.a.k(bVar.K, textPaint.getAlpha()));
                    }
                    bVar.Z.draw(canvas);
                    textPaint.setAlpha((int) (bVar.f3511b0 * f6));
                    if (i4 >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, e4.a.k(bVar.K, textPaint.getAlpha()));
                    }
                    int lineBaseline = bVar.Z.getLineBaseline(0);
                    CharSequence charSequence = bVar.d0;
                    float f7 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f7, textPaint);
                    if (i4 >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                    }
                    String strTrim = bVar.d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(bVar.Z.getLineEnd(0), str.length()), 0.0f, f7, (Paint) textPaint);
                    canvas = canvas;
                } else {
                    canvas.translate(f, f4);
                    bVar.Z.draw(canvas);
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.Q == null || (jVar = this.P) == null) {
            return;
        }
        jVar.draw(canvas);
        if (this.f1571j.isFocused()) {
            Rect bounds = this.Q.getBounds();
            Rect bounds2 = this.P.getBounds();
            float f8 = bVar.f3510b;
            int iCenterX = bounds2.centerX();
            bounds.left = b2.a.c(iCenterX, bounds2.left, f8);
            bounds.right = b2.a.c(iCenterX, bounds2.right, f8);
            this.Q.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z4;
        ColorStateList colorStateList;
        if (this.F0) {
            return;
        }
        this.F0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.B0;
        if (bVar != null) {
            bVar.M = drawableState;
            ColorStateList colorStateList2 = bVar.f3524k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = bVar.f3523j) == null || !colorStateList.isStateful())) {
                z4 = false;
            } else {
                bVar.j(false);
                z4 = true;
            }
        } else {
            z4 = false;
        }
        if (this.f1571j != null) {
            w(isLaidOut() && isEnabled(), false);
        }
        t();
        z();
        if (z4) {
            invalidate();
        }
        this.F0 = false;
    }

    public final int e() {
        if (this.I) {
            int i4 = this.U;
            b bVar = this.B0;
            if (i4 == 0) {
                return (int) bVar.f();
            }
            if (i4 == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (bVar.f() / 2.0f);
                }
                float f = bVar.f();
                TextPaint textPaint = bVar.P;
                textPaint.setTextSize(bVar.f3521i);
                textPaint.setTypeface(bVar.f3532s);
                textPaint.setLetterSpacing(bVar.W);
                return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final g f() {
        g gVar = new g();
        gVar.f3329h = i.K(getContext(), co.median.android.eeqadjy.R.attr.motionDurationShort2, 87);
        gVar.f3330i = i.L(getContext(), co.median.android.eeqadjy.R.attr.motionEasingLinearInterpolator, b2.a.f1047a);
        return gVar;
    }

    public final boolean g() {
        return this.I && !TextUtils.isEmpty(this.J) && (this.L instanceof d3.h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1571j;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public j getBoxBackground() {
        int i4 = this.U;
        if (i4 == 1 || i4 == 2) {
            return this.L;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.d0;
    }

    public int getBoxBackgroundMode() {
        return this.U;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.V;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        o oVar = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? oVar.f129h.a(rectF) : oVar.f128g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        o oVar = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? oVar.f128g.a(rectF) : oVar.f129h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        o oVar = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? oVar.f127e.a(rectF) : oVar.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        o oVar = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? oVar.f.a(rectF) : oVar.f127e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1588s0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1590t0;
    }

    public int getBoxStrokeWidth() {
        return this.f1561a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1562b0;
    }

    public int getCounterMaxLength() {
        return this.f1585r;
    }

    public CharSequence getCounterOverflowDescription() {
        y0 y0Var;
        if (this.f1583q && this.f1587s && (y0Var = this.f1591u) != null) {
            return y0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.F;
    }

    public ColorStateList getCounterTextColor() {
        return this.E;
    }

    public ColorStateList getCursorColor() {
        return this.G;
    }

    public ColorStateList getCursorErrorColor() {
        return this.H;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1580o0;
    }

    public EditText getEditText() {
        return this.f1571j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1567h.f1739l.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1567h.f1739l.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1567h.f1744r;
    }

    public int getEndIconMode() {
        return this.f1567h.n;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1567h.f1745s;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1567h.f1739l;
    }

    public CharSequence getError() {
        v vVar = this.f1581p;
        if (vVar.f1776q) {
            return vVar.f1775p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1581p.f1779t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1581p.f1778s;
    }

    public int getErrorCurrentTextColors() {
        y0 y0Var = this.f1581p.f1777r;
        if (y0Var != null) {
            return y0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1567h.f1735h.getDrawable();
    }

    public CharSequence getHelperText() {
        v vVar = this.f1581p;
        if (vVar.f1783x) {
            return vVar.f1782w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        y0 y0Var = this.f1581p.f1784y;
        if (y0Var != null) {
            return y0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.I) {
            return this.J;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.B0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.B0;
        return bVar.g(bVar.f3524k);
    }

    public int getHintMaxLines() {
        return this.B0.f3516e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f1582p0;
    }

    public g0 getLengthCounter() {
        return this.f1589t;
    }

    public int getMaxEms() {
        return this.f1576m;
    }

    public int getMaxWidth() {
        return this.f1579o;
    }

    public int getMinEms() {
        return this.f1574l;
    }

    public int getMinWidth() {
        return this.n;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1567h.f1739l.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1567h.f1739l.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1598y) {
            return this.f1596x;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.B;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.A;
    }

    public CharSequence getPrefixText() {
        return this.f1566g.f1684h;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1566g.f1683g.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1566g.f1683g;
    }

    public o getShapeAppearanceModel() {
        return this.R;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1566g.f1685i.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1566g.f1685i.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1566g.f1688l;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1566g.f1689m;
    }

    public CharSequence getSuffixText() {
        return this.f1567h.f1747u;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1567h.f1748v.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1567h.f1748v;
    }

    public Typeface getTypeface() {
        return this.f1568h0;
    }

    public final j h(boolean z4) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(co.median.android.eeqadjy.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z4 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f1571j;
        float popupElevation = editText instanceof y ? ((y) editText).getPopupElevation() : getResources().getDimensionPixelOffset(co.median.android.eeqadjy.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(co.median.android.eeqadjy.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        a3.l lVar = new a3.l();
        a3.l lVar2 = new a3.l();
        a3.l lVar3 = new a3.l();
        a3.l lVar4 = new a3.l();
        int i4 = 0;
        f fVar = new f(i4);
        f fVar2 = new f(i4);
        f fVar3 = new f(i4);
        f fVar4 = new f(i4);
        a3.a aVar = new a3.a(f);
        a3.a aVar2 = new a3.a(f);
        a3.a aVar3 = new a3.a(dimensionPixelOffset);
        a3.a aVar4 = new a3.a(dimensionPixelOffset);
        o oVar = new o();
        oVar.f123a = lVar;
        oVar.f124b = lVar2;
        oVar.f125c = lVar3;
        oVar.f126d = lVar4;
        oVar.f127e = aVar;
        oVar.f = aVar2;
        oVar.f128g = aVar4;
        oVar.f129h = aVar3;
        oVar.f130i = fVar;
        oVar.f131j = fVar2;
        oVar.f132k = fVar3;
        oVar.f133l = fVar4;
        EditText editText2 = this.f1571j;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof y ? ((y) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = j.K;
            dropDownBackgroundTintList = ColorStateList.valueOf(e4.a.a0(context, l.r(context, co.median.android.eeqadjy.R.attr.colorSurface, j.class.getSimpleName())));
        }
        j jVar = new j();
        jVar.n(context);
        jVar.r(dropDownBackgroundTintList);
        jVar.q(popupElevation);
        jVar.setShapeAppearanceModel(oVar);
        h hVar = jVar.f88g;
        if (hVar.f75g == null) {
            hVar.f75g = new Rect();
        }
        jVar.f88g.f75g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        jVar.invalidateSelf();
        return jVar;
    }

    public final int i(int i4, boolean z4) {
        int compoundPaddingLeft;
        if (z4 || getPrefixText() == null) {
            compoundPaddingLeft = (!z4 || getSuffixText() == null) ? this.f1571j.getCompoundPaddingLeft() : this.f1567h.c();
        } else {
            compoundPaddingLeft = this.f1566g.a();
        }
        return compoundPaddingLeft + i4;
    }

    public final int j(int i4, boolean z4) {
        int compoundPaddingRight;
        if (z4 || getSuffixText() == null) {
            compoundPaddingRight = (!z4 || getPrefixText() == null) ? this.f1571j.getCompoundPaddingRight() : this.f1566g.a();
        } else {
            compoundPaddingRight = this.f1567h.c();
        }
        return i4 - compoundPaddingRight;
    }

    public final void k() {
        int i4 = this.U;
        if (i4 == 0) {
            this.L = null;
            this.P = null;
            this.Q = null;
        } else if (i4 == 1) {
            this.L = new j(this.R);
            this.P = new j();
            this.Q = new j();
        } else {
            if (i4 != 2) {
                throw new IllegalArgumentException(this.U + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.I || (this.L instanceof d3.h)) {
                this.L = new j(this.R);
            } else {
                o oVar = this.R;
                int i5 = d3.h.N;
                if (oVar == null) {
                    oVar = new o();
                }
                d3.g gVar = new d3.g(oVar, new RectF());
                d3.h hVar = new d3.h(gVar);
                hVar.M = gVar;
                this.L = hVar;
            }
            this.P = null;
            this.Q = null;
        }
        u();
        z();
        if (this.U == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.V = getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (i.v(getContext())) {
                this.V = getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.U != 0) {
            v();
        }
        EditText editText = this.f1571j;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i6 = this.U;
                if (i6 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i6 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    public final void l() {
        float f;
        float f4;
        float f5;
        RectF rectF;
        float f6;
        float lineWidth;
        int i4;
        float f7;
        int i5;
        if (g()) {
            int width = this.f1571j.getWidth();
            int gravity = this.f1571j.getGravity();
            b bVar = this.B0;
            boolean zC = bVar.c(bVar.B);
            bVar.D = zC;
            Rect rect = bVar.f3514d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i5 = rect.left;
                        f5 = i5;
                    } else {
                        f = rect.right;
                        f4 = bVar.f3509a0;
                    }
                } else if (zC) {
                    f = rect.right;
                    f4 = bVar.f3509a0;
                } else {
                    i5 = rect.left;
                    f5 = i5;
                }
                float fMax = Math.max(f5, rect.left);
                rectF = this.g0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f6 = (width / 2.0f) + (bVar.f3509a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.D) {
                        f7 = bVar.f3509a0;
                        f6 = f7 + fMax;
                    } else {
                        i4 = rect.right;
                        f6 = i4;
                    }
                } else if (bVar.D) {
                    i4 = rect.right;
                    f6 = i4;
                } else {
                    f7 = bVar.f3509a0;
                    f6 = f7 + fMax;
                }
                rectF.right = Math.min(f6, rect.right);
                rectF.bottom = bVar.f() + rect.top;
                if (bVar.Z != null && !bVar.o()) {
                    StaticLayout staticLayout = bVar.Z;
                    lineWidth = (bVar.f3521i / bVar.f3519h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (bVar.D) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f8 = rectF.left;
                float f9 = this.T;
                rectF.left = f8 - f9;
                rectF.right += f9;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.W);
                rectF.top = 0.0f;
                d3.h hVar = (d3.h) this.L;
                hVar.getClass();
                hVar.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f4 = bVar.f3509a0 / 2.0f;
            f5 = f - f4;
            float fMax2 = Math.max(f5, rect.left);
            rectF = this.g0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f6 = (width / 2.0f) + (bVar.f3509a0 / 2.0f);
            } else {
                f6 = (width / 2.0f) + (bVar.f3509a0 / 2.0f);
            }
            rectF.right = Math.min(f6, rect.right);
            rectF.bottom = bVar.f() + rect.top;
            if (bVar.Z != null) {
                StaticLayout staticLayout2 = bVar.Z;
                lineWidth = (bVar.f3521i / bVar.f3519h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (bVar.D) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(y0 y0Var, int i4) {
        try {
            y0Var.setTextAppearance(i4);
            if (y0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        y0Var.setTextAppearance(co.median.android.eeqadjy.R.style.TextAppearance_AppCompat_Caption);
        y0Var.setTextColor(c.getColor(getContext(), co.median.android.eeqadjy.R.color.design_error));
    }

    public final boolean o() {
        v vVar = this.f1581p;
        return (vVar.f1774o != 1 || vVar.f1777r == null || TextUtils.isEmpty(vVar.f1775p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        s sVar = this.f1567h;
        sVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z4 = false;
        this.H0 = false;
        if (this.f1571j != null && this.f1571j.getMeasuredHeight() < (iMax = Math.max(sVar.getMeasuredHeight(), this.f1566g.getMeasuredHeight()))) {
            this.f1571j.setMinimumHeight(iMax);
            z4 = true;
        }
        boolean zS = s();
        if (z4 || zS) {
            this.f1571j.post(new k(8, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        float fDescent;
        int i8;
        int compoundPaddingTop;
        super.onLayout(z4, i4, i5, i6, i7);
        EditText editText = this.f1571j;
        if (editText != null) {
            Rect rect = this.f1564e0;
            r2.c.a(this, editText, rect);
            j jVar = this.P;
            if (jVar != null) {
                int i9 = rect.bottom;
                jVar.setBounds(rect.left, i9 - this.f1561a0, rect.right, i9);
            }
            j jVar2 = this.Q;
            if (jVar2 != null) {
                int i10 = rect.bottom;
                jVar2.setBounds(rect.left, i10 - this.f1562b0, rect.right, i10);
            }
            if (this.I) {
                float textSize = this.f1571j.getTextSize();
                b bVar = this.B0;
                float f = bVar.f3519h;
                TextPaint textPaint = bVar.P;
                if (f != textSize) {
                    bVar.f3519h = textSize;
                    bVar.j(false);
                }
                int gravity = this.f1571j.getGravity();
                int i11 = (gravity & (-113)) | 48;
                if (bVar.f3518g != i11) {
                    bVar.f3518g = i11;
                    bVar.j(false);
                }
                if (bVar.f != gravity) {
                    bVar.f = gravity;
                    bVar.j(false);
                }
                Rect rectD = d(rect);
                int i12 = rectD.left;
                int i13 = rectD.top;
                int i14 = rectD.right;
                int i15 = rectD.bottom;
                Rect rect2 = bVar.f3514d;
                if (rect2.left != i12 || rect2.top != i13 || rect2.right != i14 || rect2.bottom != i15) {
                    rect2.set(i12, i13, i14, i15);
                    bVar.N = true;
                }
                if (this.f1571j == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(bVar.f3519h);
                    textPaint.setTypeface(bVar.f3535v);
                    textPaint.setLetterSpacing(bVar.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(bVar.f3519h);
                    textPaint.setTypeface(bVar.f3535v);
                    textPaint.setLetterSpacing(bVar.X);
                    fDescent = bVar.f3526l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f1571j.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f1565f0;
                rect3.left = compoundPaddingLeft;
                if (this.U != 1 || this.f1571j.getMinLines() > 1) {
                    if (this.U != 0 || getHintMaxLines() == 1) {
                        i8 = 0;
                    } else {
                        textPaint.setTextSize(bVar.f3519h);
                        textPaint.setTypeface(bVar.f3535v);
                        textPaint.setLetterSpacing(bVar.X);
                        i8 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f1571j.getCompoundPaddingTop() + rect.top) - i8;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f1571j.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.U != 1 || this.f1571j.getMinLines() > 1) ? rect.bottom - this.f1571j.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i16 = rect3.left;
                int i17 = rect3.top;
                int i18 = rect3.right;
                Rect rect4 = bVar.f3512c;
                if (rect4.left != i16 || rect4.top != i17 || rect4.right != i18 || rect4.bottom != compoundPaddingBottom || true != bVar.f3525k0) {
                    rect4.set(i16, i17, i18, compoundPaddingBottom);
                    bVar.N = true;
                    bVar.f3525k0 = true;
                }
                bVar.j(false);
                if (!g() || this.A0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        float f;
        EditText editText;
        super.onMeasure(i4, i5);
        boolean z4 = this.H0;
        s sVar = this.f1567h;
        if (!z4) {
            sVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.H0 = true;
        }
        if (this.f1600z != null && (editText = this.f1571j) != null) {
            this.f1600z.setGravity(editText.getGravity());
            this.f1600z.setPadding(this.f1571j.getCompoundPaddingLeft(), this.f1571j.getCompoundPaddingTop(), this.f1571j.getCompoundPaddingRight(), this.f1571j.getCompoundPaddingBottom());
        }
        sVar.n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f1571j.getMeasuredWidth() - this.f1571j.getCompoundPaddingLeft()) - this.f1571j.getCompoundPaddingRight();
        b bVar = this.B0;
        TextPaint textPaint = bVar.P;
        textPaint.setTextSize(bVar.f3521i);
        textPaint.setTypeface(bVar.f3532s);
        textPaint.setLetterSpacing(bVar.W);
        float f4 = measuredWidth;
        bVar.f3522i0 = bVar.e(bVar.f3517f0, textPaint, bVar.B, (bVar.f3521i / bVar.f3519h) * f4, bVar.D).getHeight();
        textPaint.setTextSize(bVar.f3519h);
        textPaint.setTypeface(bVar.f3535v);
        textPaint.setLetterSpacing(bVar.X);
        bVar.j0 = bVar.e(bVar.f3516e0, textPaint, bVar.B, f4, bVar.D).getHeight();
        EditText editText2 = this.f1571j;
        Rect rect = this.f1564e0;
        r2.c.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i6 = rectD.left;
        int i7 = rectD.top;
        int i8 = rectD.right;
        int i9 = rectD.bottom;
        Rect rect2 = bVar.f3514d;
        if (rect2.left != i6 || rect2.top != i7 || rect2.right != i8 || rect2.bottom != i9) {
            rect2.set(i6, i7, i8, i9);
            bVar.N = true;
        }
        v();
        a();
        if (this.f1571j == null) {
            return;
        }
        int i10 = bVar.j0;
        if (i10 != -1) {
            f = i10;
        } else {
            TextPaint textPaint2 = bVar.P;
            textPaint2.setTextSize(bVar.f3519h);
            textPaint2.setTypeface(bVar.f3535v);
            textPaint2.setLetterSpacing(bVar.X);
            f = -textPaint2.ascent();
        }
        float f5 = 0.0f;
        if (this.f1596x != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f1600z.getPaint());
            textPaint3.setTextSize(this.f1600z.getTextSize());
            textPaint3.setTypeface(this.f1600z.getTypeface());
            textPaint3.setLetterSpacing(this.f1600z.getLetterSpacing());
            r2.v vVar = new r2.v(this.f1596x, textPaint3, measuredWidth);
            vVar.f3596k = getLayoutDirection() == 1;
            vVar.f3595j = true;
            float lineSpacingExtra = this.f1600z.getLineSpacingExtra();
            float lineSpacingMultiplier = this.f1600z.getLineSpacingMultiplier();
            vVar.f3592g = lineSpacingExtra;
            vVar.f3593h = lineSpacingMultiplier;
            vVar.f3598m = new d3.a0(1, this);
            f5 = (this.U == 1 ? bVar.f() + this.V + this.f1569i : 0.0f) + vVar.a().getHeight();
        }
        float fMax = Math.max(f, f5);
        if (this.f1571j.getMeasuredHeight() < fMax) {
            this.f1571j.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f);
        setError(savedState.f1602h);
        if (savedState.f1603i) {
            post(new d0(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        boolean z4 = i4 == 1;
        if (z4 != this.S) {
            d dVar = this.R.f127e;
            RectF rectF = this.g0;
            float fA = dVar.a(rectF);
            float fA2 = this.R.f.a(rectF);
            float fA3 = this.R.f129h.a(rectF);
            float fA4 = this.R.f128g.a(rectF);
            o oVar = this.R;
            e4.a aVar = oVar.f123a;
            e4.a aVar2 = oVar.f124b;
            e4.a aVar3 = oVar.f126d;
            e4.a aVar4 = oVar.f125c;
            f fVar = new f(0);
            f fVar2 = new f(0);
            f fVar3 = new f(0);
            f fVar4 = new f(0);
            a3.a aVar5 = new a3.a(fA2);
            a3.a aVar6 = new a3.a(fA);
            a3.a aVar7 = new a3.a(fA4);
            a3.a aVar8 = new a3.a(fA3);
            o oVar2 = new o();
            oVar2.f123a = aVar2;
            oVar2.f124b = aVar;
            oVar2.f125c = aVar3;
            oVar2.f126d = aVar4;
            oVar2.f127e = aVar5;
            oVar2.f = aVar6;
            oVar2.f128g = aVar8;
            oVar2.f129h = aVar7;
            oVar2.f130i = fVar;
            oVar2.f131j = fVar2;
            oVar2.f132k = fVar3;
            oVar2.f133l = fVar4;
            this.S = z4;
            setShapeAppearanceModel(oVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (o()) {
            savedState.f1602h = getError();
        }
        s sVar = this.f1567h;
        savedState.f1603i = sVar.n != 0 && sVar.f1739l.f1507i;
        return savedState;
    }

    public final void p(Editable editable) {
        ((q) this.f1589t).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z4 = this.f1587s;
        int i4 = this.f1585r;
        if (i4 == -1) {
            this.f1591u.setText(String.valueOf(length));
            this.f1591u.setContentDescription(null);
            this.f1587s = false;
        } else {
            this.f1587s = length > i4;
            Context context = getContext();
            this.f1591u.setContentDescription(context.getString(this.f1587s ? co.median.android.eeqadjy.R.string.character_counter_overflowed_content_description : co.median.android.eeqadjy.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1585r)));
            if (z4 != this.f1587s) {
                q();
            }
            String str = n0.b.f3076b;
            n0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? n0.b.f3079e : n0.b.f3078d;
            y0 y0Var = this.f1591u;
            String string = getContext().getString(co.median.android.eeqadjy.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1585r));
            bVar.getClass();
            k0 k0Var = n0.f.f3086a;
            y0Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f1571j == null || z4 == this.f1587s) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        y0 y0Var = this.f1591u;
        if (y0Var != null) {
            n(y0Var, this.f1587s ? this.f1593v : this.f1594w);
            if (!this.f1587s && (colorStateList2 = this.E) != null) {
                this.f1591u.setTextColor(colorStateList2);
            }
            if (!this.f1587s || (colorStateList = this.F) == null) {
                return;
            }
            this.f1591u.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.G;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueP = l.p(context.getTheme(), co.median.android.eeqadjy.R.attr.colorControlActivated);
            if (typedValueP != null) {
                int i4 = typedValueP.resourceId;
                if (i4 != 0) {
                    colorStateListValueOf = c.getColorStateList(context, i4);
                } else {
                    int i5 = typedValueP.data;
                    if (i5 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i5);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f1571j;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f1571j.getTextCursorDrawable().mutate();
        if ((o() || (this.f1591u != null && this.f1587s)) && (colorStateList = this.H) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    public final boolean s() {
        boolean z4;
        if (this.f1571j == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z5 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            b0 b0Var = this.f1566g;
            if (b0Var.getMeasuredWidth() > 0) {
                int iMax = Math.max(0, b0Var.getMeasuredWidth() - this.f1571j.getPaddingLeft());
                if (this.f1570i0 == null || this.j0 != iMax) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f1570i0 = colorDrawable;
                    this.j0 = iMax;
                    colorDrawable.setBounds(0, 0, iMax, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f1571j.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f1570i0;
                if (drawable != colorDrawable2) {
                    this.f1571j.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else if (this.f1570i0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f1571j.getCompoundDrawablesRelative();
                this.f1571j.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f1570i0 = null;
                z4 = true;
            } else {
                z4 = false;
            }
        } else if (this.f1570i0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f1571j.getCompoundDrawablesRelative();
            this.f1571j.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f1570i0 = null;
            z4 = true;
        } else {
            z4 = false;
        }
        s sVar = this.f1567h;
        if ((sVar.e() || ((sVar.n != 0 && sVar.d()) || sVar.f1747u != null)) && sVar.getMeasuredWidth() > 0) {
            int measuredWidth = sVar.f1748v.getMeasuredWidth() - this.f1571j.getPaddingRight();
            if (sVar.e()) {
                checkableImageButton = sVar.f1735h;
            } else if (sVar.n != 0 && sVar.d()) {
                checkableImageButton = sVar.f1739l;
            }
            if (checkableImageButton != null) {
                measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
            }
            int iMax2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative4 = this.f1571j.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f1575l0;
            if (colorDrawable3 != null && this.f1577m0 != iMax2) {
                this.f1577m0 = iMax2;
                colorDrawable3.setBounds(0, 0, iMax2, 1);
                this.f1571j.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f1575l0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f1575l0 = colorDrawable4;
                this.f1577m0 = iMax2;
                colorDrawable4.setBounds(0, 0, iMax2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.f1575l0;
            if (drawable2 != colorDrawable5) {
                this.f1578n0 = drawable2;
                this.f1571j.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.f1575l0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.f1571j.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f1575l0) {
                this.f1571j.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f1578n0, compoundDrawablesRelative5[3]);
            } else {
                z5 = z4;
            }
            this.f1575l0 = null;
            return z5;
        }
        return z4;
    }

    public void setBoxBackgroundColor(int i4) {
        if (this.d0 != i4) {
            this.d0 = i4;
            this.f1592u0 = i4;
            this.f1595w0 = i4;
            this.f1597x0 = i4;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i4) {
        setBoxBackgroundColor(c.getColor(getContext(), i4));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1592u0 = defaultColor;
        this.d0 = defaultColor;
        this.v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1595w0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1597x0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i4) {
        if (i4 == this.U) {
            return;
        }
        this.U = i4;
        if (this.f1571j != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i4) {
        this.V = i4;
    }

    public void setBoxCornerFamily(int i4) {
        n nVarK = this.R.k();
        d dVar = this.R.f127e;
        nVarK.f112a = h0.r(i4);
        nVarK.f116e = dVar;
        d dVar2 = this.R.f;
        nVarK.f113b = h0.r(i4);
        nVarK.f = dVar2;
        d dVar3 = this.R.f129h;
        nVarK.f115d = h0.r(i4);
        nVarK.f118h = dVar3;
        d dVar4 = this.R.f128g;
        nVarK.f114c = h0.r(i4);
        nVarK.f117g = dVar4;
        this.R = nVarK.a();
        c();
    }

    public void setBoxStrokeColor(int i4) {
        if (this.f1588s0 != i4) {
            this.f1588s0 = i4;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1584q0 = colorStateList.getDefaultColor();
            this.f1599y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1586r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1588s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1588s0 != colorStateList.getDefaultColor()) {
            this.f1588s0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1590t0 != colorStateList) {
            this.f1590t0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i4) {
        this.f1561a0 = i4;
        z();
    }

    public void setBoxStrokeWidthFocused(int i4) {
        this.f1562b0 = i4;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i4) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i4));
    }

    public void setBoxStrokeWidthResource(int i4) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i4));
    }

    public void setCounterEnabled(boolean z4) {
        if (this.f1583q != z4) {
            v vVar = this.f1581p;
            if (z4) {
                y0 y0Var = new y0(getContext(), null);
                this.f1591u = y0Var;
                y0Var.setId(co.median.android.eeqadjy.R.id.textinput_counter);
                Typeface typeface = this.f1568h0;
                if (typeface != null) {
                    this.f1591u.setTypeface(typeface);
                }
                this.f1591u.setMaxLines(1);
                vVar.a(this.f1591u, 2);
                ((ViewGroup.MarginLayoutParams) this.f1591u.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(co.median.android.eeqadjy.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.f1591u != null) {
                    EditText editText = this.f1571j;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                vVar.g(this.f1591u, 2);
                this.f1591u = null;
            }
            this.f1583q = z4;
        }
    }

    public void setCounterMaxLength(int i4) {
        if (this.f1585r != i4) {
            if (i4 > 0) {
                this.f1585r = i4;
            } else {
                this.f1585r = -1;
            }
            if (!this.f1583q || this.f1591u == null) {
                return;
            }
            EditText editText = this.f1571j;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i4) {
        if (this.f1593v != i4) {
            this.f1593v = i4;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i4) {
        if (this.f1594w != i4) {
            this.f1594w = i4;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (o() || (this.f1591u != null && this.f1587s)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1580o0 = colorStateList;
        this.f1582p0 = colorStateList;
        if (this.f1571j != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        m(this, z4);
        super.setEnabled(z4);
    }

    public void setEndIconActivated(boolean z4) {
        this.f1567h.f1739l.setActivated(z4);
    }

    public void setEndIconCheckable(boolean z4) {
        this.f1567h.f1739l.setCheckable(z4);
    }

    public void setEndIconContentDescription(int i4) {
        s sVar = this.f1567h;
        sVar.g(i4 != 0 ? sVar.getResources().getText(i4) : null);
    }

    public void setEndIconDrawable(int i4) {
        s sVar = this.f1567h;
        Drawable drawableW = i4 != 0 ? h0.w(sVar.getContext(), i4) : null;
        TextInputLayout textInputLayout = sVar.f;
        CheckableImageButton checkableImageButton = sVar.f1739l;
        checkableImageButton.setImageDrawable(drawableW);
        if (drawableW != null) {
            e4.a.b(textInputLayout, checkableImageButton, sVar.f1742p, sVar.f1743q);
            e4.a.Z(textInputLayout, checkableImageButton, sVar.f1742p);
        }
    }

    public void setEndIconMinSize(int i4) {
        s sVar = this.f1567h;
        if (i4 < 0) {
            sVar.getClass();
            q.q("endIconSize cannot be less than 0");
        } else if (i4 != sVar.f1744r) {
            sVar.f1744r = i4;
            CheckableImageButton checkableImageButton = sVar.f1739l;
            checkableImageButton.setMinimumWidth(i4);
            checkableImageButton.setMinimumHeight(i4);
            CheckableImageButton checkableImageButton2 = sVar.f1735h;
            checkableImageButton2.setMinimumWidth(i4);
            checkableImageButton2.setMinimumHeight(i4);
        }
    }

    public void setEndIconMode(int i4) {
        this.f1567h.h(i4);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        s sVar = this.f1567h;
        CheckableImageButton checkableImageButton = sVar.f1739l;
        View.OnLongClickListener onLongClickListener = sVar.f1746t;
        checkableImageButton.setOnClickListener(onClickListener);
        e4.a.e0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        s sVar = this.f1567h;
        sVar.f1746t = onLongClickListener;
        CheckableImageButton checkableImageButton = sVar.f1739l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        e4.a.e0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        s sVar = this.f1567h;
        sVar.f1745s = scaleType;
        sVar.f1739l.setScaleType(scaleType);
        sVar.f1735h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        s sVar = this.f1567h;
        if (sVar.f1742p != colorStateList) {
            sVar.f1742p = colorStateList;
            e4.a.b(sVar.f, sVar.f1739l, colorStateList, sVar.f1743q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        s sVar = this.f1567h;
        if (sVar.f1743q != mode) {
            sVar.f1743q = mode;
            e4.a.b(sVar.f, sVar.f1739l, sVar.f1742p, mode);
        }
    }

    public void setEndIconVisible(boolean z4) {
        this.f1567h.i(z4);
    }

    public void setError(CharSequence charSequence) {
        v vVar = this.f1581p;
        if (!vVar.f1776q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            vVar.f();
            return;
        }
        vVar.c();
        vVar.f1775p = charSequence;
        vVar.f1777r.setText(charSequence);
        int i4 = vVar.n;
        if (i4 != 1) {
            vVar.f1774o = 1;
        }
        vVar.i(i4, vVar.h(vVar.f1777r, charSequence), vVar.f1774o);
    }

    public void setErrorAccessibilityLiveRegion(int i4) {
        v vVar = this.f1581p;
        vVar.f1779t = i4;
        y0 y0Var = vVar.f1777r;
        if (y0Var != null) {
            y0Var.setAccessibilityLiveRegion(i4);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        v vVar = this.f1581p;
        vVar.f1778s = charSequence;
        y0 y0Var = vVar.f1777r;
        if (y0Var != null) {
            y0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z4) {
        v vVar = this.f1581p;
        TextInputLayout textInputLayout = vVar.f1768h;
        if (vVar.f1776q == z4) {
            return;
        }
        vVar.c();
        if (z4) {
            y0 y0Var = new y0(vVar.f1767g, null);
            vVar.f1777r = y0Var;
            y0Var.setId(co.median.android.eeqadjy.R.id.textinput_error);
            vVar.f1777r.setTextAlignment(5);
            Typeface typeface = vVar.B;
            if (typeface != null) {
                vVar.f1777r.setTypeface(typeface);
            }
            int i4 = vVar.f1780u;
            vVar.f1780u = i4;
            y0 y0Var2 = vVar.f1777r;
            if (y0Var2 != null) {
                vVar.f1768h.n(y0Var2, i4);
            }
            ColorStateList colorStateList = vVar.f1781v;
            vVar.f1781v = colorStateList;
            y0 y0Var3 = vVar.f1777r;
            if (y0Var3 != null && colorStateList != null) {
                y0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = vVar.f1778s;
            vVar.f1778s = charSequence;
            y0 y0Var4 = vVar.f1777r;
            if (y0Var4 != null) {
                y0Var4.setContentDescription(charSequence);
            }
            int i5 = vVar.f1779t;
            vVar.f1779t = i5;
            y0 y0Var5 = vVar.f1777r;
            if (y0Var5 != null) {
                y0Var5.setAccessibilityLiveRegion(i5);
            }
            vVar.f1777r.setVisibility(4);
            vVar.a(vVar.f1777r, 0);
        } else {
            vVar.f();
            vVar.g(vVar.f1777r, 0);
            vVar.f1777r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        vVar.f1776q = z4;
    }

    public void setErrorIconDrawable(int i4) {
        s sVar = this.f1567h;
        sVar.j(i4 != 0 ? h0.w(sVar.getContext(), i4) : null);
        e4.a.Z(sVar.f, sVar.f1735h, sVar.f1736i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        s sVar = this.f1567h;
        CheckableImageButton checkableImageButton = sVar.f1735h;
        View.OnLongClickListener onLongClickListener = sVar.f1738k;
        checkableImageButton.setOnClickListener(onClickListener);
        e4.a.e0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        s sVar = this.f1567h;
        sVar.f1738k = onLongClickListener;
        CheckableImageButton checkableImageButton = sVar.f1735h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        e4.a.e0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        s sVar = this.f1567h;
        if (sVar.f1736i != colorStateList) {
            sVar.f1736i = colorStateList;
            e4.a.b(sVar.f, sVar.f1735h, colorStateList, sVar.f1737j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        s sVar = this.f1567h;
        if (sVar.f1737j != mode) {
            sVar.f1737j = mode;
            e4.a.b(sVar.f, sVar.f1735h, sVar.f1736i, mode);
        }
    }

    public void setErrorTextAppearance(int i4) {
        v vVar = this.f1581p;
        vVar.f1780u = i4;
        y0 y0Var = vVar.f1777r;
        if (y0Var != null) {
            vVar.f1768h.n(y0Var, i4);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        v vVar = this.f1581p;
        vVar.f1781v = colorStateList;
        y0 y0Var = vVar.f1777r;
        if (y0Var == null || colorStateList == null) {
            return;
        }
        y0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z4) {
        if (this.C0 != z4) {
            this.C0 = z4;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        v vVar = this.f1581p;
        if (zIsEmpty) {
            if (vVar.f1783x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!vVar.f1783x) {
            setHelperTextEnabled(true);
        }
        vVar.c();
        vVar.f1782w = charSequence;
        vVar.f1784y.setText(charSequence);
        int i4 = vVar.n;
        if (i4 != 2) {
            vVar.f1774o = 2;
        }
        vVar.i(i4, vVar.h(vVar.f1784y, charSequence), vVar.f1774o);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        v vVar = this.f1581p;
        vVar.A = colorStateList;
        y0 y0Var = vVar.f1784y;
        if (y0Var == null || colorStateList == null) {
            return;
        }
        y0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z4) {
        v vVar = this.f1581p;
        TextInputLayout textInputLayout = vVar.f1768h;
        if (vVar.f1783x == z4) {
            return;
        }
        vVar.c();
        if (z4) {
            y0 y0Var = new y0(vVar.f1767g, null);
            vVar.f1784y = y0Var;
            y0Var.setId(co.median.android.eeqadjy.R.id.textinput_helper_text);
            vVar.f1784y.setTextAlignment(5);
            Typeface typeface = vVar.B;
            if (typeface != null) {
                vVar.f1784y.setTypeface(typeface);
            }
            vVar.f1784y.setVisibility(4);
            vVar.f1784y.setImportantForAccessibility(2);
            int i4 = vVar.f1785z;
            vVar.f1785z = i4;
            y0 y0Var2 = vVar.f1784y;
            if (y0Var2 != null) {
                y0Var2.setTextAppearance(i4);
            }
            ColorStateList colorStateList = vVar.A;
            vVar.A = colorStateList;
            y0 y0Var3 = vVar.f1784y;
            if (y0Var3 != null && colorStateList != null) {
                y0Var3.setTextColor(colorStateList);
            }
            vVar.a(vVar.f1784y, 1);
        } else {
            vVar.c();
            int i5 = vVar.n;
            if (i5 == 2) {
                vVar.f1774o = 0;
            }
            vVar.i(i5, vVar.h(vVar.f1784y, ""), vVar.f1774o);
            vVar.g(vVar.f1784y, 1);
            vVar.f1784y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        vVar.f1783x = z4;
    }

    public void setHelperTextTextAppearance(int i4) {
        v vVar = this.f1581p;
        vVar.f1785z = i4;
        y0 y0Var = vVar.f1784y;
        if (y0Var != null) {
            y0Var.setTextAppearance(i4);
        }
    }

    public void setHint(int i4) {
        setHint(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setHintAnimationEnabled(boolean z4) {
        this.D0 = z4;
    }

    public void setHintEnabled(boolean z4) {
        if (z4 != this.I) {
            this.I = z4;
            if (z4) {
                CharSequence hint = this.f1571j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.J)) {
                        setHint(hint);
                    }
                    this.f1571j.setHint((CharSequence) null);
                }
                this.K = true;
            } else {
                this.K = false;
                if (!TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.f1571j.getHint())) {
                    this.f1571j.setHint(this.J);
                }
                setHintInternal(null);
            }
            if (this.f1571j != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i4) {
        b bVar = this.B0;
        if (i4 != bVar.f3517f0) {
            bVar.f3517f0 = i4;
            bVar.j(false);
        }
        if (i4 != bVar.f3516e0) {
            bVar.f3516e0 = i4;
            bVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i4) {
        b bVar = this.B0;
        TextInputLayout textInputLayout = bVar.f3508a;
        x2.d dVar = new x2.d(textInputLayout.getContext(), i4);
        ColorStateList colorStateList = dVar.f4741k;
        if (colorStateList != null) {
            bVar.f3524k = colorStateList;
        }
        float f = dVar.f4742l;
        if (f != 0.0f) {
            bVar.f3521i = f;
        }
        ColorStateList colorStateList2 = dVar.f4732a;
        if (colorStateList2 != null) {
            bVar.V = colorStateList2;
        }
        bVar.T = dVar.f;
        bVar.U = dVar.f4737g;
        bVar.S = dVar.f4738h;
        bVar.W = dVar.f4740j;
        x2.a aVar = bVar.f3539z;
        if (aVar != null) {
            aVar.f4725i = true;
        }
        r0.b bVar2 = new r0.b(bVar);
        dVar.a();
        bVar.f3539z = new x2.a(bVar2, dVar.f4745p);
        dVar.b(textInputLayout.getContext(), bVar.f3539z);
        bVar.j(false);
        this.f1582p0 = bVar.f3524k;
        if (this.f1571j != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1582p0 != colorStateList) {
            if (this.f1580o0 == null) {
                b bVar = this.B0;
                if (bVar.f3524k != colorStateList) {
                    bVar.f3524k = colorStateList;
                    bVar.j(false);
                }
            }
            this.f1582p0 = colorStateList;
            if (this.f1571j != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(g0 g0Var) {
        this.f1589t = g0Var;
    }

    public void setMaxEms(int i4) {
        this.f1576m = i4;
        EditText editText = this.f1571j;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMaxEms(i4);
    }

    public void setMaxWidth(int i4) {
        this.f1579o = i4;
        EditText editText = this.f1571j;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMaxWidth(i4);
    }

    public void setMaxWidthResource(int i4) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    public void setMinEms(int i4) {
        this.f1574l = i4;
        EditText editText = this.f1571j;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMinEms(i4);
    }

    public void setMinWidth(int i4) {
        this.n = i4;
        EditText editText = this.f1571j;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMinWidth(i4);
    }

    public void setMinWidthResource(int i4) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i4) {
        s sVar = this.f1567h;
        sVar.f1739l.setContentDescription(i4 != 0 ? sVar.getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i4) {
        s sVar = this.f1567h;
        sVar.f1739l.setImageDrawable(i4 != 0 ? h0.w(sVar.getContext(), i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z4) {
        s sVar = this.f1567h;
        if (z4 && sVar.n != 1) {
            sVar.h(1);
        } else if (z4) {
            sVar.getClass();
        } else {
            sVar.h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        s sVar = this.f1567h;
        sVar.f1742p = colorStateList;
        e4.a.b(sVar.f, sVar.f1739l, colorStateList, sVar.f1743q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        s sVar = this.f1567h;
        sVar.f1743q = mode;
        e4.a.b(sVar.f, sVar.f1739l, sVar.f1742p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1600z == null) {
            y0 y0Var = new y0(getContext(), null);
            this.f1600z = y0Var;
            y0Var.setId(co.median.android.eeqadjy.R.id.textinput_placeholder);
            this.f1600z.setImportantForAccessibility(1);
            this.f1600z.setAccessibilityLiveRegion(1);
            g gVarF = f();
            this.C = gVarF;
            gVarF.f3328g = 67L;
            this.D = f();
            setPlaceholderTextAppearance(this.B);
            setPlaceholderTextColor(this.A);
            p0.m(this.f1600z, new e(3));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1598y) {
                setPlaceholderTextEnabled(true);
            }
            this.f1596x = charSequence;
        }
        EditText editText = this.f1571j;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i4) {
        this.B = i4;
        y0 y0Var = this.f1600z;
        if (y0Var != null) {
            y0Var.setTextAppearance(i4);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            y0 y0Var = this.f1600z;
            if (y0Var == null || colorStateList == null) {
                return;
            }
            y0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        b0 b0Var = this.f1566g;
        b0Var.getClass();
        b0Var.f1684h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        b0Var.f1683g.setText(charSequence);
        b0Var.f();
    }

    public void setPrefixTextAppearance(int i4) {
        this.f1566g.f1683g.setTextAppearance(i4);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1566g.f1683g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(o oVar) {
        j jVar = this.L;
        if (jVar == null || jVar.j() == oVar) {
            return;
        }
        this.R = oVar;
        c();
    }

    public void setStartIconCheckable(boolean z4) {
        this.f1566g.f1685i.setCheckable(z4);
    }

    public void setStartIconContentDescription(int i4) {
        setStartIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setStartIconDrawable(int i4) {
        setStartIconDrawable(i4 != 0 ? h0.w(getContext(), i4) : null);
    }

    public void setStartIconMinSize(int i4) {
        b0 b0Var = this.f1566g;
        if (i4 < 0) {
            b0Var.getClass();
            q.q("startIconSize cannot be less than 0");
        } else if (i4 != b0Var.f1688l) {
            b0Var.f1688l = i4;
            CheckableImageButton checkableImageButton = b0Var.f1685i;
            checkableImageButton.setMinimumWidth(i4);
            checkableImageButton.setMinimumHeight(i4);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        b0 b0Var = this.f1566g;
        CheckableImageButton checkableImageButton = b0Var.f1685i;
        View.OnLongClickListener onLongClickListener = b0Var.n;
        checkableImageButton.setOnClickListener(onClickListener);
        e4.a.e0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        b0 b0Var = this.f1566g;
        b0Var.n = onLongClickListener;
        CheckableImageButton checkableImageButton = b0Var.f1685i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        e4.a.e0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        b0 b0Var = this.f1566g;
        b0Var.f1689m = scaleType;
        b0Var.f1685i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        b0 b0Var = this.f1566g;
        if (b0Var.f1686j != colorStateList) {
            b0Var.f1686j = colorStateList;
            e4.a.b(b0Var.f, b0Var.f1685i, colorStateList, b0Var.f1687k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        b0 b0Var = this.f1566g;
        if (b0Var.f1687k != mode) {
            b0Var.f1687k = mode;
            e4.a.b(b0Var.f, b0Var.f1685i, b0Var.f1686j, mode);
        }
    }

    public void setStartIconVisible(boolean z4) {
        this.f1566g.d(z4);
    }

    public void setSuffixText(CharSequence charSequence) {
        s sVar = this.f1567h;
        sVar.getClass();
        sVar.f1747u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        sVar.f1748v.setText(charSequence);
        sVar.o();
    }

    public void setSuffixTextAppearance(int i4) {
        this.f1567h.f1748v.setTextAppearance(i4);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1567h.f1748v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(f0 f0Var) {
        EditText editText = this.f1571j;
        if (editText != null) {
            p0.m(editText, f0Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1568h0) {
            this.f1568h0 = typeface;
            this.B0.n(typeface);
            v vVar = this.f1581p;
            if (typeface != vVar.B) {
                vVar.B = typeface;
                y0 y0Var = vVar.f1777r;
                if (y0Var != null) {
                    y0Var.setTypeface(typeface);
                }
                y0 y0Var2 = vVar.f1784y;
                if (y0Var2 != null) {
                    y0Var2.setTypeface(typeface);
                }
            }
            y0 y0Var3 = this.f1591u;
            if (y0Var3 != null) {
                y0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        y0 y0Var;
        EditText editText = this.f1571j;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = j1.f2548a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1587s && (y0Var = this.f1591u) != null) {
            drawableMutate.setColorFilter(u.c(y0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f1571j.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f1571j;
        if (editText == null || this.L == null) {
            return;
        }
        if ((this.O || editText.getBackground() == null) && this.U != 0) {
            this.f1571j.setBackground(getEditTextBoxBackground());
            this.O = true;
        }
    }

    public final void v() {
        if (this.U != 1) {
            FrameLayout frameLayout = this.f;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z4, boolean z5) {
        ColorStateList colorStateList;
        y0 y0Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f1571j;
        boolean z6 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f1571j;
        boolean z7 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1580o0;
        b bVar = this.B0;
        if (colorStateList2 != null) {
            bVar.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f1580o0;
            int colorForState = this.f1599y0;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            bVar.k(ColorStateList.valueOf(colorForState));
        } else if (o()) {
            y0 y0Var2 = this.f1581p.f1777r;
            bVar.k(y0Var2 != null ? y0Var2.getTextColors() : null);
        } else if (this.f1587s && (y0Var = this.f1591u) != null) {
            bVar.k(y0Var.getTextColors());
        } else if (z7 && (colorStateList = this.f1582p0) != null && bVar.f3524k != colorStateList) {
            bVar.f3524k = colorStateList;
            bVar.j(false);
        }
        s sVar = this.f1567h;
        b0 b0Var = this.f1566g;
        if (z6 || !this.C0 || (isEnabled() && z7)) {
            if (z5 || this.A0) {
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                if (z4 && this.D0) {
                    b(1.0f);
                } else {
                    bVar.m(1.0f);
                }
                this.A0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f1571j;
                x(editText3 != null ? editText3.getText() : null);
                b0Var.f1690o = false;
                b0Var.f();
                sVar.f1749w = false;
                sVar.o();
                return;
            }
            return;
        }
        if (z5 || !this.A0) {
            ValueAnimator valueAnimator2 = this.E0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.E0.cancel();
            }
            if (z4 && this.D0) {
                b(0.0f);
            } else {
                bVar.m(0.0f);
            }
            if (g() && !((d3.h) this.L).M.f1710q.isEmpty() && g()) {
                ((d3.h) this.L).x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.A0 = true;
            y0 y0Var3 = this.f1600z;
            if (y0Var3 != null && this.f1598y) {
                y0Var3.setText((CharSequence) null);
                p1.v.a(this.f, this.D);
                this.f1600z.setVisibility(4);
            }
            b0Var.f1690o = true;
            b0Var.f();
            sVar.f1749w = true;
            sVar.o();
        }
    }

    public final void x(Editable editable) {
        ((q) this.f1589t).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f;
        if (length != 0 || this.A0) {
            y0 y0Var = this.f1600z;
            if (y0Var == null || !this.f1598y) {
                return;
            }
            y0Var.setText((CharSequence) null);
            p1.v.a(frameLayout, this.D);
            this.f1600z.setVisibility(4);
            return;
        }
        if (this.f1600z == null || !this.f1598y || TextUtils.isEmpty(this.f1596x)) {
            return;
        }
        this.f1600z.setText(this.f1596x);
        p1.v.a(frameLayout, this.C);
        this.f1600z.setVisibility(0);
        this.f1600z.bringToFront();
    }

    public final void y(boolean z4, boolean z5) {
        int defaultColor = this.f1590t0.getDefaultColor();
        int colorForState = this.f1590t0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1590t0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z4) {
            this.f1563c0 = colorForState2;
        } else if (z5) {
            this.f1563c0 = colorForState;
        } else {
            this.f1563c0 = defaultColor;
        }
    }

    public final void z() {
        y0 y0Var;
        EditText editText;
        EditText editText2;
        if (this.L == null || this.U == 0) {
            return;
        }
        boolean z4 = isFocused() || ((editText2 = this.f1571j) != null && editText2.hasFocus());
        boolean z5 = isHovered() || ((editText = this.f1571j) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f1563c0 = this.f1599y0;
        } else if (o()) {
            if (this.f1590t0 != null) {
                y(z4, z5);
            } else {
                this.f1563c0 = getErrorCurrentTextColors();
            }
        } else if (!this.f1587s || (y0Var = this.f1591u) == null) {
            if (z4) {
                this.f1563c0 = this.f1588s0;
            } else if (z5) {
                this.f1563c0 = this.f1586r0;
            } else {
                this.f1563c0 = this.f1584q0;
            }
        } else if (this.f1590t0 != null) {
            y(z4, z5);
        } else {
            this.f1563c0 = y0Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        s sVar = this.f1567h;
        TextInputLayout textInputLayout = sVar.f;
        CheckableImageButton checkableImageButton = sVar.f1739l;
        TextInputLayout textInputLayout2 = sVar.f;
        sVar.m();
        e4.a.Z(textInputLayout2, sVar.f1735h, sVar.f1736i);
        e4.a.Z(textInputLayout2, checkableImageButton, sVar.f1742p);
        if (sVar.b() instanceof m) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                e4.a.b(textInputLayout, checkableImageButton, sVar.f1742p, sVar.f1743q);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        b0 b0Var = this.f1566g;
        e4.a.Z(b0Var.f, b0Var.f1685i, b0Var.f1686j);
        if (this.U == 2) {
            int i4 = this.W;
            if (z4 && isEnabled()) {
                this.W = this.f1562b0;
            } else {
                this.W = this.f1561a0;
            }
            if (this.W != i4 && g() && !this.A0) {
                if (g()) {
                    ((d3.h) this.L).x(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.U == 1) {
            if (!isEnabled()) {
                this.d0 = this.v0;
            } else if (z5 && !z4) {
                this.d0 = this.f1597x0;
            } else if (z4) {
                this.d0 = this.f1595w0;
            } else {
                this.d0 = this.f1592u0;
            }
        }
        c();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.f1571j;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            } else {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            }
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.I) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f1566g.b(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1566g.c(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f1567h.g(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1567h.f1739l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1567h.f1739l.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1567h.j(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        s sVar = this.f1567h;
        TextInputLayout textInputLayout = sVar.f;
        CheckableImageButton checkableImageButton = sVar.f1739l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            e4.a.b(textInputLayout, checkableImageButton, sVar.f1742p, sVar.f1743q);
            e4.a.Z(textInputLayout, checkableImageButton, sVar.f1742p);
        }
    }
}
