package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import k1.l0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnClickListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f1420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f1421h;

    public /* synthetic */ d(l lVar, x xVar, int i4) {
        this.f = i4;
        this.f1421h = lVar;
        this.f1420g = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f) {
            case 0:
                l lVar = this.f1421h;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f1436m.getLayoutManager();
                View viewN0 = linearLayoutManager.N0(0, false, linearLayoutManager.v());
                int iH = viewN0 == null ? -1 : l0.H(viewN0);
                x xVar = this.f1420g;
                xVar.f1482i = 2;
                lVar.i(xVar.g(iH + 1));
                break;
            default:
                l lVar2 = this.f1421h;
                int iL0 = ((LinearLayoutManager) lVar2.f1436m.getLayoutManager()).L0();
                x xVar2 = this.f1420g;
                xVar2.f1482i = 1;
                lVar2.i(xVar2.g(iL0 - 1));
                break;
        }
    }
}
