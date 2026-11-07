package t1;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f3707d;

    public g() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f3707d = Pattern.compile("\\A\\d+");
    }

    @Override // t1.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // t1.c
    public final boolean b() {
        boolean zB = super.b();
        if (!zB || Build.VERSION.SDK_INT >= 29) {
            return zB;
        }
        WeakHashMap weakHashMap = s1.b.f3670a;
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            return false;
        }
        Matcher matcher = this.f3707d.matcher(currentWebViewPackage.versionName);
        return matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
