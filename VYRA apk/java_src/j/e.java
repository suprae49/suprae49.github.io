package j;

import a3.h0;
import android.animation.ValueAnimator;
import android.view.View;
import p0.a1;
import p0.w0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2348j;

    public e(h0 h0Var, f fVar, o oVar, m mVar) {
        this.f2348j = h0Var;
        this.f2345g = fVar;
        this.f2346h = oVar;
        this.f2347i = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                g gVar = (g) ((h0) this.f2348j).f84g;
                o oVar = (o) this.f2346h;
                f fVar = (f) this.f2345g;
                if (fVar != null) {
                    gVar.F = true;
                    fVar.f2351b.c(false);
                    gVar.F = false;
                }
                if (oVar.isEnabled() && oVar.hasSubMenu()) {
                    ((m) this.f2347i).q(oVar, null, 4);
                    break;
                }
                break;
            default:
                w0.i((View) this.f2345g, (a1) this.f2346h, (androidx.emoji2.text.p) this.f2347i);
                ((ValueAnimator) this.f2348j).start();
                break;
        }
    }

    public e(View view, a1 a1Var, androidx.emoji2.text.p pVar, ValueAnimator valueAnimator) {
        this.f2345g = view;
        this.f2346h = a1Var;
        this.f2347i = pVar;
        this.f2348j = valueAnimator;
    }
}
