package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f833a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f834b = new q0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f835c = new q0();

    public static final void a(p0 p0Var, l1.c cVar, o oVar) {
        Object obj;
        cVar.getClass();
        oVar.getClass();
        HashMap map = p0Var.f853a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = p0Var.f853a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f811h) {
            return;
        }
        savedStateHandleController.b(oVar, cVar);
        n nVar = ((v) oVar).f866c;
        if (nVar == n.f842g || nVar.compareTo(n.f844i) >= 0) {
            cVar.d();
        } else {
            oVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(oVar, cVar));
        }
    }

    public static j0 b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new j0();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                str.getClass();
                map.put(str, bundle2.get(str));
            }
            return new j0(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            androidx.fragment.app.q.j("Invalid bundle passed as restored state");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = parcelableArrayList.get(i4);
            obj.getClass();
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i4));
        }
        return new j0(linkedHashMap);
    }

    public static final j0 c(f1.c cVar) {
        LinkedHashMap linkedHashMap = cVar.f2088a;
        l1.e eVar = (l1.e) linkedHashMap.get(f833a);
        if (eVar == null) {
            androidx.fragment.app.q.q("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        u0 u0Var = (u0) linkedHashMap.get(f834b);
        if (u0Var == null) {
            androidx.fragment.app.q.q("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f835c);
        String str = (String) linkedHashMap.get(q0.f857g);
        if (str == null) {
            androidx.fragment.app.q.q("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        l1.b bVarB = eVar.getSavedStateRegistry().b();
        l0 l0Var = bVarB instanceof l0 ? (l0) bVarB : null;
        if (l0Var == null) {
            androidx.fragment.app.q.j("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        m0 m0VarE = e(u0Var);
        j0 j0Var = (j0) m0VarE.f841d.get(str);
        if (j0Var != null) {
            return j0Var;
        }
        Class[] clsArr = j0.f;
        l0Var.b();
        Bundle bundle2 = l0Var.f839c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = l0Var.f839c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = l0Var.f839c;
        if (bundle5 != null && bundle5.isEmpty()) {
            l0Var.f839c = null;
        }
        j0 j0VarB = b(bundle3, bundle);
        m0VarE.f841d.put(str, j0VarB);
        return j0VarB;
    }

    public static final void d(l1.e eVar) {
        n nVar = ((v) eVar.getLifecycle()).f866c;
        if (nVar != n.f842g && nVar != n.f843h) {
            androidx.fragment.app.q.q("Failed requirement.");
        } else if (eVar.getSavedStateRegistry().b() == null) {
            l0 l0Var = new l0(eVar.getSavedStateRegistry(), (u0) eVar);
            eVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", l0Var);
            eVar.getLifecycle().a(new SavedStateHandleAttacher(l0Var));
        }
    }

    public static final m0 e(u0 u0Var) {
        ArrayList arrayList = new ArrayList();
        r3.l.f3614a.getClass();
        arrayList.add(new f1.d(m0.class));
        f1.d[] dVarArr = (f1.d[]) arrayList.toArray(new f1.d[0]);
        return (m0) new androidx.emoji2.text.t(u0Var.getViewModelStore(), new a3.h0(12, (f1.d[]) Arrays.copyOf(dVarArr, dVarArr.length)), u0Var instanceof i ? ((i) u0Var).getDefaultViewModelCreationExtras() : f1.a.f2087b).e("androidx.lifecycle.internal.SavedStateHandlesVM", m0.class);
    }
}
