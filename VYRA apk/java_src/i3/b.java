package i3;

import b4.q;
import java.io.Serializable;
import q3.p;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g, Serializable {
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f2307g;

    public b(e eVar, g gVar) {
        gVar.getClass();
        this.f = gVar;
        this.f2307g = eVar;
    }

    @Override // i3.g
    public final e a(f fVar) {
        fVar.getClass();
        b bVar = this;
        while (true) {
            e eVarA = bVar.f2307g.a(fVar);
            if (eVarA != null) {
                return eVarA;
            }
            g gVar = bVar.f;
            if (!(gVar instanceof b)) {
                return gVar.a(fVar);
            }
            bVar = (b) gVar;
        }
    }

    @Override // i3.g
    public final g b(g gVar) {
        return h0.U(this, gVar);
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i4 = 2;
            b bVar2 = bVar;
            int i5 = 2;
            while (true) {
                g gVar = bVar2.f;
                bVar2 = gVar instanceof b ? (b) gVar : null;
                if (bVar2 == null) {
                    break;
                }
                i5++;
            }
            b bVar3 = this;
            while (true) {
                g gVar2 = bVar3.f;
                bVar3 = gVar2 instanceof b ? (b) gVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i4++;
            }
            if (i5 == i4) {
                b bVar4 = this;
                while (true) {
                    e eVar = bVar4.f2307g;
                    if (!r3.g.a(bVar.a(eVar.getKey()), eVar)) {
                        zA = false;
                        break;
                    }
                    g gVar3 = bVar4.f;
                    if (!(gVar3 instanceof b)) {
                        gVar3.getClass();
                        e eVar2 = (e) gVar3;
                        zA = r3.g.a(bVar.a(eVar2.getKey()), eVar2);
                        break;
                    }
                    bVar4 = (b) gVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // i3.g
    public final g f(f fVar) {
        fVar.getClass();
        e eVar = this.f2307g;
        e eVarA = eVar.a(fVar);
        g gVar = this.f;
        if (eVarA != null) {
            return gVar;
        }
        g gVarF = gVar.f(fVar);
        if (gVarF == gVar) {
            return this;
        }
        return gVarF == h.f ? eVar : new b(eVar, gVarF);
    }

    @Override // i3.g
    public final Object g(Object obj, p pVar) {
        return pVar.f(this.f.g(obj, pVar), this.f2307g);
    }

    public final int hashCode() {
        return this.f2307g.hashCode() + this.f.hashCode();
    }

    public final String toString() {
        return "[" + ((String) g("", new q(3))) + ']';
    }
}
