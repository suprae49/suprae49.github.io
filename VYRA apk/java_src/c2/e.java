package c2;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.Api;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f1131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OverScroller f1132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1136m;
    public VelocityTracker n;

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i4) {
        z(coordinatorLayout, view, i4, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    @Override // z.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y4;
        boolean z4;
        OverScroller overScroller;
        View view2;
        int iFindPointerIndex;
        if (this.f1136m < 0) {
            this.f1136m = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f1133j) {
            int i4 = this.f1134k;
            if (i4 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i4)) != -1) {
                int y5 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y5 - this.f1135l) > this.f1136m) {
                    this.f1135l = y5;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.f1134k = -1;
                    int x4 = (int) motionEvent.getX();
                    y4 = (int) motionEvent.getY();
                    WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f1240s;
                    if (weakReference == null) {
                    }
                    this.f1133j = z4;
                    if (z4) {
                        this.f1135l = y4;
                        this.f1134k = motionEvent.getPointerId(0);
                        if (this.n == null) {
                            this.n = VelocityTracker.obtain();
                        }
                        overScroller = this.f1132i;
                        if (overScroller != null) {
                            this.f1132i.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.n;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f1134k = -1;
                int x5 = (int) motionEvent.getX();
                y4 = (int) motionEvent.getY();
                WeakReference weakReference2 = ((AppBarLayout.BaseBehavior) this).f1240s;
                z4 = !(weakReference2 == null && ((view2 = (View) weakReference2.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.o(view, x5, y4);
                this.f1133j = z4;
                if (z4) {
                    this.f1135l = y4;
                    this.f1134k = motionEvent.getPointerId(0);
                    if (this.n == null) {
                        this.n = VelocityTracker.obtain();
                    }
                    overScroller = this.f1132i;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f1132i.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.n;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb A[ADDED_TO_REGION] */
    @Override // z.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z4;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1134k);
                if (iFindPointerIndex != -1) {
                    int y4 = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f1135l - y4;
                    this.f1135l = y4;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    z(coordinatorLayout, view, y() - i4, appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange()), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i5 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f1134k = motionEvent.getPointerId(i5);
                    this.f1135l = (int) (motionEvent.getY(i5) + 0.5f);
                }
            }
            z4 = false;
            velocityTracker2 = this.n;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f1133j || z4;
        }
        VelocityTracker velocityTracker3 = this.n;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.n.computeCurrentVelocity(1000);
            float yVelocity = this.n.getYVelocity(this.f1134k);
            AppBarLayout appBarLayout2 = (AppBarLayout) view;
            int i6 = -appBarLayout2.getTotalScrollRange();
            Runnable runnable = this.f1131h;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.f1131h = null;
            }
            if (this.f1132i == null) {
                this.f1132i = new OverScroller(view.getContext());
            }
            this.f1132i.fling(0, w(), 0, Math.round(yVelocity), 0, 0, i6, 0);
            if (this.f1132i.computeScrollOffset()) {
                d dVar = new d(this, coordinatorLayout, view, 0);
                this.f1131h = dVar;
                view.postOnAnimation(dVar);
            } else {
                ((AppBarLayout.BaseBehavior) this).G(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.f1226q) {
                    appBarLayout2.f(appBarLayout2.g(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                }
            }
            z4 = true;
        }
        this.f1133j = false;
        this.f1134k = -1;
        velocityTracker = this.n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.n = null;
        }
        velocityTracker2 = this.n;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f1133j) {
        }
        z4 = false;
        this.f1133j = false;
        this.f1134k = -1;
        velocityTracker = this.n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.n = null;
        }
        velocityTracker2 = this.n;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f1133j) {
        }
    }

    public abstract int y();

    public abstract int z(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6);
}
