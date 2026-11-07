package k1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2924e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2931m;
    public int n;

    public final void a(int i4) {
        if ((this.f2923d & i4) != 0) {
            return;
        }
        androidx.fragment.app.q.r("Layout state should be one of ", Integer.toBinaryString(i4), " but it is ", Integer.toBinaryString(this.f2923d));
    }

    public final int b() {
        return this.f2925g ? this.f2921b - this.f2922c : this.f2924e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2920a + ", mData=null, mItemCount=" + this.f2924e + ", mIsMeasuring=" + this.f2927i + ", mPreviousLayoutItemCount=" + this.f2921b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2922c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.f2925g + ", mRunSimpleAnimations=" + this.f2928j + ", mRunPredictiveAnimations=" + this.f2929k + '}';
    }
}
