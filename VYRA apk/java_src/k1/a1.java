package k1;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2730a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f2731b;

    public a1(x xVar) {
        this.f2731b = xVar;
    }

    @Override // k1.o0
    public final void a(RecyclerView recyclerView, int i4) {
        if (i4 == 0 && this.f2730a) {
            this.f2730a = false;
            this.f2731b.f();
        }
    }

    @Override // k1.o0
    public final void b(RecyclerView recyclerView, int i4, int i5) {
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.f2730a = true;
    }
}
