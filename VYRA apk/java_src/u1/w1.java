package u1;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import co.median.android.widget.BottomNavigationShowOnScrollBehavior;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements u2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f4119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BottomNavigationView f4120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f4121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x1.a f4122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BottomNavigationShowOnScrollBehavior f4123e;
    public final RelativeLayout.LayoutParams f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public JSONArray f4127j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashMap f4128k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4130m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4132p;
    public int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f4131o = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4133q = true;

    public w1(MainActivity mainActivity, final BottomNavigationView bottomNavigationView) {
        this.f4119a = mainActivity;
        this.f4120b = bottomNavigationView;
        bottomNavigationView.setOnItemSelectedListener(this);
        x1.a aVarU = x1.a.u(mainActivity);
        this.f4122d = aVarU;
        View viewFindViewById = mainActivity.findViewById(R.id.bottom_nav_spacer);
        this.f4121c = viewFindViewById;
        this.f = (RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams();
        this.f4129l = mainActivity.getResources().getInteger(R.integer.tabbar_icon_size);
        this.f4130m = c0.c.getColor(mainActivity, R.color.tabBarTextColor);
        aVarU.i(new y0(2, this));
        c();
        bottomNavigationView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: u1.t1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                w1 w1Var = this.f4097a;
                w1Var.n = 0;
                if (bottomNavigationView.getVisibility() == 0) {
                    w1Var.n = i7 - i5;
                }
                int i12 = w1Var.n;
                RelativeLayout.LayoutParams layoutParams = w1Var.f;
                layoutParams.height = i12;
                w1Var.f4121c.setLayoutParams(layoutParams);
            }
        });
        if (aVarU.f4685o0) {
            BottomNavigationShowOnScrollBehavior bottomNavigationShowOnScrollBehavior = (BottomNavigationShowOnScrollBehavior) ((z.e) bottomNavigationView.getLayoutParams()).f4803a;
            this.f4123e = bottomNavigationShowOnScrollBehavior;
            if (bottomNavigationShowOnScrollBehavior != null) {
                bottomNavigationShowOnScrollBehavior.f1195t = this;
                bottomNavigationShowOnScrollBehavior.f1287i.add(new u1(this));
            }
        }
    }

    public final void a(String str) {
        JSONObject jSONObjectOptJSONObject;
        if (this.f4127j == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f4127j.length(); i4++) {
            JSONArray jSONArray = this.f4127j;
            List listF = null;
            if (jSONArray != null && i4 >= 0 && i4 < jSONArray.length() && (jSONObjectOptJSONObject = this.f4127j.optJSONObject(i4)) != null) {
                HashMap map = this.f4131o;
                if (map.containsKey(jSONObjectOptJSONObject)) {
                    listF = (List) map.get(jSONObjectOptJSONObject);
                } else {
                    Object objOpt = jSONObjectOptJSONObject.opt("regex");
                    listF = objOpt != null ? t2.i.f(objOpt) : null;
                    map.put(jSONObjectOptJSONObject, listF);
                }
            }
            if (listF != null) {
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    if (((Pattern) it.next()).matcher(str).matches()) {
                        this.f4120b.getMenu().findItem(i4).setChecked(true);
                        return;
                    }
                }
            }
        }
    }

    public final void b(String str) {
        String str2;
        this.f4126i = str;
        MainActivity mainActivity = this.f4119a;
        if (mainActivity == null || str == null) {
            return;
        }
        x1.a aVar = this.f4122d;
        if (str.equals(aVar.Y0)) {
            return;
        }
        if (this.f4132p) {
            a(str);
            return;
        }
        ArrayList arrayList = aVar.Z;
        ArrayList arrayList2 = aVar.f4648a0;
        if (arrayList == null || arrayList2 == null) {
            f(false);
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                str2 = null;
                break;
            } else {
                if (((Pattern) arrayList.get(i4)).matcher(str).matches()) {
                    str2 = (String) arrayList2.get(i4);
                    break;
                }
                i4++;
            }
        }
        if (str2 == null) {
            this.f4125h = null;
            f(false);
        } else {
            String str3 = this.f4125h;
            if (str3 == null || !str3.equals(str2)) {
                this.f4125h = str2;
                e((JSONArray) x1.a.u(mainActivity).Y.get(str2));
                f(this.f4120b.getMenu().size() != 0);
            }
        }
        if (str2 != null) {
            a(str);
        }
    }

    public final void c() {
        x1.a aVar = this.f4122d;
        ArrayList arrayList = aVar.Z;
        ArrayList arrayList2 = aVar.f4648a0;
        if (arrayList == null || arrayList2 == null) {
            return;
        }
        this.f4128k = new HashMap();
        HashMap map = new HashMap();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            map.put((String) arrayList2.get(i4), (Pattern) arrayList.get(i4));
        }
        for (Map.Entry entry : aVar.Y.entrySet()) {
            v1 v1Var = new v1();
            v1Var.f4112a = (JSONArray) entry.getValue();
            this.f4128k.put((String) entry.getKey(), v1Var);
        }
    }

    public final void d(String str, String str2) {
        BottomNavigationView bottomNavigationView;
        if (str == null) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (this.f4127j != null) {
            for (int i4 = 0; i4 < this.f4127j.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = this.f4127j.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString(ImagesContract.URL);
                    String strOptString2 = jSONObjectOptJSONObject.optString("javascript");
                    if (str.equals(strOptString) && str2.equals(strOptString2) && (bottomNavigationView = this.f4120b) != null) {
                        bottomNavigationView.setSelectedItemId(i4);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    public final void e(JSONArray jSONArray) {
        this.f4127j = jSONArray;
        BottomNavigationView bottomNavigationView = this.f4120b;
        if (jSONArray == null) {
            bottomNavigationView.getMenu().clear();
            return;
        }
        Menu menu = bottomNavigationView.getMenu();
        int size = menu.size();
        int length = jSONArray.length();
        int i4 = -1;
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            if (i5 > 4) {
                x1.f.a().d("u1.w1", "Tab menu items list should not have more than 5 items", null);
                break;
            }
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("label");
                String strOptString2 = jSONObjectOptJSONObject.optString("icon");
                String strOptString3 = jSONObjectOptJSONObject.optString("activeIcon");
                String strOptString4 = jSONObjectOptJSONObject.optString("inactiveIcon");
                if (!strOptString.isEmpty() || !strOptString2.isEmpty() || !strOptString3.isEmpty() || !jSONObjectOptJSONObject.optString(ImagesContract.URL).isEmpty()) {
                    if (strOptString2.isEmpty()) {
                        strOptString2 = !strOptString3.isEmpty() ? strOptString3 : "faw_question";
                    }
                    if (strOptString3.isEmpty()) {
                        strOptString3 = strOptString2;
                    }
                    if (strOptString4.isEmpty()) {
                        strOptString4 = strOptString2;
                    }
                    int i6 = this.f4130m;
                    MainActivity mainActivity = this.f4119a;
                    mainActivity.getClass();
                    g.d dVar = new g.d(null, null);
                    int i7 = this.f4129l;
                    Drawable drawableD = new v1.b(mainActivity, i7, i6, strOptString3).d();
                    Drawable drawableD2 = new v1.b(mainActivity, i7, i6, strOptString4).d();
                    dVar.a(new int[]{android.R.attr.state_checked}, drawableD);
                    dVar.a(new int[]{-16842912}, drawableD2);
                    if (i5 < size) {
                        MenuItem item = menu.getItem(i5);
                        if (item != null) {
                            item.setTitle(strOptString);
                            item.setIcon(dVar);
                        }
                    } else {
                        menu.add(0, i5, 0, strOptString).setIcon(dVar);
                    }
                    if (jSONObjectOptJSONObject.optBoolean("selected")) {
                        i4 = i5;
                    }
                }
            }
        }
        if (size > length) {
            for (int i8 = length; i8 < size; i8++) {
                MenuItem item2 = menu.getItem(length);
                if (item2 != null) {
                    menu.removeItem(item2.getItemId());
                }
            }
        }
        if (i4 > -1) {
            new Handler().postDelayed(new b3.c(i4, 3, this), 10L);
        }
    }

    public final void f(final boolean z4) {
        this.f4119a.runOnUiThread(new Runnable() { // from class: u1.s1
            @Override // java.lang.Runnable
            public final void run() {
                w1 w1Var = this.f;
                BottomNavigationView bottomNavigationView = w1Var.f4120b;
                if (z4) {
                    bottomNavigationView.setVisibility(0);
                    return;
                }
                bottomNavigationView.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams = w1Var.f;
                layoutParams.height = 0;
                w1Var.f4121c.setLayoutParams(layoutParams);
                w1Var.n = 0;
            }
        });
    }

    public final void g() {
        BottomNavigationShowOnScrollBehavior bottomNavigationShowOnScrollBehavior;
        if (this.f4122d.f4685o0) {
            BottomNavigationView bottomNavigationView = this.f4120b;
            if (bottomNavigationView.getVisibility() == 8 || (bottomNavigationShowOnScrollBehavior = this.f4123e) == null || this.f4124g == 2) {
                return;
            }
            bottomNavigationShowOnScrollBehavior.x(bottomNavigationView);
        }
    }
}
