package p0;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f3272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3273d;

    public z0(int i4, Interpolator interpolator, long j4) {
        this.f3270a = i4;
        this.f3272c = interpolator;
        this.f3273d = j4;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f3273d;
    }

    public float c() {
        float f = this.f3271b;
        Interpolator interpolator = this.f3272c;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public int d() {
        return this.f3270a;
    }

    public void e(float f) {
        this.f3271b = f;
    }
}
