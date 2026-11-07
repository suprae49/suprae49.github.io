package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends e.a0 implements Menu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f2324c;

    public b0(Context context, m mVar) {
        super(context);
        if (mVar != null) {
            this.f2324c = mVar;
        } else {
            androidx.fragment.app.q.q("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return h(this.f2324c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f2324c.addIntentOptions(i4, i5, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr[i8] = h(menuItemArr2[i8]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f2324c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        p.k kVar = (p.k) this.f1840b;
        if (kVar != null) {
            kVar.clear();
        }
        this.f2324c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f2324c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        return h(this.f2324c.findItem(i4));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return h(this.f2324c.getItem(i4));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f2324c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.f2324c.isShortcutKey(i4, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return this.f2324c.performIdentifierAction(i4, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        return this.f2324c.performShortcut(i4, keyEvent, i5);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        if (((p.k) this.f1840b) != null) {
            int i5 = 0;
            while (true) {
                p.k kVar = (p.k) this.f1840b;
                if (i5 >= kVar.f3157h) {
                    break;
                }
                if (((h0.a) kVar.f(i5)).getGroupId() == i4) {
                    ((p.k) this.f1840b).g(i5);
                    i5--;
                }
                i5++;
            }
        }
        this.f2324c.removeGroup(i4);
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        if (((p.k) this.f1840b) != null) {
            int i5 = 0;
            while (true) {
                p.k kVar = (p.k) this.f1840b;
                if (i5 >= kVar.f3157h) {
                    break;
                }
                if (((h0.a) kVar.f(i5)).getItemId() == i4) {
                    ((p.k) this.f1840b).g(i5);
                    break;
                }
                i5++;
            }
        }
        this.f2324c.removeItem(i4);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z4, boolean z5) {
        this.f2324c.setGroupCheckable(i4, z4, z5);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z4) {
        this.f2324c.setGroupEnabled(i4, z4);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z4) {
        this.f2324c.setGroupVisible(i4, z4);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f2324c.setQwertyMode(z4);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2324c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return this.f2324c.addSubMenu(i4);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        return this.f2324c.addSubMenu(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return this.f2324c.addSubMenu(i4, i5, i6, i7);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return h(this.f2324c.add(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return h(this.f2324c.a(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, int i7) {
        return h(this.f2324c.add(i4, i5, i6, i7));
    }
}
