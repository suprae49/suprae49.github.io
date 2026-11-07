package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k1.u0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ l F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, int i4, int i5) {
        super(i4);
        this.F = lVar;
        this.E = i5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(u0 u0Var, int[] iArr) {
        l lVar = this.F;
        RecyclerView recyclerView = lVar.f1436m;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = lVar.f1436m.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = lVar.f1436m.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.l0
    public final void y0(RecyclerView recyclerView, int i4) {
        z zVar = new z(recyclerView.getContext());
        zVar.f2906a = i4;
        z0(zVar);
    }
}
