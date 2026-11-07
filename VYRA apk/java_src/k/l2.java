package k;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 implements TextWatcher {
    public final /* synthetic */ androidx.appcompat.widget.e f;

    public l2(androidx.appcompat.widget.e eVar) {
        this.f = eVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        androidx.appcompat.widget.e eVar = this.f;
        Editable text = eVar.f443u.getText();
        eVar.f437f0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        eVar.v(!zIsEmpty);
        int i7 = 8;
        if (eVar.d0 && !eVar.T && zIsEmpty) {
            eVar.f448z.setVisibility(8);
            i7 = 0;
        }
        eVar.B.setVisibility(i7);
        eVar.r();
        eVar.u();
        if (eVar.P != null && !TextUtils.equals(charSequence, eVar.f436e0)) {
            s2 s2Var = eVar.P;
            String string = charSequence.toString();
            ((androidx.emoji2.text.p) s2Var).getClass();
            string.getClass();
        }
        eVar.f436e0 = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }
}
