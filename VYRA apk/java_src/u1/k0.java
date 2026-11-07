package u1;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import co.median.android.MainActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f3990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f3991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3992c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3994e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3997i;

    public k0(MainActivity mainActivity, ViewGroup viewGroup) {
        this.f3990a = mainActivity;
        this.f3991b = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: u1.j0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                k0 k0Var = this.f;
                MainActivity mainActivity2 = k0Var.f3990a;
                Rect rect = new Rect();
                ViewGroup viewGroup2 = k0Var.f3991b;
                viewGroup2.getWindowVisibleDisplayFrame(rect);
                if (k0Var.f3997i == 0) {
                    k0Var.f3997i = viewGroup2.getRootView().getHeight() - rect.bottom;
                }
                k0Var.f = viewGroup2.getRootView().getWidth();
                k0Var.f3995g = rect.bottom + k0Var.f3997i;
                int height = viewGroup2.getRootView().getHeight() - k0Var.f3995g;
                k0Var.f3994e = height;
                if (height == k0Var.f3997i) {
                    k0Var.f3994e = 0;
                }
                if (k0Var.f3994e != 0) {
                    k0Var.f3993d = k0Var.f;
                    if (k0Var.f3996h) {
                        return;
                    }
                    k0Var.f3996h = true;
                    if (TextUtils.isEmpty(k0Var.f3992c)) {
                        return;
                    }
                    mainActivity2.V(t2.i.e(k0Var.f3992c, k0Var.a()), null);
                    return;
                }
                k0Var.f3993d = 0;
                if (k0Var.f3996h) {
                    k0Var.f3996h = false;
                    if (TextUtils.isEmpty(k0Var.f3992c)) {
                        return;
                    }
                    mainActivity2.V(t2.i.e(k0Var.f3992c, k0Var.a()), null);
                }
            }
        });
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.f3993d);
        jSONObject.put("height", this.f3994e);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", this.f);
        jSONObject2.put("height", this.f3995g);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("visible", this.f3996h);
        jSONObject3.put("keyboardWindowSize", jSONObject);
        jSONObject3.put("visibleWindowSize", jSONObject2);
        return jSONObject3;
    }
}
