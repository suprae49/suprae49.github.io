package com.google.android.material.button;

import a3.g0;
import a3.i0;
import a3.j;
import a3.j0;
import a3.m;
import a3.o;
import a3.z;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.k;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import i2.b;
import i2.c;
import i2.d;
import i2.g;
import i2.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.p;
import r2.a0;
import t1.l;
import t2.i;
import u1.h0;
import z0.e;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends p implements Checkable, z {
    public static final int[] S = {R.attr.state_checkable};
    public static final int[] T = {R.attr.state_checked};
    public static final b U = new b(0);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public float E;
    public int F;
    public int G;
    public LinearLayout.LayoutParams H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public j0 M;
    public int N;
    public d O;
    public float P;
    public float Q;
    public z0.d R;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f1341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f1342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f1343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f1344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f1345m;
    public Drawable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f1346o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f1347p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f1348q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1349r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f1350s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1351t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1352u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1353v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1355x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1356y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1357z;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f1358h;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f1358h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f1358h ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(f3.a.a(co.median.android.eeqadjy.R.attr.materialButtonStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{co.median.android.eeqadjy.R.attr.materialSizeOverlay}), attributeSet, co.median.android.eeqadjy.R.attr.materialButtonStyle);
        this.f1342j = new LinkedHashSet();
        this.f1357z = false;
        this.A = false;
        this.D = Integer.MIN_VALUE;
        this.E = -2.1474836E9f;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.L = Integer.MIN_VALUE;
        this.O = d.f2274i;
        Context context2 = getContext();
        TypedArray typedArrayF = a0.f(context2, attributeSet, a2.a.f26r, co.median.android.eeqadjy.R.attr.materialButtonStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1354w = typedArrayF.getDimensionPixelSize(13, 0);
        int i4 = typedArrayF.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1344l = a0.h(i4, mode);
        this.f1345m = i.h(getContext(), typedArrayF, 15);
        this.n = i.m(getContext(), typedArrayF, 11);
        this.B = typedArrayF.getInteger(12, 1);
        this.f1351t = typedArrayF.getDimensionPixelSize(14, 0);
        this.f1346o = a0.h(typedArrayF.getInt(22, -1), mode);
        this.f1347p = typedArrayF.hasValue(21) ? i.h(getContext(), typedArrayF, 21) : this.f1345m;
        this.C = typedArrayF.getInteger(20, 3);
        Drawable drawableM = i.m(getContext(), typedArrayF, 19);
        this.f1348q = drawableM;
        this.f1349r = drawableM == null;
        m mVarG = g0.g(context2, typedArrayF, 23);
        mVarG = mVarG == null ? o.g(context2, attributeSet, co.median.android.eeqadjy.R.attr.materialButtonStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_Button).a() : mVarG;
        boolean z4 = typedArrayF.getBoolean(17, false);
        h hVar = new h(this, mVarG);
        this.f1341i = hVar;
        hVar.f2291e = typedArrayF.getDimensionPixelOffset(2, 0);
        hVar.f = typedArrayF.getDimensionPixelOffset(3, 0);
        hVar.f2292g = typedArrayF.getDimensionPixelOffset(4, 0);
        hVar.f2293h = typedArrayF.getDimensionPixelOffset(5, 0);
        if (typedArrayF.hasValue(9)) {
            int dimensionPixelSize = typedArrayF.getDimensionPixelSize(9, -1);
            hVar.f2294i = dimensionPixelSize;
            hVar.f2288b = hVar.f2288b.a(dimensionPixelSize);
            hVar.d();
            hVar.f2302r = true;
        }
        hVar.f2295j = typedArrayF.getDimensionPixelSize(26, 0);
        hVar.f2296k = a0.h(typedArrayF.getInt(8, -1), mode);
        hVar.f2297l = i.h(getContext(), typedArrayF, 7);
        hVar.f2298m = i.h(getContext(), typedArrayF, 25);
        hVar.n = i.h(getContext(), typedArrayF, 18);
        hVar.f2303s = typedArrayF.getBoolean(6, false);
        hVar.f2306v = typedArrayF.getDimensionPixelSize(10, 0);
        hVar.f2304t = typedArrayF.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayF.hasValue(0)) {
            hVar.f2301q = true;
            setSupportBackgroundTintList(hVar.f2297l);
            setSupportBackgroundTintMode(hVar.f2296k);
        } else {
            hVar.c();
        }
        setPaddingRelative(paddingStart + hVar.f2291e, paddingTop + hVar.f2292g, paddingEnd + hVar.f, paddingBottom + hVar.f2293h);
        setCheckedInternal(typedArrayF.getBoolean(1, false));
        if (mVarG instanceof g0) {
            hVar.f2289c = f();
            if (hVar.f2288b instanceof g0) {
                hVar.d();
            }
        }
        setOpticalCenterEnabled(z4);
        typedArrayF.recycle();
        setCompoundDrawablePadding(this.f1354w);
        u(this.n != null);
        x(this.f1348q != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.J = materialButton.getOpticalCenterShift();
        materialButton.w();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.P;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        j jVarA;
        if (this.I && this.K && (jVarA = this.f1341i.a(false)) != null) {
            return (int) (jVarA.i() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i4 = 0; i4 < lineCount; i4++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i4));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z4) {
        if (!k() || this.f1357z == z4) {
            return;
        }
        this.f1357z = z4;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z5 = this.f1357z;
            if (!materialButtonToggleGroup.f1361s) {
                materialButtonToggleGroup.l(getId(), z5);
            }
        }
        if (this.A) {
            return;
        }
        this.A = true;
        Iterator it = this.f1342j.iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        this.A = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.P != f) {
            this.P = f;
            w();
            invalidate();
            if (getParent() instanceof g) {
                g gVar = (g) getParent();
                int i4 = (int) this.P;
                int iIndexOfChild = gVar.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                MaterialButton materialButtonH = gVar.h(iIndexOfChild);
                MaterialButton materialButtonG = gVar.g(iIndexOfChild);
                if (materialButtonH == null && materialButtonG == null) {
                    return;
                }
                if (materialButtonH == null) {
                    materialButtonG.setDisplayedWidthDecrease(i4);
                }
                if (materialButtonG == null) {
                    materialButtonH.setDisplayedWidthDecrease(i4);
                }
                if (materialButtonH == null || materialButtonG == null) {
                    return;
                }
                materialButtonH.setDisplayedWidthDecrease(i4 / 2);
                materialButtonG.setDisplayedWidthDecrease((i4 + 1) / 2);
            }
        }
    }

    public final boolean d() {
        if (m() && p()) {
            return true;
        }
        if (l() && o()) {
            return true;
        }
        return n() && q();
    }

    public final boolean e(int i4) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i4 == 1 || i4 == 3 || (i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final e f() {
        Context context = getContext();
        TypedValue typedValueP = l.p(context.getTheme(), co.median.android.eeqadjy.R.attr.motionSpringFastSpatial);
        int[] iArr = a2.a.B;
        TypedArray typedArrayObtainStyledAttributes = typedValueP == null ? context.obtainStyledAttributes(null, iArr, 0, co.median.android.eeqadjy.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueP.resourceId, iArr);
        e eVar = new e();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f4 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f4 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            eVar.b(f);
            eVar.a(f4);
            typedArrayObtainStyledAttributes.recycle();
            return eVar;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int g(int i4, int i5) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.n;
        if (drawable != null) {
            intrinsicWidth = this.f1351t;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.f1348q;
        if (drawable2 != null) {
            intrinsicWidth2 = this.f1351t;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i4 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.f1354w) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i5 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f1350s)) {
            return (k() ? CompoundButton.class : Button.class).getName();
        }
        return this.f1350s;
    }

    public int getAllowedWidthDecrease() {
        return this.L;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (r()) {
            return this.f1341i.f2294i;
        }
        return 0;
    }

    public e getCornerSpringForce() {
        return this.f1341i.f2289c;
    }

    public Drawable getIcon() {
        return this.n;
    }

    public int getIconGravity() {
        return this.B;
    }

    public int getIconPadding() {
        return this.f1354w;
    }

    public int getIconSize() {
        return this.f1351t;
    }

    public ColorStateList getIconTint() {
        return this.f1345m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1344l;
    }

    public int getInsetBottom() {
        return this.f1341i.f2293h;
    }

    public int getInsetLeft() {
        return this.f1341i.f2291e;
    }

    public int getInsetRight() {
        return this.f1341i.f;
    }

    public int getInsetTop() {
        return this.f1341i.f2292g;
    }

    public ColorStateList getRippleColor() {
        if (r()) {
            return this.f1341i.n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.f1348q;
    }

    public int getSecondaryIconGravity() {
        return this.C;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.f1347p;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.f1346o;
    }

    public m getShapeAppearance() {
        if (r()) {
            return this.f1341i.f2288b;
        }
        q.j("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public o getShapeAppearanceModel() {
        if (r()) {
            return this.f1341i.f2288b.c();
        }
        q.j("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (r()) {
            return this.f1341i.f2298m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (r()) {
            return this.f1341i.f2295j;
        }
        return 0;
    }

    @Override // k.p
    public ColorStateList getSupportBackgroundTintList() {
        return r() ? this.f1341i.f2297l : super.getSupportBackgroundTintList();
    }

    @Override // k.p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return r() ? this.f1341i.f2296k : super.getSupportBackgroundTintMode();
    }

    public final int h(int i4, int i5) {
        return Math.max(0, (((((i4 - getTextHeight()) - getPaddingTop()) - i5) - this.f1354w) - getPaddingBottom()) / 2);
    }

    public final Drawable i(int i4) {
        if (i4 == 0) {
            if (this.f1348q == null || !p()) {
                return null;
            }
            return this.f1348q;
        }
        if (i4 == 1) {
            if (this.f1348q == null || !q()) {
                return null;
            }
            return this.f1348q;
        }
        if (i4 == 2 && this.f1348q != null && o()) {
            return this.f1348q;
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1357z;
    }

    public final Drawable j(int i4) {
        if (i4 == 0) {
            if (this.n == null || !m()) {
                return null;
            }
            return this.n;
        }
        if (i4 == 1) {
            if (this.n == null || !l()) {
                return null;
            }
            return this.n;
        }
        if (i4 == 2 && this.n != null && l()) {
            return this.n;
        }
        return null;
    }

    public final boolean k() {
        h hVar = this.f1341i;
        return hVar != null && hVar.f2303s;
    }

    public final boolean l() {
        int i4 = this.B;
        return i4 == 3 || i4 == 4;
    }

    public final boolean m() {
        int i4 = this.B;
        return i4 == 1 || i4 == 2;
    }

    public final boolean n() {
        int i4 = this.B;
        return i4 == 16 || i4 == 32;
    }

    public final boolean o() {
        int i4 = this.C;
        return i4 == 3 || i4 == 4;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (r()) {
            h0.i0(this, this.f1341i.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (k()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, S);
        }
        if (this.f1357z) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // k.p, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1357z);
    }

    @Override // k.p, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setChecked(this.f1357z);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // k.p, android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        super.onLayout(z4, i4, i5, i6, i7);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
        int i9 = getResources().getConfiguration().orientation;
        if (this.D != i9) {
            this.D = i9;
            this.E = -2.1474836E9f;
        }
        if (this.E == -2.1474836E9f) {
            this.E = getMeasuredWidth();
            if (this.H == null && (getParent() instanceof g) && ((g) getParent()).getButtonSizeChange() != null) {
                this.H = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.H);
                layoutParams.width = (int) this.E;
                setLayoutParams(layoutParams);
            }
        }
        boolean z5 = false;
        if (this.L == Integer.MIN_VALUE) {
            if (this.n == null) {
                i8 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f1351t;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.n.getIntrinsicWidth();
                }
                i8 = iconPadding + intrinsicWidth;
            }
            this.L = (getMeasuredWidth() - getTextLayoutWidth()) - i8;
        }
        if (this.F == Integer.MIN_VALUE) {
            this.F = getPaddingStart();
        }
        if (this.G == Integer.MIN_VALUE) {
            this.G = getPaddingEnd();
        }
        if ((getParent() instanceof g) && ((g) getParent()).getOrientation() == 0) {
            z5 = true;
        }
        this.K = z5;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f);
        setChecked(savedState.f1358h);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1358h = this.f1357z;
        return savedState;
    }

    @Override // k.p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean p() {
        int i4 = this.C;
        return i4 == 1 || i4 == 2;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z4;
        if (isEnabled() && this.f1341i.f2304t) {
            toggle();
            z4 = true;
        } else {
            z4 = false;
        }
        boolean zPerformClick = super.performClick();
        if (z4 && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    public final boolean q() {
        int i4 = this.C;
        return i4 == 16 || i4 == 32;
    }

    public final boolean r() {
        h hVar = this.f1341i;
        return (hVar == null || hVar.f2301q) ? false : true;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.n != null) {
            if (this.n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public final void s(boolean z4) {
        int i4;
        if (this.M == null) {
            return;
        }
        if (this.R == null) {
            z0.d dVar = new z0.d(this, U);
            this.R = dVar;
            dVar.f4843k = f();
        }
        if (this.K) {
            int iOrdinal = this.O.ordinal();
            int i5 = 0;
            int i6 = (iOrdinal == 1 || iOrdinal == 2) ? this.N / 2 : iOrdinal != 3 ? 0 : this.N;
            j0 j0Var = this.M;
            int[] drawableState = getDrawableState();
            int[][] iArr = j0Var.f109c;
            int i7 = 0;
            while (true) {
                i4 = -1;
                if (i7 >= j0Var.f107a) {
                    i7 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i7], drawableState)) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = j0Var.f109c;
                for (int i8 = 0; i8 < j0Var.f107a; i8++) {
                    if (StateSet.stateSetMatches(iArr3[i8], iArr2)) {
                        i4 = i8;
                        break;
                    }
                }
                i7 = i4;
            }
            i0 i0Var = (i0) (i7 < 0 ? j0Var.f108b : j0Var.f110d[i7]).f84g;
            int width = getWidth();
            float f = i0Var.f87b;
            int i9 = i0Var.f86a;
            if (i9 != 1) {
                if (i9 == 2) {
                }
                this.R.a(Math.min(i6, i5));
                if (z4) {
                    this.R.d();
                }
            }
            f *= width;
            i5 = (int) f;
            this.R.a(Math.min(i6, i5));
            if (z4) {
                this.R.d();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1350s = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        if (!r()) {
            super.setBackgroundColor(i4);
            return;
        }
        h hVar = this.f1341i;
        if (hVar.a(false) != null) {
            hVar.a(false).setTint(i4);
        }
    }

    @Override // k.p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!r()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        h hVar = this.f1341i;
        hVar.f2301q = true;
        MaterialButton materialButton = hVar.f2287a;
        materialButton.setSupportBackgroundTintList(hVar.f2297l);
        materialButton.setSupportBackgroundTintMode(hVar.f2296k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // k.p, android.view.View
    public void setBackgroundResource(int i4) {
        setBackgroundDrawable(i4 != 0 ? h0.w(getContext(), i4) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z4) {
        if (r()) {
            this.f1341i.f2303s = z4;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        setCheckedInternal(z4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i4) {
        if (getCompoundDrawablePadding() != i4) {
            this.E = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i4);
    }

    public void setCornerRadius(int i4) {
        if (r()) {
            h hVar = this.f1341i;
            if (hVar.f2302r && hVar.f2294i == i4) {
                return;
            }
            hVar.f2294i = i4;
            hVar.f2302r = true;
            hVar.f2288b = hVar.f2288b.a(i4);
            hVar.d();
        }
    }

    public void setCornerRadiusResource(int i4) {
        if (r()) {
            setCornerRadius(getResources().getDimensionPixelSize(i4));
        }
    }

    public void setCornerSpringForce(e eVar) {
        h hVar = this.f1341i;
        hVar.f2289c = eVar;
        if (hVar.f2288b instanceof g0) {
            hVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i4) {
        this.Q = Math.min(i4, this.L);
        w();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (r()) {
            this.f1341i.a(false).q(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.n == drawable || t(new i2.a(this, drawable, 1))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.n = drawable;
        u(true);
        v(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i4) {
        if (this.B != i4) {
            if (this.n != null && this.f1348q != null && d()) {
                q.q("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.B = i4;
                v(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i4) {
        if (this.f1354w != i4) {
            this.f1354w = i4;
            setCompoundDrawablePadding(i4);
        }
    }

    public void setIconResource(int i4) {
        setIcon(i4 != 0 ? h0.w(getContext(), i4) : null);
    }

    public void setIconSize(int i4) {
        if (i4 < 0) {
            q.q("iconSize cannot be less than 0");
            return;
        }
        if (this.f1351t == i4 || t(new b3.c(i4, 2, this))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.f1351t = i4;
        u(true);
        x(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1345m != colorStateList) {
            this.f1345m = colorStateList;
            u(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1344l != mode) {
            this.f1344l = mode;
            u(false);
        }
    }

    public void setIconTintResource(int i4) {
        setIconTint(c0.c.getColorStateList(getContext(), i4));
    }

    public void setInsetBottom(int i4) {
        h hVar = this.f1341i;
        hVar.b(hVar.f2291e, hVar.f2292g, hVar.f, i4);
    }

    public void setInsetLeft(int i4) {
        h hVar = this.f1341i;
        hVar.b(i4, hVar.f2292g, hVar.f, hVar.f2293h);
    }

    public void setInsetRight(int i4) {
        h hVar = this.f1341i;
        hVar.b(hVar.f2291e, hVar.f2292g, i4, hVar.f2293h);
    }

    public void setInsetTop(int i4) {
        h hVar = this.f1341i;
        hVar.b(hVar.f2291e, i4, hVar.f, hVar.f2293h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(c cVar) {
        this.f1343k = cVar;
    }

    public void setOpticalCenterEnabled(boolean z4) {
        if (this.I != z4) {
            this.I = z4;
            h hVar = this.f1341i;
            if (z4) {
                d3.a0 a0Var = new d3.a0(2, this);
                hVar.f2290d = a0Var;
                j jVarA = hVar.a(false);
                if (jVarA != null) {
                    jVarA.J = a0Var;
                }
            } else {
                hVar.f2290d = null;
                j jVarA2 = hVar.a(false);
                if (jVarA2 != null) {
                    jVarA2.J = null;
                }
            }
            post(new k(9, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        c cVar = this.f1343k;
        if (cVar != null) {
            ((MaterialButtonToggleGroup) ((a3.h0) cVar).f84g).invalidate();
        }
        super.setPressed(z4);
        s(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (r()) {
            h hVar = this.f1341i;
            MaterialButton materialButton = hVar.f2287a;
            if (hVar.n != colorStateList) {
                hVar.n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(y2.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i4) {
        if (r()) {
            setRippleColor(c0.c.getColorStateList(getContext(), i4));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.f1348q == drawable || t(new i2.a(this, drawable, 0))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.f1348q = drawable;
        this.f1349r = false;
        x(true);
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i4) {
        if (this.C != i4) {
            if (this.f1348q != null && this.n != null && d()) {
                q.q("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.C = i4;
                y(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i4) {
        setSecondaryIcon(i4 != 0 ? h0.w(getContext(), i4) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.f1347p != colorStateList) {
            this.f1347p = colorStateList;
            x(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.f1346o != mode) {
            this.f1346o = mode;
            x(false);
        }
    }

    public void setSecondaryIconTintResource(int i4) {
        setSecondaryIconTint(c0.c.getColorStateList(getContext(), i4));
    }

    public void setShapeAppearance(m mVar) {
        if (!r()) {
            q.j("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        h hVar = this.f1341i;
        if (hVar.f2289c == null && mVar.e()) {
            hVar.f2289c = f();
            if (hVar.f2288b instanceof g0) {
                hVar.d();
            }
        }
        hVar.f2288b = mVar;
        hVar.d();
    }

    @Override // a3.z
    public void setShapeAppearanceModel(o oVar) {
        if (!r()) {
            q.j("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        h hVar = this.f1341i;
        hVar.f2288b = oVar;
        hVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z4) {
        if (r()) {
            h hVar = this.f1341i;
            hVar.f2300p = z4;
            hVar.e();
        }
    }

    public void setSizeChange(j0 j0Var) {
        if (this.M != j0Var) {
            this.M = j0Var;
            s(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (r()) {
            h hVar = this.f1341i;
            if (hVar.f2298m != colorStateList) {
                hVar.f2298m = colorStateList;
                hVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i4) {
        if (r()) {
            setStrokeColor(c0.c.getColorStateList(getContext(), i4));
        }
    }

    public void setStrokeWidth(int i4) {
        if (r()) {
            h hVar = this.f1341i;
            if (hVar.f2295j != i4) {
                hVar.f2295j = i4;
                hVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i4) {
        if (r()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // k.p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!r()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        h hVar = this.f1341i;
        if (hVar.f2297l != colorStateList) {
            hVar.f2297l = colorStateList;
            if (hVar.a(false) != null) {
                hVar.a(false).setTintList(hVar.f2297l);
            }
        }
    }

    @Override // k.p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!r()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        h hVar = this.f1341i;
        if (hVar.f2296k != mode) {
            hVar.f2296k = mode;
            if (hVar.a(false) == null || hVar.f2296k == null) {
                return;
            }
            hVar.a(false).setTintMode(hVar.f2296k);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.E = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i4) {
        super.setTextAlignment(i4);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // k.p, android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        this.E = -2.1474836E9f;
        super.setTextAppearance(context, i4);
    }

    @Override // k.p, android.widget.TextView
    public final void setTextSize(int i4, float f) {
        this.E = -2.1474836E9f;
        super.setTextSize(i4, f);
    }

    public void setToggleCheckedStateOnClick(boolean z4) {
        this.f1341i.f2304t = z4;
    }

    @Override // android.widget.TextView
    public void setWidth(int i4) {
        this.E = -2.1474836E9f;
        super.setWidth(i4);
    }

    public void setWidthChangeDirection(d dVar) {
        if (this.O != dVar) {
            this.O = dVar;
            s(true);
        }
    }

    public void setWidthChangeMax(int i4) {
        if (this.N != i4) {
            this.N = i4;
            s(true);
        }
    }

    public final boolean t(Runnable runnable) {
        z0.d dVar = this.R;
        if (dVar == null || !dVar.f) {
            return false;
        }
        post(new androidx.activity.p(this, 3, runnable));
        return true;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1357z);
    }

    public final void u(boolean z4) {
        Drawable drawable = this.n;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.n = drawableMutate;
            drawableMutate.setTintList(this.f1345m);
            PorterDuff.Mode mode = this.f1344l;
            if (mode != null) {
                this.n.setTintMode(mode);
            }
            int intrinsicWidth = this.f1351t;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.n.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f1351t;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.n;
            int i4 = this.f1352u;
            int i5 = this.f1353v;
            drawable2.setBounds(i4, i5, intrinsicWidth + i4, intrinsicHeight + i5);
            this.n.setVisible(true, z4);
        }
        if (this.n != null && this.f1348q != null && d()) {
            q.q("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.n == null && this.f1348q != null && d()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z5 = (m() && compoundDrawablesRelative[0] != this.n) || (l() && compoundDrawablesRelative[2] != this.n) || (n() && compoundDrawablesRelative[1] != this.n);
        if (z4 || z5) {
            if (m()) {
                setCompoundDrawablesRelative(this.n, i(1), i(2), null);
            } else if (l()) {
                setCompoundDrawablesRelative(i(0), i(1), this.n, null);
            } else if (n()) {
                setCompoundDrawablesRelative(i(0), this.n, i(2), null);
            }
        }
    }

    public final void v(int i4, int i5) {
        if (this.n == null || getLayout() == null) {
            return;
        }
        if (m() || l()) {
            this.f1353v = 0;
            if (e(this.B)) {
                this.f1352u = 0;
                u(false);
                return;
            }
            int iG = g(i4, this.B);
            if (this.f1352u != iG) {
                this.f1352u = iG;
                u(false);
                return;
            }
            return;
        }
        if (n()) {
            this.f1352u = 0;
            if (this.B == 16) {
                this.f1353v = 0;
                u(false);
                return;
            }
            int intrinsicHeight = this.f1351t;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.n.getIntrinsicHeight();
            }
            int iH = h(i5, intrinsicHeight);
            if (this.f1353v != iH) {
                this.f1353v = iH;
                u(false);
            }
        }
    }

    public final void w() {
        int i4 = (int) (this.P - this.Q);
        boolean z4 = getLayoutDirection() == 1;
        int i5 = this.J;
        if (z4) {
            i5 = -i5;
        }
        int i6 = (i4 / 2) + i5;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.E + i4);
        }
        setPaddingRelative(this.F + i6, getPaddingTop(), (this.G + i4) - i6, getPaddingBottom());
    }

    public final void x(boolean z4) {
        Drawable drawable = this.f1348q;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f1348q = drawableMutate;
            drawableMutate.setTintList(this.f1347p);
            PorterDuff.Mode mode = this.f1346o;
            if (mode != null) {
                this.f1348q.setTintMode(mode);
            }
            int intrinsicWidth = this.f1351t;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f1348q.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f1351t;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f1348q.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1348q;
            int i4 = this.f1355x;
            int i5 = this.f1356y;
            drawable2.setBounds(i4, i5, intrinsicWidth + i4, intrinsicHeight + i5);
            this.f1348q.setVisible(true, z4);
        }
        if (this.f1348q != null && this.n != null && d()) {
            q.q("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.f1348q == null) {
            if (this.f1349r) {
                return;
            }
            if (this.n != null && d()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z5 = (p() && compoundDrawablesRelative[0] != this.f1348q) || (o() && compoundDrawablesRelative[2] != this.f1348q) || (q() && compoundDrawablesRelative[1] != this.f1348q);
        if (z4 || z5) {
            if (p()) {
                setCompoundDrawablesRelative(this.f1348q, j(1), j(2), null);
            } else if (o()) {
                setCompoundDrawablesRelative(j(0), j(1), this.f1348q, null);
            } else if (q()) {
                setCompoundDrawablesRelative(j(0), this.f1348q, j(2), null);
            }
        }
    }

    public final void y(int i4, int i5) {
        if (this.f1348q == null || getLayout() == null) {
            return;
        }
        if (p() || o()) {
            this.f1356y = 0;
            if (e(this.C)) {
                this.f1355x = 0;
                x(false);
                return;
            }
            int iG = g(i4, this.C);
            if (this.f1355x != iG) {
                this.f1355x = iG;
                x(false);
                return;
            }
            return;
        }
        if (q()) {
            this.f1355x = 0;
            if (this.C == 16) {
                this.f1356y = 0;
                x(false);
                return;
            }
            int intrinsicHeight = this.f1351t;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f1348q.getIntrinsicHeight();
            }
            int iH = h(i5, intrinsicHeight);
            if (this.f1356y != iH) {
                this.f1356y = iH;
                x(false);
            }
        }
    }
}
