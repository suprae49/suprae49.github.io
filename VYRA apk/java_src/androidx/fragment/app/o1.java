package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f740e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0 f742h;

    public o1(int i4, int i5, z0 z0Var, k0.e eVar) {
        Fragment fragment = z0Var.f804c;
        this.f739d = new ArrayList();
        this.f740e = new HashSet();
        this.f = false;
        this.f741g = false;
        this.f736a = i4;
        this.f737b = i5;
        this.f738c = fragment;
        eVar.a(new w(4, this));
        this.f742h = z0Var;
    }

    public final void a() {
        HashSet hashSet = this.f740e;
        if (this.f) {
            return;
        }
        this.f = true;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            k0.e eVar = (k0.e) obj;
            synchronized (eVar) {
                try {
                    if (!eVar.f2717a) {
                        eVar.f2717a = true;
                        eVar.f2719c = true;
                        k0.d dVar = eVar.f2718b;
                        if (dVar != null) {
                            try {
                                dVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (eVar) {
                                    eVar.f2719c = false;
                                    eVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (eVar) {
                            eVar.f2719c = false;
                            eVar.notifyAll();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b() {
        if (!this.f741g) {
            if (u0.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f741g = true;
            ArrayList arrayList = this.f739d;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((Runnable) obj).run();
            }
        }
        this.f742h.j();
    }

    public final void c(int i4, int i5) {
        int iB = s.e.b(i5);
        Fragment fragment = this.f738c;
        if (iB == 0) {
            if (this.f736a != 1) {
                if (u0.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + u.r(this.f736a) + " -> " + u.r(i4) + ". ");
                }
                this.f736a = i4;
                return;
            }
            return;
        }
        if (iB == 1) {
            if (this.f736a == 1) {
                if (u0.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + u.q(this.f737b) + " to ADDING.");
                }
                this.f736a = 2;
                this.f737b = 2;
                return;
            }
            return;
        }
        if (iB != 2) {
            return;
        }
        if (u0.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + u.r(this.f736a) + " -> REMOVED. mLifecycleImpact  = " + u.q(this.f737b) + " to REMOVING.");
        }
        this.f736a = 1;
        this.f737b = 3;
    }

    public final void d() {
        int i4 = this.f737b;
        z0 z0Var = this.f742h;
        if (i4 != 2) {
            if (i4 == 3) {
                Fragment fragment = z0Var.f804c;
                View viewRequireView = fragment.requireView();
                if (u0.G(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragment);
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        Fragment fragment2 = z0Var.f804c;
        View viewFindFocus = fragment2.mView.findFocus();
        if (viewFindFocus != null) {
            fragment2.setFocusedView(viewFindFocus);
            if (u0.G(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
            }
        }
        View viewRequireView2 = this.f738c.requireView();
        if (viewRequireView2.getParent() == null) {
            z0Var.a();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + u.r(this.f736a) + "} {mLifecycleImpact = " + u.q(this.f737b) + "} {mFragment = " + this.f738c + "}";
    }
}
