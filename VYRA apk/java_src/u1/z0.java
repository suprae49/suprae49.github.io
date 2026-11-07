package u1;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import co.median.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends PhoneStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4151a;

    public z0(MainActivity mainActivity) {
        this.f4151a = mainActivity;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        MainActivity mainActivity = this.f4151a;
        mainActivity.f1183q0 = signalStrength;
        String str = mainActivity.f1181o0;
        if (str != null) {
            mainActivity.X(str);
            mainActivity.f1181o0 = null;
        }
        String str2 = mainActivity.f1180n0;
        if (str2 != null) {
            mainActivity.X(str2);
        }
    }
}
