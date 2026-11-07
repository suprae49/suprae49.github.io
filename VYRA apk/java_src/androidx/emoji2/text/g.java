package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import k1.l0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f550c;

    public g(l0 l0Var) {
        this.f548a = Integer.MIN_VALUE;
        this.f550c = new Rect();
        this.f549b = l0Var;
    }

    public static g a(l0 l0Var, int i4) {
        if (i4 == 0) {
            return new k1.v(l0Var, 0);
        }
        if (i4 == 1) {
            return new k1.v(l0Var, 1);
        }
        androidx.fragment.app.q.q("invalid orientation");
        return null;
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i4);

    public g(j jVar) {
        this.f548a = 0;
        this.f550c = new d();
        this.f549b = jVar;
    }
}
