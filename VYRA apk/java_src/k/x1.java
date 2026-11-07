package k;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a2 f2682g;

    public /* synthetic */ x1(a2 a2Var, int i4) {
        this.f = i4;
        this.f2682g = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                p1 p1Var = this.f2682g.f2470h;
                if (p1Var != null) {
                    p1Var.setListSelectionHidden(true);
                    p1Var.requestLayout();
                }
                break;
            default:
                a2 a2Var = this.f2682g;
                p1 p1Var2 = a2Var.f2470h;
                if (p1Var2 != null && p1Var2.isAttachedToWindow() && a2Var.f2470h.getCount() > a2Var.f2470h.getChildCount() && a2Var.f2470h.getChildCount() <= a2Var.f2479r) {
                    a2Var.E.setInputMethodMode(2);
                    a2Var.c();
                    break;
                }
                break;
        }
    }
}
