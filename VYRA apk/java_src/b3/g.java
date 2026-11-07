package b3;

import android.view.View;
import androidx.activity.k;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d3.d0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f1075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.b f1076e;

    public g(SideSheetBehavior sideSheetBehavior) {
        this.f1072a = 0;
        this.f1076e = sideSheetBehavior;
        this.f1075d = new k(5, this);
    }

    public final void a(int i4) {
        switch (this.f1072a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1076e;
                WeakReference weakReference = sideSheetBehavior.f1548u;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1073b = i4;
                    if (!this.f1074c) {
                        ((View) sideSheetBehavior.f1548u.get()).postOnAnimation((k) this.f1075d);
                        this.f1074c = true;
                    }
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1076e;
                WeakReference weakReference2 = bottomSheetBehavior.d0;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1073b = i4;
                    if (!this.f1074c) {
                        ((View) bottomSheetBehavior.d0.get()).postOnAnimation((d0) this.f1075d);
                        this.f1074c = true;
                    }
                    break;
                }
                break;
        }
    }

    public g(BottomSheetBehavior bottomSheetBehavior) {
        this.f1072a = 1;
        this.f1076e = bottomSheetBehavior;
        this.f1075d = new d0(3, this);
    }
}
