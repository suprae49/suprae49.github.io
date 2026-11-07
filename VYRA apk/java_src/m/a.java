package m;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f3040j = new HashMap();

    @Override // m.f
    public final c a(Object obj) {
        return (c) this.f3040j.get(obj);
    }

    @Override // m.f
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.f3040j.remove(obj);
        return objB;
    }
}
