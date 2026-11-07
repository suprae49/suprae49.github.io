package r2;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3508a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f3509a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3510b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f3511b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f3512c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f3513c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f3514d;
    public CharSequence d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f3515e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f3523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f3524k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f3525k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f3527m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f3528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f3530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f3531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f3532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f3533t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f3534u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f3535v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f3536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f3537x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Typeface f3538y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public x2.a f3539z;
    public int f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3518g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3519h = 15.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3521i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f3516e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f3517f0 = 1;
    public final float g0 = 1.0f;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f3520h0 = 1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f3522i0 = -1;
    public int j0 = -1;

    public b(TextInputLayout textInputLayout) {
        this.f3508a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f3514d = new Rect();
        this.f3512c = new Rect();
        this.f3515e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i4, int i5, float f) {
        float f4 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i5) * f) + (Color.alpha(i4) * f4)), Math.round((Color.red(i5) * f) + (Color.red(i4) * f4)), Math.round((Color.green(i5) * f) + (Color.green(i4) * f4)), Math.round((Color.blue(i5) * f) + (Color.blue(i4) * f4)));
    }

    public static float h(float f, float f4, float f5, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f5);
        }
        return b2.a.a(f, f4, f5);
    }

    public final void b() {
        float f = this.f3510b;
        Rect rect = this.f3512c;
        float f4 = rect.left;
        Rect rect2 = this.f3514d;
        float fH = h(f4, rect2.left, f, this.Q);
        RectF rectF = this.f3515e;
        rectF.left = fH;
        rectF.top = h(this.f3527m, this.n, f, this.Q);
        rectF.right = h(rect.right, rect2.right, f, this.Q);
        rectF.bottom = h(rect.bottom, rect2.bottom, f, this.Q);
        this.f3530q = h(this.f3528o, this.f3529p, f, this.Q);
        this.f3531r = h(this.f3527m, this.n, f, this.Q);
        d(f, false);
        TextInputLayout textInputLayout = this.f3508a;
        textInputLayout.postInvalidateOnAnimation();
        float f5 = this.W;
        float f6 = this.X;
        TextPaint textPaint = this.O;
        if (f5 != f6) {
            textPaint.setLetterSpacing(h(f6, f5, f, b2.a.f1048b));
        } else {
            textPaint.setLetterSpacing(f5);
        }
        e1.a aVar = b2.a.f1048b;
        this.f3511b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f3513c0 = h(1.0f, 0.0f, f, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f3524k;
        ColorStateList colorStateList2 = this.f3523j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(g(colorStateList2), g(this.f3524k), f));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        this.H = b2.a.a(0.0f, this.S, f);
        this.I = b2.a.a(0.0f, this.T, f);
        this.J = b2.a.a(0.0f, this.U, f);
        int iA = a(0, g(this.V), f);
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z4 = this.f3508a.getLayoutDirection() == 1;
        if (this.E) {
            return (z4 ? n0.f.f3089d : n0.f.f3088c).c(charSequence, charSequence.length());
        }
        return z4;
    }

    public final void d(float f, boolean z4) {
        float f4;
        Typeface typeface;
        float f5;
        if (this.B == null) {
            return;
        }
        float fWidth = this.f3514d.width();
        float fWidth2 = this.f3512c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f4 = o() ? this.f3521i : this.f3519h;
            f5 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.f3519h, this.f3521i, f, this.R) / this.f3519h;
            if (!o()) {
                fWidth = fWidth2;
            }
            typeface = this.f3532s;
            fWidth2 = fWidth;
        } else {
            f4 = this.f3519h;
            float f6 = this.X;
            typeface = this.f3535v;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f3519h, this.f3521i, f, this.R) / this.f3519h;
            }
            float f7 = this.f3521i / this.f3519h;
            float f8 = fWidth2 * f7;
            if (!z4 && f8 > fWidth && o()) {
                fWidth2 = Math.min(fWidth / f7, fWidth2);
            }
            f5 = f6;
        }
        int i4 = f < 0.5f ? this.f3516e0 : this.f3517f0;
        TextPaint textPaint = this.O;
        boolean z5 = false;
        if (fWidth2 > 0.0f) {
            boolean z6 = this.G != f4;
            boolean z7 = this.Y != f5;
            boolean z8 = this.f3538y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z9 = z6 || z7 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z8 || (this.L != i4) || this.N;
            this.G = f4;
            this.Y = f5;
            this.f3538y = typeface;
            this.N = false;
            this.L = i4;
            textPaint.setLinearText(this.F != 1.0f);
            z5 = z9;
        }
        if (this.C == null || z5) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f3538y);
            textPaint.setLetterSpacing(this.Y);
            boolean zC = c(this.B);
            this.D = zC;
            StaticLayout staticLayoutE = e(((this.f3516e0 > 1 || this.f3517f0 > 1) && !zC) ? i4 : 1, textPaint, this.B, fWidth2 * (o() ? 1.0f : this.F), this.D);
            this.Z = staticLayoutE;
            this.C = staticLayoutE.getText();
        }
    }

    public final StaticLayout e(int i4, TextPaint textPaint, CharSequence charSequence, float f, boolean z4) {
        Layout.Alignment alignment;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f, this.D ? 1 : 0) & 7;
            if (absoluteGravity != 1) {
                boolean z5 = this.D;
                if (absoluteGravity != 5) {
                    alignment = z5 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = z5 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
        }
        v vVar = new v(charSequence, textPaint, (int) f);
        vVar.f3597l = this.A;
        vVar.f3596k = z4;
        vVar.f3591e = alignment;
        vVar.f3595j = false;
        vVar.f = i4;
        vVar.f3592g = 0.0f;
        vVar.f3593h = this.g0;
        vVar.f3594i = this.f3520h0;
        vVar.f3598m = null;
        StaticLayout staticLayoutA = vVar.a();
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final float f() {
        int i4 = this.f3522i0;
        if (i4 != -1) {
            return i4;
        }
        float f = this.f3521i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f3532s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f3534u;
            if (typeface != null) {
                this.f3533t = t2.i.y(configuration, typeface);
            }
            Typeface typeface2 = this.f3537x;
            if (typeface2 != null) {
                this.f3536w = t2.i.y(configuration, typeface2);
            }
            Typeface typeface3 = this.f3533t;
            if (typeface3 == null) {
                typeface3 = this.f3534u;
            }
            this.f3532s = typeface3;
            Typeface typeface4 = this.f3536w;
            if (typeface4 == null) {
                typeface4 = this.f3537x;
            }
            this.f3535v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z4) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f3508a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z4) {
            return;
        }
        d(1.0f, z4);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            boolean zO = o();
            CharSequence charSequenceEllipsize = this.C;
            if (zO) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, this.Z.getWidth(), this.A);
            }
            this.d0 = charSequenceEllipsize;
        }
        CharSequence charSequence2 = this.d0;
        if (charSequence2 != null) {
            this.f3509a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f3509a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f3518g, this.D ? 1 : 0);
        int i4 = absoluteGravity & 112;
        Rect rect = this.f3514d;
        if (i4 == 48) {
            this.n = rect.top;
        } else if (i4 != 80) {
            this.n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.n = textPaint.ascent() + rect.bottom;
        }
        int i5 = absoluteGravity & 8388615;
        if (i5 == 1) {
            this.f3529p = rect.centerX() - (this.f3509a0 / 2.0f);
        } else if (i5 != 5) {
            this.f3529p = rect.left;
        } else {
            this.f3529p = rect.right - this.f3509a0;
        }
        if (this.f3509a0 <= rect.width()) {
            float f = this.f3529p;
            float fMax = Math.max(0.0f, rect.left - f) + f;
            this.f3529p = fMax;
            this.f3529p = Math.min(0.0f, rect.right - (this.f3509a0 + fMax)) + fMax;
        }
        float f4 = this.f3521i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f4);
        textPaint2.setTypeface(this.f3532s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f5 = this.n;
            float fMax2 = Math.max(0.0f, rect.top - f5) + f5;
            this.n = fMax2;
            this.n = Math.min(0.0f, rect.bottom - (f() + fMax2)) + fMax2;
        }
        d(0.0f, z4);
        StaticLayout staticLayout = this.Z;
        float height = staticLayout != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.Z;
        if (staticLayout2 == null || this.f3516e0 <= 1) {
            CharSequence charSequence3 = this.C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.Z;
        this.f3526l = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f, this.D ? 1 : 0);
        int i6 = absoluteGravity2 & 112;
        Rect rect2 = this.f3512c;
        if (i6 == 48) {
            this.f3527m = rect2.top;
        } else if (i6 != 80) {
            this.f3527m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f3527m = (rect2.bottom - height) + (this.f3525k0 ? textPaint.descent() : 0.0f);
        }
        int i7 = absoluteGravity2 & 8388615;
        if (i7 == 1) {
            this.f3528o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i7 != 5) {
            this.f3528o = rect2.left;
        } else {
            this.f3528o = rect2.right - fMeasureText;
        }
        d(this.f3510b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f3524k == colorStateList && this.f3523j == colorStateList) {
            return;
        }
        this.f3524k = colorStateList;
        this.f3523j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        x2.a aVar = this.f3539z;
        if (aVar != null) {
            aVar.f4725i = true;
        }
        if (this.f3534u == typeface) {
            return false;
        }
        this.f3534u = typeface;
        Typeface typefaceY = t2.i.y(this.f3508a.getContext().getResources().getConfiguration(), typeface);
        this.f3533t = typefaceY;
        if (typefaceY == null) {
            typefaceY = this.f3534u;
        }
        this.f3532s = typefaceY;
        return true;
    }

    public final void m(float f) {
        float fI = h0.i(f, 0.0f, 1.0f);
        if (fI != this.f3510b) {
            this.f3510b = fI;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z4;
        boolean zL = l(typeface);
        if (this.f3537x != typeface) {
            this.f3537x = typeface;
            Typeface typefaceY = t2.i.y(this.f3508a.getContext().getResources().getConfiguration(), typeface);
            this.f3536w = typefaceY;
            if (typefaceY == null) {
                typefaceY = this.f3537x;
            }
            this.f3535v = typefaceY;
            z4 = true;
        } else {
            z4 = false;
        }
        if (zL || z4) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f3517f0 == 1;
    }
}
