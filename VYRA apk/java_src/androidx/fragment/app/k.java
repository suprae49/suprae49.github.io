package androidx.fragment.app;

import android.transition.Transition;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f712e;

    public k(o1 o1Var, k0.e eVar, boolean z4, boolean z5) {
        super(o1Var, eVar);
        int i4 = o1Var.f736a;
        Fragment fragment = o1Var.f738c;
        if (i4 == 2) {
            this.f710c = z4 ? fragment.getReenterTransition() : fragment.getEnterTransition();
            this.f711d = z4 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        } else {
            this.f710c = z4 ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.f711d = true;
        }
        if (!z5) {
            this.f712e = null;
        } else if (z4) {
            this.f712e = fragment.getSharedElementReturnTransition();
        } else {
            this.f712e = fragment.getSharedElementEnterTransition();
        }
    }

    public final k1 c(Object obj) {
        if (obj == null) {
            return null;
        }
        i1 i1Var = d1.f671a;
        if (obj instanceof Transition) {
            return i1Var;
        }
        k1 k1Var = d1.f672b;
        if (k1Var != null && k1Var.e(obj)) {
            return k1Var;
        }
        StringBuilder sb = new StringBuilder("Transition ");
        sb.append(obj);
        Fragment fragment = this.f704a.f738c;
        sb.append(" for fragment ");
        sb.append(fragment);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }
}
