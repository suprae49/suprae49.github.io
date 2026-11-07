package e;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends u1.h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1955e;
    public final /* synthetic */ q0 f;

    public /* synthetic */ o0(q0 q0Var, int i4) {
        this.f1955e = i4;
        this.f = q0Var;
    }

    @Override // p0.s0
    public final void a() {
        View view;
        int i4 = this.f1955e;
        q0 q0Var = this.f;
        switch (i4) {
            case 0:
                if (q0Var.f1980s && (view = q0Var.f1973k) != null) {
                    view.setTranslationY(0.0f);
                    q0Var.f1970h.setTranslationY(0.0f);
                }
                q0Var.f1970h.setVisibility(8);
                q0Var.f1970h.setTransitioning(false);
                q0Var.f1985x = null;
                androidx.emoji2.text.p pVar = q0Var.f1976o;
                if (pVar != null) {
                    pVar.r(q0Var.n);
                    q0Var.n = null;
                    q0Var.f1976o = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = q0Var.f1969g;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = p0.p0.f3233a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                q0Var.f1985x = null;
                q0Var.f1970h.requestLayout();
                break;
        }
    }
}
