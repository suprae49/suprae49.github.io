package t2;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f3728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3729b;

    public d(e eVar, b bVar) {
        this.f3729b = eVar;
        this.f3728a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f3729b.f3727a != null) {
            this.f3728a.d();
        }
    }

    public final void onBackInvoked() {
        this.f3728a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f3729b.f3727a != null) {
            this.f3728a.c(new androidx.activity.b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f3729b.f3727a != null) {
            this.f3728a.b(new androidx.activity.b(backEvent));
        }
    }
}
