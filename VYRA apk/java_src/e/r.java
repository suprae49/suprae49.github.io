package e;

import android.view.ViewGroup;
import p0.r0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f1988g;

    public /* synthetic */ r(d0 d0Var, int i4) {
        this.f = i4;
        this.f1988g = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f) {
            case 0:
                d0 d0Var = this.f1988g;
                if ((d0Var.f1878e0 & 1) != 0) {
                    d0Var.w(0);
                }
                if ((d0Var.f1878e0 & 4096) != 0) {
                    d0Var.w(108);
                }
                d0Var.d0 = false;
                d0Var.f1878e0 = 0;
                break;
            default:
                d0 d0Var2 = this.f1988g;
                d0Var2.B.showAtLocation(d0Var2.A, 55, 0, 0);
                r0 r0Var = d0Var2.D;
                if (r0Var != null) {
                    r0Var.b();
                }
                if (d0Var2.E && (viewGroup = d0Var2.F) != null && viewGroup.isLaidOut()) {
                    d0Var2.A.setAlpha(0.0f);
                    r0 r0VarA = p0.p0.a(d0Var2.A);
                    r0VarA.a(1.0f);
                    d0Var2.D = r0VarA;
                    r0VarA.d(new t(0, this));
                } else {
                    d0Var2.A.setAlpha(1.0f);
                    d0Var2.A.setVisibility(0);
                }
                break;
        }
    }
}
