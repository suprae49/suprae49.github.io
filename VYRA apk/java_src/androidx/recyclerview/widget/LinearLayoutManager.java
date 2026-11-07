package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.g;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import c2.h;
import java.util.ArrayList;
import java.util.List;
import k1.k0;
import k1.l0;
import k1.m0;
import k1.r;
import k1.s;
import k1.t;
import k1.t0;
import k1.u0;
import k1.x0;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends l0 implements t0 {
    public final r A;
    public final s B;
    public final int C;
    public final int[] D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t f896q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f897r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f898s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f899t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f900u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f903x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f904y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SavedState f905z;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f906g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f907h;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f);
            parcel.writeInt(this.f906g);
            parcel.writeInt(this.f907h ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f895p = 1;
        this.f899t = false;
        this.f900u = false;
        this.f901v = false;
        this.f902w = true;
        this.f903x = -1;
        this.f904y = Integer.MIN_VALUE;
        this.f905z = null;
        this.A = new r();
        this.B = new s();
        this.C = 2;
        this.D = new int[2];
        k0 k0VarI = l0.I(context, attributeSet, i4, i5);
        a1(k0VarI.f2809a);
        boolean z4 = k0VarI.f2811c;
        c(null);
        if (z4 != this.f899t) {
            this.f899t = z4;
            m0();
        }
        b1(k0VarI.f2812d);
    }

    @Override // k1.l0
    public boolean A0() {
        return this.f905z == null && this.f898s == this.f901v;
    }

    public void B0(u0 u0Var, int[] iArr) {
        int i4;
        int iL = u0Var.f2920a != -1 ? this.f897r.l() : 0;
        if (this.f896q.f == -1) {
            i4 = 0;
        } else {
            i4 = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i4;
    }

    public void C0(u0 u0Var, t tVar, h hVar) {
        int i4 = tVar.f2898d;
        if (i4 < 0 || i4 >= u0Var.b()) {
            return;
        }
        hVar.a(i4, Math.max(0, tVar.f2900g));
    }

    public final int D0(u0 u0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        g gVar = this.f897r;
        boolean z4 = !this.f902w;
        return h0.m(u0Var, gVar, K0(z4), J0(z4), this, this.f902w);
    }

    public final int E0(u0 u0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        g gVar = this.f897r;
        boolean z4 = !this.f902w;
        return h0.n(u0Var, gVar, K0(z4), J0(z4), this, this.f902w, this.f900u);
    }

    public final int F0(u0 u0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        g gVar = this.f897r;
        boolean z4 = !this.f902w;
        return h0.o(u0Var, gVar, K0(z4), J0(z4), this, this.f902w);
    }

    public final int G0(int i4) {
        if (i4 == 1) {
            return (this.f895p != 1 && T0()) ? 1 : -1;
        }
        if (i4 == 2) {
            return (this.f895p != 1 && T0()) ? -1 : 1;
        }
        if (i4 == 17) {
            return this.f895p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i4 == 33) {
            return this.f895p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i4 != 66) {
            return (i4 == 130 && this.f895p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f895p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void H0() {
        if (this.f896q == null) {
            t tVar = new t();
            tVar.f2895a = true;
            tVar.f2901h = 0;
            tVar.f2902i = 0;
            tVar.f2904k = null;
            this.f896q = tVar;
        }
    }

    public final int I0(v1.b bVar, t tVar, u0 u0Var, boolean z4) {
        int i4;
        int i5 = tVar.f2897c;
        int i6 = tVar.f2900g;
        if (i6 != Integer.MIN_VALUE) {
            if (i5 < 0) {
                tVar.f2900g = i6 + i5;
            }
            W0(bVar, tVar);
        }
        int i7 = tVar.f2897c + tVar.f2901h;
        while (true) {
            if ((!tVar.f2905l && i7 <= 0) || (i4 = tVar.f2898d) < 0 || i4 >= u0Var.b()) {
                break;
            }
            s sVar = this.B;
            sVar.f2885a = 0;
            sVar.f2886b = false;
            sVar.f2887c = false;
            sVar.f2888d = false;
            U0(bVar, u0Var, tVar, sVar);
            if (!sVar.f2886b) {
                int i8 = tVar.f2896b;
                int i9 = sVar.f2885a;
                tVar.f2896b = (tVar.f * i9) + i8;
                if (!sVar.f2887c || tVar.f2904k != null || !u0Var.f2925g) {
                    tVar.f2897c -= i9;
                    i7 -= i9;
                }
                int i10 = tVar.f2900g;
                if (i10 != Integer.MIN_VALUE) {
                    int i11 = i10 + i9;
                    tVar.f2900g = i11;
                    int i12 = tVar.f2897c;
                    if (i12 < 0) {
                        tVar.f2900g = i11 + i12;
                    }
                    W0(bVar, tVar);
                }
                if (z4 && sVar.f2888d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i5 - tVar.f2897c;
    }

    public final View J0(boolean z4) {
        return this.f900u ? N0(0, z4, v()) : N0(v() - 1, z4, -1);
    }

    public final View K0(boolean z4) {
        return this.f900u ? N0(v() - 1, z4, -1) : N0(0, z4, v());
    }

    @Override // k1.l0
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View viewN0 = N0(v() - 1, false, -1);
        if (viewN0 == null) {
            return -1;
        }
        return l0.H(viewN0);
    }

    public final View M0(int i4, int i5) {
        int i6;
        int i7;
        H0();
        if (i5 <= i4 && i5 >= i4) {
            return u(i4);
        }
        if (this.f897r.e(u(i4)) < this.f897r.k()) {
            i6 = 16644;
            i7 = 16388;
        } else {
            i6 = 4161;
            i7 = 4097;
        }
        return this.f895p == 0 ? this.f2839c.k(i4, i5, i6, i7) : this.f2840d.k(i4, i5, i6, i7);
    }

    public final View N0(int i4, boolean z4, int i5) {
        H0();
        int i6 = z4 ? 24579 : 320;
        return this.f895p == 0 ? this.f2839c.k(i4, i5, i6, 320) : this.f2840d.k(i4, i5, i6, 320);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View O0(v1.b bVar, u0 u0Var, boolean z4, boolean z5) {
        int i4;
        int iV;
        int i5;
        H0();
        int iV2 = v();
        if (z5) {
            iV = v() - 1;
            i4 = -1;
            i5 = -1;
        } else {
            i4 = iV2;
            iV = 0;
            i5 = 1;
        }
        int iB = u0Var.b();
        int iK = this.f897r.k();
        int iG = this.f897r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iV != i4) {
            View viewU = u(iV);
            int iH = l0.H(viewU);
            int iE = this.f897r.e(viewU);
            int iB2 = this.f897r.b(viewU);
            if (iH >= 0 && iH < iB) {
                if (!((m0) viewU.getLayoutParams()).f2851a.h()) {
                    boolean z6 = iB2 <= iK && iE < iK;
                    boolean z7 = iE >= iG && iB2 > iG;
                    if (!z6 && !z7) {
                        return viewU;
                    }
                    if (z4) {
                        if (z7) {
                            view2 = viewU;
                        } else if (view == null) {
                            view = viewU;
                        }
                    } else if (z6) {
                        view2 = viewU;
                    } else if (view == null) {
                        view = viewU;
                    }
                } else if (view3 == null) {
                    view3 = viewU;
                }
            }
            iV += i5;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public final int P0(int i4, v1.b bVar, u0 u0Var, boolean z4) {
        int iG;
        int iG2 = this.f897r.g() - i4;
        if (iG2 <= 0) {
            return 0;
        }
        int i5 = -Z0(-iG2, u0Var, bVar);
        int i6 = i4 + i5;
        if (!z4 || (iG = this.f897r.g() - i6) <= 0) {
            return i5;
        }
        this.f897r.o(iG);
        return iG + i5;
    }

    public final int Q0(int i4, v1.b bVar, u0 u0Var, boolean z4) {
        int iK;
        int iK2 = i4 - this.f897r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i5 = -Z0(iK2, u0Var, bVar);
        int i6 = i4 + i5;
        if (!z4 || (iK = i6 - this.f897r.k()) <= 0) {
            return i5;
        }
        this.f897r.o(-iK);
        return i5 - iK;
    }

    public final View R0() {
        return u(this.f900u ? 0 : v() - 1);
    }

    public final View S0() {
        return u(this.f900u ? v() - 1 : 0);
    }

    @Override // k1.l0
    public View T(View view, int i4, v1.b bVar, u0 u0Var) {
        int iG0;
        View viewM0;
        Y0();
        if (v() != 0 && (iG0 = G0(i4)) != Integer.MIN_VALUE) {
            H0();
            c1(iG0, (int) (this.f897r.l() * 0.33333334f), false, u0Var);
            t tVar = this.f896q;
            tVar.f2900g = Integer.MIN_VALUE;
            tVar.f2895a = false;
            I0(bVar, tVar, u0Var, true);
            boolean z4 = this.f900u;
            if (iG0 == -1) {
                viewM0 = z4 ? M0(v() - 1, -1) : M0(0, v());
            } else {
                viewM0 = z4 ? M0(0, v()) : M0(v() - 1, -1);
            }
            View viewS0 = iG0 == -1 ? S0() : R0();
            if (!viewS0.hasFocusable()) {
                return viewM0;
            }
            if (viewM0 != null) {
                return viewS0;
            }
        }
        return null;
    }

    public final boolean T0() {
        return C() == 1;
    }

    @Override // k1.l0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewN0 = N0(0, false, v());
            accessibilityEvent.setFromIndex(viewN0 == null ? -1 : l0.H(viewN0));
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(v1.b bVar, u0 u0Var, t tVar, s sVar) {
        int iD;
        int i4;
        int i5;
        int iD2;
        int iE;
        View viewB = tVar.b(bVar);
        if (viewB == null) {
            sVar.f2886b = true;
            return;
        }
        m0 m0Var = (m0) viewB.getLayoutParams();
        List list = tVar.f2904k;
        boolean z4 = this.f900u;
        int i6 = tVar.f;
        if (list == null) {
            if (z4 == (i6 == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (z4 == (i6 == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        m0 m0Var2 = (m0) viewB.getLayoutParams();
        Rect rectJ = this.f2838b.J(viewB);
        int i7 = rectJ.left + rectJ.right;
        int i8 = rectJ.top + rectJ.bottom;
        int iW = l0.w(d(), this.n, this.f2847l, F() + E() + ((ViewGroup.MarginLayoutParams) m0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) m0Var2).rightMargin + i7, ((ViewGroup.MarginLayoutParams) m0Var2).width);
        int iW2 = l0.w(e(), this.f2849o, this.f2848m, D() + G() + ((ViewGroup.MarginLayoutParams) m0Var2).topMargin + ((ViewGroup.MarginLayoutParams) m0Var2).bottomMargin + i8, ((ViewGroup.MarginLayoutParams) m0Var2).height);
        if (v0(viewB, iW, iW2, m0Var2)) {
            viewB.measure(iW, iW2);
        }
        sVar.f2885a = this.f897r.c(viewB);
        if (this.f895p == 1) {
            if (T0()) {
                iD2 = this.n - F();
                iE = iD2 - this.f897r.d(viewB);
            } else {
                iE = E();
                iD2 = this.f897r.d(viewB) + iE;
            }
            int i9 = tVar.f;
            i5 = tVar.f2896b;
            int i10 = sVar.f2885a;
            if (i9 == -1) {
                int i11 = iE;
                iD = i5;
                i5 -= i10;
                i4 = i11;
            } else {
                i4 = iE;
                iD = i10 + i5;
            }
        } else {
            int iG = G();
            iD = this.f897r.d(viewB) + iG;
            int i12 = tVar.f;
            int i13 = tVar.f2896b;
            int i14 = sVar.f2885a;
            if (i12 == -1) {
                i4 = i13 - i14;
                iD2 = i13;
                i5 = iG;
            } else {
                int i15 = i13 + i14;
                i4 = i13;
                i5 = iG;
                iD2 = i15;
            }
        }
        l0.N(viewB, i4, i5, iD2, iD);
        if (m0Var.f2851a.h() || m0Var.f2851a.k()) {
            sVar.f2887c = true;
        }
        sVar.f2888d = viewB.hasFocusable();
    }

    public final void W0(v1.b bVar, t tVar) {
        if (!tVar.f2895a || tVar.f2905l) {
            return;
        }
        int i4 = tVar.f2900g;
        int i5 = tVar.f2902i;
        if (tVar.f == -1) {
            int iV = v();
            if (i4 < 0) {
                return;
            }
            int iF = (this.f897r.f() - i4) + i5;
            if (this.f900u) {
                for (int i6 = 0; i6 < iV; i6++) {
                    View viewU = u(i6);
                    if (this.f897r.e(viewU) < iF || this.f897r.n(viewU) < iF) {
                        X0(bVar, 0, i6);
                        return;
                    }
                }
                return;
            }
            int i7 = iV - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View viewU2 = u(i8);
                if (this.f897r.e(viewU2) < iF || this.f897r.n(viewU2) < iF) {
                    X0(bVar, i7, i8);
                    return;
                }
            }
            return;
        }
        if (i4 < 0) {
            return;
        }
        int i9 = i4 - i5;
        int iV2 = v();
        if (!this.f900u) {
            for (int i10 = 0; i10 < iV2; i10++) {
                View viewU3 = u(i10);
                if (this.f897r.b(viewU3) > i9 || this.f897r.m(viewU3) > i9) {
                    X0(bVar, 0, i10);
                    return;
                }
            }
            return;
        }
        int i11 = iV2 - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            View viewU4 = u(i12);
            if (this.f897r.b(viewU4) > i9 || this.f897r.m(viewU4) > i9) {
                X0(bVar, i11, i12);
                return;
            }
        }
    }

    public final void X0(v1.b bVar, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        if (i5 <= i4) {
            while (i4 > i5) {
                View viewU = u(i4);
                k0(i4);
                bVar.i(viewU);
                i4--;
            }
            return;
        }
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            View viewU2 = u(i6);
            k0(i6);
            bVar.i(viewU2);
        }
    }

    public final void Y0() {
        if (this.f895p == 1 || !T0()) {
            this.f900u = this.f899t;
        } else {
            this.f900u = !this.f899t;
        }
    }

    public final int Z0(int i4, u0 u0Var, v1.b bVar) {
        if (v() != 0 && i4 != 0) {
            H0();
            this.f896q.f2895a = true;
            int i5 = i4 > 0 ? 1 : -1;
            int iAbs = Math.abs(i4);
            c1(i5, iAbs, true, u0Var);
            t tVar = this.f896q;
            int iI0 = I0(bVar, tVar, u0Var, false) + tVar.f2900g;
            if (iI0 >= 0) {
                if (iAbs > iI0) {
                    i4 = i5 * iI0;
                }
                this.f897r.o(-i4);
                this.f896q.f2903j = i4;
                return i4;
            }
        }
        return 0;
    }

    @Override // k1.t0
    public final PointF a(int i4) {
        if (v() == 0) {
            return null;
        }
        int i5 = (i4 < l0.H(u(0))) != this.f900u ? -1 : 1;
        return this.f895p == 0 ? new PointF(i5, 0.0f) : new PointF(0.0f, i5);
    }

    public final void a1(int i4) {
        if (i4 != 0 && i4 != 1) {
            q.q(u.k(i4, "invalid orientation:"));
            return;
        }
        c(null);
        if (i4 != this.f895p || this.f897r == null) {
            g gVarA = g.a(this, i4);
            this.f897r = gVarA;
            this.A.f2880a = gVarA;
            this.f895p = i4;
            m0();
        }
    }

    public void b1(boolean z4) {
        c(null);
        if (this.f901v == z4) {
            return;
        }
        this.f901v = z4;
        m0();
    }

    @Override // k1.l0
    public final void c(String str) {
        if (this.f905z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:123:0x0202  */
    /* JADX WARN: Code duplicated, block: B:126:0x020e  */
    /* JADX WARN: Code duplicated, block: B:130:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0232  */
    /* JADX WARN: Code duplicated, block: B:134:0x0235 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0239  */
    /* JADX WARN: Code duplicated, block: B:138:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x023e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0242  */
    /* JADX WARN: Code duplicated, block: B:143:0x0246  */
    /* JADX WARN: Code duplicated, block: B:145:0x024d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0253  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // k1.l0
    public void c0(v1.b bVar, u0 u0Var) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z4;
        boolean z5;
        View viewO0;
        boolean z6;
        g gVar;
        int iE;
        int iB2;
        int iK;
        int iG;
        boolean z7;
        boolean z8;
        g gVar2;
        int iL;
        m0 m0Var;
        int i4;
        int iE2;
        int i5;
        int i6;
        ?? r4;
        List list;
        int i7;
        int i8;
        int iP0;
        int i9;
        View viewQ;
        int iE3;
        int iG2;
        int i10;
        int i11 = -1;
        if (!(this.f905z == null && this.f903x == -1) && u0Var.b() == 0) {
            h0(bVar);
            return;
        }
        SavedState savedState = this.f905z;
        if (savedState != null && (i10 = savedState.f) >= 0) {
            this.f903x = i10;
        }
        H0();
        boolean z9 = false;
        this.f896q.f2895a = false;
        Y0();
        RecyclerView recyclerView2 = this.f2838b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f2837a.f580d).contains(focusedChild)) {
            focusedChild = null;
        }
        r rVar = this.A;
        if (!rVar.f2884e || this.f903x != -1 || this.f905z != null) {
            rVar.c();
            rVar.f2883d = this.f900u ^ this.f901v;
            if (u0Var.f2925g || (i4 = this.f903x) == -1) {
                if (v() != 0) {
                    recyclerView = this.f2838b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f2837a.f580d).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        m0Var = (m0) focusedChild2.getLayoutParams();
                        if (!m0Var.f2851a.h() || m0Var.f2851a.b() < 0 || m0Var.f2851a.b() >= u0Var.b()) {
                            z4 = this.f898s;
                            z5 = this.f901v;
                            if (z4 == z5 || (viewO0 = O0(bVar, u0Var, rVar.f2883d, z5)) == null) {
                                rVar.a();
                                if (this.f901v) {
                                    iB = u0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                rVar.f2881b = iB;
                            } else {
                                int iH = l0.H(viewO0);
                                z6 = rVar.f2883d;
                                gVar = rVar.f2880a;
                                if (z6) {
                                    int iB3 = gVar.b(viewO0);
                                    gVar2 = rVar.f2880a;
                                    if (Integer.MIN_VALUE == gVar2.f548a) {
                                        iL = 0;
                                    } else {
                                        iL = gVar2.l() - gVar2.f548a;
                                    }
                                    rVar.f2882c = iL + iB3;
                                } else {
                                    rVar.f2882c = gVar.e(viewO0);
                                }
                                rVar.f2881b = iH;
                                if (!u0Var.f2925g && A0()) {
                                    iE = this.f897r.e(viewO0);
                                    iB2 = this.f897r.b(viewO0);
                                    iK = this.f897r.k();
                                    iG = this.f897r.g();
                                    if (iB2 <= iK || iE >= iK) {
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                    if (iE >= iG || iB2 <= iG) {
                                        z8 = false;
                                    } else {
                                        z8 = true;
                                    }
                                    if (z7 || z8) {
                                        if (rVar.f2883d) {
                                            iK = iG;
                                        }
                                        rVar.f2882c = iK;
                                    }
                                }
                            }
                        } else {
                            rVar.b(focusedChild2, l0.H(focusedChild2));
                        }
                    } else {
                        z4 = this.f898s;
                        z5 = this.f901v;
                        if (z4 == z5) {
                            rVar.a();
                            if (this.f901v) {
                                iB = u0Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            rVar.f2881b = iB;
                        } else {
                            int iH2 = l0.H(viewO0);
                            z6 = rVar.f2883d;
                            gVar = rVar.f2880a;
                            if (z6) {
                                int iB4 = gVar.b(viewO0);
                                gVar2 = rVar.f2880a;
                                if (Integer.MIN_VALUE == gVar2.f548a) {
                                    iL = 0;
                                } else {
                                    iL = gVar2.l() - gVar2.f548a;
                                }
                                rVar.f2882c = iL + iB4;
                            } else {
                                rVar.f2882c = gVar.e(viewO0);
                            }
                            rVar.f2881b = iH2;
                            if (!u0Var.f2925g) {
                                iE = this.f897r.e(viewO0);
                                iB2 = this.f897r.b(viewO0);
                                iK = this.f897r.k();
                                iG = this.f897r.g();
                                if (iB2 <= iK) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                if (iE >= iG) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (z7) {
                                    if (rVar.f2883d) {
                                        iK = iG;
                                    }
                                    rVar.f2882c = iK;
                                } else {
                                    if (rVar.f2883d) {
                                        iK = iG;
                                    }
                                    rVar.f2882c = iK;
                                }
                            }
                        }
                    }
                } else {
                    rVar.a();
                    if (this.f901v) {
                        iB = u0Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    rVar.f2881b = iB;
                }
            } else if (i4 < 0 || i4 >= u0Var.b()) {
                this.f903x = -1;
                this.f904y = Integer.MIN_VALUE;
                if (v() != 0) {
                    recyclerView = this.f2838b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        m0Var = (m0) focusedChild2.getLayoutParams();
                        if (m0Var.f2851a.h()) {
                            z4 = this.f898s;
                            z5 = this.f901v;
                            if (z4 == z5) {
                                rVar.a();
                                if (this.f901v) {
                                    iB = u0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                rVar.f2881b = iB;
                            } else {
                                int iH3 = l0.H(viewO0);
                                z6 = rVar.f2883d;
                                gVar = rVar.f2880a;
                                if (z6) {
                                    int iB5 = gVar.b(viewO0);
                                    gVar2 = rVar.f2880a;
                                    if (Integer.MIN_VALUE == gVar2.f548a) {
                                        iL = 0;
                                    } else {
                                        iL = gVar2.l() - gVar2.f548a;
                                    }
                                    rVar.f2882c = iL + iB5;
                                } else {
                                    rVar.f2882c = gVar.e(viewO0);
                                }
                                rVar.f2881b = iH3;
                                if (!u0Var.f2925g) {
                                    iE = this.f897r.e(viewO0);
                                    iB2 = this.f897r.b(viewO0);
                                    iK = this.f897r.k();
                                    iG = this.f897r.g();
                                    if (iB2 <= iK) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                    }
                                    if (iE >= iG) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z7) {
                                        if (rVar.f2883d) {
                                            iK = iG;
                                        }
                                        rVar.f2882c = iK;
                                    } else {
                                        if (rVar.f2883d) {
                                            iK = iG;
                                        }
                                        rVar.f2882c = iK;
                                    }
                                }
                            }
                        } else {
                            z4 = this.f898s;
                            z5 = this.f901v;
                            if (z4 == z5) {
                                rVar.a();
                                if (this.f901v) {
                                    iB = u0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                rVar.f2881b = iB;
                            } else {
                                int iH4 = l0.H(viewO0);
                                z6 = rVar.f2883d;
                                gVar = rVar.f2880a;
                                if (z6) {
                                    int iB6 = gVar.b(viewO0);
                                    gVar2 = rVar.f2880a;
                                    if (Integer.MIN_VALUE == gVar2.f548a) {
                                        iL = 0;
                                    } else {
                                        iL = gVar2.l() - gVar2.f548a;
                                    }
                                    rVar.f2882c = iL + iB6;
                                } else {
                                    rVar.f2882c = gVar.e(viewO0);
                                }
                                rVar.f2881b = iH4;
                                if (!u0Var.f2925g) {
                                    iE = this.f897r.e(viewO0);
                                    iB2 = this.f897r.b(viewO0);
                                    iK = this.f897r.k();
                                    iG = this.f897r.g();
                                    if (iB2 <= iK) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                    }
                                    if (iE >= iG) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z7) {
                                        if (rVar.f2883d) {
                                            iK = iG;
                                        }
                                        rVar.f2882c = iK;
                                    } else {
                                        if (rVar.f2883d) {
                                            iK = iG;
                                        }
                                        rVar.f2882c = iK;
                                    }
                                }
                            }
                        }
                    } else {
                        z4 = this.f898s;
                        z5 = this.f901v;
                        if (z4 == z5) {
                            rVar.a();
                            if (this.f901v) {
                                iB = u0Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            rVar.f2881b = iB;
                        } else {
                            int iH5 = l0.H(viewO0);
                            z6 = rVar.f2883d;
                            gVar = rVar.f2880a;
                            if (z6) {
                                int iB7 = gVar.b(viewO0);
                                gVar2 = rVar.f2880a;
                                if (Integer.MIN_VALUE == gVar2.f548a) {
                                    iL = 0;
                                } else {
                                    iL = gVar2.l() - gVar2.f548a;
                                }
                                rVar.f2882c = iL + iB7;
                            } else {
                                rVar.f2882c = gVar.e(viewO0);
                            }
                            rVar.f2881b = iH5;
                            if (!u0Var.f2925g) {
                                iE = this.f897r.e(viewO0);
                                iB2 = this.f897r.b(viewO0);
                                iK = this.f897r.k();
                                iG = this.f897r.g();
                                if (iB2 <= iK) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                if (iE >= iG) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (z7) {
                                    if (rVar.f2883d) {
                                        iK = iG;
                                    }
                                    rVar.f2882c = iK;
                                } else {
                                    if (rVar.f2883d) {
                                        iK = iG;
                                    }
                                    rVar.f2882c = iK;
                                }
                            }
                        }
                    }
                } else {
                    rVar.a();
                    if (this.f901v) {
                        iB = u0Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    rVar.f2881b = iB;
                }
            } else {
                int i12 = this.f903x;
                rVar.f2881b = i12;
                SavedState savedState2 = this.f905z;
                if (savedState2 != null && savedState2.f >= 0) {
                    boolean z10 = savedState2.f907h;
                    rVar.f2883d = z10;
                    g gVar3 = this.f897r;
                    if (z10) {
                        rVar.f2882c = gVar3.g() - this.f905z.f906g;
                    } else {
                        rVar.f2882c = gVar3.k() + this.f905z.f906g;
                    }
                } else if (this.f904y == Integer.MIN_VALUE) {
                    View viewQ2 = q(i12);
                    if (viewQ2 == null) {
                        if (v() > 0) {
                            rVar.f2883d = (this.f903x < l0.H(u(0))) == this.f900u;
                        }
                        rVar.a();
                    } else if (this.f897r.c(viewQ2) > this.f897r.l()) {
                        rVar.a();
                    } else {
                        int iE4 = this.f897r.e(viewQ2) - this.f897r.k();
                        g gVar4 = this.f897r;
                        if (iE4 < 0) {
                            rVar.f2882c = gVar4.k();
                            rVar.f2883d = false;
                        } else if (gVar4.g() - this.f897r.b(viewQ2) < 0) {
                            rVar.f2882c = this.f897r.g();
                            rVar.f2883d = true;
                        } else {
                            boolean z11 = rVar.f2883d;
                            g gVar5 = this.f897r;
                            if (z11) {
                                int iB8 = gVar5.b(viewQ2);
                                g gVar6 = this.f897r;
                                iE2 = (Integer.MIN_VALUE == gVar6.f548a ? 0 : gVar6.l() - gVar6.f548a) + iB8;
                            } else {
                                iE2 = gVar5.e(viewQ2);
                            }
                            rVar.f2882c = iE2;
                        }
                    }
                } else {
                    boolean z12 = this.f900u;
                    rVar.f2883d = z12;
                    g gVar7 = this.f897r;
                    if (z12) {
                        rVar.f2882c = gVar7.g() - this.f904y;
                    } else {
                        rVar.f2882c = gVar7.k() + this.f904y;
                    }
                }
            }
            rVar.f2884e = true;
        } else if (focusedChild != null && (this.f897r.e(focusedChild) >= this.f897r.g() || this.f897r.b(focusedChild) <= this.f897r.k())) {
            rVar.b(focusedChild, l0.H(focusedChild));
        }
        t tVar = this.f896q;
        tVar.f = tVar.f2903j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(u0Var, iArr);
        int iK2 = this.f897r.k() + Math.max(0, iArr[0]);
        int iH6 = this.f897r.h() + Math.max(0, iArr[1]);
        if (u0Var.f2925g && (i9 = this.f903x) != -1 && this.f904y != Integer.MIN_VALUE && (viewQ = q(i9)) != null) {
            boolean z13 = this.f900u;
            g gVar8 = this.f897r;
            if (z13) {
                iG2 = gVar8.g() - this.f897r.b(viewQ);
                iE3 = this.f904y;
            } else {
                iE3 = gVar8.e(viewQ) - this.f897r.k();
                iG2 = this.f904y;
            }
            int i13 = iG2 - iE3;
            if (i13 > 0) {
                iK2 += i13;
            } else {
                iH6 -= i13;
            }
        }
        boolean z14 = rVar.f2883d;
        boolean z15 = this.f900u;
        if (!z14 ? !z15 : z15) {
            i11 = 1;
        }
        V0(bVar, u0Var, rVar, i11);
        p(bVar);
        this.f896q.f2905l = this.f897r.i() == 0 && this.f897r.f() == 0;
        this.f896q.getClass();
        this.f896q.f2902i = 0;
        boolean z16 = rVar.f2883d;
        int i14 = rVar.f2881b;
        if (z16) {
            e1(i14, rVar.f2882c);
            t tVar2 = this.f896q;
            tVar2.f2901h = iK2;
            I0(bVar, tVar2, u0Var, false);
            t tVar3 = this.f896q;
            i6 = tVar3.f2896b;
            int i15 = tVar3.f2898d;
            int i16 = tVar3.f2897c;
            if (i16 > 0) {
                iH6 += i16;
            }
            d1(rVar.f2881b, rVar.f2882c);
            t tVar4 = this.f896q;
            tVar4.f2901h = iH6;
            tVar4.f2898d += tVar4.f2899e;
            I0(bVar, tVar4, u0Var, false);
            t tVar5 = this.f896q;
            i5 = tVar5.f2896b;
            int i17 = tVar5.f2897c;
            if (i17 > 0) {
                e1(i15, i6);
                t tVar6 = this.f896q;
                tVar6.f2901h = i17;
                I0(bVar, tVar6, u0Var, false);
                i6 = this.f896q.f2896b;
            }
        } else {
            d1(i14, rVar.f2882c);
            t tVar7 = this.f896q;
            tVar7.f2901h = iH6;
            I0(bVar, tVar7, u0Var, false);
            t tVar8 = this.f896q;
            i5 = tVar8.f2896b;
            int i18 = tVar8.f2898d;
            int i19 = tVar8.f2897c;
            if (i19 > 0) {
                iK2 += i19;
            }
            e1(rVar.f2881b, rVar.f2882c);
            t tVar9 = this.f896q;
            tVar9.f2901h = iK2;
            tVar9.f2898d += tVar9.f2899e;
            I0(bVar, tVar9, u0Var, false);
            t tVar10 = this.f896q;
            int i20 = tVar10.f2896b;
            int i21 = tVar10.f2897c;
            if (i21 > 0) {
                d1(i18, i5);
                t tVar11 = this.f896q;
                tVar11.f2901h = i21;
                I0(bVar, tVar11, u0Var, false);
                i5 = this.f896q.f2896b;
            }
            i6 = i20;
        }
        if (v() > 0) {
            if (this.f900u ^ this.f901v) {
                int iP1 = P0(i5, bVar, u0Var, true);
                i7 = i6 + iP1;
                i8 = i5 + iP1;
                iP0 = Q0(i7, bVar, u0Var, false);
            } else {
                int iQ0 = Q0(i6, bVar, u0Var, true);
                i7 = i6 + iQ0;
                i8 = i5 + iQ0;
                iP0 = P0(i8, bVar, u0Var, false);
            }
            i6 = i7 + iP0;
            i5 = i8 + iP0;
        }
        if (u0Var.f2929k && v() != 0 && !u0Var.f2925g && A0()) {
            List list2 = (List) bVar.f;
            int size = list2.size();
            int iH7 = l0.H(u(0));
            int i22 = 0;
            int iC = 0;
            int iC2 = 0;
            while (i22 < size) {
                x0 x0Var = (x0) list2.get(i22);
                boolean zH = x0Var.h();
                View view = x0Var.f2945a;
                if (!zH) {
                    boolean z17 = x0Var.b() < iH7 ? true : z9;
                    boolean z18 = this.f900u;
                    g gVar9 = this.f897r;
                    if (z17 != z18) {
                        iC += gVar9.c(view);
                    } else {
                        iC2 += gVar9.c(view);
                    }
                }
                i22++;
                z9 = false;
            }
            this.f896q.f2904k = list2;
            if (iC > 0) {
                e1(l0.H(S0()), i6);
                t tVar12 = this.f896q;
                tVar12.f2901h = iC;
                r4 = 0;
                tVar12.f2897c = 0;
                tVar12.a(null);
                I0(bVar, this.f896q, u0Var, false);
            } else {
                r4 = 0;
            }
            if (iC2 > 0) {
                d1(l0.H(R0()), i5);
                t tVar13 = this.f896q;
                tVar13.f2901h = iC2;
                tVar13.f2897c = r4;
                list = null;
                tVar13.a(null);
                I0(bVar, this.f896q, u0Var, r4);
            } else {
                list = null;
            }
            this.f896q.f2904k = list;
        }
        if (u0Var.f2925g) {
            rVar.c();
        } else {
            g gVar10 = this.f897r;
            gVar10.f548a = gVar10.l();
        }
        this.f898s = this.f901v;
    }

    public final void c1(int i4, int i5, boolean z4, u0 u0Var) {
        int iK;
        this.f896q.f2905l = this.f897r.i() == 0 && this.f897r.f() == 0;
        this.f896q.f = i4;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(u0Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z5 = i4 == 1;
        t tVar = this.f896q;
        int i6 = z5 ? iMax2 : iMax;
        tVar.f2901h = i6;
        if (!z5) {
            iMax = iMax2;
        }
        tVar.f2902i = iMax;
        if (z5) {
            tVar.f2901h = this.f897r.h() + i6;
            View viewR0 = R0();
            t tVar2 = this.f896q;
            tVar2.f2899e = this.f900u ? -1 : 1;
            int iH = l0.H(viewR0);
            t tVar3 = this.f896q;
            tVar2.f2898d = iH + tVar3.f2899e;
            tVar3.f2896b = this.f897r.b(viewR0);
            iK = this.f897r.b(viewR0) - this.f897r.g();
        } else {
            View viewS0 = S0();
            t tVar4 = this.f896q;
            tVar4.f2901h = this.f897r.k() + tVar4.f2901h;
            t tVar5 = this.f896q;
            tVar5.f2899e = this.f900u ? 1 : -1;
            int iH2 = l0.H(viewS0);
            t tVar6 = this.f896q;
            tVar5.f2898d = iH2 + tVar6.f2899e;
            tVar6.f2896b = this.f897r.e(viewS0);
            iK = (-this.f897r.e(viewS0)) + this.f897r.k();
        }
        t tVar7 = this.f896q;
        tVar7.f2897c = i5;
        if (z4) {
            tVar7.f2897c = i5 - iK;
        }
        tVar7.f2900g = iK;
    }

    @Override // k1.l0
    public final boolean d() {
        return this.f895p == 0;
    }

    @Override // k1.l0
    public void d0(u0 u0Var) {
        this.f905z = null;
        this.f903x = -1;
        this.f904y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void d1(int i4, int i5) {
        this.f896q.f2897c = this.f897r.g() - i5;
        t tVar = this.f896q;
        tVar.f2899e = this.f900u ? -1 : 1;
        tVar.f2898d = i4;
        tVar.f = 1;
        tVar.f2896b = i5;
        tVar.f2900g = Integer.MIN_VALUE;
    }

    @Override // k1.l0
    public final boolean e() {
        return this.f895p == 1;
    }

    @Override // k1.l0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f905z = savedState;
            if (this.f903x != -1) {
                savedState.f = -1;
            }
            m0();
        }
    }

    public final void e1(int i4, int i5) {
        this.f896q.f2897c = i5 - this.f897r.k();
        t tVar = this.f896q;
        tVar.f2898d = i4;
        tVar.f2899e = this.f900u ? 1 : -1;
        tVar.f = -1;
        tVar.f2896b = i5;
        tVar.f2900g = Integer.MIN_VALUE;
    }

    @Override // k1.l0
    public final Parcelable f0() {
        SavedState savedState = this.f905z;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f = savedState.f;
            savedState2.f906g = savedState.f906g;
            savedState2.f907h = savedState.f907h;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (v() <= 0) {
            savedState3.f = -1;
            return savedState3;
        }
        H0();
        boolean z4 = this.f898s ^ this.f900u;
        savedState3.f907h = z4;
        if (z4) {
            View viewR0 = R0();
            savedState3.f906g = this.f897r.g() - this.f897r.b(viewR0);
            savedState3.f = l0.H(viewR0);
            return savedState3;
        }
        View viewS0 = S0();
        savedState3.f = l0.H(viewS0);
        savedState3.f906g = this.f897r.e(viewS0) - this.f897r.k();
        return savedState3;
    }

    @Override // k1.l0
    public final void h(int i4, int i5, u0 u0Var, h hVar) {
        if (this.f895p != 0) {
            i4 = i5;
        }
        if (v() == 0 || i4 == 0) {
            return;
        }
        H0();
        c1(i4 > 0 ? 1 : -1, Math.abs(i4), true, u0Var);
        C0(u0Var, this.f896q, hVar);
    }

    @Override // k1.l0
    public final void i(int i4, h hVar) {
        boolean z4;
        int i5;
        SavedState savedState = this.f905z;
        if (savedState == null || (i5 = savedState.f) < 0) {
            Y0();
            z4 = this.f900u;
            i5 = this.f903x;
            if (i5 == -1) {
                i5 = z4 ? i4 - 1 : 0;
            }
        } else {
            z4 = savedState.f907h;
        }
        int i6 = z4 ? -1 : 1;
        for (int i7 = 0; i7 < this.C && i5 >= 0 && i5 < i4; i7++) {
            hVar.a(i5, 0);
            i5 += i6;
        }
    }

    @Override // k1.l0
    public final int j(u0 u0Var) {
        return D0(u0Var);
    }

    @Override // k1.l0
    public int k(u0 u0Var) {
        return E0(u0Var);
    }

    @Override // k1.l0
    public int l(u0 u0Var) {
        return F0(u0Var);
    }

    @Override // k1.l0
    public final int m(u0 u0Var) {
        return D0(u0Var);
    }

    @Override // k1.l0
    public int n(u0 u0Var) {
        return E0(u0Var);
    }

    @Override // k1.l0
    public int n0(int i4, u0 u0Var, v1.b bVar) {
        if (this.f895p == 1) {
            return 0;
        }
        return Z0(i4, u0Var, bVar);
    }

    @Override // k1.l0
    public int o(u0 u0Var) {
        return F0(u0Var);
    }

    @Override // k1.l0
    public final void o0(int i4) {
        this.f903x = i4;
        this.f904y = Integer.MIN_VALUE;
        SavedState savedState = this.f905z;
        if (savedState != null) {
            savedState.f = -1;
        }
        m0();
    }

    @Override // k1.l0
    public int p0(int i4, u0 u0Var, v1.b bVar) {
        if (this.f895p == 0) {
            return 0;
        }
        return Z0(i4, u0Var, bVar);
    }

    @Override // k1.l0
    public final View q(int i4) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iH = i4 - l0.H(u(0));
        if (iH >= 0 && iH < iV) {
            View viewU = u(iH);
            if (l0.H(viewU) == i4) {
                return viewU;
            }
        }
        return super.q(i4);
    }

    @Override // k1.l0
    public m0 r() {
        return new m0(-2, -2);
    }

    @Override // k1.l0
    public final boolean w0() {
        if (this.f2848m != 1073741824 && this.f2847l != 1073741824) {
            int iV = v();
            for (int i4 = 0; i4 < iV; i4++) {
                ViewGroup.LayoutParams layoutParams = u(i4).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // k1.l0
    public void y0(RecyclerView recyclerView, int i4) {
        k1.u uVar = new k1.u(recyclerView.getContext());
        uVar.f2906a = i4;
        z0(uVar);
    }

    @Override // k1.l0
    public final void S(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i4) {
        this.f895p = 1;
        this.f899t = false;
        this.f900u = false;
        this.f901v = false;
        this.f902w = true;
        this.f903x = -1;
        this.f904y = Integer.MIN_VALUE;
        this.f905z = null;
        this.A = new r();
        this.B = new s();
        this.C = 2;
        this.D = new int[2];
        a1(i4);
        c(null);
        if (this.f899t) {
            this.f899t = false;
            m0();
        }
    }

    public void V0(v1.b bVar, u0 u0Var, r rVar, int i4) {
    }
}
