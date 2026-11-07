package d4;

import b4.p;
import java.util.concurrent.Executor;
import z3.v;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends v implements Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f1820h = new d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z3.h f1821i;

    static {
        k kVar = k.f1832h;
        int i4 = p.f1110a;
        if (64 >= i4) {
            i4 = 64;
        }
        f1821i = kVar.e(b4.d.f("kotlinx.coroutines.io.parallelism", i4, 12));
    }

    @Override // z3.h
    public final void c(i3.g gVar, Runnable runnable) {
        f1821i.c(gVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(i3.h.f, runnable);
    }

    @Override // z3.h
    public final String toString() {
        return "Dispatchers.IO";
    }
}
