package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements Map {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f3146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f3147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f3148k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar) {
        super(0);
        int i4 = kVar.f3157h;
        b(this.f3157h + i4);
        if (this.f3157h != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                put(kVar.f(i5), kVar.i(i5));
            }
        } else if (i4 > 0) {
            h3.d.o0(0, 0, i4, kVar.f, this.f);
            h3.d.p0(kVar.f3156g, this.f3156g, 0, 0, i4 << 1);
            this.f3157h = i4;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f3146i;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f3146i = aVar2;
        return aVar2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i4 = this.f3157h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i4 != this.f3157h;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f3147j;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f3147j = cVar2;
        return cVar2;
    }

    public final boolean l(Collection collection) {
        int i4 = this.f3157h;
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (!collection.contains(f(i5))) {
                g(i5);
            }
        }
        return i4 != this.f3157h;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3157h);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f3148k;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f3148k = eVar2;
        return eVar2;
    }
}
