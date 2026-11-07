package androidx.activity;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f189b;

    public /* synthetic */ d0(int i4, Object obj) {
        this.f188a = i4;
        this.f189b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f188a) {
            case 0:
                ((q3.a) this.f189b).a();
                break;
            case 1:
                ((e.d0) this.f189b).F();
                break;
            case 2:
                ((Runnable) this.f189b).run();
                break;
            default:
                ((t2.b) this.f189b).a();
                break;
        }
    }
}
