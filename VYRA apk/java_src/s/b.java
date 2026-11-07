package s;

import androidx.emoji2.text.t;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f3627d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f3624a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3625b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3626c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3628e = false;

    public b(t tVar) {
        this.f3627d = new a(this, tVar);
    }

    public final void a(c cVar, int i4) {
        this.f3627d.g(cVar.j(i4), 1.0f);
        this.f3627d.g(cVar.j(i4), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i4) {
        boolean z4 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            }
            this.f3625b = i4;
        }
        a aVar = this.f3627d;
        if (z4) {
            aVar.g(fVar, 1.0f);
            this.f3627d.g(fVar2, -1.0f);
            this.f3627d.g(fVar3, -1.0f);
        } else {
            aVar.g(fVar, -1.0f);
            this.f3627d.g(fVar2, 1.0f);
            this.f3627d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i4) {
        boolean z4 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            }
            this.f3625b = i4;
        }
        a aVar = this.f3627d;
        if (z4) {
            aVar.g(fVar, 1.0f);
            this.f3627d.g(fVar2, -1.0f);
            this.f3627d.g(fVar3, 1.0f);
        } else {
            aVar.g(fVar, -1.0f);
            this.f3627d.g(fVar2, 1.0f);
            this.f3627d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3624a == null && this.f3625b == 0.0f && this.f3627d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i4;
        int iD = this.f3627d.d();
        f fVar2 = null;
        float f = 0.0f;
        for (int i5 = 0; i5 < iD; i5++) {
            float f4 = this.f3627d.f(i5);
            if (f4 < 0.0f) {
                f fVarE = this.f3627d.e(i5);
                if ((zArr == null || !zArr[fVarE.f3647g]) && fVarE != fVar && (((i4 = fVarE.f3656q) == 3 || i4 == 4) && f4 < f)) {
                    f = f4;
                    fVar2 = fVarE;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f3624a;
        if (fVar2 != null) {
            this.f3627d.g(fVar2, -1.0f);
            this.f3624a.f3648h = -1;
            this.f3624a = null;
        }
        float fH = this.f3627d.h(fVar, true) * (-1.0f);
        this.f3624a = fVar;
        if (fH == 1.0f) {
            return;
        }
        this.f3625b /= fH;
        a aVar = this.f3627d;
        int i4 = aVar.f3621h;
        for (int i5 = 0; i4 != -1 && i5 < aVar.f3615a; i5++) {
            float[] fArr = aVar.f3620g;
            fArr[i4] = fArr[i4] / fH;
            i4 = aVar.f[i4];
        }
    }

    public final void h(c cVar, f fVar, boolean z4) {
        if (fVar.f3651k) {
            float fC = this.f3627d.c(fVar);
            this.f3625b = (fVar.f3650j * fC) + this.f3625b;
            this.f3627d.h(fVar, z4);
            if (z4) {
                fVar.b(this);
            }
            if (this.f3627d.d() == 0) {
                this.f3628e = true;
                cVar.f3631b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z4) {
        a aVar = this.f3627d;
        aVar.getClass();
        float fC = aVar.c(bVar.f3624a);
        aVar.h(bVar.f3624a, z4);
        a aVar2 = bVar.f3627d;
        int iD = aVar2.d();
        for (int i4 = 0; i4 < iD; i4++) {
            f fVarE = aVar2.e(i4);
            aVar.a(fVarE, aVar2.c(fVarE) * fC, z4);
        }
        this.f3625b = (bVar.f3625b * fC) + this.f3625b;
        if (z4) {
            bVar.f3624a.b(this);
        }
        if (this.f3624a == null || this.f3627d.d() != 0) {
            return;
        }
        this.f3628e = true;
        cVar.f3631b = true;
    }

    public String toString() {
        boolean z4;
        String strConcat = (this.f3624a == null ? "0" : "" + this.f3624a).concat(" = ");
        if (this.f3625b != 0.0f) {
            strConcat = strConcat + this.f3625b;
            z4 = true;
        } else {
            z4 = false;
        }
        int iD = this.f3627d.d();
        for (int i4 = 0; i4 < iD; i4++) {
            f fVarE = this.f3627d.e(i4);
            if (fVarE != null) {
                float f = this.f3627d.f(i4);
                if (f != 0.0f) {
                    String string = fVarE.toString();
                    if (z4) {
                        if (f > 0.0f) {
                            strConcat = strConcat + " + ";
                        } else {
                            strConcat = strConcat + " - ";
                            f *= -1.0f;
                        }
                    } else if (f < 0.0f) {
                        strConcat = strConcat + "- ";
                        f *= -1.0f;
                    }
                    strConcat = f == 1.0f ? strConcat + string : strConcat + f + " " + string;
                    z4 = true;
                }
            }
        }
        if (z4) {
            return strConcat;
        }
        return strConcat + "0.0";
    }
}
