package i3;

import q3.p;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements e {
    public final f f;

    public a(f fVar) {
        this.f = fVar;
    }

    @Override // i3.g
    public e a(f fVar) {
        fVar.getClass();
        if (r3.g.a(getKey(), fVar)) {
            return this;
        }
        return null;
    }

    @Override // i3.g
    public final g b(g gVar) {
        return e4.a.W(this, gVar);
    }

    @Override // i3.g
    public g f(f fVar) {
        fVar.getClass();
        return r3.g.a(getKey(), fVar) ? h.f : this;
    }

    @Override // i3.g
    public final Object g(Object obj, p pVar) {
        return pVar.f(obj, this);
    }

    @Override // i3.e
    public final f getKey() {
        return this.f;
    }
}
