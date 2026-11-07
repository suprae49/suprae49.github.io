package x1;

import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public interface i {
    boolean canGoBack();

    void clearCache(boolean z4);

    void clearFocus();

    void destroy();

    void evaluateJavascript(String str, ValueCallback valueCallback);

    String getDefaultUserAgent();

    WebView.HitTestResult getHitTestResult();

    ViewParent getParent();

    int getProgress();

    int getScrollX();

    WebSettings getSettings();

    String getTitle();

    String getUrl();

    void onPause();

    void onResume();

    void stopLoading();
}
