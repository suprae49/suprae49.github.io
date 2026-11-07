package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.u0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends r3.h implements q3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u0 f229h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(u0 u0Var, int i4) {
        super(0);
        this.f228g = i4;
        this.f229h = u0Var;
    }

    @Override // q3.a
    public final Object a() {
        switch (this.f228g) {
            case 0:
                ((androidx.fragment.app.e0) this.f229h).reportFullyDrawn();
                return g3.g.f2156a;
            case 1:
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) this.f229h;
                return new a0(e0Var.f237k, new o(e0Var, 0));
            case 2:
                androidx.fragment.app.e0 e0Var2 = (androidx.fragment.app.e0) this.f229h;
                j0 j0Var = new j0(new d(e0Var2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (r3.g.a(Looper.myLooper(), Looper.getMainLooper())) {
                        e0Var2.f.a(new h(j0Var, e0Var2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new p(e0Var2, 0, j0Var));
                    }
                }
                return j0Var;
            default:
                return androidx.lifecycle.k0.e(this.f229h);
        }
    }
}
