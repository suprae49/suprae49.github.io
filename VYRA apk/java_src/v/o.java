package v;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u.d f4270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f4271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f4273e = new g(this);
    public int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4274g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f4275h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f4276i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4277j = 1;

    public o(u.d dVar) {
        this.f4270b = dVar;
    }

    public static void b(f fVar, f fVar2, int i4) {
        fVar.f4256l.add(fVar2);
        fVar.f = i4;
        fVar2.f4255k.add(fVar);
    }

    public static f h(u.c cVar) {
        u.c cVar2 = cVar.f;
        if (cVar2 == null) {
            return null;
        }
        u.d dVar = cVar2.f3760d;
        int iB = s.e.b(cVar2.f3761e);
        if (iB == 1) {
            return dVar.f3771d.f4275h;
        }
        if (iB == 2) {
            return dVar.f3772e.f4275h;
        }
        if (iB == 3) {
            return dVar.f3771d.f4276i;
        }
        if (iB == 4) {
            return dVar.f3772e.f4276i;
        }
        if (iB != 5) {
            return null;
        }
        return dVar.f3772e.f4262k;
    }

    public static f i(u.c cVar, int i4) {
        u.c cVar2 = cVar.f;
        if (cVar2 == null) {
            return null;
        }
        u.d dVar = cVar2.f3760d;
        o oVar = i4 == 0 ? dVar.f3771d : dVar.f3772e;
        int iB = s.e.b(cVar2.f3761e);
        if (iB == 1 || iB == 2) {
            return oVar.f4275h;
        }
        if (iB == 3 || iB == 4) {
            return oVar.f4276i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i4, g gVar) {
        fVar.f4256l.add(fVar2);
        fVar.f4256l.add(this.f4273e);
        fVar.f4252h = i4;
        fVar.f4253i = gVar;
        fVar2.f4255k.add(fVar);
        gVar.f4255k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i4, int i5) {
        u.d dVar = this.f4270b;
        if (i5 == 0) {
            int i6 = dVar.f3797v;
            int iMax = Math.max(dVar.f3796u, i4);
            if (i6 > 0) {
                iMax = Math.min(i6, i4);
            }
            if (iMax != i4) {
                return iMax;
            }
        } else {
            int i7 = dVar.f3800y;
            int iMax2 = Math.max(dVar.f3799x, i4);
            if (i7 > 0) {
                iMax2 = Math.min(i7, i4);
            }
            if (iMax2 != i4) {
                return iMax2;
            }
        }
        return i4;
    }

    public long j() {
        g gVar = this.f4273e;
        if (gVar.f4254j) {
            return gVar.f4251g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(u.c cVar, u.c cVar2, int i4) {
        g gVar;
        float f;
        int i5;
        int i6;
        f fVarH = h(cVar);
        f fVarH2 = h(cVar2);
        if (fVarH.f4254j && fVarH2.f4254j) {
            int iE = cVar.e() + fVarH.f4251g;
            int iE2 = fVarH2.f4251g - cVar2.e();
            int i7 = iE2 - iE;
            g gVar2 = this.f4273e;
            if (!gVar2.f4254j && this.f4272d == 3) {
                int i8 = this.f4269a;
                if (i8 == 0) {
                    gVar2.d(g(i7, i4));
                } else if (i8 == 1) {
                    gVar2.d(Math.min(g(gVar2.f4257m, i4), i7));
                } else if (i8 == 2) {
                    u.d dVar = this.f4270b;
                    u.d dVar2 = dVar.T;
                    if (dVar2 != null) {
                        g gVar3 = (i4 == 0 ? dVar2.f3771d : dVar2.f3772e).f4273e;
                        if (gVar3.f4254j) {
                            gVar2.d(g((int) ((gVar3.f4251g * (i4 == 0 ? dVar.f3798w : dVar.f3801z)) + 0.5f), i4));
                        }
                    }
                } else if (i8 == 3) {
                    u.d dVar3 = this.f4270b;
                    o oVar = dVar3.f3771d;
                    if (oVar.f4272d == 3 && oVar.f4269a == 3) {
                        m mVar = dVar3.f3772e;
                        if (mVar.f4272d != 3 || mVar.f4269a != 3) {
                            if (i4 == 0) {
                                oVar = dVar3.f3772e;
                            }
                            gVar = oVar.f4273e;
                            if (gVar.f4254j) {
                                f = dVar3.W;
                                i5 = gVar.f4251g;
                                if (i4 == 1) {
                                    i6 = (int) ((i5 / f) + 0.5f);
                                } else {
                                    i6 = (int) ((f * i5) + 0.5f);
                                }
                                gVar2.d(i6);
                            }
                        }
                    } else {
                        if (i4 == 0) {
                            oVar = dVar3.f3772e;
                        }
                        gVar = oVar.f4273e;
                        if (gVar.f4254j) {
                            f = dVar3.W;
                            i5 = gVar.f4251g;
                            if (i4 == 1) {
                                i6 = (int) ((i5 / f) + 0.5f);
                            } else {
                                i6 = (int) ((f * i5) + 0.5f);
                            }
                            gVar2.d(i6);
                        }
                    }
                }
            }
            if (gVar2.f4254j) {
                int i9 = gVar2.f4251g;
                f fVar = this.f4276i;
                f fVar2 = this.f4275h;
                if (i9 == i7) {
                    fVar2.d(iE);
                    fVar.d(iE2);
                    return;
                }
                u.d dVar4 = this.f4270b;
                float f4 = i4 == 0 ? dVar4.d0 : dVar4.f3773e0;
                if (fVarH == fVarH2) {
                    iE = fVarH.f4251g;
                    iE2 = fVarH2.f4251g;
                    f4 = 0.5f;
                }
                fVar2.d((int) ((((iE2 - iE) - i9) * f4) + iE + 0.5f));
                fVar.d(fVar2.f4251g + gVar2.f4251g);
            }
        }
    }
}
