package u;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i {
    public int A0;
    public v.b B0;
    public x.f C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public d[] X0;
    public d[] Y0;
    public int[] Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public d[] f3827a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f3828b1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f3829s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f3830t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f3831u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f3832w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f3833x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f3834y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f3835z0;

    @Override // u.i
    public final void S() {
        for (int i4 = 0; i4 < this.f3842r0; i4++) {
            d dVar = this.f3841q0[i4];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    public final int T(d dVar, int i4) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f3791p0;
            if (iArr[1] == 3) {
                int i5 = dVar.f3794s;
                if (i5 != 0) {
                    if (i5 == 2) {
                        int i6 = (int) (dVar.f3801z * i4);
                        if (i6 != dVar.k()) {
                            dVar.f3775g = true;
                            V(iArr[0], dVar.q(), 1, i6, dVar);
                        }
                        return i6;
                    }
                    dVar2 = dVar;
                    if (i5 == 1) {
                        return dVar2.k();
                    }
                    if (i5 == 3) {
                        return (int) ((dVar2.q() * dVar2.W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.k();
        }
        return 0;
    }

    public final int U(d dVar, int i4) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f3791p0;
            if (iArr[0] == 3) {
                int i5 = dVar.f3793r;
                if (i5 != 0) {
                    if (i5 == 2) {
                        int i6 = (int) (dVar.f3798w * i4);
                        if (i6 != dVar.q()) {
                            dVar.f3775g = true;
                            V(1, i6, iArr[1], dVar.k(), dVar);
                        }
                        return i6;
                    }
                    dVar2 = dVar;
                    if (i5 == 1) {
                        return dVar2.q();
                    }
                    if (i5 == 3) {
                        return (int) ((dVar2.k() * dVar2.W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.q();
        }
        return 0;
    }

    public final void V(int i4, int i5, int i6, int i7, d dVar) {
        x.f fVar;
        d dVar2;
        v.b bVar = this.B0;
        while (true) {
            fVar = this.C0;
            if (fVar != null || (dVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((e) dVar2).f3806u0;
            }
        }
        bVar.f4228a = i4;
        bVar.f4229b = i6;
        bVar.f4230c = i5;
        bVar.f4231d = i7;
        fVar.b(dVar, bVar);
        dVar.O(bVar.f4232e);
        dVar.L(bVar.f);
        dVar.E = bVar.f4234h;
        dVar.I(bVar.f4233g);
    }

    @Override // u.d
    public final void b(s.c cVar, boolean z4) {
        d dVar;
        float f;
        int i4;
        ArrayList arrayList = this.W0;
        super.b(cVar, z4);
        d dVar2 = this.T;
        boolean z5 = dVar2 != null && ((e) dVar2).v0;
        int i5 = this.T0;
        if (i5 != 0) {
            if (i5 == 1) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    ((f) arrayList.get(i6)).b(i6, z5, i6 == size + (-1));
                    i6++;
                }
            } else if (i5 != 2) {
                if (i5 == 3) {
                    int size2 = arrayList.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        ((f) arrayList.get(i7)).b(i7, z5, i7 == size2 + (-1));
                        i7++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i8 = 0; i8 < this.f3828b1; i8++) {
                    this.f3827a1[i8].D();
                }
                int[] iArr = this.Z0;
                int i9 = iArr[0];
                int i10 = iArr[1];
                float f4 = this.J0;
                d dVar3 = null;
                int i11 = 0;
                while (i11 < i9) {
                    if (z5) {
                        i4 = (i9 - i11) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f4;
                        i4 = i11;
                    }
                    d dVar4 = this.Y0[i4];
                    if (dVar4 != null) {
                        c cVar2 = dVar4.I;
                        if (dVar4.g0 != 8) {
                            if (i11 == 0) {
                                dVar4.f(cVar2, this.I, this.f3832w0);
                                dVar4.f3779i0 = this.D0;
                                dVar4.d0 = f;
                            }
                            if (i11 == i9 - 1) {
                                dVar4.f(dVar4.K, this.K, this.f3833x0);
                            }
                            if (i11 > 0 && dVar3 != null) {
                                c cVar3 = dVar3.K;
                                dVar4.f(cVar2, cVar3, this.P0);
                                dVar3.f(cVar3, cVar2, 0);
                            }
                            dVar3 = dVar4;
                        }
                    }
                    i11++;
                    f4 = f;
                }
                for (int i12 = 0; i12 < i10; i12++) {
                    d dVar5 = this.X0[i12];
                    if (dVar5 != null) {
                        c cVar4 = dVar5.J;
                        if (dVar5.g0 != 8) {
                            if (i12 == 0) {
                                dVar5.f(cVar4, this.J, this.f3829s0);
                                dVar5.j0 = this.E0;
                                dVar5.f3773e0 = this.K0;
                            }
                            if (i12 == i10 - 1) {
                                dVar5.f(dVar5.L, this.L, this.f3830t0);
                            }
                            if (i12 > 0 && dVar3 != null) {
                                c cVar5 = dVar3.L;
                                dVar5.f(cVar4, cVar5, this.Q0);
                                dVar3.f(cVar5, cVar4, 0);
                            }
                            dVar3 = dVar5;
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        int i15 = (i14 * i9) + i13;
                        if (this.V0 == 1) {
                            i15 = (i13 * i10) + i14;
                        }
                        d[] dVarArr = this.f3827a1;
                        if (i15 < dVarArr.length && (dVar = dVarArr[i15]) != null && dVar.g0 != 8) {
                            d dVar6 = this.Y0[i13];
                            d dVar7 = this.X0[i14];
                            if (dVar != dVar6) {
                                dVar.f(dVar.I, dVar6.I, 0);
                                dVar.f(dVar.K, dVar6.K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.J, dVar7.J, 0);
                                dVar.f(dVar.L, dVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z5, true);
        }
        this.f3834y0 = false;
    }
}
