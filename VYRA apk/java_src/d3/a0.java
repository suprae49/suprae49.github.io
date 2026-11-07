package d3;

import android.net.Uri;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.median.android.MainActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.internal.CheckableImageButton;
import java.util.ArrayList;
import java.util.Objects;
import k.i3;
import p0.b1;
import p0.d1;
import p0.e1;
import p0.g1;
import p0.h1;
import p0.i1;
import p0.j1;
import p0.t1;
import p0.y1;
import u1.e2;
import u1.f1;
import u1.q0;
import u1.r1;
import z3.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements r2.a, p0.q, i3, OnSuccessListener, u2.p, b.b, q0.n {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1680g;

    public /* synthetic */ a0(int i4, Object obj) {
        this.f = i4;
        this.f1680g = obj;
    }

    @Override // b.b
    public void a(Object obj) {
        i3.g gVarW;
        e2 e2Var = (e2) this.f1680g;
        u1.s sVar = (u1.s) obj;
        boolean z4 = sVar.f4087a;
        Uri[] uriArr = sVar.f4088b;
        if (!z4) {
            ValueCallback valueCallback = e2Var.f3916r;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                e2Var.f3916r = null;
                return;
            }
            return;
        }
        if (!sVar.f4089c) {
            ValueCallback valueCallback2 = e2Var.f3916r;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(uriArr);
                e2Var.f3916r = null;
                return;
            }
            return;
        }
        Objects.requireNonNull(uriArr);
        Uri uri = uriArr[0];
        MainActivity mainActivity = e2Var.f3901a;
        r0.b bVar = new r0.b(e2Var);
        mainActivity.getClass();
        uri.getClass();
        d4.e eVar = z3.q.f4923a;
        d4.d dVar = d4.d.f1820h;
        if (dVar.a(z3.i.f4909g) == null) {
            gVarW = dVar;
            gVarW = e4.a.W(dVar, new z3.a0());
        }
        gVarW = dVar;
        g3.g gVar = g3.g.f2156a;
        i3.g gVarA = z3.l.a(gVarW, i3.h.f, true);
        d4.e eVar2 = z3.q.f4923a;
        if (gVarA != eVar2 && gVarA.a(i3.d.f) == null) {
            gVarA = gVarA.b(eVar2);
        }
        h0 h0Var = new h0(gVarA, true);
        try {
            b4.d.d(e4.a.N(new f1(mainActivity, uri, bVar, h0Var)), gVar);
        } catch (Throwable th) {
            h0Var.e(new g3.c(th));
            throw th;
        }
    }

    @Override // r2.a
    public void b() {
        CheckableImageButton checkableImageButton = ((b0) this.f1680g).f1685i;
        e4.a.n0(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // p0.q
    public y1 d(View view, y1 y1Var) {
        j1 d1Var;
        switch (this.f) {
            case 4:
                s0.e eVar = (s0.e) this.f1680g;
                ArrayList arrayList = eVar.f3666b;
                t1 t1Var = y1Var.f3268a;
                f0.c cVarB = f0.c.b(t1Var.h(519), t1Var.h(64));
                f0.c cVarB2 = f0.c.b(t1Var.i(519), t1Var.i(64));
                if (!cVarB.equals(eVar.f3667c) || !cVarB2.equals(eVar.f3668d)) {
                    eVar.f3667c = cVarB;
                    eVar.f3668d = cVarB2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = ((s0.a) arrayList.get(size)).f3657a;
                        int size2 = arrayList2.size() - 1;
                        if (size2 >= 0) {
                            throw androidx.fragment.app.u.i(size2, arrayList2);
                        }
                    }
                }
                return y1Var;
            default:
                r1 r1Var = (r1) this.f1680g;
                view.getClass();
                x1.a aVarU = x1.a.u(r1Var.f4075a);
                t1 t1Var2 = y1Var.f3268a;
                f0.c cVarH = t1Var2.h(519);
                cVarH.getClass();
                int i4 = cVarH.f2069c;
                int i5 = cVarH.f2070d;
                int i6 = cVarH.f2068b;
                int i7 = aVarU.f4699t0 ? 0 : i6;
                int iMax = aVarU.f4701u0 ? 0 : i5;
                if (!r1Var.f4078d && !((Boolean) r1Var.f4077c.a()).booleanValue() && Build.VERSION.SDK_INT >= 30) {
                    iMax = Math.max(t1Var2.h(8).f2070d, iMax);
                }
                boolean z4 = r1Var.f4076b;
                int i8 = cVarH.f2067a;
                if (z4) {
                    view.setPadding(i8, 0, i4, 0);
                    CoordinatorLayout coordinatorLayout = r1Var.f4083j;
                    if (coordinatorLayout == null) {
                        r3.g.c("mainLayout");
                        throw null;
                    }
                    coordinatorLayout.setPadding(0, i7, 0, iMax);
                    View view2 = r1Var.f4084k;
                    if (view2 == null) {
                        r3.g.c("navMenu");
                        throw null;
                    }
                    view2.setPadding(0, i7, 0, iMax);
                    View view3 = r1Var.f4081h;
                    if (view3 == null) {
                        r3.g.c("statusBarBackgroundView");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    layoutParams.height = i6;
                    View view4 = r1Var.f4081h;
                    if (view4 == null) {
                        r3.g.c("statusBarBackgroundView");
                        throw null;
                    }
                    view4.setLayoutParams(layoutParams);
                    View view5 = r1Var.f4082i;
                    if (view5 == null) {
                        r3.g.c("systemNavBarBackgroundView");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                    layoutParams2.height = i5;
                    View view6 = r1Var.f4082i;
                    if (view6 == null) {
                        r3.g.c("systemNavBarBackgroundView");
                        throw null;
                    }
                    view6.setLayoutParams(layoutParams2);
                } else {
                    view.setPadding(i8, i7, i4, iMax);
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 36) {
                    d1Var = new i1(y1Var);
                } else if (i9 >= 35) {
                    d1Var = new h1(y1Var);
                } else if (i9 >= 34) {
                    d1Var = new g1(y1Var);
                } else if (i9 >= 31) {
                    d1Var = new p0.f1(y1Var);
                } else if (i9 >= 30) {
                    d1Var = new e1(y1Var);
                } else {
                    d1Var = i9 >= 29 ? new d1(y1Var) : new b1(y1Var);
                }
                d1Var.d(519, f0.c.f2066e);
                return d1Var.b();
        }
    }

    @Override // q0.n
    public boolean e(View view) {
        y0.f fVar = (y0.f) this.f1680g;
        if (!y0.f.l(view) || fVar.h(view) == 2) {
            return false;
        }
        fVar.c(view, true);
        return true;
    }

    @Override // k.i3
    public boolean onMenuItemClick(MenuItem menuItem) {
        u1.e eVar = (u1.e) this.f1680g;
        menuItem.getClass();
        return eVar.b((String) eVar.f3881h.get(menuItem));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((q0) this.f1680g).g(obj);
    }
}
