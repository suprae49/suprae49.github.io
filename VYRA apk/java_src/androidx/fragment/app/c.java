package androidx.fragment.app;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f649h;

    public c(k kVar, o1 o1Var) {
        this.f = 2;
        this.f648g = kVar;
        this.f649h = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f648g;
                o1 o1Var = (o1) this.f649h;
                if (arrayList.contains(o1Var)) {
                    arrayList.remove(o1Var);
                    u.a(o1Var.f738c.mView, o1Var.f736a);
                }
                break;
            case 1:
                k1.g((View) this.f648g, (Rect) this.f649h);
                break;
            default:
                ((k) this.f648g).a();
                if (u0.G(2)) {
                    Log.v("FragmentManager", "Transition for operation " + ((o1) this.f649h) + "has completed");
                }
                break;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i4) {
        this.f = i4;
        this.f648g = obj2;
        this.f649h = obj3;
    }
}
