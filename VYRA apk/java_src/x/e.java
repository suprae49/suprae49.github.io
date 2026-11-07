package x;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4500a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f4501a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4502b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f4503b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4504c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f4505c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4506d;
    public boolean d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4507e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f4508e0;
    public int f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f4509f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4510g;
    public int g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4511h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f4512h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4513i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f4514i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4515j;
    public int j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4516k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f4517k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4518l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f4519l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4520m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f4521m0;
    public int n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f4522n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4523o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f4524o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4525p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public u.d f4526p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f4528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4530t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4531u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4532v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4533w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4534x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4535y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4536z;

    public final void a() {
        this.d0 = false;
        this.f4501a0 = true;
        this.f4503b0 = true;
        int i4 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i4 == -2 && this.W) {
            this.f4501a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i5 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i5 == -2 && this.X) {
            this.f4503b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.f4501a0 = false;
            if (i4 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i5 == 0 || i5 == -1) {
            this.f4503b0 = false;
            if (i5 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f4504c == -1.0f && this.f4500a == -1 && this.f4502b == -1) {
            return;
        }
        this.d0 = true;
        this.f4501a0 = true;
        this.f4503b0 = true;
        if (!(this.f4526p0 instanceof u.h)) {
            this.f4526p0 = new u.h();
        }
        ((u.h) this.f4526p0).S(this.V);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i10 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i4);
        boolean z4 = false;
        boolean z5 = 1 == getLayoutDirection();
        this.f4512h0 = -1;
        this.f4514i0 = -1;
        this.f4509f0 = -1;
        this.g0 = -1;
        this.j0 = this.f4533w;
        this.f4517k0 = this.f4535y;
        float f = this.E;
        this.f4519l0 = f;
        int i11 = this.f4500a;
        this.f4521m0 = i11;
        int i12 = this.f4502b;
        this.f4522n0 = i12;
        float f4 = this.f4504c;
        this.f4524o0 = f4;
        int i13 = this.f4529s;
        if (z5) {
            if (i13 != -1) {
                this.f4512h0 = i13;
            } else {
                int i14 = this.f4530t;
                if (i14 != -1) {
                    this.f4514i0 = i14;
                } else {
                    i5 = this.f4531u;
                    if (i5 != -1) {
                        this.g0 = i5;
                        z4 = true;
                    }
                    i6 = this.f4532v;
                    if (i6 != -1) {
                        this.f4509f0 = i6;
                        z4 = true;
                    }
                    i7 = this.A;
                    if (i7 != Integer.MIN_VALUE) {
                        this.f4517k0 = i7;
                    }
                    i8 = this.B;
                    if (i8 != Integer.MIN_VALUE) {
                        this.j0 = i8;
                    }
                    if (z4) {
                        this.f4519l0 = 1.0f - f;
                    }
                    if (this.d0 && this.V == 1 && this.f4506d) {
                        if (f4 != -1.0f) {
                            this.f4524o0 = 1.0f - f4;
                            this.f4521m0 = -1;
                            this.f4522n0 = -1;
                        } else if (i11 != -1) {
                            this.f4522n0 = i11;
                            this.f4521m0 = -1;
                            this.f4524o0 = -1.0f;
                        } else if (i12 != -1) {
                            this.f4521m0 = i12;
                            this.f4522n0 = -1;
                            this.f4524o0 = -1.0f;
                        }
                    }
                }
            }
            z4 = true;
            i5 = this.f4531u;
            if (i5 != -1) {
                this.g0 = i5;
                z4 = true;
            }
            i6 = this.f4532v;
            if (i6 != -1) {
                this.f4509f0 = i6;
                z4 = true;
            }
            i7 = this.A;
            if (i7 != Integer.MIN_VALUE) {
                this.f4517k0 = i7;
            }
            i8 = this.B;
            if (i8 != Integer.MIN_VALUE) {
                this.j0 = i8;
            }
            if (z4) {
                this.f4519l0 = 1.0f - f;
            }
            if (this.d0) {
                if (f4 != -1.0f) {
                    this.f4524o0 = 1.0f - f4;
                    this.f4521m0 = -1;
                    this.f4522n0 = -1;
                } else if (i11 != -1) {
                    this.f4522n0 = i11;
                    this.f4521m0 = -1;
                    this.f4524o0 = -1.0f;
                } else if (i12 != -1) {
                    this.f4521m0 = i12;
                    this.f4522n0 = -1;
                    this.f4524o0 = -1.0f;
                }
            }
        } else {
            if (i13 != -1) {
                this.g0 = i13;
            }
            int i15 = this.f4530t;
            if (i15 != -1) {
                this.f4509f0 = i15;
            }
            int i16 = this.f4531u;
            if (i16 != -1) {
                this.f4512h0 = i16;
            }
            int i17 = this.f4532v;
            if (i17 != -1) {
                this.f4514i0 = i17;
            }
            int i18 = this.A;
            if (i18 != Integer.MIN_VALUE) {
                this.j0 = i18;
            }
            int i19 = this.B;
            if (i19 != Integer.MIN_VALUE) {
                this.f4517k0 = i19;
            }
        }
        if (this.f4531u == -1 && this.f4532v == -1 && this.f4530t == -1 && i13 == -1) {
            int i20 = this.f4510g;
            if (i20 != -1) {
                this.f4512h0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i10 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i10;
                }
            } else {
                int i21 = this.f4511h;
                if (i21 != -1) {
                    this.f4514i0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i10 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i10;
                    }
                }
            }
            int i22 = this.f4507e;
            if (i22 != -1) {
                this.f4509f0 = i22;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i9 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i9;
                return;
            }
            int i23 = this.f;
            if (i23 != -1) {
                this.g0 = i23;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i9 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i9;
            }
        }
    }
}
