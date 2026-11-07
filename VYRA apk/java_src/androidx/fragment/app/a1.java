package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements k0.d {
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f638i;

    public a1() {
        this.f = new ArrayList();
        this.f636g = new HashMap();
        this.f637h = new HashMap();
    }

    public void a(Fragment fragment) {
        if (((ArrayList) this.f).contains(fragment)) {
            q.i(fragment, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.f)) {
            ((ArrayList) this.f).add(fragment);
        }
        fragment.mAdded = true;
    }

    public Fragment b(String str) {
        z0 z0Var = (z0) ((HashMap) this.f636g).get(str);
        if (z0Var != null) {
            return z0Var.f804c;
        }
        return null;
    }

    public Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (z0 z0Var : ((HashMap) this.f636g).values()) {
            if (z0Var != null && (fragmentFindFragmentByWho = z0Var.f804c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (z0 z0Var : ((HashMap) this.f636g).values()) {
            if (z0Var != null) {
                arrayList.add(z0Var);
            }
        }
        return arrayList;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (z0 z0Var : ((HashMap) this.f636g).values()) {
            if (z0Var != null) {
                arrayList.add(z0Var.f804c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List f() {
        ArrayList arrayList;
        if (((ArrayList) this.f).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f)) {
            arrayList = new ArrayList((ArrayList) this.f);
        }
        return arrayList;
    }

    public void g(z0 z0Var) {
        Fragment fragment = z0Var.f804c;
        String str = fragment.mWho;
        HashMap map = (HashMap) this.f636g;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, z0Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            boolean z4 = fragment.mRetainInstance;
            w0 w0Var = (w0) this.f638i;
            if (z4) {
                w0Var.c(fragment);
            } else {
                w0Var.f(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (u0.G(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public void h(z0 z0Var) {
        Fragment fragment = z0Var.f804c;
        if (fragment.mRetainInstance) {
            ((w0) this.f638i).f(fragment);
        }
        if (((z0) ((HashMap) this.f636g).put(fragment.mWho, null)) != null && u0.G(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    @Override // k0.d
    public void onCancel() {
        View view = (View) this.f;
        view.clearAnimation();
        ((ViewGroup) this.f636g).endViewTransition(view);
        ((i) this.f637h).a();
        if (u0.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((o1) this.f638i) + " has been cancelled.");
        }
    }

    public a1(View view, ViewGroup viewGroup, i iVar, o1 o1Var) {
        this.f = view;
        this.f636g = viewGroup;
        this.f637h = iVar;
        this.f638i = o1Var;
    }
}
