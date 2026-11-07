package x;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f4564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f4565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f4566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f4567e;
    public HashMap f;

    public j() {
        m mVar = new m();
        mVar.f4614a = 0;
        mVar.f4615b = 0;
        mVar.f4616c = 1.0f;
        mVar.f4617d = Float.NaN;
        this.f4564b = mVar;
        l lVar = new l();
        lVar.f4606a = -1;
        lVar.f4607b = 0;
        lVar.f4608c = -1;
        lVar.f4609d = Float.NaN;
        lVar.f4610e = Float.NaN;
        lVar.f = Float.NaN;
        lVar.f4611g = -1;
        lVar.f4612h = null;
        lVar.f4613i = -1;
        this.f4565c = lVar;
        k kVar = new k();
        kVar.f4569a = false;
        kVar.f4575d = -1;
        kVar.f4576e = -1;
        kVar.f = -1.0f;
        kVar.f4579g = true;
        kVar.f4580h = -1;
        kVar.f4582i = -1;
        kVar.f4584j = -1;
        kVar.f4585k = -1;
        kVar.f4587l = -1;
        kVar.f4589m = -1;
        kVar.n = -1;
        kVar.f4592o = -1;
        kVar.f4594p = -1;
        kVar.f4595q = -1;
        kVar.f4596r = -1;
        kVar.f4597s = -1;
        kVar.f4598t = -1;
        kVar.f4599u = -1;
        kVar.f4600v = -1;
        kVar.f4601w = 0.5f;
        kVar.f4602x = 0.5f;
        kVar.f4603y = null;
        kVar.f4604z = -1;
        kVar.A = 0;
        kVar.B = 0.0f;
        kVar.C = -1;
        kVar.D = -1;
        kVar.E = -1;
        kVar.F = 0;
        kVar.G = 0;
        kVar.H = 0;
        kVar.I = 0;
        kVar.J = 0;
        kVar.K = 0;
        kVar.L = 0;
        kVar.M = Integer.MIN_VALUE;
        kVar.N = Integer.MIN_VALUE;
        kVar.O = Integer.MIN_VALUE;
        kVar.P = Integer.MIN_VALUE;
        kVar.Q = Integer.MIN_VALUE;
        kVar.R = Integer.MIN_VALUE;
        kVar.S = Integer.MIN_VALUE;
        kVar.T = -1.0f;
        kVar.U = -1.0f;
        kVar.V = 0;
        kVar.W = 0;
        kVar.X = 0;
        kVar.Y = 0;
        kVar.Z = 0;
        kVar.f4570a0 = 0;
        kVar.f4572b0 = 0;
        kVar.f4574c0 = 0;
        kVar.d0 = 1.0f;
        kVar.f4577e0 = 1.0f;
        kVar.f4578f0 = -1;
        kVar.g0 = 0;
        kVar.f4581h0 = -1;
        kVar.f4588l0 = false;
        kVar.f4590m0 = false;
        kVar.f4591n0 = true;
        kVar.f4593o0 = 0;
        this.f4566d = kVar;
        n nVar = new n();
        nVar.f4618a = 0.0f;
        nVar.f4619b = 0.0f;
        nVar.f4620c = 0.0f;
        nVar.f4621d = 1.0f;
        nVar.f4622e = 1.0f;
        nVar.f = Float.NaN;
        nVar.f4623g = Float.NaN;
        nVar.f4624h = -1;
        nVar.f4625i = 0.0f;
        nVar.f4626j = 0.0f;
        nVar.f4627k = 0.0f;
        nVar.f4628l = false;
        nVar.f4629m = 0.0f;
        this.f4567e = nVar;
        this.f = new HashMap();
    }

    public final void a(e eVar) {
        k kVar = this.f4566d;
        eVar.f4507e = kVar.f4580h;
        eVar.f = kVar.f4582i;
        eVar.f4510g = kVar.f4584j;
        eVar.f4511h = kVar.f4585k;
        eVar.f4513i = kVar.f4587l;
        eVar.f4515j = kVar.f4589m;
        eVar.f4516k = kVar.n;
        eVar.f4518l = kVar.f4592o;
        eVar.f4520m = kVar.f4594p;
        eVar.n = kVar.f4595q;
        eVar.f4523o = kVar.f4596r;
        eVar.f4529s = kVar.f4597s;
        eVar.f4530t = kVar.f4598t;
        eVar.f4531u = kVar.f4599u;
        eVar.f4532v = kVar.f4600v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = kVar.F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = kVar.G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = kVar.H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = kVar.I;
        eVar.A = kVar.R;
        eVar.B = kVar.Q;
        eVar.f4534x = kVar.N;
        eVar.f4536z = kVar.P;
        eVar.E = kVar.f4601w;
        eVar.F = kVar.f4602x;
        eVar.f4525p = kVar.f4604z;
        eVar.f4527q = kVar.A;
        eVar.f4528r = kVar.B;
        eVar.G = kVar.f4603y;
        eVar.T = kVar.C;
        eVar.U = kVar.D;
        eVar.I = kVar.T;
        eVar.H = kVar.U;
        eVar.K = kVar.W;
        eVar.J = kVar.V;
        eVar.W = kVar.f4588l0;
        eVar.X = kVar.f4590m0;
        eVar.L = kVar.X;
        eVar.M = kVar.Y;
        eVar.P = kVar.Z;
        eVar.Q = kVar.f4570a0;
        eVar.N = kVar.f4572b0;
        eVar.O = kVar.f4574c0;
        eVar.R = kVar.d0;
        eVar.S = kVar.f4577e0;
        eVar.V = kVar.E;
        eVar.f4504c = kVar.f;
        eVar.f4500a = kVar.f4575d;
        eVar.f4502b = kVar.f4576e;
        ((ViewGroup.MarginLayoutParams) eVar).width = kVar.f4571b;
        ((ViewGroup.MarginLayoutParams) eVar).height = kVar.f4573c;
        String str = kVar.f4586k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.Z = kVar.f4593o0;
        eVar.setMarginStart(kVar.K);
        eVar.setMarginEnd(kVar.J);
        eVar.a();
    }

    public final Object clone() {
        j jVar = new j();
        k kVar = jVar.f4566d;
        kVar.getClass();
        k kVar2 = this.f4566d;
        kVar.f4569a = kVar2.f4569a;
        kVar.f4571b = kVar2.f4571b;
        kVar.f4573c = kVar2.f4573c;
        kVar.f4575d = kVar2.f4575d;
        kVar.f4576e = kVar2.f4576e;
        kVar.f = kVar2.f;
        kVar.f4579g = kVar2.f4579g;
        kVar.f4580h = kVar2.f4580h;
        kVar.f4582i = kVar2.f4582i;
        kVar.f4584j = kVar2.f4584j;
        kVar.f4585k = kVar2.f4585k;
        kVar.f4587l = kVar2.f4587l;
        kVar.f4589m = kVar2.f4589m;
        kVar.n = kVar2.n;
        kVar.f4592o = kVar2.f4592o;
        kVar.f4594p = kVar2.f4594p;
        kVar.f4595q = kVar2.f4595q;
        kVar.f4596r = kVar2.f4596r;
        kVar.f4597s = kVar2.f4597s;
        kVar.f4598t = kVar2.f4598t;
        kVar.f4599u = kVar2.f4599u;
        kVar.f4600v = kVar2.f4600v;
        kVar.f4601w = kVar2.f4601w;
        kVar.f4602x = kVar2.f4602x;
        kVar.f4603y = kVar2.f4603y;
        kVar.f4604z = kVar2.f4604z;
        kVar.A = kVar2.A;
        kVar.B = kVar2.B;
        kVar.C = kVar2.C;
        kVar.D = kVar2.D;
        kVar.E = kVar2.E;
        kVar.F = kVar2.F;
        kVar.G = kVar2.G;
        kVar.H = kVar2.H;
        kVar.I = kVar2.I;
        kVar.J = kVar2.J;
        kVar.K = kVar2.K;
        kVar.L = kVar2.L;
        kVar.M = kVar2.M;
        kVar.N = kVar2.N;
        kVar.O = kVar2.O;
        kVar.P = kVar2.P;
        kVar.Q = kVar2.Q;
        kVar.R = kVar2.R;
        kVar.S = kVar2.S;
        kVar.T = kVar2.T;
        kVar.U = kVar2.U;
        kVar.V = kVar2.V;
        kVar.W = kVar2.W;
        kVar.X = kVar2.X;
        kVar.Y = kVar2.Y;
        kVar.Z = kVar2.Z;
        kVar.f4570a0 = kVar2.f4570a0;
        kVar.f4572b0 = kVar2.f4572b0;
        kVar.f4574c0 = kVar2.f4574c0;
        kVar.d0 = kVar2.d0;
        kVar.f4577e0 = kVar2.f4577e0;
        kVar.f4578f0 = kVar2.f4578f0;
        kVar.g0 = kVar2.g0;
        kVar.f4581h0 = kVar2.f4581h0;
        kVar.f4586k0 = kVar2.f4586k0;
        int[] iArr = kVar2.f4583i0;
        if (iArr == null || kVar2.j0 != null) {
            kVar.f4583i0 = null;
        } else {
            kVar.f4583i0 = Arrays.copyOf(iArr, iArr.length);
        }
        kVar.j0 = kVar2.j0;
        kVar.f4588l0 = kVar2.f4588l0;
        kVar.f4590m0 = kVar2.f4590m0;
        kVar.f4591n0 = kVar2.f4591n0;
        kVar.f4593o0 = kVar2.f4593o0;
        l lVar = jVar.f4565c;
        lVar.getClass();
        l lVar2 = this.f4565c;
        lVar2.getClass();
        lVar.f4606a = lVar2.f4606a;
        lVar.f4608c = lVar2.f4608c;
        lVar.f4610e = lVar2.f4610e;
        lVar.f4609d = lVar2.f4609d;
        m mVar = this.f4564b;
        int i4 = mVar.f4614a;
        m mVar2 = jVar.f4564b;
        mVar2.f4614a = i4;
        mVar2.f4616c = mVar.f4616c;
        mVar2.f4617d = mVar.f4617d;
        mVar2.f4615b = mVar.f4615b;
        n nVar = jVar.f4567e;
        nVar.getClass();
        n nVar2 = this.f4567e;
        nVar2.getClass();
        nVar.f4618a = nVar2.f4618a;
        nVar.f4619b = nVar2.f4619b;
        nVar.f4620c = nVar2.f4620c;
        nVar.f4621d = nVar2.f4621d;
        nVar.f4622e = nVar2.f4622e;
        nVar.f = nVar2.f;
        nVar.f4623g = nVar2.f4623g;
        nVar.f4624h = nVar2.f4624h;
        nVar.f4625i = nVar2.f4625i;
        nVar.f4626j = nVar2.f4626j;
        nVar.f4627k = nVar2.f4627k;
        nVar.f4628l = nVar2.f4628l;
        nVar.f4629m = nVar2.f4629m;
        jVar.f4563a = this.f4563a;
        return jVar;
    }
}
