package k;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends s1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0 f2545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.c f2546p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(androidx.appcompat.widget.c cVar, androidx.appcompat.widget.c cVar2, n0 n0Var) {
        super(cVar2);
        this.f2546p = cVar;
        this.f2545o = n0Var;
    }

    @Override // k.s1
    public final j.c0 b() {
        return this.f2545o;
    }

    @Override // k.s1
    public final boolean c() {
        androidx.appcompat.widget.c cVar = this.f2546p;
        if (cVar.getInternalPopup().b()) {
            return true;
        }
        cVar.f429k.m(cVar.getTextDirection(), cVar.getTextAlignment());
        return true;
    }
}
