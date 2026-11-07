package x3;

import androidx.fragment.app.q;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f4746a;

    public a(g gVar) {
        this.f4746a = new AtomicReference(gVar);
    }

    @Override // x3.g
    public final Iterator iterator() {
        g gVar = (g) this.f4746a.getAndSet(null);
        if (gVar != null) {
            return gVar.iterator();
        }
        q.j("This sequence can be consumed only once.");
        return null;
    }
}
