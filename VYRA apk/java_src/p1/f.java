package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3290b = false;

    public f(View view) {
        this.f3289a = view;
    }

    @Override // p1.p
    public final void c() {
        View view = this.f3289a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? c0.f3281a.D(view) : 0.0f));
    }

    @Override // p1.p
    public final void d() {
        this.f3289a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        c0.f3281a.m0(this.f3289a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z4) {
        boolean z5 = this.f3290b;
        View view = this.f3289a;
        if (z5) {
            view.setLayerType(0, null);
        }
        if (z4) {
            return;
        }
        h0 h0Var = c0.f3281a;
        h0Var.m0(view, 1.0f);
        h0Var.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3289a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3290b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // p1.p
    public final void a(r rVar) {
    }

    @Override // p1.p
    public final void b(r rVar) {
    }

    @Override // p1.p
    public final void e(r rVar) {
    }

    @Override // p1.p
    public final void f(r rVar) {
    }
}
