package e;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static m0 f1946d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1949c;

    public final void a(double d5, double d6, long j4) {
        float f = (j4 - 946728000000L) / 8.64E7f;
        float f4 = (0.01720197f * f) + 6.24006f;
        double d7 = f4;
        double dSin = (Math.sin(f4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f4) * 3.4906598739326E-4d) + (Math.sin(d7) * 0.03341960161924362d) + d7 + 1.796593063d + 3.141592653589793d;
        double d8 = (-d6) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d7) * 0.0053d) + ((double) (Math.round(((double) (f - 9.0E-4f)) - d8) + 9.0E-4f)) + d8;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d9 = 0.01745329238474369d * d5;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d9))) / (Math.cos(dAsin) * Math.cos(d9));
        if (dSin3 >= 1.0d) {
            this.f1949c = 1;
            this.f1947a = -1L;
            this.f1948b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f1949c = 0;
                this.f1947a = -1L;
                this.f1948b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f1947a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f1948b = jRound;
            if (jRound >= j4 || this.f1947a <= j4) {
                this.f1949c = 1;
            } else {
                this.f1949c = 0;
            }
        }
    }
}
