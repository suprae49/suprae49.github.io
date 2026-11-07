package e;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f1927b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f1928c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1929d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f1930e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f1931g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p.k f1932h = new p.k(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f1933a = new Object[2];

    public k.n a(Context context, AttributeSet attributeSet) {
        return new k.n(context, attributeSet);
    }

    public k.p b(Context context, AttributeSet attributeSet) {
        return new k.p(context, attributeSet, co.median.android.eeqadjy.R.attr.buttonStyle);
    }

    public k.q c(Context context, AttributeSet attributeSet) {
        return new k.q(context, attributeSet, co.median.android.eeqadjy.R.attr.checkboxStyle);
    }

    public k.d0 d(Context context, AttributeSet attributeSet) {
        return new k.d0(context, attributeSet);
    }

    public y0 e(Context context, AttributeSet attributeSet) {
        return new y0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        p.k kVar = f1932h;
        Constructor constructor = (Constructor) kVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1927b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1933a);
    }
}
