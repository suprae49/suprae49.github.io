package u1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import co.median.android.DownloadService;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f4004a;

    public m(o oVar) {
        this.f4004a = oVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        DownloadService downloadService = ((i) iBinder).f3957a;
        o oVar = this.f4004a;
        oVar.f = downloadService;
        downloadService.f1158g = oVar;
        oVar.f4021g = true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o oVar = this.f4004a;
        oVar.f = null;
        oVar.f4021g = false;
    }
}
