package p1;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class h0 extends u1.h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f3292e = true;
    public static boolean f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f3293g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f3294h = true;

    public void u0(View view, int i4, int i5, int i6, int i7) {
        if (f3293g) {
            try {
                f0.a(view, i4, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f3293g = false;
            }
        }
    }

    public void v0(View view, int i4) {
        if (Build.VERSION.SDK_INT != 28) {
            if (f3294h) {
                try {
                    g0.a(view, i4);
                    return;
                } catch (NoSuchMethodError unused) {
                    f3294h = false;
                    return;
                }
            }
            return;
        }
        if (!u1.h0.f3943d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                u1.h0.f3942c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            u1.h0.f3943d = true;
        }
        Field field = u1.h0.f3942c;
        if (field != null) {
            try {
                u1.h0.f3942c.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void w0(View view, Matrix matrix) {
        if (f3292e) {
            try {
                e0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3292e = false;
            }
        }
    }

    public void x0(ViewGroup viewGroup, Matrix matrix) {
        if (f) {
            try {
                e0.c(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
