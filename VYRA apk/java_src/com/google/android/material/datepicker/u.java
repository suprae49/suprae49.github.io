package com.google.android.material.datepicker;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ MaterialCalendarGridView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1474g;

    public /* synthetic */ u(x xVar, MaterialCalendarGridView materialCalendarGridView, int i4) {
        this.f = materialCalendarGridView;
        this.f1474g = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int iA;
        MaterialCalendarGridView materialCalendarGridView = this.f;
        if (!materialCalendarGridView.hasFocus() || (i4 = this.f1474g) == 0) {
            return;
        }
        t tVarB = materialCalendarGridView.b();
        if (i4 == 1) {
            iA = tVarB.b(tVarB.f() + 1);
            if (iA == -1) {
                iA = tVarB.f();
            }
        } else {
            iA = tVarB.a(tVarB.c() - 1);
            if (iA == -1) {
                iA = tVarB.c();
            }
        }
        materialCalendarGridView.setSelection(iA);
    }
}
