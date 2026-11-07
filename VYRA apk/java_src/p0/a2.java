package p0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class a2 extends e4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WindowInsetsController f3163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a3.h0 f3164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Window f3165j;

    public a2(Window window, a3.h0 h0Var) {
        this.f3163h = window.getInsetsController();
        this.f3164i = h0Var;
        this.f3165j = window;
    }

    @Override // e4.a
    public final void M() {
        this.f3163h.hide(519);
    }

    @Override // e4.a
    public void b0(boolean z4) {
        Window window = this.f3165j;
        if (window != null) {
            if (!z4) {
                o0(16);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.f3163h;
        if (z4) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // e4.a
    public void c0(boolean z4) {
        Window window = this.f3165j;
        if (window != null) {
            if (!z4) {
                o0(8192);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.f3163h;
        if (z4) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // e4.a
    public void f0(int i4) {
        Window window = this.f3165j;
        if (window == null) {
            this.f3163h.setSystemBarsBehavior(i4);
            return;
        }
        window.getDecorView().setTag(356039078, Integer.valueOf(i4));
        if (i4 == 0) {
            o0(6144);
            return;
        }
        if (i4 == 1) {
            o0(4096);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2048);
        } else {
            if (i4 != 2) {
                return;
            }
            o0(2048);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 4096);
        }
    }

    @Override // e4.a
    public final void h0(int i4) {
        if ((i4 & 8) != 0) {
            ((a3.h0) this.f3164i.f84g).B();
        }
        this.f3163h.show(i4 & (-9));
    }

    public final void o0(int i4) {
        View decorView = this.f3165j.getDecorView();
        decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
    }
}
