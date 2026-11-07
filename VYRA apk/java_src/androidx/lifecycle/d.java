package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f816c = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f817a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f818b = new HashMap();

    public static void b(HashMap map, c cVar, m mVar, Class cls) {
        m mVar2 = (m) map.get(cVar);
        if (mVar2 == null || mVar == mVar2) {
            if (mVar2 == null) {
                map.put(cVar, mVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + cVar.f815b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + mVar2 + ", new value " + mVar);
    }

    public final b a(Class cls, Method[] methodArr) {
        int i4;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f817a;
        if (superclass != null) {
            b bVarA = (b) map2.get(superclass);
            if (bVarA == null) {
                bVarA = a(superclass, null);
            }
            map.putAll(bVarA.f813b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            b bVarA2 = (b) map2.get(cls2);
            if (bVarA2 == null) {
                bVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : bVarA2.f813b.entrySet()) {
                b(map, (c) entry.getKey(), (m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e5) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
            }
        }
        boolean z4 = false;
        for (Method method : methodArr) {
            c0 c0Var = (c0) method.getAnnotation(c0.class);
            if (c0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i4 = 0;
                } else {
                    if (!t.class.isAssignableFrom(parameterTypes[0])) {
                        androidx.fragment.app.q.q("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i4 = 1;
                }
                m mVarValue = c0Var.value();
                if (parameterTypes.length > 1) {
                    if (!m.class.isAssignableFrom(parameterTypes[1])) {
                        androidx.fragment.app.q.q("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (mVarValue != m.ON_ANY) {
                        androidx.fragment.app.q.q("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i4 = 2;
                }
                if (parameterTypes.length > 2) {
                    androidx.fragment.app.q.q("cannot have more than 2 params");
                    return null;
                }
                b(map, new c(i4, method), mVarValue, cls);
                z4 = true;
            }
        }
        b bVar = new b(map);
        map2.put(cls, bVar);
        this.f818b.put(cls, Boolean.valueOf(z4));
        return bVar;
    }
}
