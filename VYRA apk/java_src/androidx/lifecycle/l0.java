package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements l1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.c f837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g3.d f840d;

    public l0(l1.c cVar, u0 u0Var) {
        cVar.getClass();
        this.f837a = cVar;
        this.f840d = new g3.d(new androidx.activity.o(u0Var, 3));
    }

    @Override // l1.b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f839c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((m0) this.f840d.a()).f841d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((j0) entry.getValue()).f832e.a();
            if (!r3.g.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f838b = false;
        return bundle;
    }

    public final void b() {
        if (this.f838b) {
            return;
        }
        Bundle bundleA = this.f837a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f839c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.f839c = bundle;
        this.f838b = true;
    }
}
