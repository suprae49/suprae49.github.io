package com.google.android.material.datepicker;

import a3.h0;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import co.median.android.eeqadjy.R;
import java.util.Calendar;
import k1.m0;
import k1.x0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends k1.b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f1478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f1479e;
    public final h0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Month f1481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1482i = 0;

    public x(ContextThemeWrapper contextThemeWrapper, CalendarConstraints calendarConstraints, g gVar, h0 h0Var) {
        Month month = calendarConstraints.f;
        Month month2 = calendarConstraints.f1401g;
        Month month3 = calendarConstraints.f1403i;
        if (month.f.compareTo(month3.f) > 0) {
            androidx.fragment.app.q.q("firstPage cannot be after currentPage");
            throw null;
        }
        if (month3.f.compareTo(month2.f) > 0) {
            androidx.fragment.app.q.q("currentPage cannot be after lastPage");
            throw null;
        }
        this.f1480g = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * t.f1470i) + (q.j(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f1478d = calendarConstraints;
        this.f1479e = gVar;
        this.f = h0Var;
        this.f1481h = month3;
        if (this.f2734a.a()) {
            androidx.fragment.app.q.j("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.f2735b = true;
    }

    @Override // k1.b0
    public final int a() {
        return this.f1478d.f1406l;
    }

    @Override // k1.b0
    public final long b(int i4) {
        Calendar calendarA = b0.a(this.f1478d.f.f);
        calendarA.add(2, i4);
        return new Month(calendarA).f.getTimeInMillis();
    }

    @Override // k1.b0
    public final void d(x0 x0Var, int i4) {
        w wVar = (w) x0Var;
        CalendarConstraints calendarConstraints = this.f1478d;
        Calendar calendarA = b0.a(calendarConstraints.f.f);
        calendarA.add(2, i4);
        Month month = new Month(calendarA);
        wVar.f1476u.setText(month.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) wVar.f1477v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() == null || !month.equals(materialCalendarGridView.b().f)) {
            new t(month, calendarConstraints);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.b().getClass();
        throw null;
    }

    @Override // k1.b0
    public final x0 e(ViewGroup viewGroup, int i4) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!q.j(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new w(linearLayout, false);
        }
        linearLayout.setLayoutParams(new m0(-1, this.f1480g));
        return new w(linearLayout, true);
    }

    public final Month g(int i4) {
        Calendar calendarA = b0.a(this.f1478d.f.f);
        calendarA.add(2, i4);
        return new Month(calendarA);
    }

    public final int h(Month month) {
        return this.f1478d.f.d(month);
    }
}
