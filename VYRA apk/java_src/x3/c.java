package x3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, s3.a {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Iterator f4748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f4750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f4751j;

    public c(d dVar) {
        this.f = 0;
        this.f4751j = dVar;
        this.f4748g = dVar.f4752a.iterator();
        this.f4749h = -1;
    }

    public void a() {
        Object next;
        d dVar = (d) this.f4751j;
        do {
            Iterator it = this.f4748g;
            if (!it.hasNext()) {
                this.f4749h = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) dVar.f4754c.g(next)).booleanValue() != dVar.f4753b);
        this.f4750i = next;
        this.f4749h = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.f4750i;
        if (it2 != null && it2.hasNext()) {
            this.f4749h = 1;
            return true;
        }
        do {
            Iterator it3 = this.f4748g;
            if (!it3.hasNext()) {
                this.f4749h = 2;
                this.f4750i = null;
                return false;
            }
            Object next = it3.next();
            e eVar = (e) this.f4751j;
            it = (Iterator) eVar.f4757c.g(eVar.f4756b.g(next));
        } while (!it.hasNext());
        this.f4750i = it;
        this.f4749h = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f) {
            case 0:
                if (this.f4749h == -1) {
                    a();
                }
                return this.f4749h == 1;
            default:
                int i4 = this.f4749h;
                if (i4 == 1) {
                    return true;
                }
                if (i4 == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f) {
            case 0:
                if (this.f4749h == -1) {
                    a();
                }
                if (this.f4749h == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f4750i;
                this.f4750i = null;
                this.f4749h = -1;
                return obj;
            default:
                int i4 = this.f4749h;
                if (i4 == 2) {
                    throw new NoSuchElementException();
                }
                if (i4 == 0 && !b()) {
                    throw new NoSuchElementException();
                }
                this.f4749h = 0;
                Iterator it = (Iterator) this.f4750i;
                it.getClass();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(e eVar) {
        this.f = 1;
        this.f4751j = eVar;
        this.f4748g = eVar.f4755a.iterator();
    }
}
