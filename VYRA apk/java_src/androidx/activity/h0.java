package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements c {
    public final androidx.fragment.app.m0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f202g;

    public h0(j0 j0Var, androidx.fragment.app.m0 m0Var) {
        m0Var.getClass();
        this.f202g = j0Var;
        this.f = m0Var;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        j0 j0Var = this.f202g;
        h3.c cVar = j0Var.f208b;
        androidx.fragment.app.m0 m0Var = this.f;
        cVar.remove(m0Var);
        if (r3.g.a(j0Var.f209c, m0Var)) {
            m0Var.getClass();
            j0Var.f209c = null;
        }
        m0Var.getClass();
        m0Var.f725b.remove(this);
        i0 i0Var = m0Var.f726c;
        if (i0Var != null) {
            i0Var.a();
        }
        m0Var.f726c = null;
    }
}
