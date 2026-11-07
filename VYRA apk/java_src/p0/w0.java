package p0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import co.median.android.eeqadjy.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f3257e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final e1.a f = new e1.a(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f3258g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f3259h = new AccelerateInterpolator(1.5f);

    public static void f(View view, a1 a1Var) {
        t0 t0VarK = k(view);
        if (t0VarK != null) {
            t0VarK.a(a1Var);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                f(viewGroup.getChildAt(i4), a1Var);
            }
        }
    }

    public static void g(View view, a1 a1Var, y1 y1Var, boolean z4) {
        t0 t0VarK = k(view);
        if (t0VarK != null) {
            t0VarK.f3246a = y1Var;
            if (!z4) {
                t0VarK.b(a1Var);
                z4 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                g(viewGroup.getChildAt(i4), a1Var, y1Var, z4);
            }
        }
    }

    public static void h(View view, y1 y1Var, List list) {
        t0 t0VarK = k(view);
        if (t0VarK != null) {
            t0VarK.c(y1Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                h(viewGroup.getChildAt(i4), y1Var, list);
            }
        }
    }

    public static void i(View view, a1 a1Var, androidx.emoji2.text.p pVar) {
        t0 t0VarK = k(view);
        if (t0VarK != null) {
            t0VarK.d(a1Var, pVar);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                i(viewGroup.getChildAt(i4), a1Var, pVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static t0 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof v0) {
            return ((v0) tag).f3254a;
        }
        return null;
    }
}
