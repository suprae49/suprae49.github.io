package c2;

import android.app.Activity;
import android.graphics.Point;
import android.os.Handler;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashSet;
import u1.h2;
import u1.l1;
import u1.o0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f1129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f1130i;

    public /* synthetic */ d(Object obj, KeyEvent.Callback callback, Object obj2, int i4) {
        this.f = i4;
        this.f1130i = obj;
        this.f1128g = callback;
        this.f1129h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        OverScroller overScroller;
        switch (this.f) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f1128g;
                e eVar = (e) this.f1130i;
                View view = (View) this.f1129h;
                if (view != null && (overScroller = eVar.f1132i) != null) {
                    if (!overScroller.computeScrollOffset()) {
                        AppBarLayout appBarLayout = (AppBarLayout) view;
                        ((AppBarLayout.BaseBehavior) eVar).G(coordinatorLayout, appBarLayout);
                        if (appBarLayout.f1226q) {
                            appBarLayout.f(appBarLayout.g(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                        }
                    } else {
                        eVar.A(coordinatorLayout, view, eVar.f1132i.getCurrY());
                        view.postOnAnimation(this);
                    }
                    break;
                }
                break;
            case 1:
                try {
                    objCall = ((l0.e) this.f1128g).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f1130i).post(new b0.b((l0.f) this.f1129h, 6, objCall));
                break;
            default:
                Activity activity = (Activity) this.f1128g;
                o0 o0Var = new o0(activity);
                h2 h2Var = (h2) this.f1130i;
                h2Var.f3952h = o0Var;
                HashSet hashSet = h2Var.f3951g;
                String str = (String) this.f1129h;
                hashSet.remove(str);
                co.median.android.a.a(o0Var, activity);
                WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    o0Var.layout(0, 0, point.x, point.y);
                }
                new l1(activity, h2Var.f3950e, o0Var);
                h2Var.f3952h = o0Var;
                h2Var.f3951g.remove(str);
                h2Var.f3952h.loadUrl(str);
                break;
        }
    }

    public /* synthetic */ d() {
        this.f = 1;
    }
}
