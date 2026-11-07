package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends androidx.lifecycle.p0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p0 f774j = new p0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f777g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f775d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f776e = new HashMap();
    public final HashMap f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f778h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f779i = false;

    public w0(boolean z4) {
        this.f777g = z4;
    }

    @Override // androidx.lifecycle.p0
    public final void b() {
        if (u0.G(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f778h = true;
    }

    public final void c(Fragment fragment) {
        if (this.f779i) {
            if (u0.G(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fragment.mWho;
        HashMap map = this.f775d;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (u0.G(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void d(Fragment fragment) {
        if (u0.G(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        e(fragment.mWho);
    }

    public final void e(String str) {
        HashMap map = this.f776e;
        w0 w0Var = (w0) map.get(str);
        if (w0Var != null) {
            w0Var.b();
            map.remove(str);
        }
        HashMap map2 = this.f;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) map2.get(str);
        if (t0Var != null) {
            t0Var.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f775d.equals(w0Var.f775d) && this.f776e.equals(w0Var.f776e) && this.f.equals(w0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(Fragment fragment) {
        if (this.f779i) {
            if (u0.G(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f775d.remove(fragment.mWho) == null || !u0.G(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.f776e.hashCode() + (this.f775d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f775d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f776e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
