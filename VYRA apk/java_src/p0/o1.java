package p0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class o1 extends n1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y1 f3232v = y1.h(null, WindowInsets.CONSUMED);

    public o1(y1 y1Var, WindowInsets windowInsets) {
        super(y1Var, windowInsets);
    }

    @Override // p0.k1, p0.t1
    public f0.c h(int i4) {
        return f0.c.d(this.f3210c.getInsets(v1.a(i4)));
    }

    @Override // p0.k1, p0.t1
    public f0.c i(int i4) {
        return f0.c.d(this.f3210c.getInsetsIgnoringVisibility(v1.a(i4)));
    }

    @Override // p0.k1, p0.t1
    public final void d(View view) {
    }
}
