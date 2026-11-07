package u;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f3739s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f3740t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f3741u0;
    public boolean v0;

    @Override // u.d
    public final boolean A() {
        return this.v0;
    }

    @Override // u.d
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i4;
        int i5;
        int i6;
        boolean z4 = true;
        int i7 = 0;
        while (true) {
            i4 = this.f3842r0;
            if (i7 >= i4) {
                break;
            }
            d dVar = this.f3841q0[i7];
            if ((this.f3740t0 || dVar.c()) && ((((i5 = this.f3739s0) == 0 || i5 == 1) && !dVar.A()) || (((i6 = this.f3739s0) == 2 || i6 == 3) && !dVar.B()))) {
                z4 = false;
            }
            i7++;
        }
        if (!z4 || i4 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z5 = false;
        for (int i8 = 0; i8 < this.f3842r0; i8++) {
            d dVar2 = this.f3841q0[i8];
            if (this.f3740t0 || dVar2.c()) {
                if (!z5) {
                    int i9 = this.f3739s0;
                    if (i9 == 0) {
                        iMax = dVar2.i(2).d();
                    } else if (i9 == 1) {
                        iMax = dVar2.i(4).d();
                    } else if (i9 == 2) {
                        iMax = dVar2.i(3).d();
                    } else if (i9 == 3) {
                        iMax = dVar2.i(5).d();
                    }
                    z5 = true;
                }
                int i10 = this.f3739s0;
                if (i10 == 0) {
                    iMax = Math.min(iMax, dVar2.i(2).d());
                } else if (i10 == 1) {
                    iMax = Math.max(iMax, dVar2.i(4).d());
                } else if (i10 == 2) {
                    iMax = Math.min(iMax, dVar2.i(3).d());
                } else if (i10 == 3) {
                    iMax = Math.max(iMax, dVar2.i(5).d());
                }
            }
        }
        int i11 = iMax + this.f3741u0;
        int i12 = this.f3739s0;
        if (i12 == 0 || i12 == 1) {
            J(i11, i11);
        } else {
            K(i11, i11);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i4 = this.f3739s0;
        if (i4 == 0 || i4 == 1) {
            return 0;
        }
        return (i4 == 2 || i4 == 3) ? 1 : -1;
    }

    @Override // u.d
    public final void b(s.c cVar, boolean z4) {
        boolean z5;
        int i4;
        int i5;
        c[] cVarArr = this.Q;
        c cVar2 = this.I;
        cVarArr[0] = cVar2;
        int i6 = 2;
        c cVar3 = this.J;
        cVarArr[2] = cVar3;
        c cVar4 = this.K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f3764i = cVar.k(cVar6);
        }
        int i7 = this.f3739s0;
        if (i7 < 0 || i7 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i7];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i8 = this.f3739s0;
            if (i8 == 0 || i8 == 1) {
                cVar.d(cVar2.f3764i, this.Y);
                cVar.d(cVar4.f3764i, this.Y);
                return;
            } else {
                if (i8 == 2 || i8 == 3) {
                    cVar.d(cVar3.f3764i, this.Z);
                    cVar.d(cVar5.f3764i, this.Z);
                    return;
                }
                return;
            }
        }
        int i9 = 0;
        while (true) {
            if (i9 >= this.f3842r0) {
                z5 = false;
                break;
            }
            d dVar = this.f3841q0[i9];
            if ((this.f3740t0 || dVar.c()) && ((((i5 = this.f3739s0) == 0 || i5 == 1) && dVar.f3791p0[0] == 3 && dVar.I.f != null && dVar.K.f != null) || ((i5 == 2 || i5 == 3) && dVar.f3791p0[1] == 3 && dVar.J.f != null && dVar.L.f != null))) {
                z5 = true;
                break;
            }
            i9++;
        }
        boolean z6 = cVar2.g() || cVar4.g();
        boolean z7 = cVar3.g() || cVar5.g();
        int i10 = !(!z5 && (((i4 = this.f3739s0) == 0 && z6) || ((i4 == 2 && z7) || ((i4 == 1 && z6) || (i4 == 3 && z7))))) ? 4 : 5;
        int i11 = 0;
        while (i11 < this.f3842r0) {
            d dVar2 = this.f3841q0[i11];
            if (this.f3740t0 || dVar2.c()) {
                s.f fVarK = cVar.k(dVar2.Q[this.f3739s0]);
                c[] cVarArr2 = dVar2.Q;
                int i12 = this.f3739s0;
                c cVar8 = cVarArr2[i12];
                cVar8.f3764i = fVarK;
                c cVar9 = cVar8.f;
                int i13 = (cVar9 == null || cVar9.f3760d != this) ? 0 : cVar8.f3762g;
                if (i12 == 0 || i12 == i6) {
                    s.f fVar = cVar7.f3764i;
                    int i14 = this.f3741u0 - i13;
                    s.b bVarL = cVar.l();
                    s.f fVarM = cVar.m();
                    fVarM.f3649i = 0;
                    bVarL.c(fVar, fVarK, fVarM, i14);
                    cVar.c(bVarL);
                } else {
                    s.f fVar2 = cVar7.f3764i;
                    int i15 = this.f3741u0 + i13;
                    s.b bVarL2 = cVar.l();
                    s.f fVarM2 = cVar.m();
                    fVarM2.f3649i = 0;
                    bVarL2.b(fVar2, fVarK, fVarM2, i15);
                    cVar.c(bVarL2);
                }
                cVar.e(cVar7.f3764i, fVarK, this.f3741u0 + i13, i10);
            }
            i11++;
            i6 = 2;
        }
        int i16 = this.f3739s0;
        if (i16 == 0) {
            cVar.e(cVar4.f3764i, cVar2.f3764i, 0, 8);
            cVar.e(cVar2.f3764i, this.T.K.f3764i, 0, 4);
            cVar.e(cVar2.f3764i, this.T.I.f3764i, 0, 0);
            return;
        }
        if (i16 == 1) {
            cVar.e(cVar2.f3764i, cVar4.f3764i, 0, 8);
            cVar.e(cVar2.f3764i, this.T.I.f3764i, 0, 4);
            cVar.e(cVar2.f3764i, this.T.K.f3764i, 0, 0);
        } else if (i16 == 2) {
            cVar.e(cVar5.f3764i, cVar3.f3764i, 0, 8);
            cVar.e(cVar3.f3764i, this.T.L.f3764i, 0, 4);
            cVar.e(cVar3.f3764i, this.T.J.f3764i, 0, 0);
        } else if (i16 == 3) {
            cVar.e(cVar3.f3764i, cVar5.f3764i, 0, 8);
            cVar.e(cVar3.f3764i, this.T.J.f3764i, 0, 4);
            cVar.e(cVar3.f3764i, this.T.L.f3764i, 0, 0);
        }
    }

    @Override // u.d
    public final boolean c() {
        return true;
    }

    @Override // u.d
    public final String toString() {
        String strConcat = "[Barrier] " + this.f3777h0 + " {";
        for (int i4 = 0; i4 < this.f3842r0; i4++) {
            d dVar = this.f3841q0[i4];
            if (i4 > 0) {
                strConcat = strConcat.concat(", ");
            }
            strConcat = strConcat + dVar.f3777h0;
        }
        return strConcat.concat("}");
    }
}
