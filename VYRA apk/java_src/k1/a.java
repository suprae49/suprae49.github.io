package k1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2728d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i4 = this.f2725a;
            if (i4 != aVar.f2725a) {
                return false;
            }
            if (i4 != 8 || Math.abs(this.f2728d - this.f2726b) != 1 || this.f2728d != aVar.f2726b || this.f2726b != aVar.f2728d) {
                if (this.f2728d != aVar.f2728d || this.f2726b != aVar.f2726b) {
                    return false;
                }
                Object obj2 = this.f2727c;
                Object obj3 = aVar.f2727c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f2725a * 31) + this.f2726b) * 31) + this.f2728d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i4 = this.f2725a;
        if (i4 == 1) {
            str = "add";
        } else if (i4 == 2) {
            str = "rm";
        } else if (i4 != 4) {
            str = i4 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f2726b);
        sb.append("c:");
        sb.append(this.f2728d);
        sb.append(",p:");
        sb.append(this.f2727c);
        sb.append("]");
        return sb.toString();
    }
}
