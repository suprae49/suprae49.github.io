package e;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import co.median.android.eeqadjy.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.f1;
import k.o3;
import k.p3;
import p0.y1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements p0.q, f1, j.x {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f1989g;

    public /* synthetic */ s(d0 d0Var, int i4) {
        this.f = i4;
        this.f1989g = d0Var;
    }

    @Override // j.x
    public void a(j.m mVar, boolean z4) {
        c0 c0Var;
        switch (this.f) {
            case 3:
                this.f1989g.s(mVar);
                break;
            default:
                j.m mVarK = mVar.k();
                int i4 = 0;
                boolean z5 = mVarK != mVar;
                if (z5) {
                    mVar = mVarK;
                }
                d0 d0Var = this.f1989g;
                c0[] c0VarArr = d0Var.Q;
                int length = c0VarArr != null ? c0VarArr.length : 0;
                while (true) {
                    if (i4 >= length) {
                        c0Var = null;
                    } else {
                        c0Var = c0VarArr[i4];
                        if (c0Var == null || c0Var.f1864h != mVar) {
                            i4++;
                        }
                    }
                }
                if (c0Var != null) {
                    if (!z5) {
                        d0Var.t(c0Var, z4);
                    } else {
                        d0Var.r(c0Var.f1858a, c0Var, mVarK);
                        d0Var.t(c0Var, true);
                    }
                }
                break;
        }
    }

    public Drawable b() {
        androidx.emoji2.text.t tVarT = androidx.emoji2.text.t.t(this.f1989g.z(), null, new int[]{R.attr.homeAsUpIndicator});
        Drawable drawableI = tVarT.i(0);
        tVarT.v();
        return drawableI;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p0.q
    public y1 d(View view, y1 y1Var) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iD = y1Var.d();
        d0 d0Var = this.f1989g;
        Context context = d0Var.f1885p;
        int iD2 = y1Var.d();
        ActionBarContextView actionBarContextView = d0Var.A;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i4 = 0;
            i5 = 8;
            i6 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d0Var.A.getLayoutParams();
            int i9 = 1;
            if (d0Var.A.isShown()) {
                if (d0Var.f1880h0 == null) {
                    d0Var.f1880h0 = new Rect();
                    d0Var.f1881i0 = new Rect();
                }
                Rect rect = d0Var.f1880h0;
                Rect rect2 = d0Var.f1881i0;
                rect.set(y1Var.b(), y1Var.d(), y1Var.c(), y1Var.a());
                ViewGroup viewGroup = d0Var.F;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = p3.f2612a;
                    o3.a(viewGroup, rect, rect2);
                    i7 = 0;
                } else {
                    if (p3.f2612a) {
                        i7 = 0;
                    } else {
                        p3.f2612a = true;
                        i7 = 0;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            p3.f2613b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                p3.f2613b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = p3.f2613b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e5) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e5);
                        }
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup2 = d0Var.F;
                WeakHashMap weakHashMap = p0.p0.f3233a;
                y1 y1VarA = p0.i0.a(viewGroup2);
                int iB = y1VarA == null ? i7 : y1VarA.b();
                int iC = y1VarA == null ? i7 : y1VarA.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    i8 = i7;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    i8 = 1;
                }
                if (i10 <= 0 || d0Var.H != null) {
                    i5 = 8;
                    View view2 = d0Var.H;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            d0Var.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    d0Var.H = view3;
                    i5 = 8;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    d0Var.F.addView(d0Var.H, -1, layoutParams);
                }
                View view4 = d0Var.H;
                i9 = view4 == null ? i7 : 1;
                if (i9 != 0 && view4.getVisibility() != 0) {
                    View view5 = d0Var.H;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? c0.c.getColor(context, R.color.abc_decor_view_status_guard_light) : c0.c.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!d0Var.M && i9 != 0) {
                    iD2 = i7;
                }
                i6 = i9;
                i4 = i7;
                i9 = i8;
            } else {
                i5 = 8;
                i4 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    i6 = 0;
                } else {
                    i6 = 0;
                    i9 = 0;
                }
            }
            if (i9 != 0) {
                d0Var.A.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = d0Var.H;
        if (view6 != null) {
            view6.setVisibility(i6 != 0 ? i4 : i5);
        }
        y1 y1VarF = iD != iD2 ? y1Var.f(y1Var.b(), iD2, y1Var.c(), y1Var.a()) : y1Var;
        WeakHashMap weakHashMap2 = p0.p0.f3233a;
        WindowInsets windowInsetsG = y1VarF.g();
        if (windowInsetsG == null) {
            return y1VarF;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsG);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsG) ? y1.h(view, windowInsetsOnApplyWindowInsets) : y1VarF;
    }

    @Override // j.x
    public boolean h(j.m mVar) {
        Window.Callback callback;
        switch (this.f) {
            case 3:
                Window.Callback callback2 = this.f1989g.f1886q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, mVar);
                }
                break;
            default:
                if (mVar == mVar.k()) {
                    d0 d0Var = this.f1989g;
                    if (d0Var.K && (callback = d0Var.f1886q.getCallback()) != null && !d0Var.V) {
                        callback.onMenuOpened(108, mVar);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
