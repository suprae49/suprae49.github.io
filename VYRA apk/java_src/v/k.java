package v;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f4259k = new int[2];

    public static void m(int[] iArr, int i4, int i5, int i6, int i7, float f, int i8) {
        int i9 = i5 - i4;
        int i10 = i7 - i6;
        if (i8 != -1) {
            if (i8 == 0) {
                iArr[0] = (int) ((i10 * f) + 0.5f);
                iArr[1] = i10;
                return;
            } else {
                if (i8 != 1) {
                    return;
                }
                iArr[0] = i9;
                iArr[1] = (int) ((i9 * f) + 0.5f);
                return;
            }
        }
        int i11 = (int) ((i10 * f) + 0.5f);
        int i12 = (int) ((i9 / f) + 0.5f);
        if (i11 <= i9) {
            iArr[0] = i11;
            iArr[1] = i10;
        } else if (i12 <= i10) {
            iArr[0] = i9;
            iArr[1] = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // v.d
    public final void a(d dVar) {
        float f;
        int iG;
        int i4;
        int iG2;
        float f4;
        float f5;
        float f6;
        int i5;
        if (s.e.b(this.f4277j) == 3) {
            u.d dVar2 = this.f4270b;
            l(dVar2.I, dVar2.K, 0);
            return;
        }
        g gVar = this.f4273e;
        boolean z4 = gVar.f4254j;
        f fVar = this.f4275h;
        f fVar2 = this.f4276i;
        if (z4 || this.f4272d != 3) {
            f = 0.5f;
        } else {
            u.d dVar3 = this.f4270b;
            int i6 = dVar3.f3793r;
            if (i6 == 2) {
                f = 0.5f;
                u.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    g gVar2 = dVar4.f3771d.f4273e;
                    if (gVar2.f4254j) {
                        gVar.d((int) ((gVar2.f4251g * dVar3.f3798w) + 0.5f));
                    }
                }
            } else if (i6 == 3) {
                int i7 = dVar3.f3794s;
                if (i7 == 0 || i7 == 3) {
                    m mVar = dVar3.f3772e;
                    f fVar3 = mVar.f4275h;
                    f fVar4 = mVar.f4276i;
                    boolean z5 = dVar3.I.f != null;
                    boolean z6 = dVar3.J.f != null;
                    boolean z7 = dVar3.K.f != null;
                    boolean z8 = dVar3.L.f != null;
                    f = 0.5f;
                    int i8 = dVar3.X;
                    if (z5 && z6 && z7 && z8) {
                        float f7 = dVar3.W;
                        boolean z9 = fVar3.f4254j;
                        ArrayList arrayList = fVar3.f4256l;
                        int[] iArr = f4259k;
                        if (z9 && fVar4.f4254j) {
                            if (fVar.f4248c && fVar2.f4248c) {
                                m(iArr, ((f) fVar.f4256l.get(0)).f4251g + fVar.f, ((f) fVar2.f4256l.get(0)).f4251g - fVar2.f, fVar3.f4251g + fVar3.f, fVar4.f4251g - fVar4.f, f7, i8);
                                gVar.d(iArr[0]);
                                this.f4270b.f3772e.f4273e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (fVar.f4254j && fVar2.f4254j) {
                            if (!fVar3.f4248c || !fVar4.f4248c) {
                                return;
                            }
                            m(iArr, fVar.f4251g + fVar.f, fVar2.f4251g - fVar2.f, ((f) arrayList.get(0)).f4251g + fVar3.f, ((f) fVar4.f4256l.get(0)).f4251g - fVar4.f, f7, i8);
                            gVar.d(iArr[0]);
                            this.f4270b.f3772e.f4273e.d(iArr[1]);
                        }
                        if (!fVar.f4248c || !fVar2.f4248c || !fVar3.f4248c || !fVar4.f4248c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f4256l.get(0)).f4251g + fVar.f, ((f) fVar2.f4256l.get(0)).f4251g - fVar2.f, ((f) arrayList.get(0)).f4251g + fVar3.f, ((f) fVar4.f4256l.get(0)).f4251g - fVar4.f, f7, i8);
                        gVar.d(iArr[0]);
                        this.f4270b.f3772e.f4273e.d(iArr[1]);
                    } else if (z5 && z7) {
                        if (!fVar.f4248c || !fVar2.f4248c) {
                            return;
                        }
                        float f8 = dVar3.W;
                        int i9 = ((f) fVar.f4256l.get(0)).f4251g + fVar.f;
                        int i10 = ((f) fVar2.f4256l.get(0)).f4251g - fVar2.f;
                        if (i8 == -1 || i8 == 0) {
                            int iG3 = g(i10 - i9, 0);
                            int i11 = (int) ((iG3 * f8) + 0.5f);
                            int iG4 = g(i11, 1);
                            if (i11 != iG4) {
                                iG3 = (int) ((iG4 / f8) + 0.5f);
                            }
                            gVar.d(iG3);
                            this.f4270b.f3772e.f4273e.d(iG4);
                        } else if (i8 == 1) {
                            int iG5 = g(i10 - i9, 0);
                            int i12 = (int) ((iG5 / f8) + 0.5f);
                            int iG6 = g(i12, 1);
                            if (i12 != iG6) {
                                iG5 = (int) ((iG6 * f8) + 0.5f);
                            }
                            gVar.d(iG5);
                            this.f4270b.f3772e.f4273e.d(iG6);
                        }
                    } else if (z6 && z8) {
                        if (!fVar3.f4248c || !fVar4.f4248c) {
                            return;
                        }
                        float f9 = dVar3.W;
                        int i13 = ((f) fVar3.f4256l.get(0)).f4251g + fVar3.f;
                        int i14 = ((f) fVar4.f4256l.get(0)).f4251g - fVar4.f;
                        if (i8 == -1) {
                            iG = g(i14 - i13, 1);
                            i4 = (int) ((iG / f9) + 0.5f);
                            iG2 = g(i4, 0);
                            if (i4 != iG2) {
                                iG = (int) ((iG2 * f9) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f4270b.f3772e.f4273e.d(iG);
                        } else if (i8 == 0) {
                            int iG7 = g(i14 - i13, 1);
                            int i15 = (int) ((iG7 * f9) + 0.5f);
                            int iG8 = g(i15, 0);
                            if (i15 != iG8) {
                                iG7 = (int) ((iG8 / f9) + 0.5f);
                            }
                            gVar.d(iG8);
                            this.f4270b.f3772e.f4273e.d(iG7);
                        } else if (i8 == 1) {
                            iG = g(i14 - i13, 1);
                            i4 = (int) ((iG / f9) + 0.5f);
                            iG2 = g(i4, 0);
                            if (i4 != iG2) {
                                iG = (int) ((iG2 * f9) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f4270b.f3772e.f4273e.d(iG);
                        }
                    }
                } else {
                    int i16 = dVar3.X;
                    if (i16 != -1) {
                        if (i16 == 0) {
                            f6 = dVar3.f3772e.f4273e.f4251g / dVar3.W;
                            i5 = (int) (f6 + 0.5f);
                        } else if (i16 != 1) {
                            i5 = 0;
                        } else {
                            f4 = dVar3.f3772e.f4273e.f4251g;
                            f5 = dVar3.W;
                        }
                        gVar.d(i5);
                        f = 0.5f;
                    } else {
                        f4 = dVar3.f3772e.f4273e.f4251g;
                        f5 = dVar3.W;
                    }
                    f6 = f4 * f5;
                    i5 = (int) (f6 + 0.5f);
                    gVar.d(i5);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z10 = fVar.f4248c;
        ArrayList arrayList2 = fVar.f4256l;
        if (z10) {
            boolean z11 = fVar2.f4248c;
            ArrayList arrayList3 = fVar2.f4256l;
            if (z11) {
                if (fVar.f4254j && fVar2.f4254j && gVar.f4254j) {
                    return;
                }
                if (!gVar.f4254j && this.f4272d == 3) {
                    u.d dVar5 = this.f4270b;
                    if (dVar5.f3793r == 0 && !dVar5.x()) {
                        f fVar5 = (f) arrayList2.get(0);
                        f fVar6 = (f) arrayList3.get(0);
                        int i17 = fVar5.f4251g + fVar.f;
                        int i18 = fVar6.f4251g + fVar2.f;
                        fVar.d(i17);
                        fVar2.d(i18);
                        gVar.d(i18 - i17);
                        return;
                    }
                }
                if (!gVar.f4254j && this.f4272d == 3 && this.f4269a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((f) arrayList3.get(0)).f4251g + fVar2.f) - (((f) arrayList2.get(0)).f4251g + fVar.f), gVar.f4257m);
                    u.d dVar6 = this.f4270b;
                    int i19 = dVar6.f3797v;
                    int iMax = Math.max(dVar6.f3796u, iMin);
                    if (i19 > 0) {
                        iMax = Math.min(i19, iMax);
                    }
                    gVar.d(iMax);
                }
                if (gVar.f4254j) {
                    f fVar7 = (f) arrayList2.get(0);
                    f fVar8 = (f) arrayList3.get(0);
                    int i20 = fVar7.f4251g;
                    int i21 = fVar.f + i20;
                    int i22 = fVar8.f4251g;
                    int i23 = fVar2.f + i22;
                    float f10 = this.f4270b.d0;
                    if (fVar7 == fVar8) {
                        f10 = f;
                    } else {
                        i20 = i21;
                        i22 = i23;
                    }
                    fVar.d((int) ((((i22 - i20) - gVar.f4251g) * f10) + i20 + f));
                    fVar2.d(fVar.f4251g + gVar.f4251g);
                }
            }
        }
    }

    @Override // v.o
    public final void d() {
        u.d dVar;
        u.d dVar2;
        int i4;
        u.d dVar3;
        u.d dVar4;
        int i5;
        u.d dVar5 = this.f4270b;
        boolean z4 = dVar5.f3765a;
        g gVar = this.f4273e;
        if (z4) {
            gVar.d(dVar5.q());
        }
        boolean z5 = gVar.f4254j;
        ArrayList arrayList = gVar.f4255k;
        ArrayList arrayList2 = gVar.f4256l;
        f fVar = this.f4276i;
        f fVar2 = this.f4275h;
        if (!z5) {
            u.d dVar6 = this.f4270b;
            int i6 = dVar6.f3791p0[0];
            this.f4272d = i6;
            if (i6 != 3) {
                if (i6 == 4 && (dVar4 = dVar6.T) != null && ((i5 = dVar4.f3791p0[0]) == 1 || i5 == 4)) {
                    int iQ = (dVar4.q() - this.f4270b.I.e()) - this.f4270b.K.e();
                    o.b(fVar2, dVar4.f3771d.f4275h, this.f4270b.I.e());
                    o.b(fVar, dVar4.f3771d.f4276i, -this.f4270b.K.e());
                    gVar.d(iQ);
                    return;
                }
                if (i6 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.f4272d == 4 && (dVar2 = (dVar = this.f4270b).T) != null && ((i4 = dVar2.f3791p0[0]) == 1 || i4 == 4)) {
            o.b(fVar2, dVar2.f3771d.f4275h, dVar.I.e());
            o.b(fVar, dVar2.f3771d.f4276i, -this.f4270b.K.e());
            return;
        }
        if (gVar.f4254j) {
            u.d dVar7 = this.f4270b;
            if (dVar7.f3765a) {
                u.c[] cVarArr = dVar7.Q;
                u.c cVar = cVarArr[0];
                u.c cVar2 = cVar.f;
                if (cVar2 != null && cVarArr[1].f != null) {
                    boolean zX = dVar7.x();
                    u.d dVar8 = this.f4270b;
                    if (zX) {
                        fVar2.f = dVar8.Q[0].e();
                        fVar.f = -this.f4270b.Q[1].e();
                        return;
                    }
                    f fVarH = o.h(dVar8.Q[0]);
                    if (fVarH != null) {
                        o.b(fVar2, fVarH, this.f4270b.Q[0].e());
                    }
                    f fVarH2 = o.h(this.f4270b.Q[1]);
                    if (fVarH2 != null) {
                        o.b(fVar, fVarH2, -this.f4270b.Q[1].e());
                    }
                    fVar2.f4247b = true;
                    fVar.f4247b = true;
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = o.h(cVar);
                    if (fVarH3 != null) {
                        o.b(fVar2, fVarH3, this.f4270b.Q[0].e());
                        o.b(fVar, fVar2, gVar.f4251g);
                        return;
                    }
                    return;
                }
                u.c cVar3 = cVarArr[1];
                if (cVar3.f != null) {
                    f fVarH4 = o.h(cVar3);
                    if (fVarH4 != null) {
                        o.b(fVar, fVarH4, -this.f4270b.Q[1].e());
                        o.b(fVar2, fVar, -gVar.f4251g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof u.i) || dVar7.T == null || dVar7.i(7).f != null) {
                    return;
                }
                u.d dVar9 = this.f4270b;
                o.b(fVar2, dVar9.T.f3771d.f4275h, dVar9.r());
                o.b(fVar, fVar2, gVar.f4251g);
                return;
            }
        }
        if (this.f4272d == 3) {
            u.d dVar10 = this.f4270b;
            int i7 = dVar10.f3793r;
            if (i7 == 2) {
                u.d dVar11 = dVar10.T;
                if (dVar11 != null) {
                    g gVar2 = dVar11.f3772e.f4273e;
                    arrayList2.add(gVar2);
                    gVar2.f4255k.add(gVar);
                    gVar.f4247b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i7 == 3) {
                if (dVar10.f3794s == 3) {
                    fVar2.f4246a = this;
                    fVar.f4246a = this;
                    m mVar = dVar10.f3772e;
                    mVar.f4275h.f4246a = this;
                    mVar.f4276i.f4246a = this;
                    gVar.f4246a = this;
                    if (dVar10.y()) {
                        arrayList2.add(this.f4270b.f3772e.f4273e);
                        this.f4270b.f3772e.f4273e.f4255k.add(gVar);
                        m mVar2 = this.f4270b.f3772e;
                        mVar2.f4273e.f4246a = this;
                        arrayList2.add(mVar2.f4275h);
                        arrayList2.add(this.f4270b.f3772e.f4276i);
                        this.f4270b.f3772e.f4275h.f4255k.add(gVar);
                        this.f4270b.f3772e.f4276i.f4255k.add(gVar);
                    } else {
                        boolean zX2 = this.f4270b.x();
                        u.d dVar12 = this.f4270b;
                        if (zX2) {
                            dVar12.f3772e.f4273e.f4256l.add(gVar);
                            arrayList.add(this.f4270b.f3772e.f4273e);
                        } else {
                            dVar12.f3772e.f4273e.f4256l.add(gVar);
                        }
                    }
                } else {
                    g gVar3 = dVar10.f3772e.f4273e;
                    arrayList2.add(gVar3);
                    gVar3.f4255k.add(gVar);
                    this.f4270b.f3772e.f4275h.f4255k.add(gVar);
                    this.f4270b.f3772e.f4276i.f4255k.add(gVar);
                    gVar.f4247b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.f4256l.add(gVar);
                    fVar.f4256l.add(gVar);
                }
            }
        }
        u.d dVar13 = this.f4270b;
        u.c[] cVarArr2 = dVar13.Q;
        u.c cVar4 = cVarArr2[0];
        u.c cVar5 = cVar4.f;
        if (cVar5 != null && cVarArr2[1].f != null) {
            boolean zX3 = dVar13.x();
            u.d dVar14 = this.f4270b;
            if (zX3) {
                fVar2.f = dVar14.Q[0].e();
                fVar.f = -this.f4270b.Q[1].e();
                return;
            }
            f fVarH5 = o.h(dVar14.Q[0]);
            f fVarH6 = o.h(this.f4270b.Q[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f4277j = 4;
            return;
        }
        if (cVar5 != null) {
            f fVarH7 = o.h(cVar4);
            if (fVarH7 != null) {
                o.b(fVar2, fVarH7, this.f4270b.Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        u.c cVar6 = cVarArr2[1];
        if (cVar6.f != null) {
            f fVarH8 = o.h(cVar6);
            if (fVarH8 != null) {
                o.b(fVar, fVarH8, -this.f4270b.Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar13 instanceof u.i) || (dVar3 = dVar13.T) == null) {
            return;
        }
        o.b(fVar2, dVar3.f3771d.f4275h, dVar13.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // v.o
    public final void e() {
        f fVar = this.f4275h;
        if (fVar.f4254j) {
            this.f4270b.Y = fVar.f4251g;
        }
    }

    @Override // v.o
    public final void f() {
        this.f4271c = null;
        this.f4275h.c();
        this.f4276i.c();
        this.f4273e.c();
        this.f4274g = false;
    }

    @Override // v.o
    public final boolean k() {
        return this.f4272d != 3 || this.f4270b.f3793r == 0;
    }

    public final void n() {
        this.f4274g = false;
        f fVar = this.f4275h;
        fVar.c();
        fVar.f4254j = false;
        f fVar2 = this.f4276i;
        fVar2.c();
        fVar2.f4254j = false;
        this.f4273e.f4254j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4270b.f3777h0;
    }
}
