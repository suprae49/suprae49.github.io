package v2;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import co.median.android.eeqadjy.R;
import com.google.android.gms.common.ConnectionResult;
import e.a0;
import java.util.ArrayList;
import k.y2;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e1.a f4335k = b2.a.f1048b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f4336l = {0, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 3000, 4500};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float[] f4337m = {0.1f, 0.87f};
    public static final y2 n = new y2("animationFraction", 10, Float.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final y2 f4338o = new y2("completeEndFraction", 11, Float.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f4339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f4340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f4341e;
    public final l f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f4343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4344i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4342g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f4345j = null;

    public j(Context context, l lVar) {
        this.f = lVar;
        this.f4341e = t2.i.L(context, R.attr.motionEasingStandardInterpolator, f4335k);
    }

    @Override // e.a0
    public final void c() {
        ObjectAnimator objectAnimator = this.f4339c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // e.a0
    public final void i() {
        p();
        ObjectAnimator objectAnimator = this.f4339c;
        l lVar = this.f;
        objectAnimator.setDuration((long) (lVar.n * 6000.0f));
        this.f4340d.setDuration((long) (lVar.n * 500.0f));
        this.f4342g = 0;
        ((p) ((ArrayList) this.f1840b).get(0)).f4388c = lVar.f4350e[0];
        this.f4344i = 0.0f;
    }

    @Override // e.a0
    public final void k(d dVar) {
        this.f4345j = dVar;
    }

    @Override // e.a0
    public final void l() {
        ObjectAnimator objectAnimator = this.f4340d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((s) this.f1839a).isVisible()) {
            this.f4340d.start();
        } else {
            c();
        }
    }

    @Override // e.a0
    public final void n() {
        p();
        this.f4342g = 0;
        ((p) ((ArrayList) this.f1840b).get(0)).f4388c = this.f.f4350e[0];
        this.f4344i = 0.0f;
        this.f4339c.start();
    }

    @Override // e.a0
    public final void o() {
        this.f4345j = null;
    }

    public final void p() {
        ObjectAnimator objectAnimator = this.f4339c;
        l lVar = this.f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.f4339c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (lVar.n * 6000.0f));
            this.f4339c.setInterpolator(null);
            this.f4339c.setRepeatCount(-1);
            this.f4339c.addListener(new i(this, 0));
        }
        if (this.f4340d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f4338o, 0.0f, 1.0f);
            this.f4340d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (lVar.n * 500.0f));
            this.f4340d.addListener(new i(this, 1));
        }
    }
}
