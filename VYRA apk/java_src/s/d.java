package s;

import androidx.emoji2.text.p;
import java.util.Arrays;
import k1.m;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public f[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f[] f3644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f3646i;

    @Override // s.b
    public final f d(boolean[] zArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < this.f3645h; i5++) {
            f[] fVarArr = this.f;
            f fVar = fVarArr[i5];
            if (!zArr[fVar.f3647g]) {
                p pVar = this.f3646i;
                pVar.f568g = fVar;
                int i6 = 8;
                if (i4 != -1) {
                    f fVar2 = fVarArr[i4];
                    while (i6 >= 0) {
                        float f = fVar2.f3653m[i6];
                        float f4 = ((f) pVar.f568g).f3653m[i6];
                        if (f4 != f) {
                            if (f4 >= f) {
                                break;
                            }
                            i4 = i5;
                            break;
                            break;
                        }
                        i6--;
                    }
                } else {
                    while (i6 >= 0) {
                        float f5 = ((f) pVar.f568g).f3653m[i6];
                        if (f5 > 0.0f) {
                            break;
                        }
                        if (f5 < 0.0f) {
                            i4 = i5;
                            break;
                        }
                        i6--;
                    }
                }
            }
        }
        if (i4 == -1) {
            return null;
        }
        return this.f[i4];
    }

    @Override // s.b
    public final boolean e() {
        return this.f3645h == 0;
    }

    @Override // s.b
    public final void i(c cVar, b bVar, boolean z4) {
        f fVar = bVar.f3624a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.f3653m;
        a aVar = bVar.f3627d;
        int iD = aVar.d();
        for (int i4 = 0; i4 < iD; i4++) {
            f fVarE = aVar.e(i4);
            float f = aVar.f(i4);
            p pVar = this.f3646i;
            pVar.f568g = fVarE;
            if (fVarE.f) {
                boolean z5 = true;
                for (int i5 = 0; i5 < 9; i5++) {
                    float[] fArr2 = ((f) pVar.f568g).f3653m;
                    float f4 = (fArr[i5] * f) + fArr2[i5];
                    fArr2[i5] = f4;
                    if (Math.abs(f4) < 1.0E-4f) {
                        ((f) pVar.f568g).f3653m[i5] = 0.0f;
                    } else {
                        z5 = false;
                    }
                }
                if (z5) {
                    ((d) pVar.f569h).k((f) pVar.f568g);
                }
            } else {
                for (int i6 = 0; i6 < 9; i6++) {
                    float f5 = fArr[i6];
                    if (f5 != 0.0f) {
                        float f6 = f5 * f;
                        if (Math.abs(f6) < 1.0E-4f) {
                            f6 = 0.0f;
                        }
                        ((f) pVar.f568g).f3653m[i6] = f6;
                    } else {
                        ((f) pVar.f568g).f3653m[i6] = 0.0f;
                    }
                }
                j(fVarE);
            }
            this.f3625b = (bVar.f3625b * f) + this.f3625b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i4;
        f[] fVarArr;
        int i5 = this.f3645h + 1;
        f[] fVarArr2 = this.f;
        if (i5 > fVarArr2.length) {
            f[] fVarArr3 = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
            this.f = fVarArr3;
            this.f3644g = (f[]) Arrays.copyOf(fVarArr3, fVarArr3.length * 2);
        }
        f[] fVarArr4 = this.f;
        int i6 = this.f3645h;
        fVarArr4[i6] = fVar;
        int i7 = i6 + 1;
        this.f3645h = i7;
        if (i7 > 1 && fVarArr4[i6].f3647g > fVar.f3647g) {
            int i8 = 0;
            while (true) {
                i4 = this.f3645h;
                fVarArr = this.f3644g;
                if (i8 >= i4) {
                    break;
                }
                fVarArr[i8] = this.f[i8];
                i8++;
            }
            Arrays.sort(fVarArr, 0, i4, new m(2));
            for (int i9 = 0; i9 < this.f3645h; i9++) {
                this.f[i9] = this.f3644g[i9];
            }
        }
        fVar.f = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i4 = 0;
        while (i4 < this.f3645h) {
            if (this.f[i4] == fVar) {
                while (true) {
                    int i5 = this.f3645h;
                    if (i4 >= i5 - 1) {
                        this.f3645h = i5 - 1;
                        fVar.f = false;
                        return;
                    } else {
                        f[] fVarArr = this.f;
                        int i6 = i4 + 1;
                        fVarArr[i4] = fVarArr[i6];
                        i4 = i6;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    @Override // s.b
    public final String toString() {
        p pVar = this.f3646i;
        String str = " goal -> (" + this.f3625b + ") : ";
        for (int i4 = 0; i4 < this.f3645h; i4++) {
            pVar.f568g = this.f[i4];
            str = str + pVar + " ";
        }
        return str;
    }
}
