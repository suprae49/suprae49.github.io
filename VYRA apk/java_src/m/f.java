package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {
    public c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f3048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakHashMap f3049h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3050i = 0;

    public c a(Object obj) {
        c cVar = this.f;
        while (cVar != null && !cVar.f.equals(obj)) {
            cVar = cVar.f3044h;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c cVarA = a(obj);
        if (cVarA == null) {
            return null;
        }
        this.f3050i--;
        WeakHashMap weakHashMap = this.f3049h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarA);
            }
        }
        c cVar = cVarA.f3045i;
        c cVar2 = cVarA.f3044h;
        if (cVar != null) {
            cVar.f3044h = cVar2;
        } else {
            this.f = cVar2;
        }
        c cVar3 = cVarA.f3044h;
        if (cVar3 != null) {
            cVar3.f3045i = cVar;
        } else {
            this.f3048g = cVar;
        }
        cVarA.f3044h = null;
        cVarA.f3045i = null;
        return cVarA.f3043g;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f3050i != fVar.f3050i) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f, this.f3048g, 0);
        this.f3049h.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
