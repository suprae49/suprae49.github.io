package g3;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Serializable {
    public q3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Object f2151g = f.f2155a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f2152h = this;

    public d(q3.a aVar) {
        this.f = aVar;
    }

    public final Object a() {
        Object objA;
        Object obj = this.f2151g;
        f fVar = f.f2155a;
        if (obj != fVar) {
            return obj;
        }
        synchronized (this.f2152h) {
            objA = this.f2151g;
            if (objA == fVar) {
                q3.a aVar = this.f;
                aVar.getClass();
                objA = aVar.a();
                this.f2151g = objA;
                this.f = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f2151g != f.f2155a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
