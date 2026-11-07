package e2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.navigation.NavigationView;
import p0.a1;
import p0.w0;
import p1.r;
import y0.f;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2054c;

    public b(f fVar, NavigationView navigationView) {
        this.f2052a = 4;
        this.f2053b = fVar;
        this.f2054c = navigationView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2052a) {
            case 0:
                View view = (View) this.f2053b;
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f2054c;
                hideBottomViewOnScrollBehavior.f1282p = null;
                if (hideBottomViewOnScrollBehavior.f1281o == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    break;
                }
                break;
            case 1:
                View view2 = (View) this.f2053b;
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f2054c;
                hideViewOnScrollBehavior.f1293p = null;
                if (hideViewOnScrollBehavior.f1292o == 1 && view2.getVisibility() == 0) {
                    view2.setVisibility(4);
                    break;
                }
                break;
            case 2:
                a1 a1Var = (a1) this.f2054c;
                a1Var.f3162a.e(1.0f);
                w0.f((View) this.f2053b, a1Var);
                break;
            case 3:
                ((p.f) this.f2053b).remove(animator);
                ((r) this.f2054c).f3340t.remove(animator);
                break;
            default:
                f fVar = (f) this.f2053b;
                fVar.c((NavigationView) this.f2054c, false);
                fVar.setScrimColor(-1728053248);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2052a) {
            case 3:
                ((r) this.f2054c).f3340t.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ b(Object obj, int i4, Object obj2) {
        this.f2052a = i4;
        this.f2054c = obj;
        this.f2053b = obj2;
    }
}
