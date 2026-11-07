package p1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import k.y2;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f3281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y2 f3282b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3281a = new i0();
        } else {
            f3281a = new h0();
        }
        f3282b = new y2("translationAlpha", 6, Float.class);
        new y2("clipBounds", 7, Rect.class);
    }

    public static void a(View view, int i4, int i5, int i6, int i7) {
        f3281a.u0(view, i4, i5, i6, i7);
    }

    public static void b(View view, int i4) {
        f3281a.v0(view, i4);
    }
}
