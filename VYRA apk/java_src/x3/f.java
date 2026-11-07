package x3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u1.q;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator, s3.a {
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4758g = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h3.e f4759h;

    public f(h3.e eVar) {
        this.f4759h = eVar;
    }

    public final void a() {
        Object objG;
        if (this.f4758g == -2) {
            t3.a aVar = t3.e.f;
            objG = Integer.valueOf(t3.e.f.a().nextInt(2147418112) + 65536);
        } else {
            q qVar = (q) this.f4759h.f2178b;
            Object obj = this.f;
            obj.getClass();
            objG = qVar.g(obj);
        }
        this.f = objG;
        this.f4758g = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4758g < 0) {
            a();
        }
        return this.f4758g == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4758g < 0) {
            a();
        }
        if (this.f4758g == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f;
        obj.getClass();
        this.f4758g = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
