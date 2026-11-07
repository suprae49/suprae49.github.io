package k;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2555e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2557h;

    public final void a(int i4, int i5) {
        this.f2553c = i4;
        this.f2554d = i5;
        this.f2557h = true;
        if (this.f2556g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f2551a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f2552b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f2551a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f2552b = i5;
        }
    }
}
