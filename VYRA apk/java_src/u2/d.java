package u2;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f4156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f4157b;

    public d(f fVar, float f) {
        this.f4157b = fVar;
        this.f4156a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4157b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f4156a);
    }
}
