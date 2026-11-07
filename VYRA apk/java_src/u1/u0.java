package u1;

import android.util.Log;
import android.webkit.ValueCallback;
import co.median.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements ValueCallback {
    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i4 = MainActivity.G0;
        Log.d("co.median.android.MainActivity", "clearWebviewCookies: onReceiveValue callback: " + ((Boolean) obj));
    }
}
