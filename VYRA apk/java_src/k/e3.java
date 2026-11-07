package k;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements m, j.k {
    public final /* synthetic */ Toolbar f;

    public /* synthetic */ e3(Toolbar toolbar) {
        this.f = toolbar;
    }

    @Override // j.k
    public void i(j.m mVar) {
        Toolbar toolbar = this.f;
        androidx.appcompat.widget.b bVar = toolbar.f.f330y;
        if (bVar == null || !bVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.f579c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.n0) it.next()).f730a.s(mVar);
            }
        }
        e.j0 j0Var = toolbar.T;
        if (j0Var != null) {
            j0Var.i(mVar);
        }
    }

    @Override // j.k
    public boolean j(j.m mVar, MenuItem menuItem) {
        return false;
    }
}
