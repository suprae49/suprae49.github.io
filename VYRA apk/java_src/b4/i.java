package b4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1099a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new k(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1099a;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            int iA = kVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                k kVarC = kVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, kVarC) && atomicReferenceFieldUpdater.get(this) == kVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1099a;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            if (kVar.b()) {
                return;
            }
            k kVarC = kVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, kVarC) && atomicReferenceFieldUpdater.get(this) == kVar) {
            }
        }
    }

    public final int c() {
        k kVar = (k) f1099a.get(this);
        kVar.getClass();
        long j4 = k.f.get(kVar);
        return (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j4))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1099a;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            Object objD = kVar.d();
            if (objD != k.f1102g) {
                return objD;
            }
            k kVarC = kVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, kVarC) && atomicReferenceFieldUpdater.get(this) == kVar) {
            }
        }
    }
}
