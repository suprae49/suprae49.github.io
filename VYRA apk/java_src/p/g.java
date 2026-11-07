package p;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Collection, Set, s3.a {
    public int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f3149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3150h;

    public g(int i4) {
        this.f = q.a.f3361a;
        this.f3149g = q.a.f3362b;
        if (i4 > 0) {
            this.f = new int[i4];
            this.f3149g = new Object[i4];
        }
    }

    public final Object a(int i4) {
        int i5 = this.f3150h;
        Object[] objArr = this.f3149g;
        Object obj = objArr[i4];
        if (i5 <= 1) {
            clear();
            return obj;
        }
        int i6 = i5 - 1;
        int[] iArr = this.f;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i4 < i6) {
                int i7 = i4 + 1;
                h3.d.o0(i4, i7, i5, iArr, iArr);
                Object[] objArr2 = this.f3149g;
                h3.d.p0(objArr2, objArr2, i4, i7, i5);
            }
            this.f3149g[i6] = null;
        } else {
            int i8 = i5 > 8 ? i5 + (i5 >> 1) : 8;
            int[] iArr2 = new int[i8];
            this.f = iArr2;
            this.f3149g = new Object[i8];
            if (i4 > 0) {
                h3.d.o0(0, 0, i4, iArr, iArr2);
                h3.d.q0(objArr, this.f3149g, 0, i4, 6);
            }
            if (i4 < i6) {
                int i9 = i4 + 1;
                h3.d.o0(i4, i9, i5, iArr, this.f);
                h3.d.p0(objArr, this.f3149g, i4, i9, i5);
            }
        }
        if (i5 != this.f3150h) {
            throw new ConcurrentModificationException();
        }
        this.f3150h = i6;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i4;
        int iA;
        int i5 = this.f3150h;
        if (obj == null) {
            iA = i.a(this, null, 0);
            i4 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i4 = iHashCode;
            iA = i.a(this, obj, iHashCode);
        }
        if (iA >= 0) {
            return false;
        }
        int i6 = ~iA;
        int[] iArr = this.f;
        if (i5 >= iArr.length) {
            int i7 = 8;
            if (i5 >= 8) {
                i7 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f3149g;
            int[] iArr2 = new int[i7];
            this.f = iArr2;
            this.f3149g = new Object[i7];
            if (i5 != this.f3150h) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                h3.d.o0(0, 0, iArr.length, iArr, iArr2);
                h3.d.q0(objArr, this.f3149g, 0, objArr.length, 6);
            }
        }
        if (i6 < i5) {
            int[] iArr3 = this.f;
            int i8 = i6 + 1;
            h3.d.o0(i8, i6, i5, iArr3, iArr3);
            Object[] objArr2 = this.f3149g;
            h3.d.p0(objArr2, objArr2, i8, i6, i5);
        }
        int i9 = this.f3150h;
        if (i5 == i9) {
            int[] iArr4 = this.f;
            if (i6 < iArr4.length) {
                iArr4[i6] = i4;
                this.f3149g[i6] = obj;
                this.f3150h = i9 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f3150h;
        int i4 = this.f3150h;
        int[] iArr = this.f;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3149g;
            int[] iArr2 = new int[size];
            this.f = iArr2;
            this.f3149g = new Object[size];
            if (i4 > 0) {
                h3.d.o0(0, 0, i4, iArr, iArr2);
                h3.d.q0(objArr, this.f3149g, 0, this.f3150h, 6);
            }
        }
        if (this.f3150h != i4) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f3150h != 0) {
            this.f = q.a.f3361a;
            this.f3149g = q.a.f3362b;
            this.f3150h = 0;
        }
        if (this.f3150h != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? i.a(this, null, 0) : i.a(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f3150h != ((Set) obj).size()) {
            return false;
        }
        try {
            int i4 = this.f3150h;
            for (int i5 = 0; i5 < i4; i5++) {
                if (!((Set) obj).contains(this.f3149g[i5])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f;
        int i4 = this.f3150h;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f3150h <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iA = obj == null ? i.a(this, null, 0) : i.a(this, obj, obj.hashCode());
        if (iA < 0) {
            return false;
        }
        a(iA);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z4 = false;
        for (int i4 = this.f3150h - 1; -1 < i4; i4--) {
            if (!collection.contains(this.f3149g[i4])) {
                a(i4);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f3150h;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f3149g;
        int i4 = this.f3150h;
        objArr.getClass();
        int length = objArr.length;
        if (i4 <= length) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i4);
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3150h * 14);
        sb.append('{');
        int i4 = this.f3150h;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3149g[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i4 = this.f3150h;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        } else if (objArr.length > i4) {
            objArr[i4] = null;
        }
        h3.d.p0(this.f3149g, objArr, 0, 0, this.f3150h);
        return objArr;
    }
}
