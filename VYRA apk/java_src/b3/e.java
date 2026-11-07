package b3;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.u;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import t2.i;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.b f1069b;

    public /* synthetic */ e(z.b bVar, int i4) {
        this.f1068a = i4;
        this.f1069b = bVar;
    }

    @Override // t2.i
    public final void C(int i4) {
        switch (this.f1068a) {
            case 0:
                if (i4 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1069b;
                    if (sideSheetBehavior.f1540l) {
                        sideSheetBehavior.x(1);
                    }
                }
                break;
            default:
                if (i4 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1069b;
                    if (bottomSheetBehavior.Q) {
                        bottomSheetBehavior.K(1);
                    }
                }
                break;
        }
    }

    @Override // t2.i
    public final void D(View view, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f1068a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1069b;
                WeakReference weakReference = sideSheetBehavior.f1549v;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f.m0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.A;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f.e(i4);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw u.j(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f1069b).A(i5);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:71:0x0135  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // t2.i
    public final void E(View view, float f, float f4) {
        int i4;
        switch (this.f1068a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1069b;
                if (!sideSheetBehavior.f.Q(f)) {
                    if (!sideSheetBehavior.f.g0(view, f)) {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f4)) {
                            int left = view.getLeft();
                            i4 = Math.abs(left - sideSheetBehavior.f.A()) < Math.abs(left - sideSheetBehavior.f.B()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.f.T(f, f4) || sideSheetBehavior.f.S(view)) {
                    }
                }
                sideSheetBehavior.z(view, i4, true);
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1069b;
                int i5 = 6;
                if (f4 < 0.0f) {
                    if (bottomSheetBehavior.f1307g) {
                        i5 = 3;
                    } else {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        if (top <= bottomSheetBehavior.K) {
                            i5 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.O && bottomSheetBehavior.L(view, f4)) {
                    if (Math.abs(f) >= Math.abs(f4) || f4 <= bottomSheetBehavior.f1310i) {
                        if (view.getTop() > (bottomSheetBehavior.D() + bottomSheetBehavior.f1304c0) / 2) {
                            i5 = 5;
                        } else if (bottomSheetBehavior.f1307g || Math.abs(view.getTop() - bottomSheetBehavior.D()) < Math.abs(view.getTop() - bottomSheetBehavior.K)) {
                            i5 = 3;
                        }
                    } else {
                        i5 = 5;
                    }
                } else if (f4 == 0.0f || Math.abs(f) > Math.abs(f4)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f1307g) {
                        int i6 = bottomSheetBehavior.K;
                        if (top2 < i6) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.M)) {
                                i5 = 3;
                            }
                        } else if (Math.abs(top2 - i6) >= Math.abs(top2 - bottomSheetBehavior.M)) {
                            i5 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.J) < Math.abs(top2 - bottomSheetBehavior.M)) {
                        i5 = 3;
                    } else {
                        i5 = 4;
                    }
                } else if (bottomSheetBehavior.f1307g) {
                    i5 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.K) >= Math.abs(top3 - bottomSheetBehavior.M)) {
                        i5 = 4;
                    }
                }
                bottomSheetBehavior.M(view, i5, true);
                break;
        }
    }

    @Override // t2.i
    public final boolean Q(View view, int i4) {
        WeakReference weakReference;
        switch (this.f1068a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1069b;
                return (sideSheetBehavior.f1541m == 1 || (weakReference = sideSheetBehavior.f1548u) == null || weakReference.get() != view) ? false : true;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1069b;
                int i5 = bottomSheetBehavior.U;
                if (i5 == 1 || bottomSheetBehavior.f1316l0) {
                    return false;
                }
                if (i5 == 3 && bottomSheetBehavior.f1311i0 == i4) {
                    View view2 = null;
                    if (bottomSheetBehavior.f1312j) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1314k0;
                        if (weakReference2 != null) {
                            view2 = (View) weakReference2.get();
                        }
                    } else {
                        ArrayList arrayList = bottomSheetBehavior.f1305e0;
                        if (!arrayList.isEmpty()) {
                            view2 = (View) ((WeakReference) arrayList.get(0)).get();
                        }
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                SystemClock.uptimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.d0;
                return weakReference3 != null && weakReference3.get() == view;
        }
    }

    @Override // t2.i
    public final int c(View view, int i4) {
        switch (this.f1068a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1069b;
                return h0.j(i4, sideSheetBehavior.f.E(), sideSheetBehavior.f.D());
            default:
                return view.getLeft();
        }
    }

    @Override // t2.i
    public final int d(View view, int i4) {
        switch (this.f1068a) {
            case 0:
                return view.getTop();
            default:
                return h0.j(i4, ((BottomSheetBehavior) this.f1069b).D(), r());
        }
    }

    @Override // t2.i
    public int q(View view) {
        switch (this.f1068a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1069b;
                return sideSheetBehavior.f1544q + sideSheetBehavior.f1547t;
            default:
                return super.q(view);
        }
    }

    @Override // t2.i
    public int r() {
        switch (this.f1068a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1069b;
                return bottomSheetBehavior.O ? bottomSheetBehavior.f1304c0 : bottomSheetBehavior.M;
            default:
                return super.r();
        }
    }
}
