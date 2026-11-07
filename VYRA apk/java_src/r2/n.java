package r2;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.NavigationMenuView;
import k1.z0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends z0 {
    public final /* synthetic */ q f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f = qVar;
    }

    @Override // k1.z0, p0.b
    public final void d(View view, q0.e eVar) {
        super.d(view, eVar);
        q qVar = this.f.f3564j.f3556g;
        int i4 = 0;
        for (int i5 = 0; i5 < qVar.f3564j.f3554d.size(); i5++) {
            int iC = qVar.f3564j.c(i5);
            if (iC == 0 || iC == 1) {
                i4++;
            }
        }
        eVar.f3378a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i4, 1, false));
    }
}
