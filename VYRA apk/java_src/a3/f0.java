package a3;

import android.util.StateSet;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f56b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[][] f57c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o[] f58d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e0 f59e;
    public e0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f60g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e0 f61h;

    public f0(o oVar) {
        c();
        a(StateSet.WILD_CARD, oVar);
    }

    public final void a(int[] iArr, o oVar) {
        int i4 = this.f55a;
        if (i4 == 0 || iArr.length == 0) {
            this.f56b = oVar;
        }
        int[][] iArr2 = this.f57c;
        if (i4 >= iArr2.length) {
            int i5 = i4 + 10;
            int[][] iArr3 = new int[i5][];
            System.arraycopy(iArr2, 0, iArr3, 0, i4);
            this.f57c = iArr3;
            o[] oVarArr = new o[i5];
            System.arraycopy(this.f58d, 0, oVarArr, 0, i4);
            this.f58d = oVarArr;
        }
        int[][] iArr4 = this.f57c;
        int i6 = this.f55a;
        iArr4[i6] = iArr;
        this.f58d[i6] = oVar;
        this.f55a = i6 + 1;
    }

    public final g0 b() {
        if (this.f55a == 0) {
            return null;
        }
        return new g0(this);
    }

    public final void c() {
        this.f56b = new o();
        this.f57c = new int[10][];
        this.f58d = new o[10];
    }
}
