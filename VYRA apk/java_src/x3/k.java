package x3;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Iterator, s3.a {
    public final Iterator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f4760g;

    public k(l lVar) {
        this.f4760g = lVar;
        this.f = ((g) lVar.f4762b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((q3.l) this.f4760g.f4763c).g(this.f.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
