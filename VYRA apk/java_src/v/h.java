package v;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4258a = new b();

    public static boolean a(u.d dVar) {
        int[] iArr = dVar.f3791p0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        u.d dVar2 = dVar.T;
        u.e eVar = dVar2 != null ? (u.e) dVar2 : null;
        if (eVar != null) {
            int i6 = eVar.f3791p0[0];
        }
        if (eVar != null) {
            int i7 = eVar.f3791p0[1];
        }
        boolean z4 = i4 == 1 || dVar.A() || i4 == 2 || (i4 == 3 && dVar.f3793r == 0 && dVar.W == 0.0f && dVar.t(0)) || (i4 == 3 && dVar.f3793r == 1 && dVar.u(0, dVar.q()));
        boolean z5 = i5 == 1 || dVar.B() || i5 == 2 || (i5 == 3 && dVar.f3794s == 0 && dVar.W == 0.0f && dVar.t(1)) || (i5 == 3 && dVar.f3794s == 1 && dVar.u(1, dVar.k()));
        return (dVar.W > 0.0f && (z4 || z5)) || (z4 && z5);
    }

    public static n b(u.d dVar, int i4, ArrayList arrayList, n nVar) {
        int i5;
        int i6 = i4 == 0 ? dVar.f3787n0 : dVar.f3789o0;
        if (i6 != -1 && (nVar == null || i6 != nVar.f4265b)) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                n nVar2 = (n) arrayList.get(i7);
                if (nVar2.f4265b == i6) {
                    if (nVar != null) {
                        nVar.c(i4, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                    break;
                }
            }
        } else if (i6 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof u.i) {
                u.i iVar = (u.i) dVar;
                int i8 = 0;
                while (true) {
                    if (i8 >= iVar.f3842r0) {
                        i5 = -1;
                        break;
                    }
                    u.d dVar2 = iVar.f3841q0[i8];
                    if ((i4 == 0 && (i5 = dVar2.f3787n0) != -1) || (i4 == 1 && (i5 = dVar2.f3789o0) != -1)) {
                        break;
                    }
                    i8++;
                }
                if (i5 != -1) {
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        n nVar3 = (n) arrayList.get(i9);
                        if (nVar3.f4265b == i5) {
                            nVar = nVar3;
                            break;
                        }
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f4264a = new ArrayList();
                nVar.f4267d = null;
                nVar.f4268e = -1;
                int i10 = n.f;
                n.f = i10 + 1;
                nVar.f4265b = i10;
                nVar.f4266c = i4;
            }
            arrayList.add(nVar);
        }
        ArrayList arrayList2 = nVar.f4264a;
        if (arrayList2.contains(dVar)) {
            return nVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof u.h) {
            u.h hVar = (u.h) dVar;
            hVar.f3839t0.c(hVar.f3840u0 == 0 ? 1 : 0, arrayList, nVar);
        }
        int i11 = nVar.f4265b;
        if (i4 == 0) {
            dVar.f3787n0 = i11;
            dVar.I.c(i4, arrayList, nVar);
            dVar.K.c(i4, arrayList, nVar);
        } else {
            dVar.f3789o0 = i11;
            dVar.J.c(i4, arrayList, nVar);
            dVar.M.c(i4, arrayList, nVar);
            dVar.L.c(i4, arrayList, nVar);
        }
        dVar.P.c(i4, arrayList, nVar);
        return nVar;
    }

    public static void c(int i4, u.d dVar, x.f fVar, boolean z4) {
        u.c cVar;
        u.c cVar2;
        boolean z5;
        u.c cVar3;
        u.c cVar4;
        if (dVar.f3785m) {
            return;
        }
        if (!(dVar instanceof u.e) && dVar.z() && a(dVar)) {
            u.e.V(dVar, fVar, new b());
        }
        u.c cVarI = dVar.i(2);
        u.c cVarI2 = dVar.i(4);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet<u.c> hashSet = cVarI.f3757a;
        if (hashSet != null && cVarI.f3759c) {
            for (u.c cVar5 : hashSet) {
                u.d dVar2 = cVar5.f3760d;
                int i5 = i4 + 1;
                boolean zA = a(dVar2);
                u.c cVar6 = dVar2.I;
                u.c cVar7 = dVar2.K;
                if (dVar2.z() && zA) {
                    z5 = true;
                    u.e.V(dVar2, fVar, new b());
                } else {
                    z5 = true;
                }
                boolean z6 = ((cVar5 == cVar6 && (cVar4 = cVar7.f) != null && cVar4.f3759c) || (cVar5 == cVar7 && (cVar3 = cVar6.f) != null && cVar3.f3759c)) ? z5 : false;
                int i6 = dVar2.f3791p0[0];
                if (i6 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.J(iE, dVar2.q() + iE);
                            c(i5, dVar2, fVar, z4);
                        } else if (cVar5 == cVar7 && cVar6.f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.J(iE2 - dVar2.q(), iE2);
                            c(i5, dVar2, fVar, z4);
                        } else if (z6 && !dVar2.x()) {
                            d(i5, dVar2, fVar, z4);
                        }
                    }
                } else if (i6 == 3 && dVar2.f3797v >= 0 && dVar2.f3796u >= 0 && (dVar2.g0 == 8 || (dVar2.f3793r == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.x() && !dVar2.F && z6 && !dVar2.x()) {
                        e(i5, dVar, fVar, dVar2, z4);
                    }
                }
            }
        }
        if (dVar instanceof u.h) {
            return;
        }
        HashSet<u.c> hashSet2 = cVarI2.f3757a;
        if (hashSet2 != null && cVarI2.f3759c) {
            for (u.c cVar8 : hashSet2) {
                u.d dVar3 = cVar8.f3760d;
                int i7 = i4 + 1;
                boolean zA2 = a(dVar3);
                u.c cVar9 = dVar3.I;
                u.c cVar10 = dVar3.K;
                if (dVar3.z() && zA2) {
                    u.e.V(dVar3, fVar, new b());
                }
                boolean z7 = (cVar8 == cVar9 && (cVar2 = cVar10.f) != null && cVar2.f3759c) || (cVar8 == cVar10 && (cVar = cVar9.f) != null && cVar.f3759c);
                int i8 = dVar3.f3791p0[0];
                if (i8 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.J(iE3, dVar3.q() + iE3);
                            c(i7, dVar3, fVar, z4);
                        } else if (cVar8 == cVar10 && cVar9.f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.J(iE4 - dVar3.q(), iE4);
                            c(i7, dVar3, fVar, z4);
                        } else if (z7 && !dVar3.x()) {
                            d(i7, dVar3, fVar, z4);
                        }
                    }
                } else if (i8 == 3 && dVar3.f3797v >= 0 && dVar3.f3796u >= 0) {
                    if (dVar3.g0 == 8 || (dVar3.f3793r == 0 && dVar3.W == 0.0f)) {
                        if (!dVar3.x() && !dVar3.F && z7 && !dVar3.x()) {
                            e(i7, dVar, fVar, dVar3, z4);
                        }
                    }
                }
            }
        }
        dVar.f3785m = true;
    }

    public static void d(int i4, u.d dVar, x.f fVar, boolean z4) {
        float f = dVar.d0;
        u.c cVar = dVar.I;
        int iD = cVar.f.d();
        u.c cVar2 = dVar.K;
        int iD2 = cVar2.f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = dVar.q();
        int i5 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i5 = (iD - iD2) - iQ;
        }
        int i6 = ((int) (i5 > 0 ? (f * i5) + 0.5f : f * i5)) + iD;
        int i7 = i6 + iQ;
        if (iD > iD2) {
            i7 = i6 - iQ;
        }
        dVar.J(i6, i7);
        c(i4 + 1, dVar, fVar, z4);
    }

    public static void e(int i4, u.d dVar, x.f fVar, u.d dVar2, boolean z4) {
        float f = dVar2.d0;
        u.c cVar = dVar2.I;
        int iE = cVar.e() + cVar.f.d();
        u.c cVar2 = dVar2.K;
        int iD = cVar2.f.d() - cVar2.e();
        if (iD >= iE) {
            int iQ = dVar2.q();
            if (dVar2.g0 != 8) {
                int i5 = dVar2.f3793r;
                if (i5 == 2) {
                    iQ = (int) (dVar2.d0 * 0.5f * (dVar instanceof u.e ? dVar.q() : dVar.T.q()));
                } else if (i5 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(dVar2.f3796u, iQ);
                int i6 = dVar2.f3797v;
                if (i6 > 0) {
                    iQ = Math.min(i6, iQ);
                }
            }
            int i7 = iE + ((int) ((f * ((iD - iE) - iQ)) + 0.5f));
            dVar2.J(i7, iQ + i7);
            c(i4 + 1, dVar2, fVar, z4);
        }
    }

    public static void f(int i4, u.d dVar, x.f fVar) {
        float f = dVar.f3773e0;
        u.c cVar = dVar.J;
        int iD = cVar.f.d();
        u.c cVar2 = dVar.L;
        int iD2 = cVar2.f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = dVar.k();
        int i5 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i5 = (iD - iD2) - iK;
        }
        int i6 = (int) (i5 > 0 ? (f * i5) + 0.5f : f * i5);
        int i7 = iD + i6;
        int i8 = i7 + iK;
        if (iD > iD2) {
            i7 = iD - i6;
            i8 = i7 - iK;
        }
        dVar.K(i7, i8);
        i(i4 + 1, dVar, fVar);
    }

    public static void g(int i4, u.d dVar, x.f fVar, u.d dVar2) {
        float f = dVar2.f3773e0;
        u.c cVar = dVar2.J;
        int iE = cVar.e() + cVar.f.d();
        u.c cVar2 = dVar2.L;
        int iD = cVar2.f.d() - cVar2.e();
        if (iD >= iE) {
            int iK = dVar2.k();
            if (dVar2.g0 != 8) {
                int i5 = dVar2.f3794s;
                if (i5 == 2) {
                    iK = (int) (f * 0.5f * (dVar instanceof u.e ? dVar.k() : dVar.T.k()));
                } else if (i5 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(dVar2.f3799x, iK);
                int i6 = dVar2.f3800y;
                if (i6 > 0) {
                    iK = Math.min(i6, iK);
                }
            }
            int i7 = iE + ((int) ((f * ((iD - iE) - iK)) + 0.5f));
            dVar2.K(i7, iK + i7);
            i(i4 + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i4, int i5, int i6, int i7) {
        return (i6 == 1 || i6 == 2 || (i6 == 4 && i4 != 2)) || (i7 == 1 || i7 == 2 || (i7 == 4 && i5 != 2));
    }

    public static void i(int i4, u.d dVar, x.f fVar) {
        boolean z4;
        u.c cVar;
        u.c cVar2;
        u.c cVar3;
        u.c cVar4;
        if (dVar.n) {
            return;
        }
        if (!(dVar instanceof u.e) && dVar.z() && a(dVar)) {
            u.e.V(dVar, fVar, new b());
        }
        u.c cVarI = dVar.i(3);
        u.c cVarI2 = dVar.i(5);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet<u.c> hashSet = cVarI.f3757a;
        if (hashSet != null && cVarI.f3759c) {
            for (u.c cVar5 : hashSet) {
                u.d dVar2 = cVar5.f3760d;
                int i5 = i4 + 1;
                boolean zA = a(dVar2);
                u.c cVar6 = dVar2.J;
                u.c cVar7 = dVar2.L;
                if (dVar2.z() && zA) {
                    u.e.V(dVar2, fVar, new b());
                }
                boolean z5 = (cVar5 == cVar6 && (cVar4 = cVar7.f) != null && cVar4.f3759c) || (cVar5 == cVar7 && (cVar3 = cVar6.f) != null && cVar3.f3759c);
                int i6 = dVar2.f3791p0[1];
                if (i6 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.K(iE, dVar2.k() + iE);
                            i(i5, dVar2, fVar);
                        } else if (cVar5 == cVar7 && cVar6.f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.K(iE2 - dVar2.k(), iE2);
                            i(i5, dVar2, fVar);
                        } else if (z5 && !dVar2.y()) {
                            f(i5, dVar2, fVar);
                        }
                    }
                } else if (i6 == 3 && dVar2.f3800y >= 0 && dVar2.f3799x >= 0 && (dVar2.g0 == 8 || (dVar2.f3794s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.F && z5 && !dVar2.y()) {
                        g(i5, dVar, fVar, dVar2);
                    }
                }
            }
        }
        boolean z6 = true;
        z6 = true;
        z6 = true;
        if (dVar instanceof u.h) {
            return;
        }
        HashSet<u.c> hashSet2 = cVarI2.f3757a;
        if (hashSet2 != null && cVarI2.f3759c) {
            for (u.c cVar8 : hashSet2) {
                u.d dVar3 = cVar8.f3760d;
                int i7 = i4 + 1;
                boolean zA2 = a(dVar3);
                u.c cVar9 = dVar3.J;
                u.c cVar10 = dVar3.L;
                if (dVar3.z() && zA2) {
                    u.e.V(dVar3, fVar, new b());
                }
                boolean z7 = (cVar8 == cVar9 && (cVar2 = cVar10.f) != null && cVar2.f3759c) || (cVar8 == cVar10 && (cVar = cVar9.f) != null && cVar.f3759c);
                int i8 = dVar3.f3791p0[1];
                if (i8 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.K(iE3, dVar3.k() + iE3);
                            i(i7, dVar3, fVar);
                        } else if (cVar8 == cVar10 && cVar9.f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.K(iE4 - dVar3.k(), iE4);
                            i(i7, dVar3, fVar);
                        } else if (z7 && !dVar3.y()) {
                            f(i7, dVar3, fVar);
                        }
                    }
                } else if (i8 == 3 && dVar3.f3800y >= 0 && dVar3.f3799x >= 0 && (dVar3.g0 == 8 || (dVar3.f3794s == 0 && dVar3.W == 0.0f))) {
                    if (!dVar3.y() && !dVar3.F && z7 && !dVar3.y()) {
                        g(i7, dVar, fVar, dVar3);
                    }
                }
            }
        }
        u.c cVarI3 = dVar.i(6);
        if (cVarI3.f3757a != null && cVarI3.f3759c) {
            int iD3 = cVarI3.d();
            for (u.c cVar11 : cVarI3.f3757a) {
                u.d dVar4 = cVar11.f3760d;
                int i9 = i4 + 1;
                boolean zA3 = a(dVar4);
                u.c cVar12 = dVar4.M;
                if (dVar4.z() && zA3) {
                    u.e.V(dVar4, fVar, new b());
                }
                if (dVar4.f3791p0[z6 ? 1 : 0] != 3 || zA3) {
                    if (!dVar4.z()) {
                        if (cVar11 == cVar12) {
                            int iE5 = cVar11.e() + iD3;
                            if (dVar4.E) {
                                int i10 = iE5 - dVar4.f3766a0;
                                int i11 = dVar4.V + i10;
                                dVar4.Z = i10;
                                dVar4.J.l(i10);
                                dVar4.L.l(i11);
                                cVar12.l(iE5);
                                z4 = z6 ? 1 : 0;
                                dVar4.f3783l = z4;
                            } else {
                                z4 = z6 ? 1 : 0;
                            }
                            i(i9, dVar4, fVar);
                        }
                        z6 = z4;
                    }
                }
                z4 = z6 ? 1 : 0;
                z6 = z4;
            }
        }
        dVar.n = z6;
    }
}
