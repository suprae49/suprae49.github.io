package p0;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f3240a;

    public r0(View view) {
        this.f3240a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.f3240a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.f3240a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j4) {
        View view = (View) this.f3240a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
    }

    public final void d(s0 s0Var) {
        View view = (View) this.f3240a.get();
        if (view != null) {
            if (s0Var != null) {
                view.animate().setListener(new b3.f(s0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.f3240a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
