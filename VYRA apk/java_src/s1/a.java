package s1;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.fragment.app.q;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import t1.f;
import t1.i;
import t1.j;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static r0.b a(WebSettings webSettings) {
        try {
            return new r0.b((WebSettingsBoundaryInterface) e4.a.i(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) j.f3714a.f).convertSettings(webSettings)));
        } catch (ClassCastException e5) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e5;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e5);
            return new f(null);
        }
    }

    public static void b(WebSettings webSettings, int i4) {
        t1.b bVar = i.f3710b;
        if (bVar.a()) {
            webSettings.setForceDark(i4);
        } else if (bVar.b()) {
            a(webSettings).e(i4);
        } else {
            q.t("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }
}
