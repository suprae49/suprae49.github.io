package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import co.median.android.eeqadjy.R;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends BaseAdapter {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f1470i = b0.c(null).getMaximum(4);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f1471j = (b0.c(null).getMaximum(7) + b0.c(null).getMaximum(5)) - 1;
    public final Month f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.emoji2.text.t f1472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CalendarConstraints f1473h;

    public t(Month month, CalendarConstraints calendarConstraints) {
        this.f = month;
        this.f1473h = calendarConstraints;
        throw null;
    }

    public final int a(int i4) {
        do {
            i4++;
            if (i4 > f()) {
                return -1;
            }
        } while (!e(i4));
        return i4;
    }

    public final int b(int i4) {
        do {
            i4--;
            if (i4 < c()) {
                return -1;
            }
        } while (!e(i4));
        return i4;
    }

    public final int c() {
        int firstDayOfWeek = this.f1473h.f1404j;
        Month month = this.f;
        Calendar calendar = month.f;
        int i4 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i5 = i4 - firstDayOfWeek;
        return i5 < 0 ? i5 + month.f1410i : i5;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i4) {
        if (i4 < c() || i4 > f()) {
            return null;
        }
        int iC = (i4 - c()) + 1;
        Calendar calendarA = b0.a(this.f.f);
        calendarA.set(5, iC);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final boolean e(int i4) {
        Long item = getItem(i4);
        if (item != null) {
            return item.longValue() >= ((DateValidatorPointForward) this.f1473h.f1402h).f;
        }
        return false;
    }

    public final int f() {
        return (c() + this.f.f1411j) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f1471j;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4 / this.f.f1410i;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f1472g == null) {
            this.f1472g = new androidx.emoji2.text.t(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iC = i4 - c();
        if (iC >= 0) {
            Month month = this.f;
            if (iC >= month.f1411j) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iC + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i4) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        b0.b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
