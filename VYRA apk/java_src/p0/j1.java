package p0;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f3202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f0.c[] f3203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect[][] f3204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect[][] f3205d;

    public j1(y1 y1Var) {
        this.f3204c = new Rect[10][];
        this.f3205d = new Rect[10][];
        this.f3202a = y1Var;
        c(y1Var);
    }

    public final void a() {
        f0.c[] cVarArr = this.f3203b;
        if (cVarArr != null) {
            f0.c cVarH = cVarArr[0];
            f0.c cVarH2 = cVarArr[1];
            y1 y1Var = this.f3202a;
            if (cVarH2 == null) {
                cVarH2 = y1Var.f3268a.h(2);
            }
            if (cVarH == null) {
                cVarH = y1Var.f3268a.h(1);
            }
            h(f0.c.a(cVarH, cVarH2));
            f0.c cVar = this.f3203b[u1.h0.F(16)];
            if (cVar != null) {
                g(cVar);
            }
            f0.c cVar2 = this.f3203b[u1.h0.F(32)];
            if (cVar2 != null) {
                e(cVar2);
            }
            f0.c cVar3 = this.f3203b[u1.h0.F(64)];
            if (cVar3 != null) {
                i(cVar3);
            }
        }
    }

    public abstract y1 b();

    public void c(y1 y1Var) {
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            List<Rect> listE = y1Var.f3268a.e(i4);
            int iF = u1.h0.F(i4);
            this.f3204c[iF] = (Rect[]) listE.toArray(new Rect[listE.size()]);
            if (i4 != 8) {
                List<Rect> listF = y1Var.f3268a.f(i4);
                this.f3205d[iF] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            }
        }
    }

    public void d(int i4, f0.c cVar) {
        if (this.f3203b == null) {
            this.f3203b = new f0.c[10];
        }
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                this.f3203b[u1.h0.F(i5)] = cVar;
            }
        }
    }

    public abstract void f(f0.c cVar);

    public abstract void h(f0.c cVar);

    public j1() {
        this(new y1());
    }

    public void e(f0.c cVar) {
    }

    public void g(f0.c cVar) {
    }

    public void i(f0.c cVar) {
    }
}
