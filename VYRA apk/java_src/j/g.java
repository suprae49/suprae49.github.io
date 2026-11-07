package j;

import a3.h0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import co.median.android.eeqadjy.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k.c2;
import k.d2;
import k.f2;
import k.p1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public x C;
    public ViewTreeObserver D;
    public PopupWindow.OnDismissListener E;
    public boolean F;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f2353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f2358l;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f2365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f2366u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2367v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2369x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2370y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2371z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f2359m = new ArrayList();
    public final ArrayList n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f2360o = new d(0, this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d3.q f2361p = new d3.q(3, this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h0 f2362q = new h0(15, this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2363r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2364s = 0;
    public boolean A = false;

    public g(Context context, View view, int i4, int i5, boolean z4) {
        this.f2353g = context;
        this.f2365t = view;
        this.f2355i = i4;
        this.f2356j = i5;
        this.f2357k = z4;
        this.f2367v = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2354h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2358l = new Handler();
    }

    @Override // j.y
    public final void a(m mVar, boolean z4) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (mVar == ((f) arrayList.get(i4)).f2351b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            return;
        }
        int i5 = i4 + 1;
        if (i5 < arrayList.size()) {
            ((f) arrayList.get(i5)).f2351b.c(false);
        }
        f fVar = (f) arrayList.remove(i4);
        m mVar2 = fVar.f2351b;
        f2 f2Var = fVar.f2350a;
        k.b0 b0Var = f2Var.E;
        mVar2.r(this);
        if (this.F) {
            c2.b(b0Var, null);
            b0Var.setAnimationStyle(0);
        }
        f2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2367v = ((f) arrayList.get(size2 - 1)).f2352c;
        } else {
            this.f2367v = this.f2365t.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((f) arrayList.get(0)).f2351b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.C;
        if (xVar != null) {
            xVar.a(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.D.removeGlobalOnLayoutListener(this.f2360o);
            }
            this.D = null;
        }
        this.f2366u.removeOnAttachStateChangeListener(this.f2361p);
        this.E.onDismiss();
    }

    @Override // j.c0
    public final boolean b() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f2350a.E.isShowing();
    }

    @Override // j.c0
    public final void c() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f2359m;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            w((m) obj);
        }
        arrayList.clear();
        View view = this.f2365t;
        this.f2366u = view;
        if (view != null) {
            boolean z4 = this.D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.D = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2360o);
            }
            this.f2366u.addOnAttachStateChangeListener(this.f2361p);
        }
    }

    @Override // j.c0
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                f fVar = fVarArr[i4];
                if (fVar.f2350a.E.isShowing()) {
                    fVar.f2350a.dismiss();
                }
            }
        }
    }

    @Override // j.y
    public final void f(boolean z4) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ListAdapter adapter = ((f) obj).f2350a.f2470h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.c0
    public final p1 g() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f2350a.f2470h;
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
        this.C = xVar;
    }

    @Override // j.y
    public final boolean m(e0 e0Var) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            f fVar = (f) obj;
            if (e0Var == fVar.f2351b) {
                fVar.f2350a.f2470h.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        n(e0Var);
        x xVar = this.C;
        if (xVar != null) {
            xVar.h(e0Var);
        }
        return true;
    }

    @Override // j.u
    public final void n(m mVar) {
        mVar.b(this, this.f2353g);
        if (b()) {
            w(mVar);
        } else {
            this.f2359m.add(mVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i4);
            if (!fVar.f2350a.E.isShowing()) {
                break;
            } else {
                i4++;
            }
        }
        if (fVar != null) {
            fVar.f2351b.c(false);
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
        if (this.f2365t != view) {
            this.f2365t = view;
            this.f2364s = Gravity.getAbsoluteGravity(this.f2363r, view.getLayoutDirection());
        }
    }

    @Override // j.u
    public final void q(boolean z4) {
        this.A = z4;
    }

    @Override // j.u
    public final void r(int i4) {
        if (this.f2363r != i4) {
            this.f2363r = i4;
            this.f2364s = Gravity.getAbsoluteGravity(i4, this.f2365t.getLayoutDirection());
        }
    }

    @Override // j.u
    public final void s(int i4) {
        this.f2368w = true;
        this.f2370y = i4;
    }

    @Override // j.u
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // j.u
    public final void u(boolean z4) {
        this.B = z4;
    }

    @Override // j.u
    public final void v(int i4) {
        this.f2369x = true;
        this.f2371z = i4;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x0156  */
    /* JADX WARN: Code duplicated, block: B:67:0x0164  */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x0169  */
    /* JADX WARN: Code duplicated, block: B:72:0x0171  */
    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    /* JADX WARN: Code duplicated, block: B:75:0x0176  */
    /* JADX WARN: Code duplicated, block: B:78:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0183  */
    /* JADX WARN: Code duplicated, block: B:80:0x0185  */
    /* JADX WARN: Code duplicated, block: B:81:0x018d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0190  */
    /* JADX WARN: Code duplicated, block: B:84:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bc  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void w(m mVar) {
        boolean z4;
        char c4;
        f fVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i4;
        k.b0 b0Var;
        p1 p1Var;
        int[] iArr;
        Rect rect3;
        int i5;
        boolean z5;
        int i6;
        Method method;
        MenuItem item;
        j jVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f2353g;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        j jVar2 = new j(mVar, layoutInflaterFrom, this.f2357k, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.A) {
            jVar2.f2379h = true;
        } else if (b()) {
            int size = mVar.f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item2 = mVar.getItem(i7);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i7++;
            }
            jVar2.f2379h = z4;
        }
        int iO = u.o(jVar2, context, this.f2354h);
        f2 f2Var = new f2(context, null, this.f2355i, this.f2356j);
        f2Var.H = this.f2362q;
        f2Var.f2482u = this;
        f2Var.E.setOnDismissListener(this);
        f2Var.f2481t = this.f2365t;
        f2Var.f2478q = this.f2364s;
        f2Var.D = true;
        f2Var.E.setFocusable(true);
        f2Var.E.setInputMethodMode(2);
        f2Var.p(jVar2);
        f2Var.r(iO);
        f2Var.f2478q = this.f2364s;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            fVar = (f) arrayList.get(arrayList.size() - 1);
            m mVar2 = fVar.f2351b;
            int size2 = mVar2.f.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size2) {
                    item = null;
                    break;
                }
                item = mVar2.getItem(i8);
                if (item.hasSubMenu() && mVar == item.getSubMenu()) {
                    break;
                } else {
                    i8++;
                }
            }
            if (item == null) {
                childAt = null;
                c4 = 0;
            } else {
                p1 p1Var2 = fVar.f2350a.f2470h;
                ListAdapter adapter = p1Var2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    jVar = (j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jVar = (j) adapter;
                    headersCount = 0;
                }
                int count = jVar.getCount();
                int i9 = 0;
                while (true) {
                    c4 = 0;
                    if (i9 >= count) {
                        i9 = -1;
                        break;
                    } else if (item == jVar.getItem(i9)) {
                        break;
                    } else {
                        i9++;
                    }
                }
                if (i9 != -1 && (firstVisiblePosition = (i9 + headersCount) - p1Var2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < p1Var2.getChildCount()) {
                    childAt = p1Var2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i4 = Build.VERSION.SDK_INT;
                b0Var = f2Var.E;
                if (i4 <= 28) {
                    method = f2.I;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[1];
                            objArr[c4] = Boolean.FALSE;
                            method.invoke(b0Var, objArr);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    d2.a(b0Var, c4);
                }
                c2.a(f2Var.E, null);
                p1Var = ((f) arrayList.get(arrayList.size() - 1)).f2350a.f2470h;
                iArr = new int[2];
                p1Var.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.f2366u.getWindowVisibleDisplayFrame(rect3);
                if (this.f2367v == 1) {
                    if (p1Var.getWidth() + iArr[0] + iO > rect3.right) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                } else if (iArr[0] - iO < 0) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                if (i5 == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f2367v = i5;
                f2Var.f2481t = childAt;
                if ((this.f2364s & 5) == 5) {
                    i6 = 0;
                    if (z5) {
                        iO = childAt.getWidth();
                    } else {
                        iO = 0 - iO;
                    }
                } else if (z5) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    iO = 0 - childAt.getWidth();
                }
                f2Var.f2473k = iO;
                f2Var.f2477p = true;
                f2Var.f2476o = true;
                f2Var.i(i6);
            } else {
                if (this.f2368w) {
                    f2Var.f2473k = this.f2370y;
                }
                if (this.f2369x) {
                    f2Var.i(this.f2371z);
                }
                rect = this.f;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                f2Var.C = rect2;
            }
            arrayList.add(new f(f2Var, mVar, this.f2367v));
            f2Var.c();
            p1 p1Var3 = f2Var.f2470h;
            p1Var3.setOnKeyListener(this);
            if (fVar == null || !this.B || mVar.f2395m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) p1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(mVar.f2395m);
            p1Var3.addHeaderView(frameLayout, null, false);
            f2Var.c();
            return;
        }
        c4 = 0;
        fVar = null;
        childAt = null;
        if (childAt != null) {
            i4 = Build.VERSION.SDK_INT;
            b0Var = f2Var.E;
            if (i4 <= 28) {
                method = f2.I;
                if (method != null) {
                    Object[] objArr2 = new Object[1];
                    objArr2[c4] = Boolean.FALSE;
                    method.invoke(b0Var, objArr2);
                }
            } else {
                d2.a(b0Var, c4);
            }
            c2.a(f2Var.E, null);
            p1Var = ((f) arrayList.get(arrayList.size() - 1)).f2350a.f2470h;
            iArr = new int[2];
            p1Var.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f2366u.getWindowVisibleDisplayFrame(rect3);
            if (this.f2367v == 1) {
                if (p1Var.getWidth() + iArr[0] + iO > rect3.right) {
                    i5 = 0;
                } else {
                    i5 = 1;
                }
            } else if (iArr[0] - iO < 0) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (i5 == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f2367v = i5;
            f2Var.f2481t = childAt;
            if ((this.f2364s & 5) == 5) {
                i6 = 0;
                if (z5) {
                    iO = childAt.getWidth();
                } else {
                    iO = 0 - iO;
                }
            } else if (z5) {
                i6 = 0;
            } else {
                i6 = 0;
                iO = 0 - childAt.getWidth();
            }
            f2Var.f2473k = iO;
            f2Var.f2477p = true;
            f2Var.f2476o = true;
            f2Var.i(i6);
        } else {
            if (this.f2368w) {
                f2Var.f2473k = this.f2370y;
            }
            if (this.f2369x) {
                f2Var.i(this.f2371z);
            }
            rect = this.f;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            f2Var.C = rect2;
        }
        arrayList.add(new f(f2Var, mVar, this.f2367v));
        f2Var.c();
        p1 p1Var4 = f2Var.f2470h;
        p1Var4.setOnKeyListener(this);
        if (fVar == null) {
        }
    }

    @Override // j.y
    public final void e(Parcelable parcelable) {
    }
}
