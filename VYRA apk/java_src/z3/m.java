package z3;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends u implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final m n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f4920o;

    static {
        Long l4;
        m mVar = new m();
        n = mVar;
        mVar.f4928h = 1 + mVar.f4928h;
        mVar.f4929i = true;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f4920o = TimeUnit.MILLISECONDS.toNanos(l4.longValue());
    }

    @Override // z3.u
    public final void i(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.i(runnable);
    }

    @Override // z3.u
    public final Thread j() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(n.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    public final synchronized void n() {
        int i4 = debugStatus;
        if (i4 == 2 || i4 == 3) {
            debugStatus = 3;
            u.f4925k.set(this, null);
            u.f4926l.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0.f4910a.set(this);
        try {
            synchronized (this) {
                int i4 = debugStatus;
                if (i4 == 2 || i4 == 3) {
                    _thread = null;
                    n();
                    if (k()) {
                        return;
                    }
                    j();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j4 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jL = l();
                    if (jL == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = f4920o + jNanoTime;
                        }
                        long j5 = j4 - jNanoTime;
                        if (j5 <= 0) {
                            _thread = null;
                            n();
                            if (k()) {
                                return;
                            }
                            j();
                            return;
                        }
                        if (jL > j5) {
                            jL = j5;
                        }
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (jL > 0) {
                        int i5 = debugStatus;
                        if (i5 == 2 || i5 == 3) {
                            _thread = null;
                            n();
                            if (k()) {
                                return;
                            }
                            j();
                            return;
                        }
                        LockSupport.parkNanos(this, jL);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            n();
            if (!k()) {
                j();
            }
            throw th;
        }
    }

    @Override // z3.u
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // z3.h
    public final String toString() {
        return "DefaultExecutor";
    }
}
