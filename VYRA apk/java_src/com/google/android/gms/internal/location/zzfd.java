package com.google.android.gms.internal.location;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfd {
    public static boolean zza(CountDownLatch countDownLatch, long j4, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z4 = false;
        try {
            long nanos = timeUnit.toNanos(30L);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th) {
            if (z4) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }
}
