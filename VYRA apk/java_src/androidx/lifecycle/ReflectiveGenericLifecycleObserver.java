package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements r {
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f809g;

    public ReflectiveGenericLifecycleObserver(s sVar) {
        this.f = sVar;
        d dVar = d.f816c;
        Class<?> cls = sVar.getClass();
        b bVar = (b) dVar.f817a.get(cls);
        this.f809g = bVar == null ? dVar.a(cls, null) : bVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, m mVar) {
        HashMap map = this.f809g.f812a;
        List list = (List) map.get(mVar);
        s sVar = this.f;
        b.a(list, tVar, mVar, sVar);
        b.a((List) map.get(m.ON_ANY), tVar, mVar, sVar);
    }
}
