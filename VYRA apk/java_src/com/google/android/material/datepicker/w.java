package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import co.median.android.eeqadjy.R;
import java.util.WeakHashMap;
import k1.x0;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends x0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f1476u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f1477v;

    public w(LinearLayout linearLayout, boolean z4) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1476u = textView;
        WeakHashMap weakHashMap = p0.f3233a;
        new p0.d0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).d(textView, Boolean.TRUE);
        this.f1477v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z4) {
            return;
        }
        textView.setVisibility(8);
    }
}
