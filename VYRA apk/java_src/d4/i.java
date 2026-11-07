package d4;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f1826h;

    public i(Runnable runnable, long j4, boolean z4) {
        super(j4, z4);
        this.f1826h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1826h.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1826h;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(z3.l.b(runnable));
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.f1825g ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
