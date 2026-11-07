package p0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3200c;

    public i(String str, int i4, int i5) {
        this.f3198a = str;
        this.f3199b = i4;
        this.f3200c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3198a.equals(iVar.f3198a) && this.f3199b == iVar.f3199b && this.f3200c == iVar.f3200c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f3199b);
        Integer numValueOf2 = Integer.valueOf(this.f3200c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f3198a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        return "DisplayShapeCompat{ spec=" + Integer.valueOf(this.f3198a.hashCode()) + " displayWidth=" + this.f3199b + " displayHeight=" + this.f3200c + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
