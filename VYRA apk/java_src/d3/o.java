package d3;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends r2.z {
    public final /* synthetic */ s f;

    public o(s sVar) {
        this.f = sVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f.b().a();
    }

    @Override // r2.z, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        this.f.b().b();
    }
}
