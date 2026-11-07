package p0;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class l1 extends k1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f0.c f3219r;

    public l1(y1 y1Var, WindowInsets windowInsets) {
        super(y1Var, windowInsets);
        this.f3219r = null;
    }

    @Override // p0.t1
    public y1 b() {
        return y1.h(null, this.f3210c.consumeStableInsets());
    }

    @Override // p0.t1
    public y1 c() {
        return y1.h(null, this.f3210c.consumeSystemWindowInsets());
    }

    @Override // p0.t1
    public final f0.c k() {
        if (this.f3219r == null) {
            WindowInsets windowInsets = this.f3210c;
            this.f3219r = f0.c.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3219r;
    }

    @Override // p0.t1
    public boolean r() {
        return this.f3210c.isConsumed();
    }

    @Override // p0.t1
    public void w(f0.c cVar) {
        this.f3219r = cVar;
    }
}
