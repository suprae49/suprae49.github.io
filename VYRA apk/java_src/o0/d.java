package o0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3135c;

    public d(int i4) {
        super(i4);
        this.f3135c = new Object();
    }

    @Override // o0.c
    public final Object a() {
        Object objA;
        synchronized (this.f3135c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // o0.c
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.f3135c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
