package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends g0 {
    public final /* synthetic */ Fragment f;

    public v(Fragment fragment) {
        this.f = fragment;
    }

    @Override // androidx.fragment.app.g0
    public final View n(int i4) {
        Fragment fragment = this.f;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i4);
        }
        q.j(u.l("Fragment ", fragment, " does not have a view"));
        return null;
    }

    @Override // androidx.fragment.app.g0
    public final boolean o() {
        return this.f.mView != null;
    }
}
