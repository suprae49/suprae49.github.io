package co.median.android.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.u;
import co.median.android.GoNativeApplication;
import co.median.android.MainActivity;
import co.median.android.MainActivity.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import u1.e0;
import u1.e2;
import u1.f0;
import u1.f2;
import u1.g1;
import u1.o;
import u1.o0;
import u1.v0;
import u1.x;
import x1.a;
import x1.f;
import x1.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class WebViewContainerView extends FrameLayout {
    public final ViewGroup f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1216g;

    public WebViewContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1216g = false;
        if (a.u(context).f4678l1) {
            try {
                this.f = (ViewGroup) Class.forName("co.median.plugins.android.geckoview.GNGeckoView").getConstructor(Context.class).newInstance(context);
                this.f1216g = true;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } else {
            this.f = new o0(context);
        }
        this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f);
    }

    public final void a(MainActivity mainActivity, boolean z4) {
        Message message;
        if (this.f1216g) {
            try {
                Class<?> cls = Class.forName("co.median.plugins.android.geckoview.WebViewSetup");
                cls.getMethod("setupWebviewForActivity", Activity.class, i.class, x.class, Boolean.TYPE).invoke(cls, mainActivity, (i) this.f, ((GoNativeApplication) mainActivity.getApplication()).f1168m, Boolean.valueOf(z4));
                return;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
                e5.printStackTrace();
                return;
            }
        }
        Object webview = getWebview();
        if (!(webview instanceof o0)) {
            f.a().d("co.median.android.a", "Expected webview to be of class LeanWebView and not ".concat(webview.getClass().getName()), null);
            return;
        }
        o0 o0Var = (o0) webview;
        co.median.android.a.a(o0Var, mainActivity);
        e2 e2Var = new e2(mainActivity);
        e2Var.f3904d = ((WebView) webview).getUrl();
        ((GoNativeApplication) e2Var.f3901a.getApplication()).f1168m.getClass();
        o0Var.setWebChromeClient(new e0(mainActivity, e2Var));
        o0Var.setWebViewClient(new f0(mainActivity, e2Var));
        o oVar = mainActivity.Z;
        if (oVar != null) {
            o0Var.setDownloadListener(oVar);
            oVar.f4019d = e2Var;
        }
        o0Var.removeJavascriptInterface("median_status_checker");
        o0Var.addJavascriptInterface(mainActivity.new a(), "median_status_checker");
        o0Var.removeJavascriptInterface("gonative_file_writer_sharer");
        o0Var.addJavascriptInterface(mainActivity.f1170a0.f4115c, "gonative_file_writer_sharer");
        o0Var.removeJavascriptInterface("JSBridge");
        o0Var.addJavascriptInterface(new f2(new v0(mainActivity, 5)), "JSBridge");
        o0Var.removeJavascriptInterface("median_print");
        o0Var.addJavascriptInterface((g1) mainActivity.f1174f0.f4136c, "median_print");
        Iterator it = ((ArrayList) ((GoNativeApplication) mainActivity.getApplication()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        if (!mainActivity.getIntent().getBooleanExtra("io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN", false) || (message = ((GoNativeApplication) mainActivity.getApplication()).f1164i) == null) {
            return;
        }
        try {
            WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
            if (webViewTransport != null) {
                webViewTransport.setWebView(o0Var);
                message.sendToTarget();
            }
        } catch (ClassCastException e6) {
            f.a().d("co.median.android.a", e6.getMessage(), e6);
        }
    }

    public i getWebview() {
        return (i) this.f;
    }
}
