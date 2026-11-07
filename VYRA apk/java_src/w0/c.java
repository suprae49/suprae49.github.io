package w0;

import a3.f;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f4422a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f4423b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f4425d;

    public c(boolean z4, f fVar) {
        this.f4424c = z4;
        this.f4425d = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f4425d.getClass();
        AccessibilityNodeInfo accessibilityNodeInfo = ((q0.e) obj).f3378a;
        Rect rect = this.f4422a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        AccessibilityNodeInfo accessibilityNodeInfo2 = ((q0.e) obj2).f3378a;
        Rect rect2 = this.f4423b;
        accessibilityNodeInfo2.getBoundsInScreen(rect2);
        int i4 = rect.top;
        int i5 = rect2.top;
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        int i6 = rect.left;
        int i7 = rect2.left;
        boolean z4 = this.f4424c;
        if (i6 < i7) {
            return z4 ? 1 : -1;
        }
        if (i6 > i7) {
            return z4 ? -1 : 1;
        }
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        if (i8 < i9) {
            return -1;
        }
        if (i8 > i9) {
            return 1;
        }
        int i10 = rect.right;
        int i11 = rect2.right;
        if (i10 < i11) {
            return z4 ? 1 : -1;
        }
        if (i10 > i11) {
            return z4 ? -1 : 1;
        }
        return 0;
    }
}
