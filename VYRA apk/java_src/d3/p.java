package d3;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f1728a;

    public p(s sVar) {
        this.f1728a = sVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        s sVar = this.f1728a;
        o oVar = sVar.A;
        if (sVar.f1750x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = sVar.f1750x;
        if (editText != null) {
            editText.removeTextChangedListener(oVar);
            if (sVar.f1750x.getOnFocusChangeListener() == sVar.b().e()) {
                sVar.f1750x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        sVar.f1750x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(oVar);
        }
        sVar.b().l(sVar.f1750x);
        sVar.k(sVar.b());
    }
}
