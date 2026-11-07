package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import p0.a2;
import p0.b2;
import p0.z1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class y extends w {
    @Override // androidx.activity.u
    public void b(m0 m0Var, m0 m0Var2, Window window, View view, boolean z4, boolean z5) {
        int i4;
        int i5;
        e4.a a2Var;
        m0Var.getClass();
        m0Var2.getClass();
        int i6 = m0Var2.f225c;
        window.getClass();
        view.getClass();
        e4.a.d0(window, false);
        if (m0Var.f225c == 0) {
            i4 = 0;
        } else {
            i4 = z4 ? m0Var.f224b : m0Var.f223a;
        }
        window.setStatusBarColor(i4);
        if (i6 == 0) {
            i5 = 0;
        } else {
            i5 = z5 ? m0Var2.f224b : m0Var2.f223a;
        }
        window.setNavigationBarColor(i5);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(i6 == 0);
        a3.h0 h0Var = new a3.h0(view);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            a2Var = new b2(window, h0Var);
        } else {
            a2Var = i7 >= 30 ? new a2(window, h0Var) : new z1(window, h0Var);
        }
        a2Var.c0(!z4);
        a2Var.b0(true ^ z5);
    }
}
