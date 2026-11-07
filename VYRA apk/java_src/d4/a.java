package d4;

import androidx.emoji2.text.r;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r3.k f1799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f1800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f1801i;
    private volatile int indexInArray;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f1802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f1805m;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i4) {
        this.f1805m = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f = new l();
        this.f1799g = new r3.k();
        this.f1800h = b.f1808i;
        this.nextParkedWorker = c.f1813p;
        int iNanoTime = (int) System.nanoTime();
        this.f1803k = iNanoTime == 0 ? 42 : iNanoTime;
        f(i4);
    }

    public final h a(boolean z4) {
        h hVarE;
        h hVarE2;
        long j4;
        b bVar = this.f1800h;
        c cVar = this.f1805m;
        h hVar = null;
        l lVar = this.f;
        b bVar2 = b.f;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.n;
            do {
                j4 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1833b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 == null || !hVar2.f1825g) {
                            int i4 = l.f1835d.get(lVar);
                            int i5 = l.f1834c.get(lVar);
                            while (i4 != i5 && l.f1836e.get(lVar) != 0) {
                                i5--;
                                h hVarB = lVar.b(i5, true);
                                if (hVarB != null) {
                                    hVar = hVarB;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                hVar = hVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar) == hVar2);
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) cVar.f1818k.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!c.n.compareAndSet(cVar, j4, j4 - 4398046511104L));
            this.f1800h = bVar2;
        }
        if (z4) {
            boolean z5 = d(cVar.f * 2) == 0;
            if (z5 && (hVarE2 = e()) != null) {
                return hVarE2;
            }
            lVar.getClass();
            h hVarA = (h) l.f1833b.getAndSet(lVar, null);
            if (hVarA == null) {
                hVarA = lVar.a();
            }
            if (hVarA != null) {
                return hVarA;
            }
            if (!z5 && (hVarE = e()) != null) {
                return hVarE;
            }
        } else {
            h hVarE3 = e();
            if (hVarE3 != null) {
                return hVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i4) {
        int i5 = this.f1803k;
        int i6 = i5 ^ (i5 << 13);
        int i7 = i6 ^ (i6 >> 17);
        int i8 = i7 ^ (i7 << 5);
        this.f1803k = i8;
        int i9 = i4 - 1;
        return (i9 & i4) == 0 ? i8 & i9 : (i8 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i4;
    }

    public final h e() {
        int iD = d(2);
        c cVar = this.f1805m;
        f fVar = cVar.f1818k;
        f fVar2 = cVar.f1817j;
        if (iD == 0) {
            h hVar = (h) fVar2.d();
            return hVar != null ? hVar : (h) fVar.d();
        }
        h hVar2 = (h) fVar.d();
        return hVar2 != null ? hVar2 : (h) fVar2.d();
    }

    public final void f(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1805m.f1816i);
        sb.append("-worker-");
        sb.append(i4 == 0 ? "TERMINATED" : String.valueOf(i4));
        setName(sb.toString());
        this.indexInArray = i4;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f1800h;
        boolean z4 = bVar2 == b.f;
        if (z4) {
            c.n.addAndGet(this.f1805m, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f1800h = bVar;
        }
        return z4;
    }

    public final h i(int i4) {
        long j4;
        h hVarB;
        long j5;
        long j6;
        h hVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.n;
        c cVar = this.f1805m;
        int i5 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        h hVar2 = null;
        if (i5 < 2) {
            return null;
        }
        int iD = d(i5);
        int i6 = 0;
        long jMin = Long.MAX_VALUE;
        while (i6 < i5) {
            iD++;
            if (iD > i5) {
                iD = 1;
            }
            a aVar = (a) cVar.f1819l.b(iD);
            if (aVar != null && aVar != this) {
                l lVar = aVar.f;
                if (i4 != 3) {
                    lVar.getClass();
                    int i7 = l.f1835d.get(lVar);
                    int i8 = l.f1834c.get(lVar);
                    boolean z4 = i4 == 1;
                    while (true) {
                        if (i7 != i8) {
                            j4 = 0;
                            if (!z4 || l.f1836e.get(lVar) != 0) {
                                int i9 = i7 + 1;
                                hVarB = lVar.b(i7, z4);
                                if (hVarB != null) {
                                    break;
                                }
                                i7 = i9;
                            }
                        } else {
                            j4 = 0;
                        }
                        hVarB = hVar2;
                        break;
                    }
                } else {
                    hVarB = lVar.a();
                    j4 = 0;
                }
                r3.k kVar = this.f1799g;
                if (hVarB == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1833b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar3 == null) {
                            j5 = -1;
                        } else {
                            j5 = -1;
                            if (((hVar3.f1825g ? 1 : 2) & i4) != 0) {
                                j.f.getClass();
                                l lVar2 = lVar;
                                long jNanoTime = System.nanoTime() - hVar3.f;
                                long j7 = j.f1828b;
                                if (jNanoTime < j7) {
                                    j6 = j7 - jNanoTime;
                                    hVar = null;
                                    break;
                                }
                                do {
                                    hVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(lVar2, hVar3, null)) {
                                        kVar.f = hVar3;
                                        j6 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(lVar2) == hVar3);
                                lVar = lVar2;
                                hVar2 = null;
                            }
                        }
                        j6 = -2;
                        hVar = hVar2;
                        break;
                    }
                } else {
                    kVar.f = hVarB;
                    hVar = hVar2;
                    j6 = -1;
                    j5 = -1;
                }
                if (j6 == j5) {
                    h hVar4 = (h) kVar.f;
                    kVar.f = hVar;
                    return hVar4;
                }
                if (j6 > j4) {
                    jMin = Math.min(jMin, j6);
                }
            }
            i6++;
            hVar2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f1802j = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j4;
        loop0: while (true) {
            boolean z4 = false;
            while (true) {
                if (c.f1812o.get(this.f1805m) == 0) {
                    b bVar = this.f1800h;
                    b bVar2 = b.f1809j;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    h hVarA = a(this.f1804l);
                    if (hVarA != null) {
                        this.f1802j = 0L;
                        c cVar = this.f1805m;
                        this.f1801i = 0L;
                        if (this.f1800h == b.f1807h) {
                            this.f1800h = b.f1806g;
                        }
                        if (!hVarA.f1825g) {
                            try {
                                hVarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(b.f1806g) && !cVar.e() && !cVar.d(c.n.get(cVar))) {
                            cVar.e();
                        }
                        try {
                            hVarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        c.n.addAndGet(cVar, -2097152L);
                        if (this.f1800h == bVar2) {
                            break;
                        }
                        this.f1800h = b.f1808i;
                        break;
                    }
                    this.f1804l = false;
                    if (this.f1802j == 0) {
                        Object obj = this.nextParkedWorker;
                        r rVar = c.f1813p;
                        if (obj != rVar) {
                            n.set(this, -1);
                            while (this.nextParkedWorker != c.f1813p) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                c cVar2 = this.f1805m;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f1812o;
                                if (atomicIntegerFieldUpdater2.get(cVar2) != 0) {
                                    break;
                                }
                                b bVar3 = this.f1800h;
                                b bVar4 = b.f1809j;
                                if (bVar3 == bVar4) {
                                    break;
                                }
                                h(b.f1807h);
                                Thread.interrupted();
                                if (this.f1801i == 0) {
                                    j4 = 2097151;
                                    this.f1801i = System.nanoTime() + this.f1805m.f1815h;
                                } else {
                                    j4 = 2097151;
                                }
                                LockSupport.parkNanos(this.f1805m.f1815h);
                                if (System.nanoTime() - this.f1801i >= 0) {
                                    this.f1801i = 0L;
                                    c cVar3 = this.f1805m;
                                    synchronized (cVar3.f1819l) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(cVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = c.n;
                                                if (((int) (atomicLongFieldUpdater.get(cVar3) & j4)) > cVar3.f) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i4 = this.indexInArray;
                                                        f(0);
                                                        cVar3.c(this, i4, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j4);
                                                        if (andDecrement != i4) {
                                                            Object objB = cVar3.f1819l.b(andDecrement);
                                                            objB.getClass();
                                                            a aVar = (a) objB;
                                                            cVar3.f1819l.c(i4, aVar);
                                                            aVar.f(i4);
                                                            cVar3.c(aVar, andDecrement, i4);
                                                        }
                                                        cVar3.f1819l.c(andDecrement, null);
                                                        this.f1800h = bVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.f1805m;
                            if (this.nextParkedWorker == rVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f1811m;
                                while (true) {
                                    long j5 = atomicLongFieldUpdater2.get(cVar4);
                                    int i5 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f1819l.b((int) (j5 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f1811m.compareAndSet(cVar5, j5, ((j5 + 2097152) & (-2097152)) | ((long) i5))) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z4) {
                            h(b.f1807h);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f1802j);
                            this.f1802j = 0L;
                            break;
                        }
                        z4 = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f1809j);
    }
}
