package p0;

import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f3197a;

    public h(DisplayCutout displayCutout) {
        this.f3197a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.f3197a.equals(((h) obj).f3197a);
    }

    public final int hashCode() {
        return this.f3197a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3197a + "}";
    }
}
