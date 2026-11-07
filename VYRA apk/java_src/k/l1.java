package k;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f2581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f2582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f2583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f2584d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f2581a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f2582b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f2583c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f2584d = true;
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        }
    }
}
