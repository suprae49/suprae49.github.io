package e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.g3;
import k.k3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends u1.h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k3 f1939e;
    public final Window.Callback f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j0 f1940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f1944k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d3.d0 f1945l = new d3.d0(1, this);

    public l0(MaterialToolbar materialToolbar, CharSequence charSequence, x xVar) {
        j0 j0Var = new j0(this);
        k3 k3Var = new k3(materialToolbar, false);
        this.f1939e = k3Var;
        xVar.getClass();
        this.f = xVar;
        k3Var.f2571k = xVar;
        materialToolbar.setOnMenuItemClickListener(j0Var);
        if (!k3Var.f2567g) {
            k3Var.f2568h = charSequence;
            if ((k3Var.f2563b & 8) != 0) {
                materialToolbar.setTitle(charSequence);
                if (k3Var.f2567g) {
                    p0.p0.n(materialToolbar.getRootView(), charSequence);
                }
            }
        }
        this.f1940g = new j0(this);
    }

    @Override // u1.h0
    public final Context C() {
        return this.f1939e.f2562a.getContext();
    }

    @Override // u1.h0
    public final void E() {
        this.f1939e.f2562a.setVisibility(8);
    }

    @Override // u1.h0
    public final boolean G() {
        k3 k3Var = this.f1939e;
        Toolbar toolbar = k3Var.f2562a;
        d3.d0 d0Var = this.f1945l;
        toolbar.removeCallbacks(d0Var);
        Toolbar toolbar2 = k3Var.f2562a;
        WeakHashMap weakHashMap = p0.p0.f3233a;
        toolbar2.postOnAnimation(d0Var);
        return true;
    }

    @Override // u1.h0
    public final boolean J() {
        return this.f1939e.f2562a.getVisibility() == 0;
    }

    @Override // u1.h0
    public final void O() {
        this.f1939e.f2562a.removeCallbacks(this.f1945l);
    }

    @Override // u1.h0
    public final boolean Q(int i4, KeyEvent keyEvent) {
        Menu menuU0 = u0();
        if (menuU0 == null) {
            return false;
        }
        menuU0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuU0.performShortcut(i4, keyEvent, 0);
    }

    @Override // u1.h0
    public final boolean S(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            T();
        }
        return true;
    }

    @Override // u1.h0
    public final boolean T() {
        return this.f1939e.f2562a.w();
    }

    @Override // u1.h0
    public final void Z(boolean z4) {
        int i4 = z4 ? 4 : 0;
        k3 k3Var = this.f1939e;
        k3Var.a((i4 & 4) | (k3Var.f2563b & (-5)));
    }

    @Override // u1.h0
    public final void a0() {
        k3 k3Var = this.f1939e;
        k3Var.a((k3Var.f2563b & (-3)) | 2);
    }

    @Override // u1.h0
    public final void e0(int i4) {
        this.f1939e.b(i4);
    }

    @Override // u1.h0
    public final void f0(Drawable drawable) {
        k3 k3Var = this.f1939e;
        k3Var.f = drawable;
        int i4 = k3Var.f2563b & 4;
        Toolbar toolbar = k3Var.f2562a;
        if (i4 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = k3Var.f2574o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // u1.h0
    public final boolean k() {
        androidx.appcompat.widget.b bVar;
        ActionMenuView actionMenuView = this.f1939e.f2562a.f;
        return (actionMenuView == null || (bVar = actionMenuView.f330y) == null || !bVar.c()) ? false : true;
    }

    @Override // u1.h0
    public final boolean l() {
        j.o oVar;
        g3 g3Var = this.f1939e.f2562a.R;
        if (g3Var == null || (oVar = g3Var.f2522g) == null) {
            return false;
        }
        if (g3Var == null) {
            oVar = null;
        }
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // u1.h0
    public final void n0(CharSequence charSequence) {
        k3 k3Var = this.f1939e;
        if (k3Var.f2567g) {
            return;
        }
        Toolbar toolbar = k3Var.f2562a;
        k3Var.f2568h = charSequence;
        if ((k3Var.f2563b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (k3Var.f2567g) {
                p0.p0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // u1.h0
    public final void o0() {
        this.f1939e.f2562a.setVisibility(0);
    }

    @Override // u1.h0
    public final void t(boolean z4) {
        if (z4 == this.f1943j) {
            return;
        }
        this.f1943j = z4;
        ArrayList arrayList = this.f1944k;
        if (arrayList.size() > 0) {
            throw androidx.fragment.app.u.i(0, arrayList);
        }
    }

    public final Menu u0() {
        boolean z4 = this.f1942i;
        k3 k3Var = this.f1939e;
        if (!z4) {
            k0 k0Var = new k0(this);
            j0 j0Var = new j0(this);
            Toolbar toolbar = k3Var.f2562a;
            toolbar.S = k0Var;
            toolbar.T = j0Var;
            ActionMenuView actionMenuView = toolbar.f;
            if (actionMenuView != null) {
                actionMenuView.f331z = k0Var;
                actionMenuView.A = j0Var;
            }
            this.f1942i = true;
        }
        return k3Var.f2562a.getMenu();
    }

    @Override // u1.h0
    public final int v() {
        return this.f1939e.f2563b;
    }

    @Override // u1.h0
    public final void Y(boolean z4) {
    }

    @Override // u1.h0
    public final void k0(boolean z4) {
    }

    @Override // u1.h0
    public final void M() {
    }
}
