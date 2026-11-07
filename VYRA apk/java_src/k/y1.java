package k;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2705b;

    public /* synthetic */ y1(int i4, Object obj) {
        this.f2704a = i4;
        this.f2705b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f2704a) {
            case 0:
                a2 a2Var = (a2) this.f2705b;
                if (a2Var.E.isShowing()) {
                    a2Var.c();
                }
                break;
            default:
                x2 x2Var = (x2) this.f2705b;
                x2Var.f = true;
                x2Var.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f2704a) {
            case 0:
                ((a2) this.f2705b).dismiss();
                break;
            default:
                x2 x2Var = (x2) this.f2705b;
                x2Var.f = false;
                x2Var.notifyDataSetInvalidated();
                break;
        }
    }
}
