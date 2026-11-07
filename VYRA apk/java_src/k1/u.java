package k1;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2906a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f2907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f2908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2910e;
    public View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0 f2911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f2913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f2914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f2915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2917m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2918o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2919p;

    public u(Context context) {
        s0 s0Var = new s0();
        s0Var.f2892d = -1;
        s0Var.f = false;
        s0Var.f2894g = 0;
        s0Var.f2889a = 0;
        s0Var.f2890b = 0;
        s0Var.f2891c = Integer.MIN_VALUE;
        s0Var.f2893e = null;
        this.f2911g = s0Var;
        this.f2913i = new LinearInterpolator();
        this.f2914j = new DecelerateInterpolator();
        this.f2917m = false;
        this.f2918o = 0;
        this.f2919p = 0;
        this.f2916l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == -1) {
            return i6 - i4;
        }
        if (i8 != 0) {
            if (i8 == 1) {
                return i7 - i5;
            }
            androidx.fragment.app.q.q("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i9 = i6 - i4;
        if (i9 > 0) {
            return i9;
        }
        int i10 = i7 - i5;
        if (i10 < 0) {
            return i10;
        }
        return 0;
    }

    public int b(View view, int i4) {
        l0 l0Var = this.f2908c;
        if (l0Var == null || !l0Var.d()) {
            return 0;
        }
        m0 m0Var = (m0) view.getLayoutParams();
        return a((view.getLeft() - ((m0) view.getLayoutParams()).f2852b.left) - ((ViewGroup.MarginLayoutParams) m0Var).leftMargin, view.getRight() + ((m0) view.getLayoutParams()).f2852b.right + ((ViewGroup.MarginLayoutParams) m0Var).rightMargin, l0Var.E(), l0Var.n - l0Var.F(), i4);
    }

    public int c(View view, int i4) {
        l0 l0Var = this.f2908c;
        if (l0Var == null || !l0Var.e()) {
            return 0;
        }
        m0 m0Var = (m0) view.getLayoutParams();
        return a((view.getTop() - ((m0) view.getLayoutParams()).f2852b.top) - ((ViewGroup.MarginLayoutParams) m0Var).topMargin, view.getBottom() + ((m0) view.getLayoutParams()).f2852b.bottom + ((ViewGroup.MarginLayoutParams) m0Var).bottomMargin, l0Var.G(), l0Var.f2849o - l0Var.D(), i4);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i4) {
        float fAbs = Math.abs(i4);
        if (!this.f2917m) {
            this.n = d(this.f2916l);
            this.f2917m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }

    public PointF f(int i4) {
        Object obj = this.f2908c;
        if (obj instanceof t0) {
            return ((t0) obj).a(i4);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + t0.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    public final void g(int i4, int i5) {
        PointF pointFF;
        RecyclerView recyclerView = this.f2907b;
        if (this.f2906a == -1 || recyclerView == null) {
            i();
        }
        if (this.f2909d && this.f == null && this.f2908c != null && (pointFF = f(this.f2906a)) != null) {
            float f = pointFF.x;
            if (f != 0.0f || pointFF.y != 0.0f) {
                recyclerView.Z((int) Math.signum(f), (int) Math.signum(pointFF.y), null);
            }
        }
        this.f2909d = false;
        View view = this.f;
        s0 s0Var = this.f2911g;
        if (view != null) {
            this.f2907b.getClass();
            x0 x0VarI = RecyclerView.I(view);
            if ((x0VarI != null ? x0VarI.b() : -1) == this.f2906a) {
                View view2 = this.f;
                u0 u0Var = recyclerView.f920k0;
                h(view2, s0Var);
                s0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.f2910e) {
            u0 u0Var2 = recyclerView.f920k0;
            if (this.f2907b.f932r.v() == 0) {
                i();
            } else {
                int i6 = this.f2918o;
                int i7 = i6 - i4;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.f2918o = i7;
                int i8 = this.f2919p;
                int i9 = i8 - i5;
                if (i8 * i9 <= 0) {
                    i9 = 0;
                }
                this.f2919p = i9;
                if (i7 == 0 && i9 == 0) {
                    PointF pointFF2 = f(this.f2906a);
                    if (pointFF2 != null) {
                        float f4 = pointFF2.x;
                        if (f4 == 0.0f && pointFF2.y == 0.0f) {
                            s0Var.f2892d = this.f2906a;
                            i();
                        } else {
                            float f5 = pointFF2.y;
                            float fSqrt = (float) Math.sqrt((f5 * f5) + (f4 * f4));
                            float f6 = pointFF2.x / fSqrt;
                            pointFF2.x = f6;
                            float f7 = pointFF2.y / fSqrt;
                            pointFF2.y = f7;
                            this.f2915k = pointFF2;
                            this.f2918o = (int) (f6 * 10000.0f);
                            this.f2919p = (int) (f7 * 10000.0f);
                            int iE = e(10000);
                            int i10 = (int) (this.f2918o * 1.2f);
                            int i11 = (int) (this.f2919p * 1.2f);
                            s0Var.f2889a = i10;
                            s0Var.f2890b = i11;
                            s0Var.f2891c = (int) (iE * 1.2f);
                            s0Var.f2893e = this.f2913i;
                            s0Var.f = true;
                        }
                    } else {
                        s0Var.f2892d = this.f2906a;
                        i();
                    }
                }
            }
            boolean z4 = s0Var.f2892d >= 0;
            s0Var.a(recyclerView);
            if (z4 && this.f2910e) {
                this.f2909d = true;
                recyclerView.f915h0.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    public void h(View view, s0 s0Var) {
        int i4;
        PointF pointF = this.f2915k;
        int i5 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i4 = 0;
            } else {
                i4 = f > 0.0f ? 1 : -1;
            }
        } else {
            i4 = 0;
        }
        int iB = b(view, i4);
        PointF pointF2 = this.f2915k;
        if (pointF2 != null) {
            float f4 = pointF2.y;
            if (f4 != 0.0f) {
                i5 = f4 > 0.0f ? 1 : -1;
            }
        }
        int iC = c(view, i5);
        int iCeil = (int) Math.ceil(((double) e((int) Math.sqrt((iC * iC) + (iB * iB)))) / 0.3356d);
        if (iCeil > 0) {
            s0Var.f2889a = -iB;
            s0Var.f2890b = -iC;
            s0Var.f2891c = iCeil;
            s0Var.f2893e = this.f2914j;
            s0Var.f = true;
        }
    }

    public final void i() {
        if (this.f2910e) {
            this.f2910e = false;
            this.f2919p = 0;
            this.f2918o = 0;
            this.f2915k = null;
            this.f2907b.f920k0.f2920a = -1;
            this.f = null;
            this.f2906a = -1;
            this.f2909d = false;
            l0 l0Var = this.f2908c;
            if (l0Var.f2841e == this) {
                l0Var.f2841e = null;
            }
            this.f2908c = null;
            this.f2907b = null;
        }
    }
}
