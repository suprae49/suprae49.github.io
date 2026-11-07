package a4;

import android.os.Handler;
import android.os.Looper;
import b4.l;
import d4.e;
import i3.g;
import java.util.concurrent.CancellationException;
import z3.e0;
import z3.h;
import z3.i;
import z3.o;
import z3.q;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h implements o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f171j;

    public c(Handler handler, boolean z4) {
        this.f169h = handler;
        this.f170i = z4;
        this.f171j = z4 ? this : new c(handler, true);
    }

    @Override // z3.h
    public final void c(g gVar, Runnable runnable) {
        if (this.f169h.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        e0 e0Var = (e0) gVar.a(i.f4909g);
        if (e0Var != null) {
            e0Var.j(cancellationException);
        }
        e eVar = q.f4923a;
        d4.d.f1820h.c(gVar, runnable);
    }

    @Override // z3.h
    public final boolean d(g gVar) {
        return (this.f170i && r3.g.a(Looper.myLooper(), this.f169h.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f169h == this.f169h && cVar.f170i == this.f170i;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f169h) ^ (this.f170i ? 1231 : 1237);
    }

    @Override // z3.h
    public final String toString() {
        c cVar;
        String str;
        e eVar = q.f4923a;
        c cVar2 = l.f1107a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f171j;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f169h.toString();
        if (!this.f170i) {
            return string;
        }
        return string + ".immediate";
    }
}
