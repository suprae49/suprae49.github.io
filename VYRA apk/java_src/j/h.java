package j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends BaseAdapter {
    public int f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f2372g;

    public h(i iVar) {
        this.f2372g = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f2372g.f2374h;
        o oVar = mVar.f2403v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f2392j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((o) arrayList.get(i4)) == oVar) {
                    this.f = i4;
                    return;
                }
            }
        }
        this.f = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i4) {
        i iVar = this.f2372g;
        m mVar = iVar.f2374h;
        mVar.i();
        ArrayList arrayList = mVar.f2392j;
        iVar.getClass();
        int i5 = this.f;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (o) arrayList.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f2372g;
        m mVar = iVar.f2374h;
        mVar.i();
        int size = mVar.f2392j.size();
        iVar.getClass();
        return this.f < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2372g.f2373g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).b(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
