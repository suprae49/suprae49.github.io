package u1;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends BaseExpandableListAdapter implements ExpandableListView.OnGroupClickListener, ExpandableListView.OnChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f3958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExpandableListView f3959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3962e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3963g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3967k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3965i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3966j = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JSONArray f3964h = new JSONArray();

    public i0(MainActivity mainActivity, ExpandableListView expandableListView) {
        this.f3958a = mainActivity;
        this.f3960c = mainActivity.getResources().getInteger(R.integer.sidebar_icon_size);
        this.f3961d = mainActivity.getResources().getInteger(R.integer.sidebar_expand_indicator_size);
        this.f3959b = expandableListView;
        this.f = c0.c.getColor(mainActivity, R.color.sidebarForeground);
        this.f3963g = c0.c.getColor(mainActivity, R.color.sidebarBackground);
        this.f3962e = c0.c.getColor(mainActivity, R.color.sidebarHighlight);
        expandableListView.setAdapter(this);
        expandableListView.setOnGroupClickListener(this);
        expandableListView.setOnChildClickListener(this);
        expandableListView.setDividerHeight(5);
    }

    public final RippleDrawable a() {
        int iMax;
        int iMax2;
        int iMax3;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(100.0f);
        gradientDrawable.setColor(this.f3962e);
        gradientDrawable.setAlpha(100);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_activated}, gradientDrawable);
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, gradientDrawable);
        int i4 = this.f3958a.getResources().getConfiguration().uiMode & 48;
        float f = (i4 == 16 || i4 != 32) ? -0.2f : 0.2f;
        int iAlpha = Color.alpha(this.f3963g);
        int iRed = Color.red(this.f3963g);
        int iGreen = Color.green(this.f3963g);
        int iBlue = Color.blue(this.f3963g);
        if (f > 0.0f) {
            iMax = Math.min((int) (((255 - iRed) * f) + iRed), 255);
            iMax2 = Math.min((int) (((255 - iGreen) * f) + iGreen), 255);
            iMax3 = Math.min((int) (((255 - iBlue) * f) + iBlue), 255);
        } else {
            float f4 = f + 1.0f;
            iMax = Math.max((int) (iRed * f4), 0);
            iMax2 = Math.max((int) (iGreen * f4), 0);
            iMax3 = Math.max((int) (iBlue * f4), 0);
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb(iAlpha, iMax, iMax2, iMax3));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(100.0f);
        gradientDrawable2.setColor(colorStateListValueOf);
        return new RippleDrawable(colorStateListValueOf, stateListDrawable, gradientDrawable2);
    }

    public final boolean b(int i4) {
        try {
            return ((JSONObject) this.f3964h.get(i4)).optBoolean("isGrouping", false);
        } catch (Exception e5) {
            x1.f.a().d("u1.i0", e5.getMessage(), e5);
            return false;
        }
    }

    public final String c(int i4, String str) {
        try {
            JSONObject jSONObject = (JSONObject) this.f3964h.get(i4);
            if (jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str).trim();
        } catch (Exception e5) {
            x1.f.a().d("u1.i0", e5.getMessage(), e5);
            return null;
        }
    }

    public final String d(String str, int i4, int i5) {
        try {
            JSONObject jSONObject = ((JSONObject) this.f3964h.get(i4)).getJSONArray("subLinks").getJSONObject(i5);
            if (jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str).trim();
        } catch (Exception e5) {
            x1.f.a().d("u1.i0", e5.getMessage(), e5);
            return null;
        }
    }

    public final void e(String str, String str2) {
        if (((String) androidx.emoji2.text.p.l().f569h) != null) {
            str = str.replaceAll("GONATIVE_USERID", (String) androidx.emoji2.text.p.l().f569h);
        }
        MainActivity mainActivity = this.f3958a;
        if (str2 == null) {
            mainActivity.C0.b(str, true, false);
        } else {
            mainActivity.C0.c(str, str2, false);
        }
        mainActivity.S.f4059b.d(false);
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i4, int i5) {
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i4, int i5) {
        return 0L;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public final int getChildType(int i4, int i5) {
        return (this.f3965i || this.f3966j) ? 0 : 1;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public final int getChildTypeCount() {
        return 2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i4, int i5, boolean z4, View view, ViewGroup viewGroup) {
        int i6;
        String strD;
        MainActivity mainActivity = this.f3958a;
        if (view == null) {
            LayoutInflater layoutInflater = mainActivity.getLayoutInflater();
            view = (this.f3965i || this.f3966j) ? layoutInflater.inflate(R.layout.menu_child_icon, viewGroup, false) : layoutInflater.inflate(R.layout.menu_child_noicon, viewGroup, false);
        }
        ((RelativeLayout) view.findViewById(R.id.menu_item)).setBackground(a());
        int i7 = this.f3967k == this.f3959b.getFlatListPosition(ExpandableListView.getPackedPositionForChild(i4, i5)) ? 1 : 0;
        if (i7 != 0) {
            i6 = this.f3962e;
            strD = d("activeIcon", i4, i5);
        } else {
            i6 = this.f;
            strD = d("inactiveIcon", i4, i5);
        }
        if (strD == null || strD.isEmpty()) {
            strD = d("icon", i4, i5);
        }
        TextView textView = (TextView) view.findViewById(R.id.menu_item_title);
        textView.setText(d("label", i4, i5));
        textView.setTextColor(i6);
        textView.setTypeface(Typeface.create("sans-serif-medium", i7));
        ImageView imageView = (ImageView) view.findViewById(R.id.menu_item_icon);
        if (imageView != null) {
            if (strD != null && !strD.isEmpty()) {
                imageView.setImageDrawable(new v1.b(mainActivity, this.f3960c, i6, strD).d());
                imageView.setVisibility(0);
                return view;
            }
            imageView.setVisibility(4);
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i4) {
        try {
            JSONObject jSONObject = (JSONObject) this.f3964h.get(i4);
            if (jSONObject.optBoolean("isGrouping", false)) {
                return jSONObject.getJSONArray("subLinks").length();
            }
            return 0;
        } catch (Exception e5) {
            x1.f.a().d("u1.i0", e5.getMessage(), e5);
            return 0;
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i4) {
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.f3964h.length();
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i4) {
        return 0L;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public final int getGroupType(int i4) {
        return this.f3965i ? 0 : 1;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public final int getGroupTypeCount() {
        return 2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i4, boolean z4, View view, ViewGroup viewGroup) {
        int i5;
        String strC;
        MainActivity mainActivity = this.f3958a;
        if (view == null) {
            view = mainActivity.getLayoutInflater().inflate(this.f3965i ? R.layout.menu_group_icon : R.layout.menu_group_noicon, (ViewGroup) null);
        }
        ((RelativeLayout) view.findViewById(R.id.menu_item)).setBackground(a());
        int i6 = this.f3967k == i4 ? 1 : 0;
        if (i6 != 0) {
            i5 = this.f3962e;
            strC = c(i4, "activeIcon");
        } else {
            i5 = this.f;
            strC = c(i4, "inactiveIcon");
        }
        if (strC == null || strC.isEmpty()) {
            strC = c(i4, "icon");
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.menu_group_indicator);
        if (b(i4)) {
            imageView.setImageDrawable(new v1.b(mainActivity, this.f3961d, i5, z4 ? "fas fa-angle-up" : "fas fa-angle-down").d());
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = (TextView) view.findViewById(R.id.menu_item_title);
        textView.setText(c(i4, "label"));
        textView.setTextColor(i5);
        textView.setTypeface(Typeface.create("sans-serif-medium", i6));
        ImageView imageView2 = (ImageView) view.findViewById(R.id.menu_item_icon);
        if (imageView2 != null) {
            if (strC != null && !strC.isEmpty()) {
                imageView2.setImageDrawable(new v1.b(mainActivity, this.f3960c, i5, strC).d());
                imageView2.setVisibility(0);
                return view;
            }
            imageView2.setVisibility(4);
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i4, int i5) {
        return true;
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i4, int i5, long j4) {
        int flatListPosition = expandableListView.getFlatListPosition(ExpandableListView.getPackedPositionForChild(i4, i5));
        expandableListView.setItemChecked(flatListPosition, true);
        this.f3967k = flatListPosition;
        Pair pair = new Pair(d(ImagesContract.URL, i4, i5), d("javascript", i4, i5));
        e((String) pair.first, (String) pair.second);
        return true;
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i4, long j4) {
        try {
            if (b(i4)) {
                return false;
            }
            Pair pair = new Pair(c(i4, ImagesContract.URL), c(i4, "javascript"));
            e((String) pair.first, (String) pair.second);
            return true;
        } catch (Exception e5) {
            x1.f.a().d("u1.i0", e5.getMessage(), e5);
            return false;
        }
    }
}
