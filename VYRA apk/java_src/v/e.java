package v;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u.e f4239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u.e f4242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f4243e;
    public x.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f4244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f4245h;

    public final void a(f fVar, int i4, ArrayList arrayList, l lVar) {
        o oVar = fVar.f4249d;
        l lVar2 = oVar.f4271c;
        f fVar2 = oVar.f4276i;
        f fVar3 = oVar.f4275h;
        if (lVar2 == null) {
            u.e eVar = this.f4239a;
            if (oVar == eVar.f3771d || oVar == eVar.f3772e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f4260a = null;
                lVar.f4261b = new ArrayList();
                lVar.f4260a = oVar;
                arrayList.add(lVar);
            }
            oVar.f4271c = lVar;
            lVar.f4261b.add(oVar);
            ArrayList arrayList2 = fVar3.f4255k;
            int size = arrayList2.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                d dVar = (d) obj;
                if (dVar instanceof f) {
                    a((f) dVar, i4, arrayList, lVar);
                }
            }
            ArrayList arrayList3 = fVar2.f4255k;
            int size2 = arrayList3.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof f) {
                    a((f) dVar2, i4, arrayList, lVar);
                }
            }
            if (i4 == 1 && (oVar instanceof m)) {
                ArrayList arrayList4 = ((m) oVar).f4262k.f4255k;
                int size3 = arrayList4.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj3 = arrayList4.get(i8);
                    i8++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i4, arrayList, lVar);
                    }
                }
            }
            ArrayList arrayList5 = fVar3.f4256l;
            int size4 = arrayList5.size();
            int i9 = 0;
            while (i9 < size4) {
                Object obj4 = arrayList5.get(i9);
                i9++;
                a((f) obj4, i4, arrayList, lVar);
            }
            ArrayList arrayList6 = fVar2.f4256l;
            int size5 = arrayList6.size();
            int i10 = 0;
            while (i10 < size5) {
                Object obj5 = arrayList6.get(i10);
                i10++;
                a((f) obj5, i4, arrayList, lVar);
            }
            if (i4 == 1 && (oVar instanceof m)) {
                ArrayList arrayList7 = ((m) oVar).f4262k.f4256l;
                int size6 = arrayList7.size();
                while (i5 < size6) {
                    Object obj6 = arrayList7.get(i5);
                    i5++;
                    a((f) obj6, i4, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:114:0x0207  */
    /* JADX WARN: Code duplicated, block: B:116:0x020a  */
    /* JADX WARN: Code duplicated, block: B:117:0x021f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0224  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228  */
    /* JADX WARN: Code duplicated, block: B:126:0x025f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0269  */
    /* JADX WARN: Code duplicated, block: B:134:0x029a  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0306  */
    /* JADX WARN: Code duplicated, block: B:152:0x0311  */
    /* JADX WARN: Code duplicated, block: B:155:0x0324  */
    /* JADX WARN: Code duplicated, block: B:156:0x0337  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1 A[PHI: r0
      0x00d1: PHI (r0v22 int) = (r0v20 int), (r0v99 int) binds: [B:68:0x00c9, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x014b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x018c  */
    public final void b(u.e eVar) {
        int i4;
        int i5;
        int iQ;
        int iK;
        int i6;
        int iK2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float f;
        int i19;
        int i20;
        ArrayList arrayList = eVar.f3802q0;
        int[] iArr = eVar.f3791p0;
        int size = arrayList.size();
        char c4 = 0;
        int i21 = 0;
        while (i21 < size) {
            Object obj = arrayList.get(i21);
            i21++;
            u.d dVar = (u.d) obj;
            int[] iArr2 = dVar.f3791p0;
            u.c[] cVarArr = dVar.Q;
            u.c cVar = dVar.L;
            u.c cVar2 = dVar.J;
            u.c cVar3 = dVar.K;
            u.c cVar4 = dVar.I;
            int i22 = iArr2[c4];
            int i23 = iArr2[1];
            c4 = c4;
            if (dVar.g0 == 8) {
                dVar.f3765a = true;
            } else {
                float f4 = dVar.f3798w;
                if (f4 < 1.0f && i22 == 3) {
                    dVar.f3793r = 2;
                }
                float f5 = dVar.f3801z;
                if (f5 < 1.0f && i23 == 3) {
                    dVar.f3794s = 2;
                }
                if (dVar.W > 0.0f) {
                    if (i22 == 3) {
                        i20 = 2;
                        if (i23 == 2 || i23 == 1) {
                            i4 = 3;
                            dVar.f3793r = 3;
                        } else {
                            i4 = 3;
                        }
                    } else {
                        i4 = 3;
                        i20 = 2;
                    }
                    if (i23 == i4 && (i22 == i20 || i22 == 1)) {
                        dVar.f3794s = i4;
                    } else if (i22 == i4 && i23 == i4) {
                        if (dVar.f3793r == 0) {
                            dVar.f3793r = i4;
                        }
                        if (dVar.f3794s == 0) {
                            dVar.f3794s = i4;
                        }
                    }
                } else {
                    i4 = 3;
                }
                if (i22 == i4 && dVar.f3793r == 1 && (cVar4.f == null || cVar3.f == null)) {
                    i22 = 2;
                }
                if (i23 == 3 && dVar.f3794s == 1 && (cVar2.f == null || cVar.f == null)) {
                    i23 = 2;
                }
                k kVar = dVar.f3771d;
                kVar.f4272d = i22;
                int i24 = dVar.f3793r;
                kVar.f4269a = i24;
                m mVar = dVar.f3772e;
                mVar.f4272d = i23;
                ArrayList arrayList2 = arrayList;
                int i25 = dVar.f3794s;
                mVar.f4269a = i25;
                if (i22 == 4 || i22 == 1) {
                    if (i23 == 4) {
                        i5 = 1;
                    } else if (i23 != 1) {
                        i7 = 2;
                        if (i23 == 2) {
                            i5 = 1;
                        } else {
                            if (i22 != 3) {
                                i8 = i7;
                                i9 = i23;
                                i10 = 1;
                            } else if (i23 == i7 && i23 != 1) {
                                i8 = i7;
                                i11 = 3;
                                i9 = i23;
                                i10 = 1;
                                if (i9 != i11) {
                                    if (i22 == i8 && i22 != i10) {
                                        i15 = i11;
                                        i12 = i22;
                                        i13 = i8;
                                    } else if (i25 == i11) {
                                        if (i22 == i8) {
                                            f(i8, 0, i8, 0, dVar);
                                        }
                                        int iQ2 = dVar.q();
                                        f = dVar.W;
                                        if (dVar.X == -1) {
                                            f = 1.0f / f;
                                        }
                                        f(i10, iQ2, i10, (int) ((iQ2 * f) + 0.5f), dVar);
                                        dVar.f3771d.f4273e.d(dVar.q());
                                        dVar.f3772e.f4273e.d(dVar.k());
                                        dVar.f3765a = true;
                                    } else if (i25 == 1) {
                                        f(i22, 0, i8, 0, dVar);
                                        dVar.f3772e.f4273e.f4257m = dVar.k();
                                    } else {
                                        i16 = i8;
                                        i17 = i22;
                                        if (i25 == 2) {
                                            i18 = iArr[1];
                                            if (i18 != i10 || i18 == 4) {
                                                f(i17, dVar.q(), i10, (int) ((f5 * eVar.k()) + 0.5f), dVar);
                                                dVar.f3771d.f4273e.d(dVar.q());
                                                dVar.f3772e.f4273e.d(dVar.k());
                                                dVar.f3765a = true;
                                            } else {
                                                i12 = i17;
                                                i13 = i16;
                                                i15 = 3;
                                            }
                                        } else {
                                            i12 = i17;
                                            if (cVarArr[2].f != null || cVarArr[3].f == null) {
                                                f(i16, 0, i9, 0, dVar);
                                                dVar.f3771d.f4273e.d(dVar.q());
                                                dVar.f3772e.f4273e.d(dVar.k());
                                                dVar.f3765a = true;
                                            } else {
                                                i13 = i16;
                                            }
                                        }
                                    }
                                    i10 = i10;
                                    i14 = 1;
                                    if (i12 == i15 && i9 == i15) {
                                        if (i24 != i14 || i25 == i14) {
                                            f(i13, 0, i13, 0, dVar);
                                            dVar.f3771d.f4273e.f4257m = dVar.q();
                                            dVar.f3772e.f4273e.f4257m = dVar.k();
                                        } else if (i25 == 2 && i24 == 2 && iArr[c4] == i10 && iArr[i14] == i10) {
                                            f(i10, (int) ((f4 * eVar.q()) + 0.5f), i10, (int) ((f5 * eVar.k()) + 0.5f), dVar);
                                            dVar.f3771d.f4273e.d(dVar.q());
                                            dVar.f3772e.f4273e.d(dVar.k());
                                            dVar.f3765a = true;
                                        }
                                    }
                                } else {
                                    i12 = i22;
                                    i13 = i8;
                                }
                                i14 = 1;
                                i15 = 3;
                                if (i12 == i15) {
                                    if (i24 != i14) {
                                        f(i13, 0, i13, 0, dVar);
                                        dVar.f3771d.f4273e.f4257m = dVar.q();
                                        dVar.f3772e.f4273e.f4257m = dVar.k();
                                    } else {
                                        f(i13, 0, i13, 0, dVar);
                                        dVar.f3771d.f4273e.f4257m = dVar.q();
                                        dVar.f3772e.f4273e.f4257m = dVar.k();
                                    }
                                }
                            } else if (i24 == 3) {
                                if (i23 == i7) {
                                    f(i7, 0, i7, 0, dVar);
                                }
                                int iK3 = dVar.k();
                                f(1, (int) ((iK3 * dVar.W) + 0.5f), 1, iK3, dVar);
                                dVar.f3771d.f4273e.d(dVar.q());
                                dVar.f3772e.f4273e.d(dVar.k());
                                dVar.f3765a = true;
                            } else {
                                i8 = i7;
                                if (i24 == 1) {
                                    f(i8, 0, i23, 0, dVar);
                                    dVar.f3771d.f4273e.f4257m = dVar.q();
                                } else if (i24 == 2) {
                                    i19 = iArr[c4];
                                    if (i19 != 1 || i19 == 4) {
                                        f(1, (int) ((f4 * eVar.q()) + 0.5f), i23, dVar.k(), dVar);
                                        dVar.f3771d.f4273e.d(dVar.q());
                                        dVar.f3772e.f4273e.d(dVar.k());
                                        dVar.f3765a = true;
                                    } else {
                                        i9 = i23;
                                        i10 = 1;
                                    }
                                } else {
                                    i9 = i23;
                                    i10 = 1;
                                    if (cVarArr[c4].f != null || cVarArr[1].f == null) {
                                        f(i8, 0, i9, 0, dVar);
                                        dVar.f3771d.f4273e.d(dVar.q());
                                        dVar.f3772e.f4273e.d(dVar.k());
                                        dVar.f3765a = true;
                                    }
                                }
                            }
                            i11 = 3;
                            if (i9 != i11) {
                                i12 = i22;
                                i13 = i8;
                            } else if (i22 == i8) {
                                if (i25 == i11) {
                                    if (i22 == i8) {
                                        f(i8, 0, i8, 0, dVar);
                                    }
                                    int iQ3 = dVar.q();
                                    f = dVar.W;
                                    if (dVar.X == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(i10, iQ3, i10, (int) ((iQ3 * f) + 0.5f), dVar);
                                    dVar.f3771d.f4273e.d(dVar.q());
                                    dVar.f3772e.f4273e.d(dVar.k());
                                    dVar.f3765a = true;
                                } else if (i25 == 1) {
                                    f(i22, 0, i8, 0, dVar);
                                    dVar.f3772e.f4273e.f4257m = dVar.k();
                                } else {
                                    i16 = i8;
                                    i17 = i22;
                                    if (i25 == 2) {
                                        i18 = iArr[1];
                                        if (i18 != i10) {
                                        }
                                        f(i17, dVar.q(), i10, (int) ((f5 * eVar.k()) + 0.5f), dVar);
                                        dVar.f3771d.f4273e.d(dVar.q());
                                        dVar.f3772e.f4273e.d(dVar.k());
                                        dVar.f3765a = true;
                                    } else {
                                        i12 = i17;
                                        if (cVarArr[2].f != null) {
                                        }
                                        f(i16, 0, i9, 0, dVar);
                                        dVar.f3771d.f4273e.d(dVar.q());
                                        dVar.f3772e.f4273e.d(dVar.k());
                                        dVar.f3765a = true;
                                    }
                                }
                            } else if (i25 == i11) {
                                if (i22 == i8) {
                                    f(i8, 0, i8, 0, dVar);
                                }
                                int iQ4 = dVar.q();
                                f = dVar.W;
                                if (dVar.X == -1) {
                                    f = 1.0f / f;
                                }
                                f(i10, iQ4, i10, (int) ((iQ4 * f) + 0.5f), dVar);
                                dVar.f3771d.f4273e.d(dVar.q());
                                dVar.f3772e.f4273e.d(dVar.k());
                                dVar.f3765a = true;
                            } else if (i25 == 1) {
                                f(i22, 0, i8, 0, dVar);
                                dVar.f3772e.f4273e.f4257m = dVar.k();
                            } else {
                                i16 = i8;
                                i17 = i22;
                                if (i25 == 2) {
                                    i18 = iArr[1];
                                    if (i18 != i10) {
                                    }
                                    f(i17, dVar.q(), i10, (int) ((f5 * eVar.k()) + 0.5f), dVar);
                                    dVar.f3771d.f4273e.d(dVar.q());
                                    dVar.f3772e.f4273e.d(dVar.k());
                                    dVar.f3765a = true;
                                } else {
                                    i12 = i17;
                                    if (cVarArr[2].f != null) {
                                    }
                                    f(i16, 0, i9, 0, dVar);
                                    dVar.f3771d.f4273e.d(dVar.q());
                                    dVar.f3772e.f4273e.d(dVar.k());
                                    dVar.f3765a = true;
                                }
                            }
                            i14 = 1;
                            i15 = 3;
                            if (i12 == i15) {
                                if (i24 != i14) {
                                    f(i13, 0, i13, 0, dVar);
                                    dVar.f3771d.f4273e.f4257m = dVar.q();
                                    dVar.f3772e.f4273e.f4257m = dVar.k();
                                } else {
                                    f(i13, 0, i13, 0, dVar);
                                    dVar.f3771d.f4273e.f4257m = dVar.q();
                                    dVar.f3772e.f4273e.f4257m = dVar.k();
                                }
                            }
                        }
                    } else {
                        i5 = 1;
                    }
                    iQ = dVar.q();
                    if (i22 == 4) {
                        iQ = (eVar.q() - cVar4.f3762g) - cVar3.f3762g;
                        i22 = i5;
                    }
                    iK = dVar.k();
                    if (i23 == 4) {
                        i6 = i5;
                        iK2 = (eVar.k() - cVar2.f3762g) - cVar.f3762g;
                    } else {
                        i6 = i23;
                        iK2 = iK;
                    }
                    f(i22, iQ, i6, iK2, dVar);
                    dVar.f3771d.f4273e.d(dVar.q());
                    dVar.f3772e.f4273e.d(dVar.k());
                    dVar.f3765a = true;
                } else {
                    i7 = 2;
                    if (i22 == 2) {
                        if (i23 == 4) {
                            i5 = 1;
                        } else if (i23 != 1) {
                            i7 = 2;
                            if (i23 == 2) {
                                i5 = 1;
                            } else {
                                if (i22 != 3) {
                                    if (i23 == i7) {
                                    }
                                    if (i24 == 3) {
                                        if (i23 == i7) {
                                            f(i7, 0, i7, 0, dVar);
                                        }
                                        int iK4 = dVar.k();
                                        f(1, (int) ((iK4 * dVar.W) + 0.5f), 1, iK4, dVar);
                                        dVar.f3771d.f4273e.d(dVar.q());
                                        dVar.f3772e.f4273e.d(dVar.k());
                                        dVar.f3765a = true;
                                    } else {
                                        i8 = i7;
                                        if (i24 == 1) {
                                            f(i8, 0, i23, 0, dVar);
                                            dVar.f3771d.f4273e.f4257m = dVar.q();
                                        } else if (i24 == 2) {
                                            i19 = iArr[c4];
                                            if (i19 != 1) {
                                            }
                                            f(1, (int) ((f4 * eVar.q()) + 0.5f), i23, dVar.k(), dVar);
                                            dVar.f3771d.f4273e.d(dVar.q());
                                            dVar.f3772e.f4273e.d(dVar.k());
                                            dVar.f3765a = true;
                                        } else {
                                            i9 = i23;
                                            i10 = 1;
                                            if (cVarArr[c4].f != null) {
                                            }
                                            f(i8, 0, i9, 0, dVar);
                                            dVar.f3771d.f4273e.d(dVar.q());
                                            dVar.f3772e.f4273e.d(dVar.k());
                                            dVar.f3765a = true;
                                        }
                                    }
                                } else {
                                    i8 = i7;
                                    i9 = i23;
                                    i10 = 1;
                                }
                                i11 = 3;
                                if (i9 != i11) {
                                    i12 = i22;
                                    i13 = i8;
                                } else if (i22 == i8) {
                                    if (i25 == i11) {
                                        if (i22 == i8) {
                                            f(i8, 0, i8, 0, dVar);
                                        }
                                        int iQ5 = dVar.q();
                                        f = dVar.W;
                                        if (dVar.X == -1) {
                                            f = 1.0f / f;
                                        }
                                        f(i10, iQ5, i10, (int) ((iQ5 * f) + 0.5f), dVar);
                                        dVar.f3771d.f4273e.d(dVar.q());
                                        dVar.f3772e.f4273e.d(dVar.k());
                                        dVar.f3765a = true;
                                    } else if (i25 == 1) {
                                        f(i22, 0, i8, 0, dVar);
                                        dVar.f3772e.f4273e.f4257m = dVar.k();
                                    } else {
                                        i16 = i8;
                                        i17 = i22;
                                        if (i25 == 2) {
                                            i18 = iArr[1];
                                            if (i18 != i10) {
                                            }
                                            f(i17, dVar.q(), i10, (int) ((f5 * eVar.k()) + 0.5f), dVar);
                                            dVar.f3771d.f4273e.d(dVar.q());
                                            dVar.f3772e.f4273e.d(dVar.k());
                                            dVar.f3765a = true;
                                        } else {
                                            i12 = i17;
                                            if (cVarArr[2].f != null) {
                                            }
                                            f(i16, 0, i9, 0, dVar);
                                            dVar.f3771d.f4273e.d(dVar.q());
                                            dVar.f3772e.f4273e.d(dVar.k());
                                            dVar.f3765a = true;
                                        }
                                    }
                                } else if (i25 == i11) {
                                    if (i22 == i8) {
                                        f(i8, 0, i8, 0, dVar);
                                    }
                                    int iQ6 = dVar.q();
                                    f = dVar.W;
                                    if (dVar.X == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(i10, iQ6, i10, (int) ((iQ6 * f) + 0.5f), dVar);
                                    dVar.f3771d.f4273e.d(dVar.q());
                                    dVar.f3772e.f4273e.d(dVar.k());
                                    dVar.f3765a = true;
                                } else if (i25 == 1) {
                                    f(i22, 0, i8, 0, dVar);
                                    dVar.f3772e.f4273e.f4257m = dVar.k();
                                } else {
                                    i16 = i8;
                                    i17 = i22;
                                    if (i25 == 2) {
                                        i18 = iArr[1];
                                        if (i18 != i10) {
                                        }
                                        f(i17, dVar.q(), i10, (int) ((f5 * eVar.k()) + 0.5f), dVar);
                                        dVar.f3771d.f4273e.d(dVar.q());
                                        dVar.f3772e.f4273e.d(dVar.k());
                                        dVar.f3765a = true;
                                    } else {
                                        i12 = i17;
                                        if (cVarArr[2].f != null) {
                                        }
                                        f(i16, 0, i9, 0, dVar);
                                        dVar.f3771d.f4273e.d(dVar.q());
                                        dVar.f3772e.f4273e.d(dVar.k());
                                        dVar.f3765a = true;
                                    }
                                }
                                i14 = 1;
                                i15 = 3;
                                if (i12 == i15) {
                                    if (i24 != i14) {
                                        f(i13, 0, i13, 0, dVar);
                                        dVar.f3771d.f4273e.f4257m = dVar.q();
                                        dVar.f3772e.f4273e.f4257m = dVar.k();
                                    } else {
                                        f(i13, 0, i13, 0, dVar);
                                        dVar.f3771d.f4273e.f4257m = dVar.q();
                                        dVar.f3772e.f4273e.f4257m = dVar.k();
                                    }
                                }
                            }
                        } else {
                            i5 = 1;
                        }
                        iQ = dVar.q();
                        if (i22 == 4) {
                            iQ = (eVar.q() - cVar4.f3762g) - cVar3.f3762g;
                            i22 = i5;
                        }
                        iK = dVar.k();
                        if (i23 == 4) {
                            i6 = i5;
                            iK2 = (eVar.k() - cVar2.f3762g) - cVar.f3762g;
                        } else {
                            i6 = i23;
                            iK2 = iK;
                        }
                        f(i22, iQ, i6, iK2, dVar);
                        dVar.f3771d.f4273e.d(dVar.q());
                        dVar.f3772e.f4273e.d(dVar.k());
                        dVar.f3765a = true;
                    } else {
                        if (i22 != 3) {
                            if (i23 == i7) {
                            }
                            if (i24 == 3) {
                                if (i23 == i7) {
                                    f(i7, 0, i7, 0, dVar);
                                }
                                int iK5 = dVar.k();
                                f(1, (int) ((iK5 * dVar.W) + 0.5f), 1, iK5, dVar);
                                dVar.f3771d.f4273e.d(dVar.q());
                                dVar.f3772e.f4273e.d(dVar.k());
                                dVar.f3765a = true;
                            } else {
                                i8 = i7;
                                if (i24 == 1) {
                                    f(i8, 0, i23, 0, dVar);
                                    dVar.f3771d.f4273e.f4257m = dVar.q();
                                } else if (i24 == 2) {
                                    i19 = iArr[c4];
                                    if (i19 != 1) {
                                    }
                                    f(1, (int) ((f4 * eVar.q()) + 0.5f), i23, dVar.k(), dVar);
                                    dVar.f3771d.f4273e.d(dVar.q());
                                    dVar.f3772e.f4273e.d(dVar.k());
                                    dVar.f3765a = true;
                                } else {
                                    i9 = i23;
                                    i10 = 1;
                                    if (cVarArr[c4].f != null) {
                                    }
                                    f(i8, 0, i9, 0, dVar);
                                    dVar.f3771d.f4273e.d(dVar.q());
                                    dVar.f3772e.f4273e.d(dVar.k());
                                    dVar.f3765a = true;
                                }
                            }
                        } else {
                            i8 = i7;
                            i9 = i23;
                            i10 = 1;
                        }
                        i11 = 3;
                        if (i9 != i11) {
                            i12 = i22;
                            i13 = i8;
                        } else if (i22 == i8) {
                            if (i25 == i11) {
                                if (i22 == i8) {
                                    f(i8, 0, i8, 0, dVar);
                                }
                                int iQ7 = dVar.q();
                                f = dVar.W;
                                if (dVar.X == -1) {
                                    f = 1.0f / f;
                                }
                                f(i10, iQ7, i10, (int) ((iQ7 * f) + 0.5f), dVar);
                                dVar.f3771d.f4273e.d(dVar.q());
                                dVar.f3772e.f4273e.d(dVar.k());
                                dVar.f3765a = true;
                            } else if (i25 == 1) {
                                f(i22, 0, i8, 0, dVar);
                                dVar.f3772e.f4273e.f4257m = dVar.k();
                            } else {
                                i16 = i8;
                                i17 = i22;
                                if (i25 == 2) {
                                    i18 = iArr[1];
                                    if (i18 != i10) {
                                    }
                                    f(i17, dVar.q(), i10, (int) ((f5 * eVar.k()) + 0.5f), dVar);
                                    dVar.f3771d.f4273e.d(dVar.q());
                                    dVar.f3772e.f4273e.d(dVar.k());
                                    dVar.f3765a = true;
                                } else {
                                    i12 = i17;
                                    if (cVarArr[2].f != null) {
                                    }
                                    f(i16, 0, i9, 0, dVar);
                                    dVar.f3771d.f4273e.d(dVar.q());
                                    dVar.f3772e.f4273e.d(dVar.k());
                                    dVar.f3765a = true;
                                }
                            }
                        } else if (i25 == i11) {
                            if (i22 == i8) {
                                f(i8, 0, i8, 0, dVar);
                            }
                            int iQ8 = dVar.q();
                            f = dVar.W;
                            if (dVar.X == -1) {
                                f = 1.0f / f;
                            }
                            f(i10, iQ8, i10, (int) ((iQ8 * f) + 0.5f), dVar);
                            dVar.f3771d.f4273e.d(dVar.q());
                            dVar.f3772e.f4273e.d(dVar.k());
                            dVar.f3765a = true;
                        } else if (i25 == 1) {
                            f(i22, 0, i8, 0, dVar);
                            dVar.f3772e.f4273e.f4257m = dVar.k();
                        } else {
                            i16 = i8;
                            i17 = i22;
                            if (i25 == 2) {
                                i18 = iArr[1];
                                if (i18 != i10) {
                                }
                                f(i17, dVar.q(), i10, (int) ((f5 * eVar.k()) + 0.5f), dVar);
                                dVar.f3771d.f4273e.d(dVar.q());
                                dVar.f3772e.f4273e.d(dVar.k());
                                dVar.f3765a = true;
                            } else {
                                i12 = i17;
                                if (cVarArr[2].f != null) {
                                }
                                f(i16, 0, i9, 0, dVar);
                                dVar.f3771d.f4273e.d(dVar.q());
                                dVar.f3772e.f4273e.d(dVar.k());
                                dVar.f3765a = true;
                            }
                        }
                        i14 = 1;
                        i15 = 3;
                        if (i12 == i15) {
                            if (i24 != i14) {
                                f(i13, 0, i13, 0, dVar);
                                dVar.f3771d.f4273e.f4257m = dVar.q();
                                dVar.f3772e.f4273e.f4257m = dVar.k();
                            } else {
                                f(i13, 0, i13, 0, dVar);
                                dVar.f3771d.f4273e.f4257m = dVar.q();
                                dVar.f3772e.f4273e.f4257m = dVar.k();
                            }
                        }
                    }
                }
                arrayList = arrayList2;
            }
        }
    }

    public final void c() {
        u.e eVar = this.f4239a;
        ArrayList arrayList = this.f4245h;
        ArrayList arrayList2 = this.f4243e;
        arrayList2.clear();
        u.e eVar2 = this.f4242d;
        eVar2.f3771d.f();
        eVar2.f3772e.f();
        arrayList2.add(eVar2.f3771d);
        arrayList2.add(eVar2.f3772e);
        ArrayList arrayList3 = eVar2.f3802q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList3.get(i4);
            i4++;
            u.d dVar = (u.d) obj;
            if (dVar instanceof u.h) {
                i iVar = new i(dVar);
                dVar.f3771d.f();
                dVar.f3772e.f();
                iVar.f = ((u.h) dVar).f3840u0;
                arrayList2.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f3767b == null) {
                        dVar.f3767b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3767b);
                } else {
                    arrayList2.add(dVar.f3771d);
                }
                if (dVar.y()) {
                    if (dVar.f3769c == null) {
                        dVar.f3769c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3769c);
                } else {
                    arrayList2.add(dVar.f3772e);
                }
                if (dVar instanceof u.i) {
                    arrayList2.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            ((o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList2.get(i6);
            i6++;
            o oVar = (o) obj3;
            if (oVar.f4270b != eVar2) {
                oVar.d();
            }
        }
        arrayList.clear();
        e(eVar.f3771d, 0, arrayList);
        e(eVar.f3772e, 1, arrayList);
        this.f4240b = false;
    }

    public final int d(u.e eVar, int i4) {
        ArrayList arrayList;
        int i5;
        long j4;
        float f;
        long j5;
        ArrayList arrayList2 = this.f4245h;
        int size = arrayList2.size();
        long j6 = 0;
        int i6 = 0;
        long jMax = 0;
        while (i6 < size) {
            o oVar = ((l) arrayList2.get(i6)).f4260a;
            if (!(oVar instanceof c) ? !(i4 != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f != i4) {
                f fVar = (i4 == 0 ? eVar.f3771d : eVar.f3772e).f4275h;
                f fVar2 = (i4 == 0 ? eVar.f3771d : eVar.f3772e).f4276i;
                f fVar3 = oVar.f4275h;
                f fVar4 = oVar.f4276i;
                boolean zContains = fVar3.f4256l.contains(fVar);
                boolean zContains2 = fVar4.f4256l.contains(fVar2);
                long j7 = oVar.j();
                if (zContains && zContains2) {
                    long jB = l.b(fVar3, j6);
                    long jA = l.a(fVar4, j6);
                    long j8 = jB - j7;
                    int i7 = fVar4.f;
                    arrayList = arrayList2;
                    i5 = size;
                    if (j8 >= (-i7)) {
                        j8 += (long) i7;
                    }
                    long j9 = fVar3.f;
                    long j10 = ((-jA) - j7) - j9;
                    if (j10 >= j9) {
                        j10 -= j9;
                    }
                    u.d dVar = oVar.f4270b;
                    if (i4 == 0) {
                        f = dVar.d0;
                    } else if (i4 == 1) {
                        f = dVar.f3773e0;
                    } else {
                        dVar.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j5 = (long) ((j8 / (1.0f - f)) + (j10 / f));
                    } else {
                        j5 = 0;
                    }
                    float f4 = j5;
                    j4 = (((long) fVar3.f) + ((((long) ((f4 * f) + 0.5f)) + j7) + ((long) (((1.0f - f) * f4) + 0.5f)))) - ((long) fVar4.f);
                } else {
                    arrayList = arrayList2;
                    i5 = size;
                    if (zContains) {
                        j4 = Math.max(l.b(fVar3, fVar3.f), ((long) fVar3.f) + j7);
                    } else if (zContains2) {
                        j4 = Math.max(-l.a(fVar4, fVar4.f), ((long) (-fVar4.f)) + j7);
                    } else {
                        j4 = (oVar.j() + ((long) fVar3.f)) - ((long) fVar4.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i5 = size;
                j4 = j6;
            }
            jMax = Math.max(jMax, j4);
            i6++;
            arrayList2 = arrayList;
            size = i5;
            j6 = 0;
        }
        return (int) jMax;
    }

    public final void e(o oVar, int i4, ArrayList arrayList) {
        f fVar = oVar.f4275h;
        f fVar2 = oVar.f4276i;
        ArrayList arrayList2 = fVar.f4255k;
        int size = arrayList2.size();
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            i6++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i4, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).f4275h, i4, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f4255k;
        int size2 = arrayList3.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList3.get(i7);
            i7++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i4, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).f4276i, i4, arrayList, null);
            }
        }
        if (i4 == 1) {
            ArrayList arrayList4 = ((m) oVar).f4262k.f4255k;
            int size3 = arrayList4.size();
            while (i5 < size3) {
                Object obj3 = arrayList4.get(i5);
                i5++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i4, arrayList, null);
                }
            }
        }
    }

    public final void f(int i4, int i5, int i6, int i7, u.d dVar) {
        b bVar = this.f4244g;
        bVar.f4228a = i4;
        bVar.f4229b = i6;
        bVar.f4230c = i5;
        bVar.f4231d = i7;
        this.f.b(dVar, bVar);
        dVar.O(bVar.f4232e);
        dVar.L(bVar.f);
        dVar.E = bVar.f4234h;
        dVar.I(bVar.f4233g);
    }

    public final void g() {
        a aVar;
        e eVar = this;
        ArrayList arrayList = eVar.f4239a.f3802q0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            u.d dVar = (u.d) arrayList.get(i4);
            if (!dVar.f3765a) {
                int[] iArr = dVar.f3791p0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                int i8 = dVar.f3793r;
                int i9 = dVar.f3794s;
                boolean z4 = i6 == 2 || (i6 == 3 && i8 == 1);
                boolean z5 = i7 == 2 || (i7 == 3 && i9 == 1);
                g gVar = dVar.f3771d.f4273e;
                boolean z6 = gVar.f4254j;
                g gVar2 = dVar.f3772e.f4273e;
                boolean z7 = gVar2.f4254j;
                boolean z8 = z4;
                if (z6 && z7) {
                    eVar.f(1, gVar.f4251g, 1, gVar2.f4251g, dVar);
                    dVar.f3765a = true;
                } else if (z6 && z5) {
                    f(1, gVar.f4251g, 2, gVar2.f4251g, dVar);
                    m mVar = dVar.f3772e;
                    if (i7 == 3) {
                        mVar.f4273e.f4257m = dVar.k();
                    } else {
                        mVar.f4273e.d(dVar.k());
                        dVar.f3765a = true;
                    }
                } else if (z7 && z8) {
                    f(2, gVar.f4251g, 1, gVar2.f4251g, dVar);
                    k kVar = dVar.f3771d;
                    if (i6 == 3) {
                        kVar.f4273e.f4257m = dVar.q();
                    } else {
                        kVar.f4273e.d(dVar.q());
                        dVar.f3765a = true;
                    }
                }
                if (dVar.f3765a && (aVar = dVar.f3772e.f4263l) != null) {
                    aVar.d(dVar.f3766a0);
                }
                eVar = this;
            }
            i4 = i5;
        }
    }
}
