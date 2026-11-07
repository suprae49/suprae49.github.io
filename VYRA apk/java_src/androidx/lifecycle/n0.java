package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements s0 {
    public final Application f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0 f847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l1.c f850j;

    public n0(Application application, l1.e eVar, Bundle bundle) {
        r0 r0Var;
        this.f850j = eVar.getSavedStateRegistry();
        this.f849i = eVar.getLifecycle();
        this.f848h = bundle;
        this.f = application;
        if (application != null) {
            if (r0.f859j == null) {
                r0.f859j = new r0(application);
            }
            r0Var = r0.f859j;
            r0Var.getClass();
        } else {
            r0Var = new r0(null);
        }
        this.f847g = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p0 a(String str, Class cls) {
        Object obj;
        Application application;
        o oVar = this.f849i;
        if (oVar == null) {
            androidx.fragment.app.q.t("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.f == null) ? o0.a(cls, o0.f852b) : o0.a(cls, o0.f851a);
        if (constructorA == null) {
            if (this.f != null) {
                return this.f847g.c(cls);
            }
            if (q0.f858h == null) {
                q0.f858h = new q0();
            }
            q0 q0Var = q0.f858h;
            q0Var.getClass();
            return q0Var.c(cls);
        }
        l1.c cVar = this.f850j;
        cVar.getClass();
        Bundle bundle = this.f848h;
        Bundle bundleA = cVar.a(str);
        Class[] clsArr = j0.f;
        j0 j0VarB = k0.b(bundleA, bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, j0VarB);
        savedStateHandleController.b(oVar, cVar);
        n nVar = ((v) oVar).f866c;
        if (nVar == n.f842g || nVar.compareTo(n.f844i) >= 0) {
            cVar.d();
        } else {
            oVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(oVar, cVar));
        }
        p0 p0VarB = (!zIsAssignableFrom || (application = this.f) == null) ? o0.b(cls, constructorA, j0VarB) : o0.b(cls, constructorA, application, j0VarB);
        synchronized (p0VarB.f853a) {
            try {
                obj = p0VarB.f853a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == null) {
                    p0VarB.f853a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            savedStateHandleController = obj;
        }
        if (p0VarB.f855c) {
            p0.a(savedStateHandleController);
        }
        return p0VarB;
    }

    @Override // androidx.lifecycle.s0
    public final p0 c(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(canonicalName, cls);
        }
        androidx.fragment.app.q.q("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // androidx.lifecycle.s0
    public final p0 l(Class cls, f1.c cVar) {
        q0 q0Var = q0.f857g;
        LinkedHashMap linkedHashMap = cVar.f2088a;
        String str = (String) linkedHashMap.get(q0Var);
        if (str == null) {
            androidx.fragment.app.q.j("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(k0.f833a) == null || linkedHashMap.get(k0.f834b) == null) {
            if (this.f849i != null) {
                return a(str, cls);
            }
            androidx.fragment.app.q.j("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(q0.f);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? o0.a(cls, o0.f852b) : o0.a(cls, o0.f851a);
        if (constructorA == null) {
            return this.f847g.l(cls, cVar);
        }
        return (!zIsAssignableFrom || application == null) ? o0.b(cls, constructorA, k0.c(cVar)) : o0.b(cls, constructorA, application, k0.c(cVar));
    }
}
