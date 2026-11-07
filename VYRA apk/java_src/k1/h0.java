package k1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f2787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f2788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2791e;
    public long f;

    public static void b(x0 x0Var) {
        RecyclerView recyclerView;
        int i4 = x0Var.f2953j;
        if (x0Var.f() || (i4 & 4) != 0 || (recyclerView = x0Var.f2960r) == null) {
            return;
        }
        recyclerView.F(x0Var);
    }

    public abstract boolean a(x0 x0Var, x0 x0Var2, g0 g0Var, g0 g0Var2);

    public final void c(x0 x0Var) {
        a0 a0Var = this.f2787a;
        if (a0Var != null) {
            RecyclerView recyclerView = a0Var.f2729a;
            boolean z4 = true;
            x0Var.n(true);
            View view = x0Var.f2945a;
            if (x0Var.f2951h != null && x0Var.f2952i == null) {
                x0Var.f2951h = null;
            }
            x0Var.f2952i = null;
            if ((x0Var.f2953j & 16) != 0) {
                return;
            }
            v1.b bVar = recyclerView.f913g;
            recyclerView.c0();
            androidx.emoji2.text.t tVar = recyclerView.f918j;
            b bVar2 = (b) tVar.f579c;
            a0 a0Var2 = (a0) tVar.f578b;
            int iIndexOfChild = a0Var2.f2729a.indexOfChild(view);
            if (iIndexOfChild == -1) {
                tVar.x(view);
            } else if (bVar2.d(iIndexOfChild)) {
                bVar2.f(iIndexOfChild);
                tVar.x(view);
                a0Var2.h(iIndexOfChild);
            } else {
                z4 = false;
            }
            if (z4) {
                x0 x0VarI = RecyclerView.I(view);
                bVar.n(x0VarI);
                bVar.j(x0VarI);
            }
            recyclerView.d0(!z4);
            if (z4 || !x0Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(x0 x0Var);

    public abstract void e();

    public abstract boolean f();
}
