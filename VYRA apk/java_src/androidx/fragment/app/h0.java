package androidx.fragment.app;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends g0 {
    public final e.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e.j f696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v0 f698i;

    public h0(e.j jVar) {
        Handler handler = new Handler();
        this.f698i = new v0();
        this.f = jVar;
        this.f696g = jVar;
        this.f697h = handler;
    }
}
