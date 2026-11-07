package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends AnimatorListenerAdapter implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f3299c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3301e;
    public boolean f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3300d = true;

    public j0(View view, int i4) {
        this.f3297a = view;
        this.f3298b = i4;
        this.f3299c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // p1.p
    public final void a(r rVar) {
        rVar.z(this);
    }

    @Override // p1.p
    public final void c() {
        g(false);
        if (this.f) {
            return;
        }
        c0.b(this.f3297a, this.f3298b);
    }

    @Override // p1.p
    public final void d() {
        g(true);
        if (this.f) {
            return;
        }
        c0.b(this.f3297a, 0);
    }

    public final void g(boolean z4) {
        ViewGroup viewGroup;
        if (!this.f3300d || this.f3301e == z4 || (viewGroup = this.f3299c) == null) {
            return;
        }
        this.f3301e = z4;
        e4.a.j0(viewGroup, z4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z4) {
        if (z4) {
            return;
        }
        if (!this.f) {
            c0.b(this.f3297a, this.f3298b);
            ViewGroup viewGroup = this.f3299c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z4) {
        if (z4) {
            c0.b(this.f3297a, 0);
            ViewGroup viewGroup = this.f3299c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            c0.b(this.f3297a, this.f3298b);
            ViewGroup viewGroup = this.f3299c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // p1.p
    public final void b(r rVar) {
    }

    @Override // p1.p
    public final void f(r rVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
