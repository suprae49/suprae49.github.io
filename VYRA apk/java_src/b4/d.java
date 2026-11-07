package b4;

import androidx.fragment.app.u;
import com.google.android.gms.common.api.Api;
import java.util.Iterator;
import z3.e0;
import z3.i0;
import z3.k0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.emoji2.text.r f1084a = new androidx.emoji2.text.r("UNDEFINED", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.emoji2.text.r f1085b = new androidx.emoji2.text.r("REUSABLE_CLAIMED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.emoji2.text.r f1086c = new androidx.emoji2.text.r("NO_THREAD_ELEMENTS", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f1087d = new q(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f1088e = new q(1);
    public static final q f = new q(2);

    public static final void a(int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException(u.k(i4, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final void b(i3.g gVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = a.f1077a.iterator();
        while (it.hasNext()) {
            try {
                ((a4.b) it.next()).c(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    e4.a.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            e4.a.a(th, new b(gVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final void c(i3.g gVar, Object obj) {
        if (obj == f1086c) {
            return;
        }
        if (!(obj instanceof s)) {
            gVar.g(null, f1088e).getClass();
            androidx.fragment.app.q.c();
            return;
        }
        z3.f[] fVarArr = ((s) obj).f1113b;
        int length = fVarArr.length - 1;
        if (length < 0) {
            return;
        }
        z3.f fVar = fVarArr[length];
        throw null;
    }

    public static final void d(i3.c cVar, Object obj) {
        if (!(cVar instanceof c)) {
            cVar.e(obj);
            return;
        }
        c cVar2 = (c) cVar;
        z3.h hVar = cVar2.f1080i;
        k3.e eVar = cVar2.f1081j;
        i3.g gVar = eVar.f2970g;
        Throwable th = obj instanceof g3.c ? ((g3.c) obj).f : null;
        Object eVar2 = th == null ? obj : new z3.e(th);
        gVar.getClass();
        if (hVar.d(gVar)) {
            cVar2.f1082k = eVar2;
            cVar2.f1079h = 1;
            gVar.getClass();
            hVar.c(gVar, cVar2);
            return;
        }
        ThreadLocal threadLocal = i0.f4910a;
        z3.u bVar = (z3.u) threadLocal.get();
        if (bVar == null) {
            bVar = new z3.b(Thread.currentThread());
            threadLocal.set(bVar);
        }
        long j4 = bVar.f4928h;
        if (j4 >= 4294967296L) {
            cVar2.f1082k = eVar2;
            cVar2.f1079h = 1;
            h3.c cVar3 = bVar.f4930j;
            if (cVar3 == null) {
                cVar3 = new h3.c();
                bVar.f4930j = cVar3;
            }
            cVar3.addLast(cVar2);
            return;
        }
        bVar.f4928h = 4294967296L + j4;
        try {
            gVar.getClass();
            e0 e0Var = (e0) gVar.a(z3.i.f4909g);
            if (e0Var == null || e0Var.v()) {
                Object obj2 = cVar2.f1083l;
                gVar.getClass();
                Object objG = g(gVar, obj2);
                k0 k0VarF = objG != f1086c ? z3.l.f(eVar, gVar, objG) : null;
                try {
                    eVar.e(obj);
                    if (k0VarF == null || k0VarF.H()) {
                        c(gVar, objG);
                    }
                } catch (Throwable th2) {
                    if (k0VarF == null || k0VarF.H()) {
                        c(gVar, objG);
                    }
                    throw th2;
                }
            } else {
                cVar2.e(new g3.c(e0Var.p()));
            }
            while (bVar.m()) {
            }
        } catch (Throwable th3) {
            try {
                cVar2.a(th3);
            } finally {
                bVar.h();
            }
        }
    }

    public static final long e(long j4, long j5, long j6, String str) {
        String property;
        boolean z4;
        String str2;
        Long lValueOf;
        int i4 = p.f1110a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j4;
        }
        t2.i.b(10);
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
        } else {
            int i5 = 0;
            char cCharAt = property.charAt(0);
            long j7 = -9223372036854775807L;
            if (cCharAt < '0') {
                z4 = true;
                if (length != 1) {
                    if (cCharAt != '+') {
                        if (cCharAt == '-') {
                            j7 = Long.MIN_VALUE;
                            i5 = 1;
                        }
                        lValueOf = null;
                    } else {
                        z4 = false;
                        i5 = 1;
                    }
                }
                str2 = property;
                lValueOf = null;
            } else {
                z4 = false;
            }
            long j8 = 0;
            long j9 = -256204778801521550L;
            while (true) {
                if (i5 >= length) {
                    str2 = property;
                    lValueOf = z4 ? Long.valueOf(j8) : Long.valueOf(-j8);
                } else {
                    int iDigit = Character.digit((int) property.charAt(i5), 10);
                    if (iDigit >= 0) {
                        if (j8 < j9) {
                            if (j9 == -256204778801521550L) {
                                str2 = property;
                                j9 = j7 / ((long) 10);
                                if (j8 < j9) {
                                }
                            }
                            lValueOf = null;
                        } else {
                            str2 = property;
                        }
                        long j10 = j8 * ((long) 10);
                        long j11 = iDigit;
                        if (j10 < j7 + j11) {
                            lValueOf = null;
                        } else {
                            j8 = j10 - j11;
                            i5++;
                            property = str2;
                        }
                    }
                    str2 = property;
                    lValueOf = null;
                }
            }
        }
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j5 <= jLongValue && jLongValue <= j6) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j6 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int f(String str, int i4, int i5) {
        return (int) e(i4, 1, (i5 & 8) != 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 2097150, str);
    }

    public static final Object g(i3.g gVar, Object obj) {
        if (obj == null) {
            obj = gVar.g(0, f1087d);
            obj.getClass();
        }
        if (obj == 0) {
            return f1086c;
        }
        if (obj instanceof Integer) {
            return gVar.g(new s(gVar, ((Number) obj).intValue()), f);
        }
        androidx.fragment.app.q.c();
        return null;
    }
}
