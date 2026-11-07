package b4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends z3.h implements z3.o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1089l = AtomicIntegerFieldUpdater.newUpdater(e.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z3.h f1090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f1092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f1093k;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public e(z3.h hVar, int i4) {
        if ((hVar instanceof z3.o ? (z3.o) hVar : null) == null) {
            int i5 = z3.n.f4921a;
        }
        this.f1090h = hVar;
        this.f1091i = i4;
        this.f1092j = new i();
        this.f1093k = new Object();
    }

    @Override // z3.h
    public final void c(i3.g gVar, Runnable runnable) {
        this.f1092j.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1089l;
        if (atomicIntegerFieldUpdater.get(this) < this.f1091i) {
            synchronized (this.f1093k) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f1091i) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableH = h();
                if (runnableH == null) {
                    return;
                }
                this.f1090h.c(this, new b0.b(this, runnableH, 3, false));
            }
        }
    }

    public final Runnable h() {
        while (true) {
            Runnable runnable = (Runnable) this.f1092j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1093k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1089l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1092j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // z3.h
    public final String toString() {
        return this.f1090h + ".limitedParallelism(" + this.f1091i + ')';
    }
}
