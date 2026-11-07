package v;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends o {
    @Override // v.d
    public final void a(d dVar) {
        u.a aVar = (u.a) this.f4270b;
        int i4 = aVar.f3739s0;
        f fVar = this.f4275h;
        ArrayList arrayList = fVar.f4256l;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            int i8 = ((f) obj).f4251g;
            if (i6 == -1 || i8 < i6) {
                i6 = i8;
            }
            if (i5 < i8) {
                i5 = i8;
            }
        }
        if (i4 == 0 || i4 == 2) {
            fVar.d(i6 + aVar.f3741u0);
        } else {
            fVar.d(i5 + aVar.f3741u0);
        }
    }

    @Override // v.o
    public final void d() {
        u.d dVar = this.f4270b;
        if (dVar instanceof u.a) {
            f fVar = this.f4275h;
            fVar.f4247b = true;
            ArrayList arrayList = fVar.f4256l;
            u.a aVar = (u.a) dVar;
            int i4 = aVar.f3739s0;
            boolean z4 = aVar.f3740t0;
            int i5 = 0;
            if (i4 == 0) {
                fVar.f4250e = 4;
                while (i5 < aVar.f3842r0) {
                    u.d dVar2 = aVar.f3841q0[i5];
                    if (z4 || dVar2.g0 != 8) {
                        f fVar2 = dVar2.f3771d.f4275h;
                        fVar2.f4255k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i5++;
                }
                m(this.f4270b.f3771d.f4275h);
                m(this.f4270b.f3771d.f4276i);
                return;
            }
            if (i4 == 1) {
                fVar.f4250e = 5;
                while (i5 < aVar.f3842r0) {
                    u.d dVar3 = aVar.f3841q0[i5];
                    if (z4 || dVar3.g0 != 8) {
                        f fVar3 = dVar3.f3771d.f4276i;
                        fVar3.f4255k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i5++;
                }
                m(this.f4270b.f3771d.f4275h);
                m(this.f4270b.f3771d.f4276i);
                return;
            }
            if (i4 == 2) {
                fVar.f4250e = 6;
                while (i5 < aVar.f3842r0) {
                    u.d dVar4 = aVar.f3841q0[i5];
                    if (z4 || dVar4.g0 != 8) {
                        f fVar4 = dVar4.f3772e.f4275h;
                        fVar4.f4255k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i5++;
                }
                m(this.f4270b.f3772e.f4275h);
                m(this.f4270b.f3772e.f4276i);
                return;
            }
            if (i4 != 3) {
                return;
            }
            fVar.f4250e = 7;
            while (i5 < aVar.f3842r0) {
                u.d dVar5 = aVar.f3841q0[i5];
                if (z4 || dVar5.g0 != 8) {
                    f fVar5 = dVar5.f3772e.f4276i;
                    fVar5.f4255k.add(fVar);
                    arrayList.add(fVar5);
                }
                i5++;
            }
            m(this.f4270b.f3772e.f4275h);
            m(this.f4270b.f3772e.f4276i);
        }
    }

    @Override // v.o
    public final void e() {
        u.d dVar = this.f4270b;
        if (dVar instanceof u.a) {
            int i4 = ((u.a) dVar).f3739s0;
            f fVar = this.f4275h;
            if (i4 == 0 || i4 == 1) {
                dVar.Y = fVar.f4251g;
            } else {
                dVar.Z = fVar.f4251g;
            }
        }
    }

    @Override // v.o
    public final void f() {
        this.f4271c = null;
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
