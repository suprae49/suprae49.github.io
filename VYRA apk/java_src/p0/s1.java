package p0;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends q1 {
    public s1(y1 y1Var, WindowInsets windowInsets) {
        super(y1Var, windowInsets);
    }

    @Override // p0.k1, p0.t1
    public List<Rect> e(int i4) {
        return this.f3210c.getBoundingRects(x1.a(i4));
    }

    @Override // p0.k1, p0.t1
    public List<Rect> f(int i4) {
        return this.f3210c.getBoundingRectsIgnoringVisibility(x1.a(i4));
    }

    @Override // p0.k1, p0.t1
    public void p() {
    }
}
