package p0;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k1 extends t1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f3206m = false;
    public static Method n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Class f3207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Field f3208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Field f3209q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f3210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f0.c[] f3211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f0.c f3212e;
    public y1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0.c f3213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect[][] f3217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect[][] f3218l;

    public k1(y1 y1Var, WindowInsets windowInsets) {
        super(y1Var);
        this.f3212e = null;
        this.f3217k = new Rect[10][];
        this.f3218l = new Rect[10][];
        this.f3210c = windowInsets;
    }

    private j A(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f3248a.f3268a.s()) {
            return j.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        t tVarZ = u1.h0.z(display, 0);
        t tVarZ2 = u1.h0.z(display, 1);
        t tVarZ3 = u1.h0.z(display, 2);
        t tVarZ4 = u1.h0.z(display, 3);
        return j.a(point.x, point.y, false, tVarZ != null ? tVarZ.f3244b : 0, tVarZ2 != null ? tVarZ2.f3244b : 0, tVarZ3 != null ? tVarZ3.f3244b : 0, tVarZ4 != null ? tVarZ4.f3244b : 0);
    }

    private static List<Rect> B(Rect[][] rectArr, int i4) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0 && (rectArr2 = rectArr[u1.h0.F(i5)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] C(f0.c cVar) {
        ArrayList arrayList = new ArrayList();
        int i4 = cVar.f2067a;
        int i5 = cVar.f2070d;
        int i6 = cVar.f2069c;
        int i7 = cVar.f2068b;
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, cVar.f2067a, this.f3215i));
        }
        if (i7 != 0) {
            arrayList.add(new Rect(0, 0, this.f3216j, i7));
        }
        if (i6 != 0) {
            int i8 = this.f3216j;
            arrayList.add(new Rect(i8 - i6, 0, i8, this.f3215i));
        }
        if (i5 != 0) {
            int i9 = this.f3215i;
            arrayList.add(new Rect(0, i9 - i5, this.f3216j, i9));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    @SuppressLint({"WrongConstant"})
    private f0.c D(int i4, boolean z4) {
        f0.c cVarA = f0.c.f2066e;
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                cVarA = f0.c.a(cVarA, E(i5, z4));
            }
        }
        return cVarA;
    }

    private f0.c F() {
        y1 y1Var = this.f;
        return y1Var != null ? y1Var.f3268a.k() : f0.c.f2066e;
    }

    private f0.c G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            androidx.fragment.app.q.t("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!f3206m) {
            H();
        }
        Method method = n;
        if (method != null && f3207o != null && f3208p != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f3208p.get(f3209q.get(objInvoke));
                if (rect != null) {
                    return f0.c.c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e5) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void H() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3207o = cls;
            f3208p = cls.getDeclaredField("mVisibleInsets");
            f3209q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3208p.setAccessible(true);
            f3209q.setAccessible(true);
        } catch (ReflectiveOperationException e5) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
        }
        f3206m = true;
    }

    public static boolean J(int i4, int i5) {
        return (i4 & 6) == (i5 & 6);
    }

    public f0.c E(int i4, boolean z4) {
        f0.c cVarK;
        int i5;
        f0.c cVar = f0.c.f2066e;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 8) {
                    f0.c[] cVarArr = this.f3211d;
                    cVarK = cVarArr != null ? cVarArr[u1.h0.F(8)] : null;
                    if (cVarK != null) {
                        return cVarK;
                    }
                    f0.c cVarM = m();
                    f0.c cVarF = F();
                    int i6 = cVarM.f2070d;
                    if (i6 > cVarF.f2070d) {
                        return f0.c.c(0, 0, 0, i6);
                    }
                    f0.c cVar2 = this.f3213g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i5 = this.f3213g.f2070d) > cVarF.f2070d) {
                        return f0.c.c(0, 0, 0, i5);
                    }
                } else {
                    if (i4 == 16) {
                        return l();
                    }
                    if (i4 == 32) {
                        return j();
                    }
                    if (i4 == 64) {
                        return n();
                    }
                    if (i4 == 128) {
                        y1 y1Var = this.f;
                        h hVarG = y1Var != null ? y1Var.f3268a.g() : g();
                        if (hVarG != null) {
                            int i7 = Build.VERSION.SDK_INT;
                            return f0.c.c(i7 >= 28 ? c0.a.g(hVarG.f3197a) : 0, i7 >= 28 ? c0.a.i(hVarG.f3197a) : 0, i7 >= 28 ? c0.a.h(hVarG.f3197a) : 0, i7 >= 28 ? c0.a.f(hVarG.f3197a) : 0);
                        }
                    }
                }
            } else {
                if (z4) {
                    f0.c cVarF2 = F();
                    f0.c cVarK2 = k();
                    return f0.c.c(Math.max(cVarF2.f2067a, cVarK2.f2067a), 0, Math.max(cVarF2.f2069c, cVarK2.f2069c), Math.max(cVarF2.f2070d, cVarK2.f2070d));
                }
                if ((this.f3214h & 2) == 0) {
                    f0.c cVarM2 = m();
                    y1 y1Var2 = this.f;
                    cVarK = y1Var2 != null ? y1Var2.f3268a.k() : null;
                    int iMin = cVarM2.f2070d;
                    if (cVarK != null) {
                        iMin = Math.min(iMin, cVarK.f2070d);
                    }
                    return f0.c.c(cVarM2.f2067a, 0, cVarM2.f2069c, iMin);
                }
            }
        } else {
            if (z4) {
                return f0.c.c(0, Math.max(F().f2068b, m().f2068b), 0, 0);
            }
            if ((this.f3214h & 4) == 0) {
                return f0.c.c(0, m().f2068b, 0, 0);
            }
        }
        return cVar;
    }

    public void I(f0.c cVar) {
        this.f3213g = cVar;
    }

    @Override // p0.t1
    public void d(View view) {
        this.f3216j = view.getWidth();
        this.f3215i = view.getHeight();
        f0.c cVarG = G(view);
        if (cVarG == null) {
            cVarG = f0.c.f2066e;
        }
        I(cVarG);
    }

    @Override // p0.t1
    public List<Rect> e(int i4) {
        return B(this.f3217k, i4);
    }

    @Override // p0.t1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Objects.equals(this.f3213g, k1Var.f3213g) && J(this.f3214h, k1Var.f3214h);
    }

    @Override // p0.t1
    public List<Rect> f(int i4) {
        return B(this.f3218l, i4);
    }

    @Override // p0.t1
    public f0.c h(int i4) {
        return D(i4, false);
    }

    @Override // p0.t1
    public f0.c i(int i4) {
        return D(i4, true);
    }

    @Override // p0.t1
    public final f0.c m() {
        if (this.f3212e == null) {
            WindowInsets windowInsets = this.f3210c;
            this.f3212e = f0.c.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3212e;
    }

    @Override // p0.t1
    public void o(View view) {
        A(view);
    }

    @Override // p0.t1
    @SuppressLint({"WrongConstant"})
    public void p() {
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            int iF = u1.h0.F(i4);
            this.f3217k[iF] = C(h(i4));
            if (i4 != 8) {
                this.f3218l[iF] = C(i(i4));
            }
        }
    }

    @Override // p0.t1
    public y1 q(int i4, int i5, int i6, int i7) {
        j1 d1Var;
        y1 y1VarH = y1.h(null, this.f3210c);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 36) {
            d1Var = new i1(y1VarH);
        } else if (i8 >= 35) {
            d1Var = new h1(y1VarH);
        } else if (i8 >= 34) {
            d1Var = new g1(y1VarH);
        } else if (i8 >= 31) {
            d1Var = new f1(y1VarH);
        } else if (i8 >= 30) {
            d1Var = new e1(y1VarH);
        } else {
            d1Var = i8 >= 29 ? new d1(y1VarH) : new b1(y1VarH);
        }
        d1Var.h(y1.e(m(), i4, i5, i6, i7));
        d1Var.f(y1.e(k(), i4, i5, i6, i7));
        return d1Var.b();
    }

    @Override // p0.t1
    public boolean s() {
        return this.f3210c.isRound();
    }

    @Override // p0.t1
    public void u(f0.c[] cVarArr) {
        this.f3211d = cVarArr;
    }

    @Override // p0.t1
    public void v(y1 y1Var) {
        this.f = y1Var;
    }

    @Override // p0.t1
    public void x(int i4) {
        this.f3214h = i4;
    }

    @Override // p0.t1
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f3217k = (Rect[][]) rectArr.clone();
    }

    @Override // p0.t1
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f3218l = (Rect[][]) rectArr.clone();
    }

    @Override // p0.t1
    public void t(j jVar) {
    }
}
