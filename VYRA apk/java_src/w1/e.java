package w1;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import co.median.android.MySwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Animation {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MySwipeRefreshLayout f4456g;

    public /* synthetic */ e(MySwipeRefreshLayout mySwipeRefreshLayout, int i4) {
        this.f = i4;
        this.f4456g = mySwipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.f) {
            case 0:
                MySwipeRefreshLayout mySwipeRefreshLayout = this.f4456g;
                int iAbs = mySwipeRefreshLayout.C - Math.abs(mySwipeRefreshLayout.B);
                int i4 = mySwipeRefreshLayout.A;
                mySwipeRefreshLayout.setTargetOffsetTopAndBottom((i4 + ((int) ((iAbs - i4) * f))) - mySwipeRefreshLayout.f4474y.getTop());
                n1.d dVar = mySwipeRefreshLayout.E;
                float f4 = 1.0f - f;
                n1.c cVar = dVar.f;
                if (f4 != cVar.f3107p) {
                    cVar.f3107p = f4;
                }
                dVar.invalidateSelf();
                break;
            default:
                this.f4456g.e(f);
                break;
        }
    }
}
