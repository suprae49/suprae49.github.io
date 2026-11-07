package e;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1840b;

    public a0() {
        ArrayList arrayList = new ArrayList();
        this.f1840b = arrayList;
        arrayList.add(new v2.p());
    }

    public static float g(int i4, int i5, int i6) {
        return u1.h0.i((i4 - i5) / i6, 0.0f, 1.0f);
    }

    public abstract void c();

    public void d() {
        z zVar = (z) this.f1839a;
        if (zVar != null) {
            try {
                ((d0) this.f1840b).f1885p.unregisterReceiver(zVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1839a = null;
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem h(MenuItem menuItem) {
        if (!(menuItem instanceof h0.a)) {
            return menuItem;
        }
        h0.a aVar = (h0.a) menuItem;
        if (((p.k) this.f1840b) == null) {
            this.f1840b = new p.k(0);
        }
        MenuItem menuItem2 = (MenuItem) ((p.k) this.f1840b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j.t tVar = new j.t((Context) this.f1839a, aVar);
        ((p.k) this.f1840b).put(aVar, tVar);
        return tVar;
    }

    public abstract void i();

    public abstract void j();

    public abstract void k(v2.d dVar);

    public abstract void l();

    public void m() {
        d();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((z) this.f1839a) == null) {
            this.f1839a = new z(0, this);
        }
        ((d0) this.f1840b).f1885p.registerReceiver((z) this.f1839a, intentFilterE);
    }

    public abstract void n();

    public abstract void o();

    public a0(Context context) {
        this.f1839a = context;
    }

    public a0(d0 d0Var) {
        this.f1840b = d0Var;
    }
}
