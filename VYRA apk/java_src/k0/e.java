package k0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f2718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2719c;

    public final void a(d dVar) {
        synchronized (this) {
            while (this.f2719c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f2718b == dVar) {
                return;
            }
            this.f2718b = dVar;
            if (this.f2717a) {
                dVar.onCancel();
            }
        }
    }
}
