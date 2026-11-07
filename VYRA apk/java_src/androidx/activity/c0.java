package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends r3.h implements q3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j0 f186h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(j0 j0Var, int i4) {
        super(0);
        this.f185g = i4;
        this.f186h = j0Var;
    }

    @Override // q3.a
    public final Object a() {
        switch (this.f185g) {
            case 0:
                this.f186h.d();
                break;
            case 1:
                this.f186h.c();
                break;
            default:
                this.f186h.d();
                break;
        }
        return g3.g.f2156a;
    }
}
