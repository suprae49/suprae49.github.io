package u1;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0.b f4002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f4003b;

    public l1(Activity activity, r0.b bVar, o0 o0Var) {
        this.f4003b = activity;
        this.f4002a = bVar;
        o0Var.setWebViewClient(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        new Handler(webView.getContext().getMainLooper()).post(new d3.d0(11, webView));
        h2 h2Var = (h2) this.f4002a.f;
        h2Var.f3948c.put(h2Var.f3953i, h2Var.f3952h);
        h2Var.f3953i = null;
        h2Var.f3952h = null;
        h2Var.f3954j = false;
        h2Var.f3946a.f2465c = null;
        h2Var.c(this.f4003b);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String method = webResourceRequest.getMethod();
        if (method == null || !method.equalsIgnoreCase("GET") || (url = webResourceRequest.getUrl()) == null || !url.getScheme().startsWith("http")) {
            return null;
        }
        return shouldInterceptRequest(webView, url.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return ((h2) this.f4002a.f).f3946a.e(this.f4003b, (x1.i) webView, str, null);
    }
}
