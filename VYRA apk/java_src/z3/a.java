package z3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends e0 implements i3.c, j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i3.g f4892h;

    public a(i3.g gVar, boolean z4) {
        super(z4);
        u((e0) gVar.a(i.f4909g));
        this.f4892h = gVar.b(this);
    }

    @Override // z3.e0
    public final void A(Object obj) {
        if (obj instanceof e) {
            e.f4903b.get((e) obj);
        }
    }

    @Override // i3.c
    public final i3.g d() {
        return this.f4892h;
    }

    @Override // i3.c
    public final void e(Object obj) {
        Throwable th = obj instanceof g3.c ? ((g3.c) obj).f : null;
        if (th != null) {
            obj = new e(th);
        }
        Object objX = x(obj);
        if (objX == l.f4915c) {
            return;
        }
        i(objX);
    }

    @Override // z3.e0
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // z3.e0
    public final void t(androidx.fragment.app.z zVar) {
        l.c(this.f4892h, zVar);
    }
}
