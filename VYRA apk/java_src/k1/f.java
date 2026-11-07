package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f2767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f2770e;

    public /* synthetic */ f(i iVar, g gVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i4) {
        this.f2766a = i4;
        this.f2770e = iVar;
        this.f2767b = gVar;
        this.f2768c = viewPropertyAnimator;
        this.f2769d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2766a) {
            case 0:
                this.f2768c.setListener(null);
                View view = this.f2769d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                g gVar = this.f2767b;
                x0 x0Var = gVar.f2775a;
                i iVar = this.f2770e;
                iVar.c(x0Var);
                iVar.f2803r.remove(gVar.f2775a);
                iVar.i();
                break;
            default:
                this.f2768c.setListener(null);
                View view2 = this.f2769d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                g gVar2 = this.f2767b;
                x0 x0Var2 = gVar2.f2776b;
                i iVar2 = this.f2770e;
                iVar2.c(x0Var2);
                iVar2.f2803r.remove(gVar2.f2776b);
                iVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2766a) {
            case 0:
                this.f2770e.getClass();
                break;
            default:
                this.f2770e.getClass();
                break;
        }
    }
}
