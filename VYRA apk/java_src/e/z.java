package e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import co.median.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2000b;

    public /* synthetic */ z(int i4, Object obj) {
        this.f1999a = i4;
        this.f2000b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i4 = this.f1999a;
        Object obj = this.f2000b;
        switch (i4) {
            case 0:
                ((a0) obj).j();
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj;
                int i5 = MainActivity.G0;
                mainActivity.T();
                String str = mainActivity.f1180n0;
                if (str != null) {
                    mainActivity.X(str);
                }
                break;
        }
    }
}
