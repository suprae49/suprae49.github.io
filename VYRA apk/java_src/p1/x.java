package p1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class x extends r {
    public int J;
    public ArrayList H = new ArrayList();
    public boolean I = true;
    public boolean K = false;
    public int L = 0;

    @Override // p1.r
    public final void A(View view) {
        for (int i4 = 0; i4 < this.H.size(); i4++) {
            ((r) this.H.get(i4)).A(view);
        }
        this.f3332k.remove(view);
    }

    @Override // p1.r
    public final void B(View view) {
        super.B(view);
        int size = this.H.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((r) this.H.get(i4)).B(view);
        }
    }

    @Override // p1.r
    public final void C() {
        ArrayList arrayList;
        if (this.H.isEmpty()) {
            J();
            n();
            return;
        }
        w wVar = new w();
        wVar.f3354b = this;
        ArrayList arrayList2 = this.H;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ((r) obj).a(wVar);
        }
        this.J = this.H.size();
        if (this.I) {
            ArrayList arrayList3 = this.H;
            int size2 = arrayList3.size();
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                ((r) obj2).C();
            }
            return;
        }
        int i6 = 1;
        while (true) {
            int size3 = this.H.size();
            arrayList = this.H;
            if (i6 >= size3) {
                break;
            }
            ((r) arrayList.get(i6 - 1)).a(new w((r) this.H.get(i6)));
            i6++;
        }
        r rVar = (r) arrayList.get(0);
        if (rVar != null) {
            rVar.C();
        }
    }

    @Override // p1.r
    public final void E(u1.h0 h0Var) {
        this.B = h0Var;
        this.L |= 8;
        int size = this.H.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((r) this.H.get(i4)).E(h0Var);
        }
    }

    @Override // p1.r
    public final void G(a3.f fVar) {
        super.G(fVar);
        this.L |= 4;
        if (this.H != null) {
            for (int i4 = 0; i4 < this.H.size(); i4++) {
                ((r) this.H.get(i4)).G(fVar);
            }
        }
    }

    @Override // p1.r
    public final void H() {
        this.L |= 2;
        int size = this.H.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((r) this.H.get(i4)).H();
        }
    }

    @Override // p1.r
    public final void I(long j4) {
        this.f3328g = j4;
    }

    @Override // p1.r
    public final String K(String str) {
        String strK = super.K(str);
        for (int i4 = 0; i4 < this.H.size(); i4++) {
            strK = strK + "\n" + ((r) this.H.get(i4)).K(str.concat("  "));
        }
        return strK;
    }

    public final void L(r rVar) {
        this.H.add(rVar);
        rVar.f3335o = this;
        long j4 = this.f3329h;
        if (j4 >= 0) {
            rVar.D(j4);
        }
        if ((this.L & 1) != 0) {
            rVar.F(this.f3330i);
        }
        if ((this.L & 2) != 0) {
            rVar.H();
        }
        if ((this.L & 4) != 0) {
            rVar.G(this.C);
        }
        if ((this.L & 8) != 0) {
            rVar.E(this.B);
        }
    }

    @Override // p1.r
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void D(long j4) {
        ArrayList arrayList;
        this.f3329h = j4;
        if (j4 < 0 || (arrayList = this.H) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((r) this.H.get(i4)).D(j4);
        }
    }

    @Override // p1.r
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void F(TimeInterpolator timeInterpolator) {
        this.L |= 1;
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((r) this.H.get(i4)).F(timeInterpolator);
            }
        }
        this.f3330i = timeInterpolator;
    }

    public final void O(int i4) {
        if (i4 == 0) {
            this.I = true;
        } else {
            if (i4 != 1) {
                throw new AndroidRuntimeException(androidx.fragment.app.u.k(i4, "Invalid parameter for TransitionSet ordering: "));
            }
            this.I = false;
        }
    }

    @Override // p1.r
    public final void b(View view) {
        for (int i4 = 0; i4 < this.H.size(); i4++) {
            ((r) this.H.get(i4)).b(view);
        }
        this.f3332k.add(view);
    }

    @Override // p1.r
    public final void d() {
        super.d();
        int size = this.H.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((r) this.H.get(i4)).d();
        }
    }

    @Override // p1.r
    public final void e(a0 a0Var) {
        View view = a0Var.f3277b;
        if (v(view)) {
            ArrayList arrayList = this.H;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                r rVar = (r) obj;
                if (rVar.v(view)) {
                    rVar.e(a0Var);
                    a0Var.f3278c.add(rVar);
                }
            }
        }
    }

    @Override // p1.r
    public final void g(a0 a0Var) {
        int size = this.H.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((r) this.H.get(i4)).g(a0Var);
        }
    }

    @Override // p1.r
    public final void h(a0 a0Var) {
        View view = a0Var.f3277b;
        if (v(view)) {
            ArrayList arrayList = this.H;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                r rVar = (r) obj;
                if (rVar.v(view)) {
                    rVar.h(a0Var);
                    a0Var.f3278c.add(rVar);
                }
            }
        }
    }

    @Override // p1.r
    /* JADX INFO: renamed from: k */
    public final r clone() {
        x xVar = (x) super.clone();
        xVar.H = new ArrayList();
        int size = this.H.size();
        for (int i4 = 0; i4 < size; i4++) {
            r rVarClone = ((r) this.H.get(i4)).clone();
            xVar.H.add(rVarClone);
            rVarClone.f3335o = xVar;
        }
        return xVar;
    }

    @Override // p1.r
    public final void m(ViewGroup viewGroup, androidx.emoji2.text.x xVar, androidx.emoji2.text.x xVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j4 = this.f3328g;
        int size = this.H.size();
        for (int i4 = 0; i4 < size; i4++) {
            r rVar = (r) this.H.get(i4);
            if (j4 > 0 && (this.I || i4 == 0)) {
                long j5 = rVar.f3328g;
                if (j5 > 0) {
                    rVar.I(j5 + j4);
                } else {
                    rVar.I(j4);
                }
            }
            rVar.m(viewGroup, xVar, xVar2, arrayList, arrayList2);
        }
    }

    @Override // p1.r
    public final void o() {
        for (int i4 = 0; i4 < this.H.size(); i4++) {
            ((r) this.H.get(i4)).o();
        }
        super.o();
    }

    @Override // p1.r
    public final void y(View view) {
        super.y(view);
        int size = this.H.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((r) this.H.get(i4)).y(view);
        }
    }

    @Override // p1.r
    public final r z(p pVar) {
        super.z(pVar);
        return this;
    }
}
