package b3;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SideSheetBehavior f1060i;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i4) {
        this.f1059h = i4;
        this.f1060i = sideSheetBehavior;
    }

    @Override // e4.a
    public final int A() {
        switch (this.f1059h) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1060i;
                return Math.max(0, sideSheetBehavior.f1546s + sideSheetBehavior.f1547t);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f1060i;
                return Math.max(0, (sideSheetBehavior2.f1545r - sideSheetBehavior2.f1544q) - sideSheetBehavior2.f1547t);
        }
    }

    @Override // e4.a
    public final int B() {
        switch (this.f1059h) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1060i;
                return (-sideSheetBehavior.f1544q) - sideSheetBehavior.f1547t;
            default:
                return this.f1060i.f1545r;
        }
    }

    @Override // e4.a
    public final int D() {
        switch (this.f1059h) {
            case 0:
                return this.f1060i.f1547t;
            default:
                return this.f1060i.f1545r;
        }
    }

    @Override // e4.a
    public final int E() {
        switch (this.f1059h) {
            case 0:
                return -this.f1060i.f1544q;
            default:
                return A();
        }
    }

    @Override // e4.a
    public final int F(View view) {
        switch (this.f1059h) {
            case 0:
                return view.getRight() + this.f1060i.f1547t;
            default:
                return view.getLeft() - this.f1060i.f1547t;
        }
    }

    @Override // e4.a
    public final int H(CoordinatorLayout coordinatorLayout) {
        switch (this.f1059h) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // e4.a
    public final int I() {
        switch (this.f1059h) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // e4.a
    public final boolean Q(float f) {
        switch (this.f1059h) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    @Override // e4.a
    public final boolean S(View view) {
        switch (this.f1059h) {
            case 0:
                return view.getRight() < (A() - B()) / 2;
            default:
                return view.getLeft() > (A() + this.f1060i.f1545r) / 2;
        }
    }

    @Override // e4.a
    public final boolean T(float f, float f4) {
        switch (this.f1059h) {
            case 0:
                return Math.abs(f) > Math.abs(f4) && Math.abs(f) > ((float) 500);
            default:
                return Math.abs(f) > Math.abs(f4) && Math.abs(f) > ((float) 500);
        }
    }

    @Override // e4.a
    public final int d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1059h) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // e4.a
    public final float e(int i4) {
        switch (this.f1059h) {
            case 0:
                float fB = B();
                return (i4 - fB) / (A() - fB);
            default:
                float f = this.f1060i.f1545r;
                return (f - i4) / (f - A());
        }
    }

    @Override // e4.a
    public final boolean g0(View view, float f) {
        switch (this.f1059h) {
            case 0:
                return Math.abs((f * this.f1060i.f1543p) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f * this.f1060i.f1543p) + ((float) view.getRight())) > 0.5f;
        }
    }

    @Override // e4.a
    public final void l0(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        switch (this.f1059h) {
            case 0:
                marginLayoutParams.leftMargin = i4;
                break;
            default:
                marginLayoutParams.rightMargin = i4;
                break;
        }
    }

    @Override // e4.a
    public final void m0(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i5) {
        switch (this.f1059h) {
            case 0:
                if (i4 <= this.f1060i.f1545r) {
                    marginLayoutParams.leftMargin = i5;
                }
                break;
            default:
                int i6 = this.f1060i.f1545r;
                if (i4 <= i6) {
                    marginLayoutParams.rightMargin = i6 - i4;
                }
                break;
        }
    }

    @Override // e4.a
    public final int v(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1059h) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }
}
