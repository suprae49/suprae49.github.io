package y3;

import androidx.fragment.app.q;
import java.util.Iterator;
import java.util.NoSuchElementException;
import x3.l;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, s3.a {
    public int f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v3.b f4801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f4802j;

    public b(l lVar) {
        this.f4802j = lVar;
        int length = ((CharSequence) lVar.f4762b).length();
        if (length < 0) {
            q.k("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0.");
            throw null;
        }
        length = length >= 0 ? 0 : length;
        this.f4799g = length;
        this.f4800h = length;
    }

    public final void a() {
        l lVar = this.f4802j;
        CharSequence charSequence = (CharSequence) lVar.f4762b;
        int i4 = this.f4800h;
        if (i4 < 0) {
            this.f = 0;
            this.f4801i = null;
            return;
        }
        if (i4 > charSequence.length()) {
            int i5 = this.f4799g;
            charSequence.getClass();
            this.f4801i = new v3.b(i5, charSequence.length() - 1, 1);
            this.f4800h = -1;
        } else {
            g3.b bVar = (g3.b) ((i) lVar.f4763c).f(charSequence, Integer.valueOf(this.f4800h));
            if (bVar == null) {
                int i6 = this.f4799g;
                charSequence.getClass();
                this.f4801i = new v3.b(i6, charSequence.length() - 1, 1);
                this.f4800h = -1;
            } else {
                int iIntValue = ((Number) bVar.f).intValue();
                int iIntValue2 = ((Number) bVar.f2150g).intValue();
                this.f4801i = iIntValue <= Integer.MIN_VALUE ? v3.b.f4406i : new v3.b(this.f4799g, iIntValue - 1, 1);
                int i7 = iIntValue + iIntValue2;
                this.f4799g = i7;
                this.f4800h = i7 + (iIntValue2 == 0 ? 1 : 0);
            }
        }
        this.f = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f == -1) {
            a();
        }
        return this.f == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f == -1) {
            a();
        }
        if (this.f == 0) {
            throw new NoSuchElementException();
        }
        v3.b bVar = this.f4801i;
        bVar.getClass();
        this.f4801i = null;
        this.f = -1;
        return bVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
