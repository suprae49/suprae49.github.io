package co.median.android;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Message;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.emoji2.text.x;
import androidx.fragment.app.u;
import com.google.android.gms.common.internal.ImagesContract;
import e.o;
import e.q;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import k.m3;
import org.json.JSONArray;
import org.json.JSONObject;
import r0.b;
import t1.l;
import t2.i;
import u1.h0;
import u1.h2;
import u1.n1;
import u1.s0;
import x1.f;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class GoNativeApplication extends Application {
    public s0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f1162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h2 f1163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Message f1164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x f1165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f1166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1167l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u1.x f1168m = new u1.x(this, this);
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f1169o;

    public final HashMap a() {
        u1.x xVar = this.f1168m;
        xVar.getClass();
        HashMap map = new HashMap();
        Iterator it = ((ArrayList) xVar.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public final String b(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            String str = (String) obj;
            try {
                l.g(new BufferedInputStream(getAssets().open(str)), byteArrayOutputStream);
                sb.append(byteArrayOutputStream);
                byteArrayOutputStream.reset();
            } catch (IOException e5) {
                f.a().d("GoNativeApplication", "Error reading " + str, e5);
            }
        }
        l.f(byteArrayOutputStream);
        return sb.toString();
    }

    @Override // android.app.Application
    public final void onCreate() {
        String str;
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 31) {
            String strJ = i.j(this);
            if (!getSharedPreferences("median_theme_preference", 0).getBoolean("THEME_PREFERENCE_KEY_INITIAL_THEME_SET", false)) {
                i.N(this, strJ);
                getSharedPreferences("median_theme_preference", 0).edit().putBoolean("THEME_PREFERENCE_KEY_INITIAL_THEME_SET", true).apply();
            }
        }
        o oVar = q.f;
        int i4 = m3.f2587a;
        u1.x xVar = this.f1168m;
        xVar.getClass();
        String installerPackageName = getPackageManager().getInstallerPackageName(getPackageName());
        if ("com.android.vending".equals(installerPackageName) || "com.google.market".equals(installerPackageName)) {
            xVar.f4134a = true;
        }
        Iterator it = ((ArrayList) xVar.a()).iterator();
        if (it.hasNext()) {
            throw u.j(it);
        }
        x1.a aVarU = x1.a.u(this);
        Exception exc = aVarU.f4653c;
        boolean z4 = aVarU.f4669i0;
        boolean z5 = aVarU.g0;
        JSONArray jSONArray = aVarU.N0;
        if (exc != null) {
            Toast.makeText(this, "Invalid appConfig json", 1).show();
            f.a().d("GoNativeApplication", "AppConfig error", aVarU.f4653c);
        }
        s0 s0Var = new s0();
        s0Var.f4092b = null;
        s0Var.f4093c = false;
        s0Var.f4091a = this;
        s0Var.c();
        this.f = s0Var;
        if (jSONArray != null) {
            x xVar2 = new x();
            xVar2.f592a = this;
            LinkedList linkedList = new LinkedList();
            xVar2.f595d = linkedList;
            this.f1162g = xVar2;
            linkedList.clear();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                if (jSONObjectOptJSONObject != null) {
                    String strF = i.F(ImagesContract.URL, jSONObjectOptJSONObject);
                    if (strF == null) {
                        Log.w("androidx.emoji2.text.x", "Invalid registration: endpoint url is null");
                    } else {
                        linkedList.add(new n1(xVar2, strF, i.f(jSONObjectOptJSONObject.opt("urlRegex"))));
                    }
                }
            }
        }
        if (!x1.a.u(this).f4678l1 && (str = (String) h0.y(this).get("distribution")) != null && (str.equals("debug") || str.equals("adhoc"))) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        h2 h2Var = new h2();
        h2Var.f3950e = new b(h2Var);
        this.f1163h = h2Var;
        this.f1165j = new x(3);
        boolean z6 = aVarU.f4666h0;
        if (z5 || z6) {
            ArrayList arrayList = new ArrayList();
            if (z5) {
                arrayList.add("customCSS.css");
            }
            if (z6) {
                arrayList.add("androidCustomCSS.css");
            }
            if (arrayList.size() != 0) {
                try {
                    this.n = Base64.encodeToString(b(arrayList).getBytes(StandardCharsets.UTF_8), 2);
                } catch (Exception e5) {
                    f.a().d("GoNativeApplication", "Error loading custom CSS files", e5);
                }
            }
        }
        boolean z7 = aVarU.j0;
        if (z4 || z7) {
            ArrayList arrayList2 = new ArrayList();
            if (z4) {
                arrayList2.add("customJS.js");
            }
            if (z7) {
                arrayList2.add("androidCustomJS.js");
            }
            if (arrayList2.size() != 0) {
                try {
                    this.f1169o = Base64.encodeToString(b(arrayList2).getBytes(StandardCharsets.UTF_8), 2);
                } catch (Exception e6) {
                    f.a().d("GoNativeApplication", "Error loading custom JS files", e6);
                }
            }
        }
        SharedPreferences sharedPreferencesX = e4.a.x(this);
        if (sharedPreferencesX.getBoolean("hasLaunched", false)) {
            return;
        }
        this.f1167l = true;
        sharedPreferencesX.edit().putBoolean("hasLaunched", true).apply();
    }
}
