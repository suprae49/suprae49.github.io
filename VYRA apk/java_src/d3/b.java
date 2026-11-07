package d3;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f1682b;

    public /* synthetic */ b(t tVar, int i4) {
        this.f1681a = i4;
        this.f1682b = tVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f1681a) {
            case 0:
                e eVar = (e) this.f1682b;
                eVar.s(eVar.t());
                break;
            default:
                m mVar = (m) this.f1682b;
                mVar.f1721l = z4;
                mVar.p();
                if (!z4) {
                    mVar.s(false);
                    mVar.f1722m = false;
                }
                break;
        }
    }
}
