package k1;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f2893e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2894g;

    public final void a(RecyclerView recyclerView) {
        int i4 = this.f2892d;
        if (i4 >= 0) {
            this.f2892d = -1;
            recyclerView.M(i4);
            this.f = false;
            return;
        }
        if (!this.f) {
            this.f2894g = 0;
            return;
        }
        Interpolator interpolator = this.f2893e;
        if (interpolator != null && this.f2891c < 1) {
            androidx.fragment.app.q.j("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i5 = this.f2891c;
        if (i5 < 1) {
            androidx.fragment.app.q.j("Scroll duration must be a positive number");
            return;
        }
        recyclerView.f915h0.b(this.f2889a, this.f2890b, i5, interpolator);
        int i6 = this.f2894g + 1;
        this.f2894g = i6;
        if (i6 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f = false;
    }
}
