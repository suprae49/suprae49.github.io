package w1;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Animation {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f4455h;

    public d(h hVar, int i4, int i5) {
        this.f4455h = hVar;
        this.f = i4;
        this.f4454g = i5;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        n1.d dVar = this.f4455h.E;
        int i4 = this.f;
        dVar.setAlpha((int) (((this.f4454g - i4) * f) + i4));
    }
}
