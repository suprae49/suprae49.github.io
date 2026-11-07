package p0;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f3266e;

    public y0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f3266e = windowInsetsAnimation;
    }

    @Override // p0.z0
    public final float a() {
        return this.f3266e.getAlpha();
    }

    @Override // p0.z0
    public final long b() {
        return this.f3266e.getDurationMillis();
    }

    @Override // p0.z0
    public final float c() {
        return this.f3266e.getInterpolatedFraction();
    }

    @Override // p0.z0
    public final int d() {
        return this.f3266e.getTypeMask();
    }

    @Override // p0.z0
    public final void e(float f) {
        this.f3266e.setFraction(f);
    }
}
