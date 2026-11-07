package t0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import d3.d0;
import k.p1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements View.OnTouchListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f3680w = ViewConfiguration.getTapTimeout();
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccelerateInterpolator f3681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p1 f3682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d0 f3683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f3684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f3685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3687m;
    public final float[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float[] f3688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f3689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p1 f3695v;

    public c(p1 p1Var) {
        a aVar = new a();
        aVar.f3676e = Long.MIN_VALUE;
        aVar.f3677g = -1L;
        aVar.f = 0L;
        this.f = aVar;
        this.f3681g = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3684j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3685k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3688o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3689p = fArr5;
        this.f3682h = p1Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.f3686l = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3687m = f3680w;
        aVar.f3672a = 500;
        aVar.f3673b = 500;
        this.f3695v = p1Var;
    }

    public static float b(float f, float f4, float f5) {
        if (f > f5) {
            return f5;
        }
        return f < f4 ? f4 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(float f, float f4, float f5, int i4) {
        float fB;
        float interpolation;
        float fB2 = b(this.f3684j[i4] * f4, 0.0f, this.f3685k[i4]);
        float fC = c(f4 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f3681g;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f6 = this.n[i4];
            float f7 = this.f3688o[i4];
            float f8 = this.f3689p[i4];
            float f9 = f6 * f5;
            return fB > 0.0f ? b(fB * f9, f7, f8) : -b((-fB) * f9, f7, f8);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f10 = this.n[i4];
        float f11 = this.f3688o[i4];
        float f12 = this.f3689p[i4];
        float f13 = f10 * f5;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f4) {
        if (f4 != 0.0f) {
            int i4 = this.f3686l;
            if (i4 == 0 || i4 == 1) {
                if (f < f4) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f4);
                    }
                    if (this.f3693t && i4 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i4 == 2 && f < 0.0f) {
                return f / (-f4);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i4 = 0;
        if (this.f3691r) {
            this.f3693t = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f;
        int i5 = (int) (jCurrentAnimationTimeMillis - aVar.f3676e);
        int i6 = aVar.f3673b;
        if (i5 > i6) {
            i4 = i6;
        } else if (i5 >= 0) {
            i4 = i5;
        }
        aVar.f3679i = i4;
        aVar.f3678h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f3677g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        p1 p1Var;
        int count;
        a aVar = this.f;
        float f = aVar.f3675d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(aVar.f3674c);
        if (iAbs != 0 && (count = (p1Var = this.f3695v).getCount()) != 0) {
            int childCount = p1Var.getChildCount();
            int firstVisiblePosition = p1Var.getFirstVisiblePosition();
            int i4 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && p1Var.getChildAt(0).getTop() >= 0)) : !(i4 >= count && p1Var.getChildAt(childCount - 1).getBottom() <= p1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f3694u
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.d()
            return r1
        L1b:
            r7.f3692s = r2
            r7.f3690q = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            k.p1 r4 = r7.f3682h
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            t0.a r9 = r7.f
            r9.f3674c = r0
            r9.f3675d = r8
            boolean r8 = r7.f3693t
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            d3.d0 r8 = r7.f3683i
            if (r8 != 0) goto L62
            d3.d0 r8 = new d3.d0
            r9 = 9
            r8.<init>(r9, r7)
            r7.f3683i = r8
        L62:
            r7.f3693t = r2
            r7.f3691r = r2
            boolean r8 = r7.f3690q
            if (r8 != 0) goto L77
            int r8 = r7.f3687m
            if (r8 <= 0) goto L77
            d3.d0 r9 = r7.f3683i
            long r5 = (long) r8
            java.util.WeakHashMap r8 = p0.p0.f3233a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            d3.d0 r8 = r7.f3683i
            r8.run()
        L7c:
            r7.f3690q = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
