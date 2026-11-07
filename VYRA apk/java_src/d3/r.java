package d3;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f1730a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f1731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1733d;

    public r(s sVar, androidx.emoji2.text.t tVar) {
        this.f1731b = sVar;
        TypedArray typedArray = (TypedArray) tVar.f579c;
        this.f1732c = typedArray.getResourceId(28, 0);
        this.f1733d = typedArray.getResourceId(53, 0);
    }
}
