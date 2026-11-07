package k;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends a2 implements b2 {
    public static final Method I;
    public a3.h0 H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // k.b2
    public final void f(j.m mVar, MenuItem menuItem) {
        a3.h0 h0Var = this.H;
        if (h0Var != null) {
            h0Var.f(mVar, menuItem);
        }
    }

    @Override // k.b2
    public final void k(j.m mVar, j.o oVar) {
        a3.h0 h0Var = this.H;
        if (h0Var != null) {
            h0Var.k(mVar, oVar);
        }
    }

    @Override // k.a2
    public final p1 q(Context context, boolean z4) {
        e2 e2Var = new e2(context, z4);
        e2Var.setHoverListener(this);
        return e2Var;
    }
}
