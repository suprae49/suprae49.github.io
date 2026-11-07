package r3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, s3.a {
    public final Object[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3605g;

    public a(Object[] objArr) {
        this.f = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3605g < this.f.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f;
            int i4 = this.f3605g;
            this.f3605g = i4 + 1;
            return objArr[i4];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f3605g--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
