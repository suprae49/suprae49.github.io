package b4;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class o extends z3.a implements k3.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k3.e f1109i;

    public o(i3.g gVar, k3.e eVar) {
        super(gVar, true);
        this.f1109i = eVar;
    }

    @Override // k3.b
    public final k3.b c() {
        k3.e eVar = this.f1109i;
        if (eVar != null) {
            return eVar;
        }
        return null;
    }

    @Override // z3.e0
    public void h(Object obj) {
        d.d(e4.a.N(this.f1109i), z3.l.d(obj));
    }

    @Override // z3.e0
    public void i(Object obj) {
        this.f1109i.e(z3.l.d(obj));
    }

    @Override // z3.e0
    public final boolean w() {
        return true;
    }
}
