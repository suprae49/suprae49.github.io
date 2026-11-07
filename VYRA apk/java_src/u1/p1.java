package u1;

import android.util.Log;
import android.view.View;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import co.median.android.widget.GoNativeDrawerLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements y0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e.s f4051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoNativeDrawerLayout f4052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.b f4053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4055e;
    public boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q1 f4056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x1.a f4057h;

    public p1(q1 q1Var, x1.a aVar, MainActivity mainActivity, GoNativeDrawerLayout goNativeDrawerLayout) {
        this.f4056g = q1Var;
        this.f4057h = aVar;
        e.d0 d0Var = (e.d0) mainActivity.u();
        d0Var.getClass();
        e.s sVar = new e.s(d0Var, 2);
        this.f4051a = sVar;
        this.f4052b = goNativeDrawerLayout;
        this.f4054d = R.string.drawer_open;
        this.f4055e = R.string.drawer_close;
        this.f4053c = new g.b(sVar.f1989g.z());
        sVar.b();
    }

    @Override // y0.b
    public final void a(View view, float f) {
        d(Math.min(1.0f, Math.max(0.0f, f)));
    }

    @Override // y0.b
    public final void b(View view) {
        view.getClass();
        this.f4056g.f4059b.setDisableTouch(false);
    }

    @Override // y0.b
    public final void c(View view) {
        view.getClass();
        q1 q1Var = this.f4056g;
        GoNativeDrawerLayout goNativeDrawerLayout = q1Var.f4059b;
        boolean z4 = false;
        if (this.f4057h.C) {
            x1.i iVar = q1Var.f4058a.G;
            if (iVar == null ? false : iVar.canGoBack()) {
                z4 = true;
            }
        }
        goNativeDrawerLayout.setDisableTouch(z4);
    }

    public final void d(float f) {
        g.b bVar = this.f4053c;
        if (f == 1.0f) {
            if (!bVar.f2103i) {
                bVar.f2103i = true;
                bVar.invalidateSelf();
            }
        } else if (f == 0.0f && bVar.f2103i) {
            bVar.f2103i = false;
            bVar.invalidateSelf();
        }
        if (bVar.f2104j != f) {
            bVar.f2104j = f;
            bVar.invalidateSelf();
        }
    }

    public final void e() {
        GoNativeDrawerLayout goNativeDrawerLayout = this.f4052b;
        View viewE = goNativeDrawerLayout.e(8388611);
        if (viewE != null ? y0.f.l(viewE) : false) {
            d(1.0f);
        } else {
            d(0.0f);
        }
        View viewE2 = goNativeDrawerLayout.e(8388611);
        int i4 = viewE2 != null ? y0.f.l(viewE2) : false ? this.f4055e : this.f4054d;
        boolean z4 = this.f;
        e.s sVar = this.f4051a;
        if (!z4) {
            e.d0 d0Var = sVar.f1989g;
            d0Var.C();
            h0 h0Var = d0Var.f1889t;
            if (!((h0Var == null || (h0Var.v() & 4) == 0) ? false : true)) {
                Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
                this.f = true;
            }
        }
        e.d0 d0Var2 = sVar.f1989g;
        d0Var2.C();
        h0 h0Var2 = d0Var2.f1889t;
        if (h0Var2 != null) {
            h0Var2.f0(this.f4053c);
            h0Var2.e0(i4);
        }
    }
}
