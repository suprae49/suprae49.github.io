package androidx.emoji2.text;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f590b;

    public w(int i4) {
        this.f589a = new SparseArray(i4);
    }

    public final void a(a0 a0Var, int i4, int i5) {
        int iA = a0Var.a(i4);
        SparseArray sparseArray = this.f589a;
        w wVar = sparseArray == null ? null : (w) sparseArray.get(iA);
        if (wVar == null) {
            wVar = new w(1);
            sparseArray.put(a0Var.a(i4), wVar);
        }
        if (i5 > i4) {
            wVar.a(a0Var, i4 + 1, i5);
        } else {
            wVar.f590b = a0Var;
        }
    }
}
