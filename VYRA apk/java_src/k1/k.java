package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2807a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f2808b;

    public k(l lVar) {
        this.f2808b = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2807a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2807a) {
            this.f2807a = false;
            return;
        }
        l lVar = this.f2808b;
        if (((Float) lVar.f2836z.getAnimatedValue()).floatValue() == 0.0f) {
            lVar.A = 0;
            lVar.f(0);
        } else {
            lVar.A = 2;
            lVar.f2829s.invalidate();
        }
    }
}
