package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new s(0);
    public final Calendar f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f1412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f1413l;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = b0.a(calendar);
        this.f = calendarA;
        this.f1408g = calendarA.get(2);
        this.f1409h = calendarA.get(1);
        this.f1410i = calendarA.getMaximum(7);
        this.f1411j = calendarA.getActualMaximum(5);
        this.f1412k = calendarA.getTimeInMillis();
    }

    public static Month a(int i4, int i5) {
        Calendar calendarC = b0.c(null);
        calendarC.set(1, i4);
        calendarC.set(2, i5);
        return new Month(calendarC);
    }

    public static Month b(long j4) {
        Calendar calendarC = b0.c(null);
        calendarC.setTimeInMillis(j4);
        return new Month(calendarC);
    }

    public final String c() {
        if (this.f1413l == null) {
            long timeInMillis = this.f.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = b0.f1416a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f1413l = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f1413l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f.compareTo(month.f);
    }

    public final int d(Month month) {
        if (this.f instanceof GregorianCalendar) {
            return (month.f1408g - this.f1408g) + ((month.f1409h - this.f1409h) * 12);
        }
        androidx.fragment.app.q.q("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f1408g == month.f1408g && this.f1409h == month.f1409h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1408g), Integer.valueOf(this.f1409h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f1409h);
        parcel.writeInt(this.f1408g);
    }
}
