package p0;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i4) {
        view.setImportantForAutofill(i4);
    }
}
