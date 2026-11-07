package r2;

import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j.m {
    @Override // j.m, android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        j.o oVarA = a(i4, i5, i6, charSequence);
        r rVar = new r(this.f2384a, this, oVarA);
        oVarA.f2420o = rVar;
        rVar.setHeaderTitle(oVarA.f2412e);
        return rVar;
    }
}
