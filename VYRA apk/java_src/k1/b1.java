package k1;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2741e;
    public int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2742g;

    public b1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2742g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2737a = -1;
        this.f2738b = Integer.MIN_VALUE;
        this.f2739c = false;
        this.f2740d = false;
        this.f2741e = false;
        int[] iArr = this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
