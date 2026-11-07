package c2;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends z.b {
    public h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1141g = 0;

    public g() {
    }

    @Override // z.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        x(coordinatorLayout, view, i4);
        if (this.f == null) {
            h hVar = new h();
            hVar.f1145d = view;
            this.f = hVar;
        }
        h hVar2 = this.f;
        View view2 = (View) hVar2.f1145d;
        hVar2.f1142a = view2.getTop();
        hVar2.f1143b = view2.getLeft();
        this.f.b();
        int i5 = this.f1141g;
        if (i5 == 0) {
            return true;
        }
        h hVar3 = this.f;
        if (hVar3.f1144c != i5) {
            hVar3.f1144c = i5;
            hVar3.b();
        }
        this.f1141g = 0;
        return true;
    }

    public final int w() {
        h hVar = this.f;
        if (hVar != null) {
            return hVar.f1144c;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i4) {
        coordinatorLayout.q(view, i4);
    }

    public g(int i4) {
    }
}
