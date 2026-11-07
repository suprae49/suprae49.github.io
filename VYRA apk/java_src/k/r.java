package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends CheckedTextView {
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f2622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u0 f2623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f2624i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        a3.a(context);
        z2.a(this, getContext());
        u0 u0Var = new u0(this);
        this.f2623h = u0Var;
        u0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        u0Var.b();
        o oVar = new o(this);
        this.f2622g = oVar;
        oVar.k(attributeSet, R.attr.checkedTextViewStyle);
        this.f = new s(this);
        Context context2 = getContext();
        int[] iArr = d.a.f1641l;
        androidx.emoji2.text.t tVarS = androidx.emoji2.text.t.s(R.attr.checkedTextViewStyle, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        p0.p0.l(this, getContext(), iArr, attributeSet, (TypedArray) tVarS.f579c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(u1.h0.w(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(u1.h0.w(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(u1.h0.w(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(tVarS.h(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(j1.c(typedArray.getInt(3, -1), null));
            }
            tVarS.v();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            tVarS.v();
            throw th;
        }
    }

    private x getEmojiTextViewHelper() {
        if (this.f2624i == null) {
            this.f2624i = new x(this);
        }
        return this.f2624i;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        u0 u0Var = this.f2623h;
        if (u0Var != null) {
            u0Var.b();
        }
        o oVar = this.f2622g;
        if (oVar != null) {
            oVar.a();
        }
        s sVar = this.f;
        if (sVar != null) {
            sVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return u1.h0.r0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f2622g;
        if (oVar != null) {
            return oVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f2622g;
        if (oVar != null) {
            return oVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        s sVar = this.f;
        if (sVar != null) {
            return sVar.f2626a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        s sVar = this.f;
        if (sVar != null) {
            return sVar.f2627b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2623h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2623h.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        u1.h0.N(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f2622g;
        if (oVar != null) {
            oVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        o oVar = this.f2622g;
        if (oVar != null) {
            oVar.n(i4);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        s sVar = this.f;
        if (sVar != null) {
            if (sVar.f2630e) {
                sVar.f2630e = false;
            } else {
                sVar.f2630e = true;
                sVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f2623h;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f2623h;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f2622g;
        if (oVar != null) {
            oVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f2622g;
        if (oVar != null) {
            oVar.t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        s sVar = this.f;
        if (sVar != null) {
            sVar.f2626a = colorStateList;
            sVar.f2628c = true;
            sVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        s sVar = this.f;
        if (sVar != null) {
            sVar.f2627b = mode;
            sVar.f2629d = true;
            sVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        u0 u0Var = this.f2623h;
        u0Var.l(colorStateList);
        u0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        u0 u0Var = this.f2623h;
        u0Var.m(mode);
        u0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        u0 u0Var = this.f2623h;
        if (u0Var != null) {
            u0Var.g(context, i4);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i4) {
        setCheckMarkDrawable(u1.h0.w(getContext(), i4));
    }
}
