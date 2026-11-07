package c3;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static f f1156b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1157a;

    public f() {
        this.f1157a = new Object();
        new Handler(Looper.getMainLooper(), new e(this));
    }

    public static f a(int i4, int i5, int i6, int i7, boolean z4, boolean z5) {
        return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z4, z5));
    }

    public f(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f1157a = collectionItemInfo;
    }
}
