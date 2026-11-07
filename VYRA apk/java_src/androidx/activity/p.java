package androidx.activity;

import android.app.Activity;
import android.graphics.Typeface;
import android.net.Uri;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.button.MaterialButton;
import u1.e2;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f231h;

    public /* synthetic */ p(Object obj, int i4, Object obj2) {
        this.f = i4;
        this.f230g = obj;
        this.f231h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f;
        Object obj = this.f231h;
        Object obj2 = this.f230g;
        switch (i4) {
            case 0:
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) obj2;
                int i5 = q.f232x;
                e0Var.f.a(new h((j0) obj, e0Var));
                return;
            case 1:
                e.o oVar = (e.o) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    oVar.a();
                }
            case 2:
                ((e0.b) obj2).i((Typeface) obj);
                return;
            case 3:
                MaterialButton materialButton = (MaterialButton) obj2;
                int[] iArr = MaterialButton.S;
                ((Runnable) obj).run();
                LinearLayout.LayoutParams layoutParams = materialButton.H;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.H = null;
                    materialButton.E = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
            case 4:
                a3.h0 h0Var = (a3.h0) obj2;
                ((androidx.emoji2.text.p) h0Var.f84g).n().bringToFront();
                ((p1.h) obj).b(h0Var);
                return;
            case 5:
                MainActivity mainActivity = ((u1.o) obj2).f4016a;
                Toast.makeText(mainActivity, String.format(mainActivity.getString(R.string.file_download_finished_with_name), (String) obj), 0).show();
                return;
            case 6:
                Toast.makeText((Activity) obj2, (String) obj, 1).show();
                return;
            case 7:
                u1.w wVar = (u1.w) obj2;
                u1.u uVar = (u1.u) obj;
                MainActivity mainActivity2 = wVar.f4116d;
                if (uVar.f4104g == null && uVar.f != null) {
                    uVar.f4104g = FileProvider.d(mainActivity2, mainActivity2.getApplicationContext().getPackageName() + ".fileprovider", uVar.f);
                }
                Uri uri = uVar.f4104g;
                if (uri == null) {
                    return;
                }
                u1.o.k(mainActivity2, uri, uVar.f4102d, wVar.f4113a == 2);
                return;
            case 8:
                int i6 = MainActivity.G0;
                ((MainActivity) obj2).V((String) obj, null);
                return;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                ((MainActivity.a) obj2).lambda$onReadyState$0((String) obj);
                return;
            case 10:
                String str = (String) obj;
                u1.e eVar = ((e2) obj2).f3901a.R;
                if (eVar == null) {
                    return;
                }
                eVar.c(str, false);
                return;
            default:
                z1.g gVar = (z1.g) obj;
                t1.l.a((Activity) obj2);
                gVar.f4879e = true;
                gVar.f = System.currentTimeMillis();
                return;
        }
    }
}
