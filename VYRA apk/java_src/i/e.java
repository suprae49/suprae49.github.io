package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import j.b0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2192b;

    public e(Context context, a aVar) {
        this.f2191a = context;
        this.f2192b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2192b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2192b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new b0(this.f2191a, this.f2192b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2192b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2192b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2192b.f;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2192b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2192b.f2179g;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2192b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2192b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2192b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2192b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2192b.f = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2192b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z4) {
        this.f2192b.p(z4);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i4) {
        this.f2192b.l(i4);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i4) {
        this.f2192b.n(i4);
    }
}
