package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f678g;

    public /* synthetic */ f(int i4, Object obj) {
        this.f = i4;
        this.f678g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                g gVar = (g) this.f678g;
                gVar.f686b.endViewTransition(gVar.f687c);
                gVar.f688d.a();
                break;
            case 1:
                d1.a(4, (ArrayList) this.f678g);
                break;
            case 2:
                p pVar = (p) this.f678g;
                pVar.mOnDismissListener.onDismiss(pVar.mDialog);
                break;
            case 3:
                ((l) this.f678g).d();
                break;
            default:
                ((u0) this.f678g).x(true);
                break;
        }
    }
}
