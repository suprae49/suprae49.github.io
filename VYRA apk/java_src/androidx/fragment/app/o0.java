package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p.k f734b = new p.k(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f735a;

    public o0(u0 u0Var) {
        this.f735a = u0Var;
    }

    public static Class a(String str, ClassLoader classLoader) throws ClassNotFoundException {
        p.k kVar = f734b;
        p.k kVar2 = (p.k) kVar.get(classLoader);
        if (kVar2 == null) {
            kVar2 = new p.k(0);
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class b(String str, ClassLoader classLoader) {
        try {
            return a(str, classLoader);
        } catch (ClassCastException e5) {
            throw new z(u.m("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e5);
        } catch (ClassNotFoundException e6) {
            throw new z(u.m("Unable to instantiate fragment ", str, ": make sure class name exists"), e6);
        }
    }
}
