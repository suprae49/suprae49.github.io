package p;

import androidx.fragment.app.u;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Cloneable {
    public /* synthetic */ boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ long[] f3151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object[] f3152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f3153i;

    public h() {
        int i4;
        int i5 = 4;
        while (true) {
            i4 = 80;
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (80 <= i6) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = i4 / 8;
        this.f3151g = new long[i7];
        this.f3152h = new Object[i7];
    }

    public final void a() {
        int i4 = this.f3153i;
        Object[] objArr = this.f3152h;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f3153i = 0;
        this.f = false;
    }

    public final Object b(long j4) {
        Object obj;
        int iB = q.a.b(this.f3151g, this.f3153i, j4);
        if (iB < 0 || (obj = this.f3152h[iB]) == i.f3154a) {
            return null;
        }
        return obj;
    }

    public final long c(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f3153i)) {
            throw new IllegalArgumentException(u.k(i4, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f) {
            long[] jArr = this.f3151g;
            Object[] objArr = this.f3152h;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != i.f3154a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f = false;
            this.f3153i = i6;
        }
        return this.f3151g[i4];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        h hVar = (h) objClone;
        hVar.f3151g = (long[]) this.f3151g.clone();
        hVar.f3152h = (Object[]) this.f3152h.clone();
        return hVar;
    }

    public final void d(long j4, Object obj) {
        Object obj2 = i.f3154a;
        int iB = q.a.b(this.f3151g, this.f3153i, j4);
        if (iB >= 0) {
            this.f3152h[iB] = obj;
            return;
        }
        int i4 = ~iB;
        int i5 = this.f3153i;
        if (i4 < i5) {
            Object[] objArr = this.f3152h;
            if (objArr[i4] == obj2) {
                this.f3151g[i4] = j4;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f) {
            long[] jArr = this.f3151g;
            if (i5 >= jArr.length) {
                Object[] objArr2 = this.f3152h;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    Object obj3 = objArr2[i7];
                    if (obj3 != obj2) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr2[i6] = obj3;
                            objArr2[i7] = null;
                        }
                        i6++;
                    }
                }
                this.f = false;
                this.f3153i = i6;
                i4 = ~q.a.b(this.f3151g, i6, j4);
            }
        }
        int i8 = this.f3153i;
        if (i8 >= this.f3151g.length) {
            int i9 = (i8 + 1) * 8;
            for (int i10 = 4; i10 < 32; i10++) {
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
            }
            int i12 = i9 / 8;
            this.f3151g = Arrays.copyOf(this.f3151g, i12);
            this.f3152h = Arrays.copyOf(this.f3152h, i12);
        }
        int i13 = this.f3153i - i4;
        if (i13 != 0) {
            long[] jArr2 = this.f3151g;
            int i14 = i4 + 1;
            jArr2.getClass();
            System.arraycopy(jArr2, i4, jArr2, i14, i13);
            Object[] objArr3 = this.f3152h;
            h3.d.p0(objArr3, objArr3, i14, i4, this.f3153i);
        }
        this.f3151g[i4] = j4;
        this.f3152h[i4] = obj;
        this.f3153i++;
    }

    public final int e() {
        if (this.f) {
            int i4 = this.f3153i;
            long[] jArr = this.f3151g;
            Object[] objArr = this.f3152h;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != i.f3154a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f = false;
            this.f3153i = i5;
        }
        return this.f3153i;
    }

    public final Object f(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f3153i)) {
            throw new IllegalArgumentException(u.k(i4, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f) {
            long[] jArr = this.f3151g;
            Object[] objArr = this.f3152h;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != i.f3154a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f = false;
            this.f3153i = i6;
        }
        return this.f3152h[i4];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3153i * 28);
        sb.append('{');
        int i4 = this.f3153i;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(c(i5));
            sb.append('=');
            Object objF = f(i5);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
