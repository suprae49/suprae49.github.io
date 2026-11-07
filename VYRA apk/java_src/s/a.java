package s;

import androidx.emoji2.text.t;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f3616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f3617c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3615a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3618d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f3619e = new int[8];
    public int[] f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f3620g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3621h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3622i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3623j = false;

    public a(b bVar, t tVar) {
        this.f3616b = bVar;
        this.f3617c = tVar;
    }

    public final void a(f fVar, float f, boolean z4) {
        if (f <= -0.001f || f >= 0.001f) {
            int i4 = this.f3621h;
            b bVar = this.f3616b;
            if (i4 == -1) {
                this.f3621h = 0;
                this.f3620g[0] = f;
                this.f3619e[0] = fVar.f3647g;
                this.f[0] = -1;
                fVar.f3655p++;
                fVar.a(bVar);
                this.f3615a++;
                if (this.f3623j) {
                    return;
                }
                int i5 = this.f3622i + 1;
                this.f3622i = i5;
                int[] iArr = this.f3619e;
                if (i5 >= iArr.length) {
                    this.f3623j = true;
                    this.f3622i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i6 = -1;
            for (int i7 = 0; i4 != -1 && i7 < this.f3615a; i7++) {
                int i8 = this.f3619e[i4];
                int i9 = fVar.f3647g;
                if (i8 == i9) {
                    float[] fArr = this.f3620g;
                    float f4 = fArr[i4] + f;
                    if (f4 > -0.001f && f4 < 0.001f) {
                        f4 = 0.0f;
                    }
                    fArr[i4] = f4;
                    if (f4 == 0.0f) {
                        int i10 = this.f3621h;
                        int[] iArr2 = this.f;
                        if (i4 == i10) {
                            this.f3621h = iArr2[i4];
                        } else {
                            iArr2[i6] = iArr2[i4];
                        }
                        if (z4) {
                            fVar.b(bVar);
                        }
                        if (this.f3623j) {
                            this.f3622i = i4;
                        }
                        fVar.f3655p--;
                        this.f3615a--;
                        return;
                    }
                    return;
                }
                if (i8 < i9) {
                    i6 = i4;
                }
                i4 = this.f[i4];
            }
            int length = this.f3622i;
            int i11 = length + 1;
            if (this.f3623j) {
                int[] iArr3 = this.f3619e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i11;
            }
            int[] iArr4 = this.f3619e;
            if (length >= iArr4.length && this.f3615a < iArr4.length) {
                int i12 = 0;
                while (true) {
                    int[] iArr5 = this.f3619e;
                    if (i12 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i12] == -1) {
                        length = i12;
                        break;
                    }
                    i12++;
                }
            }
            int[] iArr6 = this.f3619e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i13 = this.f3618d * 2;
                this.f3618d = i13;
                this.f3623j = false;
                this.f3622i = length - 1;
                this.f3620g = Arrays.copyOf(this.f3620g, i13);
                this.f3619e = Arrays.copyOf(this.f3619e, this.f3618d);
                this.f = Arrays.copyOf(this.f, this.f3618d);
            }
            this.f3619e[length] = fVar.f3647g;
            this.f3620g[length] = f;
            int[] iArr7 = this.f;
            if (i6 != -1) {
                iArr7[length] = iArr7[i6];
                iArr7[i6] = length;
            } else {
                iArr7[length] = this.f3621h;
                this.f3621h = length;
            }
            fVar.f3655p++;
            fVar.a(bVar);
            this.f3615a++;
            if (!this.f3623j) {
                this.f3622i++;
            }
            int i14 = this.f3622i;
            int[] iArr8 = this.f3619e;
            if (i14 >= iArr8.length) {
                this.f3623j = true;
                this.f3622i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i4 = this.f3621h;
        for (int i5 = 0; i4 != -1 && i5 < this.f3615a; i5++) {
            f fVar = ((f[]) this.f3617c.f580d)[this.f3619e[i4]];
            if (fVar != null) {
                fVar.b(this.f3616b);
            }
            i4 = this.f[i4];
        }
        this.f3621h = -1;
        this.f3622i = -1;
        this.f3623j = false;
        this.f3615a = 0;
    }

    public final float c(f fVar) {
        int i4 = this.f3621h;
        for (int i5 = 0; i4 != -1 && i5 < this.f3615a; i5++) {
            if (this.f3619e[i4] == fVar.f3647g) {
                return this.f3620g[i4];
            }
            i4 = this.f[i4];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f3615a;
    }

    public final f e(int i4) {
        int i5 = this.f3621h;
        for (int i6 = 0; i5 != -1 && i6 < this.f3615a; i6++) {
            if (i6 == i4) {
                return ((f[]) this.f3617c.f580d)[this.f3619e[i5]];
            }
            i5 = this.f[i5];
        }
        return null;
    }

    public final float f(int i4) {
        int i5 = this.f3621h;
        for (int i6 = 0; i5 != -1 && i6 < this.f3615a; i6++) {
            if (i6 == i4) {
                return this.f3620g[i5];
            }
            i5 = this.f[i5];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f) {
        if (f == 0.0f) {
            h(fVar, true);
            return;
        }
        int i4 = this.f3621h;
        b bVar = this.f3616b;
        if (i4 == -1) {
            this.f3621h = 0;
            this.f3620g[0] = f;
            this.f3619e[0] = fVar.f3647g;
            this.f[0] = -1;
            fVar.f3655p++;
            fVar.a(bVar);
            this.f3615a++;
            if (this.f3623j) {
                return;
            }
            int i5 = this.f3622i + 1;
            this.f3622i = i5;
            int[] iArr = this.f3619e;
            if (i5 >= iArr.length) {
                this.f3623j = true;
                this.f3622i = iArr.length - 1;
                return;
            }
            return;
        }
        int i6 = -1;
        for (int i7 = 0; i4 != -1 && i7 < this.f3615a; i7++) {
            int i8 = this.f3619e[i4];
            int i9 = fVar.f3647g;
            if (i8 == i9) {
                this.f3620g[i4] = f;
                return;
            }
            if (i8 < i9) {
                i6 = i4;
            }
            i4 = this.f[i4];
        }
        int length = this.f3622i;
        int i10 = length + 1;
        if (this.f3623j) {
            int[] iArr2 = this.f3619e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i10;
        }
        int[] iArr3 = this.f3619e;
        if (length >= iArr3.length && this.f3615a < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.f3619e;
                if (i11 >= iArr4.length) {
                    break;
                }
                if (iArr4[i11] == -1) {
                    length = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr5 = this.f3619e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i12 = this.f3618d * 2;
            this.f3618d = i12;
            this.f3623j = false;
            this.f3622i = length - 1;
            this.f3620g = Arrays.copyOf(this.f3620g, i12);
            this.f3619e = Arrays.copyOf(this.f3619e, this.f3618d);
            this.f = Arrays.copyOf(this.f, this.f3618d);
        }
        this.f3619e[length] = fVar.f3647g;
        this.f3620g[length] = f;
        int[] iArr6 = this.f;
        if (i6 != -1) {
            iArr6[length] = iArr6[i6];
            iArr6[i6] = length;
        } else {
            iArr6[length] = this.f3621h;
            this.f3621h = length;
        }
        fVar.f3655p++;
        fVar.a(bVar);
        int i13 = this.f3615a + 1;
        this.f3615a = i13;
        if (!this.f3623j) {
            this.f3622i++;
        }
        int[] iArr7 = this.f3619e;
        if (i13 >= iArr7.length) {
            this.f3623j = true;
        }
        if (this.f3622i >= iArr7.length) {
            this.f3623j = true;
            this.f3622i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z4) {
        int i4 = this.f3621h;
        if (i4 == -1) {
            return 0.0f;
        }
        int i5 = 0;
        int i6 = -1;
        while (i4 != -1 && i5 < this.f3615a) {
            if (this.f3619e[i4] == fVar.f3647g) {
                int i7 = this.f3621h;
                int[] iArr = this.f;
                if (i4 == i7) {
                    this.f3621h = iArr[i4];
                } else {
                    iArr[i6] = iArr[i4];
                }
                if (z4) {
                    fVar.b(this.f3616b);
                }
                fVar.f3655p--;
                this.f3615a--;
                this.f3619e[i4] = -1;
                if (this.f3623j) {
                    this.f3622i = i4;
                }
                return this.f3620g[i4];
            }
            i5++;
            i6 = i4;
            i4 = this.f[i4];
        }
        return 0.0f;
    }

    public final String toString() {
        int i4 = this.f3621h;
        String str = "";
        for (int i5 = 0; i4 != -1 && i5 < this.f3615a; i5++) {
            str = (str.concat(" -> ") + this.f3620g[i4] + " : ") + ((f[]) this.f3617c.f580d)[this.f3619e[i4]];
            i4 = this.f[i4];
        }
        return str;
    }
}
