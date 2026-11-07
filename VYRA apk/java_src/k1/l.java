package k1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final d3.d0 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f2816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2817e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f2819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2824m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2825o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f2826p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f2829s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2836z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2827q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2828r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2830t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2831u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2832v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2833w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f2834x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f2835y = new int[2];

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2836z = valueAnimatorOfFloat;
        this.A = 0;
        d3.d0 d0Var = new d3.d0(7, this);
        this.B = d0Var;
        j jVar = new j(this);
        this.f2815c = stateListDrawable;
        this.f2816d = drawable;
        this.f2818g = stateListDrawable2;
        this.f2819h = drawable2;
        this.f2817e = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i4, drawable.getIntrinsicWidth());
        this.f2820i = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f2821j = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f2813a = i5;
        this.f2814b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new k(this));
        valueAnimatorOfFloat.addUpdateListener(new d3.e0(2, this));
        RecyclerView recyclerView2 = this.f2829s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f936t;
            l0 l0Var = recyclerView2.f932r;
            if (l0Var != null) {
                l0Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2829s;
            recyclerView3.f938u.remove(this);
            if (recyclerView3.f940v == this) {
                recyclerView3.f940v = null;
            }
            ArrayList arrayList2 = this.f2829s.f924m0;
            if (arrayList2 != null) {
                arrayList2.remove(jVar);
            }
            this.f2829s.removeCallbacks(d0Var);
        }
        this.f2829s = recyclerView;
        recyclerView.g(this);
        this.f2829s.f938u.add(this);
        this.f2829s.h(jVar);
    }

    public static int e(float f, float f4, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 != 0) {
            int i8 = i4 - i6;
            int i9 = (int) (((f4 - f) / i7) * i8);
            int i10 = i5 + i9;
            if (i10 < i8 && i10 >= 0) {
                return i9;
            }
        }
        return 0;
    }

    @Override // k1.i0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i4 = this.f2827q;
        RecyclerView recyclerView2 = this.f2829s;
        if (i4 != recyclerView2.getWidth() || this.f2828r != recyclerView2.getHeight()) {
            this.f2827q = recyclerView2.getWidth();
            this.f2828r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.A != 0) {
            if (this.f2830t) {
                int i5 = this.f2827q;
                int i6 = this.f2817e;
                int i7 = i5 - i6;
                int i8 = this.f2823l;
                int i9 = this.f2822k;
                int i10 = i8 - (i9 / 2);
                StateListDrawable stateListDrawable = this.f2815c;
                stateListDrawable.setBounds(0, 0, i6, i9);
                int i11 = this.f;
                int i12 = this.f2828r;
                Drawable drawable = this.f2816d;
                drawable.setBounds(0, 0, i11, i12);
                WeakHashMap weakHashMap = p0.p0.f3233a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i6, i10);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i6, -i10);
                } else {
                    canvas.translate(i7, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i10);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i7, -i10);
                }
            }
            if (this.f2831u) {
                int i13 = this.f2828r;
                int i14 = this.f2820i;
                int i15 = i13 - i14;
                int i16 = this.f2825o;
                int i17 = this.n;
                int i18 = i16 - (i17 / 2);
                StateListDrawable stateListDrawable2 = this.f2818g;
                stateListDrawable2.setBounds(0, 0, i17, i14);
                int i19 = this.f2827q;
                int i20 = this.f2821j;
                Drawable drawable2 = this.f2819h;
                drawable2.setBounds(0, 0, i19, i20);
                canvas.translate(0.0f, i15);
                drawable2.draw(canvas);
                canvas.translate(i18, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i18, -i15);
            }
        }
    }

    public final boolean c(float f, float f4) {
        if (f4 < this.f2828r - this.f2820i) {
            return false;
        }
        int i4 = this.f2825o;
        int i5 = this.n;
        return f >= ((float) (i4 - (i5 / 2))) && f <= ((float) ((i5 / 2) + i4));
    }

    public final boolean d(float f, float f4) {
        WeakHashMap weakHashMap = p0.p0.f3233a;
        int layoutDirection = this.f2829s.getLayoutDirection();
        int i4 = this.f2817e;
        if (layoutDirection == 1) {
            if (f > i4) {
                return false;
            }
        } else if (f < this.f2827q - i4) {
            return false;
        }
        int i5 = this.f2823l;
        int i6 = this.f2822k / 2;
        return f4 >= ((float) (i5 - i6)) && f4 <= ((float) (i6 + i5));
    }

    public final void f(int i4) {
        d3.d0 d0Var = this.B;
        StateListDrawable stateListDrawable = this.f2815c;
        if (i4 == 2 && this.f2832v != 2) {
            stateListDrawable.setState(C);
            this.f2829s.removeCallbacks(d0Var);
        }
        if (i4 == 0) {
            this.f2829s.invalidate();
        } else {
            g();
        }
        if (this.f2832v == 2 && i4 != 2) {
            stateListDrawable.setState(D);
            this.f2829s.removeCallbacks(d0Var);
            this.f2829s.postDelayed(d0Var, 1200);
        } else if (i4 == 1) {
            this.f2829s.removeCallbacks(d0Var);
            this.f2829s.postDelayed(d0Var, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f2832v = i4;
    }

    public final void g() {
        int i4 = this.A;
        ValueAnimator valueAnimator = this.f2836z;
        if (i4 != 0) {
            if (i4 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
