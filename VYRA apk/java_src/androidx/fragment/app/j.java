package androidx.fragment.app;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0.e f705b;

    public j(o1 o1Var, k0.e eVar) {
        this.f704a = o1Var;
        this.f705b = eVar;
    }

    public final void a() {
        o1 o1Var = this.f704a;
        HashSet hashSet = o1Var.f740e;
        if (hashSet.remove(this.f705b) && hashSet.isEmpty()) {
            o1Var.b();
        }
    }

    public final boolean b() {
        o1 o1Var = this.f704a;
        int iC = u.c(o1Var.f738c.mView);
        int i4 = o1Var.f736a;
        if (iC != i4) {
            return (iC == 2 || i4 == 2) ? false : true;
        }
        return true;
    }
}
