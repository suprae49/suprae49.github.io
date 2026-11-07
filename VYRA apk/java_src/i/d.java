package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.p;
import androidx.emoji2.text.x;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a implements j.k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f2185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ActionBarContextView f2186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f2187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WeakReference f2188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2189l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j.m f2190m;

    @Override // i.a
    public final void a() {
        if (this.f2189l) {
            return;
        }
        this.f2189l = true;
        this.f2187j.r(this);
    }

    @Override // i.a
    public final View b() {
        WeakReference weakReference = this.f2188k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // i.a
    public final j.m c() {
        return this.f2190m;
    }

    @Override // i.a
    public final MenuInflater d() {
        return new h(this.f2186i.getContext());
    }

    @Override // i.a
    public final CharSequence e() {
        return this.f2186i.getSubtitle();
    }

    @Override // i.a
    public final CharSequence f() {
        return this.f2186i.getTitle();
    }

    @Override // i.a
    public final void g() {
        this.f2187j.s(this, this.f2190m);
    }

    @Override // i.a
    public final boolean h() {
        return this.f2186i.f305x;
    }

    @Override // j.k
    public final void i(j.m mVar) {
        g();
        androidx.appcompat.widget.b bVar = this.f2186i.f291i;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // j.k
    public final boolean j(j.m mVar, MenuItem menuItem) {
        return ((x) this.f2187j.f568g).d(this, menuItem);
    }

    @Override // i.a
    public final void k(View view) {
        this.f2186i.setCustomView(view);
        this.f2188k = view != null ? new WeakReference(view) : null;
    }

    @Override // i.a
    public final void l(int i4) {
        m(this.f2185h.getString(i4));
    }

    @Override // i.a
    public final void m(CharSequence charSequence) {
        this.f2186i.setSubtitle(charSequence);
    }

    @Override // i.a
    public final void n(int i4) {
        o(this.f2185h.getString(i4));
    }

    @Override // i.a
    public final void o(CharSequence charSequence) {
        this.f2186i.setTitle(charSequence);
    }

    @Override // i.a
    public final void p(boolean z4) {
        this.f2179g = z4;
        this.f2186i.setTitleOptional(z4);
    }
}
