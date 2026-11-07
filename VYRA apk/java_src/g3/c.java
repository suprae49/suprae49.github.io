package g3;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Serializable {
    public final Throwable f;

    public c(Throwable th) {
        this.f = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f.equals(((c) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f + ')';
    }
}
