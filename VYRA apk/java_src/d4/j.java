package d4;

import b4.p;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f1828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f1831e;
    public static final g f;

    static {
        String property;
        int i4 = p.f1110a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f1827a = property;
        f1828b = b4.d.e(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i5 = p.f1110a;
        if (i5 < 2) {
            i5 = 2;
        }
        f1829c = b4.d.f("kotlinx.coroutines.scheduler.core.pool.size", i5, 8);
        f1830d = b4.d.f("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f1831e = TimeUnit.SECONDS.toNanos(b4.d.e(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = g.f1824a;
    }
}
