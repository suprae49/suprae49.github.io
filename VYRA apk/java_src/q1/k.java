package q1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0.d[] f3416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3418c;

    public k(k kVar) {
        this.f3416a = null;
        this.f3418c = 0;
        this.f3417b = kVar.f3417b;
        f0.d[] dVarArr = kVar.f3416a;
        f0.d[] dVarArr2 = new f0.d[dVarArr.length];
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            dVarArr2[i4] = new f0.d(dVarArr[i4]);
        }
        this.f3416a = dVarArr2;
    }

    public f0.d[] getPathData() {
        return this.f3416a;
    }

    public String getPathName() {
        return this.f3417b;
    }

    public void setPathData(f0.d[] dVarArr) {
        f0.d[] dVarArr2 = this.f3416a;
        if (dVarArr2 != null && dVarArr != null && dVarArr2.length == dVarArr.length) {
            int i4 = 0;
            while (true) {
                if (i4 >= dVarArr2.length) {
                    f0.d[] dVarArr3 = this.f3416a;
                    for (int i5 = 0; i5 < dVarArr.length; i5++) {
                        dVarArr3[i5].f2071a = dVarArr[i5].f2071a;
                        int i6 = 0;
                        while (true) {
                            float[] fArr = dVarArr[i5].f2072b;
                            if (i6 < fArr.length) {
                                dVarArr3[i5].f2072b[i6] = fArr[i6];
                                i6++;
                            }
                        }
                    }
                    return;
                }
                f0.d dVar = dVarArr2[i4];
                char c4 = dVar.f2071a;
                f0.d dVar2 = dVarArr[i4];
                if (c4 != dVar2.f2071a || dVar.f2072b.length != dVar2.f2072b.length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        f0.d[] dVarArr4 = new f0.d[dVarArr.length];
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            dVarArr4[i7] = new f0.d(dVarArr[i7]);
        }
        this.f3416a = dVarArr4;
    }

    public k() {
        this.f3416a = null;
        this.f3418c = 0;
    }
}
