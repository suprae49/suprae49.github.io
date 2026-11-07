package u1;

import co.median.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x1.i f3865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f3866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e2 f3867i;

    public /* synthetic */ c2(e2 e2Var, x1.i iVar, String str, int i4) {
        this.f = i4;
        this.f3867i = e2Var;
        this.f3865g = iVar;
        this.f3866h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                MainActivity mainActivity = this.f3867i.f3901a;
                mainActivity.r0(this.f3865g, true, false);
                mainActivity.x(this.f3866h);
                break;
            case 1:
                MainActivity mainActivity2 = this.f3867i.f3901a;
                mainActivity2.r0(this.f3865g, true, false);
                mainActivity2.x(this.f3866h);
                break;
            default:
                MainActivity mainActivity3 = this.f3867i.f3901a;
                mainActivity3.r0(this.f3865g, true, false);
                mainActivity3.x(this.f3866h);
                break;
        }
    }
}
