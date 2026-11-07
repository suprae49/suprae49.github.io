package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f688d;

    public g(View view, ViewGroup viewGroup, i iVar, o1 o1Var) {
        this.f685a = o1Var;
        this.f686b = viewGroup;
        this.f687c = view;
        this.f688d = iVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f686b.post(new f(0, this));
        if (u0.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f685a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (u0.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f685a + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
