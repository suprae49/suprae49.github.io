package p0;

import android.graphics.Point;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Point f3245c;

    public t(int i4, int i5, Point point) {
        int i6 = point.x;
        int i7 = point.y;
        this.f3243a = i4;
        this.f3244b = i5;
        this.f3245c = new Point(i6, i7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f3243a == tVar.f3243a && this.f3244b == tVar.f3244b && this.f3245c.equals(tVar.f3245c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3245c.hashCode() + (((this.f3243a * 31) + this.f3244b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i4 = this.f3243a;
        if (i4 == 0) {
            str = "TopLeft";
        } else if (i4 == 1) {
            str = "TopRight";
        } else if (i4 != 2) {
            str = i4 != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.f3244b);
        sb.append(", center=");
        sb.append(this.f3245c);
        sb.append('}');
        return sb.toString();
    }
}
