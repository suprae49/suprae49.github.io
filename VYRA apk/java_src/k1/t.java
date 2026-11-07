package k1;

import android.view.View;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2899e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f2904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2905l;

    public final void a(View view) {
        int iB;
        int size = this.f2904k.size();
        View view2 = null;
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i5 = 0; i5 < size; i5++) {
            View view3 = ((x0) this.f2904k.get(i5)).f2945a;
            m0 m0Var = (m0) view3.getLayoutParams();
            if (view3 != view && !m0Var.f2851a.h() && (iB = (m0Var.f2851a.b() - this.f2898d) * this.f2899e) >= 0 && iB < i4) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i4 = iB;
                }
            }
        }
        if (view2 == null) {
            this.f2898d = -1;
        } else {
            this.f2898d = ((m0) view2.getLayoutParams()).f2851a.b();
        }
    }

    public final View b(v1.b bVar) {
        List list = this.f2904k;
        if (list == null) {
            View viewF = bVar.f(this.f2898d);
            this.f2898d += this.f2899e;
            return viewF;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = ((x0) this.f2904k.get(i4)).f2945a;
            m0 m0Var = (m0) view.getLayoutParams();
            if (!m0Var.f2851a.h() && this.f2898d == m0Var.f2851a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
