package g3;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2150g;

    public b(Object obj, Object obj2) {
        this.f = obj;
        this.f2150g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return r3.g.a(this.f, bVar.f) && r3.g.a(this.f2150g, bVar.f2150g);
    }

    public final int hashCode() {
        Object obj = this.f;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2150g;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f + ", " + this.f2150g + ')';
    }
}
