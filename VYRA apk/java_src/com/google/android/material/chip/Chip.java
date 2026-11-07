package com.google.android.material.chip;

import a3.b0;
import a3.o;
import a3.z;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.material.focus.FocusRingDrawable;
import e.k0;
import f3.a;
import java.lang.ref.WeakReference;
import java.util.Locale;
import k.q;
import l2.b;
import l2.c;
import l2.d;
import n0.f;
import p0.p0;
import r2.a0;
import r2.e;
import r2.x;
import t1.l;
import t2.i;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends q implements z, Checkable {
    public static final Rect B = new Rect();
    public static final int[] C = {R.attr.state_selected};
    public static final int[] D = {R.attr.state_checkable};
    public final b A;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f1385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InsetDrawable f1386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RippleDrawable f1387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View.OnClickListener f1388m;
    public CompoundButton.OnCheckedChangeListener n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1394t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1395u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f1396v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f1397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1398x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f1399y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f1400z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a.b(context, attributeSet, co.median.android.eeqadjy.R.attr.chipStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, co.median.android.eeqadjy.R.attr.chipStyle);
        this.f1399y = new Rect();
        this.f1400z = new RectF();
        this.A = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                androidx.fragment.app.q.t("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                androidx.fragment.app.q.t("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                androidx.fragment.app.q.t("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                androidx.fragment.app.q.t("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                androidx.fragment.app.q.t("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        d dVar = new d(context2, attributeSet);
        Context context3 = dVar.f3033t0;
        int[] iArr = a2.a.f17h;
        TypedArray typedArrayF = a0.f(context3, attributeSet, iArr, co.median.android.eeqadjy.R.attr.chipStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        dVar.T0 = typedArrayF.hasValue(39);
        Context context4 = dVar.f3033t0;
        ColorStateList colorStateListH = i.h(context4, typedArrayF, 25);
        if (dVar.M != colorStateListH) {
            dVar.M = colorStateListH;
            dVar.onStateChange(dVar.getState());
        }
        ColorStateList colorStateListH2 = i.h(context4, typedArrayF, 12);
        if (dVar.N != colorStateListH2) {
            dVar.N = colorStateListH2;
            dVar.onStateChange(dVar.getState());
        }
        float dimension = typedArrayF.getDimension(20, 0.0f);
        if (dVar.O != dimension) {
            dVar.O = dimension;
            dVar.invalidateSelf();
            dVar.E();
        }
        if (typedArrayF.hasValue(13)) {
            dVar.K(typedArrayF.getDimension(13, 0.0f));
        }
        dVar.P(i.h(context4, typedArrayF, 23));
        dVar.Q(typedArrayF.getDimension(24, 0.0f));
        dVar.a0(i.h(context4, typedArrayF, 38));
        String text = typedArrayF.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(dVar.T, text);
        x xVar = dVar.f3038z0;
        if (!zEquals) {
            dVar.T = text;
            xVar.f3603e = true;
            dVar.invalidateSelf();
            dVar.E();
        }
        x2.d dVar2 = (!typedArrayF.hasValue(0) || (resourceId3 = typedArrayF.getResourceId(0, 0)) == 0) ? null : new x2.d(context4, resourceId3);
        dVar2.f4742l = typedArrayF.getDimension(1, dVar2.f4742l);
        int i4 = typedArrayF.hasValue(34) ? 34 : 7;
        if (typedArrayF.hasValue(i4)) {
            dVar2.f4734c = typedArrayF.getString(i4);
        }
        xVar.b(dVar2, context4);
        int i5 = typedArrayF.getInt(3, 0);
        if (i5 == 1) {
            dVar.Q0 = TextUtils.TruncateAt.START;
        } else if (i5 == 2) {
            dVar.Q0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i5 == 3) {
            dVar.Q0 = TextUtils.TruncateAt.END;
        }
        dVar.O(typedArrayF.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            dVar.O(typedArrayF.getBoolean(16, false));
        }
        dVar.L(i.m(context4, typedArrayF, 15));
        if (typedArrayF.hasValue(18)) {
            dVar.N(i.h(context4, typedArrayF, 18));
        }
        dVar.M(typedArrayF.getDimension(17, -1.0f));
        dVar.X(typedArrayF.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            dVar.X(typedArrayF.getBoolean(27, false));
        }
        dVar.R(i.m(context4, typedArrayF, 26));
        dVar.W(i.h(context4, typedArrayF, 31));
        dVar.T(typedArrayF.getDimension(29, 0.0f));
        dVar.G(typedArrayF.getBoolean(6, false));
        dVar.J(typedArrayF.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            dVar.J(typedArrayF.getBoolean(9, false));
        }
        dVar.H(i.m(context4, typedArrayF, 8));
        if (typedArrayF.hasValue(10)) {
            dVar.I(i.h(context4, typedArrayF, 10));
        }
        dVar.j0 = (!typedArrayF.hasValue(41) || (resourceId2 = typedArrayF.getResourceId(41, 0)) == 0) ? null : b2.c.a(context4, resourceId2);
        dVar.f3024k0 = (!typedArrayF.hasValue(35) || (resourceId = typedArrayF.getResourceId(35, 0)) == 0) ? null : b2.c.a(context4, resourceId);
        float dimension2 = typedArrayF.getDimension(22, 0.0f);
        if (dVar.f3025l0 != dimension2) {
            dVar.f3025l0 = dimension2;
            dVar.invalidateSelf();
            dVar.E();
        }
        dVar.Z(typedArrayF.getDimension(37, 0.0f));
        dVar.Y(typedArrayF.getDimension(36, 0.0f));
        float dimension3 = typedArrayF.getDimension(43, 0.0f);
        if (dVar.f3028o0 != dimension3) {
            dVar.f3028o0 = dimension3;
            dVar.invalidateSelf();
            dVar.E();
        }
        float dimension4 = typedArrayF.getDimension(42, 0.0f);
        if (dVar.f3029p0 != dimension4) {
            dVar.f3029p0 = dimension4;
            dVar.invalidateSelf();
            dVar.E();
        }
        dVar.U(typedArrayF.getDimension(30, 0.0f));
        dVar.S(typedArrayF.getDimension(28, 0.0f));
        float dimension5 = typedArrayF.getDimension(14, 0.0f);
        if (dVar.f3032s0 != dimension5) {
            dVar.f3032s0 = dimension5;
            dVar.invalidateSelf();
            dVar.E();
        }
        dVar.S0 = typedArrayF.getDimensionPixelSize(4, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        typedArrayF.recycle();
        a0.a(context2, attributeSet, co.median.android.eeqadjy.R.attr.chipStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_Chip_Action);
        a0.b(context2, attributeSet, iArr, co.median.android.eeqadjy.R.attr.chipStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, co.median.android.eeqadjy.R.attr.chipStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1393s = typedArrayObtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue typedValueP = l.p(theme, co.median.android.eeqadjy.R.attr.minTouchTargetSize);
        float dimension6 = (typedValueP == null || typedValueP.type != 5) ? Float.NaN : typedValueP.getDimension(theme.getResources().getDisplayMetrics());
        this.f1395u = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(21, (int) (Float.isNaN(dimension6) ? context2.getResources().getDimension(co.median.android.eeqadjy.R.dimen.mtrl_min_touch_target_size) : dimension6)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(dVar);
        dVar.q(getElevation());
        a0.a(context2, attributeSet, co.median.android.eeqadjy.R.attr.chipStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_Chip_Action);
        a0.b(context2, attributeSet, iArr, co.median.android.eeqadjy.R.attr.chipStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, co.median.android.eeqadjy.R.attr.chipStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(39);
        typedArrayObtainStyledAttributes2.recycle();
        this.f1397w = new c(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new b0(2, this));
        }
        setChecked(this.f1389o);
        setText(dVar.T);
        setEllipsize(dVar.Q0);
        g();
        if (!this.f1385j.R0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f1393s) {
            setMinHeight(this.f1395u);
        }
        this.f1394t = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l2.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f3013a.n;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z4);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f1400z;
        rectF.setEmpty();
        if (c() && this.f1388m != null) {
            d dVar = this.f1385j;
            Rect bounds = dVar.getBounds();
            rectF.setEmpty();
            if (dVar.d0()) {
                float f = dVar.f3032s0 + dVar.f3031r0 + dVar.d0 + dVar.f3030q0 + dVar.f3029p0;
                if (dVar.getLayoutDirection() == 0) {
                    float f4 = bounds.right;
                    rectF.right = f4;
                    rectF.left = f4 - f;
                } else {
                    float f5 = bounds.left;
                    rectF.left = f5;
                    rectF.right = f5 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i4 = (int) closeIconTouchBounds.left;
        int i5 = (int) closeIconTouchBounds.top;
        int i6 = (int) closeIconTouchBounds.right;
        int i7 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f1399y;
        rect.set(i4, i5, i6, i7);
        return rect;
    }

    private x2.d getTextAppearance() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3038z0.f3604g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z4) {
        if (this.f1391q != z4) {
            this.f1391q = z4;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z4) {
        if (this.f1390p != z4) {
            this.f1390p = z4;
            refreshDrawableState();
        }
    }

    public final void b(int i4) {
        this.f1395u = i4;
        if (!this.f1393s) {
            InsetDrawable insetDrawable = this.f1386k;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1386k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i4 - ((int) this.f1385j.O));
        int iMax2 = Math.max(0, i4 - this.f1385j.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f1386k;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1386k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i5 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i6 = iMax > 0 ? iMax / 2 : 0;
        if (this.f1386k != null) {
            Rect rect = new Rect();
            this.f1386k.getPadding(rect);
            if (rect.top == i6 && rect.bottom == i6 && rect.left == i5 && rect.right == i5) {
                e();
                return;
            }
        }
        if (getMinHeight() != i4) {
            setMinHeight(i4);
        }
        if (getMinWidth() != i4) {
            setMinWidth(i4);
        }
        this.f1386k = new InsetDrawable((Drawable) this.f1385j, i5, i6, i5, i6);
        e();
    }

    public final boolean c() {
        d dVar = this.f1385j;
        if (dVar == null) {
            return false;
        }
        Drawable drawable = dVar.f3017a0;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public final void d() {
        d dVar;
        if (!c() || (dVar = this.f1385j) == null || !dVar.Z || this.f1388m == null) {
            p0.m(this, null);
            this.f1398x = false;
        } else {
            p0.m(this, this.f1397w);
            this.f1398x = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i4;
        if (!this.f1398x) {
            return super.dispatchHoverEvent(motionEvent);
        }
        c cVar = this.f1397w;
        AccessibilityManager accessibilityManager = cVar.f4416h;
        int i5 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x4 = motionEvent.getX();
                float y4 = motionEvent.getY();
                Chip chip = cVar.f3016q;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x4, y4)) {
                    i5 = 1;
                }
                int i6 = cVar.f4421m;
                if (i6 != i5) {
                    cVar.f4421m = i5;
                    cVar.r(i5, 128);
                    cVar.r(i6, 256);
                    return true;
                }
            } else if (action == 10 && (i4 = cVar.f4421m) != Integer.MIN_VALUE) {
                if (i4 != Integer.MIN_VALUE) {
                    cVar.f4421m = Integer.MIN_VALUE;
                    cVar.r(Integer.MIN_VALUE, 128);
                    cVar.r(i4, 256);
                    return true;
                }
            } else if (super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i4;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.f1398x) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c cVar = this.f1397w;
        cVar.getClass();
        boolean zM = false;
        int i5 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i6 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i6 = 33;
                                } else if (keyCode == 21) {
                                    i6 = 17;
                                } else if (keyCode != 22) {
                                    i6 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z4 = false;
                                while (i5 < repeatCount && cVar.m(i6, null)) {
                                    i5++;
                                    z4 = true;
                                }
                                zM = z4;
                            }
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i4 = cVar.f4420l;
                                if (i4 != Integer.MIN_VALUE) {
                                    chip = cVar.f3016q;
                                    if (i4 == 0) {
                                        chip.performClick();
                                    } else if (i4 == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.f1388m;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.f1398x) {
                                            chip.f1397w.r(1, 1);
                                        }
                                    }
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i4 = cVar.f4420l;
                    if (i4 != Integer.MIN_VALUE) {
                        chip = cVar.f3016q;
                        if (i4 == 0) {
                            chip.performClick();
                        } else if (i4 == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.f1388m;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1398x) {
                                chip.f1397w.r(1, 1);
                            }
                        }
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = cVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = cVar.m(1, null);
            }
        }
        if (!zM || cVar.f4420l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // k.q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i4;
        super.drawableStateChanged();
        d dVar = this.f1385j;
        boolean zV = false;
        int i5 = 0;
        zV = false;
        if (dVar != null && d.D(dVar.f3017a0)) {
            d dVar2 = this.f1385j;
            ?? IsEnabled = isEnabled();
            if (this.f1392r) {
                i4 = IsEnabled;
                i4 = IsEnabled + 1;
            }
            i4 = IsEnabled;
            int i6 = i4;
            if (this.f1391q) {
                i6 = i4 + 1;
            }
            int i7 = i6;
            if (this.f1390p) {
                i7 = i6 + 1;
            }
            int i8 = i7;
            if (isChecked()) {
                i8 = i7 + 1;
            }
            int[] iArr = new int[i8];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i5 = 1;
            }
            if (this.f1392r) {
                iArr[i5] = 16842908;
                i5++;
            }
            if (this.f1391q) {
                iArr[i5] = 16843623;
                i5++;
            }
            if (this.f1390p) {
                iArr[i5] = 16842919;
                i5++;
            }
            if (isChecked()) {
                iArr[i5] = 16842913;
            }
            zV = dVar2.V(iArr);
        }
        if (zV) {
            invalidate();
        }
    }

    public final void e() {
        RippleDrawable rippleDrawable = new RippleDrawable(y2.a.b(this.f1385j.S), getBackgroundDrawable(), null);
        FocusRingDrawable.e(getContext(), rippleDrawable, this.f1385j);
        this.f1387l = rippleDrawable;
        this.f1385j.getClass();
        setBackground(this.f1387l);
        f();
    }

    public final void f() {
        d dVar;
        if (TextUtils.isEmpty(getText()) || (dVar = this.f1385j) == null) {
            return;
        }
        int iA = (int) (dVar.A() + dVar.f3032s0 + dVar.f3029p0);
        d dVar2 = this.f1385j;
        int iZ = (int) (dVar2.z() + dVar2.f3025l0 + dVar2.f3028o0);
        if (this.f1386k != null) {
            Rect rect = new Rect();
            this.f1386k.getPadding(rect);
            iZ += rect.left;
            iA += rect.right;
        }
        setPaddingRelative(iZ, getPaddingTop(), iA, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        d dVar = this.f1385j;
        if (dVar != null) {
            paint.drawableState = dVar.getState();
        }
        x2.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.A);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1396v)) {
            return this.f1396v;
        }
        d dVar = this.f1385j;
        if (dVar == null || !dVar.f3021f0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1386k;
        return insetDrawable == null ? this.f1385j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3022h0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3023i0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.N;
        }
        return null;
    }

    public float getChipCornerRadius() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return Math.max(0.0f, dVar.B());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1385j;
    }

    public float getChipEndPadding() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3032s0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        d dVar = this.f1385j;
        if (dVar == null || (drawable = dVar.V) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.W;
        }
        return null;
    }

    public float getChipMinHeight() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.O;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3025l0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.Q;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.R;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        d dVar = this.f1385j;
        if (dVar == null || (drawable = dVar.f3017a0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3020e0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3031r0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.d0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3030q0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3019c0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.Q0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1398x) {
            c cVar = this.f1397w;
            if (cVar.f4420l == 1 || cVar.f4419k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        d dVar = this.f1385j;
        if (dVar == null) {
            return super.getFontVariationSettings();
        }
        x2.d dVar2 = dVar.f3038z0.f3604g;
        if (dVar2 != null) {
            return dVar2.f4734c;
        }
        return null;
    }

    public b2.c getHideMotionSpec() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3024k0;
        }
        return null;
    }

    public float getIconEndPadding() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3027n0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3026m0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.S;
        }
        return null;
    }

    public o getShapeAppearanceModel() {
        return this.f1385j.j();
    }

    public b2.c getShowMotionSpec() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.j0;
        }
        return null;
    }

    public float getTextEndPadding() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3029p0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        d dVar = this.f1385j;
        if (dVar != null) {
            return dVar.f3028o0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h0.i0(this, this.f1385j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        d dVar = this.f1385j;
        if (dVar != null && dVar.f3021f0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i4, Rect rect) {
        super.onFocusChanged(z4, i4, rect);
        if (this.f1398x) {
            c cVar = this.f1397w;
            int i5 = cVar.f4420l;
            if (i5 != Integer.MIN_VALUE) {
                cVar.j(i5);
            }
            if (z4) {
                cVar.m(i4, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        d dVar = this.f1385j;
        accessibilityNodeInfo.setCheckable(dVar != null && dVar.f3021f0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i4) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        if (this.f1394t != i4) {
            this.f1394t = i4;
            f();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f1390p) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z4 = true;
                }
                z4 = false;
            } else {
                if (this.f1390p) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f1388m;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f1398x) {
                        this.f1397w.r(1, 1);
                    }
                    z4 = true;
                }
                setCloseIconPressed(false);
            }
            z4 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z4 = true;
        } else {
            z4 = false;
        }
        return z4 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f1396v = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1387l) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // k.q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1387l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // k.q, android.view.View
    public void setBackgroundResource(int i4) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.G(z4);
        }
    }

    public void setCheckableResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.G(dVar.f3033t0.getResources().getBoolean(i4));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        d dVar = this.f1385j;
        if (dVar == null) {
            this.f1389o = z4;
        } else if (dVar.f3021f0) {
            super.setChecked(z4);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.H(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z4) {
        setCheckedIconVisible(z4);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i4) {
        setCheckedIconVisible(i4);
    }

    public void setCheckedIconResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.H(h0.w(dVar.f3033t0, i4));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.I(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.I(c0.c.getColorStateList(dVar.f3033t0, i4));
        }
    }

    public void setCheckedIconVisible(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.J(dVar.f3033t0.getResources().getBoolean(i4));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        d dVar = this.f1385j;
        if (dVar == null || dVar.N == colorStateList) {
            return;
        }
        dVar.N = colorStateList;
        dVar.onStateChange(dVar.getState());
    }

    public void setChipBackgroundColorResource(int i4) {
        ColorStateList colorStateList;
        d dVar = this.f1385j;
        if (dVar == null || dVar.N == (colorStateList = c0.c.getColorStateList(dVar.f3033t0, i4))) {
            return;
        }
        dVar.N = colorStateList;
        dVar.onStateChange(dVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.K(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.K(dVar.f3033t0.getResources().getDimension(i4));
        }
    }

    public void setChipDrawable(d dVar) {
        d dVar2 = this.f1385j;
        if (dVar2 != dVar) {
            if (dVar2 != null) {
                dVar2.P0 = new WeakReference(null);
            }
            this.f1385j = dVar;
            dVar.R0 = false;
            dVar.P0 = new WeakReference(this);
            b(this.f1395u);
        }
    }

    public void setChipEndPadding(float f) {
        d dVar = this.f1385j;
        if (dVar == null || dVar.f3032s0 == f) {
            return;
        }
        dVar.f3032s0 = f;
        dVar.invalidateSelf();
        dVar.E();
    }

    public void setChipEndPaddingResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            float dimension = dVar.f3033t0.getResources().getDimension(i4);
            if (dVar.f3032s0 != dimension) {
                dVar.f3032s0 = dimension;
                dVar.invalidateSelf();
                dVar.E();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.L(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z4) {
        setChipIconVisible(z4);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i4) {
        setChipIconVisible(i4);
    }

    public void setChipIconResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.L(h0.w(dVar.f3033t0, i4));
        }
    }

    public void setChipIconSize(float f) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.M(f);
        }
    }

    public void setChipIconSizeResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.M(dVar.f3033t0.getResources().getDimension(i4));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.N(colorStateList);
        }
    }

    public void setChipIconTintResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.N(c0.c.getColorStateList(dVar.f3033t0, i4));
        }
    }

    public void setChipIconVisible(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.O(dVar.f3033t0.getResources().getBoolean(i4));
        }
    }

    public void setChipMinHeight(float f) {
        d dVar = this.f1385j;
        if (dVar == null || dVar.O == f) {
            return;
        }
        dVar.O = f;
        dVar.invalidateSelf();
        dVar.E();
    }

    public void setChipMinHeightResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            float dimension = dVar.f3033t0.getResources().getDimension(i4);
            if (dVar.O != dimension) {
                dVar.O = dimension;
                dVar.invalidateSelf();
                dVar.E();
            }
        }
    }

    public void setChipStartPadding(float f) {
        d dVar = this.f1385j;
        if (dVar == null || dVar.f3025l0 == f) {
            return;
        }
        dVar.f3025l0 = f;
        dVar.invalidateSelf();
        dVar.E();
    }

    public void setChipStartPaddingResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            float dimension = dVar.f3033t0.getResources().getDimension(i4);
            if (dVar.f3025l0 != dimension) {
                dVar.f3025l0 = dimension;
                dVar.invalidateSelf();
                dVar.E();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.P(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.P(c0.c.getColorStateList(dVar.f3033t0, i4));
        }
    }

    public void setChipStrokeWidth(float f) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.Q(f);
        }
    }

    public void setChipStrokeWidthResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.Q(dVar.f3033t0.getResources().getDimension(i4));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i4) {
        setText(getResources().getString(i4));
    }

    public void setCloseIcon(Drawable drawable) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.R(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        d dVar = this.f1385j;
        if (dVar == null || dVar.f3020e0 == charSequence) {
            return;
        }
        String str = n0.b.f3076b;
        n0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? n0.b.f3079e : n0.b.f3078d;
        bVar.getClass();
        k0 k0Var = f.f3086a;
        dVar.f3020e0 = bVar.c(charSequence);
        dVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z4) {
        setCloseIconVisible(z4);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i4) {
        setCloseIconVisible(i4);
    }

    public void setCloseIconEndPadding(float f) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.S(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.S(dVar.f3033t0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.R(h0.w(dVar.f3033t0, i4));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.T(f);
        }
    }

    public void setCloseIconSizeResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.T(dVar.f3033t0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconStartPadding(float f) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.U(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.U(dVar.f3033t0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.W(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.W(c0.c.getColorStateList(dVar.f3033t0, i4));
        }
    }

    public void setCloseIconVisible(int i4) {
        setCloseIconVisible(getResources().getBoolean(i4));
    }

    @Override // k.q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            androidx.fragment.app.q.t("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            androidx.fragment.app.q.t("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // k.q, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            androidx.fragment.app.q.t("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            androidx.fragment.app.q.t("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            androidx.fragment.app.q.t("Please set start drawable using R.attr#chipIcon.");
        } else if (i6 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i6, i7);
        } else {
            androidx.fragment.app.q.t("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            androidx.fragment.app.q.t("Please set start drawable using R.attr#chipIcon.");
        } else if (i6 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i4, i5, i6, i7);
        } else {
            androidx.fragment.app.q.t("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.q(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1385j == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            androidx.fragment.app.q.t("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.Q0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        this.f1393s = z4;
        b(this.f1395u);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        d dVar = this.f1385j;
        if (dVar == null) {
            return false;
        }
        x2.d dVar2 = dVar.f3038z0.f3604g;
        if (dVar2 != null) {
            dVar2.f4734c = str;
        }
        g();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i4) {
        if (i4 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i4);
        }
    }

    public void setHideMotionSpec(b2.c cVar) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.f3024k0 = cVar;
        }
    }

    public void setHideMotionSpecResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.f3024k0 = b2.c.a(dVar.f3033t0, i4);
        }
    }

    public void setIconEndPadding(float f) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.Y(f);
        }
    }

    public void setIconEndPaddingResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.Y(dVar.f3033t0.getResources().getDimension(i4));
        }
    }

    public void setIconStartPadding(float f) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.Z(f);
        }
    }

    public void setIconStartPaddingResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.Z(dVar.f3033t0.getResources().getDimension(i4));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i4) {
        if (this.f1385j == null) {
            return;
        }
        super.setLayoutDirection(i4);
    }

    @Override // android.widget.TextView
    public void setLines(int i4) {
        if (i4 <= 1) {
            super.setLines(i4);
        } else {
            androidx.fragment.app.q.t("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i4) {
        if (i4 <= 1) {
            super.setMaxLines(i4);
        } else {
            androidx.fragment.app.q.t("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i4) {
        super.setMaxWidth(i4);
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.S0 = i4;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i4) {
        if (i4 <= 1) {
            super.setMinLines(i4);
        } else {
            androidx.fragment.app.q.t("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1388m = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.a0(colorStateList);
        }
        this.f1385j.getClass();
        e();
    }

    public void setRippleColorResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.a0(c0.c.getColorStateList(dVar.f3033t0, i4));
            this.f1385j.getClass();
            e();
        }
    }

    @Override // a3.z
    public void setShapeAppearanceModel(o oVar) {
        this.f1385j.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(b2.c cVar) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.j0 = cVar;
        }
    }

    public void setShowMotionSpecResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.j0 = b2.c.a(dVar.f3033t0, i4);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z4) {
        if (z4) {
            super.setSingleLine(z4);
        } else {
            androidx.fragment.app.q.t("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        d dVar = this.f1385j;
        if (dVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(dVar.R0 ? null : charSequence, bufferType);
        d dVar2 = this.f1385j;
        if (dVar2 == null || TextUtils.equals(dVar2.T, charSequence)) {
            return;
        }
        dVar2.T = charSequence;
        dVar2.f3038z0.f3603e = true;
        dVar2.invalidateSelf();
        dVar2.E();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        d dVar = this.f1385j;
        if (dVar != null) {
            Context context2 = dVar.f3033t0;
            dVar.f3038z0.b(new x2.d(context2, i4), context2);
        }
        g();
    }

    public void setTextAppearanceResource(int i4) {
        setTextAppearance(getContext(), i4);
    }

    public void setTextEndPadding(float f) {
        d dVar = this.f1385j;
        if (dVar == null || dVar.f3029p0 == f) {
            return;
        }
        dVar.f3029p0 = f;
        dVar.invalidateSelf();
        dVar.E();
    }

    public void setTextEndPaddingResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            float dimension = dVar.f3033t0.getResources().getDimension(i4);
            if (dVar.f3029p0 != dimension) {
                dVar.f3029p0 = dimension;
                dVar.invalidateSelf();
                dVar.E();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f) {
        super.setTextSize(i4, f);
        d dVar = this.f1385j;
        if (dVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i4, f, getResources().getDisplayMetrics());
            x xVar = dVar.f3038z0;
            x2.d dVar2 = xVar.f3604g;
            if (dVar2 != null) {
                dVar2.f4742l = fApplyDimension;
                xVar.f3599a.setTextSize(fApplyDimension);
                dVar.a();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        d dVar = this.f1385j;
        if (dVar == null || dVar.f3028o0 == f) {
            return;
        }
        dVar.f3028o0 = f;
        dVar.invalidateSelf();
        dVar.E();
    }

    public void setTextStartPaddingResource(int i4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            float dimension = dVar.f3033t0.getResources().getDimension(i4);
            if (dVar.f3028o0 != dimension) {
                dVar.f3028o0 = dimension;
                dVar.invalidateSelf();
                dVar.E();
            }
        }
    }

    public void setCloseIconVisible(boolean z4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.X(z4);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.J(z4);
        }
    }

    public void setChipIconVisible(boolean z4) {
        d dVar = this.f1385j;
        if (dVar != null) {
            dVar.O(z4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            androidx.fragment.app.q.t("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            androidx.fragment.app.q.t("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            androidx.fragment.app.q.t("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            androidx.fragment.app.q.t("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(x2.d dVar) {
        d dVar2 = this.f1385j;
        if (dVar2 != null) {
            dVar2.f3038z0.b(dVar, dVar2.f3033t0);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i4) {
        super.setTextAppearance(i4);
        d dVar = this.f1385j;
        if (dVar != null) {
            Context context = dVar.f3033t0;
            dVar.f3038z0.b(new x2.d(context, i4), context);
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(e eVar) {
    }
}
