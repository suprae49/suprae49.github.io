package co.median.android;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import androidx.fragment.app.q;
import t1.i;
import u1.o0;
import x1.c;
import x1.d;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f1193a = "";

    public static void a(o0 o0Var, Context context) {
        int i4;
        x1.a aVarU = x1.a.u(context);
        WebSettings settings = o0Var.getSettings();
        if (x1.a.u(context).V0) {
            settings.setBuiltInZoomControls(true);
        } else {
            settings.setBuiltInZoomControls(false);
        }
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMinimumFontSize(1);
        settings.setMinimumLogicalFontSize(1);
        settings.setMixedContentMode(2);
        CookieManager.getInstance().setAcceptThirdPartyCookies(o0Var, true);
        settings.setDomStorageEnabled(true);
        d dVar = aVarU.f4705x;
        String str = aVarU.f4671j;
        String str2 = aVarU.f4673k;
        dVar.getClass();
        int i5 = c.f4711a[dVar.ordinal()];
        if (i5 != 1) {
            i4 = 3;
            if (i5 != 2) {
                i4 = i5 != 3 ? -1 : 1;
            }
        } else {
            i4 = 2;
        }
        settings.setCacheMode(i4);
        settings.setDatabaseEnabled(true);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        if (TextUtils.isEmpty(f1193a)) {
            if (!TextUtils.isEmpty(str2)) {
                f1193a = str2;
            } else if (TextUtils.isEmpty(str)) {
                f1193a = o0Var.getDefaultUserAgent();
            } else {
                f1193a = o0Var.getDefaultUserAgent() + " " + str;
            }
        }
        settings.setUserAgentString(f1193a);
        if (aVarU.E == 1) {
            settings.setSupportMultipleWindows(false);
        } else {
            settings.setSupportMultipleWindows(aVarU.f4693r);
        }
        settings.setGeolocationEnabled(aVarU.J0.f4863a);
        settings.setMediaPlaybackRequiresUserGesture(false);
        int i6 = aVarU.C0;
        if (i6 > 0) {
            settings.setTextZoom(i6);
        }
        if (aVarU.D0) {
            o0Var.setOverScrollMode(2);
        }
        if (e4.a.R("PAYMENT_REQUEST")) {
            if (i.f.b()) {
                s1.a.a(settings).g();
            } else {
                q.t("This method is not supported by the current version of the framework and the current WebView APK");
            }
        }
    }
}
