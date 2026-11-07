package p0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import co.median.android.eeqadjy.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f3166c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f3167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3168b;

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3167a = accessibilityDelegate;
        this.f3168b = new a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3167a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public a3.h0 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f3167a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new a3.h0(28, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3167a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, q0.e eVar) {
        this.f3167a.onInitializeAccessibilityNodeInfo(view, eVar.f3378a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f3167a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3167a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i4, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 < list.size()) {
                q0.c cVar = (q0.c) list.get(i5);
                if (cVar.a() == i4) {
                    Class cls = cVar.f3376c;
                    q0.n nVar = cVar.f3377d;
                    if (nVar != null) {
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception e5) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e5);
                            }
                        }
                        zPerformAccessibilityAction = nVar.e(view);
                        break;
                    }
                } else {
                    i5++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f3167a.performAccessibilityAction(view, i4, bundle);
        }
        if (zPerformAccessibilityAction || i4 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i7 = 0; clickableSpanArr != null && i7 < clickableSpanArr.length; i7++) {
                if (clickableSpan.equals(clickableSpanArr[i7])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
            }
        }
        return z4;
    }

    public void h(View view, int i4) {
        this.f3167a.sendAccessibilityEvent(view, i4);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f3167a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b() {
        this(f3166c);
    }
}
