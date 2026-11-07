package u2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends y0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f4226a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavigationView f4227b;

    public o(NavigationView navigationView) {
        this.f4227b = navigationView;
    }

    @Override // y0.d, y0.b
    public final void a(View view, float f) {
        if (view != this.f4227b) {
            return;
        }
        if (view.getParent() instanceof y0.f) {
            ((y0.f) view.getParent()).getClass();
            if (y0.f.l(view)) {
                return;
            }
        }
        d();
    }

    @Override // y0.b
    public final void b(View view) {
        if (view != this.f4227b) {
            return;
        }
        d();
        if (!view.isAttachedToWindow() || view.isInTouchMode()) {
            return;
        }
        view.requestFocus();
    }

    @Override // y0.b
    public final void c(View view) {
        WeakReference weakReference;
        if (view == this.f4227b && (weakReference = this.f4226a) != null) {
            View view2 = (View) weakReference.get();
            if (view2 == null || !view2.isAttachedToWindow() || view2.isInTouchMode()) {
                this.f4226a = null;
            } else {
                view2.requestFocus();
                this.f4226a = null;
            }
        }
    }

    public final void d() {
        Activity activity;
        if (this.f4226a == null) {
            NavigationView navigationView = this.f4227b;
            View currentFocus = null;
            if (!navigationView.hasFocus()) {
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    } else {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    currentFocus = activity.getCurrentFocus();
                }
            }
            this.f4226a = new WeakReference(currentFocus);
        }
    }
}
