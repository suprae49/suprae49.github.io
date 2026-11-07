package k;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends e0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u0 f2621k;

    public q0(u0 u0Var, int i4, int i5, WeakReference weakReference) {
        this.f2621k = u0Var;
        this.f2618h = i4;
        this.f2619i = i5;
        this.f2620j = weakReference;
    }

    @Override // e0.b
    public final void i(Typeface typeface) {
        int i4;
        if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f2618h) != -1) {
            typeface = t0.a(typeface, i4, (this.f2619i & 2) != 0);
        }
        u0 u0Var = this.f2621k;
        if (u0Var.f2657m) {
            u0Var.f2656l = typeface;
            TextView textView = (TextView) this.f2620j.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i5 = u0Var.f2654j;
                if (zIsAttachedToWindow) {
                    textView.post(new h2.a(textView, typeface, i5));
                } else {
                    textView.setTypeface(typeface, i5);
                }
            }
        }
    }

    @Override // e0.b
    public final void h(int i4) {
    }
}
