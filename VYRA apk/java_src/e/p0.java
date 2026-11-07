package e;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends i.a implements j.k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f1956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j.m f1957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.emoji2.text.p f1958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WeakReference f1959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q0 f1960l;

    public p0(q0 q0Var, Context context, androidx.emoji2.text.p pVar) {
        this.f1960l = q0Var;
        this.f1956h = context;
        this.f1958j = pVar;
        j.m mVar = new j.m(context);
        mVar.f2394l = 1;
        this.f1957i = mVar;
        mVar.f2388e = this;
    }

    @Override // i.a
    public final void a() {
        q0 q0Var = this.f1960l;
        if (q0Var.f1975m != this) {
            return;
        }
        boolean z4 = q0Var.f1981t;
        boolean z5 = q0Var.f1982u;
        if (z4 || z5) {
            q0Var.n = this;
            q0Var.f1976o = this.f1958j;
        } else {
            this.f1958j.r(this);
        }
        this.f1958j = null;
        q0Var.u0(false);
        ActionBarContextView actionBarContextView = q0Var.f1972j;
        if (actionBarContextView.f297p == null) {
            actionBarContextView.e();
        }
        q0Var.f1969g.setHideOnContentScrollEnabled(q0Var.f1987z);
        q0Var.f1975m = null;
    }

    @Override // i.a
    public final View b() {
        WeakReference weakReference = this.f1959k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // i.a
    public final j.m c() {
        return this.f1957i;
    }

    @Override // i.a
    public final MenuInflater d() {
        return new i.h(this.f1956h);
    }

    @Override // i.a
    public final CharSequence e() {
        return this.f1960l.f1972j.getSubtitle();
    }

    @Override // i.a
    public final CharSequence f() {
        return this.f1960l.f1972j.getTitle();
    }

    @Override // i.a
    public final void g() {
        if (this.f1960l.f1975m != this) {
            return;
        }
        j.m mVar = this.f1957i;
        mVar.y();
        try {
            this.f1958j.s(this, mVar);
        } finally {
            mVar.x();
        }
    }

    @Override // i.a
    public final boolean h() {
        return this.f1960l.f1972j.f305x;
    }

    @Override // j.k
    public final void i(j.m mVar) {
        if (this.f1958j == null) {
            return;
        }
        g();
        androidx.appcompat.widget.b bVar = this.f1960l.f1972j.f291i;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // j.k
    public final boolean j(j.m mVar, MenuItem menuItem) {
        androidx.emoji2.text.p pVar = this.f1958j;
        if (pVar != null) {
            return ((androidx.emoji2.text.x) pVar.f568g).d(this, menuItem);
        }
        return false;
    }

    @Override // i.a
    public final void k(View view) {
        this.f1960l.f1972j.setCustomView(view);
        this.f1959k = new WeakReference(view);
    }

    @Override // i.a
    public final void l(int i4) {
        m(this.f1960l.f1968e.getResources().getString(i4));
    }

    @Override // i.a
    public final void m(CharSequence charSequence) {
        this.f1960l.f1972j.setSubtitle(charSequence);
    }

    @Override // i.a
    public final void n(int i4) {
        o(this.f1960l.f1968e.getResources().getString(i4));
    }

    @Override // i.a
    public final void o(CharSequence charSequence) {
        this.f1960l.f1972j.setTitle(charSequence);
    }

    @Override // i.a
    public final void p(boolean z4) {
        this.f2179g = z4;
        this.f1960l.f1972j.setTitleOptional(z4);
    }
}
