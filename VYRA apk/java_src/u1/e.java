package u1;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f3875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3876b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f3877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppBarLayout f3878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialToolbar f3879e;
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f3880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f3881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Menu f3885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.appcompat.widget.e f3886m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PopupWindow f3888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f3892t;

    public e(MainActivity mainActivity) {
        this.f3875a = mainActivity;
        View viewFindViewById = mainActivity.findViewById(R.id.toolbar);
        viewFindViewById.getClass();
        MaterialToolbar materialToolbar = (MaterialToolbar) viewFindViewById;
        this.f3879e = materialToolbar;
        this.f = (ImageView) mainActivity.findViewById(R.id.title_image);
        this.f3880g = mainActivity.findViewById(R.id.top_nav_hide_on_scroll_spacer);
        this.f3881h = new HashMap();
        this.f3882i = mainActivity.getResources().getDimensionPixelSize(R.dimen.action_menu_icon_size);
        this.f3883j = mainActivity.getResources().getDimensionPixelSize(R.dimen.action_custom_overflow_menu_width);
        this.f3884k = c0.c.getColor(mainActivity, R.color.titleTextColor);
        e.d0 d0Var = (e.d0) mainActivity.u();
        if (d0Var.f1884o instanceof Activity) {
            d0Var.C();
            h0 h0Var = d0Var.f1889t;
            if (h0Var instanceof e.q0) {
                androidx.fragment.app.q.j("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                throw null;
            }
            d0Var.f1890u = null;
            if (h0Var != null) {
                h0Var.O();
            }
            d0Var.f1889t = null;
            Object obj = d0Var.f1884o;
            e.l0 l0Var = new e.l0(materialToolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : d0Var.f1891v, d0Var.f1887r);
            d0Var.f1889t = l0Var;
            d0Var.f1887r.f1991g = l0Var.f1940g;
            materialToolbar.setBackInvokedCallbackEnabled(true);
            d0Var.b();
        }
    }

    public final void a(boolean z4) {
        AppBarLayout appBarLayout;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams = this.f3879e.getLayoutParams();
        layoutParams.getClass();
        c2.c cVar = (c2.c) layoutParams;
        if (!z4 || this.f3890r) {
            if (z4 || !this.f3890r) {
                return;
            }
            c cVar2 = this.f3892t;
            if (cVar2 != null && (appBarLayout = this.f3878d) != null && (arrayList = appBarLayout.f1223m) != null) {
                arrayList.remove(cVar2);
            }
            cVar.f1125a = 0;
            this.f3890r = false;
            return;
        }
        cVar.f1125a = 21;
        c cVar3 = new c(this);
        this.f3892t = cVar3;
        AppBarLayout appBarLayout2 = this.f3878d;
        if (appBarLayout2 != null) {
            if (appBarLayout2.f1223m == null) {
                appBarLayout2.f1223m = new ArrayList();
            }
            if (!appBarLayout2.f1223m.contains(cVar3)) {
                appBarLayout2.f1223m.add(cVar3);
            }
        }
        this.f3890r = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    public final boolean b(String str) {
        if (str == null) {
            return false;
        }
        MainActivity mainActivity = this.f3875a;
        switch (str) {
            case "search":
                if (!str.equals("search")) {
                    mainActivity.C0.b(str, true, false);
                }
                return true;
            case "share":
                mainActivity.l0(null, null);
                return true;
            case "overflow":
                PopupWindow popupWindow = this.f3888p;
                if (popupWindow != null) {
                    int i4 = this.f3883j;
                    MaterialToolbar materialToolbar = this.f3879e;
                    popupWindow.showAsDropDown(materialToolbar, (materialToolbar.getWidth() - i4) - 15, 0);
                    return true;
                }
            case "refresh":
                mainActivity.N();
                return true;
            default:
                mainActivity.C0.b(str, true, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:? A[LOOP:2: B:92:0x0159->B:150:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0151  */
    /* JADX WARN: Code duplicated, block: B:91:0x0154  */
    /* JADX WARN: Code duplicated, block: B:93:0x015b  */
    public final void c(String str, boolean z4) {
        HashMap map;
        Pattern pattern;
        boolean z5;
        h0 h0Var;
        ArrayList arrayList;
        int size;
        int i4;
        boolean z6;
        Object obj;
        if (this.f3877c == null || str == null || y3.j.w(str)) {
            return;
        }
        MainActivity mainActivity = this.f3875a;
        x1.a aVarU = x1.a.u(mainActivity);
        boolean zEquals = str.equals(aVarU.Y0);
        View view = this.f3880g;
        if (zEquals) {
            if (!this.f3890r) {
                h0 h0Var2 = this.f3877c;
                if (h0Var2 != null) {
                    h0Var2.E();
                    return;
                }
                return;
            }
            a(false);
            h0 h0Var3 = this.f3877c;
            if (h0Var3 != null) {
                h0Var3.E();
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = 0;
            view.setLayoutParams(layoutParams);
            return;
        }
        ArrayList arrayList2 = aVarU.R;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i5 = 0;
            do {
                if (i5 < size2) {
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    map = (HashMap) obj2;
                    pattern = (Pattern) map.get("regex");
                    if (pattern == null) {
                    }
                }
                map = null;
                break;
            } while (!pattern.matcher(str).matches());
        } else {
            map = null;
            break;
        }
        boolean z7 = map != null;
        ArrayList arrayList3 = aVarU.f4654c0;
        ArrayList arrayList4 = aVarU.d0;
        if (arrayList3 != null && arrayList4 != null) {
            int size3 = arrayList3.size();
            int i6 = 0;
            while (true) {
                if (i6 < size3) {
                    Object obj3 = arrayList3.get(i6);
                    obj3.getClass();
                    if (((Pattern) obj3).matcher(str).matches()) {
                        JSONObject jSONObject = (JSONObject) aVarU.f4651b0.get(arrayList4.get(i6));
                        JSONArray jSONArrayOptJSONArray = jSONObject != null ? jSONObject.optJSONArray("items") : null;
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            z5 = true;
                            break;
                        }
                        break;
                    }
                    i6++;
                }
                z5 = false;
                break;
            }
        } else {
            z5 = false;
            break;
        }
        if (!aVarU.f4680m0 && !aVarU.H && !z7 && !z5) {
            if (!this.f3890r) {
                h0 h0Var4 = this.f3877c;
                if (h0Var4 != null) {
                    h0Var4.E();
                    return;
                }
                return;
            }
            a(false);
            h0 h0Var5 = this.f3877c;
            if (h0Var5 != null) {
                h0Var5.E();
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = 0;
            view.setLayoutParams(layoutParams2);
            return;
        }
        String title = mainActivity.G.getTitle() != null ? mainActivity.G.getTitle() : mainActivity.getString(R.string.app_name);
        title.getClass();
        ImageView imageView = this.f;
        MaterialToolbar materialToolbar = this.f3879e;
        if (z7) {
            Object obj4 = map != null ? map.get("title") : null;
            String str2 = obj4 instanceof String ? (String) obj4 : null;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() == 0 && !z4) {
                return;
            }
            if (str2.length() != 0) {
                title = str2;
            }
            mainActivity.setTitle(title);
            Object obj5 = map != null ? map.get("showImage") : null;
            Boolean bool = obj5 instanceof Boolean ? (Boolean) obj5 : null;
            if (bool != null ? bool.booleanValue() : false) {
                imageView.setVisibility(0);
                materialToolbar.setTitle("");
            } else {
                imageView.setVisibility(8);
                materialToolbar.setTitle(title);
            }
        } else {
            aVarU.d();
            ArrayList arrayList5 = aVarU.R;
            if (arrayList5 == null) {
                arrayList = aVarU.f4706x0;
                if (arrayList == null) {
                    size = arrayList.size();
                    i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            z6 = false;
                            break;
                        }
                        obj = arrayList.get(i4);
                        i4++;
                        if (((Pattern) obj).matcher(str).matches()) {
                            z6 = true;
                            break;
                        }
                    }
                } else {
                    z6 = aVarU.f4691q0;
                }
            } else {
                int size4 = arrayList5.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size4) {
                        Object obj6 = arrayList5.get(i7);
                        i7++;
                        HashMap map2 = (HashMap) obj6;
                        if (((Pattern) map2.get("regex")).matcher(str).matches()) {
                            if (map2.containsKey("showImage") && map2.get("showImage") != null && ((Boolean) map2.get("showImage")).booleanValue()) {
                                z6 = true;
                                break;
                            }
                        }
                    }
                    arrayList = aVarU.f4706x0;
                    if (arrayList == null) {
                        size = arrayList.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                z6 = false;
                                break;
                            }
                            obj = arrayList.get(i4);
                            i4++;
                            if (((Pattern) obj).matcher(str).matches()) {
                                z6 = true;
                                break;
                            }
                        }
                    } else {
                        z6 = aVarU.f4691q0;
                    }
                }
            }
            if (z6) {
                imageView.setVisibility(0);
                materialToolbar.setTitle("");
            } else {
                imageView.setVisibility(8);
                materialToolbar.setTitle(title);
            }
        }
        h0 h0Var6 = this.f3877c;
        if (!(h0Var6 != null ? h0Var6.J() : false) && (h0Var = this.f3877c) != null) {
            h0Var.o0();
        }
        if (!x1.a.u(mainActivity).f4682n0 || this.f3890r) {
            return;
        }
        a(true);
    }

    public final void d(boolean z4) {
        this.f3876b = z4;
        MainActivity mainActivity = this.f3875a;
        h0 h0VarV = mainActivity.v();
        if (h0VarV == null) {
            return;
        }
        this.f3877c = h0VarV;
        AppBarLayout appBarLayout = (AppBarLayout) mainActivity.findViewById(R.id.appBar);
        this.f3878d = appBarLayout;
        ViewGroup.LayoutParams layoutParams = appBarLayout != null ? appBarLayout.getLayoutParams() : null;
        z.e eVar = layoutParams instanceof z.e ? (z.e) layoutParams : null;
        if (eVar != null) {
            z.b bVar = eVar.f4803a;
            if ((bVar instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) bVar : null) == null) {
                eVar.b(new AppBarLayout.Behavior());
            }
        }
        x1.a aVarU = x1.a.u(mainActivity);
        this.f3891s = aVarU.f4685o0;
        h0 h0Var = this.f3877c;
        boolean z5 = false;
        if (h0Var != null) {
            if (!z4) {
                h0Var.Z(true);
                h0Var.a0();
            } else if (!aVarU.H) {
                h0Var.Z(false);
            }
        }
        d3.a0 a0Var = new d3.a0(5, this);
        MaterialToolbar materialToolbar = this.f3879e;
        materialToolbar.setOnMenuItemClickListener(a0Var);
        Drawable navigationIcon = materialToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setColorFilter(e4.a.n(this.f3884k));
        }
        materialToolbar.addOnLayoutChangeListener(new j2.a(1, this));
        if (aVarU.f4682n0) {
            h0 h0Var2 = this.f3877c;
            if (h0Var2 != null ? h0Var2.J() : false) {
                z5 = true;
            }
        }
        a(z5);
    }
}
