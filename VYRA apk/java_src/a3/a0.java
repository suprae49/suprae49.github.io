package a3;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f38c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f36a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f39d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f40e = new Path();

    public abstract void a(NavigationView navigationView);

    public abstract boolean b();

    public final void c() {
        o oVar;
        RectF rectF = this.f39d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (oVar = this.f38c) == null) {
            return;
        }
        p.f134a.a(oVar, null, 1.0f, rectF, null, this.f40e);
    }
}
