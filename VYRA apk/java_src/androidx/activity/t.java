package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    static {
        Color.argb(230, 255, 255, 255);
        Color.argb(128, 27, 27, 27);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [q3.l, r3.h] */
    /* JADX WARN: Type inference failed for: r0v4, types: [q3.l, r3.h] */
    public static final void a(q qVar, m0 m0Var, m0 m0Var2) {
        u wVar;
        m0Var.getClass();
        m0Var2.getClass();
        View decorView = qVar.getWindow().getDecorView();
        decorView.getClass();
        ?? r4 = m0Var.f226d;
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) r4.g(resources)).booleanValue();
        ?? r5 = m0Var2.f226d;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = ((Boolean) r5.g(resources2)).booleanValue();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            wVar = new z();
        } else if (i4 >= 29) {
            wVar = new y();
        } else {
            wVar = i4 >= 28 ? new w() : new u();
        }
        u uVar = wVar;
        Window window = qVar.getWindow();
        window.getClass();
        uVar.b(m0Var, m0Var2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = qVar.getWindow();
        window2.getClass();
        uVar.a(window2);
    }
}
