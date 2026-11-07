package e2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2055h;

    public /* synthetic */ c(int i4) {
        this.f2055h = i4;
    }

    @Override // e4.a
    public final int J(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i4;
        switch (this.f2055h) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i4 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i4 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i4 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i4;
    }

    @Override // e4.a
    public final int K() {
        switch (this.f2055h) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // e4.a
    public final ViewPropertyAnimator L(View view, int i4) {
        switch (this.f2055h) {
            case 0:
                return view.animate().translationY(i4);
            case 1:
                return view.animate().translationX(-i4);
            default:
                return view.animate().translationX(i4);
        }
    }
}
