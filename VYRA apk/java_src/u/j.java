package u;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f3843a = new boolean[3];

    /* JADX WARN: Code duplicated, block: B:189:0x028c  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:208:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:210:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x0370  */
    /* JADX WARN: Code duplicated, block: B:235:0x038c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0391  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:251:0x0422  */
    /* JADX WARN: Code duplicated, block: B:406:0x0694  */
    /* JADX WARN: Code duplicated, block: B:409:0x069f  */
    /* JADX WARN: Code duplicated, block: B:410:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:413:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:414:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:416:0x06af  */
    /* JADX WARN: Code duplicated, block: B:418:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:421:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:423:0x06c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:433:0x06df A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    public static void a(e eVar, s.c cVar, ArrayList arrayList, int i4) {
        int i5;
        b[] bVarArr;
        int i6;
        int i7;
        boolean z4;
        boolean z5;
        boolean z6;
        int i8;
        d dVar;
        s.c cVar2;
        s.f fVar;
        c cVar3;
        s.f fVar2;
        d dVar2;
        int i9;
        c cVar4;
        s.f fVar3;
        d dVar3;
        int i10;
        c[] cVarArr;
        int i11;
        c cVar5;
        c cVar6;
        s.f fVar4;
        c cVar7;
        s.f fVar5;
        int size;
        ArrayList arrayList2;
        int i12;
        int i13;
        float f;
        int i14;
        s.f fVar6;
        s.f fVar7;
        s.f fVar8;
        s.f fVar9;
        s.b bVarL;
        float f4;
        c cVar8;
        d dVar4;
        int i15;
        int i16;
        d dVar5;
        e eVar2 = eVar;
        if (i4 == 0) {
            i5 = eVar2.f3810z0;
            bVarArr = eVar2.C0;
            i6 = 0;
        } else {
            i5 = eVar2.A0;
            bVarArr = eVar2.B0;
            i6 = 2;
        }
        int i17 = i5;
        b[] bVarArr2 = bVarArr;
        int i18 = 0;
        while (i18 < i17) {
            b bVar = bVarArr2[i18];
            boolean z7 = bVar.f3756q;
            d dVar6 = bVar.f3742a;
            c[] cVarArr2 = dVar6.Q;
            int i19 = 3;
            int i20 = 8;
            float f5 = 0.0f;
            if (z7) {
                i7 = i18;
            } else {
                int i21 = bVar.f3752l;
                int i22 = i21 * 2;
                d dVar7 = dVar6;
                d dVar8 = dVar7;
                boolean z8 = false;
                while (!z8) {
                    bVar.f3749i++;
                    d[] dVarArr = dVar7.f3786m0;
                    c[] cVarArr3 = dVar7.Q;
                    dVarArr[i21] = null;
                    dVar7.f3784l0[i21] = null;
                    if (dVar7.g0 != i20) {
                        dVar7.j(i21);
                        cVarArr3[i22].e();
                        int i23 = i22 + 1;
                        cVarArr3[i23].e();
                        cVarArr3[i22].e();
                        cVarArr3[i23].e();
                        if (bVar.f3743b == null) {
                            bVar.f3743b = dVar7;
                        }
                        bVar.f3745d = dVar7;
                        int i24 = dVar7.f3791p0[i21];
                        if (i24 == i19) {
                            int i25 = dVar7.f3795t[i21];
                            if (i25 == 0 || i25 == i19 || i25 == 2) {
                                bVar.f3750j++;
                                float f6 = dVar7.f3782k0[i21];
                                if (f6 > 0.0f) {
                                    bVar.f3751k += f6;
                                }
                                i16 = i21;
                                if (dVar7.g0 != 8 && i24 == 3 && (i25 == 0 || i25 == 3)) {
                                    if (f6 < 0.0f) {
                                        bVar.n = true;
                                    } else {
                                        bVar.f3754o = true;
                                    }
                                    if (bVar.f3748h == null) {
                                        bVar.f3748h = new ArrayList();
                                    }
                                    bVar.f3748h.add(dVar7);
                                }
                                if (bVar.f == null) {
                                    bVar.f = dVar7;
                                }
                                d dVar9 = bVar.f3747g;
                                if (dVar9 != null) {
                                    dVar9.f3784l0[i16] = dVar7;
                                }
                                bVar.f3747g = dVar7;
                            } else {
                                i18 = i18;
                                i16 = i21;
                            }
                            if (i16 == 0) {
                                if (dVar7.f3793r == 0 && dVar7.f3796u == 0) {
                                    int i26 = dVar7.f3797v;
                                }
                            } else if (dVar7.f3794s == 0 && dVar7.f3799x == 0) {
                                int i27 = dVar7.f3800y;
                            }
                        } else {
                            i18 = i18;
                            i16 = i21;
                        }
                    } else {
                        i18 = i18;
                        i16 = i21;
                    }
                    d dVar10 = dVar8;
                    if (dVar10 != dVar7) {
                        dVar10.f3786m0[i16] = dVar7;
                    }
                    c cVar9 = cVarArr3[i22 + 1].f;
                    if (cVar9 != null) {
                        dVar5 = cVar9.f3760d;
                        c cVar10 = dVar5.Q[i22].f;
                        if (cVar10 == null || cVar10.f3760d != dVar7) {
                            dVar5 = null;
                        }
                    } else {
                        dVar5 = null;
                    }
                    if (dVar5 == null) {
                        dVar5 = dVar7;
                        z8 = true;
                    }
                    dVar8 = dVar7;
                    i21 = i16;
                    i19 = 3;
                    i20 = 8;
                    dVar7 = dVar5;
                    i18 = i18;
                }
                i7 = i18;
                int i28 = i21;
                d dVar11 = bVar.f3743b;
                if (dVar11 != null) {
                    dVar11.Q[i22].e();
                }
                d dVar12 = bVar.f3745d;
                if (dVar12 != null) {
                    dVar12.Q[i22 + 1].e();
                }
                bVar.f3744c = dVar7;
                if (i28 == 0 && bVar.f3753m) {
                    bVar.f3746e = dVar7;
                } else {
                    bVar.f3746e = dVar6;
                }
                bVar.f3755p = bVar.f3754o && bVar.n;
            }
            bVar.f3756q = true;
            if (arrayList == 0 || arrayList.contains(dVar6)) {
                d dVar13 = bVar.f3744c;
                d dVar14 = bVar.f3743b;
                d dVar15 = bVar.f3745d;
                d dVar16 = bVar.f3746e;
                float f7 = bVar.f3751k;
                int[] iArr = eVar2.f3791p0;
                c[] cVarArr4 = eVar2.Q;
                boolean z9 = iArr[i4] == 2;
                if (i4 == 0) {
                    int i29 = dVar16.f3779i0;
                    boolean z10 = i29 == 0;
                    boolean z11 = i29 == 1;
                    z4 = i29 == 2;
                    z6 = z11;
                    z5 = z10;
                } else {
                    int i30 = dVar16.j0;
                    boolean z12 = i30 == 0;
                    boolean z13 = i30 == 1;
                    z4 = i30 == 2;
                    z5 = z12;
                    z6 = z13;
                }
                boolean z14 = false;
                while (!z14) {
                    c[] cVarArr5 = dVar6.Q;
                    int[] iArr2 = dVar6.f3791p0;
                    c cVar11 = cVarArr5[i6];
                    int i31 = z4 ? 1 : 4;
                    int iE = cVar11.e();
                    boolean z15 = z9;
                    boolean z16 = z4;
                    boolean z17 = iArr2[i4] == 3 && dVar6.f3795t[i4] == 0;
                    c cVar12 = cVar11.f;
                    if (cVar12 != null && dVar6 != dVar6) {
                        iE = cVar12.e() + iE;
                    }
                    int i32 = iE;
                    if (z16 && dVar6 != dVar6 && dVar6 != dVar14) {
                        i31 = 8;
                    }
                    d dVar17 = dVar6;
                    c cVar13 = cVar11.f;
                    if (cVar13 != null) {
                        boolean z18 = z17;
                        s.f fVar10 = cVar11.f3764i;
                        s.f fVar11 = cVar13.f3764i;
                        if (dVar6 == dVar14) {
                            cVar.f(fVar10, fVar11, i32, 6);
                        } else {
                            cVar.f(fVar10, fVar11, i32, 8);
                        }
                        if (z18 && !z16) {
                            i31 = 5;
                        }
                        cVar.e(cVar11.f3764i, cVar11.f.f3764i, i32, (dVar6 == dVar14 && z16 && dVar6.S[i4]) ? 5 : i31);
                    }
                    if (z15) {
                        if (dVar6.g0 == 8 || iArr2[i4] != 3) {
                            i15 = 0;
                        } else {
                            i15 = 0;
                            cVar.f(cVarArr5[i6 + 1].f3764i, cVarArr5[i6].f3764i, 0, 5);
                        }
                        cVar.f(cVarArr5[i6].f3764i, cVarArr4[i6].f3764i, i15, 8);
                    }
                    c cVar14 = cVarArr5[i6 + 1].f;
                    if (cVar14 != null) {
                        dVar4 = cVar14.f3760d;
                        c cVar15 = dVar4.Q[i6].f;
                        if (cVar15 == null || cVar15.f3760d != dVar6) {
                            dVar4 = null;
                        }
                    } else {
                        dVar4 = null;
                    }
                    if (dVar4 != null) {
                        dVar6 = dVar4;
                    } else {
                        z14 = true;
                    }
                    dVar6 = dVar17;
                    z9 = z15;
                    z4 = z16;
                }
                boolean z19 = z9;
                boolean z20 = z4;
                if (dVar15 != null) {
                    int i33 = i6 + 1;
                    if (dVar13.Q[i33].f != null) {
                        c cVar16 = dVar15.Q[i33];
                        if (dVar15.f3791p0[i4] == 3 && dVar15.f3795t[i4] == 0 && !z20) {
                            c cVar17 = cVar16.f;
                            if (cVar17.f3760d == eVar2) {
                                cVar.e(cVar16.f3764i, cVar17.f3764i, -cVar16.e(), 5);
                            } else if (z20) {
                                cVar8 = cVar16.f;
                                if (cVar8.f3760d == eVar2) {
                                    cVar.e(cVar16.f3764i, cVar8.f3764i, -cVar16.e(), 4);
                                }
                            }
                        } else if (z20) {
                            cVar8 = cVar16.f;
                            if (cVar8.f3760d == eVar2) {
                                cVar.e(cVar16.f3764i, cVar8.f3764i, -cVar16.e(), 4);
                            }
                        }
                        cVar.g(cVar16.f3764i, dVar13.Q[i33].f.f3764i, -cVar16.e(), 6);
                    }
                }
                if (z19) {
                    int i34 = i6 + 1;
                    s.f fVar12 = cVarArr4[i34].f3764i;
                    c cVar18 = dVar13.Q[i34];
                    cVar.f(fVar12, cVar18.f3764i, cVar18.e(), 8);
                }
                ArrayList arrayList3 = bVar.f3748h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (bVar.n && !bVar.f3755p) {
                        f7 = bVar.f3750j;
                    }
                    d dVar18 = null;
                    float f8 = 0.0f;
                    int i35 = 0;
                    while (i35 < size) {
                        d dVar19 = (d) arrayList3.get(i35);
                        float[] fArr = dVar19.f3782k0;
                        c[] cVarArr6 = dVar19.Q;
                        float f9 = fArr[i4];
                        if (f9 >= f5) {
                            arrayList2 = arrayList3;
                            i12 = size;
                            if (f9 == f5) {
                                cVar.e(cVarArr6[i6 + 1].f3764i, cVarArr6[i6].f3764i, 0, 8);
                                i13 = i17;
                                f = f5;
                                f8 = f8;
                                i14 = i35;
                            } else {
                                float f10 = f8;
                                if (dVar18 != null) {
                                    c[] cVarArr7 = dVar18.Q;
                                    fVar6 = cVarArr7[i6].f3764i;
                                    int i36 = i6 + 1;
                                    fVar7 = cVarArr7[i36].f3764i;
                                    fVar8 = cVarArr6[i6].f3764i;
                                    fVar9 = cVarArr6[i36].f3764i;
                                    bVarL = cVar.l();
                                    f4 = f5;
                                    bVarL.f3625b = f4;
                                    f = f4;
                                    if (f7 != f4 || f10 == f9) {
                                        i14 = i35;
                                        i13 = i17;
                                        bVarL.f3627d.g(fVar6, 1.0f);
                                        bVarL.f3627d.g(fVar7, -1.0f);
                                        bVarL.f3627d.g(fVar9, 1.0f);
                                        bVarL.f3627d.g(fVar8, -1.0f);
                                    } else {
                                        s.a aVar = bVarL.f3627d;
                                        if (f10 == f) {
                                            i14 = i35;
                                            aVar.g(fVar6, 1.0f);
                                            bVarL.f3627d.g(fVar7, -1.0f);
                                            i13 = i17;
                                        } else {
                                            i14 = i35;
                                            i13 = i17;
                                            if (f9 == f5) {
                                                aVar.g(fVar8, 1.0f);
                                                bVarL.f3627d.g(fVar9, -1.0f);
                                            } else {
                                                float f11 = (f10 / f7) / (f9 / f7);
                                                aVar.g(fVar6, 1.0f);
                                                bVarL.f3627d.g(fVar7, -1.0f);
                                                bVarL.f3627d.g(fVar9, f11);
                                                bVarL.f3627d.g(fVar8, -f11);
                                            }
                                        }
                                    }
                                    cVar.c(bVarL);
                                } else {
                                    i13 = i17;
                                    f = f5;
                                    i14 = i35;
                                }
                                f8 = f9;
                                dVar18 = dVar19;
                            }
                        } else {
                            if (bVar.f3755p) {
                                arrayList2 = arrayList3;
                                i12 = size;
                                cVar.e(cVarArr6[i6 + 1].f3764i, cVarArr6[i6].f3764i, 0, 4);
                            } else {
                                f9 = 1.0f;
                                arrayList2 = arrayList3;
                                i12 = size;
                                if (f9 == f5) {
                                    cVar.e(cVarArr6[i6 + 1].f3764i, cVarArr6[i6].f3764i, 0, 8);
                                } else {
                                    float f12 = f8;
                                    if (dVar18 != null) {
                                        c[] cVarArr8 = dVar18.Q;
                                        fVar6 = cVarArr8[i6].f3764i;
                                        int i37 = i6 + 1;
                                        fVar7 = cVarArr8[i37].f3764i;
                                        fVar8 = cVarArr6[i6].f3764i;
                                        fVar9 = cVarArr6[i37].f3764i;
                                        bVarL = cVar.l();
                                        f4 = f5;
                                        bVarL.f3625b = f4;
                                        f = f4;
                                        if (f7 != f4) {
                                            i14 = i35;
                                            i13 = i17;
                                            bVarL.f3627d.g(fVar6, 1.0f);
                                            bVarL.f3627d.g(fVar7, -1.0f);
                                            bVarL.f3627d.g(fVar9, 1.0f);
                                            bVarL.f3627d.g(fVar8, -1.0f);
                                        } else {
                                            i14 = i35;
                                            i13 = i17;
                                            bVarL.f3627d.g(fVar6, 1.0f);
                                            bVarL.f3627d.g(fVar7, -1.0f);
                                            bVarL.f3627d.g(fVar9, 1.0f);
                                            bVarL.f3627d.g(fVar8, -1.0f);
                                        }
                                        cVar.c(bVarL);
                                    } else {
                                        i13 = i17;
                                        f = f5;
                                        i14 = i35;
                                    }
                                    f8 = f9;
                                    dVar18 = dVar19;
                                }
                            }
                            i13 = i17;
                            f = f5;
                            f8 = f8;
                            i14 = i35;
                        }
                        i35 = i14 + 1;
                        i17 = i13;
                        arrayList3 = arrayList2;
                        size = i12;
                        f5 = f;
                    }
                }
                i8 = i17;
                if (dVar14 == null || !(dVar14 == dVar15 || z20)) {
                    dVar = dVar15;
                    if (!z5 || dVar14 == null) {
                        int i38 = 8;
                        if (z6 && dVar14 != null) {
                            int i39 = bVar.f3750j;
                            boolean z21 = i39 > 0 && bVar.f3749i == i39;
                            d dVar20 = dVar14;
                            d dVar21 = dVar20;
                            while (dVar21 != null) {
                                c[] cVarArr9 = dVar21.Q;
                                d dVar22 = dVar21.f3786m0[i4];
                                while (dVar22 != null && dVar22.g0 == i38) {
                                    dVar22 = dVar22.f3786m0[i4];
                                }
                                if (dVar21 == dVar14 || dVar21 == dVar || dVar22 == null) {
                                    dVar20 = dVar20;
                                } else {
                                    if (dVar22 == dVar) {
                                        dVar22 = null;
                                    }
                                    c cVar19 = cVarArr9[i6];
                                    s.f fVar13 = cVar19.f3764i;
                                    int i40 = i6 + 1;
                                    s.f fVar14 = dVar20.Q[i40].f3764i;
                                    int iE2 = cVar19.e();
                                    int iE3 = cVarArr9[i40].e();
                                    if (dVar22 != null) {
                                        cVar3 = dVar22.Q[i6];
                                        fVar2 = cVar3.f3764i;
                                        c cVar20 = cVar3.f;
                                        fVar = cVar20 != null ? cVar20.f3764i : null;
                                    } else {
                                        c cVar21 = dVar.Q[i6];
                                        s.f fVar15 = cVar21 != null ? cVar21.f3764i : null;
                                        fVar = cVarArr9[i40].f3764i;
                                        cVar3 = cVar21;
                                        fVar2 = fVar15;
                                    }
                                    if (cVar3 != null) {
                                        iE3 += cVar3.e();
                                    }
                                    int iE4 = iE2 + dVar20.Q[i40].e();
                                    d dVar23 = dVar22;
                                    s.f fVar16 = fVar2;
                                    int i41 = z21 ? 8 : 4;
                                    if (fVar13 == null || fVar14 == null || fVar16 == null || fVar == null) {
                                        dVar2 = dVar23;
                                    } else {
                                        dVar2 = dVar23;
                                        cVar.b(fVar13, fVar14, iE4, 0.5f, fVar16, fVar, iE3, i41);
                                    }
                                    dVar22 = dVar2;
                                }
                                if (dVar21.g0 != 8) {
                                    dVar20 = dVar21;
                                }
                                dVar21 = dVar22;
                                dVar20 = dVar20;
                                i38 = 8;
                            }
                            cVar2 = cVar;
                            c cVar22 = dVar14.Q[i6];
                            c cVar23 = cVarArr2[i6].f;
                            int i42 = i6 + 1;
                            c cVar24 = dVar.Q[i42];
                            c cVar25 = dVar13.Q[i42].f;
                            if (cVar23 != null) {
                                if (dVar14 != dVar) {
                                    cVar2.e(cVar22.f3764i, cVar23.f3764i, cVar22.e(), 5);
                                } else if (cVar25 != null) {
                                    cVar2.b(cVar22.f3764i, cVar23.f3764i, cVar22.e(), 0.5f, cVar24.f3764i, cVar25.f3764i, cVar24.e(), 5);
                                }
                            }
                            if (cVar25 != null && dVar14 != dVar) {
                                cVar2.e(cVar24.f3764i, cVar25.f3764i, -cVar24.e(), 5);
                            }
                        }
                        if ((z5 || z6) && dVar14 != null && dVar14 != dVar) {
                            cVarArr = dVar14.Q;
                            c cVar26 = cVarArr[i6];
                            if (dVar == null) {
                                dVar = dVar14;
                            }
                            c[] cVarArr10 = dVar.Q;
                            i11 = i6 + 1;
                            cVar5 = cVarArr10[i11];
                            cVar6 = cVar26.f;
                            if (cVar6 != null) {
                                fVar4 = cVar6.f3764i;
                            } else {
                                fVar4 = null;
                            }
                            cVar7 = cVar5.f;
                            if (cVar7 != null) {
                                fVar5 = cVar7.f3764i;
                            } else {
                                fVar5 = null;
                            }
                            if (dVar13 != dVar) {
                                c cVar27 = dVar13.Q[i11].f;
                                fVar5 = cVar27 != null ? cVar27.f3764i : null;
                            }
                            if (dVar14 == dVar) {
                                cVar5 = cVarArr[i11];
                            }
                            if (fVar4 == null && fVar5 != null) {
                                cVar2.b(cVar26.f3764i, fVar4, cVar26.e(), 0.5f, fVar5, cVar5.f3764i, cVarArr10[i11].e(), 5);
                            }
                        }
                    } else {
                        int i43 = bVar.f3750j;
                        boolean z22 = i43 > 0 && bVar.f3749i == i43;
                        d dVar24 = dVar14;
                        d dVar25 = dVar24;
                        while (dVar24 != null) {
                            c[] cVarArr11 = dVar24.Q;
                            d dVar26 = dVar24.f3786m0[i4];
                            while (true) {
                                if (dVar26 == null) {
                                    i9 = 8;
                                    break;
                                }
                                i9 = 8;
                                if (dVar26.g0 != 8) {
                                    break;
                                } else {
                                    dVar26 = dVar26.f3786m0[i4];
                                }
                            }
                            if (dVar26 != null || dVar24 == dVar) {
                                c cVar28 = cVarArr11[i6];
                                s.f fVar17 = cVar28.f3764i;
                                c cVar29 = cVar28.f;
                                s.f fVar18 = cVar29 != null ? cVar29.f3764i : null;
                                if (dVar25 != dVar24) {
                                    fVar18 = dVar25.Q[i6 + 1].f3764i;
                                } else if (dVar24 == dVar14) {
                                    c cVar30 = cVarArr2[i6].f;
                                    fVar18 = cVar30 != null ? cVar30.f3764i : null;
                                }
                                int iE5 = cVar28.e();
                                int i44 = i6 + 1;
                                int iE6 = cVarArr11[i44].e();
                                if (dVar26 != null) {
                                    cVar4 = dVar26.Q[i6];
                                    fVar3 = cVar4.f3764i;
                                } else {
                                    cVar4 = dVar13.Q[i44].f;
                                    fVar3 = cVar4 != null ? cVar4.f3764i : null;
                                }
                                s.f fVar19 = cVarArr11[i44].f3764i;
                                if (cVar4 != null) {
                                    iE6 += cVar4.e();
                                }
                                int iE7 = dVar25.Q[i44].e() + iE5;
                                if (fVar17 == null || fVar18 == null || fVar3 == null || fVar19 == null) {
                                    dVar3 = dVar26;
                                    i10 = 8;
                                } else {
                                    if (dVar24 == dVar14) {
                                        iE7 = dVar14.Q[i6].e();
                                    }
                                    if (dVar24 == dVar) {
                                        iE6 = dVar.Q[i44].e();
                                    }
                                    dVar3 = dVar26;
                                    i10 = 8;
                                    cVar.b(fVar17, fVar18, iE7, 0.5f, fVar3, fVar19, iE6, z22 ? 8 : 5);
                                }
                            } else {
                                dVar3 = dVar26;
                                i10 = i9;
                            }
                            if (dVar24.g0 != i10) {
                                dVar25 = dVar24;
                            }
                            dVar24 = dVar3;
                            dVar25 = dVar25;
                        }
                    }
                } else {
                    c cVar31 = cVarArr2[i6];
                    int i45 = i6 + 1;
                    c cVar32 = dVar13.Q[i45];
                    c cVar33 = cVar31.f;
                    s.f fVar20 = cVar33 != null ? cVar33.f3764i : null;
                    c cVar34 = cVar32.f;
                    s.f fVar21 = cVar34 != null ? cVar34.f3764i : null;
                    c cVar35 = dVar14.Q[i6];
                    if (dVar15 != null) {
                        cVar32 = dVar15.Q[i45];
                    }
                    if (fVar20 == null || fVar21 == null) {
                        dVar = dVar15;
                    } else {
                        float f13 = i4 == 0 ? dVar16.d0 : dVar16.f3773e0;
                        int iE8 = cVar35.e();
                        int iE9 = cVar32.e();
                        s.f fVar22 = cVar35.f3764i;
                        s.f fVar23 = cVar32.f3764i;
                        s.f fVar24 = fVar20;
                        dVar = dVar15;
                        cVar.b(fVar22, fVar24, iE8, f13, fVar21, fVar23, iE9, 7);
                    }
                }
                cVar2 = cVar;
                if (z5) {
                    cVarArr = dVar14.Q;
                    c cVar210 = cVarArr[i6];
                    if (dVar == null) {
                        dVar = dVar14;
                    }
                    c[] cVarArr12 = dVar.Q;
                    i11 = i6 + 1;
                    cVar5 = cVarArr12[i11];
                    cVar6 = cVar210.f;
                    if (cVar6 != null) {
                        fVar4 = cVar6.f3764i;
                    } else {
                        fVar4 = null;
                    }
                    cVar7 = cVar5.f;
                    if (cVar7 != null) {
                        fVar5 = cVar7.f3764i;
                    } else {
                        fVar5 = null;
                    }
                    if (dVar13 != dVar) {
                        c cVar211 = dVar13.Q[i11].f;
                        fVar5 = cVar211 != null ? cVar211.f3764i : null;
                    }
                    if (dVar14 == dVar) {
                        cVar5 = cVarArr[i11];
                    }
                    if (fVar4 == null) {
                    }
                } else {
                    cVarArr = dVar14.Q;
                    c cVar212 = cVarArr[i6];
                    if (dVar == null) {
                        dVar = dVar14;
                    }
                    c[] cVarArr13 = dVar.Q;
                    i11 = i6 + 1;
                    cVar5 = cVarArr13[i11];
                    cVar6 = cVar212.f;
                    if (cVar6 != null) {
                        fVar4 = cVar6.f3764i;
                    } else {
                        fVar4 = null;
                    }
                    cVar7 = cVar5.f;
                    if (cVar7 != null) {
                        fVar5 = cVar7.f3764i;
                    } else {
                        fVar5 = null;
                    }
                    if (dVar13 != dVar) {
                        c cVar213 = dVar13.Q[i11].f;
                        fVar5 = cVar213 != null ? cVar213.f3764i : null;
                    }
                    if (dVar14 == dVar) {
                        cVar5 = cVarArr[i11];
                    }
                    if (fVar4 == null) {
                    }
                }
            } else {
                i8 = i17;
            }
            i18 = i7 + 1;
            eVar2 = eVar;
            i17 = i8;
        }
    }

    public static void b(e eVar, s.c cVar, d dVar) {
        dVar.f3788o = -1;
        c cVar2 = dVar.M;
        int[] iArr = dVar.f3791p0;
        c cVar3 = dVar.L;
        c cVar4 = dVar.J;
        c cVar5 = dVar.K;
        c cVar6 = dVar.I;
        dVar.f3790p = -1;
        int[] iArr2 = eVar.f3791p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i4 = cVar6.f3762g;
            int iQ = eVar.q() - cVar5.f3762g;
            cVar6.f3764i = cVar.k(cVar6);
            cVar5.f3764i = cVar.k(cVar5);
            cVar.d(cVar6.f3764i, i4);
            cVar.d(cVar5.f3764i, iQ);
            dVar.f3788o = 2;
            dVar.Y = i4;
            int i5 = iQ - i4;
            dVar.U = i5;
            int i6 = dVar.f3768b0;
            if (i5 < i6) {
                dVar.U = i6;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i7 = cVar4.f3762g;
        int iK = eVar.k() - cVar3.f3762g;
        cVar4.f3764i = cVar.k(cVar4);
        cVar3.f3764i = cVar.k(cVar3);
        cVar.d(cVar4.f3764i, i7);
        cVar.d(cVar3.f3764i, iK);
        if (dVar.f3766a0 > 0 || dVar.g0 == 8) {
            s.f fVarK = cVar.k(cVar2);
            cVar2.f3764i = fVarK;
            cVar.d(fVarK, dVar.f3766a0 + i7);
        }
        dVar.f3790p = 2;
        dVar.Z = i7;
        int i8 = iK - i7;
        dVar.V = i8;
        int i9 = dVar.f3770c0;
        if (i8 < i9) {
            dVar.V = i9;
        }
    }

    public static final boolean c(int i4, int i5) {
        return (i4 & i5) == i5;
    }
}
