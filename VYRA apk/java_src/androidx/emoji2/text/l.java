package androidx.emoji2.text;

import a3.h0;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import co.median.android.MainActivity;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;
import u1.f0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f565i;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i4) {
        this.f = i4;
        this.f563g = obj;
        this.f564h = obj2;
        this.f565i = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                h0 h0Var = (h0) this.f563g;
                u1.h0 h0Var2 = (u1.h0) this.f564h;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f565i;
                try {
                    v vVarM = e4.a.m((Context) h0Var.f84g);
                    if (vVarM == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    u uVar = (u) ((j) vVarM.f549b);
                    synchronized (uVar.f583i) {
                        uVar.f585k = threadPoolExecutor;
                        break;
                    }
                    ((j) vVarM.f549b).u(new m(h0Var2, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    h0Var2.P(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ((MainActivity) ((x1.g) this.f563g)).V(t2.i.e((String) this.f564h, (JSONObject) this.f565i), null);
                return;
            case 2:
                f0 f0Var = (f0) this.f563g;
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.f564h;
                Map<String, String> map = (Map) this.f565i;
                MainActivity mainActivity = f0Var.f3920b;
                ((WebView) mainActivity.G).loadUrl(webResourceRequest.getUrl().toString(), map);
                return;
            default:
                MainActivity mainActivity2 = (MainActivity) this.f563g;
                String str = (String) this.f564h;
                u1.x xVar = (u1.x) this.f565i;
                int i4 = MainActivity.G0;
                try {
                    xVar.b(mainActivity2, new JSONObject(str));
                    return;
                } catch (JSONException unused) {
                    xVar.b(mainActivity2, Uri.parse(str));
                    return;
                }
        }
    }
}
