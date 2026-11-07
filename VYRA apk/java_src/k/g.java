package k;

import android.content.Context;
import android.view.View;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j.w {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2521m = 0;
    public final /* synthetic */ androidx.appcompat.widget.b n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.widget.b bVar, Context context, j.e0 e0Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, e0Var, false);
        this.n = bVar;
        if ((e0Var.A.f2429x & 32) != 32) {
            View view2 = bVar.f413o;
            this.f = view2 == null ? (View) bVar.f412m : view2;
        }
        a3.h0 h0Var = bVar.C;
        this.f2448i = h0Var;
        j.u uVar = this.f2449j;
        if (uVar != null) {
            uVar.l(h0Var);
        }
    }

    @Override // j.w
    public final void c() {
        switch (this.f2521m) {
            case 0:
                androidx.appcompat.widget.b bVar = this.n;
                bVar.f424z = null;
                bVar.D = 0;
                super.c();
                break;
            default:
                androidx.appcompat.widget.b bVar2 = this.n;
                j.m mVar = bVar2.f407h;
                if (mVar != null) {
                    mVar.c(true);
                }
                bVar2.f423y = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.widget.b bVar, Context context, j.m mVar, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, mVar, true);
        this.n = bVar;
        this.f2446g = 8388613;
        a3.h0 h0Var = bVar.C;
        this.f2448i = h0Var;
        j.u uVar = this.f2449j;
        if (uVar != null) {
            uVar.l(h0Var);
        }
    }
}
