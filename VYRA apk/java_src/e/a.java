package e;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f1838g;

    public a(b bVar, e eVar) {
        this.f1838g = bVar;
        this.f = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        b bVar = this.f1838g;
        DialogInterface.OnClickListener onClickListener = bVar.f1853o;
        e eVar = this.f;
        onClickListener.onClick(eVar.f1897b, i4);
        if (bVar.f1855q) {
            return;
        }
        eVar.f1897b.dismiss();
    }
}
