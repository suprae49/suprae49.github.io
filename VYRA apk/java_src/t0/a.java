package t0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3676e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3679i;

    public final float a(long j4) {
        long j5 = this.f3676e;
        if (j4 < j5) {
            return 0.0f;
        }
        long j6 = this.f3677g;
        if (j6 < 0 || j4 < j6) {
            return c.b((j4 - j5) / this.f3672a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f3678h;
        return (c.b((j4 - j6) / this.f3679i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
