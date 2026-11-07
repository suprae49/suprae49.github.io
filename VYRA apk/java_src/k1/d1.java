package k1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2751a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2752b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2753c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2754d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2755e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public d1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i4) {
        this.f = staggeredGridLayoutManager;
        this.f2755e = i4;
    }

    public final void a() {
        ArrayList arrayList = this.f2751a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        c1 c1Var = (c1) view.getLayoutParams();
        this.f2753c = this.f.f952r.b(view);
        c1Var.getClass();
    }

    public final void b() {
        this.f2751a.clear();
        this.f2752b = Integer.MIN_VALUE;
        this.f2753c = Integer.MIN_VALUE;
        this.f2754d = 0;
    }

    public final int c() {
        boolean z4 = this.f.f957w;
        ArrayList arrayList = this.f2751a;
        return z4 ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
    }

    public final int d() {
        boolean z4 = this.f.f957w;
        ArrayList arrayList = this.f2751a;
        return z4 ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
    }

    public final int e(int i4, int i5) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int iK = staggeredGridLayoutManager.f952r.k();
        int iG = staggeredGridLayoutManager.f952r.g();
        int i6 = i5 > i4 ? 1 : -1;
        while (i4 != i5) {
            View view = (View) this.f2751a.get(i4);
            int iE = staggeredGridLayoutManager.f952r.e(view);
            int iB = staggeredGridLayoutManager.f952r.b(view);
            boolean z4 = iE <= iG;
            boolean z5 = iB >= iK;
            if (z4 && z5 && (iE < iK || iB > iG)) {
                return l0.H(view);
            }
            i4 += i6;
        }
        return -1;
    }

    public final int f(int i4) {
        int i5 = this.f2753c;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (this.f2751a.size() == 0) {
            return i4;
        }
        a();
        return this.f2753c;
    }

    public final View g(int i4, int i5) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        View view = null;
        ArrayList arrayList = this.f2751a;
        if (i5 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f957w && l0.H(view2) >= i4) || ((!staggeredGridLayoutManager.f957w && l0.H(view2) <= i4) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            View view3 = (View) arrayList.get(i6);
            if ((staggeredGridLayoutManager.f957w && l0.H(view3) <= i4) || ((!staggeredGridLayoutManager.f957w && l0.H(view3) >= i4) || !view3.hasFocusable())) {
                break;
            }
            i6++;
            view = view3;
        }
        return view;
    }

    public final int h(int i4) {
        int i5 = this.f2752b;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        ArrayList arrayList = this.f2751a;
        if (arrayList.size() == 0) {
            return i4;
        }
        View view = (View) arrayList.get(0);
        c1 c1Var = (c1) view.getLayoutParams();
        this.f2752b = this.f.f952r.e(view);
        c1Var.getClass();
        return this.f2752b;
    }
}
