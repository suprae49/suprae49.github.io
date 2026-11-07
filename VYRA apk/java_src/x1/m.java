package x1;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends TimerTask {
    public final /* synthetic */ Timer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f4722g;

    public m(a aVar, Timer timer) {
        this.f4722g = aVar;
        this.f = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        a aVar = this.f4722g;
        aVar.V = aVar.f4660e1;
        this.f.cancel();
    }
}
