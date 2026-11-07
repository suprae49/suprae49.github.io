package p1;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static int a(ViewGroup viewGroup, int i4) {
        return viewGroup.getChildDrawingOrder(i4);
    }

    public static void b(ViewGroup viewGroup, boolean z4) {
        viewGroup.suppressLayout(z4);
    }
}
