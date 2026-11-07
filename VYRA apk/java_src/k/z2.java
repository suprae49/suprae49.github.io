package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2710a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f2711b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f2712c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f2713d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f2714e = {R.attr.state_checked};
    public static final int[] f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f2715g = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(d.a.f1639j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i4) {
        ColorStateList colorStateListD = d(context, i4);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f2711b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = f2710a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f4 = typedValue.getFloat();
        int iC = c(context, i4);
        return f0.b.d(iC, Math.round(Color.alpha(iC) * f4));
    }

    public static int c(Context context, int i4) {
        int[] iArr = f2715g;
        iArr[0] = i4;
        androidx.emoji2.text.t tVarT = androidx.emoji2.text.t.t(context, null, iArr);
        try {
            return ((TypedArray) tVarT.f579c).getColor(0, 0);
        } finally {
            tVarT.v();
        }
    }

    public static ColorStateList d(Context context, int i4) {
        int[] iArr = f2715g;
        iArr[0] = i4;
        androidx.emoji2.text.t tVarT = androidx.emoji2.text.t.t(context, null, iArr);
        try {
            return tVarT.h(0);
        } finally {
            tVarT.v();
        }
    }
}
