package x1;

import android.util.Log;
import androidx.fragment.app.u;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static f f4715b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4716a;

    public f(int i4) {
        switch (i4) {
            case 1:
                this.f4716a = new ArrayList();
                break;
            case 2:
                this.f4716a = new ArrayList();
                break;
            default:
                this.f4716a = new ArrayList();
                break;
        }
    }

    public static synchronized f a() {
        try {
            if (f4715b == null) {
                f4715b = new f(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4715b;
    }

    public String b(String str) {
        ArrayList arrayList = this.f4716a;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f4716a;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                l lVar = (l) obj;
                if (lVar.f4721b.matcher(str).matches()) {
                    return lVar.f4720a;
                }
            }
        }
        return "internal";
    }

    public void c(String str, String str2) {
        d(str, str2, null);
    }

    public void d(String str, String str2, Exception exc) {
        Log.e(str, str2, exc);
        ArrayList arrayList = this.f4716a;
        if (arrayList.size() > 0) {
            throw u.i(0, arrayList);
        }
    }

    public void e(String str, String str2, Exception exc) {
        d(str, str2, exc);
    }

    public synchronized void f() {
        ArrayList arrayList = this.f4716a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((e) obj).a();
        }
    }

    public synchronized void g() {
        ArrayList arrayList = this.f4716a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((e) obj).d();
        }
    }
}
