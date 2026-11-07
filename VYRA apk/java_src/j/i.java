package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements y, AdapterView.OnItemClickListener {
    public Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LayoutInflater f2373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f2374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExpandedMenuView f2375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x f2376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f2377k;

    public i(ContextWrapper contextWrapper) {
        this.f = contextWrapper;
        this.f2373g = LayoutInflater.from(contextWrapper);
    }

    @Override // j.y
    public final void a(m mVar, boolean z4) {
        x xVar = this.f2376j;
        if (xVar != null) {
            xVar.a(mVar, z4);
        }
    }

    @Override // j.y
    public final boolean d(o oVar) {
        return false;
    }

    @Override // j.y
    public final void e(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f2375i.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // j.y
    public final void f(boolean z4) {
        h hVar = this.f2377k;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // j.y
    public final int getId() {
        return 0;
    }

    @Override // j.y
    public final void h(Context context, m mVar) {
        if (this.f != null) {
            this.f = context;
            if (this.f2373g == null) {
                this.f2373g = LayoutInflater.from(context);
            }
        }
        this.f2374h = mVar;
        h hVar = this.f2377k;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // j.y
    public final boolean i() {
        return false;
    }

    @Override // j.y
    public final Parcelable j() {
        if (this.f2375i == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f2375i;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // j.y
    public final boolean k(o oVar) {
        return false;
    }

    @Override // j.y
    public final void l(x xVar) {
        throw null;
    }

    @Override // j.y
    public final boolean m(e0 e0Var) {
        boolean zHasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f2384a;
        if (!zHasVisibleItems) {
            return false;
        }
        n nVar = new n();
        nVar.f = e0Var;
        e.f fVar = new e.f(context);
        e.b bVar = (e.b) fVar.f1920g;
        i iVar = new i(bVar.f1841a);
        nVar.f2407h = iVar;
        iVar.f2376j = nVar;
        e0Var.b(iVar, context);
        i iVar2 = nVar.f2407h;
        if (iVar2.f2377k == null) {
            iVar2.f2377k = new h(iVar2);
        }
        bVar.n = iVar2.f2377k;
        bVar.f1853o = nVar;
        View view = e0Var.f2396o;
        if (view != null) {
            bVar.f1845e = view;
        } else {
            bVar.f1843c = e0Var.n;
            bVar.f1844d = e0Var.f2395m;
        }
        bVar.f1851l = nVar;
        e.g gVarA = fVar.a();
        nVar.f2406g = gVarA;
        gVarA.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.f2406g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.f2406g.show();
        x xVar = this.f2376j;
        if (xVar == null) {
            return true;
        }
        xVar.h(e0Var);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        this.f2374h.q(this.f2377k.getItem(i4), this, 0);
    }
}
