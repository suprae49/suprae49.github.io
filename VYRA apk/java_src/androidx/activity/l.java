package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long f = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.e0 f216i;

    public l(androidx.fragment.app.e0 e0Var) {
        this.f216i = e0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f214g = runnable;
        View decorView = this.f216i.getWindow().getDecorView();
        decorView.getClass();
        if (!this.f215h) {
            decorView.postOnAnimation(new k(0, this));
        } else if (r3.g.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z4;
        Runnable runnable = this.f214g;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f) {
                this.f215h = false;
                this.f216i.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f214g = null;
        a0 a0Var = (a0) this.f216i.f238l.a();
        synchronized (a0Var.f176a) {
            z4 = a0Var.f177b;
        }
        if (z4) {
            this.f215h = false;
            this.f216i.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f216i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
