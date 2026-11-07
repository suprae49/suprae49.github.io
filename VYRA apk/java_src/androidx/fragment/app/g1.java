package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1 f693e;

    public g1(i1 i1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f693e = i1Var;
        this.f689a = obj;
        this.f690b = arrayList;
        this.f691c = obj2;
        this.f692d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        i1 i1Var = this.f693e;
        Object obj = this.f689a;
        if (obj != null) {
            i1Var.t(obj, this.f690b, null);
        }
        Object obj2 = this.f691c;
        if (obj2 != null) {
            i1Var.t(obj2, this.f692d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
