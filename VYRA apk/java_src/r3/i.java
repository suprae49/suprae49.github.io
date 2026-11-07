package r3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3613a;

    public i(Class cls) {
        this.f3613a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f3613a.equals(((i) obj).f3613a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3613a.hashCode();
    }

    public final String toString() {
        return this.f3613a + " (Kotlin reflection is not available)";
    }
}
