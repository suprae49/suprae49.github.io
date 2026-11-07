package n1;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f3090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3091b;

    public a(d dVar, c cVar) {
        this.f3091b = dVar;
        this.f3090a = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c cVar = this.f3090a;
        d.d(fFloatValue, cVar);
        d dVar = this.f3091b;
        dVar.a(fFloatValue, cVar, false);
        dVar.invalidateSelf();
    }
}
