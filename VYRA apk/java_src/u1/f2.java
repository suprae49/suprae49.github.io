package u1;

import android.webkit.JavascriptInterface;
import co.median.android.GoNativeApplication;
import co.median.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f3926a;

    public f2(v0 v0Var) {
        this.f3926a = v0Var;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        MainActivity mainActivity = this.f3926a.f4111g;
        if (str.isEmpty()) {
            return;
        }
        mainActivity.runOnUiThread(new androidx.emoji2.text.l(mainActivity, str, ((GoNativeApplication) mainActivity.getApplication()).f1168m, 3));
    }
}
