package u1;

import co.median.android.GoNativeApplication;
import java.lang.ref.WeakReference;
import java.util.Observable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends Observable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4090d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GoNativeApplication f4091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f4092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4093c;

    public final void c() {
        GoNativeApplication goNativeApplication = this.f4091a;
        h hVar = this.f4092b;
        if (hVar != null) {
            hVar.cancel(true);
        }
        if (x1.a.u(goNativeApplication).M == null) {
            return;
        }
        h hVar2 = new h(1);
        hVar2.f3939b = new WeakReference(this);
        this.f4092b = hVar2;
        hVar2.execute(x1.a.u(goNativeApplication).M);
    }
}
