package h3;

import androidx.fragment.app.q;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractList implements List, s3.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f2174i = new Object[0];
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f2175g = f2174i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2176h;

    public final void a(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2175g.length;
        while (i4 < length && it.hasNext()) {
            this.f2175g[i4] = it.next();
            i4++;
        }
        int i5 = this.f;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f2175g[i6] = it.next();
        }
        this.f2176h = collection.size() + this.f2176h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int length;
        int i5 = this.f2176h;
        if (i4 < 0 || i4 > i5) {
            q.l("index: ", i4, ", size: ", i5);
            return;
        }
        if (i4 == i5) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        g();
        b(this.f2176h + 1);
        int iF = f(this.f + i4);
        int i6 = this.f2176h;
        if (i4 < ((i6 + 1) >> 1)) {
            if (iF == 0) {
                Object[] objArr = this.f2175g;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iF - 1;
            }
            int length2 = this.f;
            if (length2 == 0) {
                Object[] objArr2 = this.f2175g;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i7 = length2 - 1;
            int i8 = this.f;
            Object[] objArr3 = this.f2175g;
            if (length >= i8) {
                objArr3[i7] = objArr3[i8];
                d.p0(objArr3, objArr3, i8, i8 + 1, length + 1);
            } else {
                d.p0(objArr3, objArr3, i8 - 1, i8, objArr3.length);
                Object[] objArr4 = this.f2175g;
                objArr4[objArr4.length - 1] = objArr4[0];
                d.p0(objArr4, objArr4, 0, 1, length + 1);
            }
            this.f2175g[length] = obj;
            this.f = i7;
        } else {
            int iF2 = f(this.f + i6);
            Object[] objArr5 = this.f2175g;
            if (iF < iF2) {
                d.p0(objArr5, objArr5, iF + 1, iF, iF2);
            } else {
                d.p0(objArr5, objArr5, 1, 0, iF2);
                Object[] objArr6 = this.f2175g;
                objArr6[0] = objArr6[objArr6.length - 1];
                d.p0(objArr6, objArr6, iF + 1, iF, objArr6.length - 1);
            }
            this.f2175g[iF] = obj;
        }
        this.f2176h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        collection.getClass();
        int i5 = this.f2176h;
        if (i4 < 0 || i4 > i5) {
            q.l("index: ", i4, ", size: ", i5);
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i4 == this.f2176h) {
            return addAll(collection);
        }
        g();
        b(collection.size() + this.f2176h);
        int iF = f(this.f + this.f2176h);
        int iF2 = f(this.f + i4);
        int size = collection.size();
        if (i4 >= ((this.f2176h + 1) >> 1)) {
            int i6 = iF2 + size;
            Object[] objArr = this.f2175g;
            if (iF2 < iF) {
                int i7 = size + iF;
                if (i7 <= objArr.length) {
                    d.p0(objArr, objArr, i6, iF2, iF);
                } else if (i6 >= objArr.length) {
                    d.p0(objArr, objArr, i6 - objArr.length, iF2, iF);
                } else {
                    int length = iF - (i7 - objArr.length);
                    d.p0(objArr, objArr, 0, length, iF);
                    Object[] objArr2 = this.f2175g;
                    d.p0(objArr2, objArr2, i6, iF2, length);
                }
            } else {
                d.p0(objArr, objArr, size, 0, iF);
                Object[] objArr3 = this.f2175g;
                if (i6 >= objArr3.length) {
                    d.p0(objArr3, objArr3, i6 - objArr3.length, iF2, objArr3.length);
                } else {
                    d.p0(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.f2175g;
                    d.p0(objArr4, objArr4, i6, iF2, objArr4.length - size);
                }
            }
            a(iF2, collection);
            return true;
        }
        int i8 = this.f;
        int length2 = i8 - size;
        Object[] objArr5 = this.f2175g;
        if (iF2 < i8) {
            d.p0(objArr5, objArr5, length2, i8, objArr5.length);
            Object[] objArr6 = this.f2175g;
            if (size >= iF2) {
                d.p0(objArr6, objArr6, objArr6.length - size, 0, iF2);
            } else {
                d.p0(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.f2175g;
                d.p0(objArr7, objArr7, 0, size, iF2);
            }
        } else if (length2 >= 0) {
            d.p0(objArr5, objArr5, length2, i8, iF2);
        } else {
            length2 += objArr5.length;
            int i9 = iF2 - i8;
            int length3 = objArr5.length - length2;
            if (length3 >= i9) {
                d.p0(objArr5, objArr5, length2, i8, iF2);
            } else {
                d.p0(objArr5, objArr5, length2, i8, i8 + length3);
                Object[] objArr8 = this.f2175g;
                d.p0(objArr8, objArr8, 0, this.f + length3, iF2);
            }
        }
        this.f = length2;
        a(d(iF2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        g();
        b(this.f2176h + 1);
        int length = this.f;
        if (length == 0) {
            Object[] objArr = this.f2175g;
            objArr.getClass();
            length = objArr.length;
        }
        int i4 = length - 1;
        this.f = i4;
        this.f2175g[i4] = obj;
        this.f2176h++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.f2176h + 1);
        this.f2175g[f(this.f + this.f2176h)] = obj;
        this.f2176h++;
    }

    public final void b(int i4) {
        if (i4 < 0) {
            q.j("Deque is too big.");
            return;
        }
        Object[] objArr = this.f2175g;
        if (i4 <= objArr.length) {
            return;
        }
        if (objArr == f2174i) {
            if (i4 < 10) {
                i4 = 10;
            }
            this.f2175g = new Object[i4];
            return;
        }
        int length = objArr.length;
        int i5 = length + (length >> 1);
        if (i5 - i4 < 0) {
            i5 = i4;
        }
        if (i5 - 2147483639 > 0) {
            i5 = i4 > 2147483639 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 2147483639;
        }
        Object[] objArr2 = new Object[i5];
        d.p0(objArr, objArr2, 0, this.f, objArr.length);
        Object[] objArr3 = this.f2175g;
        int length2 = objArr3.length;
        int i6 = this.f;
        d.p0(objArr3, objArr2, length2 - i6, 0, i6);
        this.f = 0;
        this.f2175g = objArr2;
    }

    public final int c(int i4) {
        Object[] objArr = this.f2175g;
        objArr.getClass();
        if (i4 == objArr.length - 1) {
            return 0;
        }
        return i4 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f, f(this.f + this.f2176h));
        }
        this.f = 0;
        this.f2176h = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i4) {
        return i4 < 0 ? i4 + this.f2175g.length : i4;
    }

    public final void e(int i4, int i5) {
        Object[] objArr = this.f2175g;
        if (i4 < i5) {
            objArr.getClass();
            Arrays.fill(objArr, i4, i5, (Object) null);
        } else {
            Arrays.fill(objArr, i4, objArr.length, (Object) null);
            Object[] objArr2 = this.f2175g;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, i5, (Object) null);
        }
    }

    public final int f(int i4) {
        Object[] objArr = this.f2175g;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int i5 = this.f2176h;
        if (i4 >= 0 && i4 < i5) {
            return this.f2175g[f(this.f + i4)];
        }
        q.l("index: ", i4, ", size: ", i5);
        return null;
    }

    public final Object h(int i4) {
        int i5 = this.f2176h;
        if (i4 < 0 || i4 >= i5) {
            q.l("index: ", i4, ", size: ", i5);
            return null;
        }
        if (i4 == i5 - 1) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        g();
        int iF = f(this.f + i4);
        Object[] objArr = this.f2175g;
        Object obj = objArr[iF];
        int i6 = this.f2176h;
        int i7 = i6 >> 1;
        int i8 = this.f;
        if (i4 < i7) {
            if (iF >= i8) {
                d.p0(objArr, objArr, i8 + 1, i8, iF);
            } else {
                d.p0(objArr, objArr, 1, 0, iF);
                Object[] objArr2 = this.f2175g;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i9 = this.f;
                d.p0(objArr2, objArr2, i9 + 1, i9, objArr2.length - 1);
            }
            Object[] objArr3 = this.f2175g;
            int i10 = this.f;
            objArr3[i10] = null;
            this.f = c(i10);
        } else {
            int iF2 = f((i6 - 1) + i8);
            Object[] objArr4 = this.f2175g;
            if (iF <= iF2) {
                d.p0(objArr4, objArr4, iF, iF + 1, iF2 + 1);
            } else {
                d.p0(objArr4, objArr4, iF, iF + 1, objArr4.length);
                Object[] objArr5 = this.f2175g;
                objArr5[objArr5.length - 1] = objArr5[0];
                d.p0(objArr5, objArr5, 0, 1, iF2 + 1);
            }
            this.f2175g[iF2] = null;
        }
        this.f2176h--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i4;
        int iF = f(this.f + this.f2176h);
        int length = this.f;
        if (length < iF) {
            while (length < iF) {
                if (r3.g.a(obj, this.f2175g[length])) {
                    i4 = this.f;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iF) {
            return -1;
        }
        int length2 = this.f2175g.length;
        while (length < length2) {
            if (r3.g.a(obj, this.f2175g[length])) {
                i4 = this.f;
            } else {
                length++;
            }
        }
        for (int i5 = 0; i5 < iF; i5++) {
            if (r3.g.a(obj, this.f2175g[i5])) {
                length = i5 + this.f2175g.length;
                i4 = this.f;
            }
        }
        return -1;
        return length - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2176h == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i4;
        int iF = f(this.f + this.f2176h);
        int i5 = this.f;
        if (i5 < iF) {
            length = iF - 1;
            if (i5 <= length) {
                while (!r3.g.a(obj, this.f2175g[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i4 = this.f;
                return length - i4;
            }
            return -1;
        }
        if (i5 > iF) {
            do {
                iF--;
                objArr = this.f2175g;
                if (-1 >= iF) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i6 = this.f;
                    if (i6 <= length) {
                        while (!r3.g.a(obj, this.f2175g[length])) {
                            if (length != i6) {
                                length--;
                            }
                        }
                        i4 = this.f;
                    }
                }
                return length - i4;
            } while (!r3.g.a(obj, objArr[iF]));
            length = iF + this.f2175g.length;
            i4 = this.f;
            return length - i4;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        h(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iF;
        Object[] objArr;
        collection.getClass();
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f2175g.length != 0) {
            int iF2 = f(this.f + this.f2176h);
            int i4 = this.f;
            if (i4 < iF2) {
                iF = i4;
                while (true) {
                    objArr = this.f2175g;
                    if (i4 >= iF2) {
                        break;
                    }
                    Object obj = objArr[i4];
                    if (collection.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f2175g[iF] = obj;
                        iF++;
                    }
                    i4++;
                }
                objArr.getClass();
                Arrays.fill(objArr, iF, iF2, (Object) null);
            } else {
                int length = this.f2175g.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr2 = this.f2175g;
                    Object obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f2175g[i5] = obj2;
                        i5++;
                    }
                    i4++;
                }
                iF = f(i5);
                for (int i6 = 0; i6 < iF2; i6++) {
                    Object[] objArr3 = this.f2175g;
                    Object obj3 = objArr3[i6];
                    objArr3[i6] = null;
                    if (collection.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f2175g[iF] = obj3;
                        iF = c(iF);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                g();
                this.f2176h = d(iF - this.f);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        Object[] objArr = this.f2175g;
        int i4 = this.f;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f = c(i4);
        this.f2176h--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int iF = f((size() - 1) + this.f);
        Object[] objArr = this.f2175g;
        Object obj = objArr[iF];
        objArr[iF] = null;
        this.f2176h--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        int i6 = this.f2176h;
        if (i4 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + i6);
        }
        if (i4 > i5) {
            throw new IllegalArgumentException("fromIndex: " + i4 + " > toIndex: " + i5);
        }
        int i7 = i5 - i4;
        if (i7 == 0) {
            return;
        }
        if (i7 == this.f2176h) {
            clear();
            return;
        }
        if (i7 == 1) {
            h(i4);
            return;
        }
        g();
        int i8 = this.f2176h - i5;
        int i9 = this.f;
        if (i4 < i8) {
            int iF = f((i4 - 1) + i9);
            int iF2 = f(this.f + (i5 - 1));
            while (i4 > 0) {
                int i10 = iF + 1;
                int iMin = Math.min(i4, Math.min(i10, iF2 + 1));
                Object[] objArr = this.f2175g;
                int i11 = iF2 - iMin;
                int i12 = iF - iMin;
                d.p0(objArr, objArr, i11 + 1, i12 + 1, i10);
                iF = d(i12);
                iF2 = d(i11);
                i4 -= iMin;
            }
            int iF3 = f(this.f + i7);
            e(this.f, iF3);
            this.f = iF3;
        } else {
            int iF4 = f(i9 + i5);
            int iF5 = f(this.f + i4);
            int i13 = this.f2176h;
            while (true) {
                i13 -= i5;
                if (i13 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f2175g;
                i5 = Math.min(i13, Math.min(objArr2.length - iF4, objArr2.length - iF5));
                Object[] objArr3 = this.f2175g;
                int i14 = iF4 + i5;
                d.p0(objArr3, objArr3, iF5, iF4, i14);
                iF4 = f(i14);
                iF5 = f(iF5 + i5);
            }
            int iF6 = f(this.f + this.f2176h);
            e(d(iF6 - i7), iF6);
        }
        this.f2176h -= i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iF;
        Object[] objArr;
        collection.getClass();
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f2175g.length != 0) {
            int iF2 = f(this.f + this.f2176h);
            int i4 = this.f;
            if (i4 < iF2) {
                iF = i4;
                while (true) {
                    objArr = this.f2175g;
                    if (i4 >= iF2) {
                        break;
                    }
                    Object obj = objArr[i4];
                    if (collection.contains(obj)) {
                        this.f2175g[iF] = obj;
                        iF++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                objArr.getClass();
                Arrays.fill(objArr, iF, iF2, (Object) null);
            } else {
                int length = this.f2175g.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr2 = this.f2175g;
                    Object obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj2)) {
                        this.f2175g[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i4++;
                }
                iF = f(i5);
                for (int i6 = 0; i6 < iF2; i6++) {
                    Object[] objArr3 = this.f2175g;
                    Object obj3 = objArr3[i6];
                    objArr3[i6] = null;
                    if (collection.contains(obj3)) {
                        this.f2175g[iF] = obj3;
                        iF = c(iF);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                g();
                this.f2176h = d(iF - this.f);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int i5 = this.f2176h;
        if (i4 < 0 || i4 >= i5) {
            q.l("index: ", i4, ", size: ", i5);
            return null;
        }
        int iF = f(this.f + i4);
        Object[] objArr = this.f2175g;
        Object obj2 = objArr[iF];
        objArr[iF] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2176h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i4 = this.f2176h;
        if (length < i4) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i4);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iF = f(this.f + this.f2176h);
        int i5 = this.f;
        if (i5 < iF) {
            d.q0(this.f2175g, objArr, i5, iF, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2175g;
            d.p0(objArr2, objArr, 0, this.f, objArr2.length);
            Object[] objArr3 = this.f2175g;
            d.p0(objArr3, objArr, objArr3.length - this.f, 0, iF);
        }
        int i6 = this.f2176h;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i4) {
        return h(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f2176h]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.f2176h);
        a(f(this.f + this.f2176h), collection);
        return true;
    }
}
