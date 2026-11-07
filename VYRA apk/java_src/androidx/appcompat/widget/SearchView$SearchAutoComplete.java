package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import d3.d0;
import java.lang.reflect.Method;
import k.n;
import k.q2;
import k.u2;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f358m;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f358m = new d0(5, this);
        this.f355j = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i4 < 600) {
            return (i4 < 640 || i5 < 480) ? 160 : 192;
        }
        return 192;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            q2.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
                return;
            }
            return;
        }
        u2 u2Var = e.f432n0;
        u2Var.getClass();
        u2.a();
        Method method = u2Var.f2661c;
        if (method != null) {
            try {
                method.invoke(this, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f355j <= 0 || super.enoughToFilter();
    }

    @Override // k.n, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f357l) {
            d0 d0Var = this.f358m;
            removeCallbacks(d0Var);
            post(d0Var);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i4, Rect rect) {
        super.onFocusChanged(z4, i4, rect);
        e eVar = this.f356k;
        eVar.w(eVar.T);
        eVar.post(eVar.f440k0);
        if (eVar.f443u.hasFocus()) {
            eVar.l();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.f356k.clearFocus();
                    setImeVisibility(false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i4, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (z4 && this.f356k.hasFocus() && getVisibility() == 0) {
            this.f357l = true;
            if (getContext().getResources().getConfiguration().orientation == 2) {
                a();
            }
        }
    }

    public void setImeVisibility(boolean z4) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        d0 d0Var = this.f358m;
        if (!z4) {
            this.f357l = false;
            removeCallbacks(d0Var);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f357l = true;
                return;
            }
            this.f357l = false;
            removeCallbacks(d0Var);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public void setSearchView(e eVar) {
        this.f356k = eVar;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i4) {
        super.setThreshold(i4);
        this.f355j = i4;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }
}
