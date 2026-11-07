package k1;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f2806b;

    public /* synthetic */ j0(l0 l0Var, int i4) {
        this.f2805a = i4;
        this.f2806b = l0Var;
    }

    public final int a(View view) {
        int right;
        int i4;
        switch (this.f2805a) {
            case 0:
                m0 m0Var = (m0) view.getLayoutParams();
                right = view.getRight() + ((m0) view.getLayoutParams()).f2852b.right;
                i4 = ((ViewGroup.MarginLayoutParams) m0Var).rightMargin;
                break;
            default:
                m0 m0Var2 = (m0) view.getLayoutParams();
                right = view.getBottom() + ((m0) view.getLayoutParams()).f2852b.bottom;
                i4 = ((ViewGroup.MarginLayoutParams) m0Var2).bottomMargin;
                break;
        }
        return right + i4;
    }

    public final int b(View view) {
        int left;
        int i4;
        switch (this.f2805a) {
            case 0:
                m0 m0Var = (m0) view.getLayoutParams();
                left = view.getLeft() - ((m0) view.getLayoutParams()).f2852b.left;
                i4 = ((ViewGroup.MarginLayoutParams) m0Var).leftMargin;
                break;
            default:
                m0 m0Var2 = (m0) view.getLayoutParams();
                left = view.getTop() - ((m0) view.getLayoutParams()).f2852b.top;
                i4 = ((ViewGroup.MarginLayoutParams) m0Var2).topMargin;
                break;
        }
        return left - i4;
    }

    public final int c() {
        int i4;
        int iF;
        switch (this.f2805a) {
            case 0:
                l0 l0Var = this.f2806b;
                i4 = l0Var.n;
                iF = l0Var.F();
                break;
            default:
                l0 l0Var2 = this.f2806b;
                i4 = l0Var2.f2849o;
                iF = l0Var2.D();
                break;
        }
        return i4 - iF;
    }

    public final int d() {
        switch (this.f2805a) {
            case 0:
                return this.f2806b.E();
            default:
                return this.f2806b.G();
        }
    }
}
