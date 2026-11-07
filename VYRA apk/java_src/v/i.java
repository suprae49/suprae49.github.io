package v;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends o {
    @Override // v.d
    public final void a(d dVar) {
        f fVar = this.f4275h;
        if (fVar.f4248c && !fVar.f4254j) {
            fVar.d((int) ((((f) fVar.f4256l.get(0)).f4251g * ((u.h) this.f4270b).f3836q0) + 0.5f));
        }
    }

    @Override // v.o
    public final void d() {
        u.d dVar = this.f4270b;
        u.h hVar = (u.h) dVar;
        int i4 = hVar.f3837r0;
        int i5 = hVar.f3838s0;
        int i6 = hVar.f3840u0;
        f fVar = this.f4275h;
        if (i6 == 1) {
            if (i4 != -1) {
                fVar.f4256l.add(dVar.T.f3771d.f4275h);
                this.f4270b.T.f3771d.f4275h.f4255k.add(fVar);
                fVar.f = i4;
            } else if (i5 != -1) {
                fVar.f4256l.add(dVar.T.f3771d.f4276i);
                this.f4270b.T.f3771d.f4276i.f4255k.add(fVar);
                fVar.f = -i5;
            } else {
                fVar.f4247b = true;
                fVar.f4256l.add(dVar.T.f3771d.f4276i);
                this.f4270b.T.f3771d.f4276i.f4255k.add(fVar);
            }
            m(this.f4270b.f3771d.f4275h);
            m(this.f4270b.f3771d.f4276i);
            return;
        }
        if (i4 != -1) {
            fVar.f4256l.add(dVar.T.f3772e.f4275h);
            this.f4270b.T.f3772e.f4275h.f4255k.add(fVar);
            fVar.f = i4;
        } else if (i5 != -1) {
            fVar.f4256l.add(dVar.T.f3772e.f4276i);
            this.f4270b.T.f3772e.f4276i.f4255k.add(fVar);
            fVar.f = -i5;
        } else {
            fVar.f4247b = true;
            fVar.f4256l.add(dVar.T.f3772e.f4276i);
            this.f4270b.T.f3772e.f4276i.f4255k.add(fVar);
        }
        m(this.f4270b.f3772e.f4275h);
        m(this.f4270b.f3772e.f4276i);
    }

    @Override // v.o
    public final void e() {
        u.d dVar = this.f4270b;
        int i4 = ((u.h) dVar).f3840u0;
        f fVar = this.f4275h;
        if (i4 == 1) {
            dVar.Y = fVar.f4251g;
        } else {
            dVar.Z = fVar.f4251g;
        }
    }

    @Override // v.o
    public final void f() {
        this.f4275h.c();
    }

    @Override // v.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f4275h;
        fVar2.f4255k.add(fVar);
        fVar.f4256l.add(fVar2);
    }
}
