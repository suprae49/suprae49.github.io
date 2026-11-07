package k1;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x f2933q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context) {
        super(context);
        this.f2933q = xVar;
    }

    @Override // k1.u
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // k1.u
    public final int e(int i4) {
        return Math.min(100, super.e(i4));
    }

    @Override // k1.u
    public final void h(View view, s0 s0Var) {
        x xVar = this.f2933q;
        int[] iArrA = xVar.a(xVar.f2940a.getLayoutManager(), view);
        int i4 = iArrA[0];
        int i5 = iArrA[1];
        int iCeil = (int) Math.ceil(((double) e(Math.max(Math.abs(i4), Math.abs(i5)))) / 0.3356d);
        if (iCeil > 0) {
            s0Var.f2889a = i4;
            s0Var.f2890b = i5;
            s0Var.f2891c = iCeil;
            s0Var.f2893e = this.f2914j;
            s0Var.f = true;
        }
    }
}
