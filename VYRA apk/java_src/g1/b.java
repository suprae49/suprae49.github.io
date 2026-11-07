package g1;

import a3.f;
import androidx.fragment.app.q;
import androidx.lifecycle.p0;
import p.l;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class b extends p0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f2143e = new f(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f2144d = new l();

    @Override // androidx.lifecycle.p0
    public final void b() {
        l lVar = this.f2144d;
        int i4 = lVar.f3159h;
        Object[] objArr = lVar.f3158g;
        if (i4 > 0) {
            objArr[0].getClass();
            q.c();
            return;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        lVar.f3159h = 0;
    }
}
