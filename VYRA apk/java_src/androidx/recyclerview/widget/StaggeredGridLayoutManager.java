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
import c2.h;
import com.google.android.gms.common.api.Api;
import d3.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import k1.b1;
import k1.c1;
import k1.d1;
import k1.k0;
import k1.l0;
import k1.m0;
import k1.q;
import k1.t0;
import k1.u;
import k1.u0;
import p0.p0;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends l0 implements t0 {
    public final e B;
    public final int C;
    public boolean D;
    public boolean E;
    public SavedState F;
    public final Rect G;
    public final b1 H;
    public final boolean I;
    public int[] J;
    public final d0 K;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d1[] f951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f955u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q f956v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f957w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BitSet f959y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f958x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f960z = -1;
    public int A = Integer.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new f();
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f964g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f965h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f966i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f967j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int[] f968k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ArrayList f969l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f970m;
        public boolean n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f971o;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f);
            parcel.writeInt(this.f964g);
            parcel.writeInt(this.f965h);
            if (this.f965h > 0) {
                parcel.writeIntArray(this.f966i);
            }
            parcel.writeInt(this.f967j);
            if (this.f967j > 0) {
                parcel.writeIntArray(this.f968k);
            }
            parcel.writeInt(this.f970m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeInt(this.f971o ? 1 : 0);
            parcel.writeList(this.f969l);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f950p = -1;
        this.f957w = false;
        e eVar = new e();
        this.B = eVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new b1(this);
        this.I = true;
        this.K = new d0(8, this);
        k0 k0VarI = l0.I(context, attributeSet, i4, i5);
        int i6 = k0VarI.f2809a;
        if (i6 != 0 && i6 != 1) {
            androidx.fragment.app.q.q("invalid orientation.");
            throw null;
        }
        c(null);
        if (i6 != this.f954t) {
            this.f954t = i6;
            g gVar = this.f952r;
            this.f952r = this.f953s;
            this.f953s = gVar;
            m0();
        }
        int i7 = k0VarI.f2810b;
        c(null);
        if (i7 != this.f950p) {
            eVar.a();
            m0();
            this.f950p = i7;
            this.f959y = new BitSet(this.f950p);
            this.f951q = new d1[this.f950p];
            for (int i8 = 0; i8 < this.f950p; i8++) {
                this.f951q[i8] = new d1(this, i8);
            }
            m0();
        }
        boolean z4 = k0VarI.f2811c;
        c(null);
        SavedState savedState = this.F;
        if (savedState != null && savedState.f970m != z4) {
            savedState.f970m = z4;
        }
        this.f957w = z4;
        m0();
        q qVar = new q();
        qVar.f2870a = true;
        qVar.f = 0;
        qVar.f2875g = 0;
        this.f956v = qVar;
        this.f952r = g.a(this, this.f954t);
        this.f953s = g.a(this, 1 - this.f954t);
    }

    public static int b1(int i4, int i5, int i6) {
        int mode;
        return (!(i5 == 0 && i6 == 0) && ((mode = View.MeasureSpec.getMode(i4)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i5) - i6), mode) : i4;
    }

    @Override // k1.l0
    public final boolean A0() {
        return this.F == null;
    }

    public final boolean B0() {
        int iI0;
        if (v() != 0 && this.C != 0 && this.f2842g) {
            if (this.f958x) {
                iI0 = J0();
                I0();
            } else {
                iI0 = I0();
                J0();
            }
            if (iI0 == 0 && N0() != null) {
                this.B.a();
                this.f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(u0 u0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return h0.n(u0Var, this.f952r, F0(z4), E0(z4), this, this.I, this.f958x);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    public final int D0(v1.b bVar, q qVar, u0 u0Var) {
        d1 d1Var;
        ?? r8;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 1;
        this.f959y.set(0, this.f950p, true);
        q qVar2 = this.f956v;
        int i9 = qVar2.f2877i ? qVar.f2874e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : Integer.MIN_VALUE : qVar.f2874e == 1 ? qVar.f2875g + qVar.f2871b : qVar.f - qVar.f2871b;
        int i10 = qVar.f2874e;
        for (int i11 = 0; i11 < this.f950p; i11++) {
            if (!this.f951q[i11].f2751a.isEmpty()) {
                a1(this.f951q[i11], i10, i9);
            }
        }
        boolean z4 = this.f958x;
        g gVar = this.f952r;
        int iG = z4 ? gVar.g() : gVar.k();
        boolean z5 = false;
        while (true) {
            int i12 = qVar.f2872c;
            if (i12 < 0 || i12 >= u0Var.b() || (!qVar2.f2877i && this.f959y.isEmpty())) {
                break;
            }
            View viewF = bVar.f(qVar.f2872c);
            qVar.f2872c += qVar.f2873d;
            c1 c1Var = (c1) viewF.getLayoutParams();
            int iB = c1Var.f2851a.b();
            e eVar = this.B;
            int[] iArr = eVar.f973a;
            int i13 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i13 == -1) {
                boolean zR0 = R0(qVar.f2874e);
                int i14 = this.f950p;
                if (zR0) {
                    i6 = i14 - 1;
                    i5 = -1;
                    i4 = -1;
                } else {
                    i4 = i8;
                    i5 = i14;
                    i6 = i7;
                }
                int i15 = qVar.f2874e;
                d1 d1Var2 = null;
                g gVar2 = this.f952r;
                if (i15 == i8) {
                    int iK2 = gVar2.k();
                    int i16 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    while (i6 != i5) {
                        d1 d1Var3 = this.f951q[i6];
                        int iF = d1Var3.f(iK2);
                        if (iF < i16) {
                            i16 = iF;
                            d1Var2 = d1Var3;
                        }
                        i6 += i4;
                    }
                } else {
                    int iG2 = gVar2.g();
                    int i17 = Integer.MIN_VALUE;
                    while (i6 != i5) {
                        d1 d1Var4 = this.f951q[i6];
                        int iH2 = d1Var4.h(iG2);
                        if (iH2 > i17) {
                            d1Var2 = d1Var4;
                            i17 = iH2;
                        }
                        i6 += i4;
                    }
                }
                d1Var = d1Var2;
                eVar.b(iB);
                eVar.f973a[iB] = d1Var.f2755e;
            } else {
                d1Var = this.f951q[i13];
            }
            c1Var.f2745e = d1Var;
            if (qVar.f2874e == 1) {
                r8 = 0;
                b(viewF, -1, false);
            } else {
                r8 = 0;
                b(viewF, 0, false);
            }
            if (this.f954t == 1) {
                P0(viewF, l0.w(r8, this.f955u, this.f2847l, r8, ((ViewGroup.MarginLayoutParams) c1Var).width), l0.w(true, this.f2849o, this.f2848m, D() + G(), ((ViewGroup.MarginLayoutParams) c1Var).height));
            } else {
                P0(viewF, l0.w(true, this.n, this.f2847l, F() + E(), ((ViewGroup.MarginLayoutParams) c1Var).width), l0.w(false, this.f955u, this.f2848m, 0, ((ViewGroup.MarginLayoutParams) c1Var).height));
            }
            if (qVar.f2874e == 1) {
                iC = d1Var.f(iG);
                iH = this.f952r.c(viewF) + iC;
            } else {
                iH = d1Var.h(iG);
                iC = iH - this.f952r.c(viewF);
            }
            int i18 = qVar.f2874e;
            d1 d1Var5 = c1Var.f2745e;
            if (i18 == 1) {
                d1Var5.getClass();
                c1 c1Var2 = (c1) viewF.getLayoutParams();
                c1Var2.f2745e = d1Var5;
                ArrayList arrayList = d1Var5.f2751a;
                arrayList.add(viewF);
                d1Var5.f2753c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    d1Var5.f2752b = Integer.MIN_VALUE;
                }
                if (c1Var2.f2851a.h() || c1Var2.f2851a.k()) {
                    d1Var5.f2754d = d1Var5.f.f952r.c(viewF) + d1Var5.f2754d;
                }
            } else {
                d1Var5.getClass();
                c1 c1Var3 = (c1) viewF.getLayoutParams();
                c1Var3.f2745e = d1Var5;
                ArrayList arrayList2 = d1Var5.f2751a;
                arrayList2.add(0, viewF);
                d1Var5.f2752b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    d1Var5.f2753c = Integer.MIN_VALUE;
                }
                if (c1Var3.f2851a.h() || c1Var3.f2851a.k()) {
                    d1Var5.f2754d = d1Var5.f.f952r.c(viewF) + d1Var5.f2754d;
                }
            }
            if (O0() && this.f954t == 1) {
                iC2 = this.f953s.g() - (((this.f950p - 1) - d1Var.f2755e) * this.f955u);
                iK = iC2 - this.f953s.c(viewF);
            } else {
                iK = this.f953s.k() + (d1Var.f2755e * this.f955u);
                iC2 = this.f953s.c(viewF) + iK;
            }
            if (this.f954t == 1) {
                l0.N(viewF, iK, iC, iC2, iH);
            } else {
                l0.N(viewF, iC, iK, iH, iC2);
            }
            a1(d1Var, qVar2.f2874e, i9);
            T0(bVar, qVar2);
            if (qVar2.f2876h && viewF.hasFocusable()) {
                this.f959y.set(d1Var.f2755e, false);
            }
            i8 = 1;
            z5 = true;
            i7 = 0;
        }
        if (!z5) {
            T0(bVar, qVar2);
        }
        int i19 = qVar2.f2874e;
        g gVar3 = this.f952r;
        int iK3 = i19 == -1 ? this.f952r.k() - L0(gVar3.k()) : K0(gVar3.g()) - this.f952r.g();
        if (iK3 > 0) {
            return Math.min(qVar.f2871b, iK3);
        }
        return 0;
    }

    public final View E0(boolean z4) {
        int iK = this.f952r.k();
        int iG = this.f952r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.f952r.e(viewU);
            int iB = this.f952r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z4) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z4) {
        int iK = this.f952r.k();
        int iG = this.f952r.g();
        int iV = v();
        View view = null;
        for (int i4 = 0; i4 < iV; i4++) {
            View viewU = u(i4);
            int iE = this.f952r.e(viewU);
            if (this.f952r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z4) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void G0(v1.b bVar, u0 u0Var, boolean z4) {
        int iG;
        int iK0 = K0(Integer.MIN_VALUE);
        if (iK0 != Integer.MIN_VALUE && (iG = this.f952r.g() - iK0) > 0) {
            int i4 = iG - (-X0(-iG, u0Var, bVar));
            if (!z4 || i4 <= 0) {
                return;
            }
            this.f952r.o(i4);
        }
    }

    public final void H0(v1.b bVar, u0 u0Var, boolean z4) {
        int iK;
        int iL0 = L0(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iL0 != Integer.MAX_VALUE && (iK = iL0 - this.f952r.k()) > 0) {
            int iX0 = iK - X0(iK, u0Var, bVar);
            if (!z4 || iX0 <= 0) {
                return;
            }
            this.f952r.o(-iX0);
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return l0.H(u(0));
    }

    public final int J0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return l0.H(u(iV - 1));
    }

    public final int K0(int i4) {
        int iF = this.f951q[0].f(i4);
        for (int i5 = 1; i5 < this.f950p; i5++) {
            int iF2 = this.f951q[i5].f(i4);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // k1.l0
    public final boolean L() {
        return this.C != 0;
    }

    public final int L0(int i4) {
        int iH = this.f951q[0].h(i4);
        for (int i5 = 1; i5 < this.f950p; i5++) {
            int iH2 = this.f951q[i5].h(i4);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0035  */
    /* JADX WARN: Code duplicated, block: B:26:0x003d  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a A[LOOP:0: B:25:0x003b->B:29:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:31:0x004e BREAK  A[LOOP:0: B:25:0x003b->B:29:0x004a]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b A[LOOP:1: B:34:0x005c->B:38:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x004e A[EDGE_INSN: B:65:0x004e->B:31:0x004e BREAK  A[LOOP:0: B:25:0x003b->B:29:0x004a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x006f A[EDGE_INSN: B:67:0x006f->B:40:0x006f BREAK  A[LOOP:1: B:34:0x005c->B:38:0x006b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public final void M0(int i4, int i5, int i6) {
        int i7;
        int i8;
        e eVar;
        int[] iArr;
        int iJ0;
        ArrayList arrayList;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        int size;
        int i9;
        int i10;
        int size2;
        int[] iArr2;
        int iJ1 = this.f958x ? J0() : I0();
        if (i6 == 8) {
            if (i4 < i5) {
                i7 = i5 + 1;
            } else {
                i7 = i4 + 1;
                i8 = i5;
            }
            eVar = this.B;
            iArr = eVar.f973a;
            if (iArr != null && i8 < iArr.length) {
                arrayList = eVar.f974b;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                                break;
                            }
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) eVar.f974b.get(size2);
                            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f == i8) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                        break;
                    }
                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                        eVar.f974b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                    }
                    size = eVar.f974b.size();
                    i9 = 0;
                    while (true) {
                        if (i9 < size) {
                            i9 = -1;
                            break;
                        } else if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) eVar.f974b.get(i9)).f >= i8) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    if (i9 != -1) {
                        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) eVar.f974b.get(i9);
                        eVar.f974b.remove(i9);
                        i10 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f;
                    } else {
                        i10 = -1;
                    }
                } else {
                    i10 = -1;
                }
                iArr2 = eVar.f973a;
                if (i10 == -1) {
                    Arrays.fill(iArr2, i8, iArr2.length, -1);
                    int length = eVar.f973a.length;
                } else {
                    Arrays.fill(eVar.f973a, i8, Math.min(i10 + 1, iArr2.length), -1);
                }
            }
            if (i6 != 1) {
                eVar.c(i4, i5);
            } else if (i6 != 2) {
                eVar.d(i4, i5);
            } else if (i6 == 8) {
                eVar.d(i4, 1);
                eVar.c(i5, 1);
            }
            if (i7 <= iJ1) {
                return;
            }
            if (this.f958x) {
                iJ0 = I0();
            } else {
                iJ0 = J0();
            }
            if (i8 <= iJ0) {
                m0();
            }
        }
        i7 = i4 + i5;
        i8 = i4;
        eVar = this.B;
        iArr = eVar.f973a;
        if (iArr != null) {
            arrayList = eVar.f974b;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                            break;
                        }
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) eVar.f974b.get(size2);
                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f == i8) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                    break;
                }
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                    eVar.f974b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                }
                size = eVar.f974b.size();
                i9 = 0;
                while (true) {
                    if (i9 < size) {
                        i9 = -1;
                        break;
                    } else {
                        if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) eVar.f974b.get(i9)).f >= i8) {
                            break;
                            break;
                        }
                        i9++;
                    }
                }
                if (i9 != -1) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) eVar.f974b.get(i9);
                    eVar.f974b.remove(i9);
                    i10 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3.f;
                } else {
                    i10 = -1;
                }
            } else {
                i10 = -1;
            }
            iArr2 = eVar.f973a;
            if (i10 == -1) {
                Arrays.fill(iArr2, i8, iArr2.length, -1);
                int length2 = eVar.f973a.length;
            } else {
                Arrays.fill(eVar.f973a, i8, Math.min(i10 + 1, iArr2.length), -1);
            }
        }
        if (i6 != 1) {
            eVar.c(i4, i5);
        } else if (i6 != 2) {
            eVar.d(i4, i5);
        } else if (i6 == 8) {
            eVar.d(i4, 1);
            eVar.c(i5, 1);
        }
        if (i7 <= iJ1) {
            return;
        }
        if (this.f958x) {
            iJ0 = I0();
        } else {
            iJ0 = J0();
        }
        if (i8 <= iJ0) {
            m0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    public final View N0() {
        boolean z4;
        boolean z5;
        int iV = v();
        int i4 = iV - 1;
        BitSet bitSet = new BitSet(this.f950p);
        bitSet.set(0, this.f950p, true);
        byte b5 = (this.f954t == 1 && O0()) ? (byte) 1 : (byte) -1;
        if (this.f958x) {
            iV = -1;
        } else {
            i4 = 0;
        }
        int i5 = i4 < iV ? 1 : -1;
        while (i4 != iV) {
            View viewU = u(i4);
            c1 c1Var = (c1) viewU.getLayoutParams();
            if (bitSet.get(c1Var.f2745e.f2755e)) {
                d1 d1Var = c1Var.f2745e;
                if (this.f958x) {
                    int i6 = d1Var.f2753c;
                    if (i6 == Integer.MIN_VALUE) {
                        d1Var.a();
                        i6 = d1Var.f2753c;
                    }
                    if (i6 < this.f952r.g()) {
                        ArrayList arrayList = d1Var.f2751a;
                        ((c1) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewU;
                    }
                } else {
                    int i7 = d1Var.f2752b;
                    ArrayList arrayList2 = d1Var.f2751a;
                    if (i7 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        c1 c1Var2 = (c1) view.getLayoutParams();
                        d1Var.f2752b = d1Var.f.f952r.e(view);
                        c1Var2.getClass();
                        i7 = d1Var.f2752b;
                    }
                    if (i7 > this.f952r.k()) {
                        ((c1) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return viewU;
                    }
                }
                bitSet.clear(c1Var.f2745e.f2755e);
            }
            i4 += i5;
            if (i4 != iV) {
                View viewU2 = u(i4);
                boolean z6 = this.f958x;
                g gVar = this.f952r;
                if (z6) {
                    int iB = gVar.b(viewU);
                    int iB2 = this.f952r.b(viewU2);
                    if (iB >= iB2) {
                        if (iB == iB2) {
                            if (c1Var.f2745e.f2755e - ((c1) viewU2.getLayoutParams()).f2745e.f2755e < 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (b5 < 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z4 != z5) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewU;
                }
                int iE = gVar.e(viewU);
                int iE2 = this.f952r.e(viewU2);
                if (iE <= iE2) {
                    if (iE == iE2) {
                        if (c1Var.f2745e.f2755e - ((c1) viewU2.getLayoutParams()).f2745e.f2755e < 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (b5 < 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z4 != z5) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewU;
            }
        }
        return null;
    }

    @Override // k1.l0
    public final void O(int i4) {
        super.O(i4);
        for (int i5 = 0; i5 < this.f950p; i5++) {
            d1 d1Var = this.f951q[i5];
            int i6 = d1Var.f2752b;
            if (i6 != Integer.MIN_VALUE) {
                d1Var.f2752b = i6 + i4;
            }
            int i7 = d1Var.f2753c;
            if (i7 != Integer.MIN_VALUE) {
                d1Var.f2753c = i7 + i4;
            }
        }
    }

    public final boolean O0() {
        return C() == 1;
    }

    @Override // k1.l0
    public final void P(int i4) {
        super.P(i4);
        for (int i5 = 0; i5 < this.f950p; i5++) {
            d1 d1Var = this.f951q[i5];
            int i6 = d1Var.f2752b;
            if (i6 != Integer.MIN_VALUE) {
                d1Var.f2752b = i6 + i4;
            }
            int i7 = d1Var.f2753c;
            if (i7 != Integer.MIN_VALUE) {
                d1Var.f2753c = i7 + i4;
            }
        }
    }

    public final void P0(View view, int i4, int i5) {
        RecyclerView recyclerView = this.f2838b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        c1 c1Var = (c1) view.getLayoutParams();
        int iB1 = b1(i4, ((ViewGroup.MarginLayoutParams) c1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1Var).rightMargin + rect.right);
        int iB2 = b1(i5, ((ViewGroup.MarginLayoutParams) c1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1Var).bottomMargin + rect.bottom);
        if (v0(view, iB1, iB2, c1Var)) {
            view.measure(iB1, iB2);
        }
    }

    @Override // k1.l0
    public final void Q() {
        this.B.a();
        for (int i4 = 0; i4 < this.f950p; i4++) {
            this.f951q[i4].b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:254:0x040b  */
    /* JADX WARN: Code duplicated, block: B:265:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01f2 A[SYNTHETIC] */
    public final void Q0(v1.b bVar, u0 u0Var, boolean z4) {
        boolean z5;
        SavedState savedState;
        d1[] d1VarArr;
        int iV;
        int i4;
        int iH;
        int iH2;
        int iV2;
        int i5;
        boolean z6;
        SavedState savedState2 = this.F;
        b1 b1Var = this.H;
        if (!(savedState2 == null && this.f960z == -1) && u0Var.b() == 0) {
            h0(bVar);
            b1Var.a();
            return;
        }
        boolean z7 = b1Var.f2741e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = b1Var.f2742g;
        boolean z8 = (z7 && this.f960z == -1 && this.F == null) ? false : true;
        e eVar = this.B;
        if (z8) {
            b1Var.a();
            SavedState savedState3 = this.F;
            if (savedState3 != null) {
                int i6 = savedState3.f965h;
                if (i6 > 0) {
                    if (i6 == this.f950p) {
                        for (int i7 = 0; i7 < this.f950p; i7++) {
                            this.f951q[i7].b();
                            SavedState savedState4 = this.F;
                            int iG = savedState4.f966i[i7];
                            if (iG != Integer.MIN_VALUE) {
                                boolean z9 = savedState4.n;
                                g gVar = this.f952r;
                                iG += z9 ? gVar.g() : gVar.k();
                            }
                            d1 d1Var = this.f951q[i7];
                            d1Var.f2752b = iG;
                            d1Var.f2753c = iG;
                        }
                    } else {
                        savedState3.f966i = null;
                        savedState3.f965h = 0;
                        savedState3.f967j = 0;
                        savedState3.f968k = null;
                        savedState3.f969l = null;
                        savedState3.f = savedState3.f964g;
                    }
                }
                SavedState savedState5 = this.F;
                this.E = savedState5.f971o;
                boolean z10 = savedState5.f970m;
                c(null);
                SavedState savedState6 = this.F;
                if (savedState6 != null && savedState6.f970m != z10) {
                    savedState6.f970m = z10;
                }
                this.f957w = z10;
                m0();
                W0();
                SavedState savedState7 = this.F;
                int i8 = savedState7.f;
                if (i8 != -1) {
                    this.f960z = i8;
                    b1Var.f2739c = savedState7.n;
                } else {
                    b1Var.f2739c = this.f958x;
                }
                if (savedState7.f967j > 1) {
                    eVar.f973a = savedState7.f968k;
                    eVar.f974b = savedState7.f969l;
                }
            } else {
                W0();
                b1Var.f2739c = this.f958x;
            }
            if (u0Var.f2925g || (i5 = this.f960z) == -1) {
                if (this.D) {
                    int iB = u0Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iH2 = 0;
                            break;
                        }
                        iH2 = l0.H(u(iV2));
                        if (iH2 < 0 && iH2 < iB) {
                            break;
                        } else {
                            iV2--;
                        }
                    }
                } else {
                    int iB2 = u0Var.b();
                    iV = v();
                    i4 = 0;
                    while (true) {
                        if (i4 >= iV) {
                            iH2 = 0;
                            break;
                        }
                        iH = l0.H(u(i4));
                        if (iH < 0 && iH < iB2) {
                            iH2 = iH;
                            break;
                        }
                        i4++;
                    }
                }
                b1Var.f2737a = iH2;
                b1Var.f2738b = Integer.MIN_VALUE;
            } else if (i5 < 0 || i5 >= u0Var.b()) {
                this.f960z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.D) {
                    int iB3 = u0Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iH2 = 0;
                            break;
                        } else {
                            iH2 = l0.H(u(iV2));
                            if (iH2 < 0) {
                            }
                            iV2--;
                        }
                    }
                } else {
                    int iB4 = u0Var.b();
                    iV = v();
                    i4 = 0;
                    while (true) {
                        if (i4 >= iV) {
                            iH2 = 0;
                            break;
                        } else {
                            iH = l0.H(u(i4));
                            if (iH < 0) {
                            }
                            i4++;
                        }
                    }
                }
                b1Var.f2737a = iH2;
                b1Var.f2738b = Integer.MIN_VALUE;
            } else {
                SavedState savedState8 = this.F;
                if (savedState8 == null || savedState8.f == -1 || savedState8.f965h < 1) {
                    View viewQ = q(this.f960z);
                    if (viewQ != null) {
                        b1Var.f2737a = this.f958x ? J0() : I0();
                        if (this.A != Integer.MIN_VALUE) {
                            boolean z11 = b1Var.f2739c;
                            g gVar2 = this.f952r;
                            if (z11) {
                                b1Var.f2738b = (gVar2.g() - this.A) - this.f952r.b(viewQ);
                            } else {
                                b1Var.f2738b = (gVar2.k() + this.A) - this.f952r.e(viewQ);
                            }
                        } else if (this.f952r.c(viewQ) > this.f952r.l()) {
                            boolean z12 = b1Var.f2739c;
                            g gVar3 = this.f952r;
                            b1Var.f2738b = z12 ? gVar3.g() : gVar3.k();
                        } else {
                            int iE = this.f952r.e(viewQ) - this.f952r.k();
                            if (iE < 0) {
                                b1Var.f2738b = -iE;
                            } else {
                                int iG2 = this.f952r.g() - this.f952r.b(viewQ);
                                if (iG2 < 0) {
                                    b1Var.f2738b = iG2;
                                } else {
                                    b1Var.f2738b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i9 = this.f960z;
                        b1Var.f2737a = i9;
                        int i10 = this.A;
                        if (i10 == Integer.MIN_VALUE) {
                            if (v() != 0) {
                                if ((i9 < I0()) != this.f958x) {
                                    z6 = false;
                                } else {
                                    z6 = true;
                                }
                            } else if (this.f958x) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            b1Var.f2739c = z6;
                            g gVar4 = staggeredGridLayoutManager.f952r;
                            b1Var.f2738b = z6 ? gVar4.g() : gVar4.k();
                        } else {
                            boolean z13 = b1Var.f2739c;
                            g gVar5 = staggeredGridLayoutManager.f952r;
                            if (z13) {
                                b1Var.f2738b = gVar5.g() - i10;
                            } else {
                                b1Var.f2738b = gVar5.k() + i10;
                            }
                        }
                        b1Var.f2740d = true;
                    }
                } else {
                    b1Var.f2738b = Integer.MIN_VALUE;
                    b1Var.f2737a = this.f960z;
                }
            }
            b1Var.f2741e = true;
        }
        if (this.F == null && this.f960z == -1 && (b1Var.f2739c != this.D || O0() != this.E)) {
            eVar.a();
            b1Var.f2740d = true;
        }
        if (v() > 0 && ((savedState = this.F) == null || savedState.f965h < 1)) {
            if (b1Var.f2740d) {
                for (int i11 = 0; i11 < this.f950p; i11++) {
                    this.f951q[i11].b();
                    int i12 = b1Var.f2738b;
                    if (i12 != Integer.MIN_VALUE) {
                        d1 d1Var2 = this.f951q[i11];
                        d1Var2.f2752b = i12;
                        d1Var2.f2753c = i12;
                    }
                }
            } else if (z8 || b1Var.f == null) {
                int i13 = 0;
                while (true) {
                    int i14 = this.f950p;
                    d1VarArr = this.f951q;
                    if (i13 >= i14) {
                        break;
                    }
                    d1 d1Var3 = d1VarArr[i13];
                    boolean z14 = this.f958x;
                    int i15 = b1Var.f2738b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = d1Var3.f;
                    int iF = z14 ? d1Var3.f(Integer.MIN_VALUE) : d1Var3.h(Integer.MIN_VALUE);
                    d1Var3.b();
                    if (iF != Integer.MIN_VALUE && ((!z14 || iF >= staggeredGridLayoutManager2.f952r.g()) && (z14 || iF <= staggeredGridLayoutManager2.f952r.k()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            iF += i15;
                        }
                        d1Var3.f2753c = iF;
                        d1Var3.f2752b = iF;
                    }
                    i13++;
                }
                int length = d1VarArr.length;
                int[] iArr = b1Var.f;
                if (iArr == null || iArr.length < length) {
                    b1Var.f = new int[staggeredGridLayoutManager.f951q.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    b1Var.f[i16] = d1VarArr[i16].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < this.f950p; i17++) {
                    d1 d1Var4 = this.f951q[i17];
                    d1Var4.b();
                    int i18 = b1Var.f[i17];
                    d1Var4.f2752b = i18;
                    d1Var4.f2753c = i18;
                }
            }
        }
        p(bVar);
        q qVar = this.f956v;
        qVar.f2870a = false;
        int iL = this.f953s.l();
        this.f955u = iL / this.f950p;
        View.MeasureSpec.makeMeasureSpec(iL, this.f953s.i());
        Z0(b1Var.f2737a, u0Var);
        if (b1Var.f2739c) {
            Y0(-1);
            D0(bVar, qVar, u0Var);
            Y0(1);
            qVar.f2872c = b1Var.f2737a + qVar.f2873d;
            D0(bVar, qVar, u0Var);
        } else {
            Y0(1);
            D0(bVar, qVar, u0Var);
            Y0(-1);
            qVar.f2872c = b1Var.f2737a + qVar.f2873d;
            D0(bVar, qVar, u0Var);
        }
        if (this.f953s.i() != 1073741824) {
            int iV3 = v();
            float fMax = 0.0f;
            for (int i19 = 0; i19 < iV3; i19++) {
                View viewU = u(i19);
                float fC = this.f953s.c(viewU);
                if (fC >= fMax) {
                    ((c1) viewU.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i20 = this.f955u;
            int iRound = Math.round(fMax * this.f950p);
            if (this.f953s.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f953s.l());
            }
            this.f955u = iRound / this.f950p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f953s.i());
            if (this.f955u != i20) {
                for (int i21 = 0; i21 < iV3; i21++) {
                    View viewU2 = u(i21);
                    c1 c1Var = (c1) viewU2.getLayoutParams();
                    c1Var.getClass();
                    if (O0() && this.f954t == 1) {
                        int i22 = -((this.f950p - 1) - c1Var.f2745e.f2755e);
                        viewU2.offsetLeftAndRight((this.f955u * i22) - (i22 * i20));
                    } else {
                        int i23 = c1Var.f2745e.f2755e;
                        int i24 = this.f955u * i23;
                        int i25 = i23 * i20;
                        if (this.f954t == 1) {
                            viewU2.offsetLeftAndRight(i24 - i25);
                        } else {
                            viewU2.offsetTopAndBottom(i24 - i25);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f958x) {
                G0(bVar, u0Var, true);
                H0(bVar, u0Var, false);
            } else {
                H0(bVar, u0Var, true);
                G0(bVar, u0Var, false);
            }
        }
        if (z4 && !u0Var.f2925g && this.C != 0 && v() > 0 && N0() != null) {
            RecyclerView recyclerView = this.f2838b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            z5 = B0();
        }
        if (u0Var.f2925g) {
            b1Var.a();
        }
        this.D = b1Var.f2739c;
        this.E = O0();
        if (z5) {
            b1Var.a();
            Q0(bVar, u0Var, false);
        }
    }

    public final boolean R0(int i4) {
        if (this.f954t == 0) {
            return (i4 == -1) != this.f958x;
        }
        return ((i4 == -1) == this.f958x) == O0();
    }

    @Override // k1.l0
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2838b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i4 = 0; i4 < this.f950p; i4++) {
            this.f951q[i4].b();
        }
        recyclerView.requestLayout();
    }

    public final void S0(int i4, u0 u0Var) {
        int iI0;
        int i5;
        if (i4 > 0) {
            iI0 = J0();
            i5 = 1;
        } else {
            iI0 = I0();
            i5 = -1;
        }
        q qVar = this.f956v;
        qVar.f2870a = true;
        Z0(iI0, u0Var);
        Y0(i5);
        qVar.f2872c = iI0 + qVar.f2873d;
        qVar.f2871b = Math.abs(i4);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048  */
    /* JADX WARN: Code duplicated, block: B:37:0x0053  */
    @Override // k1.l0
    public final View T(View view, int i4, v1.b bVar, u0 u0Var) {
        View viewA;
        int i5;
        if (v() != 0) {
            RecyclerView recyclerView = this.f2838b;
            if (recyclerView == null || (viewA = recyclerView.A(view)) == null || ((ArrayList) this.f2837a.f580d).contains(viewA)) {
                viewA = null;
            }
            if (viewA != null) {
                W0();
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 17) {
                            if (i4 != 33) {
                                if (i4 == 66 ? this.f954t == 0 : !(i4 != 130 || this.f954t != 1)) {
                                    i5 = 1;
                                }
                            } else if (this.f954t == 1) {
                                i5 = -1;
                            }
                            i5 = Integer.MIN_VALUE;
                        } else if (this.f954t == 0) {
                            i5 = -1;
                        } else {
                            i5 = Integer.MIN_VALUE;
                        }
                    } else if (this.f954t != 1 && O0()) {
                        i5 = -1;
                    } else {
                        i5 = 1;
                    }
                } else if (this.f954t != 1 && O0()) {
                    i5 = 1;
                } else {
                    i5 = -1;
                }
                if (i5 != Integer.MIN_VALUE) {
                    c1 c1Var = (c1) viewA.getLayoutParams();
                    c1Var.getClass();
                    d1 d1Var = c1Var.f2745e;
                    int iJ0 = i5 == 1 ? J0() : I0();
                    Z0(iJ0, u0Var);
                    Y0(i5);
                    q qVar = this.f956v;
                    qVar.f2872c = qVar.f2873d + iJ0;
                    qVar.f2871b = (int) (this.f952r.l() * 0.33333334f);
                    qVar.f2876h = true;
                    qVar.f2870a = false;
                    D0(bVar, qVar, u0Var);
                    this.D = this.f958x;
                    View viewG = d1Var.g(iJ0, i5);
                    if (viewG != null && viewG != viewA) {
                        return viewG;
                    }
                    if (R0(i5)) {
                        for (int i6 = this.f950p - 1; i6 >= 0; i6--) {
                            View viewG2 = this.f951q[i6].g(iJ0, i5);
                            if (viewG2 != null && viewG2 != viewA) {
                                return viewG2;
                            }
                        }
                    } else {
                        for (int i7 = 0; i7 < this.f950p; i7++) {
                            View viewG3 = this.f951q[i7].g(iJ0, i5);
                            if (viewG3 != null && viewG3 != viewA) {
                                return viewG3;
                            }
                        }
                    }
                    boolean z4 = (this.f957w ^ true) == (i5 == -1);
                    View viewQ = q(z4 ? d1Var.c() : d1Var.d());
                    if (viewQ != null && viewQ != viewA) {
                        return viewQ;
                    }
                    if (R0(i5)) {
                        for (int i8 = this.f950p - 1; i8 >= 0; i8--) {
                            if (i8 != d1Var.f2755e) {
                                d1[] d1VarArr = this.f951q;
                                View viewQ2 = q(z4 ? d1VarArr[i8].c() : d1VarArr[i8].d());
                                if (viewQ2 != null && viewQ2 != viewA) {
                                    return viewQ2;
                                }
                            }
                        }
                    } else {
                        for (int i9 = 0; i9 < this.f950p; i9++) {
                            d1[] d1VarArr2 = this.f951q;
                            View viewQ3 = q(z4 ? d1VarArr2[i9].c() : d1VarArr2[i9].d());
                            if (viewQ3 != null && viewQ3 != viewA) {
                                return viewQ3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void T0(v1.b bVar, q qVar) {
        if (!qVar.f2870a || qVar.f2877i) {
            return;
        }
        int i4 = qVar.f2871b;
        int i5 = qVar.f2874e;
        if (i4 == 0) {
            if (i5 == -1) {
                U0(bVar, qVar.f2875g);
                return;
            } else {
                V0(bVar, qVar.f);
                return;
            }
        }
        int i6 = 1;
        if (i5 == -1) {
            int i7 = qVar.f;
            int iH = this.f951q[0].h(i7);
            while (i6 < this.f950p) {
                int iH2 = this.f951q[i6].h(i7);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i6++;
            }
            int i8 = i7 - iH;
            int iMin = qVar.f2875g;
            if (i8 >= 0) {
                iMin -= Math.min(i8, qVar.f2871b);
            }
            U0(bVar, iMin);
            return;
        }
        int i9 = qVar.f2875g;
        int iF = this.f951q[0].f(i9);
        while (i6 < this.f950p) {
            int iF2 = this.f951q[i6].f(i9);
            if (iF2 < iF) {
                iF = iF2;
            }
            i6++;
        }
        int i10 = iF - qVar.f2875g;
        int iMin2 = qVar.f;
        if (i10 >= 0) {
            iMin2 += Math.min(i10, qVar.f2871b);
        }
        V0(bVar, iMin2);
    }

    @Override // k1.l0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewF0 = F0(false);
            View viewE0 = E0(false);
            if (viewF0 == null || viewE0 == null) {
                return;
            }
            int iH = l0.H(viewF0);
            int iH2 = l0.H(viewE0);
            if (iH < iH2) {
                accessibilityEvent.setFromIndex(iH);
                accessibilityEvent.setToIndex(iH2);
            } else {
                accessibilityEvent.setFromIndex(iH2);
                accessibilityEvent.setToIndex(iH);
            }
        }
    }

    public final void U0(v1.b bVar, int i4) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f952r.e(viewU) < i4 || this.f952r.n(viewU) < i4) {
                return;
            }
            c1 c1Var = (c1) viewU.getLayoutParams();
            c1Var.getClass();
            if (c1Var.f2745e.f2751a.size() == 1) {
                return;
            }
            d1 d1Var = c1Var.f2745e;
            ArrayList arrayList = d1Var.f2751a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            c1 c1Var2 = (c1) view.getLayoutParams();
            c1Var2.f2745e = null;
            if (c1Var2.f2851a.h() || c1Var2.f2851a.k()) {
                d1Var.f2754d -= d1Var.f.f952r.c(view);
            }
            if (size == 1) {
                d1Var.f2752b = Integer.MIN_VALUE;
            }
            d1Var.f2753c = Integer.MIN_VALUE;
            j0(viewU, bVar);
        }
    }

    public final void V0(v1.b bVar, int i4) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f952r.b(viewU) > i4 || this.f952r.m(viewU) > i4) {
                return;
            }
            c1 c1Var = (c1) viewU.getLayoutParams();
            c1Var.getClass();
            if (c1Var.f2745e.f2751a.size() == 1) {
                return;
            }
            d1 d1Var = c1Var.f2745e;
            ArrayList arrayList = d1Var.f2751a;
            View view = (View) arrayList.remove(0);
            c1 c1Var2 = (c1) view.getLayoutParams();
            c1Var2.f2745e = null;
            if (arrayList.size() == 0) {
                d1Var.f2753c = Integer.MIN_VALUE;
            }
            if (c1Var2.f2851a.h() || c1Var2.f2851a.k()) {
                d1Var.f2754d -= d1Var.f.f952r.c(view);
            }
            d1Var.f2752b = Integer.MIN_VALUE;
            j0(viewU, bVar);
        }
    }

    public final void W0() {
        if (this.f954t == 1 || !O0()) {
            this.f958x = this.f957w;
        } else {
            this.f958x = !this.f957w;
        }
    }

    @Override // k1.l0
    public final void X(int i4, int i5) {
        M0(i4, i5, 1);
    }

    public final int X0(int i4, u0 u0Var, v1.b bVar) {
        if (v() == 0 || i4 == 0) {
            return 0;
        }
        S0(i4, u0Var);
        q qVar = this.f956v;
        int iD0 = D0(bVar, qVar, u0Var);
        if (qVar.f2871b >= iD0) {
            i4 = i4 < 0 ? -iD0 : iD0;
        }
        this.f952r.o(-i4);
        this.D = this.f958x;
        qVar.f2871b = 0;
        T0(bVar, qVar);
        return i4;
    }

    @Override // k1.l0
    public final void Y() {
        this.B.a();
        m0();
    }

    public final void Y0(int i4) {
        q qVar = this.f956v;
        qVar.f2874e = i4;
        qVar.f2873d = this.f958x != (i4 == -1) ? -1 : 1;
    }

    @Override // k1.l0
    public final void Z(int i4, int i5) {
        M0(i4, i5, 8);
    }

    public final void Z0(int i4, u0 u0Var) {
        int iL;
        int iL2;
        int i5;
        q qVar = this.f956v;
        boolean z4 = false;
        qVar.f2871b = 0;
        qVar.f2872c = i4;
        u uVar = this.f2841e;
        if (uVar == null || !uVar.f2910e || (i5 = u0Var.f2920a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            boolean z5 = this.f958x;
            boolean z6 = i5 < i4;
            g gVar = this.f952r;
            if (z5 == z6) {
                iL = gVar.l();
                iL2 = 0;
            } else {
                iL2 = gVar.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.f2838b;
        if (recyclerView == null || !recyclerView.f921l) {
            qVar.f2875g = this.f952r.f() + iL;
            qVar.f = -iL2;
        } else {
            qVar.f = this.f952r.k() - iL2;
            qVar.f2875g = this.f952r.g() + iL;
        }
        qVar.f2876h = false;
        qVar.f2870a = true;
        if (this.f952r.i() == 0 && this.f952r.f() == 0) {
            z4 = true;
        }
        qVar.f2877i = z4;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // k1.t0
    public final PointF a(int i4) {
        int i5 = -1;
        if (v() != 0) {
            if ((i4 < I0()) == this.f958x) {
                i5 = 1;
            }
        } else if (this.f958x) {
            i5 = 1;
        }
        PointF pointF = new PointF();
        if (i5 == 0) {
            return null;
        }
        if (this.f954t == 0) {
            pointF.x = i5;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i5;
        return pointF;
    }

    @Override // k1.l0
    public final void a0(int i4, int i5) {
        M0(i4, i5, 2);
    }

    public final void a1(d1 d1Var, int i4, int i5) {
        int i6 = d1Var.f2754d;
        int i7 = d1Var.f2755e;
        if (i4 != -1) {
            int i8 = d1Var.f2753c;
            if (i8 == Integer.MIN_VALUE) {
                d1Var.a();
                i8 = d1Var.f2753c;
            }
            if (i8 - i6 >= i5) {
                this.f959y.set(i7, false);
                return;
            }
            return;
        }
        int i9 = d1Var.f2752b;
        if (i9 == Integer.MIN_VALUE) {
            View view = (View) d1Var.f2751a.get(0);
            c1 c1Var = (c1) view.getLayoutParams();
            d1Var.f2752b = d1Var.f.f952r.e(view);
            c1Var.getClass();
            i9 = d1Var.f2752b;
        }
        if (i9 + i6 <= i5) {
            this.f959y.set(i7, false);
        }
    }

    @Override // k1.l0
    public final void b0(int i4, int i5) {
        M0(i4, i5, 4);
    }

    @Override // k1.l0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // k1.l0
    public final void c0(v1.b bVar, u0 u0Var) {
        Q0(bVar, u0Var, true);
    }

    @Override // k1.l0
    public final boolean d() {
        return this.f954t == 0;
    }

    @Override // k1.l0
    public final void d0(u0 u0Var) {
        this.f960z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // k1.l0
    public final boolean e() {
        return this.f954t == 1;
    }

    @Override // k1.l0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.F = savedState;
            if (this.f960z != -1) {
                savedState.f = -1;
                savedState.f964g = -1;
                savedState.f966i = null;
                savedState.f965h = 0;
                savedState.f967j = 0;
                savedState.f968k = null;
                savedState.f969l = null;
            }
            m0();
        }
    }

    @Override // k1.l0
    public final boolean f(m0 m0Var) {
        return m0Var instanceof c1;
    }

    @Override // k1.l0
    public final Parcelable f0() {
        int iH;
        int iK;
        int[] iArr;
        SavedState savedState = this.F;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f965h = savedState.f965h;
            savedState2.f = savedState.f;
            savedState2.f964g = savedState.f964g;
            savedState2.f966i = savedState.f966i;
            savedState2.f967j = savedState.f967j;
            savedState2.f968k = savedState.f968k;
            savedState2.f970m = savedState.f970m;
            savedState2.n = savedState.n;
            savedState2.f971o = savedState.f971o;
            savedState2.f969l = savedState.f969l;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.f970m = this.f957w;
        savedState3.n = this.D;
        savedState3.f971o = this.E;
        e eVar = this.B;
        if (eVar == null || (iArr = eVar.f973a) == null) {
            savedState3.f967j = 0;
        } else {
            savedState3.f968k = iArr;
            savedState3.f967j = iArr.length;
            savedState3.f969l = eVar.f974b;
        }
        if (v() <= 0) {
            savedState3.f = -1;
            savedState3.f964g = -1;
            savedState3.f965h = 0;
            return savedState3;
        }
        savedState3.f = this.D ? J0() : I0();
        View viewE0 = this.f958x ? E0(true) : F0(true);
        savedState3.f964g = viewE0 != null ? l0.H(viewE0) : -1;
        int i4 = this.f950p;
        savedState3.f965h = i4;
        savedState3.f966i = new int[i4];
        for (int i5 = 0; i5 < this.f950p; i5++) {
            boolean z4 = this.D;
            d1[] d1VarArr = this.f951q;
            if (z4) {
                iH = d1VarArr[i5].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f952r.g();
                    iH -= iK;
                }
            } else {
                iH = d1VarArr[i5].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f952r.k();
                    iH -= iK;
                }
            }
            savedState3.f966i[i5] = iH;
        }
        return savedState3;
    }

    @Override // k1.l0
    public final void g0(int i4) {
        if (i4 == 0) {
            B0();
        }
    }

    @Override // k1.l0
    public final void h(int i4, int i5, u0 u0Var, h hVar) {
        q qVar;
        int iF;
        int iH;
        if (this.f954t != 0) {
            i4 = i5;
        }
        if (v() == 0 || i4 == 0) {
            return;
        }
        S0(i4, u0Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f950p) {
            this.J = new int[this.f950p];
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = this.f950p;
            qVar = this.f956v;
            if (i6 >= i8) {
                break;
            }
            if (qVar.f2873d == -1) {
                iF = qVar.f;
                iH = this.f951q[i6].h(iF);
            } else {
                iF = this.f951q[i6].f(qVar.f2875g);
                iH = qVar.f2875g;
            }
            int i9 = iF - iH;
            if (i9 >= 0) {
                this.J[i7] = i9;
                i7++;
            }
            i6++;
        }
        Arrays.sort(this.J, 0, i7);
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = qVar.f2872c;
            if (i11 < 0 || i11 >= u0Var.b()) {
                return;
            }
            hVar.a(qVar.f2872c, this.J[i10]);
            qVar.f2872c += qVar.f2873d;
        }
    }

    @Override // k1.l0
    public final int j(u0 u0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return h0.m(u0Var, this.f952r, F0(z4), E0(z4), this, this.I);
    }

    @Override // k1.l0
    public final int k(u0 u0Var) {
        return C0(u0Var);
    }

    @Override // k1.l0
    public final int l(u0 u0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return h0.o(u0Var, this.f952r, F0(z4), E0(z4), this, this.I);
    }

    @Override // k1.l0
    public final int m(u0 u0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return h0.m(u0Var, this.f952r, F0(z4), E0(z4), this, this.I);
    }

    @Override // k1.l0
    public final int n(u0 u0Var) {
        return C0(u0Var);
    }

    @Override // k1.l0
    public final int n0(int i4, u0 u0Var, v1.b bVar) {
        return X0(i4, u0Var, bVar);
    }

    @Override // k1.l0
    public final int o(u0 u0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return h0.o(u0Var, this.f952r, F0(z4), E0(z4), this, this.I);
    }

    @Override // k1.l0
    public final void o0(int i4) {
        SavedState savedState = this.F;
        if (savedState != null && savedState.f != i4) {
            savedState.f966i = null;
            savedState.f965h = 0;
            savedState.f = -1;
            savedState.f964g = -1;
        }
        this.f960z = i4;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    @Override // k1.l0
    public final int p0(int i4, u0 u0Var, v1.b bVar) {
        return X0(i4, u0Var, bVar);
    }

    @Override // k1.l0
    public final m0 r() {
        return this.f954t == 0 ? new c1(-2, -1) : new c1(-1, -2);
    }

    @Override // k1.l0
    public final m0 s(Context context, AttributeSet attributeSet) {
        return new c1(context, attributeSet);
    }

    @Override // k1.l0
    public final void s0(Rect rect, int i4, int i5) {
        int iG;
        int iG2;
        int iF = F() + E();
        int iD = D() + G();
        int i6 = this.f954t;
        int i7 = this.f950p;
        if (i6 == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f2838b;
            WeakHashMap weakHashMap = p0.f3233a;
            iG2 = l0.g(i5, iHeight, recyclerView.getMinimumHeight());
            iG = l0.g(i4, (this.f955u * i7) + iF, this.f2838b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f2838b;
            WeakHashMap weakHashMap2 = p0.f3233a;
            iG = l0.g(i4, iWidth, recyclerView2.getMinimumWidth());
            iG2 = l0.g(i5, (this.f955u * i7) + iD, this.f2838b.getMinimumHeight());
        }
        this.f2838b.setMeasuredDimension(iG, iG2);
    }

    @Override // k1.l0
    public final m0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c1((ViewGroup.MarginLayoutParams) layoutParams) : new c1(layoutParams);
    }

    @Override // k1.l0
    public final void y0(RecyclerView recyclerView, int i4) {
        u uVar = new u(recyclerView.getContext());
        uVar.f2906a = i4;
        z0(uVar);
    }
}
