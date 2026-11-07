package u;

import android.view.View;
import androidx.emoji2.text.t;
import androidx.fragment.app.u;
import com.google.android.gms.common.api.Api;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import v.k;
import v.m;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public d T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f3766a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v.c f3767b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f3768b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v.c f3769c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f3770c0;
    public float d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f3773e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public View f3774f0;
    public int g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f3777h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f3779i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f3780j;
    public int j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3781k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final float[] f3782k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3783l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final d[] f3784l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3785m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final d[] f3786m0;
    public boolean n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f3787n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3788o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f3789o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3790p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int[] f3791p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f3795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f3798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3800y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f3801z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3765a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f3771d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f3772e = null;
    public final boolean[] f = {true, true};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3775g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3776h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3778i = -1;

    public d() {
        new HashMap();
        this.f3781k = false;
        this.f3783l = false;
        this.f3785m = false;
        this.n = false;
        this.f3788o = -1;
        this.f3790p = -1;
        this.f3792q = 0;
        this.f3793r = 0;
        this.f3794s = 0;
        this.f3795t = new int[2];
        this.f3796u = 0;
        this.f3797v = 0;
        this.f3798w = 1.0f;
        this.f3799x = 0;
        this.f3800y = 0;
        this.f3801z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        c cVar = new c(this, 2);
        this.I = cVar;
        c cVar2 = new c(this, 3);
        this.J = cVar2;
        c cVar3 = new c(this, 4);
        this.K = cVar3;
        c cVar4 = new c(this, 5);
        this.L = cVar4;
        c cVar5 = new c(this, 6);
        this.M = cVar5;
        c cVar6 = new c(this, 8);
        this.N = cVar6;
        c cVar7 = new c(this, 9);
        this.O = cVar7;
        c cVar8 = new c(this, 7);
        this.P = cVar8;
        this.Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.f3791p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f3766a0 = 0;
        this.d0 = 0.5f;
        this.f3773e0 = 0.5f;
        this.g0 = 0;
        this.f3777h0 = null;
        this.f3779i0 = 0;
        this.j0 = 0;
        this.f3782k0 = new float[]{-1.0f, -1.0f};
        this.f3784l0 = new d[]{null, null};
        this.f3786m0 = new d[]{null, null};
        this.f3787n0 = -1;
        this.f3789o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i4, int i5, String str, StringBuilder sb) {
        if (i4 == i5) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i4);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f, float f4) {
        if (f == f4) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i4, int i5, int i6, int i7, int i8, float f, int i9) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i9 == 1) {
            str2 = "FIXED";
        } else if (i9 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i9 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i9 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(str2);
            sb.append(",\n");
        }
        G(i4, 0, "      size", sb);
        G(i5, 0, "      min", sb);
        G(i6, Api.BaseClientBuilder.API_PRIORITY_OTHER, "      max", sb);
        G(i7, 0, "      matchMin", sb);
        G(i8, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, c cVar) {
        if (cVar.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f);
        sb.append("'");
        if (cVar.f3763h != Integer.MIN_VALUE || cVar.f3762g != 0) {
            sb.append(",");
            sb.append(cVar.f3762g);
            if (cVar.f3763h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.f3763h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.f3781k) {
            return true;
        }
        return this.I.f3759c && this.K.f3759c;
    }

    public boolean B() {
        if (this.f3783l) {
            return true;
        }
        return this.J.f3759c && this.L.f3759c;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f3766a0 = 0;
        this.f3768b0 = 0;
        this.f3770c0 = 0;
        this.d0 = 0.5f;
        this.f3773e0 = 0.5f;
        int[] iArr = this.f3791p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f3774f0 = null;
        this.g0 = 0;
        this.f3779i0 = 0;
        this.j0 = 0;
        float[] fArr = this.f3782k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f3788o = -1;
        this.f3790p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f3793r = 0;
        this.f3794s = 0;
        this.f3798w = 1.0f;
        this.f3801z = 1.0f;
        this.f3797v = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3800y = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3796u = 0;
        this.f3799x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f3775g = true;
        int[] iArr3 = this.f3795t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f3776h = -1;
        this.f3778i = -1;
    }

    public final void D() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((c) arrayList.get(i4)).j();
        }
    }

    public final void E() {
        this.f3781k = false;
        this.f3783l = false;
        this.f3785m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            c cVar = (c) arrayList.get(i4);
            cVar.f3759c = false;
            cVar.f3758b = 0;
        }
    }

    public void F(t tVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i4) {
        this.f3766a0 = i4;
        this.E = i4 > 0;
    }

    public final void J(int i4, int i5) {
        if (this.f3781k) {
            return;
        }
        this.I.l(i4);
        this.K.l(i5);
        this.Y = i4;
        this.U = i5 - i4;
        this.f3781k = true;
    }

    public final void K(int i4, int i5) {
        if (this.f3783l) {
            return;
        }
        this.J.l(i4);
        this.L.l(i5);
        this.Z = i4;
        this.V = i5 - i4;
        if (this.E) {
            this.M.l(i4 + this.f3766a0);
        }
        this.f3783l = true;
    }

    public final void L(int i4) {
        this.V = i4;
        int i5 = this.f3770c0;
        if (i4 < i5) {
            this.V = i5;
        }
    }

    public final void M(int i4) {
        this.f3791p0[0] = i4;
    }

    public final void N(int i4) {
        this.f3791p0[1] = i4;
    }

    public final void O(int i4) {
        this.U = i4;
        int i5 = this.f3768b0;
        if (i4 < i5) {
            this.U = i5;
        }
    }

    public void P(boolean z4, boolean z5) {
        int i4;
        int i5;
        k kVar = this.f3771d;
        boolean z6 = z4 & kVar.f4274g;
        m mVar = this.f3772e;
        boolean z7 = z5 & mVar.f4274g;
        int i6 = kVar.f4275h.f4251g;
        int i7 = mVar.f4275h.f4251g;
        int i8 = kVar.f4276i.f4251g;
        int i9 = mVar.f4276i.f4251g;
        int i10 = i9 - i7;
        if (i8 - i6 < 0 || i10 < 0 || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE) {
            i8 = 0;
            i9 = 0;
            i6 = 0;
            i7 = 0;
        }
        int i11 = i8 - i6;
        int i12 = i9 - i7;
        if (z6) {
            this.Y = i6;
        }
        if (z7) {
            this.Z = i7;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f3791p0;
        if (z6) {
            if (iArr[0] == 1 && i11 < (i5 = this.U)) {
                i11 = i5;
            }
            this.U = i11;
            int i13 = this.f3768b0;
            if (i11 < i13) {
                this.U = i13;
            }
        }
        if (z7) {
            if (iArr[1] == 1 && i12 < (i4 = this.V)) {
                i12 = i4;
            }
            this.V = i12;
            int i14 = this.f3770c0;
            if (i12 < i14) {
                this.V = i14;
            }
        }
    }

    public void Q(s.c cVar, boolean z4) {
        int i4;
        int i5;
        m mVar;
        k kVar;
        cVar.getClass();
        int iN = s.c.n(this.I);
        int iN2 = s.c.n(this.J);
        int iN3 = s.c.n(this.K);
        int iN4 = s.c.n(this.L);
        if (z4 && (kVar = this.f3771d) != null) {
            v.f fVar = kVar.f4275h;
            if (fVar.f4254j) {
                v.f fVar2 = kVar.f4276i;
                if (fVar2.f4254j) {
                    iN = fVar.f4251g;
                    iN3 = fVar2.f4251g;
                }
            }
        }
        if (z4 && (mVar = this.f3772e) != null) {
            v.f fVar3 = mVar.f4275h;
            if (fVar3.f4254j) {
                v.f fVar4 = mVar.f4276i;
                if (fVar4.f4254j) {
                    iN2 = fVar3.f4251g;
                    iN4 = fVar4.f4251g;
                }
            }
        }
        int i6 = iN4 - iN2;
        if (iN3 - iN < 0 || i6 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i7 = iN3 - iN;
        int i8 = iN4 - iN2;
        this.Y = iN;
        this.Z = iN2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f3791p0;
        int i9 = iArr[0];
        if (i9 == 1 && i7 < (i5 = this.U)) {
            i7 = i5;
        }
        if (iArr[1] == 1 && i8 < (i4 = this.V)) {
            i8 = i4;
        }
        this.U = i7;
        this.V = i8;
        int i10 = this.f3770c0;
        if (i8 < i10) {
            this.V = i10;
        }
        int i11 = this.f3768b0;
        if (i7 < i11) {
            this.U = i11;
        }
        int i12 = this.f3797v;
        if (i12 > 0 && i9 == 3) {
            this.U = Math.min(this.U, i12);
        }
        int i13 = this.f3800y;
        if (i13 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i13);
        }
        int i14 = this.U;
        if (i7 != i14) {
            this.f3776h = i14;
        }
        int i15 = this.V;
        if (i8 != i15) {
            this.f3778i = i15;
        }
    }

    public final void a(e eVar, s.c cVar, HashSet hashSet, int i4, boolean z4) {
        if (z4) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, cVar, this);
            hashSet.remove(this);
            b(cVar, eVar.W(64));
        }
        if (i4 == 0) {
            HashSet hashSet2 = this.I.f3757a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f3760d.a(eVar, cVar, hashSet, i4, true);
                }
            }
            HashSet hashSet3 = this.K.f3757a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f3760d.a(eVar, cVar, hashSet, i4, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f3757a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f3760d.a(eVar, cVar, hashSet, i4, true);
            }
        }
        HashSet hashSet5 = this.L.f3757a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f3760d.a(eVar, cVar, hashSet, i4, true);
            }
        }
        HashSet hashSet6 = this.M.f3757a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f3760d.a(eVar, cVar, hashSet, i4, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0204  */
    /* JADX WARN: Code duplicated, block: B:125:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0215  */
    /* JADX WARN: Code duplicated, block: B:130:0x021b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0226  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:135:0x023b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0261  */
    /* JADX WARN: Code duplicated, block: B:157:0x028b  */
    /* JADX WARN: Code duplicated, block: B:161:0x029a  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:187:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x03c7 A[PHI: r13
      0x03c7: PHI (r13v37 int) = (r13v22 int), (r13v22 int), (r13v34 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int) binds: [B:257:0x03cf, B:258:0x03d1, B:252:0x03bb, B:239:0x0390, B:245:0x039e, B:247:0x03a2, B:248:0x03a4, B:244:0x039a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:257:0x03cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:272:0x040d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0412 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x0416  */
    /* JADX WARN: Code duplicated, block: B:279:0x041a  */
    /* JADX WARN: Code duplicated, block: B:284:0x0426  */
    /* JADX WARN: Code duplicated, block: B:287:0x042e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0434  */
    /* JADX WARN: Code duplicated, block: B:292:0x0437  */
    /* JADX WARN: Code duplicated, block: B:295:0x0453  */
    /* JADX WARN: Code duplicated, block: B:314:0x049a  */
    /* JADX WARN: Code duplicated, block: B:330:0x0537  */
    /* JADX WARN: Code duplicated, block: B:346:0x058a  */
    /* JADX WARN: Code duplicated, block: B:349:0x059c  */
    /* JADX WARN: Code duplicated, block: B:352:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:389:0x0661  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:391:0x0667  */
    /* JADX WARN: Code duplicated, block: B:393:0x0670  */
    /* JADX WARN: Code duplicated, block: B:394:0x0697  */
    /* JADX WARN: Code duplicated, block: B:397:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:400:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [u.d] */
    public void b(s.c cVar, boolean z4) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean[] zArr;
        int i8;
        int i9;
        boolean z5;
        HashSet hashSet;
        d dVar;
        e eVar;
        WeakReference weakReference;
        WeakReference weakReference2;
        d dVar2;
        e eVar2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        c cVar2;
        boolean[] zArr3;
        boolean z6;
        boolean z7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        boolean z8;
        int i16;
        boolean z9;
        float f;
        int i17;
        int i18;
        c cVar3;
        int i19;
        int i20;
        int i21;
        boolean z10;
        int i22;
        boolean z11;
        boolean z12;
        c cVar4;
        int i23;
        c cVar5;
        s.f fVar;
        s.f fVar2;
        s.f fVar3;
        boolean z13;
        ?? r4;
        ?? r5;
        int i24;
        s.f fVar4;
        s.f fVar5;
        s.f fVar6;
        int i25;
        int i26;
        boolean z14;
        int i27;
        s.f fVar7;
        int i28;
        float f4;
        ?? r27;
        m mVar;
        boolean z15;
        k kVar;
        int i29;
        int i30;
        boolean zX;
        int i31;
        boolean zY;
        k kVar2;
        m mVar2;
        boolean z16;
        ArrayList arrayList;
        int size;
        int i32;
        HashSet hashSet2;
        s.c cVar6 = cVar;
        c cVar7 = this.I;
        s.f fVarK = cVar6.k(cVar7);
        c cVar8 = this.K;
        s.f fVarK2 = cVar6.k(cVar8);
        c cVar9 = this.J;
        s.f fVarK3 = cVar6.k(cVar9);
        c cVar10 = this.L;
        s.f fVarK4 = cVar6.k(cVar10);
        c cVar11 = this.M;
        s.f fVarK5 = cVar6.k(cVar11);
        d dVar3 = this.T;
        if (dVar3 != null) {
            int[] iArr2 = dVar3.f3791p0;
            i4 = 0;
            i6 = iArr2[0] == 2 ? 1 : 0;
            int i33 = iArr2[1] == 2 ? 1 : 0;
            int i34 = this.f3792q;
            if (i34 != 1) {
                if (i34 == 2) {
                    i6 = 0;
                } else if (i34 != 3) {
                }
                i5 = i33;
            } else {
                i5 = 0;
            }
            i7 = this.g0;
            zArr = this.S;
            i8 = i5;
            if (i7 == 8) {
                arrayList = this.R;
                size = arrayList.size();
                i9 = i6;
                i32 = i4;
                while (true) {
                    if (i32 < size) {
                        if (!zArr[i4] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i35 = size;
                    hashSet2 = ((c) arrayList.get(i32)).f3757a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i32++;
                    size = i35;
                }
            } else {
                i9 = i6;
            }
            z5 = this.f3781k;
            if (z5 || this.f3783l) {
                if (z5) {
                    cVar6.d(fVarK, this.Y);
                    cVar6.d(fVarK2, this.Y + this.U);
                    if (i9 != 0 && (dVar2 = this.T) != null) {
                        eVar2 = (e) dVar2;
                        weakReference3 = eVar2.H0;
                        if (weakReference3 != null || weakReference3.get() == null || cVar7.d() > ((c) eVar2.H0.get()).d()) {
                            eVar2.H0 = new WeakReference(cVar7);
                        }
                        weakReference4 = eVar2.J0;
                        if (weakReference4 != null || weakReference4.get() == null || cVar8.d() > ((c) eVar2.J0.get()).d()) {
                            eVar2.J0 = new WeakReference(cVar8);
                        }
                    }
                }
                if (this.f3783l) {
                    cVar6.d(fVarK3, this.Z);
                    cVar6.d(fVarK4, this.Z + this.V);
                    hashSet = cVar11.f3757a;
                    if (hashSet != null && hashSet.size() > 0) {
                        cVar6.d(fVarK5, this.Z + this.f3766a0);
                    }
                    if (i8 != 0 && (dVar = this.T) != null) {
                        eVar = (e) dVar;
                        weakReference = eVar.G0;
                        if (weakReference != null || weakReference.get() == null || cVar9.d() > ((c) eVar.G0.get()).d()) {
                            eVar.G0 = new WeakReference(cVar9);
                        }
                        weakReference2 = eVar.I0;
                        if (weakReference2 != null || weakReference2.get() == null || cVar10.d() > ((c) eVar.I0.get()).d()) {
                            eVar.I0 = new WeakReference(cVar10);
                        }
                    }
                }
                if (this.f3781k && this.f3783l) {
                    ?? r12 = i4;
                    this.f3781k = r12;
                    this.f3783l = r12;
                    return;
                }
            }
            zArr2 = this.f;
            if (z4 || (kVar2 = this.f3771d) == null || (mVar2 = this.f3772e) == null) {
                cVar2 = cVar11;
                zArr3 = zArr2;
            } else {
                cVar2 = cVar11;
                v.f fVar8 = kVar2.f4275h;
                zArr3 = zArr2;
                if (fVar8.f4254j && kVar2.f4276i.f4254j && mVar2.f4275h.f4254j && mVar2.f4276i.f4254j) {
                    cVar6.d(fVarK, fVar8.f4251g);
                    cVar6.d(fVarK2, this.f3771d.f4276i.f4251g);
                    cVar6.d(fVarK3, this.f3772e.f4275h.f4251g);
                    cVar6.d(fVarK4, this.f3772e.f4276i.f4251g);
                    cVar6.d(fVarK5, this.f3772e.f4262k.f4251g);
                    if (this.T == null) {
                        z16 = false;
                    } else {
                        if (i9 != 0 && zArr3[0] && !x()) {
                            cVar6.f(cVar6.k(this.T.K), fVarK2, 0, 8);
                        }
                        if (i8 == 0 || !zArr3[1] || y()) {
                            z16 = false;
                        } else {
                            z16 = false;
                            cVar6.f(cVar6.k(this.T.L), fVarK4, 0, 8);
                        }
                    }
                    this.f3781k = z16;
                    this.f3783l = z16;
                    return;
                }
            }
            if (this.T != null) {
                if (w(0)) {
                    ((e) this.T).R(this, 0);
                    zX = true;
                    i31 = 1;
                } else {
                    zX = x();
                    i31 = 1;
                }
                if (w(i31)) {
                    ((e) this.T).R(this, i31);
                    zY = true;
                } else {
                    zY = y();
                }
                if (zX && i9 != 0 && this.g0 != 8 && cVar7.f == null && cVar8.f == null) {
                    cVar6.f(cVar6.k(this.T.K), fVarK2, 0, 1);
                }
                if (!zY && i8 != 0 && this.g0 != 8 && cVar9.f == null && cVar10.f == null && cVar2 == null) {
                    cVar6.f(cVar6.k(this.T.L), fVarK4, 0, 1);
                }
                z7 = zY;
                z6 = zX;
            } else {
                cVar7 = cVar7;
                z6 = false;
                z7 = false;
            }
            i10 = this.U;
            i11 = this.f3768b0;
            if (i10 >= i11) {
                i11 = i10;
            }
            i12 = this.V;
            i13 = this.f3770c0;
            if (i12 < i13) {
                i14 = i13;
            } else {
                i14 = i12;
            }
            iArr = this.f3791p0;
            i15 = iArr[0];
            if (i15 != 3) {
                z8 = true;
            } else {
                z8 = false;
            }
            i16 = iArr[1];
            if (i16 != 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i36 = this.X;
            this.A = i36;
            f = this.W;
            this.B = f;
            i17 = this.f3793r;
            i18 = this.f3794s;
            if (f > 0.0f) {
                cVar3 = cVar10;
                if (this.g0 != 8) {
                    if (i15 == 3 || i17 != 0) {
                        i20 = i17;
                    } else {
                        i20 = 3;
                    }
                    if (i16 == 3 || i18 != 0) {
                        i30 = i18;
                    } else {
                        i30 = 3;
                    }
                    if (i15 == 3 || i16 != 3 || i20 != 3 || i30 != 3) {
                        if (i15 != 3 && i20 == 3) {
                            this.A = 0;
                            i11 = (int) (f * i12);
                            if (i16 != 3) {
                                cVar2 = cVar2;
                                i19 = i14;
                                i20 = 4;
                                z10 = false;
                            }
                            i21 = i30;
                            int[] iArr3 = this.f3795t;
                            iArr3[0] = i20;
                            iArr3[1] = i21;
                            if (z10) {
                                int i37 = this.A;
                                i22 = -1;
                                if (i37 != 0) {
                                }
                                if (z10) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (iArr[0] == 2) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    i11 = 0;
                                }
                                cVar4 = this.P;
                                boolean z17 = !cVar4.h();
                                char c4 = '\b';
                                boolean z18 = zArr[0];
                                boolean z19 = zArr[1];
                                i23 = this.f3788o;
                                int[] iArr4 = this.C;
                                if (i23 != 2) {
                                    cVar5 = cVar2;
                                    fVar = fVarK;
                                    fVar2 = fVarK2;
                                    fVar3 = fVarK5;
                                    z13 = z6;
                                    r4 = i9;
                                    r5 = i8;
                                    i24 = i20;
                                } else {
                                    cVar5 = cVar2;
                                    fVar = fVarK;
                                    fVar2 = fVarK2;
                                    fVar3 = fVarK5;
                                    z13 = z6;
                                    r4 = i9;
                                    r5 = i8;
                                    i24 = i20;
                                }
                                if (z4) {
                                    fVar4 = r33;
                                    fVar5 = fVarK4;
                                    fVar6 = fVar3;
                                    i25 = 0;
                                    i26 = 8;
                                    z14 = true;
                                    i27 = 1;
                                } else {
                                    fVar4 = r33;
                                    fVar5 = fVarK4;
                                    fVar6 = fVar3;
                                    i25 = 0;
                                    i26 = 8;
                                    z14 = true;
                                    i27 = 1;
                                }
                                if (this.f3790p == 2) {
                                    i27 = i25;
                                }
                                if (i27 != 0) {
                                    fVar7 = fVar4;
                                } else {
                                    fVar7 = fVar4;
                                }
                                if (z10) {
                                    i28 = this.A;
                                    f4 = this.B;
                                    if (i28 == 1) {
                                        s.b bVarL = cVar6.l();
                                        bVarL.f3627d.g(fVar5, -1.0f);
                                        bVarL.f3627d.g(fVar7, 1.0f);
                                        bVarL.f3627d.g(fVar2, f4);
                                        bVarL.f3627d.g(fVar, -f4);
                                        cVar6.c(bVarL);
                                    } else {
                                        s.b bVarL2 = cVar6.l();
                                        bVarL2.f3627d.g(fVar2, -1.0f);
                                        bVarL2.f3627d.g(fVar, 1.0f);
                                        bVarL2.f3627d.g(fVar5, f4);
                                        bVarL2.f3627d.g(fVar7, -f4);
                                        cVar6.c(bVarL2);
                                    }
                                }
                                if (cVar4.h()) {
                                    d dVar4 = cVar4.f.f3760d;
                                    float radians = (float) Math.toRadians(this.D + 90.0f);
                                    int iE = cVar4.e();
                                    s.f fVarK6 = cVar6.k(i(2));
                                    s.f fVarK7 = cVar6.k(i(3));
                                    s.f fVarK8 = cVar6.k(i(4));
                                    s.f fVarK9 = cVar6.k(i(5));
                                    s.f fVarK10 = cVar6.k(dVar4.i(2));
                                    s.f fVarK11 = cVar6.k(dVar4.i(3));
                                    s.f fVarK12 = cVar6.k(dVar4.i(4));
                                    s.f fVarK13 = cVar6.k(dVar4.i(5));
                                    s.b bVarL3 = cVar6.l();
                                    double d5 = radians;
                                    double dSin = Math.sin(d5);
                                    double d6 = iE;
                                    bVarL3.f3627d.g(fVarK11, 0.5f);
                                    bVarL3.f3627d.g(fVarK13, 0.5f);
                                    bVarL3.f3627d.g(fVarK7, -0.5f);
                                    bVarL3.f3627d.g(fVarK9, -0.5f);
                                    bVarL3.f3625b = -((float) (dSin * d6));
                                    cVar6.c(bVarL3);
                                    s.b bVarL4 = cVar6.l();
                                    float fCos = (float) (Math.cos(d5) * d6);
                                    bVarL4.f3627d.g(fVarK10, 0.5f);
                                    bVarL4.f3627d.g(fVarK12, 0.5f);
                                    bVarL4.f3627d.g(fVarK6, -0.5f);
                                    bVarL4.f3627d.g(fVarK8, -0.5f);
                                    bVarL4.f3625b = -fCos;
                                    cVar6.c(bVarL4);
                                }
                                this.f3781k = false;
                                this.f3783l = false;
                            }
                            i22 = -1;
                            if (z10) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (iArr[0] == 2) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                i11 = 0;
                            }
                            cVar4 = this.P;
                            boolean z110 = !cVar4.h();
                            char c5 = '\b';
                            boolean z111 = zArr[0];
                            boolean z112 = zArr[1];
                            i23 = this.f3788o;
                            int[] iArr5 = this.C;
                            if (i23 != 2) {
                                cVar5 = cVar2;
                                fVar = fVarK;
                                fVar2 = fVarK2;
                                fVar3 = fVarK5;
                                z13 = z6;
                                r4 = i9;
                                r5 = i8;
                                i24 = i20;
                            } else {
                                cVar5 = cVar2;
                                fVar = fVarK;
                                fVar2 = fVarK2;
                                fVar3 = fVarK5;
                                z13 = z6;
                                r4 = i9;
                                r5 = i8;
                                i24 = i20;
                            }
                            if (z4) {
                                fVar4 = r33;
                                fVar5 = fVarK4;
                                fVar6 = fVar3;
                                i25 = 0;
                                i26 = 8;
                                z14 = true;
                                i27 = 1;
                            } else {
                                fVar4 = r33;
                                fVar5 = fVarK4;
                                fVar6 = fVar3;
                                i25 = 0;
                                i26 = 8;
                                z14 = true;
                                i27 = 1;
                            }
                            if (this.f3790p == 2) {
                                i27 = i25;
                            }
                            if (i27 != 0) {
                                fVar7 = fVar4;
                            } else {
                                fVar7 = fVar4;
                            }
                            if (z10) {
                                i28 = this.A;
                                f4 = this.B;
                                if (i28 == 1) {
                                    s.b bVarL5 = cVar6.l();
                                    bVarL5.f3627d.g(fVar5, -1.0f);
                                    bVarL5.f3627d.g(fVar7, 1.0f);
                                    bVarL5.f3627d.g(fVar2, f4);
                                    bVarL5.f3627d.g(fVar, -f4);
                                    cVar6.c(bVarL5);
                                } else {
                                    s.b bVarL6 = cVar6.l();
                                    bVarL6.f3627d.g(fVar2, -1.0f);
                                    bVarL6.f3627d.g(fVar, 1.0f);
                                    bVarL6.f3627d.g(fVar5, f4);
                                    bVarL6.f3627d.g(fVar7, -f4);
                                    cVar6.c(bVarL6);
                                }
                            }
                            if (cVar4.h()) {
                                d dVar5 = cVar4.f.f3760d;
                                float radians2 = (float) Math.toRadians(this.D + 90.0f);
                                int iE2 = cVar4.e();
                                s.f fVarK14 = cVar6.k(i(2));
                                s.f fVarK15 = cVar6.k(i(3));
                                s.f fVarK16 = cVar6.k(i(4));
                                s.f fVarK17 = cVar6.k(i(5));
                                s.f fVarK18 = cVar6.k(dVar5.i(2));
                                s.f fVarK19 = cVar6.k(dVar5.i(3));
                                s.f fVarK110 = cVar6.k(dVar5.i(4));
                                s.f fVarK111 = cVar6.k(dVar5.i(5));
                                s.b bVarL7 = cVar6.l();
                                double d7 = radians2;
                                double dSin2 = Math.sin(d7);
                                double d8 = iE2;
                                bVarL7.f3627d.g(fVarK19, 0.5f);
                                bVarL7.f3627d.g(fVarK111, 0.5f);
                                bVarL7.f3627d.g(fVarK15, -0.5f);
                                bVarL7.f3627d.g(fVarK17, -0.5f);
                                bVarL7.f3625b = -((float) (dSin2 * d8));
                                cVar6.c(bVarL7);
                                s.b bVarL8 = cVar6.l();
                                float fCos2 = (float) (Math.cos(d7) * d8);
                                bVarL8.f3627d.g(fVarK18, 0.5f);
                                bVarL8.f3627d.g(fVarK110, 0.5f);
                                bVarL8.f3627d.g(fVarK14, -0.5f);
                                bVarL8.f3627d.g(fVarK16, -0.5f);
                                bVarL8.f3625b = -fCos2;
                                cVar6.c(bVarL8);
                            }
                            this.f3781k = false;
                            this.f3783l = false;
                        }
                        if (i16 != 3 && i30 == 3) {
                            this.A = 1;
                            if (i36 == -1) {
                                this.B = 1.0f / f;
                            }
                            i19 = (int) (this.B * i10);
                            if (i15 != 3) {
                                i20 = i20;
                                i21 = 4;
                            }
                        }
                        z10 = true;
                        i21 = i30;
                        int[] iArr6 = this.f3795t;
                        iArr6[0] = i20;
                        iArr6[1] = i21;
                        if (z10) {
                            int i38 = this.A;
                            i22 = -1;
                            boolean z20 = i38 != 0 || i38 == -1;
                            if (z10 || !((i29 = this.A) == 1 || i29 == i22)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (iArr[0] == 2 || !(this instanceof e)) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (z12) {
                                i11 = 0;
                            }
                            cVar4 = this.P;
                            boolean z113 = !cVar4.h();
                            char c6 = '\b';
                            boolean z114 = zArr[0];
                            boolean z115 = zArr[1];
                            i23 = this.f3788o;
                            int[] iArr7 = this.C;
                            if (i23 != 2 || this.f3781k) {
                                cVar5 = cVar2;
                                fVar = fVarK;
                                fVar2 = fVarK2;
                                fVar3 = fVarK5;
                                z13 = z6;
                                r4 = i9;
                                r5 = i8;
                                i24 = i20;
                            } else {
                                if (z4 && (kVar = this.f3771d) != null) {
                                    v.f fVar9 = kVar.f4275h;
                                    if (fVar9.f4254j && kVar.f4276i.f4254j) {
                                        if (z4) {
                                            cVar6.d(fVarK, fVar9.f4251g);
                                            cVar6.d(fVarK2, this.f3771d.f4276i.f4251g);
                                            if (this.T != null && i9 != 0 && zArr3[0] && !x()) {
                                                cVar6.f(cVar6.k(this.T.K), fVarK2, 0, 8);
                                            }
                                        }
                                        cVar5 = cVar2;
                                        fVar = fVarK;
                                        fVar2 = fVarK2;
                                        fVar3 = fVarK5;
                                        z13 = z6;
                                        r4 = i9;
                                        r5 = i8;
                                        i24 = i20;
                                    } else {
                                        c6 = '\b';
                                    }
                                }
                                d dVar6 = this.T;
                                s.f fVarK20 = dVar6 != null ? cVar6.k(dVar6.K) : null;
                                d dVar7 = this.T;
                                s.f fVarK21 = dVar7 != null ? cVar6.k(dVar7.I) : null;
                                ?? r6 = i9;
                                i24 = i20;
                                z13 = z6;
                                boolean z21 = z20;
                                fVar = fVarK;
                                ?? r7 = i8;
                                fVar2 = fVarK2;
                                cVar5 = cVar2;
                                fVar3 = fVarK5;
                                cVar6 = cVar;
                                d(cVar6, true, r6, r7, zArr3[0], fVarK21, fVarK20, iArr[0], z12, this.I, this.K, this.Y, i11, this.f3768b0, iArr7[0], this.d0, z21, iArr[1] == 3, z13, z7, z114, i24, i21, this.f3796u, this.f3797v, this.f3798w, z113);
                                r4 = r6;
                                r5 = r7;
                            }
                            if (z4 || (mVar = this.f3772e) == null) {
                                fVar4 = r33;
                                fVar5 = fVarK4;
                                fVar6 = fVar3;
                                i25 = 0;
                                i26 = 8;
                                z14 = true;
                                i27 = 1;
                            } else {
                                v.f fVar10 = mVar.f4275h;
                                if (fVar10.f4254j && mVar.f4276i.f4254j) {
                                    int i39 = fVar10.f4251g;
                                    fVar4 = fVarK3;
                                    cVar6.d(fVar4, i39);
                                    fVar5 = fVarK4;
                                    cVar6.d(fVar5, this.f3772e.f4276i.f4251g);
                                    fVar6 = fVar3;
                                    cVar6.d(fVar6, this.f3772e.f4262k.f4251g);
                                    d dVar8 = this.T;
                                    if (dVar8 == null || z7 || r5 == 0) {
                                        i25 = 0;
                                        i26 = 8;
                                        z15 = true;
                                    } else {
                                        z15 = true;
                                        z15 = true;
                                        if (zArr3[1]) {
                                            i25 = 0;
                                            i26 = 8;
                                            cVar6.f(cVar6.k(dVar8.L), fVar5, 0, 8);
                                        } else {
                                            i25 = 0;
                                            i26 = 8;
                                        }
                                    }
                                    i27 = i25;
                                    z14 = z15;
                                } else {
                                    fVar4 = r33;
                                    fVar5 = fVarK4;
                                    fVar6 = fVar3;
                                    i25 = 0;
                                    i26 = 8;
                                    z14 = true;
                                    i27 = 1;
                                }
                            }
                            if (this.f3790p == 2) {
                                i27 = i25;
                            }
                            if (i27 != 0 || this.f3783l) {
                                fVar7 = fVar4;
                            } else {
                                int i40 = (iArr[z14 ? 1 : 0] == 2 && (this instanceof e)) ? z14 ? 1 : 0 : i25;
                                int i41 = i40 != 0 ? i25 : i19;
                                d dVar9 = this.T;
                                s.f fVarK22 = dVar9 != null ? cVar6.k(dVar9.L) : null;
                                d dVar10 = this.T;
                                s.f fVarK23 = dVar10 != null ? cVar6.k(dVar10.J) : null;
                                int i42 = this.f3766a0;
                                if (i42 > 0 || this.g0 == i26) {
                                    r27 = z113;
                                    c cVar12 = cVar5;
                                    if (cVar12.f != null) {
                                        cVar6.e(fVar6, fVar4, i42, i26);
                                        cVar6.e(fVar6, cVar6.k(cVar12.f), cVar12.e(), i26);
                                        if (r5 != 0) {
                                            cVar6.f(fVarK22, cVar6.k(cVar3), i25, 5);
                                        }
                                        r27 = i25;
                                    } else if (this.g0 == i26) {
                                        cVar6.e(fVar6, fVar4, cVar12.e(), i26);
                                        r27 = z113;
                                    } else {
                                        cVar6.e(fVar6, fVar4, i42, i26);
                                        r27 = z113;
                                    }
                                }
                                r27 = z113;
                                boolean z22 = zArr3[z14 ? 1 : 0];
                                int i43 = i25;
                                int i44 = iArr[z14 ? 1 : 0];
                                int i45 = this.Z;
                                int i46 = this.f3770c0;
                                int i47 = iArr7[z14 ? 1 : 0];
                                float f5 = this.f3773e0;
                                int i48 = iArr[i43];
                                boolean z23 = z14 ? 1 : 0;
                                ?? r18 = z14;
                                if (i48 != 3) {
                                    r18 = i43;
                                }
                                fVar7 = fVar4;
                                cVar6 = cVar;
                                d(cVar6, false, r5, r4, z22, fVarK23, fVarK22, i44, i40, this.J, this.L, i45, i41, i46, i47, f5, z11, r18, z7, z13, z115, i21, i24, this.f3799x, this.f3800y, this.f3801z, r27);
                            }
                            if (z10) {
                                i28 = this.A;
                                f4 = this.B;
                                if (i28 == 1) {
                                    s.b bVarL9 = cVar6.l();
                                    bVarL9.f3627d.g(fVar5, -1.0f);
                                    bVarL9.f3627d.g(fVar7, 1.0f);
                                    bVarL9.f3627d.g(fVar2, f4);
                                    bVarL9.f3627d.g(fVar, -f4);
                                    cVar6.c(bVarL9);
                                } else {
                                    s.b bVarL10 = cVar6.l();
                                    bVarL10.f3627d.g(fVar2, -1.0f);
                                    bVarL10.f3627d.g(fVar, 1.0f);
                                    bVarL10.f3627d.g(fVar5, f4);
                                    bVarL10.f3627d.g(fVar7, -f4);
                                    cVar6.c(bVarL10);
                                }
                            }
                            if (cVar4.h()) {
                                d dVar11 = cVar4.f.f3760d;
                                float radians3 = (float) Math.toRadians(this.D + 90.0f);
                                int iE3 = cVar4.e();
                                s.f fVarK112 = cVar6.k(i(2));
                                s.f fVarK113 = cVar6.k(i(3));
                                s.f fVarK114 = cVar6.k(i(4));
                                s.f fVarK115 = cVar6.k(i(5));
                                s.f fVarK116 = cVar6.k(dVar11.i(2));
                                s.f fVarK117 = cVar6.k(dVar11.i(3));
                                s.f fVarK118 = cVar6.k(dVar11.i(4));
                                s.f fVarK119 = cVar6.k(dVar11.i(5));
                                s.b bVarL11 = cVar6.l();
                                double d9 = radians3;
                                double dSin3 = Math.sin(d9);
                                double d10 = iE3;
                                bVarL11.f3627d.g(fVarK117, 0.5f);
                                bVarL11.f3627d.g(fVarK119, 0.5f);
                                bVarL11.f3627d.g(fVarK113, -0.5f);
                                bVarL11.f3627d.g(fVarK115, -0.5f);
                                bVarL11.f3625b = -((float) (dSin3 * d10));
                                cVar6.c(bVarL11);
                                s.b bVarL12 = cVar6.l();
                                float fCos3 = (float) (Math.cos(d9) * d10);
                                bVarL12.f3627d.g(fVarK116, 0.5f);
                                bVarL12.f3627d.g(fVarK118, 0.5f);
                                bVarL12.f3627d.g(fVarK112, -0.5f);
                                bVarL12.f3627d.g(fVarK114, -0.5f);
                                bVarL12.f3625b = -fCos3;
                                cVar6.c(bVarL12);
                            }
                            this.f3781k = false;
                            this.f3783l = false;
                        }
                        i22 = -1;
                        if (z10) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (iArr[0] == 2) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            i11 = 0;
                        }
                        cVar4 = this.P;
                        boolean z116 = !cVar4.h();
                        char c7 = '\b';
                        boolean z117 = zArr[0];
                        boolean z118 = zArr[1];
                        i23 = this.f3788o;
                        int[] iArr8 = this.C;
                        if (i23 != 2) {
                            cVar5 = cVar2;
                            fVar = fVarK;
                            fVar2 = fVarK2;
                            fVar3 = fVarK5;
                            z13 = z6;
                            r4 = i9;
                            r5 = i8;
                            i24 = i20;
                        } else {
                            cVar5 = cVar2;
                            fVar = fVarK;
                            fVar2 = fVarK2;
                            fVar3 = fVarK5;
                            z13 = z6;
                            r4 = i9;
                            r5 = i8;
                            i24 = i20;
                        }
                        if (z4) {
                            fVar4 = r33;
                            fVar5 = fVarK4;
                            fVar6 = fVar3;
                            i25 = 0;
                            i26 = 8;
                            z14 = true;
                            i27 = 1;
                        } else {
                            fVar4 = r33;
                            fVar5 = fVarK4;
                            fVar6 = fVar3;
                            i25 = 0;
                            i26 = 8;
                            z14 = true;
                            i27 = 1;
                        }
                        if (this.f3790p == 2) {
                            i27 = i25;
                        }
                        if (i27 != 0) {
                            fVar7 = fVar4;
                        } else {
                            fVar7 = fVar4;
                        }
                        if (z10) {
                            i28 = this.A;
                            f4 = this.B;
                            if (i28 == 1) {
                                s.b bVarL13 = cVar6.l();
                                bVarL13.f3627d.g(fVar5, -1.0f);
                                bVarL13.f3627d.g(fVar7, 1.0f);
                                bVarL13.f3627d.g(fVar2, f4);
                                bVarL13.f3627d.g(fVar, -f4);
                                cVar6.c(bVarL13);
                            } else {
                                s.b bVarL14 = cVar6.l();
                                bVarL14.f3627d.g(fVar2, -1.0f);
                                bVarL14.f3627d.g(fVar, 1.0f);
                                bVarL14.f3627d.g(fVar5, f4);
                                bVarL14.f3627d.g(fVar7, -f4);
                                cVar6.c(bVarL14);
                            }
                        }
                        if (cVar4.h()) {
                            d dVar12 = cVar4.f.f3760d;
                            float radians4 = (float) Math.toRadians(this.D + 90.0f);
                            int iE4 = cVar4.e();
                            s.f fVarK1110 = cVar6.k(i(2));
                            s.f fVarK1111 = cVar6.k(i(3));
                            s.f fVarK1112 = cVar6.k(i(4));
                            s.f fVarK1113 = cVar6.k(i(5));
                            s.f fVarK1114 = cVar6.k(dVar12.i(2));
                            s.f fVarK1115 = cVar6.k(dVar12.i(3));
                            s.f fVarK1116 = cVar6.k(dVar12.i(4));
                            s.f fVarK1117 = cVar6.k(dVar12.i(5));
                            s.b bVarL15 = cVar6.l();
                            double d11 = radians4;
                            double dSin4 = Math.sin(d11);
                            double d12 = iE4;
                            bVarL15.f3627d.g(fVarK1115, 0.5f);
                            bVarL15.f3627d.g(fVarK1117, 0.5f);
                            bVarL15.f3627d.g(fVarK1111, -0.5f);
                            bVarL15.f3627d.g(fVarK1113, -0.5f);
                            bVarL15.f3625b = -((float) (dSin4 * d12));
                            cVar6.c(bVarL15);
                            s.b bVarL16 = cVar6.l();
                            float fCos4 = (float) (Math.cos(d11) * d12);
                            bVarL16.f3627d.g(fVarK1114, 0.5f);
                            bVarL16.f3627d.g(fVarK1116, 0.5f);
                            bVarL16.f3627d.g(fVarK1110, -0.5f);
                            bVarL16.f3627d.g(fVarK1112, -0.5f);
                            bVarL16.f3625b = -fCos4;
                            cVar6.c(bVarL16);
                        }
                        this.f3781k = false;
                        this.f3783l = false;
                    }
                    if (i36 == -1) {
                        if (z8 && !z9) {
                            this.A = 0;
                        } else if (!z8 && z9) {
                            this.A = 1;
                            if (i36 == -1) {
                                this.B = 1.0f / f;
                            }
                        }
                    }
                    if (this.A == 0 && (!cVar9.h() || !cVar3.h())) {
                        this.A = 1;
                    } else if (this.A == 1 && (!cVar7.h() || !cVar8.h())) {
                        this.A = 0;
                    }
                    if (this.A == -1 && (!cVar9.h() || !cVar3.h() || !cVar7.h() || !cVar8.h())) {
                        if (cVar9.h() && cVar3.h()) {
                            this.A = 0;
                        } else if (cVar7.h() && cVar8.h()) {
                            this.B = 1.0f / this.B;
                            this.A = 1;
                        }
                    }
                    if (this.A == -1) {
                        int i49 = this.f3796u;
                        if (i49 > 0 && this.f3799x == 0) {
                            this.A = 0;
                        } else if (i49 == 0 && this.f3799x > 0) {
                            this.B = 1.0f / this.B;
                            this.A = 1;
                        }
                    }
                    i19 = i14;
                    z10 = true;
                    i21 = i30;
                    int[] iArr9 = this.f3795t;
                    iArr9[0] = i20;
                    iArr9[1] = i21;
                    if (z10) {
                        int i310 = this.A;
                        i22 = -1;
                        if (i310 != 0) {
                        }
                        if (z10) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (iArr[0] == 2) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            i11 = 0;
                        }
                        cVar4 = this.P;
                        boolean z119 = !cVar4.h();
                        char c8 = '\b';
                        boolean z1110 = zArr[0];
                        boolean z1111 = zArr[1];
                        i23 = this.f3788o;
                        int[] iArr10 = this.C;
                        if (i23 != 2) {
                            cVar5 = cVar2;
                            fVar = fVarK;
                            fVar2 = fVarK2;
                            fVar3 = fVarK5;
                            z13 = z6;
                            r4 = i9;
                            r5 = i8;
                            i24 = i20;
                        } else {
                            cVar5 = cVar2;
                            fVar = fVarK;
                            fVar2 = fVarK2;
                            fVar3 = fVarK5;
                            z13 = z6;
                            r4 = i9;
                            r5 = i8;
                            i24 = i20;
                        }
                        if (z4) {
                            fVar4 = r33;
                            fVar5 = fVarK4;
                            fVar6 = fVar3;
                            i25 = 0;
                            i26 = 8;
                            z14 = true;
                            i27 = 1;
                        } else {
                            fVar4 = r33;
                            fVar5 = fVarK4;
                            fVar6 = fVar3;
                            i25 = 0;
                            i26 = 8;
                            z14 = true;
                            i27 = 1;
                        }
                        if (this.f3790p == 2) {
                            i27 = i25;
                        }
                        if (i27 != 0) {
                            fVar7 = fVar4;
                        } else {
                            fVar7 = fVar4;
                        }
                        if (z10) {
                            i28 = this.A;
                            f4 = this.B;
                            if (i28 == 1) {
                                s.b bVarL17 = cVar6.l();
                                bVarL17.f3627d.g(fVar5, -1.0f);
                                bVarL17.f3627d.g(fVar7, 1.0f);
                                bVarL17.f3627d.g(fVar2, f4);
                                bVarL17.f3627d.g(fVar, -f4);
                                cVar6.c(bVarL17);
                            } else {
                                s.b bVarL18 = cVar6.l();
                                bVarL18.f3627d.g(fVar2, -1.0f);
                                bVarL18.f3627d.g(fVar, 1.0f);
                                bVarL18.f3627d.g(fVar5, f4);
                                bVarL18.f3627d.g(fVar7, -f4);
                                cVar6.c(bVarL18);
                            }
                        }
                        if (cVar4.h()) {
                            d dVar13 = cVar4.f.f3760d;
                            float radians5 = (float) Math.toRadians(this.D + 90.0f);
                            int iE5 = cVar4.e();
                            s.f fVarK1118 = cVar6.k(i(2));
                            s.f fVarK1119 = cVar6.k(i(3));
                            s.f fVarK11110 = cVar6.k(i(4));
                            s.f fVarK11111 = cVar6.k(i(5));
                            s.f fVarK11112 = cVar6.k(dVar13.i(2));
                            s.f fVarK11113 = cVar6.k(dVar13.i(3));
                            s.f fVarK11114 = cVar6.k(dVar13.i(4));
                            s.f fVarK11115 = cVar6.k(dVar13.i(5));
                            s.b bVarL19 = cVar6.l();
                            double d13 = radians5;
                            double dSin5 = Math.sin(d13);
                            double d14 = iE5;
                            bVarL19.f3627d.g(fVarK11113, 0.5f);
                            bVarL19.f3627d.g(fVarK11115, 0.5f);
                            bVarL19.f3627d.g(fVarK1119, -0.5f);
                            bVarL19.f3627d.g(fVarK11111, -0.5f);
                            bVarL19.f3625b = -((float) (dSin5 * d14));
                            cVar6.c(bVarL19);
                            s.b bVarL110 = cVar6.l();
                            float fCos5 = (float) (Math.cos(d13) * d14);
                            bVarL110.f3627d.g(fVarK11112, 0.5f);
                            bVarL110.f3627d.g(fVarK11114, 0.5f);
                            bVarL110.f3627d.g(fVarK1118, -0.5f);
                            bVarL110.f3627d.g(fVarK11110, -0.5f);
                            bVarL110.f3625b = -fCos5;
                            cVar6.c(bVarL110);
                        }
                        this.f3781k = false;
                        this.f3783l = false;
                    }
                    i22 = -1;
                    if (z10) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (iArr[0] == 2) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i11 = 0;
                    }
                    cVar4 = this.P;
                    boolean z1112 = !cVar4.h();
                    char c9 = '\b';
                    boolean z1113 = zArr[0];
                    boolean z1114 = zArr[1];
                    i23 = this.f3788o;
                    int[] iArr11 = this.C;
                    if (i23 != 2) {
                        cVar5 = cVar2;
                        fVar = fVarK;
                        fVar2 = fVarK2;
                        fVar3 = fVarK5;
                        z13 = z6;
                        r4 = i9;
                        r5 = i8;
                        i24 = i20;
                    } else {
                        cVar5 = cVar2;
                        fVar = fVarK;
                        fVar2 = fVarK2;
                        fVar3 = fVarK5;
                        z13 = z6;
                        r4 = i9;
                        r5 = i8;
                        i24 = i20;
                    }
                    if (z4) {
                        fVar4 = r33;
                        fVar5 = fVarK4;
                        fVar6 = fVar3;
                        i25 = 0;
                        i26 = 8;
                        z14 = true;
                        i27 = 1;
                    } else {
                        fVar4 = r33;
                        fVar5 = fVarK4;
                        fVar6 = fVar3;
                        i25 = 0;
                        i26 = 8;
                        z14 = true;
                        i27 = 1;
                    }
                    if (this.f3790p == 2) {
                        i27 = i25;
                    }
                    if (i27 != 0) {
                        fVar7 = fVar4;
                    } else {
                        fVar7 = fVar4;
                    }
                    if (z10) {
                        i28 = this.A;
                        f4 = this.B;
                        if (i28 == 1) {
                            s.b bVarL111 = cVar6.l();
                            bVarL111.f3627d.g(fVar5, -1.0f);
                            bVarL111.f3627d.g(fVar7, 1.0f);
                            bVarL111.f3627d.g(fVar2, f4);
                            bVarL111.f3627d.g(fVar, -f4);
                            cVar6.c(bVarL111);
                        } else {
                            s.b bVarL112 = cVar6.l();
                            bVarL112.f3627d.g(fVar2, -1.0f);
                            bVarL112.f3627d.g(fVar, 1.0f);
                            bVarL112.f3627d.g(fVar5, f4);
                            bVarL112.f3627d.g(fVar7, -f4);
                            cVar6.c(bVarL112);
                        }
                    }
                    if (cVar4.h()) {
                        d dVar14 = cVar4.f.f3760d;
                        float radians6 = (float) Math.toRadians(this.D + 90.0f);
                        int iE6 = cVar4.e();
                        s.f fVarK11116 = cVar6.k(i(2));
                        s.f fVarK11117 = cVar6.k(i(3));
                        s.f fVarK11118 = cVar6.k(i(4));
                        s.f fVarK11119 = cVar6.k(i(5));
                        s.f fVarK111110 = cVar6.k(dVar14.i(2));
                        s.f fVarK111111 = cVar6.k(dVar14.i(3));
                        s.f fVarK111112 = cVar6.k(dVar14.i(4));
                        s.f fVarK111113 = cVar6.k(dVar14.i(5));
                        s.b bVarL113 = cVar6.l();
                        double d15 = radians6;
                        double dSin6 = Math.sin(d15);
                        double d16 = iE6;
                        bVarL113.f3627d.g(fVarK111111, 0.5f);
                        bVarL113.f3627d.g(fVarK111113, 0.5f);
                        bVarL113.f3627d.g(fVarK11117, -0.5f);
                        bVarL113.f3627d.g(fVarK11119, -0.5f);
                        bVarL113.f3625b = -((float) (dSin6 * d16));
                        cVar6.c(bVarL113);
                        s.b bVarL114 = cVar6.l();
                        float fCos6 = (float) (Math.cos(d15) * d16);
                        bVarL114.f3627d.g(fVarK111110, 0.5f);
                        bVarL114.f3627d.g(fVarK111112, 0.5f);
                        bVarL114.f3627d.g(fVarK11116, -0.5f);
                        bVarL114.f3627d.g(fVarK11118, -0.5f);
                        bVarL114.f3625b = -fCos6;
                        cVar6.c(bVarL114);
                    }
                    this.f3781k = false;
                    this.f3783l = false;
                }
                z10 = false;
                int[] iArr12 = this.f3795t;
                iArr12[0] = i20;
                iArr12[1] = i21;
                if (z10) {
                    int i311 = this.A;
                    i22 = -1;
                    if (i311 != 0) {
                    }
                    if (z10) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (iArr[0] == 2) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i11 = 0;
                    }
                    cVar4 = this.P;
                    boolean z1115 = !cVar4.h();
                    char c10 = '\b';
                    boolean z1116 = zArr[0];
                    boolean z1117 = zArr[1];
                    i23 = this.f3788o;
                    int[] iArr13 = this.C;
                    if (i23 != 2) {
                        cVar5 = cVar2;
                        fVar = fVarK;
                        fVar2 = fVarK2;
                        fVar3 = fVarK5;
                        z13 = z6;
                        r4 = i9;
                        r5 = i8;
                        i24 = i20;
                    } else {
                        cVar5 = cVar2;
                        fVar = fVarK;
                        fVar2 = fVarK2;
                        fVar3 = fVarK5;
                        z13 = z6;
                        r4 = i9;
                        r5 = i8;
                        i24 = i20;
                    }
                    if (z4) {
                        fVar4 = r33;
                        fVar5 = fVarK4;
                        fVar6 = fVar3;
                        i25 = 0;
                        i26 = 8;
                        z14 = true;
                        i27 = 1;
                    } else {
                        fVar4 = r33;
                        fVar5 = fVarK4;
                        fVar6 = fVar3;
                        i25 = 0;
                        i26 = 8;
                        z14 = true;
                        i27 = 1;
                    }
                    if (this.f3790p == 2) {
                        i27 = i25;
                    }
                    if (i27 != 0) {
                        fVar7 = fVar4;
                    } else {
                        fVar7 = fVar4;
                    }
                    if (z10) {
                        i28 = this.A;
                        f4 = this.B;
                        if (i28 == 1) {
                            s.b bVarL115 = cVar6.l();
                            bVarL115.f3627d.g(fVar5, -1.0f);
                            bVarL115.f3627d.g(fVar7, 1.0f);
                            bVarL115.f3627d.g(fVar2, f4);
                            bVarL115.f3627d.g(fVar, -f4);
                            cVar6.c(bVarL115);
                        } else {
                            s.b bVarL116 = cVar6.l();
                            bVarL116.f3627d.g(fVar2, -1.0f);
                            bVarL116.f3627d.g(fVar, 1.0f);
                            bVarL116.f3627d.g(fVar5, f4);
                            bVarL116.f3627d.g(fVar7, -f4);
                            cVar6.c(bVarL116);
                        }
                    }
                    if (cVar4.h()) {
                        d dVar15 = cVar4.f.f3760d;
                        float radians7 = (float) Math.toRadians(this.D + 90.0f);
                        int iE7 = cVar4.e();
                        s.f fVarK111114 = cVar6.k(i(2));
                        s.f fVarK111115 = cVar6.k(i(3));
                        s.f fVarK111116 = cVar6.k(i(4));
                        s.f fVarK111117 = cVar6.k(i(5));
                        s.f fVarK111118 = cVar6.k(dVar15.i(2));
                        s.f fVarK111119 = cVar6.k(dVar15.i(3));
                        s.f fVarK1111110 = cVar6.k(dVar15.i(4));
                        s.f fVarK1111111 = cVar6.k(dVar15.i(5));
                        s.b bVarL117 = cVar6.l();
                        double d17 = radians7;
                        double dSin7 = Math.sin(d17);
                        double d18 = iE7;
                        bVarL117.f3627d.g(fVarK111119, 0.5f);
                        bVarL117.f3627d.g(fVarK1111111, 0.5f);
                        bVarL117.f3627d.g(fVarK111115, -0.5f);
                        bVarL117.f3627d.g(fVarK111117, -0.5f);
                        bVarL117.f3625b = -((float) (dSin7 * d18));
                        cVar6.c(bVarL117);
                        s.b bVarL118 = cVar6.l();
                        float fCos7 = (float) (Math.cos(d17) * d18);
                        bVarL118.f3627d.g(fVarK111118, 0.5f);
                        bVarL118.f3627d.g(fVarK1111110, 0.5f);
                        bVarL118.f3627d.g(fVarK111114, -0.5f);
                        bVarL118.f3627d.g(fVarK111116, -0.5f);
                        bVarL118.f3625b = -fCos7;
                        cVar6.c(bVarL118);
                    }
                    this.f3781k = false;
                    this.f3783l = false;
                }
                i22 = -1;
                if (z10) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (iArr[0] == 2) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i11 = 0;
                }
                cVar4 = this.P;
                boolean z1118 = !cVar4.h();
                char c11 = '\b';
                boolean z1119 = zArr[0];
                boolean z11110 = zArr[1];
                i23 = this.f3788o;
                int[] iArr14 = this.C;
                if (i23 != 2) {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z13 = z6;
                    r4 = i9;
                    r5 = i8;
                    i24 = i20;
                } else {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z13 = z6;
                    r4 = i9;
                    r5 = i8;
                    i24 = i20;
                }
                if (z4) {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i25 = 0;
                    i26 = 8;
                    z14 = true;
                    i27 = 1;
                } else {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i25 = 0;
                    i26 = 8;
                    z14 = true;
                    i27 = 1;
                }
                if (this.f3790p == 2) {
                    i27 = i25;
                }
                if (i27 != 0) {
                    fVar7 = fVar4;
                } else {
                    fVar7 = fVar4;
                }
                if (z10) {
                    i28 = this.A;
                    f4 = this.B;
                    if (i28 == 1) {
                        s.b bVarL119 = cVar6.l();
                        bVarL119.f3627d.g(fVar5, -1.0f);
                        bVarL119.f3627d.g(fVar7, 1.0f);
                        bVarL119.f3627d.g(fVar2, f4);
                        bVarL119.f3627d.g(fVar, -f4);
                        cVar6.c(bVarL119);
                    } else {
                        s.b bVarL1110 = cVar6.l();
                        bVarL1110.f3627d.g(fVar2, -1.0f);
                        bVarL1110.f3627d.g(fVar, 1.0f);
                        bVarL1110.f3627d.g(fVar5, f4);
                        bVarL1110.f3627d.g(fVar7, -f4);
                        cVar6.c(bVarL1110);
                    }
                }
                if (cVar4.h()) {
                    d dVar16 = cVar4.f.f3760d;
                    float radians8 = (float) Math.toRadians(this.D + 90.0f);
                    int iE8 = cVar4.e();
                    s.f fVarK1111112 = cVar6.k(i(2));
                    s.f fVarK1111113 = cVar6.k(i(3));
                    s.f fVarK1111114 = cVar6.k(i(4));
                    s.f fVarK1111115 = cVar6.k(i(5));
                    s.f fVarK1111116 = cVar6.k(dVar16.i(2));
                    s.f fVarK1111117 = cVar6.k(dVar16.i(3));
                    s.f fVarK1111118 = cVar6.k(dVar16.i(4));
                    s.f fVarK1111119 = cVar6.k(dVar16.i(5));
                    s.b bVarL1111 = cVar6.l();
                    double d19 = radians8;
                    double dSin8 = Math.sin(d19);
                    double d110 = iE8;
                    bVarL1111.f3627d.g(fVarK1111117, 0.5f);
                    bVarL1111.f3627d.g(fVarK1111119, 0.5f);
                    bVarL1111.f3627d.g(fVarK1111113, -0.5f);
                    bVarL1111.f3627d.g(fVarK1111115, -0.5f);
                    bVarL1111.f3625b = -((float) (dSin8 * d110));
                    cVar6.c(bVarL1111);
                    s.b bVarL1112 = cVar6.l();
                    float fCos8 = (float) (Math.cos(d19) * d110);
                    bVarL1112.f3627d.g(fVarK1111116, 0.5f);
                    bVarL1112.f3627d.g(fVarK1111118, 0.5f);
                    bVarL1112.f3627d.g(fVarK1111112, -0.5f);
                    bVarL1112.f3627d.g(fVarK1111114, -0.5f);
                    bVarL1112.f3625b = -fCos8;
                    cVar6.c(bVarL1112);
                }
                this.f3781k = false;
                this.f3783l = false;
            }
            cVar3 = cVar10;
            fVarK4 = fVarK4;
            i19 = i14;
            i20 = i17;
            i21 = i18;
            z10 = false;
            int[] iArr15 = this.f3795t;
            iArr15[0] = i20;
            iArr15[1] = i21;
            if (z10) {
                int i312 = this.A;
                i22 = -1;
                if (i312 != 0) {
                }
                if (z10) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (iArr[0] == 2) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i11 = 0;
                }
                cVar4 = this.P;
                boolean z11111 = !cVar4.h();
                char c12 = '\b';
                boolean z11112 = zArr[0];
                boolean z11113 = zArr[1];
                i23 = this.f3788o;
                int[] iArr16 = this.C;
                if (i23 != 2) {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z13 = z6;
                    r4 = i9;
                    r5 = i8;
                    i24 = i20;
                } else {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z13 = z6;
                    r4 = i9;
                    r5 = i8;
                    i24 = i20;
                }
                if (z4) {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i25 = 0;
                    i26 = 8;
                    z14 = true;
                    i27 = 1;
                } else {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i25 = 0;
                    i26 = 8;
                    z14 = true;
                    i27 = 1;
                }
                if (this.f3790p == 2) {
                    i27 = i25;
                }
                if (i27 != 0) {
                    fVar7 = fVar4;
                } else {
                    fVar7 = fVar4;
                }
                if (z10) {
                    i28 = this.A;
                    f4 = this.B;
                    if (i28 == 1) {
                        s.b bVarL1113 = cVar6.l();
                        bVarL1113.f3627d.g(fVar5, -1.0f);
                        bVarL1113.f3627d.g(fVar7, 1.0f);
                        bVarL1113.f3627d.g(fVar2, f4);
                        bVarL1113.f3627d.g(fVar, -f4);
                        cVar6.c(bVarL1113);
                    } else {
                        s.b bVarL1114 = cVar6.l();
                        bVarL1114.f3627d.g(fVar2, -1.0f);
                        bVarL1114.f3627d.g(fVar, 1.0f);
                        bVarL1114.f3627d.g(fVar5, f4);
                        bVarL1114.f3627d.g(fVar7, -f4);
                        cVar6.c(bVarL1114);
                    }
                }
                if (cVar4.h()) {
                    d dVar17 = cVar4.f.f3760d;
                    float radians9 = (float) Math.toRadians(this.D + 90.0f);
                    int iE9 = cVar4.e();
                    s.f fVarK11111110 = cVar6.k(i(2));
                    s.f fVarK11111111 = cVar6.k(i(3));
                    s.f fVarK11111112 = cVar6.k(i(4));
                    s.f fVarK11111113 = cVar6.k(i(5));
                    s.f fVarK11111114 = cVar6.k(dVar17.i(2));
                    s.f fVarK11111115 = cVar6.k(dVar17.i(3));
                    s.f fVarK11111116 = cVar6.k(dVar17.i(4));
                    s.f fVarK11111117 = cVar6.k(dVar17.i(5));
                    s.b bVarL1115 = cVar6.l();
                    double d111 = radians9;
                    double dSin9 = Math.sin(d111);
                    double d112 = iE9;
                    bVarL1115.f3627d.g(fVarK11111115, 0.5f);
                    bVarL1115.f3627d.g(fVarK11111117, 0.5f);
                    bVarL1115.f3627d.g(fVarK11111111, -0.5f);
                    bVarL1115.f3627d.g(fVarK11111113, -0.5f);
                    bVarL1115.f3625b = -((float) (dSin9 * d112));
                    cVar6.c(bVarL1115);
                    s.b bVarL1116 = cVar6.l();
                    float fCos9 = (float) (Math.cos(d111) * d112);
                    bVarL1116.f3627d.g(fVarK11111114, 0.5f);
                    bVarL1116.f3627d.g(fVarK11111116, 0.5f);
                    bVarL1116.f3627d.g(fVarK11111110, -0.5f);
                    bVarL1116.f3627d.g(fVarK11111112, -0.5f);
                    bVarL1116.f3625b = -fCos9;
                    cVar6.c(bVarL1116);
                }
                this.f3781k = false;
                this.f3783l = false;
            }
            i22 = -1;
            if (z10) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (iArr[0] == 2) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (z12) {
                i11 = 0;
            }
            cVar4 = this.P;
            boolean z11114 = !cVar4.h();
            char c13 = '\b';
            boolean z11115 = zArr[0];
            boolean z11116 = zArr[1];
            i23 = this.f3788o;
            int[] iArr17 = this.C;
            if (i23 != 2) {
                cVar5 = cVar2;
                fVar = fVarK;
                fVar2 = fVarK2;
                fVar3 = fVarK5;
                z13 = z6;
                r4 = i9;
                r5 = i8;
                i24 = i20;
            } else {
                cVar5 = cVar2;
                fVar = fVarK;
                fVar2 = fVarK2;
                fVar3 = fVarK5;
                z13 = z6;
                r4 = i9;
                r5 = i8;
                i24 = i20;
            }
            if (z4) {
                fVar4 = r33;
                fVar5 = fVarK4;
                fVar6 = fVar3;
                i25 = 0;
                i26 = 8;
                z14 = true;
                i27 = 1;
            } else {
                fVar4 = r33;
                fVar5 = fVarK4;
                fVar6 = fVar3;
                i25 = 0;
                i26 = 8;
                z14 = true;
                i27 = 1;
            }
            if (this.f3790p == 2) {
                i27 = i25;
            }
            if (i27 != 0) {
                fVar7 = fVar4;
            } else {
                fVar7 = fVar4;
            }
            if (z10) {
                i28 = this.A;
                f4 = this.B;
                if (i28 == 1) {
                    s.b bVarL1117 = cVar6.l();
                    bVarL1117.f3627d.g(fVar5, -1.0f);
                    bVarL1117.f3627d.g(fVar7, 1.0f);
                    bVarL1117.f3627d.g(fVar2, f4);
                    bVarL1117.f3627d.g(fVar, -f4);
                    cVar6.c(bVarL1117);
                } else {
                    s.b bVarL1118 = cVar6.l();
                    bVarL1118.f3627d.g(fVar2, -1.0f);
                    bVarL1118.f3627d.g(fVar, 1.0f);
                    bVarL1118.f3627d.g(fVar5, f4);
                    bVarL1118.f3627d.g(fVar7, -f4);
                    cVar6.c(bVarL1118);
                }
            }
            if (cVar4.h()) {
                d dVar18 = cVar4.f.f3760d;
                float radians10 = (float) Math.toRadians(this.D + 90.0f);
                int iE10 = cVar4.e();
                s.f fVarK11111118 = cVar6.k(i(2));
                s.f fVarK11111119 = cVar6.k(i(3));
                s.f fVarK111111110 = cVar6.k(i(4));
                s.f fVarK111111111 = cVar6.k(i(5));
                s.f fVarK111111112 = cVar6.k(dVar18.i(2));
                s.f fVarK111111113 = cVar6.k(dVar18.i(3));
                s.f fVarK111111114 = cVar6.k(dVar18.i(4));
                s.f fVarK111111115 = cVar6.k(dVar18.i(5));
                s.b bVarL1119 = cVar6.l();
                double d113 = radians10;
                double dSin10 = Math.sin(d113);
                double d114 = iE10;
                bVarL1119.f3627d.g(fVarK111111113, 0.5f);
                bVarL1119.f3627d.g(fVarK111111115, 0.5f);
                bVarL1119.f3627d.g(fVarK11111119, -0.5f);
                bVarL1119.f3627d.g(fVarK111111111, -0.5f);
                bVarL1119.f3625b = -((float) (dSin10 * d114));
                cVar6.c(bVarL1119);
                s.b bVarL11110 = cVar6.l();
                float fCos10 = (float) (Math.cos(d113) * d114);
                bVarL11110.f3627d.g(fVarK111111112, 0.5f);
                bVarL11110.f3627d.g(fVarK111111114, 0.5f);
                bVarL11110.f3627d.g(fVarK11111118, -0.5f);
                bVarL11110.f3627d.g(fVarK111111110, -0.5f);
                bVarL11110.f3625b = -fCos10;
                cVar6.c(bVarL11110);
            }
            this.f3781k = false;
            this.f3783l = false;
        }
        i4 = 0;
        i5 = i4;
        i6 = i5;
        i7 = this.g0;
        zArr = this.S;
        i8 = i5;
        if (i7 == 8) {
            arrayList = this.R;
            size = arrayList.size();
            i9 = i6;
            i32 = i4;
            while (true) {
                if (i32 < size) {
                    if (!zArr[i4]) {
                        break;
                    } else {
                        return;
                    }
                }
                int i313 = size;
                hashSet2 = ((c) arrayList.get(i32)).f3757a;
                if (hashSet2 != null) {
                    break;
                    break;
                }
                i32++;
                size = i313;
            }
        } else {
            i9 = i6;
        }
        z5 = this.f3781k;
        if (z5) {
            if (z5) {
                cVar6.d(fVarK, this.Y);
                cVar6.d(fVarK2, this.Y + this.U);
                if (i9 != 0) {
                    eVar2 = (e) dVar2;
                    weakReference3 = eVar2.H0;
                    if (weakReference3 != null) {
                        eVar2.H0 = new WeakReference(cVar7);
                    } else {
                        eVar2.H0 = new WeakReference(cVar7);
                    }
                    weakReference4 = eVar2.J0;
                    if (weakReference4 != null) {
                        eVar2.J0 = new WeakReference(cVar8);
                    } else {
                        eVar2.J0 = new WeakReference(cVar8);
                    }
                }
            }
            if (this.f3783l) {
                cVar6.d(fVarK3, this.Z);
                cVar6.d(fVarK4, this.Z + this.V);
                hashSet = cVar11.f3757a;
                if (hashSet != null) {
                    cVar6.d(fVarK5, this.Z + this.f3766a0);
                }
                if (i8 != 0) {
                    eVar = (e) dVar;
                    weakReference = eVar.G0;
                    if (weakReference != null) {
                        eVar.G0 = new WeakReference(cVar9);
                    } else {
                        eVar.G0 = new WeakReference(cVar9);
                    }
                    weakReference2 = eVar.I0;
                    if (weakReference2 != null) {
                        eVar.I0 = new WeakReference(cVar10);
                    } else {
                        eVar.I0 = new WeakReference(cVar10);
                    }
                }
            }
            if (this.f3781k) {
                ?? r13 = i4;
                this.f3781k = r13;
                this.f3783l = r13;
                return;
            }
        } else {
            if (z5) {
                cVar6.d(fVarK, this.Y);
                cVar6.d(fVarK2, this.Y + this.U);
                if (i9 != 0) {
                    eVar2 = (e) dVar2;
                    weakReference3 = eVar2.H0;
                    if (weakReference3 != null) {
                        eVar2.H0 = new WeakReference(cVar7);
                    } else {
                        eVar2.H0 = new WeakReference(cVar7);
                    }
                    weakReference4 = eVar2.J0;
                    if (weakReference4 != null) {
                        eVar2.J0 = new WeakReference(cVar8);
                    } else {
                        eVar2.J0 = new WeakReference(cVar8);
                    }
                }
            }
            if (this.f3783l) {
                cVar6.d(fVarK3, this.Z);
                cVar6.d(fVarK4, this.Z + this.V);
                hashSet = cVar11.f3757a;
                if (hashSet != null) {
                    cVar6.d(fVarK5, this.Z + this.f3766a0);
                }
                if (i8 != 0) {
                    eVar = (e) dVar;
                    weakReference = eVar.G0;
                    if (weakReference != null) {
                        eVar.G0 = new WeakReference(cVar9);
                    } else {
                        eVar.G0 = new WeakReference(cVar9);
                    }
                    weakReference2 = eVar.I0;
                    if (weakReference2 != null) {
                        eVar.I0 = new WeakReference(cVar10);
                    } else {
                        eVar.I0 = new WeakReference(cVar10);
                    }
                }
            }
            if (this.f3781k) {
                ?? r14 = i4;
                this.f3781k = r14;
                this.f3783l = r14;
                return;
            }
        }
        zArr2 = this.f;
        if (z4) {
            cVar2 = cVar11;
            zArr3 = zArr2;
        } else {
            cVar2 = cVar11;
            zArr3 = zArr2;
        }
        if (this.T != null) {
            if (w(0)) {
                ((e) this.T).R(this, 0);
                zX = true;
                i31 = 1;
            } else {
                zX = x();
                i31 = 1;
            }
            if (w(i31)) {
                ((e) this.T).R(this, i31);
                zY = true;
            } else {
                zY = y();
            }
            if (zX) {
            }
            if (!zY) {
                cVar6.f(cVar6.k(this.T.L), fVarK4, 0, 1);
            }
            z7 = zY;
            z6 = zX;
        } else {
            cVar7 = cVar7;
            z6 = false;
            z7 = false;
        }
        i10 = this.U;
        i11 = this.f3768b0;
        if (i10 >= i11) {
            i11 = i10;
        }
        i12 = this.V;
        i13 = this.f3770c0;
        if (i12 < i13) {
            i14 = i13;
        } else {
            i14 = i12;
        }
        iArr = this.f3791p0;
        i15 = iArr[0];
        if (i15 != 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        i16 = iArr[1];
        if (i16 != 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i314 = this.X;
        this.A = i314;
        f = this.W;
        this.B = f;
        i17 = this.f3793r;
        i18 = this.f3794s;
        if (f > 0.0f) {
            cVar3 = cVar10;
            if (this.g0 != 8) {
                if (i15 == 3) {
                    i20 = i17;
                } else {
                    i20 = i17;
                }
                if (i16 == 3) {
                    i30 = i18;
                } else {
                    i30 = i18;
                }
                if (i15 == 3) {
                    if (i15 != 3) {
                        if (i16 != 3) {
                            i19 = i14;
                        } else {
                            i19 = i14;
                        }
                        z10 = true;
                    } else {
                        if (i16 != 3) {
                            i19 = i14;
                        } else {
                            i19 = i14;
                        }
                        z10 = true;
                    }
                } else if (i15 != 3) {
                    if (i16 != 3) {
                        i19 = i14;
                    } else {
                        i19 = i14;
                    }
                    z10 = true;
                } else {
                    if (i16 != 3) {
                        i19 = i14;
                    } else {
                        i19 = i14;
                    }
                    z10 = true;
                }
                i21 = i30;
                int[] iArr18 = this.f3795t;
                iArr18[0] = i20;
                iArr18[1] = i21;
                if (z10) {
                    int i315 = this.A;
                    i22 = -1;
                    if (i315 != 0) {
                    }
                    if (z10) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (iArr[0] == 2) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i11 = 0;
                    }
                    cVar4 = this.P;
                    boolean z11117 = !cVar4.h();
                    char c14 = '\b';
                    boolean z11118 = zArr[0];
                    boolean z11119 = zArr[1];
                    i23 = this.f3788o;
                    int[] iArr19 = this.C;
                    if (i23 != 2) {
                        cVar5 = cVar2;
                        fVar = fVarK;
                        fVar2 = fVarK2;
                        fVar3 = fVarK5;
                        z13 = z6;
                        r4 = i9;
                        r5 = i8;
                        i24 = i20;
                    } else {
                        cVar5 = cVar2;
                        fVar = fVarK;
                        fVar2 = fVarK2;
                        fVar3 = fVarK5;
                        z13 = z6;
                        r4 = i9;
                        r5 = i8;
                        i24 = i20;
                    }
                    if (z4) {
                        fVar4 = r33;
                        fVar5 = fVarK4;
                        fVar6 = fVar3;
                        i25 = 0;
                        i26 = 8;
                        z14 = true;
                        i27 = 1;
                    } else {
                        fVar4 = r33;
                        fVar5 = fVarK4;
                        fVar6 = fVar3;
                        i25 = 0;
                        i26 = 8;
                        z14 = true;
                        i27 = 1;
                    }
                    if (this.f3790p == 2) {
                        i27 = i25;
                    }
                    if (i27 != 0) {
                        fVar7 = fVar4;
                    } else {
                        fVar7 = fVar4;
                    }
                    if (z10) {
                        i28 = this.A;
                        f4 = this.B;
                        if (i28 == 1) {
                            s.b bVarL11111 = cVar6.l();
                            bVarL11111.f3627d.g(fVar5, -1.0f);
                            bVarL11111.f3627d.g(fVar7, 1.0f);
                            bVarL11111.f3627d.g(fVar2, f4);
                            bVarL11111.f3627d.g(fVar, -f4);
                            cVar6.c(bVarL11111);
                        } else {
                            s.b bVarL11112 = cVar6.l();
                            bVarL11112.f3627d.g(fVar2, -1.0f);
                            bVarL11112.f3627d.g(fVar, 1.0f);
                            bVarL11112.f3627d.g(fVar5, f4);
                            bVarL11112.f3627d.g(fVar7, -f4);
                            cVar6.c(bVarL11112);
                        }
                    }
                    if (cVar4.h()) {
                        d dVar19 = cVar4.f.f3760d;
                        float radians11 = (float) Math.toRadians(this.D + 90.0f);
                        int iE11 = cVar4.e();
                        s.f fVarK111111116 = cVar6.k(i(2));
                        s.f fVarK111111117 = cVar6.k(i(3));
                        s.f fVarK111111118 = cVar6.k(i(4));
                        s.f fVarK111111119 = cVar6.k(i(5));
                        s.f fVarK1111111110 = cVar6.k(dVar19.i(2));
                        s.f fVarK1111111111 = cVar6.k(dVar19.i(3));
                        s.f fVarK1111111112 = cVar6.k(dVar19.i(4));
                        s.f fVarK1111111113 = cVar6.k(dVar19.i(5));
                        s.b bVarL11113 = cVar6.l();
                        double d115 = radians11;
                        double dSin11 = Math.sin(d115);
                        double d116 = iE11;
                        bVarL11113.f3627d.g(fVarK1111111111, 0.5f);
                        bVarL11113.f3627d.g(fVarK1111111113, 0.5f);
                        bVarL11113.f3627d.g(fVarK111111117, -0.5f);
                        bVarL11113.f3627d.g(fVarK111111119, -0.5f);
                        bVarL11113.f3625b = -((float) (dSin11 * d116));
                        cVar6.c(bVarL11113);
                        s.b bVarL11114 = cVar6.l();
                        float fCos11 = (float) (Math.cos(d115) * d116);
                        bVarL11114.f3627d.g(fVarK1111111110, 0.5f);
                        bVarL11114.f3627d.g(fVarK1111111112, 0.5f);
                        bVarL11114.f3627d.g(fVarK111111116, -0.5f);
                        bVarL11114.f3627d.g(fVarK111111118, -0.5f);
                        bVarL11114.f3625b = -fCos11;
                        cVar6.c(bVarL11114);
                    }
                    this.f3781k = false;
                    this.f3783l = false;
                }
                i22 = -1;
                if (z10) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (iArr[0] == 2) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i11 = 0;
                }
                cVar4 = this.P;
                boolean z111110 = !cVar4.h();
                char c15 = '\b';
                boolean z111111 = zArr[0];
                boolean z111112 = zArr[1];
                i23 = this.f3788o;
                int[] iArr110 = this.C;
                if (i23 != 2) {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z13 = z6;
                    r4 = i9;
                    r5 = i8;
                    i24 = i20;
                } else {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z13 = z6;
                    r4 = i9;
                    r5 = i8;
                    i24 = i20;
                }
                if (z4) {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i25 = 0;
                    i26 = 8;
                    z14 = true;
                    i27 = 1;
                } else {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i25 = 0;
                    i26 = 8;
                    z14 = true;
                    i27 = 1;
                }
                if (this.f3790p == 2) {
                    i27 = i25;
                }
                if (i27 != 0) {
                    fVar7 = fVar4;
                } else {
                    fVar7 = fVar4;
                }
                if (z10) {
                    i28 = this.A;
                    f4 = this.B;
                    if (i28 == 1) {
                        s.b bVarL11115 = cVar6.l();
                        bVarL11115.f3627d.g(fVar5, -1.0f);
                        bVarL11115.f3627d.g(fVar7, 1.0f);
                        bVarL11115.f3627d.g(fVar2, f4);
                        bVarL11115.f3627d.g(fVar, -f4);
                        cVar6.c(bVarL11115);
                    } else {
                        s.b bVarL11116 = cVar6.l();
                        bVarL11116.f3627d.g(fVar2, -1.0f);
                        bVarL11116.f3627d.g(fVar, 1.0f);
                        bVarL11116.f3627d.g(fVar5, f4);
                        bVarL11116.f3627d.g(fVar7, -f4);
                        cVar6.c(bVarL11116);
                    }
                }
                if (cVar4.h()) {
                    d dVar110 = cVar4.f.f3760d;
                    float radians12 = (float) Math.toRadians(this.D + 90.0f);
                    int iE12 = cVar4.e();
                    s.f fVarK1111111114 = cVar6.k(i(2));
                    s.f fVarK1111111115 = cVar6.k(i(3));
                    s.f fVarK1111111116 = cVar6.k(i(4));
                    s.f fVarK1111111117 = cVar6.k(i(5));
                    s.f fVarK1111111118 = cVar6.k(dVar110.i(2));
                    s.f fVarK1111111119 = cVar6.k(dVar110.i(3));
                    s.f fVarK11111111110 = cVar6.k(dVar110.i(4));
                    s.f fVarK11111111111 = cVar6.k(dVar110.i(5));
                    s.b bVarL11117 = cVar6.l();
                    double d117 = radians12;
                    double dSin12 = Math.sin(d117);
                    double d118 = iE12;
                    bVarL11117.f3627d.g(fVarK1111111119, 0.5f);
                    bVarL11117.f3627d.g(fVarK11111111111, 0.5f);
                    bVarL11117.f3627d.g(fVarK1111111115, -0.5f);
                    bVarL11117.f3627d.g(fVarK1111111117, -0.5f);
                    bVarL11117.f3625b = -((float) (dSin12 * d118));
                    cVar6.c(bVarL11117);
                    s.b bVarL11118 = cVar6.l();
                    float fCos12 = (float) (Math.cos(d117) * d118);
                    bVarL11118.f3627d.g(fVarK1111111118, 0.5f);
                    bVarL11118.f3627d.g(fVarK11111111110, 0.5f);
                    bVarL11118.f3627d.g(fVarK1111111114, -0.5f);
                    bVarL11118.f3627d.g(fVarK1111111116, -0.5f);
                    bVarL11118.f3625b = -fCos12;
                    cVar6.c(bVarL11118);
                }
                this.f3781k = false;
                this.f3783l = false;
            }
            z10 = false;
            int[] iArr111 = this.f3795t;
            iArr111[0] = i20;
            iArr111[1] = i21;
            if (z10) {
                int i316 = this.A;
                i22 = -1;
                if (i316 != 0) {
                }
                if (z10) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (iArr[0] == 2) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i11 = 0;
                }
                cVar4 = this.P;
                boolean z111113 = !cVar4.h();
                char c16 = '\b';
                boolean z111114 = zArr[0];
                boolean z111115 = zArr[1];
                i23 = this.f3788o;
                int[] iArr112 = this.C;
                if (i23 != 2) {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z13 = z6;
                    r4 = i9;
                    r5 = i8;
                    i24 = i20;
                } else {
                    cVar5 = cVar2;
                    fVar = fVarK;
                    fVar2 = fVarK2;
                    fVar3 = fVarK5;
                    z13 = z6;
                    r4 = i9;
                    r5 = i8;
                    i24 = i20;
                }
                if (z4) {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i25 = 0;
                    i26 = 8;
                    z14 = true;
                    i27 = 1;
                } else {
                    fVar4 = r33;
                    fVar5 = fVarK4;
                    fVar6 = fVar3;
                    i25 = 0;
                    i26 = 8;
                    z14 = true;
                    i27 = 1;
                }
                if (this.f3790p == 2) {
                    i27 = i25;
                }
                if (i27 != 0) {
                    fVar7 = fVar4;
                } else {
                    fVar7 = fVar4;
                }
                if (z10) {
                    i28 = this.A;
                    f4 = this.B;
                    if (i28 == 1) {
                        s.b bVarL11119 = cVar6.l();
                        bVarL11119.f3627d.g(fVar5, -1.0f);
                        bVarL11119.f3627d.g(fVar7, 1.0f);
                        bVarL11119.f3627d.g(fVar2, f4);
                        bVarL11119.f3627d.g(fVar, -f4);
                        cVar6.c(bVarL11119);
                    } else {
                        s.b bVarL111110 = cVar6.l();
                        bVarL111110.f3627d.g(fVar2, -1.0f);
                        bVarL111110.f3627d.g(fVar, 1.0f);
                        bVarL111110.f3627d.g(fVar5, f4);
                        bVarL111110.f3627d.g(fVar7, -f4);
                        cVar6.c(bVarL111110);
                    }
                }
                if (cVar4.h()) {
                    d dVar111 = cVar4.f.f3760d;
                    float radians13 = (float) Math.toRadians(this.D + 90.0f);
                    int iE13 = cVar4.e();
                    s.f fVarK11111111112 = cVar6.k(i(2));
                    s.f fVarK11111111113 = cVar6.k(i(3));
                    s.f fVarK11111111114 = cVar6.k(i(4));
                    s.f fVarK11111111115 = cVar6.k(i(5));
                    s.f fVarK11111111116 = cVar6.k(dVar111.i(2));
                    s.f fVarK11111111117 = cVar6.k(dVar111.i(3));
                    s.f fVarK11111111118 = cVar6.k(dVar111.i(4));
                    s.f fVarK11111111119 = cVar6.k(dVar111.i(5));
                    s.b bVarL111111 = cVar6.l();
                    double d119 = radians13;
                    double dSin13 = Math.sin(d119);
                    double d1110 = iE13;
                    bVarL111111.f3627d.g(fVarK11111111117, 0.5f);
                    bVarL111111.f3627d.g(fVarK11111111119, 0.5f);
                    bVarL111111.f3627d.g(fVarK11111111113, -0.5f);
                    bVarL111111.f3627d.g(fVarK11111111115, -0.5f);
                    bVarL111111.f3625b = -((float) (dSin13 * d1110));
                    cVar6.c(bVarL111111);
                    s.b bVarL111112 = cVar6.l();
                    float fCos13 = (float) (Math.cos(d119) * d1110);
                    bVarL111112.f3627d.g(fVarK11111111116, 0.5f);
                    bVarL111112.f3627d.g(fVarK11111111118, 0.5f);
                    bVarL111112.f3627d.g(fVarK11111111112, -0.5f);
                    bVarL111112.f3627d.g(fVarK11111111114, -0.5f);
                    bVarL111112.f3625b = -fCos13;
                    cVar6.c(bVarL111112);
                }
                this.f3781k = false;
                this.f3783l = false;
            }
            i22 = -1;
            if (z10) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (iArr[0] == 2) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (z12) {
                i11 = 0;
            }
            cVar4 = this.P;
            boolean z111116 = !cVar4.h();
            char c17 = '\b';
            boolean z111117 = zArr[0];
            boolean z111118 = zArr[1];
            i23 = this.f3788o;
            int[] iArr113 = this.C;
            if (i23 != 2) {
                cVar5 = cVar2;
                fVar = fVarK;
                fVar2 = fVarK2;
                fVar3 = fVarK5;
                z13 = z6;
                r4 = i9;
                r5 = i8;
                i24 = i20;
            } else {
                cVar5 = cVar2;
                fVar = fVarK;
                fVar2 = fVarK2;
                fVar3 = fVarK5;
                z13 = z6;
                r4 = i9;
                r5 = i8;
                i24 = i20;
            }
            if (z4) {
                fVar4 = r33;
                fVar5 = fVarK4;
                fVar6 = fVar3;
                i25 = 0;
                i26 = 8;
                z14 = true;
                i27 = 1;
            } else {
                fVar4 = r33;
                fVar5 = fVarK4;
                fVar6 = fVar3;
                i25 = 0;
                i26 = 8;
                z14 = true;
                i27 = 1;
            }
            if (this.f3790p == 2) {
                i27 = i25;
            }
            if (i27 != 0) {
                fVar7 = fVar4;
            } else {
                fVar7 = fVar4;
            }
            if (z10) {
                i28 = this.A;
                f4 = this.B;
                if (i28 == 1) {
                    s.b bVarL111113 = cVar6.l();
                    bVarL111113.f3627d.g(fVar5, -1.0f);
                    bVarL111113.f3627d.g(fVar7, 1.0f);
                    bVarL111113.f3627d.g(fVar2, f4);
                    bVarL111113.f3627d.g(fVar, -f4);
                    cVar6.c(bVarL111113);
                } else {
                    s.b bVarL111114 = cVar6.l();
                    bVarL111114.f3627d.g(fVar2, -1.0f);
                    bVarL111114.f3627d.g(fVar, 1.0f);
                    bVarL111114.f3627d.g(fVar5, f4);
                    bVarL111114.f3627d.g(fVar7, -f4);
                    cVar6.c(bVarL111114);
                }
            }
            if (cVar4.h()) {
                d dVar112 = cVar4.f.f3760d;
                float radians14 = (float) Math.toRadians(this.D + 90.0f);
                int iE14 = cVar4.e();
                s.f fVarK111111111110 = cVar6.k(i(2));
                s.f fVarK111111111111 = cVar6.k(i(3));
                s.f fVarK111111111112 = cVar6.k(i(4));
                s.f fVarK111111111113 = cVar6.k(i(5));
                s.f fVarK111111111114 = cVar6.k(dVar112.i(2));
                s.f fVarK111111111115 = cVar6.k(dVar112.i(3));
                s.f fVarK111111111116 = cVar6.k(dVar112.i(4));
                s.f fVarK111111111117 = cVar6.k(dVar112.i(5));
                s.b bVarL111115 = cVar6.l();
                double d1111 = radians14;
                double dSin14 = Math.sin(d1111);
                double d1112 = iE14;
                bVarL111115.f3627d.g(fVarK111111111115, 0.5f);
                bVarL111115.f3627d.g(fVarK111111111117, 0.5f);
                bVarL111115.f3627d.g(fVarK111111111111, -0.5f);
                bVarL111115.f3627d.g(fVarK111111111113, -0.5f);
                bVarL111115.f3625b = -((float) (dSin14 * d1112));
                cVar6.c(bVarL111115);
                s.b bVarL111116 = cVar6.l();
                float fCos14 = (float) (Math.cos(d1111) * d1112);
                bVarL111116.f3627d.g(fVarK111111111114, 0.5f);
                bVarL111116.f3627d.g(fVarK111111111116, 0.5f);
                bVarL111116.f3627d.g(fVarK111111111110, -0.5f);
                bVarL111116.f3627d.g(fVarK111111111112, -0.5f);
                bVarL111116.f3625b = -fCos14;
                cVar6.c(bVarL111116);
            }
            this.f3781k = false;
            this.f3783l = false;
        }
        cVar3 = cVar10;
        fVarK4 = fVarK4;
        i19 = i14;
        i20 = i17;
        i21 = i18;
        z10 = false;
        int[] iArr114 = this.f3795t;
        iArr114[0] = i20;
        iArr114[1] = i21;
        if (z10) {
            int i317 = this.A;
            i22 = -1;
            if (i317 != 0) {
            }
            if (z10) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (iArr[0] == 2) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (z12) {
                i11 = 0;
            }
            cVar4 = this.P;
            boolean z111119 = !cVar4.h();
            char c18 = '\b';
            boolean z1111110 = zArr[0];
            boolean z1111111 = zArr[1];
            i23 = this.f3788o;
            int[] iArr115 = this.C;
            if (i23 != 2) {
                cVar5 = cVar2;
                fVar = fVarK;
                fVar2 = fVarK2;
                fVar3 = fVarK5;
                z13 = z6;
                r4 = i9;
                r5 = i8;
                i24 = i20;
            } else {
                cVar5 = cVar2;
                fVar = fVarK;
                fVar2 = fVarK2;
                fVar3 = fVarK5;
                z13 = z6;
                r4 = i9;
                r5 = i8;
                i24 = i20;
            }
            if (z4) {
                fVar4 = r33;
                fVar5 = fVarK4;
                fVar6 = fVar3;
                i25 = 0;
                i26 = 8;
                z14 = true;
                i27 = 1;
            } else {
                fVar4 = r33;
                fVar5 = fVarK4;
                fVar6 = fVar3;
                i25 = 0;
                i26 = 8;
                z14 = true;
                i27 = 1;
            }
            if (this.f3790p == 2) {
                i27 = i25;
            }
            if (i27 != 0) {
                fVar7 = fVar4;
            } else {
                fVar7 = fVar4;
            }
            if (z10) {
                i28 = this.A;
                f4 = this.B;
                if (i28 == 1) {
                    s.b bVarL111117 = cVar6.l();
                    bVarL111117.f3627d.g(fVar5, -1.0f);
                    bVarL111117.f3627d.g(fVar7, 1.0f);
                    bVarL111117.f3627d.g(fVar2, f4);
                    bVarL111117.f3627d.g(fVar, -f4);
                    cVar6.c(bVarL111117);
                } else {
                    s.b bVarL111118 = cVar6.l();
                    bVarL111118.f3627d.g(fVar2, -1.0f);
                    bVarL111118.f3627d.g(fVar, 1.0f);
                    bVarL111118.f3627d.g(fVar5, f4);
                    bVarL111118.f3627d.g(fVar7, -f4);
                    cVar6.c(bVarL111118);
                }
            }
            if (cVar4.h()) {
                d dVar113 = cVar4.f.f3760d;
                float radians15 = (float) Math.toRadians(this.D + 90.0f);
                int iE15 = cVar4.e();
                s.f fVarK111111111118 = cVar6.k(i(2));
                s.f fVarK111111111119 = cVar6.k(i(3));
                s.f fVarK1111111111110 = cVar6.k(i(4));
                s.f fVarK1111111111111 = cVar6.k(i(5));
                s.f fVarK1111111111112 = cVar6.k(dVar113.i(2));
                s.f fVarK1111111111113 = cVar6.k(dVar113.i(3));
                s.f fVarK1111111111114 = cVar6.k(dVar113.i(4));
                s.f fVarK1111111111115 = cVar6.k(dVar113.i(5));
                s.b bVarL111119 = cVar6.l();
                double d1113 = radians15;
                double dSin15 = Math.sin(d1113);
                double d1114 = iE15;
                bVarL111119.f3627d.g(fVarK1111111111113, 0.5f);
                bVarL111119.f3627d.g(fVarK1111111111115, 0.5f);
                bVarL111119.f3627d.g(fVarK111111111119, -0.5f);
                bVarL111119.f3627d.g(fVarK1111111111111, -0.5f);
                bVarL111119.f3625b = -((float) (dSin15 * d1114));
                cVar6.c(bVarL111119);
                s.b bVarL1111110 = cVar6.l();
                float fCos15 = (float) (Math.cos(d1113) * d1114);
                bVarL1111110.f3627d.g(fVarK1111111111112, 0.5f);
                bVarL1111110.f3627d.g(fVarK1111111111114, 0.5f);
                bVarL1111110.f3627d.g(fVarK111111111118, -0.5f);
                bVarL1111110.f3627d.g(fVarK1111111111110, -0.5f);
                bVarL1111110.f3625b = -fCos15;
                cVar6.c(bVarL1111110);
            }
            this.f3781k = false;
            this.f3783l = false;
        }
        i22 = -1;
        if (z10) {
            z11 = false;
        } else {
            z11 = false;
        }
        if (iArr[0] == 2) {
            z12 = false;
        } else {
            z12 = false;
        }
        if (z12) {
            i11 = 0;
        }
        cVar4 = this.P;
        boolean z1111112 = !cVar4.h();
        char c19 = '\b';
        boolean z1111113 = zArr[0];
        boolean z1111114 = zArr[1];
        i23 = this.f3788o;
        int[] iArr116 = this.C;
        if (i23 != 2) {
            cVar5 = cVar2;
            fVar = fVarK;
            fVar2 = fVarK2;
            fVar3 = fVarK5;
            z13 = z6;
            r4 = i9;
            r5 = i8;
            i24 = i20;
        } else {
            cVar5 = cVar2;
            fVar = fVarK;
            fVar2 = fVarK2;
            fVar3 = fVarK5;
            z13 = z6;
            r4 = i9;
            r5 = i8;
            i24 = i20;
        }
        if (z4) {
            fVar4 = r33;
            fVar5 = fVarK4;
            fVar6 = fVar3;
            i25 = 0;
            i26 = 8;
            z14 = true;
            i27 = 1;
        } else {
            fVar4 = r33;
            fVar5 = fVarK4;
            fVar6 = fVar3;
            i25 = 0;
            i26 = 8;
            z14 = true;
            i27 = 1;
        }
        if (this.f3790p == 2) {
            i27 = i25;
        }
        if (i27 != 0) {
            fVar7 = fVar4;
        } else {
            fVar7 = fVar4;
        }
        if (z10) {
            i28 = this.A;
            f4 = this.B;
            if (i28 == 1) {
                s.b bVarL1111111 = cVar6.l();
                bVarL1111111.f3627d.g(fVar5, -1.0f);
                bVarL1111111.f3627d.g(fVar7, 1.0f);
                bVarL1111111.f3627d.g(fVar2, f4);
                bVarL1111111.f3627d.g(fVar, -f4);
                cVar6.c(bVarL1111111);
            } else {
                s.b bVarL1111112 = cVar6.l();
                bVarL1111112.f3627d.g(fVar2, -1.0f);
                bVarL1111112.f3627d.g(fVar, 1.0f);
                bVarL1111112.f3627d.g(fVar5, f4);
                bVarL1111112.f3627d.g(fVar7, -f4);
                cVar6.c(bVarL1111112);
            }
        }
        if (cVar4.h()) {
            d dVar114 = cVar4.f.f3760d;
            float radians16 = (float) Math.toRadians(this.D + 90.0f);
            int iE16 = cVar4.e();
            s.f fVarK1111111111116 = cVar6.k(i(2));
            s.f fVarK1111111111117 = cVar6.k(i(3));
            s.f fVarK1111111111118 = cVar6.k(i(4));
            s.f fVarK1111111111119 = cVar6.k(i(5));
            s.f fVarK11111111111110 = cVar6.k(dVar114.i(2));
            s.f fVarK11111111111111 = cVar6.k(dVar114.i(3));
            s.f fVarK11111111111112 = cVar6.k(dVar114.i(4));
            s.f fVarK11111111111113 = cVar6.k(dVar114.i(5));
            s.b bVarL1111113 = cVar6.l();
            double d1115 = radians16;
            double dSin16 = Math.sin(d1115);
            double d1116 = iE16;
            bVarL1111113.f3627d.g(fVarK11111111111111, 0.5f);
            bVarL1111113.f3627d.g(fVarK11111111111113, 0.5f);
            bVarL1111113.f3627d.g(fVarK1111111111117, -0.5f);
            bVarL1111113.f3627d.g(fVarK1111111111119, -0.5f);
            bVarL1111113.f3625b = -((float) (dSin16 * d1116));
            cVar6.c(bVarL1111113);
            s.b bVarL1111114 = cVar6.l();
            float fCos16 = (float) (Math.cos(d1115) * d1116);
            bVarL1111114.f3627d.g(fVarK11111111111110, 0.5f);
            bVarL1111114.f3627d.g(fVarK11111111111112, 0.5f);
            bVarL1111114.f3627d.g(fVarK1111111111116, -0.5f);
            bVarL1111114.f3627d.g(fVarK1111111111118, -0.5f);
            bVarL1111114.f3625b = -fCos16;
            cVar6.c(bVarL1111114);
        }
        this.f3781k = false;
        this.f3783l = false;
    }

    public boolean c() {
        return this.g0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:229:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:231:0x0402  */
    /* JADX WARN: Code duplicated, block: B:240:0x041f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0452  */
    /* JADX WARN: Code duplicated, block: B:259:0x0458  */
    /* JADX WARN: Code duplicated, block: B:270:0x046d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0477  */
    /* JADX WARN: Code duplicated, block: B:277:0x047b  */
    /* JADX WARN: Code duplicated, block: B:278:0x047d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0485  */
    /* JADX WARN: Code duplicated, block: B:287:0x0493 A[PHI: r3
      0x0493: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:294:0x04af  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:337:0x0521  */
    public final void d(s.c cVar, boolean z4, boolean z5, boolean z6, boolean z7, s.f fVar, s.f fVar2, int i4, boolean z8, c cVar2, c cVar3, int i5, int i6, int i7, int i8, float f, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i9, int i10, int i11, int i12, float f4, boolean z14) {
        boolean z15;
        boolean z16;
        int iMin;
        boolean z17;
        int i13;
        int i14;
        boolean z18;
        s.f fVarK;
        s.f fVarK2;
        c cVar4;
        s.f fVar3;
        int i15;
        int i16;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        d dVar;
        boolean z23;
        int iMin2;
        boolean z24;
        int i17;
        int iE;
        int i18;
        int i19;
        HashSet hashSet;
        boolean z25;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z26;
        boolean z27;
        int i25;
        cVar = cVar;
        int i26 = i11;
        int i27 = i12;
        s.f fVarK3 = cVar.k(cVar2);
        s.f fVarK4 = cVar.k(cVar3);
        s.f fVarK5 = cVar.k(cVar2.f);
        s.f fVarK6 = cVar.k(cVar3.f);
        boolean zH = cVar2.h();
        boolean zH2 = cVar3.h();
        boolean zH3 = this.P.h();
        int i28 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i28++;
        }
        int i29 = i28;
        int i30 = z9 ? 3 : i9;
        int iB = s.e.b(i4);
        boolean z28 = (iB == 0 || iB == 1 || iB != 2 || i30 == 4) ? false : true;
        int i31 = this.f3776h;
        if (i31 == -1 || !z4) {
            i31 = i6;
            z15 = z28;
        } else {
            this.f3776h = -1;
            z15 = false;
        }
        int i32 = this.f3778i;
        if (i32 == -1 || z4) {
            z16 = z15;
        } else {
            this.f3778i = -1;
            i31 = i32;
            z16 = false;
        }
        boolean z29 = z16;
        if (this.g0 == 8) {
            z17 = false;
            iMin = 0;
        } else {
            iMin = i31;
            z17 = z29;
        }
        if (z14) {
            if (!zH && !zH2 && !zH3) {
                cVar.d(fVarK3, i5);
            } else if (zH && !zH2) {
                i13 = 8;
                cVar.e(fVarK3, fVarK5, cVar2.e(), 8);
            }
            i13 = 8;
        } else {
            i13 = 8;
        }
        if (z17 != 0) {
            if (i29 == 2 || z9 || !(i30 == 1 || i30 == 0)) {
                if (i26 == -2) {
                    i26 = iMin;
                }
                if (i27 == -2) {
                    i27 = iMin;
                }
                if (iMin > 0 && i30 != 1) {
                    iMin = 0;
                }
                if (i26 > 0) {
                    cVar.f(fVarK4, fVarK3, i26, 8);
                    iMin = Math.max(iMin, i26);
                }
                if (i27 > 0) {
                    if (!z5 || i30 != 1) {
                        cVar.g(fVarK4, fVarK3, i27, 8);
                    }
                    iMin = Math.min(iMin, i27);
                }
                if (i30 == 1) {
                    if (z5) {
                        cVar.e(fVarK4, fVarK3, iMin, 8);
                    } else if (z11) {
                        cVar.e(fVarK4, fVarK3, iMin, 5);
                        cVar.g(fVarK4, fVarK3, iMin, 8);
                    } else {
                        cVar.e(fVarK4, fVarK3, iMin, 5);
                        cVar.g(fVarK4, fVarK3, iMin, 8);
                    }
                } else if (i30 == 2) {
                    int i33 = cVar2.f3761e;
                    if (i33 == 3 || i33 == 5) {
                        fVarK = cVar.k(this.T.i(3));
                        fVarK2 = cVar.k(this.T.i(5));
                    } else {
                        fVarK = cVar.k(this.T.i(2));
                        fVarK2 = cVar.k(this.T.i(4));
                    }
                    s.b bVarL = cVar.l();
                    int i34 = i26;
                    bVarL.f3627d.g(fVarK4, -1.0f);
                    bVarL.f3627d.g(fVarK3, 1.0f);
                    bVarL.f3627d.g(fVarK2, f4);
                    bVarL.f3627d.g(fVarK, -f4);
                    cVar.c(bVarL);
                    if (z5) {
                        z17 = false;
                    }
                    z18 = z7;
                    i14 = i34;
                } else {
                    i14 = i26;
                    z18 = true;
                }
            } else {
                int iMax = Math.max(i26, iMin);
                if (i27 > 0) {
                    iMax = Math.min(i27, iMax);
                }
                cVar.e(fVarK4, fVarK3, iMax, 8);
                z18 = z7;
                i14 = i26;
                z17 = false;
            }
            if (z14 || z11) {
                boolean z30 = z18;
                if (i29 >= 2 && z5 && z30) {
                    cVar.f(fVarK3, fVar, 0, 8);
                    c cVar5 = this.M;
                    boolean z31 = z4 || cVar5.f == null;
                    if (!z4 && (cVar4 = cVar5.f) != null) {
                        d dVar2 = cVar4.f3760d;
                        if (dVar2.W != 0.0f) {
                            int[] iArr = dVar2.f3791p0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                        } else {
                            z31 = false;
                        }
                    }
                    if (z31) {
                        cVar.f(fVar2, fVarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zH || zH2 || zH3) {
                if (zH && !zH2) {
                    cVar3 = cVar3;
                    fVarK4 = fVarK4;
                    z18 = z18;
                    fVar3 = fVarK6;
                    z23 = z5;
                    i25 = (z5 && (cVar2.f.f3760d instanceof a)) ? 8 : 5;
                } else if (zH || !zH2) {
                    fVar3 = fVarK6;
                    if (zH && zH2) {
                        d dVar3 = cVar2.f.f3760d;
                        d dVar4 = cVar3.f.f3760d;
                        z18 = z18;
                        d dVar5 = this.T;
                        int i35 = 6;
                        if (z17) {
                            if (i30 == 0) {
                                if (i27 != 0 || i14 != 0) {
                                    i23 = 5;
                                    i24 = 5;
                                    z26 = true;
                                    z27 = false;
                                    z20 = true;
                                } else if (fVarK5.f3651k && fVar3.f3651k) {
                                    cVar.e(fVarK3, fVarK5, cVar2.e(), 8);
                                    cVar.e(fVarK4, fVar3, -cVar3.e(), 8);
                                    return;
                                } else {
                                    i23 = 8;
                                    i24 = 8;
                                    z26 = false;
                                    z27 = true;
                                    z20 = false;
                                }
                                if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                    cVar = cVar;
                                    i30 = i30;
                                    fVarK3 = fVarK3;
                                    fVarK4 = fVarK4;
                                    z21 = z27;
                                    fVar2 = fVar2;
                                    i15 = i23;
                                    fVarK5 = fVarK5;
                                    i35 = 6;
                                    z19 = z26;
                                    i16 = 4;
                                } else {
                                    cVar = cVar;
                                    fVarK3 = fVarK3;
                                    fVarK4 = fVarK4;
                                    z21 = z27;
                                    i15 = i23;
                                    fVarK5 = fVarK5;
                                    i35 = 6;
                                    z19 = z26;
                                    i16 = i24;
                                    i30 = i30;
                                    fVar2 = fVar2;
                                }
                            } else {
                                if (i30 == 2) {
                                    if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                        i15 = 5;
                                    } else {
                                        cVar = cVar;
                                        i30 = i30;
                                        fVarK3 = fVarK3;
                                        fVarK4 = fVarK4;
                                        fVarK5 = fVarK5;
                                        i35 = 6;
                                        i15 = 5;
                                        i16 = 5;
                                    }
                                    z19 = true;
                                    z20 = true;
                                    z21 = false;
                                    fVar2 = fVar2;
                                } else if (i30 == 1) {
                                    i15 = 8;
                                } else if (i30 == 3) {
                                    i30 = i30;
                                    if (this.A != -1) {
                                        if (z9) {
                                            if (i10 == 2 || i10 == 1) {
                                                i21 = 5;
                                                i22 = 4;
                                            } else {
                                                i21 = 8;
                                                i22 = 5;
                                            }
                                            i16 = i22;
                                            z19 = true;
                                            z20 = true;
                                            z21 = true;
                                        } else {
                                            if (i27 > 0) {
                                                cVar = cVar;
                                                fVar2 = fVar2;
                                                fVarK3 = fVarK3;
                                                fVarK4 = fVarK4;
                                                fVarK5 = fVarK5;
                                                i35 = 6;
                                                i15 = 5;
                                            } else if (i27 != 0 || i14 != 0) {
                                                cVar = cVar;
                                                fVar2 = fVar2;
                                                fVarK3 = fVarK3;
                                                fVarK4 = fVarK4;
                                                fVarK5 = fVarK5;
                                                i35 = 6;
                                                i15 = 5;
                                                i16 = 4;
                                            } else if (z12) {
                                                i21 = (dVar3 == dVar5 || dVar4 == dVar5) ? 5 : 4;
                                                i16 = 4;
                                                z19 = true;
                                                z20 = true;
                                                z21 = true;
                                            } else {
                                                cVar = cVar;
                                                fVar2 = fVar2;
                                                fVarK3 = fVarK3;
                                                fVarK4 = fVarK4;
                                                fVarK5 = fVarK5;
                                                i35 = 6;
                                                i15 = 5;
                                                i16 = 8;
                                            }
                                            z19 = true;
                                            z20 = true;
                                            z21 = true;
                                        }
                                        i15 = i21;
                                        cVar = cVar;
                                    } else if (z12) {
                                        cVar = cVar;
                                        fVar2 = fVar2;
                                        fVarK3 = fVarK3;
                                        fVarK4 = fVarK4;
                                        fVarK5 = fVarK5;
                                        i15 = 8;
                                        i35 = z5 ? 5 : 4;
                                    } else {
                                        cVar = cVar;
                                        fVar2 = fVar2;
                                        fVarK3 = fVarK3;
                                        fVarK4 = fVarK4;
                                        fVarK5 = fVarK5;
                                        i15 = 8;
                                        i35 = 8;
                                    }
                                    i16 = 5;
                                    z19 = true;
                                    z20 = true;
                                    z21 = true;
                                } else {
                                    i15 = 5;
                                    i16 = 4;
                                    z19 = false;
                                    z20 = false;
                                }
                                i16 = 4;
                                z19 = true;
                                z20 = true;
                                z21 = false;
                                fVar2 = fVar2;
                            }
                            if (z20 || fVarK5 != fVar3 || dVar3 == dVar5) {
                                z22 = true;
                            } else {
                                z20 = false;
                                z22 = false;
                            }
                            if (z19) {
                                if (z17 && !z10 && !z12 && fVarK5 == fVar && fVar3 == fVar2) {
                                    i35 = 8;
                                    z23 = false;
                                    i20 = 8;
                                    z25 = false;
                                } else {
                                    z23 = z5;
                                    z25 = z22;
                                    i20 = i15;
                                }
                                s.f fVar4 = fVarK5;
                                dVar = dVar4;
                                cVar.b(fVarK3, fVar4, cVar2.e(), f, fVar3, fVarK4, cVar3.e(), i35);
                                fVarK5 = fVar4;
                                i15 = i20;
                                z22 = z25;
                            } else {
                                dVar = dVar4;
                                z23 = z5;
                            }
                            if (this.g0 != 8 && ((hashSet = cVar3.f3757a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z20) {
                                if (z23 && fVarK5 != fVar3 && !z17 && ((dVar3 instanceof a) || (dVar instanceof a))) {
                                    i15 = 6;
                                }
                                cVar.f(fVarK3, fVarK5, cVar2.e(), i15);
                                cVar.g(fVarK4, fVar3, -cVar3.e(), i15);
                            }
                            if (z23 || !z13 || (dVar3 instanceof a) || (dVar instanceof a) || dVar == dVar5) {
                                iMin2 = i16;
                                z24 = z22;
                            } else {
                                iMin2 = 6;
                                i15 = 6;
                                z24 = true;
                            }
                            if (z24) {
                                if (z21 && (!z12 || z6)) {
                                    if (dVar3 != dVar5 && dVar != dVar5) {
                                        i35 = iMin2;
                                    }
                                    if ((dVar3 instanceof h) || (dVar instanceof h)) {
                                        i35 = 5;
                                    }
                                    if ((dVar3 instanceof a) || (dVar instanceof a)) {
                                        i35 = 5;
                                    }
                                    if (z12) {
                                        i19 = 5;
                                    } else {
                                        i19 = i35;
                                    }
                                    iMin2 = Math.max(i19, iMin2);
                                }
                                if (z23) {
                                    iMin2 = Math.min(i15, iMin2);
                                    if (z9 || z12 || !(dVar3 == dVar5 || dVar == dVar5)) {
                                        i18 = iMin2;
                                    } else {
                                        i18 = 4;
                                    }
                                } else {
                                    i18 = iMin2;
                                }
                                cVar.e(fVarK3, fVarK5, cVar2.e(), i18);
                                cVar.e(fVarK4, fVar3, -cVar3.e(), i18);
                            }
                            if (z23) {
                                if (fVar == fVarK5) {
                                    iE = cVar2.e();
                                } else {
                                    iE = 0;
                                }
                                if (fVarK5 != fVar) {
                                    cVar.f(fVarK3, fVar, iE, 5);
                                }
                            }
                            if (z23 || !z17 || i7 != 0 || i14 != 0) {
                                i17 = 5;
                            } else if (z17 && i30 == 3) {
                                cVar.f(fVarK4, fVarK3, 0, 8);
                                i17 = 5;
                            } else {
                                i17 = 5;
                                cVar.f(fVarK4, fVarK3, 0, 5);
                            }
                        } else {
                            if (fVarK5.f3651k && fVar3.f3651k) {
                                cVar.b(fVarK3, fVarK5, cVar2.e(), f, fVar3, fVarK4, cVar3.e(), 8);
                                if (z5 && z18) {
                                    int iE2 = cVar3.f != null ? cVar3.e() : 0;
                                    if (fVar3 != fVar2) {
                                        cVar.f(fVar2, fVarK4, iE2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i15 = 5;
                            i16 = 4;
                            z19 = true;
                            z20 = true;
                        }
                        z21 = false;
                        if (z20) {
                            z22 = true;
                        } else {
                            z22 = true;
                        }
                        if (z19) {
                            if (z17) {
                                z23 = z5;
                                z25 = z22;
                                i20 = i15;
                            } else {
                                z23 = z5;
                                z25 = z22;
                                i20 = i15;
                            }
                            s.f fVar5 = fVarK5;
                            dVar = dVar4;
                            cVar.b(fVarK3, fVar5, cVar2.e(), f, fVar3, fVarK4, cVar3.e(), i35);
                            fVarK5 = fVar5;
                            i15 = i20;
                            z22 = z25;
                        } else {
                            dVar = dVar4;
                            z23 = z5;
                        }
                        if (this.g0 != 8) {
                        }
                        if (z20) {
                            if (z23) {
                                i15 = 6;
                            }
                            cVar.f(fVarK3, fVarK5, cVar2.e(), i15);
                            cVar.g(fVarK4, fVar3, -cVar3.e(), i15);
                        }
                        if (z23) {
                            iMin2 = i16;
                            z24 = z22;
                        } else {
                            iMin2 = i16;
                            z24 = z22;
                        }
                        if (z24) {
                            if (z21) {
                                if (dVar3 != dVar5) {
                                    i35 = iMin2;
                                }
                                if (dVar3 instanceof h) {
                                    i35 = 5;
                                } else {
                                    i35 = 5;
                                }
                                if (dVar3 instanceof a) {
                                    i35 = 5;
                                } else {
                                    i35 = 5;
                                }
                                if (z12) {
                                    i19 = 5;
                                } else {
                                    i19 = i35;
                                }
                                iMin2 = Math.max(i19, iMin2);
                            }
                            if (z23) {
                                iMin2 = Math.min(i15, iMin2);
                                if (z9) {
                                    i18 = iMin2;
                                } else {
                                    i18 = iMin2;
                                }
                            } else {
                                i18 = iMin2;
                            }
                            cVar.e(fVarK3, fVarK5, cVar2.e(), i18);
                            cVar.e(fVarK4, fVar3, -cVar3.e(), i18);
                        }
                        if (z23) {
                            if (fVar == fVarK5) {
                                iE = cVar2.e();
                            } else {
                                iE = 0;
                            }
                            if (fVarK5 != fVar) {
                                cVar.f(fVarK3, fVar, iE, 5);
                            }
                        }
                        if (z23) {
                            i17 = 5;
                        } else {
                            i17 = 5;
                        }
                    }
                    i25 = i17;
                } else {
                    fVar3 = fVarK6;
                    cVar.e(fVarK4, fVar3, -cVar3.e(), 8);
                    if (z5) {
                        cVar.f(fVarK3, fVar, 0, 5);
                        cVar3 = cVar3;
                        i17 = 5;
                        fVarK4 = fVarK4;
                        z18 = z18;
                    }
                    z23 = z5;
                    i25 = i17;
                }
                if (z23 || !z18) {
                    return;
                }
                int iE3 = cVar3.f != null ? cVar3.e() : 0;
                if (fVar3 != fVar2) {
                    cVar.f(fVar2, fVarK4, iE3, i25);
                    return;
                }
                return;
            }
            fVar3 = fVarK6;
            i17 = 5;
            z23 = z5;
            i25 = i17;
            if (z23) {
                return;
            } else {
                return;
            }
        }
        if (z8) {
            cVar.e(fVarK4, fVarK3, 0, 3);
            if (i7 > 0) {
                cVar.f(fVarK4, fVarK3, i7, i13);
            }
            if (i8 < Integer.MAX_VALUE) {
                cVar.g(fVarK4, fVarK3, i8, i13);
            }
        } else {
            cVar.e(fVarK4, fVarK3, iMin, i13);
        }
        z18 = z7;
        i14 = i26;
        if (z14) {
        }
        boolean z32 = z18;
        if (i29 >= 2) {
        }
    }

    public final void e(int i4, d dVar, int i5, int i6) {
        boolean z4;
        if (i4 == 7) {
            if (i5 != 7) {
                if (i5 == 2 || i5 == 4) {
                    e(2, dVar, i5, 0);
                    e(4, dVar, i5, 0);
                    i(7).a(dVar.i(i5), 0);
                    return;
                } else {
                    if (i5 == 3 || i5 == 5) {
                        e(3, dVar, i5, 0);
                        e(5, dVar, i5, 0);
                        i(7).a(dVar.i(i5), 0);
                        return;
                    }
                    return;
                }
            }
            c cVarI = i(2);
            c cVarI2 = i(4);
            c cVarI3 = i(3);
            c cVarI4 = i(5);
            boolean z5 = true;
            if ((cVarI == null || !cVarI.h()) && (cVarI2 == null || !cVarI2.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z4 = true;
            } else {
                z4 = false;
            }
            if ((cVarI3 == null || !cVarI3.h()) && (cVarI4 == null || !cVarI4.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z5 = false;
            }
            if (z4 && z5) {
                i(7).a(dVar.i(7), 0);
                return;
            } else if (z4) {
                i(8).a(dVar.i(8), 0);
                return;
            } else {
                if (z5) {
                    i(9).a(dVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i4 == 8 && (i5 == 2 || i5 == 4)) {
            c cVarI5 = i(2);
            c cVarI6 = dVar.i(i5);
            c cVarI7 = i(4);
            cVarI5.a(cVarI6, 0);
            cVarI7.a(cVarI6, 0);
            i(8).a(cVarI6, 0);
            return;
        }
        if (i4 == 9 && (i5 == 3 || i5 == 5)) {
            c cVarI8 = dVar.i(i5);
            i(3).a(cVarI8, 0);
            i(5).a(cVarI8, 0);
            i(9).a(cVarI8, 0);
            return;
        }
        if (i4 == 8 && i5 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i5), 0);
            return;
        }
        if (i4 == 9 && i5 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i5), 0);
            return;
        }
        c cVarI9 = i(i4);
        c cVarI10 = dVar.i(i5);
        if (cVarI9.i(cVarI10)) {
            if (i4 == 6) {
                c cVarI11 = i(3);
                c cVarI12 = i(5);
                if (cVarI11 != null) {
                    cVarI11.j();
                }
                if (cVarI12 != null) {
                    cVarI12.j();
                }
            } else if (i4 == 3 || i4 == 5) {
                c cVarI13 = i(6);
                if (cVarI13 != null) {
                    cVarI13.j();
                }
                c cVarI14 = i(7);
                if (cVarI14.f != cVarI10) {
                    cVarI14.j();
                }
                c cVarF = i(i4).f();
                c cVarI15 = i(9);
                if (cVarI15.h()) {
                    cVarF.j();
                    cVarI15.j();
                }
            } else if (i4 == 2 || i4 == 4) {
                c cVarI16 = i(7);
                if (cVarI16.f != cVarI10) {
                    cVarI16.j();
                }
                c cVarF2 = i(i4).f();
                c cVarI17 = i(8);
                if (cVarI17.h()) {
                    cVarF2.j();
                    cVarI17.j();
                }
            }
            cVarI9.a(cVarI10, i6);
        }
    }

    public final void f(c cVar, c cVar2, int i4) {
        if (cVar.f3760d == this) {
            e(cVar.f3761e, cVar2.f3760d, cVar2.f3761e, i4);
        }
    }

    public final void g(s.c cVar) {
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        if (this.f3766a0 > 0) {
            cVar.k(this.M);
        }
    }

    public final void h() {
        if (this.f3771d == null) {
            k kVar = new k(this);
            kVar.f4275h.f4250e = 4;
            kVar.f4276i.f4250e = 5;
            kVar.f = 0;
            this.f3771d = kVar;
        }
        if (this.f3772e == null) {
            m mVar = new m(this);
            v.f fVar = new v.f(mVar);
            mVar.f4262k = fVar;
            mVar.f4263l = null;
            mVar.f4275h.f4250e = 6;
            mVar.f4276i.f4250e = 7;
            fVar.f4250e = 8;
            mVar.f = 1;
            this.f3772e = mVar;
        }
    }

    public c i(int i4) {
        switch (s.e.b(i4)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(u.o(i4));
        }
    }

    public final int j(int i4) {
        int[] iArr = this.f3791p0;
        if (i4 == 0) {
            return iArr[0];
        }
        if (i4 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final d l(int i4) {
        c cVar;
        c cVar2;
        if (i4 != 0) {
            if (i4 == 1 && (cVar2 = (cVar = this.L).f) != null && cVar2.f == cVar) {
                return cVar2.f3760d;
            }
            return null;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f;
        if (cVar4 == null || cVar4.f != cVar3) {
            return null;
        }
        return cVar4.f3760d;
    }

    public final d m(int i4) {
        c cVar;
        c cVar2;
        if (i4 != 0) {
            if (i4 == 1 && (cVar2 = (cVar = this.J).f) != null && cVar2.f == cVar) {
                return cVar2.f3760d;
            }
            return null;
        }
        c cVar3 = this.I;
        c cVar4 = cVar3.f;
        if (cVar4 == null || cVar4.f != cVar3) {
            return null;
        }
        return cVar4.f3760d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f3780j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i4 = this.U;
        int i5 = this.f3768b0;
        int[] iArr = this.C;
        int i6 = iArr[0];
        int i7 = this.f3796u;
        int i8 = this.f3793r;
        float f = this.f3798w;
        int[] iArr2 = this.f3791p0;
        int i9 = iArr2[0];
        float[] fArr = this.f3782k0;
        float f4 = fArr[0];
        o(sb, "    width", i4, i5, i6, i7, i8, f, i9);
        int i10 = this.V;
        int i11 = this.f3770c0;
        int i12 = iArr[1];
        int i13 = this.f3799x;
        int i14 = this.f3794s;
        float f5 = this.f3801z;
        int i15 = iArr2[1];
        float f6 = fArr[1];
        o(sb, "    height", i10, i11, i12, i13, i14, f5, i15);
        float f7 = this.W;
        int i16 = this.X;
        if (f7 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f7);
            sb.append(",");
            sb.append(i16);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.f3773e0, 0.5f);
        G(this.f3779i0, 0, "    horizontalChainStyle", sb);
        G(this.j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).f3808x0 + this.Y;
    }

    public final int s() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Z : ((e) dVar).f3809y0 + this.Z;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean t(int i4) {
        if (i4 == 0) {
            if ((this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.f3777h0 != null) {
            str = "id: " + this.f3777h0 + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        sb.append(this.V);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i4, int i5) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i4 == 0) {
            c cVar5 = this.I;
            c cVar6 = cVar5.f;
            if (cVar6 == null || !cVar6.f3759c || (cVar4 = (cVar3 = this.K).f) == null || !cVar4.f3759c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f.d()) >= i5;
        }
        c cVar7 = this.J;
        c cVar8 = cVar7.f;
        if (cVar8 == null || !cVar8.f3759c || (cVar2 = (cVar = this.L).f) == null || !cVar2.f3759c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f.d()) >= i5;
    }

    public final void v(int i4, int i5, int i6, int i7, d dVar) {
        i(i4).b(dVar.i(i5), i6, i7, true);
    }

    public final boolean w(int i4) {
        c cVar;
        c cVar2;
        int i5 = i4 * 2;
        c[] cVarArr = this.Q;
        c cVar3 = cVarArr[i5];
        c cVar4 = cVar3.f;
        return (cVar4 == null || cVar4.f == cVar3 || (cVar2 = (cVar = cVarArr[i5 + 1]).f) == null || cVar2.f != cVar) ? false : true;
    }

    public final boolean x() {
        c cVar = this.I;
        c cVar2 = cVar.f;
        if (cVar2 != null && cVar2.f == cVar) {
            return true;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f;
        return cVar4 != null && cVar4.f == cVar3;
    }

    public final boolean y() {
        c cVar = this.J;
        c cVar2 = cVar.f;
        if (cVar2 != null && cVar2.f == cVar) {
            return true;
        }
        c cVar3 = this.L;
        c cVar4 = cVar3.f;
        return cVar4 != null && cVar4.f == cVar3;
    }

    public final boolean z() {
        return this.f3775g && this.g0 != 8;
    }
}
