package u1;

import co.median.android.MainActivity;
import co.median.android.widget.MedianProgressView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e2 f4152g;

    public /* synthetic */ z1(e2 e2Var, int i4) {
        this.f = i4;
        this.f4152g = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                MainActivity mainActivity = this.f4152g.f3901a;
                mainActivity.getClass();
                mainActivity.U = false;
                mainActivity.g0 = false;
                mainActivity.V.removeCallbacks(mainActivity.Y);
                mainActivity.J.setAlpha(0.0f);
                MedianProgressView medianProgressView = mainActivity.L;
                medianProgressView.setAlpha(1.0f);
                medianProgressView.setVisibility(4);
                break;
            default:
                this.f4152g.f3901a.m0();
                break;
        }
    }
}
