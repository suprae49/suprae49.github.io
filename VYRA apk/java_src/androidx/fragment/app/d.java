package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1 f668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f669e;

    public d(ViewGroup viewGroup, View view, boolean z4, o1 o1Var, i iVar) {
        this.f665a = viewGroup;
        this.f666b = view;
        this.f667c = z4;
        this.f668d = o1Var;
        this.f669e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f665a;
        View view = this.f666b;
        viewGroup.endViewTransition(view);
        boolean z4 = this.f667c;
        o1 o1Var = this.f668d;
        if (z4) {
            u.a(view, o1Var.f736a);
        }
        this.f669e.a();
        if (u0.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + o1Var + " has ended.");
        }
    }
}
