package r;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3484l;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3480h = atomicReferenceFieldUpdater;
        this.f3481i = atomicReferenceFieldUpdater2;
        this.f3482j = atomicReferenceFieldUpdater3;
        this.f3483k = atomicReferenceFieldUpdater4;
        this.f3484l = atomicReferenceFieldUpdater5;
    }

    @Override // e4.a
    public final void X(f fVar, f fVar2) {
        this.f3481i.lazySet(fVar, fVar2);
    }

    @Override // e4.a
    public final void Y(f fVar, Thread thread) {
        this.f3480h.lazySet(fVar, thread);
    }

    @Override // e4.a
    public final boolean f(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3483k;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, c.f3478b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // e4.a
    public final boolean g(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3484l;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // e4.a
    public final boolean h(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3482j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
