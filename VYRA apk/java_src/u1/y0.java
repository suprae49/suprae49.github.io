package u1;

import co.median.android.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends x1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4146b;

    public /* synthetic */ y0(int i4, Object obj) {
        this.f4145a = i4;
        this.f4146b = obj;
    }

    @Override // x1.e
    public void a() {
        switch (this.f4145a) {
            case 1:
                q1 q1Var = (q1) this.f4146b;
                q1Var.d(q1Var.f4066j);
                break;
        }
    }

    @Override // x1.e
    public void b() {
        switch (this.f4145a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f4146b;
                String url = mainActivity.G.getUrl();
                if (url != null) {
                    int iW0 = mainActivity.w0(url);
                    androidx.emoji2.text.x xVarE = mainActivity.E();
                    g0 g0Var = (g0) ((LinkedHashMap) xVarE.f592a).get(mainActivity.X);
                    if (g0Var != null) {
                        int i4 = g0Var.f3933d;
                        g0Var.f3932c = iW0;
                        g0Var.f3933d = i4;
                    }
                    break;
                }
                break;
        }
    }

    @Override // x1.e
    public void c() {
        String str;
        switch (this.f4145a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f4146b;
                String url = mainActivity.G.getUrl();
                if (url != null) {
                    ArrayList arrayList = x1.a.u(mainActivity).R;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                HashMap map = (HashMap) obj;
                                Pattern pattern = (Pattern) map.get("regex");
                                if (pattern != null && pattern.matcher(url).matches() && map.containsKey("title")) {
                                    str = (String) map.get("title");
                                }
                            } else {
                                str = null;
                            }
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        e eVar = mainActivity.R;
                        if (eVar != null) {
                            eVar.c(url, true);
                            break;
                        }
                    } else {
                        mainActivity.setTitle(str);
                        break;
                    }
                }
                break;
        }
    }

    @Override // x1.e
    public void d() {
        switch (this.f4145a) {
            case 2:
                w1 w1Var = (w1) this.f4146b;
                w1Var.f4125h = null;
                w1Var.c();
                w1Var.b(w1Var.f4126i);
                break;
        }
    }
}
