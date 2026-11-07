package d3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a3.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RectF f1710q;

    public g(g gVar) {
        super(gVar);
        this.f1710q = gVar.f1710q;
    }

    @Override // a3.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.M = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(a3.o oVar, RectF rectF) {
        super(oVar);
        this.f1710q = rectF;
    }
}
