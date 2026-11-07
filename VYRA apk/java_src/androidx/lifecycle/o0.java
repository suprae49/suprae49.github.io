package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f852b;

    static {
        List listAsList = Arrays.asList(Application.class, j0.class);
        listAsList.getClass();
        f851a = listAsList;
        List listSingletonList = Collections.singletonList(j0.class);
        listSingletonList.getClass();
        f852b = listSingletonList;
    }

    public static final Constructor a(Class cls, List list) {
        List listSingletonList;
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            int length = parameterTypes.length;
            if (length == 0) {
                listSingletonList = h3.m.f;
            } else if (length != 1) {
                listSingletonList = new ArrayList(new h3.b(parameterTypes));
            } else {
                listSingletonList = Collections.singletonList(parameterTypes[0]);
                listSingletonList.getClass();
            }
            if (list.equals(listSingletonList)) {
                return constructor;
            }
            if (list.size() == listSingletonList.size() && listSingletonList.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final p0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (p0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e5) {
            androidx.fragment.app.q.o("Failed to access ", cls, e5);
            return null;
        } catch (InstantiationException e6) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e7.getCause());
        }
    }
}
