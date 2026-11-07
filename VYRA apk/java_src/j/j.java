package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends BaseAdapter {
    public final m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2378g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LayoutInflater f2381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2382k;

    public j(m mVar, LayoutInflater layoutInflater, boolean z4, int i4) {
        this.f2380i = z4;
        this.f2381j = layoutInflater;
        this.f = mVar;
        this.f2382k = i4;
        a();
    }

    public final void a() {
        m mVar = this.f;
        o oVar = mVar.f2403v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f2392j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((o) arrayList.get(i4)) == oVar) {
                    this.f2378g = i4;
                    return;
                }
            }
        }
        this.f2378g = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i4) {
        ArrayList arrayListL;
        boolean z4 = this.f2380i;
        m mVar = this.f;
        if (z4) {
            mVar.i();
            arrayListL = mVar.f2392j;
        } else {
            arrayListL = mVar.l();
        }
        int i5 = this.f2378g;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (o) arrayListL.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z4 = this.f2380i;
        m mVar = this.f;
        if (z4) {
            mVar.i();
            arrayListL = mVar.f2392j;
        } else {
            arrayListL = mVar.l();
        }
        return this.f2378g < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.f2381j.inflate(this.f2382k, viewGroup, false);
        }
        int i5 = getItem(i4).f2409b;
        int i6 = i4 - 1;
        int i7 = i6 >= 0 ? getItem(i6).f2409b : i5;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f.m() && i5 != i7) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        z zVar = (z) view;
        if (this.f2379h) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.b(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
