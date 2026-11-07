package d3;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import co.median.android.eeqadjy.R;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1698e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f1700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f1701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f1702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f1703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f1704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f1705m;

    public e(s sVar) {
        super(sVar);
        this.f1702j = new a(0, this);
        this.f1703k = new b(this, 0);
        this.f1698e = t2.i.K(sVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = t2.i.K(sVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f1699g = t2.i.L(sVar.getContext(), R.attr.motionEasingLinearInterpolator, b2.a.f1047a);
        this.f1700h = t2.i.L(sVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, b2.a.f1050d);
    }

    @Override // d3.t
    public final void a() {
        if (this.f1754b.f1747u != null) {
            return;
        }
        s(t());
    }

    @Override // d3.t
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // d3.t
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // d3.t
    public final View.OnFocusChangeListener e() {
        return this.f1703k;
    }

    @Override // d3.t
    public final View.OnClickListener f() {
        return this.f1702j;
    }

    @Override // d3.t
    public final View.OnFocusChangeListener g() {
        return this.f1703k;
    }

    @Override // d3.t
    public final void l(EditText editText) {
        this.f1701i = editText;
        this.f1753a.setEndIconVisible(t());
    }

    @Override // d3.t
    public final void o(boolean z4) {
        if (this.f1754b.f1747u == null) {
            return;
        }
        s(z4);
    }

    @Override // d3.t
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f1700h);
        valueAnimatorOfFloat.setDuration(this.f);
        final int i4 = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: d3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f1692b;

            {
                this.f1692b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        this.f1692b.f1756d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f1692b.f1756d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1699g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i5 = this.f1698e;
        valueAnimatorOfFloat2.setDuration(i5);
        final int i6 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: d3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f1692b;

            {
                this.f1692b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        this.f1692b.f1756d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f1692b.f1756d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1704l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f1704l.addListener(new d(this, i6));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i5);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: d3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f1692b;

            {
                this.f1692b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        this.f1692b.f1756d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f1692b.f1756d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f1705m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new d(this, i4));
    }

    @Override // d3.t
    public final void r() {
        EditText editText = this.f1701i;
        if (editText != null) {
            editText.post(new androidx.activity.k(6, this));
        }
    }

    public final void s(boolean z4) {
        boolean z5 = this.f1754b.d() == z4;
        if (z4 && !this.f1704l.isRunning()) {
            this.f1705m.cancel();
            this.f1704l.start();
            if (z5) {
                this.f1704l.end();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.f1704l.cancel();
        this.f1705m.start();
        if (z5) {
            this.f1705m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.f1701i;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.f1756d.hasFocus()) && ((this.f1701i.getText().length() > 0) || (this.f1754b.f1747u != null));
    }
}
