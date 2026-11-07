package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.p;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import c2.h;
import java.util.Arrays;
import java.util.WeakHashMap;
import k1.l0;
import k1.m0;
import k1.r;
import k1.s;
import k1.t;
import k1.u0;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final p K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new p(6);
        this.L = new Rect();
        m1(l0.I(context, attributeSet, i4, i5).f2810b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.l0
    public final boolean A0() {
        return this.f905z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(u0 u0Var, t tVar, h hVar) {
        int i4;
        int i5 = this.F;
        for (int i6 = 0; i6 < this.F && (i4 = tVar.f2898d) >= 0 && i4 < u0Var.b() && i5 > 0; i6++) {
            hVar.a(tVar.f2898d, Math.max(0, tVar.f2900g));
            this.K.getClass();
            i5--;
            tVar.f2898d += tVar.f2899e;
        }
    }

    @Override // k1.l0
    public final int J(v1.b bVar, u0 u0Var) {
        if (this.f895p == 0) {
            return this.F;
        }
        if (u0Var.b() < 1) {
            return 0;
        }
        return i1(u0Var.b() - 1, u0Var, bVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O0(v1.b bVar, u0 u0Var, boolean z4, boolean z5) {
        int i4;
        int iV;
        int iV2 = v();
        int i5 = 1;
        if (z5) {
            iV = v() - 1;
            i4 = -1;
            i5 = -1;
        } else {
            i4 = iV2;
            iV = 0;
        }
        int iB = u0Var.b();
        H0();
        int iK = this.f897r.k();
        int iG = this.f897r.g();
        View view = null;
        View view2 = null;
        while (iV != i4) {
            View viewU = u(iV);
            int iH = l0.H(viewU);
            if (iH >= 0 && iH < iB && j1(iH, u0Var, bVar) == 0) {
                if (((m0) viewU.getLayoutParams()).f2851a.h()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f897r.e(viewU) < iG && this.f897r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i5;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r23, int r24, v1.b r25, k1.u0 r26) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, v1.b, k1.u0):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(v1.b bVar, u0 u0Var, t tVar, s sVar) {
        int i4;
        int i5;
        int i6;
        int iD;
        int iE;
        int iW;
        int iW2;
        ?? r12;
        int i7;
        View viewB;
        int iJ = this.f897r.j();
        boolean z4 = iJ != 1073741824;
        int i8 = v() > 0 ? this.G[this.F] : 0;
        if (z4) {
            n1();
        }
        boolean z5 = tVar.f2899e == 1;
        int iJ1 = this.F;
        if (!z5) {
            iJ1 = j1(tVar.f2898d, u0Var, bVar) + k1(tVar.f2898d, u0Var, bVar);
        }
        int i9 = 0;
        while (i9 < this.F && (i7 = tVar.f2898d) >= 0 && i7 < u0Var.b() && iJ1 > 0) {
            int i10 = tVar.f2898d;
            int iK1 = k1(i10, u0Var, bVar);
            if (iK1 > this.F) {
                throw new IllegalArgumentException("Item at position " + i10 + " requires " + iK1 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            iJ1 -= iK1;
            if (iJ1 < 0 || (viewB = tVar.b(bVar)) == null) {
                break;
            }
            this.H[i9] = viewB;
            i9++;
        }
        if (i9 == 0) {
            sVar.f2886b = true;
            return;
        }
        if (z5) {
            i6 = 1;
            i5 = i9;
            i4 = 0;
        } else {
            i4 = i9 - 1;
            i5 = -1;
            i6 = -1;
        }
        int i11 = 0;
        while (i4 != i5) {
            View view = this.H[i4];
            k1.p pVar = (k1.p) view.getLayoutParams();
            int iK2 = k1(l0.H(view), u0Var, bVar);
            pVar.f = iK2;
            pVar.f2865e = i11;
            i11 += iK2;
            i4 += i6;
        }
        float f = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            View view2 = this.H[i13];
            if (tVar.f2904k != null) {
                r12 = 0;
                r12 = 0;
                if (z5) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z5) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f2838b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.J(view2));
            }
            l1(view2, iJ, r12);
            int iC = this.f897r.c(view2);
            if (iC > i12) {
                i12 = iC;
            }
            float fD = (this.f897r.d(view2) * 1.0f) / ((k1.p) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z4) {
            f1(Math.max(Math.round(f * this.F), i8));
            i12 = 0;
            for (int i14 = 0; i14 < i9; i14++) {
                View view3 = this.H[i14];
                l1(view3, 1073741824, true);
                int iC2 = this.f897r.c(view3);
                if (iC2 > i12) {
                    i12 = iC2;
                }
            }
        }
        for (int i15 = 0; i15 < i9; i15++) {
            View view4 = this.H[i15];
            if (this.f897r.c(view4) != i12) {
                k1.p pVar2 = (k1.p) view4.getLayoutParams();
                Rect rect2 = pVar2.f2852b;
                int i16 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar2).topMargin + ((ViewGroup.MarginLayoutParams) pVar2).bottomMargin;
                int i17 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) pVar2).leftMargin + ((ViewGroup.MarginLayoutParams) pVar2).rightMargin;
                int iH1 = h1(pVar2.f2865e, pVar2.f);
                if (this.f895p == 1) {
                    iW2 = l0.w(false, iH1, 1073741824, i17, ((ViewGroup.MarginLayoutParams) pVar2).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i12 - i16, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - i17, 1073741824);
                    iW = l0.w(false, iH1, 1073741824, i16, ((ViewGroup.MarginLayoutParams) pVar2).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (x0(view4, iW2, iW, (m0) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        int iG = 0;
        sVar.f2885a = i12;
        int i18 = this.f895p;
        int i19 = tVar.f;
        int iD2 = tVar.f2896b;
        if (i18 != 1) {
            if (i19 == -1) {
                iE = iD2 - i12;
                iD = iD2;
            } else {
                iD = iD2 + i12;
                iE = iD2;
            }
            iD2 = iG;
        } else if (i19 == -1) {
            iG = iD2 - i12;
            iE = 0;
            iD = 0;
        } else {
            iD = 0;
            iG = iD2;
            iD2 += i12;
            iE = 0;
        }
        int i20 = 0;
        while (true) {
            View[] viewArr = this.H;
            if (i20 >= i9) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i20];
            k1.p pVar3 = (k1.p) view5.getLayoutParams();
            if (this.f895p != 1) {
                iG = G() + this.G[pVar3.f2865e];
                iD2 = this.f897r.d(view5) + iG;
            } else if (T0()) {
                int iE2 = E() + this.G[this.F - pVar3.f2865e];
                iD = iE2;
                iE = iE2 - this.f897r.d(view5);
            } else {
                iE = E() + this.G[pVar3.f2865e];
                iD = this.f897r.d(view5) + iE;
            }
            l0.N(view5, iE, iG, iD, iD2);
            if (pVar3.f2851a.h() || pVar3.f2851a.k()) {
                sVar.f2887c = true;
            }
            sVar.f2888d = view5.hasFocusable() | sVar.f2888d;
            i20++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(v1.b bVar, u0 u0Var, r rVar, int i4) {
        n1();
        if (u0Var.b() > 0 && !u0Var.f2925g) {
            boolean z4 = i4 == 1;
            int iJ1 = j1(rVar.f2881b, u0Var, bVar);
            if (z4) {
                while (iJ1 > 0) {
                    int i5 = rVar.f2881b;
                    if (i5 <= 0) {
                        break;
                    }
                    int i6 = i5 - 1;
                    rVar.f2881b = i6;
                    iJ1 = j1(i6, u0Var, bVar);
                }
            } else {
                int iB = u0Var.b() - 1;
                int i7 = rVar.f2881b;
                while (i7 < iB) {
                    int i8 = i7 + 1;
                    int iJ2 = j1(i8, u0Var, bVar);
                    if (iJ2 <= iJ1) {
                        break;
                    }
                    i7 = i8;
                    iJ1 = iJ2;
                }
                rVar.f2881b = i7;
            }
        }
        g1();
    }

    @Override // k1.l0
    public final void W(v1.b bVar, u0 u0Var, View view, q0.e eVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof k1.p)) {
            V(view, eVar);
            return;
        }
        k1.p pVar = (k1.p) layoutParams;
        int iI1 = i1(pVar.f2851a.b(), u0Var, bVar);
        int i4 = this.f895p;
        int i5 = pVar.f2865e;
        int i6 = pVar.f;
        if (i4 == 0) {
            eVar.h(c3.f.a(i5, i6, iI1, 1, false, false));
        } else {
            eVar.h(c3.f.a(iI1, 1, i5, i6, false, false));
        }
    }

    @Override // k1.l0
    public final void X(int i4, int i5) {
        p pVar = this.K;
        pVar.p();
        ((SparseIntArray) pVar.f569h).clear();
    }

    @Override // k1.l0
    public final void Y() {
        p pVar = this.K;
        pVar.p();
        ((SparseIntArray) pVar.f569h).clear();
    }

    @Override // k1.l0
    public final void Z(int i4, int i5) {
        p pVar = this.K;
        pVar.p();
        ((SparseIntArray) pVar.f569h).clear();
    }

    @Override // k1.l0
    public final void a0(int i4, int i5) {
        p pVar = this.K;
        pVar.p();
        ((SparseIntArray) pVar.f569h).clear();
    }

    @Override // k1.l0
    public final void b0(int i4, int i5) {
        p pVar = this.K;
        pVar.p();
        ((SparseIntArray) pVar.f569h).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(boolean z4) {
        if (z4) {
            q.t("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.b1(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.l0
    public final void c0(v1.b bVar, u0 u0Var) {
        boolean z4 = u0Var.f2925g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z4) {
            int iV = v();
            for (int i4 = 0; i4 < iV; i4++) {
                k1.p pVar = (k1.p) u(i4).getLayoutParams();
                int iB = pVar.f2851a.b();
                sparseIntArray2.put(iB, pVar.f);
                sparseIntArray.put(iB, pVar.f2865e);
            }
        }
        super.c0(bVar, u0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.l0
    public final void d0(u0 u0Var) {
        super.d0(u0Var);
        this.E = false;
    }

    @Override // k1.l0
    public final boolean f(m0 m0Var) {
        return m0Var instanceof k1.p;
    }

    public final void f1(int i4) {
        int i5;
        int[] iArr = this.G;
        int i6 = this.F;
        if (iArr == null || iArr.length != i6 + 1 || iArr[iArr.length - 1] != i4) {
            iArr = new int[i6 + 1];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i4 / i6;
        int i9 = i4 % i6;
        int i10 = 0;
        for (int i11 = 1; i11 <= i6; i11++) {
            i7 += i9;
            if (i7 <= 0 || i6 - i7 >= i9) {
                i5 = i8;
            } else {
                i5 = i8 + 1;
                i7 -= i6;
            }
            i10 += i5;
            iArr[i11] = i10;
        }
        this.G = iArr;
    }

    public final void g1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int h1(int i4, int i5) {
        if (this.f895p != 1 || !T0()) {
            int[] iArr = this.G;
            return iArr[i5 + i4] - iArr[i4];
        }
        int[] iArr2 = this.G;
        int i6 = this.F;
        return iArr2[i6 - i4] - iArr2[(i6 - i4) - i5];
    }

    public final int i1(int i4, u0 u0Var, v1.b bVar) {
        boolean z4 = u0Var.f2925g;
        p pVar = this.K;
        if (!z4) {
            int i5 = this.F;
            pVar.getClass();
            return p.m(i4, i5);
        }
        int iB = bVar.b(i4);
        if (iB != -1) {
            int i6 = this.F;
            pVar.getClass();
            return p.m(iB, i6);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    public final int j1(int i4, u0 u0Var, v1.b bVar) {
        boolean z4 = u0Var.f2925g;
        p pVar = this.K;
        if (!z4) {
            int i5 = this.F;
            pVar.getClass();
            return i4 % i5;
        }
        int i6 = this.J.get(i4, -1);
        if (i6 != -1) {
            return i6;
        }
        int iB = bVar.b(i4);
        if (iB != -1) {
            int i7 = this.F;
            pVar.getClass();
            return iB % i7;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.l0
    public final int k(u0 u0Var) {
        return E0(u0Var);
    }

    public final int k1(int i4, u0 u0Var, v1.b bVar) {
        boolean z4 = u0Var.f2925g;
        p pVar = this.K;
        if (!z4) {
            pVar.getClass();
            return 1;
        }
        int i5 = this.I.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        if (bVar.b(i4) != -1) {
            pVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.l0
    public final int l(u0 u0Var) {
        return F0(u0Var);
    }

    public final void l1(View view, int i4, boolean z4) {
        int iW;
        int iW2;
        k1.p pVar = (k1.p) view.getLayoutParams();
        Rect rect = pVar.f2852b;
        int i5 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        int iH1 = h1(pVar.f2865e, pVar.f);
        if (this.f895p == 1) {
            iW2 = l0.w(false, iH1, i4, i6, ((ViewGroup.MarginLayoutParams) pVar).width);
            iW = l0.w(true, this.f897r.l(), this.f2848m, i5, ((ViewGroup.MarginLayoutParams) pVar).height);
        } else {
            int iW3 = l0.w(false, iH1, i4, i5, ((ViewGroup.MarginLayoutParams) pVar).height);
            int iW4 = l0.w(true, this.f897r.l(), this.f2847l, i6, ((ViewGroup.MarginLayoutParams) pVar).width);
            iW = iW3;
            iW2 = iW4;
        }
        m0 m0Var = (m0) view.getLayoutParams();
        if (z4 ? x0(view, iW2, iW, m0Var) : v0(view, iW2, iW, m0Var)) {
            view.measure(iW2, iW);
        }
    }

    public final void m1(int i4) {
        if (i4 == this.F) {
            return;
        }
        this.E = true;
        if (i4 < 1) {
            q.q(u.k(i4, "Span count should be at least 1. Provided "));
            return;
        }
        this.F = i4;
        this.K.p();
        m0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.l0
    public final int n(u0 u0Var) {
        return E0(u0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.l0
    public final int n0(int i4, u0 u0Var, v1.b bVar) {
        n1();
        g1();
        return super.n0(i4, u0Var, bVar);
    }

    public final void n1() {
        int iD;
        int iG;
        if (this.f895p == 1) {
            iD = this.n - F();
            iG = E();
        } else {
            iD = this.f2849o - D();
            iG = G();
        }
        f1(iD - iG);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.l0
    public final int o(u0 u0Var) {
        return F0(u0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.l0
    public final int p0(int i4, u0 u0Var, v1.b bVar) {
        n1();
        g1();
        return super.p0(i4, u0Var, bVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.l0
    public final m0 r() {
        return this.f895p == 0 ? new k1.p(-2, -1) : new k1.p(-1, -2);
    }

    @Override // k1.l0
    public final m0 s(Context context, AttributeSet attributeSet) {
        k1.p pVar = new k1.p(context, attributeSet);
        pVar.f2865e = -1;
        pVar.f = 0;
        return pVar;
    }

    @Override // k1.l0
    public final void s0(Rect rect, int i4, int i5) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.s0(rect, i4, i5);
        }
        int iF = F() + E();
        int iD = D() + G();
        if (this.f895p == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f2838b;
            WeakHashMap weakHashMap = p0.f3233a;
            iG2 = l0.g(i5, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iG = l0.g(i4, iArr[iArr.length - 1] + iF, this.f2838b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f2838b;
            WeakHashMap weakHashMap2 = p0.f3233a;
            iG = l0.g(i4, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = l0.g(i5, iArr2[iArr2.length - 1] + iD, this.f2838b.getMinimumHeight());
        }
        this.f2838b.setMeasuredDimension(iG, iG2);
    }

    @Override // k1.l0
    public final m0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            k1.p pVar = new k1.p((ViewGroup.MarginLayoutParams) layoutParams);
            pVar.f2865e = -1;
            pVar.f = 0;
            return pVar;
        }
        k1.p pVar2 = new k1.p(layoutParams);
        pVar2.f2865e = -1;
        pVar2.f = 0;
        return pVar2;
    }

    @Override // k1.l0
    public final int x(v1.b bVar, u0 u0Var) {
        if (this.f895p == 1) {
            return this.F;
        }
        if (u0Var.b() < 1) {
            return 0;
        }
        return i1(u0Var.b() - 1, u0Var, bVar) + 1;
    }

    public GridLayoutManager(int i4) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new p(6);
        this.L = new Rect();
        m1(i4);
    }
}
