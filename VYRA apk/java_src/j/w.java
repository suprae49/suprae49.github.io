package j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f2442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2445e;
    public View f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f2448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u f2449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2450k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2446g = 8388611;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v f2451l = new v(this);

    public w(int i4, int i5, Context context, View view, m mVar, boolean z4) {
        this.f2441a = context;
        this.f2442b = mVar;
        this.f = view;
        this.f2443c = z4;
        this.f2444d = i4;
        this.f2445e = i5;
    }

    public final u a() {
        u d0Var;
        if (this.f2449j == null) {
            Context context = this.f2441a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f2441a;
            if (iMin >= dimensionPixelSize) {
                d0Var = new g(context2, this.f, this.f2444d, this.f2445e, this.f2443c);
            } else {
                View view = this.f;
                d0Var = new d0(this.f2444d, this.f2445e, context2, view, this.f2442b, this.f2443c);
            }
            d0Var.n(this.f2442b);
            d0Var.t(this.f2451l);
            d0Var.p(this.f);
            d0Var.l(this.f2448i);
            d0Var.q(this.f2447h);
            d0Var.r(this.f2446g);
            this.f2449j = d0Var;
        }
        return this.f2449j;
    }

    public final boolean b() {
        u uVar = this.f2449j;
        return uVar != null && uVar.b();
    }

    public void c() {
        this.f2449j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2450k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i4, int i5, boolean z4, boolean z5) {
        u uVarA = a();
        uVarA.u(z5);
        if (z4) {
            if ((Gravity.getAbsoluteGravity(this.f2446g, this.f.getLayoutDirection()) & 7) == 5) {
                i4 -= this.f.getWidth();
            }
            uVarA.s(i4);
            uVarA.v(i5);
            int i6 = (int) ((this.f2441a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            uVarA.f = new Rect(i4 - i6, i5 - i6, i4 + i6, i5 + i6);
        }
        uVarA.c();
    }
}
