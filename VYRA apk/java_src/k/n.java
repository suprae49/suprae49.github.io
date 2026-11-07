package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class n extends AutoCompleteTextView {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f2588i = {R.attr.popupBackground};
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0 f2589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f2590h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, co.median.android.eeqadjy.R.attr.autoCompleteTextViewStyle);
        a3.a(context);
        z2.a(this, getContext());
        androidx.emoji2.text.t tVarS = androidx.emoji2.text.t.s(co.median.android.eeqadjy.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, f2588i);
        if (((TypedArray) tVarS.f579c).hasValue(0)) {
            setDropDownBackgroundDrawable(tVarS.i(0));
        }
        tVarS.v();
        o oVar = new o(this);
        this.f = oVar;
        oVar.k(attributeSet, co.median.android.eeqadjy.R.attr.autoCompleteTextViewStyle);
        u0 u0Var = new u0(this);
        this.f2589g = u0Var;
        u0Var.f(attributeSet, co.median.android.eeqadjy.R.attr.autoCompleteTextViewStyle);
        u0Var.b();
        c0 c0Var = new c0(this);
        this.f2590h = c0Var;
        c0Var.b(attributeSet, co.median.android.eeqadjy.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c0Var.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f;
        if (oVar != null) {
            oVar.a();
        }
        u0 u0Var = this.f2589g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return u1.h0.r0(super.getCustomSelectionActionModeCallback());
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
        return this.f2589g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2589g.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        u1.h0.N(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f2590h.c(inputConnectionOnCreateInputConnection, editorInfo);
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
        u0 u0Var = this.f2589g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f2589g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u1.h0.s0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(u1.h0.w(getContext(), i4));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f2590h.d(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2590h.a(keyListener));
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
        u0 u0Var = this.f2589g;
        u0Var.l(colorStateList);
        u0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        u0 u0Var = this.f2589g;
        u0Var.m(mode);
        u0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        u0 u0Var = this.f2589g;
        if (u0Var != null) {
            u0Var.g(context, i4);
        }
    }
}
