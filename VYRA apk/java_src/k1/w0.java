package k1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Runnable {
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public OverScroller f2935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Interpolator f2936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2939l;

    public w0(RecyclerView recyclerView) {
        this.f2939l = recyclerView;
        z zVar = RecyclerView.F0;
        this.f2936i = zVar;
        this.f2937j = false;
        this.f2938k = false;
        this.f2935h = new OverScroller(recyclerView.getContext(), zVar);
    }

    public final void a() {
        if (this.f2937j) {
            this.f2938k = true;
            return;
        }
        RecyclerView recyclerView = this.f2939l;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = p0.p0.f3233a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i4, int i5, int i6, Interpolator interpolator) {
        RecyclerView recyclerView = this.f2939l;
        if (i6 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i4);
            int iAbs2 = Math.abs(i5);
            boolean z4 = iAbs > iAbs2;
            int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z4) {
                iAbs = iAbs2;
            }
            i6 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i7 = i6;
        if (interpolator == null) {
            interpolator = RecyclerView.F0;
        }
        if (this.f2936i != interpolator) {
            this.f2936i = interpolator;
            this.f2935h = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2934g = 0;
        this.f = 0;
        recyclerView.setScrollState(2);
        this.f2935h.startScroll(0, 0, i4, i5, i7);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        RecyclerView recyclerView = this.f2939l;
        int[] iArr = recyclerView.f942w0;
        if (recyclerView.f932r == null) {
            recyclerView.removeCallbacks(this);
            this.f2935h.abortAnimation();
            return;
        }
        this.f2938k = false;
        this.f2937j = true;
        recyclerView.m();
        OverScroller overScroller = this.f2935h;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i9 = currX - this.f;
            int i10 = currY - this.f2934g;
            this.f = currX;
            this.f2934g = currY;
            int[] iArr2 = recyclerView.f942w0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.r(i9, i10, 1, iArr2, null)) {
                i4 = i9 - iArr[0];
                i5 = i10 - iArr[1];
            } else {
                i4 = i9;
                i5 = i10;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i4, i5);
            }
            if (recyclerView.f930q != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.Z(i4, i5, iArr);
                i6 = iArr[0];
                i7 = iArr[1];
                i4 -= i6;
                i5 -= i7;
                u uVar = recyclerView.f932r.f2841e;
                if (uVar != null && !uVar.f2909d && uVar.f2910e) {
                    int iB = recyclerView.f920k0.b();
                    if (iB == 0) {
                        uVar.i();
                    } else if (uVar.f2906a >= iB) {
                        uVar.f2906a = iB - 1;
                        uVar.g(i6, i7);
                    } else {
                        uVar.g(i6, i7);
                    }
                }
            } else {
                i6 = 0;
                i7 = 0;
            }
            if (!recyclerView.f936t.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f942w0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i6, i7, i4, i5, null, 1, iArr3);
            int i11 = i4 - iArr[0];
            int i12 = i5 - iArr[1];
            if (i6 != 0 || i7 != 0) {
                recyclerView.t(i6, i7);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z4 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            u uVar2 = recyclerView.f932r.f2841e;
            if ((uVar2 == null || !uVar2.f2909d) && z4) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i11 < 0) {
                        i8 = -currVelocity;
                    } else {
                        i8 = i11 > 0 ? currVelocity : 0;
                    }
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i8 < 0) {
                        recyclerView.v();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(-i8);
                        }
                    } else if (i8 > 0) {
                        recyclerView.w();
                        if (recyclerView.N.isFinished()) {
                            recyclerView.N.onAbsorb(i8);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.M.isFinished()) {
                            recyclerView.M.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.O.isFinished()) {
                            recyclerView.O.onAbsorb(currVelocity);
                        }
                    }
                    if (i8 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = p0.p0.f3233a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                c2.h hVar = recyclerView.j0;
                int[] iArr4 = (int[]) hVar.f1145d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                hVar.f1144c = 0;
            } else {
                a();
                o oVar = recyclerView.f917i0;
                if (oVar != null) {
                    oVar.a(recyclerView, i6, i7);
                }
            }
        }
        u uVar3 = recyclerView.f932r.f2841e;
        if (uVar3 != null && uVar3.f2909d) {
            uVar3.g(0, 0);
        }
        this.f2937j = false;
        if (!this.f2938k) {
            recyclerView.setScrollState(0);
            recyclerView.e0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = p0.p0.f3233a;
            recyclerView.postOnAnimation(this);
        }
    }
}
