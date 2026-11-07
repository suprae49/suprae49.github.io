package z3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b4.o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4922j = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // b4.o, z3.e0
    public final void h(Object obj) {
        i(obj);
    }

    @Override // b4.o, z3.e0
    public final void i(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f4922j;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 == 1) {
                    b4.d.d(e4.a.N(this.f1109i), l.d(obj));
                    return;
                } else {
                    androidx.fragment.app.q.j("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
