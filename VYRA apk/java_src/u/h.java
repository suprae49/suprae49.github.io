package u;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f3836q0 = -1.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f3837r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f3838s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f3839t0 = this.J;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f3840u0 = 0;
    public boolean v0;

    public h() {
        this.R.clear();
        this.R.add(this.f3839t0);
        int length = this.Q.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.Q[i4] = this.f3839t0;
        }
    }

    @Override // u.d
    public final boolean A() {
        return this.v0;
    }

    @Override // u.d
    public final boolean B() {
        return this.v0;
    }

    @Override // u.d
    public final void Q(s.c cVar, boolean z4) {
        if (this.T == null) {
            return;
        }
        c cVar2 = this.f3839t0;
        cVar.getClass();
        int iN = s.c.n(cVar2);
        if (this.f3840u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        O(this.T.q());
        L(0);
    }

    public final void R(int i4) {
        this.f3839t0.l(i4);
        this.v0 = true;
    }

    public final void S(int i4) {
        if (this.f3840u0 == i4) {
            return;
        }
        this.f3840u0 = i4;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f3840u0 == 1) {
            this.f3839t0 = this.I;
        } else {
            this.f3839t0 = this.J;
        }
        arrayList.add(this.f3839t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            cVarArr[i5] = this.f3839t0;
        }
    }

    @Override // u.d
    public final void b(s.c cVar, boolean z4) {
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object objI = eVar.i(2);
        Object objI2 = eVar.i(4);
        d dVar = this.T;
        boolean z5 = dVar != null && dVar.f3791p0[0] == 2;
        if (this.f3840u0 == 0) {
            objI = eVar.i(3);
            objI2 = eVar.i(5);
            d dVar2 = this.T;
            z5 = dVar2 != null && dVar2.f3791p0[1] == 2;
        }
        if (this.v0) {
            c cVar2 = this.f3839t0;
            if (cVar2.f3759c) {
                s.f fVarK = cVar.k(cVar2);
                cVar.d(fVarK, this.f3839t0.d());
                if (this.f3837r0 != -1) {
                    if (z5) {
                        cVar.f(cVar.k(objI2), fVarK, 0, 5);
                    }
                } else if (this.f3838s0 != -1 && z5) {
                    s.f fVarK2 = cVar.k(objI2);
                    cVar.f(fVarK, cVar.k(objI), 0, 5);
                    cVar.f(fVarK2, fVarK, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.f3837r0 != -1) {
            s.f fVarK3 = cVar.k(this.f3839t0);
            cVar.e(fVarK3, cVar.k(objI), this.f3837r0, 8);
            if (z5) {
                cVar.f(cVar.k(objI2), fVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f3838s0 != -1) {
            s.f fVarK4 = cVar.k(this.f3839t0);
            s.f fVarK5 = cVar.k(objI2);
            cVar.e(fVarK4, fVarK5, -this.f3838s0, 8);
            if (z5) {
                cVar.f(fVarK4, cVar.k(objI), 0, 5);
                cVar.f(fVarK5, fVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3836q0 != -1.0f) {
            s.f fVarK6 = cVar.k(this.f3839t0);
            s.f fVarK7 = cVar.k(objI2);
            float f = this.f3836q0;
            s.b bVarL = cVar.l();
            bVarL.f3627d.g(fVarK6, -1.0f);
            bVarL.f3627d.g(fVarK7, f);
            cVar.c(bVarL);
        }
    }

    @Override // u.d
    public final boolean c() {
        return true;
    }

    @Override // u.d
    public final c i(int i4) {
        int iB = s.e.b(i4);
        if (iB != 1) {
            if (iB != 2) {
                if (iB != 3) {
                    if (iB != 4) {
                        return null;
                    }
                }
            }
            if (this.f3840u0 == 0) {
                return this.f3839t0;
            }
            return null;
        }
        if (this.f3840u0 == 1) {
            return this.f3839t0;
        }
        return null;
    }
}
