package z3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4893h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0() {
        super(true);
        boolean z4 = true;
        u(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e0.f4905g;
        c cVar = (c) atomicReferenceFieldUpdater.get(this);
        d dVar = cVar instanceof d ? (d) cVar : null;
        if (dVar == null) {
            z4 = false;
            break;
        }
        e0 e0VarJ = dVar.j();
        while (!e0VarJ.q()) {
            c cVar2 = (c) atomicReferenceFieldUpdater.get(e0VarJ);
            d dVar2 = cVar2 instanceof d ? (d) cVar2 : null;
            if (dVar2 == null) {
                z4 = false;
                break;
            }
            e0VarJ = dVar2.j();
        }
        this.f4893h = z4;
    }

    @Override // z3.e0
    public final boolean q() {
        return this.f4893h;
    }
}
