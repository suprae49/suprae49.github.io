package r0;

import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.webkit.PermissionRequest;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.median.android.MainActivity;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import j.k;
import j.m;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.p0;
import p0.q;
import p0.t1;
import p0.y1;
import t1.n;
import u1.a1;
import u1.o0;
import u1.w1;
import z.e;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class b implements n, a1, k, q {
    public final Object f;

    public /* synthetic */ b(Object obj) {
        this.f = obj;
    }

    @Override // t1.n
    public String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f).getSupportedFeatures();
    }

    @Override // t1.n
    public WebViewProviderBoundaryInterface b(o0 o0Var) {
        return (WebViewProviderBoundaryInterface) e4.a.i(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f).createWebView(o0Var));
    }

    @Override // u1.a1
    public void c(String[] strArr, int[] iArr) {
        PermissionRequest permissionRequest = (PermissionRequest) this.f;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (iArr[i4] == 0) {
                if (strArr[i4].equals("android.permission.RECORD_AUDIO")) {
                    arrayList.add("android.webkit.resource.AUDIO_CAPTURE");
                } else if (strArr[i4].equals("android.permission.CAMERA")) {
                    arrayList.add("android.webkit.resource.VIDEO_CAPTURE");
                }
            }
        }
        if (arrayList.isEmpty()) {
            permissionRequest.deny();
        } else {
            permissionRequest.grant((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
    }

    @Override // p0.q
    public y1 d(View view, y1 y1Var) {
        t1 t1Var = y1Var.f3268a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f;
        if (!Objects.equals(coordinatorLayout.f478s, y1Var)) {
            coordinatorLayout.f478s = y1Var;
            boolean z4 = y1Var.d() > 0;
            coordinatorLayout.f479t = z4;
            coordinatorLayout.setWillNotDraw(!z4 && coordinatorLayout.getBackground() == null);
            if (!t1Var.r()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = coordinatorLayout.getChildAt(i4);
                    WeakHashMap weakHashMap = p0.f3233a;
                    if (childAt.getFitsSystemWindows() && ((e) childAt.getLayoutParams()).f4803a != null && t1Var.r()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return y1Var;
    }

    public void e(int i4) {
        ((WebSettingsBoundaryInterface) this.f).setForceDark(i4);
    }

    public void f() {
        ((WebSettingsBoundaryInterface) this.f).setForceDarkBehavior(1);
    }

    public void g() {
        ((WebSettingsBoundaryInterface) this.f).setPaymentRequestEnabled(true);
    }

    @Override // t1.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) e4.a.i(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f).getStatics());
    }

    @Override // t1.n
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) e4.a.i(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f).getWebkitToCompatConverter());
    }

    @Override // j.k
    public boolean j(m mVar, MenuItem menuItem) {
        w1 w1Var;
        JSONArray jSONArray;
        u2.m mVar2 = ((BottomNavigationView) this.f).f1533j;
        if (mVar2 == null || (jSONArray = (w1Var = (w1) mVar2).f4127j) == null) {
            return false;
        }
        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(menuItem.getItemId());
        String strOptString = jSONObjectOptJSONObject.optString(ImagesContract.URL);
        String strOptString2 = jSONObjectOptJSONObject.optString("javascript");
        if (!w1Var.f4133q) {
            w1Var.f4133q = true;
            return false;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(strOptString2);
        MainActivity mainActivity = w1Var.f4119a;
        if (zIsEmpty) {
            mainActivity.C0.b(strOptString, true, true);
            return false;
        }
        mainActivity.C0.c(strOptString, strOptString2, true);
        return false;
    }

    @Override // j.k
    public void i(m mVar) {
    }
}
