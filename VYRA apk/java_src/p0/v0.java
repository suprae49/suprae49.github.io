package p0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f3254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y1 f3255b;

    public v0(View view, t0 t0Var) {
        y1 y1VarB;
        this.f3254a = t0Var;
        WeakHashMap weakHashMap = p0.f3233a;
        y1 y1VarA = i0.a(view);
        if (y1VarA != null) {
            int i4 = Build.VERSION.SDK_INT;
            y1VarB = (i4 >= 36 ? new i1(y1VarA) : i4 >= 35 ? new h1(y1VarA) : i4 >= 34 ? new g1(y1VarA) : i4 >= 31 ? new f1(y1VarA) : i4 >= 30 ? new e1(y1VarA) : i4 >= 29 ? new d1(y1VarA) : new b1(y1VarA)).b();
        } else {
            y1VarB = null;
        }
        this.f3255b = y1VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f3255b = y1.h(view, windowInsets);
            return w0.j(view, windowInsets);
        }
        y1 y1VarH = y1.h(view, windowInsets);
        t1 t1Var = y1VarH.f3268a;
        if (this.f3255b == null) {
            WeakHashMap weakHashMap = p0.f3233a;
            this.f3255b = i0.a(view);
        }
        if (this.f3255b == null) {
            this.f3255b = y1VarH;
            return w0.j(view, windowInsets);
        }
        t0 t0VarK = w0.k(view);
        if (t0VarK != null && Objects.equals(t0VarK.f3246a, y1VarH)) {
            return w0.j(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        y1 y1Var = this.f3255b;
        int i4 = 1;
        while (i4 <= 512) {
            f0.c cVarH = t1Var.h(i4);
            f0.c cVarH2 = y1Var.f3268a.h(i4);
            int i5 = cVarH.f2067a;
            int i6 = cVarH.f2070d;
            int i7 = cVarH.f2069c;
            int i8 = cVarH.f2068b;
            int i9 = cVarH2.f2067a;
            int i10 = cVarH2.f2070d;
            int i11 = cVarH2.f2069c;
            int i12 = cVarH2.f2068b;
            boolean z4 = i5 > i9 || i8 > i12 || i7 > i11 || i6 > i10;
            if (z4 != (i5 < i9 || i8 < i12 || i7 < i11 || i6 < i10)) {
                if (z4) {
                    iArr[0] = iArr[0] | i4;
                } else {
                    iArr2[0] = iArr2[0] | i4;
                }
            }
            i4 <<= 1;
            iArr = iArr;
        }
        int i13 = iArr[0];
        int i14 = iArr2[0];
        int i15 = i13 | i14;
        if (i15 == 0) {
            this.f3255b = y1VarH;
            return w0.j(view, windowInsets);
        }
        y1 y1Var2 = this.f3255b;
        if ((i13 & 8) != 0) {
            interpolator = w0.f3257e;
        } else if ((i14 & 8) != 0) {
            interpolator = w0.f;
        } else if ((i13 & 519) != 0) {
            interpolator = w0.f3258g;
        } else {
            interpolator = (i14 & 519) != 0 ? w0.f3259h : null;
        }
        a1 a1Var = new a1(i15, interpolator, (i15 & 8) != 0 ? 160L : 250L);
        a1Var.f3162a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(a1Var.f3162a.b());
        f0.c cVarH3 = t1Var.h(i15);
        f0.c cVarH4 = y1Var2.f3268a.h(i15);
        int iMin = Math.min(cVarH3.f2067a, cVarH4.f2067a);
        int i16 = cVarH3.f2068b;
        int i17 = cVarH4.f2068b;
        int iMin2 = Math.min(i16, i17);
        int i18 = cVarH3.f2069c;
        int i19 = cVarH4.f2069c;
        int iMin3 = Math.min(i18, i19);
        int i20 = cVarH3.f2070d;
        int i21 = cVarH4.f2070d;
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(f0.c.c(iMin, iMin2, iMin3, Math.min(i20, i21)), 11, f0.c.c(Math.max(cVarH3.f2067a, cVarH4.f2067a), Math.max(i16, i17), Math.max(i18, i19), Math.max(i20, i21)));
        w0.g(view, a1Var, y1VarH, false);
        duration.addUpdateListener(new u0(a1Var, y1VarH, y1Var2, i15, view));
        duration.addListener(new e2.b(a1Var, 2, view));
        s.a(view, new j.e(view, a1Var, pVar, duration));
        this.f3255b = y1VarH;
        return w0.j(view, windowInsets);
    }
}
