package d3;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f1754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f1756d;

    public t(s sVar) {
        this.f1753a = sVar.f;
        this.f1754b = sVar;
        this.f1755c = sVar.getContext();
        this.f1756d = sVar.f1739l;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i4) {
        return true;
    }

    public boolean j() {
        return this instanceof m;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f1754b.f(false);
    }

    public void l(EditText editText) {
    }

    public void m(q0.e eVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z4) {
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }
}
