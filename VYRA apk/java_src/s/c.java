package s;

import androidx.emoji2.text.p;
import androidx.emoji2.text.t;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f3629q = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f3633d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f3641m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f3643p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3630a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3631b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3632c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3634e = 32;
    public int f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3636h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean[] f3637i = new boolean[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3638j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3639k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3640l = 32;
    public f[] n = new f[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3642o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b[] f3635g = new b[32];

    public c() {
        s();
        t tVar = new t();
        tVar.f578b = new o0.c();
        tVar.f579c = new o0.c();
        tVar.f580d = new f[32];
        this.f3641m = tVar;
        d dVar = new d(tVar);
        dVar.f = new f[128];
        dVar.f3644g = new f[128];
        dVar.f3645h = 0;
        dVar.f3646i = new p(13, dVar);
        this.f3633d = dVar;
        this.f3643p = new b(tVar);
    }

    public static int n(Object obj) {
        f fVar = ((u.c) obj).f3764i;
        if (fVar != null) {
            return (int) (fVar.f3650j + 0.5f);
        }
        return 0;
    }

    public final f a(int i4) {
        o0.c cVar = (o0.c) this.f3641m.f579c;
        int i5 = cVar.f3134b;
        Object obj = null;
        if (i5 > 0) {
            int i6 = i5 - 1;
            Object[] objArr = cVar.f3133a;
            Object obj2 = objArr[i6];
            objArr[i6] = null;
            cVar.f3134b = i6;
            obj = obj2;
        }
        f fVar = (f) obj;
        if (fVar == null) {
            fVar = new f(i4);
            fVar.f3656q = i4;
        } else {
            fVar.c();
            fVar.f3656q = i4;
        }
        int i7 = this.f3642o;
        int i8 = this.f3630a;
        if (i7 >= i8) {
            int i9 = i8 * 2;
            this.f3630a = i9;
            this.n = (f[]) Arrays.copyOf(this.n, i9);
        }
        f[] fVarArr = this.n;
        int i10 = this.f3642o;
        this.f3642o = i10 + 1;
        fVarArr[i10] = fVar;
        return fVar;
    }

    public final void b(f fVar, f fVar2, int i4, float f, f fVar3, f fVar4, int i5, int i6) {
        b bVarL = l();
        if (fVar2 == fVar3) {
            bVarL.f3627d.g(fVar, 1.0f);
            bVarL.f3627d.g(fVar4, 1.0f);
            bVarL.f3627d.g(fVar2, -2.0f);
        } else {
            a aVar = bVarL.f3627d;
            if (f == 0.5f) {
                aVar.g(fVar, 1.0f);
                bVarL.f3627d.g(fVar2, -1.0f);
                bVarL.f3627d.g(fVar3, -1.0f);
                bVarL.f3627d.g(fVar4, 1.0f);
                if (i4 > 0 || i5 > 0) {
                    bVarL.f3625b = (-i4) + i5;
                }
            } else if (f <= 0.0f) {
                aVar.g(fVar, -1.0f);
                bVarL.f3627d.g(fVar2, 1.0f);
                bVarL.f3625b = i4;
            } else if (f >= 1.0f) {
                aVar.g(fVar4, -1.0f);
                bVarL.f3627d.g(fVar3, 1.0f);
                bVarL.f3625b = -i5;
            } else {
                float f4 = 1.0f - f;
                aVar.g(fVar, f4 * 1.0f);
                bVarL.f3627d.g(fVar2, f4 * (-1.0f));
                bVarL.f3627d.g(fVar3, (-1.0f) * f);
                bVarL.f3627d.g(fVar4, 1.0f * f);
                if (i4 > 0 || i5 > 0) {
                    bVarL.f3625b = (i5 * f) + ((-i4) * f4);
                }
            }
        }
        if (i6 != 8) {
            bVarL.a(this, i6);
        }
        c(bVarL);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8  */
    public final void c(b bVar) {
        boolean z4;
        boolean z5;
        f fVarF;
        if (this.f3639k + 1 >= this.f3640l || this.f3638j + 1 >= this.f) {
            o();
        }
        if (bVar.f3628e) {
            z4 = false;
        } else {
            ArrayList arrayList = bVar.f3626c;
            if (this.f3635g.length != 0) {
                boolean z6 = false;
                while (!z6) {
                    int iD = bVar.f3627d.d();
                    for (int i4 = 0; i4 < iD; i4++) {
                        f fVarE = bVar.f3627d.e(i4);
                        if (fVarE.f3648h != -1 || fVarE.f3651k) {
                            arrayList.add(fVarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i5 = 0; i5 < size; i5++) {
                            f fVar = (f) arrayList.get(i5);
                            if (fVar.f3651k) {
                                bVar.h(this, fVar, true);
                            } else {
                                bVar.i(this, this.f3635g[fVar.f3648h], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z6 = true;
                    }
                }
                if (bVar.f3624a != null && bVar.f3627d.d() == 0) {
                    bVar.f3628e = true;
                    this.f3631b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f = bVar.f3625b;
            float f4 = 0.0f;
            if (f < 0.0f) {
                bVar.f3625b = f * (-1.0f);
                a aVar = bVar.f3627d;
                int i6 = aVar.f3621h;
                for (int i7 = 0; i6 != -1 && i7 < aVar.f3615a; i7++) {
                    float[] fArr = aVar.f3620g;
                    fArr[i6] = fArr[i6] * (-1.0f);
                    i6 = aVar.f[i6];
                }
            }
            int iD2 = bVar.f3627d.d();
            float f5 = 0.0f;
            float f6 = 0.0f;
            f fVar2 = null;
            f fVar3 = null;
            int i8 = 0;
            boolean z7 = false;
            boolean z8 = false;
            while (i8 < iD2) {
                float f7 = bVar.f3627d.f(i8);
                f fVarE2 = bVar.f3627d.e(i8);
                float f8 = f4;
                if (fVarE2.f3656q == 1) {
                    if (fVar2 == null) {
                        if (fVarE2.f3655p <= 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        fVar2 = fVarE2;
                        f5 = f7;
                    } else {
                        if (f5 > f7) {
                            if (fVarE2.f3655p > 1) {
                                z7 = false;
                            }
                            fVar2 = fVarE2;
                            f5 = f7;
                        } else if (z7 || fVarE2.f3655p > 1) {
                        }
                        z7 = true;
                        fVar2 = fVarE2;
                        f5 = f7;
                    }
                } else if (fVar2 == null && f7 < f8) {
                    if (fVar3 == null) {
                        if (fVarE2.f3655p <= 1) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        fVar3 = fVarE2;
                        f6 = f7;
                    } else {
                        if (f6 > f7) {
                            if (fVarE2.f3655p > 1) {
                                z8 = false;
                            }
                            fVar3 = fVarE2;
                            f6 = f7;
                        } else if (z8 || fVarE2.f3655p > 1) {
                        }
                        z8 = true;
                        fVar3 = fVarE2;
                        f6 = f7;
                    }
                }
                i8++;
                f4 = f8;
            }
            float f9 = f4;
            if (fVar2 == null) {
                fVar2 = fVar3;
            }
            if (fVar2 == null) {
                z5 = true;
            } else {
                bVar.g(fVar2);
                z5 = false;
            }
            if (bVar.f3627d.d() == 0) {
                bVar.f3628e = true;
            }
            if (z5) {
                if (this.f3638j + 1 >= this.f) {
                    o();
                }
                f fVarA = a(3);
                int i9 = this.f3632c + 1;
                this.f3632c = i9;
                this.f3638j++;
                fVarA.f3647g = i9;
                t tVar = this.f3641m;
                ((f[]) tVar.f580d)[i9] = fVarA;
                bVar.f3624a = fVarA;
                int i10 = this.f3639k;
                h(bVar);
                if (this.f3639k == i10 + 1) {
                    b bVar2 = this.f3643p;
                    bVar2.f3624a = null;
                    bVar2.f3627d.b();
                    for (int i11 = 0; i11 < bVar.f3627d.d(); i11++) {
                        bVar2.f3627d.a(bVar.f3627d.e(i11), bVar.f3627d.f(i11), true);
                    }
                    r(this.f3643p);
                    if (fVarA.f3648h == -1) {
                        if (bVar.f3624a == fVarA && (fVarF = bVar.f(null, fVarA)) != null) {
                            bVar.g(fVarF);
                        }
                        if (!bVar.f3628e) {
                            bVar.f3624a.e(this, bVar);
                        }
                        ((o0.c) tVar.f578b).b(bVar);
                        this.f3639k--;
                    }
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            f fVar4 = bVar.f3624a;
            if (fVar4 == null) {
                return;
            }
            if (fVar4.f3656q != 1 && bVar.f3625b < f9) {
                return;
            }
        }
        if (z4) {
            return;
        }
        h(bVar);
    }

    public final void d(f fVar, int i4) {
        int i5 = fVar.f3648h;
        if (i5 == -1) {
            fVar.d(this, i4);
            for (int i6 = 0; i6 < this.f3632c + 1; i6++) {
                f fVar2 = ((f[]) this.f3641m.f580d)[i6];
            }
            return;
        }
        if (i5 == -1) {
            b bVarL = l();
            bVarL.f3624a = fVar;
            float f = i4;
            fVar.f3650j = f;
            bVarL.f3625b = f;
            bVarL.f3628e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f3635g[i5];
        if (bVar.f3628e) {
            bVar.f3625b = i4;
            return;
        }
        if (bVar.f3627d.d() == 0) {
            bVar.f3628e = true;
            bVar.f3625b = i4;
            return;
        }
        b bVarL2 = l();
        if (i4 < 0) {
            bVarL2.f3625b = i4 * (-1);
            bVarL2.f3627d.g(fVar, 1.0f);
        } else {
            bVarL2.f3625b = i4;
            bVarL2.f3627d.g(fVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(f fVar, f fVar2, int i4, int i5) {
        if (i5 == 8 && fVar2.f3651k && fVar.f3648h == -1) {
            fVar.d(this, fVar2.f3650j + i4);
            return;
        }
        b bVarL = l();
        boolean z4 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            }
            bVarL.f3625b = i4;
        }
        a aVar = bVarL.f3627d;
        if (z4) {
            aVar.g(fVar, 1.0f);
            bVarL.f3627d.g(fVar2, -1.0f);
        } else {
            aVar.g(fVar, -1.0f);
            bVarL.f3627d.g(fVar2, 1.0f);
        }
        if (i5 != 8) {
            bVarL.a(this, i5);
        }
        c(bVarL);
    }

    public final void f(f fVar, f fVar2, int i4, int i5) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f3649i = 0;
        bVarL.b(fVar, fVar2, fVarM, i4);
        if (i5 != 8) {
            bVarL.f3627d.g(j(i5), (int) (bVarL.f3627d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(f fVar, f fVar2, int i4, int i5) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f3649i = 0;
        bVarL.c(fVar, fVar2, fVarM, i4);
        if (i5 != 8) {
            bVarL.f3627d.g(j(i5), (int) (bVarL.f3627d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i4;
        if (bVar.f3628e) {
            bVar.f3624a.d(this, bVar.f3625b);
        } else {
            b[] bVarArr = this.f3635g;
            int i5 = this.f3639k;
            bVarArr[i5] = bVar;
            f fVar = bVar.f3624a;
            fVar.f3648h = i5;
            this.f3639k = i5 + 1;
            fVar.e(this, bVar);
        }
        if (this.f3631b) {
            int i6 = 0;
            while (i6 < this.f3639k) {
                if (this.f3635g[i6] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f3635g[i6];
                if (bVar2 != null && bVar2.f3628e) {
                    bVar2.f3624a.d(this, bVar2.f3625b);
                    ((o0.c) this.f3641m.f578b).b(bVar2);
                    this.f3635g[i6] = null;
                    int i7 = i6 + 1;
                    int i8 = i7;
                    while (true) {
                        i4 = this.f3639k;
                        if (i7 >= i4) {
                            break;
                        }
                        b[] bVarArr2 = this.f3635g;
                        int i9 = i7 - 1;
                        b bVar3 = bVarArr2[i7];
                        bVarArr2[i9] = bVar3;
                        f fVar2 = bVar3.f3624a;
                        if (fVar2.f3648h == i7) {
                            fVar2.f3648h = i9;
                        }
                        i8 = i7;
                        i7++;
                    }
                    if (i8 < i4) {
                        this.f3635g[i8] = null;
                    }
                    this.f3639k = i4 - 1;
                    i6--;
                }
                i6++;
            }
            this.f3631b = false;
        }
    }

    public final void i() {
        for (int i4 = 0; i4 < this.f3639k; i4++) {
            b bVar = this.f3635g[i4];
            bVar.f3624a.f3650j = bVar.f3625b;
        }
    }

    public final f j(int i4) {
        if (this.f3638j + 1 >= this.f) {
            o();
        }
        f fVarA = a(4);
        float[] fArr = fVarA.f3653m;
        int i5 = this.f3632c + 1;
        this.f3632c = i5;
        this.f3638j++;
        fVarA.f3647g = i5;
        fVarA.f3649i = i4;
        ((f[]) this.f3641m.f580d)[i5] = fVarA;
        d dVar = this.f3633d;
        dVar.f3646i.f568g = fVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[fVarA.f3649i] = 1.0f;
        dVar.j(fVarA);
        return fVarA;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f3638j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof u.c)) {
            return null;
        }
        u.c cVar = (u.c) obj;
        f fVar = cVar.f3764i;
        if (fVar == null) {
            cVar.k();
            fVar = cVar.f3764i;
        }
        int i4 = fVar.f3647g;
        t tVar = this.f3641m;
        if (i4 != -1 && i4 <= this.f3632c && ((f[]) tVar.f580d)[i4] != null) {
            return fVar;
        }
        if (i4 != -1) {
            fVar.c();
        }
        int i5 = this.f3632c + 1;
        this.f3632c = i5;
        this.f3638j++;
        fVar.f3647g = i5;
        fVar.f3656q = 1;
        ((f[]) tVar.f580d)[i5] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        t tVar = this.f3641m;
        o0.c cVar = (o0.c) tVar.f578b;
        int i4 = cVar.f3134b;
        if (i4 > 0) {
            int i5 = i4 - 1;
            Object[] objArr = cVar.f3133a;
            obj = objArr[i5];
            objArr[i5] = null;
            cVar.f3134b = i5;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(tVar);
        }
        bVar.f3624a = null;
        bVar.f3627d.b();
        bVar.f3625b = 0.0f;
        bVar.f3628e = false;
        return bVar;
    }

    public final f m() {
        if (this.f3638j + 1 >= this.f) {
            o();
        }
        f fVarA = a(3);
        int i4 = this.f3632c + 1;
        this.f3632c = i4;
        this.f3638j++;
        fVarA.f3647g = i4;
        ((f[]) this.f3641m.f580d)[i4] = fVarA;
        return fVarA;
    }

    public final void o() {
        int i4 = this.f3634e * 2;
        this.f3634e = i4;
        this.f3635g = (b[]) Arrays.copyOf(this.f3635g, i4);
        t tVar = this.f3641m;
        tVar.f580d = (f[]) Arrays.copyOf((f[]) tVar.f580d, this.f3634e);
        int i5 = this.f3634e;
        this.f3637i = new boolean[i5];
        this.f = i5;
        this.f3640l = i5;
    }

    public final void p() {
        d dVar = this.f3633d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f3636h) {
            q(dVar);
            return;
        }
        for (int i4 = 0; i4 < this.f3639k; i4++) {
            if (!this.f3635g[i4].f3628e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        for (int i4 = 0; i4 < this.f3639k; i4++) {
            b bVar = this.f3635g[i4];
            int i5 = 1;
            if (bVar.f3624a.f3656q != 1) {
                float f = 0.0f;
                if (bVar.f3625b < 0.0f) {
                    boolean z4 = false;
                    int i6 = 0;
                    while (!z4) {
                        i6 += i5;
                        float f4 = Float.MAX_VALUE;
                        int i7 = -1;
                        int i8 = -1;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < this.f3639k) {
                            b bVar2 = this.f3635g[i9];
                            if (bVar2.f3624a.f3656q != i5 && !bVar2.f3628e && bVar2.f3625b < f) {
                                int iD = bVar2.f3627d.d();
                                int i11 = 0;
                                while (i11 < iD) {
                                    f fVarE = bVar2.f3627d.e(i11);
                                    float fC = bVar2.f3627d.c(fVarE);
                                    if (fC > f) {
                                        for (int i12 = 0; i12 < 9; i12++) {
                                            float f5 = fVarE.f3652l[i12] / fC;
                                            if ((f5 < f4 && i12 == i10) || i12 > i10) {
                                                i10 = i12;
                                                i8 = fVarE.f3647g;
                                                i7 = i9;
                                                f4 = f5;
                                            }
                                        }
                                    }
                                    i11++;
                                    f = 0.0f;
                                }
                            }
                            i9++;
                            f = 0.0f;
                            i5 = 1;
                        }
                        if (i7 != -1) {
                            b bVar3 = this.f3635g[i7];
                            bVar3.f3624a.f3648h = -1;
                            bVar3.g(((f[]) this.f3641m.f580d)[i8]);
                            f fVar = bVar3.f3624a;
                            fVar.f3648h = i7;
                            fVar.e(this, bVar3);
                        } else {
                            z4 = true;
                        }
                        if (i6 > this.f3638j / 2) {
                            z4 = true;
                        }
                        f = 0.0f;
                        i5 = 1;
                    }
                    break;
                }
            }
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z4;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f3638j; i5++) {
            this.f3637i[i5] = false;
        }
        boolean z5 = false;
        int i6 = 0;
        while (!z5) {
            int i7 = 1;
            i6++;
            if (i6 >= this.f3638j * 2) {
                return;
            }
            f fVar = bVar.f3624a;
            if (fVar != null) {
                this.f3637i[fVar.f3647g] = true;
            }
            f fVarD = bVar.d(this.f3637i);
            if (fVarD != null) {
                boolean[] zArr = this.f3637i;
                int i8 = fVarD.f3647g;
                if (zArr[i8]) {
                    return;
                } else {
                    zArr[i8] = true;
                }
            }
            if (fVarD != null) {
                float f = Float.MAX_VALUE;
                int i9 = i4;
                int i10 = -1;
                while (i9 < this.f3639k) {
                    b bVar2 = this.f3635g[i9];
                    if (bVar2.f3624a.f3656q != i7 && !bVar2.f3628e) {
                        a aVar = bVar2.f3627d;
                        int i11 = aVar.f3621h;
                        if (i11 == -1) {
                            z4 = false;
                            break;
                        }
                        int i12 = 0;
                        while (true) {
                            if (i11 == -1 || i12 >= aVar.f3615a) {
                                z4 = false;
                                break;
                            } else if (aVar.f3619e[i11] == fVarD.f3647g) {
                                z4 = true;
                                break;
                            } else {
                                i11 = aVar.f[i11];
                                i12++;
                            }
                        }
                        if (z4) {
                            float fC = bVar2.f3627d.c(fVarD);
                            if (fC < 0.0f) {
                                float f4 = (-bVar2.f3625b) / fC;
                                if (f4 < f) {
                                    f = f4;
                                    i10 = i9;
                                }
                            }
                        }
                    }
                    i9++;
                    i7 = 1;
                }
                if (i10 > -1) {
                    b bVar3 = this.f3635g[i10];
                    bVar3.f3624a.f3648h = -1;
                    bVar3.g(fVarD);
                    f fVar2 = bVar3.f3624a;
                    fVar2.f3648h = i10;
                    fVar2.e(this, bVar3);
                }
            } else {
                z5 = true;
            }
            i4 = 0;
        }
    }

    public final void s() {
        for (int i4 = 0; i4 < this.f3639k; i4++) {
            b bVar = this.f3635g[i4];
            if (bVar != null) {
                ((o0.c) this.f3641m.f578b).b(bVar);
            }
            this.f3635g[i4] = null;
        }
    }

    public final void t() {
        t tVar;
        int i4 = 0;
        while (true) {
            tVar = this.f3641m;
            f[] fVarArr = (f[]) tVar.f580d;
            if (i4 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i4];
            if (fVar != null) {
                fVar.c();
            }
            i4++;
        }
        o0.c cVar = (o0.c) tVar.f579c;
        f[] fVarArr2 = this.n;
        int length = this.f3642o;
        cVar.getClass();
        if (length > fVarArr2.length) {
            length = fVarArr2.length;
        }
        for (int i5 = 0; i5 < length; i5++) {
            f fVar2 = fVarArr2[i5];
            int i6 = cVar.f3134b;
            Object[] objArr = cVar.f3133a;
            if (i6 < objArr.length) {
                objArr[i6] = fVar2;
                cVar.f3134b = i6 + 1;
            }
        }
        this.f3642o = 0;
        Arrays.fill((f[]) tVar.f580d, (Object) null);
        this.f3632c = 0;
        d dVar = this.f3633d;
        dVar.f3645h = 0;
        dVar.f3625b = 0.0f;
        this.f3638j = 1;
        for (int i7 = 0; i7 < this.f3639k; i7++) {
            b bVar = this.f3635g[i7];
        }
        s();
        this.f3639k = 0;
        this.f3643p = new b(tVar);
    }
}
