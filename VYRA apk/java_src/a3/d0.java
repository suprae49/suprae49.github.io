package a3;

import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends a0 {
    public d0(NavigationView navigationView) {
        d(navigationView);
    }

    private void d(View view) {
        view.setOutlineProvider(new b0(1, this));
    }

    @Override // a3.a0
    public final void a(NavigationView navigationView) {
        navigationView.setClipToOutline(!this.f36a);
        if (this.f36a) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // a3.a0
    public final boolean b() {
        return this.f36a;
    }
}
