package co.median.android;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.widget.Toast;
import co.median.android.eeqadjy.R;
import java.util.HashMap;
import u1.i;
import u1.k;
import u1.o;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class DownloadService extends Service {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f1158g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1161j;
    public final Handler f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f1159h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1160i = 0;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new i(this);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f1161j = x1.a.u(this).f4673k;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i5) {
        if (!intent.getAction().equals("action_cancel_download")) {
            return 2;
        }
        k kVar = (k) this.f1159h.get(Integer.valueOf(intent.getIntExtra("download_id", 0)));
        if (kVar == null || !kVar.f3976c) {
            return 2;
        }
        kVar.f3976c = false;
        DownloadService downloadService = kVar.f3989r;
        Toast.makeText(downloadService, downloadService.getString(R.string.download_canceled) + " " + kVar.f3981i, 0).show();
        return 2;
    }
}
