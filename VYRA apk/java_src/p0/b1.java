package p0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends j1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f3174g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f3175h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Constructor f3176i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f3177j = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WindowInsets f3178e;
    public f0.c f;

    public b1() {
        this.f3178e = j();
    }

    private static WindowInsets j() {
        if (!f3175h) {
            try {
                f3174g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e5);
            }
            f3175h = true;
        }
        Field field = f3174g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e6);
            }
        }
        if (!f3177j) {
            try {
                f3176i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e7);
            }
            f3177j = true;
        }
        Constructor constructor = f3176i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e8);
            }
        }
        return null;
    }

    @Override // p0.j1
    public y1 b() {
        a();
        y1 y1VarH = y1.h(null, this.f3178e);
        f0.c[] cVarArr = this.f3203b;
        t1 t1Var = y1VarH.f3268a;
        t1Var.u(cVarArr);
        t1Var.w(this.f);
        t1Var.t(null);
        t1Var.y(this.f3204c);
        t1Var.z(this.f3205d);
        return y1VarH;
    }

    @Override // p0.j1
    public void f(f0.c cVar) {
        this.f = cVar;
    }

    @Override // p0.j1
    public void h(f0.c cVar) {
        WindowInsets windowInsets = this.f3178e;
        if (windowInsets != null) {
            this.f3178e = windowInsets.replaceSystemWindowInsets(cVar.f2067a, cVar.f2068b, cVar.f2069c, cVar.f2070d);
        }
    }

    public b1(y1 y1Var) {
        super(y1Var);
        this.f3178e = y1Var.g();
    }
}
