package v;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f4260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f4261b;

    public static long a(f fVar, long j4) {
        o oVar = fVar.f4249d;
        ArrayList arrayList = fVar.f4255k;
        if (oVar instanceof j) {
            return j4;
        }
        int size = arrayList.size();
        long jMin = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) arrayList.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4249d != oVar) {
                    jMin = Math.min(jMin, a(fVar2, ((long) fVar2.f) + j4));
                }
            }
        }
        f fVar3 = oVar.f4276i;
        f fVar4 = oVar.f4275h;
        if (fVar != fVar3) {
            return jMin;
        }
        long j5 = j4 - oVar.j();
        return Math.min(Math.min(jMin, a(fVar4, j5)), j5 - ((long) fVar4.f));
    }

    public static long b(f fVar, long j4) {
        o oVar = fVar.f4249d;
        ArrayList arrayList = fVar.f4255k;
        if (oVar instanceof j) {
            return j4;
        }
        int size = arrayList.size();
        long jMax = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) arrayList.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4249d != oVar) {
                    jMax = Math.max(jMax, b(fVar2, ((long) fVar2.f) + j4));
                }
            }
        }
        f fVar3 = oVar.f4275h;
        f fVar4 = oVar.f4276i;
        if (fVar != fVar3) {
            return jMax;
        }
        long j5 = oVar.j() + j4;
        return Math.max(Math.max(jMax, b(fVar4, j5)), j5 - ((long) fVar4.f));
    }
}
