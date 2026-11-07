package r2;

import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import p0.p0;
import p0.t1;
import p0.y1;
import u1.q1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements p0.q, j.k {
    public final /* synthetic */ NavigationView f;

    public /* synthetic */ t(NavigationView navigationView) {
        this.f = navigationView;
    }

    @Override // p0.q
    public y1 d(View view, y1 y1Var) {
        NavigationView navigationView = this.f;
        if (navigationView.f3581g == null) {
            navigationView.f3581g = new Rect();
        }
        Rect rect = navigationView.f3581g;
        int iB = y1Var.b();
        t1 t1Var = y1Var.f3268a;
        rect.set(iB, y1Var.d(), y1Var.c(), y1Var.a());
        q qVar = navigationView.n;
        qVar.getClass();
        int iD = y1Var.d();
        if (qVar.E != iD) {
            qVar.E = iD;
            int i4 = (qVar.f3561g.getChildCount() <= 0 && qVar.C) ? qVar.E : 0;
            NavigationMenuView navigationMenuView = qVar.f;
            navigationMenuView.setPadding(0, i4, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = qVar.f;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, y1Var.a());
        p0.b(qVar.f3561g, y1Var);
        navigationView.setWillNotDraw(t1Var.m().equals(f0.c.f2066e) || navigationView.f == null);
        navigationView.postInvalidateOnAnimation();
        return t1Var.c();
    }

    @Override // j.k
    public boolean j(j.m mVar, MenuItem menuItem) {
        u2.p pVar = this.f.f1515o;
        if (pVar != null) {
            q1 q1Var = (q1) ((d3.a0) pVar).f1680g;
            menuItem.getClass();
            q1Var.f4059b.d(false);
            String str = (String) q1Var.f4063g.get(menuItem);
            if (str != null) {
                q1Var.f4058a.C0.b(str, true, false);
                return true;
            }
        }
        return false;
    }

    @Override // j.k
    public void i(j.m mVar) {
    }
}
