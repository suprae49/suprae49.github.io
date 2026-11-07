package k;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f2548a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f2549b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f2550c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29 || i4 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f2548a);
        } else {
            drawable.setState(f2549b);
        }
        drawable.setState(state);
    }

    public static Rect b(Drawable drawable) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            Insets insetsA = i1.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        if (i4 >= 29) {
            boolean z4 = h1.f2530a;
        } else if (h1.f2530a) {
            try {
                Object objInvoke = h1.f2531b.invoke(drawable, null);
                if (objInvoke != null) {
                    return new Rect(h1.f2532c.getInt(objInvoke), h1.f2533d.getInt(objInvoke), h1.f2534e.getInt(objInvoke), h1.f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f2550c;
    }

    public static PorterDuff.Mode c(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
