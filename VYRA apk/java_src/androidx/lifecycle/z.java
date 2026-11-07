package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f876j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f877a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m.f f878b = new m.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f879c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f881e;
    public volatile Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f884i;

    public z() {
        Object obj = f876j;
        this.f = obj;
        this.f881e = obj;
        this.f882g = -1;
    }

    public static void a(String str) {
        ((l.a) l.a.o0().f2974h).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        androidx.fragment.app.q.j(androidx.fragment.app.u.m("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(y yVar) {
        if (yVar.f873g) {
            if (!yVar.d()) {
                yVar.b(false);
                return;
            }
            int i4 = yVar.f874h;
            int i5 = this.f882g;
            if (i4 >= i5) {
                return;
            }
            yVar.f874h = i5;
            b0 b0Var = yVar.f;
            Object obj = this.f881e;
            androidx.fragment.app.w wVar = (androidx.fragment.app.w) b0Var;
            wVar.getClass();
            t tVar = (t) obj;
            androidx.fragment.app.p pVar = (androidx.fragment.app.p) wVar.f773g;
            if (tVar == null || !pVar.mShowsDialog) {
                return;
            }
            View viewRequireView = pVar.requireView();
            if (viewRequireView.getParent() != null) {
                androidx.fragment.app.q.j("DialogFragment can not be attached to a container view");
                return;
            }
            if (pVar.mDialog != null) {
                if (androidx.fragment.app.u0.G(3)) {
                    Log.d("FragmentManager", "DialogFragment " + wVar + " setting the content view on " + pVar.mDialog);
                }
                pVar.mDialog.setContentView(viewRequireView);
            }
        }
    }

    public final void c(y yVar) {
        if (this.f883h) {
            this.f884i = true;
            return;
        }
        this.f883h = true;
        do {
            this.f884i = false;
            if (yVar != null) {
                b(yVar);
                yVar = null;
            } else {
                m.f fVar = this.f878b;
                fVar.getClass();
                m.d dVar = new m.d(fVar);
                fVar.f3049h.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((y) ((Map.Entry) dVar.next()).getValue());
                    if (this.f884i) {
                        break;
                    }
                }
            }
        } while (this.f884i);
        this.f883h = false;
    }

    public final void d(b0 b0Var) {
        Object obj;
        a("observeForever");
        x xVar = new x(this, b0Var);
        m.f fVar = this.f878b;
        m.c cVarA = fVar.a(b0Var);
        if (cVarA != null) {
            obj = cVarA.f3043g;
        } else {
            m.c cVar = new m.c(b0Var, xVar);
            fVar.f3050i++;
            m.c cVar2 = fVar.f3048g;
            if (cVar2 == null) {
                fVar.f = cVar;
                fVar.f3048g = cVar;
            } else {
                cVar2.f3044h = cVar;
                cVar.f3045i = cVar2;
                fVar.f3048g = cVar;
            }
            obj = null;
        }
        y yVar = (y) obj;
        if (yVar instanceof LiveData$LifecycleBoundObserver) {
            androidx.fragment.app.q.q("Cannot add the same observer with different lifecycles");
        } else {
            if (yVar != null) {
                return;
            }
            xVar.b(true);
        }
    }
}
