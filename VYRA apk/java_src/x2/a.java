package x2;

import android.graphics.Typeface;
import t1.l;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Typeface f4723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r0.b f4724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4725i;

    public a(r0.b bVar, Typeface typeface) {
        this.f4723g = typeface;
        this.f4724h = bVar;
    }

    @Override // t1.l
    public final void l(int i4) {
        if (this.f4725i) {
            return;
        }
        r2.b bVar = (r2.b) this.f4724h.f;
        if (bVar.l(this.f4723g)) {
            bVar.j(false);
        }
    }

    @Override // t1.l
    public final void m(Typeface typeface, boolean z4) {
        if (this.f4725i) {
            return;
        }
        r2.b bVar = (r2.b) this.f4724h.f;
        if (bVar.l(typeface)) {
            bVar.j(false);
        }
    }
}
