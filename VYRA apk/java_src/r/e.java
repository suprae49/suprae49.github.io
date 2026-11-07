package r;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends e4.a {
    @Override // e4.a
    public final void X(f fVar, f fVar2) {
        fVar.f3487b = fVar2;
    }

    @Override // e4.a
    public final void Y(f fVar, Thread thread) {
        fVar.f3486a = thread;
    }

    @Override // e4.a
    public final boolean f(g gVar, c cVar) {
        c cVar2 = c.f3478b;
        synchronized (gVar) {
            try {
                if (gVar.f3492g != cVar) {
                    return false;
                }
                gVar.f3492g = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e4.a
    public final boolean g(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f != obj) {
                    return false;
                }
                gVar.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e4.a
    public final boolean h(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3493h != fVar) {
                    return false;
                }
                gVar.f3493h = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
