package p1;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3279a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f3280b;

    public c(ViewGroup viewGroup) {
        this.f3280b = viewGroup;
    }

    @Override // p1.p
    public final void a(r rVar) {
        if (!this.f3279a) {
            e4.a.j0(this.f3280b, false);
        }
        rVar.z(this);
    }

    @Override // p1.s, p1.p
    public final void b(r rVar) {
        e4.a.j0(this.f3280b, false);
        this.f3279a = true;
    }

    @Override // p1.s, p1.p
    public final void c() {
        e4.a.j0(this.f3280b, false);
    }

    @Override // p1.s, p1.p
    public final void d() {
        e4.a.j0(this.f3280b, true);
    }
}
