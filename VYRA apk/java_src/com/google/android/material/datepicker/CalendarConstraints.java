package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    public final Month f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Month f1401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateValidator f1402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Month f1403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1406l;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public interface DateValidator extends Parcelable {
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i4) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f = month;
        this.f1401g = month2;
        this.f1403i = month3;
        this.f1404j = i4;
        this.f1402h = dateValidator;
        if (month3 != null && month.f.compareTo(month3.f) > 0) {
            androidx.fragment.app.q.q("start Month cannot be after current Month");
            throw null;
        }
        if (month3 != null && month3.f.compareTo(month2.f) > 0) {
            androidx.fragment.app.q.q("current Month cannot be after end Month");
            throw null;
        }
        if (i4 < 0 || i4 > b0.c(null).getMaximum(7)) {
            androidx.fragment.app.q.q("firstDayOfWeek is not valid");
            throw null;
        }
        this.f1406l = month.d(month2) + 1;
        this.f1405k = (month2.f1409h - month.f1409h) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f.equals(calendarConstraints.f) && this.f1401g.equals(calendarConstraints.f1401g) && Objects.equals(this.f1403i, calendarConstraints.f1403i) && this.f1404j == calendarConstraints.f1404j && this.f1402h.equals(calendarConstraints.f1402h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.f1401g, this.f1403i, Integer.valueOf(this.f1404j), this.f1402h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.f1401g, 0);
        parcel.writeParcelable(this.f1403i, 0);
        parcel.writeParcelable(this.f1402h, 0);
        parcel.writeInt(this.f1404j);
    }
}
