package v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4321b;

    public /* synthetic */ g(h hVar, int i4) {
        this.f4320a = i4;
        this.f4321b = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f4320a) {
            case 1:
                super.onAnimationEnd(animator);
                h hVar = this.f4321b;
                hVar.c();
                d dVar = hVar.f4332j;
                if (dVar != null) {
                    dVar.a((s) hVar.f1839a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f4320a) {
            case 0:
                super.onAnimationRepeat(animator);
                h hVar = this.f4321b;
                hVar.f4329g = (hVar.f4329g + 4) % hVar.f.f4350e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
