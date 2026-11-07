package k;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2658g;

    public /* synthetic */ u1(int i4, Object obj) {
        this.f = i4;
        this.f2658g = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
        p1 p1Var;
        switch (this.f) {
            case 0:
                if (i4 != -1 && (p1Var = ((a2) this.f2658g).f2470h) != null) {
                    p1Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((androidx.appcompat.widget.e) this.f2658g).o(i4);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i4 = this.f;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
