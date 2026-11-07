package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import co.median.android.eeqadjy.R;
import java.util.Locale;
import k1.x0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends k1.b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f1422d;

    public d0(l lVar) {
        this.f1422d = lVar;
    }

    @Override // k1.b0
    public final int a() {
        return this.f1422d.f1431h.f1405k;
    }

    @Override // k1.b0
    public final void d(x0 x0Var, int i4) {
        l lVar = this.f1422d;
        int i5 = lVar.f1431h.f.f1409h + i4;
        TextView textView = ((c0) x0Var).f1419u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i5)));
        Context context = textView.getContext();
        textView.setContentDescription(b0.b().get(1) == i5 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i5)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i5)));
        androidx.emoji2.text.t tVar = lVar.f1434k;
        if (b0.b().get(1) == i5) {
            Object obj = tVar.f580d;
        } else {
            Object obj2 = tVar.f579c;
        }
        throw null;
    }

    @Override // k1.b0
    public final x0 e(ViewGroup viewGroup, int i4) {
        return new c0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
