package b4;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g extends r3.b implements q3.a, w3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1095l;

    public g(h hVar) {
        super(hVar, z3.l.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f1095l = false;
    }

    @Override // q3.a
    public final Object a() {
        return this.f3606g.getClass().getSimpleName();
    }

    public final w3.a d() {
        if (this.f1095l) {
            return this;
        }
        w3.a aVar = this.f;
        if (aVar != null) {
            return aVar;
        }
        r3.l.f3614a.getClass();
        this.f = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return c().equals(gVar.c()) && this.f3608i.equals(gVar.f3608i) && this.f3609j.equals(gVar.f3609j) && r3.g.a(this.f3606g, gVar.f3606g);
        }
        if (obj instanceof g) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3609j.hashCode() + ((this.f3608i.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        w3.a aVarD = d();
        if (aVarD != this) {
            return aVarD.toString();
        }
        return "property " + this.f3608i + " (Kotlin reflection is not available)";
    }
}
