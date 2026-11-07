package k;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.e f2586g;

    public /* synthetic */ m2(androidx.appcompat.widget.e eVar, int i4) {
        this.f = i4;
        this.f2586g = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                this.f2586g.s();
                break;
            default:
                u0.b bVar = this.f2586g.U;
                if (bVar instanceof x2) {
                    bVar.b(null);
                }
                break;
        }
    }
}
