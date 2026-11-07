package e;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Executor {
    public final Object f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1952g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f1953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Runnable f1954i;

    public o(p pVar) {
        this.f1953h = pVar;
    }

    public final void a() {
        synchronized (this.f) {
            try {
                Runnable runnable = (Runnable) this.f1952g.poll();
                this.f1954i = runnable;
                if (runnable != null) {
                    this.f1953h.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f) {
            try {
                this.f1952g.add(new androidx.activity.p(this, 1, runnable));
                if (this.f1954i == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
