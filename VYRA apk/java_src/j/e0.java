package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class e0 extends m implements SubMenu {
    public final o A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m f2349z;

    public e0(Context context, m mVar, o oVar) {
        super(context);
        this.f2349z = mVar;
        this.A = oVar;
    }

    @Override // j.m
    public final boolean d(o oVar) {
        return this.f2349z.d(oVar);
    }

    @Override // j.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f2349z.e(mVar, menuItem);
    }

    @Override // j.m
    public final boolean f(o oVar) {
        return this.f2349z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // j.m
    public final String j() {
        o oVar = this.A;
        int i4 = oVar != null ? oVar.f2408a : 0;
        if (i4 == 0) {
            return null;
        }
        return androidx.fragment.app.u.k(i4, "android:menu:actionviewstates:");
    }

    @Override // j.m
    public final m k() {
        return this.f2349z.k();
    }

    @Override // j.m
    public final boolean m() {
        return this.f2349z.m();
    }

    @Override // j.m
    public final boolean n() {
        return this.f2349z.n();
    }

    @Override // j.m
    public final boolean o() {
        return this.f2349z.o();
    }

    @Override // j.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f2349z.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // j.m, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f2349z.setQwertyMode(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i4) {
        this.A.setIcon(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i4) {
        w(0, null, i4, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i4) {
        w(i4, null, 0, null, null);
        return this;
    }
}
