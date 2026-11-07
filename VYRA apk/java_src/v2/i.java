package v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f4334b;

    public /* synthetic */ i(j jVar, int i4) {
        this.f4333a = i4;
        this.f4334b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f4333a) {
            case 1:
                super.onAnimationEnd(animator);
                j jVar = this.f4334b;
                jVar.c();
                d dVar = jVar.f4345j;
                if (dVar != null) {
                    dVar.a((s) jVar.f1839a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f4333a) {
            case 0:
                super.onAnimationRepeat(animator);
                j jVar = this.f4334b;
                jVar.f4342g = (jVar.f4342g + j.f4336l.length) % jVar.f.f4350e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
