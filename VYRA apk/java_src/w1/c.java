package w1;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Animation {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f4453g;

    public /* synthetic */ c(h hVar, int i4) {
        this.f = i4;
        this.f4453g = hVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.f) {
            case 0:
                this.f4453g.setAnimationProgress(f);
                break;
            default:
                this.f4453g.setAnimationProgress(1.0f - f);
                break;
        }
    }
}
