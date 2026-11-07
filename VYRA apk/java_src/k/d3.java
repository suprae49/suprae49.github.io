package k;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2514g;

    public /* synthetic */ d3(Toolbar toolbar, int i4) {
        this.f = i4;
        this.f2514g = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                g3 g3Var = this.f2514g.R;
                j.o oVar = g3Var == null ? null : g3Var.f2522g;
                if (oVar != null) {
                    oVar.collapseActionView();
                }
                break;
            default:
                this.f2514g.o();
                break;
        }
    }
}
