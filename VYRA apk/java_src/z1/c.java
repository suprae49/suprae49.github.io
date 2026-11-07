package z1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4862d;

    public c(List list) {
        boolean z4 = true ^ (list == null || list.isEmpty());
        boolean zContains = list != null ? list.contains("copyLink") : false;
        boolean zContains2 = list != null ? list.contains("openExternal") : false;
        boolean zContains3 = list != null ? list.contains("shareExternal") : false;
        this.f4859a = z4;
        this.f4860b = zContains;
        this.f4861c = zContains2;
        this.f4862d = zContains3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4859a == cVar.f4859a && this.f4860b == cVar.f4860b && this.f4861c == cVar.f4861c && this.f4862d == cVar.f4862d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4862d) + ((Boolean.hashCode(this.f4861c) + ((Boolean.hashCode(this.f4860b) + (Boolean.hashCode(this.f4859a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LinkActions(enabled=" + this.f4859a + ", copy=" + this.f4860b + ", open=" + this.f4861c + ", share=" + this.f4862d + ")";
    }
}
