package w1;

import android.view.animation.Animation;
import co.median.android.MainActivity;
import co.median.android.MySwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4452b;

    public /* synthetic */ b(h hVar, int i4) {
        this.f4451a = i4;
        this.f4452b = hVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        g gVar;
        switch (this.f4451a) {
            case 0:
                MySwipeRefreshLayout mySwipeRefreshLayout = (MySwipeRefreshLayout) this.f4452b;
                if (!mySwipeRefreshLayout.f4458h) {
                    mySwipeRefreshLayout.f();
                } else {
                    mySwipeRefreshLayout.E.setAlpha(255);
                    mySwipeRefreshLayout.E.start();
                    if (mySwipeRefreshLayout.J && (gVar = mySwipeRefreshLayout.f4457g) != null) {
                        ((MainActivity) gVar).N();
                    }
                    mySwipeRefreshLayout.f4467r = mySwipeRefreshLayout.f4474y.getTop();
                }
                break;
            default:
                h hVar = this.f4452b;
                c cVar = new c(hVar, 1);
                hVar.G = cVar;
                cVar.setDuration(150L);
                a aVar = hVar.f4474y;
                aVar.f4450i = null;
                aVar.clearAnimation();
                hVar.f4474y.startAnimation(hVar.G);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i4 = this.f4451a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i4 = this.f4451a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
