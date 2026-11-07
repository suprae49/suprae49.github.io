package z3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4921a = 0;

    static {
        String property;
        int i4 = b4.p.f1110a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (!(property != null ? Boolean.parseBoolean(property) : false)) {
            m mVar = m.n;
            return;
        }
        d4.e eVar = q.f4923a;
        a4.c cVar = b4.l.f1107a;
        a4.c cVar2 = cVar.f171j;
        if (cVar == null) {
            m mVar2 = m.n;
        }
    }
}
