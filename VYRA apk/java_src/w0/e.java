package w0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.fragment.app.q;
import d3.d0;
import java.util.Arrays;
import java.util.WeakHashMap;
import k1.z;
import p0.p0;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final z f4427y = new z(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4429b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f4431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f4432e;
    public float[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f4433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f4434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f4435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f4436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f4438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f4439m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverScroller f4443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f4444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f4445t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4446u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f4447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z f4448w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4430c = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d0 f4449x = new d0(15, this);

    public e(Context context, ViewGroup viewGroup, i iVar) {
        if (iVar == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.f4447v = viewGroup;
        this.f4444s = iVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i4 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f4441p = i4;
        this.f4440o = i4;
        this.f4429b = viewConfiguration.getScaledTouchSlop();
        this.f4439m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4448w = f4427y;
        this.f4443r = new OverScroller(context, new d(this));
    }

    public final void a() {
        this.f4430c = -1;
        float[] fArr = this.f4431d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4432e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.f4433g, 0.0f);
            Arrays.fill(this.f4434h, 0);
            Arrays.fill(this.f4435i, 0);
            Arrays.fill(this.f4436j, 0);
            this.f4437k = 0;
        }
        VelocityTracker velocityTracker = this.f4438l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4438l = null;
        }
    }

    public final void b(View view, int i4) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f4447v;
        if (parent != viewGroup) {
            q.h(viewGroup, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            return;
        }
        this.f4445t = view;
        this.f4430c = i4;
        this.f4444s.B(view, i4);
        o(1);
    }

    public final boolean c(float f, float f4, int i4, int i5) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f4);
        if ((this.f4434h[i4] & i5) != i5 || (this.f4442q & i5) == 0 || (this.f4436j[i4] & i5) == i5 || (this.f4435i[i4] & i5) == i5) {
            return false;
        }
        float f5 = this.f4429b;
        if (fAbs <= f5 && fAbs2 <= f5) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f4444s.getClass();
        }
        return (this.f4435i[i4] & i5) == 0 && fAbs > ((float) this.f4429b);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    public final boolean d(View view, float f, float f4) {
        if (view != null) {
            i iVar = this.f4444s;
            boolean z4 = iVar.q(view) > 0;
            boolean z5 = iVar.r() > 0;
            if (z4 && z5) {
                float f5 = (f4 * f4) + (f * f);
                int i4 = this.f4429b;
                if (f5 > i4 * i4) {
                    return true;
                }
            } else if (!z4 ? !(!z5 || Math.abs(f4) <= this.f4429b) : Math.abs(f) > this.f4429b) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i4) {
        float[] fArr = this.f4431d;
        if (fArr != null) {
            int i5 = this.f4437k;
            int i6 = 1 << i4;
            if ((i5 & i6) != 0) {
                fArr[i4] = 0.0f;
                this.f4432e[i4] = 0.0f;
                this.f[i4] = 0.0f;
                this.f4433g[i4] = 0.0f;
                this.f4434h[i4] = 0;
                this.f4435i[i4] = 0;
                this.f4436j[i4] = 0;
                this.f4437k = (~i6) & i5;
            }
        }
    }

    public final int f(int i4, int i5, int i6) {
        if (i4 == 0) {
            return 0;
        }
        int width = this.f4447v.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i4) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i5);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i4) / i6) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f4428a == 2) {
            OverScroller overScroller = this.f4443r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f4445t.getLeft();
            int top = currY - this.f4445t.getTop();
            if (left != 0) {
                View view = this.f4445t;
                WeakHashMap weakHashMap = p0.f3233a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f4445t;
                WeakHashMap weakHashMap2 = p0.f3233a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f4444s.D(this.f4445t, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f4447v.post(this.f4449x);
            }
        }
        return this.f4428a == 2;
    }

    public final View h(int i4, int i5) {
        ViewGroup viewGroup = this.f4447v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f4444s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i4, int i5, int i6, int i7) {
        float f;
        float f4;
        float f5;
        float f6;
        int left = this.f4445t.getLeft();
        int top = this.f4445t.getTop();
        int i8 = i4 - left;
        int i9 = i5 - top;
        OverScroller overScroller = this.f4443r;
        if (i8 == 0 && i9 == 0) {
            overScroller.abortAnimation();
            o(0);
            return false;
        }
        View view = this.f4445t;
        int i10 = (int) this.n;
        int i11 = (int) this.f4439m;
        int iAbs = Math.abs(i6);
        if (iAbs < i10) {
            i6 = 0;
        } else if (iAbs > i11) {
            i6 = i6 > 0 ? i11 : -i11;
        }
        int i12 = (int) this.n;
        int iAbs2 = Math.abs(i7);
        if (iAbs2 < i12) {
            i7 = 0;
        } else if (iAbs2 > i11) {
            i7 = i7 > 0 ? i11 : -i11;
        }
        int iAbs3 = Math.abs(i8);
        int iAbs4 = Math.abs(i9);
        int iAbs5 = Math.abs(i6);
        int iAbs6 = Math.abs(i7);
        int i13 = iAbs5 + iAbs6;
        int i14 = iAbs3 + iAbs4;
        if (i6 != 0) {
            f = iAbs5;
            f4 = i13;
        } else {
            f = iAbs3;
            f4 = i14;
        }
        float f7 = f / f4;
        if (i7 != 0) {
            f5 = iAbs6;
            f6 = i13;
        } else {
            f5 = iAbs4;
            f6 = i14;
        }
        float f8 = f5 / f6;
        i iVar = this.f4444s;
        int iF = (int) ((f(i9, i7, iVar.r()) * f8) + (f(i8, i6, iVar.q(view)) * f7));
        this.f4448w = f4427y;
        overScroller.startScroll(left, top, i8, i9, iF);
        o(2);
        return true;
    }

    public final void j(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f4438l == null) {
            this.f4438l = VelocityTracker.obtain();
        }
        this.f4438l.addMovement(motionEvent);
        i iVar = this.f4444s;
        int i5 = 0;
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewH = h((int) x4, (int) y4);
            m(x4, y4, pointerId);
            s(viewH, pointerId);
            if ((this.f4434h[pointerId] & this.f4442q) != 0) {
                iVar.A();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f4428a == 1) {
                k();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f4428a == 1) {
                int i6 = this.f4430c;
                if (((this.f4437k & (1 << i6)) != 0 ? 1 : 0) == 0 || (iFindPointerIndex = motionEvent.findPointerIndex(i6)) == -1) {
                    return;
                }
                float x5 = motionEvent.getX(iFindPointerIndex);
                float y5 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f;
                int i7 = this.f4430c;
                int i8 = (int) (x5 - fArr[i7]);
                int i9 = (int) (y5 - this.f4433g[i7]);
                int left = this.f4445t.getLeft() + i8;
                int top = this.f4445t.getTop() + i9;
                int left2 = this.f4445t.getLeft();
                int top2 = this.f4445t.getTop();
                if (i8 != 0) {
                    left = iVar.c(this.f4445t, left);
                    WeakHashMap weakHashMap = p0.f3233a;
                    this.f4445t.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = iVar.d(this.f4445t, top);
                    WeakHashMap weakHashMap2 = p0.f3233a;
                    this.f4445t.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    iVar.D(this.f4445t, left, top);
                }
            } else {
                int pointerCount = motionEvent.getPointerCount();
                for (int i10 = 0; i10 < pointerCount; i10++) {
                    int pointerId2 = motionEvent.getPointerId(i10);
                    if ((this.f4437k & (1 << pointerId2)) != 0) {
                        float x6 = motionEvent.getX(i10);
                        float y6 = motionEvent.getY(i10);
                        float f = x6 - this.f4431d[pointerId2];
                        float f4 = y6 - this.f4432e[pointerId2];
                        l(f, f4, pointerId2);
                        if (this.f4428a == 1) {
                            break;
                        }
                        View viewH2 = h((int) x6, (int) y6);
                        if (d(viewH2, f, f4) && s(viewH2, pointerId2)) {
                            break;
                        }
                    }
                }
            }
            n(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f4428a == 1) {
                this.f4446u = true;
                iVar.E(this.f4445t, 0.0f, 0.0f);
                this.f4446u = false;
                if (this.f4428a == 1) {
                    o(0);
                }
            }
            a();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f4428a == 1 && pointerId3 == this.f4430c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i5 >= pointerCount2) {
                        i4 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i5);
                    if (pointerId4 != this.f4430c) {
                        View viewH3 = h((int) motionEvent.getX(i5), (int) motionEvent.getY(i5));
                        View view = this.f4445t;
                        if (viewH3 == view && s(view, pointerId4)) {
                            i4 = this.f4430c;
                            break;
                        }
                    }
                    i5++;
                }
                if (i4 == -1) {
                    k();
                }
            }
            e(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x7 = motionEvent.getX(actionIndex);
        float y7 = motionEvent.getY(actionIndex);
        m(x7, y7, pointerId5);
        if (this.f4428a == 0) {
            s(h((int) x7, (int) y7), pointerId5);
            if ((this.f4434h[pointerId5] & this.f4442q) != 0) {
                iVar.A();
                return;
            }
            return;
        }
        int i11 = (int) x7;
        int i12 = (int) y7;
        View view2 = this.f4445t;
        if (view2 != null && i11 >= view2.getLeft() && i11 < view2.getRight() && i12 >= view2.getTop() && i12 < view2.getBottom()) {
            i5 = 1;
        }
        if (i5 != 0) {
            s(this.f4445t, pointerId5);
        }
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f4438l;
        float f = this.f4439m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f4438l.getXVelocity(this.f4430c);
        float f4 = this.n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f4) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f4438l.getYVelocity(this.f4430c);
        float f5 = this.n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f5) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f4446u = true;
        this.f4444s.E(this.f4445t, xVelocity, f);
        this.f4446u = false;
        if (this.f4428a == 1) {
            o(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [t2.i] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l(float f, float f4, int i4) {
        int i5;
        boolean zC = c(f, f4, i4, 1);
        ?? r4 = zC;
        if (c(f4, f, i4, 4)) {
            r4 = (zC ? 1 : 0) | 4;
        }
        ?? r5 = r4;
        if (c(f, f4, i4, 2)) {
            r5 = (r4 == true ? 1 : 0) | 2;
        }
        ?? r6 = r5;
        if (c(f4, f, i4, 8)) {
            i5 = (r5 == true ? 1 : 0) | 8;
        }
        if (r6 == 0) {
            r6 = i5;
            return;
        }
        r6 = i5;
        int[] iArr = this.f4435i;
        iArr[i4] = (iArr[i4] | r6) == true ? 1 : 0;
        this.f4444s.z(r6, i4);
    }

    public final void m(float f, float f4, int i4) {
        float[] fArr = this.f4431d;
        if (fArr == null || fArr.length <= i4) {
            int i5 = i4 + 1;
            float[] fArr2 = new float[i5];
            float[] fArr3 = new float[i5];
            float[] fArr4 = new float[i5];
            float[] fArr5 = new float[i5];
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f4432e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f4433g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f4434h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4435i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f4436j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4431d = fArr2;
            this.f4432e = fArr3;
            this.f = fArr4;
            this.f4433g = fArr5;
            this.f4434h = iArr;
            this.f4435i = iArr2;
            this.f4436j = iArr3;
        }
        float[] fArr9 = this.f4431d;
        this.f[i4] = f;
        fArr9[i4] = f;
        float[] fArr10 = this.f4432e;
        this.f4433g[i4] = f4;
        fArr10[i4] = f4;
        int[] iArr7 = this.f4434h;
        int i6 = (int) f;
        int i7 = (int) f4;
        ViewGroup viewGroup = this.f4447v;
        int i8 = i6 < viewGroup.getLeft() + this.f4440o ? 1 : 0;
        if (i7 < viewGroup.getTop() + this.f4440o) {
            i8 |= 4;
        }
        if (i6 > viewGroup.getRight() - this.f4440o) {
            i8 |= 2;
        }
        if (i7 > viewGroup.getBottom() - this.f4440o) {
            i8 |= 8;
        }
        iArr7[i4] = i8;
        this.f4437k |= 1 << i4;
    }

    public final void n(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            int pointerId = motionEvent.getPointerId(i4);
            if ((this.f4437k & (1 << pointerId)) != 0) {
                float x4 = motionEvent.getX(i4);
                float y4 = motionEvent.getY(i4);
                this.f[pointerId] = x4;
                this.f4433g[pointerId] = y4;
            }
        }
    }

    public final void o(int i4) {
        this.f4447v.removeCallbacks(this.f4449x);
        if (this.f4428a != i4) {
            this.f4428a = i4;
            this.f4444s.C(i4);
            if (this.f4428a == 0) {
                this.f4445t = null;
            }
        }
    }

    public final boolean p(int i4, int i5) {
        if (this.f4446u) {
            return i(i4, i5, (int) this.f4438l.getXVelocity(this.f4430c), (int) this.f4438l.getYVelocity(this.f4430c));
        }
        q.j("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    public final boolean q(MotionEvent motionEvent) {
        View viewH;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f4438l == null) {
            this.f4438l = VelocityTracker.obtain();
        }
        this.f4438l.addMovement(motionEvent);
        i iVar = this.f4444s;
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m(x4, y4, pointerId);
            View viewH2 = h((int) x4, (int) y4);
            if (viewH2 == this.f4445t && this.f4428a == 2) {
                s(viewH2, pointerId);
            }
            if ((this.f4434h[pointerId] & this.f4442q) != 0) {
                iVar.A();
            }
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x5 = motionEvent.getX(actionIndex);
                float y5 = motionEvent.getY(actionIndex);
                m(x5, y5, pointerId2);
                int i4 = this.f4428a;
                if (i4 == 0) {
                    if ((this.f4434h[pointerId2] & this.f4442q) != 0) {
                        iVar.A();
                    }
                } else if (i4 == 2 && (viewH = h((int) x5, (int) y5)) == this.f4445t) {
                    s(viewH, pointerId2);
                }
            } else if (actionMasked == 6) {
                e(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f4431d != null && this.f4432e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i5 = 0; i5 < pointerCount; i5++) {
                int pointerId3 = motionEvent.getPointerId(i5);
                if ((this.f4437k & (1 << pointerId3)) != 0) {
                    float x6 = motionEvent.getX(i5);
                    float y6 = motionEvent.getY(i5);
                    float f = x6 - this.f4431d[pointerId3];
                    float f4 = y6 - this.f4432e[pointerId3];
                    View viewH3 = h((int) x6, (int) y6);
                    boolean zD = d(viewH3, f, f4);
                    if (!zD) {
                        l(f, f4, pointerId3);
                        if (this.f4428a != 1) {
                            break;
                        }
                    } else {
                        int left = viewH3.getLeft();
                        int iC = iVar.c(viewH3, ((int) f) + left);
                        int top = viewH3.getTop();
                        int iD = iVar.d(viewH3, ((int) f4) + top);
                        int iQ = iVar.q(viewH3);
                        int iR = iVar.r();
                        if ((iQ == 0 || (iQ > 0 && iC == left)) && (iR == 0 || (iR > 0 && iD == top))) {
                            break;
                        }
                        l(f, f4, pointerId3);
                        if (this.f4428a != 1 || (zD && s(viewH3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            n(motionEvent);
        }
        return this.f4428a == 1;
    }

    public final boolean r(View view, int i4, int i5) {
        this.f4445t = view;
        this.f4430c = -1;
        boolean zI = i(i4, i5, 0, 0);
        if (!zI && this.f4428a == 0 && this.f4445t != null) {
            this.f4445t = null;
        }
        return zI;
    }

    public final boolean s(View view, int i4) {
        if (view == this.f4445t && this.f4430c == i4) {
            return true;
        }
        if (view == null || !this.f4444s.Q(view, i4)) {
            return false;
        }
        this.f4430c = i4;
        b(view, i4);
        return true;
    }
}
