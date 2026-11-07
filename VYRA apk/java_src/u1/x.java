package u1;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.CookieManager;
import co.median.android.GoNativeApplication;
import co.median.android.MainActivity;
import co.median.android.widget.WebViewContainerView;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4136c;

    public x(GoNativeApplication goNativeApplication, GoNativeApplication goNativeApplication2) {
        this.f4136c = goNativeApplication;
        this.f4135b = null;
        this.f4134a = false;
        new x1.h(goNativeApplication2);
    }

    public List a() {
        GoNativeApplication goNativeApplication = (GoNativeApplication) this.f4136c;
        if (goNativeApplication.f1166k == null) {
            goNativeApplication.f1166k = new ArrayList(Arrays.asList(new x1.b[0]));
        }
        return goNativeApplication.f1166k;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x025c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0268  */
    /* JADX WARN: Code duplicated, block: B:124:0x0298  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:136:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:138:0x0308  */
    /* JADX WARN: Code duplicated, block: B:156:0x0378  */
    /* JADX WARN: Code duplicated, block: B:162:0x0394  */
    /* JADX WARN: Code duplicated, block: B:163:0x039f  */
    /* JADX WARN: Code duplicated, block: B:167:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:169:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:171:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:189:0x0439  */
    /* JADX WARN: Code duplicated, block: B:200:0x0471  */
    /* JADX WARN: Code duplicated, block: B:202:0x047f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x0483  */
    /* JADX WARN: Code duplicated, block: B:206:0x048f  */
    /* JADX WARN: Code duplicated, block: B:208:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:210:0x04af  */
    /* JADX WARN: Code duplicated, block: B:225:0x0514 A[Catch: Exception -> 0x0508, TRY_LEAVE, TryCatch #10 {Exception -> 0x0508, blocks: (B:212:0x04ca, B:214:0x04d3, B:217:0x04db, B:219:0x04ff, B:224:0x050a, B:225:0x0514), top: B:667:0x04ca }] */
    /* JADX WARN: Code duplicated, block: B:228:0x0538  */
    /* JADX WARN: Code duplicated, block: B:230:0x0544  */
    /* JADX WARN: Code duplicated, block: B:232:0x054e  */
    /* JADX WARN: Code duplicated, block: B:234:0x055a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0563  */
    /* JADX WARN: Code duplicated, block: B:238:0x0571  */
    /* JADX WARN: Code duplicated, block: B:240:0x057e  */
    /* JADX WARN: Code duplicated, block: B:242:0x058a  */
    /* JADX WARN: Code duplicated, block: B:244:0x0597  */
    /* JADX WARN: Code duplicated, block: B:251:0x05be  */
    /* JADX WARN: Code duplicated, block: B:253:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:262:0x0602  */
    /* JADX WARN: Code duplicated, block: B:264:0x0610  */
    /* JADX WARN: Code duplicated, block: B:266:0x061c  */
    /* JADX WARN: Code duplicated, block: B:268:0x0625  */
    /* JADX WARN: Code duplicated, block: B:273:0x0643  */
    /* JADX WARN: Code duplicated, block: B:275:0x0651  */
    /* JADX WARN: Code duplicated, block: B:280:0x067f  */
    /* JADX WARN: Code duplicated, block: B:313:0x073c  */
    /* JADX WARN: Code duplicated, block: B:315:0x0748  */
    /* JADX WARN: Code duplicated, block: B:317:0x074c  */
    /* JADX WARN: Code duplicated, block: B:319:0x0758  */
    /* JADX WARN: Code duplicated, block: B:321:0x075b  */
    /* JADX WARN: Code duplicated, block: B:323:0x0767  */
    /* JADX WARN: Code duplicated, block: B:349:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:366:0x085f  */
    /* JADX WARN: Code duplicated, block: B:368:0x086b  */
    /* JADX WARN: Code duplicated, block: B:370:0x0876  */
    /* JADX WARN: Code duplicated, block: B:373:0x0884 A[Catch: NumberFormatException -> 0x088d, TRY_LEAVE, TryCatch #9 {NumberFormatException -> 0x088d, blocks: (B:371:0x087e, B:373:0x0884), top: B:664:0x087e }] */
    /* JADX WARN: Code duplicated, block: B:378:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:380:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:382:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:397:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:399:0x090c  */
    /* JADX WARN: Code duplicated, block: B:401:0x0916  */
    /* JADX WARN: Code duplicated, block: B:405:0x092f  */
    /* JADX WARN: Code duplicated, block: B:407:0x0939  */
    /* JADX WARN: Code duplicated, block: B:411:0x0952  */
    /* JADX WARN: Code duplicated, block: B:413:0x095c  */
    /* JADX WARN: Code duplicated, block: B:416:0x0970  */
    /* JADX WARN: Code duplicated, block: B:427:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:429:0x09ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:433:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:435:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:442:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:444:0x0a13  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:471:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:473:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:500:0x0b34  */
    /* JADX WARN: Code duplicated, block: B:502:0x0b40  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:544:0x0c0a  */
    /* JADX WARN: Code duplicated, block: B:546:0x0c16  */
    /* JADX WARN: Code duplicated, block: B:548:0x0c20  */
    /* JADX WARN: Code duplicated, block: B:573:0x0c79  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:599:0x0d16  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:615:0x0d5c  */
    /* JADX WARN: Code duplicated, block: B:642:0x0df4  */
    /* JADX WARN: Code duplicated, block: B:646:0x0274 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x04ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x014a  */
    /* JADX WARN: Code duplicated, block: B:673:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x015c  */
    /* JADX WARN: Code duplicated, block: B:714:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0184 A[LOOP:1: B:75:0x017e->B:77:0x0184, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ca A[Catch: Exception -> 0x01e5, TryCatch #13 {Exception -> 0x01e5, blocks: (B:87:0x01b9, B:88:0x01c4, B:90:0x01ca, B:93:0x01df), top: B:673:0x01b9 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01de  */
    /* JADX WARN: Code duplicated, block: B:93:0x01df A[Catch: Exception -> 0x01e5, TRY_LEAVE, TryCatch #13 {Exception -> 0x01e5, blocks: (B:87:0x01b9, B:88:0x01c4, B:90:0x01ca, B:93:0x01df), top: B:673:0x01b9 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f1  */
    /* JADX WARN: Instruction removed from duplicated block: B:206:0x048f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:225:0x0514, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public void b(Activity activity, Object obj) {
        Uri uri;
        JSONObject jSONObjectJ;
        Uri uri2;
        Iterator it;
        Uri uri3;
        JSONArray jSONArrayOptJSONArray;
        Integer numH;
        Integer numH2;
        Integer numH3;
        z1.a aVar;
        List<String> pathSegments;
        String str;
        int i4;
        String strOptString;
        float f;
        String strOptString2;
        boolean zOptBoolean;
        String strOptString3;
        JSONArray jSONArray;
        int i5;
        Uri uri4;
        MainActivity mainActivity;
        Iterator it2;
        JSONObject jSONObjectOptJSONObject;
        androidx.emoji2.text.x xVar;
        String str2;
        if (activity == 0) {
            return;
        }
        x1.a aVarU = x1.a.u(activity);
        JSONObject jSONObjectG = null;
        if (this.f4134a && !aVarU.f4649a1) {
            n2.b bVar = new n2.b(activity);
            e.b bVar2 = (e.b) bVar.f1920g;
            bVar2.f = "License required to use JavaScript Bridge";
            bVar2.f1846g = "Okay";
            bVar2.f1847h = null;
            bVar.a().show();
            return;
        }
        z1.g gVar = x1.a.u(activity).f4672j1;
        if (gVar != null) {
            long j4 = gVar.f4876b;
            if (gVar.f4879e && j4 > -1 && (gVar.f <= 0 || System.currentTimeMillis() - gVar.f >= j4)) {
                t1.l.a(activity);
                gVar.f = System.currentTimeMillis();
            }
        }
        if (obj instanceof Uri) {
            try {
                uri = (Uri) obj;
                jSONObjectJ = t2.i.J(uri);
            } catch (Exception e5) {
                Log.d("co.median.median_core.Bridge", "GoNative Handle JS Bridge Functions Error:- " + e5.getMessage());
                return;
            }
        } else {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                jSONObjectJ = jSONObject.optJSONObject("data");
                if (!jSONObject.has("medianCommand")) {
                    if (jSONObject.has("gonativeCommand")) {
                        uri = Uri.parse(jSONObject.optString("gonativeCommand"));
                    } else {
                        uri2 = null;
                    }
                    it = ((ArrayList) a()).iterator();
                    if (!it.hasNext()) {
                        androidx.fragment.app.u.n(it.next());
                        throw null;
                    }
                    Objects.requireNonNull(uri2);
                    if ("system".equals(uri2.getHost())) {
                        if ("/exitApp".equals(uri2.getPath())) {
                            activity.finishAffinity();
                            return;
                        }
                        return;
                    }
                    if ("registration".equals(uri2.getHost()) && "/send".equals(uri2.getPath())) {
                        mainActivity = (MainActivity) ((x1.g) activity);
                        if (mainActivity.f1172c0 != null) {
                            if (jSONObjectJ != null) {
                                jSONObjectOptJSONObject = jSONObjectJ.optJSONObject("customData");
                                if (jSONObjectOptJSONObject == null) {
                                    try {
                                        jSONObjectOptJSONObject = new JSONObject(jSONObjectJ.optString("customData"));
                                    } catch (JSONException e6) {
                                        x1.f.a().d("co.median.android.MainActivity", "GoNative Registration JSONException:- " + e6.getMessage(), e6);
                                    }
                                }
                                if (jSONObjectOptJSONObject != null) {
                                    xVar = mainActivity.f1172c0;
                                    xVar.f593b = jSONObjectOptJSONObject;
                                    for (n1 n1Var : (LinkedList) xVar.f595d) {
                                        str2 = (String) xVar.f594c;
                                        if (str2 == null && t2.i.P(str2, n1Var.f4013b)) {
                                            n1Var.a();
                                        }
                                    }
                                }
                            }
                            it2 = ((LinkedList) mainActivity.f1172c0.f595d).iterator();
                            while (it2.hasNext()) {
                                ((n1) it2.next()).a();
                            }
                        }
                    }
                    boolean zIsLocationEnabled = false;
                    zIsLocationEnabled = false;
                    zIsLocationEnabled = false;
                    if ("nativebridge".equals(uri2.getHost())) {
                        if (!"/multi".equals(uri2.getPath())) {
                            if (jSONObjectJ == null) {
                                return;
                            }
                            strOptString3 = jSONObjectJ.optString("data");
                            if (strOptString3.isEmpty()) {
                                return;
                            }
                            try {
                                jSONArray = new JSONObject(strOptString3).getJSONArray("urls");
                                for (i5 = 0; i5 < jSONArray.length(); i5++) {
                                    uri4 = Uri.parse(jSONArray.getString(i5));
                                    if (!"gonative".equals(uri4.getScheme())) {
                                        b(activity, uri4);
                                    }
                                }
                                return;
                            } catch (Exception e7) {
                                x1.f.a().d("co.median.median_core.Bridge", "Error calling gonative://nativebridge/multi", e7);
                                return;
                            }
                        }
                        if ("/custom".equals(uri2.getPath()) || jSONObjectJ == null) {
                            return;
                        }
                        HashMap map = new HashMap();
                        Iterator<String> itKeys = jSONObjectJ.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObjectJ.optString(next));
                        }
                        MainActivity mainActivity2 = (MainActivity) ((x1.g) activity);
                        try {
                            jSONObjectG = t2.i.g(map);
                        } catch (Exception e8) {
                            x1.f.a().d("t1.l", "Error executing custom code", e8);
                        }
                        String str3 = (String) map.get("callback");
                        if (str3 == null || str3.isEmpty()) {
                            return;
                        }
                        new Handler(mainActivity2.getMainLooper()).post(new androidx.activity.p(mainActivity2, 8, t2.i.e(str3, jSONObjectG)));
                        return;
                    }
                    if ("open".equals(uri2.getHost())) {
                        if ("/app-settings".equals(uri2.getPath())) {
                            try {
                                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                                activity.startActivity(intent);
                                return;
                            } catch (Exception e9) {
                                x1.f.a().d("co.median.median_core.Bridge", "Error opening app settings", e9);
                                return;
                            }
                        }
                        return;
                    }
                    if ("webview".equals(uri2.getHost())) {
                        if ("/clearCache".equals(uri2.getPath())) {
                            Log.d("co.median.median_core.Bridge", "Clearing webview cache");
                            ((MainActivity) ((x1.g) activity)).G.clearCache(true);
                            return;
                        }
                        if ("/clearCookies".equals(uri2.getPath())) {
                            Log.d("co.median.median_core.Bridge", "Clearing webview cookies");
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(new u0());
                            AsyncTask.THREAD_POOL_EXECUTOR.execute(new androidx.activity.k(12, cookieManager));
                            return;
                        }
                        if ("/reload".equals(uri2.getPath())) {
                            Log.d("co.median.median_core.Bridge", "Reloading webview");
                            ((MainActivity) ((x1.g) activity)).R();
                            return;
                        }
                        if (!"/setZoom".equals(uri2.getPath()) && jSONObjectJ != null) {
                            ((MainActivity) ((x1.g) activity)).Z((float) jSONObjectJ.optDouble("scale", -1.0d), jSONObjectJ.optString("callback"));
                            return;
                        }
                        if ("/getZoom".equals(uri2.getPath()) || jSONObjectJ == null || TextUtils.isEmpty(jSONObjectJ.optString("callback"))) {
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            MainActivity mainActivity3 = (MainActivity) ((x1.g) activity);
                            jSONObject2.put("zoom", mainActivity3.F0 / mainActivity3.E0);
                        } catch (JSONException e10) {
                            x1.f.a().d("co.median.median_core.Bridge", e10.getMessage(), null);
                        }
                        ((MainActivity) ((x1.g) activity)).V(t2.i.e(jSONObjectJ.optString("callback"), jSONObject2), null);
                        return;
                    }
                    if ("run".equals(uri2.getHost()) && "/median_device_info".equals(uri2.getPath())) {
                        strOptString2 = "median_device_info";
                        if (jSONObjectJ != null) {
                            strOptString2 = jSONObjectJ.optString("callback", "median_device_info");
                            zOptBoolean = jSONObjectJ.optBoolean("includeCarrierNames", false);
                        } else {
                            zOptBoolean = false;
                        }
                        ((MainActivity) ((x1.g) activity)).U(strOptString2, zOptBoolean);
                    }
                    if ("geoLocation".equals(uri2.getHost())) {
                        if ("/promptLocationServices".equals(uri2.getPath())) {
                            ((MainActivity) ((x1.g) activity)).f1177k0.a();
                            return;
                        }
                        if ("/isLocationServicesEnabled".equals(uri2.getPath()) || jSONObjectJ == null) {
                            return;
                        }
                        String strOptString4 = jSONObjectJ.optString("callback");
                        r0 r0Var = ((MainActivity) ((x1.g) activity)).f1177k0;
                        MainActivity mainActivity4 = r0Var.f4071a;
                        int iCheckSelfPermission = c0.c.checkSelfPermission(mainActivity4, "android.permission.ACCESS_FINE_LOCATION");
                        int iCheckSelfPermission2 = c0.c.checkSelfPermission(mainActivity4, "android.permission.ACCESS_COARSE_LOCATION");
                        if (iCheckSelfPermission == 0 && iCheckSelfPermission2 == 0) {
                            int i6 = Build.VERSION.SDK_INT;
                            MainActivity mainActivity5 = r0Var.f4071a;
                            if (i6 >= 28) {
                                Object systemService = mainActivity5.getSystemService((Class<Object>) LocationManager.class);
                                systemService.getClass();
                                zIsLocationEnabled = ((LocationManager) systemService).isLocationEnabled();
                            } else if (Settings.Secure.getInt(mainActivity5.getContentResolver(), "location_mode", 0) != 0) {
                                zIsLocationEnabled = true;
                            }
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        try {
                            jSONObject3.put("enabled", zIsLocationEnabled);
                            ((MainActivity) ((x1.g) activity)).V(t2.i.e(strOptString4, jSONObject3), null);
                            return;
                        } catch (JSONException e11) {
                            Log.e("co.median.median_core.Bridge", "handleJSBridgeFunctions: ", e11);
                            return;
                        }
                    }
                    if (!"config".equals(uri2.getHost()) && jSONObjectJ != null) {
                        if ("/set".equals(uri2.getPath())) {
                            String strOptString5 = jSONObjectJ.optString("initialUrl");
                            if (strOptString5.isEmpty()) {
                                return;
                            }
                            aVarU.z(strOptString5);
                            return;
                        }
                        return;
                    }
                    if ("screen".equals(uri2.getHost())) {
                        if ("/setBrightness".equals(uri2.getPath())) {
                            if ("/fullscreen".equals(uri2.getPath())) {
                                ((MainActivity) ((x1.g) activity)).s0(true);
                                return;
                            }
                            if ("/normal".equals(uri2.getPath())) {
                                ((MainActivity) ((x1.g) activity)).s0(false);
                                return;
                            }
                            if ("/keepScreenOn".equals(uri2.getPath())) {
                                ((MainActivity) ((x1.g) activity)).getWindow().addFlags(128);
                                return;
                            }
                            if ("/keepScreenNormal".equals(uri2.getPath())) {
                                ((MainActivity) ((x1.g) activity)).getWindow().clearFlags(128);
                                return;
                            }
                            if (!"/setColorScheme".equals(uri2.getPath()) && jSONObjectJ != null) {
                                ((MainActivity) ((x1.g) activity)).i0(jSONObjectJ.optString("mode"));
                                return;
                            }
                            if (!"/resetColorScheme".equals(uri2.getPath())) {
                                MainActivity mainActivity6 = (MainActivity) ((x1.g) activity);
                                String str4 = x1.a.u(mainActivity6).f4677l0;
                                mainActivity6.A0 = str4;
                                mainActivity6.i0(str4);
                                return;
                            }
                            if ("/setMode".equals(uri2.getPath()) || jSONObjectJ == null) {
                                return;
                            }
                            String strOptString6 = jSONObjectJ.optString("mode", "auto");
                            if (!"default".equals(strOptString6)) {
                                ((MainActivity) ((x1.g) activity)).i0(strOptString6);
                                return;
                            }
                            MainActivity mainActivity7 = (MainActivity) ((x1.g) activity);
                            String str5 = x1.a.u(mainActivity7).f4677l0;
                            mainActivity7.A0 = str5;
                            mainActivity7.i0(str5);
                            return;
                        }
                        if (jSONObjectJ == null) {
                            return;
                        }
                        strOptString = jSONObjectJ.optString("brightness");
                        if (strOptString.isEmpty()) {
                            x1.f.a().d("co.median.median_core.Bridge", "Brightness not specified in " + uri2.toString(), null);
                            return;
                        }
                        if (strOptString.equals("default")) {
                            MainActivity mainActivity8 = (MainActivity) ((x1.g) activity);
                            WindowManager.LayoutParams attributes = mainActivity8.getWindow().getAttributes();
                            attributes.screenBrightness = -1.0f;
                            mainActivity8.getWindow().setAttributes(attributes);
                            mainActivity8.f1184r0 = false;
                            return;
                        }
                        try {
                            f = Float.parseFloat(strOptString);
                            if (f >= 0.0f || f > 1.0d) {
                                x1.f.a().c("co.median.median_core.Bridge", "Invalid brightness value in " + uri2.toString());
                            } else {
                                MainActivity mainActivity9 = (MainActivity) ((x1.g) activity);
                                WindowManager.LayoutParams attributes2 = mainActivity9.getWindow().getAttributes();
                                attributes2.screenBrightness = f;
                                mainActivity9.getWindow().setAttributes(attributes2);
                                String strOptString7 = jSONObjectJ.optString("restoreOnNavigation");
                                if ("true".equals(strOptString7) || "1".equals(strOptString7)) {
                                    ((MainActivity) ((x1.g) activity)).f1184r0 = true;
                                }
                            }
                            return;
                        } catch (Exception e12) {
                            x1.f.a().e("co.median.median_core.Bridge", "Error parsing brightness", e12);
                            return;
                        }
                    }
                    if ("window".equals(uri2.getHost())) {
                        if ("/close".equals(uri2.getPath())) {
                            ((MainActivity) ((x1.g) activity)).A();
                            return;
                        } else {
                            if ("/open".equals(uri2.getPath()) || jSONObjectJ == null) {
                                return;
                            }
                            ((MainActivity) ((x1.g) activity)).Q(jSONObjectJ.optString(ImagesContract.URL), jSONObjectJ.optString("mode"));
                            return;
                        }
                    }
                    if ("navigationMaxWindows".equals(uri2.getHost())) {
                        if ("/set".equals(uri2.getPath()) || jSONObjectJ == null) {
                            return;
                        }
                        aVarU.A(jSONObjectJ.optBoolean("enabled", aVarU.D), jSONObjectJ.optInt("data", jSONObjectJ.optInt("numWindows", aVarU.E)), jSONObjectJ.optBoolean("autoClose", aVarU.F), jSONObjectJ.optBoolean("persist"));
                        return;
                    }
                    if (!"navigationTitles".equals(uri2.getHost()) && jSONObjectJ != null) {
                        if (!"/set".equals(uri2.getPath())) {
                            if ("/setCurrent".equals(uri2.getPath())) {
                                ((MainActivity) ((x1.g) activity)).a0(jSONObjectJ.optString("title"));
                                return;
                            }
                            return;
                        }
                        boolean zOptBoolean2 = jSONObjectJ.optBoolean("persist");
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectJ.optJSONObject("data");
                        if (jSONObjectOptJSONObject2 == null) {
                            try {
                                jSONObjectOptJSONObject2 = new JSONObject(jSONObjectJ.optString("data"));
                            } catch (JSONException e13) {
                                x1.f.a().e("co.median.median_core.Bridge", "Median Navigation Titles JSONException:- " + e13.getMessage(), e13);
                            }
                        }
                        aVarU.C(jSONObjectOptJSONObject2, zOptBoolean2);
                        return;
                    }
                    if (!"navigationLevels".equals(uri2.getHost()) && jSONObjectJ != null) {
                        if ("/set".equals(uri2.getPath())) {
                            boolean zOptBoolean3 = jSONObjectJ.optBoolean("persist");
                            JSONObject jSONObjectOptJSONObject3 = jSONObjectJ.optJSONObject("data");
                            if (jSONObjectOptJSONObject3 == null) {
                                try {
                                    jSONObjectOptJSONObject3 = new JSONObject(jSONObjectJ.optString("data"));
                                } catch (JSONException e14) {
                                    x1.f.a().e("co.median.median_core.Bridge", "Median Navigation Levels JSONException:- " + e14.getMessage(), e14);
                                    return;
                                }
                            }
                            aVarU.B(jSONObjectOptJSONObject3, zOptBoolean3);
                            return;
                        }
                        return;
                    }
                    if ("swipeGestures".equals(uri2.getHost())) {
                        if ("/enable".equals(uri2.getPath())) {
                            aVarU.C = true;
                            return;
                        } else {
                            if ("/disable".equals(uri2.getPath())) {
                                aVarU.C = false;
                                return;
                            }
                            return;
                        }
                    }
                    if ("sidebar".equals(uri2.getHost())) {
                        if ("/setItems".equals(uri2.getPath()) || jSONObjectJ == null) {
                            if ("/getItems".equals(uri2.getPath()) || jSONObjectJ == null || jSONObjectJ.optString("callback").isEmpty()) {
                                return;
                            }
                            String strOptString8 = jSONObjectJ.optString("callback");
                            JSONObject jSONObjectW = aVarU.w();
                            if (jSONObjectW != null) {
                                ((MainActivity) ((x1.g) activity)).V(t2.i.e(strOptString8, jSONObjectW), null);
                                return;
                            }
                            return;
                        }
                        Object objOptJSONArray = jSONObjectJ.optJSONArray("items");
                        if (objOptJSONArray == null) {
                            String strOptString9 = jSONObjectJ.optString("items");
                            if (!strOptString9.isEmpty()) {
                                try {
                                    objOptJSONArray = new JSONTokener(strOptString9).nextValue();
                                } catch (JSONException unused) {
                                    Log.d("co.median.median_core.Bridge", "Median sidebar error: items is not JSON object");
                                    return;
                                }
                            }
                        }
                        boolean zOptBoolean4 = jSONObjectJ.optBoolean("enabled", true);
                        if (jSONObjectJ.has("persist")) {
                            aVarU.F(objOptJSONArray, zOptBoolean4, jSONObjectJ.optBoolean("persist", false));
                        } else {
                            aVarU.E(objOptJSONArray);
                        }
                        ((MainActivity) ((x1.g) activity)).d0(zOptBoolean4);
                        return;
                    }
                    if (!"share".equals(uri2.getHost()) && jSONObjectJ != null) {
                        String strOptString10 = jSONObjectJ.optString(ImagesContract.URL);
                        String strOptString11 = jSONObjectJ.optString("filename");
                        boolean zOptBoolean5 = jSONObjectJ.optBoolean("open");
                        String strOptString12 = jSONObjectJ.optString("callback");
                        if ("/sharePage".equals(uri2.getPath())) {
                            ((MainActivity) ((x1.g) activity)).l0(strOptString10, jSONObjectJ.optString("text"));
                            return;
                        } else if ("/downloadFile".equals(uri2.getPath())) {
                            ((MainActivity) ((x1.g) activity)).C(strOptString10, strOptString11, false, zOptBoolean5, strOptString12);
                            return;
                        } else {
                            if ("/downloadImage".equals(uri2.getPath())) {
                                ((MainActivity) ((x1.g) activity)).C(strOptString10, strOptString11, true, zOptBoolean5, strOptString12);
                                return;
                            }
                            return;
                        }
                    }
                    if ("tabs".equals(uri2.getHost())) {
                        if (!uri2.getPath().startsWith("/select/")) {
                            pathSegments = uri2.getPathSegments();
                            if (pathSegments.size() == 2) {
                                str = pathSegments.get(1);
                                try {
                                    i4 = Integer.parseInt(str);
                                    if (i4 >= 0) {
                                        ((MainActivity) ((x1.g) activity)).W(i4);
                                        return;
                                    }
                                    return;
                                } catch (NumberFormatException e15) {
                                    x1.f.a().e("co.median.median_core.Bridge", "Invalid tab number " + str, e15);
                                    return;
                                }
                            }
                            return;
                        }
                        if ("/deselect".equals(uri2.getPath())) {
                            ((MainActivity) ((x1.g) activity)).B();
                            return;
                        }
                        if ("/setTabs".equals(uri2.getPath()) || jSONObjectJ == null) {
                            return;
                        }
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectJ.optJSONObject("tabs");
                        if (jSONObjectOptJSONObject4 == null) {
                            String strOptString13 = jSONObjectJ.optString("tabs");
                            if (strOptString13.isEmpty()) {
                                return;
                            }
                            try {
                                jSONObjectOptJSONObject4 = new JSONObject(strOptString13);
                            } catch (JSONException e16) {
                                x1.f.a().e("co.median.median_core.Bridge", "Median Tabs JSONException", e16);
                                return;
                            }
                        }
                        ((MainActivity) ((x1.g) activity)).h0(jSONObjectOptJSONObject4, jSONObjectOptJSONObject4.optInt("tabMenu", -1));
                        return;
                    }
                    if ("connectivity".equals(uri2.getHost())) {
                        if ("/get".equals(uri2.getPath())) {
                            if (jSONObjectJ != null && !jSONObjectJ.optString("callback").isEmpty()) {
                                ((MainActivity) ((x1.g) activity)).Y(jSONObjectJ.optString("callback"));
                            }
                        } else if ("/subscribe".equals(uri2.getPath())) {
                            if (jSONObjectJ != null && !jSONObjectJ.optString("callback").isEmpty()) {
                                ((MainActivity) ((x1.g) activity)).p0(jSONObjectJ.optString("callback"));
                            }
                        } else if ("/unsubscribe".equals(uri2.getPath())) {
                            ((MainActivity) ((x1.g) activity)).t0();
                        }
                    }
                    if ("camera".equals(uri2.getHost())) {
                        aVar = aVarU.f4686o1;
                        if (!"/setCaptureQuality".equals(uri2.getPath()) && jSONObjectJ != null) {
                            String upperCase = jSONObjectJ.optString("quality").toUpperCase();
                            if (TextUtils.isEmpty(upperCase)) {
                                return;
                            }
                            if (!upperCase.equals("LOW") && !upperCase.equals("HIGH")) {
                                return;
                            } else {
                                aVar.e(androidx.fragment.app.u.d(upperCase.toUpperCase()));
                            }
                        } else if ("/saveToGallery".equals(uri2.getPath()) && jSONObjectJ != null) {
                            aVar.f(jSONObjectJ.optBoolean("saveToGallery", aVar.d()));
                        }
                        aVar.c(activity);
                        return;
                    }
                    if ("audio".equals(uri2.getHost())) {
                        if ("/requestFocus".equals(uri2.getPath()) || !aVarU.J0.a() || jSONObjectJ == null) {
                            return;
                        }
                        ((MainActivity) ((x1.g) activity)).D(jSONObjectJ.optBoolean("enabled", true));
                        return;
                    }
                    if ("statusbar".equals(uri2.getHost())) {
                        if ("/set".equals(uri2.getPath()) || jSONObjectJ == null) {
                            return;
                        }
                        String strOptString14 = jSONObjectJ.optString("color");
                        if (!TextUtils.isEmpty(strOptString14) && (numH3 = t2.i.H(strOptString14)) != null) {
                            ((MainActivity) ((x1.g) activity)).e0(numH3.intValue());
                        }
                        if (jSONObjectJ.has("style")) {
                            String strOptString15 = jSONObjectJ.optString("style");
                            r1 r1Var = ((MainActivity) ((x1.g) activity)).D0;
                            if (r1Var != null && strOptString15 != null && !y3.j.w(strOptString15)) {
                                r1Var.f4085l = strOptString15;
                                a3.h0 h0Var = r1Var.f4079e;
                                if (h0Var == null) {
                                    r3.g.c("insetsController");
                                    throw null;
                                }
                                ((e4.a) h0Var.f84g).c0(r1Var.b(strOptString15));
                            }
                        }
                        if (jSONObjectJ.has("overlay")) {
                            boolean zOptBoolean6 = jSONObjectJ.optBoolean("overlay");
                            MainActivity mainActivity10 = (MainActivity) ((x1.g) activity);
                            if (mainActivity10.D0 == null) {
                                return;
                            }
                            x1.a.u(mainActivity10).f4699t0 = zOptBoolean6;
                            mainActivity10.D0.f4075a.getWindow().getDecorView().requestApplyInsets();
                            return;
                        }
                        return;
                    }
                    uri3 = uri2;
                    if ("systemNavBar".equals(uri2.getHost())) {
                        if ("/set".equals(uri3.getPath()) || jSONObjectJ == null) {
                            return;
                        }
                        String strOptString16 = jSONObjectJ.optString("color");
                        if (!TextUtils.isEmpty(strOptString16) && (numH2 = t2.i.H(strOptString16)) != null) {
                            ((MainActivity) ((x1.g) activity)).g0(numH2.intValue());
                        }
                        if (jSONObjectJ.has("style")) {
                            String strOptString17 = jSONObjectJ.optString("style");
                            r1 r1Var2 = ((MainActivity) ((x1.g) activity)).D0;
                            if (r1Var2 != null && strOptString17 != null && !y3.j.w(strOptString17)) {
                                r1Var2.f4086m = strOptString17;
                                a3.h0 h0Var2 = r1Var2.f4079e;
                                if (h0Var2 == null) {
                                    r3.g.c("insetsController");
                                    throw null;
                                }
                                ((e4.a) h0Var2.f84g).b0(r1Var2.b(strOptString17));
                            }
                        }
                        if (jSONObjectJ.has("overlay")) {
                            boolean zOptBoolean7 = jSONObjectJ.optBoolean("overlay");
                            MainActivity mainActivity11 = (MainActivity) ((x1.g) activity);
                            if (mainActivity11.D0 == null) {
                                return;
                            }
                            x1.a.u(mainActivity11).f4701u0 = zOptBoolean7;
                            mainActivity11.D0.f4075a.getWindow().getDecorView().requestApplyInsets();
                            return;
                        }
                        return;
                    }
                    if ("systemBars".equals(uri3.getHost())) {
                        if ("/set".equals(uri3.getPath()) || jSONObjectJ == null) {
                            return;
                        }
                        String strOptString18 = jSONObjectJ.optString("color");
                        if (!TextUtils.isEmpty(strOptString18) && (numH = t2.i.H(strOptString18)) != null) {
                            ((MainActivity) ((x1.g) activity)).f0(numH.intValue());
                        }
                        if (jSONObjectJ.has("style")) {
                            String strOptString19 = jSONObjectJ.optString("style");
                            MainActivity mainActivity12 = (MainActivity) ((x1.g) activity);
                            r1 r1Var3 = mainActivity12.D0;
                            if (r1Var3 != null && strOptString19 != null && !y3.j.w(strOptString19)) {
                                r1Var3.f4085l = strOptString19;
                                a3.h0 h0Var3 = r1Var3.f4079e;
                                if (h0Var3 == null) {
                                    r3.g.c("insetsController");
                                    throw null;
                                }
                                ((e4.a) h0Var3.f84g).c0(r1Var3.b(strOptString19));
                            }
                            r1 r1Var4 = mainActivity12.D0;
                            if (r1Var4 != null && strOptString19 != null && !y3.j.w(strOptString19)) {
                                r1Var4.f4086m = strOptString19;
                                a3.h0 h0Var4 = r1Var4.f4079e;
                                if (h0Var4 == null) {
                                    r3.g.c("insetsController");
                                    throw null;
                                }
                                ((e4.a) h0Var4.f84g).b0(r1Var4.b(strOptString19));
                            }
                        }
                        if (jSONObjectJ.has("overlay")) {
                            boolean zOptBoolean8 = jSONObjectJ.optBoolean("overlay");
                            MainActivity mainActivity13 = (MainActivity) ((x1.g) activity);
                            if (mainActivity13.D0 != null) {
                                x1.a.u(mainActivity13).f4699t0 = zOptBoolean8;
                                mainActivity13.D0.f4075a.getWindow().getDecorView().requestApplyInsets();
                            }
                            if (mainActivity13.D0 == null) {
                                return;
                            }
                            x1.a.u(mainActivity13).f4701u0 = zOptBoolean8;
                            mainActivity13.D0.f4075a.getWindow().getDecorView().requestApplyInsets();
                            return;
                        }
                        return;
                    }
                    if ("internalExternal".equals(uri3.getHost())) {
                        if ("/set".equals(uri3.getPath())) {
                            if (jSONObjectJ != null || jSONObjectJ.length() == 0) {
                                aVarU.D(null);
                                return;
                            }
                            try {
                                JSONArray jSONArrayOptJSONArray2 = jSONObjectJ.optJSONArray("rules");
                                if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) {
                                    aVarU.D(null);
                                    return;
                                }
                                for (int i7 = 0; i7 < jSONArrayOptJSONArray2.length(); i7++) {
                                    if (TextUtils.isEmpty(jSONArrayOptJSONArray2.getJSONObject(i7).optString("regex"))) {
                                        x1.f.a().c("co.median.median_core.Bridge", "handleJSBridgeFunctions: internalExternal/set format error, missing field");
                                        return;
                                    }
                                }
                                aVarU.D(jSONArrayOptJSONArray2);
                                return;
                            } catch (JSONException e17) {
                                x1.f.a().e("co.median.median_core.Bridge", "handleJSBridgeFunctions: internalExternal/set parse error", e17);
                                return;
                            }
                        }
                        return;
                    }
                    if (!"keyboard".equals(uri3.getHost()) && jSONObjectJ != null) {
                        String strOptString20 = jSONObjectJ.optString("callback");
                        if ("/info".equals(uri3.getPath())) {
                            ((MainActivity) ((x1.g) activity)).F(strOptString20);
                            return;
                        } else {
                            if ("/listen".equals(uri3.getPath())) {
                                ((MainActivity) ((x1.g) activity)).w(strOptString20);
                                return;
                            }
                            return;
                        }
                    }
                    if (!"clipboard".equals(uri3.getHost()) && jSONObjectJ != null) {
                        if (!"/set".equals(uri3.getPath())) {
                            if ("/get".equals(uri3.getPath())) {
                                ((MainActivity) ((x1.g) activity)).z(jSONObjectJ.optString("callback"));
                                return;
                            }
                            return;
                        } else {
                            String strOptString21 = jSONObjectJ.optString("data");
                            MainActivity mainActivity14 = (MainActivity) ((x1.g) activity);
                            if (strOptString21.isEmpty()) {
                                return;
                            }
                            ((ClipboardManager) mainActivity14.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copy", strOptString21));
                            return;
                        }
                    }
                    if ("events".equals(uri3.getHost())) {
                        if (!"/subscribe".equals(uri3.getPath()) && jSONObjectJ != null) {
                            String strOptString22 = jSONObjectJ.optString("eventName");
                            if (TextUtils.isEmpty(strOptString22)) {
                                return;
                            }
                            ((MainActivity) ((x1.g) activity)).q0(strOptString22);
                            return;
                        }
                        if ("/unsubscribe".equals(uri3.getPath()) || jSONObjectJ == null) {
                        }
                        String strOptString23 = jSONObjectJ.optString("eventName");
                        if (TextUtils.isEmpty(strOptString23)) {
                            return;
                        }
                        ((MainActivity) ((x1.g) activity)).u0(strOptString23);
                        return;
                    }
                    if ("contextMenu".equals(uri3.getHost()) || jSONObjectJ == null) {
                        if ("permissions".equals(uri3.getHost()) || jSONObjectJ == null || !"/status".equals(uri3.getPath())) {
                            return;
                        }
                        String strOptString24 = jSONObjectJ.optString("callback");
                        if (TextUtils.isEmpty(strOptString24)) {
                            return;
                        }
                        MainActivity mainActivity15 = (MainActivity) ((x1.g) activity);
                        mainActivity15.V(t2.i.e(strOptString24, new JSONObject(mainActivity15.y(jSONObjectJ.optJSONArray("permissions")))), null);
                        return;
                    }
                    if (!"/setEnabled".equals(uri3.getPath())) {
                        if (!"/setLinkActions".equals(uri3.getPath()) || (jSONArrayOptJSONArray = jSONObjectJ.optJSONArray("linkActions")) == null) {
                            return;
                        }
                        aVarU.I0 = new z1.b(aVarU.I0.f4857a, jSONArrayOptJSONArray);
                        return;
                    }
                    boolean zOptBoolean9 = jSONObjectJ.optBoolean("enabled", aVarU.I0.f4857a);
                    MainActivity mainActivity16 = (MainActivity) ((x1.g) activity);
                    WebViewContainerView webViewContainerView = mainActivity16.F;
                    if (webViewContainerView == null) {
                        return;
                    }
                    if (zOptBoolean9) {
                        mainActivity16.registerForContextMenu(webViewContainerView);
                        return;
                    } else {
                        mainActivity16.unregisterForContextMenu(webViewContainerView);
                        return;
                    }
                }
                uri = Uri.parse(jSONObject.optString("medianCommand"));
            } catch (Exception e18) {
                Log.d("co.median.median_core.Bridge", "GoNative Handle JS Bridge Functions Error:- " + e18.getMessage());
                return;
            }
        }
        uri2 = uri;
        it = ((ArrayList) a()).iterator();
        if (!it.hasNext()) {
            androidx.fragment.app.u.n(it.next());
            throw null;
        }
        Objects.requireNonNull(uri2);
        if ("system".equals(uri2.getHost())) {
            if ("/exitApp".equals(uri2.getPath())) {
                activity.finishAffinity();
                return;
            }
            return;
        }
        if ("registration".equals(uri2.getHost())) {
            mainActivity = (MainActivity) ((x1.g) activity);
            if (mainActivity.f1172c0 != null) {
                if (jSONObjectJ != null) {
                    jSONObjectOptJSONObject = jSONObjectJ.optJSONObject("customData");
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject(jSONObjectJ.optString("customData"));
                    }
                    if (jSONObjectOptJSONObject != null) {
                        xVar = mainActivity.f1172c0;
                        xVar.f593b = jSONObjectOptJSONObject;
                        while (r9.hasNext()) {
                            str2 = (String) xVar.f594c;
                            if (str2 == null) {
                            }
                        }
                    }
                }
                it2 = ((LinkedList) mainActivity.f1172c0.f595d).iterator();
                while (it2.hasNext()) {
                    ((n1) it2.next()).a();
                }
            }
        }
        boolean zIsLocationEnabled2 = false;
        zIsLocationEnabled2 = false;
        zIsLocationEnabled2 = false;
        if ("nativebridge".equals(uri2.getHost())) {
            if (!"/multi".equals(uri2.getPath())) {
                if ("/custom".equals(uri2.getPath())) {
                    return;
                } else {
                    return;
                }
            }
            if (jSONObjectJ == null) {
                return;
            }
            strOptString3 = jSONObjectJ.optString("data");
            if (strOptString3.isEmpty()) {
                return;
            }
            jSONArray = new JSONObject(strOptString3).getJSONArray("urls");
            while (i5 < jSONArray.length()) {
                uri4 = Uri.parse(jSONArray.getString(i5));
                if (!"gonative".equals(uri4.getScheme())) {
                    b(activity, uri4);
                }
            }
            return;
        }
        if ("open".equals(uri2.getHost())) {
            if ("/app-settings".equals(uri2.getPath())) {
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", activity.getPackageName(), null));
                activity.startActivity(intent2);
                return;
            }
            return;
        }
        if ("webview".equals(uri2.getHost())) {
            if ("/clearCache".equals(uri2.getPath())) {
                Log.d("co.median.median_core.Bridge", "Clearing webview cache");
                ((MainActivity) ((x1.g) activity)).G.clearCache(true);
                return;
            }
            if ("/clearCookies".equals(uri2.getPath())) {
                Log.d("co.median.median_core.Bridge", "Clearing webview cookies");
                CookieManager cookieManager2 = CookieManager.getInstance();
                cookieManager2.removeAllCookies(new u0());
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new androidx.activity.k(12, cookieManager2));
                return;
            }
            if ("/reload".equals(uri2.getPath())) {
                Log.d("co.median.median_core.Bridge", "Reloading webview");
                ((MainActivity) ((x1.g) activity)).R();
                return;
            } else {
                if (!"/setZoom".equals(uri2.getPath())) {
                }
                if ("/getZoom".equals(uri2.getPath())) {
                    return;
                } else {
                    return;
                }
            }
        }
        if ("run".equals(uri2.getHost())) {
            strOptString2 = "median_device_info";
            if (jSONObjectJ != null) {
                strOptString2 = jSONObjectJ.optString("callback", "median_device_info");
                zOptBoolean = jSONObjectJ.optBoolean("includeCarrierNames", false);
            } else {
                zOptBoolean = false;
            }
            ((MainActivity) ((x1.g) activity)).U(strOptString2, zOptBoolean);
        }
        if ("geoLocation".equals(uri2.getHost())) {
            if ("/promptLocationServices".equals(uri2.getPath())) {
                ((MainActivity) ((x1.g) activity)).f1177k0.a();
                return;
            } else if ("/isLocationServicesEnabled".equals(uri2.getPath())) {
                return;
            } else {
                return;
            }
        }
        if (!"config".equals(uri2.getHost())) {
        }
        if ("screen".equals(uri2.getHost())) {
            if ("/setBrightness".equals(uri2.getPath())) {
                if ("/fullscreen".equals(uri2.getPath())) {
                    ((MainActivity) ((x1.g) activity)).s0(true);
                    return;
                }
                if ("/normal".equals(uri2.getPath())) {
                    ((MainActivity) ((x1.g) activity)).s0(false);
                    return;
                }
                if ("/keepScreenOn".equals(uri2.getPath())) {
                    ((MainActivity) ((x1.g) activity)).getWindow().addFlags(128);
                    return;
                }
                if ("/keepScreenNormal".equals(uri2.getPath())) {
                    ((MainActivity) ((x1.g) activity)).getWindow().clearFlags(128);
                    return;
                }
                if (!"/setColorScheme".equals(uri2.getPath())) {
                }
                if (!"/resetColorScheme".equals(uri2.getPath())) {
                    if ("/setMode".equals(uri2.getPath())) {
                        return;
                    } else {
                        return;
                    }
                } else {
                    MainActivity mainActivity17 = (MainActivity) ((x1.g) activity);
                    String str6 = x1.a.u(mainActivity17).f4677l0;
                    mainActivity17.A0 = str6;
                    mainActivity17.i0(str6);
                    return;
                }
            }
            if (jSONObjectJ == null) {
                return;
            }
            strOptString = jSONObjectJ.optString("brightness");
            if (strOptString.isEmpty()) {
                x1.f.a().d("co.median.median_core.Bridge", "Brightness not specified in " + uri2.toString(), null);
                return;
            }
            if (strOptString.equals("default")) {
                MainActivity mainActivity18 = (MainActivity) ((x1.g) activity);
                WindowManager.LayoutParams attributes3 = mainActivity18.getWindow().getAttributes();
                attributes3.screenBrightness = -1.0f;
                mainActivity18.getWindow().setAttributes(attributes3);
                mainActivity18.f1184r0 = false;
                return;
            }
            f = Float.parseFloat(strOptString);
            if (f >= 0.0f) {
                x1.f.a().c("co.median.median_core.Bridge", "Invalid brightness value in " + uri2.toString());
            } else {
                x1.f.a().c("co.median.median_core.Bridge", "Invalid brightness value in " + uri2.toString());
            }
            return;
        }
        if ("window".equals(uri2.getHost())) {
            if ("/close".equals(uri2.getPath())) {
                ((MainActivity) ((x1.g) activity)).A();
                return;
            } else if ("/open".equals(uri2.getPath())) {
                return;
            } else {
                return;
            }
        }
        if ("navigationMaxWindows".equals(uri2.getHost())) {
            if ("/set".equals(uri2.getPath())) {
                return;
            } else {
                return;
            }
        }
        if (!"navigationTitles".equals(uri2.getHost())) {
        }
        if (!"navigationLevels".equals(uri2.getHost())) {
        }
        if ("swipeGestures".equals(uri2.getHost())) {
            if ("/enable".equals(uri2.getPath())) {
                aVarU.C = true;
                return;
            } else {
                if ("/disable".equals(uri2.getPath())) {
                    aVarU.C = false;
                    return;
                }
                return;
            }
        }
        if ("sidebar".equals(uri2.getHost())) {
            if ("/setItems".equals(uri2.getPath())) {
            }
            if ("/getItems".equals(uri2.getPath())) {
                return;
            } else {
                return;
            }
        }
        if (!"share".equals(uri2.getHost())) {
        }
        if ("tabs".equals(uri2.getHost())) {
            if (!uri2.getPath().startsWith("/select/")) {
                if ("/deselect".equals(uri2.getPath())) {
                    ((MainActivity) ((x1.g) activity)).B();
                    return;
                } else if ("/setTabs".equals(uri2.getPath())) {
                    return;
                } else {
                    return;
                }
            }
            pathSegments = uri2.getPathSegments();
            if (pathSegments.size() == 2) {
                str = pathSegments.get(1);
                i4 = Integer.parseInt(str);
                if (i4 >= 0) {
                    ((MainActivity) ((x1.g) activity)).W(i4);
                    return;
                }
                return;
            }
            return;
        }
        if ("connectivity".equals(uri2.getHost())) {
            if ("/get".equals(uri2.getPath())) {
                if (jSONObjectJ != null) {
                    ((MainActivity) ((x1.g) activity)).Y(jSONObjectJ.optString("callback"));
                }
            } else if ("/subscribe".equals(uri2.getPath())) {
                if (jSONObjectJ != null) {
                    ((MainActivity) ((x1.g) activity)).p0(jSONObjectJ.optString("callback"));
                }
            } else if ("/unsubscribe".equals(uri2.getPath())) {
                ((MainActivity) ((x1.g) activity)).t0();
            }
        }
        if ("camera".equals(uri2.getHost())) {
            aVar = aVarU.f4686o1;
            if (!"/setCaptureQuality".equals(uri2.getPath())) {
                if ("/saveToGallery".equals(uri2.getPath())) {
                    aVar.f(jSONObjectJ.optBoolean("saveToGallery", aVar.d()));
                }
            } else if ("/saveToGallery".equals(uri2.getPath())) {
                aVar.f(jSONObjectJ.optBoolean("saveToGallery", aVar.d()));
            }
            aVar.c(activity);
            return;
        }
        if ("audio".equals(uri2.getHost())) {
            if ("/requestFocus".equals(uri2.getPath())) {
                return;
            } else {
                return;
            }
        }
        if ("statusbar".equals(uri2.getHost())) {
            if ("/set".equals(uri2.getPath())) {
                return;
            } else {
                return;
            }
        }
        uri3 = uri2;
        if ("systemNavBar".equals(uri2.getHost())) {
            if ("/set".equals(uri3.getPath())) {
                return;
            } else {
                return;
            }
        }
        if ("systemBars".equals(uri3.getHost())) {
            if ("/set".equals(uri3.getPath())) {
                return;
            } else {
                return;
            }
        }
        if ("internalExternal".equals(uri3.getHost())) {
            if ("/set".equals(uri3.getPath())) {
                if (jSONObjectJ != null) {
                }
                aVarU.D(null);
                return;
            }
            return;
        }
        if (!"keyboard".equals(uri3.getHost())) {
        }
        if (!"clipboard".equals(uri3.getHost())) {
        }
        if ("events".equals(uri3.getHost())) {
            if (!"/subscribe".equals(uri3.getPath())) {
            }
            if ("/unsubscribe".equals(uri3.getPath())) {
            }
        } else {
            if ("contextMenu".equals(uri3.getHost())) {
            }
            if ("permissions".equals(uri3.getHost())) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(Activity activity) {
        int i4 = 0;
        if (((ArrayList) this.f4135b) == null) {
            this.f4135b = new ArrayList();
            try {
                String[] list = activity.getAssets().list("");
                Objects.requireNonNull(list);
                for (String str : list) {
                    if (str.endsWith("-plugin.js") && !str.equals("GoNativeJSBridgeLibrary.js")) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        t1.l.g(new BufferedInputStream(activity.getAssets().open(str)), byteArrayOutputStream);
                        ((ArrayList) this.f4135b).add(byteArrayOutputStream.toString());
                    }
                }
            } catch (IOException e5) {
                x1.f.a().d("co.median.median_core.Bridge", e5.getMessage(), null);
            }
        }
        ArrayList arrayList = (ArrayList) this.f4135b;
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            String str2 = (String) obj;
            if (activity != 0) {
                ((MainActivity) ((x1.g) activity)).V(str2, null);
            }
        }
    }

    public x(MainActivity mainActivity) {
        this.f4135b = mainActivity;
        this.f4136c = new g1(this);
    }
}
