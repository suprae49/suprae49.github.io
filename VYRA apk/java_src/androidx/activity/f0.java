package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q3.l f194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q3.l f195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q3.a f196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q3.a f197d;

    public f0(q3.l lVar, q3.l lVar2, q3.a aVar, q3.a aVar2) {
        this.f194a = lVar;
        this.f195b = lVar2;
        this.f196c = aVar;
        this.f197d = aVar2;
    }

    public final void onBackCancelled() {
        this.f197d.a();
    }

    public final void onBackInvoked() {
        this.f196c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.f195b.g(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.f194a.g(new b(backEvent));
    }
}
