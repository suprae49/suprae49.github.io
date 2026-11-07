package com.google.android.material.datepicker;

import android.view.View;
import p0.y1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements p0.q {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f1444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1447j;

    public o(View view, int i4, int i5, int i6, int i7) {
        this.f = i4;
        this.f1444g = view;
        this.f1445h = i5;
        this.f1446i = i6;
        this.f1447j = i7;
    }

    @Override // p0.q
    public final y1 d(View view, y1 y1Var) {
        f0.c cVarH = y1Var.f3268a.h(519);
        View view2 = this.f1444g;
        int i4 = this.f;
        if (i4 >= 0) {
            view2.getLayoutParams().height = i4 + cVarH.f2068b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f1445h + cVarH.f2067a, this.f1446i + cVarH.f2068b, this.f1447j + cVarH.f2069c, view2.getPaddingBottom());
        return y1Var;
    }
}
