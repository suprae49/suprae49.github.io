package l0;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2985e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2986g;

    public d(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f2981a = str;
        str2.getClass();
        this.f2982b = str2;
        this.f2983c = str3;
        list.getClass();
        this.f2984d = list;
        this.f2985e = str4;
        this.f = str5;
        this.f2986g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2981a + ", mProviderPackage: " + this.f2982b + ", mQuery: " + this.f2983c + ", mSystemFont: " + this.f2985e + ", mVariationSettings: " + this.f + ", mCertificates:");
        int i4 = 0;
        while (true) {
            List list = this.f2984d;
            if (i4 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i4);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i4++;
        }
    }
}
