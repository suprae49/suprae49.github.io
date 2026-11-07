package d3;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import co.median.android.eeqadjy.R;
import com.google.android.material.textfield.TextInputLayout;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1715e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f1717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f1718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f1719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f1720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1722m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f1724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f1725q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f1726r;

    /* JADX WARN: Type inference failed for: r0v2, types: [d3.l] */
    public m(s sVar) {
        super(sVar);
        this.f1718i = new a(1, this);
        this.f1719j = new b(this, 1);
        this.f1720k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: d3.l
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z4) {
                m mVar = this.f1714a;
                AutoCompleteTextView autoCompleteTextView = mVar.f1717h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                mVar.f1756d.setImportantForAccessibility(z4 ? 2 : 1);
            }
        };
        this.f1723o = Long.MAX_VALUE;
        this.f = t2.i.K(sVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f1715e = t2.i.K(sVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f1716g = t2.i.L(sVar.getContext(), R.attr.motionEasingLinearInterpolator, b2.a.f1047a);
    }

    @Override // d3.t
    public final void a() {
        if (this.f1724p.isTouchExplorationEnabled() && h0.H(this.f1717h) && !this.f1756d.hasFocus()) {
            this.f1717h.dismissDropDown();
        }
        this.f1717h.post(new androidx.activity.k(7, this));
    }

    @Override // d3.t
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // d3.t
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // d3.t
    public final View.OnFocusChangeListener e() {
        return this.f1719j;
    }

    @Override // d3.t
    public final View.OnClickListener f() {
        return this.f1718i;
    }

    @Override // d3.t
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f1720k;
    }

    @Override // d3.t
    public final boolean i(int i4) {
        return i4 != 0;
    }

    @Override // d3.t
    public final boolean k() {
        return this.n;
    }

    @Override // d3.t
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f1717h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: d3.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    m mVar = this.f;
                    long j4 = jUptimeMillis - mVar.f1723o;
                    if (j4 < 0 || j4 > 300) {
                        mVar.f1722m = false;
                    }
                    mVar.t();
                    mVar.f1722m = true;
                    mVar.f1723o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f1717h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: d3.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                m mVar = this.f1713a;
                mVar.f1722m = true;
                mVar.f1723o = SystemClock.uptimeMillis();
                mVar.s(false);
            }
        });
        this.f1717h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1753a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f1724p.isTouchExplorationEnabled()) {
            this.f1756d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // d3.t
    public final void m(q0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f3378a;
        if (!h0.H(this.f1717h)) {
            eVar.g(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // d3.t
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (!this.f1724p.isEnabled() || h0.H(this.f1717h)) {
            return;
        }
        boolean z4 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.f1717h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z4) {
            t();
            this.f1722m = true;
            this.f1723o = SystemClock.uptimeMillis();
        }
    }

    @Override // d3.t
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1716g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        int i4 = 0;
        valueAnimatorOfFloat.addUpdateListener(new i(i4, this));
        this.f1726r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f1715e);
        valueAnimatorOfFloat2.addUpdateListener(new i(i4, this));
        this.f1725q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new b3.f(1, this));
        this.f1724p = (AccessibilityManager) this.f1755c.getSystemService("accessibility");
    }

    @Override // d3.t
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f1717h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f1717h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z4) {
        if (this.n != z4) {
            this.n = z4;
            this.f1726r.cancel();
            this.f1725q.start();
        }
    }

    public final void t() {
        if (this.f1717h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f1723o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f1722m = false;
        }
        if (this.f1722m) {
            this.f1722m = false;
            return;
        }
        s(!this.n);
        boolean z4 = this.n;
        AutoCompleteTextView autoCompleteTextView = this.f1717h;
        if (!z4) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.f1717h.showDropDown();
        }
    }
}
