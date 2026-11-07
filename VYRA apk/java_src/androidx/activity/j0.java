package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.u0;
import co.median.android.MainActivity;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3.c f208b = new h3.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.fragment.app.m0 f209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f211e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f212g;

    public j0(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.f207a = runnable;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            if (i4 >= 34) {
                onBackInvokedCallbackA = g0.f200a.a(new b0(this, 0), new b0(this, 1), new c0(this, 0), new c0(this, 1));
            } else {
                onBackInvokedCallbackA = e0.f191a.a(new c0(this, 2));
            }
            this.f210d = onBackInvokedCallbackA;
        }
    }

    public final void a(androidx.lifecycle.t tVar, androidx.fragment.app.m0 m0Var) {
        m0Var.getClass();
        androidx.lifecycle.o lifecycle = tVar.getLifecycle();
        if (((androidx.lifecycle.v) lifecycle).f866c == androidx.lifecycle.n.f) {
            return;
        }
        m0Var.f725b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, m0Var));
        f();
        m0Var.f726c = new i0(0, this, j0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    public final h0 b(androidx.fragment.app.m0 m0Var) {
        m0Var.getClass();
        this.f208b.addLast(m0Var);
        h0 h0Var = new h0(this, m0Var);
        m0Var.f725b.add(h0Var);
        f();
        m0Var.f726c = new i0(0, this, j0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 1);
        return h0Var;
    }

    public final void c() {
        Object objPrevious;
        if (this.f209c == null) {
            h3.c cVar = this.f208b;
            ListIterator<E> listIterator = cVar.listIterator(cVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((androidx.fragment.app.m0) objPrevious).f724a);
        }
        this.f209c = null;
    }

    public final void d() {
        Object objPrevious;
        androidx.fragment.app.m0 m0Var = this.f209c;
        if (m0Var == null) {
            h3.c cVar = this.f208b;
            ListIterator listIterator = cVar.listIterator(cVar.f2176h);
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((androidx.fragment.app.m0) objPrevious).f724a);
            m0Var = (androidx.fragment.app.m0) objPrevious;
        }
        this.f209c = null;
        if (m0Var == null) {
            this.f207a.run();
            return;
        }
        switch (m0Var.f727d) {
            case 0:
                u0 u0Var = (u0) m0Var.f728e;
                u0Var.x(true);
                if (!u0Var.f755h.f724a) {
                    u0Var.f754g.d();
                } else {
                    u0Var.M();
                }
                break;
            default:
                MainActivity mainActivity = (MainActivity) m0Var.f728e;
                int i4 = MainActivity.G0;
                if (!mainActivity.L()) {
                    mainActivity.finish();
                }
                break;
        }
    }

    public final void e(boolean z4) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f211e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f210d) == null) {
            return;
        }
        e0 e0Var = e0.f191a;
        if (z4 && !this.f) {
            e0Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z4 || !this.f) {
                return;
            }
            e0Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void f() {
        boolean z4 = this.f212g;
        boolean z5 = false;
        h3.c cVar = this.f208b;
        if (cVar == null || !cVar.isEmpty()) {
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.m0) it.next()).f724a) {
                    z5 = true;
                    break;
                }
            }
        }
        this.f212g = z5;
        if (z5 == z4 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z5);
    }
}
