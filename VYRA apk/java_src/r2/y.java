package r2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import d3.e0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends p1.r {
    @Override // p1.r
    public final void e(p1.a0 a0Var) {
        View view = a0Var.f3277b;
        if (view instanceof TextView) {
            a0Var.f3276a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p1.r
    public final void h(p1.a0 a0Var) {
        View view = a0Var.f3277b;
        if (view instanceof TextView) {
            a0Var.f3276a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p1.r
    public final Animator l(ViewGroup viewGroup, p1.a0 a0Var, p1.a0 a0Var2) {
        if (a0Var == null || a0Var2 == null || !(a0Var.f3277b instanceof TextView)) {
            return null;
        }
        View view = a0Var2.f3277b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = a0Var.f3276a;
        HashMap map2 = a0Var2.f3276a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new e0(3, textView));
        return valueAnimatorOfFloat;
    }
}
