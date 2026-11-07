package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2746a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f2747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f2750e;

    public d(i iVar, x0 x0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2750e = iVar;
        this.f2747b = x0Var;
        this.f2749d = viewPropertyAnimator;
        this.f2748c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2746a) {
            case 1:
                this.f2748c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2746a) {
            case 0:
                this.f2749d.setListener(null);
                this.f2748c.setAlpha(1.0f);
                i iVar = this.f2750e;
                x0 x0Var = this.f2747b;
                iVar.c(x0Var);
                iVar.f2802q.remove(x0Var);
                iVar.i();
                break;
            default:
                this.f2749d.setListener(null);
                i iVar2 = this.f2750e;
                x0 x0Var2 = this.f2747b;
                iVar2.c(x0Var2);
                iVar2.f2800o.remove(x0Var2);
                iVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2746a) {
            case 0:
                this.f2750e.getClass();
                break;
            default:
                this.f2750e.getClass();
                break;
        }
    }

    public d(i iVar, x0 x0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2750e = iVar;
        this.f2747b = x0Var;
        this.f2748c = view;
        this.f2749d = viewPropertyAnimator;
    }
}
