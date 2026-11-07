package k;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class y0 extends TextView {
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0 f2698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f2699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f2700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a3.h0 f2702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Future f2703l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a3.a(context);
        this.f2701j = false;
        this.f2702k = null;
        z2.a(this, getContext());
        o oVar = new o(this);
        this.f = oVar;
        oVar.k(attributeSet, i4);
        u0 u0Var = new u0(this);
        this.f2698g = u0Var;
        u0Var.f(attributeSet, i4);
        u0Var.b();
        c0 c0Var = new c0();
        c0Var.f2497b = this;
        this.f2699h = c0Var;
        getEmojiTextViewHelper().b(attributeSet, i4);
    }

    private x getEmojiTextViewHelper() {
        if (this.f2700i == null) {
            this.f2700i = new x(this);
        }
        return this.f2700i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f;
        if (oVar != null) {
            oVar.a();
        }
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p3.f2614c) {
            return super.getAutoSizeMaxTextSize();
        }
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            return Math.round(u0Var.f2653i.f2508e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (p3.f2614c) {
            return super.getAutoSizeMinTextSize();
        }
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            return Math.round(u0Var.f2653i.f2507d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (p3.f2614c) {
            return super.getAutoSizeStepGranularity();
        }
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            return Math.round(u0Var.f2653i.f2506c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (p3.f2614c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        u0 u0Var = this.f2698g;
        return u0Var != null ? u0Var.f2653i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (p3.f2614c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            return u0Var.f2653i.f2504a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return u1.h0.r0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public v0 getSuperCaller() {
        if (this.f2702k == null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                this.f2702k = new x0(this);
            } else if (i4 >= 28) {
                this.f2702k = new w0(this);
            } else {
                this.f2702k = new a3.h0(19, this);
            }
        }
        return this.f2702k;
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f;
        if (oVar != null) {
            return oVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f;
        if (oVar != null) {
            return oVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2698g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2698g.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f2703l;
        if (future != null) {
            try {
                this.f2703l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                u1.h0.B(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f2699h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0Var.f2498c;
        return textClassifier == null ? p0.a((TextView) c0Var.f2497b) : textClassifier;
    }

    public n0.c getTextMetricsParamsCompat() {
        return u1.h0.B(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2698g.getClass();
        u0.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        u1.h0.N(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 || i4 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        u0 u0Var = this.f2698g;
        if (u0Var == null || p3.f2614c) {
            return;
        }
        u0Var.f2653i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        Future future = this.f2703l;
        if (future != null) {
            try {
                this.f2703l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                u1.h0.B(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            d1 d1Var = u0Var.f2653i;
            if (p3.f2614c || !d1Var.f()) {
                return;
            }
            d1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (p3.f2614c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            u0Var.i(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (p3.f2614c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            u0Var.j(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (p3.f2614c) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            u0Var.k(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f;
        if (oVar != null) {
            oVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        o oVar = this.f;
        if (oVar != null) {
            oVar.n(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? u1.h0.w(context, i4) : null, i5 != 0 ? u1.h0.w(context, i5) : null, i6 != 0 ? u1.h0.w(context, i6) : null, i7 != 0 ? u1.h0.w(context, i7) : null);
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? u1.h0.w(context, i4) : null, i5 != 0 ? u1.h0.w(context, i5) : null, i6 != 0 ? u1.h0.w(context, i6) : null, i7 != 0 ? u1.h0.w(context, i7) : null);
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u1.h0.s0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().d(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().q(i4);
        } else {
            u1.h0.d0(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i4);
        } else {
            u1.h0.g0(this, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i4, float f) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            getSuperCaller().t(i4, f);
        } else if (i5 >= 34) {
            o.a.h(this, i4, f);
        } else {
            u1.h0.h0(this, Math.round(TypedValue.applyDimension(i4, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(n0.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        u1.h0.B(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f;
        if (oVar != null) {
            oVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f;
        if (oVar != null) {
            oVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        u0 u0Var = this.f2698g;
        u0Var.l(colorStateList);
        u0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        u0 u0Var = this.f2698g;
        u0Var.m(mode);
        u0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            u0Var.g(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f2699h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0Var.f2498c = textClassifier;
        }
    }

    public void setTextFuture(Future<n0.d> future) {
        this.f2703l = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(n0.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f3082b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i4 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i4 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i4 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i4 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i4 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i4 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i4 = 7;
            }
        }
        setTextDirection(i4);
        getPaint().set(cVar.f3081a);
        setBreakStrategy(cVar.f3083c);
        setHyphenationFrequency(cVar.f3084d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f) {
        boolean z4 = p3.f2614c;
        if (z4) {
            super.setTextSize(i4, f);
            return;
        }
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            d1 d1Var = u0Var.f2653i;
            if (z4 || d1Var.f()) {
                return;
            }
            d1Var.g(i4, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i4) {
        Typeface typefaceCreate;
        if (this.f2701j) {
            return;
        }
        if (typeface == null || i4 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            e4.a aVar = f0.e.f2073a;
            if (context == null) {
                androidx.fragment.app.q.q("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i4);
        }
        this.f2701j = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i4);
        } finally {
            this.f2701j = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4) {
        u1.h0.h0(this, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f2698g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    public y0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
