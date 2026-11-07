package d3;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1707b;

    public /* synthetic */ e0(int i4, Object obj) {
        this.f1706a = i4;
        this.f1707b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1706a) {
            case 0:
                ((TextInputLayout) this.f1707b).B0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3.j jVar = ((BottomSheetBehavior) this.f1707b).f1320o;
                if (jVar != null) {
                    a3.h hVar = jVar.f88g;
                    if (hVar.f77i != fFloatValue) {
                        hVar.f77i = fFloatValue;
                        jVar.f92k = true;
                        jVar.f93l = true;
                        jVar.invalidateSelf();
                    }
                }
                break;
            case 2:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                k1.l lVar = (k1.l) this.f1707b;
                lVar.f2815c.setAlpha(iFloatValue);
                lVar.f2816d.setAlpha(iFloatValue);
                lVar.f2829s.invalidate();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.f1707b;
                textView.setScaleX(fFloatValue2);
                textView.setScaleY(fFloatValue2);
                break;
        }
    }
}
