package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f182d;

    public b(BackEvent backEvent) {
        backEvent.getClass();
        a aVar = a.f175a;
        float fD = aVar.d(backEvent);
        float fE = aVar.e(backEvent);
        float fB = aVar.b(backEvent);
        int iC = aVar.c(backEvent);
        this.f179a = fD;
        this.f180b = fE;
        this.f181c = fB;
        this.f182d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f179a + ", touchY=" + this.f180b + ", progress=" + this.f181c + ", swipeEdge=" + this.f182d + '}';
    }
}
