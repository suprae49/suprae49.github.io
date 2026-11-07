package d4;

import z3.v;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f1822i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f1823h;

    static {
        int i4 = j.f1829c;
        int i5 = j.f1830d;
        long j4 = j.f1831e;
        String str = j.f1827a;
        e eVar = new e();
        eVar.f1823h = new c(i4, i5, j4, str);
        f1822i = eVar;
    }

    @Override // z3.h
    public final void c(i3.g gVar, Runnable runnable) {
        this.f1823h.b(runnable, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // z3.h
    public final String toString() {
        return "Dispatchers.Default";
    }
}
