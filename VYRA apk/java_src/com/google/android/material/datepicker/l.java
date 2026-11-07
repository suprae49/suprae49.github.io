package com.google.android.material.datepicker;

import a3.h0;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.median.android.eeqadjy.R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import k.l3;
import k1.a1;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l<S> extends y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CalendarConstraints f1431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Month f1432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.emoji2.text.t f1434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView f1435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView f1436m;
    public View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f1437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f1438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f1439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MaterialButton f1440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AccessibilityManager f1441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k1.x f1442t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1443u;

    public static boolean h(l lVar, boolean z4) {
        Month month;
        if (lVar.f1443u) {
            return false;
        }
        if (lVar.f1436m.getScrollState() != 0) {
            return true;
        }
        x xVar = (x) lVar.f1436m.getAdapter();
        if (xVar == null || (month = lVar.f1432i) == null) {
            return false;
        }
        int iH = xVar.h(month) + (z4 ? 1 : -1);
        if (iH < 0 || iH >= xVar.f1478d.f1406l) {
            return false;
        }
        xVar.f1482i = z4 ? 2 : 1;
        lVar.i(xVar.g(iH));
        return true;
    }

    @Override // com.google.android.material.datepicker.y
    public final void g(p pVar) {
        this.f.add(pVar);
    }

    public final void i(Month month) {
        x xVar = (x) this.f1436m.getAdapter();
        int iH = xVar.h(month);
        AccessibilityManager accessibilityManager = this.f1441s;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iH2 = iH - xVar.h(this.f1432i);
            boolean z4 = Math.abs(iH2) > 3;
            boolean z5 = iH2 > 0;
            this.f1432i = month;
            if (z4 && z5) {
                this.f1436m.a0(iH - 3);
                this.f1436m.post(new androidx.emoji2.text.i(iH, 1, this));
            } else {
                RecyclerView recyclerView = this.f1436m;
                if (z4) {
                    recyclerView.a0(iH + 3);
                    this.f1436m.post(new androidx.emoji2.text.i(iH, 1, this));
                } else {
                    recyclerView.post(new androidx.emoji2.text.i(iH, 1, this));
                }
            }
        } else {
            this.f1432i = month;
            this.f1436m.a0(iH);
        }
        l();
        m(iH);
    }

    public final void j(int i4) {
        this.f1433j = i4;
        if (i4 == 2) {
            this.f1435l.getLayoutManager().o0(this.f1432i.f1409h - ((d0) this.f1435l.getAdapter()).f1422d.f1431h.f.f1409h);
            this.f1438p.setVisibility(0);
            this.f1439q.setVisibility(8);
            this.n.setVisibility(8);
            this.f1437o.setVisibility(8);
            return;
        }
        if (i4 == 1) {
            this.f1438p.setVisibility(8);
            this.f1439q.setVisibility(0);
            this.n.setVisibility(0);
            this.f1437o.setVisibility(0);
            i(this.f1432i);
        }
    }

    public final void k(View view) {
        if (view == null) {
            return;
        }
        int i4 = this.f1433j;
        if (i4 == 2) {
            p0.n(view, getString(R.string.mtrl_picker_pane_title_year_view));
        } else if (i4 == 1) {
            p0.n(view, getString(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void l() {
        Month month;
        x xVar = (x) this.f1436m.getAdapter();
        if (xVar != null) {
            k1.c0 c0Var = xVar.f2734a;
            if (this.f1443u || (month = this.f1432i) == null || month.equals(xVar.f1481h)) {
                return;
            }
            int iH = xVar.h(xVar.f1481h);
            xVar.f1481h = month;
            int iH2 = xVar.h(month);
            c0Var.c(iH, 1);
            c0Var.c(iH2, 1);
        }
    }

    public final void m(int i4) {
        View view = this.f1437o;
        if (view != null) {
            view.setEnabled(i4 + 1 < this.f1436m.getAdapter().a());
        }
        View view2 = this.n;
        if (view2 != null) {
            view2.setEnabled(i4 - 1 >= 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f1430g = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            androidx.fragment.app.q.c();
            return;
        }
        this.f1431h = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.f1432i = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            androidx.fragment.app.q.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4;
        int i5;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f1430g);
        this.f1434k = new androidx.emoji2.text.t(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f1441s = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month month = this.f1431h.f;
        boolean zJ = q.j(contextThemeWrapper, android.R.attr.windowFullscreen);
        this.f1443u = zJ;
        if (zJ) {
            i4 = R.layout.mtrl_calendar_vertical;
            i5 = 1;
        } else {
            i4 = R.layout.mtrl_calendar_horizontal;
            i5 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i4, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i6 = t.f1470i;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i6 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i6) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        p0.m(gridView, new e(0));
        int i7 = this.f1431h.f1404j;
        gridView.setAdapter((ListAdapter) (i7 > 0 ? new c(i7) : new c()));
        gridView.setNumColumns(month.f1410i);
        gridView.setEnabled(false);
        this.f1436m = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        getContext();
        this.f1436m.setLayoutManager(new f(this, i5, i5));
        this.f1436m.setTag("MONTHS_VIEW_GROUP_TAG");
        x xVar = new x(contextThemeWrapper, this.f1431h, new g(this), new h0(8, this));
        this.f1436m.setAdapter(xVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f1435l = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f1435l.setLayoutManager(new GridLayoutManager(integer));
            this.f1435l.setAdapter(new d0(this));
            RecyclerView recyclerView2 = this.f1435l;
            h hVar = new h();
            b0.c(null);
            b0.c(null);
            recyclerView2.g(hVar);
        }
        if (!this.f1443u) {
            k1.x xVar2 = new k1.x();
            this.f1442t = xVar2;
            RecyclerView recyclerView3 = this.f1436m;
            RecyclerView recyclerView4 = xVar2.f2940a;
            if (recyclerView4 != recyclerView3) {
                a1 a1Var = xVar2.f2941b;
                if (recyclerView4 != null) {
                    ArrayList arrayList = recyclerView4.f924m0;
                    if (arrayList != null) {
                        arrayList.remove(a1Var);
                    }
                    xVar2.f2940a.setOnFlingListener(null);
                }
                xVar2.f2940a = recyclerView3;
                if (recyclerView3 != null) {
                    if (recyclerView3.getOnFlingListener() != null) {
                        androidx.fragment.app.q.j("An instance of OnFlingListener already set.");
                        return null;
                    }
                    xVar2.f2940a.h(a1Var);
                    xVar2.f2940a.setOnFlingListener(xVar2);
                    new Scroller(xVar2.f2940a.getContext(), new DecelerateInterpolator());
                    xVar2.f();
                }
            }
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.f1440r = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            p0.m(this.f1440r, new i(0, this));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            this.n = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            l3.a(this.n, getString(R.string.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            this.f1437o = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            l3.a(this.f1437o, getString(R.string.mtrl_picker_next_month_tooltip));
            this.f1438p = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f1439q = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            j(1);
            this.f1440r.setText(this.f1432i.c());
            this.f1436m.h(new j(this, xVar));
            int i8 = 0;
            this.f1440r.setOnClickListener(new k(i8, this));
            this.f1437o.setOnClickListener(new d(this, xVar, i8));
            this.n.setOnClickListener(new d(this, xVar, 1));
            m(xVar.h(this.f1432i));
        }
        this.f1436m.a0(xVar.h(this.f1432i));
        p0.m(this.f1436m, new e(1));
        k(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1430g);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1431h);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1432i);
    }
}
