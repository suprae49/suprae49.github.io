package q0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f3366e = new c(1, (String) null);
    public static final c f = new c(2, (String) null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f3367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f3368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f3369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f3370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f3371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f3372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f3373m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f3376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f3377d;

    /* JADX WARN: Code duplicated, block: B:62:0x0252  */
    static {
        boolean z4;
        new c(4, (String) null);
        new c(8, (String) null);
        f3367g = new c(16, (String) null);
        new c(32, (String) null);
        new c(64, (String) null);
        new c(128, (String) null);
        new c(256, g.class);
        new c(512, g.class);
        new c(1024, h.class);
        new c(2048, h.class);
        f3368h = new c(4096, (String) null);
        f3369i = new c(8192, (String) null);
        new c(16384, (String) null);
        new c(32768, (String) null);
        new c(65536, (String) null);
        new c(131072, l.class);
        f3370j = new c(262144, (String) null);
        new c(524288, (String) null);
        f3371k = new c(1048576, (String) null);
        new c(2097152, m.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, j.class);
        f3372l = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f3373m = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i4 = Build.VERSION.SDK_INT;
        new c(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new c(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new c(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new c(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, k.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, i.class);
        new c(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new c(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new c(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new c(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new c(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new c(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new c(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new c(i4 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new c(i4 >= 34 ? o.a.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i5 = k0.b.f2716a;
        if (i4 >= 36) {
            z4 = (i4 < 36 ? i4 * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001;
        }
        new c(z4 ? d.a() : null, R.id.ALT, null, null, null);
    }

    public c(Object obj, int i4, CharSequence charSequence, n nVar, Class cls) {
        this.f3375b = i4;
        this.f3377d = nVar;
        if (obj == null) {
            this.f3374a = new AccessibilityNodeInfo.AccessibilityAction(i4, charSequence);
        } else {
            this.f3374a = obj;
        }
        this.f3376c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f3374a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f3374a;
        Object obj3 = this.f3374a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f3374a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = e.d(this.f3375b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f3374a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public c(int i4, Class cls) {
        this(null, i4, null, null, cls);
    }

    public c(int i4, String str) {
        this(null, i4, str, null, null);
    }
}
