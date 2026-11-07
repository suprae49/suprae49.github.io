package k;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebResourceResponse;
import androidx.appcompat.widget.ActionBarContextView;
import co.median.android.MainActivity;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p0.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2464b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2465c;

    public a(MainActivity mainActivity) {
        this.f2463a = 0;
        DisplayMetrics displayMetrics = mainActivity.getResources().getDisplayMetrics();
        this.f2463a = (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    public static String d(String str) {
        if (str.isEmpty()) {
            return null;
        }
        for (String str2 : str.split("; *")) {
            if (str2.startsWith("charset=")) {
                return str2.substring(8);
            }
        }
        return null;
    }

    public static String f(String str, float f, double d5) {
        if (str == null) {
            return str;
        }
        if (f <= 0.0f && Double.isNaN(d5)) {
            return str;
        }
        Matcher matcher = Pattern.compile("<meta[^>]*name=[\"']viewport[\"'][^>]*>", 2).matcher(str);
        if (!matcher.find()) {
            return str;
        }
        String strGroup = matcher.group();
        if (f > 0.0f) {
            if (strGroup.contains("initial-scale")) {
                strGroup = strGroup.replaceAll("initial-scale\\s*=\\s*[^,\"]+", "initial-scale=" + f);
            } else {
                strGroup = strGroup.replaceFirst("content\\s*=\\s*\"([^\"]*)\"", "content=\"$1, " + ("initial-scale=" + f) + "\"");
            }
        }
        if (!Double.isNaN(d5)) {
            int i4 = (int) d5;
            String strValueOf = d5 == ((double) i4) ? String.valueOf(i4) : String.valueOf(d5);
            if (strGroup.contains("width")) {
                strGroup = strGroup.replaceAll("width\\s*=\\s*[^,\"]+", "width=" + strValueOf);
            } else {
                strGroup = strGroup.replaceFirst("content\\s*=\\s*\"([^\"]*)\"", "content=\"$1, " + ("width=" + strValueOf) + "\"");
            }
        }
        return matcher.replaceFirst(strGroup);
    }

    public static String g(String str) {
        if (str == null || str.isEmpty()) {
            return "/";
        }
        return (!str.endsWith("/") || str.length() <= 1) ? str : str.substring(0, str.length() - 1);
    }

    @Override // p0.s0
    public void a() {
        if (this.f2464b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f2465c;
        actionBarContextView.f293k = null;
        super/*android.view.View*/.setVisibility(this.f2463a);
    }

    @Override // p0.s0
    public void b() {
        this.f2464b = true;
    }

    @Override // p0.s0
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f2464b = false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    public WebResourceResponse e(Activity activity, x1.i iVar, String str, String str2) throws Throwable {
        boolean zEquals;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedInputStream bufferedInputStream3;
        BufferedInputStream bufferedInputStream4;
        x1.a aVarU = x1.a.u(activity);
        ArrayList arrayList = aVarU.E0;
        String str3 = aVarU.f4673k;
        if (arrayList != null) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                if (((Pattern) obj).matcher(str).matches()) {
                    return null;
                }
            }
        }
        float f = aVarU.A;
        double d5 = aVarU.f4674k0;
        HashMap map = aVarU.f4700u;
        boolean z4 = (map == null || map.isEmpty()) ? false : true;
        boolean z5 = f > 0.0f || !Double.isNaN(d5);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (!aVarU.W0 && !z4 && !z5) {
            return null;
        }
        if (!this.f2464b) {
            this.f2465c = str;
            this.f2464b = true;
        }
        String str4 = (String) this.f2465c;
        if (str4 == null || str == null) {
            zEquals = false;
        } else {
            try {
                URL url = new URL(str4);
                URL url2 = new URL(str);
                String protocol = url.getProtocol();
                String protocol2 = url2.getProtocol();
                if (protocol == null ? protocol2 == null : protocol.equalsIgnoreCase(protocol2)) {
                    String host = url.getHost();
                    String host2 = url2.getHost();
                    if (host == null ? host2 == null : host.equalsIgnoreCase(host2)) {
                        if ((url.getPort() != -1 ? url.getPort() : url.getDefaultPort()) == (url2.getPort() != -1 ? url2.getPort() : url2.getDefaultPort()) && Objects.equals(url.getQuery(), url2.getQuery())) {
                            zEquals = g(url.getPath()).equals(g(url2.getPath()));
                        }
                    }
                    zEquals = false;
                } else {
                    zEquals = false;
                }
            } catch (MalformedURLException unused) {
            }
        }
        if (!zEquals) {
            return null;
        }
        try {
            URL url3 = new URL(str);
            String protocol3 = url3.getProtocol();
            if (!protocol3.equalsIgnoreCase("http") && !protocol3.equalsIgnoreCase("https")) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url3.openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            String strG = aVarU.G(url3.toString());
            if (strG != null) {
                httpURLConnection.setRequestProperty("User-Agent", strG);
            } else if (TextUtils.isEmpty(str3)) {
                httpURLConnection.setRequestProperty("User-Agent", ((u1.o0) iVar).getDefaultUserAgent() + " " + aVarU.f4671j);
            } else {
                httpURLConnection.setRequestProperty("User-Agent", str3);
            }
            httpURLConnection.setRequestProperty("Cache-Control", "no-cache");
            if (str2 != null) {
                httpURLConnection.setRequestProperty("Referer", str2);
            }
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toLanguageTag());
            HashMap mapK = t2.i.k(activity);
            if (mapK != null) {
                for (Map.Entry entry : mapK.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307) {
                String contentType = httpURLConnection.getContentType();
                if (contentType == null) {
                    try {
                        bufferedInputStream3 = new BufferedInputStream(httpURLConnection.getInputStream());
                    } catch (IOException unused2) {
                        bufferedInputStream3 = new BufferedInputStream(httpURLConnection.getErrorStream());
                    }
                    bufferedInputStream2 = bufferedInputStream3;
                    try {
                        contentType = URLConnection.guessContentTypeFromStream(bufferedInputStream2);
                    } catch (Exception e5) {
                        e = e5;
                        byteArrayOutputStream = null;
                        x1.f.a().d("k.a", e.toString(), e);
                        t1.l.e(bufferedInputStream2);
                        t1.l.e(byteArrayOutputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                    }
                } else {
                    bufferedInputStream2 = null;
                }
                if (contentType != null && contentType.startsWith("text/html")) {
                    String strD = d(contentType);
                    if (strD == null) {
                        strD = "UTF-8";
                    } else if (strD.toLowerCase().equals("iso-8859-1")) {
                        strD = "windows-1252";
                    }
                    if (bufferedInputStream2 == null) {
                        try {
                            bufferedInputStream4 = new BufferedInputStream(httpURLConnection.getInputStream());
                        } catch (IOException unused3) {
                            bufferedInputStream4 = new BufferedInputStream(httpURLConnection.getErrorStream());
                        }
                        bufferedInputStream2 = bufferedInputStream4;
                    }
                    int contentLength = httpURLConnection.getContentLength();
                    if (contentLength < 0) {
                        contentLength = 10240;
                    }
                    byteArrayOutputStream = new ByteArrayOutputStream(contentLength);
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i5 = bufferedInputStream2.read(bArr);
                                if (i5 <= 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i5);
                                th = th;
                                bufferedInputStream = bufferedInputStream2;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                t1.l.e(bufferedInputStream);
                                t1.l.e(byteArrayOutputStream2);
                                throw th;
                            }
                            Charset charsetForName = Charset.forName(strD);
                            String string = Build.VERSION.SDK_INT >= 33 ? byteArrayOutputStream.toString(charsetForName) : new String(byteArrayOutputStream.toByteArray(), charsetForName);
                            if (Double.isNaN(d5)) {
                                d5 = f > 0.0f ? this.f2463a / f : Double.NaN;
                            }
                            if (f > 0.0f || !Double.isNaN(d5)) {
                                string = f(string, f, d5);
                            }
                            Charset charset = StandardCharsets.UTF_8;
                            WebResourceResponse webResourceResponse = new WebResourceResponse("text/html", charset.name(), new ByteArrayInputStream(string.getBytes(charset)));
                            t1.l.e(bufferedInputStream2);
                            t1.l.e(byteArrayOutputStream);
                            return webResourceResponse;
                        } catch (Exception e6) {
                            e = e6;
                            x1.f.a().d("k.a", e.toString(), e);
                            t1.l.e(bufferedInputStream2);
                            t1.l.e(byteArrayOutputStream);
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedInputStream2;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                    }
                }
                t1.l.e(bufferedInputStream2);
                return null;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            httpURLConnection.disconnect();
            try {
                new URL(headerField);
            } catch (MalformedURLException unused4) {
                headerField = new URL(new URL(str), headerField).toString();
            }
            if (TextUtils.isEmpty(headerField)) {
                return null;
            }
            return e(activity, iVar, headerField, str);
        } catch (Exception e7) {
            e = e7;
            bufferedInputStream2 = null;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }
}
