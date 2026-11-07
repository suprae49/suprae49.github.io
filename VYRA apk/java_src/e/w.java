package e;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, d0 d0Var) {
        Objects.requireNonNull(d0Var);
        androidx.activity.d0 d0Var2 = new androidx.activity.d0(1, d0Var);
        androidx.activity.r.h(obj).registerOnBackInvokedCallback(1000000, d0Var2);
        return d0Var2;
    }

    public static void c(Object obj, Object obj2) {
        androidx.activity.r.h(obj).unregisterOnBackInvokedCallback(androidx.activity.r.d(obj2));
    }
}
