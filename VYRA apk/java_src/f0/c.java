package f0;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f2066e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2070d;

    public c(int i4, int i5, int i6, int i7) {
        this.f2067a = i4;
        this.f2068b = i5;
        this.f2069c = i6;
        this.f2070d = i7;
    }

    public static c a(c cVar, c cVar2) {
        return c(Math.max(cVar.f2067a, cVar2.f2067a), Math.max(cVar.f2068b, cVar2.f2068b), Math.max(cVar.f2069c, cVar2.f2069c), Math.max(cVar.f2070d, cVar2.f2070d));
    }

    public static c b(c cVar, c cVar2) {
        return c(Math.min(cVar.f2067a, cVar2.f2067a), Math.min(cVar.f2068b, cVar2.f2068b), Math.min(cVar.f2069c, cVar2.f2069c), Math.min(cVar.f2070d, cVar2.f2070d));
    }

    public static c c(int i4, int i5, int i6, int i7) {
        return (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f2066e : new c(i4, i5, i6, i7);
    }

    public static c d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return a.c(this.f2067a, this.f2068b, this.f2069c, this.f2070d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2070d == cVar.f2070d && this.f2067a == cVar.f2067a && this.f2069c == cVar.f2069c && this.f2068b == cVar.f2068b;
    }

    public final int hashCode() {
        return (((((this.f2067a * 31) + this.f2068b) * 31) + this.f2069c) * 31) + this.f2070d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2067a + ", top=" + this.f2068b + ", right=" + this.f2069c + ", bottom=" + this.f2070d + '}';
    }
}
