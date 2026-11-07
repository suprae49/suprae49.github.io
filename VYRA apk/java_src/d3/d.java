package d3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1696b;

    public /* synthetic */ d(e eVar, int i4) {
        this.f1695a = i4;
        this.f1696b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1695a) {
            case 1:
                this.f1696b.f1754b.i(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1695a) {
            case 0:
                this.f1696b.f1754b.i(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
