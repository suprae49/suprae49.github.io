package l;

import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e4.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile a f2973i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f2974h;

    public a(int i4) {
        switch (i4) {
            case 1:
                this.f2974h = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f2974h = new a(1);
                break;
        }
    }

    public static a o0() {
        if (f2973i != null) {
            return f2973i;
        }
        synchronized (a.class) {
            try {
                if (f2973i == null) {
                    f2973i = new a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2973i;
    }
}
