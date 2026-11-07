package v;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f4262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f4263l;

    @Override // v.d
    public final void a(d dVar) {
        float f;
        float f4;
        float f5;
        int i4;
        if (s.e.b(this.f4277j) == 3) {
            u.d dVar2 = this.f4270b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        g gVar = this.f4273e;
        if (gVar.f4248c && !gVar.f4254j && this.f4272d == 3) {
            u.d dVar3 = this.f4270b;
            int i5 = dVar3.f3794s;
            if (i5 == 2) {
                u.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    g gVar2 = dVar4.f3772e.f4273e;
                    if (gVar2.f4254j) {
                        gVar.d((int) ((gVar2.f4251g * dVar3.f3801z) + 0.5f));
                    }
                }
            } else if (i5 == 3) {
                g gVar3 = dVar3.f3771d.f4273e;
                if (gVar3.f4254j) {
                    int i6 = dVar3.X;
                    if (i6 != -1) {
                        if (i6 == 0) {
                            f5 = gVar3.f4251g * dVar3.W;
                            i4 = (int) (f5 + 0.5f);
                        } else if (i6 != 1) {
                            i4 = 0;
                        } else {
                            f = gVar3.f4251g;
                            f4 = dVar3.W;
                        }
                        gVar.d(i4);
                    } else {
                        f = gVar3.f4251g;
                        f4 = dVar3.W;
                    }
                    f5 = f / f4;
                    i4 = (int) (f5 + 0.5f);
                    gVar.d(i4);
                }
            }
        }
        f fVar = this.f4275h;
        boolean z4 = fVar.f4248c;
        ArrayList arrayList = fVar.f4256l;
        if (z4) {
            f fVar2 = this.f4276i;
            boolean z5 = fVar2.f4248c;
            ArrayList arrayList2 = fVar2.f4256l;
            if (z5) {
                if (fVar.f4254j && fVar2.f4254j && gVar.f4254j) {
                    return;
                }
                if (!gVar.f4254j && this.f4272d == 3) {
                    u.d dVar5 = this.f4270b;
                    if (dVar5.f3793r == 0 && !dVar5.y()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i7 = fVar3.f4251g + fVar.f;
                        int i8 = fVar4.f4251g + fVar2.f;
                        fVar.d(i7);
                        fVar2.d(i8);
                        gVar.d(i8 - i7);
                        return;
                    }
                }
                if (!gVar.f4254j && this.f4272d == 3 && this.f4269a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i9 = (((f) arrayList2.get(0)).f4251g + fVar2.f) - (fVar5.f4251g + fVar.f);
                    int i10 = gVar.f4257m;
                    if (i9 < i10) {
                        gVar.d(i9);
                    } else {
                        gVar.d(i10);
                    }
                }
                if (gVar.f4254j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i11 = fVar6.f4251g;
                    int i12 = fVar.f + i11;
                    int i13 = fVar7.f4251g;
                    int i14 = fVar2.f + i13;
                    float f6 = this.f4270b.f3773e0;
                    if (fVar6 == fVar7) {
                        f6 = 0.5f;
                    } else {
                        i11 = i12;
                        i13 = i14;
                    }
                    fVar.d((int) ((((i13 - i11) - gVar.f4251g) * f6) + i11 + 0.5f));
                    fVar2.d(fVar.f4251g + gVar.f4251g);
                }
            }
        }
    }

    @Override // v.o
    public final void d() {
        u.d dVar;
        u.d dVar2;
        u.d dVar3;
        u.d dVar4;
        f fVar = this.f4262k;
        u.d dVar5 = this.f4270b;
        boolean z4 = dVar5.f3765a;
        g gVar = this.f4273e;
        if (z4) {
            gVar.d(dVar5.k());
        }
        boolean z5 = gVar.f4254j;
        ArrayList arrayList = gVar.f4255k;
        ArrayList arrayList2 = gVar.f4256l;
        f fVar2 = this.f4276i;
        f fVar3 = this.f4275h;
        if (!z5) {
            u.d dVar6 = this.f4270b;
            this.f4272d = dVar6.f3791p0[1];
            if (dVar6.E) {
                this.f4263l = new a(this);
            }
            int i4 = this.f4272d;
            if (i4 != 3) {
                if (i4 == 4 && (dVar4 = this.f4270b.T) != null && dVar4.f3791p0[1] == 1) {
                    int iK = (dVar4.k() - this.f4270b.J.e()) - this.f4270b.L.e();
                    o.b(fVar3, dVar4.f3772e.f4275h, this.f4270b.J.e());
                    o.b(fVar2, dVar4.f3772e.f4276i, -this.f4270b.L.e());
                    gVar.d(iK);
                    return;
                }
                if (i4 == 1) {
                    gVar.d(this.f4270b.k());
                }
            }
        } else if (this.f4272d == 4 && (dVar2 = (dVar = this.f4270b).T) != null && dVar2.f3791p0[1] == 1) {
            o.b(fVar3, dVar2.f3772e.f4275h, dVar.J.e());
            o.b(fVar2, dVar2.f3772e.f4276i, -this.f4270b.L.e());
            return;
        }
        boolean z6 = gVar.f4254j;
        if (z6) {
            u.d dVar7 = this.f4270b;
            if (dVar7.f3765a) {
                u.c[] cVarArr = dVar7.Q;
                u.c cVar = cVarArr[2];
                u.c cVar2 = cVar.f;
                if (cVar2 != null && cVarArr[3].f != null) {
                    boolean zY = dVar7.y();
                    u.d dVar8 = this.f4270b;
                    if (zY) {
                        fVar3.f = dVar8.Q[2].e();
                        fVar2.f = -this.f4270b.Q[3].e();
                    } else {
                        f fVarH = o.h(dVar8.Q[2]);
                        if (fVarH != null) {
                            o.b(fVar3, fVarH, this.f4270b.Q[2].e());
                        }
                        f fVarH2 = o.h(this.f4270b.Q[3]);
                        if (fVarH2 != null) {
                            o.b(fVar2, fVarH2, -this.f4270b.Q[3].e());
                        }
                        fVar3.f4247b = true;
                        fVar2.f4247b = true;
                    }
                    u.d dVar9 = this.f4270b;
                    if (dVar9.E) {
                        o.b(fVar, fVar3, dVar9.f3766a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = o.h(cVar);
                    if (fVarH3 != null) {
                        o.b(fVar3, fVarH3, this.f4270b.Q[2].e());
                        o.b(fVar2, fVar3, gVar.f4251g);
                        u.d dVar10 = this.f4270b;
                        if (dVar10.E) {
                            o.b(fVar, fVar3, dVar10.f3766a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                u.c cVar3 = cVarArr[3];
                if (cVar3.f != null) {
                    f fVarH4 = o.h(cVar3);
                    if (fVarH4 != null) {
                        o.b(fVar2, fVarH4, -this.f4270b.Q[3].e());
                        o.b(fVar3, fVar2, -gVar.f4251g);
                    }
                    u.d dVar11 = this.f4270b;
                    if (dVar11.E) {
                        o.b(fVar, fVar3, dVar11.f3766a0);
                        return;
                    }
                    return;
                }
                u.c cVar4 = cVarArr[4];
                if (cVar4.f != null) {
                    f fVarH5 = o.h(cVar4);
                    if (fVarH5 != null) {
                        o.b(fVar, fVarH5, 0);
                        o.b(fVar3, fVar, -this.f4270b.f3766a0);
                        o.b(fVar2, fVar3, gVar.f4251g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof u.i) || dVar7.T == null || dVar7.i(7).f != null) {
                    return;
                }
                u.d dVar12 = this.f4270b;
                o.b(fVar3, dVar12.T.f3772e.f4275h, dVar12.s());
                o.b(fVar2, fVar3, gVar.f4251g);
                u.d dVar13 = this.f4270b;
                if (dVar13.E) {
                    o.b(fVar, fVar3, dVar13.f3766a0);
                    return;
                }
                return;
            }
        }
        if (z6 || this.f4272d != 3) {
            gVar.b(this);
        } else {
            u.d dVar14 = this.f4270b;
            int i5 = dVar14.f3794s;
            if (i5 == 2) {
                u.d dVar15 = dVar14.T;
                if (dVar15 != null) {
                    g gVar2 = dVar15.f3772e.f4273e;
                    arrayList2.add(gVar2);
                    gVar2.f4255k.add(gVar);
                    gVar.f4247b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            } else if (i5 == 3 && !dVar14.y()) {
                u.d dVar16 = this.f4270b;
                if (dVar16.f3793r != 3) {
                    g gVar3 = dVar16.f3771d.f4273e;
                    arrayList2.add(gVar3);
                    gVar3.f4255k.add(gVar);
                    gVar.f4247b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        }
        u.d dVar17 = this.f4270b;
        u.c[] cVarArr2 = dVar17.Q;
        u.c cVar5 = cVarArr2[2];
        u.c cVar6 = cVar5.f;
        if (cVar6 != null && cVarArr2[3].f != null) {
            boolean zY2 = dVar17.y();
            u.d dVar18 = this.f4270b;
            if (zY2) {
                fVar3.f = dVar18.Q[2].e();
                fVar2.f = -this.f4270b.Q[3].e();
            } else {
                f fVarH6 = o.h(dVar18.Q[2]);
                f fVarH7 = o.h(this.f4270b.Q[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f4277j = 4;
            }
            if (this.f4270b.E) {
                c(fVar, fVar3, 1, this.f4263l);
            }
        } else if (cVar6 != null) {
            f fVarH8 = o.h(cVar5);
            if (fVarH8 != null) {
                o.b(fVar3, fVarH8, this.f4270b.Q[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.f4270b.E) {
                    c(fVar, fVar3, 1, this.f4263l);
                }
                if (this.f4272d == 3) {
                    u.d dVar19 = this.f4270b;
                    if (dVar19.W > 0.0f) {
                        k kVar = dVar19.f3771d;
                        if (kVar.f4272d == 3) {
                            kVar.f4273e.f4255k.add(gVar);
                            arrayList2.add(this.f4270b.f3771d.f4273e);
                            gVar.f4246a = this;
                        }
                    }
                }
            }
        } else {
            u.c cVar7 = cVarArr2[3];
            if (cVar7.f != null) {
                f fVarH9 = o.h(cVar7);
                if (fVarH9 != null) {
                    o.b(fVar2, fVarH9, -this.f4270b.Q[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f4270b.E) {
                        c(fVar, fVar3, 1, this.f4263l);
                    }
                }
            } else {
                u.c cVar8 = cVarArr2[4];
                if (cVar8.f != null) {
                    f fVarH10 = o.h(cVar8);
                    if (fVarH10 != null) {
                        o.b(fVar, fVarH10, 0);
                        c(fVar3, fVar, -1, this.f4263l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(dVar17 instanceof u.i) && (dVar3 = dVar17.T) != null) {
                    o.b(fVar3, dVar3.f3772e.f4275h, dVar17.s());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f4270b.E) {
                        c(fVar, fVar3, 1, this.f4263l);
                    }
                    if (this.f4272d == 3) {
                        u.d dVar20 = this.f4270b;
                        if (dVar20.W > 0.0f) {
                            k kVar2 = dVar20.f3771d;
                            if (kVar2.f4272d == 3) {
                                kVar2.f4273e.f4255k.add(gVar);
                                arrayList2.add(this.f4270b.f3771d.f4273e);
                                gVar.f4246a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.f4248c = true;
        }
    }

    @Override // v.o
    public final void e() {
        f fVar = this.f4275h;
        if (fVar.f4254j) {
            this.f4270b.Z = fVar.f4251g;
        }
    }

    @Override // v.o
    public final void f() {
        this.f4271c = null;
        this.f4275h.c();
        this.f4276i.c();
        this.f4262k.c();
        this.f4273e.c();
        this.f4274g = false;
    }

    @Override // v.o
    public final boolean k() {
        return this.f4272d != 3 || this.f4270b.f3794s == 0;
    }

    public final void m() {
        this.f4274g = false;
        f fVar = this.f4275h;
        fVar.c();
        fVar.f4254j = false;
        f fVar2 = this.f4276i;
        fVar2.c();
        fVar2.f4254j = false;
        f fVar3 = this.f4262k;
        fVar3.c();
        fVar3.f4254j = false;
        this.f4273e.f4254j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4270b.f3777h0;
    }
}
