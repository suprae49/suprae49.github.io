package k1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2732a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f2733b;

    public final void a(int i4) {
        if (i4 < 64) {
            this.f2732a &= ~(1 << i4);
            return;
        }
        b bVar = this.f2733b;
        if (bVar != null) {
            bVar.a(i4 - 64);
        }
    }

    public final int b(int i4) {
        b bVar = this.f2733b;
        if (bVar == null) {
            long j4 = this.f2732a;
            return i4 >= 64 ? Long.bitCount(j4) : Long.bitCount(((1 << i4) - 1) & j4);
        }
        if (i4 < 64) {
            return Long.bitCount(this.f2732a & ((1 << i4) - 1));
        }
        return Long.bitCount(this.f2732a) + bVar.b(i4 - 64);
    }

    public final void c() {
        if (this.f2733b == null) {
            this.f2733b = new b();
        }
    }

    public final boolean d(int i4) {
        if (i4 < 64) {
            return (this.f2732a & (1 << i4)) != 0;
        }
        c();
        return this.f2733b.d(i4 - 64);
    }

    public final void e(int i4, boolean z4) {
        if (i4 >= 64) {
            c();
            this.f2733b.e(i4 - 64, z4);
            return;
        }
        long j4 = this.f2732a;
        boolean z5 = (Long.MIN_VALUE & j4) != 0;
        long j5 = (1 << i4) - 1;
        this.f2732a = ((j4 & (~j5)) << 1) | (j4 & j5);
        if (z4) {
            h(i4);
        } else {
            a(i4);
        }
        if (z5 || this.f2733b != null) {
            c();
            this.f2733b.e(0, z5);
        }
    }

    public final boolean f(int i4) {
        if (i4 >= 64) {
            c();
            return this.f2733b.f(i4 - 64);
        }
        long j4 = 1 << i4;
        long j5 = this.f2732a;
        boolean z4 = (j5 & j4) != 0;
        long j6 = j5 & (~j4);
        this.f2732a = j6;
        long j7 = j4 - 1;
        this.f2732a = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
        b bVar = this.f2733b;
        if (bVar != null) {
            if (bVar.d(0)) {
                h(63);
            }
            this.f2733b.f(0);
        }
        return z4;
    }

    public final void g() {
        this.f2732a = 0L;
        b bVar = this.f2733b;
        if (bVar != null) {
            bVar.g();
        }
    }

    public final void h(int i4) {
        if (i4 < 64) {
            this.f2732a |= 1 << i4;
        } else {
            c();
            this.f2733b.h(i4 - 64);
        }
    }

    public final String toString() {
        if (this.f2733b == null) {
            return Long.toBinaryString(this.f2732a);
        }
        return this.f2733b.toString() + "xx" + Long.toBinaryString(this.f2732a);
    }
}
