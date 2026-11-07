package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f1475g;

    public v(x xVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f1475g = xVar;
        this.f = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        MaterialCalendarGridView materialCalendarGridView = this.f;
        t tVarB = materialCalendarGridView.b();
        if (i4 < tVarB.c() || i4 > tVarB.f()) {
            return;
        }
        if (materialCalendarGridView.b().getItem(i4).longValue() >= ((DateValidatorPointForward) this.f1475g.f1479e.f1424a.f1431h.f1402h).f) {
            throw null;
        }
    }
}
