package u1;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.median.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f4075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3.d f4077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a3.h0 f4079e;
    public androidx.activity.m0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.activity.m0 f4080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f4081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f4082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CoordinatorLayout f4083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f4084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f4085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f4086m;

    public r1(MainActivity mainActivity) {
        this.f4075a = mainActivity;
        this.f4076b = Build.VERSION.SDK_INT >= 35;
        this.f4077c = new g3.d(new m0.h(1, this));
        this.f4078d = x1.a.u(mainActivity).f4678l1;
        this.f4085l = x1.a.u(mainActivity).v0;
        this.f4086m = x1.a.u(mainActivity).f4704w0;
    }

    public final androidx.activity.m0 a(int i4, String str) {
        return b(str) ? new androidx.activity.m0(i4, i4, 1, androidx.activity.l0.f218i) : new androidx.activity.m0(i4, i4, 2, androidx.activity.l0.f217h);
    }

    public final boolean b(String str) {
        int i4;
        if (!TextUtils.isEmpty(str)) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3005871) {
                if (iHashCode != 3075958) {
                    if (iHashCode == 102970646) {
                        str.equals("light");
                        return true;
                    }
                } else if (str.equals("dark")) {
                    return false;
                }
            } else if (str.equals("auto") && (i4 = this.f4075a.getResources().getConfiguration().uiMode & 48) != 16) {
                if (i4 == 32) {
                    return false;
                }
                x1.f.a().d("SystemBarManager", "isLightMode: Current mode is undefined", null);
                return true;
            }
        }
        return true;
    }

    public final void c(int i4) {
        if (this.f4076b) {
            View view = this.f4081h;
            if (view != null) {
                view.setBackgroundColor(i4);
                return;
            } else {
                r3.g.c("statusBarBackgroundView");
                throw null;
            }
        }
        String str = this.f4085l;
        str.getClass();
        androidx.activity.m0 m0VarA = a(i4, str);
        this.f = m0VarA;
        androidx.activity.m0 m0Var = this.f4080g;
        if (m0Var != null) {
            androidx.activity.t.a(this.f4075a, m0VarA, m0Var);
        } else {
            r3.g.c("systemNavBarStyle");
            throw null;
        }
    }

    public final void d(int i4) {
        if (this.f4076b) {
            View view = this.f4082i;
            if (view != null) {
                view.setBackgroundColor(i4);
                return;
            } else {
                r3.g.c("systemNavBarBackgroundView");
                throw null;
            }
        }
        String str = this.f4086m;
        str.getClass();
        androidx.activity.m0 m0VarA = a(i4, str);
        this.f4080g = m0VarA;
        androidx.activity.m0 m0Var = this.f;
        if (m0Var != null) {
            androidx.activity.t.a(this.f4075a, m0Var, m0VarA);
        } else {
            r3.g.c("statusBarStyle");
            throw null;
        }
    }
}
