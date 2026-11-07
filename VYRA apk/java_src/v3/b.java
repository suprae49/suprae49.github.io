package v3;

import androidx.fragment.app.q;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterable, s3.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f4406i = new b(1, 0, 1);
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4408h;

    public b(int i4, int i5, int i6) {
        if (i6 == 0) {
            q.q("Step must be non-zero.");
            throw null;
        }
        if (i6 == Integer.MIN_VALUE) {
            q.q("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f = i4;
        if (i6 > 0) {
            if (i4 < i5) {
                int i7 = i5 % i6;
                int i8 = i4 % i6;
                int i9 = ((i7 < 0 ? i7 + i6 : i7) - (i8 < 0 ? i8 + i6 : i8)) % i6;
                i5 -= i9 < 0 ? i9 + i6 : i9;
            }
        } else {
            if (i6 >= 0) {
                q.q("Step is zero.");
                throw null;
            }
            if (i4 > i5) {
                int i10 = -i6;
                int i11 = i4 % i10;
                int i12 = i5 % i10;
                int i13 = ((i11 < 0 ? i11 + i10 : i11) - (i12 < 0 ? i12 + i10 : i12)) % i10;
                i5 += i13 < 0 ? i13 + i10 : i13;
            }
        }
        this.f4407g = i5;
        this.f4408h = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f == bVar.f && this.f4407g == bVar.f4407g;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f * 31) + this.f4407g;
    }

    public final boolean isEmpty() {
        return this.f > this.f4407g;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f, this.f4407g, this.f4408h);
    }

    public final String toString() {
        return this.f + ".." + this.f4407g;
    }
}
