package d3;

import android.view.View;
import android.widget.AdapterView;
import k.a2;
import k.n0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1786g;

    public /* synthetic */ w(int i4, Object obj) {
        this.f = i4;
        this.f1786g = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        Object item;
        switch (this.f) {
            case 0:
                y yVar = (y) this.f1786g;
                a2 a2Var = yVar.f1789j;
                if (i4 < 0) {
                    item = !a2Var.E.isShowing() ? null : a2Var.f2470h.getSelectedItem();
                } else {
                    item = yVar.getAdapter().getItem(i4);
                }
                yVar.setText(yVar.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = yVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i4 < 0) {
                        view = !a2Var.E.isShowing() ? null : a2Var.f2470h.getSelectedView();
                        i4 = !a2Var.E.isShowing() ? -1 : a2Var.f2470h.getSelectedItemPosition();
                        j4 = !a2Var.E.isShowing() ? Long.MIN_VALUE : a2Var.f2470h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(a2Var.f2470h, view, i4, j4);
                }
                a2Var.dismiss();
                break;
            case 1:
                n0 n0Var = (n0) this.f1786g;
                androidx.appcompat.widget.c cVar = n0Var.L;
                cVar.setSelection(i4);
                if (cVar.getOnItemClickListener() != null) {
                    cVar.performItemClick(view, i4, n0Var.I.getItemId(i4));
                }
                n0Var.dismiss();
                break;
            default:
                ((androidx.appcompat.widget.e) this.f1786g).n(i4);
                break;
        }
    }
}
