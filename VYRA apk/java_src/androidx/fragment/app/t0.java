package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f748b;

    public t0(u0 u0Var, int i4) {
        this.f748b = u0Var;
        this.f747a = i4;
    }

    @Override // androidx.fragment.app.s0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        u0 u0Var = this.f748b;
        Fragment fragment = u0Var.f769w;
        int i4 = this.f747a;
        if (fragment == null || i4 >= 0 || !fragment.getChildFragmentManager().N(-1, 0)) {
            return u0Var.O(arrayList, arrayList2, i4, 1);
        }
        return false;
    }
}
