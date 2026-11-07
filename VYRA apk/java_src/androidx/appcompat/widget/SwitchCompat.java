package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.k;
import androidx.emoji2.text.t;
import b1.h;
import java.util.WeakHashMap;
import k.j1;
import k.p3;
import k.u0;
import k.x;
import k.y2;
import k.z2;
import p0.d0;
import p0.p0;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final y2 W = new y2("thumbPos", 0, Float.class);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int[] f359a0 = {R.attr.state_checked};
    public float A;
    public float B;
    public final VelocityTracker C;
    public final int D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final TextPaint N;
    public final ColorStateList O;
    public StaticLayout P;
    public StaticLayout Q;
    public final h.a R;
    public ObjectAnimator S;
    public x T;
    public h U;
    public final Rect V;
    public Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f366m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f368p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f369q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f370r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f371s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f372t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f373u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f374v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f376x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f377y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f378z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, co.median.android.eeqadjy.R.attr.switchStyle);
        this.f360g = null;
        this.f361h = null;
        this.f362i = false;
        this.f363j = false;
        this.f365l = null;
        this.f366m = null;
        this.n = false;
        this.f367o = false;
        this.C = VelocityTracker.obtain();
        this.M = true;
        this.V = new Rect();
        z2.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.N = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = d.a.f1652x;
        t tVarS = t.s(co.median.android.eeqadjy.R.attr.switchStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        p0.l(this, context, iArr, attributeSet, typedArray, co.median.android.eeqadjy.R.attr.switchStyle);
        Drawable drawableI = tVarS.i(2);
        this.f = drawableI;
        if (drawableI != null) {
            drawableI.setCallback(this);
        }
        Drawable drawableI2 = tVarS.i(11);
        this.f364k = drawableI2;
        if (drawableI2 != null) {
            drawableI2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f376x = typedArray.getBoolean(3, true);
        this.f368p = typedArray.getDimensionPixelSize(8, 0);
        this.f369q = typedArray.getDimensionPixelSize(5, 0);
        this.f370r = typedArray.getDimensionPixelSize(6, 0);
        this.f371s = typedArray.getBoolean(4, false);
        ColorStateList colorStateListH = tVarS.h(9);
        if (colorStateListH != null) {
            this.f360g = colorStateListH;
            this.f362i = true;
        }
        PorterDuff.Mode modeC = j1.c(typedArray.getInt(10, -1), null);
        if (this.f361h != modeC) {
            this.f361h = modeC;
            this.f363j = true;
        }
        if (this.f362i || this.f363j) {
            a();
        }
        ColorStateList colorStateListH2 = tVarS.h(12);
        if (colorStateListH2 != null) {
            this.f365l = colorStateListH2;
            this.n = true;
        }
        PorterDuff.Mode modeC2 = j1.c(typedArray.getInt(13, -1), null);
        if (this.f366m != modeC2) {
            this.f366m = modeC2;
            this.f367o = true;
        }
        if (this.n || this.f367o) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, d.a.f1653y);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = c0.c.getColorStateList(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.O = colorStateList;
            } else {
                this.O = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i4 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i5 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i4 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i4 != 2) {
                typeface = i4 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i5 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i5) : Typeface.create(typeface, i5);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i6 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i5;
                textPaint.setFakeBoldText((i6 & 1) != 0);
                textPaint.setTextSkewX((2 & i6) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                h.a aVar = new h.a();
                aVar.f = context2.getResources().getConfiguration().locale;
                this.R = aVar;
            } else {
                this.R = null;
            }
            setTextOnInternal(this.f372t);
            setTextOffInternal(this.f374v);
            typedArrayObtainStyledAttributes.recycle();
        }
        new u0(this).f(attributeSet, co.median.android.eeqadjy.R.attr.switchStyle);
        tVarS.v();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f378z = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, co.median.android.eeqadjy.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private x getEmojiTextViewHelper() {
        if (this.T == null) {
            this.T = new x(this);
        }
        return this.T;
    }

    private boolean getTargetCheckedState() {
        return this.E > 0.5f;
    }

    private int getThumbOffset() {
        boolean z4 = p3.f2612a;
        int layoutDirection = getLayoutDirection();
        float f = this.E;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f364k;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.V;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f;
        Rect rectB = drawable2 != null ? j1.b(drawable2) : j1.f2550c;
        return ((((this.F - this.H) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f374v = charSequence;
        TransformationMethod transformationMethodT0 = ((h0) getEmojiTextViewHelper().f2680b.f84g).t0(this.R);
        if (transformationMethodT0 != null) {
            charSequence = transformationMethodT0.getTransformation(charSequence, this);
        }
        this.f375w = charSequence;
        this.Q = null;
        if (this.f376x) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f372t = charSequence;
        TransformationMethod transformationMethodT0 = ((h0) getEmojiTextViewHelper().f2680b.f84g).t0(this.R);
        if (transformationMethodT0 != null) {
            charSequence = transformationMethodT0.getTransformation(charSequence, this);
        }
        this.f373u = charSequence;
        this.P = null;
        if (this.f376x) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.f362i || this.f363j) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.f362i) {
                    drawableMutate.setTintList(this.f360g);
                }
                if (this.f363j) {
                    this.f.setTintMode(this.f361h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f364k;
        if (drawable != null) {
            if (this.n || this.f367o) {
                Drawable drawableMutate = drawable.mutate();
                this.f364k = drawableMutate;
                if (this.n) {
                    drawableMutate.setTintList(this.f365l);
                }
                if (this.f367o) {
                    this.f364k.setTintMode(this.f366m);
                }
                if (this.f364k.isStateful()) {
                    this.f364k.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f372t);
        setTextOffInternal(this.f374v);
        requestLayout();
    }

    public final void d() {
        if (this.U == null && ((h0) this.T.f2680b.f84g).I() && k.f554k != null) {
            k kVarA = k.a();
            int iB = kVarA.b();
            if (iB == 3 || iB == 0) {
                h hVar = new h(this);
                this.U = hVar;
                kVarA.f(hVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        int i5;
        int i6 = this.I;
        int i7 = this.J;
        int i8 = this.K;
        int i9 = this.L;
        int thumbOffset = getThumbOffset() + i6;
        Drawable drawable = this.f;
        Rect rectB = drawable != null ? j1.b(drawable) : j1.f2550c;
        Drawable drawable2 = this.f364k;
        Rect rect = this.V;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i10 = rect.left;
            thumbOffset += i10;
            if (rectB != null) {
                int i11 = rectB.left;
                if (i11 > i10) {
                    i6 += i11 - i10;
                }
                int i12 = rectB.top;
                int i13 = rect.top;
                i4 = i12 > i13 ? (i12 - i13) + i7 : i7;
                int i14 = rectB.right;
                int i15 = rect.right;
                if (i14 > i15) {
                    i8 -= i14 - i15;
                }
                int i16 = rectB.bottom;
                int i17 = rect.bottom;
                if (i16 > i17) {
                    i5 = i9 - (i16 - i17);
                }
                this.f364k.setBounds(i6, i4, i8, i5);
            } else {
                i4 = i7;
            }
            i5 = i9;
            this.f364k.setBounds(i6, i4, i8, i5);
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i18 = thumbOffset - rect.left;
            int i19 = thumbOffset + this.H + rect.right;
            this.f.setBounds(i18, i7, i19, i9);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i18, i7, i19, i9);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f4) {
        super.drawableHotspotChanged(f, f4);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setHotspot(f, f4);
        }
        Drawable drawable2 = this.f364k;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f4);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f364k;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z4 = p3.f2612a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f370r : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z4 = p3.f2612a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f370r : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h0.r0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f376x;
    }

    public boolean getSplitTrack() {
        return this.f371s;
    }

    public int getSwitchMinWidth() {
        return this.f369q;
    }

    public int getSwitchPadding() {
        return this.f370r;
    }

    public CharSequence getTextOff() {
        return this.f374v;
    }

    public CharSequence getTextOn() {
        return this.f372t;
    }

    public Drawable getThumbDrawable() {
        return this.f;
    }

    public final float getThumbPosition() {
        return this.E;
    }

    public int getThumbTextPadding() {
        return this.f368p;
    }

    public ColorStateList getThumbTintList() {
        return this.f360g;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f361h;
    }

    public Drawable getTrackDrawable() {
        return this.f364k;
    }

    public ColorStateList getTrackTintList() {
        return this.f365l;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f366m;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f364k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.S;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.S.end();
        this.S = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f359a0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f364k;
        Rect rect = this.V;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i4 = this.J;
        int i5 = this.L;
        int i6 = i4 + rect.top;
        int i7 = i5 - rect.bottom;
        Drawable drawable2 = this.f;
        if (drawable != null) {
            if (!this.f371s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = j1.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.P : this.Q;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.N;
            ColorStateList colorStateList = this.O;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i6 + i7) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f372t : this.f374v;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z4, i4, i5, i6, i7);
        int iMax2 = 0;
        if (this.f != null) {
            Drawable drawable = this.f364k;
            Rect rect = this.V;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = j1.b(this.f);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z5 = p3.f2612a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.F + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.F) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i8 = this.G;
            int i9 = height2 - (i8 / 2);
            height = i8 + i9;
            paddingTop = i9;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.G + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.G;
        }
        this.I = paddingLeft;
        this.J = paddingTop;
        this.L = height;
        this.K = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.f376x) {
            StaticLayout staticLayout = this.P;
            TextPaint textPaint = this.N;
            if (staticLayout == null) {
                CharSequence charSequence = this.f373u;
                this.P = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.Q == null) {
                CharSequence charSequence2 = this.f375w;
                this.Q = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f;
        Rect rect = this.V;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f376x) {
            iMax = (this.f368p * 2) + Math.max(this.P.getWidth(), this.Q.getWidth());
        } else {
            iMax = 0;
        }
        this.H = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f364k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f364k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            Rect rectB = j1.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        boolean z4 = this.M;
        int iMax4 = this.f369q;
        if (z4) {
            iMax4 = Math.max(iMax4, (this.H * 2) + iMax2 + iMax3);
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.F = iMax4;
        this.G = iMax5;
        super.onMeasure(i4, i5);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f372t : this.f374v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.C;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i4 = this.f378z;
        if (actionMasked != 0) {
            float f4 = 0.0f;
            if (actionMasked == 1) {
                if (this.f377y == 2) {
                    this.f377y = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    zIsChecked = isChecked();
                    if (z4) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.D) {
                            boolean z5 = p3.f2612a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f377y = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i5 = this.f377y;
                if (i5 == 1) {
                    float x4 = motionEvent.getX();
                    float y4 = motionEvent.getY();
                    float f5 = i4;
                    if (Math.abs(x4 - this.A) > f5 || Math.abs(y4 - this.B) > f5) {
                        this.f377y = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.A = x4;
                        this.B = y4;
                        return true;
                    }
                } else if (i5 == 2) {
                    float x5 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f6 = x5 - this.A;
                    if (thumbScrollRange != 0) {
                        f = f6 / thumbScrollRange;
                    } else {
                        f = f6 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z6 = p3.f2612a;
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f7 = this.E;
                    float f8 = f + f7;
                    if (f8 >= 0.0f) {
                        f4 = f8 > 1.0f ? 1.0f : f8;
                    }
                    if (f4 != f7) {
                        this.A = x5;
                        setThumbPosition(f4);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f377y == 2) {
                    this.f377y = 0;
                    if (motionEvent.getAction() == 1) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    zIsChecked = isChecked();
                    if (z4) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.D) {
                            boolean z7 = p3.f2612a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f377y = 0;
                velocityTracker.clear();
            }
        } else {
            float x6 = motionEvent.getX();
            float y5 = motionEvent.getY();
            if (isEnabled() && this.f != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f;
                Rect rect = this.V;
                drawable.getPadding(rect);
                int i6 = this.J - i4;
                int i7 = (this.I + thumbOffset) - i4;
                int i8 = this.H + i7 + rect.left + rect.right + i4;
                int i9 = this.L + i4;
                if (x6 > i7 && x6 < i8 && y5 > i6 && y5 < i9) {
                    this.f377y = 1;
                    this.A = x6;
                    this.B = y5;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        super.setChecked(z4);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f372t;
                if (string == null) {
                    string = getResources().getString(co.median.android.eeqadjy.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = p0.f3233a;
                new d0(co.median.android.eeqadjy.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f374v;
            if (string2 == null) {
                string2 = getResources().getString(co.median.android.eeqadjy.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = p0.f3233a;
            new d0(co.median.android.eeqadjy.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.S;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, W, zIsChecked ? 1.0f : 0.0f);
        this.S = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.S.setAutoCancel(true);
        this.S.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h0.s0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().d(z4);
        setTextOnInternal(this.f372t);
        setTextOffInternal(this.f374v);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z4) {
        this.M = z4;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z4) {
        if (this.f376x != z4) {
            this.f376x = z4;
            requestLayout();
            if (z4) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z4) {
        this.f371s = z4;
        invalidate();
    }

    public void setSwitchMinWidth(int i4) {
        this.f369q = i4;
        requestLayout();
    }

    public void setSwitchPadding(int i4) {
        this.f370r = i4;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.N;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f374v;
        if (string == null) {
            string = getResources().getString(co.median.android.eeqadjy.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = p0.f3233a;
        new d0(co.median.android.eeqadjy.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f372t;
        if (string == null) {
            string = getResources().getString(co.median.android.eeqadjy.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = p0.f3233a;
        new d0(co.median.android.eeqadjy.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.E = f;
        invalidate();
    }

    public void setThumbResource(int i4) {
        setThumbDrawable(h0.w(getContext(), i4));
    }

    public void setThumbTextPadding(int i4) {
        this.f368p = i4;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f360g = colorStateList;
        this.f362i = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f361h = mode;
        this.f363j = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f364k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f364k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i4) {
        setTrackDrawable(h0.w(getContext(), i4));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f365l = colorStateList;
        this.n = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f366m = mode;
        this.f367o = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f || drawable == this.f364k;
    }
}
