package x2;

import android.graphics.Typeface;
import t1.l;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f4726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f4727i;

    public b(d dVar, l lVar) {
        this.f4727i = dVar;
        this.f4726h = lVar;
    }

    @Override // e0.b
    public final void h(int i4) {
        this.f4727i.n = true;
        this.f4726h.l(i4);
    }

    @Override // e0.b
    public final void i(Typeface typeface) {
        d dVar = this.f4727i;
        Typeface typefaceCreate = Typeface.create(typeface, dVar.f4735d);
        dVar.f4745p = typefaceCreate;
        dVar.n = true;
        this.f4726h.m(typefaceCreate, false);
    }
}
