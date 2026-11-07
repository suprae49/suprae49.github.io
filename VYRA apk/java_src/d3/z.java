package d3;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1797e;
    public EditText f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f1798g;

    public z(s sVar, int i4) {
        super(sVar);
        this.f1797e = R.drawable.design_password_eye;
        this.f1798g = new a(2, this);
        if (i4 != 0) {
            this.f1797e = i4;
        }
    }

    @Override // d3.t
    public final void b() {
        p();
    }

    @Override // d3.t
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // d3.t
    public final int d() {
        return this.f1797e;
    }

    @Override // d3.t
    public final View.OnClickListener f() {
        return this.f1798g;
    }

    @Override // d3.t
    public final boolean j() {
        return true;
    }

    @Override // d3.t
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // d3.t
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // d3.t
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // d3.t
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
