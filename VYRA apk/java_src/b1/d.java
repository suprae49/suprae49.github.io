package b1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.k;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f1038b;

    public d(TextView textView) {
        this.f1037a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
        TextView textView = this.f1037a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = k.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i7 == 0 && i6 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i4 != 0 || i5 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i4, i5);
                }
                return k.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        k kVarA = k.a();
        if (this.f1038b == null) {
            this.f1038b = new c(textView, this);
        }
        kVarA.f(this.f1038b);
        return charSequence;
    }
}
