package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import p0.a2;
import p0.b2;
import p0.z1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class u {
    public void b(m0 m0Var, m0 m0Var2, Window window, View view, boolean z4, boolean z5) {
        e4.a a2Var;
        m0Var.getClass();
        m0Var2.getClass();
        window.getClass();
        view.getClass();
        e4.a.d0(window, false);
        window.setStatusBarColor(z4 ? m0Var.f224b : m0Var.f223a);
        window.setNavigationBarColor(z5 ? m0Var2.f224b : m0Var2.f223a);
        a3.h0 h0Var = new a3.h0(view);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            a2Var = new b2(window, h0Var);
        } else {
            a2Var = i4 >= 30 ? new a2(window, h0Var) : new z1(window, h0Var);
        }
        a2Var.c0(!z4);
        a2Var.b0(!z5);
    }

    public void a(Window window) {
    }
}
