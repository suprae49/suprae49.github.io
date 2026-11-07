package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import co.median.android.eeqadjy.R;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {
    public b.g A;
    public b.g B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public w0 L;
    public final f M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f750b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f753e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.activity.j0 f754g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f760m;
    public final k0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k0 f761o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k0 f762p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k0 f763q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0 f764r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h0 f766t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g0 f767u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Fragment f768v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Fragment f769w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o0 f770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p0 f771y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b.g f772z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f749a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f751c = new a1();
    public final j0 f = new j0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0 f755h = new m0(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f756i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f757j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f758k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.k0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.k0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.k0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.k0] */
    public u0() {
        Collections.synchronizedMap(new HashMap());
        this.f759l = new e(this);
        this.f760m = new CopyOnWriteArrayList();
        final int i4 = 0;
        this.n = new o0.a(this) { // from class: androidx.fragment.app.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f714b;

            {
                this.f714b = this;
            }

            @Override // o0.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        u0 u0Var = this.f714b;
                        if (u0Var.I()) {
                            u0Var.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u0 u0Var2 = this.f714b;
                        if (u0Var2.I() && num.intValue() == 80) {
                            u0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        b0.h hVar = (b0.h) obj;
                        u0 u0Var3 = this.f714b;
                        if (u0Var3.I()) {
                            u0Var3.m(hVar.f1007a, false);
                        }
                        break;
                    default:
                        b0.q qVar = (b0.q) obj;
                        u0 u0Var4 = this.f714b;
                        if (u0Var4.I()) {
                            u0Var4.r(qVar.f1029a, false);
                        }
                        break;
                }
            }
        };
        final int i5 = 1;
        this.f761o = new o0.a(this) { // from class: androidx.fragment.app.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f714b;

            {
                this.f714b = this;
            }

            @Override // o0.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        u0 u0Var = this.f714b;
                        if (u0Var.I()) {
                            u0Var.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u0 u0Var2 = this.f714b;
                        if (u0Var2.I() && num.intValue() == 80) {
                            u0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        b0.h hVar = (b0.h) obj;
                        u0 u0Var3 = this.f714b;
                        if (u0Var3.I()) {
                            u0Var3.m(hVar.f1007a, false);
                        }
                        break;
                    default:
                        b0.q qVar = (b0.q) obj;
                        u0 u0Var4 = this.f714b;
                        if (u0Var4.I()) {
                            u0Var4.r(qVar.f1029a, false);
                        }
                        break;
                }
            }
        };
        final int i6 = 2;
        this.f762p = new o0.a(this) { // from class: androidx.fragment.app.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f714b;

            {
                this.f714b = this;
            }

            @Override // o0.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        u0 u0Var = this.f714b;
                        if (u0Var.I()) {
                            u0Var.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u0 u0Var2 = this.f714b;
                        if (u0Var2.I() && num.intValue() == 80) {
                            u0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        b0.h hVar = (b0.h) obj;
                        u0 u0Var3 = this.f714b;
                        if (u0Var3.I()) {
                            u0Var3.m(hVar.f1007a, false);
                        }
                        break;
                    default:
                        b0.q qVar = (b0.q) obj;
                        u0 u0Var4 = this.f714b;
                        if (u0Var4.I()) {
                            u0Var4.r(qVar.f1029a, false);
                        }
                        break;
                }
            }
        };
        final int i7 = 3;
        this.f763q = new o0.a(this) { // from class: androidx.fragment.app.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f714b;

            {
                this.f714b = this;
            }

            @Override // o0.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        u0 u0Var = this.f714b;
                        if (u0Var.I()) {
                            u0Var.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u0 u0Var2 = this.f714b;
                        if (u0Var2.I() && num.intValue() == 80) {
                            u0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        b0.h hVar = (b0.h) obj;
                        u0 u0Var3 = this.f714b;
                        if (u0Var3.I()) {
                            u0Var3.m(hVar.f1007a, false);
                        }
                        break;
                    default:
                        b0.q qVar = (b0.q) obj;
                        u0 u0Var4 = this.f714b;
                        if (u0Var4.I()) {
                            u0Var4.r(qVar.f1029a, false);
                        }
                        break;
                }
            }
        };
        this.f764r = new n0(this);
        this.f765s = -1;
        this.f770x = new o0(this);
        this.f771y = new p0();
        this.C = new ArrayDeque();
        this.M = new f(4, this);
    }

    public static boolean G(int i4) {
        return Log.isLoggable("FragmentManager", i4);
    }

    public static boolean H(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        ArrayList arrayListE = fragment.mChildFragmentManager.f751c.e();
        int size = arrayListE.size();
        boolean zH = false;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListE.get(i4);
            i4++;
            Fragment fragment2 = (Fragment) obj;
            if (fragment2 != null) {
                zH = H(fragment2);
            }
            if (zH) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        u0 u0Var = fragment.mFragmentManager;
        return fragment.equals(u0Var.f769w) && J(u0Var.f768v);
    }

    public static void Y(Fragment fragment) {
        if (G(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final Fragment A(int i4) {
        a1 a1Var = this.f751c;
        ArrayList arrayList = (ArrayList) a1Var.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i4) {
                return fragment;
            }
        }
        for (z0 z0Var : ((HashMap) a1Var.f636g).values()) {
            if (z0Var != null) {
                Fragment fragment2 = z0Var.f804c;
                if (fragment2.mFragmentId == i4) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment B(String str) {
        a1 a1Var = this.f751c;
        ArrayList arrayList = (ArrayList) a1Var.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && str.equals(fragment.mTag)) {
                return fragment;
            }
        }
        for (z0 z0Var : ((HashMap) a1Var.f636g).values()) {
            if (z0Var != null) {
                Fragment fragment2 = z0Var.f804c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.f767u.o()) {
            return null;
        }
        View viewN = this.f767u.n(fragment.mContainerId);
        if (viewN instanceof ViewGroup) {
            return (ViewGroup) viewN;
        }
        return null;
    }

    public final o0 D() {
        Fragment fragment = this.f768v;
        return fragment != null ? fragment.mFragmentManager.D() : this.f770x;
    }

    public final p0 E() {
        Fragment fragment = this.f768v;
        return fragment != null ? fragment.mFragmentManager.E() : this.f771y;
    }

    public final void F(Fragment fragment) {
        if (G(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        X(fragment);
    }

    public final boolean I() {
        Fragment fragment = this.f768v;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f768v.getParentFragmentManager().I();
    }

    public final void K(int i4, boolean z4) {
        h0 h0Var;
        if (this.f766t == null && i4 != -1) {
            q.j("No activity");
            return;
        }
        if (z4 || i4 != this.f765s) {
            this.f765s = i4;
            a1 a1Var = this.f751c;
            HashMap map = (HashMap) a1Var.f636g;
            ArrayList arrayList = (ArrayList) a1Var.f;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                z0 z0Var = (z0) map.get(((Fragment) obj).mWho);
                if (z0Var != null) {
                    z0Var.j();
                }
            }
            for (z0 z0Var2 : map.values()) {
                if (z0Var2 != null) {
                    z0Var2.j();
                    Fragment fragment = z0Var2.f804c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !((HashMap) a1Var.f637h).containsKey(fragment.mWho)) {
                            z0Var2.m();
                        }
                        a1Var.h(z0Var2);
                    }
                }
            }
            ArrayList arrayListD = a1Var.d();
            int size2 = arrayListD.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayListD.get(i6);
                i6++;
                z0 z0Var3 = (z0) obj2;
                Fragment fragment2 = z0Var3.f804c;
                if (fragment2.mDeferStart) {
                    if (this.f750b) {
                        this.H = true;
                    } else {
                        fragment2.mDeferStart = false;
                        z0Var3.j();
                    }
                }
            }
            if (this.D && (h0Var = this.f766t) != null && this.f765s == 7) {
                ((d0) h0Var).f670j.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void L() {
        if (this.f766t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.f779i = false;
        for (Fragment fragment : this.f751c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean M() {
        return N(-1, 0);
    }

    public final boolean N(int i4, int i5) {
        x(false);
        w(true);
        Fragment fragment = this.f769w;
        if (fragment != null && i4 < 0 && fragment.getChildFragmentManager().M()) {
            return true;
        }
        boolean zO = O(this.I, this.J, i4, i5);
        if (zO) {
            this.f750b = true;
            try {
                Q(this.I, this.J);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        a0();
        boolean z4 = this.H;
        a1 a1Var = this.f751c;
        if (z4) {
            this.H = false;
            ArrayList arrayListD = a1Var.d();
            int size = arrayListD.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListD.get(i6);
                i6++;
                z0 z0Var = (z0) obj;
                Fragment fragment2 = z0Var.f804c;
                if (fragment2.mDeferStart) {
                    if (this.f750b) {
                        this.H = true;
                    } else {
                        fragment2.mDeferStart = false;
                        z0Var.j();
                    }
                }
            }
        }
        ((HashMap) a1Var.f636g).values().removeAll(Collections.singleton(null));
        return zO;
    }

    public final boolean O(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        boolean z4 = (i5 & 1) != 0;
        ArrayList arrayList3 = this.f752d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i4 < 0) {
                size = z4 ? 0 : this.f752d.size() - 1;
            } else {
                int size2 = this.f752d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.f752d.get(size2);
                    if (i4 >= 0 && i4 == aVar.f635r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z4) {
                    size = size2;
                    while (size > 0) {
                        a aVar2 = (a) this.f752d.get(size - 1);
                        if (i4 < 0 || i4 != aVar2.f635r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f752d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f752d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.f752d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void P(Fragment fragment) {
        if (G(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        a1 a1Var = this.f751c;
        synchronized (((ArrayList) a1Var.f)) {
            ((ArrayList) a1Var.f).remove(fragment);
        }
        fragment.mAdded = false;
        if (H(fragment)) {
            this.D = true;
        }
        fragment.mRemoving = true;
        X(fragment);
    }

    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            q.j("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            if (!((a) arrayList.get(i4)).f664o) {
                if (i5 != i4) {
                    z(arrayList, arrayList2, i5, i4);
                }
                i5 = i4 + 1;
                if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                    while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((a) arrayList.get(i5)).f664o) {
                        i5++;
                    }
                }
                z(arrayList, arrayList2, i4, i5);
                i4 = i5 - 1;
            }
            i4++;
        }
        if (i5 != size) {
            z(arrayList, arrayList2, i5, size);
        }
    }

    public final void R(Parcelable parcelable) {
        e eVar;
        int i4;
        boolean z4;
        int i5;
        z0 z0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f766t.f696g.getClassLoader());
                this.f758k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f766t.f696g.getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        a1 a1Var = this.f751c;
        HashMap map = (HashMap) a1Var.f637h;
        HashMap map2 = (HashMap) a1Var.f636g;
        map.clear();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            FragmentState fragmentState = (FragmentState) obj;
            map.put(fragmentState.f622g, fragmentState);
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map2.clear();
        ArrayList arrayList2 = fragmentManagerState.f;
        int size2 = arrayList2.size();
        int i7 = 0;
        while (true) {
            eVar = this.f759l;
            i4 = 2;
            if (i7 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i7);
            i7++;
            FragmentState fragmentState2 = (FragmentState) ((HashMap) a1Var.f637h).remove((String) obj2);
            if (fragmentState2 != null) {
                Fragment fragment = (Fragment) this.L.f775d.get(fragmentState2.f622g);
                if (fragment != null) {
                    if (G(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    z0Var = new z0(eVar, a1Var, fragment, fragmentState2);
                } else {
                    z0Var = new z0(this.f759l, this.f751c, this.f766t.f696g.getClassLoader(), D(), fragmentState2);
                }
                Fragment fragment2 = z0Var.f804c;
                fragment2.mFragmentManager = this;
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                z0Var.k(this.f766t.f696g.getClassLoader());
                a1Var.g(z0Var);
                z0Var.f806e = this.f765s;
            }
        }
        w0 w0Var = this.L;
        w0Var.getClass();
        ArrayList arrayList3 = new ArrayList(w0Var.f775d.values());
        int size3 = arrayList3.size();
        int i8 = 0;
        while (true) {
            z4 = true;
            if (i8 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i8);
            i8++;
            Fragment fragment3 = (Fragment) obj3;
            if (map2.get(fragment3.mWho) == null) {
                if (G(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f);
                }
                this.L.f(fragment3);
                fragment3.mFragmentManager = this;
                z0 z0Var2 = new z0(eVar, a1Var, fragment3);
                z0Var2.f806e = 1;
                z0Var2.j();
                fragment3.mRemoving = true;
                z0Var2.j();
            }
        }
        ArrayList arrayList4 = fragmentManagerState.f615g;
        ((ArrayList) a1Var.f).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i9 = 0;
            while (i9 < size4) {
                Object obj4 = arrayList4.get(i9);
                i9++;
                String str3 = (String) obj4;
                Fragment fragmentB = a1Var.b(str3);
                if (fragmentB == null) {
                    q.j(u.m("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentB);
                }
                a1Var.a(fragmentB);
            }
        }
        if (fragmentManagerState.f616h != null) {
            this.f752d = new ArrayList(fragmentManagerState.f616h.length);
            int i10 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f616h;
                if (i10 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i10];
                ArrayList arrayList5 = backStackRecordState.f598g;
                a aVar = new a(this);
                int[] iArr = backStackRecordState.f;
                int i11 = 0;
                int i12 = 0;
                while (i11 < iArr.length) {
                    b1 b1Var = new b1();
                    int i13 = i11 + 1;
                    int i14 = i4;
                    b1Var.f640a = iArr[i11];
                    if (G(i14)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i12 + " base fragment #" + iArr[i13]);
                    }
                    b1Var.f646h = androidx.lifecycle.n.values()[backStackRecordState.f599h[i12]];
                    b1Var.f647i = androidx.lifecycle.n.values()[backStackRecordState.f600i[i12]];
                    int i15 = i11 + 2;
                    b1Var.f642c = iArr[i13] != 0 ? z4 : false;
                    int i16 = iArr[i15];
                    b1Var.f643d = i16;
                    int i17 = iArr[i11 + 3];
                    b1Var.f644e = i17;
                    int i18 = i11 + 5;
                    int i19 = iArr[i11 + 4];
                    b1Var.f = i19;
                    i11 += 6;
                    int[] iArr2 = iArr;
                    int i20 = iArr2[i18];
                    b1Var.f645g = i20;
                    aVar.f653b = i16;
                    aVar.f654c = i17;
                    aVar.f655d = i19;
                    aVar.f656e = i20;
                    aVar.b(b1Var);
                    i12++;
                    i4 = i14;
                    iArr = iArr2;
                    z4 = true;
                }
                int i21 = i4;
                aVar.f = backStackRecordState.f601j;
                aVar.f658h = backStackRecordState.f602k;
                aVar.f657g = true;
                aVar.f659i = backStackRecordState.f604m;
                aVar.f660j = backStackRecordState.n;
                aVar.f661k = backStackRecordState.f605o;
                aVar.f662l = backStackRecordState.f606p;
                aVar.f663m = backStackRecordState.f607q;
                aVar.n = backStackRecordState.f608r;
                aVar.f664o = backStackRecordState.f609s;
                aVar.f635r = backStackRecordState.f603l;
                for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                    String str4 = (String) arrayList5.get(i22);
                    if (str4 != null) {
                        ((b1) aVar.f652a.get(i22)).f641b = a1Var.b(str4);
                    }
                }
                aVar.d(1);
                if (G(i21)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + aVar.f635r + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new m1());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f752d.add(aVar);
                i10++;
                i4 = i21;
                z4 = true;
            }
            i5 = 0;
        } else {
            i5 = 0;
            this.f752d = null;
        }
        this.f756i.set(fragmentManagerState.f617i);
        String str5 = fragmentManagerState.f618j;
        if (str5 != null) {
            Fragment fragmentB2 = a1Var.b(str5);
            this.f769w = fragmentB2;
            q(fragmentB2);
        }
        ArrayList arrayList6 = fragmentManagerState.f619k;
        if (arrayList6 != null) {
            while (i5 < arrayList6.size()) {
                this.f757j.put((String) arrayList6.get(i5), (BackStackState) fragmentManagerState.f620l.get(i5));
                i5++;
            }
        }
        this.C = new ArrayDeque(fragmentManagerState.f621m);
    }

    public final Bundle S() {
        int i4;
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            if (lVar.f719e) {
                if (G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                lVar.f719e = false;
                lVar.d();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).g();
        }
        x(true);
        this.E = true;
        this.L.f779i = true;
        a1 a1Var = this.f751c;
        a1Var.getClass();
        HashMap map = (HashMap) a1Var.f636g;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (z0 z0Var : map.values()) {
            if (z0Var != null) {
                Fragment fragment = z0Var.f804c;
                z0Var.m();
                arrayList2.add(fragment.mWho);
                if (G(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        a1 a1Var2 = this.f751c;
        a1Var2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) a1Var2.f637h).values());
        if (!arrayList3.isEmpty()) {
            a1 a1Var3 = this.f751c;
            synchronized (((ArrayList) a1Var3.f)) {
                try {
                    if (((ArrayList) a1Var3.f).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) a1Var3.f).size());
                        ArrayList arrayList4 = (ArrayList) a1Var3.f;
                        int size2 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj = arrayList4.get(i5);
                            i5++;
                            Fragment fragment2 = (Fragment) obj;
                            arrayList.add(fragment2.mWho);
                            if (G(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList5 = this.f752d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i6 = 0; i6 < size; i6++) {
                    backStackRecordStateArr[i6] = new BackStackRecordState((a) this.f752d.get(i6));
                    if (G(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i6 + ": " + this.f752d.get(i6));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f618j = null;
            ArrayList arrayList6 = new ArrayList();
            fragmentManagerState.f619k = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            fragmentManagerState.f620l = arrayList7;
            fragmentManagerState.f = arrayList2;
            fragmentManagerState.f615g = arrayList;
            fragmentManagerState.f616h = backStackRecordStateArr;
            fragmentManagerState.f617i = this.f756i.get();
            Fragment fragment3 = this.f769w;
            if (fragment3 != null) {
                fragmentManagerState.f618j = fragment3.mWho;
            }
            arrayList6.addAll(this.f757j.keySet());
            arrayList7.addAll(this.f757j.values());
            fragmentManagerState.f621m = new ArrayList(this.C);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f758k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f758k.get(str));
            }
            int size3 = arrayList3.size();
            while (i4 < size3) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                FragmentState fragmentState = (FragmentState) obj2;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", fragmentState);
                bundle.putBundle("fragment_" + fragmentState.f622g, bundle2);
            }
        } else if (G(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void T() {
        synchronized (this.f749a) {
            try {
                if (this.f749a.size() == 1) {
                    this.f766t.f697h.removeCallbacks(this.M);
                    this.f766t.f697h.post(this.M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U(Fragment fragment, boolean z4) {
        ViewGroup viewGroupC = C(fragment);
        if (viewGroupC == null || !(viewGroupC instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupC).setDrawDisappearingViewsLast(!z4);
    }

    public final void V(Fragment fragment, androidx.lifecycle.n nVar) {
        if (fragment.equals(this.f751c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = nVar;
        } else {
            q.m("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void W(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f751c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                q.m("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        Fragment fragment2 = this.f769w;
        this.f769w = fragment;
        q(fragment2);
        q(this.f769w);
    }

    public final void X(Fragment fragment) {
        ViewGroup viewGroupC = C(fragment);
        if (viewGroupC != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupC.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupC.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupC.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new m1());
        h0 h0Var = this.f766t;
        if (h0Var == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e5) {
                Log.e("FragmentManager", "Failed dumping state", e5);
                throw illegalStateException;
            }
        }
        try {
            ((d0) h0Var).f670j.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e6) {
            Log.e("FragmentManager", "Failed dumping state", e6);
            throw illegalStateException;
        }
    }

    public final z0 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            d1.c.c(fragment, str);
        }
        if (G(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        z0 z0VarF = f(fragment);
        fragment.mFragmentManager = this;
        a1 a1Var = this.f751c;
        a1Var.g(z0VarF);
        if (!fragment.mDetached) {
            a1Var.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (H(fragment)) {
                this.D = true;
            }
        }
        return z0VarF;
    }

    public final void a0() {
        synchronized (this.f749a) {
            try {
                if (!this.f749a.isEmpty()) {
                    m0 m0Var = this.f755h;
                    m0Var.f724a = true;
                    androidx.activity.i0 i0Var = m0Var.f726c;
                    if (i0Var != null) {
                        i0Var.a();
                    }
                    return;
                }
                m0 m0Var2 = this.f755h;
                ArrayList arrayList = this.f752d;
                m0Var2.f724a = (arrayList != null ? arrayList.size() : 0) > 0 && J(this.f768v);
                androidx.activity.i0 i0Var2 = m0Var2.f726c;
                if (i0Var2 != null) {
                    i0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(h0 h0Var, g0 g0Var, Fragment fragment) {
        String str;
        androidx.lifecycle.t tVar;
        if (this.f766t != null) {
            q.j("Already attached");
            return;
        }
        this.f766t = h0Var;
        this.f767u = g0Var;
        this.f768v = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f760m;
        if (fragment != null) {
            copyOnWriteArrayList.add(new q0(fragment));
        } else if (h0Var instanceof x0) {
            copyOnWriteArrayList.add((x0) h0Var);
        }
        if (this.f768v != null) {
            a0();
        }
        if (h0Var instanceof androidx.activity.k0) {
            androidx.activity.k0 k0Var = (androidx.activity.k0) h0Var;
            androidx.activity.j0 j0VarA = k0Var.a();
            this.f754g = j0VarA;
            if (fragment != null) {
                tVar = k0Var;
                tVar = fragment;
            }
            tVar = k0Var;
            j0VarA.a(tVar, this.f755h);
        }
        if (fragment != null) {
            w0 w0Var = fragment.mFragmentManager.L;
            HashMap map = w0Var.f776e;
            w0 w0Var2 = (w0) map.get(fragment.mWho);
            if (w0Var2 == null) {
                w0Var2 = new w0(w0Var.f777g);
                map.put(fragment.mWho, w0Var2);
            }
            this.L = w0Var2;
        } else if (h0Var instanceof androidx.lifecycle.u0) {
            androidx.emoji2.text.t tVar2 = new androidx.emoji2.text.t(((androidx.lifecycle.u0) h0Var).getViewModelStore(), w0.f774j);
            String canonicalName = w0.class.getCanonicalName();
            if (canonicalName == null) {
                q.q("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.L = (w0) tVar2.e("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), w0.class);
        } else {
            this.L = new w0(false);
        }
        w0 w0Var3 = this.L;
        w0Var3.f779i = this.E || this.F;
        this.f751c.f638i = w0Var3;
        Object obj = this.f766t;
        if ((obj instanceof l1.e) && fragment == null) {
            l1.c savedStateRegistry = ((l1.e) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new androidx.activity.f(2, this));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                R(bundleA);
            }
        }
        Object obj2 = this.f766t;
        if (obj2 instanceof b.i) {
            b.h hVarJ = ((b.i) obj2).j();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String strConcat = "FragmentManager:".concat(str);
            this.f772z = hVarJ.d(strConcat.concat("StartActivityForResult"), new r0(3), new l0(this, 1));
            this.A = hVarJ.d(strConcat.concat("StartIntentSenderForResult"), new r0(0), new l0(this, 2));
            this.B = hVarJ.d(strConcat.concat("RequestPermissions"), new r0(1), new l0(this, 0));
        }
        Object obj3 = this.f766t;
        if (obj3 instanceof c0.e) {
            ((c0.e) obj3).c(this.n);
        }
        Object obj4 = this.f766t;
        if (obj4 instanceof c0.f) {
            ((c0.f) obj4).k(this.f761o);
        }
        Object obj5 = this.f766t;
        if (obj5 instanceof b0.o) {
            ((b0.o) obj5).f(this.f762p);
        }
        Object obj6 = this.f766t;
        if (obj6 instanceof b0.p) {
            ((b0.p) obj6).m(this.f763q);
        }
        Object obj7 = this.f766t;
        if ((obj7 instanceof p0.l) && fragment == null) {
            ((p0.l) obj7).d(this.f764r);
        }
    }

    public final void c(Fragment fragment) {
        if (G(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f751c.a(fragment);
            if (G(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (H(fragment)) {
                this.D = true;
            }
        }
    }

    public final void d() {
        this.f750b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListD = this.f751c.d();
        int size = arrayListD.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListD.get(i4);
            i4++;
            ViewGroup viewGroup = ((z0) obj).f804c.mContainer;
            if (viewGroup != null) {
                hashSet.add(l.h(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final z0 f(Fragment fragment) {
        String str = fragment.mWho;
        a1 a1Var = this.f751c;
        z0 z0Var = (z0) ((HashMap) a1Var.f636g).get(str);
        if (z0Var != null) {
            return z0Var;
        }
        z0 z0Var2 = new z0(this.f759l, a1Var, fragment);
        z0Var2.k(this.f766t.f696g.getClassLoader());
        z0Var2.f806e = this.f765s;
        return z0Var2;
    }

    public final void g(Fragment fragment) {
        if (G(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (G(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            a1 a1Var = this.f751c;
            synchronized (((ArrayList) a1Var.f)) {
                ((ArrayList) a1Var.f).remove(fragment);
            }
            fragment.mAdded = false;
            if (H(fragment)) {
                this.D = true;
            }
            X(fragment);
        }
    }

    public final void h(boolean z4, Configuration configuration) {
        if (z4 && (this.f766t instanceof c0.e)) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f751c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z4) {
                    fragment.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.f765s < 1) {
            return false;
        }
        for (Fragment fragment : this.f751c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.f765s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (Fragment fragment : this.f751c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z4 = true;
            }
        }
        if (this.f753e != null) {
            for (int i4 = 0; i4 < this.f753e.size(); i4++) {
                Fragment fragment2 = (Fragment) this.f753e.get(i4);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f753e = arrayList;
        return z4;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((l) it.next()).g();
        }
        h0 h0Var = this.f766t;
        boolean z4 = h0Var instanceof androidx.lifecycle.u0;
        a1 a1Var = this.f751c;
        if (z4) {
            zIsChangingConfigurations = ((w0) a1Var.f638i).f778h;
        } else {
            e.j jVar = h0Var.f696g;
            if (jVar != null) {
                zIsChangingConfigurations = true ^ jVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f757j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((BackStackState) it2.next()).f;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    String str = (String) obj;
                    w0 w0Var = (w0) a1Var.f638i;
                    w0Var.getClass();
                    if (G(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    w0Var.e(str);
                }
            }
        }
        t(-1);
        Object obj2 = this.f766t;
        if (obj2 instanceof c0.f) {
            ((c0.f) obj2).l(this.f761o);
        }
        Object obj3 = this.f766t;
        if (obj3 instanceof c0.e) {
            ((c0.e) obj3).h(this.n);
        }
        Object obj4 = this.f766t;
        if (obj4 instanceof b0.o) {
            ((b0.o) obj4).g(this.f762p);
        }
        Object obj5 = this.f766t;
        if (obj5 instanceof b0.p) {
            ((b0.p) obj5).b(this.f763q);
        }
        Object obj6 = this.f766t;
        if (obj6 instanceof p0.l) {
            ((p0.l) obj6).i(this.f764r);
        }
        this.f766t = null;
        this.f767u = null;
        this.f768v = null;
        if (this.f754g != null) {
            Iterator it3 = this.f755h.f725b.iterator();
            while (it3.hasNext()) {
                ((androidx.activity.c) it3.next()).cancel();
            }
            this.f754g = null;
        }
        b.g gVar = this.f772z;
        if (gVar != null) {
            gVar.b();
            this.A.b();
            this.B.b();
        }
    }

    public final void l(boolean z4) {
        if (z4 && (this.f766t instanceof c0.f)) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f751c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z4) {
                    fragment.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z4, boolean z5) {
        if (z5 && (this.f766t instanceof b0.o)) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f751c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z4);
                if (z5) {
                    fragment.mChildFragmentManager.m(z4, true);
                }
            }
        }
    }

    public final void n() {
        ArrayList arrayListE = this.f751c.e();
        int size = arrayListE.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListE.get(i4);
            i4++;
            Fragment fragment = (Fragment) obj;
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.f765s < 1) {
            return false;
        }
        for (Fragment fragment : this.f751c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.f765s < 1) {
            return;
        }
        for (Fragment fragment : this.f751c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f751c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z4, boolean z5) {
        if (z5 && (this.f766t instanceof b0.p)) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f751c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z4);
                if (z5) {
                    fragment.mChildFragmentManager.r(z4, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z4 = false;
        if (this.f765s < 1) {
            return false;
        }
        for (Fragment fragment : this.f751c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z4 = true;
            }
        }
        return z4;
    }

    public final void t(int i4) {
        try {
            this.f750b = true;
            for (z0 z0Var : ((HashMap) this.f751c.f636g).values()) {
                if (z0Var != null) {
                    z0Var.f806e = i4;
                }
            }
            K(i4, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((l) it.next()).g();
            }
            this.f750b = false;
            x(true);
        } catch (Throwable th) {
            this.f750b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f768v;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f768v)));
            sb.append("}");
        } else {
            h0 h0Var = this.f766t;
            if (h0Var != null) {
                sb.append(h0Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f766t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        a1 a1Var = this.f751c;
        ArrayList arrayList = (ArrayList) a1Var.f;
        String str3 = str + "    ";
        HashMap map = (HashMap) a1Var.f636g;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (z0 z0Var : map.values()) {
                printWriter.print(str);
                if (z0Var != null) {
                    Fragment fragment = z0Var.f804c;
                    printWriter.println(fragment);
                    fragment.dump(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size3; i4++) {
                Fragment fragment2 = (Fragment) arrayList.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.f753e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size2; i5++) {
                Fragment fragment3 = (Fragment) this.f753e.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList3 = this.f752d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size; i6++) {
                a aVar = (a) this.f752d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(str2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f756i.get());
        synchronized (this.f749a) {
            try {
                int size4 = this.f749a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i7 = 0; i7 < size4; i7++) {
                        Object obj = (s0) this.f749a.get(i7);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i7);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f766t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f767u);
        if (this.f768v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f768v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f765s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void v(s0 s0Var, boolean z4) {
        if (!z4) {
            if (this.f766t == null) {
                if (this.G) {
                    q.j("FragmentManager has been destroyed");
                    return;
                } else {
                    q.j("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.E || this.F) {
                q.j("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f749a) {
            try {
                if (this.f766t == null) {
                    if (!z4) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f749a.add(s0Var);
                    T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z4) {
        if (this.f750b) {
            q.j("FragmentManager is already executing transactions");
            return;
        }
        if (this.f766t == null) {
            if (this.G) {
                q.j("FragmentManager has been destroyed");
                return;
            } else {
                q.j("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f766t.f697h.getLooper()) {
            q.j("Must be called from main thread of fragment host");
            return;
        }
        if (!z4 && (this.E || this.F)) {
            q.j("Can not perform this action after onSaveInstanceState");
        } else if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean x(boolean z4) {
        boolean zA;
        ArrayList arrayList;
        w(z4);
        boolean z5 = false;
        while (true) {
            ArrayList arrayList2 = this.I;
            ArrayList arrayList3 = this.J;
            synchronized (this.f749a) {
                if (this.f749a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f749a.size();
                        int i4 = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.f749a;
                            if (i4 >= size) {
                                break;
                            }
                            zA |= ((s0) arrayList.get(i4)).a(arrayList2, arrayList3);
                            i4++;
                            throw th;
                        }
                        arrayList.clear();
                        this.f766t.f697h.removeCallbacks(this.M);
                    } catch (Throwable th) {
                        this.f749a.clear();
                        this.f766t.f697h.removeCallbacks(this.M);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.f750b = true;
            try {
                Q(this.I, this.J);
                d();
                z5 = true;
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        a0();
        if (this.H) {
            this.H = false;
            ArrayList arrayListD = this.f751c.d();
            int size2 = arrayListD.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj = arrayListD.get(i5);
                i5++;
                z0 z0Var = (z0) obj;
                Fragment fragment = z0Var.f804c;
                if (fragment.mDeferStart) {
                    if (this.f750b) {
                        this.H = true;
                    } else {
                        fragment.mDeferStart = false;
                        z0Var.j();
                    }
                }
            }
        }
        ((HashMap) this.f751c.f636g).values().removeAll(Collections.singleton(null));
        return z5;
    }

    public final void y(a aVar, boolean z4) {
        if (z4 && (this.f766t == null || this.G)) {
            return;
        }
        w(z4);
        aVar.a(this.I, this.J);
        this.f750b = true;
        try {
            Q(this.I, this.J);
            d();
            a0();
            boolean z5 = this.H;
            a1 a1Var = this.f751c;
            if (z5) {
                this.H = false;
                ArrayList arrayListD = a1Var.d();
                int size = arrayListD.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayListD.get(i4);
                    i4++;
                    z0 z0Var = (z0) obj;
                    Fragment fragment = z0Var.f804c;
                    if (fragment.mDeferStart) {
                        if (this.f750b) {
                            this.H = true;
                        } else {
                            fragment.mDeferStart = false;
                            z0Var.j();
                        }
                    }
                }
            }
            ((HashMap) a1Var.f636g).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0224 A[PHI: r14
      0x0224: PHI (r14v14 int) = (r14v13 int), (r14v15 int) binds: [B:99:0x0214, B:104:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x017d  */
    public final void z(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        ViewGroup viewGroup;
        boolean z4;
        int i6;
        boolean z5;
        boolean z6;
        int i7;
        int i8;
        boolean z7;
        int i9;
        boolean z8 = ((a) arrayList.get(i4)).f664o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.K;
        a1 a1Var = this.f751c;
        arrayList4.addAll(a1Var.f());
        Fragment fragment = this.f769w;
        int i10 = i4;
        boolean z9 = false;
        while (true) {
            int i11 = 1;
            if (i10 >= i5) {
                boolean z10 = z8;
                this.K.clear();
                if (!z10 && this.f765s >= 1) {
                    for (int i12 = i4; i12 < i5; i12++) {
                        ArrayList arrayList5 = ((a) arrayList.get(i12)).f652a;
                        int size = arrayList5.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList5.get(i13);
                            i13++;
                            Fragment fragment2 = ((b1) obj).f641b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                a1Var.g(f(fragment2));
                            }
                        }
                    }
                }
                for (int i14 = i4; i14 < i5; i14++) {
                    a aVar = (a) arrayList.get(i14);
                    if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                        aVar.d(-1);
                        u0 u0Var = aVar.f633p;
                        ArrayList arrayList6 = aVar.f652a;
                        boolean z11 = true;
                        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                            b1 b1Var = (b1) arrayList6.get(size2);
                            Fragment fragment3 = b1Var.f641b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = false;
                                fragment3.setPopDirection(z11);
                                int i15 = aVar.f;
                                int i16 = 8194;
                                int i17 = 4097;
                                if (i15 != 4097) {
                                    if (i15 != 8194) {
                                        i16 = 4100;
                                        i17 = 8197;
                                        if (i15 != 8197) {
                                            if (i15 == 4099) {
                                                i16 = 4099;
                                            } else if (i15 != 4100) {
                                                i16 = 0;
                                            } else {
                                                i16 = i17;
                                            }
                                        }
                                    } else {
                                        i16 = i17;
                                    }
                                }
                                fragment3.setNextTransition(i16);
                                fragment3.setSharedElementNames(aVar.n, aVar.f663m);
                            }
                            switch (b1Var.f640a) {
                                case 1:
                                    fragment3.setAnimations(b1Var.f643d, b1Var.f644e, b1Var.f, b1Var.f645g);
                                    z11 = true;
                                    u0Var.U(fragment3, true);
                                    u0Var.P(fragment3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + b1Var.f640a);
                                case 3:
                                    fragment3.setAnimations(b1Var.f643d, b1Var.f644e, b1Var.f, b1Var.f645g);
                                    u0Var.a(fragment3);
                                    z11 = true;
                                    break;
                                case 4:
                                    fragment3.setAnimations(b1Var.f643d, b1Var.f644e, b1Var.f, b1Var.f645g);
                                    u0Var.getClass();
                                    Y(fragment3);
                                    z11 = true;
                                    break;
                                case 5:
                                    fragment3.setAnimations(b1Var.f643d, b1Var.f644e, b1Var.f, b1Var.f645g);
                                    u0Var.U(fragment3, true);
                                    u0Var.F(fragment3);
                                    z11 = true;
                                    break;
                                case 6:
                                    fragment3.setAnimations(b1Var.f643d, b1Var.f644e, b1Var.f, b1Var.f645g);
                                    u0Var.c(fragment3);
                                    z11 = true;
                                    break;
                                case 7:
                                    fragment3.setAnimations(b1Var.f643d, b1Var.f644e, b1Var.f, b1Var.f645g);
                                    u0Var.U(fragment3, true);
                                    u0Var.g(fragment3);
                                    z11 = true;
                                    break;
                                case 8:
                                    u0Var.W(null);
                                    z11 = true;
                                    break;
                                case ConnectionResult.SERVICE_INVALID /* 9 */:
                                    u0Var.W(fragment3);
                                    z11 = true;
                                    break;
                                case 10:
                                    u0Var.V(fragment3, b1Var.f646h);
                                    z11 = true;
                                    break;
                            }
                        }
                    } else {
                        aVar.d(1);
                        u0 u0Var2 = aVar.f633p;
                        ArrayList arrayList7 = aVar.f652a;
                        int size3 = arrayList7.size();
                        for (int i18 = 0; i18 < size3; i18++) {
                            b1 b1Var2 = (b1) arrayList7.get(i18);
                            Fragment fragment4 = b1Var2.f641b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = false;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(aVar.f);
                                fragment4.setSharedElementNames(aVar.f663m, aVar.n);
                            }
                            switch (b1Var2.f640a) {
                                case 1:
                                    fragment4.setAnimations(b1Var2.f643d, b1Var2.f644e, b1Var2.f, b1Var2.f645g);
                                    u0Var2.U(fragment4, false);
                                    u0Var2.a(fragment4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + b1Var2.f640a);
                                case 3:
                                    fragment4.setAnimations(b1Var2.f643d, b1Var2.f644e, b1Var2.f, b1Var2.f645g);
                                    u0Var2.P(fragment4);
                                    break;
                                case 4:
                                    fragment4.setAnimations(b1Var2.f643d, b1Var2.f644e, b1Var2.f, b1Var2.f645g);
                                    u0Var2.F(fragment4);
                                    break;
                                case 5:
                                    fragment4.setAnimations(b1Var2.f643d, b1Var2.f644e, b1Var2.f, b1Var2.f645g);
                                    u0Var2.U(fragment4, false);
                                    Y(fragment4);
                                    break;
                                case 6:
                                    fragment4.setAnimations(b1Var2.f643d, b1Var2.f644e, b1Var2.f, b1Var2.f645g);
                                    u0Var2.g(fragment4);
                                    break;
                                case 7:
                                    fragment4.setAnimations(b1Var2.f643d, b1Var2.f644e, b1Var2.f, b1Var2.f645g);
                                    u0Var2.U(fragment4, false);
                                    u0Var2.c(fragment4);
                                    break;
                                case 8:
                                    u0Var2.W(fragment4);
                                    break;
                                case ConnectionResult.SERVICE_INVALID /* 9 */:
                                    u0Var2.W(null);
                                    break;
                                case 10:
                                    u0Var2.V(fragment4, b1Var2.f647i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i5 - 1)).booleanValue();
                for (int i19 = i4; i19 < i5; i19++) {
                    a aVar2 = (a) arrayList.get(i19);
                    if (zBooleanValue) {
                        for (int size4 = aVar2.f652a.size() - 1; size4 >= 0; size4--) {
                            Fragment fragment5 = ((b1) aVar2.f652a.get(size4)).f641b;
                            if (fragment5 != null) {
                                f(fragment5).j();
                            }
                        }
                    } else {
                        ArrayList arrayList8 = aVar2.f652a;
                        int size5 = arrayList8.size();
                        int i20 = 0;
                        while (i20 < size5) {
                            Object obj2 = arrayList8.get(i20);
                            i20++;
                            Fragment fragment6 = ((b1) obj2).f641b;
                            if (fragment6 != null) {
                                f(fragment6).j();
                            }
                        }
                    }
                }
                K(this.f765s, true);
                HashSet<l> hashSet = new HashSet();
                for (int i21 = i4; i21 < i5; i21++) {
                    ArrayList arrayList9 = ((a) arrayList.get(i21)).f652a;
                    int size6 = arrayList9.size();
                    int i22 = 0;
                    while (i22 < size6) {
                        Object obj3 = arrayList9.get(i22);
                        i22++;
                        Fragment fragment7 = ((b1) obj3).f641b;
                        if (fragment7 != null && (viewGroup = fragment7.mContainer) != null) {
                            hashSet.add(l.h(viewGroup, E()));
                        }
                    }
                }
                for (l lVar : hashSet) {
                    lVar.f718d = zBooleanValue;
                    lVar.j();
                    lVar.d();
                }
                for (int i23 = i4; i23 < i5; i23++) {
                    a aVar3 = (a) arrayList.get(i23);
                    if (((Boolean) arrayList2.get(i23)).booleanValue() && aVar3.f635r >= 0) {
                        aVar3.f635r = -1;
                    }
                    aVar3.getClass();
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i10);
            boolean zBooleanValue2 = ((Boolean) arrayList2.get(i10)).booleanValue();
            ArrayList arrayList10 = this.K;
            if (zBooleanValue2) {
                z4 = z8;
                i6 = i10;
                z5 = z9;
                int i24 = 1;
                ArrayList arrayList11 = aVar4.f652a;
                int size7 = arrayList11.size() - 1;
                while (size7 >= 0) {
                    b1 b1Var3 = (b1) arrayList11.get(size7);
                    int i25 = b1Var3.f640a;
                    if (i25 == i24) {
                        arrayList10.remove(b1Var3.f641b);
                    } else if (i25 != 3) {
                        switch (i25) {
                            case 6:
                                arrayList10.add(b1Var3.f641b);
                                break;
                            case 7:
                                arrayList10.remove(b1Var3.f641b);
                                break;
                            case 8:
                                fragment = null;
                                break;
                            case ConnectionResult.SERVICE_INVALID /* 9 */:
                                fragment = b1Var3.f641b;
                                break;
                            case 10:
                                b1Var3.f647i = b1Var3.f646h;
                                break;
                        }
                    } else {
                        arrayList10.add(b1Var3.f641b);
                    }
                    size7--;
                    i24 = 1;
                }
            } else {
                ArrayList arrayList12 = aVar4.f652a;
                int i26 = 0;
                while (i26 < arrayList12.size()) {
                    b1 b1Var4 = (b1) arrayList12.get(i26);
                    int i27 = b1Var4.f640a;
                    if (i27 != i11) {
                        z6 = z8;
                        if (i27 != 2) {
                            if (i27 == 3 || i27 == 6) {
                                arrayList10.remove(b1Var4.f641b);
                                Fragment fragment8 = b1Var4.f641b;
                                if (fragment8 == fragment) {
                                    arrayList12.add(i26, new b1(fragment8, 9));
                                    i26++;
                                    i8 = i10;
                                    z7 = z9;
                                    i7 = 1;
                                    fragment = null;
                                }
                            } else if (i27 == 7) {
                                i7 = 1;
                            } else if (i27 == 8) {
                                arrayList12.add(i26, new b1(fragment, 9, 0));
                                b1Var4.f642c = true;
                                i26++;
                                fragment = b1Var4.f641b;
                            }
                            i8 = i10;
                            z7 = z9;
                            i7 = 1;
                        } else {
                            Fragment fragment9 = b1Var4.f641b;
                            int i28 = fragment9.mContainerId;
                            int size8 = arrayList10.size() - 1;
                            boolean z12 = false;
                            while (size8 >= 0) {
                                int i29 = size8;
                                Fragment fragment10 = (Fragment) arrayList10.get(size8);
                                int i30 = i10;
                                if (fragment10.mContainerId != i28) {
                                    z9 = z9;
                                } else if (fragment10 == fragment9) {
                                    z9 = z9;
                                    z12 = true;
                                } else {
                                    if (fragment10 == fragment) {
                                        i9 = 0;
                                        arrayList12.add(i26, new b1(fragment10, 9, 0));
                                        i26++;
                                        fragment = null;
                                    } else {
                                        i9 = 0;
                                    }
                                    b1 b1Var5 = new b1(fragment10, 3, i9);
                                    b1Var5.f643d = b1Var4.f643d;
                                    b1Var5.f = b1Var4.f;
                                    b1Var5.f644e = b1Var4.f644e;
                                    b1Var5.f645g = b1Var4.f645g;
                                    arrayList12.add(i26, b1Var5);
                                    arrayList10.remove(fragment10);
                                    i26++;
                                    fragment = fragment;
                                }
                                size8 = i29 - 1;
                                z9 = z9;
                                i10 = i30;
                            }
                            i8 = i10;
                            z7 = z9;
                            i7 = 1;
                            if (z12) {
                                arrayList12.remove(i26);
                                i26--;
                            } else {
                                b1Var4.f640a = 1;
                                b1Var4.f642c = true;
                                arrayList10.add(fragment9);
                            }
                        }
                        i26 += i7;
                        i11 = i7;
                        z8 = z6;
                        z9 = z7;
                        i10 = i8;
                    } else {
                        z6 = z8;
                        i7 = i11;
                    }
                    i8 = i10;
                    z7 = z9;
                    arrayList10.add(b1Var4.f641b);
                    i26 += i7;
                    i11 = i7;
                    z8 = z6;
                    z9 = z7;
                    i10 = i8;
                }
                z4 = z8;
                i6 = i10;
                z5 = z9;
            }
            z9 = z5 || aVar4.f657g;
            i10 = i6 + 1;
            z8 = z4;
        }
    }
}
