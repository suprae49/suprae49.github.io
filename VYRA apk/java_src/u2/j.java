package u2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.q;
import j.a0;
import java.util.HashSet;
import r2.y;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends ViewGroup implements a0 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int[] f4197e0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int[] f4198f0 = {-16842910};
    public final SparseArray A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public a3.o N;
    public boolean O;
    public ColorStateList P;
    public com.google.android.material.navigation.b Q;
    public h R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public MenuItem f4199a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f4200b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f4201c0;
    public final Rect d0;
    public final p1.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.material.datepicker.k f4202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o0.d f4203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray f4204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i[] f4207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4208m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f4209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4210p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ColorStateList f4211q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ColorStateList f4212r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4213s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4214t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4215u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4216v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4217w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f4218x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f4219y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4220z;

    public j(Context context) {
        super(context);
        this.f4204i = new SparseArray();
        this.f4208m = -1;
        this.n = -1;
        this.A = new SparseArray();
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.M = 49;
        this.O = false;
        this.U = 1;
        this.V = 0;
        this.f4199a0 = null;
        this.f4200b0 = 7;
        this.f4201c0 = false;
        this.d0 = new Rect();
        this.f4212r = c();
        if (isInEditMode()) {
            this.f = null;
        } else {
            p1.a aVar = new p1.a();
            this.f = aVar;
            aVar.O(0);
            aVar.o();
            aVar.D(t2.i.K(getContext(), co.median.android.eeqadjy.R.attr.motionDurationMedium4, getResources().getInteger(co.median.android.eeqadjy.R.integer.material_motion_duration_long_1)));
            aVar.F(t2.i.L(getContext(), co.median.android.eeqadjy.R.attr.motionEasingStandard, b2.a.f1048b));
            aVar.L(new y());
        }
        this.f4202g = new com.google.android.material.datepicker.k(6, (g2.b) this);
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.f4200b0, this.R.f4196e);
    }

    private f getNewItem() {
        o0.d dVar = this.f4203h;
        f fVar = dVar != null ? (f) dVar.a() : null;
        return fVar == null ? new g2.a(getContext()) : fVar;
    }

    private void setBadgeIfNeeded(f fVar) {
        d2.a aVar;
        int id = fVar.getId();
        if (id == -1 || (aVar = (d2.a) this.A.get(id)) == null) {
            return;
        }
        fVar.setBadge(aVar);
    }

    @Override // j.a0
    public final void a(j.m mVar) {
        this.R = new h(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        f fVarE;
        View viewE;
        c cVar;
        removeAllViews();
        i[] iVarArr = this.f4207l;
        if (iVarArr != null && this.f4203h != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    f fVar = (f) iVar;
                    this.f4203h.c(fVar);
                    fVar.j(fVar.f4189y);
                    fVar.N = null;
                    fVar.T = 0.0f;
                    fVar.f = false;
                }
            }
        }
        this.Q.f1528g = true;
        this.R.b();
        this.Q.f1528g = false;
        int i4 = this.R.f4194c;
        if (i4 == 0) {
            this.f4208m = 0;
            this.n = 0;
            this.f4207l = null;
            this.f4203h = null;
            return;
        }
        if (this.f4203h == null || this.V != i4) {
            this.V = i4;
            this.f4203h = new o0.d(i4);
        }
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < this.R.f4193b.size(); i5++) {
            hashSet.add(Integer.valueOf(this.R.a(i5).getItemId()));
        }
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.A;
            if (i6 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i6);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i6++;
        }
        int size = this.R.f4193b.size();
        this.f4207l = new i[size];
        int i7 = this.f4205j;
        boolean z4 = i7 != -1 ? i7 == 0 : getCurrentVisibleContentItemCount() > 3;
        int size2 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem menuItemA = this.R.a(i9);
            boolean z5 = menuItemA instanceof a;
            if (z5) {
                Context context = getContext();
                cVar = new c(context);
                LayoutInflater.from(context).inflate(co.median.android.eeqadjy.R.layout.m3_navigation_menu_divider, (ViewGroup) cVar, true);
                cVar.a();
                cVar.setOnlyShowWhenExpanded(true);
                cVar.setDividersEnabled(this.f4201c0);
            } else if (menuItemA.hasSubMenu()) {
                if (size2 > 0) {
                    q.q("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                    return;
                }
                k kVar = new k(getContext());
                int i10 = this.f4216v;
                if (i10 == 0) {
                    i10 = this.f4214t;
                }
                kVar.setTextAppearance(i10);
                kVar.setTextColor(this.f4211q);
                kVar.setOnlyShowWhenExpanded(true);
                kVar.b((j.o) menuItemA);
                size2 = menuItemA.getSubMenu().size();
                viewE = kVar;
            } else if (size2 > 0) {
                fVarE = e(i9, (j.o) menuItemA, z4, true);
                size2--;
            } else {
                j.o oVar = (j.o) menuItemA;
                boolean z6 = i8 >= this.f4200b0;
                i8++;
                viewE = e(i9, oVar, z4, z6);
            }
            if (z5) {
                viewE = fVarE;
                viewE = cVar;
            } else {
                viewE = fVarE;
                if (menuItemA.isCheckable() && this.n == -1) {
                    viewE = cVar;
                    this.n = i9;
                } else {
                    viewE = cVar;
                }
            }
            this.f4207l[i9] = viewE;
            addView(viewE);
        }
        int iMin = Math.min(size - 1, this.n);
        this.n = iMin;
        setCheckedItem(this.f4207l[iMin].getItemData());
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = c0.c.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(co.median.android.eeqadjy.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i4 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f4197e0;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = f4198f0;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateList.getColorForState(iArr3, defaultColor), i4, defaultColor});
    }

    public final a3.j d() {
        if (this.N == null || this.P == null) {
            return null;
        }
        a3.j jVar = new a3.j(this.N);
        jVar.r(this.P);
        return jVar;
    }

    public final f e(int i4, j.o oVar, boolean z4, boolean z5) {
        this.Q.f1528g = true;
        oVar.setCheckable(true);
        this.Q.f1528g = false;
        f newItem = getNewItem();
        newItem.setShifting(z4);
        newItem.setLabelMaxLines(this.U);
        newItem.setIconTintList(this.f4209o);
        newItem.setIconSize(this.f4210p);
        newItem.setTextColor(this.f4212r);
        newItem.setTextAppearanceInactive(this.f4213s);
        newItem.setTextAppearanceActive(this.f4214t);
        newItem.setHorizontalTextAppearanceInactive(this.f4215u);
        newItem.setHorizontalTextAppearanceActive(this.f4216v);
        newItem.setTextAppearanceActiveBoldEnabled(this.f4217w);
        newItem.setTextColor(this.f4211q);
        int i5 = this.B;
        if (i5 != -1) {
            newItem.setItemPaddingTop(i5);
        }
        int i6 = this.C;
        if (i6 != -1) {
            newItem.setItemPaddingBottom(i6);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.S);
        newItem.setLabelFontScalingEnabled(this.T);
        int i7 = this.D;
        if (i7 != -1) {
            newItem.setActiveIndicatorLabelPadding(i7);
        }
        int i8 = this.E;
        if (i8 != -1) {
            newItem.setIconLabelHorizontalSpacing(i8);
        }
        newItem.setActiveIndicatorWidth(this.G);
        newItem.setActiveIndicatorHeight(this.H);
        newItem.setActiveIndicatorExpandedWidth(this.I);
        newItem.setActiveIndicatorExpandedHeight(this.J);
        newItem.setActiveIndicatorMarginHorizontal(this.K);
        newItem.setItemGravity(this.M);
        newItem.setActiveIndicatorExpandedPadding(this.d0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.L);
        newItem.setActiveIndicatorDrawable(d());
        newItem.setActiveIndicatorResizeable(this.O);
        newItem.setActiveIndicatorEnabled(this.F);
        Drawable drawable = this.f4218x;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.f4220z);
        }
        newItem.setItemRippleColor(this.f4219y);
        newItem.setLabelVisibilityMode(this.f4205j);
        newItem.setItemIconGravity(this.f4206k);
        newItem.setOnlyShowWhenExpanded(z5);
        newItem.setExpanded(this.W);
        newItem.b(oVar);
        newItem.setItemPosition(i4);
        int i9 = oVar.f2408a;
        newItem.setOnTouchListener((View.OnTouchListener) this.f4204i.get(i9));
        newItem.setOnClickListener(this.f4202g);
        int i10 = this.f4208m;
        if (i10 != 0 && i9 == i10) {
            this.n = i4;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.D;
    }

    public SparseArray<d2.a> getBadgeDrawables() {
        return this.A;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.W ? this.R.f4195d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f4216v;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f4215u;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.E;
    }

    public ColorStateList getIconTintList() {
        return this.f4209o;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.P;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.F;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.J;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.L;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.I;
    }

    public int getItemActiveIndicatorHeight() {
        return this.H;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.K;
    }

    public a3.o getItemActiveIndicatorShapeAppearance() {
        return this.N;
    }

    public int getItemActiveIndicatorWidth() {
        return this.G;
    }

    public Drawable getItemBackground() {
        i[] iVarArr = this.f4207l;
        if (iVarArr != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    return ((f) iVar).getBackground();
                }
            }
        }
        return this.f4218x;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f4220z;
    }

    public int getItemGravity() {
        return this.M;
    }

    public int getItemIconGravity() {
        return this.f4206k;
    }

    public int getItemIconSize() {
        return this.f4210p;
    }

    public int getItemPaddingBottom() {
        return this.C;
    }

    public int getItemPaddingTop() {
        return this.B;
    }

    public ColorStateList getItemRippleColor() {
        return this.f4219y;
    }

    public int getItemTextAppearanceActive() {
        return this.f4214t;
    }

    public int getItemTextAppearanceInactive() {
        return this.f4213s;
    }

    public ColorStateList getItemTextColor() {
        return this.f4211q;
    }

    public int getLabelMaxLines() {
        return this.U;
    }

    public int getLabelVisibilityMode() {
        return this.f4205j;
    }

    public h getMenu() {
        return this.R;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.T;
    }

    public int getSelectedItemId() {
        return this.f4208m;
    }

    public int getSelectedItemPosition() {
        return this.n;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(int i4) {
        this.D = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorLabelPadding(i4);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.f4199a0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.f4199a0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.f4199a0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.f4199a0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i4) {
        this.f4200b0 = i4;
    }

    public void setExpanded(boolean z4) {
        this.W = z4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                iVar.setExpanded(z4);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i4) {
        this.f4216v = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setHorizontalTextAppearanceActive(i4);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i4) {
        this.f4215u = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setHorizontalTextAppearanceInactive(i4);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i4) {
        this.E = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setIconLabelHorizontalSpacing(i4);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f4209o = colorStateList;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z4) {
        this.F = z4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorEnabled(z4);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i4) {
        this.J = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorExpandedHeight(i4);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i4) {
        this.L = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorExpandedMarginHorizontal(i4);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i4) {
        this.I = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorExpandedWidth(i4);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i4) {
        this.H = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorHeight(i4);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i4) {
        this.K = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorMarginHorizontal(i4);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z4) {
        this.O = z4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorResizeable(z4);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(a3.o oVar) {
        this.N = oVar;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i4) {
        this.G = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorWidth(i4);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f4218x = drawable;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i4) {
        this.f4220z = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemBackground(i4);
                }
            }
        }
    }

    public void setItemGravity(int i4) {
        this.M = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemGravity(i4);
                }
            }
        }
    }

    public void setItemIconGravity(int i4) {
        this.f4206k = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemIconGravity(i4);
                }
            }
        }
    }

    public void setItemIconSize(int i4) {
        this.f4210p = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setIconSize(i4);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i4) {
        this.C = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemPaddingBottom(this.C);
                }
            }
        }
    }

    public void setItemPaddingTop(int i4) {
        this.B = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemPaddingTop(i4);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f4219y = colorStateList;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i4) {
        this.f4214t = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setTextAppearanceActive(i4);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z4) {
        this.f4217w = z4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setTextAppearanceActiveBoldEnabled(z4);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i4) {
        this.f4213s = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setTextAppearanceInactive(i4);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f4211q = colorStateList;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z4) {
        this.T = z4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setLabelFontScalingEnabled(z4);
                }
            }
        }
    }

    public void setLabelMaxLines(int i4) {
        this.U = i4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setLabelMaxLines(i4);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i4) {
        this.f4205j = i4;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z4) {
        this.S = z4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setMeasureBottomPaddingFromLabelBaseline(z4);
                }
            }
        }
    }

    public void setPresenter(com.google.android.material.navigation.b bVar) {
        this.Q = bVar;
    }

    public void setSubmenuDividersEnabled(boolean z4) {
        if (this.f4201c0 == z4) {
            return;
        }
        this.f4201c0 = z4;
        i[] iVarArr = this.f4207l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof c) {
                    ((c) iVar).setDividersEnabled(z4);
                }
            }
        }
    }
}
