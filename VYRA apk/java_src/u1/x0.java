package u1;

import co.median.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4137g;

    public /* synthetic */ x0(MainActivity mainActivity, int i4) {
        this.f = i4;
        this.f4137g = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                androidx.activity.k kVar = new androidx.activity.k(13, this);
                MainActivity mainActivity = this.f4137g;
                mainActivity.runOnUiThread(kVar);
                mainActivity.V.postDelayed(mainActivity.Y, 100L);
                break;
            case 1:
                this.f4137g.M.setRefreshing(false);
                break;
            default:
                MainActivity mainActivity2 = this.f4137g;
                String str = mainActivity2.f1181o0;
                if (str != null) {
                    mainActivity2.X(str);
                    mainActivity2.f1181o0 = null;
                    break;
                }
                break;
        }
    }
}
