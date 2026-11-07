package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import r2.z;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z {
    public final /* synthetic */ ChipTextInputComboView f;

    public b(ChipTextInputComboView chipTextInputComboView) {
        this.f = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f;
        if (zIsEmpty) {
            chipTextInputComboView.f1606i = ChipTextInputComboView.a(chipTextInputComboView, "00");
            return;
        }
        String strA = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(strA)) {
            strA = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chipTextInputComboView.f1606i = strA;
    }
}
