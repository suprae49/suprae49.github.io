package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.ParcelableSparseArray;
import j.e0;
import j.m;
import j.o;
import j.y;
import p1.v;
import u2.f;
import u2.h;
import u2.i;
import u2.k;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements y {
    public g2.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1529h;

    @Override // j.y
    public final boolean d(o oVar) {
        return false;
    }

    @Override // j.y
    public final void e(Parcelable parcelable) {
        if (parcelable instanceof NavigationBarPresenter$SavedState) {
            g2.b bVar = this.f;
            NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = (NavigationBarPresenter$SavedState) parcelable;
            int i4 = navigationBarPresenter$SavedState.f;
            int size = bVar.R.f4193b.size();
            for (int i5 = 0; i5 < size; i5++) {
                MenuItem menuItemA = bVar.R.a(i5);
                if (i4 == menuItemA.getItemId()) {
                    bVar.f4208m = i4;
                    bVar.n = i5;
                    bVar.setCheckedItem(menuItemA);
                    break;
                }
            }
            Context context = this.f.getContext();
            ParcelableSparseArray parcelableSparseArray = navigationBarPresenter$SavedState.f1512g;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            for (int i6 = 0; i6 < parcelableSparseArray.size(); i6++) {
                int iKeyAt = parcelableSparseArray.keyAt(i6);
                BadgeState$State badgeState$State = (BadgeState$State) parcelableSparseArray.valueAt(i6);
                sparseArray.put(iKeyAt, badgeState$State != null ? new d2.a(context, badgeState$State) : null);
            }
            g2.b bVar2 = this.f;
            SparseArray sparseArray2 = bVar2.A;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                int iKeyAt2 = sparseArray.keyAt(i7);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (d2.a) sparseArray.get(iKeyAt2));
                }
            }
            i[] iVarArr = bVar2.f4207l;
            if (iVarArr != null) {
                for (i iVar : iVarArr) {
                    if (iVar instanceof f) {
                        f fVar = (f) iVar;
                        d2.a aVar = (d2.a) sparseArray2.get(fVar.getId());
                        if (aVar != null) {
                            fVar.setBadge(aVar);
                        }
                    }
                }
            }
        }
    }

    @Override // j.y
    public final void f(boolean z4) {
        h hVar;
        p1.a aVar;
        if (this.f1528g) {
            return;
        }
        g2.b bVar = this.f;
        if (z4) {
            bVar.b();
            return;
        }
        h hVar2 = bVar.R;
        if (hVar2 == null || bVar.f4207l == null) {
            return;
        }
        bVar.Q.f1528g = true;
        hVar2.b();
        bVar.Q.f1528g = false;
        if (bVar.f4207l != null && (hVar = bVar.R) != null && hVar.f4193b.size() == bVar.f4207l.length) {
            for (int i4 = 0; i4 < bVar.f4207l.length; i4++) {
                if (!(bVar.R.a(i4) instanceof u2.a) || (bVar.f4207l[i4] instanceof u2.c)) {
                    boolean z5 = bVar.R.a(i4).hasSubMenu() && !(bVar.f4207l[i4] instanceof k);
                    boolean z6 = (bVar.R.a(i4).hasSubMenu() || (bVar.f4207l[i4] instanceof f)) ? false : true;
                    if ((bVar.R.a(i4) instanceof u2.a) || (!z5 && !z6)) {
                    }
                }
            }
            int i5 = bVar.f4208m;
            int size = bVar.R.f4193b.size();
            for (int i6 = 0; i6 < size; i6++) {
                MenuItem menuItemA = bVar.R.a(i6);
                if (menuItemA.isChecked()) {
                    bVar.setCheckedItem(menuItemA);
                    bVar.f4208m = menuItemA.getItemId();
                    bVar.n = i6;
                }
            }
            if (i5 != bVar.f4208m && (aVar = bVar.f) != null) {
                v.a(bVar, aVar);
            }
            int i7 = bVar.f4205j;
            boolean z7 = i7 != -1 ? i7 == 0 : bVar.getCurrentVisibleContentItemCount() > 3;
            for (int i8 = 0; i8 < size; i8++) {
                bVar.Q.f1528g = true;
                bVar.f4207l[i8].setExpanded(bVar.W);
                i iVar = bVar.f4207l[i8];
                if (iVar instanceof f) {
                    f fVar = (f) iVar;
                    fVar.setLabelVisibilityMode(bVar.f4205j);
                    fVar.setItemIconGravity(bVar.f4206k);
                    fVar.setItemGravity(bVar.M);
                    fVar.setShifting(z7);
                }
                if (bVar.R.a(i8) instanceof o) {
                    bVar.f4207l[i8].b((o) bVar.R.a(i8));
                }
                bVar.Q.f1528g = false;
            }
            return;
        }
        bVar.b();
    }

    @Override // j.y
    public final int getId() {
        return this.f1529h;
    }

    @Override // j.y
    public final void h(Context context, m mVar) {
        this.f.a(mVar);
    }

    @Override // j.y
    public final boolean i() {
        return false;
    }

    @Override // j.y
    public final Parcelable j() {
        NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new NavigationBarPresenter$SavedState();
        navigationBarPresenter$SavedState.f = this.f.getSelectedItemId();
        SparseArray<d2.a> badgeDrawables = this.f.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i4 = 0; i4 < badgeDrawables.size(); i4++) {
            int iKeyAt = badgeDrawables.keyAt(i4);
            d2.a aVarValueAt = badgeDrawables.valueAt(i4);
            parcelableSparseArray.put(iKeyAt, aVarValueAt != null ? aVarValueAt.f1660j.f1668a : null);
        }
        navigationBarPresenter$SavedState.f1512g = parcelableSparseArray;
        return navigationBarPresenter$SavedState;
    }

    @Override // j.y
    public final boolean k(o oVar) {
        return false;
    }

    @Override // j.y
    public final boolean m(e0 e0Var) {
        return false;
    }

    @Override // j.y
    public final void a(m mVar, boolean z4) {
    }
}
