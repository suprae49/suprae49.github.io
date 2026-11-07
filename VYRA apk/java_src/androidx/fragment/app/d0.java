package androidx.fragment.app;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends h0 implements c0.e, c0.f, b0.o, b0.p, androidx.lifecycle.u0, androidx.activity.k0, b.i, l1.e, x0, p0.l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e.j f670j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e.j jVar) {
        super(jVar);
        this.f670j = jVar;
    }

    @Override // androidx.activity.k0
    public final androidx.activity.j0 a() {
        return this.f670j.a();
    }

    @Override // b0.p
    public final void b(o0.a aVar) {
        this.f670j.b(aVar);
    }

    @Override // c0.e
    public final void c(o0.a aVar) {
        this.f670j.c(aVar);
    }

    @Override // p0.l
    public final void d(n0 n0Var) {
        this.f670j.d(n0Var);
    }

    @Override // b0.o
    public final void f(o0.a aVar) {
        this.f670j.f(aVar);
    }

    @Override // b0.o
    public final void g(o0.a aVar) {
        this.f670j.g(aVar);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o getLifecycle() {
        return this.f670j.f675z;
    }

    @Override // l1.e
    public final l1.c getSavedStateRegistry() {
        return this.f670j.f235i.f3011b;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 getViewModelStore() {
        return this.f670j.getViewModelStore();
    }

    @Override // c0.e
    public final void h(o0.a aVar) {
        this.f670j.h(aVar);
    }

    @Override // p0.l
    public final void i(n0 n0Var) {
        this.f670j.i(n0Var);
    }

    @Override // b.i
    public final b.h j() {
        return this.f670j.n;
    }

    @Override // c0.f
    public final void k(o0.a aVar) {
        this.f670j.k(aVar);
    }

    @Override // c0.f
    public final void l(o0.a aVar) {
        this.f670j.l(aVar);
    }

    @Override // b0.p
    public final void m(o0.a aVar) {
        this.f670j.m(aVar);
    }

    @Override // androidx.fragment.app.g0
    public final View n(int i4) {
        return this.f670j.findViewById(i4);
    }

    @Override // androidx.fragment.app.g0
    public final boolean o() {
        Window window = this.f670j.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.x0
    public final void e(Fragment fragment) {
    }
}
