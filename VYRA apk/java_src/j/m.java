package j;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class m implements Menu {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f2383y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f2385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f2388e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f2389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f2391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f2392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2393k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f2395m;
    public Drawable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f2396o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o f2403v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2405x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2394l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2397p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2398q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2399r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2400s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f2401t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2402u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2404w = false;

    public m(Context context) {
        boolean zN;
        boolean z4 = false;
        this.f2384a = context;
        Resources resources = context.getResources();
        this.f2385b = resources;
        this.f = new ArrayList();
        this.f2389g = new ArrayList();
        this.f2390h = true;
        this.f2391i = new ArrayList();
        this.f2392j = new ArrayList();
        this.f2393k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zN = c0.a.n(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zN = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zN) {
                z4 = true;
            }
        }
        this.f2387d = z4;
    }

    public o a(int i4, int i5, int i6, CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            androidx.fragment.app.q.q("order does not contain a valid category.");
            return null;
        }
        int i9 = (f2383y[i8] << 16) | (65535 & i6);
        o oVar = new o(this, i4, i5, i6, i9, charSequence, this.f2394l);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((o) arrayList.get(size)).f2411d <= i9) {
                i7 = size + 1;
                arrayList.add(i7, oVar);
                p(true);
                return oVar;
            }
        }
        i7 = 0;
        arrayList.add(i7, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return a(0, 0, 0, this.f2385b.getString(i4));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f2384a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o oVarA = a(i4, i5, i6, resolveInfo.loadLabel(packageManager));
            oVarA.setIcon(resolveInfo.loadIcon(packageManager));
            oVarA.f2413g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = oVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        o oVarA = a(i4, i5, i6, charSequence);
        e0 e0Var = new e0(this.f2384a, this, oVarA);
        oVarA.f2420o = e0Var;
        e0Var.setHeaderTitle(oVarA.f2412e);
        return e0Var;
    }

    public final void b(y yVar, Context context) {
        this.f2402u.add(new WeakReference(yVar));
        yVar.h(context, this);
        this.f2393k = true;
    }

    public final void c(boolean z4) {
        if (this.f2400s) {
            return;
        }
        this.f2400s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2402u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.a(this, z4);
            }
        }
        this.f2400s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f2403v;
        if (oVar != null) {
            d(oVar);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.f2395m = null;
        this.f2396o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2402u;
        boolean zK = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2403v == oVar) {
            y();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                y yVar = (y) weakReference.get();
                if (yVar != null) {
                    zK = yVar.k(oVar);
                    if (zK) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            x();
            if (zK) {
                this.f2403v = null;
            }
        }
        return zK;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f2388e;
        return kVar != null && kVar.j(mVar, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2402u;
        boolean zD = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar != null) {
                zD = yVar.d(oVar);
                if (zD) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        x();
        if (zD) {
            this.f2403v = oVar;
        }
        return zD;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f2408a == i4) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (menuItemFindItem = oVar.f2420o.findItem(i4)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final o g(int i4, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2401t;
        arrayList.clear();
        h(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        boolean zN = n();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            char c4 = zN ? oVar.f2416j : oVar.f2414h;
            char[] cArr = keyData.meta;
            if ((c4 == cArr[0] && (metaState & 2) == 0) || ((c4 == cArr[2] && (metaState & 2) != 0) || (zN && c4 == '\b' && i4 == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return (MenuItem) this.f.get(i4);
    }

    public final void h(List list, int i4, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                o oVar = (o) arrayList.get(i5);
                if (oVar.hasSubMenu()) {
                    oVar.f2420o.h(list, i4, keyEvent);
                }
                char c4 = zN ? oVar.f2416j : oVar.f2414h;
                if ((modifiers & 69647) == ((zN ? oVar.f2417k : oVar.f2415i) & 69647) && c4 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c4 == cArr[0] || c4 == cArr[2] || (zN && c4 == '\b' && i4 == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2405x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((o) arrayList.get(i4)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f2393k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2402u;
            boolean zI = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zI |= yVar.i();
                }
            }
            ArrayList arrayList = this.f2391i;
            ArrayList arrayList2 = this.f2392j;
            if (zI) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i4 = 0; i4 < size; i4++) {
                    o oVar = (o) arrayListL.get(i4);
                    if ((oVar.f2429x & 32) == 32) {
                        arrayList.add(oVar);
                    } else {
                        arrayList2.add(oVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f2393k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return g(i4, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z4 = this.f2390h;
        ArrayList arrayList = this.f2389g;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList2.get(i4);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.f2390h = false;
        this.f2393k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2404w;
    }

    public boolean n() {
        return this.f2386c;
    }

    public boolean o() {
        return this.f2387d;
    }

    public void p(boolean z4) {
        if (this.f2397p) {
            this.f2398q = true;
            if (z4) {
                this.f2399r = true;
                return;
            }
            return;
        }
        if (z4) {
            this.f2390h = true;
            this.f2393k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2402u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.f(z4);
            }
        }
        x();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return q(findItem(i4), null, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        o oVarG = g(i4, keyEvent);
        boolean zQ = oVarG != null ? q(oVarG, null, i5) : false;
        if ((i5 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, y yVar, int i4) {
        p pVar;
        boolean zExpandActionView;
        p pVar2;
        boolean z4;
        e0 e0Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        y yVar2;
        o oVar = (o) menuItem;
        boolean zM = false;
        if (oVar == null || !oVar.isEnabled()) {
            return false;
        }
        m mVar = oVar.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = oVar.f2421p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(oVar)) && !mVar.e(mVar, oVar)) {
            Intent intent = oVar.f2413g;
            if (intent != null) {
                try {
                    mVar.f2384a.startActivity(intent);
                } catch (ActivityNotFoundException e5) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e5);
                    pVar = oVar.A;
                    if (pVar == null) {
                    }
                    zExpandActionView = false;
                    pVar2 = oVar.A;
                    if (pVar2 == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (oVar.e()) {
                        zExpandActionView |= oVar.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (oVar.hasSubMenu()) {
                        if ((i4 & 4) == 0) {
                            c(false);
                        }
                        if (!oVar.hasSubMenu()) {
                            e0 e0Var2 = new e0(this.f2384a, this, oVar);
                            oVar.f2420o = e0Var2;
                            e0Var2.setHeaderTitle(oVar.f2412e);
                        }
                        e0Var = oVar.f2420o;
                        if (z4) {
                            pVar2.f2433b.onPrepareSubMenu(e0Var);
                        }
                        copyOnWriteArrayList = this.f2402u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (yVar != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                yVar2 = (y) weakReference.get();
                                if (yVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zM) {
                                    zM = yVar2.m(e0Var);
                                }
                            }
                        }
                        zExpandActionView |= zM;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i4 & 4) == 0) {
                            c(false);
                        }
                        if (!oVar.hasSubMenu()) {
                            e0 e0Var3 = new e0(this.f2384a, this, oVar);
                            oVar.f2420o = e0Var3;
                            e0Var3.setHeaderTitle(oVar.f2412e);
                        }
                        e0Var = oVar.f2420o;
                        if (z4) {
                            pVar2.f2433b.onPrepareSubMenu(e0Var);
                        }
                        copyOnWriteArrayList = this.f2402u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zM = yVar != null ? yVar.m(e0Var) : false;
                            while (r8.hasNext()) {
                                yVar2 = (y) weakReference.get();
                                if (yVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zM) {
                                    zM = yVar2.m(e0Var);
                                }
                            }
                        }
                        zExpandActionView |= zM;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                pVar = oVar.A;
                if (pVar == null && pVar.f2433b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        pVar2 = oVar.A;
        if (pVar2 == null && pVar2.f2433b.hasSubMenu()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (oVar.e()) {
            zExpandActionView |= oVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (oVar.hasSubMenu() || z4) {
            if ((i4 & 4) == 0) {
                c(false);
            }
            if (!oVar.hasSubMenu()) {
                e0 e0Var4 = new e0(this.f2384a, this, oVar);
                oVar.f2420o = e0Var4;
                e0Var4.setHeaderTitle(oVar.f2412e);
            }
            e0Var = oVar.f2420o;
            if (z4) {
                pVar2.f2433b.onPrepareSubMenu(e0Var);
            }
            copyOnWriteArrayList = this.f2402u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (yVar != null) {
                }
                while (r8.hasNext()) {
                    yVar2 = (y) weakReference.get();
                    if (yVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zM) {
                        zM = yVar2.m(e0Var);
                    }
                }
            }
            zExpandActionView |= zM;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i4 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2402u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((o) arrayList.get(i6)).f2409b == i4) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i5 + 1;
                if (i5 >= size2 || ((o) arrayList.get(i6)).f2409b != i4) {
                    break;
                }
                if (i6 >= 0 && i6 < arrayList.size()) {
                    arrayList.remove(i6);
                }
                i5 = i7;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((o) arrayList.get(i5)).f2408a == i4) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 < 0 || i5 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i5);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).s(bundle);
            }
        }
        int i5 = bundle.getInt("android:menu:expandedactionview");
        if (i5 <= 0 || (menuItemFindItem = findItem(i5)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z4, boolean z5) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f2409b == i4) {
                oVar.f(z5);
                oVar.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.f2404w = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z4) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f2409b == i4) {
                oVar.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z4) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f2409b == i4) {
                int i6 = oVar.f2429x;
                int i7 = (i6 & (-9)) | (z4 ? 0 : 8);
                oVar.f2429x = i7;
                if (i6 != i7) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f2386c = z4;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2402u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference weakReference : copyOnWriteArrayList) {
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = yVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        yVar.e(parcelable);
                    }
                }
            }
        }
    }

    public final void u(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void v(Bundle bundle) {
        Parcelable parcelableJ;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2402u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = yVar.getId();
                if (id > 0 && (parcelableJ = yVar.j()) != null) {
                    sparseArray.put(id, parcelableJ);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public final void w(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        if (view != null) {
            this.f2396o = view;
            this.f2395m = null;
            this.n = null;
        } else {
            if (i4 > 0) {
                this.f2395m = this.f2385b.getText(i4);
            } else if (charSequence != null) {
                this.f2395m = charSequence;
            }
            if (i5 > 0) {
                this.n = c0.c.getDrawable(this.f2384a, i5);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.f2396o = null;
        }
        p(false);
    }

    public final void x() {
        this.f2397p = false;
        if (this.f2398q) {
            this.f2398q = false;
            p(this.f2399r);
        }
    }

    public final void y() {
        if (this.f2397p) {
            return;
        }
        this.f2397p = true;
        this.f2398q = false;
        this.f2399r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return a(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, int i7) {
        return a(i4, i5, i6, this.f2385b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f2385b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.f2385b.getString(i7));
    }

    public m k() {
        return this;
    }
}
