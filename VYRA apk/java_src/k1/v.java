package k1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends androidx.emoji2.text.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(l0 l0Var, int i4) {
        super(l0Var);
        this.f2932d = i4;
    }

    @Override // androidx.emoji2.text.g
    public final int b(View view) {
        int right;
        int i4;
        switch (this.f2932d) {
            case 0:
                m0 m0Var = (m0) view.getLayoutParams();
                ((l0) this.f549b).getClass();
                right = view.getRight() + ((m0) view.getLayoutParams()).f2852b.right;
                i4 = ((ViewGroup.MarginLayoutParams) m0Var).rightMargin;
                break;
            default:
                m0 m0Var2 = (m0) view.getLayoutParams();
                ((l0) this.f549b).getClass();
                right = view.getBottom() + ((m0) view.getLayoutParams()).f2852b.bottom;
                i4 = ((ViewGroup.MarginLayoutParams) m0Var2).bottomMargin;
                break;
        }
        return right + i4;
    }

    @Override // androidx.emoji2.text.g
    public final int c(View view) {
        int iA;
        int i4;
        switch (this.f2932d) {
            case 0:
                m0 m0Var = (m0) view.getLayoutParams();
                ((l0) this.f549b).getClass();
                iA = l0.A(view) + ((ViewGroup.MarginLayoutParams) m0Var).leftMargin;
                i4 = ((ViewGroup.MarginLayoutParams) m0Var).rightMargin;
                break;
            default:
                m0 m0Var2 = (m0) view.getLayoutParams();
                ((l0) this.f549b).getClass();
                iA = l0.z(view) + ((ViewGroup.MarginLayoutParams) m0Var2).topMargin;
                i4 = ((ViewGroup.MarginLayoutParams) m0Var2).bottomMargin;
                break;
        }
        return iA + i4;
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        int iZ;
        int i4;
        switch (this.f2932d) {
            case 0:
                m0 m0Var = (m0) view.getLayoutParams();
                ((l0) this.f549b).getClass();
                iZ = l0.z(view) + ((ViewGroup.MarginLayoutParams) m0Var).topMargin;
                i4 = ((ViewGroup.MarginLayoutParams) m0Var).bottomMargin;
                break;
            default:
                m0 m0Var2 = (m0) view.getLayoutParams();
                ((l0) this.f549b).getClass();
                iZ = l0.A(view) + ((ViewGroup.MarginLayoutParams) m0Var2).leftMargin;
                i4 = ((ViewGroup.MarginLayoutParams) m0Var2).rightMargin;
                break;
        }
        return iZ + i4;
    }

    @Override // androidx.emoji2.text.g
    public final int e(View view) {
        int left;
        int i4;
        switch (this.f2932d) {
            case 0:
                m0 m0Var = (m0) view.getLayoutParams();
                ((l0) this.f549b).getClass();
                left = view.getLeft() - ((m0) view.getLayoutParams()).f2852b.left;
                i4 = ((ViewGroup.MarginLayoutParams) m0Var).leftMargin;
                break;
            default:
                m0 m0Var2 = (m0) view.getLayoutParams();
                ((l0) this.f549b).getClass();
                left = view.getTop() - ((m0) view.getLayoutParams()).f2852b.top;
                i4 = ((ViewGroup.MarginLayoutParams) m0Var2).topMargin;
                break;
        }
        return left - i4;
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        switch (this.f2932d) {
            case 0:
                return ((l0) this.f549b).n;
            default:
                return ((l0) this.f549b).f2849o;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        int i4;
        int iF;
        switch (this.f2932d) {
            case 0:
                l0 l0Var = (l0) this.f549b;
                i4 = l0Var.n;
                iF = l0Var.F();
                break;
            default:
                l0 l0Var2 = (l0) this.f549b;
                i4 = l0Var2.f2849o;
                iF = l0Var2.D();
                break;
        }
        return i4 - iF;
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.f2932d) {
            case 0:
                return ((l0) this.f549b).F();
            default:
                return ((l0) this.f549b).D();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.f2932d) {
            case 0:
                return ((l0) this.f549b).f2847l;
            default:
                return ((l0) this.f549b).f2848m;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.f2932d) {
            case 0:
                return ((l0) this.f549b).f2848m;
            default:
                return ((l0) this.f549b).f2847l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.f2932d) {
            case 0:
                return ((l0) this.f549b).E();
            default:
                return ((l0) this.f549b).G();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l() {
        int iE;
        int iF;
        switch (this.f2932d) {
            case 0:
                l0 l0Var = (l0) this.f549b;
                iE = l0Var.n - l0Var.E();
                iF = l0Var.F();
                break;
            default:
                l0 l0Var2 = (l0) this.f549b;
                iE = l0Var2.f2849o - l0Var2.G();
                iF = l0Var2.D();
                break;
        }
        return iE - iF;
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.f2932d) {
            case 0:
                l0 l0Var = (l0) this.f549b;
                Rect rect = (Rect) this.f550c;
                l0Var.K(view, rect);
                return rect.right;
            default:
                l0 l0Var2 = (l0) this.f549b;
                Rect rect2 = (Rect) this.f550c;
                l0Var2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int n(View view) {
        switch (this.f2932d) {
            case 0:
                l0 l0Var = (l0) this.f549b;
                Rect rect = (Rect) this.f550c;
                l0Var.K(view, rect);
                return rect.left;
            default:
                l0 l0Var2 = (l0) this.f549b;
                Rect rect2 = (Rect) this.f550c;
                l0Var2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void o(int i4) {
        switch (this.f2932d) {
            case 0:
                ((l0) this.f549b).O(i4);
                break;
            default:
                ((l0) this.f549b).P(i4);
                break;
        }
    }
}
