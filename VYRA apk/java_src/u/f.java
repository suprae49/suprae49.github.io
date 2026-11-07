package u;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3811a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f3814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f3815e;
    public c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f3816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3819j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3820k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3825q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3826r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f3812b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3813c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3821l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3822m = 0;
    public int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3823o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3824p = 0;

    public f(g gVar, int i4, c cVar, c cVar2, c cVar3, c cVar4, int i5) {
        this.f3826r = gVar;
        this.f3811a = i4;
        this.f3814d = cVar;
        this.f3815e = cVar2;
        this.f = cVar3;
        this.f3816g = cVar4;
        this.f3817h = gVar.f3832w0;
        this.f3818i = gVar.f3829s0;
        this.f3819j = gVar.f3833x0;
        this.f3820k = gVar.f3830t0;
        this.f3825q = i5;
    }

    public final void a(d dVar) {
        int i4 = this.f3811a;
        int i5 = this.f3825q;
        g gVar = this.f3826r;
        if (i4 == 0) {
            int iU = gVar.U(dVar, i5);
            if (dVar.f3791p0[0] == 3) {
                this.f3824p++;
                iU = 0;
            }
            this.f3821l = iU + (dVar.g0 != 8 ? gVar.P0 : 0) + this.f3821l;
            int iT = gVar.T(dVar, this.f3825q);
            if (this.f3812b == null || this.f3813c < iT) {
                this.f3812b = dVar;
                this.f3813c = iT;
                this.f3822m = iT;
            }
        } else {
            int iU2 = gVar.U(dVar, i5);
            int iT2 = gVar.T(dVar, this.f3825q);
            if (dVar.f3791p0[1] == 3) {
                this.f3824p++;
                iT2 = 0;
            }
            this.f3822m = iT2 + (dVar.g0 != 8 ? gVar.Q0 : 0) + this.f3822m;
            if (this.f3812b == null || this.f3813c < iU2) {
                this.f3812b = dVar;
                this.f3813c = iU2;
                this.f3821l = iU2;
            }
        }
        this.f3823o++;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0105 A[PHI: r5 r9
      0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    public final void b(int i4, boolean z4, boolean z5) {
        g gVar;
        int i5;
        int i6;
        d dVar;
        boolean z6;
        char c4;
        int i7;
        float f;
        int i8;
        int i9 = this.f3823o;
        int i10 = 0;
        while (true) {
            gVar = this.f3826r;
            if (i10 >= i9 || (i8 = this.n + i10) >= gVar.f3828b1) {
                break;
            }
            d dVar2 = gVar.f3827a1[i8];
            if (dVar2 != null) {
                dVar2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f3812b == null) {
            return;
        }
        boolean z7 = z5 && i4 == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.n + (z4 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f3828b1) {
                break;
            }
            d dVar3 = gVar.f3827a1[i14];
            if (dVar3 != null && dVar3.g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        int i15 = this.f3811a;
        d dVar4 = this.f3812b;
        if (i15 == 0) {
            dVar4.j0 = gVar.E0;
            c cVar = dVar4.L;
            c cVar2 = dVar4.J;
            int i16 = this.f3818i;
            if (i4 > 0) {
                i16 += gVar.Q0;
            }
            cVar2.a(this.f3815e, i16);
            if (z5) {
                cVar.a(this.f3816g, this.f3820k);
            }
            if (i4 > 0) {
                this.f3815e.f3760d.L.a(cVar2, 0);
            }
            if (gVar.S0 != 3 || dVar4.E) {
                dVar = dVar4;
                break;
            }
            int i17 = 0;
            while (true) {
                if (i17 < i9) {
                    int i18 = this.n + (z4 ? (i9 - 1) - i17 : i17);
                    if (i18 < gVar.f3828b1) {
                        dVar = gVar.f3827a1[i18];
                        if (dVar.E) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                dVar = dVar4;
                break;
            }
            int i19 = 0;
            d dVar5 = null;
            while (i19 < i9) {
                int i20 = z4 ? (i9 - 1) - i19 : i19;
                int i21 = this.n + i20;
                if (i21 >= gVar.f3828b1) {
                    return;
                }
                d dVar6 = gVar.f3827a1[i21];
                if (dVar6 == null) {
                    i9 = i9;
                    z6 = z7;
                    i12 = i12;
                    c4 = 3;
                } else {
                    c cVar3 = dVar6.J;
                    c cVar4 = dVar6.L;
                    c cVar5 = dVar6.I;
                    z6 = z7;
                    if (i19 == 0) {
                        dVar6.f(cVar5, this.f3814d, this.f3817h);
                    }
                    if (i20 == 0) {
                        int i22 = gVar.D0;
                        float f4 = gVar.J0;
                        if (z4) {
                            f4 = 1.0f - f4;
                        }
                        if (this.n == 0 && (i7 = gVar.F0) != -1) {
                            f = gVar.L0;
                            if (z4) {
                                f = 1.0f - f;
                            }
                        } else if (!z5 || (i7 = gVar.H0) == -1) {
                            i7 = i22;
                            f = f4;
                        } else {
                            f = gVar.N0;
                            if (z4) {
                                f = 1.0f - f;
                            }
                        }
                        dVar6.f3779i0 = i7;
                        dVar6.d0 = f;
                    }
                    if (i19 == i9 - 1) {
                        dVar6.f(dVar6.K, this.f, this.f3819j);
                    }
                    if (dVar5 != null) {
                        c cVar6 = dVar5.K;
                        cVar5.a(cVar6, gVar.P0);
                        if (i19 == i11) {
                            int i23 = this.f3817h;
                            if (cVar5.h()) {
                                cVar5.f3763h = i23;
                            }
                        }
                        cVar6.a(cVar5, 0);
                        if (i19 == i12 + 1) {
                            int i24 = this.f3819j;
                            if (cVar6.h()) {
                                cVar6.f3763h = i24;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        int i25 = gVar.S0;
                        c4 = 3;
                        if (i25 == 3 && dVar.E && dVar6 != dVar && dVar6.E) {
                            dVar6.M.a(dVar.M, 0);
                        } else if (i25 == 0) {
                            cVar3.a(cVar2, 0);
                        } else if (i25 == 1) {
                            cVar4.a(cVar, 0);
                        } else if (z6) {
                            cVar3.a(this.f3815e, this.f3818i);
                            cVar4.a(this.f3816g, this.f3820k);
                        } else {
                            cVar3.a(cVar2, 0);
                            cVar4.a(cVar, 0);
                        }
                    } else {
                        c4 = 3;
                    }
                    dVar5 = dVar6;
                }
                i19++;
                z7 = z6;
                i12 = i12;
                i9 = i9;
            }
            return;
        }
        int i26 = i9;
        boolean z8 = z7;
        int i27 = i12;
        dVar4.f3779i0 = gVar.D0;
        c cVar7 = dVar4.I;
        c cVar8 = dVar4.K;
        int i28 = this.f3817h;
        if (i4 > 0) {
            i28 += gVar.P0;
        }
        if (z4) {
            cVar8.a(this.f, i28);
            if (z5) {
                cVar7.a(this.f3814d, this.f3819j);
            }
            if (i4 > 0) {
                this.f.f3760d.I.a(cVar8, 0);
            }
        } else {
            cVar7.a(this.f3814d, i28);
            if (z5) {
                cVar8.a(this.f, this.f3819j);
            }
            if (i4 > 0) {
                this.f3814d.f3760d.K.a(cVar7, 0);
            }
        }
        int i29 = 0;
        d dVar7 = null;
        while (true) {
            int i30 = i26;
            if (i29 >= i30 || (i5 = this.n + i29) >= gVar.f3828b1) {
                return;
            }
            d dVar8 = gVar.f3827a1[i5];
            if (dVar8 == null) {
                i26 = i30;
            } else {
                c cVar9 = dVar8.I;
                c cVar10 = dVar8.J;
                c cVar11 = dVar8.K;
                if (i29 == 0) {
                    dVar8.f(cVar10, this.f3815e, this.f3818i);
                    int i31 = gVar.E0;
                    float f5 = gVar.K0;
                    if (this.n == 0) {
                        int i32 = gVar.G0;
                        i26 = i30;
                        i6 = -1;
                        if (i32 != -1) {
                            f5 = gVar.M0;
                        }
                        i31 = i32;
                        dVar8.j0 = i31;
                        dVar8.f3773e0 = f5;
                    } else {
                        i26 = i30;
                        i6 = -1;
                    }
                    if (z5 && (i32 = gVar.I0) != i6) {
                        f5 = gVar.O0;
                        i31 = i32;
                    }
                    dVar8.j0 = i31;
                    dVar8.f3773e0 = f5;
                } else {
                    i26 = i30;
                }
                if (i29 == i26 - 1) {
                    dVar8.f(dVar8.L, this.f3816g, this.f3820k);
                }
                if (dVar7 != null) {
                    c cVar12 = dVar7.L;
                    cVar10.a(cVar12, gVar.Q0);
                    if (i29 == i11) {
                        int i33 = this.f3818i;
                        if (cVar10.h()) {
                            cVar10.f3763h = i33;
                        }
                    }
                    cVar12.a(cVar10, 0);
                    if (i29 == i27 + 1) {
                        int i34 = this.f3820k;
                        if (cVar12.h()) {
                            cVar12.f3763h = i34;
                        }
                    }
                }
                if (dVar8 != dVar4) {
                    int i35 = gVar.R0;
                    if (z4) {
                        if (i35 == 0) {
                            cVar11.a(cVar8, 0);
                        } else if (i35 == 1) {
                            cVar9.a(cVar7, 0);
                        } else if (i35 == 2) {
                            cVar9.a(cVar7, 0);
                            cVar11.a(cVar8, 0);
                        }
                    } else if (i35 == 0) {
                        cVar9.a(cVar7, 0);
                    } else if (i35 == 1) {
                        cVar11.a(cVar8, 0);
                    } else if (i35 == 2) {
                        if (z8) {
                            cVar9.a(this.f3814d, this.f3817h);
                            cVar11.a(this.f, this.f3819j);
                        } else {
                            cVar9.a(cVar7, 0);
                            cVar11.a(cVar8, 0);
                        }
                    }
                }
                dVar7 = dVar8;
            }
            i29++;
        }
    }

    public final int c() {
        int i4 = this.f3811a;
        int i5 = this.f3822m;
        return i4 == 1 ? i5 - this.f3826r.Q0 : i5;
    }

    public final int d() {
        int i4 = this.f3811a;
        int i5 = this.f3821l;
        return i4 == 0 ? i5 - this.f3826r.P0 : i5;
    }

    public final void e(int i4) {
        g gVar;
        int i5;
        int i6 = this.f3824p;
        if (i6 == 0) {
            return;
        }
        int i7 = this.f3823o;
        int i8 = i4 / i6;
        int i9 = 0;
        while (true) {
            gVar = this.f3826r;
            if (i9 >= i7 || (i5 = this.n + i9) >= gVar.f3828b1) {
                break;
            }
            d dVar = gVar.f3827a1[i5];
            if (this.f3811a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f3791p0;
                    if (iArr[0] == 3 && dVar.f3793r == 0) {
                        gVar.V(1, i8, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f3791p0;
                if (iArr2[1] == 3 && dVar.f3794s == 0) {
                    int i10 = i8;
                    gVar.V(iArr2[0], dVar.q(), 1, i10, dVar);
                    i8 = i10;
                }
            }
            i9++;
        }
        this.f3821l = 0;
        this.f3822m = 0;
        this.f3812b = null;
        this.f3813c = 0;
        int i11 = this.f3823o;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.n + i12;
            if (i13 >= gVar.f3828b1) {
                return;
            }
            d dVar2 = gVar.f3827a1[i13];
            if (this.f3811a == 0) {
                int iQ = dVar2.q();
                int i14 = gVar.P0;
                if (dVar2.g0 == 8) {
                    i14 = 0;
                }
                this.f3821l = iQ + i14 + this.f3821l;
                int iT = gVar.T(dVar2, this.f3825q);
                if (this.f3812b == null || this.f3813c < iT) {
                    this.f3812b = dVar2;
                    this.f3813c = iT;
                    this.f3822m = iT;
                }
            } else {
                int iU = gVar.U(dVar2, this.f3825q);
                int iT2 = gVar.T(dVar2, this.f3825q);
                int i15 = gVar.Q0;
                if (dVar2.g0 == 8) {
                    i15 = 0;
                }
                this.f3822m = iT2 + i15 + this.f3822m;
                if (this.f3812b == null || this.f3813c < iU) {
                    this.f3812b = dVar2;
                    this.f3813c = iU;
                    this.f3821l = iU;
                }
            }
        }
    }

    public final void f(int i4, c cVar, c cVar2, c cVar3, c cVar4, int i5, int i6, int i7, int i8, int i9) {
        this.f3811a = i4;
        this.f3814d = cVar;
        this.f3815e = cVar2;
        this.f = cVar3;
        this.f3816g = cVar4;
        this.f3817h = i5;
        this.f3818i = i6;
        this.f3819j = i7;
        this.f3820k = i8;
        this.f3825q = i9;
    }
}
