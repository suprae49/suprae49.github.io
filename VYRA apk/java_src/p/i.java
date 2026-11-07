package p;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3154a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f3155b = new Object();

    public static final int a(g gVar, Object obj, int i4) {
        int i5 = gVar.f3150h;
        if (i5 == 0) {
            return -1;
        }
        try {
            int iA = q.a.a(i5, i4, gVar.f);
            if (iA < 0 || r3.g.a(obj, gVar.f3149g[iA])) {
                return iA;
            }
            int i6 = iA + 1;
            while (i6 < i5 && gVar.f[i6] == i4) {
                if (r3.g.a(obj, gVar.f3149g[i6])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = iA - 1; i7 >= 0 && gVar.f[i7] == i4; i7--) {
                if (r3.g.a(obj, gVar.f3149g[i7])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
