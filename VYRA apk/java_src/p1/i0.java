package p1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends h0 {
    @Override // u1.h0
    public final float D(View view) {
        return view.getTransitionAlpha();
    }

    @Override // u1.h0
    public final void m0(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p1.h0
    public final void u0(View view, int i4, int i5, int i6, int i7) {
        view.setLeftTopRightBottom(i4, i5, i6, i7);
    }

    @Override // p1.h0
    public final void v0(View view, int i4) {
        view.setTransitionVisibility(i4);
    }

    @Override // p1.h0
    public final void w0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p1.h0
    public final void x0(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
