package r3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q3.o;
import q3.p;
import q3.q;
import q3.r;
import q3.s;
import q3.t;
import q3.u;
import q3.v;
import q3.w;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3611a;

    static {
        List listAsList = Arrays.asList(q3.a.class, q3.l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, q3.b.class, q3.c.class, q3.d.class, q3.e.class, q3.f.class, q3.g.class, q3.h.class, q3.i.class, q3.j.class, q3.k.class, q3.m.class, q3.n.class, o.class);
        listAsList.getClass();
        ArrayList arrayList = new ArrayList(h3.g.u0(listAsList));
        int i4 = 0;
        for (Object obj : listAsList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new g3.b((Class) obj, Integer.valueOf(i4)));
            i4 = i5;
        }
        h3.p.p0(arrayList);
    }

    public d(Class cls) {
        this.f3611a = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && e4.a.C(this).equals(e4.a.C((d) obj));
    }

    public final int hashCode() {
        return e4.a.C(this).hashCode();
    }

    public final String toString() {
        return this.f3611a + " (Kotlin reflection is not available)";
    }
}
