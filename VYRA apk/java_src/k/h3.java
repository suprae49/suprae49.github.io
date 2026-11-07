package k;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2543b;

    public h3(int i4) {
        super(i4, -2);
        this.f2543b = 0;
        this.f2542a = 8388627;
    }

    public h3(h3 h3Var) {
        super((ViewGroup.MarginLayoutParams) h3Var);
        this.f2542a = 0;
        this.f2542a = h3Var.f2542a;
    }

    public h3(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2542a = 0;
    }
}
