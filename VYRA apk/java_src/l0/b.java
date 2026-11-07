package l0;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f2978c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f2976a, bVar.f2976a) && Objects.equals(this.f2977b, bVar.f2977b) && Objects.equals(this.f2978c, bVar.f2978c);
    }

    public final int hashCode() {
        return Objects.hash(this.f2976a, this.f2977b, this.f2978c);
    }
}
