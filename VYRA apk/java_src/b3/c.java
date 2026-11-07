package b3;

import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import u1.w1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1063h;

    public /* synthetic */ c(int i4, int i5, Object obj) {
        this.f = i5;
        this.f1063h = obj;
        this.f1062g = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f;
        int i5 = this.f1062g;
        Object obj = this.f1063h;
        switch (i4) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.f1548u;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.z(view, i5, false);
                }
                break;
            case 1:
                ((e0.b) obj).h(i5);
                break;
            case 2:
                int[] iArr = MaterialButton.S;
                ((MaterialButton) obj).setIconSize(i5);
                break;
            default:
                w1 w1Var = (w1) obj;
                BottomNavigationView bottomNavigationView = w1Var.f4120b;
                if (i5 >= 0 && i5 < bottomNavigationView.getMenu().size()) {
                    w1Var.f4133q = false;
                    bottomNavigationView.setSelectedItemId(i5);
                    break;
                }
                break;
        }
    }
}
