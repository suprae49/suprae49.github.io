package d3;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements TextWatcher {
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EditText f1693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f1694h;

    public c0(TextInputLayout textInputLayout, EditText editText) {
        this.f1694h = textInputLayout;
        this.f1693g = editText;
        this.f = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f1694h;
        textInputLayout.w(!textInputLayout.G0, false);
        if (textInputLayout.f1583q) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f1598y) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f1693g;
        int lineCount = editText.getLineCount();
        int i4 = this.f;
        if (lineCount != i4) {
            if (lineCount < i4) {
                int minimumHeight = editText.getMinimumHeight();
                int i5 = textInputLayout.f1601z0;
                if (minimumHeight != i5) {
                    editText.setMinimumHeight(i5);
                }
            }
            this.f = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }
}
