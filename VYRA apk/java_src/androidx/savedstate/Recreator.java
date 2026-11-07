package androidx.savedstate;

import android.os.Bundle;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import androidx.lifecycle.k0;
import androidx.lifecycle.m;
import androidx.lifecycle.p0;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import l1.a;
import l1.c;
import l1.e;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements r {
    public final e f;

    public Recreator(e eVar) {
        this.f = eVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, m mVar) {
        if (mVar != m.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        tVar.getLifecycle().b(this);
        e eVar = this.f;
        Bundle bundleA = eVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            q.j("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        int size = stringArrayList.size();
        int i4 = 0;
        while (i4 < size) {
            String str = stringArrayList.get(i4);
            i4++;
            String str2 = str;
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(a.class);
                clsAsSubclass.getClass();
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        objNewInstance.getClass();
                        if (!(eVar instanceof u0)) {
                            q.j("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                            return;
                        }
                        t0 viewModelStore = ((u0) eVar).getViewModelStore();
                        c savedStateRegistry = eVar.getSavedStateRegistry();
                        viewModelStore.getClass();
                        LinkedHashMap linkedHashMap = viewModelStore.f861a;
                        for (String str3 : new HashSet(linkedHashMap.keySet())) {
                            str3.getClass();
                            p0 p0Var = (p0) linkedHashMap.get(str3);
                            p0Var.getClass();
                            k0.a(p0Var, savedStateRegistry, eVar.getLifecycle());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            savedStateRegistry.d();
                        }
                    } catch (Exception e5) {
                        q.o("Failed to instantiate ", str2, e5);
                        return;
                    }
                } catch (NoSuchMethodException e6) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException(u.m("Class ", str2, " wasn't found"), e7);
            }
        }
    }
}
