package m;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {
    public c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3046g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f3047h;

    public d(f fVar) {
        this.f3047h = fVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        c cVar2 = this.f;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f3045i;
            this.f = cVar3;
            this.f3046g = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3046g) {
            return this.f3047h.f != null;
        }
        c cVar = this.f;
        return (cVar == null || cVar.f3044h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3046g) {
            this.f3046g = false;
            this.f = this.f3047h.f;
        } else {
            c cVar = this.f;
            this.f = cVar != null ? cVar.f3044h : null;
        }
        return this.f;
    }
}
