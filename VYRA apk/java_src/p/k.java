package p;

import androidx.fragment.app.u;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class k {
    public int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f3156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3157h;

    public k(int i4) {
        this.f = i4 == 0 ? q.a.f3361a : new int[i4];
        this.f3156g = i4 == 0 ? q.a.f3362b : new Object[i4 << 1];
    }

    public final int a(Object obj) {
        int i4 = this.f3157h * 2;
        Object[] objArr = this.f3156g;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i4) {
        int i5 = this.f3157h;
        int[] iArr = this.f;
        if (iArr.length < i4) {
            this.f = Arrays.copyOf(iArr, i4);
            this.f3156g = Arrays.copyOf(this.f3156g, i4 * 2);
        }
        if (this.f3157h != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i4, Object obj) {
        int i5 = this.f3157h;
        if (i5 == 0) {
            return -1;
        }
        int iA = q.a.a(i5, i4, this.f);
        if (iA < 0 || r3.g.a(obj, this.f3156g[iA << 1])) {
            return iA;
        }
        int i6 = iA + 1;
        while (i6 < i5 && this.f[i6] == i4) {
            if (r3.g.a(obj, this.f3156g[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iA - 1; i7 >= 0 && this.f[i7] == i4; i7--) {
            if (r3.g.a(obj, this.f3156g[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    public final void clear() {
        if (this.f3157h > 0) {
            this.f = q.a.f3361a;
            this.f3156g = q.a.f3362b;
            this.f3157h = 0;
        }
        if (this.f3157h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i4 = this.f3157h;
        if (i4 == 0) {
            return -1;
        }
        int iA = q.a.a(i4, 0, this.f);
        if (iA < 0 || this.f3156g[iA << 1] == null) {
            return iA;
        }
        int i5 = iA + 1;
        while (i5 < i4 && this.f[i5] == 0) {
            if (this.f3156g[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iA - 1; i6 >= 0 && this.f[i6] == 0; i6--) {
            if (this.f3156g[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                int i4 = this.f3157h;
                if (i4 != ((k) obj).f3157h) {
                    return false;
                }
                k kVar = (k) obj;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object objF = f(i5);
                    Object objI = i(i5);
                    Object obj2 = kVar.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !kVar.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f3157h != ((Map) obj).size()) {
                return false;
            }
            int i6 = this.f3157h;
            for (int i7 = 0; i7 < i6; i7++) {
                Object objF2 = f(i7);
                Object objI2 = i(i7);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i4) {
        if (i4 < 0 || i4 >= this.f3157h) {
            throw new IllegalArgumentException(u.k(i4, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f3156g[i4 << 1];
    }

    public final Object g(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f3157h)) {
            throw new IllegalArgumentException(u.k(i4, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f3156g;
        int i6 = i4 << 1;
        Object obj = objArr[i6 + 1];
        if (i5 <= 1) {
            clear();
            return obj;
        }
        int i7 = i5 - 1;
        int[] iArr = this.f;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i4 < i7) {
                int i8 = i4 + 1;
                h3.d.o0(i4, i8, i5, iArr, iArr);
                Object[] objArr2 = this.f3156g;
                h3.d.p0(objArr2, objArr2, i6, i8 << 1, i5 << 1);
            }
            Object[] objArr3 = this.f3156g;
            int i9 = i7 << 1;
            objArr3[i9] = null;
            objArr3[i9 + 1] = null;
        } else {
            int i10 = i5 > 8 ? i5 + (i5 >> 1) : 8;
            this.f = Arrays.copyOf(iArr, i10);
            this.f3156g = Arrays.copyOf(this.f3156g, i10 << 1);
            if (i5 != this.f3157h) {
                throw new ConcurrentModificationException();
            }
            if (i4 > 0) {
                h3.d.o0(0, 0, i4, iArr, this.f);
                h3.d.p0(objArr, this.f3156g, 0, 0, i6);
            }
            if (i4 < i7) {
                int i11 = i4 + 1;
                h3.d.o0(i4, i11, i5, iArr, this.f);
                h3.d.p0(objArr, this.f3156g, i6, i11 << 1, i5 << 1);
            }
        }
        if (i5 != this.f3157h) {
            throw new ConcurrentModificationException();
        }
        this.f3157h = i7;
        return obj;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f3156g[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f3156g[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i4, Object obj) {
        if (i4 < 0 || i4 >= this.f3157h) {
            throw new IllegalArgumentException(u.k(i4, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i5 = (i4 << 1) + 1;
        Object[] objArr = this.f3156g;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f;
        Object[] objArr = this.f3156g;
        int i4 = this.f3157h;
        int i5 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i4) {
        if (i4 < 0 || i4 >= this.f3157h) {
            throw new IllegalArgumentException(u.k(i4, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f3156g[(i4 << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f3157h <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i4 = this.f3157h;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i5 = (iC << 1) + 1;
            Object[] objArr = this.f3156g;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~iC;
        int[] iArr = this.f;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            this.f = Arrays.copyOf(iArr, i7);
            this.f3156g = Arrays.copyOf(this.f3156g, i7 << 1);
            if (i4 != this.f3157h) {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr2 = this.f;
            int i8 = i6 + 1;
            h3.d.o0(i8, i6, i4, iArr2, iArr2);
            Object[] objArr2 = this.f3156g;
            h3.d.p0(objArr2, objArr2, i8 << 1, i6 << 1, this.f3157h << 1);
        }
        int i9 = this.f3157h;
        if (i4 == i9) {
            int[] iArr3 = this.f;
            if (i6 < iArr3.length) {
                iArr3[i6] = iHashCode;
                Object[] objArr3 = this.f3156g;
                int i10 = i6 << 1;
                objArr3[i10] = obj;
                objArr3[i10 + 1] = obj2;
                this.f3157h = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !r3.g.a(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !r3.g.a(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }

    public final int size() {
        return this.f3157h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3157h * 28);
        sb.append('{');
        int i4 = this.f3157h;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object objF = f(i5);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i5);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }
}
