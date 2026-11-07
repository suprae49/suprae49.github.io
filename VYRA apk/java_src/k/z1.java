package k;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2 f2709a;

    public z1(a2 a2Var) {
        this.f2709a = a2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i4) {
        a2 a2Var = this.f2709a;
        x1 x1Var = a2Var.f2484w;
        b0 b0Var = a2Var.E;
        if (i4 != 1 || b0Var.getInputMethodMode() == 2 || b0Var.getContentView() == null) {
            return;
        }
        a2Var.A.removeCallbacks(x1Var);
        x1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }
}
