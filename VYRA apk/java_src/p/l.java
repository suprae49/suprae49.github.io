package p;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Cloneable {
    public /* synthetic */ int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object[] f3158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ int f3159h;

    public l() {
        int i4;
        int i5 = 4;
        while (true) {
            i4 = 40;
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (40 <= i6) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = i4 / 4;
        this.f = new int[i7];
        this.f3158g = new Object[i7];
    }

    public final void a(int i4, ColorStateList colorStateList) {
        int i5 = this.f3159h;
        if (i5 != 0 && i4 <= this.f[i5 - 1]) {
            b(i4, colorStateList);
            return;
        }
        if (i5 >= this.f.length) {
            int i6 = (i5 + 1) * 4;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 4;
            this.f = Arrays.copyOf(this.f, i9);
            this.f3158g = Arrays.copyOf(this.f3158g, i9);
        }
        this.f[i5] = i4;
        this.f3158g[i5] = colorStateList;
        this.f3159h = i5 + 1;
    }

    public final void b(int i4, Object obj) {
        int iA = q.a.a(this.f3159h, i4, this.f);
        if (iA >= 0) {
            this.f3158g[iA] = obj;
            return;
        }
        int i5 = ~iA;
        int i6 = this.f3159h;
        if (i5 < i6) {
            Object[] objArr = this.f3158g;
            if (objArr[i5] == i.f3155b) {
                this.f[i5] = i4;
                objArr[i5] = obj;
                return;
            }
        }
        if (i6 >= this.f.length) {
            int i7 = (i6 + 1) * 4;
            for (int i8 = 4; i8 < 32; i8++) {
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
            }
            int i10 = i7 / 4;
            this.f = Arrays.copyOf(this.f, i10);
            this.f3158g = Arrays.copyOf(this.f3158g, i10);
        }
        int i11 = this.f3159h;
        if (i11 - i5 != 0) {
            int[] iArr = this.f;
            int i12 = i5 + 1;
            h3.d.o0(i12, i5, i11, iArr, iArr);
            Object[] objArr2 = this.f3158g;
            h3.d.p0(objArr2, objArr2, i12, i5, this.f3159h);
        }
        this.f[i5] = i4;
        this.f3158g[i5] = obj;
        this.f3159h++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        l lVar = (l) objClone;
        lVar.f = (int[]) this.f.clone();
        lVar.f3158g = (Object[]) this.f3158g.clone();
        return lVar;
    }

    public final String toString() {
        int i4 = this.f3159h;
        if (i4 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i4 * 28);
        sb.append('{');
        int i5 = this.f3159h;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(this.f[i6]);
            sb.append('=');
            Object obj = this.f3158g[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
