package k;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f2544g;

    public i(androidx.appcompat.widget.b bVar, g gVar) {
        this.f2544g = bVar;
        this.f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.k kVar;
        androidx.appcompat.widget.b bVar = this.f2544g;
        j.m mVar = bVar.f407h;
        if (mVar != null && (kVar = mVar.f2388e) != null) {
            kVar.i(mVar);
        }
        View view = (View) bVar.f412m;
        if (view != null && view.getWindowToken() != null) {
            g gVar = this.f;
            if (gVar.b()) {
                bVar.f423y = gVar;
            } else if (gVar.f != null) {
                gVar.d(0, 0, false, false);
                bVar.f423y = gVar;
            }
        }
        bVar.A = null;
    }
}
