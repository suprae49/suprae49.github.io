package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.n0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends Activity implements u0, androidx.lifecycle.i, l1.e, k0, b.i, c0.e, c0.f, b0.o, b0.p, p0.l, androidx.lifecycle.t, p0.k {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f232x = 0;
    public final androidx.lifecycle.v f = new androidx.lifecycle.v(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a.a f233g = new a.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.emoji2.text.t f234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1.d f235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t0 f236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g3.d f238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicInteger f239m;
    public final n n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f242q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f243r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f244s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f245t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f246u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f247v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g3.d f248w;

    public q() {
        final androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) this;
        this.f234h = new androidx.emoji2.text.t(new d(e0Var, 0));
        l1.d dVar = new l1.d(this);
        this.f235i = dVar;
        this.f237k = new l(e0Var);
        this.f238l = new g3.d(new o(e0Var, 1));
        this.f239m = new AtomicInteger();
        this.n = new n(e0Var);
        this.f240o = new CopyOnWriteArrayList();
        this.f241p = new CopyOnWriteArrayList();
        this.f242q = new CopyOnWriteArrayList();
        this.f243r = new CopyOnWriteArrayList();
        this.f244s = new CopyOnWriteArrayList();
        this.f245t = new CopyOnWriteArrayList();
        androidx.lifecycle.v vVar = this.f;
        if (vVar == null) {
            androidx.fragment.app.q.j("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        vVar.a(new e(0, e0Var));
        this.f.a(new e(1, e0Var));
        this.f.a(new androidx.lifecycle.r() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.r
            public final void a(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                int i4 = q.f232x;
                androidx.fragment.app.e0 e0Var2 = e0Var;
                if (e0Var2.f236j == null) {
                    j jVar = (j) e0Var2.getLastNonConfigurationInstance();
                    if (jVar != null) {
                        e0Var2.f236j = jVar.f206a;
                    }
                    if (e0Var2.f236j == null) {
                        e0Var2.f236j = new t0();
                    }
                }
                e0Var2.f.b(this);
            }
        });
        dVar.a();
        androidx.lifecycle.k0.d(this);
        dVar.f3011b.c("android:support:activity-result", new f(0, e0Var));
        o(new g(e0Var, 0));
        this.f248w = new g3.d(new o(e0Var, 2));
    }

    @Override // androidx.activity.k0
    public final j0 a() {
        return (j0) this.f248w.a();
    }

    @Override // b0.p
    public final void b(o0.a aVar) {
        aVar.getClass();
        this.f244s.remove(aVar);
    }

    @Override // c0.e
    public final void c(o0.a aVar) {
        aVar.getClass();
        this.f240o.add(aVar);
    }

    @Override // p0.l
    public final void d(n0 n0Var) {
        n0Var.getClass();
        androidx.emoji2.text.t tVar = this.f234h;
        ((CopyOnWriteArrayList) tVar.f579c).add(n0Var);
        ((Runnable) tVar.f578b).run();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (e4.a.s(decorView, keyEvent)) {
            return true;
        }
        return e4.a.t(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (e4.a.s(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // p0.k
    public final boolean e(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // b0.o
    public final void f(o0.a aVar) {
        aVar.getClass();
        this.f243r.add(aVar);
    }

    @Override // b0.o
    public final void g(o0.a aVar) {
        aVar.getClass();
        this.f243r.remove(aVar);
    }

    @Override // androidx.lifecycle.i
    public final f1.b getDefaultViewModelCreationExtras() {
        f1.c cVar = new f1.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f2088a;
        if (application != null) {
            q0 q0Var = q0.f;
            Application application2 = getApplication();
            application2.getClass();
            linkedHashMap.put(q0Var, application2);
        }
        linkedHashMap.put(androidx.lifecycle.k0.f833a, this);
        linkedHashMap.put(androidx.lifecycle.k0.f834b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(androidx.lifecycle.k0.f835c, extras);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o getLifecycle() {
        return this.f;
    }

    @Override // l1.e
    public final l1.c getSavedStateRegistry() {
        return this.f235i.f3011b;
    }

    @Override // androidx.lifecycle.u0
    public final t0 getViewModelStore() {
        if (getApplication() == null) {
            androidx.fragment.app.q.j("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.f236j == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this.f236j = jVar.f206a;
            }
            if (this.f236j == null) {
                this.f236j = new t0();
            }
        }
        t0 t0Var = this.f236j;
        t0Var.getClass();
        return t0Var;
    }

    @Override // c0.e
    public final void h(o0.a aVar) {
        aVar.getClass();
        this.f240o.remove(aVar);
    }

    @Override // p0.l
    public final void i(n0 n0Var) {
        n0Var.getClass();
        androidx.emoji2.text.t tVar = this.f234h;
        ((CopyOnWriteArrayList) tVar.f579c).remove(n0Var);
        if (((HashMap) tVar.f580d).remove(n0Var) == null) {
            ((Runnable) tVar.f578b).run();
        } else {
            androidx.fragment.app.q.c();
        }
    }

    @Override // b.i
    public final b.h j() {
        return this.n;
    }

    @Override // c0.f
    public final void k(o0.a aVar) {
        aVar.getClass();
        this.f241p.add(aVar);
    }

    @Override // c0.f
    public final void l(o0.a aVar) {
        aVar.getClass();
        this.f241p.remove(aVar);
    }

    @Override // b0.p
    public final void m(o0.a aVar) {
        aVar.getClass();
        this.f244s.add(aVar);
    }

    public final void o(a.b bVar) {
        a.a aVar = this.f233g;
        aVar.getClass();
        q qVar = aVar.f1b;
        if (qVar != null) {
            bVar.a(qVar);
        }
        aVar.f0a.add(bVar);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (this.n.a(i4, i5, intent)) {
            return;
        }
        super.onActivityResult(i4, i5, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.f240o.iterator();
        while (it.hasNext()) {
            ((o0.a) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f235i.b(bundle);
        a.a aVar = this.f233g;
        aVar.getClass();
        aVar.f1b = this;
        Iterator it = aVar.f0a.iterator();
        while (it.hasNext()) {
            ((a.b) it.next()).a(this);
        }
        q(bundle);
        int i4 = androidx.lifecycle.i0.f827g;
        androidx.lifecycle.g0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        menu.getClass();
        if (i4 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i4, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f234h.f579c).iterator();
        while (it.hasNext()) {
            ((n0) it.next()).f730a.j(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f234h.f579c).iterator();
            while (it.hasNext()) {
                if (((n0) it.next()).f730a.o(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4, Configuration configuration) {
        configuration.getClass();
        this.f246u = true;
        try {
            super.onMultiWindowModeChanged(z4, configuration);
            this.f246u = false;
            Iterator it = this.f243r.iterator();
            while (it.hasNext()) {
                ((o0.a) it.next()).accept(new b0.h(z4));
            }
        } catch (Throwable th) {
            this.f246u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.f242q.iterator();
        while (it.hasNext()) {
            ((o0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f234h.f579c).iterator();
        while (it.hasNext()) {
            ((n0) it.next()).f730a.p(menu);
        }
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4, Configuration configuration) {
        configuration.getClass();
        this.f247v = true;
        try {
            super.onPictureInPictureModeChanged(z4, configuration);
            this.f247v = false;
            Iterator it = this.f244s.iterator();
            while (it.hasNext()) {
                ((o0.a) it.next()).accept(new b0.q(z4));
            }
        } catch (Throwable th) {
            this.f247v = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        menu.getClass();
        if (i4 != 0) {
            return true;
        }
        super.onPreparePanel(i4, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f234h.f579c).iterator();
        while (it.hasNext()) {
            ((n0) it.next()).f730a.s(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.n.a(i4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        t0 t0Var = this.f236j;
        if (t0Var == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            t0Var = jVar.f206a;
        }
        if (t0Var == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f206a = t0Var;
        return jVar2;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        androidx.lifecycle.v vVar = this.f;
        if (vVar != null) {
            vVar.d("setCurrentState");
            vVar.f(androidx.lifecycle.n.f843h);
        }
        r(bundle);
        this.f235i.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        Iterator it = this.f241p.iterator();
        while (it.hasNext()) {
            ((o0.a) it.next()).accept(Integer.valueOf(i4));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f245t.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void p() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final void q(Bundle bundle) {
        super.onCreate(bundle);
        int i4 = androidx.lifecycle.i0.f827g;
        androidx.lifecycle.g0.b(this);
    }

    public final void r(Bundle bundle) {
        bundle.getClass();
        androidx.lifecycle.v vVar = this.f;
        vVar.d("setCurrentState");
        vVar.f(androidx.lifecycle.n.f843h);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (e4.a.P()) {
                e4.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            a0 a0Var = (a0) this.f238l.a();
            synchronized (a0Var.f176a) {
                try {
                    a0Var.f177b = true;
                    ArrayList arrayList = a0Var.f178c;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((q3.a) obj).a();
                    }
                    a0Var.f178c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final b.c s(c.a aVar, b.b bVar) {
        n nVar = this.n;
        nVar.getClass();
        return nVar.c("activity_rq#" + this.f239m.getAndIncrement(), this, aVar, bVar);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        p();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        l lVar = this.f237k;
        lVar.getClass();
        if (!lVar.f215h) {
            lVar.f215h = true;
            decorView.getViewTreeObserver().addOnDrawListener(lVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i4) {
        intent.getClass();
        super.startActivityForResult(intent, i4);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i4, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4) {
        if (this.f246u) {
            return;
        }
        Iterator it = this.f243r.iterator();
        while (it.hasNext()) {
            ((o0.a) it.next()).accept(new b0.h(z4));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4) {
        if (this.f247v) {
            return;
        }
        Iterator it = this.f244s.iterator();
        while (it.hasNext()) {
            ((o0.a) it.next()).accept(new b0.q(z4));
        }
    }
}
