package e0;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2005e;
    public final float f;

    public a(float f, float f4, float f5, float f6, float f7, float f8) {
        this.f2001a = f;
        this.f2002b = f4;
        this.f2003c = f5;
        this.f2004d = f6;
        this.f2005e = f7;
        this.f = f8;
    }

    public static a a(int i4) {
        m mVar = m.f2034k;
        float f = b.f(Color.red(i4));
        float f4 = b.f(Color.green(i4));
        float f5 = b.f(Color.blue(i4));
        float[][] fArr = b.f2009d;
        float[] fArr2 = fArr[0];
        float f6 = (fArr2[2] * f5) + (fArr2[1] * f4) + (fArr2[0] * f);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[2] * f5) + (fArr3[1] * f4) + (fArr3[0] * f);
        float[] fArr4 = fArr[2];
        float f8 = (f5 * fArr4[2]) + (f4 * fArr4[1]) + (f * fArr4[0]);
        float[][] fArr5 = b.f2006a;
        float[] fArr6 = fArr5[0];
        float f9 = (fArr6[2] * f8) + (fArr6[1] * f7) + (fArr6[0] * f6);
        float[] fArr7 = fArr5[1];
        float f10 = (fArr7[2] * f8) + (fArr7[1] * f7) + (fArr7[0] * f6);
        float[] fArr8 = fArr5[2];
        float f11 = (f8 * fArr8[2]) + (f7 * fArr8[1]) + (f6 * fArr8[0]);
        float[] fArr9 = mVar.f2040g;
        float f12 = mVar.f2042i;
        float f13 = mVar.f2038d;
        float f14 = mVar.f2035a;
        float f15 = fArr9[0] * f9;
        float f16 = fArr9[1] * f10;
        float f17 = fArr9[2] * f11;
        float f18 = mVar.f2041h;
        float fPow = (float) Math.pow(((double) (Math.abs(f15) * f18)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f16) * f18)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f17) * f18)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f15) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f16) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f17) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d5 = fSignum3;
        float f19 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d5)) / 11.0f;
        float f20 = ((float) (((double) (fSignum + fSignum2)) - (d5 * 2.0d))) / 9.0f;
        float f21 = fSignum2 * 20.0f;
        float f22 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f21)) / 20.0f;
        float f23 = (((fSignum * 40.0f) + f21) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f24 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f23 * mVar.f2036b) / f14, mVar.f2043j * f13)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f25 = f14 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f2039e) * mVar.f2037c) * ((float) Math.sqrt((f20 * f20) + (f19 * f19)))) / (f22 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f13) / f25);
        float f26 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f12 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f24;
        return new a(fAtan2, fSqrt, fPow4, f26, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    public static a b(float f, float f4, float f5) {
        m mVar = m.f2034k;
        float f6 = mVar.f2038d;
        double d5 = ((double) f) / 100.0d;
        Math.sqrt(d5);
        float f7 = mVar.f2035a + 4.0f;
        float f8 = mVar.f2042i * f4;
        Math.sqrt(((f4 / ((float) Math.sqrt(d5))) * mVar.f2038d) / f7);
        float f9 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f8) * 0.0228d) + 1.0d)) * 43.85965f;
        double d6 = (3.1415927f * f5) / 180.0f;
        return new a(f5, f4, f, f9, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final int c(m mVar) {
        float fSqrt;
        float f = this.f2002b;
        double d5 = f;
        float f4 = this.f2003c;
        if (d5 != 0.0d) {
            double d6 = f4;
            if (d6 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f / ((float) Math.sqrt(d6 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f5 = mVar.f;
        float f6 = mVar.f2041h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f5), 0.73d), 1.1111111111111112d);
        double d7 = (this.f2001a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d7) + 3.8d)) * 0.25f;
        float fPow2 = mVar.f2035a * ((float) Math.pow(((double) f4) / 100.0d, (1.0d / ((double) mVar.f2038d)) / ((double) mVar.f2043j)));
        float f7 = fCos * 3846.1538f * mVar.f2039e * mVar.f2037c;
        float f8 = fPow2 / mVar.f2036b;
        float fSin = (float) Math.sin(d7);
        float fCos2 = (float) Math.cos(d7);
        float f9 = (((0.305f + f8) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f7 * 23.0f)));
        float f10 = fCos2 * f9;
        float f11 = f9 * fSin;
        float f12 = f8 * 460.0f;
        float f13 = ((288.0f * f11) + ((451.0f * f10) + f12)) / 1403.0f;
        float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
        float f15 = ((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f;
        float f16 = 100.0f / f6;
        float fSignum = Math.signum(f13) * f16 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f14) * f16 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f14)) * 27.13d) / (400.0d - ((double) Math.abs(f14)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f15) * f16 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15)))), 2.380952380952381d));
        float[] fArr = mVar.f2040g;
        float f17 = fSignum / fArr[0];
        float f18 = fSignum2 / fArr[1];
        float f19 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f2007b;
        float[] fArr3 = fArr2[0];
        float f20 = (fArr3[2] * f19) + (fArr3[1] * f18) + (fArr3[0] * f17);
        float[] fArr4 = fArr2[1];
        float f21 = (fArr4[2] * f19) + (fArr4[1] * f18) + (fArr4[0] * f17);
        float[] fArr5 = fArr2[2];
        return f0.b.a(f20, f21, (f19 * fArr5[2]) + (f18 * fArr5[1]) + (f17 * fArr5[0]));
    }
}
