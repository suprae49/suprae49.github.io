package j;

import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2434a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItem f2436c;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2436c = tVar;
        this.f2435b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        switch (this.f2434a) {
            case 0:
                return ((MenuItem.OnActionExpandListener) this.f2435b).onMenuItemActionCollapse(((t) this.f2436c).h(menuItem));
            default:
                menuItem.getClass();
                u1.e eVar = (u1.e) this.f2435b;
                androidx.appcompat.widget.e eVar2 = eVar.f3886m;
                if (eVar2 != null) {
                    eVar2.setIconified(true);
                }
                eVar.f3875a.invalidateOptionsMenu();
                return true;
        }
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        switch (this.f2434a) {
            case 0:
                return ((MenuItem.OnActionExpandListener) this.f2435b).onMenuItemActionExpand(((t) this.f2436c).h(menuItem));
            default:
                menuItem.getClass();
                u1.e eVar = (u1.e) this.f2435b;
                eVar.getClass();
                Menu menu = eVar.f3885l;
                if (menu == null) {
                    return true;
                }
                int size = menu.size();
                for (int i4 = 0; i4 < size; i4++) {
                    MenuItem item = menu.getItem(i4);
                    item.getClass();
                    if (item != this.f2436c) {
                        item.setVisible(false);
                        item.setEnabled(false);
                    }
                }
                return true;
        }
    }

    public r(u1.e eVar, MenuItem menuItem) {
        this.f2435b = eVar;
        this.f2436c = menuItem;
    }
}
