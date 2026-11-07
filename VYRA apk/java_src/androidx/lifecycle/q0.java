package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class q0 implements s0 {
    public static final q0 f = new q0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q0 f857g = new q0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static q0 f858h;

    @Override // androidx.lifecycle.s0
    public p0 c(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            return (p0) objNewInstance;
        } catch (IllegalAccessException e5) {
            androidx.fragment.app.q.o("Cannot create an instance of ", cls, e5);
            return null;
        } catch (InstantiationException e6) {
            androidx.fragment.app.q.o("Cannot create an instance of ", cls, e6);
            return null;
        } catch (NoSuchMethodException e7) {
            androidx.fragment.app.q.o("Cannot create an instance of ", cls, e7);
            return null;
        }
    }
}
