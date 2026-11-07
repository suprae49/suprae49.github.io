package v3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, s3.a {
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4405i;

    public a(int i4, int i5, int i6) {
        this.f = i6;
        this.f4403g = i5;
        boolean z4 = false;
        if (i6 <= 0 ? i4 >= i5 : i4 <= i5) {
            z4 = true;
        }
        this.f4404h = z4;
        this.f4405i = z4 ? i4 : i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4404h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.f4405i;
        if (i4 != this.f4403g) {
            this.f4405i = this.f + i4;
        } else {
            if (!this.f4404h) {
                throw new NoSuchElementException();
            }
            this.f4404h = false;
        }
        return Integer.valueOf(i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
