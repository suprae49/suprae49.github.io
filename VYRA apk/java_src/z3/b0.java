package z3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends b4.h implements r, x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f4894d;

    @Override // z3.r
    public final void a() {
        e0 e0VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e0.f;
            Object obj = atomicReferenceFieldUpdater.get(e0VarJ);
            if (obj instanceof b0) {
                if (obj != this) {
                    return;
                }
                s sVar = l.f4919h;
                while (!atomicReferenceFieldUpdater.compareAndSet(e0VarJ, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(e0VarJ) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof x) || ((x) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b4.h.f1096a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof b4.m) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                b4.h hVar = (b4.h) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = b4.h.f1098c;
                b4.m mVar = (b4.m) atomicReferenceFieldUpdater3.get(hVar);
                if (mVar == null) {
                    mVar = new b4.m(hVar);
                    atomicReferenceFieldUpdater3.set(hVar, mVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, mVar)) {
                        hVar.f();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    @Override // z3.x
    public final boolean b() {
        return true;
    }

    @Override // z3.x
    public final f0 d() {
        return null;
    }

    public final e0 j() {
        e0 e0Var = this.f4894d;
        if (e0Var != null) {
            return e0Var;
        }
        r3.g.c("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // b4.h
    public final String toString() {
        return getClass().getSimpleName() + '@' + l.b(this) + "[job@" + l.b(j()) + ']';
    }
}
