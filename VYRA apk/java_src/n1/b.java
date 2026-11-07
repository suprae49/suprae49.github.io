package n1;

import android.animation.Animator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f3092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3093b;

    public b(d dVar, c cVar) {
        this.f3093b = dVar;
        this.f3092a = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        d dVar = this.f3093b;
        c cVar = this.f3092a;
        dVar.a(1.0f, cVar, true);
        cVar.f3103k = cVar.f3098e;
        cVar.f3104l = cVar.f;
        cVar.f3105m = cVar.f3099g;
        cVar.a((cVar.f3102j + 1) % cVar.f3101i.length);
        if (!dVar.f3119k) {
            dVar.f3118j += 1.0f;
            return;
        }
        dVar.f3119k = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (cVar.n) {
            cVar.n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3093b.f3118j = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
