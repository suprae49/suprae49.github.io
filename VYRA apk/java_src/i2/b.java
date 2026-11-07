package i2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import co.median.android.eeqadjy.R;
import com.google.android.material.button.MaterialButton;
import t2.i;
import v2.l;
import v2.m;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2271a;

    public /* synthetic */ b(int i4) {
        this.f2271a = i4;
    }

    @Override // t2.i
    public final void O(Object obj, float f) {
        switch (this.f2271a) {
            case 0:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f);
                break;
            default:
                m mVar = (m) obj;
                mVar.f4367u.f4387b = f / 10000.0f;
                mVar.invalidateSelf();
                int i4 = (int) f;
                l lVar = mVar.f4376g;
                if (lVar.a(true)) {
                    Context context = mVar.f;
                    if (mVar.f4371y == null) {
                        LinearInterpolator linearInterpolator = b2.a.f1047a;
                        mVar.A = i.L(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        mVar.B = i.L(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        mVar.f4371y = valueAnimator;
                        valueAnimator.setDuration(500L);
                        mVar.f4371y.setFloatValues(0.0f, 1.0f);
                        mVar.f4371y.setInterpolator(null);
                        mVar.f4371y.addUpdateListener(new d3.i(3, mVar));
                    }
                    float f4 = i4;
                    float f5 = (f4 < lVar.f4358o * 10000.0f || f4 > lVar.f4359p * 10000.0f) ? 0.0f : 1.0f;
                    float f6 = mVar.f4368v;
                    ValueAnimator valueAnimator2 = mVar.f4371y;
                    if (f5 != f6) {
                        if (valueAnimator2.isRunning()) {
                            mVar.f4371y.cancel();
                        }
                        mVar.f4368v = f5;
                        if (f5 != 1.0f) {
                            mVar.f4372z = mVar.B;
                            mVar.f4371y.reverse();
                        } else {
                            mVar.f4372z = mVar.A;
                            mVar.f4371y.start();
                        }
                    } else if (!valueAnimator2.isRunning()) {
                        mVar.f4367u.f4389d = f5;
                        mVar.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }

    @Override // t2.i
    public final float p(Object obj) {
        switch (this.f2271a) {
            case 0:
                return ((MaterialButton) obj).getDisplayedWidthIncrease();
            default:
                return ((m) obj).f4367u.f4387b * 10000.0f;
        }
    }
}
