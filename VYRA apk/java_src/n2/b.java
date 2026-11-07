package n2;

import a3.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import co.median.android.eeqadjy.R;
import e.f;
import e.g;
import i.c;
import r2.a0;
import t1.l;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f3123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f3124i;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context) {
        TypedValue typedValueP = l.p(context.getTheme(), R.attr.materialAlertDialogTheme);
        int i4 = typedValueP == null ? 0 : typedValueP.data;
        Context contextA = f3.a.a(R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, context, null, new int[0]);
        contextA = i4 != 0 ? new c(contextA, i4) : contextA;
        TypedValue typedValueP2 = l.p(context.getTheme(), R.attr.materialAlertDialogTheme);
        super(contextA, typedValueP2 == null ? 0 : typedValueP2.data);
        ContextThemeWrapper contextThemeWrapper = ((e.b) this.f1920g).f1841a;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        a0.a(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = a2.a.f24p;
        a0.b(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        int layoutDirection = contextThemeWrapper.getResources().getConfiguration().getLayoutDirection();
        this.f3124i = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int iA0 = e4.a.a0(contextThemeWrapper, l.r(contextThemeWrapper, R.attr.colorSurface, b.class.getCanonicalName()));
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes2.getColor(4, iA0);
        typedArrayObtainStyledAttributes2.recycle();
        j jVar = new j(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        jVar.n(contextThemeWrapper);
        jVar.r(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((e.b) this.f1920g).f1841a.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                jVar.setShapeAppearanceModel(jVar.f88g.f70a.a(dimension));
            }
        }
        this.f3123h = jVar;
    }

    @Override // e.f
    public final g a() {
        g gVarA = super.a();
        Window window = gVarA.getWindow();
        View decorView = window.getDecorView();
        j jVar = this.f3123h;
        if (jVar != null) {
            jVar.q(decorView.getElevation());
        }
        Rect rect = this.f3124i;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) jVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(gVarA, rect));
        return gVarA;
    }
}
