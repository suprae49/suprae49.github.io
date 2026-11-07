package k1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2765e;

    public final boolean a() {
        int i4;
        int i5;
        int i6;
        int i7 = this.f2761a;
        int i8 = 2;
        if ((i7 & 7) != 0) {
            int i9 = this.f2764d;
            int i10 = this.f2762b;
            if (i9 > i10) {
                i6 = 1;
            } else {
                i6 = i9 == i10 ? 2 : 4;
            }
            if ((i6 & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 112) != 0) {
            int i11 = this.f2764d;
            int i12 = this.f2763c;
            if (i11 > i12) {
                i5 = 1;
            } else {
                i5 = i11 == i12 ? 2 : 4;
            }
            if (((i5 << 4) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 1792) != 0) {
            int i13 = this.f2765e;
            int i14 = this.f2762b;
            if (i13 > i14) {
                i4 = 1;
            } else {
                i4 = i13 == i14 ? 2 : 4;
            }
            if (((i4 << 8) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 28672) != 0) {
            int i15 = this.f2765e;
            int i16 = this.f2763c;
            if (i15 > i16) {
                i8 = 1;
            } else if (i15 != i16) {
                i8 = 4;
            }
            if ((i7 & (i8 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
