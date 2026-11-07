package v;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f4237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4238l;

    public c(u.d dVar, int i4) {
        u.d dVar2;
        super(dVar);
        ArrayList arrayList = new ArrayList();
        this.f4237k = arrayList;
        this.f = i4;
        u.d dVar3 = this.f4270b;
        u.d dVarM = dVar3.m(i4);
        while (true) {
            dVar2 = dVar3;
            dVar3 = dVarM;
            if (dVar3 == null) {
                break;
            } else {
                dVarM = dVar3.m(this.f);
            }
        }
        this.f4270b = dVar2;
        int i5 = this.f;
        arrayList.add(i5 == 0 ? dVar2.f3771d : i5 == 1 ? dVar2.f3772e : null);
        u.d dVarL = dVar2.l(this.f);
        while (dVarL != null) {
            int i6 = this.f;
            arrayList.add(i6 == 0 ? dVarL.f3771d : i6 == 1 ? dVarL.f3772e : null);
            dVarL = dVarL.l(this.f);
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            o oVar = (o) obj;
            int i8 = this.f;
            if (i8 == 0) {
                oVar.f4270b.f3767b = this;
            } else if (i8 == 1) {
                oVar.f4270b.f3769c = this;
            }
        }
        if (this.f == 0 && ((u.e) this.f4270b.T).v0 && arrayList.size() > 1) {
            this.f4270b = ((o) arrayList.get(arrayList.size() - 1)).f4270b;
        }
        int i9 = this.f;
        u.d dVar4 = this.f4270b;
        this.f4238l = i9 == 0 ? dVar4.f3779i0 : dVar4.j0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    @Override // v.d
    public final void a(d dVar) {
        int i4;
        int i5;
        boolean z4;
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        float f4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f5;
        f fVar = this.f4275h;
        if (fVar.f4254j) {
            f fVar2 = this.f4276i;
            if (fVar2.f4254j) {
                u.d dVar2 = this.f4270b.T;
                boolean z5 = dVar2 instanceof u.e ? ((u.e) dVar2).v0 : false;
                int i16 = fVar2.f4251g - fVar.f4251g;
                ArrayList arrayList = this.f4237k;
                int size = arrayList.size();
                int i17 = 0;
                while (true) {
                    i4 = -1;
                    i5 = 8;
                    if (i17 >= size) {
                        i17 = -1;
                        break;
                    } else if (((o) arrayList.get(i17)).f4270b.g0 != 8) {
                        break;
                    } else {
                        i17++;
                    }
                }
                int i18 = size - 1;
                for (int i19 = i18; i19 >= 0; i19--) {
                    if (((o) arrayList.get(i19)).f4270b.g0 != 8) {
                        i4 = i19;
                        break;
                    }
                }
                int i20 = 0;
                while (true) {
                    if (i20 >= 2) {
                        z4 = z5;
                        f = 0.0f;
                        i6 = 0;
                        i7 = 0;
                        i8 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i21 = 0;
                    i8 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    while (i21 < size) {
                        o oVar = (o) arrayList.get(i21);
                        u.d dVar3 = oVar.f4270b;
                        boolean z6 = z5;
                        if (dVar3.g0 == i5) {
                            i14 = i20;
                        } else {
                            i23++;
                            if (i21 > 0 && i21 >= i17) {
                                i8 += oVar.f4275h.f;
                            }
                            g gVar = oVar.f4273e;
                            int i24 = gVar.f4251g;
                            i14 = i20;
                            boolean z7 = oVar.f4272d != 3;
                            if (z7) {
                                int i25 = this.f;
                                if (i25 == 0 && !dVar3.f3771d.f4273e.f4254j) {
                                    return;
                                }
                                if (i25 == 1 && !dVar3.f3772e.f4273e.f4254j) {
                                    return;
                                }
                            } else {
                                if (oVar.f4269a == 1 && i14 == 0) {
                                    i15 = gVar.f4257m;
                                    i22++;
                                } else {
                                    if (gVar.f4254j) {
                                        i15 = i24;
                                    }
                                    if (z7) {
                                        i8 += i15;
                                    } else {
                                        i22++;
                                        f5 = dVar3.f3782k0[this.f];
                                        if (f5 >= 0.0f) {
                                            f += f5;
                                        }
                                    }
                                    if (i21 >= i18 && i21 < i4) {
                                        i8 += -oVar.f4276i.f;
                                    }
                                }
                                z7 = true;
                                if (z7) {
                                    i22++;
                                    f5 = dVar3.f3782k0[this.f];
                                    if (f5 >= 0.0f) {
                                        f += f5;
                                    }
                                } else {
                                    i8 += i15;
                                }
                                if (i21 >= i18) {
                                }
                            }
                            i15 = i24;
                            if (z7) {
                                i22++;
                                f5 = dVar3.f3782k0[this.f];
                                if (f5 >= 0.0f) {
                                    f += f5;
                                }
                            } else {
                                i8 += i15;
                            }
                            if (i21 >= i18) {
                            }
                        }
                        i21++;
                        z5 = z6;
                        i20 = i14;
                        i5 = 8;
                    }
                    z4 = z5;
                    int i26 = i20;
                    if (i8 < i16 || i22 == 0) {
                        i6 = i22;
                        i7 = i23;
                        break;
                    } else {
                        i20 = i26 + 1;
                        z5 = z4;
                        i5 = 8;
                    }
                }
                int i27 = fVar.f4251g;
                if (z4) {
                    i27 = fVar2.f4251g;
                }
                float f6 = 0.5f;
                if (i8 > i16) {
                    i27 = z4 ? i27 + ((int) (((i8 - i16) / 2.0f) + 0.5f)) : i27 - ((int) (((i8 - i16) / 2.0f) + 0.5f));
                }
                if (i6 > 0) {
                    float f7 = i16 - i8;
                    int i28 = (int) ((f7 / i6) + 0.5f);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < size) {
                        float f8 = f6;
                        o oVar2 = (o) arrayList.get(i29);
                        int i31 = i27;
                        u.d dVar4 = oVar2.f4270b;
                        int i32 = i6;
                        g gVar2 = oVar2.f4273e;
                        float f9 = f7;
                        int i33 = i28;
                        if (dVar4.g0 != 8 && oVar2.f4272d == 3 && !gVar2.f4254j) {
                            int i34 = f > 0.0f ? (int) (((dVar4.f3782k0[this.f] * f9) / f) + f8) : i33;
                            if (this.f == 0) {
                                i12 = dVar4.f3797v;
                                i13 = dVar4.f3796u;
                            } else {
                                i12 = dVar4.f3800y;
                                i13 = dVar4.f3799x;
                            }
                            int iMax = Math.max(i13, oVar2.f4269a == 1 ? Math.min(i34, gVar2.f4257m) : i34);
                            if (i12 > 0) {
                                iMax = Math.min(i12, iMax);
                            }
                            if (iMax != i34) {
                                i30++;
                                i34 = iMax;
                            }
                            gVar2.d(i34);
                        }
                        i29++;
                        i27 = i31;
                        f6 = f8;
                        i6 = i32;
                        f7 = f9;
                        i28 = i33;
                    }
                    i9 = i27;
                    f4 = f6;
                    int i35 = i6;
                    if (i30 > 0) {
                        i6 = i35 - i30;
                        i8 = 0;
                        for (int i36 = 0; i36 < size; i36++) {
                            o oVar3 = (o) arrayList.get(i36);
                            if (oVar3.f4270b.g0 != 8) {
                                if (i36 > 0 && i36 >= i17) {
                                    i8 += oVar3.f4275h.f;
                                }
                                i8 += oVar3.f4273e.f4251g;
                                if (i36 < i18 && i36 < i4) {
                                    i8 += -oVar3.f4276i.f;
                                }
                            }
                        }
                    } else {
                        i6 = i35;
                    }
                    i11 = 2;
                    if (this.f4238l == 2 && i30 == 0) {
                        i10 = 0;
                        this.f4238l = 0;
                    } else {
                        i10 = 0;
                    }
                } else {
                    i9 = i27;
                    f4 = 0.5f;
                    i10 = 0;
                    i11 = 2;
                }
                if (i8 > i16) {
                    this.f4238l = i11;
                }
                if (i7 > 0 && i6 == 0 && i17 == i4) {
                    this.f4238l = i11;
                }
                int i37 = this.f4238l;
                if (i37 == 1) {
                    int i38 = i7 > 1 ? (i16 - i8) / (i7 - 1) : i7 == 1 ? (i16 - i8) / 2 : i10;
                    if (i6 > 0) {
                        i38 = i10;
                    }
                    int i39 = i9;
                    for (int i40 = i10; i40 < size; i40++) {
                        o oVar4 = (o) arrayList.get(z4 ? size - (i40 + 1) : i40);
                        u.d dVar5 = oVar4.f4270b;
                        f fVar3 = oVar4.f4276i;
                        f fVar4 = oVar4.f4275h;
                        if (dVar5.g0 == 8) {
                            fVar4.d(i39);
                            fVar3.d(i39);
                        } else {
                            if (i40 > 0) {
                                i39 = z4 ? i39 - i38 : i39 + i38;
                            }
                            if (i40 > 0 && i40 >= i17) {
                                i39 = z4 ? i39 - fVar4.f : i39 + fVar4.f;
                            }
                            if (z4) {
                                fVar3.d(i39);
                            } else {
                                fVar4.d(i39);
                            }
                            g gVar3 = oVar4.f4273e;
                            int i41 = gVar3.f4251g;
                            if (oVar4.f4272d == 3 && oVar4.f4269a == 1) {
                                i41 = gVar3.f4257m;
                            }
                            i39 = z4 ? i39 - i41 : i39 + i41;
                            if (z4) {
                                fVar4.d(i39);
                            } else {
                                fVar3.d(i39);
                            }
                            oVar4.f4274g = true;
                            if (i40 < i18 && i40 < i4) {
                                i39 = z4 ? i39 - (-fVar3.f) : i39 + (-fVar3.f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 0) {
                    int i42 = (i16 - i8) / (i7 + 1);
                    if (i6 > 0) {
                        i42 = i10;
                    }
                    int i43 = i9;
                    for (int i44 = i10; i44 < size; i44++) {
                        o oVar5 = (o) arrayList.get(z4 ? size - (i44 + 1) : i44);
                        u.d dVar6 = oVar5.f4270b;
                        f fVar5 = oVar5.f4276i;
                        f fVar6 = oVar5.f4275h;
                        if (dVar6.g0 == 8) {
                            fVar6.d(i43);
                            fVar5.d(i43);
                        } else {
                            int i45 = z4 ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i17) {
                                i45 = z4 ? i45 - fVar6.f : i45 + fVar6.f;
                            }
                            if (z4) {
                                fVar5.d(i45);
                            } else {
                                fVar6.d(i45);
                            }
                            g gVar4 = oVar5.f4273e;
                            int iMin = gVar4.f4251g;
                            if (oVar5.f4272d == 3 && oVar5.f4269a == 1) {
                                iMin = Math.min(iMin, gVar4.f4257m);
                            }
                            i43 = z4 ? i45 - iMin : i45 + iMin;
                            if (z4) {
                                fVar6.d(i43);
                            } else {
                                fVar5.d(i43);
                            }
                            if (i44 < i18 && i44 < i4) {
                                i43 = z4 ? i43 - (-fVar5.f) : i43 + (-fVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    int i46 = this.f;
                    u.d dVar7 = this.f4270b;
                    float f10 = i46 == 0 ? dVar7.d0 : dVar7.f3773e0;
                    if (z4) {
                        f10 = 1.0f - f10;
                    }
                    int i47 = (int) (((i16 - i8) * f10) + f4);
                    if (i47 < 0 || i6 > 0) {
                        i47 = i10;
                    }
                    int i48 = z4 ? i9 - i47 : i9 + i47;
                    for (int i49 = i10; i49 < size; i49++) {
                        o oVar6 = (o) arrayList.get(z4 ? size - (i49 + 1) : i49);
                        u.d dVar8 = oVar6.f4270b;
                        f fVar7 = oVar6.f4276i;
                        f fVar8 = oVar6.f4275h;
                        if (dVar8.g0 == 8) {
                            fVar8.d(i48);
                            fVar7.d(i48);
                        } else {
                            if (i49 > 0 && i49 >= i17) {
                                i48 = z4 ? i48 - fVar8.f : i48 + fVar8.f;
                            }
                            if (z4) {
                                fVar7.d(i48);
                            } else {
                                fVar8.d(i48);
                            }
                            g gVar5 = oVar6.f4273e;
                            int i50 = gVar5.f4251g;
                            if (oVar6.f4272d == 3 && oVar6.f4269a == 1) {
                                i50 = gVar5.f4257m;
                            }
                            i48 = z4 ? i48 - i50 : i48 + i50;
                            if (z4) {
                                fVar8.d(i48);
                            } else {
                                fVar7.d(i48);
                            }
                            if (i49 < i18 && i49 < i4) {
                                i48 = z4 ? i48 - (-fVar7.f) : i48 + (-fVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // v.o
    public final void d() {
        ArrayList arrayList = this.f4237k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((o) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        u.d dVar = ((o) arrayList.get(0)).f4270b;
        u.d dVar2 = ((o) arrayList.get(size2 - 1)).f4270b;
        int i5 = this.f;
        f fVar = this.f4276i;
        f fVar2 = this.f4275h;
        if (i5 == 0) {
            u.c cVar = dVar.I;
            u.c cVar2 = dVar2.K;
            f fVarI = o.i(cVar, 0);
            int iE = cVar.e();
            u.d dVarM = m();
            if (dVarM != null) {
                iE = dVarM.I.e();
            }
            if (fVarI != null) {
                o.b(fVar2, fVarI, iE);
            }
            f fVarI2 = o.i(cVar2, 0);
            int iE2 = cVar2.e();
            u.d dVarN = n();
            if (dVarN != null) {
                iE2 = dVarN.K.e();
            }
            if (fVarI2 != null) {
                o.b(fVar, fVarI2, -iE2);
            }
        } else {
            u.c cVar3 = dVar.J;
            u.c cVar4 = dVar2.L;
            f fVarI3 = o.i(cVar3, 1);
            int iE3 = cVar3.e();
            u.d dVarM2 = m();
            if (dVarM2 != null) {
                iE3 = dVarM2.J.e();
            }
            if (fVarI3 != null) {
                o.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = o.i(cVar4, 1);
            int iE4 = cVar4.e();
            u.d dVarN2 = n();
            if (dVarN2 != null) {
                iE4 = dVarN2.L.e();
            }
            if (fVarI4 != null) {
                o.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.f4246a = this;
        fVar.f4246a = this;
    }

    @Override // v.o
    public final void e() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4237k;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i4)).e();
            i4++;
        }
    }

    @Override // v.o
    public final void f() {
        this.f4271c = null;
        ArrayList arrayList = this.f4237k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((o) obj).f();
        }
    }

    @Override // v.o
    public final long j() {
        ArrayList arrayList = this.f4237k;
        int size = arrayList.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            j4 = ((long) oVar.f4276i.f) + oVar.j() + j4 + ((long) oVar.f4275h.f);
        }
        return j4;
    }

    @Override // v.o
    public final boolean k() {
        ArrayList arrayList = this.f4237k;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!((o) arrayList.get(i4)).k()) {
                return false;
            }
        }
        return true;
    }

    public final u.d m() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4237k;
            if (i4 >= arrayList.size()) {
                return null;
            }
            u.d dVar = ((o) arrayList.get(i4)).f4270b;
            if (dVar.g0 != 8) {
                return dVar;
            }
            i4++;
        }
    }

    public final u.d n() {
        ArrayList arrayList = this.f4237k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u.d dVar = ((o) arrayList.get(size)).f4270b;
            if (dVar.g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f4237k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            sb.append("<");
            sb.append((o) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
