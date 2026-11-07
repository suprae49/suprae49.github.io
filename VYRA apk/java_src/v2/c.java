package v2;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f4294g;

    public /* synthetic */ c(e eVar, int i4) {
        this.f = i4;
        this.f4294g = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                e eVar = this.f4294g;
                if (eVar.f4300i > 0) {
                    eVar.f4301j = SystemClock.uptimeMillis();
                }
                eVar.setVisibility(0);
                break;
            default:
                e eVar2 = this.f4294g;
                ((o) eVar2.getCurrentDrawable()).d(false, false, true);
                if ((eVar2.getProgressDrawable() == null || !eVar2.getProgressDrawable().isVisible()) && (eVar2.getIndeterminateDrawable() == null || !eVar2.getIndeterminateDrawable().isVisible())) {
                    eVar2.setVisibility(4);
                }
                eVar2.f4301j = -1L;
                break;
        }
    }
}
