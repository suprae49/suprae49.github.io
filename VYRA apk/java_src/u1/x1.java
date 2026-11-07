package u1;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.webkit.CookieManager;
import co.median.android.MainActivity;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f4138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1.i f4140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e2 f4141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4142e;

    public x1(MainActivity mainActivity, boolean z4) {
        this.f4138a = mainActivity;
        this.f4139b = z4;
        x1.i iVar = mainActivity.G;
        iVar.getClass();
        this.f4140c = iVar;
    }

    public final void a(String str, boolean z4, boolean z5) throws JSONException {
        if (str == null || y3.j.w(str)) {
            return;
        }
        if (!this.f4139b || !z4 || !((ArrayList) this.f4138a.f1191z0.f580d).contains("_median_url_changed")) {
            ((o0) this.f4140c).loadUrl(str);
            return;
        }
        if (str.startsWith("javascript:")) {
            ((o0) this.f4140c).a(str);
            return;
        }
        if (!z5) {
            e2 e2Var = this.f4141d;
            if (e2Var == null) {
                r3.g.c("urlNavigation");
                throw null;
            }
            if (e2Var.g(this.f4140c, str)) {
                return;
            }
        }
        if (y3.j.w(str)) {
            return;
        }
        MainActivity mainActivity = this.f4138a;
        JSONObject jSONObjectPut = new JSONObject().put(ImagesContract.URL, str);
        androidx.emoji2.text.t tVar = mainActivity.f1191z0;
        if (tVar != null) {
            synchronized (tVar) {
                try {
                    if (TextUtils.isEmpty("_median_url_changed")) {
                        return;
                    }
                    if (((ArrayList) tVar.f580d).contains("_median_url_changed")) {
                        tVar.q("_median_url_changed", jSONObjectPut);
                    } else {
                        ((HashMap) tVar.f579c).put("_median_url_changed", jSONObjectPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(String str, boolean z4, boolean z5) {
        w1 w1Var;
        if (str == null) {
            return;
        }
        MainActivity mainActivity = this.f4138a;
        mainActivity.f1175h0 = null;
        mainActivity.f1176i0 = null;
        if (str.equalsIgnoreCase("median_logout") || str.equalsIgnoreCase("gonative_logout")) {
            mainActivity.G.stopLoading();
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeAllCookies(new u0());
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new androidx.activity.k(12, cookieManager));
            mainActivity.v0(false);
            mainActivity.f1171b0.c();
            ((o0) mainActivity.G).loadUrl(x1.a.u(mainActivity).t());
        } else {
            a(str, z4, z5);
        }
        if (z5 || (w1Var = mainActivity.Q) == null) {
            return;
        }
        w1Var.d(str, null);
    }

    public final void c(String str, String str2, boolean z4) {
        w1 w1Var;
        str2.getClass();
        String url = this.f4140c.getUrl();
        MainActivity mainActivity = this.f4138a;
        if ((str == null || y3.j.w(str)) && ((url == null || y3.j.w(url)) && r3.g.a(str, url))) {
            mainActivity.V(str2, null);
            mainActivity.f1176i0 = str2;
        } else {
            mainActivity.f1175h0 = str2;
            mainActivity.f1176i0 = str2;
            a(str, true, z4);
        }
        if (z4 || (w1Var = mainActivity.Q) == null) {
            return;
        }
        w1Var.d(str, str2);
    }
}
