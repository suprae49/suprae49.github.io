package l2;

import a3.h;
import a3.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import r2.w;
import r2.x;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends j implements Drawable.Callback, w {
    public static final int[] U0 = {R.attr.state_enabled};
    public static final ShapeDrawable V0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public int H0;
    public int I0;
    public ColorFilter J0;
    public PorterDuffColorFilter K0;
    public ColorStateList L0;
    public ColorStateList M;
    public PorterDuff.Mode M0;
    public ColorStateList N;
    public int[] N0;
    public float O;
    public ColorStateList O0;
    public float P;
    public WeakReference P0;
    public ColorStateList Q;
    public TextUtils.TruncateAt Q0;
    public float R;
    public boolean R0;
    public ColorStateList S;
    public int S0;
    public CharSequence T;
    public boolean T0;
    public boolean U;
    public Drawable V;
    public ColorStateList W;
    public float X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Drawable f3017a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public RippleDrawable f3018b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ColorStateList f3019c0;
    public float d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SpannableStringBuilder f3020e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f3021f0;
    public boolean g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Drawable f3022h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ColorStateList f3023i0;
    public b2.c j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public b2.c f3024k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f3025l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f3026m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f3027n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f3028o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f3029p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f3030q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f3031r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f3032s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Context f3033t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Paint f3034u0;
    public final Paint.FontMetrics v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final RectF f3035w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final PointF f3036x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Path f3037y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final x f3038z0;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, co.median.android.eeqadjy.R.attr.chipStyle, co.median.android.eeqadjy.R.style.Widget_MaterialComponents_Chip_Action);
        this.P = -1.0f;
        this.f3034u0 = new Paint(1);
        this.v0 = new Paint.FontMetrics();
        this.f3035w0 = new RectF();
        this.f3036x0 = new PointF();
        this.f3037y0 = new Path();
        this.I0 = 255;
        this.M0 = PorterDuff.Mode.SRC_IN;
        this.P0 = new WeakReference(null);
        n(context);
        this.f3033t0 = context;
        x xVar = new x(this);
        this.f3038z0 = xVar;
        this.T = "";
        xVar.f3599a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = U0;
        setState(iArr);
        V(iArr);
        this.R0 = true;
        V0.setTint(-1);
    }

    public static boolean C(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean D(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void e0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        if (d0()) {
            return this.f3030q0 + this.d0 + this.f3031r0;
        }
        return 0.0f;
    }

    public final float B() {
        if (!this.T0) {
            return this.P;
        }
        float[] fArr = this.H;
        return fArr != null ? fArr[3] : this.f88g.f70a.c().f127e.a(h());
    }

    public final void E() {
        Chip chip = (Chip) this.P0.get();
        if (chip != null) {
            chip.b(chip.f1395u);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    public final boolean F(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z4;
        boolean z5;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.M;
        int iD = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.A0) : 0);
        boolean state = true;
        if (this.A0 != iD) {
            this.A0 = iD;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.N;
        int iD2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.B0) : 0);
        if (this.B0 != iD2) {
            this.B0 = iD2;
            zOnStateChange = true;
        }
        int iB = f0.b.b(iD2, iD);
        if ((this.C0 != iB) | (this.f88g.f72c == null)) {
            this.C0 = iB;
            r(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.Q;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.D0) : 0;
        if (this.D0 != colorForState2) {
            this.D0 = colorForState2;
            zOnStateChange = true;
        }
        if (this.O0 != null) {
            int[] iArr3 = y2.a.f4793a;
            boolean z6 = false;
            boolean z7 = false;
            for (int i4 : iArr) {
                if (i4 == 16842910) {
                    z6 = true;
                } else if (i4 == 16842908 || i4 == 16842919 || i4 == 16843623) {
                    z7 = true;
                }
            }
            if (z6 && z7) {
                colorForState = this.O0.getColorForState(iArr, this.E0);
            } else {
                colorForState = 0;
            }
        } else {
            colorForState = 0;
        }
        if (this.E0 != colorForState) {
            this.E0 = colorForState;
        }
        x2.d dVar = this.f3038z0.f3604g;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f4741k) == null) ? 0 : colorStateList.getColorForState(iArr, this.F0);
        if (this.F0 != colorForState3) {
            this.F0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z4 = false;
            break;
        }
        int length = state2.length;
        int i5 = 0;
        while (true) {
            if (i5 < length) {
                if (state2[i5] == 16842912) {
                    if (this.f3021f0) {
                        z4 = true;
                        break;
                    }
                } else {
                    i5++;
                }
            }
            z4 = false;
            break;
        }
        if (this.G0 == z4 || this.f3022h0 == null) {
            z5 = false;
        } else {
            float fZ = z();
            this.G0 = z4;
            if (fZ != z()) {
                zOnStateChange = true;
                z5 = true;
            } else {
                z5 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.L0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.H0) : 0;
        if (this.H0 != colorForState4) {
            this.H0 = colorForState4;
            ColorStateList colorStateList6 = this.L0;
            PorterDuff.Mode mode = this.M0;
            this.K0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (D(this.V)) {
            state |= this.V.setState(iArr);
        }
        if (D(this.f3022h0)) {
            state |= this.f3022h0.setState(iArr);
        }
        if (D(this.f3017a0)) {
            int[] iArr4 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
            state |= this.f3017a0.setState(iArr4);
        }
        if (D(this.f3018b0)) {
            state |= this.f3018b0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z5) {
            E();
        }
        return state;
    }

    public final void G(boolean z4) {
        if (this.f3021f0 != z4) {
            this.f3021f0 = z4;
            float fZ = z();
            if (!z4 && this.G0) {
                this.G0 = false;
            }
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void H(Drawable drawable) {
        if (this.f3022h0 != drawable) {
            float fZ = z();
            this.f3022h0 = drawable;
            float fZ2 = z();
            e0(this.f3022h0);
            x(this.f3022h0);
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f3023i0 != colorStateList) {
            this.f3023i0 = colorStateList;
            if (this.g0 && (drawable = this.f3022h0) != null && this.f3021f0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z4) {
        if (this.g0 != z4) {
            boolean zB0 = b0();
            this.g0 = z4;
            boolean zB1 = b0();
            if (zB0 != zB1) {
                Drawable drawable = this.f3022h0;
                if (zB1) {
                    x(drawable);
                } else {
                    e0(drawable);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void K(float f) {
        if (this.P != f) {
            this.P = f;
            setShapeAppearanceModel(j().a(f));
        }
    }

    public final void L(Drawable drawable) {
        Drawable drawable2 = this.V;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fZ = z();
            this.V = drawable != null ? drawable.mutate() : null;
            float fZ2 = z();
            e0(drawable2);
            if (c0()) {
                x(this.V);
            }
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void M(float f) {
        if (this.X != f) {
            float fZ = z();
            this.X = f;
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        this.Y = true;
        if (this.W != colorStateList) {
            this.W = colorStateList;
            if (c0()) {
                this.V.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z4) {
        if (this.U != z4) {
            boolean zC0 = c0();
            this.U = z4;
            boolean zC1 = c0();
            if (zC0 != zC1) {
                Drawable drawable = this.V;
                if (zC1) {
                    x(drawable);
                } else {
                    e0(drawable);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            if (this.T0) {
                h hVar = this.f88g;
                if (hVar.f73d != colorStateList) {
                    hVar.f73d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void Q(float f) {
        if (this.R != f) {
            this.R = f;
            this.f3034u0.setStrokeWidth(f);
            if (this.T0) {
                this.f88g.f78j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void R(Drawable drawable) {
        Drawable drawable2 = this.f3017a0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fA = A();
            this.f3017a0 = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(y2.a.b(this.S), this.f3017a0, V0);
            FocusRingDrawable.e(this.f3033t0, rippleDrawable, null);
            this.f3018b0 = rippleDrawable;
            float fA2 = A();
            e0(drawable2);
            if (d0()) {
                x(this.f3017a0);
            }
            invalidateSelf();
            if (fA != fA2) {
                E();
            }
        }
    }

    public final void S(float f) {
        if (this.f3031r0 != f) {
            this.f3031r0 = f;
            invalidateSelf();
            if (d0()) {
                E();
            }
        }
    }

    public final void T(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (d0()) {
                E();
            }
        }
    }

    public final void U(float f) {
        if (this.f3030q0 != f) {
            this.f3030q0 = f;
            invalidateSelf();
            if (d0()) {
                E();
            }
        }
    }

    public final boolean V(int[] iArr) {
        if (Arrays.equals(this.N0, iArr)) {
            return false;
        }
        this.N0 = iArr;
        if (d0()) {
            return F(getState(), iArr);
        }
        return false;
    }

    public final void W(ColorStateList colorStateList) {
        if (this.f3019c0 != colorStateList) {
            this.f3019c0 = colorStateList;
            if (d0()) {
                this.f3017a0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void X(boolean z4) {
        if (this.Z != z4) {
            boolean zD0 = d0();
            this.Z = z4;
            boolean zD1 = d0();
            if (zD0 != zD1) {
                Drawable drawable = this.f3017a0;
                if (zD1) {
                    x(drawable);
                } else {
                    e0(drawable);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void Y(float f) {
        if (this.f3027n0 != f) {
            float fZ = z();
            this.f3027n0 = f;
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void Z(float f) {
        if (this.f3026m0 != f) {
            float fZ = z();
            this.f3026m0 = f;
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    @Override // r2.w
    public final void a() {
        E();
        invalidateSelf();
    }

    public final void a0(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            this.O0 = null;
            onStateChange(getState());
        }
    }

    public final boolean b0() {
        return this.g0 && this.f3022h0 != null && this.G0;
    }

    public final boolean c0() {
        return this.U && this.V != null;
    }

    public final boolean d0() {
        return this.Z && this.f3017a0 != null;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v12 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v13 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: android.graphics.RectF
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: android.graphics.RectF
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v10 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 'this'  ??, new type: l2.d
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.RippleDrawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v55 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v55 ??, new type: android.graphics.drawable.Drawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v57 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v57 ??, new type: android.graphics.drawable.Drawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: android.graphics.Rect
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: android.graphics.Rect
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r22v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 'this'  ??, new type: l2.d
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.LayerDrawable
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // a3.j, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.d.draw(android.graphics.Canvas):void");
    }

    @Override // a3.j, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.I0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.J0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.O;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fZ = z() + this.f3025l0 + this.f3028o0;
        String string = this.T.toString();
        x xVar = this.f3038z0;
        if (xVar.f3603e) {
            xVar.a(string);
        }
        return Math.min(Math.round(A() + xVar.f3601c + fZ + this.f3029p0 + this.f3032s0), this.S0);
    }

    @Override // a3.j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // a3.j, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.T0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.O, this.P);
        } else {
            outline.setRoundRect(bounds, this.P);
            outline2 = outline;
        }
        outline2.setAlpha(this.I0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // a3.j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (C(this.M) || C(this.N) || C(this.Q)) {
            return true;
        }
        x2.d dVar = this.f3038z0.f3604g;
        if (dVar == null || (colorStateList = dVar.f4741k) == null || !colorStateList.isStateful()) {
            return (this.g0 && this.f3022h0 != null && this.f3021f0) || D(this.V) || D(this.f3022h0) || C(this.L0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i4) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i4);
        if (c0()) {
            zOnLayoutDirectionChanged |= this.V.setLayoutDirection(i4);
        }
        if (b0()) {
            zOnLayoutDirectionChanged |= this.f3022h0.setLayoutDirection(i4);
        }
        if (d0()) {
            zOnLayoutDirectionChanged |= this.f3017a0.setLayoutDirection(i4);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        boolean zOnLevelChange = super.onLevelChange(i4);
        if (c0()) {
            zOnLevelChange |= this.V.setLevel(i4);
        }
        if (b0()) {
            zOnLevelChange |= this.f3022h0.setLevel(i4);
        }
        if (d0()) {
            zOnLevelChange |= this.f3017a0.setLevel(i4);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // a3.j, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.T0) {
            super.onStateChange(iArr);
        }
        return F(iArr, this.N0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // a3.j, android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.I0 != i4) {
            this.I0 = i4;
            invalidateSelf();
        }
    }

    @Override // a3.j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.J0 != colorFilter) {
            this.J0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // a3.j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // a3.j, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.M0 != mode) {
            this.M0 = mode;
            ColorStateList colorStateList = this.L0;
            this.K0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        if (c0()) {
            visible |= this.V.setVisible(z4, z5);
        }
        if (b0()) {
            visible |= this.f3022h0.setVisible(z4, z5);
        }
        if (d0()) {
            visible |= this.f3017a0.setVisible(z4, z5);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f3017a0) {
            drawable.setTintList(this.f3019c0);
            if (drawable.isStateful()) {
                drawable.setState(this.N0);
                return;
            }
            return;
        }
        Drawable drawable2 = this.V;
        if (drawable == drawable2 && this.Y) {
            drawable2.setTintList(this.W);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void y(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (c0() || b0()) {
            float f = this.f3025l0 + this.f3026m0;
            Drawable drawable = this.G0 ? this.f3022h0 : this.V;
            float intrinsicWidth = this.X;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f4 = rect.left + f;
                rectF.left = f4;
                rectF.right = f4 + intrinsicWidth;
            } else {
                float f5 = rect.right - f;
                rectF.right = f5;
                rectF.left = f5 - intrinsicWidth;
            }
            Drawable drawable2 = this.G0 ? this.f3022h0 : this.V;
            float fCeil = this.X;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f3033t0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float z() {
        if (!c0() && !b0()) {
            return 0.0f;
        }
        float f = this.f3026m0;
        Drawable drawable = this.G0 ? this.f3022h0 : this.V;
        float intrinsicWidth = this.X;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f3027n0;
    }
}
