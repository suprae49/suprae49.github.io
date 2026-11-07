package d3;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1679g;

    public /* synthetic */ a(int i4, Object obj) {
        this.f = i4;
        this.f1679g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f) {
            case 0:
                e eVar = (e) this.f1679g;
                EditText editText = eVar.f1701i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (view.hasFocus()) {
                        eVar.f1701i.requestFocus();
                    }
                    if (text != null) {
                        text.clear();
                    }
                    eVar.p();
                    break;
                }
                break;
            case 1:
                ((m) this.f1679g).t();
                break;
            case 2:
                z zVar = (z) this.f1679g;
                EditText editText2 = zVar.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = zVar.f;
                    boolean z4 = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                    EditText editText4 = zVar.f;
                    if (z4) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        zVar.f.setSelection(selectionEnd);
                    }
                    zVar.p();
                    break;
                }
                break;
            default:
                ((PopupWindow) this.f1679g).dismiss();
                break;
        }
    }
}
