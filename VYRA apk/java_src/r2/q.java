package r2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import co.median.android.eeqadjy.R;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import j.e0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements j.y {
    public int A;
    public boolean B;
    public int D;
    public int E;
    public int F;
    public NavigationMenuView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f3561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j.m f3562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f3564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LayoutInflater f3565k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f3567m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f3569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ColorStateList f3570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f3571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RippleDrawable f3572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3578y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3579z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3566l = 0;
    public int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3568o = true;
    public boolean C = true;
    public int G = -1;
    public final com.google.android.material.datepicker.k H = new com.google.android.material.datepicker.k(5, this);

    public final void b() {
        i iVar = this.f3564j;
        if (iVar != null) {
            ArrayList arrayList = iVar.f3554d;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (arrayList.get(i4) instanceof l) {
                    iVar.f2734a.c(i4, 1);
                }
            }
        }
    }

    public final void c() {
        i iVar = this.f3564j;
        if (iVar != null) {
            ArrayList arrayList = iVar.f3554d;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if ((arrayList.get(i4) instanceof m) && iVar.c(i4) == 1) {
                    iVar.f2734a.c(i4, 1);
                }
            }
        }
    }

    @Override // j.y
    public final boolean d(j.o oVar) {
        return false;
    }

    @Override // j.y
    public final void e(Parcelable parcelable) {
        j.o oVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                i iVar = this.f3564j;
                ArrayList arrayList = iVar.f3554d;
                int i4 = bundle2.getInt("android:menu:checked", 0);
                if (i4 != 0) {
                    iVar.f = true;
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        k kVar = (k) arrayList.get(i5);
                        if (kVar instanceof m) {
                            j.o oVar2 = ((m) kVar).f3559a;
                            if (oVar2.f2408a == i4) {
                                iVar.h(oVar2);
                                break;
                            }
                        }
                    }
                    iVar.f = false;
                    iVar.g();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        k kVar2 = (k) arrayList.get(i6);
                        if ((kVar2 instanceof m) && (actionView = (oVar = ((m) kVar2).f3559a).getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(oVar.f2408a)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f3561g.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // j.y
    public final void f(boolean z4) {
        i iVar = this.f3564j;
        if (iVar != null) {
            k1.c0 c0Var = iVar.f2734a;
            ArrayList arrayList = iVar.f3554d;
            int size = arrayList.size();
            iVar.g();
            c0Var.b();
            if (size == arrayList.size()) {
                c0Var.c(0, arrayList.size());
            }
        }
    }

    public final void g() {
        i iVar = this.f3564j;
        if (iVar != null) {
            ArrayList arrayList = iVar.f3554d;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if ((arrayList.get(i4) instanceof m) && iVar.c(i4) == 0) {
                    iVar.f2734a.c(i4, 1);
                }
            }
        }
    }

    @Override // j.y
    public final int getId() {
        return this.f3563i;
    }

    @Override // j.y
    public final void h(Context context, j.m mVar) {
        this.f3565k = LayoutInflater.from(context);
        this.f3562h = mVar;
        this.F = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // j.y
    public final boolean i() {
        return false;
    }

    @Override // j.y
    public final Parcelable j() {
        j.o oVar;
        View actionView;
        Bundle bundle = new Bundle();
        if (this.f != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        i iVar = this.f3564j;
        if (iVar != null) {
            ArrayList arrayList = iVar.f3554d;
            Bundle bundle2 = new Bundle();
            j.o oVar2 = iVar.f3555e;
            if (oVar2 != null) {
                bundle2.putInt("android:menu:checked", oVar2.f2408a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                k kVar = (k) arrayList.get(i4);
                if ((kVar instanceof m) && (actionView = (oVar = ((m) kVar).f3559a).getActionView()) != null) {
                    ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                    actionView.saveHierarchyState(parcelableSparseArray);
                    sparseArray2.put(oVar.f2408a, parcelableSparseArray);
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f3561g != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f3561g.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // j.y
    public final boolean k(j.o oVar) {
        return false;
    }

    @Override // j.y
    public final boolean m(e0 e0Var) {
        return false;
    }

    @Override // j.y
    public final void a(j.m mVar, boolean z4) {
    }
}
