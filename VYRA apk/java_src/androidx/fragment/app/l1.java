package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements androidx.lifecycle.i, l1.e, androidx.lifecycle.u0 {
    public final Fragment f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.t0 f721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.v f722h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l1.d f723i = null;

    public l1(Fragment fragment, androidx.lifecycle.t0 t0Var) {
        this.f = fragment;
        this.f721g = t0Var;
    }

    public final void b(androidx.lifecycle.m mVar) {
        this.f722h.e(mVar);
    }

    public final void c() {
        if (this.f722h == null) {
            this.f722h = new androidx.lifecycle.v(this);
            l1.d dVar = new l1.d(this);
            this.f723i = dVar;
            dVar.a();
            androidx.lifecycle.k0.d(this);
        }
    }

    @Override // androidx.lifecycle.i
    public final f1.b getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        f1.c cVar = new f1.c(0);
        LinkedHashMap linkedHashMap = cVar.f2088a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.q0.f, application);
        }
        linkedHashMap.put(androidx.lifecycle.k0.f833a, this);
        linkedHashMap.put(androidx.lifecycle.k0.f834b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.k0.f835c, fragment.getArguments());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o getLifecycle() {
        c();
        return this.f722h;
    }

    @Override // l1.e
    public final l1.c getSavedStateRegistry() {
        c();
        return this.f723i.f3011b;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 getViewModelStore() {
        c();
        return this.f721g;
    }
}
