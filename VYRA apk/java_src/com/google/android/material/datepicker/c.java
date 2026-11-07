package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import co.median.android.eeqadjy.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends BaseAdapter {
    public final Calendar f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1418h;

    public c() {
        Calendar calendarC = b0.c(null);
        this.f = calendarC;
        this.f1417g = calendarC.getMaximum(7);
        this.f1418h = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1417g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        int i5 = this.f1417g;
        if (i4 >= i5) {
            return null;
        }
        int i6 = i4 + this.f1418h;
        if (i6 > i5) {
            i6 -= i5;
        }
        return Integer.valueOf(i6);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i5 = i4 + this.f1418h;
        int i6 = this.f1417g;
        if (i5 > i6) {
            i5 -= i6;
        }
        Calendar calendar = this.f;
        calendar.set(7, i5);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public c(int i4) {
        Calendar calendarC = b0.c(null);
        this.f = calendarC;
        this.f1417g = calendarC.getMaximum(7);
        this.f1418h = i4;
    }
}
