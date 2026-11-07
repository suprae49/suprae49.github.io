package w1;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f4477b;

    public /* synthetic */ i(j jVar, int i4) {
        this.f4476a = i4;
        this.f4477b = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4476a) {
            case 0:
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                int iIntValue = ((Integer) animatedValue).intValue();
                j jVar = this.f4477b;
                jVar.f4478g.setTextColor(iIntValue);
                jVar.f.setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
                break;
            case 1:
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                int iIntValue2 = ((Integer) animatedValue2).intValue();
                TextView textView = this.f4477b.f4478g;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = iIntValue2;
                textView.setLayoutParams(layoutParams);
                break;
            case 2:
                valueAnimator.getClass();
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                animatedValue3.getClass();
                int iIntValue3 = ((Integer) animatedValue3).intValue();
                TextView textView2 = this.f4477b.f4478g;
                ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                layoutParams2.width = iIntValue3;
                textView2.setLayoutParams(layoutParams2);
                break;
            default:
                valueAnimator.getClass();
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                animatedValue4.getClass();
                int iIntValue4 = ((Integer) animatedValue4).intValue();
                j jVar2 = this.f4477b;
                jVar2.f4478g.setTextColor(iIntValue4);
                jVar2.f.setColorFilter(iIntValue4, PorterDuff.Mode.SRC_IN);
                break;
        }
    }
}
