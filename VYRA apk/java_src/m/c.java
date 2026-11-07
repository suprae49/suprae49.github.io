package m;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f3044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f3045i;

    public c(Object obj, Object obj2) {
        this.f = obj;
        this.f3043g = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f.equals(cVar.f) && this.f3043g.equals(cVar.f3043g);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3043g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f.hashCode() ^ this.f3043g.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f + "=" + this.f3043g;
    }
}
