package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends AnimatorListenerAdapter implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f3307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f3308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f3309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3310d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f3311e;

    public k0(g gVar, ViewGroup viewGroup, View view, View view2) {
        this.f3311e = gVar;
        this.f3307a = viewGroup;
        this.f3308b = view;
        this.f3309c = view2;
    }

    @Override // p1.p
    public final void a(r rVar) {
        rVar.z(this);
    }

    @Override // p1.p
    public final void b(r rVar) {
        if (this.f3310d) {
            g();
        }
    }

    public final void g() {
        this.f3309c.setTag(R.id.save_overlay_view, null);
        this.f3307a.getOverlay().remove(this.f3308b);
        this.f3310d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z4) {
        if (z4) {
            return;
        }
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3307a.getOverlay().remove(this.f3308b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3308b;
        if (view.getParent() == null) {
            this.f3307a.getOverlay().add(view);
        } else {
            this.f3311e.d();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z4) {
        if (z4) {
            View view = this.f3309c;
            View view2 = this.f3308b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3307a.getOverlay().add(view2);
            this.f3310d = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // p1.p
    public final void f(r rVar) {
    }

    @Override // p1.p
    public final void c() {
    }

    @Override // p1.p
    public final void d() {
    }
}
