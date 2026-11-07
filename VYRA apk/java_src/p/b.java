package p;

import androidx.fragment.app.q;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, s3.a {
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3142j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i4) {
        this(fVar.f3157h);
        this.f3141i = i4;
        switch (i4) {
            case 1:
                this.f3142j = fVar;
                this(fVar.f3157h);
                break;
            default:
                this.f3142j = fVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3139g < this.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f3139g;
        switch (this.f3141i) {
            case 0:
                objF = ((f) this.f3142j).f(i4);
                break;
            case 1:
                objF = ((f) this.f3142j).i(i4);
                break;
            default:
                objF = ((g) this.f3142j).f3149g[i4];
                break;
        }
        this.f3139g++;
        this.f3140h = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3140h) {
            q.j("Call next() before removing an element.");
            return;
        }
        int i4 = this.f3139g - 1;
        this.f3139g = i4;
        switch (this.f3141i) {
            case 0:
                ((f) this.f3142j).g(i4);
                break;
            case 1:
                ((f) this.f3142j).g(i4);
                break;
            default:
                ((g) this.f3142j).a(i4);
                break;
        }
        this.f--;
        this.f3140h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.f3150h);
        this.f3141i = 2;
        this.f3142j = gVar;
    }

    public b(int i4) {
        this.f = i4;
    }
}
