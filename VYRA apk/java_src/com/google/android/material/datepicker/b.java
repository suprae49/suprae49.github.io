package com.google.android.material.datepicker;

import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1414b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f1415a;

    static {
        long j4 = Month.a(1900, 0).f1412k;
        Calendar calendarC = b0.c(null);
        calendarC.setTimeInMillis(j4);
        b0.a(calendarC).getTimeInMillis();
        long j5 = Month.a(2100, 11).f1412k;
        Calendar calendarC2 = b0.c(null);
        calendarC2.setTimeInMillis(j5);
        b0.a(calendarC2).getTimeInMillis();
    }
}
