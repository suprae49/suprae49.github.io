package e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends u1.h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1990e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t(int i4, Object obj) {
        this.f1990e = i4;
        this.f = obj;
    }

    @Override // p0.s0
    public final void a() {
        int i4 = this.f1990e;
        Object obj = this.f;
        switch (i4) {
            case 0:
                d0 d0Var = ((r) obj).f1988g;
                d0Var.A.setAlpha(1.0f);
                d0Var.D.d(null);
                d0Var.D = null;
                break;
            case 1:
                d0 d0Var2 = (d0) obj;
                d0Var2.A.setAlpha(1.0f);
                d0Var2.D.d(null);
                d0Var2.D = null;
                break;
            default:
                d0 d0Var3 = (d0) ((androidx.emoji2.text.p) obj).f569h;
                d0Var3.A.setVisibility(8);
                PopupWindow popupWindow = d0Var3.B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (d0Var3.A.getParent() instanceof View) {
                    View view = (View) d0Var3.A.getParent();
                    WeakHashMap weakHashMap = p0.p0.f3233a;
                    view.requestApplyInsets();
                }
                d0Var3.A.e();
                d0Var3.D.d(null);
                d0Var3.D = null;
                ViewGroup viewGroup = d0Var3.F;
                WeakHashMap weakHashMap2 = p0.p0.f3233a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // u1.h0, p0.s0
    public void c() {
        int i4 = this.f1990e;
        Object obj = this.f;
        switch (i4) {
            case 0:
                ((r) obj).f1988g.A.setVisibility(0);
                break;
            case 1:
                d0 d0Var = (d0) obj;
                d0Var.A.setVisibility(0);
                if (d0Var.A.getParent() instanceof View) {
                    View view = (View) d0Var.A.getParent();
                    WeakHashMap weakHashMap = p0.p0.f3233a;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
