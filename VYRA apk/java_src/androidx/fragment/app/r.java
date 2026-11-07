package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f743a;

    public r(AtomicReference atomicReference) {
        this.f743a = atomicReference;
    }

    @Override // b.c
    public final void a(Object obj) {
        b.c cVar = (b.c) this.f743a.get();
        if (cVar != null) {
            cVar.a(obj);
        } else {
            q.j("Operation cannot be started before fragment is in created state");
        }
    }
}
