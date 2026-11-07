package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
import k.f2;
import k.n0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2325g;

    public /* synthetic */ d(int i4, Object obj) {
        this.f = i4;
        this.f2325g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        Rect rect;
        switch (this.f) {
            case 0:
                g gVar = (g) this.f2325g;
                ArrayList arrayList = gVar.n;
                if (gVar.b() && arrayList.size() > 0) {
                    int i4 = 0;
                    if (!((f) arrayList.get(0)).f2350a.D) {
                        View view = gVar.f2366u;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                ((f) obj).f2350a.c();
                            }
                        } else {
                            gVar.dismiss();
                        }
                    }
                    break;
                }
                break;
            case 1:
                d0 d0Var = (d0) this.f2325g;
                f2 f2Var = d0Var.n;
                if (d0Var.b() && !f2Var.D) {
                    View view2 = d0Var.f2337s;
                    if (view2 != null && view2.isShown()) {
                        f2Var.c();
                    } else {
                        d0Var.dismiss();
                    }
                    break;
                }
                break;
            case 2:
                androidx.appcompat.widget.c cVar = (androidx.appcompat.widget.c) this.f2325g;
                if (!cVar.getInternalPopup().b()) {
                    cVar.f429k.m(cVar.getTextDirection(), cVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = cVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 3:
                n0 n0Var = (n0) this.f2325g;
                androidx.appcompat.widget.c cVar2 = n0Var.L;
                if (cVar2.isAttachedToWindow() && cVar2.getGlobalVisibleRect(n0Var.J)) {
                    n0Var.s();
                    n0Var.c();
                } else {
                    n0Var.dismiss();
                }
                break;
            default:
                NavigationView navigationView = (NavigationView) this.f2325g;
                int[] iArr = navigationView.f1517q;
                navigationView.getLocationOnScreen(iArr);
                boolean z4 = true;
                boolean z5 = iArr[1] == 0;
                r2.q qVar = navigationView.n;
                if (qVar.C != z5) {
                    qVar.C = z5;
                    int i5 = (qVar.f3561g.getChildCount() <= 0 && qVar.C) ? qVar.E : 0;
                    NavigationMenuView navigationMenuView = qVar.f;
                    navigationMenuView.setPadding(0, i5, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z5 && navigationView.f1520t);
                boolean z6 = navigationView.getLayoutDirection() == 1;
                int i6 = iArr[0];
                navigationView.setDrawLeftInsetForeground((i6 == 0 || navigationView.getWidth() + i6 == 0) && (!z6 ? !navigationView.f1522v : !navigationView.f1523w));
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30) {
                        rect = windowManager.getCurrentWindowMetrics().getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    navigationView.setDrawBottomInsetForeground((rect.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(i7 < 35 ? activity.getWindow().getNavigationBarColor() : 0) != 0) && navigationView.f1521u);
                    if ((rect.width() != iArr[0] && rect.width() - navigationView.getWidth() != iArr[0]) || (!z6 ? !navigationView.f1523w : !navigationView.f1522v)) {
                        z4 = false;
                    }
                    navigationView.setDrawRightInsetForeground(z4);
                }
                break;
        }
    }
}
