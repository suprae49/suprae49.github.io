package b2;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f1047a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1.a f1048b = new e1.a(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1.a f1049c = new e1.a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e1.a f1050d = new e1.a(e1.a.f2046e);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f1051e = new DecelerateInterpolator();

    public static float a(float f, float f4, float f5) {
        return ((f4 - f) * f5) + f;
    }

    public static float b(float f, float f4, float f5, float f6, float f7) {
        if (f7 <= f5) {
            return f;
        }
        return f7 >= f6 ? f4 : a(f, f4, (f7 - f5) / (f6 - f5));
    }

    public static int c(int i4, int i5, float f) {
        return Math.round(f * (i5 - i4)) + i4;
    }
}
