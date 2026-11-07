package p1;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p.f f3347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f3348b;

    public t(u uVar, p.f fVar) {
        this.f3348b = uVar;
        this.f3347a = fVar;
    }

    @Override // p1.p
    public final void a(r rVar) {
        ((ArrayList) this.f3347a.get(this.f3348b.f3349g)).remove(rVar);
        rVar.z(this);
    }
}
