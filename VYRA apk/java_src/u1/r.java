package u1;

import android.webkit.WebChromeClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebChromeClient.FileChooserParams f4067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4070d;

    public r(WebChromeClient.FileChooserParams fileChooserParams) {
        ArrayList arrayList = new ArrayList();
        this.f4067a = fileChooserParams;
        this.f4068b = arrayList;
        this.f4069c = false;
        this.f4070d = false;
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        acceptTypes.getClass();
        ArrayList arrayList2 = new ArrayList(x3.h.t(new x3.d(new x3.l(new x3.d(new x3.e(acceptTypes.length == 0 ? x3.b.f4747a : new h3.e(0, acceptTypes), new q(0), new q(4)), true, new q(1)), new q(2)), false, new q(5))));
        this.f4068b = arrayList2;
        if (arrayList2.isEmpty()) {
            arrayList2.add("*/*");
        }
    }

    public final boolean a() {
        List list = this.f4068b;
        if (list.contains("*/*")) {
            return true;
        }
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (y3.j.t((String) it.next(), "image/")) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        List list = this.f4068b;
        if (list.contains("*/*")) {
            return true;
        }
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (y3.j.t((String) it.next(), "video/")) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return r3.g.a(this.f4067a, rVar.f4067a) && r3.g.a(this.f4068b, rVar.f4068b) && this.f4069c == rVar.f4069c && this.f4070d == rVar.f4070d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4070d) + ((Boolean.hashCode(this.f4069c) + ((this.f4068b.hashCode() + (this.f4067a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FileUploadOptions(fileChooserParams=" + this.f4067a + ", mimeTypes=" + this.f4068b + ", canUseCamera=" + this.f4069c + ", canSaveToPublicStorage=" + this.f4070d + ")";
    }
}
