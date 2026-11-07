package k;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 implements View.OnClickListener {
    public final j.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k3 f2558g;

    public j3(k3 k3Var) {
        this.f2558g = k3Var;
        Context context = k3Var.f2562a.getContext();
        CharSequence charSequence = k3Var.f2568h;
        j.a aVar = new j.a();
        aVar.f2312e = 4096;
        aVar.f2313g = 4096;
        aVar.f2318l = null;
        aVar.f2319m = null;
        aVar.n = false;
        aVar.f2320o = false;
        aVar.f2321p = 16;
        aVar.f2315i = context;
        aVar.f2308a = charSequence;
        this.f = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k3 k3Var = this.f2558g;
        Window.Callback callback = k3Var.f2571k;
        if (callback == null || !k3Var.f2572l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f);
    }
}
