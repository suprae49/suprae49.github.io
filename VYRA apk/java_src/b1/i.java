package b1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.k;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements TextWatcher {
    public final EditText f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f1045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1046h = true;

    public i(EditText editText) {
        this.f = editText;
    }

    public static void a(EditText editText, int i4) {
        int length;
        if (i4 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            k kVarA = k.a();
            if (editableText == null) {
                length = 0;
            } else {
                kVarA.getClass();
                length = editableText.length();
            }
            kVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) throws Throwable {
        EditText editText = this.f;
        if (editText.isInEditMode() || !this.f1046h || k.f554k == null || i5 > i6 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = k.a().b();
        if (iB != 0) {
            if (iB == 1) {
                k.a().e((Spannable) charSequence, i4, i6 + i4);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        k kVarA = k.a();
        if (this.f1045g == null) {
            this.f1045g = new h(editText);
        }
        kVarA.f(this.f1045g);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }
}
