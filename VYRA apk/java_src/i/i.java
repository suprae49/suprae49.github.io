package i;

import k.k3;
import p0.s0;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2225e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2227h;

    public i(j jVar) {
        this.f2225e = 0;
        this.f2227h = jVar;
        this.f = false;
        this.f2226g = 0;
    }

    @Override // p0.s0
    public final void a() {
        switch (this.f2225e) {
            case 0:
                int i4 = this.f2226g + 1;
                this.f2226g = i4;
                j jVar = (j) this.f2227h;
                if (i4 == jVar.f2228a.size()) {
                    s0 s0Var = jVar.f2231d;
                    if (s0Var != null) {
                        s0Var.a();
                    }
                    this.f2226g = 0;
                    this.f = false;
                    jVar.f2232e = false;
                }
                break;
            default:
                if (!this.f) {
                    ((k3) this.f2227h).f2562a.setVisibility(this.f2226g);
                }
                break;
        }
    }

    @Override // u1.h0, p0.s0
    public void b() {
        switch (this.f2225e) {
            case 1:
                this.f = true;
                break;
        }
    }

    @Override // u1.h0, p0.s0
    public final void c() {
        switch (this.f2225e) {
            case 0:
                if (!this.f) {
                    this.f = true;
                    s0 s0Var = ((j) this.f2227h).f2231d;
                    if (s0Var != null) {
                        s0Var.c();
                    }
                    break;
                }
                break;
            default:
                ((k3) this.f2227h).f2562a.setVisibility(0);
                break;
        }
    }

    public i(k3 k3Var, int i4) {
        this.f2225e = 1;
        this.f2227h = k3Var;
        this.f2226g = i4;
        this.f = false;
    }
}
