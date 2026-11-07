package k3;

import i3.g;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k.u2;
import r3.f;
import r3.l;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements f, i3.c, b, Serializable {
    public final i3.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f2970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient i3.c f2971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2972i;

    public e(i3.c cVar) {
        g gVarD = cVar != null ? cVar.d() : null;
        this.f = cVar;
        this.f2970g = gVarD;
        this.f2972i = 2;
    }

    @Override // r3.f
    public final int b() {
        return this.f2972i;
    }

    @Override // k3.b
    public final b c() {
        i3.c cVar = this.f;
        if (cVar instanceof b) {
            return (b) cVar;
        }
        return null;
    }

    @Override // i3.c
    public final g d() {
        g gVar = this.f2970g;
        gVar.getClass();
        return gVar;
    }

    @Override // i3.c
    public final void e(Object obj) {
        i3.c cVar = this;
        while (true) {
            e eVar = (e) cVar;
            i3.c cVar2 = eVar.f;
            cVar2.getClass();
            try {
                obj = eVar.i(obj);
                if (obj == j3.a.f) {
                    return;
                }
            } catch (Throwable th) {
                obj = new g3.c(th);
            }
            i3.c cVar3 = eVar.f2971h;
            if (cVar3 != null && cVar3 != eVar) {
                g gVar = eVar.f2970g;
                gVar.getClass();
                i3.e eVarA = gVar.a(i3.d.f);
                eVarA.getClass();
                b4.c cVar4 = (b4.c) cVar3;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b4.c.f1078m;
                while (atomicReferenceFieldUpdater.get(cVar4) == b4.d.f1085b) {
                }
                atomicReferenceFieldUpdater.get(cVar4);
            }
            eVar.f2971h = a.f;
            if (!(cVar2 instanceof e)) {
                cVar2.e(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public abstract i3.c h(i3.c cVar, Object obj);

    public abstract Object i(Object obj);

    public final String j() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        c cVar = (c) getClass().getAnnotation(c.class);
        Object name = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        if (cVar != null) {
            int iV = cVar.v();
            if (iV > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
            }
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                iIntValue = -1;
            }
            int i4 = iIntValue >= 0 ? cVar.l()[iIntValue] : -1;
            u2 u2Var = d.f2969b;
            u2 u2Var2 = d.f2968a;
            if (u2Var == null) {
                try {
                    u2 u2Var3 = new u2(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    d.f2969b = u2Var3;
                    u2Var = u2Var3;
                } catch (Exception unused2) {
                    d.f2969b = u2Var2;
                    u2Var = u2Var2;
                }
            }
            if (u2Var != u2Var2 && (method = u2Var.f2659a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = u2Var.f2660b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
                Method method3 = u2Var.f2661c;
                Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                if (objInvoke3 instanceof String) {
                    str = (String) objInvoke3;
                }
            }
            if (str == null) {
                strC = cVar.c();
            } else {
                strC = str + '/' + cVar.c();
            }
            name = new StackTraceElement(strC, cVar.m(), cVar.f(), i4);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append(name);
        return sb.toString();
    }

    public final String toString() {
        if (this.f != null) {
            return j();
        }
        l.f3614a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
