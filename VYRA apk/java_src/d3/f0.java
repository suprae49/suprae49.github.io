package d3;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends p0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputLayout f1709d;

    public f0(TextInputLayout textInputLayout) {
        this.f1709d = textInputLayout;
    }

    @Override // p0.b
    public final void d(View view, q0.e eVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f3378a;
        this.f3167a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f1709d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z4 = textInputLayout.A0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z5 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        if (TextUtils.isEmpty(helperText)) {
            charSequence = error;
            charSequence2 = counterOverflowDescription;
        } else {
            v vVar = textInputLayout.f1581p;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (vVar.f1774o == 2 && vVar.f1784y != null && !TextUtils.isEmpty(vVar.f1782w)) {
                if (TextUtils.isEmpty(string)) {
                    string = helperText.toString();
                } else {
                    string = string + ", " + ((Object) helperText);
                }
            }
        }
        b0 b0Var = textInputLayout.f1566g;
        y0 y0Var = b0Var.f1683g;
        if (y0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(y0Var);
            accessibilityNodeInfo.setTraversalAfter(y0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(b0Var.f1685i);
        }
        if (!zIsEmpty) {
            eVar.j(text);
        } else if (!TextUtils.isEmpty(string)) {
            eVar.j(string);
            if (!z4 && placeholderText != null) {
                eVar.j(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            eVar.j(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z5) {
            accessibilityNodeInfo.setError(!zIsEmpty3 ? charSequence : charSequence2);
        }
        textInputLayout.f1567h.b().m(eVar);
    }

    @Override // p0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f1709d.f1567h.b().n(accessibilityEvent);
    }
}
