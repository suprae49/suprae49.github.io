package b4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z3.e0;
import z3.i0;
import z3.k0;
import z3.u;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d4.h implements k3.b, i3.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1078m = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z3.h f1080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k3.e f1081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f1082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f1083l;

    public c(z3.h hVar, k3.e eVar) {
        super(0L, false);
        this.f1079h = -1;
        this.f1080i = hVar;
        this.f1081j = eVar;
        this.f1082k = d.f1084a;
        i3.g gVar = eVar.f2970g;
        gVar.getClass();
        Object objG = gVar.g(0, d.f1087d);
        objG.getClass();
        this.f1083l = objG;
    }

    public final void a(Throwable th) {
        z3.k kVar = new z3.k("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th);
        i3.g gVar = this.f1081j.f2970g;
        gVar.getClass();
        z3.l.c(gVar, kVar);
    }

    @Override // k3.b
    public final k3.b c() {
        return this.f1081j;
    }

    @Override // i3.c
    public final i3.g d() {
        i3.g gVar = this.f1081j.f2970g;
        gVar.getClass();
        return gVar;
    }

    @Override // i3.c
    public final void e(Object obj) {
        Throwable th = obj instanceof g3.c ? ((g3.c) obj).f : null;
        Object eVar = th == null ? obj : new z3.e(th);
        k3.e eVar2 = this.f1081j;
        i3.g gVar = eVar2.f2970g;
        gVar.getClass();
        z3.h hVar = this.f1080i;
        if (hVar.d(gVar)) {
            this.f1082k = eVar;
            this.f1079h = 0;
            gVar.getClass();
            hVar.c(gVar, this);
            return;
        }
        ThreadLocal threadLocal = i0.f4910a;
        u bVar = (u) threadLocal.get();
        if (bVar == null) {
            bVar = new z3.b(Thread.currentThread());
            threadLocal.set(bVar);
        }
        long j4 = bVar.f4928h;
        if (j4 >= 4294967296L) {
            this.f1082k = eVar;
            this.f1079h = 0;
            h3.c cVar = bVar.f4930j;
            if (cVar == null) {
                cVar = new h3.c();
                bVar.f4930j = cVar;
            }
            cVar.addLast(this);
            return;
        }
        bVar.f4928h = 4294967296L + j4;
        try {
            gVar.getClass();
            Object objG = d.g(gVar, this.f1083l);
            try {
                eVar2.e(obj);
                d.c(gVar, objG);
                while (bVar.m()) {
                }
            } catch (Throwable th2) {
                d.c(gVar, objG);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                a(th3);
            } finally {
                bVar.h();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        try {
            k3.e eVar = this.f1081j;
            i3.g gVar = eVar.f2970g;
            Object obj = this.f1083l;
            gVar.getClass();
            Object objG = d.g(gVar, obj);
            e0 e0Var = null;
            k0 k0VarF = objG != d.f1086c ? z3.l.f(eVar, gVar, objG) : null;
            try {
                gVar.getClass();
                Object obj2 = this.f1082k;
                this.f1082k = d.f1084a;
                z3.e eVar2 = obj2 instanceof z3.e ? (z3.e) obj2 : null;
                Throwable th = eVar2 != null ? eVar2.f4904a : null;
                if (th == null && ((i4 = this.f1079h) == 1 || i4 == 2)) {
                    e0Var = (e0) gVar.a(z3.i.f4909g);
                }
                if (e0Var != null && !e0Var.v()) {
                    eVar.e(new g3.c(e0Var.p()));
                } else if (th != null) {
                    eVar.e(new g3.c(th));
                } else {
                    eVar.e(obj2);
                }
            } finally {
                if (k0VarF == null || k0VarF.H()) {
                    d.c(gVar, objG);
                }
            }
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1080i + ", " + z3.l.e(this.f1081j) + ']';
    }
}
