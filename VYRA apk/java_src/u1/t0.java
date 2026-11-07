package u1;

import co.median.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4096g;

    public /* synthetic */ t0(MainActivity mainActivity, int i4) {
        this.f = i4;
        this.f4096g = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f;
        MainActivity mainActivity = this.f4096g;
        switch (i4) {
            case 0:
                mainActivity.m0();
                break;
            case 1:
                int i5 = MainActivity.G0;
                mainActivity.S();
                break;
            default:
                int i6 = MainActivity.G0;
                mainActivity.f1188w0 = true;
                mainActivity.V.removeCallbacks(mainActivity.Y);
                break;
        }
    }
}
