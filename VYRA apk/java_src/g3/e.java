package g3;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Serializable {
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f2154h;

    public e(String str, String str2, Comparable comparable) {
        this.f = str;
        this.f2153g = str2;
        this.f2154h = comparable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f.equals(eVar.f) && this.f2153g.equals(eVar.f2153g) && r3.g.a(this.f2154h, eVar.f2154h);
    }

    public final int hashCode() {
        int iHashCode = (this.f2153g.hashCode() + (this.f.hashCode() * 31)) * 31;
        Object obj = this.f2154h;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "(" + ((Object) this.f) + ", " + ((Object) this.f2153g) + ", " + this.f2154h + ')';
    }
}
