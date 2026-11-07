package p0;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f3162a;

    public a1(int i4, Interpolator interpolator, long j4) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3162a = new y0(com.google.android.gms.common.api.a.i(i4, interpolator, j4));
        } else {
            this.f3162a = new w0(i4, interpolator, j4);
        }
    }
}
