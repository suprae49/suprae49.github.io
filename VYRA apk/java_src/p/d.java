package p;

import androidx.fragment.app.q;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3143g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f3145i;

    public d(f fVar) {
        this.f3145i = fVar;
        this.f = fVar.f3157h - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3144h) {
            q.j("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i4 = this.f3143g;
        f fVar = this.f3145i;
        return r3.g.a(key, fVar.f(i4)) && r3.g.a(entry.getValue(), fVar.i(this.f3143g));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f3144h) {
            return this.f3145i.f(this.f3143g);
        }
        q.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f3144h) {
            return this.f3145i.i(this.f3143g);
        }
        q.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3143g < this.f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3144h) {
            q.j("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i4 = this.f3143g;
        f fVar = this.f3145i;
        Object objF = fVar.f(i4);
        Object objI = fVar.i(this.f3143g);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3143g++;
        this.f3144h = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3144h) {
            throw new IllegalStateException();
        }
        this.f3145i.g(this.f3143g);
        this.f3143g--;
        this.f--;
        this.f3144h = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f3144h) {
            return this.f3145i.h(this.f3143g, obj);
        }
        q.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
