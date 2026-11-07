package u1;

import co.median.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements m0.g, b.b, i1, m0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4111g;

    public /* synthetic */ v0(MainActivity mainActivity, int i4) {
        this.f = i4;
        this.f4111g = mainActivity;
    }

    @Override // b.b
    public void a(Object obj) {
        int i4 = this.f;
        MainActivity mainActivity = this.f4111g;
        switch (i4) {
            case 1:
                mainActivity.U(mainActivity.f1187u0, false);
                break;
            default:
                int i5 = MainActivity.G0;
                mainActivity.V(t2.i.e("median_appbrowser_closed", null), null);
                break;
        }
    }

    @Override // m0.g
    public boolean b() {
        return !this.f4111g.f1188w0;
    }
}
