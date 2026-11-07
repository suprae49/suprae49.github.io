package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class q extends CheckBox implements t0.h {
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f2615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u0 f2616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f2617i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a3.a(context);
        z2.a(this, getContext());
        s sVar = new s(this);
        this.f = sVar;
        sVar.c(attributeSet, i4);
        o oVar = new o(this);
        this.f2615g = oVar;
        oVar.k(attributeSet, i4);
        u0 u0Var = new u0(this);
        this.f2616h = u0Var;
        u0Var.f(attributeSet, i4);
        getEmojiTextViewHelper().b(attributeSet, i4);
    }

    private x getEmojiTextViewHelper() {
        if (this.f2617i == null) {
            this.f2617i = new x(this);
        }
        return this.f2617i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f2615g;
        if (oVar != null) {
            oVar.a();
        }
        u0 u0Var = this.f2616h;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f2615g;
        if (oVar != null) {
            return oVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f2615g;
        if (oVar != null) {
            return oVar.i();
        }
        return null;
    }

    @Override // t0.h
    public ColorStateList getSupportButtonTintList() {
        s sVar = this.f;
        if (sVar != null) {
            return sVar.f2626a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        s sVar = this.f;
        if (sVar != null) {
            return sVar.f2627b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2616h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2616h.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f2615g;
        if (oVar != null) {
            oVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        o oVar = this.f2615g;
        if (oVar != null) {
            oVar.n(i4);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        s sVar = this.f;
        if (sVar != null) {
            if (sVar.f2630e) {
                sVar.f2630e = false;
            } else {
                sVar.f2630e = true;
                sVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f2616h;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f2616h;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().d(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f2615g;
        if (oVar != null) {
            oVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f2615g;
        if (oVar != null) {
            oVar.t(mode);
        }
    }

    @Override // t0.h
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        s sVar = this.f;
        if (sVar != null) {
            sVar.f2626a = colorStateList;
            sVar.f2628c = true;
            sVar.a();
        }
    }

    @Override // t0.h
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        s sVar = this.f;
        if (sVar != null) {
            sVar.f2627b = mode;
            sVar.f2629d = true;
            sVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        u0 u0Var = this.f2616h;
        u0Var.l(colorStateList);
        u0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        u0 u0Var = this.f2616h;
        u0Var.m(mode);
        u0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(u1.h0.w(getContext(), i4));
    }
}
