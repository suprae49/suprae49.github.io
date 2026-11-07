package k1;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2804a;

    public j(l lVar) {
        this.f2804a = lVar;
    }

    @Override // k1.o0
    public final void b(RecyclerView recyclerView, int i4, int i5) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        l lVar = this.f2804a;
        int i6 = lVar.f2813a;
        int iComputeVerticalScrollRange = lVar.f2829s.computeVerticalScrollRange();
        int i7 = lVar.f2828r;
        lVar.f2830t = iComputeVerticalScrollRange - i7 > 0 && i7 >= i6;
        int iComputeHorizontalScrollRange = lVar.f2829s.computeHorizontalScrollRange();
        int i8 = lVar.f2827q;
        boolean z4 = iComputeHorizontalScrollRange - i8 > 0 && i8 >= i6;
        lVar.f2831u = z4;
        boolean z5 = lVar.f2830t;
        if (!z5 && !z4) {
            if (lVar.f2832v != 0) {
                lVar.f(0);
                return;
            }
            return;
        }
        if (z5) {
            float f = i7;
            lVar.f2823l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            lVar.f2822k = Math.min(i7, (i7 * i7) / iComputeVerticalScrollRange);
        }
        if (lVar.f2831u) {
            float f4 = iComputeHorizontalScrollOffset;
            float f5 = i8;
            lVar.f2825o = (int) ((((f5 / 2.0f) + f4) * f5) / iComputeHorizontalScrollRange);
            lVar.n = Math.min(i8, (i8 * i8) / iComputeHorizontalScrollRange);
        }
        int i9 = lVar.f2832v;
        if (i9 == 0 || i9 == 1) {
            lVar.f(1);
        }
    }
}
