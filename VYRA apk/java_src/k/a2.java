package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class a2 implements j.c0 {
    public static final Method F;
    public static final Method G;
    public final Handler A;
    public Rect C;
    public boolean D;
    public final b0 E;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListAdapter f2469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p1 f2470h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2474l;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2476o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2477p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y1 f2480s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f2481t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2482u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2483v;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2471i = -2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2472j = -2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2475m = 1002;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2478q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2479r = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x1 f2484w = new x1(this, 1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.google.android.material.timepicker.m f2485x = new com.google.android.material.timepicker.m(1, this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f2486y = new z1(this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final x1 f2487z = new x1(this, 0);
    public final Rect B = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                G = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public a2(Context context, AttributeSet attributeSet, int i4, int i5) {
        int resourceId;
        this.f = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f1644p, i4, i5);
        this.f2473k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2474l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.n = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        b0 b0Var = new b0(context, attributeSet, i4, i5);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d.a.f1648t, i4, i5);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            b0Var.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        b0Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : u1.h0.w(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.E = b0Var;
        b0Var.setInputMethodMode(1);
    }

    public final int a() {
        return this.f2473k;
    }

    @Override // j.c0
    public final boolean b() {
        return this.E.isShowing();
    }

    @Override // j.c0
    public final void c() {
        int i4;
        int iMakeMeasureSpec;
        int paddingBottom;
        p1 p1Var;
        p1 p1Var2 = this.f2470h;
        Context context = this.f;
        b0 b0Var = this.E;
        if (p1Var2 == null) {
            p1 p1VarQ = q(context, !this.D);
            this.f2470h = p1VarQ;
            p1VarQ.setAdapter(this.f2469g);
            this.f2470h.setOnItemClickListener(this.f2482u);
            this.f2470h.setFocusable(true);
            this.f2470h.setFocusableInTouchMode(true);
            this.f2470h.setOnItemSelectedListener(new u1(0, this));
            this.f2470h.setOnScrollListener(this.f2486y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2483v;
            if (onItemSelectedListener != null) {
                this.f2470h.setOnItemSelectedListener(onItemSelectedListener);
            }
            b0Var.setContentView(this.f2470h);
        }
        Drawable background = b0Var.getBackground();
        Rect rect = this.B;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i4 = rect.bottom + i5;
            if (!this.n) {
                this.f2474l = -i5;
            }
        } else {
            rect.setEmpty();
            i4 = 0;
        }
        int iA = v1.a(b0Var, this.f2481t, this.f2474l, b0Var.getInputMethodMode() == 2);
        int i6 = this.f2471i;
        if (i6 == -1) {
            paddingBottom = iA + i4;
        } else {
            int i7 = this.f2472j;
            if (i7 != -2) {
                iMakeMeasureSpec = i7 != -1 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f2470h.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f2470h.getPaddingBottom() + this.f2470h.getPaddingTop() + i4 : 0);
        }
        boolean z4 = b0Var.getInputMethodMode() == 2;
        b0Var.setWindowLayoutType(this.f2475m);
        if (b0Var.isShowing()) {
            if (this.f2481t.isAttachedToWindow()) {
                int width = this.f2472j;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f2481t.getWidth();
                }
                if (i6 == -1) {
                    i6 = z4 ? paddingBottom : -1;
                    int i8 = this.f2472j;
                    if (z4) {
                        b0Var.setWidth(i8 == -1 ? -1 : 0);
                        b0Var.setHeight(0);
                    } else {
                        b0Var.setWidth(i8 == -1 ? -1 : 0);
                        b0Var.setHeight(-1);
                    }
                } else if (i6 == -2) {
                    i6 = paddingBottom;
                }
                b0Var.setOutsideTouchable(true);
                int i9 = width;
                View view = this.f2481t;
                int i10 = this.f2473k;
                int i11 = this.f2474l;
                int i12 = i9 < 0 ? -1 : i9;
                if (i6 < 0) {
                    i6 = -1;
                }
                b0Var.update(view, i10, i11, i12, i6);
                return;
            }
            return;
        }
        int width2 = this.f2472j;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f2481t.getWidth();
        }
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = paddingBottom;
        }
        b0Var.setWidth(width2);
        b0Var.setHeight(i6);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = F;
            if (method != null) {
                try {
                    method.invoke(b0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            w1.b(b0Var, true);
        }
        b0Var.setOutsideTouchable(true);
        b0Var.setTouchInterceptor(this.f2485x);
        if (this.f2477p) {
            b0Var.setOverlapAnchor(this.f2476o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = G;
            if (method2 != null) {
                try {
                    method2.invoke(b0Var, this.C);
                } catch (Exception e5) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e5);
                }
            }
        } else {
            w1.a(b0Var, this.C);
        }
        b0Var.showAsDropDown(this.f2481t, this.f2473k, this.f2474l, this.f2478q);
        this.f2470h.setSelection(-1);
        if ((!this.D || this.f2470h.isInTouchMode()) && (p1Var = this.f2470h) != null) {
            p1Var.setListSelectionHidden(true);
            p1Var.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.f2487z);
    }

    public final Drawable d() {
        return this.E.getBackground();
    }

    @Override // j.c0
    public final void dismiss() {
        b0 b0Var = this.E;
        b0Var.dismiss();
        b0Var.setContentView(null);
        this.f2470h = null;
        this.A.removeCallbacks(this.f2484w);
    }

    @Override // j.c0
    public final p1 g() {
        return this.f2470h;
    }

    public final void h(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    public final void i(int i4) {
        this.f2474l = i4;
        this.n = true;
    }

    public final void l(int i4) {
        this.f2473k = i4;
    }

    public final int n() {
        if (this.n) {
            return this.f2474l;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        y1 y1Var = this.f2480s;
        if (y1Var == null) {
            this.f2480s = new y1(0, this);
        } else {
            ListAdapter listAdapter2 = this.f2469g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(y1Var);
            }
        }
        this.f2469g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2480s);
        }
        p1 p1Var = this.f2470h;
        if (p1Var != null) {
            p1Var.setAdapter(this.f2469g);
        }
    }

    public p1 q(Context context, boolean z4) {
        return new p1(context, z4);
    }

    public final void r(int i4) {
        Drawable background = this.E.getBackground();
        if (background == null) {
            this.f2472j = i4;
            return;
        }
        Rect rect = this.B;
        background.getPadding(rect);
        this.f2472j = rect.left + rect.right + i4;
    }
}
