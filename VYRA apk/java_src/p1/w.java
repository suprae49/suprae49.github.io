package p1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3353a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f3354b;

    public w(r rVar) {
        this.f3354b = rVar;
    }

    @Override // p1.p
    public final void a(r rVar) {
        switch (this.f3353a) {
            case 0:
                this.f3354b.C();
                rVar.z(this);
                break;
            default:
                x xVar = (x) this.f3354b;
                int i4 = xVar.J - 1;
                xVar.J = i4;
                if (i4 == 0) {
                    xVar.K = false;
                    xVar.n();
                }
                rVar.z(this);
                break;
        }
    }

    @Override // p1.s, p1.p
    public void f(r rVar) {
        switch (this.f3353a) {
            case 1:
                x xVar = (x) this.f3354b;
                if (!xVar.K) {
                    xVar.J();
                    xVar.K = true;
                }
                break;
        }
    }

    public /* synthetic */ w() {
    }
}
