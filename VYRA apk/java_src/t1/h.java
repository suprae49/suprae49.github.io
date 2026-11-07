package t1;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import androidx.fragment.app.q;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, int i4, String str2) {
        super(str, 2, str2);
        this.f3708e = i4;
    }

    @Override // t1.c
    public final boolean b() {
        switch (this.f3708e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                WeakHashMap weakHashMap = s1.b.f3670a;
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage == null) {
                    return false;
                }
                return (Build.VERSION.SDK_INT >= 28 ? c0.a.b(currentWebViewPackage) : (long) currentWebViewPackage.versionCode) >= 636700000;
            case 1:
                if (!super.b() || !e4.a.R("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap2 = s1.b.f3670a;
                if (i.f3709a.b()) {
                    return k.f3715a.getStatics().isMultiProcessEnabled();
                }
                q.t("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (e4.a.R("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
