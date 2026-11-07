package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.RecyclerView;
import co.median.android.eeqadjy.R;
import com.google.android.material.datepicker.z;
import j2.a;
import j2.b;
import j2.c;
import j2.e;
import k1.l0;
import k1.m0;
import k1.t0;
import k1.u0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends l0 implements t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f1366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c f1367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f1368r;

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        new b();
        this.f1368r = new a(0, this);
        this.f1366p = new e();
        m0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a2.a.f16g);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m0();
            E0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final float B0(float f, float f4) {
        return D0() ? f - f4 : f + f4;
    }

    public final boolean C0() {
        return this.f1367q.f2457a == 0;
    }

    public final boolean D0() {
        return C0() && C() == 1;
    }

    public final void E0(int i4) {
        c cVar;
        if (i4 != 0 && i4 != 1) {
            q.q(u.k(i4, "invalid orientation:"));
            return;
        }
        c(null);
        c cVar2 = this.f1367q;
        if (cVar2 == null || i4 != cVar2.f2457a) {
            if (i4 == 0) {
                cVar = new c(this, 1);
            } else {
                if (i4 != 1) {
                    q.q("invalid orientation");
                    return;
                }
                cVar = new c(this, 0);
            }
            this.f1367q = cVar;
            m0();
        }
    }

    @Override // k1.l0
    public final boolean L() {
        return true;
    }

    @Override // k1.l0
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        e eVar = this.f1366p;
        float dimension = eVar.f2460a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        eVar.f2460a = dimension;
        float dimension2 = eVar.f2461b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        eVar.f2461b = dimension2;
        m0();
        recyclerView.addOnLayoutChangeListener(this.f1368r);
    }

    @Override // k1.l0
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1368r);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    @Override // k1.l0
    public final View T(View view, int i4, v1.b bVar, u0 u0Var) {
        byte b5;
        if (v() == 0) {
            return null;
        }
        int i5 = this.f1367q.f2457a;
        if (i4 == 1) {
            b5 = -1;
        } else if (i4 == 2) {
            b5 = 1;
        } else if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i4);
                    } else if (i5 == 1) {
                        b5 = 1;
                    }
                    b5 = -2147483648;
                } else if (i5 != 0) {
                    b5 = -2147483648;
                } else if (D0()) {
                    b5 = -1;
                } else {
                    b5 = 1;
                }
            } else if (i5 == 1) {
                b5 = -1;
            } else {
                b5 = -2147483648;
            }
        } else if (i5 != 0) {
            b5 = -2147483648;
        } else if (D0()) {
            b5 = 1;
        } else {
            b5 = -1;
        }
        if (b5 == -2147483648) {
            return null;
        }
        if (b5 == -1) {
            if (l0.H(view) == 0) {
                return null;
            }
            int iH = l0.H(u(0)) - 1;
            if (iH < 0 || iH >= B()) {
                return u(D0() ? v() - 1 : 0);
            }
            this.f1367q.a();
            throw null;
        }
        if (l0.H(view) == B() - 1) {
            return null;
        }
        int iH2 = l0.H(u(v() - 1)) + 1;
        if (iH2 < 0 || iH2 >= B()) {
            return u(D0() ? 0 : v() - 1);
        }
        this.f1367q.a();
        throw null;
    }

    @Override // k1.l0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(l0.H(u(0)));
            accessibilityEvent.setToIndex(l0.H(u(v() - 1)));
        }
    }

    @Override // k1.l0
    public final void X(int i4, int i5) {
        B();
    }

    @Override // k1.l0
    public final void Y() {
        B();
    }

    @Override // k1.t0
    public final PointF a(int i4) {
        return null;
    }

    @Override // k1.l0
    public final void a0(int i4, int i5) {
        B();
    }

    @Override // k1.l0
    public final void c0(v1.b bVar, u0 u0Var) {
        if (u0Var.b() > 0) {
            if ((C0() ? this.n : this.f2849o) > 0.0f) {
                D0();
                bVar.f(0);
                q.j("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        h0(bVar);
    }

    @Override // k1.l0
    public final boolean d() {
        return C0();
    }

    @Override // k1.l0
    public final void d0(u0 u0Var) {
        if (v() == 0) {
            return;
        }
        l0.H(u(0));
    }

    @Override // k1.l0
    public final boolean e() {
        return !C0();
    }

    @Override // k1.l0
    public final int j(u0 u0Var) {
        v();
        return 0;
    }

    @Override // k1.l0
    public final int k(u0 u0Var) {
        return 0;
    }

    @Override // k1.l0
    public final int l(u0 u0Var) {
        return 0;
    }

    @Override // k1.l0
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
        return false;
    }

    @Override // k1.l0
    public final int m(u0 u0Var) {
        v();
        return 0;
    }

    @Override // k1.l0
    public final int n(u0 u0Var) {
        return 0;
    }

    @Override // k1.l0
    public final int n0(int i4, u0 u0Var, v1.b bVar) {
        if (!C0() || v() == 0 || i4 == 0) {
            return 0;
        }
        bVar.f(0);
        q.j("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // k1.l0
    public final int o(u0 u0Var) {
        return 0;
    }

    @Override // k1.l0
    public final int p0(int i4, u0 u0Var, v1.b bVar) {
        if (!e() || v() == 0 || i4 == 0) {
            return 0;
        }
        bVar.f(0);
        q.j("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // k1.l0
    public final m0 r() {
        return new m0(-2, -2);
    }

    @Override // k1.l0
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // k1.l0
    public final void y0(RecyclerView recyclerView, int i4) {
        z zVar = new z(this, recyclerView.getContext());
        zVar.f2906a = i4;
        z0(zVar);
    }

    @Override // k1.l0
    public final void o0(int i4) {
    }

    public CarouselLayoutManager() {
        e eVar = new e();
        new b();
        this.f1368r = new a(0, this);
        this.f1366p = eVar;
        m0();
        E0(0);
    }
}
