package d3;

import a3.h0;
import android.animation.ValueAnimator;
import android.view.View;
import e.q0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1712b;

    public /* synthetic */ i(h0 h0Var, View view) {
        this.f1711a = 1;
        this.f1712b = h0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1711a) {
            case 0:
                m mVar = (m) this.f1712b;
                mVar.f1756d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                ((View) ((q0) ((h0) this.f1712b).f84g).f1970h.getParent()).invalidate();
                break;
            case 2:
                ((y0.f) this.f1712b).setScrimColor(f0.b.d(-1728053248, b2.a.c(u2.b.f4153a, 0, valueAnimator.getAnimatedFraction())));
                break;
            default:
                v2.m mVar2 = (v2.m) this.f1712b;
                mVar2.f4367u.f4389d = mVar2.f4372z.getInterpolation(mVar2.f4371y.getAnimatedFraction());
                break;
        }
    }

    public /* synthetic */ i(int i4, Object obj) {
        this.f1711a = i4;
        this.f1712b = obj;
    }
}
