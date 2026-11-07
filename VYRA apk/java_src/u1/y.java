package u1;

import android.os.SystemClock;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements a1 {
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4144h;

    public /* synthetic */ y(MainActivity mainActivity, String str, androidx.emoji2.text.x xVar) {
        this.f4143g = mainActivity;
        this.f = str;
        this.f4144h = xVar;
    }

    public void a(boolean z4) {
        e0 e0Var = (e0) this.f4143g;
        GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) this.f4144h;
        String str = (String) this.f;
        if (z4) {
            callback.invoke(str, true, false);
        } else {
            callback.invoke(str, false, false);
            e0Var.f = SystemClock.uptimeMillis();
        }
    }

    @Override // u1.a1
    public void c(String[] strArr, int[] iArr) {
        e2 e2Var = (e2) this.f4143g;
        WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) this.f4144h;
        r rVar = (r) this.f;
        e2Var.getClass();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            String str = strArr[i4];
            int i5 = iArr[i4];
            if (Objects.equals(str, "android.permission.CAMERA")) {
                if (i5 == -1) {
                    if (fileChooserParams.isCaptureEnabled()) {
                        Toast.makeText(e2Var.f3901a, R.string.upload_camera_permission_denied, 0).show();
                        ValueCallback valueCallback = e2Var.f3916r;
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(null);
                            e2Var.f3916r = null;
                            return;
                        }
                        return;
                    }
                    rVar.f4069c = false;
                } else if (i5 == 0) {
                    rVar.f4069c = true;
                }
            }
            if (Objects.equals(str, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                if (i5 == -1) {
                    rVar.f4070d = false;
                } else if (i5 == 0) {
                    rVar.f4070d = true;
                }
            }
            e2Var.f3915q.a(rVar);
        }
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3) {
        this.f4143g = obj;
        this.f4144h = obj2;
        this.f = obj3;
    }
}
