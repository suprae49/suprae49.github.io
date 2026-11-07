package s0;

import androidx.fragment.app.u;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f3658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3660d;

    public a(e eVar, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f3657a = arrayList2;
        if (arrayList.size() > 0) {
            throw u.i(0, arrayList);
        }
        if (arrayList.size() > 0) {
            throw u.i(0, arrayList);
        }
        ArrayList arrayList3 = eVar.f3666b;
        if (!arrayList3.contains(this)) {
            arrayList3.add(this);
            int size = arrayList2.size() - 1;
            if (size >= 0) {
                throw u.i(size, arrayList2);
            }
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                throw u.i(size2, arrayList2);
            }
        }
        this.f3658b = eVar;
    }
}
