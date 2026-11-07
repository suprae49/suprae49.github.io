package u;

import androidx.emoji2.text.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import v.n;
import v.o;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final v.b L0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f3802q0 = new ArrayList();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f3803r0 = new t(this);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final v.e f3804s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f3805t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public x.f f3806u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final s.c f3807w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f3808x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f3809y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f3810z0;

    public e() {
        v.e eVar = new v.e();
        eVar.f4240b = true;
        eVar.f4241c = true;
        eVar.f4243e = new ArrayList();
        new ArrayList();
        eVar.f = null;
        eVar.f4244g = new v.b();
        eVar.f4245h = new ArrayList();
        eVar.f4239a = this;
        eVar.f4242d = this;
        this.f3804s0 = eVar;
        this.f3806u0 = null;
        this.v0 = false;
        this.f3807w0 = new s.c();
        this.f3810z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new v.b();
    }

    public static void V(d dVar, x.f fVar, v.b bVar) {
        int i4;
        int i5;
        if (fVar == null) {
            return;
        }
        int i6 = dVar.g0;
        int[] iArr = dVar.f3795t;
        if (i6 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f4232e = 0;
            bVar.f = 0;
            return;
        }
        int[] iArr2 = dVar.f3791p0;
        bVar.f4228a = iArr2[0];
        bVar.f4229b = iArr2[1];
        bVar.f4230c = dVar.q();
        bVar.f4231d = dVar.k();
        bVar.f4235i = false;
        bVar.f4236j = 0;
        boolean z4 = bVar.f4228a == 3;
        boolean z5 = bVar.f4229b == 3;
        boolean z6 = z4 && dVar.W > 0.0f;
        boolean z7 = z5 && dVar.W > 0.0f;
        if (z4 && dVar.t(0) && dVar.f3793r == 0 && !z6) {
            bVar.f4228a = 2;
            if (z5 && dVar.f3794s == 0) {
                bVar.f4228a = 1;
            }
            z4 = false;
        }
        if (z5 && dVar.t(1) && dVar.f3794s == 0 && !z7) {
            bVar.f4229b = 2;
            if (z4 && dVar.f3793r == 0) {
                bVar.f4229b = 1;
            }
            z5 = false;
        }
        if (dVar.A()) {
            bVar.f4228a = 1;
            z4 = false;
        }
        if (dVar.B()) {
            bVar.f4229b = 1;
            z5 = false;
        }
        if (z6) {
            if (iArr[0] == 4) {
                bVar.f4228a = 1;
            } else if (!z5) {
                if (bVar.f4229b == 1) {
                    i5 = bVar.f4231d;
                } else {
                    bVar.f4228a = 2;
                    fVar.b(dVar, bVar);
                    i5 = bVar.f;
                }
                bVar.f4228a = 1;
                bVar.f4230c = (int) (dVar.W * i5);
            }
        }
        if (z7) {
            if (iArr[1] == 4) {
                bVar.f4229b = 1;
            } else if (!z4) {
                if (bVar.f4228a == 1) {
                    i4 = bVar.f4230c;
                } else {
                    bVar.f4229b = 2;
                    fVar.b(dVar, bVar);
                    i4 = bVar.f4232e;
                }
                bVar.f4229b = 1;
                int i7 = dVar.X;
                float f = dVar.W;
                if (i7 == -1) {
                    bVar.f4231d = (int) (i4 / f);
                } else {
                    bVar.f4231d = (int) (f * i4);
                }
            }
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f4232e);
        dVar.L(bVar.f);
        dVar.E = bVar.f4234h;
        dVar.I(bVar.f4233g);
        bVar.f4236j = 0;
    }

    @Override // u.d
    public final void C() {
        this.f3807w0.t();
        this.f3808x0 = 0;
        this.f3809y0 = 0;
        this.f3802q0.clear();
        super.C();
    }

    @Override // u.d
    public final void F(t tVar) {
        super.F(tVar);
        int size = this.f3802q0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) this.f3802q0.get(i4)).F(tVar);
        }
    }

    @Override // u.d
    public final void P(boolean z4, boolean z5) {
        super.P(z4, z5);
        int size = this.f3802q0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) this.f3802q0.get(i4)).P(z4, z5);
        }
    }

    public final void R(d dVar, int i4) {
        if (i4 == 0) {
            int i5 = this.f3810z0 + 1;
            b[] bVarArr = this.C0;
            if (i5 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i6 = this.f3810z0;
            bVarArr2[i6] = new b(dVar, 0, this.v0);
            this.f3810z0 = i6 + 1;
            return;
        }
        if (i4 == 1) {
            int i7 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i7 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i8 = this.A0;
            bVarArr4[i8] = new b(dVar, 1, this.v0);
            this.A0 = i8 + 1;
        }
    }

    public final void S(s.c cVar) {
        e eVar;
        s.c cVar2;
        boolean zW = W(64);
        b(cVar, zW);
        int size = this.f3802q0.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) this.f3802q0.get(i4);
            boolean[] zArr = dVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z4 = true;
            }
        }
        if (z4) {
            for (int i5 = 0; i5 < size; i5++) {
                d dVar2 = (d) this.f3802q0.get(i5);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i6 = 0; i6 < aVar.f3842r0; i6++) {
                        d dVar3 = aVar.f3841q0[i6];
                        if (aVar.f3740t0 || dVar3.c()) {
                            int i7 = aVar.f3739s0;
                            if (i7 == 0 || i7 == 1) {
                                dVar3.S[0] = true;
                            } else if (i7 == 2 || i7 == 3) {
                                dVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i8 = 0; i8 < size; i8++) {
            d dVar4 = (d) this.f3802q0.get(i8);
            dVar4.getClass();
            boolean z5 = dVar4 instanceof g;
            if (z5 || (dVar4 instanceof h)) {
                if (z5) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                g gVar = (g) ((d) it.next());
                for (int i9 = 0; i9 < gVar.f3842r0; i9++) {
                    if (hashSet.contains(gVar.f3841q0[i9])) {
                        gVar.b(cVar, zW);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, zW);
                }
                hashSet.clear();
            }
        }
        if (s.c.f3629q) {
            HashSet<d> hashSet2 = new HashSet();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar5 = (d) this.f3802q0.get(i10);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f3791p0[0] == 2 ? 0 : 1, false);
            for (d dVar6 : hashSet2) {
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, zW);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar7 = (d) eVar.f3802q0.get(i11);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f3791p0;
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    if (i12 == 2) {
                        dVar7.M(1);
                    }
                    if (i13 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, zW);
                    if (i12 == 2) {
                        dVar7.M(i12);
                    }
                    if (i13 == 2) {
                        dVar7.N(i13);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, zW);
                    }
                }
            }
        }
        if (eVar.f3810z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    public final boolean T(int i4, boolean z4) {
        boolean z5;
        boolean z6;
        v.e eVar = this.f3804s0;
        ArrayList arrayList = eVar.f4243e;
        e eVar2 = eVar.f4239a;
        boolean z7 = false;
        int iJ = eVar2.j(0);
        int iJ2 = eVar2.j(1);
        int iR = eVar2.r();
        int iS = eVar2.s();
        if (z4 && (iJ == 2 || iJ2 == 2)) {
            int size = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z6 = z4;
                    break;
                }
                Object obj = arrayList.get(i5);
                i5++;
                o oVar = (o) obj;
                if (oVar.f == i4 && !oVar.k()) {
                    z6 = false;
                    break;
                }
            }
            if (i4 == 0) {
                if (z6 && iJ == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.f3771d.f4273e.d(eVar2.q());
                }
            } else if (z6 && iJ2 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.f3772e.f4273e.d(eVar2.k());
            }
        }
        int[] iArr = eVar2.f3791p0;
        if (i4 == 0) {
            int i6 = iArr[0];
            if (i6 == 1 || i6 == 4) {
                int iQ = eVar2.q() + iR;
                eVar2.f3771d.f4276i.d(iQ);
                eVar2.f3771d.f4273e.d(iQ - iR);
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            int i7 = iArr[1];
            if (i7 == 1 || i7 == 4) {
                int iK = eVar2.k() + iS;
                eVar2.f3772e.f4276i.d(iK);
                eVar2.f3772e.f4273e.d(iK - iS);
                z5 = true;
            } else {
                z5 = false;
            }
        }
        eVar.g();
        int size2 = arrayList.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList.get(i8);
            i8++;
            o oVar2 = (o) obj2;
            if (oVar2.f == i4 && (oVar2.f4270b != eVar2 || oVar2.f4274g)) {
                oVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i9 = 0;
        while (i9 < size3) {
            Object obj3 = arrayList.get(i9);
            i9++;
            o oVar3 = (o) obj3;
            if (oVar3.f == i4 && (z5 || oVar3.f4270b != eVar2)) {
                if (!oVar3.f4275h.f4254j || !oVar3.f4276i.f4254j || (!(oVar3 instanceof v.c) && !oVar3.f4273e.f4254j)) {
                    eVar2.M(iJ);
                    eVar2.N(iJ2);
                    return z7;
                }
            }
        }
        z7 = true;
        eVar2.M(iJ);
        eVar2.N(iJ2);
        return z7;
    }

    /* JADX WARN: Code duplicated, block: B:339:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:341:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:349:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:350:0x0602  */
    /* JADX WARN: Code duplicated, block: B:356:0x0616  */
    /* JADX WARN: Code duplicated, block: B:362:0x062f  */
    /* JADX WARN: Code duplicated, block: B:365:0x0635  */
    /* JADX WARN: Code duplicated, block: B:367:0x063d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:370:0x064b  */
    /* JADX WARN: Code duplicated, block: B:376:0x065b  */
    /* JADX WARN: Code duplicated, block: B:380:0x0666  */
    /* JADX WARN: Code duplicated, block: B:383:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:385:0x0677  */
    /* JADX WARN: Code duplicated, block: B:388:0x067f  */
    /* JADX WARN: Code duplicated, block: B:392:0x0686  */
    /* JADX WARN: Code duplicated, block: B:395:0x0690  */
    /* JADX WARN: Code duplicated, block: B:397:0x069c  */
    /* JADX WARN: Code duplicated, block: B:401:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:404:0x06bf A[Catch: Exception -> 0x06cd, LOOP:12: B:403:0x06bd->B:404:0x06bf, LOOP_END, TryCatch #3 {Exception -> 0x06cd, blocks: (B:402:0x06b1, B:404:0x06bf, B:407:0x06d6), top: B:538:0x06b1 }] */
    /* JADX WARN: Code duplicated, block: B:412:0x06e3 A[Catch: Exception -> 0x070c, TRY_LEAVE, TryCatch #4 {Exception -> 0x070c, blocks: (B:410:0x06dd, B:412:0x06e3), top: B:540:0x06dd }] */
    /* JADX WARN: Code duplicated, block: B:428:0x0710  */
    /* JADX WARN: Code duplicated, block: B:431:0x0718 A[Catch: Exception -> 0x0700, TryCatch #0 {Exception -> 0x0700, blocks: (B:417:0x06f9, B:429:0x0714, B:431:0x0718, B:433:0x071e, B:434:0x0738, B:436:0x073c, B:438:0x0742, B:442:0x0758, B:445:0x0763, B:447:0x0767, B:449:0x076d), top: B:532:0x06f9 }] */
    /* JADX WARN: Code duplicated, block: B:436:0x073c A[Catch: Exception -> 0x0700, TryCatch #0 {Exception -> 0x0700, blocks: (B:417:0x06f9, B:429:0x0714, B:431:0x0718, B:433:0x071e, B:434:0x0738, B:436:0x073c, B:438:0x0742, B:442:0x0758, B:445:0x0763, B:447:0x0767, B:449:0x076d), top: B:532:0x06f9 }] */
    /* JADX WARN: Code duplicated, block: B:447:0x0767 A[Catch: Exception -> 0x0700, TryCatch #0 {Exception -> 0x0700, blocks: (B:417:0x06f9, B:429:0x0714, B:431:0x0718, B:433:0x071e, B:434:0x0738, B:436:0x073c, B:438:0x0742, B:442:0x0758, B:445:0x0763, B:447:0x0767, B:449:0x076d), top: B:532:0x06f9 }] */
    /* JADX WARN: Code duplicated, block: B:461:0x0792  */
    /* JADX WARN: Code duplicated, block: B:469:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:471:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:473:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:475:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:478:0x0800  */
    /* JADX WARN: Code duplicated, block: B:480:0x0809 A[LOOP:15: B:479:0x0807->B:480:0x0809, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:484:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:489:0x082a A[LOOP:14: B:488:0x0828->B:489:0x082a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:492:0x085e  */
    /* JADX WARN: Code duplicated, block: B:496:0x0871  */
    /* JADX WARN: Code duplicated, block: B:501:0x0892  */
    /* JADX WARN: Code duplicated, block: B:502:0x089f  */
    /* JADX WARN: Code duplicated, block: B:505:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:506:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:508:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:510:0x08c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:513:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:516:0x08dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:522:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:524:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:525:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:529:0x090b  */
    /* JADX WARN: Code duplicated, block: B:540:0x06dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x06a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r32v0, types: [u.d, u.e] */
    /* JADX WARN: Type inference failed for: r4v55, types: [int] */
    /* JADX WARN: Type inference failed for: r5v57, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v74, types: [int] */
    /* JADX WARN: Type inference failed for: r7v22, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    public final void U() {
        ?? r22;
        int i4;
        int i5;
        int i6;
        int i7;
        c cVar;
        c cVar2;
        int i8;
        boolean z4;
        boolean z5;
        char c4;
        boolean z6;
        int i9;
        int i10;
        boolean zW;
        ?? r12;
        int i11;
        boolean z7;
        boolean z8;
        int i12;
        c cVar3;
        boolean z9;
        boolean z10;
        boolean[] zArr;
        boolean[] zArr2;
        int i13;
        boolean z11;
        int iMax;
        ?? r8;
        ?? r18;
        boolean z12;
        int iMax2;
        ?? r4;
        boolean z13;
        boolean z14;
        ?? r5;
        boolean z15;
        ?? r6;
        boolean z16;
        boolean z17;
        ?? r7;
        ?? r9;
        int i14;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zW2;
        int size;
        int i15;
        boolean z18;
        d dVar;
        boolean z19;
        int i16;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        c cVar4;
        d dVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        char c5;
        n nVar;
        n nVar2;
        int i21;
        int iQ;
        int i22;
        int iK;
        int size2;
        int i23;
        int i24;
        n nVar3;
        int iB;
        int iB2;
        n nVar4;
        n nVar5;
        int i25;
        boolean z20;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size3 = this.f3802q0.size();
        int iMax7 = Math.max(0, q());
        int iMax8 = Math.max(0, k());
        int[] iArr = this.f3791p0;
        int i26 = iArr[1];
        int i27 = iArr[0];
        int i28 = this.f3805t0;
        c cVar5 = this.J;
        c cVar6 = this.I;
        if (i28 == 0 && j.c(this.D0, 1)) {
            x.f fVar = this.f3806u0;
            int i29 = iArr[0];
            int i30 = iArr[1];
            E();
            ArrayList arrayList = this.f3802q0;
            int size4 = arrayList.size();
            for (int i31 = 0; i31 < size4; i31++) {
                ((d) arrayList.get(i31)).E();
            }
            boolean z21 = this.v0;
            if (i29 == 1) {
                J(0, q());
            } else {
                cVar6.l(0);
                this.Y = 0;
            }
            int i32 = 0;
            boolean z22 = false;
            boolean z23 = false;
            while (i32 < size4) {
                int[] iArr2 = iArr;
                d dVar3 = (d) arrayList.get(i32);
                int i33 = i32;
                if (dVar3 instanceof h) {
                    h hVar = (h) dVar3;
                    z20 = z22;
                    if (hVar.f3840u0 == 1) {
                        int i34 = hVar.f3837r0;
                        if (i34 != -1) {
                            hVar.R(i34);
                        } else if (hVar.f3838s0 != -1 && A()) {
                            hVar.R(q() - hVar.f3838s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f3836q0 * q()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else {
                    z20 = z22;
                    if ((dVar3 instanceof a) && ((a) dVar3).U() == 0) {
                        z22 = z20;
                        z23 = true;
                    }
                    i32 = i33 + 1;
                    iArr = iArr2;
                }
                z22 = z20;
                i32 = i33 + 1;
                iArr = iArr2;
            }
            r22 = iArr;
            if (z22) {
                for (int i35 = 0; i35 < size4; i35 = i25 + 1) {
                    d dVar4 = (d) arrayList.get(i35);
                    if (dVar4 instanceof h) {
                        h hVar2 = (h) dVar4;
                        i25 = i35;
                        if (hVar2.f3840u0 == 1) {
                            v.h.c(0, hVar2, fVar, z21);
                        }
                    } else {
                        i25 = i35;
                    }
                }
            }
            v.h.c(0, this, fVar, z21);
            if (z23) {
                for (int i36 = 0; i36 < size4; i36++) {
                    d dVar5 = (d) arrayList.get(i36);
                    if (dVar5 instanceof a) {
                        a aVar = (a) dVar5;
                        if (aVar.U() == 0 && aVar.T()) {
                            v.h.c(1, aVar, fVar, z21);
                        }
                    }
                }
            }
            if (i30 == 1) {
                K(0, k());
            } else {
                cVar5.l(0);
                this.Z = 0;
            }
            int i37 = 0;
            boolean z24 = false;
            boolean z25 = false;
            while (i37 < size4) {
                d dVar6 = (d) arrayList.get(i37);
                int i38 = i37;
                if (dVar6 instanceof h) {
                    h hVar3 = (h) dVar6;
                    if (hVar3.f3840u0 == 0) {
                        int i39 = hVar3.f3837r0;
                        if (i39 != -1) {
                            hVar3.R(i39);
                        } else if (hVar3.f3838s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f3838s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f3836q0 * k()) + 0.5f));
                        }
                        z24 = true;
                    }
                } else if ((dVar6 instanceof a) && ((a) dVar6).U() == 1) {
                    z25 = true;
                }
                i37 = i38 + 1;
            }
            if (z24) {
                for (int i40 = 0; i40 < size4; i40++) {
                    d dVar7 = (d) arrayList.get(i40);
                    if (dVar7 instanceof h) {
                        h hVar4 = (h) dVar7;
                        if (hVar4.f3840u0 == 0) {
                            v.h.i(1, hVar4, fVar);
                        }
                    }
                }
            }
            v.h.i(0, this, fVar);
            if (z25) {
                for (int i41 = 0; i41 < size4; i41++) {
                    d dVar8 = (d) arrayList.get(i41);
                    if (dVar8 instanceof a) {
                        a aVar2 = (a) dVar8;
                        if (aVar2.U() == 1 && aVar2.T()) {
                            v.h.i(1, aVar2, fVar);
                        }
                    }
                }
            }
            for (int i42 = 0; i42 < size4; i42++) {
                d dVar9 = (d) arrayList.get(i42);
                if (dVar9.z() && v.h.a(dVar9)) {
                    V(dVar9, fVar, v.h.f4258a);
                    if (!(dVar9 instanceof h)) {
                        v.h.c(0, dVar9, fVar, z21);
                        v.h.i(0, dVar9, fVar);
                    } else if (((h) dVar9).f3840u0 == 0) {
                        v.h.i(0, dVar9, fVar);
                    } else {
                        v.h.c(0, dVar9, fVar, z21);
                    }
                }
            }
            for (int i43 = 0; i43 < size3; i43++) {
                d dVar10 = (d) this.f3802q0.get(i43);
                if (dVar10.z() && !(dVar10 instanceof h) && !(dVar10 instanceof a) && !(dVar10 instanceof g) && !dVar10.F) {
                    int iJ = dVar10.j(0);
                    int iJ2 = dVar10.j(1);
                    if (iJ != 3 || dVar10.f3793r == 1 || iJ2 != 3 || dVar10.f3794s == 1) {
                        V(dVar10, this.f3806u0, new v.b());
                    }
                }
            }
        } else {
            r22 = iArr;
        }
        s.c cVar7 = this.f3807w0;
        if (size3 <= 2 || !((i27 == 2 || i26 == 2) && j.c(this.D0, 1024))) {
            i4 = size3;
            i5 = iMax8;
            i6 = i26;
            i7 = i27;
            cVar = cVar5;
            cVar2 = cVar6;
            i8 = iMax7;
        } else {
            x.f fVar2 = this.f3806u0;
            ArrayList arrayList2 = this.f3802q0;
            int size5 = arrayList2.size();
            int i44 = 0;
            while (true) {
                if (i44 < size5) {
                    d dVar11 = (d) arrayList2.get(i44);
                    ?? r10 = r22[0];
                    ?? r11 = r22[1];
                    int i45 = i44;
                    int[] iArr3 = dVar11.f3791p0;
                    cVar2 = cVar6;
                    if (v.h.h(r10, r11, iArr3[0], iArr3[1]) && !(dVar11 instanceof g)) {
                        i44 = i45 + 1;
                        cVar6 = cVar2;
                    } else {
                        i17 = iMax7;
                        i4 = size3;
                        i18 = iMax8;
                        i19 = i26;
                        i20 = i27;
                        cVar = cVar5;
                    }
                } else {
                    cVar2 = cVar6;
                    i4 = size3;
                    cVar = cVar5;
                    int i46 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i46 < size5) {
                        int i47 = i46;
                        d dVar12 = (d) arrayList2.get(i46);
                        int i48 = iMax8;
                        ?? r13 = r22[0];
                        int i49 = i26;
                        ?? r14 = r22[1];
                        int i50 = iMax7;
                        int[] iArr4 = dVar12.f3791p0;
                        int i51 = i27;
                        if (!v.h.h(r13, r14, iArr4[0], iArr4[1])) {
                            V(dVar12, fVar2, this.L0);
                        }
                        boolean z26 = dVar12 instanceof h;
                        if (z26) {
                            h hVar5 = (h) dVar12;
                            if (hVar5.f3840u0 == 0) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(hVar5);
                            }
                            if (hVar5.f3840u0 == 1) {
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(hVar5);
                            }
                        }
                        if (dVar12 instanceof i) {
                            if (dVar12 instanceof a) {
                                a aVar3 = (a) dVar12;
                                if (aVar3.U() == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(aVar3);
                                }
                                if (aVar3.U() == 1) {
                                    if (arrayList8 == null) {
                                        arrayList8 = new ArrayList();
                                    }
                                    arrayList8.add(aVar3);
                                }
                            } else {
                                i iVar = (i) dVar12;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(iVar);
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(iVar);
                            }
                        }
                        if (dVar12.I.f == null && dVar12.K.f == null && !z26 && !(dVar12 instanceof a)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(dVar12);
                        }
                        if (dVar12.J.f == null && dVar12.L.f == null && dVar12.M.f == null && !z26 && !(dVar12 instanceof a)) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(dVar12);
                        }
                        i46 = i47 + 1;
                        iMax8 = i48;
                        i26 = i49;
                        iMax7 = i50;
                        i27 = i51;
                    }
                    i17 = iMax7;
                    i18 = iMax8;
                    i19 = i26;
                    i20 = i27;
                    ArrayList arrayList9 = new ArrayList();
                    if (arrayList4 != null) {
                        int size6 = arrayList4.size();
                        int i52 = 0;
                        while (i52 < size6) {
                            Object obj = arrayList4.get(i52);
                            i52++;
                            v.h.b((h) obj, 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        int size7 = arrayList5.size();
                        int i53 = 0;
                        while (i53 < size7) {
                            Object obj2 = arrayList5.get(i53);
                            i53++;
                            i iVar2 = (i) obj2;
                            n nVarB = v.h.b(iVar2, 0, arrayList9, null);
                            iVar2.R(0, arrayList9, nVarB);
                            nVarB.a(arrayList9);
                        }
                    }
                    HashSet hashSet = i(2).f3757a;
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            v.h.b(((c) it.next()).f3760d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = i(4).f3757a;
                    if (hashSet2 != null) {
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            v.h.b(((c) it2.next()).f3760d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = i(7).f3757a;
                    if (hashSet3 != null) {
                        Iterator it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            v.h.b(((c) it3.next()).f3760d, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size8 = arrayList6.size();
                        int i54 = 0;
                        while (i54 < size8) {
                            Object obj3 = arrayList6.get(i54);
                            i54++;
                            v.h.b((d) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size9 = arrayList7.size();
                        int i55 = 0;
                        while (i55 < size9) {
                            Object obj4 = arrayList7.get(i55);
                            i55++;
                            v.h.b((h) obj4, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size10 = arrayList8.size();
                        int i56 = 0;
                        while (i56 < size10) {
                            Object obj5 = arrayList8.get(i56);
                            i56++;
                            i iVar3 = (i) obj5;
                            n nVarB2 = v.h.b(iVar3, 1, arrayList9, null);
                            iVar3.R(1, arrayList9, nVarB2);
                            nVarB2.a(arrayList9);
                        }
                    }
                    HashSet hashSet4 = i(3).f3757a;
                    if (hashSet4 != null) {
                        Iterator it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            v.h.b(((c) it4.next()).f3760d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = i(6).f3757a;
                    if (hashSet5 != null) {
                        Iterator it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            v.h.b(((c) it5.next()).f3760d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = i(5).f3757a;
                    if (hashSet6 != null) {
                        Iterator it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            v.h.b(((c) it6.next()).f3760d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = i(7).f3757a;
                    if (hashSet7 != null) {
                        Iterator it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            v.h.b(((c) it7.next()).f3760d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList3 != null) {
                        int size11 = arrayList3.size();
                        int i57 = 0;
                        while (i57 < size11) {
                            Object obj6 = arrayList3.get(i57);
                            i57++;
                            v.h.b((d) obj6, 1, arrayList9, null);
                        }
                    }
                    char c6 = 1;
                    int i58 = 0;
                    while (i58 < size5) {
                        d dVar13 = (d) arrayList2.get(i58);
                        int[] iArr5 = dVar13.f3791p0;
                        if (iArr5[0] == 3 && iArr5[c6] == 3) {
                            int i59 = dVar13.f3787n0;
                            int size12 = arrayList9.size();
                            int i60 = 0;
                            while (true) {
                                if (i60 >= size12) {
                                    nVar4 = null;
                                    break;
                                }
                                nVar4 = (n) arrayList9.get(i60);
                                if (i59 == nVar4.f4265b) {
                                    break;
                                } else {
                                    i60++;
                                }
                            }
                            int i61 = dVar13.f3789o0;
                            int size13 = arrayList9.size();
                            int i62 = 0;
                            while (true) {
                                if (i62 >= size13) {
                                    nVar5 = null;
                                    break;
                                }
                                nVar5 = (n) arrayList9.get(i62);
                                if (i61 == nVar5.f4265b) {
                                    break;
                                } else {
                                    i62++;
                                }
                            }
                            if (nVar4 != null && nVar5 != null) {
                                nVar4.c(0, nVar5);
                                nVar5.f4266c = 2;
                                arrayList9.remove(nVar4);
                            }
                        }
                        i58++;
                        c6 = 1;
                    }
                    if (arrayList9.size() > 1) {
                        if (r22[0] == 2) {
                            int size14 = arrayList9.size();
                            int i63 = 0;
                            int i64 = 0;
                            nVar = null;
                            while (i64 < size14) {
                                Object obj7 = arrayList9.get(i64);
                                i64++;
                                n nVar6 = (n) obj7;
                                if (nVar6.f4266c != 1 && (iB2 = nVar6.b(cVar7, 0)) > i63) {
                                    nVar = nVar6;
                                    i63 = iB2;
                                }
                            }
                            c5 = 1;
                            if (nVar != null) {
                                M(1);
                                O(i63);
                            }
                            if (r22[c5] == 2) {
                                size2 = arrayList9.size();
                                i23 = 0;
                                i24 = 0;
                                nVar2 = null;
                                while (i24 < size2) {
                                    Object obj8 = arrayList9.get(i24);
                                    i24++;
                                    nVar3 = (n) obj8;
                                    if (nVar3.f4266c != 0 && (iB = nVar3.b(cVar7, 1)) > i23) {
                                        nVar2 = nVar3;
                                        i23 = iB;
                                    }
                                }
                                if (nVar2 != null) {
                                    N(1);
                                    L(i23);
                                } else {
                                    nVar2 = null;
                                }
                            } else {
                                nVar2 = null;
                            }
                            if (nVar == null || nVar2 != null) {
                                i7 = i20;
                                if (i7 == 2) {
                                    i21 = i17;
                                    if (i21 < q() || i21 <= 0) {
                                        iQ = q();
                                    } else {
                                        O(i21);
                                        this.E0 = true;
                                    }
                                    i6 = i19;
                                    if (i6 == 2) {
                                        i22 = i18;
                                        if (i22 < k() || i22 <= 0) {
                                            iK = k();
                                        } else {
                                            L(i22);
                                            this.F0 = true;
                                        }
                                        i5 = iK;
                                        i8 = iQ;
                                        z4 = true;
                                    } else {
                                        i22 = i18;
                                    }
                                    iK = i22;
                                    i5 = iK;
                                    i8 = iQ;
                                    z4 = true;
                                } else {
                                    i21 = i17;
                                }
                                iQ = i21;
                                i6 = i19;
                                if (i6 == 2) {
                                    i22 = i18;
                                    if (i22 < k()) {
                                    }
                                    iK = k();
                                    i5 = iK;
                                    i8 = iQ;
                                    z4 = true;
                                } else {
                                    i22 = i18;
                                }
                                iK = i22;
                                i5 = iK;
                                i8 = iQ;
                                z4 = true;
                            }
                            if (!W(64) || W(128)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            cVar7.getClass();
                            cVar7.f3636h = false;
                            if (this.D0 == 0 && z5) {
                                c4 = 1;
                                cVar7.f3636h = true;
                            } else {
                                c4 = 1;
                            }
                            ArrayList arrayList10 = this.f3802q0;
                            if (r22[0] != 2 || r22[c4] == 2) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            this.f3810z0 = 0;
                            this.A0 = 0;
                            i9 = i4;
                            for (i10 = 0; i10 < i9; i10++) {
                                dVar2 = (d) this.f3802q0.get(i10);
                                if (dVar2 instanceof e) {
                                    ((e) dVar2).U();
                                }
                            }
                            zW = W(64);
                            r12 = z4;
                            i11 = 0;
                            z7 = true;
                            while (z7) {
                                i12 = i11 + 1;
                                try {
                                    cVar7.t();
                                    this.f3810z0 = 0;
                                    this.A0 = 0;
                                    g(cVar7);
                                    for (i16 = 0; i16 < i9; i16++) {
                                        ((d) this.f3802q0.get(i16)).g(cVar7);
                                    }
                                    S(cVar7);
                                    try {
                                        weakReference = this.G0;
                                        if (weakReference != null) {
                                            try {
                                                if (weakReference.get() != null) {
                                                    cVar3 = cVar;
                                                    try {
                                                        try {
                                                            z9 = z6;
                                                            try {
                                                                cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                                                                this.G0 = null;
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                z19 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z10 = z19;
                                                                zArr = j.f3843a;
                                                                if (z10) {
                                                                    zArr[2] = false;
                                                                    zW2 = W(64);
                                                                    Q(cVar7, zW2);
                                                                    size = this.f3802q0.size();
                                                                    i15 = 0;
                                                                    z18 = false;
                                                                    while (i15 < size) {
                                                                        dVar = (d) this.f3802q0.get(i15);
                                                                        dVar.Q(cVar7, zW2);
                                                                        boolean[] zArr3 = zArr;
                                                                        boolean z27 = zW2;
                                                                        if (dVar.f3776h == -1) {
                                                                            z18 = true;
                                                                        } else {
                                                                            z18 = true;
                                                                        }
                                                                        i15++;
                                                                        zArr = zArr3;
                                                                        zW2 = z27;
                                                                        z18 = z18;
                                                                    }
                                                                    zArr2 = zArr;
                                                                    z11 = z18;
                                                                } else {
                                                                    zArr2 = zArr;
                                                                    Q(cVar7, zW);
                                                                    for (i13 = 0; i13 < i9; i13++) {
                                                                        ((d) this.f3802q0.get(i13)).Q(cVar7, zW);
                                                                    }
                                                                    z11 = false;
                                                                }
                                                                if (z9) {
                                                                    iMax3 = 0;
                                                                    iMax4 = 0;
                                                                    for (i14 = 0; i14 < i9; i14++) {
                                                                        d dVar14 = (d) this.f3802q0.get(i14);
                                                                        iMax3 = Math.max(iMax3, dVar14.q() + dVar14.Y);
                                                                        iMax4 = Math.max(iMax4, dVar14.k() + dVar14.Z);
                                                                    }
                                                                    iMax5 = Math.max(this.f3768b0, iMax3);
                                                                    iMax6 = Math.max(this.f3770c0, iMax4);
                                                                    z11 = z11;
                                                                    r12 = r12;
                                                                    if (i7 == 2) {
                                                                        z11 = z11;
                                                                        r12 = r12;
                                                                        O(iMax5);
                                                                        r22[0] = 2;
                                                                        z11 = true;
                                                                        r12 = 1;
                                                                    }
                                                                    if (i6 == 2) {
                                                                        L(iMax6);
                                                                        r22[1] = 2;
                                                                        z11 = true;
                                                                        r12 = 1;
                                                                    }
                                                                }
                                                                iMax = Math.max(this.f3768b0, q());
                                                                if (iMax > q()) {
                                                                    O(iMax);
                                                                    r8 = 1;
                                                                    r22[0] = 1;
                                                                    z12 = true;
                                                                    r18 = 1;
                                                                } else {
                                                                    r8 = 1;
                                                                    r18 = r12;
                                                                    z12 = z11;
                                                                }
                                                                iMax2 = Math.max(this.f3770c0, k());
                                                                if (iMax2 > k()) {
                                                                    L(iMax2);
                                                                    r22[r8] = r8;
                                                                    r9 = r8;
                                                                    z13 = r9 == true ? 1 : 0;
                                                                } else {
                                                                    r4 = r18;
                                                                }
                                                                if (r4 == 0) {
                                                                    z13 = z12;
                                                                    if (r22[0] == 2) {
                                                                        r7 = r4;
                                                                        z17 = z13;
                                                                        if (q() > i8) {
                                                                            this.E0 = r8;
                                                                            r22[0] = r8;
                                                                            O(i8);
                                                                            ?? r15 = r8;
                                                                            z17 = r15 == true ? 1 : 0;
                                                                            r7 = r15;
                                                                        }
                                                                    }
                                                                    r4 = r9;
                                                                    r7 = r4;
                                                                    r7 = r4;
                                                                    z17 = z13;
                                                                    z17 = z13;
                                                                    r5 = r7;
                                                                    r5 = r7;
                                                                    z14 = z17;
                                                                    z14 = z17;
                                                                    if (r22[r8] != 2) {
                                                                    }
                                                                    if (i12 > 8) {
                                                                        z16 = false;
                                                                    } else {
                                                                        z16 = z15;
                                                                    }
                                                                    r12 = r6;
                                                                    i11 = i12;
                                                                    z6 = z9;
                                                                    cVar = cVar3;
                                                                    z7 = z16;
                                                                } else {
                                                                    z13 = z12;
                                                                    r4 = r9;
                                                                    r5 = r4;
                                                                    z14 = z13;
                                                                }
                                                                r5 = r7;
                                                                z14 = z17;
                                                                z15 = z14;
                                                                r6 = r5;
                                                                if (i12 > 8) {
                                                                    z16 = false;
                                                                } else {
                                                                    z16 = z15;
                                                                }
                                                                r12 = r6;
                                                                i11 = i12;
                                                                z6 = z9;
                                                                cVar = cVar3;
                                                                z7 = z16;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            z9 = z6;
                                                            z19 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z10 = z19;
                                                            zArr = j.f3843a;
                                                            if (z10) {
                                                                zArr[2] = false;
                                                                zW2 = W(64);
                                                                Q(cVar7, zW2);
                                                                size = this.f3802q0.size();
                                                                i15 = 0;
                                                                z18 = false;
                                                                while (i15 < size) {
                                                                    dVar = (d) this.f3802q0.get(i15);
                                                                    dVar.Q(cVar7, zW2);
                                                                    boolean[] zArr4 = zArr;
                                                                    boolean z28 = zW2;
                                                                    if (dVar.f3776h == -1) {
                                                                        z18 = true;
                                                                    } else {
                                                                        z18 = true;
                                                                    }
                                                                    i15++;
                                                                    zArr = zArr4;
                                                                    zW2 = z28;
                                                                    z18 = z18;
                                                                }
                                                                zArr2 = zArr;
                                                                z11 = z18;
                                                            } else {
                                                                zArr2 = zArr;
                                                                Q(cVar7, zW);
                                                                while (i13 < i9) {
                                                                    ((d) this.f3802q0.get(i13)).Q(cVar7, zW);
                                                                }
                                                                z11 = false;
                                                            }
                                                            if (z9) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i14 < i9) {
                                                                    d dVar15 = (d) this.f3802q0.get(i14);
                                                                    iMax3 = Math.max(iMax3, dVar15.q() + dVar15.Y);
                                                                    iMax4 = Math.max(iMax4, dVar15.k() + dVar15.Z);
                                                                }
                                                                iMax5 = Math.max(this.f3768b0, iMax3);
                                                                iMax6 = Math.max(this.f3770c0, iMax4);
                                                                z11 = z11;
                                                                r12 = r12;
                                                                if (i7 == 2) {
                                                                    z11 = z11;
                                                                    r12 = r12;
                                                                    O(iMax5);
                                                                    r22[0] = 2;
                                                                    z11 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i6 == 2) {
                                                                    L(iMax6);
                                                                    r22[1] = 2;
                                                                    z11 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.f3768b0, q());
                                                            if (iMax > q()) {
                                                                O(iMax);
                                                                r8 = 1;
                                                                r22[0] = 1;
                                                                z12 = true;
                                                                r18 = 1;
                                                            } else {
                                                                r8 = 1;
                                                                r18 = r12;
                                                                z12 = z11;
                                                            }
                                                            iMax2 = Math.max(this.f3770c0, k());
                                                            if (iMax2 > k()) {
                                                                L(iMax2);
                                                                r22[r8] = r8;
                                                                r9 = r8;
                                                                z13 = r9 == true ? 1 : 0;
                                                            } else {
                                                                r4 = r18;
                                                            }
                                                            if (r4 == 0) {
                                                                z13 = z12;
                                                                if (r22[0] == 2) {
                                                                    r7 = r4;
                                                                    z17 = z13;
                                                                    if (q() > i8) {
                                                                        this.E0 = r8;
                                                                        r22[0] = r8;
                                                                        O(i8);
                                                                        ?? r16 = r8;
                                                                        z17 = r16 == true ? 1 : 0;
                                                                        r7 = r16;
                                                                    }
                                                                }
                                                                r4 = r9;
                                                                r7 = r4;
                                                                r7 = r4;
                                                                z17 = z13;
                                                                z17 = z13;
                                                                r5 = r7;
                                                                r5 = r7;
                                                                z14 = z17;
                                                                z14 = z17;
                                                                if (r22[r8] != 2) {
                                                                }
                                                                if (i12 > 8) {
                                                                    z16 = false;
                                                                } else {
                                                                    z16 = z15;
                                                                }
                                                                r12 = r6;
                                                                i11 = i12;
                                                                z6 = z9;
                                                                cVar = cVar3;
                                                                z7 = z16;
                                                            } else {
                                                                z13 = z12;
                                                                r4 = r9;
                                                                r5 = r4;
                                                                z14 = z13;
                                                            }
                                                            r5 = r7;
                                                            z14 = z17;
                                                            z15 = z14;
                                                            r6 = r5;
                                                            if (i12 > 8) {
                                                                z16 = false;
                                                            } else {
                                                                z16 = z15;
                                                            }
                                                            r12 = r6;
                                                            i11 = i12;
                                                            z6 = z9;
                                                            cVar = cVar3;
                                                            z7 = z16;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                    }
                                                } else {
                                                    cVar3 = cVar;
                                                    z9 = z6;
                                                }
                                                weakReference2 = this.I0;
                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                    cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                                    this.I0 = null;
                                                }
                                                weakReference3 = this.H0;
                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                    cVar4 = cVar2;
                                                    try {
                                                        cVar2 = cVar4;
                                                        cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                                        this.H0 = null;
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        cVar2 = cVar4;
                                                        z19 = true;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        z10 = z19;
                                                        zArr = j.f3843a;
                                                        if (z10) {
                                                            zArr[2] = false;
                                                            zW2 = W(64);
                                                            Q(cVar7, zW2);
                                                            size = this.f3802q0.size();
                                                            i15 = 0;
                                                            z18 = false;
                                                            while (i15 < size) {
                                                                dVar = (d) this.f3802q0.get(i15);
                                                                dVar.Q(cVar7, zW2);
                                                                boolean[] zArr5 = zArr;
                                                                boolean z29 = zW2;
                                                                if (dVar.f3776h == -1) {
                                                                    z18 = true;
                                                                } else {
                                                                    z18 = true;
                                                                }
                                                                i15++;
                                                                zArr = zArr5;
                                                                zW2 = z29;
                                                                z18 = z18;
                                                            }
                                                            zArr2 = zArr;
                                                            z11 = z18;
                                                        } else {
                                                            zArr2 = zArr;
                                                            Q(cVar7, zW);
                                                            while (i13 < i9) {
                                                                ((d) this.f3802q0.get(i13)).Q(cVar7, zW);
                                                            }
                                                            z11 = false;
                                                        }
                                                        if (z9) {
                                                            iMax3 = 0;
                                                            iMax4 = 0;
                                                            while (i14 < i9) {
                                                                d dVar16 = (d) this.f3802q0.get(i14);
                                                                iMax3 = Math.max(iMax3, dVar16.q() + dVar16.Y);
                                                                iMax4 = Math.max(iMax4, dVar16.k() + dVar16.Z);
                                                            }
                                                            iMax5 = Math.max(this.f3768b0, iMax3);
                                                            iMax6 = Math.max(this.f3770c0, iMax4);
                                                            z11 = z11;
                                                            r12 = r12;
                                                            if (i7 == 2) {
                                                                z11 = z11;
                                                                r12 = r12;
                                                                O(iMax5);
                                                                r22[0] = 2;
                                                                z11 = true;
                                                                r12 = 1;
                                                            }
                                                            if (i6 == 2) {
                                                                L(iMax6);
                                                                r22[1] = 2;
                                                                z11 = true;
                                                                r12 = 1;
                                                            }
                                                        }
                                                        iMax = Math.max(this.f3768b0, q());
                                                        if (iMax > q()) {
                                                            O(iMax);
                                                            r8 = 1;
                                                            r22[0] = 1;
                                                            z12 = true;
                                                            r18 = 1;
                                                        } else {
                                                            r8 = 1;
                                                            r18 = r12;
                                                            z12 = z11;
                                                        }
                                                        iMax2 = Math.max(this.f3770c0, k());
                                                        if (iMax2 > k()) {
                                                            L(iMax2);
                                                            r22[r8] = r8;
                                                            r9 = r8;
                                                            z13 = r9 == true ? 1 : 0;
                                                        } else {
                                                            r4 = r18;
                                                        }
                                                        if (r4 == 0) {
                                                            z13 = z12;
                                                            if (r22[0] == 2) {
                                                                r7 = r4;
                                                                z17 = z13;
                                                                if (q() > i8) {
                                                                    this.E0 = r8;
                                                                    r22[0] = r8;
                                                                    O(i8);
                                                                    ?? r17 = r8;
                                                                    z17 = r17 == true ? 1 : 0;
                                                                    r7 = r17;
                                                                }
                                                            }
                                                            r4 = r9;
                                                            r7 = r4;
                                                            r7 = r4;
                                                            z17 = z13;
                                                            z17 = z13;
                                                            r5 = r7;
                                                            r5 = r7;
                                                            z14 = z17;
                                                            z14 = z17;
                                                            if (r22[r8] != 2) {
                                                            }
                                                            if (i12 > 8) {
                                                                z16 = false;
                                                            } else {
                                                                z16 = z15;
                                                            }
                                                            r12 = r6;
                                                            i11 = i12;
                                                            z6 = z9;
                                                            cVar = cVar3;
                                                            z7 = z16;
                                                        } else {
                                                            z13 = z12;
                                                            r4 = r9;
                                                            r5 = r4;
                                                            z14 = z13;
                                                        }
                                                        r5 = r7;
                                                        z14 = z17;
                                                        z15 = z14;
                                                        r6 = r5;
                                                        if (i12 > 8) {
                                                            z16 = false;
                                                        } else {
                                                            z16 = z15;
                                                        }
                                                        r12 = r6;
                                                        i11 = i12;
                                                        z6 = z9;
                                                        cVar = cVar3;
                                                        z7 = z16;
                                                    }
                                                }
                                                weakReference4 = this.J0;
                                                if (weakReference4 == null && weakReference4.get() != null) {
                                                    try {
                                                        try {
                                                            cVar7.f(cVar7.k(this.K), cVar7.k((c) this.J0.get()), 0, 5);
                                                            try {
                                                                this.J0 = null;
                                                            } catch (Exception e9) {
                                                                e = e9;
                                                                z19 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z10 = z19;
                                                            }
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            z19 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z10 = z19;
                                                            zArr = j.f3843a;
                                                            if (z10) {
                                                                zArr[2] = false;
                                                                zW2 = W(64);
                                                                Q(cVar7, zW2);
                                                                size = this.f3802q0.size();
                                                                i15 = 0;
                                                                z18 = false;
                                                                while (i15 < size) {
                                                                    dVar = (d) this.f3802q0.get(i15);
                                                                    dVar.Q(cVar7, zW2);
                                                                    boolean[] zArr6 = zArr;
                                                                    boolean z210 = zW2;
                                                                    if (dVar.f3776h == -1) {
                                                                        z18 = true;
                                                                    } else {
                                                                        z18 = true;
                                                                    }
                                                                    i15++;
                                                                    zArr = zArr6;
                                                                    zW2 = z210;
                                                                    z18 = z18;
                                                                }
                                                                zArr2 = zArr;
                                                                z11 = z18;
                                                            } else {
                                                                zArr2 = zArr;
                                                                Q(cVar7, zW);
                                                                while (i13 < i9) {
                                                                    ((d) this.f3802q0.get(i13)).Q(cVar7, zW);
                                                                }
                                                                z11 = false;
                                                            }
                                                            if (z9) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i14 < i9) {
                                                                    d dVar17 = (d) this.f3802q0.get(i14);
                                                                    iMax3 = Math.max(iMax3, dVar17.q() + dVar17.Y);
                                                                    iMax4 = Math.max(iMax4, dVar17.k() + dVar17.Z);
                                                                }
                                                                iMax5 = Math.max(this.f3768b0, iMax3);
                                                                iMax6 = Math.max(this.f3770c0, iMax4);
                                                                z11 = z11;
                                                                r12 = r12;
                                                                if (i7 == 2) {
                                                                    z11 = z11;
                                                                    r12 = r12;
                                                                    O(iMax5);
                                                                    r22[0] = 2;
                                                                    z11 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i6 == 2) {
                                                                    L(iMax6);
                                                                    r22[1] = 2;
                                                                    z11 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.f3768b0, q());
                                                            if (iMax > q()) {
                                                                O(iMax);
                                                                r8 = 1;
                                                                r22[0] = 1;
                                                                z12 = true;
                                                                r18 = 1;
                                                            } else {
                                                                r8 = 1;
                                                                r18 = r12;
                                                                z12 = z11;
                                                            }
                                                            iMax2 = Math.max(this.f3770c0, k());
                                                            if (iMax2 > k()) {
                                                                L(iMax2);
                                                                r22[r8] = r8;
                                                                r9 = r8;
                                                                z13 = r9 == true ? 1 : 0;
                                                            } else {
                                                                r4 = r18;
                                                            }
                                                            if (r4 == 0) {
                                                                z13 = z12;
                                                                if (r22[0] == 2) {
                                                                    r7 = r4;
                                                                    z17 = z13;
                                                                    if (q() > i8) {
                                                                        this.E0 = r8;
                                                                        r22[0] = r8;
                                                                        O(i8);
                                                                        ?? r19 = r8;
                                                                        z17 = r19 == true ? 1 : 0;
                                                                        r7 = r19;
                                                                    }
                                                                }
                                                                r4 = r9;
                                                                r7 = r4;
                                                                r7 = r4;
                                                                z17 = z13;
                                                                z17 = z13;
                                                                r5 = r7;
                                                                r5 = r7;
                                                                z14 = z17;
                                                                z14 = z17;
                                                                if (r22[r8] != 2) {
                                                                }
                                                                if (i12 > 8) {
                                                                    z16 = false;
                                                                } else {
                                                                    z16 = z15;
                                                                }
                                                                r12 = r6;
                                                                i11 = i12;
                                                                z6 = z9;
                                                                cVar = cVar3;
                                                                z7 = z16;
                                                            } else {
                                                                z13 = z12;
                                                                r4 = r9;
                                                                r5 = r4;
                                                                z14 = z13;
                                                            }
                                                            r5 = r7;
                                                            z14 = z17;
                                                            z15 = z14;
                                                            r6 = r5;
                                                            if (i12 > 8) {
                                                                z16 = false;
                                                            } else {
                                                                z16 = z15;
                                                            }
                                                            r12 = r6;
                                                            i11 = i12;
                                                            z6 = z9;
                                                            cVar = cVar3;
                                                            z7 = z16;
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                    }
                                                }
                                                cVar7.p();
                                                z10 = true;
                                            } catch (Exception e12) {
                                                e = e12;
                                                cVar3 = cVar;
                                            }
                                        } else {
                                            cVar3 = cVar;
                                            z9 = z6;
                                            weakReference2 = this.I0;
                                            if (weakReference2 != null) {
                                                cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                                this.I0 = null;
                                            }
                                            weakReference3 = this.H0;
                                            if (weakReference3 != null) {
                                                cVar4 = cVar2;
                                                cVar2 = cVar4;
                                                cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                                this.H0 = null;
                                            }
                                            weakReference4 = this.J0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar7.p();
                                            z10 = true;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        cVar3 = cVar;
                                        z9 = z6;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    cVar3 = cVar;
                                    z9 = z6;
                                    z19 = z7;
                                }
                                zArr = j.f3843a;
                                if (z10) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(cVar7, zW2);
                                    size = this.f3802q0.size();
                                    i15 = 0;
                                    z18 = false;
                                    while (i15 < size) {
                                        dVar = (d) this.f3802q0.get(i15);
                                        dVar.Q(cVar7, zW2);
                                        boolean[] zArr7 = zArr;
                                        boolean z211 = zW2;
                                        if (dVar.f3776h == -1 || dVar.f3778i != -1) {
                                            z18 = true;
                                        }
                                        i15++;
                                        zArr = zArr7;
                                        zW2 = z211;
                                        z18 = z18;
                                    }
                                    zArr2 = zArr;
                                    z11 = z18;
                                } else {
                                    zArr2 = zArr;
                                    Q(cVar7, zW);
                                    while (i13 < i9) {
                                        ((d) this.f3802q0.get(i13)).Q(cVar7, zW);
                                    }
                                    z11 = false;
                                }
                                if (z9 && i12 < 8 && zArr2[2]) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i14 < i9) {
                                        d dVar18 = (d) this.f3802q0.get(i14);
                                        iMax3 = Math.max(iMax3, dVar18.q() + dVar18.Y);
                                        iMax4 = Math.max(iMax4, dVar18.k() + dVar18.Z);
                                    }
                                    iMax5 = Math.max(this.f3768b0, iMax3);
                                    iMax6 = Math.max(this.f3770c0, iMax4);
                                    z11 = z11;
                                    r12 = r12;
                                    if (i7 == 2 && q() < iMax5) {
                                        z11 = z11;
                                        r12 = r12;
                                        O(iMax5);
                                        r22[0] = 2;
                                        z11 = true;
                                        r12 = 1;
                                    }
                                    if (i6 == 2 && k() < iMax6) {
                                        L(iMax6);
                                        r22[1] = 2;
                                        z11 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.f3768b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r8 = 1;
                                    r22[0] = 1;
                                    z12 = true;
                                    r18 = 1;
                                } else {
                                    r8 = 1;
                                    r18 = r12;
                                    z12 = z11;
                                }
                                iMax2 = Math.max(this.f3770c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r22[r8] = r8;
                                    r9 = r8;
                                    z13 = r9 == true ? 1 : 0;
                                } else {
                                    r4 = r18;
                                }
                                if (r4 == 0) {
                                    z13 = z12;
                                    if (r22[0] == 2 && i8 > 0) {
                                        r7 = r4;
                                        z17 = z13;
                                        if (q() > i8) {
                                            this.E0 = r8;
                                            r22[0] = r8;
                                            O(i8);
                                            ?? r110 = r8;
                                            z17 = r110 == true ? 1 : 0;
                                            r7 = r110;
                                        }
                                    }
                                    r4 = r9;
                                    r7 = r4;
                                    r7 = r4;
                                    z17 = z13;
                                    z17 = z13;
                                    r5 = r7;
                                    r5 = r7;
                                    z14 = z17;
                                    z14 = z17;
                                    if (r22[r8] != 2 && i5 > 0 && k() > i5) {
                                        r5 = r7;
                                        z14 = z17;
                                        this.F0 = r8;
                                        r22[r8] = r8;
                                        L(i5);
                                        r6 = 1;
                                        z15 = true;
                                    }
                                    if (i12 > 8) {
                                        z16 = false;
                                    } else {
                                        z16 = z15;
                                    }
                                    r12 = r6;
                                    i11 = i12;
                                    z6 = z9;
                                    cVar = cVar3;
                                    z7 = z16;
                                } else {
                                    z13 = z12;
                                    r4 = r9;
                                    r5 = r4;
                                    z14 = z13;
                                }
                                r5 = r7;
                                z14 = z17;
                                z15 = z14;
                                r6 = r5;
                                if (i12 > 8) {
                                    z16 = false;
                                } else {
                                    z16 = z15;
                                }
                                r12 = r6;
                                i11 = i12;
                                z6 = z9;
                                cVar = cVar3;
                                z7 = z16;
                            }
                            z8 = r12 == true ? 1 : 0;
                            this.f3802q0 = arrayList10;
                            if (z8) {
                                r22[0] = i7;
                                r22[1] = i6;
                            }
                            F(cVar7.f3641m);
                        }
                        c5 = 1;
                        nVar = null;
                        if (r22[c5] == 2) {
                            size2 = arrayList9.size();
                            i23 = 0;
                            i24 = 0;
                            nVar2 = null;
                            while (i24 < size2) {
                                Object obj9 = arrayList9.get(i24);
                                i24++;
                                nVar3 = (n) obj9;
                                if (nVar3.f4266c != 0) {
                                    nVar2 = nVar3;
                                    i23 = iB;
                                }
                            }
                            if (nVar2 != null) {
                                N(1);
                                L(i23);
                            } else {
                                nVar2 = null;
                            }
                        } else {
                            nVar2 = null;
                        }
                        if (nVar == null) {
                        }
                        i7 = i20;
                        if (i7 == 2) {
                            i21 = i17;
                            if (i21 < q()) {
                            }
                            iQ = q();
                            i6 = i19;
                            if (i6 == 2) {
                                i22 = i18;
                                if (i22 < k()) {
                                }
                                iK = k();
                                i5 = iK;
                                i8 = iQ;
                                z4 = true;
                                if (W(64)) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                cVar7.getClass();
                                cVar7.f3636h = false;
                                if (this.D0 == 0) {
                                    c4 = 1;
                                } else {
                                    c4 = 1;
                                }
                                ArrayList arrayList11 = this.f3802q0;
                                if (r22[0] != 2) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                this.f3810z0 = 0;
                                this.A0 = 0;
                                i9 = i4;
                                while (i10 < i9) {
                                    dVar2 = (d) this.f3802q0.get(i10);
                                    if (dVar2 instanceof e) {
                                        ((e) dVar2).U();
                                    }
                                }
                                zW = W(64);
                                r12 = z4;
                                i11 = 0;
                                z7 = true;
                                while (z7) {
                                    i12 = i11 + 1;
                                    cVar7.t();
                                    this.f3810z0 = 0;
                                    this.A0 = 0;
                                    g(cVar7);
                                    while (i16 < i9) {
                                        ((d) this.f3802q0.get(i16)).g(cVar7);
                                    }
                                    S(cVar7);
                                    weakReference = this.G0;
                                    if (weakReference != null) {
                                        if (weakReference.get() != null) {
                                            cVar3 = cVar;
                                            z9 = z6;
                                            cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                                            this.G0 = null;
                                        } else {
                                            cVar3 = cVar;
                                            z9 = z6;
                                        }
                                        weakReference2 = this.I0;
                                        if (weakReference2 != null) {
                                            cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                            this.I0 = null;
                                        }
                                        weakReference3 = this.H0;
                                        if (weakReference3 != null) {
                                            cVar4 = cVar2;
                                            cVar2 = cVar4;
                                            cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                            this.H0 = null;
                                        }
                                        weakReference4 = this.J0;
                                        if (weakReference4 == null) {
                                        }
                                        cVar7.p();
                                        z10 = true;
                                    } else {
                                        cVar3 = cVar;
                                        z9 = z6;
                                        weakReference2 = this.I0;
                                        if (weakReference2 != null) {
                                            cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                            this.I0 = null;
                                        }
                                        weakReference3 = this.H0;
                                        if (weakReference3 != null) {
                                            cVar4 = cVar2;
                                            cVar2 = cVar4;
                                            cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                            this.H0 = null;
                                        }
                                        weakReference4 = this.J0;
                                        if (weakReference4 == null) {
                                        }
                                        cVar7.p();
                                        z10 = true;
                                    }
                                    zArr = j.f3843a;
                                    if (z10) {
                                        zArr[2] = false;
                                        zW2 = W(64);
                                        Q(cVar7, zW2);
                                        size = this.f3802q0.size();
                                        i15 = 0;
                                        z18 = false;
                                        while (i15 < size) {
                                            dVar = (d) this.f3802q0.get(i15);
                                            dVar.Q(cVar7, zW2);
                                            boolean[] zArr8 = zArr;
                                            boolean z212 = zW2;
                                            if (dVar.f3776h == -1) {
                                                z18 = true;
                                            } else {
                                                z18 = true;
                                            }
                                            i15++;
                                            zArr = zArr8;
                                            zW2 = z212;
                                            z18 = z18;
                                        }
                                        zArr2 = zArr;
                                        z11 = z18;
                                    } else {
                                        zArr2 = zArr;
                                        Q(cVar7, zW);
                                        while (i13 < i9) {
                                            ((d) this.f3802q0.get(i13)).Q(cVar7, zW);
                                        }
                                        z11 = false;
                                    }
                                    if (z9) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i14 < i9) {
                                            d dVar19 = (d) this.f3802q0.get(i14);
                                            iMax3 = Math.max(iMax3, dVar19.q() + dVar19.Y);
                                            iMax4 = Math.max(iMax4, dVar19.k() + dVar19.Z);
                                        }
                                        iMax5 = Math.max(this.f3768b0, iMax3);
                                        iMax6 = Math.max(this.f3770c0, iMax4);
                                        z11 = z11;
                                        r12 = r12;
                                        if (i7 == 2) {
                                            z11 = z11;
                                            r12 = r12;
                                            O(iMax5);
                                            r22[0] = 2;
                                            z11 = true;
                                            r12 = 1;
                                        }
                                        if (i6 == 2) {
                                            L(iMax6);
                                            r22[1] = 2;
                                            z11 = true;
                                            r12 = 1;
                                        }
                                    }
                                    iMax = Math.max(this.f3768b0, q());
                                    if (iMax > q()) {
                                        O(iMax);
                                        r8 = 1;
                                        r22[0] = 1;
                                        z12 = true;
                                        r18 = 1;
                                    } else {
                                        r8 = 1;
                                        r18 = r12;
                                        z12 = z11;
                                    }
                                    iMax2 = Math.max(this.f3770c0, k());
                                    if (iMax2 > k()) {
                                        L(iMax2);
                                        r22[r8] = r8;
                                        r9 = r8;
                                        z13 = r9 == true ? 1 : 0;
                                    } else {
                                        r4 = r18;
                                    }
                                    if (r4 == 0) {
                                        z13 = z12;
                                        if (r22[0] == 2) {
                                            r7 = r4;
                                            z17 = z13;
                                            if (q() > i8) {
                                                this.E0 = r8;
                                                r22[0] = r8;
                                                O(i8);
                                                ?? r111 = r8;
                                                z17 = r111 == true ? 1 : 0;
                                                r7 = r111;
                                            }
                                        }
                                        r4 = r9;
                                        r7 = r4;
                                        r7 = r4;
                                        z17 = z13;
                                        z17 = z13;
                                        r5 = r7;
                                        r5 = r7;
                                        z14 = z17;
                                        z14 = z17;
                                        if (r22[r8] != 2) {
                                        }
                                        if (i12 > 8) {
                                            z16 = false;
                                        } else {
                                            z16 = z15;
                                        }
                                        r12 = r6;
                                        i11 = i12;
                                        z6 = z9;
                                        cVar = cVar3;
                                        z7 = z16;
                                    } else {
                                        z13 = z12;
                                        r4 = r9;
                                        r5 = r4;
                                        z14 = z13;
                                    }
                                    r5 = r7;
                                    z14 = z17;
                                    z15 = z14;
                                    r6 = r5;
                                    if (i12 > 8) {
                                        z16 = false;
                                    } else {
                                        z16 = z15;
                                    }
                                    r12 = r6;
                                    i11 = i12;
                                    z6 = z9;
                                    cVar = cVar3;
                                    z7 = z16;
                                }
                                z8 = r12 == true ? 1 : 0;
                                this.f3802q0 = arrayList11;
                                if (z8) {
                                    r22[0] = i7;
                                    r22[1] = i6;
                                }
                                F(cVar7.f3641m);
                            }
                            i22 = i18;
                            iK = i22;
                            i5 = iK;
                            i8 = iQ;
                            z4 = true;
                            if (W(64)) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            cVar7.getClass();
                            cVar7.f3636h = false;
                            if (this.D0 == 0) {
                                c4 = 1;
                            } else {
                                c4 = 1;
                            }
                            ArrayList arrayList12 = this.f3802q0;
                            if (r22[0] != 2) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            this.f3810z0 = 0;
                            this.A0 = 0;
                            i9 = i4;
                            while (i10 < i9) {
                                dVar2 = (d) this.f3802q0.get(i10);
                                if (dVar2 instanceof e) {
                                    ((e) dVar2).U();
                                }
                            }
                            zW = W(64);
                            r12 = z4;
                            i11 = 0;
                            z7 = true;
                            while (z7) {
                                i12 = i11 + 1;
                                cVar7.t();
                                this.f3810z0 = 0;
                                this.A0 = 0;
                                g(cVar7);
                                while (i16 < i9) {
                                    ((d) this.f3802q0.get(i16)).g(cVar7);
                                }
                                S(cVar7);
                                weakReference = this.G0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        cVar3 = cVar;
                                        z9 = z6;
                                        cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                                        this.G0 = null;
                                    } else {
                                        cVar3 = cVar;
                                        z9 = z6;
                                    }
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        cVar4 = cVar2;
                                        cVar2 = cVar4;
                                        cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    z10 = true;
                                } else {
                                    cVar3 = cVar;
                                    z9 = z6;
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        cVar4 = cVar2;
                                        cVar2 = cVar4;
                                        cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    z10 = true;
                                }
                                zArr = j.f3843a;
                                if (z10) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(cVar7, zW2);
                                    size = this.f3802q0.size();
                                    i15 = 0;
                                    z18 = false;
                                    while (i15 < size) {
                                        dVar = (d) this.f3802q0.get(i15);
                                        dVar.Q(cVar7, zW2);
                                        boolean[] zArr9 = zArr;
                                        boolean z213 = zW2;
                                        if (dVar.f3776h == -1) {
                                            z18 = true;
                                        } else {
                                            z18 = true;
                                        }
                                        i15++;
                                        zArr = zArr9;
                                        zW2 = z213;
                                        z18 = z18;
                                    }
                                    zArr2 = zArr;
                                    z11 = z18;
                                } else {
                                    zArr2 = zArr;
                                    Q(cVar7, zW);
                                    while (i13 < i9) {
                                        ((d) this.f3802q0.get(i13)).Q(cVar7, zW);
                                    }
                                    z11 = false;
                                }
                                if (z9) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i14 < i9) {
                                        d dVar110 = (d) this.f3802q0.get(i14);
                                        iMax3 = Math.max(iMax3, dVar110.q() + dVar110.Y);
                                        iMax4 = Math.max(iMax4, dVar110.k() + dVar110.Z);
                                    }
                                    iMax5 = Math.max(this.f3768b0, iMax3);
                                    iMax6 = Math.max(this.f3770c0, iMax4);
                                    z11 = z11;
                                    r12 = r12;
                                    if (i7 == 2) {
                                        z11 = z11;
                                        r12 = r12;
                                        O(iMax5);
                                        r22[0] = 2;
                                        z11 = true;
                                        r12 = 1;
                                    }
                                    if (i6 == 2) {
                                        L(iMax6);
                                        r22[1] = 2;
                                        z11 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.f3768b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r8 = 1;
                                    r22[0] = 1;
                                    z12 = true;
                                    r18 = 1;
                                } else {
                                    r8 = 1;
                                    r18 = r12;
                                    z12 = z11;
                                }
                                iMax2 = Math.max(this.f3770c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r22[r8] = r8;
                                    r9 = r8;
                                    z13 = r9 == true ? 1 : 0;
                                } else {
                                    r4 = r18;
                                }
                                if (r4 == 0) {
                                    z13 = z12;
                                    if (r22[0] == 2) {
                                        r7 = r4;
                                        z17 = z13;
                                        if (q() > i8) {
                                            this.E0 = r8;
                                            r22[0] = r8;
                                            O(i8);
                                            ?? r112 = r8;
                                            z17 = r112 == true ? 1 : 0;
                                            r7 = r112;
                                        }
                                    }
                                    r4 = r9;
                                    r7 = r4;
                                    r7 = r4;
                                    z17 = z13;
                                    z17 = z13;
                                    r5 = r7;
                                    r5 = r7;
                                    z14 = z17;
                                    z14 = z17;
                                    if (r22[r8] != 2) {
                                    }
                                    if (i12 > 8) {
                                        z16 = false;
                                    } else {
                                        z16 = z15;
                                    }
                                    r12 = r6;
                                    i11 = i12;
                                    z6 = z9;
                                    cVar = cVar3;
                                    z7 = z16;
                                } else {
                                    z13 = z12;
                                    r4 = r9;
                                    r5 = r4;
                                    z14 = z13;
                                }
                                r5 = r7;
                                z14 = z17;
                                z15 = z14;
                                r6 = r5;
                                if (i12 > 8) {
                                    z16 = false;
                                } else {
                                    z16 = z15;
                                }
                                r12 = r6;
                                i11 = i12;
                                z6 = z9;
                                cVar = cVar3;
                                z7 = z16;
                            }
                            z8 = r12 == true ? 1 : 0;
                            this.f3802q0 = arrayList12;
                            if (z8) {
                                r22[0] = i7;
                                r22[1] = i6;
                            }
                            F(cVar7.f3641m);
                        }
                        i21 = i17;
                        iQ = i21;
                        i6 = i19;
                        if (i6 == 2) {
                            i22 = i18;
                            if (i22 < k()) {
                            }
                            iK = k();
                            i5 = iK;
                            i8 = iQ;
                            z4 = true;
                            if (W(64)) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            cVar7.getClass();
                            cVar7.f3636h = false;
                            if (this.D0 == 0) {
                                c4 = 1;
                            } else {
                                c4 = 1;
                            }
                            ArrayList arrayList13 = this.f3802q0;
                            if (r22[0] != 2) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            this.f3810z0 = 0;
                            this.A0 = 0;
                            i9 = i4;
                            while (i10 < i9) {
                                dVar2 = (d) this.f3802q0.get(i10);
                                if (dVar2 instanceof e) {
                                    ((e) dVar2).U();
                                }
                            }
                            zW = W(64);
                            r12 = z4;
                            i11 = 0;
                            z7 = true;
                            while (z7) {
                                i12 = i11 + 1;
                                cVar7.t();
                                this.f3810z0 = 0;
                                this.A0 = 0;
                                g(cVar7);
                                while (i16 < i9) {
                                    ((d) this.f3802q0.get(i16)).g(cVar7);
                                }
                                S(cVar7);
                                weakReference = this.G0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        cVar3 = cVar;
                                        z9 = z6;
                                        cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                                        this.G0 = null;
                                    } else {
                                        cVar3 = cVar;
                                        z9 = z6;
                                    }
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        cVar4 = cVar2;
                                        cVar2 = cVar4;
                                        cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    z10 = true;
                                } else {
                                    cVar3 = cVar;
                                    z9 = z6;
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        cVar4 = cVar2;
                                        cVar2 = cVar4;
                                        cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    z10 = true;
                                }
                                zArr = j.f3843a;
                                if (z10) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(cVar7, zW2);
                                    size = this.f3802q0.size();
                                    i15 = 0;
                                    z18 = false;
                                    while (i15 < size) {
                                        dVar = (d) this.f3802q0.get(i15);
                                        dVar.Q(cVar7, zW2);
                                        boolean[] zArr10 = zArr;
                                        boolean z214 = zW2;
                                        if (dVar.f3776h == -1) {
                                            z18 = true;
                                        } else {
                                            z18 = true;
                                        }
                                        i15++;
                                        zArr = zArr10;
                                        zW2 = z214;
                                        z18 = z18;
                                    }
                                    zArr2 = zArr;
                                    z11 = z18;
                                } else {
                                    zArr2 = zArr;
                                    Q(cVar7, zW);
                                    while (i13 < i9) {
                                        ((d) this.f3802q0.get(i13)).Q(cVar7, zW);
                                    }
                                    z11 = false;
                                }
                                if (z9) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i14 < i9) {
                                        d dVar111 = (d) this.f3802q0.get(i14);
                                        iMax3 = Math.max(iMax3, dVar111.q() + dVar111.Y);
                                        iMax4 = Math.max(iMax4, dVar111.k() + dVar111.Z);
                                    }
                                    iMax5 = Math.max(this.f3768b0, iMax3);
                                    iMax6 = Math.max(this.f3770c0, iMax4);
                                    z11 = z11;
                                    r12 = r12;
                                    if (i7 == 2) {
                                        z11 = z11;
                                        r12 = r12;
                                        O(iMax5);
                                        r22[0] = 2;
                                        z11 = true;
                                        r12 = 1;
                                    }
                                    if (i6 == 2) {
                                        L(iMax6);
                                        r22[1] = 2;
                                        z11 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.f3768b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r8 = 1;
                                    r22[0] = 1;
                                    z12 = true;
                                    r18 = 1;
                                } else {
                                    r8 = 1;
                                    r18 = r12;
                                    z12 = z11;
                                }
                                iMax2 = Math.max(this.f3770c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r22[r8] = r8;
                                    r9 = r8;
                                    z13 = r9 == true ? 1 : 0;
                                } else {
                                    r4 = r18;
                                }
                                if (r4 == 0) {
                                    z13 = z12;
                                    if (r22[0] == 2) {
                                        r7 = r4;
                                        z17 = z13;
                                        if (q() > i8) {
                                            this.E0 = r8;
                                            r22[0] = r8;
                                            O(i8);
                                            ?? r113 = r8;
                                            z17 = r113 == true ? 1 : 0;
                                            r7 = r113;
                                        }
                                    }
                                    r4 = r9;
                                    r7 = r4;
                                    r7 = r4;
                                    z17 = z13;
                                    z17 = z13;
                                    r5 = r7;
                                    r5 = r7;
                                    z14 = z17;
                                    z14 = z17;
                                    if (r22[r8] != 2) {
                                    }
                                    if (i12 > 8) {
                                        z16 = false;
                                    } else {
                                        z16 = z15;
                                    }
                                    r12 = r6;
                                    i11 = i12;
                                    z6 = z9;
                                    cVar = cVar3;
                                    z7 = z16;
                                } else {
                                    z13 = z12;
                                    r4 = r9;
                                    r5 = r4;
                                    z14 = z13;
                                }
                                r5 = r7;
                                z14 = z17;
                                z15 = z14;
                                r6 = r5;
                                if (i12 > 8) {
                                    z16 = false;
                                } else {
                                    z16 = z15;
                                }
                                r12 = r6;
                                i11 = i12;
                                z6 = z9;
                                cVar = cVar3;
                                z7 = z16;
                            }
                            z8 = r12 == true ? 1 : 0;
                            this.f3802q0 = arrayList13;
                            if (z8) {
                                r22[0] = i7;
                                r22[1] = i6;
                            }
                            F(cVar7.f3641m);
                        }
                        i22 = i18;
                        iK = i22;
                        i5 = iK;
                        i8 = iQ;
                        z4 = true;
                        if (W(64)) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        cVar7.getClass();
                        cVar7.f3636h = false;
                        if (this.D0 == 0) {
                            c4 = 1;
                        } else {
                            c4 = 1;
                        }
                        ArrayList arrayList14 = this.f3802q0;
                        if (r22[0] != 2) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        this.f3810z0 = 0;
                        this.A0 = 0;
                        i9 = i4;
                        while (i10 < i9) {
                            dVar2 = (d) this.f3802q0.get(i10);
                            if (dVar2 instanceof e) {
                                ((e) dVar2).U();
                            }
                        }
                        zW = W(64);
                        r12 = z4;
                        i11 = 0;
                        z7 = true;
                        while (z7) {
                            i12 = i11 + 1;
                            cVar7.t();
                            this.f3810z0 = 0;
                            this.A0 = 0;
                            g(cVar7);
                            while (i16 < i9) {
                                ((d) this.f3802q0.get(i16)).g(cVar7);
                            }
                            S(cVar7);
                            weakReference = this.G0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    cVar3 = cVar;
                                    z9 = z6;
                                    cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                                    this.G0 = null;
                                } else {
                                    cVar3 = cVar;
                                    z9 = z6;
                                }
                                weakReference2 = this.I0;
                                if (weakReference2 != null) {
                                    cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference3 = this.H0;
                                if (weakReference3 != null) {
                                    cVar4 = cVar2;
                                    cVar2 = cVar4;
                                    cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                    this.H0 = null;
                                }
                                weakReference4 = this.J0;
                                if (weakReference4 == null) {
                                }
                                cVar7.p();
                                z10 = true;
                            } else {
                                cVar3 = cVar;
                                z9 = z6;
                                weakReference2 = this.I0;
                                if (weakReference2 != null) {
                                    cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference3 = this.H0;
                                if (weakReference3 != null) {
                                    cVar4 = cVar2;
                                    cVar2 = cVar4;
                                    cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                    this.H0 = null;
                                }
                                weakReference4 = this.J0;
                                if (weakReference4 == null) {
                                }
                                cVar7.p();
                                z10 = true;
                            }
                            zArr = j.f3843a;
                            if (z10) {
                                zArr[2] = false;
                                zW2 = W(64);
                                Q(cVar7, zW2);
                                size = this.f3802q0.size();
                                i15 = 0;
                                z18 = false;
                                while (i15 < size) {
                                    dVar = (d) this.f3802q0.get(i15);
                                    dVar.Q(cVar7, zW2);
                                    boolean[] zArr11 = zArr;
                                    boolean z215 = zW2;
                                    if (dVar.f3776h == -1) {
                                        z18 = true;
                                    } else {
                                        z18 = true;
                                    }
                                    i15++;
                                    zArr = zArr11;
                                    zW2 = z215;
                                    z18 = z18;
                                }
                                zArr2 = zArr;
                                z11 = z18;
                            } else {
                                zArr2 = zArr;
                                Q(cVar7, zW);
                                while (i13 < i9) {
                                    ((d) this.f3802q0.get(i13)).Q(cVar7, zW);
                                }
                                z11 = false;
                            }
                            if (z9) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i14 < i9) {
                                    d dVar112 = (d) this.f3802q0.get(i14);
                                    iMax3 = Math.max(iMax3, dVar112.q() + dVar112.Y);
                                    iMax4 = Math.max(iMax4, dVar112.k() + dVar112.Z);
                                }
                                iMax5 = Math.max(this.f3768b0, iMax3);
                                iMax6 = Math.max(this.f3770c0, iMax4);
                                z11 = z11;
                                r12 = r12;
                                if (i7 == 2) {
                                    z11 = z11;
                                    r12 = r12;
                                    O(iMax5);
                                    r22[0] = 2;
                                    z11 = true;
                                    r12 = 1;
                                }
                                if (i6 == 2) {
                                    L(iMax6);
                                    r22[1] = 2;
                                    z11 = true;
                                    r12 = 1;
                                }
                            }
                            iMax = Math.max(this.f3768b0, q());
                            if (iMax > q()) {
                                O(iMax);
                                r8 = 1;
                                r22[0] = 1;
                                z12 = true;
                                r18 = 1;
                            } else {
                                r8 = 1;
                                r18 = r12;
                                z12 = z11;
                            }
                            iMax2 = Math.max(this.f3770c0, k());
                            if (iMax2 > k()) {
                                L(iMax2);
                                r22[r8] = r8;
                                r9 = r8;
                                z13 = r9 == true ? 1 : 0;
                            } else {
                                r4 = r18;
                            }
                            if (r4 == 0) {
                                z13 = z12;
                                if (r22[0] == 2) {
                                    r7 = r4;
                                    z17 = z13;
                                    if (q() > i8) {
                                        this.E0 = r8;
                                        r22[0] = r8;
                                        O(i8);
                                        ?? r114 = r8;
                                        z17 = r114 == true ? 1 : 0;
                                        r7 = r114;
                                    }
                                }
                                r4 = r9;
                                r7 = r4;
                                r7 = r4;
                                z17 = z13;
                                z17 = z13;
                                r5 = r7;
                                r5 = r7;
                                z14 = z17;
                                z14 = z17;
                                if (r22[r8] != 2) {
                                }
                                if (i12 > 8) {
                                    z16 = false;
                                } else {
                                    z16 = z15;
                                }
                                r12 = r6;
                                i11 = i12;
                                z6 = z9;
                                cVar = cVar3;
                                z7 = z16;
                            } else {
                                z13 = z12;
                                r4 = r9;
                                r5 = r4;
                                z14 = z13;
                            }
                            r5 = r7;
                            z14 = z17;
                            z15 = z14;
                            r6 = r5;
                            if (i12 > 8) {
                                z16 = false;
                            } else {
                                z16 = z15;
                            }
                            r12 = r6;
                            i11 = i12;
                            z6 = z9;
                            cVar = cVar3;
                            z7 = z16;
                        }
                        z8 = r12 == true ? 1 : 0;
                        this.f3802q0 = arrayList14;
                        if (z8) {
                            r22[0] = i7;
                            r22[1] = i6;
                        }
                        F(cVar7.f3641m);
                    }
                }
                i5 = i18;
                i6 = i19;
                i8 = i17;
                i7 = i20;
            }
        }
        z4 = false;
        if (W(64)) {
            z5 = true;
        } else {
            z5 = true;
        }
        cVar7.getClass();
        cVar7.f3636h = false;
        if (this.D0 == 0) {
            c4 = 1;
        } else {
            c4 = 1;
        }
        ArrayList arrayList15 = this.f3802q0;
        if (r22[0] != 2) {
            z6 = true;
        } else {
            z6 = true;
        }
        this.f3810z0 = 0;
        this.A0 = 0;
        i9 = i4;
        while (i10 < i9) {
            dVar2 = (d) this.f3802q0.get(i10);
            if (dVar2 instanceof e) {
                ((e) dVar2).U();
            }
        }
        zW = W(64);
        r12 = z4;
        i11 = 0;
        z7 = true;
        while (z7) {
            i12 = i11 + 1;
            cVar7.t();
            this.f3810z0 = 0;
            this.A0 = 0;
            g(cVar7);
            while (i16 < i9) {
                ((d) this.f3802q0.get(i16)).g(cVar7);
            }
            S(cVar7);
            weakReference = this.G0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    cVar3 = cVar;
                    z9 = z6;
                    cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                    this.G0 = null;
                } else {
                    cVar3 = cVar;
                    z9 = z6;
                }
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    cVar4 = cVar2;
                    cVar2 = cVar4;
                    cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                cVar7.p();
                z10 = true;
            } else {
                cVar3 = cVar;
                z9 = z6;
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    cVar4 = cVar2;
                    cVar2 = cVar4;
                    cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                cVar7.p();
                z10 = true;
            }
            zArr = j.f3843a;
            if (z10) {
                zArr[2] = false;
                zW2 = W(64);
                Q(cVar7, zW2);
                size = this.f3802q0.size();
                i15 = 0;
                z18 = false;
                while (i15 < size) {
                    dVar = (d) this.f3802q0.get(i15);
                    dVar.Q(cVar7, zW2);
                    boolean[] zArr12 = zArr;
                    boolean z216 = zW2;
                    if (dVar.f3776h == -1) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    i15++;
                    zArr = zArr12;
                    zW2 = z216;
                    z18 = z18;
                }
                zArr2 = zArr;
                z11 = z18;
            } else {
                zArr2 = zArr;
                Q(cVar7, zW);
                while (i13 < i9) {
                    ((d) this.f3802q0.get(i13)).Q(cVar7, zW);
                }
                z11 = false;
            }
            if (z9) {
                iMax3 = 0;
                iMax4 = 0;
                while (i14 < i9) {
                    d dVar113 = (d) this.f3802q0.get(i14);
                    iMax3 = Math.max(iMax3, dVar113.q() + dVar113.Y);
                    iMax4 = Math.max(iMax4, dVar113.k() + dVar113.Z);
                }
                iMax5 = Math.max(this.f3768b0, iMax3);
                iMax6 = Math.max(this.f3770c0, iMax4);
                z11 = z11;
                r12 = r12;
                if (i7 == 2) {
                    z11 = z11;
                    r12 = r12;
                    O(iMax5);
                    r22[0] = 2;
                    z11 = true;
                    r12 = 1;
                }
                if (i6 == 2) {
                    L(iMax6);
                    r22[1] = 2;
                    z11 = true;
                    r12 = 1;
                }
            }
            iMax = Math.max(this.f3768b0, q());
            if (iMax > q()) {
                O(iMax);
                r8 = 1;
                r22[0] = 1;
                z12 = true;
                r18 = 1;
            } else {
                r8 = 1;
                r18 = r12;
                z12 = z11;
            }
            iMax2 = Math.max(this.f3770c0, k());
            if (iMax2 > k()) {
                L(iMax2);
                r22[r8] = r8;
                r9 = r8;
                z13 = r9 == true ? 1 : 0;
            } else {
                r4 = r18;
            }
            if (r4 == 0) {
                z13 = z12;
                if (r22[0] == 2) {
                    r7 = r4;
                    z17 = z13;
                    if (q() > i8) {
                        this.E0 = r8;
                        r22[0] = r8;
                        O(i8);
                        ?? r115 = r8;
                        z17 = r115 == true ? 1 : 0;
                        r7 = r115;
                    }
                }
                r4 = r9;
                r7 = r4;
                r7 = r4;
                z17 = z13;
                z17 = z13;
                r5 = r7;
                r5 = r7;
                z14 = z17;
                z14 = z17;
                if (r22[r8] != 2) {
                }
                if (i12 > 8) {
                    z16 = false;
                } else {
                    z16 = z15;
                }
                r12 = r6;
                i11 = i12;
                z6 = z9;
                cVar = cVar3;
                z7 = z16;
            } else {
                z13 = z12;
                r4 = r9;
                r5 = r4;
                z14 = z13;
            }
            r5 = r7;
            z14 = z17;
            z15 = z14;
            r6 = r5;
            if (i12 > 8) {
                z16 = false;
            } else {
                z16 = z15;
            }
            r12 = r6;
            i11 = i12;
            z6 = z9;
            cVar = cVar3;
            z7 = z16;
        }
        z8 = r12 == true ? 1 : 0;
        this.f3802q0 = arrayList15;
        if (z8) {
            r22[0] = i7;
            r22[1] = i6;
        }
        F(cVar7.f3641m);
    }

    public final boolean W(int i4) {
        return (this.D0 & i4) == i4;
    }

    @Override // u.d
    public final void n(StringBuilder sb) {
        sb.append(this.f3780j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.f3802q0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((d) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
