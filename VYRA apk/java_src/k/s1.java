package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f2633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r1 f2634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r1 f2635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2637m;
    public final int[] n = new int[2];

    public s1(View view) {
        this.f2633i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2631g = tapTimeout;
        this.f2632h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        r1 r1Var = this.f2635k;
        View view = this.f2633i;
        if (r1Var != null) {
            view.removeCallbacks(r1Var);
        }
        r1 r1Var2 = this.f2634j;
        if (r1Var2 != null) {
            view.removeCallbacks(r1Var2);
        }
    }

    public abstract j.c0 b();

    public abstract boolean c();

    public boolean d() {
        j.c0 c0VarB = b();
        if (c0VarB == null || !c0VarB.b()) {
            return true;
        }
        c0VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z4;
        p1 p1VarG;
        boolean z5 = this.f2636l;
        View view2 = this.f2633i;
        if (z5) {
            j.c0 c0VarB = b();
            if (c0VarB != null && c0VarB.b() && (p1VarG = c0VarB.g()) != null && p1VarG.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.n;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                p1VarG.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = p1VarG.b(motionEventObtainNoHistory, this.f2637m);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z6 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z6) {
                    z4 = true;
                } else if (d()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } else if (d()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f2637m = motionEvent.getPointerId(0);
                    if (this.f2634j == null) {
                        this.f2634j = new r1(this, 0);
                    }
                    view2.postDelayed(this.f2634j, this.f2631g);
                    if (this.f2635k == null) {
                        this.f2635k = new r1(this, 1);
                    }
                    view2.postDelayed(this.f2635k, this.f2632h);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f2637m);
                    if (iFindPointerIndex >= 0) {
                        float x4 = motionEvent.getX(iFindPointerIndex);
                        float y4 = motionEvent.getY(iFindPointerIndex);
                        float f = this.f;
                        float f4 = -f;
                        if (x4 < f4 || y4 < f4 || x4 >= (view2.getRight() - view2.getLeft()) + f || y4 >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z4 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z4 = false;
            } else {
                z4 = false;
            }
            if (z4) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f2636l = z4;
        return z4 || z5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2636l = false;
        this.f2637m = -1;
        r1 r1Var = this.f2634j;
        if (r1Var != null) {
            this.f2633i.removeCallbacks(r1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
