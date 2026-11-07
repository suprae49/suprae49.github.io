package v;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4257m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f4250e = 2;
        } else {
            this.f4250e = 3;
        }
    }

    @Override // v.f
    public final void d(int i4) {
        if (this.f4254j) {
            return;
        }
        this.f4254j = true;
        this.f4251g = i4;
        ArrayList arrayList = this.f4255k;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}
