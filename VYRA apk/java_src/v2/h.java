package v2;

import android.animation.ObjectAnimator;
import e.a0;
import java.util.ArrayList;
import k.y2;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f4322k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f4323l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f4324m = {1000, 2350, 3700, 5050};
    public static final y2 n = new y2("animationFraction", 8, Float.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final y2 f4325o = new y2("completeEndFraction", 9, Float.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f4326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f4327d;
    public final l f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f4330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4331i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4329g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f4332j = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1.a f4328e = new e1.a(1);

    public h(l lVar) {
        this.f = lVar;
    }

    @Override // e.a0
    public final void c() {
        ObjectAnimator objectAnimator = this.f4326c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // e.a0
    public final void i() {
        p();
        ObjectAnimator objectAnimator = this.f4326c;
        l lVar = this.f;
        objectAnimator.setDuration((long) (lVar.n * 5400.0f));
        this.f4327d.setDuration((long) (lVar.n * 333.0f));
        this.f4329g = 0;
        ((p) ((ArrayList) this.f1840b).get(0)).f4388c = lVar.f4350e[0];
        this.f4331i = 0.0f;
    }

    @Override // e.a0
    public final void k(d dVar) {
        this.f4332j = dVar;
    }

    @Override // e.a0
    public final void l() {
        ObjectAnimator objectAnimator = this.f4327d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((s) this.f1839a).isVisible()) {
            this.f4327d.start();
        } else {
            c();
        }
    }

    @Override // e.a0
    public final void n() {
        p();
        this.f4329g = 0;
        ((p) ((ArrayList) this.f1840b).get(0)).f4388c = this.f.f4350e[0];
        this.f4331i = 0.0f;
        this.f4326c.start();
    }

    @Override // e.a0
    public final void o() {
        this.f4332j = null;
    }

    public final void p() {
        ObjectAnimator objectAnimator = this.f4326c;
        l lVar = this.f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.f4326c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (lVar.n * 5400.0f));
            this.f4326c.setInterpolator(null);
            this.f4326c.setRepeatCount(-1);
            this.f4326c.addListener(new g(this, 0));
        }
        if (this.f4327d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f4325o, 0.0f, 1.0f);
            this.f4327d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (lVar.n * 333.0f));
            this.f4327d.setInterpolator(this.f4328e);
            this.f4327d.addListener(new g(this, 1));
        }
    }
}
