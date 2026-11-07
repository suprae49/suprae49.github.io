package u1;

import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends CookieManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.webkit.CookieManager f3973a;

    @Override // java.net.CookieManager, java.net.CookieHandler
    public final Map get(URI uri, Map map) {
        if (uri == null || map == null) {
            androidx.fragment.app.q.q("Argument is null");
            return null;
        }
        String string = uri.toString();
        HashMap map2 = new HashMap();
        String cookie = this.f3973a.getCookie(string);
        if (cookie != null) {
            map2.put("Cookie", Arrays.asList(cookie));
        }
        return map2;
    }

    @Override // java.net.CookieManager
    public final CookieStore getCookieStore() {
        return null;
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public final void put(URI uri, Map map) {
        android.webkit.CookieManager cookieManager = this.f3973a;
        if (uri == null || map == null) {
            return;
        }
        String string = uri.toString();
        String string2 = null;
        int i4 = x1.a.u(null).f4676l;
        for (String str : map.keySet()) {
            if (str != null && str.equalsIgnoreCase("Set-Cookie")) {
                for (String str2 : (List) map.get(str)) {
                    boolean z4 = true;
                    if (i4 > 0) {
                        for (HttpCookie httpCookie : HttpCookie.parse(str2)) {
                            if (httpCookie.getMaxAge() < 0 || httpCookie.getDiscard()) {
                                httpCookie.setMaxAge(i4);
                                z4 = false;
                                httpCookie.setDiscard(false);
                                if (string2 == null) {
                                    Calendar calendar = Calendar.getInstance();
                                    calendar.add(13, i4);
                                    Date time = calendar.getTime();
                                    StringBuilder sb = new StringBuilder("; expires=");
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
                                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                                    sb.append(simpleDateFormat.format(time));
                                    sb.append("; Max-Age=");
                                    sb.append(Integer.toString(i4));
                                    string2 = sb.toString();
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(httpCookie.toString());
                                sb2.append(string2);
                                if (httpCookie.getPath() != null) {
                                    sb2.append("; path=");
                                    sb2.append(httpCookie.getPath());
                                }
                                if (httpCookie.getDomain() != null) {
                                    sb2.append("; domain=");
                                    sb2.append(httpCookie.getDomain());
                                }
                                if (httpCookie.getSecure()) {
                                    sb2.append("; secure");
                                }
                                cookieManager.setCookie(string, sb2.toString());
                            }
                        }
                    }
                    if (z4) {
                        cookieManager.setCookie(string, str2);
                    }
                }
            }
        }
    }
}
