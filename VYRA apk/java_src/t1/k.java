package t1;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f3715a;

    static {
        n dVar;
        try {
            dVar = new r0.b((WebViewProviderFactoryBoundaryInterface) e4.a.i(WebViewProviderFactoryBoundaryInterface.class, l.h()));
        } catch (ClassNotFoundException unused) {
            dVar = new d();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
        f3715a = dVar;
    }
}
