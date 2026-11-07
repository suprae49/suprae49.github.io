package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o1 f731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f732h;

    public /* synthetic */ n1(l lVar, o1 o1Var, int i4) {
        this.f = i4;
        this.f732h = lVar;
        this.f731g = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ArrayList arrayList = this.f732h.f716b;
                o1 o1Var = this.f731g;
                if (arrayList.contains(o1Var)) {
                    u.a(o1Var.f738c.mView, o1Var.f736a);
                }
                break;
            default:
                l lVar = this.f732h;
                ArrayList arrayList2 = lVar.f716b;
                o1 o1Var2 = this.f731g;
                arrayList2.remove(o1Var2);
                lVar.f717c.remove(o1Var2);
                break;
        }
    }
}
