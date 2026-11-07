package z3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4903b = AtomicIntegerFieldUpdater.newUpdater(e.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f4904a;

    public e(Throwable th) {
        this.f4904a = th;
    }

    public final String toString() {
        return e.class.getSimpleName() + '[' + this.f4904a + ']';
    }
}
