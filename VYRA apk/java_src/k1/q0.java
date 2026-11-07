package k1;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f2878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2879b;

    public final p0 a(int i4) {
        SparseArray sparseArray = this.f2878a;
        p0 p0Var = (p0) sparseArray.get(i4);
        if (p0Var != null) {
            return p0Var;
        }
        p0 p0Var2 = new p0();
        sparseArray.put(i4, p0Var2);
        return p0Var2;
    }
}
