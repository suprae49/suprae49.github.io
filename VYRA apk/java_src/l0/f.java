package l0;

import androidx.emoji2.text.p;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements o0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2993b;

    public /* synthetic */ f(int i4, Object obj) {
        this.f2992a = i4;
        this.f2993b = obj;
    }

    @Override // o0.a
    public final void accept(Object obj) {
        switch (this.f2992a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((p) this.f2993b).t(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f2998c) {
                    try {
                        p.k kVar = h.f2999d;
                        ArrayList arrayList = (ArrayList) kVar.get((String) this.f2993b);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f2993b);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            ((o0.a) arrayList.get(i4)).accept(gVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
