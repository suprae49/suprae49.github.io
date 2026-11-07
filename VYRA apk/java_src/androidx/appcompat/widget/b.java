package androidx.appcompat.widget;

import a3.h0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.fragment.app.q;
import co.median.android.eeqadjy.R;
import j.a0;
import j.e0;
import j.m;
import j.o;
import j.p;
import j.u;
import j.x;
import j.y;
import j.z;
import java.util.ArrayList;
import k.g;
import k.h;
import k.i;
import k.j;
import k.l;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements y {
    public i A;
    public h B;
    public int D;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LayoutInflater f408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x f409j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a0 f412m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f413o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f414p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f415q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f416r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f417s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f418t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f419u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f420v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f421w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g f423y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g f424z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f410k = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f411l = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SparseBooleanArray f422x = new SparseBooleanArray();
    public final h0 C = new h0(17, this);

    public b(Context context) {
        this.f = context;
        this.f408i = LayoutInflater.from(context);
    }

    @Override // j.y
    public final void a(m mVar, boolean z4) {
        c();
        g gVar = this.f424z;
        if (gVar != null && gVar.b()) {
            gVar.f2449j.dismiss();
        }
        x xVar = this.f409j;
        if (xVar != null) {
            xVar.a(mVar, z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            z zVar = view instanceof z ? (z) view : (z) this.f408i.inflate(this.f411l, viewGroup, false);
            zVar.b(oVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) zVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f412m);
            if (this.B == null) {
                this.B = new h(this);
            }
            actionMenuItemView.setPopupCallback(this.B);
            actionView = (View) zVar;
        }
        actionView.setVisibility(oVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof l)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean c() {
        Object obj;
        i iVar = this.A;
        if (iVar != null && (obj = this.f412m) != null) {
            ((View) obj).removeCallbacks(iVar);
            this.A = null;
            return true;
        }
        g gVar = this.f423y;
        if (gVar == null) {
            return false;
        }
        if (gVar.b()) {
            gVar.f2449j.dismiss();
        }
        return true;
    }

    @Override // j.y
    public final boolean d(o oVar) {
        return false;
    }

    @Override // j.y
    public final void e(Parcelable parcelable) {
        int i4;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i4 = ((ActionMenuPresenter$SavedState) parcelable).f) > 0 && (menuItemFindItem = this.f407h.findItem(i4)) != null) {
            m((e0) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.y
    public final void f(boolean z4) {
        int i4;
        ViewGroup viewGroup = (ViewGroup) this.f412m;
        ArrayList arrayList = null;
        boolean z5 = false;
        if (viewGroup != null) {
            m mVar = this.f407h;
            if (mVar != null) {
                mVar.i();
                ArrayList arrayListL = this.f407h.l();
                int size = arrayListL.size();
                i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    o oVar = (o) arrayListL.get(i5);
                    if ((oVar.f2429x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i4);
                        o itemData = childAt instanceof z ? ((z) childAt).getItemData() : null;
                        View viewB = b(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            viewB.setPressed(false);
                            viewB.jumpDrawablesToCurrentState();
                        }
                        if (viewB != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewB.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewB);
                            }
                            ((ViewGroup) this.f412m).addView(viewB, i4);
                        }
                        i4++;
                    }
                }
            } else {
                i4 = 0;
            }
            while (i4 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i4) == this.f413o) {
                    i4++;
                } else {
                    viewGroup.removeViewAt(i4);
                }
            }
        }
        ((View) this.f412m).requestLayout();
        m mVar2 = this.f407h;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f2391i;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                p pVar = ((o) arrayList2.get(i6)).A;
            }
        }
        m mVar3 = this.f407h;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f2392j;
        }
        if (this.f416r && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z5 = !((o) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z5 = true;
            }
        }
        j jVar = this.f413o;
        if (z5) {
            if (jVar == null) {
                this.f413o = new j(this, this.f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f413o.getParent();
            if (viewGroup3 != this.f412m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f413o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f412m;
                j jVar2 = this.f413o;
                actionMenuView.getClass();
                l lVarJ = ActionMenuView.j();
                lVarJ.f2575a = true;
                actionMenuView.addView(jVar2, lVarJ);
            }
        } else if (jVar != null) {
            Object parent = jVar.getParent();
            Object obj = this.f412m;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f413o);
            }
        }
        ((ActionMenuView) this.f412m).setOverflowReserved(this.f416r);
    }

    public final boolean g() {
        g gVar = this.f423y;
        return gVar != null && gVar.b();
    }

    @Override // j.y
    public final int getId() {
        return this.n;
    }

    @Override // j.y
    public final void h(Context context, m mVar) {
        this.f406g = context;
        LayoutInflater.from(context);
        this.f407h = mVar;
        Resources resources = context.getResources();
        if (!this.f417s) {
            this.f416r = true;
        }
        int i4 = 2;
        this.f418t = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i5 > 600 || ((i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960))) {
            i4 = 5;
        } else if (i5 >= 500 || ((i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640))) {
            i4 = 4;
        } else if (i5 >= 360) {
            i4 = 3;
        }
        this.f420v = i4;
        int measuredWidth = this.f418t;
        if (this.f416r) {
            if (this.f413o == null) {
                j jVar = new j(this, this.f);
                this.f413o = jVar;
                if (this.f415q) {
                    jVar.setImageDrawable(this.f414p);
                    this.f414p = null;
                    this.f415q = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f413o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f413o.getMeasuredWidth();
        } else {
            this.f413o = null;
        }
        this.f419u = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // j.y
    public final boolean i() {
        int size;
        ArrayList arrayListL;
        int i4;
        boolean z4;
        b bVar = this;
        m mVar = bVar.f407h;
        if (mVar != null) {
            arrayListL = mVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i5 = bVar.f420v;
        int i6 = bVar.f419u;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) bVar.f412m;
        int i7 = 0;
        boolean z5 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z4 = true;
            if (i7 >= size) {
                break;
            }
            o oVar = (o) arrayListL.get(i7);
            int i10 = oVar.f2430y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z5 = true;
            }
            if (bVar.f421w && oVar.C) {
                i5 = 0;
            }
            i7++;
        }
        if (bVar.f416r && (z5 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = bVar.f422x;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            o oVar2 = (o) arrayListL.get(i12);
            int i14 = oVar2.f2430y;
            boolean z6 = (i14 & 2) == i4 ? z4 : false;
            int i15 = oVar2.f2409b;
            if (z6) {
                View viewB = bVar.b(oVar2, null, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z4);
                }
                oVar2.g(z4);
            } else {
                if ((i14 & 1) == z4) {
                    boolean z7 = sparseBooleanArray.get(i15);
                    boolean z8 = ((i11 > 0 || z7) && i6 > 0) ? z4 : false;
                    if (z8) {
                        View viewB2 = bVar.b(oVar2, null, viewGroup);
                        viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewB2.getMeasuredWidth();
                        i6 -= measuredWidth2;
                        if (i13 == 0) {
                            i13 = measuredWidth2;
                        }
                        z8 &= i6 + i13 > 0;
                    }
                    if (z8 && i15 != 0) {
                        sparseBooleanArray.put(i15, true);
                    } else if (z7) {
                        sparseBooleanArray.put(i15, false);
                        for (int i16 = 0; i16 < i12; i16++) {
                            o oVar3 = (o) arrayListL.get(i16);
                            if (oVar3.f2409b == i15) {
                                if ((oVar3.f2429x & 32) == 32) {
                                    i11++;
                                }
                                oVar3.g(false);
                            }
                        }
                    }
                    if (z8) {
                        i11--;
                    }
                    oVar2.g(z8);
                } else {
                    oVar2.g(false);
                }
                i12++;
                i4 = 2;
                bVar = this;
                z4 = true;
            }
            i12++;
            i4 = 2;
            bVar = this;
            z4 = true;
        }
        return z4;
    }

    @Override // j.y
    public final Parcelable j() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.f = this.D;
        return actionMenuPresenter$SavedState;
    }

    @Override // j.y
    public final boolean k(o oVar) {
        return false;
    }

    @Override // j.y
    public final void l(x xVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.y
    public final boolean m(e0 e0Var) {
        boolean z4;
        if (e0Var.hasVisibleItems()) {
            e0 e0Var2 = e0Var;
            while (true) {
                m mVar = e0Var2.f2349z;
                if (mVar == this.f407h) {
                    break;
                }
                e0Var2 = (e0) mVar;
            }
            o oVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f412m;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    if ((childAt instanceof z) && ((z) childAt).getItemData() == oVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.D = e0Var.A.f2408a;
                int size = e0Var.f.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        z4 = false;
                        break;
                    }
                    MenuItem item = e0Var.getItem(i5);
                    if (item.isVisible() && item.getIcon() != null) {
                        z4 = true;
                        break;
                    }
                    i5++;
                }
                g gVar = new g(this, this.f406g, e0Var, view);
                this.f424z = gVar;
                gVar.f2447h = z4;
                u uVar = gVar.f2449j;
                if (uVar != null) {
                    uVar.q(z4);
                }
                g gVar2 = this.f424z;
                if (!gVar2.b()) {
                    if (gVar2.f == null) {
                        q.j("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    gVar2.d(0, 0, false, false);
                }
                x xVar = this.f409j;
                if (xVar != null) {
                    xVar.h(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        m mVar;
        if (!this.f416r || g() || (mVar = this.f407h) == null || this.f412m == null || this.A != null) {
            return false;
        }
        mVar.i();
        if (mVar.f2392j.isEmpty()) {
            return false;
        }
        i iVar = new i(this, new g(this, this.f406g, this.f407h, this.f413o));
        this.A = iVar;
        ((View) this.f412m).post(iVar);
        return true;
    }
}
