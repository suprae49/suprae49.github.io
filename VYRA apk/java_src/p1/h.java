package p1;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import co.median.android.GoNativeApplication;
import co.median.android.MainActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import u1.a1;
import u1.t0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements k0.d, b.b, a1 {
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3291g;

    public /* synthetic */ h(Object obj, Object obj2) {
        this.f = obj;
        this.f3291g = obj2;
    }

    @Override // b.b
    public void a(Object obj) {
        u1.o oVar = (u1.o) this.f;
        MainActivity mainActivity = (MainActivity) this.f3291g;
        Map map = (Map) obj;
        if (map.containsKey("android.permission.WRITE_EXTERNAL_STORAGE") && Boolean.FALSE.equals(map.get("android.permission.WRITE_EXTERNAL_STORAGE"))) {
            Toast.makeText(mainActivity, "Unable to save download, storage permission denied", 0).show();
            u1.n nVar = oVar.f4022h;
            if (nVar != null) {
                u1.o.g(mainActivity, nVar.f4011g, "Unable to save download, storage permission denied.");
                oVar.f4022h = null;
                return;
            }
            return;
        }
        u1.n nVar2 = oVar.f4022h;
        if (nVar2 != null) {
            String str = nVar2.f4011g;
            if (oVar.f4021g) {
                if (nVar2.f) {
                    mainActivity.f1170a0.d(nVar2.f4006a, nVar2.f4007b, nVar2.f4010e, str);
                } else {
                    oVar.i(nVar2, str);
                }
                oVar.f4022h = null;
            }
        }
    }

    public void b(a3.h0 h0Var) {
        MainActivity mainActivity = (MainActivity) this.f;
        GoNativeApplication goNativeApplication = (GoNativeApplication) this.f3291g;
        mainActivity.f1189x0 = h0Var;
        Iterator it = ((ArrayList) goNativeApplication.f1168m.a()).iterator();
        if (it.hasNext()) {
            throw androidx.fragment.app.u.j(it);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new t0(mainActivity, 1), 7000L);
    }

    @Override // u1.a1
    public void c(String[] strArr, int[] iArr) {
        u1.w wVar = (u1.w) this.f;
        u1.u uVar = (u1.u) this.f3291g;
        MainActivity mainActivity = wVar.f4116d;
        try {
            int i4 = 1;
            wVar.e(uVar, iArr[0] == 0);
            mainActivity.runOnUiThread(new u1.t(wVar, i4));
        } catch (IOException e5) {
            x1.f.a().d("w", "IO Error", e5);
            u1.o.g(mainActivity, uVar.f4107j, "IO Error - " + e5.getMessage());
        }
    }

    @Override // k0.d
    public void onCancel() {
        r rVar = (r) this.f;
        androidx.fragment.app.c cVar = (androidx.fragment.app.c) this.f3291g;
        rVar.d();
        cVar.run();
    }
}
