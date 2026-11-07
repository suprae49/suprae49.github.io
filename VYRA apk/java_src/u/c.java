package u;

import androidx.fragment.app.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.n;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f3760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3761e;
    public c f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s.f f3764i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f3757a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3762g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3763h = Integer.MIN_VALUE;

    public c(d dVar, int i4) {
        this.f3760d = dVar;
        this.f3761e = i4;
    }

    public final void a(c cVar, int i4) {
        b(cVar, i4, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i4, int i5, boolean z4) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z4 && !i(cVar)) {
            return false;
        }
        this.f = cVar;
        if (cVar.f3757a == null) {
            cVar.f3757a = new HashSet();
        }
        HashSet hashSet = this.f.f3757a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3762g = i4;
        this.f3763h = i5;
        return true;
    }

    public final void c(int i4, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f3757a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                v.h.b(((c) it.next()).f3760d, i4, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f3759c) {
            return this.f3758b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f3760d.g0 == 8) {
            return 0;
        }
        int i4 = this.f3763h;
        return (i4 == Integer.MIN_VALUE || (cVar = this.f) == null || cVar.f3760d.g0 != 8) ? this.f3762g : i4;
    }

    public final c f() {
        int i4 = this.f3761e;
        int iB = s.e.b(i4);
        d dVar = this.f3760d;
        switch (iB) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(u.o(i4));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3757a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0063 A[RETURN] */
    public final boolean i(c cVar) {
        if (cVar != null) {
            d dVar = cVar.f3760d;
            int i4 = cVar.f3761e;
            int i5 = this.f3761e;
            if (i4 != i5) {
                switch (s.e.b(i5)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z4 = i4 == 2 || i4 == 4;
                        if (!(dVar instanceof h)) {
                            return z4;
                        }
                        if (z4 || i4 == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z5 = i4 == 3 || i4 == 5;
                        if (!(dVar instanceof h)) {
                            return z5;
                        }
                        if (z5 || i4 == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i4 != 2 && i4 != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i4 != 6 && i4 != 8 && i4 != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(u.o(i5));
                }
            } else if (i5 != 6 || (dVar.E && this.f3760d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f;
        if (cVar != null && (hashSet = cVar.f3757a) != null) {
            hashSet.remove(this);
            if (this.f.f3757a.size() == 0) {
                this.f.f3757a = null;
            }
        }
        this.f3757a = null;
        this.f = null;
        this.f3762g = 0;
        this.f3763h = Integer.MIN_VALUE;
        this.f3759c = false;
        this.f3758b = 0;
    }

    public final void k() {
        s.f fVar = this.f3764i;
        if (fVar == null) {
            this.f3764i = new s.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i4) {
        this.f3758b = i4;
        this.f3759c = true;
    }

    public final String toString() {
        return this.f3760d.f3777h0 + ":" + u.o(this.f3761e);
    }
}
