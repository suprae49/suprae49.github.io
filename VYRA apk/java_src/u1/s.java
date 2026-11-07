package u1;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri[] f4088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4089c;

    public s(boolean z4, Uri[] uriArr, boolean z5) {
        this.f4087a = z4;
        this.f4088b = uriArr;
        this.f4089c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f4087a == sVar.f4087a && r3.g.a(this.f4088b, sVar.f4088b) && this.f4089c == sVar.f4089c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f4087a) * 31;
        Uri[] uriArr = this.f4088b;
        return Boolean.hashCode(this.f4089c) + ((iHashCode + (uriArr == null ? 0 : Arrays.hashCode(uriArr))) * 31);
    }

    public final String toString() {
        return "FileUploadResult(success=" + this.f4087a + ", result=" + Arrays.toString(this.f4088b) + ", shouldResizeCameraImage=" + this.f4089c + ")";
    }
}
