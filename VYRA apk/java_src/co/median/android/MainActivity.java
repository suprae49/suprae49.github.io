package co.median.android;

import a3.h0;
import android.animation.ObjectAnimator;
import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.MimeTypeMap;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.activity.j0;
import androidx.activity.k;
import androidx.activity.m0;
import androidx.activity.p;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.t;
import androidx.emoji2.text.x;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import c0.c;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import co.median.android.widget.GoNativeDrawerLayout;
import co.median.android.widget.MedianProgressView;
import co.median.android.widget.SwipeHistoryNavigationLayout;
import co.median.android.widget.WebViewContainerView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import d3.a0;
import e.j;
import e.z;
import j.r;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.CookieHandler;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.Stack;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import k.h3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.p0;
import t1.l;
import u1.a1;
import u1.b1;
import u1.e;
import u1.e0;
import u1.g0;
import u1.g2;
import u1.h;
import u1.h2;
import u1.i0;
import u1.j1;
import u1.j2;
import u1.k0;
import u1.k1;
import u1.n;
import u1.n1;
import u1.o;
import u1.o0;
import u1.p1;
import u1.q1;
import u1.r0;
import u1.r1;
import u1.s0;
import u1.t0;
import u1.v0;
import u1.v1;
import u1.w;
import u1.w0;
import u1.w1;
import u1.x0;
import u1.x1;
import u1.y;
import u1.y0;
import u1.y1;
import u1.z0;
import v2.m;
import v2.s;
import x1.f;
import x1.g;
import x1.i;
import z1.b;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends j implements Observer, g, w1.g {
    public static final /* synthetic */ int G0 = 0;
    public String A0;
    public String B0;
    public x1 C0;
    public r1 D0;
    public WebViewContainerView F;
    public i G;
    public View J;
    public String K;
    public MedianProgressView L;
    public MySwipeRefreshLayout M;
    public SwipeHistoryNavigationLayout N;
    public RelativeLayout O;
    public w1 Q;
    public e R;
    public q1 S;
    public boolean T;
    public String X;
    public o Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public w f1170a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public s0 f1171b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public x f1172c0;
    public z d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public k0 f1173e0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f1175h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f1176i0;
    public Stack j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public r0 f1177k0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public String f1180n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public String f1181o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public z0 f1182p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public SignalStrength f1183q0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b.g f1185s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public b.g f1186t0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f1188w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public h0 f1189x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f1190y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public t f1191z0;
    public boolean E = false;
    public boolean H = false;
    public final Stack I = new Stack();
    public ConnectivityManager P = null;
    public boolean U = false;
    public final Handler V = new Handler();
    public float W = 0.0f;
    public final x0 Y = new x0(this, 0);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final u1.x f1174f0 = new u1.x(this);
    public boolean g0 = false;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final ArrayList f1178l0 = new ArrayList();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final ArrayList f1179m0 = new ArrayList();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f1184r0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f1187u0 = "";
    public boolean v0 = false;
    public float E0 = 3.0f;
    public float F0 = -1.0f;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public class a {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onReadyState$0(String str) {
            int i4 = MainActivity.G0;
            MainActivity mainActivity = MainActivity.this;
            mainActivity.getClass();
            x0 x0Var = mainActivity.Y;
            Handler handler = mainActivity.V;
            double d5 = x1.a.u(mainActivity).f4688p0;
            if (str.equals("loading") || (Double.isNaN(d5) && str.equals("interactive"))) {
                mainActivity.g0 = true;
            } else if ((!Double.isNaN(d5) && str.equals("interactive")) || (mainActivity.g0 && str.equals("complete"))) {
                if (str.equals("interactive")) {
                    mainActivity.n0(d5);
                } else {
                    mainActivity.m0();
                }
                if (mainActivity.f1188w0) {
                    handler.removeCallbacks(x0Var);
                }
            }
            if (str.equals("complete") || str.equals("interactive")) {
                mainActivity.f1188w0 = true;
                handler.removeCallbacks(x0Var);
                mainActivity.Z(x1.a.u(mainActivity).A, null);
            }
        }

        @JavascriptInterface
        public void onReadyState(String str) {
            MainActivity.this.runOnUiThread(new p(this, 9, str));
        }
    }

    public static String H(Intent intent) {
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("targetUrl");
        if (stringExtra != null && !stringExtra.isEmpty()) {
            return stringExtra;
        }
        if (!"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null || !(data.getScheme().endsWith(".http") || data.getScheme().endsWith(".https"))) {
            return intent.getDataString();
        }
        Uri.Builder builderBuildUpon = data.buildUpon();
        if (data.getScheme().endsWith(".https")) {
            builderBuildUpon.scheme("https");
        } else if (data.getScheme().endsWith(".http")) {
            builderBuildUpon.scheme("http");
        }
        return builderBuildUpon.build().toString();
    }

    public final void A() {
        g0 g0Var = (g0) ((LinkedHashMap) E().f592a).get(this.X);
        if (g0Var != null ? g0Var.f3931b : false) {
            return;
        }
        finish();
    }

    public final void B() {
        Menu menu = this.Q.f4120b.getMenu();
        menu.setGroupCheckable(0, true, false);
        for (int i4 = 0; i4 < menu.size(); i4++) {
            menu.getItem(i4).setChecked(false);
        }
        menu.setGroupCheckable(0, true, true);
    }

    public final void C(String str, String str2, boolean z4, boolean z5, String str3) {
        String mimeTypeFromExtension;
        o oVar = this.Z;
        MainActivity mainActivity = oVar.f4016a;
        if (TextUtils.isEmpty(str)) {
            Log.d("u1.o", "downloadFile: Url empty!");
            o.g(mainActivity, str3, "URL cannot be empty.");
            return;
        }
        if (str.startsWith("blob:")) {
            if (oVar.f4017b == 2) {
                z5 = true;
            }
            if (oVar.h(new n(str, str2, z5, str3))) {
                return;
            }
            mainActivity.f1170a0.d(str, str2, z5, str3);
            return;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl == null || fileExtensionFromUrl.isEmpty() || (mimeTypeFromExtension = singleton.getMimeTypeFromExtension(fileExtensionFromUrl)) == null) {
            mimeTypeFromExtension = "*/*";
        }
        oVar.j(str, str2, mimeTypeFromExtension, z4, z5, str3);
    }

    public final void D(boolean z4) {
        if (z4) {
            l.o(this);
        } else {
            l.b(this);
        }
    }

    public final x E() {
        return ((GoNativeApplication) getApplication()).f1165j;
    }

    public final void F(String str) {
        if (this.f1173e0 == null || TextUtils.isEmpty(str)) {
            return;
        }
        V(t2.i.e(str, this.f1173e0.a()), null);
    }

    public final void G(String[] strArr, a1 a1Var) {
        for (String str : strArr) {
            if (c.checkSelfPermission(this, str) != 0) {
                b1 b1Var = new b1();
                b1Var.f3859a = strArr;
                b1Var.f3860b = a1Var;
                this.f1178l0.add(b1Var);
                b0.a.a(this, strArr, 199);
                return;
            }
        }
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = 0;
        }
        a1Var.c(strArr, iArr);
    }

    public final void I() {
        File file = new File(getCacheDir(), "webviewDatabase");
        if (file.mkdirs()) {
            Log.v("co.median.android.MainActivity", "databasePath " + file.toString() + " exists");
        }
        androidx.emoji2.text.p pVarL = androidx.emoji2.text.p.l();
        pVarL.getClass();
        String str = x1.a.u(this).L;
        if (str != null && !str.isEmpty()) {
            try {
                pVarL.f568g = Pattern.compile(str);
            } catch (PatternSyntaxException e5) {
                f.a().d("androidx.emoji2.text.p", e5.getMessage(), e5);
            }
        }
        if (!x1.a.u(this).f4684o) {
            h hVar = new h(0);
            hVar.f3939b = new WeakReference(this);
            hVar.execute(new Void[0]);
        }
        this.f1172c0 = ((GoNativeApplication) getApplication()).f1162g;
    }

    public final void J() {
        if (this.f1182p0 != null) {
            return;
        }
        this.f1182p0 = new z0(this);
        try {
            TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
            if (telephonyManager == null) {
                f.a().d("co.median.android.MainActivity", "Error getting system telephony manager", null);
            } else {
                telephonyManager.listen(this.f1182p0, 256);
            }
        } catch (Exception e5) {
            f.a().d("co.median.android.MainActivity", "Error listening for signal strength", e5);
        }
    }

    public final void K(String str) {
        x1 x1Var = this.C0;
        if (x1Var != null) {
            x1Var.b(str, false, false);
        }
    }

    public final boolean L() {
        if (!x1.a.u(this).X) {
            WebChromeClient webChromeClient = ((o0) this.G).f4026h;
            if (webChromeClient != null && (webChromeClient instanceof e0)) {
                e0 e0Var = (e0) webChromeClient;
                if (e0Var.f3897e) {
                    e0Var.onHideCustomView();
                    return true;
                }
            }
            q1 q1Var = this.S;
            if (q1Var != null) {
                GoNativeDrawerLayout goNativeDrawerLayout = q1Var.f4059b;
                NavigationView navigationView = q1Var.f4061d;
                goNativeDrawerLayout.getClass();
                if (y0.f.l(navigationView)) {
                    this.S.f4059b.d(false);
                    return true;
                }
            }
            i iVar = this.G;
            if (!(iVar == null ? false : iVar.canGoBack())) {
                if (this.j0.isEmpty()) {
                    return false;
                }
                Bundle bundle = (Bundle) this.j0.pop();
                o0 o0Var = new o0(this);
                o0Var.restoreState(bundle);
                r0(o0Var, false, true);
                return true;
            }
            i iVar2 = this.G;
            if (iVar2 != null) {
                int i4 = o0.f4024u;
                ((o0) iVar2).goBack();
                return true;
            }
        }
        return true;
    }

    public final boolean M(String str) {
        x1.a aVarU = x1.a.u(this);
        x xVarE = E();
        String str2 = null;
        if (aVarU.F) {
            String strT = aVarU.t();
            if ((str == null || strT == null) ? false : str.trim().replaceAll("/+$", "").equals(strT.trim().replaceAll("/+$", ""))) {
                this.T = true;
                String str3 = this.X;
                LinkedHashMap linkedHashMap = (LinkedHashMap) xVarE.f592a;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) xVarE.f592a;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    g0 g0Var = (g0) entry.getValue();
                    if (TextUtils.equals(str3, (CharSequence) entry.getKey())) {
                        g0Var.f3931b = true;
                    } else {
                        g0Var.f3931b = false;
                    }
                }
                g0 g0Var2 = (g0) linkedHashMap2.get(this.X);
                if (g0Var2 != null) {
                    g0Var2.f3932c = -1;
                    g0Var2.f3933d = -1;
                }
                I();
                e eVar = this.R;
                if (eVar != null) {
                    eVar.d(this.T);
                    this.R.c(str, true);
                }
                q1 q1Var = this.S;
                if (q1Var != null) {
                    q1Var.c(this.T);
                    q1 q1Var2 = this.S;
                    boolean z4 = aVarU.H;
                    GoNativeDrawerLayout goNativeDrawerLayout = q1Var2.f4059b;
                    if (z4) {
                        goNativeDrawerLayout.setDrawerLockMode(0);
                        p1 p1Var = q1Var2.f4060c;
                        if (p1Var != null) {
                            goNativeDrawerLayout.a(p1Var);
                        }
                    } else {
                        goNativeDrawerLayout.setDrawerLockMode(1);
                        p1 p1Var2 = q1Var2.f4060c;
                        if (p1Var2 != null) {
                            goNativeDrawerLayout.p(p1Var2);
                        }
                    }
                    p1 p1Var3 = this.S.f4060c;
                    if (p1Var3 != null) {
                        p1Var3.e();
                    }
                }
                g0 g0Var3 = (g0) linkedHashMap2.get(this.X);
                if (g0Var3 != null) {
                    g0Var3.f3934e = true;
                }
                xVarE.c(null);
                xVarE.f594c = new y(this, str, xVarE);
                return true;
            }
        }
        Iterator it = ((LinkedHashMap) xVarE.f592a).entrySet().iterator();
        while (it.hasNext()) {
            g0 g0Var4 = (g0) ((Map.Entry) it.next()).getValue();
            if (!g0Var4.f3931b) {
                str2 = g0Var4.f3930a;
                break;
            }
        }
        xVarE.c(str2);
        xVarE.f(str2);
        return false;
    }

    public final void N() {
        R();
        if (x1.a.u(this).B0) {
            new Handler().postDelayed(new x0(this, 1), 1000);
        } else {
            this.M.setRefreshing(false);
        }
    }

    public final void O(Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            int color = c.getColor(this, R.color.colorPrimary) | (-16777216);
            int color2 = c.getColor(this, R.color.titleTextColor);
            o.c cVar = new o.c();
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", color);
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", color2);
            cVar.f3129d = bundle;
            Intent intent = (Intent) cVar.a().f84g;
            intent.setData(uri);
            this.f1186t0.a(intent);
        } catch (Exception e5) {
            if (e5 instanceof ActivityNotFoundException) {
                Toast.makeText(this, R.string.app_not_installed, 1).show();
                f.a().d("co.median.android.MainActivity", getString(R.string.app_not_installed), e5);
            } else {
                f.a().d("co.median.android.MainActivity", "openAppBrowser: launchError - uri: " + uri, e5);
            }
        }
    }

    public final void P(Uri uri) {
        ActivityInfo activityInfo;
        if (uri == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(268435456);
            ArrayList arrayList = x1.a.u(this).f4661f0;
            if ((arrayList == null || arrayList.isEmpty()) ? false : arrayList.contains(uri.getHost())) {
                ResolveInfo resolveInfoResolveActivity = getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 65536);
                intent.setPackage((resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo.packageName);
            }
            startActivity(intent);
        } catch (Exception e5) {
            if (e5 instanceof ActivityNotFoundException) {
                Toast.makeText(this, R.string.app_not_installed, 1).show();
                f.a().d("co.median.android.MainActivity", getString(R.string.app_not_installed), e5);
            } else {
                f.a().d("co.median.android.MainActivity", "openExternalBrowser: launchError - uri: " + uri, e5);
            }
        }
    }

    public final void Q(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri uri = Uri.parse(str);
        if ("internal".equals(str2)) {
            K(str);
            return;
        }
        if ("external".equals(str2)) {
            P(uri);
            return;
        }
        if ("appbrowser".equals(str2)) {
            O(uri);
            return;
        }
        x1.a aVarU = x1.a.u(this);
        if (!aVarU.D || aVarU.E <= 0 || ((LinkedHashMap) E().f592a).size() < aVarU.E || !M(str)) {
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.putExtra("isRoot", false);
            intent.putExtra(ImagesContract.URL, str);
            intent.putExtra("ignoreInterceptMaxWindows", true);
            startActivityForResult(intent, 400);
        }
    }

    public final void R() {
        WebHistoryItem itemAtIndex;
        String url = this.G.getUrl();
        if (url == null || !url.equals("file:///android_asset/offline.html")) {
            this.f1175h0 = this.f1176i0;
            ((o0) this.G).loadUrl(url);
            return;
        }
        if (this.G.canGoBack()) {
            o0 o0Var = (o0) this.G;
            o0Var.getClass();
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = o0Var.copyBackForwardList();
                int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex() - 1;
                while (true) {
                    if (currentIndex < 0) {
                        itemAtIndex = null;
                        break;
                    }
                    itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex);
                    if (!itemAtIndex.getUrl().equals("file:///android_asset/offline.html")) {
                        break;
                    } else {
                        currentIndex--;
                    }
                }
                if (itemAtIndex != null) {
                    o0Var.f4028j = itemAtIndex.getUrl();
                }
                o0Var.goBack();
            } catch (Exception unused) {
            }
        } else {
            String str = this.K;
            if (str != null) {
                ((o0) this.G).loadUrl(str);
            }
        }
        this.f1171b0.c();
    }

    public final void S() {
        h0 h0Var = this.f1189x0;
        if (h0Var != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((androidx.emoji2.text.p) h0Var.f84g).n(), (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.addListener(new b3.f(9, this));
            objectAnimatorOfFloat.start();
        }
    }

    public final void T() {
        NetworkInfo activeNetworkInfo;
        i iVar = this.G;
        if (iVar != null && iVar.getProgress() >= 100) {
            String url = this.G.getUrl();
            if (url == null || url.equals("file:///android_asset/offline.html")) {
                Stack stack = this.I;
                if (stack.isEmpty() || (activeNetworkInfo = this.P.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                    return;
                }
                K((String) stack.pop());
            }
        }
    }

    public final void U(String str, boolean z4) {
        if (z4) {
            this.f1187u0 = str;
            this.f1185s0.a("android.permission.READ_PHONE_STATE");
            return;
        }
        HashMap mapY = u1.h0.y(this);
        mapY.put("isFirstLaunch", Boolean.valueOf(((GoNativeApplication) getApplication()).f1167l));
        u1.x xVar = ((GoNativeApplication) getApplication()).f1168m;
        xVar.getClass();
        HashMap map = new HashMap();
        Iterator it = ((ArrayList) xVar.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        mapY.putAll(map);
        V(t2.i.e(str, new JSONObject(mapY)), null);
    }

    public final void V(String str, y1 y1Var) {
        if (str == null) {
            return;
        }
        i iVar = this.G;
        if (y1Var != null) {
            ((o0) iVar).evaluateJavascript(str, y1Var);
        } else {
            ((o0) iVar).evaluateJavascript(str, null);
        }
    }

    public final void W(int i4) {
        w1 w1Var = this.Q;
        if (w1Var == null) {
            return;
        }
        BottomNavigationView bottomNavigationView = w1Var.f4120b;
        if (i4 < 0 || i4 >= bottomNavigationView.getMenu().size()) {
            return;
        }
        w1Var.f4133q = false;
        bottomNavigationView.setSelectedItemId(i4);
    }

    public final void X(String str) {
        NetworkInfo activeNetworkInfo = this.P.getActiveNetworkInfo();
        boolean z4 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        String typeName = activeNetworkInfo != null ? activeNetworkInfo.getTypeName() : "DISCONNECTED";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("connected", z4);
            jSONObject.put("type", typeName);
            if (this.f1183q0 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("cdmaDbm", this.f1183q0.getCdmaDbm());
                jSONObject2.put("cdmaEcio", this.f1183q0.getCdmaEcio());
                jSONObject2.put("evdoDbm", this.f1183q0.getEvdoDbm());
                jSONObject2.put("evdoEcio", this.f1183q0.getEvdoEcio());
                jSONObject2.put("evdoSnr", this.f1183q0.getEvdoSnr());
                jSONObject2.put("gsmBitErrorRate", this.f1183q0.getGsmBitErrorRate());
                jSONObject2.put("gsmSignalStrength", this.f1183q0.getGsmSignalStrength());
                jSONObject2.put("level", this.f1183q0.getLevel());
                jSONObject.put("cellSignalStrength", jSONObject2);
            }
            V(t2.i.e(str, jSONObject), null);
        } catch (JSONException e5) {
            f.a().d("co.median.android.MainActivity", "JSON error sending connectivity", e5);
        }
    }

    public final void Y(String str) {
        if (str == null) {
            return;
        }
        this.f1181o0 = str;
        if (this.f1182p0 != null) {
            X(str);
        } else {
            J();
            new Handler().postDelayed(new x0(this, 2), 500L);
        }
    }

    public final void Z(float f, String str) {
        try {
            if (f <= 0.0f) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("error", "Invalid value");
                V(t2.i.e(str, jSONObject), null);
                return;
            }
            V("(function() {  var targetScale = " + f + ";  var meta = document.querySelector('meta[name=viewport]');  if (!meta) {    meta = document.createElement('meta');    meta.name = 'viewport';    document.head.appendChild(meta);  }  var deviceWidth = window.screen.width;  var newWidth = deviceWidth / targetScale;  var content = meta.getAttribute('content') || '';  var parts = content.split(',').map(function(p) { return p.trim(); });  var foundScale = false;  var foundWidth = false;  for (var i = 0; i < parts.length; i++) {    if (parts[i].startsWith('initial-scale=')) {      parts[i] = 'initial-scale=' + targetScale;      foundScale = true;    } else if (parts[i].startsWith('width=')) {      parts[i] = 'width=' + newWidth;      foundWidth = true;    }  }  if (!foundScale) {    parts.push('initial-scale=' + targetScale);  }  if (!foundWidth) {    parts.push('width=' + newWidth);  }  meta.setAttribute('content', parts.join(', '));})();", null);
            if (f > 0.0f) {
                try {
                    ((WebView) this.G).zoomBy((this.E0 * f) / this.F0);
                } catch (IllegalArgumentException e5) {
                    f.a().d("co.median.android.MainActivity", "setAbsoluteZoom: ", e5);
                }
            }
            x1.a aVarU = x1.a.u(this);
            aVarU.A = f;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("initialZoom", f);
                aVarU.e("webview-zoom.json", jSONObject2);
            } catch (JSONException unused) {
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("success", true);
            V(t2.i.e(str, jSONObject3), null);
        } catch (Exception e6) {
            if (e6 instanceof JSONException) {
                return;
            }
            try {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("success", false);
                jSONObject4.put("error", e6.getMessage());
                V(t2.i.e(str, jSONObject4), null);
            } catch (JSONException unused2) {
            }
        }
    }

    public final void a0(String str) {
        if (str.isEmpty()) {
            setTitle(R.string.app_name);
        } else {
            setTitle(str);
        }
    }

    public final void b0(int i4) {
        int iB = s.e.b(i4);
        if (iB == 0) {
            setRequestedOrientation(-1);
        } else if (iB == 1) {
            setRequestedOrientation(1);
        } else {
            if (iB != 2) {
                return;
            }
            setRequestedOrientation(6);
        }
    }

    public final void c0() {
        x1.a aVarU = x1.a.u(this);
        int i4 = aVarU.f4689p1;
        if (i4 != 0) {
            b0(i4);
            return;
        }
        if (getResources().getBoolean(R.bool.isTablet)) {
            int i5 = aVarU.f4695r1;
            if (i5 != 0) {
                b0(i5);
                return;
            }
        } else {
            int i6 = aVarU.f4692q1;
            if (i6 != 0) {
                b0(i6);
                return;
            }
        }
        if (aVarU.f4698t) {
            return;
        }
        b0(1);
    }

    public final void d0(boolean z4) {
        q1 q1Var = this.S;
        if (q1Var != null) {
            q1Var.f4065i = z4;
            q1Var.b(z4);
        }
    }

    public final void e0(int i4) {
        r1 r1Var = this.D0;
        if (r1Var != null) {
            r1Var.c(i4);
        }
    }

    public final void f0(int i4) {
        r1 r1Var = this.D0;
        if (r1Var != null) {
            r1Var.c(i4);
            r1Var.d(i4);
        }
    }

    public final void g0(int i4) {
        r1 r1Var = this.D0;
        if (r1Var != null) {
            r1Var.d(i4);
        }
    }

    public final void h0(JSONObject jSONObject, int i4) {
        w1 w1Var = this.Q;
        if (w1Var == null) {
            return;
        }
        w1Var.f4132p = true;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray != null) {
            w1Var.e(jSONArrayOptJSONArray);
        }
        if (i4 != -1) {
            v1 v1Var = (v1) w1Var.f4128k.get(Integer.toString(i4));
            if (v1Var == null || jSONArrayOptJSONArray != null) {
                return;
            } else {
                w1Var.e(v1Var.f4112a);
            }
        }
        Object objOpt = jSONObject.opt("enabled");
        if (objOpt instanceof Boolean) {
            w1Var.f(((Boolean) objOpt).booleanValue());
        }
    }

    public final void i0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences sharedPreferencesX = e4.a.x(this);
        if (TextUtils.isEmpty(str)) {
            sharedPreferencesX.edit().remove("io.gonative.android.appTheme").commit();
        } else {
            sharedPreferencesX.edit().putString("io.gonative.android.appTheme", str).commit();
        }
        this.A0 = str;
        this.v0 = true;
        if (Build.VERSION.SDK_INT >= 31) {
            t2.i.N(this, str);
        } else {
            t2.i.M(str);
        }
        j0();
    }

    public final void j0() {
        ((o0) this.G).evaluateJavascript(u.m("document.documentElement.setAttribute('data-color-scheme-option', '", this.A0, "');"), null);
    }

    public final void k0(String str) {
        if (!e4.a.R("FORCE_DARK")) {
            Log.d("co.median.android.MainActivity", "Dark mode feature is not supported");
            return;
        }
        if (this.G.getSettings() == null) {
            return;
        }
        if ("dark".equals(str)) {
            s1.a.b(this.G.getSettings(), 2);
        } else if ("light".equals(str)) {
            s1.a.b(this.G.getSettings(), 0);
        } else {
            int i4 = getResources().getConfiguration().uiMode & 48;
            if (i4 == 0 || i4 == 16) {
                s1.a.b(this.G.getSettings(), 0);
            } else if (i4 == 32) {
                s1.a.b(this.G.getSettings(), 2);
            }
            if (e4.a.R("FORCE_DARK_STRATEGY")) {
                WebSettings settings = this.G.getSettings();
                if (!t1.i.f3711c.b()) {
                    q.t("This method is not supported by the current version of the framework and the current WebView APK");
                    return;
                }
                s1.a.a(settings).f();
            }
        }
        j0();
    }

    public final void l0(String str, String str2) {
        String url = this.G.getUrl();
        if (TextUtils.isEmpty(str)) {
            str = url;
        } else {
            try {
                URI uri = new URI(str);
                if (!uri.isAbsolute()) {
                    str = new URI(url).resolve(uri).toString();
                }
            } catch (URISyntaxException unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2 + System.lineSeparator() + str;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        startActivity(Intent.createChooser(intent, getString(R.string.action_share)));
    }

    public final void m0() {
        this.g0 = false;
        if (!this.U) {
            MedianProgressView medianProgressView = this.L;
            medianProgressView.setAlpha(1.0f);
            medianProgressView.setVisibility(4);
        } else {
            this.U = false;
            this.J.animate().alpha(0.0f).setDuration(300L).setStartDelay(150L);
            MedianProgressView medianProgressView2 = this.L;
            medianProgressView2.animate().alpha(0.0f).setDuration(medianProgressView2.f).withEndAction(new k(17, medianProgressView2));
        }
    }

    public final void n0(double d5) {
        if (d5 <= 0.0d) {
            m0();
        } else {
            this.V.postDelayed(new t0(this, 0), (int) (d5 * 1000.0d));
        }
    }

    public final void o0() {
        AppBarLayout appBarLayout;
        x1.a aVarU = x1.a.u(this);
        e eVar = this.R;
        u1.h0 h0Var = eVar.f3877c;
        boolean z4 = false;
        if ((h0Var != null ? h0Var.J() : false) && eVar.f3890r) {
            e eVar2 = this.R;
            if (x1.a.u(eVar2.f3875a).f4682n0 && (appBarLayout = eVar2.f3878d) != null) {
                appBarLayout.e(true, true, true);
            }
        }
        if (aVarU.f4685o0) {
            e eVar3 = this.R;
            u1.h0 h0Var2 = eVar3.f3877c;
            if ((h0Var2 != null ? h0Var2.J() : false) && eVar3.f3890r) {
                z4 = true;
            }
            if (z4) {
                return;
            }
            this.Q.g();
        }
    }

    @Override // androidx.fragment.app.e0, androidx.activity.q, android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        String stringExtra;
        boolean booleanExtra;
        super.onActivityResult(i4, i5, intent);
        Iterator it = ((ArrayList) ((GoNativeApplication) getApplication()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        if (intent != null && intent.getBooleanExtra("exit", false)) {
            finish();
        }
        if (intent != null) {
            stringExtra = intent.getStringExtra(ImagesContract.URL);
            booleanExtra = intent.getBooleanExtra("success", false);
        } else {
            stringExtra = null;
            booleanExtra = false;
        }
        if (i4 == 300 && i5 == -1) {
            if (stringExtra != null) {
                K(stringExtra);
            } else {
                ((o0) this.G).setCheckLoginSignup(false);
                ((o0) this.G).loadUrl(x1.a.u(this).t());
            }
            if (x1.a.u(this).H) {
                v0(booleanExtra);
            }
        }
        if (i4 == 400 && i5 == -1 && stringExtra != null) {
            int intExtra = intent.getIntExtra("urlLevel", -1);
            g0 g0Var = (g0) ((LinkedHashMap) E().f592a).get(this.X);
            int i6 = g0Var != null ? g0Var.f3933d : -1;
            if (intExtra == -1 || i6 == -1 || intExtra > i6) {
                this.f1175h0 = intent.getStringExtra("postLoadJavascript");
                K(stringExtra);
            } else {
                setResult(-1, intent);
                finish();
            }
        }
    }

    @Override // e.j, androidx.activity.q, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        String str;
        super.onConfigurationChanged(configuration);
        if (this.S != null && x1.a.u(this).H) {
            q1 q1Var = this.S;
            q1Var.getClass();
            p1 p1Var = q1Var.f4060c;
            if (p1Var != null) {
                p1Var.f4051a.b();
                p1Var.e();
            }
        }
        Iterator it = ((ArrayList) ((GoNativeApplication) getApplication()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        int i4 = configuration.uiMode & 48;
        if (i4 != 16) {
            str = i4 != 32 ? "" : "dark";
        } else {
            str = "light";
        }
        r1 r1Var = this.D0;
        r1Var.getClass();
        MainActivity mainActivity = r1Var.f4075a;
        Resources.Theme theme = mainActivity.getTheme();
        r1Var.c(mainActivity.getResources().getColor(R.color.statusBarBackground, theme));
        r1Var.d(mainActivity.getResources().getColor(R.color.systemNavBarBackground, theme));
        if (!y3.j.w(str)) {
            r1Var.f4085l = str;
            h0 h0Var = r1Var.f4079e;
            if (h0Var == null) {
                r3.g.c("insetsController");
                throw null;
            }
            ((e4.a) h0Var.f84g).c0(r1Var.b(str));
        }
        if (!y3.j.w(str)) {
            r1Var.f4086m = str;
            h0 h0Var2 = r1Var.f4079e;
            if (h0Var2 == null) {
                r3.g.c("insetsController");
                throw null;
            }
            ((e4.a) h0Var2.f84g).b0(r1Var.b(str));
        }
        e eVar = this.R;
        MainActivity mainActivity2 = eVar.f3875a;
        Resources.Theme theme2 = mainActivity2.getTheme();
        eVar.f3884k = c.getColor(mainActivity2, R.color.titleTextColor);
        MaterialToolbar materialToolbar = eVar.f3879e;
        materialToolbar.setBackgroundColor(mainActivity2.getResources().getColor(R.color.colorPrimary, theme2));
        Drawable navigationIcon = materialToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setColorFilter(e4.a.n(eVar.f3884k));
        }
        eVar.f.setImageDrawable(u1.h0.w(mainActivity2, R.drawable.ic_actionbar));
        mainActivity2.invalidateOptionsMenu();
        w1 w1Var = this.Q;
        MainActivity mainActivity3 = w1Var.f4119a;
        Resources.Theme theme3 = mainActivity3.getTheme();
        BottomNavigationView bottomNavigationView = w1Var.f4120b;
        bottomNavigationView.setBackgroundColor(mainActivity3.getResources().getColor(R.color.tabBarBackground, theme3));
        w1Var.f4130m = mainActivity3.getResources().getColor(R.color.tabBarTextColor, theme3);
        int color = mainActivity3.getResources().getColor(R.color.tabBarIndicator, theme3);
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{color, w1Var.f4130m});
        bottomNavigationView.setItemIconTintList(colorStateList);
        bottomNavigationView.setItemTextColor(colorStateList);
        float f = Build.VERSION.SDK_INT >= 29 ? mainActivity3.getResources().getFloat(R.dimen.material_emphasis_disabled) : 0.38f;
        int i5 = 16777215 & color;
        ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{android.R.attr.state_activated}, new int[]{android.R.attr.state_checked}}, new int[]{(Math.round(Color.alpha(color) * f) << 24) | i5, (Math.round(Color.alpha(color) * f) << 24) | i5});
        bottomNavigationView.setItemActiveIndicatorEnabled(true);
        bottomNavigationView.setItemActiveIndicatorColor(colorStateList2);
        q1 q1Var2 = this.S;
        MainActivity mainActivity4 = q1Var2.f4058a;
        q1Var2.f4061d.setBackgroundColor(mainActivity4.getResources().getColor(R.color.sidebarBackground, mainActivity4.getTheme()));
        i0 i0Var = q1Var2.f;
        MainActivity mainActivity5 = i0Var.f3958a;
        Resources.Theme theme4 = mainActivity5.getTheme();
        i0Var.f = mainActivity5.getResources().getColor(R.color.sidebarForeground, theme4);
        i0Var.f3963g = mainActivity5.getResources().getColor(R.color.sidebarBackground, theme4);
        i0Var.f3962e = mainActivity5.getResources().getColor(R.color.sidebarHighlight, theme4);
        i0Var.notifyDataSetChanged();
        k0(this.A0);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x02ea  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.e0, androidx.activity.q, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z4;
        boolean z5;
        String stringExtra;
        x1.a aVarU = x1.a.u(this);
        GoNativeApplication goNativeApplication = (GoNativeApplication) getApplication();
        x xVar = goNativeApplication.f1165j;
        u1.x xVar2 = goNativeApplication.f1168m;
        this.T = getIntent().getBooleanExtra("isRoot", true);
        String stringExtra2 = getIntent().getStringExtra("source");
        this.f1190y0 = stringExtra2;
        this.f1190y0 = TextUtils.isEmpty(stringExtra2) ? "default" : this.f1190y0;
        int i4 = 0;
        if (this.T) {
            i1.a fVar = Build.VERSION.SDK_INT >= 31 ? new m0.f(this) : new i1.a(this);
            fVar.a();
            boolean z6 = bundle != null && bundle.getBoolean("configurationChanged", false);
            if (!aVarU.f4710z0.f4871a || z6) {
                fVar.d(new v0(this, i4));
                new Handler(Looper.getMainLooper()).postDelayed(new t0(this, 2), 7000L);
            } else {
                fVar.e(new p1.h(this, goNativeApplication));
            }
        }
        r1 r1Var = new r1(this);
        this.D0 = r1Var;
        int color = getResources().getColor(R.color.statusBarBackground, null);
        String str = r1Var.f4085l;
        str.getClass();
        r1Var.f = r1Var.a(color, str);
        int color2 = getResources().getColor(R.color.systemNavBarBackground, null);
        String str2 = r1Var.f4086m;
        str2.getClass();
        m0 m0VarA = r1Var.a(color2, str2);
        r1Var.f4080g = m0VarA;
        m0 m0Var = r1Var.f;
        if (m0Var == null) {
            r3.g.c("statusBarStyle");
            throw null;
        }
        androidx.activity.t.a(this, m0Var, m0VarA);
        boolean z7 = aVarU.f4696s;
        boolean z8 = aVarU.f4678l1;
        if (z7) {
            getWindow().addFlags(128);
        }
        this.W = aVarU.f4708y0;
        this.A0 = t2.i.j(this);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 <= 30) {
            if (bundle != null ? bundle.getBoolean("ignoreThemeSetup", false) : false) {
                Log.d("co.median.android.MainActivity", "onCreate: configuration change from setupAppTheme(), ignoring theme setup");
            } else {
                t2.i.M(this.A0);
            }
        }
        super.onCreate(bundle);
        this.X = UUID.randomUUID().toString();
        int intExtra = getIntent().getIntExtra("urlLevel", -1);
        int intExtra2 = getIntent().getIntExtra("parentUrlLevel", -1);
        if (bundle != null) {
            this.X = bundle.getString("activityId", this.X);
            this.T = bundle.getBoolean("isRoot", this.T);
            intExtra = bundle.getInt("urlLevel", intExtra);
            intExtra2 = bundle.getInt("parentUrlLevel", intExtra2);
        }
        String str3 = this.X;
        boolean z9 = this.T;
        LinkedHashMap linkedHashMap = (LinkedHashMap) xVar.f592a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) xVar.f592a;
        linkedHashMap.put(str3, new g0(str3, z9));
        g0 g0Var = (g0) linkedHashMap2.get(this.X);
        if (g0Var != null) {
            g0Var.f3932c = intExtra;
            g0Var.f3933d = intExtra2;
        }
        if (aVarU.D) {
            String str4 = this.X;
            boolean booleanExtra = getIntent().getBooleanExtra("ignoreInterceptMaxWindows", false);
            g0 g0Var2 = (g0) linkedHashMap2.get(str4);
            if (g0Var2 != null) {
                g0Var2.f3934e = booleanExtra;
            }
        }
        if (this.T) {
            I();
        }
        this.f1171b0 = goNativeApplication.f;
        this.f1170a0 = new w(this);
        this.Z = new o(this);
        this.f1191z0 = new t(this);
        int i6 = 2;
        this.f1185s0 = (b.g) s(new androidx.fragment.app.r0(i6), new v0(this, 1));
        int i7 = 3;
        this.f1186t0 = (b.g) s(new androidx.fragment.app.r0(i7), new v0(this, i6));
        this.f1177k0 = new r0(this);
        h2 h2Var = goNativeApplication.f1163h;
        if (!h2Var.f3947b) {
            h2Var.f3947b = true;
            h2Var.f3946a = new k.a(this);
            h2Var.f3948c = new HashMap();
            h2Var.f3949d = new HashMap();
            h2Var.f = new ArrayList();
            h2Var.f3951g = new HashSet();
            x1.a.u(this).i(new g2(h2Var, this));
            h2Var.b(this);
        }
        this.P = (ConnectivityManager) getSystemService("connectivity");
        setContentView(R.layout.activity_median);
        Iterator it = ((ArrayList) xVar2.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        r1 r1Var2 = this.D0;
        MainActivity mainActivity = r1Var2.f4075a;
        viewGroup.getClass();
        View viewFindViewById = viewGroup.findViewById(R.id.main_layout);
        viewFindViewById.getClass();
        r1Var2.f4083j = (CoordinatorLayout) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.status_bar_background);
        viewFindViewById2.getClass();
        r1Var2.f4081h = viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.system_nav_bar_background);
        viewFindViewById3.getClass();
        r1Var2.f4082i = viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.nav_menu);
        viewFindViewById4.getClass();
        r1Var2.f4084k = viewFindViewById4;
        int i8 = 8;
        if (!r1Var2.f4076b) {
            View view = r1Var2.f4081h;
            if (view == null) {
                r3.g.c("statusBarBackgroundView");
                throw null;
            }
            view.setVisibility(8);
            View view2 = r1Var2.f4082i;
            if (view2 == null) {
                r3.g.c("systemNavBarBackgroundView");
                throw null;
            }
            view2.setVisibility(8);
        }
        a0 a0Var = new a0(i8, r1Var2);
        WeakHashMap weakHashMap = p0.f3233a;
        p0.h0.c(viewGroup, a0Var);
        r1Var2.f4079e = new h0(mainActivity.getWindow(), mainActivity.getWindow().getDecorView());
        if (i5 >= 29) {
            mainActivity.getWindow().setNavigationBarContrastEnforced(false);
        }
        if (aVarU.f4698t) {
            s0(true);
        }
        c0();
        this.O = (RelativeLayout) findViewById(R.id.fullscreen);
        MySwipeRefreshLayout mySwipeRefreshLayout = (MySwipeRefreshLayout) findViewById(R.id.swipe_refresh);
        this.M = mySwipeRefreshLayout;
        mySwipeRefreshLayout.setEnabled(aVarU.B);
        this.M.setOnRefreshListener(this);
        this.M.setCanChildScrollUpCallback(new v0(this, i7));
        Context context = aVarU.f4647a;
        if (i5 < 29) {
            z4 = false;
        } else {
            try {
                int identifier = context.getResources().getIdentifier("config_navBarInteractionMode", "integer", "android");
                if (identifier <= 0 || context.getResources().getInteger(identifier) != 2) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } catch (Resources.NotFoundException e5) {
                f.a().d("co.median.median_core.AppConfig", "isAndroidGestureEnabled: ", e5);
            }
        }
        if (z4) {
            aVarU.C = false;
        }
        SwipeHistoryNavigationLayout swipeHistoryNavigationLayout = (SwipeHistoryNavigationLayout) findViewById(R.id.swipe_history_nav);
        this.N = swipeHistoryNavigationLayout;
        swipeHistoryNavigationLayout.setEnabled(aVarU.C);
        this.N.setSwipeNavListener(new androidx.emoji2.text.p(this, aVarU, 16, false));
        this.M.setColorSchemeColors(c.getColor(this, R.color.pull_to_refresh_color));
        this.N.setActiveColor(c.getColor(this, R.color.pull_to_refresh_color));
        this.M.setProgressBackgroundColorSchemeColor(c.getColor(this, R.color.swipe_nav_background));
        this.N.setBackgroundColor(c.getColor(this, R.color.swipe_nav_background));
        this.L = (MedianProgressView) findViewById(R.id.progress);
        Iterator it2 = ((ArrayList) xVar2.a()).iterator();
        if (it2.hasNext()) {
            throw u.j(it2);
        }
        MedianProgressView medianProgressView = this.L;
        medianProgressView.getClass();
        v2.k kVar = new v2.k(medianProgressView.getContext());
        v2.l lVar = kVar.f;
        v2.f fVar2 = new v2.f(lVar);
        Context context2 = kVar.getContext();
        e.a0 jVar = lVar.f4360q == 1 ? new v2.j(context2, lVar) : new v2.h(lVar);
        s sVar = new s(context2, lVar);
        sVar.f4400s = fVar2;
        sVar.f4401t = jVar;
        jVar.f1839a = sVar;
        Resources resources = context2.getResources();
        q1.o oVar = new q1.o();
        ThreadLocal threadLocal = e0.l.f2031a;
        oVar.f = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        new q1.n(oVar.f.getConstantState());
        sVar.f4402u = oVar;
        kVar.setIndeterminateDrawable(sVar);
        kVar.setProgressDrawable(new m(kVar.getContext(), lVar, fVar2));
        kVar.n = true;
        kVar.setIndeterminate(true);
        kVar.setIndicatorColor(c.getColor(kVar.getContext(), R.color.progress_indicator));
        medianProgressView.addView(kVar);
        j2 j2Var = new j2(null, null);
        j2Var.f3973a = CookieManager.getInstance();
        CookieHandler.setDefault(j2Var);
        String stringExtra3 = getIntent().getStringExtra("postLoadJavascript");
        this.f1175h0 = stringExtra3;
        this.f1176i0 = stringExtra3;
        this.j0 = new Stack();
        w1 w1Var = new w1(this, (BottomNavigationView) findViewById(R.id.bottom_navigation));
        this.Q = w1Var;
        w1Var.f(false);
        e eVar = new e(this);
        this.R = eVar;
        eVar.d(this.T);
        q1 q1Var = new q1(this);
        this.S = q1Var;
        q1Var.c(this.T);
        if (!aVarU.f4680m0 && !aVarU.H) {
            u1.h0 h0VarV = v();
            Objects.requireNonNull(h0VarV);
            h0VarV.E();
        }
        this.J = findViewById(R.id.webviewOverlay);
        WebViewContainerView webViewContainerView = (WebViewContainerView) findViewById(R.id.webviewContainer);
        this.F = webViewContainerView;
        this.G = webViewContainerView.getWebview();
        this.C0 = new x1(this, !aVarU.f4709z);
        this.F.a(this, this.T);
        if (!z8) {
            ((o0) this.G).setOnScrollYEndListener(new v0(this, 4));
        }
        k0(this.A0);
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("webViewState");
            if (bundle2 != null) {
                try {
                    ((o0) this.G).restoreState(bundle2);
                    z5 = true;
                } catch (Exception e6) {
                    f.a().d("co.median.android.MainActivity", "Failed to restore webview state", e6);
                    z5 = false;
                }
            } else {
                z5 = false;
            }
            ((o0) this.G).scrollTo(bundle.getInt("scrollX", 0), bundle.getInt("scrollY", 0));
        } else {
            z5 = false;
        }
        if (!z5 || TextUtils.isEmpty(this.G.getUrl())) {
            Intent intent = getIntent();
            String strH = H(intent);
            if (strH == null && this.T) {
                strH = aVarU.t();
            }
            stringExtra = strH == null ? intent.getStringExtra(ImagesContract.URL) : strH;
            if (stringExtra != null) {
                HashMap map = new HashMap();
                Iterator it3 = ((ArrayList) xVar2.a()).iterator();
                if (it3.hasNext()) {
                    throw u.j(it3);
                }
                HashMap map2 = !map.isEmpty() ? map : null;
                if (map2 != null && !map2.isEmpty()) {
                    Uri.Builder builderBuildUpon = Uri.parse(stringExtra).buildUpon();
                    for (Map.Entry entry : map2.entrySet()) {
                        builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    stringExtra = builderBuildUpon.build().toString();
                }
                this.K = stringExtra;
                ((o0) this.G).loadUrl(stringExtra);
            } else if (!getIntent().getBooleanExtra("io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN", false)) {
                f.a().d("co.median.android.MainActivity", "No url specified for MainActivity", null);
            }
        } else {
            stringExtra = this.G.getUrl();
        }
        this.R.c(stringExtra, true);
        q1 q1Var2 = this.S;
        boolean z10 = this.T && aVarU.H;
        GoNativeDrawerLayout goNativeDrawerLayout = q1Var2.f4059b;
        if (z10) {
            goNativeDrawerLayout.setDrawerLockMode(0);
            p1 p1Var = q1Var2.f4060c;
            if (p1Var != null) {
                goNativeDrawerLayout.a(p1Var);
            }
        } else {
            goNativeDrawerLayout.setDrawerLockMode(1);
            p1 p1Var2 = q1Var2.f4060c;
            if (p1Var2 != null) {
                goNativeDrawerLayout.p(p1Var2);
            }
        }
        this.f1173e0 = new k0(this, viewGroup);
        aVarU.i(new y0(0, this));
        ((ArrayList) E().f593b).add(new w0(this));
        if (z8) {
            S();
        }
        boolean z11 = aVarU.I0.f4857a;
        WebViewContainerView webViewContainerView2 = this.F;
        if (webViewContainerView2 != null) {
            if (z11) {
                registerForContextMenu(webViewContainerView2);
            } else {
                unregisterForContextMenu(webViewContainerView2);
            }
        }
        j0 j0VarA = a();
        androidx.fragment.app.m0 m0Var2 = new androidx.fragment.app.m0(this);
        j0VarA.getClass();
        j0VarA.b(m0Var2);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        WebView.HitTestResult hitTestResult = this.G.getHitTestResult();
        String extra = hitTestResult.getExtra();
        int type = hitTestResult.getType();
        if (TextUtils.isEmpty(extra) || type != 7) {
            return;
        }
        this.B0 = extra;
        b bVar = x1.a.u(this).I0;
        if (bVar != null) {
            z1.c cVar = bVar.f4858b;
            if (bVar.f4857a && cVar.f4859a) {
                ArrayList arrayList = new ArrayList();
                if (cVar.f4860b) {
                    arrayList.add(getString(R.string.action_copy));
                }
                if (cVar.f4861c) {
                    arrayList.add(getString(R.string.action_open_browser));
                }
                CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
                n2.b bVar2 = new n2.b(this);
                String str = this.B0;
                e.b bVar3 = (e.b) bVar2.f1920g;
                bVar3.f1844d = str;
                u1.z zVar = new u1.z(this, arrayList, 1);
                bVar3.f1852m = charSequenceArr;
                bVar3.f1853o = zVar;
                bVar3.f1850k = new u1.a0(1, this);
                bVar2.a().show();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:120:0x0227  */
    /* JADX WARN: Code duplicated, block: B:122:0x025b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0282  */
    /* JADX WARN: Code duplicated, block: B:88:0x0185  */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) throws JSONException {
        String str;
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        final ArrayList arrayList;
        boolean z4;
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable;
        boolean z5;
        JSONArray jSONArray;
        int i4;
        ArrayList arrayList2;
        String str2;
        x1.a aVar;
        int i5;
        MaterialToolbar materialToolbar;
        g3.e eVar;
        String str3;
        int i6;
        MenuItem showAsActionFlags;
        String str4;
        HashMap map;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete;
        ImageView imageView;
        String str5;
        Menu menu2 = menu;
        getMenuInflater().inflate(R.menu.topmenu, menu2);
        final e eVar2 = this.R;
        if (eVar2 != null) {
            int i7 = eVar2.f3882i;
            MaterialToolbar materialToolbar2 = eVar2.f3879e;
            MainActivity mainActivity = eVar2.f3875a;
            menu2.getClass();
            eVar2.f3885l = menu2;
            HashMap map2 = eVar2.f3881h;
            map2.clear();
            if (eVar2.f3887o) {
                materialToolbar2.setNavigationIcon((Drawable) null);
                materialToolbar2.setNavigationOnClickListener(null);
                eVar2.f3887o = false;
            }
            x1.a aVarU = x1.a.u(mainActivity);
            HashMap map3 = aVarU.f4651b0;
            if (map3 != null && (str = eVar2.n) != null && (jSONObject = (JSONObject) map3.get(str)) != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("items")) != null && jSONArrayOptJSONArray.length() != 0) {
                boolean zOptBoolean = jSONObject.optBoolean("allowLeftMenu");
                ArrayList arrayList3 = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                int i8 = 0;
                boolean z6 = false;
                while (i8 < length) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i8);
                    int length2 = jSONArrayOptJSONArray.length() - i8;
                    if (z6) {
                        z5 = zOptBoolean;
                    } else {
                        z5 = zOptBoolean;
                        if (menu2.size() == 1 && length2 > 1) {
                            z6 = true;
                        }
                    }
                    if (z6) {
                        jSONObject2.getClass();
                        arrayList3.add(jSONObject2);
                        materialToolbar = materialToolbar2;
                        map = map2;
                        aVar = aVarU;
                        jSONArray = jSONArrayOptJSONArray;
                        arrayList2 = arrayList3;
                        i4 = length;
                        i6 = i8;
                        menu = menu2;
                    } else {
                        jSONArray = jSONArrayOptJSONArray;
                        i4 = length;
                        arrayList2 = arrayList3;
                        HashMap map4 = map2;
                        if (i8 != 0 || !z5 || eVar2.f3887o || aVarU.H || jSONObject2 == null) {
                            str2 = "fa fa-search";
                            aVar = aVarU;
                            i5 = i8;
                        } else {
                            if (eVar2.f3876b) {
                                final r3.k kVar = new r3.k();
                                aVar = aVarU;
                                kVar.f = jSONObject2.optString(ImagesContract.URL);
                                String strOptString = jSONObject2.optString("icon");
                                String strOptString2 = jSONObject2.optString("system");
                                if (strOptString2 == null || y3.j.w(strOptString2)) {
                                    i5 = i8;
                                } else {
                                    i5 = i8;
                                    int iHashCode = strOptString2.hashCode();
                                    str2 = "fa fa-search";
                                    if (iHashCode != -906336856) {
                                        if (iHashCode != 109400031) {
                                            if (iHashCode == 1085444827 && strOptString2.equals("refresh")) {
                                                kVar.f = "refresh";
                                                if (strOptString != null && !y3.j.w(strOptString)) {
                                                    str5 = "fa-rotate-right";
                                                }
                                            }
                                        } else if (strOptString2.equals("share")) {
                                            kVar.f = "share";
                                            if (strOptString != null && !y3.j.w(strOptString)) {
                                                str5 = str2;
                                            }
                                        }
                                        str5.getClass();
                                        materialToolbar2.setNavigationIcon(new v1.b(mainActivity, i7, eVar2.f3884k, str5).d());
                                        materialToolbar2.setNavigationIconTint(eVar2.f3884k);
                                        materialToolbar2.setNavigationOnClickListener(new View.OnClickListener() { // from class: u1.d
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                r3.k kVar2 = kVar;
                                                String str6 = (String) kVar2.f;
                                                boolean zA = r3.g.a(str6, "share");
                                                e eVar3 = eVar2;
                                                if (zA) {
                                                    eVar3.f3875a.l0(null, null);
                                                } else if (r3.g.a(str6, "refresh")) {
                                                    eVar3.f3875a.N();
                                                } else {
                                                    eVar3.f3875a.C0.b((String) kVar2.f, true, false);
                                                }
                                            }
                                        });
                                    } else if (strOptString2.equals("search")) {
                                        Log.e("ActionManager", "addAsLeftActionMenu: The \"search\" system menu is not supported as a left-menu yet.");
                                    }
                                }
                                str5 = strOptString;
                                str5.getClass();
                                materialToolbar2.setNavigationIcon(new v1.b(mainActivity, i7, eVar2.f3884k, str5).d());
                                materialToolbar2.setNavigationIconTint(eVar2.f3884k);
                                materialToolbar2.setNavigationOnClickListener(new View.OnClickListener() { // from class: u1.d
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        r3.k kVar2 = kVar;
                                        String str6 = (String) kVar2.f;
                                        boolean zA = r3.g.a(str6, "share");
                                        e eVar3 = eVar2;
                                        if (zA) {
                                            eVar3.f3875a.l0(null, null);
                                        } else if (r3.g.a(str6, "refresh")) {
                                            eVar3.f3875a.N();
                                        } else {
                                            eVar3.f3875a.C0.b((String) kVar2.f, true, false);
                                        }
                                    }
                                });
                            } else {
                                aVar = aVarU;
                                i5 = i8;
                            }
                            eVar2.f3887o = true;
                            menu = menu;
                            materialToolbar = materialToolbar2;
                            map = map4;
                            i6 = i5;
                        }
                        if (jSONObject2 == null) {
                            menu = menu;
                            materialToolbar = materialToolbar2;
                            map = map4;
                            i6 = i5;
                        } else {
                            String strOptString3 = jSONObject2.optString("system");
                            if (TextUtils.isEmpty(strOptString3)) {
                                materialToolbar = materialToolbar2;
                                map = map4;
                                i6 = i5;
                                String strOptString4 = jSONObject2.optString("label");
                                String strOptString5 = jSONObject2.optString("icon");
                                String strOptString6 = jSONObject2.optString(ImagesContract.URL);
                                strOptString5.getClass();
                                MenuItem showAsActionFlags2 = menu.add(0, i6, 0, strOptString4).setIcon(new v1.b(mainActivity, i7, eVar2.f3884k, strOptString5).d()).setShowAsActionFlags(2);
                                showAsActionFlags2.getClass();
                                map.put(showAsActionFlags2, strOptString6);
                            } else {
                                String strOptString7 = jSONObject2.optString("label");
                                String strOptString8 = jSONObject2.optString("icon");
                                String strOptString9 = jSONObject2.optString(ImagesContract.URL);
                                if (strOptString3 != null) {
                                    int iHashCode2 = strOptString3.hashCode();
                                    materialToolbar = materialToolbar2;
                                    if (iHashCode2 != -906336856) {
                                        if (iHashCode2 != 109400031) {
                                            if (iHashCode2 == 1085444827 && strOptString3.equals("refresh")) {
                                                eVar = new g3.e("refresh", "fa-rotate-right", "Refresh");
                                                str3 = (String) eVar.f2154h;
                                                if (!TextUtils.isEmpty(strOptString7)) {
                                                    str3 = strOptString7;
                                                }
                                                if (TextUtils.isEmpty(strOptString8)) {
                                                    strOptString8 = eVar.f2153g;
                                                }
                                                strOptString8.getClass();
                                                menu = menu;
                                                i6 = i5;
                                                showAsActionFlags = menu.add(0, i6, 0, str3).setIcon(new v1.b(mainActivity, i7, eVar2.f3884k, strOptString8).d()).setShowAsActionFlags(1);
                                                showAsActionFlags.getClass();
                                                str4 = eVar.f;
                                                if (str4.equals("search")) {
                                                    strOptString9.getClass();
                                                    final androidx.appcompat.widget.e eVar3 = new androidx.appcompat.widget.e(mainActivity);
                                                    eVar3.setLayoutParams(new h3(-1));
                                                    eVar3.setMaxWidth(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                                                    eVar3.setOnQueryTextListener(new androidx.emoji2.text.p(eVar2, 14, strOptString9));
                                                    eVar3.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: u1.a
                                                        @Override // android.view.View.OnFocusChangeListener
                                                        public final void onFocusChange(View view, boolean z7) {
                                                            if (z7 || eVar3.T) {
                                                                return;
                                                            }
                                                            e eVar4 = eVar2;
                                                            androidx.appcompat.widget.e eVar5 = eVar4.f3886m;
                                                            if (eVar5 != null) {
                                                                eVar5.setIconified(true);
                                                            }
                                                            eVar4.f3875a.invalidateOptionsMenu();
                                                        }
                                                    });
                                                    searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) eVar3.findViewById(R.id.search_src_text);
                                                    if (searchView$SearchAutoComplete != null) {
                                                        searchView$SearchAutoComplete.setTextColor(eVar2.f3884k);
                                                        int i9 = eVar2.f3884k;
                                                        searchView$SearchAutoComplete.setHintTextColor(Color.argb(192, Color.red(i9), Color.green(i9), Color.blue(i9)));
                                                    }
                                                    imageView = (ImageView) eVar3.findViewById(R.id.search_close_btn);
                                                    if (imageView != null) {
                                                        imageView.setColorFilter(eVar2.f3884k);
                                                    }
                                                    eVar2.f3886m = eVar3;
                                                    showAsActionFlags.setActionView(eVar3);
                                                    showAsActionFlags.setShowAsActionFlags(9);
                                                    showAsActionFlags.setOnActionExpandListener(new r(eVar2, showAsActionFlags));
                                                }
                                                map = map4;
                                                map.put(showAsActionFlags, str4);
                                            }
                                        } else if (strOptString3.equals("share")) {
                                            eVar = new g3.e("share", "fa-share", "Share");
                                            str3 = (String) eVar.f2154h;
                                            if (!TextUtils.isEmpty(strOptString7)) {
                                                str3 = strOptString7;
                                            }
                                            if (TextUtils.isEmpty(strOptString8)) {
                                                strOptString8 = eVar.f2153g;
                                            }
                                            strOptString8.getClass();
                                            menu = menu;
                                            i6 = i5;
                                            showAsActionFlags = menu.add(0, i6, 0, str3).setIcon(new v1.b(mainActivity, i7, eVar2.f3884k, strOptString8).d()).setShowAsActionFlags(1);
                                            showAsActionFlags.getClass();
                                            str4 = eVar.f;
                                            if (str4.equals("search")) {
                                                strOptString9.getClass();
                                                final androidx.appcompat.widget.e eVar4 = new androidx.appcompat.widget.e(mainActivity);
                                                eVar4.setLayoutParams(new h3(-1));
                                                eVar4.setMaxWidth(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                                                eVar4.setOnQueryTextListener(new androidx.emoji2.text.p(eVar2, 14, strOptString9));
                                                eVar4.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: u1.a
                                                    @Override // android.view.View.OnFocusChangeListener
                                                    public final void onFocusChange(View view, boolean z7) {
                                                        if (z7 || eVar4.T) {
                                                            return;
                                                        }
                                                        e eVar5 = eVar2;
                                                        androidx.appcompat.widget.e eVar6 = eVar5.f3886m;
                                                        if (eVar6 != null) {
                                                            eVar6.setIconified(true);
                                                        }
                                                        eVar5.f3875a.invalidateOptionsMenu();
                                                    }
                                                });
                                                searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) eVar4.findViewById(R.id.search_src_text);
                                                if (searchView$SearchAutoComplete != null) {
                                                    searchView$SearchAutoComplete.setTextColor(eVar2.f3884k);
                                                    int i10 = eVar2.f3884k;
                                                    searchView$SearchAutoComplete.setHintTextColor(Color.argb(192, Color.red(i10), Color.green(i10), Color.blue(i10)));
                                                }
                                                imageView = (ImageView) eVar4.findViewById(R.id.search_close_btn);
                                                if (imageView != null) {
                                                    imageView.setColorFilter(eVar2.f3884k);
                                                }
                                                eVar2.f3886m = eVar4;
                                                showAsActionFlags.setActionView(eVar4);
                                                showAsActionFlags.setShowAsActionFlags(9);
                                                showAsActionFlags.setOnActionExpandListener(new r(eVar2, showAsActionFlags));
                                            }
                                            map = map4;
                                            map.put(showAsActionFlags, str4);
                                        }
                                    } else if (strOptString3.equals("search")) {
                                        eVar = new g3.e("search", str2, "Search");
                                        str3 = (String) eVar.f2154h;
                                        if (!TextUtils.isEmpty(strOptString7)) {
                                            str3 = strOptString7;
                                        }
                                        if (TextUtils.isEmpty(strOptString8)) {
                                            strOptString8 = eVar.f2153g;
                                        }
                                        strOptString8.getClass();
                                        menu = menu;
                                        i6 = i5;
                                        showAsActionFlags = menu.add(0, i6, 0, str3).setIcon(new v1.b(mainActivity, i7, eVar2.f3884k, strOptString8).d()).setShowAsActionFlags(1);
                                        showAsActionFlags.getClass();
                                        str4 = eVar.f;
                                        if (str4.equals("search")) {
                                            strOptString9.getClass();
                                            final androidx.appcompat.widget.e eVar5 = new androidx.appcompat.widget.e(mainActivity);
                                            eVar5.setLayoutParams(new h3(-1));
                                            eVar5.setMaxWidth(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                                            eVar5.setOnQueryTextListener(new androidx.emoji2.text.p(eVar2, 14, strOptString9));
                                            eVar5.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: u1.a
                                                @Override // android.view.View.OnFocusChangeListener
                                                public final void onFocusChange(View view, boolean z7) {
                                                    if (z7 || eVar5.T) {
                                                        return;
                                                    }
                                                    e eVar6 = eVar2;
                                                    androidx.appcompat.widget.e eVar7 = eVar6.f3886m;
                                                    if (eVar7 != null) {
                                                        eVar7.setIconified(true);
                                                    }
                                                    eVar6.f3875a.invalidateOptionsMenu();
                                                }
                                            });
                                            searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) eVar5.findViewById(R.id.search_src_text);
                                            if (searchView$SearchAutoComplete != null) {
                                                searchView$SearchAutoComplete.setTextColor(eVar2.f3884k);
                                                int i11 = eVar2.f3884k;
                                                searchView$SearchAutoComplete.setHintTextColor(Color.argb(192, Color.red(i11), Color.green(i11), Color.blue(i11)));
                                            }
                                            imageView = (ImageView) eVar5.findViewById(R.id.search_close_btn);
                                            if (imageView != null) {
                                                imageView.setColorFilter(eVar2.f3884k);
                                            }
                                            eVar2.f3886m = eVar5;
                                            showAsActionFlags.setActionView(eVar5);
                                            showAsActionFlags.setShowAsActionFlags(9);
                                            showAsActionFlags.setOnActionExpandListener(new r(eVar2, showAsActionFlags));
                                        }
                                        map = map4;
                                        map.put(showAsActionFlags, str4);
                                    }
                                } else {
                                    materialToolbar = materialToolbar2;
                                }
                                map = map4;
                                i6 = i5;
                                String strOptString10 = jSONObject2.optString("label");
                                String strOptString11 = jSONObject2.optString("icon");
                                String strOptString12 = jSONObject2.optString(ImagesContract.URL);
                                strOptString11.getClass();
                                MenuItem showAsActionFlags3 = menu.add(0, i6, 0, strOptString10).setIcon(new v1.b(mainActivity, i7, eVar2.f3884k, strOptString11).d()).setShowAsActionFlags(2);
                                showAsActionFlags3.getClass();
                                map.put(showAsActionFlags3, strOptString12);
                            }
                        }
                    }
                    i8 = i6 + 1;
                    menu2 = menu;
                    zOptBoolean = z5;
                    jSONArrayOptJSONArray = jSONArray;
                    length = i4;
                    arrayList3 = arrayList2;
                    aVarU = aVar;
                    materialToolbar2 = materialToolbar;
                    map2 = map;
                }
                MaterialToolbar materialToolbar3 = materialToolbar2;
                HashMap map5 = map2;
                ArrayList arrayList4 = arrayList3;
                Menu menu3 = menu2;
                if (!arrayList4.isEmpty()) {
                    Drawable overflowIcon = materialToolbar3.getOverflowIcon();
                    Drawable drawableMutate = (overflowIcon == null || (constantState = overflowIcon.getConstantState()) == null || (drawableNewDrawable = constantState.newDrawable()) == null) ? null : drawableNewDrawable.mutate();
                    if (drawableMutate != null) {
                        drawableMutate.setColorFilter(e4.a.n(eVar2.f3884k));
                    }
                    MenuItem showAsActionFlags4 = menu3.add(0, 99, 0, "Overflow").setIcon(drawableMutate).setShowAsActionFlags(2);
                    showAsActionFlags4.getClass();
                    map5.put(showAsActionFlags4, "overflow");
                    View viewInflate = LayoutInflater.from(mainActivity).inflate(R.layout.overflow_menu_list_view, (ViewGroup) null);
                    ListView listView = (ListView) viewInflate.findViewById(R.id.menuListView);
                    int size = arrayList4.size();
                    int i12 = 0;
                    while (true) {
                        arrayList = arrayList4;
                        if (i12 >= size) {
                            z4 = false;
                            break;
                        }
                        Object obj = arrayList.get(i12);
                        i12++;
                        String strOptString13 = ((JSONObject) obj).optString("icon");
                        if (strOptString13 != null && !y3.j.w(strOptString13)) {
                            z4 = true;
                            break;
                        }
                        arrayList4 = arrayList;
                    }
                    listView.setAdapter((ListAdapter) new j1(mainActivity, arrayList, z4));
                    PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
                    popupWindow.setWidth(eVar2.f3883j);
                    popupWindow.setElevation(10.0f);
                    eVar2.f3888p = popupWindow;
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: u1.b
                        /* JADX WARN: Code duplicated, block: B:17:0x003b A[PHI: r3
                          0x003b: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v6 java.lang.String) binds: [B:19:0x0043, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view, int i13, long j4) {
                            String str6;
                            JSONObject jSONObject3 = (JSONObject) arrayList.get(i13);
                            String strOptString14 = jSONObject3.optString("system");
                            String strOptString15 = jSONObject3.optString(ImagesContract.URL);
                            if ((strOptString14 == null || y3.j.w(strOptString14)) && strOptString14 != null) {
                                int iHashCode3 = strOptString14.hashCode();
                                if (iHashCode3 != -906336856) {
                                    if (iHashCode3 == 109400031) {
                                        str6 = "share";
                                        if (strOptString14.equals("share")) {
                                            strOptString15 = str6;
                                        }
                                    } else if (iHashCode3 == 1085444827) {
                                        str6 = "refresh";
                                        if (strOptString14.equals("refresh")) {
                                            strOptString15 = str6;
                                        }
                                    }
                                } else if (strOptString14.equals("search")) {
                                    Log.e("ActionManager", "setupOverflowMenu: The \"search\" system menu is not supported on the custom overflow menu yet.");
                                    strOptString15 = "";
                                }
                            }
                            strOptString15.getClass();
                            boolean zW = y3.j.w(strOptString15);
                            e eVar6 = eVar2;
                            if (!zW) {
                                eVar6.b(strOptString15);
                            }
                            PopupWindow popupWindow2 = eVar6.f3888p;
                            if (popupWindow2 != null) {
                                popupWindow2.dismiss();
                            }
                        }
                    });
                    return true;
                }
            }
        }
        return true;
    }

    @Override // e.j, androidx.fragment.app.e0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        GoNativeApplication goNativeApplication = (GoNativeApplication) getApplication();
        Iterator it = ((ArrayList) goNativeApplication.f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        goNativeApplication.f1165j.f(this.X);
        o oVar = this.Z;
        if (oVar != null && oVar.f4021g) {
            oVar.f4016a.unbindService(oVar.f4023i);
            oVar.f4021g = false;
        }
        i iVar = this.G;
        if (iVar != null) {
            iVar.stopLoading();
            ViewGroup viewGroup = (ViewGroup) this.G.getParent();
            if (viewGroup != null) {
                viewGroup.removeView((View) this.G);
            }
            if (!this.H) {
                this.G.destroy();
            }
        }
        this.f1171b0.deleteObserver(this);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && Build.VERSION.SDK_INT < 33 && L()) {
            return true;
        }
        Iterator it = ((ArrayList) ((GoNativeApplication) getApplication()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // androidx.activity.q, android.app.Activity
    public final void onNewIntent(Intent intent) {
        boolean zEquals;
        super.onNewIntent(intent);
        Iterator it = ((ArrayList) ((GoNativeApplication) getApplication()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        String strH = H(intent);
        if (strH == null || strH.isEmpty()) {
            Log.w("co.median.android.MainActivity", "Received intent without url");
            return;
        }
        if (TextUtils.isEmpty(this.G.getUrl())) {
            K(strH);
            this.K = strH;
            return;
        }
        String url = this.G.getUrl();
        if (url == null) {
            zEquals = false;
        } else {
            String strSubstring = strH.endsWith("/") ? strH.substring(0, strH.length() - 1) : strH;
            if (url.endsWith("/")) {
                url = url.substring(0, url.length() - 1);
            }
            if (strSubstring.startsWith("http://")) {
                strSubstring = "https://".concat(strSubstring.substring(7));
            }
            zEquals = strSubstring.equals(url);
        }
        if (zEquals) {
            return;
        }
        this.C0.b(strH, true, false);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        androidx.appcompat.widget.e eVar;
        q1 q1Var = this.S;
        if (q1Var != null) {
            menuItem.getClass();
            p1 p1Var = q1Var.f4060c;
            if (p1Var != null && menuItem.getItemId() == 16908332) {
                GoNativeDrawerLayout goNativeDrawerLayout = p1Var.f4052b;
                int iG = goNativeDrawerLayout.g(8388611);
                View viewE = goNativeDrawerLayout.e(8388611);
                if ((viewE != null ? y0.f.n(viewE) : false) && iG != 2) {
                    View viewE2 = goNativeDrawerLayout.e(8388611);
                    if (viewE2 != null) {
                        goNativeDrawerLayout.c(viewE2, true);
                        return true;
                    }
                    q.u(y0.f.j(8388611), "No drawer view found with gravity ");
                    return false;
                }
                if (iG == 1) {
                    return true;
                }
                View viewE3 = goNativeDrawerLayout.e(8388611);
                if (viewE3 != null) {
                    goNativeDrawerLayout.o(viewE3);
                    return true;
                }
                q.u(y0.f.j(8388611), "No drawer view found with gravity ");
                return false;
            }
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        e eVar2 = this.R;
        if (eVar2 == null || (eVar = eVar2.f3886m) == null || !eVar.hasFocus()) {
            finish();
            return true;
        }
        androidx.appcompat.widget.e eVar3 = eVar2.f3886m;
        if (eVar3 != null) {
            eVar3.setIconified(true);
        }
        eVar2.f3875a.invalidateOptionsMenu();
        return true;
    }

    @Override // androidx.fragment.app.e0, android.app.Activity
    public final void onPause() {
        super.onPause();
        GoNativeApplication goNativeApplication = (GoNativeApplication) getApplication();
        Iterator it = ((ArrayList) goNativeApplication.f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        this.E = true;
        this.V.removeCallbacks(this.Y);
        if (this.G != null) {
            Iterator it2 = ((ArrayList) goNativeApplication.f1168m.a()).iterator();
            if (it2.hasNext()) {
                throw u.j(it2);
            }
            if (!this.f1174f0.f4134a) {
                this.G.onPause();
            }
        }
        z zVar = this.d0;
        if (zVar != null) {
            unregisterReceiver(zVar);
        }
        CookieManager.getInstance().flush();
    }

    @Override // e.j, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        p1 p1Var;
        super.onPostCreate(bundle);
        Iterator it = ((ArrayList) ((GoNativeApplication) getApplication()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        q1 q1Var = this.S;
        if (q1Var == null || (p1Var = q1Var.f4060c) == null) {
            return;
        }
        p1Var.e();
    }

    @Override // androidx.fragment.app.e0, androidx.activity.q, android.app.Activity
    public final void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        Iterator it = ((ArrayList) ((GoNativeApplication) getApplication()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        if (i4 != 199) {
            return;
        }
        ArrayList arrayList = this.f1178l0;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b1 b1Var = (b1) it2.next();
            if (b1Var.f3859a.length == strArr.length) {
                int i5 = 0;
                while (true) {
                    String[] strArr2 = b1Var.f3859a;
                    if (i5 >= strArr2.length || i5 >= strArr.length) {
                        b1Var.f3860b.c(strArr, iArr);
                        it2.remove();
                        break;
                    } else if (!strArr2[i5].equals(strArr[i5])) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            ArrayList arrayList2 = this.f1179m0;
            if (arrayList2.size() > 0) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    startActivity((Intent) it3.next());
                    it3.remove();
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Iterator it = ((ArrayList) ((GoNativeApplication) getApplication()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
    }

    @Override // androidx.fragment.app.e0, android.app.Activity
    public final void onResume() {
        super.onResume();
        E().f595d = this.X;
        GoNativeApplication goNativeApplication = (GoNativeApplication) getApplication();
        goNativeApplication.getClass();
        Iterator it = ((ArrayList) goNativeApplication.f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        i iVar = this.G;
        if (iVar != null) {
            iVar.onResume();
        }
        x1.a aVarU = x1.a.u(this);
        if (this.E) {
            this.E = false;
            if (aVarU.f4709z) {
                V(t2.i.e("median_app_resumed", null), null);
                V(t2.i.e("gonative_app_resumed", null), null);
            } else {
                V(t2.i.e("_median_app_resumed", null), null);
            }
        }
        T();
        z zVar = new z(1, this);
        this.d0 = zVar;
        registerReceiver(zVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f1171b0.c();
        o oVar = this.Z;
        oVar.getClass();
        Uri uri = o.f4015j;
        if (uri == null || uri.getPath() == null) {
            return;
        }
        Log.d("u1.o", "onAppResume: Deleting file after viewing: " + o.f4015j.getPath());
        oVar.f4016a.getContentResolver().delete(o.f4015j, null, null);
    }

    @Override // androidx.activity.q, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("configurationChanged", true);
        if (this.G != null) {
            Bundle bundle2 = new Bundle();
            ((o0) this.G).saveState(bundle2);
            bundle.putBundle("webViewState", bundle2);
            bundle.putString("activityId", this.X);
            g0 g0Var = (g0) ((LinkedHashMap) E().f592a).get(this.X);
            bundle.putBoolean("isRoot", g0Var != null ? g0Var.f3931b : false);
            g0 g0Var2 = (g0) ((LinkedHashMap) E().f592a).get(this.X);
            bundle.putInt("urlLevel", g0Var2 != null ? g0Var2.f3932c : -1);
            g0 g0Var3 = (g0) ((LinkedHashMap) E().f592a).get(this.X);
            bundle.putInt("parentUrlLevel", g0Var3 != null ? g0Var3.f3933d : -1);
            bundle.putInt("scrollX", ((o0) this.G).getWebViewScrollX());
            bundle.putInt("scrollY", ((o0) this.G).getWebViewScrollY());
        }
        if (this.v0) {
            bundle.putBoolean("ignoreThemeSetup", true);
        }
        Iterator it = ((ArrayList) ((GoNativeApplication) getApplication()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeValue(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 512000) {
            bundle.clear();
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [u1.f] */
    @Override // e.j, androidx.fragment.app.e0, android.app.Activity
    public final void onStart() {
        super.onStart();
        Iterator it = ((ArrayList) ((GoNativeApplication) getApplication()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        if (x1.a.u(this).J0.f4866d) {
            final Object obj = new Object();
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            if (audioManager == null) {
                Log.w("t1.l", "AudioManager is null. Aborting initAudioFocusListener()");
            }
            l.f3718c = new AudioManager.OnAudioFocusChangeListener() { // from class: u1.f
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i4) {
                    Object obj2 = obj;
                    MainActivity mainActivity = this;
                    if (i4 == 1) {
                        synchronized (obj2) {
                            Log.d("t1.l", "AudioFocusListener GAINED. Try to request audio focus");
                            t1.l.o(mainActivity);
                            t1.l.b(mainActivity);
                        }
                    }
                }
            };
            AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(l.f3718c).build();
            l.f3716a = audioFocusRequestBuild;
            int iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequestBuild);
            synchronized (obj) {
                if (iRequestAudioFocus == 1) {
                    try {
                        Log.d("t1.l", "AudioFocusListener REQUEST GRANTED");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // e.j, androidx.fragment.app.e0, android.app.Activity
    public final void onStop() {
        super.onStop();
        Iterator it = ((ArrayList) ((GoNativeApplication) getApplication()).f1168m.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        if (this.T && x1.a.u(this).f4690q) {
            this.G.clearCache(true);
        }
    }

    public final void p0(String str) {
        this.f1180n0 = str;
        J();
        new Handler().postDelayed(new b0.b(this, str, 7, false), 500L);
    }

    public final void q0(String str) {
        t tVar = this.f1191z0;
        if (tVar != null) {
            synchronized (tVar) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                ((ArrayList) tVar.f580d).add(str);
                if (((HashMap) tVar.f579c).containsKey(str)) {
                    tVar.q(str, (JSONObject) ((HashMap) tVar.f579c).remove(str));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(i iVar, boolean z4, boolean z5) {
        this.F.a(this, this.T);
        View view = (View) iVar;
        view.scrollTo(0, 0);
        View view2 = (View) this.G;
        if (!z5) {
            Bundle bundle = new Bundle();
            ((o0) this.G).saveState(bundle);
            this.j0.add(bundle);
        }
        if (iVar != view2) {
            ViewParent parent = iVar.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            viewGroup.removeView(view2);
            viewGroup.addView(view, iIndexOfChild);
            view.setLayoutParams(view2.getLayoutParams());
            o0 o0Var = (o0) view2;
            o0Var.setWebViewClient(null);
            o0Var.setWebChromeClient(null);
            if (!this.H) {
                ((i) view2).destroy();
            }
        }
        this.H = z4;
        this.G = iVar;
        String str = this.f1175h0;
        if (str != null) {
            V(str, null);
            this.f1175h0 = null;
        }
    }

    public final void s0(boolean z4) {
        u1.h0 h0VarV = v();
        if (!z4) {
            if (h0VarV != null && x1.a.u(this).f4680m0) {
                h0VarV.o0();
            }
            this.G.clearFocus();
        } else if (h0VarV != null) {
            h0VarV.E();
        }
        r1 r1Var = this.D0;
        if (r1Var != null) {
            h0 h0Var = r1Var.f4079e;
            if (z4) {
                if (h0Var == null) {
                    r3.g.c("insetsController");
                    throw null;
                }
                e4.a aVar = (e4.a) h0Var.f84g;
                aVar.M();
                aVar.f0(2);
            } else {
                if (h0Var == null) {
                    r3.g.c("insetsController");
                    throw null;
                }
                e4.a aVar2 = (e4.a) h0Var.f84g;
                aVar2.h0(519);
                aVar2.f0(1);
            }
        }
        if (!z4 || x1.a.u(this).f4689p1 == 3) {
            c0();
        } else {
            setRequestedOrientation(4);
        }
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e eVar = this.R;
        if (eVar != null) {
            eVar.getClass();
            charSequence.getClass();
            if (y3.j.w(charSequence)) {
                return;
            }
            eVar.f.setVisibility(8);
            eVar.f3879e.setTitle(charSequence);
        }
    }

    public final void t0() {
        this.f1180n0 = null;
    }

    public final void u0(String str) {
        t tVar = this.f1191z0;
        if (tVar != null) {
            ((ArrayList) tVar.f580d).remove(str);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable instanceof s0) {
            v0(((s0) observable).f4093c);
        }
    }

    public final void v0(boolean z4) {
        q1 q1Var = this.S;
        if (q1Var == null) {
            return;
        }
        try {
            if (z4) {
                q1Var.d("loggedIn");
            } else {
                q1Var.d("default");
            }
        } catch (Exception e5) {
            f.a().d("co.median.android.MainActivity", e5.getMessage(), e5);
        }
    }

    public final void w(String str) {
        k0 k0Var = this.f1173e0;
        if (k0Var == null) {
            return;
        }
        k0Var.f3992c = str;
    }

    public final int w0(String str) {
        ArrayList arrayList = x1.a.u(this).P;
        if (arrayList == null) {
            return -1;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (((Pattern) arrayList.get(i4)).matcher(str).matches()) {
                return ((Integer) x1.a.u(this).Q.get(i4)).intValue();
            }
        }
        return -1;
    }

    public final void x(String str) {
        if (str.equals(this.Z.f4020e)) {
            return;
        }
        e eVar = this.R;
        if (eVar != null) {
            eVar.c(str, true);
        }
        w1 w1Var = this.Q;
        if (w1Var != null) {
            w1Var.b(str);
        }
        e eVar2 = this.R;
        if (eVar2 != null) {
            MainActivity mainActivity = eVar2.f3875a;
            if (!y3.j.w(str)) {
                x1.a aVarU = x1.a.u(mainActivity);
                if (!str.equals(aVarU.Y0)) {
                    eVar2.c(str, true);
                    ArrayList arrayList = aVarU.f4654c0;
                    ArrayList arrayList2 = aVarU.d0;
                    if (arrayList == null || arrayList2 == null) {
                        String str2 = eVar2.n;
                        if (str2 != null && !str2.equals(null)) {
                            eVar2.n = null;
                            mainActivity.invalidateOptionsMenu();
                        }
                    } else {
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            if (((Pattern) arrayList.get(i4)).matcher(str).matches()) {
                                String str3 = (String) arrayList2.get(i4);
                                String str4 = eVar2.n;
                                if (str4 != null ? !str4.equals(str3) : str3 != null) {
                                    eVar2.n = str3;
                                    mainActivity.invalidateOptionsMenu();
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        x xVar = this.f1172c0;
        if (xVar != null) {
            xVar.f594c = str;
            for (n1 n1Var : (LinkedList) xVar.f595d) {
                if (t2.i.P(str, n1Var.f4013b)) {
                    n1Var.a();
                }
            }
        }
        q1 q1Var = this.S;
        if (q1Var != null) {
            q1Var.a(str);
        }
    }

    public final LinkedHashMap y(JSONArray jSONArray) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = k1.f3998a;
        int i4 = 0;
        if (jSONArray != null) {
            int length = jSONArray.length();
            arrayList = new ArrayList(length);
            for (int i5 = 0; i5 < length; i5++) {
                arrayList.add(jSONArray.getString(i5));
            }
        } else {
            arrayList = null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (arrayList == null || arrayList.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put((String) entry.getKey(), k1.a(this, (String) entry.getValue()));
            }
        } else {
            int size = arrayList.size();
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                String str = (String) obj;
                String str2 = (String) linkedHashMap.get(str);
                if (str2 != null && str2.length() != 0) {
                    linkedHashMap2.put(str, k1.a(this, str2));
                }
            }
        }
        return linkedHashMap2;
    }

    public final void z(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = new HashMap();
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip()) {
            CharSequence text = clipboardManager.getPrimaryClip().getItemAt(0).getText();
            if (text != null) {
                map.put("data", text.toString());
            } else {
                map.put("error", "Clipboard item is not a string.");
            }
        } else {
            map.put("error", "No Clipboard item available.");
        }
        V(t2.i.e(str, new JSONObject(map)), null);
    }
}
