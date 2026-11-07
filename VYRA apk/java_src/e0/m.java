package e0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m f2034k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2039e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f2040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f2041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f2042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f2043j;

    static {
        float[] fArr = b.f2008c;
        float fM = (float) ((((double) b.m()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f2006a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr3[0] * f;
        float f5 = fArr[1];
        float f6 = (fArr3[1] * f5) + f4;
        float f7 = fArr[2];
        float f8 = (fArr3[2] * f7) + f6;
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[2] * f7) + (fArr4[1] * f5) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f10 = (f7 * fArr5[2]) + (f5 * fArr5[1]) + (f * fArr5[0]);
        float f11 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d5 = fExp;
        if (d5 > 1.0d) {
            fExp = 1.0f;
        } else if (d5 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * fExp) + 1.0f) - fExp, (((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp};
        float f12 = 1.0f / ((5.0f * fM) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float fCbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(((double) fM) * 5.0d))) + (f13 * fM);
        float fM2 = b.m() / fArr[1];
        double d6 = fM2;
        float fSqrt = ((float) Math.sqrt(d6)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d6, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f8)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f9)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f10)) / 100.0d, 0.42d)};
        float f15 = fArr7[0];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[1];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr7[2];
        float[] fArr8 = {f16, f18, (400.0f * f19) / (f19 + 27.13f)};
        f2034k = new m(fM2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f11, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public m(float f, float f4, float f5, float f6, float f7, float f8, float[] fArr, float f9, float f10, float f11) {
        this.f = f;
        this.f2035a = f4;
        this.f2036b = f5;
        this.f2037c = f6;
        this.f2038d = f7;
        this.f2039e = f8;
        this.f2040g = fArr;
        this.f2041h = f9;
        this.f2042i = f10;
        this.f2043j = f11;
    }
}
