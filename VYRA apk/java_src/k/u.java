package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2643b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static u f2644c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h2 f2645a;

    public static synchronized u a() {
        try {
            if (f2644c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2644c;
    }

    public static synchronized PorterDuffColorFilter c(int i4, PorterDuff.Mode mode) {
        return h2.e(i4, mode);
    }

    public static synchronized void d() {
        if (f2644c == null) {
            u uVar = new u();
            f2644c = uVar;
            uVar.f2645a = h2.b();
            h2 h2Var = f2644c.f2645a;
            t tVar = new t();
            synchronized (h2Var) {
                h2Var.f2541e = tVar;
            }
        }
    }

    public static void e(Drawable drawable, b3 b3Var, int[] iArr) {
        PorterDuff.Mode mode = h2.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = b3Var.f2493d;
        if (!z4 && !b3Var.f2492c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z4 ? b3Var.f2490a : null;
        PorterDuff.Mode mode2 = b3Var.f2492c ? b3Var.f2491b : h2.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = h2.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i4) {
        return this.f2645a.c(context, i4);
    }
}
