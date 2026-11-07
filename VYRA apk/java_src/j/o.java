package j;

import a3.h0;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements h0.a {
    public p A;
    public MenuItem.OnActionExpandListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f2412e;
    public CharSequence f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f2413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f2414h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f2416j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f2418l;
    public final m n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e0 f2420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f2422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f2423r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2430y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f2431z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2415i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2417k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2419m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f2424s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2425t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2426u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2427v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2428w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2429x = 16;
    public boolean C = false;

    public o(m mVar, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.n = mVar;
        this.f2408a = i5;
        this.f2409b = i4;
        this.f2410c = i6;
        this.f2411d = i7;
        this.f2412e = charSequence;
        this.f2430y = i8;
    }

    public static void c(int i4, int i5, String str, StringBuilder sb) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    @Override // h0.a
    public final p a() {
        return this.A;
    }

    @Override // h0.a
    public final h0.a b(p pVar) {
        this.f2431z = null;
        this.A = pVar;
        this.n.p(true);
        p pVar2 = this.A;
        if (pVar2 != null) {
            pVar2.f2432a = new h0(16, this);
            pVar2.f2433b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2430y & 8) == 0) {
            return false;
        }
        if (this.f2431z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2428w && (this.f2426u || this.f2427v)) {
            drawable = drawable.mutate();
            if (this.f2426u) {
                drawable.setTintList(this.f2424s);
            }
            if (this.f2427v) {
                drawable.setTintMode(this.f2425t);
            }
            this.f2428w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f2430y & 8) != 0) {
            if (this.f2431z == null && (pVar = this.A) != null) {
                this.f2431z = pVar.f2433b.onCreateActionView(this);
            }
            if (this.f2431z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public final void f(boolean z4) {
        this.f2429x = (z4 ? 4 : 0) | (this.f2429x & (-5));
    }

    public final void g(boolean z4) {
        int i4 = this.f2429x;
        if (z4) {
            this.f2429x = i4 | 32;
        } else {
            this.f2429x = i4 & (-33);
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2431z;
        if (view != null) {
            return view;
        }
        p pVar = this.A;
        if (pVar == null) {
            return null;
        }
        View viewOnCreateActionView = pVar.f2433b.onCreateActionView(this);
        this.f2431z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // h0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2417k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2416j;
    }

    @Override // h0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2422q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2409b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2418l;
        if (drawable != null) {
            return d(drawable);
        }
        int i4 = this.f2419m;
        if (i4 == 0) {
            return null;
        }
        Drawable drawableW = u1.h0.w(this.n.f2384a, i4);
        this.f2419m = 0;
        this.f2418l = drawableW;
        return d(drawableW);
    }

    @Override // h0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2424s;
    }

    @Override // h0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2425t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2413g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2408a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // h0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2415i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2414h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2410c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2420o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2412e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.f2412e;
    }

    @Override // h0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2423r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2420o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2429x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2429x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2429x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.A;
        if (pVar == null || !pVar.f2433b.overridesItemVisibility()) {
            return (this.f2429x & 8) == 0;
        }
        return (this.f2429x & 8) == 0 && this.A.f2433b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        int i5;
        m mVar = this.n;
        Context context = mVar.f2384a;
        View viewInflate = LayoutInflater.from(context).inflate(i4, (ViewGroup) new LinearLayout(context), false);
        this.f2431z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i5 = this.f2408a) > 0) {
            viewInflate.setId(i5);
        }
        mVar.f2393k = true;
        mVar.p(true);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i4) {
        if (this.f2416j == c4 && this.f2417k == i4) {
            return this;
        }
        this.f2416j = Character.toLowerCase(c4);
        this.f2417k = KeyEvent.normalizeMetaState(i4);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i4 = this.f2429x;
        int i5 = (z4 ? 1 : 0) | (i4 & (-2));
        this.f2429x = i5;
        if (i4 != i5) {
            this.n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i4 = this.f2429x;
        int i5 = i4 & 4;
        m mVar = this.n;
        if (i5 == 0) {
            int i6 = (i4 & (-3)) | (z4 ? 2 : 0);
            this.f2429x = i6;
            if (i4 != i6) {
                mVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = mVar.f;
        int size = arrayList.size();
        mVar.y();
        for (int i7 = 0; i7 < size; i7++) {
            o oVar = (o) arrayList.get(i7);
            if (oVar.f2409b == this.f2409b && (oVar.f2429x & 4) != 0 && oVar.isCheckable()) {
                boolean z5 = oVar == this;
                int i8 = oVar.f2429x;
                int i9 = (z5 ? 2 : 0) | (i8 & (-3));
                oVar.f2429x = i9;
                if (i8 != i9) {
                    oVar.n.p(false);
                }
            }
        }
        mVar.x();
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final h0.a setContentDescription(CharSequence charSequence) {
        this.f2422q = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        int i4 = this.f2429x;
        if (z4) {
            this.f2429x = i4 | 16;
        } else {
            this.f2429x = i4 & (-17);
        }
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f2418l = null;
        this.f2419m = i4;
        this.f2428w = true;
        this.n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2424s = colorStateList;
        this.f2426u = true;
        this.f2428w = true;
        this.n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2425t = mode;
        this.f2427v = true;
        this.f2428w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2413g = intent;
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i4) {
        if (this.f2414h == c4 && this.f2415i == i4) {
            return this;
        }
        this.f2414h = c4;
        this.f2415i = KeyEvent.normalizeMetaState(i4);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2421p = onMenuItemClickListener;
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f2414h = c4;
        this.f2415i = KeyEvent.normalizeMetaState(i4);
        this.f2416j = Character.toLowerCase(c5);
        this.f2417k = KeyEvent.normalizeMetaState(i5);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            androidx.fragment.app.q.q("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f2430y = i4;
        m mVar = this.n;
        mVar.f2393k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2412e = charSequence;
        this.n.p(false);
        e0 e0Var = this.f2420o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final h0.a setTooltipText(CharSequence charSequence) {
        this.f2423r = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i4 = this.f2429x;
        int i5 = (z4 ? 0 : 8) | (i4 & (-9));
        this.f2429x = i5;
        if (i4 != i5) {
            m mVar = this.n;
            mVar.f2390h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2412e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2419m = 0;
        this.f2418l = drawable;
        this.f2428w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        setTitle(this.n.f2384a.getString(i4));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        if (this.f2414h == c4) {
            return this;
        }
        this.f2414h = c4;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5) {
        this.f2414h = c4;
        this.f2416j = Character.toLowerCase(c5);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        if (this.f2416j == c4) {
            return this;
        }
        this.f2416j = Character.toLowerCase(c4);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i4;
        this.f2431z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i4 = this.f2408a) > 0) {
            view.setId(i4);
        }
        m mVar = this.n;
        mVar.f2393k = true;
        mVar.p(true);
        return this;
    }
}
