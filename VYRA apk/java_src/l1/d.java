package l1;

import android.os.Bundle;
import androidx.fragment.app.q;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import androidx.savedstate.Recreator;
import java.util.Map;
import m.f;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f3010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3011b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3012c;

    public d(e eVar) {
        this.f3010a = eVar;
    }

    public final void a() {
        e eVar = this.f3010a;
        o lifecycle = eVar.getLifecycle();
        if (((v) lifecycle).f866c != n.f842g) {
            q.j("Restarter must be created only during owner's initialization stage");
            return;
        }
        lifecycle.a(new Recreator(eVar));
        c cVar = this.f3011b;
        cVar.getClass();
        if (cVar.f3006b) {
            q.j("SavedStateRegistry was already attached.");
            return;
        }
        lifecycle.a(new androidx.activity.e(2, cVar));
        cVar.f3006b = true;
        this.f3012c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f3012c) {
            a();
        }
        v vVar = (v) this.f3010a.getLifecycle();
        if (vVar.f866c.compareTo(n.f844i) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + vVar.f866c).toString());
        }
        c cVar = this.f3011b;
        if (!cVar.f3006b) {
            q.j("You must call performAttach() before calling performRestore(Bundle).");
        } else if (cVar.f3008d) {
            q.j("SavedStateRegistry was already restored.");
        } else {
            cVar.f3007c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            cVar.f3008d = true;
        }
    }

    public final void c(Bundle bundle) {
        bundle.getClass();
        c cVar = this.f3011b;
        cVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = cVar.f3007c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        f fVar = cVar.f3005a;
        fVar.getClass();
        m.d dVar = new m.d(fVar);
        fVar.f3049h.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
