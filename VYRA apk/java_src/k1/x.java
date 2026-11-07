package k1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f2940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f2941b = new a1(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f2942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f2943d;

    public static int b(View view, androidx.emoji2.text.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(l0 l0Var, androidx.emoji2.text.g gVar) {
        int iV = l0Var.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (gVar.l() / 2) + gVar.k();
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i5 = 0; i5 < iV; i5++) {
            View viewU = l0Var.u(i5);
            int iAbs = Math.abs(((gVar.c(viewU) / 2) + gVar.e(viewU)) - iL);
            if (iAbs < i4) {
                view = viewU;
                i4 = iAbs;
            }
        }
        return view;
    }

    public final int[] a(l0 l0Var, View view) {
        int[] iArr = new int[2];
        if (l0Var.d()) {
            iArr[0] = b(view, d(l0Var));
        } else {
            iArr[0] = 0;
        }
        if (l0Var.e()) {
            iArr[1] = b(view, e(l0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final androidx.emoji2.text.g d(l0 l0Var) {
        v vVar = this.f2943d;
        if (vVar == null || ((l0) vVar.f549b) != l0Var) {
            this.f2943d = new v(l0Var, 0);
        }
        return this.f2943d;
    }

    public final androidx.emoji2.text.g e(l0 l0Var) {
        v vVar = this.f2942c;
        if (vVar == null || ((l0) vVar.f549b) != l0Var) {
            this.f2942c = new v(l0Var, 1);
        }
        return this.f2942c;
    }

    public final void f() {
        l0 layoutManager;
        View viewC;
        RecyclerView recyclerView = this.f2940a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager.e()) {
            viewC = c(layoutManager, e(layoutManager));
        } else {
            viewC = layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        }
        if (viewC == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewC);
        int i4 = iArrA[0];
        if (i4 == 0 && iArrA[1] == 0) {
            return;
        }
        this.f2940a.b0(i4, false, iArrA[1]);
    }
}
