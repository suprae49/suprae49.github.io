package p0;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class n1 extends m1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f0.c f3225s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f0.c f3226t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f0.c f3227u;

    public n1(y1 y1Var, WindowInsets windowInsets) {
        super(y1Var, windowInsets);
        this.f3225s = null;
        this.f3226t = null;
        this.f3227u = null;
    }

    @Override // p0.t1
    public f0.c j() {
        if (this.f3226t == null) {
            this.f3226t = f0.c.d(this.f3210c.getMandatorySystemGestureInsets());
        }
        return this.f3226t;
    }

    @Override // p0.t1
    public f0.c l() {
        if (this.f3225s == null) {
            this.f3225s = f0.c.d(this.f3210c.getSystemGestureInsets());
        }
        return this.f3225s;
    }

    @Override // p0.t1
    public f0.c n() {
        if (this.f3227u == null) {
            this.f3227u = f0.c.d(this.f3210c.getTappableElementInsets());
        }
        return this.f3227u;
    }

    @Override // p0.k1, p0.t1
    public y1 q(int i4, int i5, int i6, int i7) {
        return y1.h(null, this.f3210c.inset(i4, i5, i6, i7));
    }

    @Override // p0.l1, p0.t1
    public void w(f0.c cVar) {
    }
}
