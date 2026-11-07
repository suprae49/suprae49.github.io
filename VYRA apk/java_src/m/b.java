package m;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {
    public c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f3041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3042h;

    public b(c cVar, c cVar2, int i4) {
        this.f3042h = i4;
        this.f = cVar2;
        this.f3041g = cVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f == cVar && cVar == this.f3041g) {
            this.f3041g = null;
            this.f = null;
        }
        c cVar3 = this.f;
        if (cVar3 == cVar) {
            switch (this.f3042h) {
                case 0:
                    cVar2 = cVar3.f3045i;
                    break;
                default:
                    cVar2 = cVar3.f3044h;
                    break;
            }
            this.f = cVar2;
        }
        c cVar4 = this.f3041g;
        if (cVar4 == cVar) {
            c cVar5 = this.f;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f3041g = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f3042h) {
            case 0:
                return cVar.f3044h;
            default:
                return cVar.f3045i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3041g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f3041g;
        c cVar2 = this.f;
        this.f3041g = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
