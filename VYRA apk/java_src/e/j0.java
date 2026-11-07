package e;

import android.view.MenuItem;
import android.view.Window;
import k.i3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements i3, j.k {
    public final /* synthetic */ l0 f;

    @Override // j.k
    public void i(j.m mVar) {
        l0 l0Var = this.f;
        boolean zQ = l0Var.f1939e.f2562a.q();
        Window.Callback callback = l0Var.f;
        if (zQ) {
            callback.onPanelClosed(108, mVar);
        } else if (callback.onPreparePanel(0, null, mVar)) {
            callback.onMenuOpened(108, mVar);
        }
    }

    @Override // j.k
    public boolean j(j.m mVar, MenuItem menuItem) {
        return false;
    }

    @Override // k.i3
    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.f.f.onMenuItemSelected(0, menuItem);
    }
}
