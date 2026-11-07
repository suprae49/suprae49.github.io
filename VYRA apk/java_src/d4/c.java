package d4;

import androidx.emoji2.text.r;
import androidx.fragment.app.z;
import b4.n;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1811m = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1812o = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final r f1813p = new r("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f1816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f1817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f1818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f1819l;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i4, int i5, long j4, String str) {
        this.f = i4;
        this.f1814g = i5;
        this.f1815h = j4;
        this.f1816i = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i4 + " should be at least 1").toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should be greater than or equals to core pool size " + i4).toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f1817j = new f();
        this.f1818k = new f();
        this.f1819l = new n((i4 + 1) * 2);
        this.controlState$volatile = ((long) i4) << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.f1819l) {
            try {
                if (f1812o.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = n;
                long j4 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j4 & 2097151);
                int i5 = i4 - ((int) ((j4 & 4398044413952L) >> 21));
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= this.f) {
                    return 0;
                }
                if (i4 >= this.f1814g) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.f1819l.b(i6) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i6);
                this.f1819l.c(i6, aVar);
                if (i6 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i7 = i5 + 1;
                aVar.start();
                return i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z4) {
        h iVar;
        b bVar;
        j.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f = jNanoTime;
            iVar.f1825g = z4;
        } else {
            iVar = new i(runnable, jNanoTime, z4);
        }
        boolean z5 = iVar.f1825g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        long jAddAndGet = z5 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !aVar.f1805m.equals(this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f1800h) != b.f1809j && (iVar.f1825g || bVar != b.f1806g)) {
            aVar.f1804l = true;
            l lVar = aVar.f;
            lVar.getClass();
            iVar = (h) l.f1833b.getAndSet(lVar, iVar);
            if (iVar == null) {
                iVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = lVar.f1837a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l.f1834c;
                if (atomicIntegerFieldUpdater.get(lVar) - l.f1835d.get(lVar) != 127) {
                    if (iVar.f1825g) {
                        l.f1836e.incrementAndGet(lVar);
                    }
                    int i4 = atomicIntegerFieldUpdater.get(lVar) & 127;
                    while (atomicReferenceArray.get(i4) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i4, iVar);
                    atomicIntegerFieldUpdater.incrementAndGet(lVar);
                    iVar = null;
                }
            }
        }
        if (iVar != null) {
            if (!(iVar.f1825g ? this.f1818k.a(iVar) : this.f1817j.a(iVar))) {
                throw new RejectedExecutionException(this.f1816i + " was terminated");
            }
        }
        if (z5) {
            if (e() || d(jAddAndGet)) {
                return;
            }
            e();
            return;
        }
        if (e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(a aVar, int i4, int i5) {
        while (true) {
            long j4 = f1811m.get(this);
            int i6 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & (-2097152);
            if (i6 == i4) {
                if (i5 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f1813p) {
                            i6 = -1;
                            break;
                        }
                        if (objC == null) {
                            i6 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i6 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i6 = i5;
                }
            }
            if (i6 >= 0) {
                if (f1811m.compareAndSet(this, j4, ((long) i6) | j5)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i4;
        h hVarA;
        if (f1812o.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !aVar.f1805m.equals(this)) {
                aVar = null;
            }
            synchronized (this.f1819l) {
                i4 = (int) (n.get(this) & 2097151);
            }
            if (1 <= i4) {
                int i5 = 1;
                while (true) {
                    Object objB = this.f1819l.b(i5);
                    objB.getClass();
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
                        }
                        l lVar = aVar2.f;
                        f fVar = this.f1818k;
                        lVar.getClass();
                        h hVar = (h) l.f1833b.getAndSet(lVar, null);
                        if (hVar != null) {
                            fVar.a(hVar);
                        }
                        while (true) {
                            h hVarA2 = lVar.a();
                            if (hVarA2 == null) {
                                break;
                            } else {
                                fVar.a(hVarA2);
                            }
                        }
                    }
                    if (i5 == i4) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f1818k.b();
            this.f1817j.b();
            while (true) {
                if (aVar != null) {
                    hVarA = aVar.a(true);
                    if (hVarA == null) {
                        hVarA = (h) this.f1817j.d();
                        if (hVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    hVarA = (h) this.f1817j.d();
                    if (hVarA == null && (hVarA = (h) this.f1818k.d()) == null) {
                        break;
                    }
                }
                try {
                    hVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.f1809j);
            }
            f1811m.set(this, 0L);
            n.set(this, 0L);
        }
    }

    public final boolean d(long j4) {
        int i4 = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = this.f;
        if (i4 < i5) {
            int iA = a();
            if (iA == 1 && i5 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        r rVar;
        int iB;
        while (true) {
            long j4 = f1811m.get(this);
            a aVar = (a) this.f1819l.b((int) (2097151 & j4));
            if (aVar == null) {
                aVar = null;
            } else {
                long j5 = (2097152 + j4) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    rVar = f1813p;
                    if (objC == rVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (f1811m.compareAndSet(this, j4, ((long) iB) | j5)) {
                        aVar.g(rVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.n.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        n nVar = this.f1819l;
        int iA = nVar.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < iA; i9++) {
            a aVar = (a) nVar.b(i9);
            if (aVar != null) {
                l lVar = aVar.f;
                lVar.getClass();
                int i10 = l.f1833b.get(lVar) != null ? (l.f1834c.get(lVar) - l.f1835d.get(lVar)) + 1 : l.f1834c.get(lVar) - l.f1835d.get(lVar);
                int iOrdinal = aVar.f1800h.ordinal();
                if (iOrdinal == 0) {
                    i4++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i10);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i6++;
                } else if (iOrdinal == 3) {
                    i7++;
                    if (i10 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new z();
                    }
                    i8++;
                }
            }
        }
        long j4 = n.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1816i);
        sb4.append('@');
        sb4.append(z3.l.b(this));
        sb4.append("[Pool Size {core = ");
        int i11 = this.f;
        sb4.append(i11);
        sb4.append(", max = ");
        sb4.append(this.f1814g);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i4);
        sb4.append(", blocking = ");
        sb4.append(i5);
        sb4.append(", parked = ");
        sb4.append(i6);
        sb4.append(", dormant = ");
        sb4.append(i7);
        sb4.append(", terminated = ");
        sb4.append(i8);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1817j.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1818k.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j4));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j4) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i11 - ((int) ((j4 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
