package t2;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Log;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f3735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f3736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f3737i;

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f3735g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f3736h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f3737i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a() {
        if (this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        androidx.activity.b bVar = this.f;
        this.f = null;
        if (bVar == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f3723b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i4), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f3726e);
        animatorSet.start();
    }

    public final void b(androidx.activity.b bVar, int i4, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i5;
        boolean z4 = bVar.f182d == 0;
        View view = this.f3723b;
        boolean z5 = (Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i5 = z5 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i5 = 0;
        }
        float f = scaleX + i5;
        Property property = View.TRANSLATION_X;
        if (z5) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new e1.a(1));
        objectAnimatorOfFloat.setDuration(b2.a.c(this.f3724c, this.f3725d, bVar.f181c));
        objectAnimatorOfFloat.addListener(new g(this, z4, i4));
        objectAnimatorOfFloat.addListener(animatorListenerAdapter);
        objectAnimatorOfFloat.start();
    }

    public final void c(float f, boolean z4, int i4) {
        float interpolation = this.f3722a.getInterpolation(f);
        View view = this.f3723b;
        boolean z5 = (Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 3) == 3;
        boolean z6 = z4 == z5;
        int width = view.getWidth();
        int height = view.getHeight();
        float f4 = width;
        if (f4 > 0.0f) {
            float f5 = height;
            if (f5 <= 0.0f) {
                return;
            }
            float f6 = this.f3735g / f4;
            float f7 = this.f3736h / f4;
            float f8 = this.f3737i / f5;
            if (z5) {
                f4 = 0.0f;
            }
            view.setPivotX(f4);
            if (!z6) {
                f7 = -f6;
            }
            float fA = b2.a.a(0.0f, f7, interpolation);
            float f9 = fA + 1.0f;
            float fA2 = 1.0f - b2.a.a(0.0f, f8, interpolation);
            if (Float.isNaN(f9) || Float.isNaN(fA2)) {
                return;
            }
            view.setScaleX(f9);
            view.setScaleY(fA2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    childAt.setPivotX(z5 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f10 = z6 ? 1.0f - fA : 1.0f;
                    float f11 = fA2 != 0.0f ? (f9 / fA2) * f10 : 1.0f;
                    if (!Float.isNaN(f10) && !Float.isNaN(f11)) {
                        childAt.setScaleX(f10);
                        childAt.setScaleY(f11);
                    }
                }
            }
        }
    }
}
