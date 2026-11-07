package u1;

import android.util.Log;
import android.webkit.ValueCallback;
import co.median.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y1 implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f4148b;

    public /* synthetic */ y1(e2 e2Var, int i4) {
        this.f4147a = i4;
        this.f4148b = e2Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i4 = this.f4147a;
        e2 e2Var = this.f4148b;
        String str = (String) obj;
        switch (i4) {
            case 0:
                float f = Float.parseFloat(str);
                MainActivity mainActivity = e2Var.f3901a;
                mainActivity.E0 = f;
                if (mainActivity.F0 < 0.0f) {
                    mainActivity.F0 = f;
                    x1.i iVar = mainActivity.G;
                    if (iVar instanceof o0) {
                        ((o0) iVar).setCurrentScale(f);
                    }
                }
                break;
            default:
                if (!Boolean.parseBoolean(str)) {
                    Log.d("u1.e2", "Custom CSS Injection Failed");
                } else {
                    e2Var.f3912m = true;
                    Log.d("u1.e2", "Custom CSS Injection Success");
                }
                break;
        }
    }
}
