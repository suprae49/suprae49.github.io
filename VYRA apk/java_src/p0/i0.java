package p0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static y1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        y1 y1VarH = y1.h(null, rootWindowInsets);
        t1 t1Var = y1VarH.f3268a;
        t1Var.v(y1VarH);
        View rootView = view.getRootView();
        t1Var.d(rootView);
        t1Var.o(rootView);
        t1Var.p();
        return y1VarH;
    }
}
