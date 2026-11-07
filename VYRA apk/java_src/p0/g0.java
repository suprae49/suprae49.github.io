package p0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f3194a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f3196c;

    public g0(View view, q qVar) {
        this.f3195b = view;
        this.f3196c = qVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        y1 y1VarH = y1.h(view, windowInsets);
        int i4 = Build.VERSION.SDK_INT;
        q qVar = this.f3196c;
        if (i4 < 30) {
            h0.a(windowInsets, this.f3195b);
            if (y1VarH.equals(this.f3194a)) {
                return qVar.d(view, y1VarH).g();
            }
        }
        this.f3194a = y1VarH;
        y1 y1VarD = qVar.d(view, y1VarH);
        if (i4 >= 30) {
            return y1VarD.g();
        }
        WeakHashMap weakHashMap = p0.f3233a;
        view.requestApplyInsets();
        return y1VarD.g();
    }
}
