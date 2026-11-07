package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends q0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static r0 f859j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Application f860i;

    public r0(Application application) {
        this.f860i = application;
    }

    public final p0 a(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return super.c(cls);
        }
        try {
            p0 p0Var = (p0) cls.getConstructor(Application.class).newInstance(application);
            p0Var.getClass();
            return p0Var;
        } catch (IllegalAccessException e5) {
            androidx.fragment.app.q.o("Cannot create an instance of ", cls, e5);
            return null;
        } catch (InstantiationException e6) {
            androidx.fragment.app.q.o("Cannot create an instance of ", cls, e6);
            return null;
        } catch (NoSuchMethodException e7) {
            androidx.fragment.app.q.o("Cannot create an instance of ", cls, e7);
            return null;
        } catch (InvocationTargetException e8) {
            androidx.fragment.app.q.o("Cannot create an instance of ", cls, e8);
            return null;
        }
    }

    @Override // androidx.lifecycle.q0, androidx.lifecycle.s0
    public final p0 c(Class cls) {
        Application application = this.f860i;
        if (application != null) {
            return a(cls, application);
        }
        androidx.fragment.app.q.t("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // androidx.lifecycle.s0
    public final p0 l(Class cls, f1.c cVar) {
        if (this.f860i != null) {
            return c(cls);
        }
        Application application = (Application) cVar.f2088a.get(q0.f);
        if (application != null) {
            return a(cls, application);
        }
        if (!a.class.isAssignableFrom(cls)) {
            return super.c(cls);
        }
        androidx.fragment.app.q.q("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }
}
