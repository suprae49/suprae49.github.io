package u1;

import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import co.median.android.GoNativeApplication;
import co.median.android.MainActivity;
import co.median.android.MySwipeRefreshLayout;
import co.median.android.widget.GoNativeDrawerLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f3900s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f3901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3905e;
    public final k.a f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final double f3910k;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f3913o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f3914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b.g f3915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueCallback f3916r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f3906g = new Handler();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3907h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3908i = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f3911l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3912m = false;

    public e2(MainActivity mainActivity) {
        this.f3909j = false;
        this.f3914p = false;
        this.f3901a = mainActivity;
        this.f = new k.a(mainActivity);
        x1 x1Var = mainActivity.C0;
        if (x1Var != null) {
            x1Var.f4141d = this;
        }
        x1.a aVarU = x1.a.u(mainActivity);
        String str = aVarU.S;
        if (str != null) {
            this.f3902b = "median_profile_picker.parseJson(eval(" + t2.i.x(str) + "))";
            this.f3903c = "gonative_profile_picker.parseJson(eval(" + t2.i.x(str) + "))";
        }
        if (mainActivity.getIntent().getBooleanExtra("io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN", false)) {
            this.f3909j = true;
        }
        this.f3910k = aVarU.f4703w;
        this.n = ((GoNativeApplication) mainActivity.getApplication()).n;
        this.f3913o = ((GoNativeApplication) mainActivity.getApplication()).f1169o;
        this.f3914p = ((GoNativeApplication) mainActivity.getApplication()).f1167l;
        p pVar = new p();
        pVar.f4045e = new ArrayList();
        this.f3915q = (b.g) mainActivity.s(pVar, new d3.a0(9, this));
    }

    public final void a() {
        String str = this.n;
        if (TextUtils.isEmpty(str) || this.f3912m) {
            return;
        }
        try {
            this.f3901a.V("(function() {var parent = document.getElementsByTagName('head').item(0);var style = document.createElement('style');style.type = 'text/css';style.id = 'median-custom-css';style.innerHTML = window.atob('" + str + "');parent.appendChild(style);return document.getElementById('median-custom-css') !== null;})()", new y1(this, 1));
        } catch (Exception e5) {
            x1.f.a().d("u1.e2", "Error injecting customCSS via javascript", e5);
        }
    }

    public final boolean b(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        if (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https")) {
            return false;
        }
        x1.a aVarU = x1.a.u(this.f3901a);
        x1.f fVar = aVarU.T;
        String string = uri.toString();
        ArrayList arrayList = fVar.f4716a;
        if (arrayList != null && !arrayList.isEmpty()) {
            return fVar.b(string).equals("internal");
        }
        String host = uri.getHost();
        String str = aVarU.f;
        if (host == null) {
            return false;
        }
        if (host.equals(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(".");
        sb.append(str);
        return host.endsWith(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    public final void c(String str) {
        boolean zBooleanValue;
        boolean z4;
        MainActivity mainActivity = this.f3901a;
        mainActivity.G.evaluateJavascript("window.devicePixelRatio", new y1(this, 0));
        try {
            o0 o0Var = (o0) mainActivity.G;
            if (o0Var.f4028j.equals(str)) {
                o0Var.f4028j = "";
                o0Var.stopLoading();
                o0Var.reload();
                return;
            }
        } catch (Exception unused) {
        }
        x1 x1Var = mainActivity.C0;
        if (x1Var != null) {
            x1Var.f4142e = true;
        }
        this.f3907h = 3;
        this.f3906g.removeCallbacksAndMessages(null);
        this.f.f2465c = str;
        androidx.emoji2.text.p.l().o(str);
        Uri uri = Uri.parse(str);
        if (x1.a.u(mainActivity).M != null && b(uri)) {
            mainActivity.f1171b0.c();
        }
        mainActivity.Y.run();
        w1 w1Var = mainActivity.Q;
        if (w1Var != null) {
            w1Var.a(str);
        }
        q1 q1Var = mainActivity.S;
        if (q1Var != null) {
            q1Var.a(str);
            q1 q1Var2 = mainActivity.S;
            GoNativeDrawerLayout goNativeDrawerLayout = q1Var2.f4059b;
            MainActivity mainActivity2 = q1Var2.f4058a;
            x1.a aVarU = x1.a.u(mainActivity2);
            ArrayList arrayList = aVarU.I;
            if (arrayList != null && !arrayList.isEmpty()) {
                int i4 = 0;
                while (true) {
                    if (i4 >= aVarU.I.size()) {
                        zBooleanValue = false;
                        break;
                    } else {
                        if (((Pattern) aVarU.I.get(i4)).matcher(str).matches()) {
                            zBooleanValue = ((Boolean) aVarU.J.get(i4)).booleanValue();
                            break;
                        }
                        i4++;
                    }
                }
            } else {
                zBooleanValue = true;
            }
            q1Var2.b(zBooleanValue);
            if (goNativeDrawerLayout.g(8388611) != 1) {
                if (aVarU.C) {
                    x1.i iVar = mainActivity2.G;
                    if (iVar == null ? false : iVar.canGoBack()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                goNativeDrawerLayout.setDisableTouch(z4);
            }
        }
        h2 h2Var = ((GoNativeApplication) mainActivity.getApplication()).f1163h;
        h2Var.f3956l = true;
        o0 o0Var2 = h2Var.f3952h;
        if (o0Var2 != null) {
            o0Var2.stopLoading();
            h2Var.f3954j = false;
        }
        boolean zEquals = "file:///android_asset/offline.html".equals(str);
        MySwipeRefreshLayout mySwipeRefreshLayout = mainActivity.M;
        if (zEquals) {
            if (mySwipeRefreshLayout != null) {
                mySwipeRefreshLayout.setEnabled(true);
            }
        } else if (mySwipeRefreshLayout != null) {
            mainActivity.M.setEnabled(x1.a.u(mainActivity).B);
        }
        this.f3912m = false;
    }

    public final void d(x1.i iVar, int i4, String str, String str2) {
        int i5;
        NetworkInfo activeNetworkInfo;
        MainActivity mainActivity = this.f3901a;
        if (str != null && str.contains("net::ERR_CACHE_MISS")) {
            mainActivity.runOnUiThread(new d3.d0(12, iVar));
            return;
        }
        if (!x1.a.u(mainActivity).W || (!((i5 = this.f3907h) == 3 || i5 == 2) || ((activeNetworkInfo = mainActivity.P.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && (i4 != -2 || str2 == null || iVar.getUrl() == null || !str2.equals(iVar.getUrl()))))) {
            mainActivity.runOnUiThread(new d3.d0(13, this));
        } else {
            mainActivity.runOnUiThread(new androidx.activity.k(15, iVar));
        }
    }

    public final void e(String str) {
        MainActivity mainActivity = this.f3901a;
        HashMap mapY = h0.y(mainActivity);
        mapY.put("isFirstLaunch", Boolean.valueOf(this.f3914p));
        x xVar = ((GoNativeApplication) mainActivity.getApplication()).f1168m;
        xVar.getClass();
        HashMap map = new HashMap();
        Iterator it = ((ArrayList) xVar.a()).iterator();
        if (it.hasNext()) {
            throw androidx.fragment.app.u.j(it);
        }
        mapY.putAll(map);
        mainActivity.V(t2.i.e(str, new JSONObject(mapY)), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        if (r8 == 1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(x1.i r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.e2.f(x1.i, java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0239, code lost:
    
        if (r5.M(r12) != false) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(x1.i r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.e2.g(x1.i, java.lang.String):boolean");
    }
}
