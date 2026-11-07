package i;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import p0.r0;
import p0.s0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f2230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f2231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2232e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2229b = -1;
    public final i f = new i(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2228a = new ArrayList();

    public final void a() {
        if (this.f2232e) {
            ArrayList arrayList = this.f2228a;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((r0) obj).b();
            }
            this.f2232e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2232e) {
            return;
        }
        ArrayList arrayList = this.f2228a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            r0 r0Var = (r0) obj;
            long j4 = this.f2229b;
            if (j4 >= 0) {
                r0Var.c(j4);
            }
            Interpolator interpolator = this.f2230c;
            if (interpolator != null && (view = (View) r0Var.f3240a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f2231d != null) {
                r0Var.d(this.f);
            }
            View view2 = (View) r0Var.f3240a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2232e = true;
    }
}
