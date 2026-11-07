package x;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f4552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f4553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f4555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f4556e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f4557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f4558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f4560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f4561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4562l;

    public final void a(int i4, float f) {
        int i5 = this.f;
        int[] iArr = this.f4555d;
        if (i5 >= iArr.length) {
            this.f4555d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4556e;
            this.f4556e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f4555d;
        int i6 = this.f;
        iArr2[i6] = i4;
        float[] fArr2 = this.f4556e;
        this.f = i6 + 1;
        fArr2[i6] = f;
    }

    public final void b(int i4, int i5) {
        int i6 = this.f4554c;
        int[] iArr = this.f4552a;
        if (i6 >= iArr.length) {
            this.f4552a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4553b;
            this.f4553b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4552a;
        int i7 = this.f4554c;
        iArr3[i7] = i4;
        int[] iArr4 = this.f4553b;
        this.f4554c = i7 + 1;
        iArr4[i7] = i5;
    }

    public final void c(int i4, String str) {
        int i5 = this.f4559i;
        int[] iArr = this.f4557g;
        if (i5 >= iArr.length) {
            this.f4557g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f4558h;
            this.f4558h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4557g;
        int i6 = this.f4559i;
        iArr2[i6] = i4;
        String[] strArr2 = this.f4558h;
        this.f4559i = i6 + 1;
        strArr2[i6] = str;
    }

    public final void d(int i4, boolean z4) {
        int i5 = this.f4562l;
        int[] iArr = this.f4560j;
        if (i5 >= iArr.length) {
            this.f4560j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4561k;
            this.f4561k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4560j;
        int i6 = this.f4562l;
        iArr2[i6] = i4;
        boolean[] zArr2 = this.f4561k;
        this.f4562l = i6 + 1;
        zArr2[i6] = z4;
    }
}
