package j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import co.median.android.eeqadjy.R;
import k.f2;
import k.p1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f2326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f2327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f2328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2332m;
    public final f2 n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f2336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f2337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x f2338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ViewTreeObserver f2339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2342x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2344z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f2333o = new d(1, this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d3.q f2334p = new d3.q(4, this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2343y = 0;

    public d0(int i4, int i5, Context context, View view, m mVar, boolean z4) {
        this.f2326g = context;
        this.f2327h = mVar;
        this.f2329j = z4;
        this.f2328i = new j(mVar, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.f2331l = i4;
        this.f2332m = i5;
        Resources resources = context.getResources();
        this.f2330k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2336r = view;
        this.n = new f2(context, null, i4, i5);
        mVar.b(this, context);
    }

    @Override // j.y
    public final void a(m mVar, boolean z4) {
        if (mVar != this.f2327h) {
            return;
        }
        dismiss();
        x xVar = this.f2338t;
        if (xVar != null) {
            xVar.a(mVar, z4);
        }
    }

    @Override // j.c0
    public final boolean b() {
        return !this.f2340v && this.n.E.isShowing();
    }

    @Override // j.c0
    public final void c() {
        View view;
        if (b()) {
            return;
        }
        if (this.f2340v || (view = this.f2336r) == null) {
            androidx.fragment.app.q.j("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.f2337s = view;
        f2 f2Var = this.n;
        k.b0 b0Var = f2Var.E;
        k.b0 b0Var2 = f2Var.E;
        b0Var.setOnDismissListener(this);
        f2Var.f2482u = this;
        f2Var.D = true;
        b0Var2.setFocusable(true);
        View view2 = this.f2337s;
        boolean z4 = this.f2339u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2339u = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2333o);
        }
        view2.addOnAttachStateChangeListener(this.f2334p);
        f2Var.f2481t = view2;
        f2Var.f2478q = this.f2343y;
        boolean z5 = this.f2341w;
        Context context = this.f2326g;
        j jVar = this.f2328i;
        if (!z5) {
            this.f2342x = u.o(jVar, context, this.f2330k);
            this.f2341w = true;
        }
        f2Var.r(this.f2342x);
        b0Var2.setInputMethodMode(2);
        Rect rect = this.f;
        f2Var.C = rect != null ? new Rect(rect) : null;
        f2Var.c();
        p1 p1Var = f2Var.f2470h;
        p1Var.setOnKeyListener(this);
        if (this.f2344z) {
            m mVar = this.f2327h;
            if (mVar.f2395m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) p1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f2395m);
                }
                frameLayout.setEnabled(false);
                p1Var.addHeaderView(frameLayout, null, false);
            }
        }
        f2Var.p(jVar);
        f2Var.c();
    }

    @Override // j.c0
    public final void dismiss() {
        if (b()) {
            this.n.dismiss();
        }
    }

    @Override // j.y
    public final void f(boolean z4) {
        this.f2341w = false;
        j jVar = this.f2328i;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // j.c0
    public final p1 g() {
        return this.n.f2470h;
    }

    @Override // j.y
    public final boolean i() {
        return false;
    }

    @Override // j.y
    public final Parcelable j() {
        return null;
    }

    @Override // j.y
    public final void l(x xVar) {
        this.f2338t = xVar;
    }

    @Override // j.y
    public final boolean m(e0 e0Var) {
        boolean z4;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f2331l, this.f2332m, this.f2326g, this.f2337s, e0Var, this.f2329j);
            x xVar = this.f2338t;
            wVar.f2448i = xVar;
            u uVar = wVar.f2449j;
            if (uVar != null) {
                uVar.l(xVar);
            }
            int size = e0Var.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i4++;
            }
            wVar.f2447h = z4;
            u uVar2 = wVar.f2449j;
            if (uVar2 != null) {
                uVar2.q(z4);
            }
            wVar.f2450k = this.f2335q;
            this.f2335q = null;
            this.f2327h.c(false);
            f2 f2Var = this.n;
            int width = f2Var.f2473k;
            int iN = f2Var.n();
            if ((Gravity.getAbsoluteGravity(this.f2343y, this.f2336r.getLayoutDirection()) & 7) == 5) {
                width += this.f2336r.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f != null) {
                    wVar.d(width, iN, true, true);
                }
            }
            x xVar2 = this.f2338t;
            if (xVar2 != null) {
                xVar2.h(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2340v = true;
        this.f2327h.c(true);
        ViewTreeObserver viewTreeObserver = this.f2339u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2339u = this.f2337s.getViewTreeObserver();
            }
            this.f2339u.removeGlobalOnLayoutListener(this.f2333o);
            this.f2339u = null;
        }
        this.f2337s.removeOnAttachStateChangeListener(this.f2334p);
        PopupWindow.OnDismissListener onDismissListener = this.f2335q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.u
    public final void p(View view) {
        this.f2336r = view;
    }

    @Override // j.u
    public final void q(boolean z4) {
        this.f2328i.f2379h = z4;
    }

    @Override // j.u
    public final void r(int i4) {
        this.f2343y = i4;
    }

    @Override // j.u
    public final void s(int i4) {
        this.n.f2473k = i4;
    }

    @Override // j.u
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f2335q = onDismissListener;
    }

    @Override // j.u
    public final void u(boolean z4) {
        this.f2344z = z4;
    }

    @Override // j.u
    public final void v(int i4) {
        this.n.i(i4);
    }

    @Override // j.y
    public final void e(Parcelable parcelable) {
    }

    @Override // j.u
    public final void n(m mVar) {
    }
}
