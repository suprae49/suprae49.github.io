package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f863b;

    public final void a(t tVar, m mVar) {
        n nVarA = mVar.a();
        n nVar = this.f862a;
        nVar.getClass();
        if (nVarA.compareTo(nVar) < 0) {
            nVar = nVarA;
        }
        this.f862a = nVar;
        this.f863b.a(tVar, mVar);
        this.f862a = nVarA;
    }
}
