package v;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f4267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4268e;

    public final void a(ArrayList arrayList) {
        int size = this.f4264a.size();
        if (this.f4268e != -1 && size > 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                n nVar = (n) arrayList.get(i4);
                if (this.f4268e == nVar.f4265b) {
                    c(this.f4266c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(s.c cVar, int i4) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f4264a;
        if (arrayList.size() == 0) {
            return 0;
        }
        u.e eVar = (u.e) ((u.d) arrayList.get(0)).T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ((u.d) arrayList.get(i5)).b(cVar, false);
        }
        if (i4 == 0 && eVar.f3810z0 > 0) {
            u.j.a(eVar, cVar, arrayList, 0);
        }
        if (i4 == 1 && eVar.A0 > 0) {
            u.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e5) {
            System.err.println(e5.toString() + "\n" + Arrays.toString(e5.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f4267d = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            u.d dVar = (u.d) arrayList.get(i6);
            a3.f fVar = new a3.f(23);
            new WeakReference(dVar);
            s.c.n(dVar.I);
            s.c.n(dVar.J);
            s.c.n(dVar.K);
            s.c.n(dVar.L);
            s.c.n(dVar.M);
            this.f4267d.add(fVar);
        }
        if (i4 == 0) {
            iN = s.c.n(eVar.I);
            iN2 = s.c.n(eVar.K);
            cVar.t();
        } else {
            iN = s.c.n(eVar.J);
            iN2 = s.c.n(eVar.L);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i4, n nVar) {
        int i5 = nVar.f4265b;
        ArrayList arrayList = this.f4264a;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            u.d dVar = (u.d) obj;
            ArrayList arrayList2 = nVar.f4264a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            if (i4 == 0) {
                dVar.f3787n0 = i5;
            } else {
                dVar.f3789o0 = i5;
            }
        }
        this.f4268e = i5;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i4 = this.f4266c;
        if (i4 == 0) {
            str = "Horizontal";
        } else if (i4 == 1) {
            str = "Vertical";
        } else {
            str = i4 == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.f4265b);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.f4264a;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            string = string + " " + ((u.d) obj).f3777h0;
        }
        return string.concat(" >");
    }
}
