package e;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.g1;
import k.g3;
import k.k3;
import p0.r0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends u1.h0 implements k.d {
    public static final AccelerateInterpolator D = new AccelerateInterpolator();
    public static final DecelerateInterpolator E = new DecelerateInterpolator();
    public final o0 A;
    public final o0 B;
    public final a3.h0 C;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f1968e;
    public Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarOverlayLayout f1969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActionBarContainer f1970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g1 f1971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ActionBarContextView f1972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f1973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p0 f1975m;
    public p0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.emoji2.text.p f1976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f1978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1981t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1982u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1983v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i.j f1985x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1986y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1987z;

    public q0(Activity activity, boolean z4) {
        new ArrayList();
        this.f1978q = new ArrayList();
        this.f1979r = 0;
        this.f1980s = true;
        this.f1984w = true;
        this.A = new o0(this, 0);
        this.B = new o0(this, 1);
        this.C = new a3.h0(9, this);
        View decorView = activity.getWindow().getDecorView();
        v0(decorView);
        if (z4) {
            return;
        }
        this.f1973k = decorView.findViewById(R.id.content);
    }

    @Override // u1.h0
    public final Context C() {
        if (this.f == null) {
            TypedValue typedValue = new TypedValue();
            this.f1968e.getTheme().resolveAttribute(co.median.android.eeqadjy.R.attr.actionBarWidgetTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                this.f = new ContextThemeWrapper(this.f1968e, i4);
            } else {
                this.f = this.f1968e;
            }
        }
        return this.f;
    }

    @Override // u1.h0
    public final void E() {
        if (this.f1981t) {
            return;
        }
        this.f1981t = true;
        x0(false);
    }

    @Override // u1.h0
    public final boolean J() {
        int height = this.f1970h.getHeight();
        if (this.f1984w) {
            return height == 0 || this.f1969g.getActionBarHideOffset() < height;
        }
        return false;
    }

    @Override // u1.h0
    public final void M() {
        w0(this.f1968e.getResources().getBoolean(co.median.android.eeqadjy.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // u1.h0
    public final boolean Q(int i4, KeyEvent keyEvent) {
        j.m mVar;
        p0 p0Var = this.f1975m;
        if (p0Var == null || (mVar = p0Var.f1957i) == null) {
            return false;
        }
        mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return mVar.performShortcut(i4, keyEvent, 0);
    }

    @Override // u1.h0
    public final void Y(boolean z4) {
        if (this.f1974l) {
            return;
        }
        Z(z4);
    }

    @Override // u1.h0
    public final void Z(boolean z4) {
        int i4 = z4 ? 4 : 0;
        k3 k3Var = (k3) this.f1971i;
        int i5 = k3Var.f2563b;
        this.f1974l = true;
        k3Var.a((i4 & 4) | (i5 & (-5)));
    }

    @Override // u1.h0
    public final void a0() {
        k3 k3Var = (k3) this.f1971i;
        k3Var.a((k3Var.f2563b & (-3)) | 2);
    }

    @Override // u1.h0
    public final void e0(int i4) {
        ((k3) this.f1971i).b(i4);
    }

    @Override // u1.h0
    public final void f0(Drawable drawable) {
        k3 k3Var = (k3) this.f1971i;
        k3Var.f = drawable;
        int i4 = k3Var.f2563b & 4;
        Toolbar toolbar = k3Var.f2562a;
        if (i4 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = k3Var.f2574o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // u1.h0
    public final void k0(boolean z4) {
        i.j jVar;
        this.f1986y = z4;
        if (z4 || (jVar = this.f1985x) == null) {
            return;
        }
        jVar.a();
    }

    @Override // u1.h0
    public final boolean l() {
        g3 g3Var;
        g1 g1Var = this.f1971i;
        if (g1Var == null || (g3Var = ((k3) g1Var).f2562a.R) == null || g3Var.f2522g == null) {
            return false;
        }
        g3 g3Var2 = ((k3) g1Var).f2562a.R;
        j.o oVar = g3Var2 == null ? null : g3Var2.f2522g;
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // u1.h0
    public final void n0(CharSequence charSequence) {
        k3 k3Var = (k3) this.f1971i;
        if (k3Var.f2567g) {
            return;
        }
        Toolbar toolbar = k3Var.f2562a;
        k3Var.f2568h = charSequence;
        if ((k3Var.f2563b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (k3Var.f2567g) {
                p0.p0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // u1.h0
    public final void o0() {
        if (this.f1981t) {
            this.f1981t = false;
            x0(false);
        }
    }

    @Override // u1.h0
    public final i.a p0(androidx.emoji2.text.p pVar) {
        p0 p0Var = this.f1975m;
        if (p0Var != null) {
            p0Var.a();
        }
        this.f1969g.setHideOnContentScrollEnabled(false);
        this.f1972j.e();
        p0 p0Var2 = new p0(this, this.f1972j.getContext(), pVar);
        j.m mVar = p0Var2.f1957i;
        mVar.y();
        try {
            boolean zE = ((androidx.emoji2.text.x) p0Var2.f1958j.f568g).e(p0Var2, mVar);
            mVar.x();
            if (!zE) {
                return null;
            }
            this.f1975m = p0Var2;
            p0Var2.g();
            this.f1972j.c(p0Var2);
            u0(true);
            return p0Var2;
        } catch (Throwable th) {
            mVar.x();
            throw th;
        }
    }

    @Override // u1.h0
    public final void t(boolean z4) {
        if (z4 == this.f1977p) {
            return;
        }
        this.f1977p = z4;
        ArrayList arrayList = this.f1978q;
        if (arrayList.size() > 0) {
            throw androidx.fragment.app.u.i(0, arrayList);
        }
    }

    public final void u0(boolean z4) {
        r0 r0VarA;
        r0 r0VarI;
        boolean z5 = this.f1983v;
        if (z4) {
            if (!z5) {
                this.f1983v = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1969g;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                x0(false);
            }
        } else if (z5) {
            this.f1983v = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1969g;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            x0(false);
        }
        boolean zIsLaidOut = this.f1970h.isLaidOut();
        g1 g1Var = this.f1971i;
        if (!zIsLaidOut) {
            if (z4) {
                ((k3) g1Var).f2562a.setVisibility(4);
                this.f1972j.setVisibility(0);
                return;
            } else {
                ((k3) g1Var).f2562a.setVisibility(0);
                this.f1972j.setVisibility(8);
                return;
            }
        }
        if (z4) {
            k3 k3Var = (k3) g1Var;
            r0VarI = p0.p0.a(k3Var.f2562a);
            r0VarI.a(0.0f);
            r0VarI.c(100L);
            r0VarI.d(new i.i(k3Var, 4));
            r0VarA = this.f1972j.i(0, 200L);
        } else {
            k3 k3Var2 = (k3) g1Var;
            r0VarA = p0.p0.a(k3Var2.f2562a);
            r0VarA.a(1.0f);
            r0VarA.c(200L);
            r0VarA.d(new i.i(k3Var2, 0));
            r0VarI = this.f1972j.i(8, 100L);
        }
        i.j jVar = new i.j();
        ArrayList arrayList = jVar.f2228a;
        arrayList.add(r0VarI);
        View view = (View) r0VarI.f3240a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) r0VarA.f3240a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(r0VarA);
        jVar.b();
    }

    @Override // u1.h0
    public final int v() {
        return ((k3) this.f1971i).f2563b;
    }

    public final void v0(View view) {
        g1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(co.median.android.eeqadjy.R.id.decor_content_parent);
        this.f1969g = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(co.median.android.eeqadjy.R.id.action_bar);
        if (callbackFindViewById instanceof g1) {
            wrapper = (g1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f1971i = wrapper;
        this.f1972j = (ActionBarContextView) view.findViewById(co.median.android.eeqadjy.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(co.median.android.eeqadjy.R.id.action_bar_container);
        this.f1970h = actionBarContainer;
        g1 g1Var = this.f1971i;
        if (g1Var == null || this.f1972j == null || actionBarContainer == null) {
            androidx.fragment.app.q.j(q0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((k3) g1Var).f2562a.getContext();
        this.f1968e = context;
        if ((((k3) this.f1971i).f2563b & 4) != 0) {
            this.f1974l = true;
        }
        int i4 = context.getApplicationInfo().targetSdkVersion;
        this.f1971i.getClass();
        w0(context.getResources().getBoolean(co.median.android.eeqadjy.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f1968e.obtainStyledAttributes(null, d.a.f1631a, co.median.android.eeqadjy.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1969g;
            if (!actionBarOverlayLayout2.f312l) {
                androidx.fragment.app.q.j("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.f1987z = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1970h;
            WeakHashMap weakHashMap = p0.p0.f3233a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void w0(boolean z4) {
        if (z4) {
            this.f1970h.setTabContainer(null);
            ((k3) this.f1971i).getClass();
        } else {
            ((k3) this.f1971i).getClass();
            this.f1970h.setTabContainer(null);
        }
        this.f1971i.getClass();
        ((k3) this.f1971i).f2562a.setCollapsible(false);
        this.f1969g.setHasNonEmbeddedTabs(false);
    }

    public final void x0(boolean z4) {
        boolean z5 = this.f1983v || !(this.f1981t || this.f1982u);
        boolean z6 = this.f1984w;
        a3.h0 h0Var = this.C;
        View view = this.f1973k;
        if (!z5) {
            if (z6) {
                this.f1984w = false;
                i.j jVar = this.f1985x;
                if (jVar != null) {
                    jVar.a();
                }
                int i4 = this.f1979r;
                o0 o0Var = this.A;
                if (i4 != 0 || (!this.f1986y && !z4)) {
                    o0Var.a();
                    return;
                }
                this.f1970h.setAlpha(1.0f);
                this.f1970h.setTransitioning(true);
                i.j jVar2 = new i.j();
                float f = -this.f1970h.getHeight();
                if (z4) {
                    int[] iArr = {0, 0};
                    this.f1970h.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                r0 r0VarA = p0.p0.a(this.f1970h);
                r0VarA.e(f);
                View view2 = (View) r0VarA.f3240a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(h0Var != null ? new d3.i(h0Var, view2) : null);
                }
                boolean z7 = jVar2.f2232e;
                ArrayList arrayList = jVar2.f2228a;
                if (!z7) {
                    arrayList.add(r0VarA);
                }
                if (this.f1980s && view != null) {
                    r0 r0VarA2 = p0.p0.a(view);
                    r0VarA2.e(f);
                    if (!jVar2.f2232e) {
                        arrayList.add(r0VarA2);
                    }
                }
                boolean z8 = jVar2.f2232e;
                if (!z8) {
                    jVar2.f2230c = D;
                }
                if (!z8) {
                    jVar2.f2229b = 250L;
                }
                if (!z8) {
                    jVar2.f2231d = o0Var;
                }
                this.f1985x = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (z6) {
            return;
        }
        this.f1984w = true;
        i.j jVar3 = this.f1985x;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f1970h.setVisibility(0);
        int i5 = this.f1979r;
        o0 o0Var2 = this.B;
        if (i5 == 0 && (this.f1986y || z4)) {
            this.f1970h.setTranslationY(0.0f);
            float f4 = -this.f1970h.getHeight();
            if (z4) {
                int[] iArr2 = {0, 0};
                this.f1970h.getLocationInWindow(iArr2);
                f4 -= iArr2[1];
            }
            this.f1970h.setTranslationY(f4);
            i.j jVar4 = new i.j();
            r0 r0VarA3 = p0.p0.a(this.f1970h);
            r0VarA3.e(0.0f);
            View view3 = (View) r0VarA3.f3240a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(h0Var != null ? new d3.i(h0Var, view3) : null);
            }
            boolean z9 = jVar4.f2232e;
            ArrayList arrayList2 = jVar4.f2228a;
            if (!z9) {
                arrayList2.add(r0VarA3);
            }
            if (this.f1980s && view != null) {
                view.setTranslationY(f4);
                r0 r0VarA4 = p0.p0.a(view);
                r0VarA4.e(0.0f);
                if (!jVar4.f2232e) {
                    arrayList2.add(r0VarA4);
                }
            }
            boolean z10 = jVar4.f2232e;
            if (!z10) {
                jVar4.f2230c = E;
            }
            if (!z10) {
                jVar4.f2229b = 250L;
            }
            if (!z10) {
                jVar4.f2231d = o0Var2;
            }
            this.f1985x = jVar4;
            jVar4.b();
        } else {
            this.f1970h.setAlpha(1.0f);
            this.f1970h.setTranslationY(0.0f);
            if (this.f1980s && view != null) {
                view.setTranslationY(0.0f);
            }
            o0Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1969g;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = p0.p0.f3233a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public q0(Dialog dialog) {
        new ArrayList();
        this.f1978q = new ArrayList();
        this.f1979r = 0;
        this.f1980s = true;
        this.f1984w = true;
        this.A = new o0(this, 0);
        this.B = new o0(this, 1);
        this.C = new a3.h0(9, this);
        v0(dialog.getWindow().getDecorView());
    }
}
