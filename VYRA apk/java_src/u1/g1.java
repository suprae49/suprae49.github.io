package u1;

import android.webkit.JavascriptInterface;
import co.median.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f3935a;

    public g1(x xVar) {
        this.f3935a = xVar;
    }

    @JavascriptInterface
    public final void print() {
        x xVar = this.f3935a;
        ((MainActivity) xVar.f4135b).runOnUiThread(new androidx.activity.k(14, xVar));
    }
}
