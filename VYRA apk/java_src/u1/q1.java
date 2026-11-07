package u1;

import android.graphics.Paint;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import co.median.android.widget.GoNativeDrawerLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.navigation.NavigationView;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f4058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoNativeDrawerLayout f4059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p1 f4060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NavigationView f4061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RelativeLayout f4062e;
    public final i0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f4063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4066j;

    public q1(MainActivity mainActivity) {
        this.f4058a = mainActivity;
        View viewFindViewById = mainActivity.findViewById(R.id.drawer_layout);
        viewFindViewById.getClass();
        this.f4059b = (GoNativeDrawerLayout) viewFindViewById;
        View viewFindViewById2 = mainActivity.findViewById(R.id.nav_menu);
        viewFindViewById2.getClass();
        NavigationView navigationView = (NavigationView) viewFindViewById2;
        this.f4061d = navigationView;
        this.f4062e = (RelativeLayout) navigationView.findViewById(R.id.header_layout);
        this.f = new i0(mainActivity, (ExpandableListView) navigationView.findViewById(R.id.drawer_list));
        this.f4063g = new LinkedHashMap();
        this.f4064h = true;
        this.f4065i = true;
        this.f4066j = "default";
        x1.a.u(mainActivity).i(new y0(1, this));
    }

    public final void a(String str) {
        str.getClass();
        i0 i0Var = this.f;
        i0Var.getClass();
        String strReplaceAll = str.replaceAll("/$", "");
        if (i0Var.f3964h == null) {
            return;
        }
        for (int i4 = 0; i4 < i0Var.f3964h.length(); i4++) {
            if (strReplaceAll.equals(i0Var.f3964h.optJSONObject(i4).optString(ImagesContract.URL).replaceAll("/$", ""))) {
                i0Var.f3959b.setItemChecked(i4, true);
                i0Var.f3967k = i4;
                return;
            }
        }
    }

    public final void b(boolean z4) {
        Toolbar toolbar;
        if (this.f4064h) {
            MainActivity mainActivity = this.f4058a;
            x1.a aVarU = x1.a.u(mainActivity);
            if (aVarU.H) {
                this.f4059b.setDrawerLockMode(!z4 ? 1 : 0);
                if ((this.f4065i || aVarU.f4680m0) && z4 && (toolbar = (Toolbar) mainActivity.findViewById(R.id.toolbar)) != null) {
                    toolbar.setVisibility(0);
                }
                h0 h0VarV = mainActivity.v();
                if (h0VarV != null) {
                    h0VarV.Z(z4);
                    String str = aVarU.K;
                    if (str == null || y3.j.w(str)) {
                        return;
                    }
                    int dimensionPixelSize = mainActivity.getResources().getDimensionPixelSize(R.dimen.action_menu_icon_size);
                    int color = c0.c.getColor(mainActivity, R.color.titleTextColor);
                    String str2 = aVarU.K;
                    str2.getClass();
                    h0VarV.f0(new v1.b(mainActivity, dimensionPixelSize, color, str2).d());
                }
            }
        }
    }

    public final void c(boolean z4) {
        ImageView imageView;
        this.f4064h = z4;
        MainActivity mainActivity = this.f4058a;
        x1.a aVarU = x1.a.u(mainActivity);
        if (z4) {
            p1 p1Var = new p1(this, aVarU, mainActivity, this.f4059b);
            int color = c0.c.getColor(mainActivity, R.color.titleTextColor);
            g.b bVar = p1Var.f4053c;
            Paint paint = bVar.f2096a;
            if (color != paint.getColor()) {
                paint.setColor(color);
                bVar.invalidateSelf();
            }
            this.f4060c = p1Var;
        }
        this.f4061d.setNavigationItemSelectedListener(new d3.a0(7, this));
        x1.a aVarU2 = x1.a.u(mainActivity);
        boolean z5 = aVarU2.f4694r0;
        boolean z6 = aVarU2.f4697s0;
        RelativeLayout relativeLayout = this.f4062e;
        if (!z5 && !z6) {
            relativeLayout.setVisibility(8);
        }
        if (!aVarU2.f4694r0 && (imageView = (ImageView) relativeLayout.findViewById(R.id.app_logo)) != null) {
            imageView.setVisibility(8);
        }
        TextView textView = (TextView) relativeLayout.findViewById(R.id.app_name);
        if (textView != null) {
            if (z6) {
                textView.setText(aVarU2.f4663g);
            } else {
                textView.setVisibility(4);
            }
        }
        d(this.f4066j);
    }

    public final void d(String str) {
        JSONArray jSONArrayOptJSONArray;
        int i4;
        str.getClass();
        this.f4066j = str;
        JSONArray jSONArray = (JSONArray) x1.a.u(this.f4058a).G.get(str);
        i0 i0Var = this.f;
        synchronized (i0Var) {
            try {
                i0Var.f3964h = jSONArray;
                if (jSONArray == null) {
                    i0Var.f3964h = new JSONArray();
                }
                i0Var.f3965i = false;
                i0Var.f3966j = false;
                for (int i5 = 0; i5 < i0Var.f3964h.length(); i5++) {
                    JSONObject jSONObjectOptJSONObject = i0Var.f3964h.optJSONObject(i5);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("icon");
                        String strOptString2 = jSONObjectOptJSONObject.optString("activeIcon");
                        if (!strOptString.isEmpty() || !strOptString2.isEmpty()) {
                            i0Var.f3965i = true;
                        }
                        if (jSONObjectOptJSONObject.optBoolean("isGrouping", false) && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("subLinks")) != null) {
                            for (0; i4 < jSONArrayOptJSONArray.length(); i4 + 1) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i4);
                                i4 = (jSONObjectOptJSONObject2.optString("icon").isEmpty() && jSONObjectOptJSONObject2.optString("activeIcon").isEmpty()) ? i4 + 1 : 0;
                                i0Var.f3966j = true;
                            }
                        }
                    }
                }
                i0Var.notifyDataSetChanged();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
