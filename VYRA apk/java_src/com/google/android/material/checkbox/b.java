package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.emoji2.text.t;
import androidx.fragment.app.u;
import b3.f;
import co.median.android.eeqadjy.R;
import e0.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.q;
import q1.c;
import q1.e;
import r2.a0;
import t2.i;
import u1.h0;
import v2.d;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends q {
    public static final int[] D = {R.attr.state_indeterminate};
    public static final int[] E = {R.attr.state_error};
    public static final int[][] F = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public CompoundButton.OnCheckedChangeListener A;
    public final e B;
    public final d C;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f1369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f1370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f1371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1372m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f1374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f1375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f1376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f1378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorStateList f1379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PorterDuff.Mode f1380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f1382x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1383y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f1384z;

    public b(Context context, AttributeSet attributeSet) {
        super(f3.a.b(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f1369j = new LinkedHashSet();
        this.f1370k = new LinkedHashSet();
        Context context2 = getContext();
        e eVar = new e(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = l.f2031a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        eVar.f = drawable;
        drawable.setCallback(eVar.f3396k);
        new q1.d(eVar.f.getConstantState());
        this.B = eVar;
        this.C = new d(this, 2);
        Context context3 = getContext();
        this.f1375q = getButtonDrawable();
        this.f1378t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        t tVarG = a0.g(context3, attributeSet, a2.a.f32x, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) tVarG.f579c;
        this.f1376r = tVarG.i(2);
        if (this.f1375q != null && t1.l.q(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == G && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f1375q = h0.w(context3, R.drawable.mtrl_checkbox_button);
                this.f1377s = true;
                if (this.f1376r == null) {
                    this.f1376r = h0.w(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f1379u = i.i(context3, tVarG, 3);
        this.f1380v = a0.h(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f1372m = typedArray.getBoolean(11, false);
        this.n = typedArray.getBoolean(6, true);
        this.f1373o = typedArray.getBoolean(9, false);
        this.f1374p = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        if (typedArray.hasValue(10)) {
            setRippleColor(i.i(context3, tVarG, 10));
        }
        tVarG.v();
        a();
    }

    private String getButtonStateDescription() {
        int i4 = this.f1381w;
        if (i4 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i4 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1371l == null) {
            int iA0 = e4.a.a0(getContext(), t1.l.s(this, R.attr.colorControlActivated));
            int iA1 = e4.a.a0(getContext(), t1.l.s(this, R.attr.colorError));
            int iA2 = e4.a.a0(getContext(), t1.l.s(this, R.attr.colorSurface));
            int iA3 = e4.a.a0(getContext(), t1.l.s(this, R.attr.colorOnSurface));
            this.f1371l = new ColorStateList(F, new int[]{e4.a.U(iA2, iA1, 1.0f), e4.a.U(iA2, iA0, 1.0f), e4.a.U(iA2, iA3, 0.54f), e4.a.U(iA2, iA3, 0.38f), e4.a.U(iA2, iA3, 0.38f)});
        }
        return this.f1371l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f1378t;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
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

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f fVar;
        Drawable drawableMutate = this.f1375q;
        ColorStateList colorStateList3 = this.f1378t;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f1375q = drawableMutate;
        Drawable drawableMutate2 = this.f1376r;
        ColorStateList colorStateList4 = this.f1379u;
        PorterDuff.Mode mode = this.f1380v;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f1376r = drawableMutate2;
        if (this.f1377s) {
            e eVar = this.B;
            if (eVar != null) {
                c cVar = eVar.f3392g;
                Drawable drawable = eVar.f;
                d dVar = this.C;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (dVar.f4295a == null) {
                        dVar.f4295a = new q1.b(dVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(dVar.f4295a);
                }
                ArrayList arrayList = eVar.f3395j;
                if (arrayList != null && dVar != null) {
                    arrayList.remove(dVar);
                    if (eVar.f3395j.size() == 0 && (fVar = eVar.f3394i) != null) {
                        cVar.f3388b.removeListener(fVar);
                        eVar.f3394i = null;
                    }
                }
                Drawable drawable2 = eVar.f;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (dVar.f4295a == null) {
                        dVar.f4295a = new q1.b(dVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(dVar.f4295a);
                } else if (dVar != null) {
                    if (eVar.f3395j == null) {
                        eVar.f3395j = new ArrayList();
                    }
                    if (!eVar.f3395j.contains(dVar)) {
                        eVar.f3395j.add(dVar);
                        if (eVar.f3394i == null) {
                            eVar.f3394i = new f(6, eVar);
                        }
                        cVar.f3388b.addListener(eVar.f3394i);
                    }
                }
            }
            Drawable drawable3 = this.f1375q;
            if ((drawable3 instanceof AnimatedStateListDrawable) && eVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, eVar, false);
                ((AnimatedStateListDrawable) this.f1375q).addTransition(R.id.indeterminate, R.id.unchecked, eVar, false);
            }
        }
        Drawable drawable4 = this.f1375q;
        if (drawable4 != null && (colorStateList2 = this.f1378t) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f1376r;
        if (drawable5 != null && (colorStateList = this.f1379u) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f1375q;
        Drawable drawable7 = this.f1376r;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f1375q;
    }

    public Drawable getButtonIconDrawable() {
        return this.f1376r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f1379u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f1380v;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f1378t;
    }

    public int getCheckedState() {
        return this.f1381w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f1374p;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f1381w == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1372m && this.f1378t == null && this.f1379u == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        if (this.f1373o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        for (int i5 = 0; i5 < iArrOnCreateDrawableState.length; i5++) {
            int i6 = iArrOnCreateDrawableState[i5];
            if (i6 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i6 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i5] = 16842912;
            }
            this.f1382x = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.f1382x = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.n || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f1373o) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f1374p));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MaterialCheckBox$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MaterialCheckBox$SavedState materialCheckBox$SavedState = (MaterialCheckBox$SavedState) parcelable;
        super.onRestoreInstanceState(materialCheckBox$SavedState.getSuperState());
        setCheckedState(materialCheckBox$SavedState.f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(super.onSaveInstanceState());
        materialCheckBox$SavedState.f = getCheckedState();
        return materialCheckBox$SavedState;
    }

    @Override // k.q, android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(h0.w(getContext(), i4));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f1376r = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i4) {
        setButtonIconDrawable(h0.w(getContext(), i4));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f1379u == colorStateList) {
            return;
        }
        this.f1379u = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f1380v == mode) {
            return;
        }
        this.f1380v = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f1378t == colorStateList) {
            return;
        }
        this.f1378t = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z4) {
        this.n = z4;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        setCheckedState(z4 ? 1 : 0);
    }

    public void setCheckedState(int i4) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f1381w != i4) {
            this.f1381w = i4;
            super.setChecked(i4 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f1384z == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f1383y) {
                return;
            }
            this.f1383y = true;
            LinkedHashSet linkedHashSet = this.f1370k;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw u.j(it);
                }
            }
            if (this.f1381w != 2 && (onCheckedChangeListener = this.A) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f1383y = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f1374p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i4) {
        setErrorAccessibilityLabel(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setErrorShown(boolean z4) {
        if (this.f1373o == z4) {
            return;
        }
        this.f1373o = z4;
        refreshDrawableState();
        Iterator it = this.f1369j.iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f1384z = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f1372m = z4;
        if (z4) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // k.q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f1375q = drawable;
        this.f1377s = false;
        a();
    }
}
