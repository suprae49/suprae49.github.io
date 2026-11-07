package u2;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j.m f4192a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4194c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4195d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4196e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4193b = new ArrayList();

    public h(j.m mVar) {
        this.f4192a = mVar;
        b();
    }

    public final MenuItem a(int i4) {
        return (MenuItem) this.f4193b.get(i4);
    }

    public final void b() {
        ArrayList arrayList = this.f4193b;
        arrayList.clear();
        this.f4194c = 0;
        this.f4195d = 0;
        this.f4196e = 0;
        int i4 = 0;
        while (true) {
            j.m mVar = this.f4192a;
            if (i4 >= mVar.f.size()) {
                break;
            }
            MenuItem item = mVar.getItem(i4);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(arrayList.get(arrayList.size() - 1) instanceof a) && item.isVisible()) {
                    arrayList.add(new a());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i5 = 0; i5 < subMenu.size(); i5++) {
                    MenuItem item2 = subMenu.getItem(i5);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.f4194c++;
                    if (item2.isVisible()) {
                        this.f4195d++;
                    }
                }
                arrayList.add(new a());
            } else {
                arrayList.add(item);
                this.f4194c++;
                if (item.isVisible()) {
                    this.f4195d++;
                    this.f4196e++;
                }
            }
            i4++;
        }
        if (arrayList.isEmpty() || !(arrayList.get(arrayList.size() - 1) instanceof a)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
