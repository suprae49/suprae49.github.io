package u2;

import android.view.View;
import androidx.emoji2.text.t;
import com.google.android.material.navigation.NavigationView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends y0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationView f4225a;

    public n(NavigationView navigationView) {
        this.f4225a = navigationView;
    }

    @Override // y0.b
    public final void b(View view) {
        NavigationView navigationView = this.f4225a;
        if (view == navigationView) {
            t tVar = navigationView.D;
            Objects.requireNonNull(tVar);
            view.post(new androidx.activity.k(16, tVar));
        }
    }

    @Override // y0.b
    public final void c(View view) {
        NavigationView navigationView = this.f4225a;
        if (view == navigationView) {
            t tVar = navigationView.D;
            t2.c cVar = (t2.c) tVar.f578b;
            if (cVar != null) {
                cVar.c((NavigationView) tVar.f580d);
            }
            if (!navigationView.f1525y || navigationView.f1524x == 0) {
                return;
            }
            navigationView.f1524x = 0;
            navigationView.g(navigationView.getWidth(), navigationView.getHeight());
        }
    }
}
