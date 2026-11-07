package t2;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.webkit.URLUtil;
import androidx.emoji2.text.t;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import t1.l;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static String F(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public static String G(String str, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public static Integer H(String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith("#")) {
            str = "#".concat(str);
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException e5) {
            x1.f.a().d("co.median.median_core.LeanUtils", "Bad color string:".concat(str), e5);
            return null;
        }
    }

    public static Integer I(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException e5) {
            x1.f.a().d("co.median.median_core.Utils", "Bad color string:".concat(str), e5);
            return null;
        }
    }

    public static JSONObject J(Uri uri) {
        JSONObject jSONObject = new JSONObject();
        if (uri == null) {
            return null;
        }
        try {
            for (String str : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str);
                Object objNextValue = new JSONTokener(queryParameter).nextValue();
                if ((objNextValue instanceof JSONObject) || (objNextValue instanceof JSONArray)) {
                    jSONObject.put(str, objNextValue);
                } else {
                    jSONObject.put(str, queryParameter);
                }
            }
            return jSONObject;
        } catch (JSONException e5) {
            x1.f.a().d("co.median.median_core.LeanUtils", "GoNative JSONException:- " + e5.getMessage(), null);
            return null;
        }
    }

    public static int K(Context context, int i4, int i5) {
        TypedValue typedValueP = l.p(context.getTheme(), i4);
        return (typedValueP == null || typedValueP.type != 16) ? i5 : typedValueP.data;
    }

    public static TimeInterpolator L(Context context, int i4, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            q.q("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!w(strValueOf, "cubic-bezier") && !w(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (w(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(n(strArrSplit, 0), n(strArrSplit, 1), n(strArrSplit, 2), n(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!w(strValueOf, "path")) {
            q.q("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            f0.d.b(h0.s(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e5) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e5);
        }
    }

    public static void M(String str) {
        if ("light".equals(str)) {
            e.q.m(1);
            return;
        }
        if ("dark".equals(str)) {
            e.q.m(2);
        } else if ("auto".equals(str)) {
            e.q.m(-1);
        } else {
            e.q.m(1);
        }
    }

    public static void N(ContextWrapper contextWrapper, String str) {
        UiModeManager uiModeManager = (UiModeManager) contextWrapper.getSystemService("uimode");
        if ("light".equals(str)) {
            uiModeManager.setApplicationNightMode(1);
            return;
        }
        if ("dark".equals(str)) {
            uiModeManager.setApplicationNightMode(2);
        } else if ("auto".equals(str)) {
            uiModeManager.setApplicationNightMode(0);
        } else {
            uiModeManager.setApplicationNightMode(1);
        }
    }

    public static boolean P(String str, LinkedList linkedList) {
        if (str == null || linkedList.isEmpty()) {
            return false;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(String str, String str2) {
        try {
            Uri uri = Uri.parse(str);
            Uri uri2 = Uri.parse(str2);
            String path = uri.getPath();
            String path2 = uri2.getPath();
            if (path.length() >= 2 && path.substring(0, 2).equals("//")) {
                path = path.substring(1, path.length());
            }
            if (path2.length() >= 2 && path2.substring(0, 2).equals("//")) {
                path2 = path2.substring(1, path2.length());
            }
            if (path.isEmpty()) {
                path = "/";
            }
            if (path2.isEmpty()) {
                path2 = "/";
            }
            String host = uri.getHost();
            String host2 = uri2.getHost();
            if (host.startsWith("www.")) {
                host = host.substring(4);
            }
            if (host2.startsWith("www.")) {
                host2 = host2.substring(4);
            }
            return host.equals(host2) && path.equals(path2);
        } catch (Exception unused) {
        }
    }

    public static boolean a(Context context, String str) {
        x1.a aVarU = x1.a.u(context);
        ArrayList arrayList = aVarU.f4702v;
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        ArrayList arrayList2 = aVarU.f4702v;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            if (((Pattern) obj).matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static void b(int i4) {
        if (2 > i4 || i4 >= 37) {
            throw new IllegalArgumentException("radix " + i4 + " was not in valid range " + new v3.b(2, 36, 1));
        }
    }

    public static String e(String str, JSONObject jSONObject) {
        String strM;
        String str2;
        String str3;
        String str4;
        if (jSONObject == null) {
            strM = u.m("'", str, "'");
            str2 = "functionName";
            str3 = "";
            str4 = "return callbackFunction(); \n";
        } else {
            strM = "'" + str + "', " + x(jSONObject.toString());
            str2 = "functionName, jsonString";
            str3 = "var data = JSON.parse(jsonString); \n";
            str4 = "callbackFunction(data); \n";
        }
        return "function median_do_callback(" + str2 + ") { \n    if (typeof window[functionName] !== 'function') return; \n \n    try { \n" + str3 + "        var callbackFunction = window[functionName]; \n" + str4 + "    } catch (ignored) { \n \n    } \n} \nmedian_do_callback(" + strM + ");";
    }

    public static LinkedList f(Object obj) {
        LinkedList linkedList = new LinkedList();
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                String strOptString = jSONArray.isNull(i4) ? null : jSONArray.optString(i4, null);
                if (strOptString != null) {
                    try {
                        linkedList.add(Pattern.compile(strOptString));
                    } catch (PatternSyntaxException e5) {
                        x1.f.a().d("co.median.median_core.LeanUtils", "Error parsing regex: ".concat(strOptString), e5);
                    }
                }
            }
        } else if (obj instanceof String) {
            String str = (String) obj;
            try {
                linkedList.add(Pattern.compile(str));
                return linkedList;
            } catch (PatternSyntaxException e6) {
                x1.f.a().d("co.median.median_core.LeanUtils", "Error parsing regex: ".concat(str), e6);
            }
        }
        return linkedList;
    }

    public static JSONObject g(HashMap map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return jSONObject;
        } catch (JSONException e5) {
            x1.f.a().d("t1.l", "Error building custom Json Data", e5);
            return jSONObject;
        }
    }

    public static ColorStateList h(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (colorStateList = c0.c.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i4) : colorStateList;
    }

    public static ColorStateList i(Context context, t tVar, int i4) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) tVar.f579c;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (colorStateList = c0.c.getColorStateList(context, resourceId)) == null) ? tVar.h(i4) : colorStateList;
    }

    public static String j(ContextWrapper contextWrapper) {
        SharedPreferences sharedPreferencesX = e4.a.x(contextWrapper);
        String string = sharedPreferencesX.getString("io.gonative.android.appTheme", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        x1.a aVarU = x1.a.u(contextWrapper);
        String str = !TextUtils.isEmpty(aVarU.f4677l0) ? aVarU.f4677l0 : "light";
        if (TextUtils.isEmpty(str)) {
            sharedPreferencesX.edit().remove("io.gonative.android.appTheme").commit();
            return str;
        }
        sharedPreferencesX.edit().putString("io.gonative.android.appTheme", str).commit();
        return str;
    }

    public static HashMap k(Activity activity) {
        String strU;
        x1.a aVarU = x1.a.u(activity);
        if (aVarU.f4700u == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry entry : aVarU.f4700u.entrySet()) {
            String str = (String) entry.getKey();
            try {
                strU = u(activity, (String) entry.getValue());
            } catch (UnsupportedEncodingException unused) {
                strU = null;
            }
            if ((strU != null) & (str != null)) {
                map.put(str, strU);
            }
        }
        return map;
    }

    public static int l(Context context, TypedArray typedArray, int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i4, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i4, i5);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i5);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable m(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        Drawable drawableW;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (drawableW = h0.w(context, resourceId)) == null) ? typedArray.getDrawable(i4) : drawableW;
    }

    public static float n(String[] strArr, int i4) {
        float f = Float.parseFloat(strArr[i4]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static int o(Context context, int i4) {
        if (i4 == 0) {
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i4, a2.a.C);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(4, typedValue);
        if (!value) {
            value = typedArrayObtainStyledAttributes.getValue(2, typedValue);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!value) {
            return 0;
        }
        int complexUnit = typedValue.getComplexUnit();
        int i5 = typedValue.data;
        return complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i5) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i5, context.getResources().getDisplayMetrics());
    }

    public static String s(String str, String str2, String str3) {
        if (str2 != null) {
            String str4 = null;
            try {
                Matcher matcher = Pattern.compile("filename\\*\\s*=\\s*(UTF-8|ISO-8859-1)'[^'\"]*'((?:%[0-9A-F]{2}|[^%;\\s\"'])+)\\s*(?:;|$)", 2).matcher(str2);
                if (matcher.find()) {
                    String strReplace = URLDecoder.decode(matcher.group(2).replace("+", "%2B"), matcher.group(1)).replace('\\', '/');
                    String strTrim = strReplace.substring(strReplace.lastIndexOf(47) + 1).trim();
                    if (strTrim.isEmpty() || strTrim.equals(".") || strTrim.equals("..")) {
                        strTrim = null;
                    }
                    if (strTrim != null) {
                        return strTrim;
                    }
                }
            } catch (Exception e5) {
                x1.f.a().d("co.median.median_core.LeanUtils", "Error parsing content-disposition filename*", e5);
            }
            try {
                Matcher matcher2 = Pattern.compile("(?:^|;)\\s*filename\\s*=\\s*(?:\"([^\"]*)\"|([^;\\s]*))", 2).matcher(str2);
                if (matcher2.find()) {
                    String strReplace2 = (matcher2.group(1) != null ? matcher2.group(1) : matcher2.group(2)).replace('\\', '/');
                    String strTrim2 = strReplace2.substring(strReplace2.lastIndexOf(47) + 1).trim();
                    if (!strTrim2.isEmpty() && !strTrim2.equals(".") && !strTrim2.equals("..")) {
                        str4 = strTrim2;
                    }
                    if (str4 != null) {
                        return str4;
                    }
                }
            } catch (Exception e6) {
                x1.f.a().d("co.median.median_core.LeanUtils", "Error parsing content-disposition", e6);
            }
        }
        return URLUtil.guessFileName(str, str2, str3);
    }

    public static boolean t(Activity activity, String str) {
        try {
            PackageInfo packageInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 4096);
            String[] strArr = packageInfo != null ? packageInfo.requestedPermissions : null;
            if (strArr != null && strArr.length > 0) {
                ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    if (((String) obj).equals(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e5) {
            x1.f.a().d("co.median.median_core.Utils", "hasUsesPermission: ", e5);
            return false;
        }
    }

    public static String u(Context context, String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("%DEVICEID%")) {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string == null) {
                string = "";
            }
            str = str.replace("%DEVICEID%", string);
        }
        if (!str.contains("%DEVICENAME64%")) {
            return str;
        }
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        if (!str3.startsWith(str2)) {
            str3 = str2 + " " + str3;
        }
        return str.replace("%DEVICENAME64%", Base64.encodeToString(str3.getBytes("UTF-8"), 2));
    }

    public static boolean v(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean w(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static String x(String str) {
        String strReplace;
        StringBuilder sb = new StringBuilder("decodeURIComponent(\"");
        try {
            strReplace = URLEncoder.encode(str, "UTF-8").replace("+", " ");
        } catch (UnsupportedEncodingException e5) {
            x1.f.a().d("co.median.median_core.LeanUtils", e5.getMessage(), e5);
            strReplace = null;
        }
        sb.append(strReplace);
        sb.append("\")");
        return sb.toString();
    }

    public static Typeface y(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, h0.j(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public abstract void C(int i4);

    public abstract void D(View view, int i4, int i5);

    public abstract void E(View view, float f, float f4);

    public abstract void O(Object obj, float f);

    public abstract boolean Q(View view, int i4);

    public abstract int c(View view, int i4);

    public abstract int d(View view, int i4);

    public abstract float p(Object obj);

    public int q(View view) {
        return 0;
    }

    public int r() {
        return 0;
    }

    public void A() {
    }

    public void B(View view, int i4) {
    }

    public void z(int i4, int i5) {
    }
}
