package p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f3201a;

    static {
        new j("", 0, 0);
    }

    public j(String str, int i4, int i5) {
        this.f3201a = new i(str, i4, i5);
    }

    public static j a(int i4, int i5, boolean z4, int i6, int i7, int i8, int i9) {
        String string;
        if (z4) {
            int i10 = i4 / 2;
            int i11 = i5 / 2;
            string = "M0," + i11 + " A" + i10 + "," + i11 + " 0 1,1 " + i4 + "," + i11 + " A" + i10 + "," + i11 + " 0 1,1 0," + i11 + " Z";
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int iMin = Math.min(i4 / 2, i5 / 2);
            int iMin2 = Math.min(iMin, i6);
            int iMin3 = Math.min(iMin, i7);
            int iMin4 = Math.min(iMin, i8);
            int iMin5 = Math.min(iMin, i9);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i4 - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                sb.append(" A ");
                sb.append(iMin3);
                sb.append(",");
                sb.append(iMin3);
                sb.append(" 0 0,1 ");
                sb.append(i4);
                sb.append(",");
                sb.append(iMin3);
            }
            sb.append(" L ");
            sb.append(i4);
            sb.append(",");
            sb.append(i5 - iMin4);
            if (iMin4 > 0) {
                sb.append(" A ");
                sb.append(iMin4);
                sb.append(",");
                sb.append(iMin4);
                sb.append(" 0 0,1 ");
                sb.append(i4 - iMin4);
                sb.append(",");
                sb.append(i5);
            }
            sb.append(" L ");
            sb.append(iMin5);
            sb.append(",");
            sb.append(i5);
            if (iMin5 > 0) {
                sb.append(" A ");
                sb.append(iMin5);
                sb.append(",");
                sb.append(iMin5);
                sb.append(" 0 0,1 0,");
                sb.append(i5 - iMin5);
            }
            if (iMin2 > 0) {
                sb.append(" L 0,");
                sb.append(iMin2);
                sb.append(" A ");
                sb.append(iMin2);
                sb.append(",");
                sb.append(iMin2);
                sb.append(" 0 0,1 ");
                sb.append(iMin2);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new j(string, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f3201a.equals(((j) obj).f3201a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3201a.hashCode();
    }

    public final String toString() {
        return this.f3201a.toString();
    }
}
