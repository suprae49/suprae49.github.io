package b4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1096a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1097b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1098c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(h hVar, int i4) {
        while (true) {
            h hVarF = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1097b;
            if (hVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    hVarF = (h) obj;
                    if (!hVarF.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(hVarF);
                }
            }
            if (hVarF instanceof f) {
                return (((f) hVarF).f1094d & i4) == 0 && hVarF.e(hVar, i4);
            }
            atomicReferenceFieldUpdater.set(hVar, hVarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1096a;
            atomicReferenceFieldUpdater2.set(hVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(hVarF, this, hVar)) {
                    hVar.g(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(hVarF) == this);
        }
    }

    public final h f() {
        h hVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1097b;
            h hVar2 = (h) atomicReferenceFieldUpdater2.get(this);
            hVar = hVar2;
            while (true) {
                h hVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f1096a;
                    obj = atomicReferenceFieldUpdater.get(hVar);
                    if (obj == this) {
                        if (hVar2 != hVar) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, hVar2, hVar)) {
                                if (atomicReferenceFieldUpdater2.get(this) != hVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof m)) {
                        obj.getClass();
                        hVar3 = hVar;
                        hVar = (h) obj;
                    } else {
                        if (hVar3 != null) {
                            break;
                        }
                        hVar = (h) atomicReferenceFieldUpdater2.get(hVar);
                    }
                }
                h hVar4 = ((m) obj).f1108a;
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar3, hVar, hVar4)) {
                    if (atomicReferenceFieldUpdater.get(hVar3) != hVar) {
                        break;
                    }
                }
                hVar = hVar3;
            }
        }
        return hVar;
    }

    public final void g(h hVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1097b;
            h hVar2 = (h) atomicReferenceFieldUpdater.get(hVar);
            if (f1096a.get(this) != hVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(hVar, hVar2, this)) {
                    if (i()) {
                        hVar.f();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(hVar) == hVar2);
        }
    }

    public final h h() {
        Object obj = f1096a.get(this);
        m mVar = obj instanceof m ? (m) obj : null;
        if (mVar != null) {
            return mVar.f1108a;
        }
        obj.getClass();
        return (h) obj;
    }

    public boolean i() {
        return f1096a.get(this) instanceof m;
    }

    public String toString() {
        return new g(this) + '@' + z3.l.b(this);
    }
}
