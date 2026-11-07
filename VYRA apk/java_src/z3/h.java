package z3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends i3.a implements i3.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f4908g = new g(i3.d.f, new u1.q(6));

    public h() {
        super(i3.d.f);
    }

    @Override // i3.a, i3.g
    public final i3.e a(i3.f fVar) {
        i3.e eVar;
        fVar.getClass();
        if (fVar instanceof g) {
            g gVar = (g) fVar;
            i3.f fVar2 = this.f;
            if ((fVar2 == gVar || gVar.f4906g == fVar2) && (eVar = (i3.e) gVar.f.g(this)) != null) {
                return eVar;
            }
        } else if (i3.d.f == fVar) {
            return this;
        }
        return null;
    }

    public abstract void c(i3.g gVar, Runnable runnable);

    public boolean d(i3.g gVar) {
        return !(this instanceof j0);
    }

    public h e(int i4) {
        b4.d.a(i4);
        return new b4.e(this, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (((i3.e) r3.f.g(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (i3.d.f == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        return i3.h.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        return r2;
     */
    @Override // i3.a, i3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i3.g f(i3.f r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof z3.g
            if (r0 == 0) goto L1e
            z3.g r3 = (z3.g) r3
            i3.f r0 = r2.f
            if (r0 == r3) goto L13
            i3.f r1 = r3.f4906g
            if (r1 != r0) goto L12
            goto L13
        L12:
            return r2
        L13:
            q3.l r3 = r3.f
            java.lang.Object r3 = r3.g(r2)
            i3.e r3 = (i3.e) r3
            if (r3 == 0) goto L25
            goto L22
        L1e:
            i3.d r0 = i3.d.f
            if (r0 != r3) goto L25
        L22:
            i3.h r3 = i3.h.f
            return r3
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.h.f(i3.f):i3.g");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + l.b(this);
    }
}
