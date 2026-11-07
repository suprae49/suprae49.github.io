package s;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {
    public boolean f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3650j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3656q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3647g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3648h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3649i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3651k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f3652l = new float[9];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float[] f3653m = new float[9];
    public b[] n = new b[16];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3654o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3655p = 0;

    public f(int i4) {
        this.f3656q = i4;
    }

    public final void a(b bVar) {
        int i4 = 0;
        while (true) {
            int i5 = this.f3654o;
            b[] bVarArr = this.n;
            if (i4 >= i5) {
                if (i5 >= bVarArr.length) {
                    this.n = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.n;
                int i6 = this.f3654o;
                bVarArr2[i6] = bVar;
                this.f3654o = i6 + 1;
                return;
            }
            if (bVarArr[i4] == bVar) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void b(b bVar) {
        int i4 = this.f3654o;
        int i5 = 0;
        while (i5 < i4) {
            if (this.n[i5] == bVar) {
                while (i5 < i4 - 1) {
                    b[] bVarArr = this.n;
                    int i6 = i5 + 1;
                    bVarArr[i5] = bVarArr[i6];
                    i5 = i6;
                }
                this.f3654o--;
                return;
            }
            i5++;
        }
    }

    public final void c() {
        this.f3656q = 5;
        this.f3649i = 0;
        this.f3647g = -1;
        this.f3648h = -1;
        this.f3650j = 0.0f;
        this.f3651k = false;
        int i4 = this.f3654o;
        for (int i5 = 0; i5 < i4; i5++) {
            this.n[i5] = null;
        }
        this.f3654o = 0;
        this.f3655p = 0;
        this.f = false;
        Arrays.fill(this.f3653m, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3647g - ((f) obj).f3647g;
    }

    public final void d(c cVar, float f) {
        this.f3650j = f;
        this.f3651k = true;
        int i4 = this.f3654o;
        this.f3648h = -1;
        for (int i5 = 0; i5 < i4; i5++) {
            this.n[i5].h(cVar, this, false);
        }
        this.f3654o = 0;
    }

    public final void e(c cVar, b bVar) {
        int i4 = this.f3654o;
        for (int i5 = 0; i5 < i4; i5++) {
            this.n[i5].i(cVar, bVar, false);
        }
        this.f3654o = 0;
    }

    public final String toString() {
        return "" + this.f3647g;
    }
}
