package k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class p extends Button {
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0 f2599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f2600h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a3.a(context);
        z2.a(this, getContext());
        o oVar = new o(this);
        this.f = oVar;
        oVar.k(attributeSet, i4);
        u0 u0Var = new u0(this);
        this.f2599g = u0Var;
        u0Var.f(attributeSet, i4);
        u0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i4);
    }

    private x getEmojiTextViewHelper() {
        if (this.f2600h == null) {
            this.f2600h = new x(this);
        }
        return this.f2600h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f;
        if (oVar != null) {
            oVar.a();
        }
        u0 u0Var = this.f2599g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p3.f2614c) {
            return super.getAutoSizeMaxTextSize();
        }
        u0 u0Var = this.f2599g;
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
        u0 u0Var = this.f2599g;
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
        u0 u0Var = this.f2599g;
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
        u0 u0Var = this.f2599g;
        return u0Var != null ? u0Var.f2653i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (p3.f2614c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        u0 u0Var = this.f2599g;
        if (u0Var != null) {
            return u0Var.f2653i.f2504a;
        }
        return 0;
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
        return this.f2599g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2599g.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        u0 u0Var = this.f2599g;
        if (u0Var == null || p3.f2614c) {
            return;
        }
        u0Var.f2653i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        u0 u0Var = this.f2599g;
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
        u0 u0Var = this.f2599g;
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
        u0 u0Var = this.f2599g;
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
        u0 u0Var = this.f2599g;
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

    public void setSupportAllCaps(boolean z4) {
        u0 u0Var = this.f2599g;
        if (u0Var != null) {
            u0Var.f2646a.setAllCaps(z4);
        }
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
        u0 u0Var = this.f2599g;
        u0Var.l(colorStateList);
        u0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        u0 u0Var = this.f2599g;
        u0Var.m(mode);
        u0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        u0 u0Var = this.f2599g;
        if (u0Var != null) {
            u0Var.g(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f) {
        boolean z4 = p3.f2614c;
        if (z4) {
            super.setTextSize(i4, f);
            return;
        }
        u0 u0Var = this.f2599g;
        if (u0Var != null) {
            d1 d1Var = u0Var.f2653i;
            if (z4 || d1Var.f()) {
                return;
            }
            d1Var.g(i4, f);
        }
    }
}
