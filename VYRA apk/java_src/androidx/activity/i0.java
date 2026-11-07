package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 extends r3.b implements q3.a, r3.f, w3.a, g3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f205m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i4, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, false);
        this.n = i5;
        this.f204l = i4;
        this.f205m = 0;
    }

    @Override // q3.a
    public final Object a() {
        switch (this.n) {
            case 0:
                ((j0) this.f3606g).f();
                break;
            default:
                ((j0) this.f3606g).f();
                break;
        }
        return g3.g.f2156a;
    }

    @Override // r3.f
    public final int b() {
        return this.f204l;
    }

    public final w3.a d() {
        r3.l.f3614a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return this.f3608i.equals(i0Var.f3608i) && this.f3609j.equals(i0Var.f3609j) && this.f205m == i0Var.f205m && this.f204l == i0Var.f204l && r3.g.a(this.f3606g, i0Var.f3606g) && c().equals(i0Var.c());
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        w3.a aVar = this.f;
        if (aVar == null) {
            d();
            this.f = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        c();
        return this.f3609j.hashCode() + ((this.f3608i.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        w3.a aVar = this.f;
        if (aVar == null) {
            d();
            this.f = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f3608i;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : androidx.fragment.app.u.m("function ", str, " (Kotlin reflection is not available)");
    }
}
