package k;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f2530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f2531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f2532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f2533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Field f2534e;
    public static final Field f;

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z4;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z4 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z4 = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z4 = false;
                    if (z4) {
                        f2531b = method;
                        f2532c = field;
                        f2533d = field2;
                        f2534e = field3;
                        f = field4;
                        f2530a = true;
                        return;
                    }
                    f2531b = null;
                    f2532c = null;
                    f2533d = null;
                    f2534e = null;
                    f = null;
                    f2530a = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z4 = false;
                    if (z4) {
                        f2531b = method;
                        f2532c = field;
                        f2533d = field2;
                        f2534e = field3;
                        f = field4;
                        f2530a = true;
                        return;
                    }
                    f2531b = null;
                    f2532c = null;
                    f2533d = null;
                    f2534e = null;
                    f = null;
                    f2530a = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z4 = false;
                    if (z4) {
                        f2531b = method;
                        f2532c = field;
                        f2533d = field2;
                        f2534e = field3;
                        f = field4;
                        f2530a = true;
                        return;
                    }
                    f2531b = null;
                    f2532c = null;
                    f2533d = null;
                    f2534e = null;
                    f = null;
                    f2530a = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                    f2531b = method;
                    f2532c = field;
                    f2533d = field2;
                    f2534e = field3;
                    f = field4;
                    f2530a = true;
                    return;
                }
                f2531b = null;
                f2532c = null;
                f2533d = null;
                f2534e = null;
                f = null;
                f2530a = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                    f2531b = method;
                    f2532c = field;
                    f2533d = field2;
                    f2534e = field3;
                    f = field4;
                    f2530a = true;
                    return;
                }
                f2531b = null;
                f2532c = null;
                f2533d = null;
                f2534e = null;
                f = null;
                f2530a = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                    f2531b = method;
                    f2532c = field;
                    f2533d = field2;
                    f2534e = field3;
                    f = field4;
                    f2530a = true;
                    return;
                }
                f2531b = null;
                f2532c = null;
                f2533d = null;
                f2534e = null;
                f = null;
                f2530a = false;
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z4) {
            f2531b = method;
            f2532c = field;
            f2533d = field2;
            f2534e = field3;
            f = field4;
            f2530a = true;
            return;
        }
        f2531b = null;
        f2532c = null;
        f2533d = null;
        f2534e = null;
        f = null;
        f2530a = false;
    }
}
