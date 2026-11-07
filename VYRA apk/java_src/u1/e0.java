package u1;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.RelativeLayout;
import co.median.android.GoNativeApplication;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f3893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f3894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f3896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3897e = false;
    public long f = 0;

    public e0(MainActivity mainActivity, e2 e2Var) {
        this.f3893a = mainActivity;
        this.f3894b = e2Var;
        boolean z4 = x1.a.u(mainActivity).f4675k1;
        this.f3895c = z4;
        if (z4) {
            Log.d("GoNative WebView", "Web Console logs enabled");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        MainActivity mainActivity = this.f3893a;
        if (mainActivity.T) {
            return;
        }
        mainActivity.finish();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (this.f3895c) {
            int i4 = d0.f3869a[consoleMessage.messageLevel().ordinal()];
            if (i4 == 1) {
                Log.i("[console.log]", consoleMessage.message());
            } else {
                if (i4 == 2 || i4 == 3) {
                    Log.d("[console.debug]", consoleMessage.message());
                    return true;
                }
                if (i4 == 4) {
                    Log.w("[console.warn]", consoleMessage.message());
                    return true;
                }
                if (i4 == 5) {
                    x1.f.a().d("[console.error]", consoleMessage.message(), new Exception(consoleMessage.message()));
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z5, Message message) {
        e2 e2Var = this.f3894b;
        MainActivity mainActivity = e2Var.f3901a;
        x1.a aVarU = x1.a.u(mainActivity);
        if (aVarU.D && aVarU.E > 0 && ((LinkedHashMap) mainActivity.E().f592a).size() >= aVarU.E) {
            WebView webView2 = new WebView(webView.getContext());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            webView2.setWebViewClient(new b2(e2Var));
            return true;
        }
        boolean z6 = aVarU.D;
        ((GoNativeApplication) mainActivity.getApplication()).f1164i = message;
        Intent intent = new Intent(mainActivity.getBaseContext(), (Class<?>) MainActivity.class);
        intent.putExtra("isRoot", false);
        intent.putExtra("io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN", true);
        if (z6) {
            intent.putExtra("ignoreInterceptMaxWindows", true);
        }
        mainActivity.startActivityForResult(intent, 400);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        MainActivity mainActivity = this.f3893a;
        if (!x1.a.u(mainActivity).J0.f4863a) {
            callback.invoke(str, false, false);
            return;
        }
        if (SystemClock.uptimeMillis() - this.f < 1000) {
            callback.invoke(str, false, false);
            return;
        }
        r0 r0Var = mainActivity.f1177k0;
        y yVar = new y(this, callback, str);
        r0Var.getClass();
        r0Var.f4072b = yVar;
        r0Var.a();
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        this.f3897e = false;
        MainActivity mainActivity = this.f3893a;
        RelativeLayout relativeLayout = mainActivity.O;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
            relativeLayout.removeAllViews();
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f3896d;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        mainActivity.s0(this.f3897e);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        n2.b bVar = new n2.b(this.f3893a);
        e.b bVar2 = (e.b) bVar.f1920g;
        bVar2.f = str2;
        b0 b0Var = new b0(jsResult, 0);
        bVar2.f1846g = bVar2.f1841a.getText(R.string.ok);
        bVar2.f1847h = b0Var;
        bVar2.f1850k = new c0(jsResult, 0);
        bVar.a().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        e2 e2Var = this.f3894b;
        Handler handler = e2Var.f3906g;
        if (handler != null || e2Var.f3907h == 2) {
            handler.removeCallbacksAndMessages(null);
            e2Var.f3901a.runOnUiThread(new z1(e2Var, 0));
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        n2.b bVar = new n2.b(this.f3893a);
        e.b bVar2 = (e.b) bVar.f1920g;
        bVar2.f = str2;
        b0 b0Var = new b0(jsResult, 1);
        bVar2.f1846g = bVar2.f1841a.getText(R.string.ok);
        bVar2.f1847h = b0Var;
        b0 b0Var2 = new b0(jsResult, 2);
        bVar2.f1848i = bVar2.f1841a.getText(R.string.cancel);
        bVar2.f1849j = b0Var2;
        bVar2.f1850k = new c0(jsResult, 1);
        bVar.a().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        MainActivity mainActivity = this.f3893a;
        EditText editText = new EditText(mainActivity);
        editText.setText(str3);
        n2.b bVar = new n2.b(mainActivity);
        e.b bVar2 = (e.b) bVar.f1920g;
        bVar2.f = str2;
        bVar2.f1854p = editText;
        z zVar = new z(editText, jsPromptResult, 0);
        bVar2.f1846g = bVar2.f1841a.getText(R.string.ok);
        bVar2.f1847h = zVar;
        b0 b0Var = new b0(jsPromptResult, 3);
        bVar2.f1848i = bVar2.f1841a.getText(R.string.cancel);
        bVar2.f1849j = b0Var;
        bVar2.f1850k = new a0(0, jsPromptResult);
        bVar.a().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        String[] resources = permissionRequest.getResources();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < resources.length; i4++) {
            if (resources[i4].equals("android.webkit.resource.AUDIO_CAPTURE")) {
                arrayList.add("android.permission.RECORD_AUDIO");
                arrayList.add("android.permission.MODIFY_AUDIO_SETTINGS");
            } else if (resources[i4].equals("android.webkit.resource.VIDEO_CAPTURE")) {
                arrayList.add("android.permission.CAMERA");
            }
        }
        this.f3893a.G((String[]) arrayList.toArray(new String[arrayList.size()]), new r0.b(permissionRequest));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        MainActivity mainActivity = this.f3893a;
        mainActivity.getClass();
        x1.a.u(mainActivity).getClass();
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        MainActivity mainActivity = this.f3893a;
        RelativeLayout relativeLayout = mainActivity.O;
        if (relativeLayout == null) {
            return;
        }
        this.f3896d = customViewCallback;
        this.f3897e = true;
        relativeLayout.setVisibility(0);
        relativeLayout.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        mainActivity.s0(this.f3897e);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        e2 e2Var = this.f3894b;
        ValueCallback valueCallback2 = e2Var.f3916r;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
            e2Var.f3916r = null;
        }
        if (fileChooserParams.getMode() == 3) {
            valueCallback.onReceiveValue(null);
            return false;
        }
        b.g gVar = e2Var.f3915q;
        MainActivity mainActivity = e2Var.f3901a;
        e2Var.f3916r = valueCallback;
        r rVar = new r(fileChooserParams);
        if (!fileChooserParams.isCaptureEnabled() && !rVar.a() && !rVar.b()) {
            gVar.a(rVar);
            return true;
        }
        ArrayList arrayList = new ArrayList();
        if (!t2.i.t(mainActivity, "android.permission.CAMERA") || c0.c.checkSelfPermission(mainActivity, "android.permission.CAMERA") == 0) {
            rVar.f4069c = true;
        } else {
            arrayList.add("android.permission.CAMERA");
        }
        boolean z4 = Build.VERSION.SDK_INT >= 29;
        boolean zT = t2.i.t(mainActivity, "android.permission.WRITE_EXTERNAL_STORAGE");
        boolean z5 = x1.a.u(mainActivity).f4686o1.f4856b;
        if (z4) {
            rVar.f4070d = true;
        } else if (zT && z5) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            rVar.f4070d = false;
        }
        if (arrayList.isEmpty()) {
            gVar.a(rVar);
            return true;
        }
        mainActivity.G((String[]) arrayList.toArray(new String[0]), new y(e2Var, fileChooserParams, rVar));
        return true;
    }
}
