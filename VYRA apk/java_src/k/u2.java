package k;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f2659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f2660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f2661c;

    public u2(Method method, Method method2, Method method3) {
        this.f2659a = method;
        this.f2660b = method2;
        this.f2661c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
