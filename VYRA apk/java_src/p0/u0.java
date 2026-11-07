package p0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f3249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f3250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y1 f3251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f3253e;

    public u0(a1 a1Var, y1 y1Var, y1 y1Var2, int i4, View view) {
        this.f3249a = a1Var;
        this.f3250b = y1Var;
        this.f3251c = y1Var2;
        this.f3252d = i4;
        this.f3253e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        j1 d1Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        a1 a1Var = this.f3249a;
        z0 z0Var = a1Var.f3162a;
        z0Var.e(animatedFraction);
        float fC = z0Var.c();
        PathInterpolator pathInterpolator = w0.f3257e;
        int i4 = Build.VERSION.SDK_INT;
        y1 y1Var = this.f3250b;
        if (i4 >= 36) {
            d1Var = new i1(y1Var);
        } else if (i4 >= 35) {
            d1Var = new h1(y1Var);
        } else if (i4 >= 34) {
            d1Var = new g1(y1Var);
        } else if (i4 >= 31) {
            d1Var = new f1(y1Var);
        } else if (i4 >= 30) {
            d1Var = new e1(y1Var);
        } else {
            d1Var = i4 >= 29 ? new d1(y1Var) : new b1(y1Var);
        }
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            int i6 = this.f3252d & i5;
            t1 t1Var = y1Var.f3268a;
            if (i6 == 0) {
                d1Var.d(i5, t1Var.h(i5));
            } else {
                f0.c cVarH = t1Var.h(i5);
                f0.c cVarH2 = this.f3251c.f3268a.h(i5);
                float f = 1.0f - fC;
                d1Var.d(i5, y1.e(cVarH, (int) (((double) ((cVarH.f2067a - cVarH2.f2067a) * f)) + 0.5d), (int) (((double) ((cVarH.f2068b - cVarH2.f2068b) * f)) + 0.5d), (int) (((double) ((cVarH.f2069c - cVarH2.f2069c) * f)) + 0.5d), (int) (((double) ((cVarH.f2070d - cVarH2.f2070d) * f)) + 0.5d)));
            }
        }
        w0.h(this.f3253e, d1Var.b(), Collections.singletonList(a1Var));
    }
}
