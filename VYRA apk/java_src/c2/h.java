package c2;

import android.view.View;
import androidx.fragment.app.q;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import k1.l0;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1145d;

    public void a(int i4, int i5) {
        if (i4 < 0) {
            q.q("Layout positions must be non-negative");
            return;
        }
        if (i5 < 0) {
            q.q("Pixel distance must be non-negative");
            return;
        }
        int i6 = this.f1144c;
        int i7 = i6 * 2;
        int[] iArr = (int[]) this.f1145d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f1145d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i7 >= iArr.length) {
            int[] iArr3 = new int[i6 * 4];
            this.f1145d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f1145d;
        iArr4[i7] = i4;
        iArr4[i7 + 1] = i5;
        this.f1144c++;
    }

    public void b() {
        View view = (View) this.f1145d;
        int top = this.f1144c - (view.getTop() - this.f1142a);
        WeakHashMap weakHashMap = p0.f3233a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f1143b));
    }

    public void c(RecyclerView recyclerView, boolean z4) {
        this.f1144c = 0;
        int[] iArr = (int[]) this.f1145d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        l0 l0Var = recyclerView.f932r;
        if (recyclerView.f930q == null || l0Var == null || !l0Var.f2844i) {
            return;
        }
        if (z4) {
            if (!recyclerView.f916i.j()) {
                l0Var.i(recyclerView.f930q.a(), this);
            }
        } else if (!recyclerView.K()) {
            l0Var.h(this.f1142a, this.f1143b, recyclerView.f920k0, this);
        }
        int i4 = this.f1144c;
        if (i4 > l0Var.f2845j) {
            l0Var.f2845j = i4;
            l0Var.f2846k = z4;
            recyclerView.f913g.o();
        }
    }
}
