package z3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import u1.f1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.emoji2.text.r f4913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.emoji2.text.r f4914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.emoji2.text.r f4915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.emoji2.text.r f4916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.emoji2.text.r f4917e;
    public static final androidx.emoji2.text.r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f4918g = new s(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s f4919h = new s(true);

    static {
        int i4 = 1;
        f4913a = new androidx.emoji2.text.r("CLOSED_EMPTY", i4);
        f4914b = new androidx.emoji2.text.r("COMPLETING_ALREADY", i4);
        f4915c = new androidx.emoji2.text.r("COMPLETING_WAITING_CHILDREN", i4);
        f4916d = new androidx.emoji2.text.r("COMPLETING_RETRY", i4);
        f4917e = new androidx.emoji2.text.r("TOO_LATE_TO_CANCEL", i4);
        f = new androidx.emoji2.text.r("SEALED", i4);
    }

    public static final i3.g a(i3.g gVar, i3.g gVar2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) gVar.g(bool, new b4.q(7))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) gVar2.g(bool, new b4.q(7))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return gVar.b(gVar2);
        }
        b4.q qVar = new b4.q(5);
        i3.h hVar = i3.h.f;
        i3.g gVar3 = (i3.g) gVar.g(hVar, qVar);
        Object objG = gVar2;
        if (zBooleanValue2) {
            objG = gVar2.g(hVar, new b4.q(6));
        }
        return gVar3.b((i3.g) objG);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void c(i3.g gVar, Throwable th) {
        try {
            a4.b bVar = (a4.b) gVar.a(i.f);
            if (bVar != null) {
                bVar.c(th);
            } else {
                b4.d.b(gVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                e4.a.a(runtimeException, th);
                th = runtimeException;
            }
            b4.d.b(gVar, th);
        }
    }

    public static final Object d(Object obj) {
        return obj instanceof e ? new g3.c(((e) obj).f4904a) : obj;
    }

    public static final String e(k3.e eVar) {
        Object cVar;
        try {
            cVar = eVar + '@' + b(eVar);
        } catch (Throwable th) {
            cVar = new g3.c(th);
        }
        if ((cVar instanceof g3.c ? ((g3.c) cVar).f : null) != null) {
            cVar = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [k3.e] */
    /* JADX WARN: Type inference failed for: r2v1, types: [k3.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [k3.b] */
    public static final k0 f(k3.e eVar, i3.g gVar, Object obj) {
        k0 k0Var = null;
        if (eVar != 0 && gVar.a(l0.f) != null) {
            while (!(eVar instanceof p) && (eVar = eVar.c()) != 0) {
                if (eVar instanceof k0) {
                    k0Var = (k0) eVar;
                    break;
                }
            }
            if (k0Var != null) {
                k0Var.I(gVar, obj);
            }
        }
        return k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object g(a4.c cVar, q3.p pVar, f1 f1Var) throws Throwable {
        x xVar;
        i3.g gVar = f1Var.f2970g;
        gVar.getClass();
        i3.g gVarB = !((Boolean) cVar.g(Boolean.FALSE, new b4.q(7))).booleanValue() ? gVar.b(cVar) : a(gVar, cVar, false);
        e0 e0Var = (e0) gVarB.a(i.f4909g);
        if (e0Var != null && !e0Var.v()) {
            throw e0Var.p();
        }
        if (gVarB == gVar) {
            b4.o oVar = new b4.o(gVarB, f1Var);
            return e4.a.i0(oVar, oVar, pVar);
        }
        i3.d dVar = i3.d.f;
        if (r3.g.a(gVarB.a(dVar), gVar.a(dVar))) {
            k0 k0Var = new k0(gVarB, f1Var);
            i3.g gVar2 = k0Var.f4892h;
            Object objG = b4.d.g(gVar2, null);
            try {
                return e4.a.i0(k0Var, k0Var, pVar);
            } finally {
                b4.d.c(gVar2, objG);
            }
        }
        p pVar2 = new p(gVarB, f1Var);
        try {
            b4.d.d(e4.a.N(((k3.e) pVar).h(pVar2, pVar2)), g3.g.f2156a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p.f4922j;
            do {
                int i4 = atomicIntegerFieldUpdater.get(pVar2);
                if (i4 != 0) {
                    if (i4 != 2) {
                        androidx.fragment.app.q.j("Already suspended");
                        return null;
                    }
                    Object obj = e0.f.get(pVar2);
                    y yVar = obj instanceof y ? (y) obj : null;
                    if (yVar != null && (xVar = yVar.f4932a) != null) {
                        obj = xVar;
                    }
                    if (obj instanceof e) {
                        throw ((e) obj).f4904a;
                    }
                    return obj;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(pVar2, 0, 1));
            return j3.a.f;
        } catch (Throwable th) {
            pVar2.e(new g3.c(th));
            throw th;
        }
    }
}
