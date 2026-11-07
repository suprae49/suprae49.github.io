package r2;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends p0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3553e;
    public final /* synthetic */ i f;

    public h(i iVar, int i4, boolean z4) {
        this.f = iVar;
        this.f3552d = i4;
        this.f3553e = z4;
    }

    @Override // p0.b
    public final void d(View view, q0.e eVar) {
        this.f3167a.onInitializeAccessibilityNodeInfo(view, eVar.f3378a);
        q qVar = this.f.f3556g;
        int i4 = this.f3552d;
        int i5 = i4;
        for (int i6 = 0; i6 < i4; i6++) {
            if (qVar.f3564j.c(i6) == 2 || qVar.f3564j.c(i6) == 3) {
                i5--;
            }
        }
        eVar.h(c3.f.a(i5, 1, 1, 1, this.f3553e, view.isSelected()));
    }
}
