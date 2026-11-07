package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k1.l0;
import k1.o0;
import k1.x0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1428b;

    public j(l lVar, x xVar) {
        this.f1428b = lVar;
        this.f1427a = xVar;
    }

    @Override // k1.o0
    public final void a(RecyclerView recyclerView, int i4) {
        l lVar;
        k1.x xVar;
        View viewC;
        RecyclerView recyclerView2;
        if (i4 != 0 || (xVar = (lVar = this.f1428b).f1442t) == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f1436m.getLayoutManager();
        if (linearLayoutManager.e()) {
            viewC = k1.x.c(linearLayoutManager, xVar.e(linearLayoutManager));
        } else {
            viewC = linearLayoutManager.d() ? k1.x.c(linearLayoutManager, xVar.d(linearLayoutManager)) : null;
        }
        if (viewC != null) {
            x0 x0VarI = RecyclerView.I(viewC);
            int iF = (x0VarI == null || (recyclerView2 = x0VarI.f2960r) == null) ? -1 : recyclerView2.F(x0VarI);
            if (iF != -1) {
                x xVar2 = this.f1427a;
                lVar.f1432i = xVar2.g(iF);
                lVar.f1440r.setText(xVar2.g(iF).c());
                lVar.m(iF);
            }
        }
        lVar.l();
    }

    @Override // k1.o0
    public final void b(RecyclerView recyclerView, int i4, int i5) {
        int iL0;
        l lVar = this.f1428b;
        RecyclerView recyclerView2 = lVar.f1436m;
        if (i4 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View viewN0 = linearLayoutManager.N0(0, false, linearLayoutManager.v());
            iL0 = viewN0 == null ? -1 : l0.H(viewN0);
        } else {
            iL0 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).L0();
        }
        k1.x xVar = lVar.f1442t;
        x xVar2 = this.f1427a;
        if (xVar == null) {
            lVar.f1432i = xVar2.g(iL0);
        }
        lVar.f1440r.setText(xVar2.g(iL0).c());
        lVar.m(iL0);
    }
}
