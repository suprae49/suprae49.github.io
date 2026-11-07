package u;

import java.util.ArrayList;
import v.n;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public d[] f3841q0 = new d[4];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f3842r0 = 0;

    public final void R(int i4, ArrayList arrayList, n nVar) {
        for (int i5 = 0; i5 < this.f3842r0; i5++) {
            d dVar = this.f3841q0[i5];
            ArrayList arrayList2 = nVar.f4264a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i6 = 0; i6 < this.f3842r0; i6++) {
            v.h.b(this.f3841q0[i6], i4, arrayList, nVar);
        }
    }

    public void S() {
    }
}
