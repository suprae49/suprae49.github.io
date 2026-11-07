package z3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends h implements o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4925k = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4926l = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4927m = AtomicIntegerFieldUpdater.newUpdater(u.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h3.c f4930j;

    @Override // z3.h
    public final void c(i3.g gVar, Runnable runnable) {
        i(runnable);
    }

    public final void h() {
        long j4 = this.f4928h - 4294967296L;
        this.f4928h = j4;
        if (j4 <= 0 && this.f4929i) {
            shutdown();
        }
    }

    public void i(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4925k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f4927m.get(this) == 0) {
                if (obj == null) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == null);
                } else if (obj instanceof b4.k) {
                    b4.k kVar = (b4.k) obj;
                    int iA = kVar.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        b4.k kVarC = kVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA != 2) {
                    }
                } else if (obj != l.f4913a) {
                    b4.k kVar2 = new b4.k(8, true);
                    kVar2.a((Runnable) obj);
                    kVar2.a(runnable);
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar2)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            m.n.i(runnable);
            return;
        }
        Thread threadJ = j();
        if (Thread.currentThread() != threadJ) {
            LockSupport.unpark(threadJ);
        }
    }

    public abstract Thread j();

    public final boolean k() {
        h3.c cVar = this.f4930j;
        if (cVar != null ? cVar.isEmpty() : true) {
            Object obj = f4925k.get(this);
            if (obj != null) {
                if (obj instanceof b4.k) {
                    long j4 = b4.k.f.get((b4.k) obj);
                    return ((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30));
                }
                if (obj == l.f4913a) {
                }
            }
            return true;
        }
        return false;
    }

    public final long l() {
        Runnable runnable;
        if (!m()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4925k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof b4.k) {
                    b4.k kVar = (b4.k) obj;
                    Object objD = kVar.d();
                    if (objD != b4.k.f1102g) {
                        runnable = (Runnable) objD;
                        break;
                    }
                    b4.k kVarC = kVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == l.f4913a) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            h3.c cVar = this.f4930j;
            if (((cVar == null || cVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f4925k.get(this);
                if (obj2 == null) {
                } else if (obj2 instanceof b4.k) {
                    long j4 = b4.k.f.get((b4.k) obj2);
                    if (((int) (1073741823 & j4)) != ((int) ((j4 & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (obj2 == l.f4913a) {
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public final boolean m() {
        h3.c cVar = this.f4930j;
        if (cVar == null) {
            return false;
        }
        b4.c cVar2 = (b4.c) (cVar.isEmpty() ? null : cVar.removeFirst());
        if (cVar2 == null) {
            return false;
        }
        cVar2.run();
        return true;
    }

    public void shutdown() {
        ThreadLocal threadLocal = i0.f4910a;
        i0.f4910a.set(null);
        f4927m.set(this, 1);
        androidx.emoji2.text.r rVar = l.f4913a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4925k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, rVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof b4.k) {
                ((b4.k) obj).b();
                break;
            } else {
                if (obj == rVar) {
                    break;
                }
                b4.k kVar = new b4.k(8, true);
                kVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (l() <= 0) {
        }
        System.nanoTime();
    }
}
