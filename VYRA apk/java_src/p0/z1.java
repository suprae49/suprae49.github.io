package p0;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends e4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Window f3274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a3.h0 f3275i;

    public z1(Window window, a3.h0 h0Var) {
        this.f3274h = window;
        this.f3275i = h0Var;
    }

    @Override // e4.a
    public final void M() {
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((519 & i4) != 0) {
                if (i4 == 1) {
                    o0(4);
                } else if (i4 == 2) {
                    o0(2);
                } else if (i4 == 8) {
                    ((a3.h0) this.f3275i.f84g).z();
                }
            }
        }
    }

    @Override // e4.a
    public final void b0(boolean z4) {
        if (!z4) {
            p0(16);
            return;
        }
        Window window = this.f3274h;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        o0(16);
    }

    @Override // e4.a
    public final void c0(boolean z4) {
        if (!z4) {
            p0(8192);
            return;
        }
        Window window = this.f3274h;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        o0(8192);
    }

    @Override // e4.a
    public final void f0(int i4) {
        this.f3274h.getDecorView().setTag(356039078, Integer.valueOf(i4));
        if (i4 == 0) {
            p0(6144);
            return;
        }
        if (i4 == 1) {
            p0(4096);
            o0(2048);
        } else {
            if (i4 != 2) {
                return;
            }
            p0(2048);
            o0(4096);
        }
    }

    @Override // e4.a
    public final void h0(int i4) {
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                if (i5 == 1) {
                    p0(4);
                    this.f3274h.clearFlags(1024);
                } else if (i5 == 2) {
                    p0(2);
                } else if (i5 == 8) {
                    ((a3.h0) this.f3275i.f84g).B();
                }
            }
        }
    }

    public final void o0(int i4) {
        View decorView = this.f3274h.getDecorView();
        decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
    }

    public final void p0(int i4) {
        View decorView = this.f3274h.getDecorView();
        decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
    }
}
