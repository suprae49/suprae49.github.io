package z3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class e0 implements i3.e {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4905g = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public e0(boolean z4) {
        this._state$volatile = z4 ? l.f4919h : l.f4918g;
    }

    public static String E(Object obj) {
        if (!(obj instanceof d0)) {
            if (obj instanceof x) {
                return ((x) obj).b() ? "Active" : "New";
            }
            return obj instanceof e ? "Cancelled" : "Completed";
        }
        d0 d0Var = (d0) obj;
        if (d0Var.e()) {
            return "Cancelling";
        }
        return d0.f4899b.get(d0Var) != 0 ? "Completing" : "Active";
    }

    public static d y(b4.h hVar) {
        while (hVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b4.h.f1097b;
            b4.h hVarF = hVar.f();
            if (hVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                while (true) {
                    hVar = (b4.h) obj;
                    if (!hVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(hVar);
                }
            } else {
                hVar = hVarF;
            }
        }
        while (true) {
            hVar = hVar.h();
            if (!hVar.i()) {
                if (hVar instanceof d) {
                    return (d) hVar;
                }
                if (hVar instanceof f0) {
                    return null;
                }
            }
        }
    }

    public final void C(s sVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f0 f0Var = new f0();
        Object wVar = f0Var;
        if (!sVar.f4924a) {
            wVar = new w(f0Var);
        }
        do {
            atomicReferenceFieldUpdater = f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, wVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == sVar);
    }

    public final void D(b0 b0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f0 f0Var = new f0();
        b0Var.getClass();
        b4.h.f1097b.set(f0Var, b0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b4.h.f1096a;
        atomicReferenceFieldUpdater2.set(f0Var, b0Var);
        loop0: while (atomicReferenceFieldUpdater2.get(b0Var) == b0Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(b0Var, b0Var, f0Var)) {
                    f0Var.g(b0Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(b0Var) == b0Var);
        }
        b4.h hVarH = b0Var.h();
        do {
            atomicReferenceFieldUpdater = f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b0Var, hVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b0Var);
    }

    public final Object F(Object obj, Object obj2) {
        if (!(obj instanceof x)) {
            return l.f4914b;
        }
        if (((obj instanceof s) || (obj instanceof b0)) && !(obj instanceof d) && !(obj2 instanceof e)) {
            x xVar = (x) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object yVar = obj2 instanceof x ? new y((x) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, yVar)) {
                if (atomicReferenceFieldUpdater.get(this) != xVar) {
                    return l.f4916d;
                }
            }
            A(obj2);
            m(xVar, obj2);
            return obj2;
        }
        x xVar2 = (x) obj;
        f0 f0VarR = r(xVar2);
        if (f0VarR == null) {
            return l.f4916d;
        }
        d0 d0Var = xVar2 instanceof d0 ? (d0) xVar2 : null;
        if (d0Var == null) {
            d0Var = new d0(f0VarR, null);
        }
        synchronized (d0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d0.f4899b;
            if (atomicIntegerFieldUpdater.get(d0Var) != 0) {
                return l.f4914b;
            }
            atomicIntegerFieldUpdater.set(d0Var, 1);
            if (d0Var != xVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, xVar2, d0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != xVar2) {
                        return l.f4916d;
                    }
                }
            }
            boolean zE = d0Var.e();
            e eVar = obj2 instanceof e ? (e) obj2 : null;
            if (eVar != null) {
                d0Var.a(eVar.f4904a);
            }
            Throwable thC = zE ? null : d0Var.c();
            if (thC != null) {
                z(f0VarR, thC);
            }
            d dVarY = y(f0VarR);
            if (dVarY != null && G(d0Var, dVarY, obj2)) {
                return l.f4915c;
            }
            f0VarR.e(new b4.f(2), 2);
            d dVarY2 = y(f0VarR);
            return (dVarY2 == null || !G(d0Var, dVarY2, obj2)) ? o(d0Var, obj2) : l.f4915c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [b4.h, java.lang.Object, z3.b0, z3.c0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [b4.h, z3.f0] */
    public final boolean G(d0 d0Var, d dVar, Object obj) {
        boolean zE;
        do {
            e0 e0Var = dVar.f4898e;
            ?? c0Var = new c0(this, d0Var, dVar, obj);
            e0Var.getClass();
            c0Var.f4894d = e0Var;
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                Object obj2 = atomicReferenceFieldUpdater.get(e0Var);
                boolean z4 = obj2 instanceof s;
                g0 g0Var = g0.f4907a;
                boolean z5 = true;
                if (z4) {
                    s sVar = (s) obj2;
                    if (sVar.f4924a) {
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(e0Var, obj2, c0Var)) {
                                if (!z5) {
                                    c0Var = g0Var;
                                }
                            } else if (atomicReferenceFieldUpdater.get(e0Var) != obj2) {
                            }
                        }
                    } else {
                        e0Var.C(sVar);
                    }
                } else {
                    if (obj2 instanceof x) {
                        x xVar = (x) obj2;
                        ?? D = xVar.d();
                        if (D == 0) {
                            e0Var.D((b0) obj2);
                        } else {
                            if (c0Var.k()) {
                                d0 d0Var2 = xVar instanceof d0 ? (d0) xVar : null;
                                if ((d0Var2 != null ? d0Var2.c() : null) == null) {
                                    zE = D.e(c0Var, 5);
                                }
                                c0Var = g0Var;
                            } else {
                                zE = D.e(c0Var, 1);
                            }
                            if (zE) {
                            }
                        }
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        c0Var = g0Var;
                    }
                }
                if (c0Var != g0.f4907a) {
                    return true;
                }
                dVar = y(dVar);
            }
        } while (dVar != null);
        return false;
    }

    @Override // i3.g
    public final i3.e a(i3.f fVar) {
        fVar.getClass();
        if (r3.g.a(i.f4909g, fVar)) {
            return this;
        }
        return null;
    }

    @Override // i3.g
    public final i3.g b(i3.g gVar) {
        return e4.a.W(this, gVar);
    }

    @Override // i3.g
    public final i3.g f(i3.f fVar) {
        fVar.getClass();
        return r3.g.a(i.f4909g, fVar) ? i3.h.f : this;
    }

    @Override // i3.g
    public final Object g(Object obj, q3.p pVar) {
        return pVar.f(obj, this);
    }

    @Override // i3.e
    public final i3.f getKey() {
        return i.f4909g;
    }

    public void i(Object obj) {
        h(obj);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b A[PHI: r0
      0x003b: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0005, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004c, B:26:0x0059, B:31:0x0061, B:33:0x006a, B:34:0x006e), top: B:79:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004c, B:26:0x0059, B:31:0x0061, B:33:0x006a, B:34:0x006e), top: B:79:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006a A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:24:0x004c, B:26:0x0059, B:31:0x0061, B:33:0x006a, B:34:0x006e), top: B:79:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[LOOP:2: B:53:0x00ac->B:96:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003f, please report this as an issue */
    public final boolean j(Object obj) {
        Throwable thN;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        Throwable thC;
        androidx.emoji2.text.r rVar;
        x xVar;
        f0 f0VarR;
        d0 d0Var;
        Object objF;
        Object objF2 = l.f4914b;
        if (this instanceof a0) {
            do {
                Object obj3 = f.get(this);
                if (obj3 instanceof x) {
                    if (obj3 instanceof d0) {
                        if (d0.f4899b.get((d0) obj3) != 0) {
                        }
                    }
                    objF2 = F(obj3, new e(n(obj)));
                }
                objF2 = l.f4914b;
                break;
            } while (objF2 == l.f4916d);
            if (objF2 != l.f4915c) {
                if (objF2 == l.f4914b) {
                    thN = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof d0) {
                            synchronized (obj2) {
                                if (d0.f4901d.get((d0) obj2) == l.f) {
                                    rVar = l.f4917e;
                                } else {
                                    boolean zE = ((d0) obj2).e();
                                    if (thN == null) {
                                        thN = n(obj);
                                    }
                                    ((d0) obj2).a(thN);
                                    thC = zE ? null : ((d0) obj2).c();
                                    if (thC != null) {
                                        z(((d0) obj2).f4902a, thC);
                                    }
                                    rVar = l.f4914b;
                                }
                            }
                        } else if (obj2 instanceof x) {
                            if (thN == null) {
                                thN = n(obj);
                            }
                            xVar = (x) obj2;
                            if (xVar.b()) {
                                f0VarR = r(xVar);
                                if (f0VarR == null) {
                                    continue;
                                } else {
                                    d0Var = new d0(f0VarR, thN);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, xVar, d0Var)) {
                                            z(f0VarR, thN);
                                            rVar = l.f4914b;
                                        } else if (atomicReferenceFieldUpdater.get(this) != xVar) {
                                        }
                                    }
                                }
                            } else {
                                objF = F(obj2, new e(thN));
                                if (objF != l.f4914b) {
                                    androidx.fragment.app.q.v(obj2, "Cannot happen in ");
                                    return false;
                                }
                                if (objF != l.f4916d) {
                                    objF2 = objF;
                                    break;
                                }
                            }
                        } else {
                            rVar = l.f4917e;
                        }
                        objF2 = rVar;
                        break;
                    }
                }
                if (objF2 != l.f4914b && objF2 != l.f4915c) {
                    if (objF2 == l.f4917e) {
                        return false;
                    }
                    h(objF2);
                    return true;
                }
            }
        } else {
            if (objF2 == l.f4914b) {
                thN = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof d0) {
                        synchronized (obj2) {
                            if (d0.f4901d.get((d0) obj2) == l.f) {
                                rVar = l.f4917e;
                            } else {
                                boolean zE2 = ((d0) obj2).e();
                                if (thN == null) {
                                    thN = n(obj);
                                }
                                ((d0) obj2).a(thN);
                                if (zE2) {
                                }
                                if (thC != null) {
                                    z(((d0) obj2).f4902a, thC);
                                }
                                rVar = l.f4914b;
                            }
                        }
                    } else if (obj2 instanceof x) {
                        if (thN == null) {
                            thN = n(obj);
                        }
                        xVar = (x) obj2;
                        if (xVar.b()) {
                            f0VarR = r(xVar);
                            if (f0VarR == null) {
                                continue;
                            } else {
                                d0Var = new d0(f0VarR, thN);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, xVar, d0Var)) {
                                        z(f0VarR, thN);
                                        rVar = l.f4914b;
                                    } else if (atomicReferenceFieldUpdater.get(this) != xVar) {
                                    }
                                }
                            }
                        } else {
                            objF = F(obj2, new e(thN));
                            if (objF != l.f4914b) {
                                androidx.fragment.app.q.v(obj2, "Cannot happen in ");
                                return false;
                            }
                            if (objF != l.f4916d) {
                                objF2 = objF;
                                break;
                            }
                        }
                    } else {
                        rVar = l.f4917e;
                    }
                    objF2 = rVar;
                    break;
                }
            }
            if (objF2 != l.f4914b) {
                if (objF2 == l.f4917e) {
                    return false;
                }
                h(objF2);
                return true;
            }
        }
        return true;
    }

    public final boolean k(Throwable th) {
        if (w()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        c cVar = (c) f4905g.get(this);
        if (cVar == null || cVar == g0.f4907a) {
            return z4;
        }
        return cVar.c(th) || z4;
    }

    public String l() {
        return "Job was cancelled";
    }

    public final void m(x xVar, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4905g;
        c cVar = (c) atomicReferenceFieldUpdater.get(this);
        if (cVar != null) {
            cVar.a();
            atomicReferenceFieldUpdater.set(this, g0.f4907a);
        }
        androidx.fragment.app.z zVar = null;
        e eVar = obj instanceof e ? (e) obj : null;
        Throwable th = eVar != null ? eVar.f4904a : null;
        if (xVar instanceof b0) {
            try {
                ((b0) xVar).l(th);
                return;
            } catch (Throwable th2) {
                t(new androidx.fragment.app.z("Exception in completion handler " + xVar + " for " + this, th2));
                return;
            }
        }
        f0 f0VarD = xVar.d();
        if (f0VarD != null) {
            f0VarD.e(new b4.f(1), 1);
            Object obj2 = b4.h.f1096a.get(f0VarD);
            obj2.getClass();
            for (b4.h hVarH = (b4.h) obj2; !hVarH.equals(f0VarD); hVarH = hVarH.h()) {
                if (hVarH instanceof b0) {
                    try {
                        ((b0) hVarH).l(th);
                    } catch (Throwable th3) {
                        if (zVar != null) {
                            e4.a.a(zVar, th3);
                        } else {
                            zVar = new androidx.fragment.app.z("Exception in completion handler " + hVarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (zVar != null) {
                t(zVar);
            }
        }
    }

    public final Throwable n(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        e0 e0Var = (e0) obj;
        Object obj2 = f.get(e0Var);
        if (obj2 instanceof d0) {
            thC = ((d0) obj2).c();
        } else if (obj2 instanceof e) {
            thC = ((e) obj2).f4904a;
        } else {
            if (obj2 instanceof x) {
                androidx.fragment.app.q.v(obj2, "Cannot be cancelling child in this state: ");
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new z("Parent job is ".concat(E(obj2)), thC, e0Var) : cancellationException;
    }

    public final Object o(d0 d0Var, Object obj) {
        Object obj2 = null;
        Throwable zVar = null;
        e eVar = obj instanceof e ? (e) obj : null;
        Throwable th = eVar != null ? eVar.f4904a : null;
        synchronized (d0Var) {
            d0Var.e();
            ArrayList arrayListF = d0Var.f(th);
            if (!arrayListF.isEmpty()) {
                int size = arrayListF.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayListF.get(i4);
                    i4++;
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                zVar = (Throwable) obj2;
                if (zVar == null) {
                    zVar = (Throwable) arrayListF.get(0);
                }
            } else if (d0Var.e()) {
                zVar = new z(l(), null, this);
            }
            if (zVar != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size2 = arrayListF.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj4 = arrayListF.get(i5);
                    i5++;
                    Throwable th2 = (Throwable) obj4;
                    if (th2 != zVar && th2 != zVar && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        e4.a.a(zVar, th2);
                    }
                }
            }
        }
        if (zVar != null && zVar != th) {
            obj = new e(zVar);
        }
        if (zVar != null && (k(zVar) || s(zVar))) {
            obj.getClass();
            e.f4903b.compareAndSet((e) obj, 0, 1);
        }
        A(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        Object yVar = obj instanceof x ? new y((x) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, d0Var, yVar) && atomicReferenceFieldUpdater.get(this) == d0Var) {
        }
        m(d0Var, obj);
        return obj;
    }

    public final CancellationException p() {
        CancellationException cancellationException;
        Object obj = f.get(this);
        if (obj instanceof d0) {
            Throwable thC = ((d0) obj).c();
            if (thC == null) {
                androidx.fragment.app.q.v(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
            return cancellationException == null ? new z(strConcat, thC, this) : cancellationException;
        }
        if (obj instanceof x) {
            androidx.fragment.app.q.v(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof e)) {
            return new z(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((e) obj).f4904a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new z(l(), th, this) : cancellationException;
    }

    public boolean q() {
        return true;
    }

    public final f0 r(x xVar) {
        f0 f0VarD = xVar.d();
        if (f0VarD != null) {
            return f0VarD;
        }
        if (xVar instanceof s) {
            return new f0();
        }
        if (xVar instanceof b0) {
            D((b0) xVar);
            return null;
        }
        androidx.fragment.app.q.v(xVar, "State should have list: ");
        return null;
    }

    public boolean s(Throwable th) {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + E(f.get(this)) + '}');
        sb.append('@');
        sb.append(l.b(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [b4.h, java.lang.Object, z3.b0, z3.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, z3.r] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r5v10, types: [b4.h, z3.f0] */
    public final void u(e0 e0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4905g;
        g0 g0Var = g0.f4907a;
        if (e0Var == null) {
            atomicReferenceFieldUpdater2.set(this, g0Var);
            return;
        }
        loop0: while (true) {
            atomicReferenceFieldUpdater = f;
            Object obj = atomicReferenceFieldUpdater.get(e0Var);
            if (!(obj instanceof s)) {
                if (!(obj instanceof w)) {
                    break;
                }
                f0 f0Var = ((w) obj).f4931a;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(e0Var, obj, f0Var)) {
                        e0Var.getClass();
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(e0Var) == obj);
            } else {
                if (((s) obj).f4924a) {
                    break;
                }
                s sVar = l.f4919h;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(e0Var, obj, sVar)) {
                        e0Var.getClass();
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(e0Var) == obj);
            }
        }
        ?? dVar = new d(this);
        dVar.f4894d = e0Var;
        loop2: while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(e0Var);
            if (!(obj2 instanceof s)) {
                Throwable thC = null;
                if (obj2 instanceof x) {
                    ?? D = ((x) obj2).d();
                    if (D != 0) {
                        if (!D.e(dVar, 7)) {
                            boolean zE = D.e(dVar, 3);
                            Object obj3 = atomicReferenceFieldUpdater.get(e0Var);
                            if (obj3 instanceof d0) {
                                thC = ((d0) obj3).c();
                            } else {
                                e eVar = obj3 instanceof e ? (e) obj3 : null;
                                if (eVar != null) {
                                    thC = eVar.f4904a;
                                }
                            }
                            dVar.l(thC);
                            if (!zE) {
                                break;
                            } else {
                                break;
                            }
                        }
                        break;
                    }
                    e0Var.D((b0) obj2);
                } else {
                    Object obj4 = atomicReferenceFieldUpdater.get(e0Var);
                    e eVar2 = obj4 instanceof e ? (e) obj4 : null;
                    dVar.l(eVar2 != null ? eVar2.f4904a : null);
                }
                dVar = g0Var;
                break;
            }
            s sVar2 = (s) obj2;
            if (sVar2.f4924a) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(e0Var, obj2, dVar)) {
                        break loop2;
                    }
                } while (atomicReferenceFieldUpdater.get(e0Var) == obj2);
            } else {
                e0Var.C(sVar2);
            }
        }
        atomicReferenceFieldUpdater2.set(this, dVar);
        if (atomicReferenceFieldUpdater.get(this) instanceof x) {
            return;
        }
        dVar.a();
        atomicReferenceFieldUpdater2.set(this, g0Var);
    }

    public boolean v() {
        Object obj = f.get(this);
        return (obj instanceof x) && ((x) obj).b();
    }

    public boolean w() {
        return false;
    }

    public final Object x(Object obj) {
        Object objF;
        do {
            objF = F(f.get(this), obj);
            if (objF == l.f4914b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                e eVar = obj instanceof e ? (e) obj : null;
                throw new IllegalStateException(str, eVar != null ? eVar.f4904a : null);
            }
        } while (objF == l.f4916d);
        return objF;
    }

    public final void z(f0 f0Var, Throwable th) {
        f0Var.e(new b4.f(4), 4);
        Object obj = b4.h.f1096a.get(f0Var);
        obj.getClass();
        androidx.fragment.app.z zVar = null;
        for (b4.h hVarH = (b4.h) obj; !hVarH.equals(f0Var); hVarH = hVarH.h()) {
            if ((hVarH instanceof b0) && ((b0) hVarH).k()) {
                try {
                    ((b0) hVarH).l(th);
                } catch (Throwable th2) {
                    if (zVar != null) {
                        e4.a.a(zVar, th2);
                    } else {
                        zVar = new androidx.fragment.app.z("Exception in completion handler " + hVarH + " for " + this, th2);
                    }
                }
            }
        }
        if (zVar != null) {
            t(zVar);
        }
        k(th);
    }

    public void A(Object obj) {
    }

    public void h(Object obj) {
    }

    public void t(androidx.fragment.app.z zVar) {
        throw zVar;
    }

    public void B() {
    }
}
