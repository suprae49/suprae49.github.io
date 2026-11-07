package e0;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f2029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f2030b;

    public j(Resources resources, Resources.Theme theme) {
        this.f2029a = resources;
        this.f2030b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f2029a.equals(jVar.f2029a) && Objects.equals(this.f2030b, jVar.f2030b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2029a, this.f2030b);
    }
}
