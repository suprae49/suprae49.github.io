package u1;

import android.content.Intent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import co.median.android.MainActivity;
import com.google.android.gms.common.internal.ImagesContract;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e2 f3861a;

    public b2(e2 e2Var) {
        this.f3861a = e2Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        e2 e2Var = this.f3861a;
        if (e2Var.f3901a.M(str)) {
            return;
        }
        Intent intent = new Intent(e2Var.f3901a.getBaseContext(), (Class<?>) MainActivity.class);
        intent.putExtra("isRoot", false);
        intent.putExtra(ImagesContract.URL, str);
        intent.putExtra("ignoreInterceptMaxWindows", true);
        e2Var.f3901a.startActivityForResult(intent, 400);
    }
}
