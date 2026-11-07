package u1;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.security.KeyChain;
import android.security.KeyChainAliasCallback;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ClientCertRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import co.median.android.GoNativeApplication;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f3919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainActivity f3920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3921c = false;

    public f0(MainActivity mainActivity, e2 e2Var) {
        this.f3919a = e2Var;
        this.f3920b = mainActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z4) {
        e2 e2Var = this.f3919a;
        MainActivity mainActivity = e2Var.f3901a;
        x1 x1Var = mainActivity.C0;
        if (x1Var != null && x1Var.f4139b && !x1Var.f4142e) {
            e2 e2Var2 = x1Var.f4141d;
            if (e2Var2 == null) {
                r3.g.c("urlNavigation");
                throw null;
            }
            e2Var2.c(str);
        }
        if (e2Var.f3907h == 2) {
            e2Var.f3907h = 3;
            e2Var.f3906g.removeCallbacksAndMessages(null);
        }
        if (z4 || str.equals("file:///android_asset/offline.html")) {
            return;
        }
        Stack stack = mainActivity.I;
        if (stack.isEmpty() || !((String) stack.peek()).equals(str)) {
            stack.push(str);
        }
        mainActivity.x(str);
        mainActivity.n0(0.3d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f3919a.getClass();
        message2.sendToTarget();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        e2 e2Var = this.f3919a;
        if (!e2Var.f3911l.equals(str)) {
            e2Var.a();
        }
        super.onPageCommitVisible(webView, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ArrayList arrayList;
        super.onPageFinished(webView, str);
        x1.i iVar = (x1.i) webView;
        e2 e2Var = this.f3919a;
        MainActivity mainActivity = e2Var.f3901a;
        if (e2Var.f3911l.equals(str)) {
            e2Var.f3911l = "";
            return;
        }
        x1 x1Var = mainActivity.C0;
        if (x1Var != null) {
            x1Var.f4142e = false;
        }
        Log.d("u1.e2", "onpagefinished " + str);
        e2Var.f3907h = 4;
        e2Var.f3904d = str;
        ((GoNativeApplication) e2Var.f3901a.getApplication()).f1168m.getClass();
        x1.a aVarU = x1.a.u(mainActivity);
        if (str != null && (arrayList = aVarU.f4659e0) != null) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                if (((Pattern) obj).matcher(str).matches()) {
                    return;
                }
            }
        }
        e2Var.a();
        String str2 = e2Var.f3913o;
        if (!TextUtils.isEmpty(str2)) {
            try {
                mainActivity.V("javascript:(function() {var parent = document.getElementsByTagName('head').item(0);var script = document.createElement('script');script.type = 'text/javascript';script.innerHTML = window.atob('" + str2 + "');parent.appendChild(script)})()", null);
                Log.d("u1.e2", "Custom JS Injection Success");
            } catch (Exception e5) {
                x1.f.a().d("u1.e2", "Error injecting customJS via javascript", e5);
            }
        }
        mainActivity.j0();
        mainActivity.runOnUiThread(new z1(e2Var, 1));
        androidx.emoji2.text.p.l().o(str);
        if (e2Var.b(Uri.parse(str))) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new androidx.emoji2.text.n(1));
        }
        if (!e4.a.R("DOCUMENT_START_SCRIPT")) {
            mainActivity.V("window.print = function () { if (window.median_print) window.median_print.print(); };", null);
        }
        if (aVarU.f4709z && t2.i.a(mainActivity, e2Var.f3904d)) {
            try {
                if (e2Var.f3905e == null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(mainActivity.getAssets().open("GoNativeJSBridgeLibrary.js"));
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i5 = bufferedInputStream.read(bArr);
                        if (i5 <= 0) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr, 0, i5);
                        }
                    }
                    e2Var.f3905e = byteArrayOutputStream.toString();
                }
                mainActivity.V(e2Var.f3905e, null);
                ((GoNativeApplication) mainActivity.getApplication()).f1168m.c(mainActivity);
                mainActivity.V(t2.i.e("median_library_ready", null), null);
                mainActivity.V(t2.i.e("gonative_library_ready", null), null);
                Log.d("u1.e2", "GoNative JSBridgeLibrary Injection Success");
            } catch (Exception e6) {
                Log.d("u1.e2", "GoNative JSBridgeLibrary Injection Error:- " + e6.getMessage());
            }
        }
        if (aVarU.M != null) {
            if (e2Var.f3908i) {
                mainActivity.f1171b0.c();
            }
            e2Var.f3908i = t2.i.R(str, aVarU.F0) || t2.i.R(str, aVarU.H0);
        }
        String str3 = aVarU.X0;
        if (str3 != null) {
            ((o0) iVar).evaluateJavascript(str3, null);
        }
        String str4 = e2Var.f3902b;
        if (str4 != null) {
            ((o0) iVar).evaluateJavascript(str4, null);
        }
        String str5 = e2Var.f3903c;
        if (str5 != null) {
            ((o0) iVar).evaluateJavascript(str5, null);
        }
        mainActivity.x(str);
        String str6 = mainActivity.f1175h0;
        if (str6 != null) {
            mainActivity.f1175h0 = null;
            mainActivity.V(str6, null);
        }
        h2 h2Var = ((GoNativeApplication) mainActivity.getApplication()).f1163h;
        h2Var.f3956l = false;
        h2Var.c(mainActivity);
        String str7 = e2Var.f3904d;
        if (str7 != null ? t2.i.a(mainActivity, str7) : true) {
            e2Var.e("median_device_info");
            e2Var.e("gonative_device_info");
        }
        Iterator it = ((ArrayList) ((GoNativeApplication) mainActivity.getApplication()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw androidx.fragment.app.u.j(it);
        }
        z1.g gVar = x1.a.u(mainActivity).f4672j1;
        if (gVar == null) {
            return;
        }
        long j4 = gVar.f4875a;
        if (gVar.f4879e || gVar.f4878d) {
            return;
        }
        gVar.f4878d = true;
        if (j4 > -1) {
            new Handler(Looper.getMainLooper()).postDelayed(new androidx.activity.p(mainActivity, 11, gVar), j4);
        } else {
            gVar.f4879e = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f3919a.c(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, final ClientCertRequest clientCertRequest) {
        String url = webView.getUrl();
        final e2 e2Var = this.f3919a;
        e2Var.getClass();
        Uri.parse(url);
        KeyChain.choosePrivateKeyAlias(e2Var.f3901a, new KeyChainAliasCallback() { // from class: u1.a2
            @Override // android.security.KeyChainAliasCallback
            public final void alias(String str) {
                e2 e2Var2 = e2Var;
                e2Var2.getClass();
                ClientCertRequest clientCertRequest2 = clientCertRequest;
                if (str == null) {
                    clientCertRequest2.ignore();
                    return;
                }
                MainActivity mainActivity = e2Var2.f3901a;
                d2 d2Var = new d2();
                d2Var.f3873a = mainActivity;
                d2Var.f3874b = clientCertRequest2;
                d2Var.execute(str);
            }
        }, clientCertRequest.getKeyTypes(), clientCertRequest.getPrincipals(), clientCertRequest.getHost(), clientCertRequest.getPort(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int errorCode = webResourceError.getErrorCode();
        String string = webResourceError.getDescription().toString();
        String string2 = webResourceRequest.getUrl().toString();
        this.f3919a.d((x1.i) webView, errorCode, string, string2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i4;
        sslErrorHandler.cancel();
        String url = webView.getUrl();
        MainActivity mainActivity = this.f3919a.f3901a;
        int primaryError = sslError.getPrimaryError();
        if (primaryError == 0) {
            i4 = R.string.ssl_error_cert;
        } else if (primaryError == 1) {
            i4 = R.string.ssl_error_expired;
        } else if (primaryError == 2 || primaryError == 3 || primaryError == 4) {
            i4 = R.string.ssl_error_cert;
        } else {
            i4 = R.string.ssl_error_generic;
        }
        if (x1.a.u(mainActivity).f4707y) {
            Toast.makeText(mainActivity, i4, 1).show();
        }
        String str = mainActivity.getString(i4) + " - Error url: " + sslError.getUrl() + " - Source page: " + url;
        x1.f.a().d("u1.e2", str, new Exception(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f4) {
        super.onScaleChanged(webView, f, f4);
        MainActivity mainActivity = this.f3920b;
        mainActivity.F0 = f4;
        x1.i iVar = mainActivity.G;
        if (iVar instanceof o0) {
            ((o0) iVar).setCurrentScale(f4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0059  */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse;
        Uri url;
        boolean z4 = this.f3921c;
        MainActivity mainActivity = this.f3920b;
        if (z4 || mainActivity.T || !mainActivity.getIntent().getBooleanExtra("io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN", false)) {
            webResourceResponse = null;
        } else {
            this.f3921c = true;
            if (Objects.equals(co.median.android.a.f1193a, webResourceRequest.getRequestHeaders().get("User-Agent"))) {
                webResourceResponse = null;
            } else {
                webResourceResponse = new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                webResourceResponse.setStatusCodeAndReasonPhrase(204, "No Content");
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                requestHeaders.put("User-Agent", co.median.android.a.f1193a);
                mainActivity.runOnUiThread(new androidx.emoji2.text.l(this, webResourceRequest, requestHeaders, 2));
            }
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        Iterator it = ((ArrayList) ((GoNativeApplication) mainActivity.getApplicationContext()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw androidx.fragment.app.u.j(it);
        }
        String method = webResourceRequest.getMethod();
        if (method == null || !method.equalsIgnoreCase("GET") || (url = webResourceRequest.getUrl()) == null || !url.getScheme().startsWith("http")) {
            return null;
        }
        return shouldInterceptRequest(webView, url.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        boolean zIsRedirect = webResourceRequest.isRedirect();
        return this.f3919a.f((x1.i) webView, string, zIsRedirect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f3919a.f((x1.i) webView, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i4, String str, String str2) {
        this.f3919a.d((x1.i) webView, i4, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        e2 e2Var = this.f3919a;
        return e2Var.f.e(e2Var.f3901a, (o0) webView, str, e2Var.f3904d);
    }
}
