package r2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import co.median.android.eeqadjy.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p0.h0;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f3505a = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f3506b = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k1.m f3507c = new k1.m(1);

    public static void a(Context context, AttributeSet attributeSet, int i4, int i5) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a2.a.R, i4, i5);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z4) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f3506b, "Theme.MaterialComponents");
            }
        }
        c(context, f3505a, "Theme.AppCompat");
    }

    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a2.a.R, i4, i5);
        boolean z4 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
            int length = iArr2.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z4 = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i6], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i6++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z4 = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z4) {
            return;
        }
        androidx.fragment.app.q.q("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i4)) {
                typedArrayObtainStyledAttributes.recycle();
                androidx.fragment.app.q.q(androidx.fragment.app.u.m("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void d(View view, c0 c0Var) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        d0 d0Var = new d0();
        d0Var.f3548a = paddingStart;
        d0Var.f3549b = paddingTop;
        d0Var.f3550c = paddingEnd;
        d0Var.f3551d = paddingBottom;
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(c0Var, 12, d0Var);
        WeakHashMap weakHashMap = p0.f3233a;
        h0.c(view, pVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b0());
        }
    }

    public static ArrayList e(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < materialToolbar.getChildCount(); i4++) {
            View childAt = materialToolbar.getChildAt(i4);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TypedArray f(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        a(context, attributeSet, i4, i5);
        b(context, attributeSet, iArr, i4, i5, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
    }

    public static androidx.emoji2.text.t g(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        a(context, attributeSet, i4, i5);
        b(context, attributeSet, iArr, i4, i5, iArr2);
        return new androidx.emoji2.text.t(context, context.obtainStyledAttributes(attributeSet, iArr, i4, i5));
    }

    public static PorterDuff.Mode h(int i4, PorterDuff.Mode mode) {
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
