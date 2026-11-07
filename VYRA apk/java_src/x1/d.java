package x1;

import h3.p;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public enum d {
    /* JADX INFO: Fake field, exist only in values array */
    NO_CACHE("no_cache"),
    /* JADX INFO: Fake field, exist only in values array */
    CACHE_ONLY("cache_only"),
    /* JADX INFO: Fake field, exist only in values array */
    CACHE_ELSE_NETWORK("cache_else_network"),
    DEFAULT("default");


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkedHashMap f4712g;
    public final String f;

    static {
        d[] dVarArrValues = values();
        int iO0 = p.o0(dVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO0 < 16 ? 16 : iO0);
        for (d dVar : dVarArrValues) {
            linkedHashMap.put(dVar.f, dVar);
        }
        f4712g = linkedHashMap;
    }

    d(String str) {
        this.f = str;
    }

    public static final d a(String str) {
        str.getClass();
        d dVar = (d) f4712g.get(str);
        return dVar == null ? DEFAULT : dVar;
    }
}
