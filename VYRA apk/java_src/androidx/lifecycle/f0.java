package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements t {
    public static final f0 n = new f0();
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f820g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f823j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f821h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f822i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v f824k = new v(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.activity.k f825l = new androidx.activity.k(3, this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a3.h0 f826m = new a3.h0(2, this);

    public final void b() {
        int i4 = this.f820g + 1;
        this.f820g = i4;
        if (i4 == 1) {
            if (this.f821h) {
                this.f824k.e(m.ON_RESUME);
                this.f821h = false;
            } else {
                Handler handler = this.f823j;
                handler.getClass();
                handler.removeCallbacks(this.f825l);
            }
        }
    }

    @Override // androidx.lifecycle.t
    public final o getLifecycle() {
        return this.f824k;
    }
}
