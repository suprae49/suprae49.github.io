package co.median.android.widget;

import a3.f;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import co.median.android.eeqadjy.R;
import e0.l;
import java.util.WeakHashMap;
import p0.p0;
import u1.m1;
import w1.j;
import w1.k;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class SwipeHistoryNavigationLayout extends FrameLayout {
    public boolean A;
    public float B;
    public float C;
    public boolean D;
    public k E;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f1197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EdgeEffect f1198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f1200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f1203m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f1205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f1206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f1207r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f1208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f1209t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1210u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1211v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1212w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1213x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f1214y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f1215z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeHistoryNavigationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        float dimension = getResources().getDimension(R.dimen.handle_icon_size);
        this.f1199i = dimension;
        this.f1200j = dimension / (getContext().getResources().getDisplayMetrics().densityDpi / 160);
        this.f1202l = Float.NaN;
        this.f1203m = Float.NaN;
        this.n = Float.NaN;
        this.f1204o = Float.NaN;
        this.f1205p = Float.NaN;
        this.f1206q = 0.05f;
        this.f1207r = 0.16f;
        this.f1208s = 80.0f;
        this.f1209t = 30.0f;
        this.f1210u = Integer.MIN_VALUE;
        this.f1214y = Float.NaN;
        this.f1215z = Float.NaN;
        this.E = new f(26);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m1.f4005a, 0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 == null) {
            Resources resources = typedArrayObtainStyledAttributes.getResources();
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = l.f2031a;
            drawable2 = resources.getDrawable(R.drawable.ic_baseline_arrow_back_24, theme);
        }
        Drawable drawable3 = drawable2;
        Drawable drawable4 = typedArrayObtainStyledAttributes.getDrawable(5);
        if (drawable4 == null) {
            Resources resources2 = typedArrayObtainStyledAttributes.getResources();
            Resources.Theme theme2 = context.getTheme();
            ThreadLocal threadLocal2 = l.f2031a;
            drawable4 = resources2.getDrawable(R.drawable.ic_baseline_arrow_forward_24, theme2);
        }
        String string = typedArrayObtainStyledAttributes.getString(4);
        String str = string == null ? "" : string;
        Resources resources3 = typedArrayObtainStyledAttributes.getResources();
        Resources.Theme theme3 = context.getTheme();
        ThreadLocal threadLocal3 = l.f2031a;
        int color = typedArrayObtainStyledAttributes.getColor(2, resources3.getColor(R.color.swipe_nav_inactive, theme3));
        this.f1201k = typedArrayObtainStyledAttributes.getColor(0, typedArrayObtainStyledAttributes.getResources().getColor(R.color.swipe_nav_active, context.getTheme()));
        this.f = new j(context, drawable, drawable3, str, color, this.f1201k);
        this.f1197g = new j(context, drawable, drawable4, "", color, this.f1201k);
        this.f1198h = new EdgeEffect(context);
        setWillNotDraw(false);
    }

    public final void a() {
        if (this.f1211v) {
            j jVar = this.f;
            jVar.c();
            jVar.b();
        } else if (this.f1212w) {
            j jVar2 = this.f1197g;
            jVar2.c();
            jVar2.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean zDraw;
        canvas.getClass();
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.f1198h;
        if (overScrollMode == 0 || getOverScrollMode() == 1) {
            if (!edgeEffect.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(getPaddingTop(), -width);
                edgeEffect.setSize(height, width);
                zDraw = edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (zDraw) {
                WeakHashMap weakHashMap = p0.f3233a;
                postInvalidateOnAnimation();
            }
        }
        edgeEffect.finish();
        zDraw = false;
        if (zDraw) {
            WeakHashMap weakHashMap2 = p0.f3233a;
            postInvalidateOnAnimation();
        }
    }

    public final k getSwipeNavListener() {
        return this.E;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return true;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        addView(this.f, new FrameLayout.LayoutParams(-2, -2, 19));
        addView(this.f1197g, new FrameLayout.LayoutParams(-2, -2, 16));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e2, code lost:
    
        if (r7.f1213x != false) goto L52;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.median.android.widget.SwipeHistoryNavigationLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4) {
            float f = this.f1199i;
            float f4 = -f;
            this.f1202l = f4;
            this.f.setTranslationX(f4);
            float width = getWidth() + f;
            this.f1203m = width;
            this.f1197g.setTranslationX(width);
            this.n = getWidth() * this.f1206q;
            this.f1204o = getWidth() - this.n;
            this.f1205p = getWidth() * this.f1207r;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zIsFinished;
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        EdgeEffect edgeEffect = this.f1198h;
        j jVar = this.f1197g;
        j jVar2 = this.f;
        boolean z4 = false;
        if (numValueOf == null || numValueOf.intValue() != 2) {
            if (numValueOf != null && numValueOf.intValue() == 1) {
                edgeEffect.onRelease();
                boolean z5 = this.f1211v;
                Property property = View.TRANSLATION_X;
                if (z5) {
                    if (this.A) {
                        a();
                        this.E.e();
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(jVar2, (Property<j, Float>) property, jVar2.getTranslationX(), this.f1202l);
                    objectAnimatorOfFloat.setDuration(400L);
                    objectAnimatorOfFloat.start();
                } else if (this.f1212w) {
                    if (this.A) {
                        a();
                        this.E.g();
                    }
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(jVar, (Property<j, Float>) property, jVar.getTranslationX(), this.f1203m);
                    objectAnimatorOfFloat2.setDuration(400L);
                    objectAnimatorOfFloat2.start();
                }
                this.f1211v = false;
                this.f1212w = false;
                this.A = false;
                this.f1213x = false;
                zIsFinished = edgeEffect.isFinished();
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (z4) {
                WeakHashMap weakHashMap = p0.f3233a;
                postInvalidateOnAnimation();
            }
            return super.onTouchEvent(motionEvent);
        }
        float x4 = motionEvent.getX();
        this.f1214y = this.f1215z;
        this.f1215z = Math.abs(x4 - this.f1210u);
        boolean z6 = this.f1211v;
        float f = this.f1199i;
        float f4 = this.f1209t;
        if (z6 && this.E.f()) {
            float f5 = this.f1215z;
            if (f5 >= f4) {
                jVar2.setTranslationX(Math.min(((f5 - f4) - this.f1210u) - f, this.f1205p - f));
            } else if (this.f1212w) {
            }
            zIsFinished = false;
        } else if (this.f1212w || !this.E.f() || this.f1215z < f4) {
            zIsFinished = false;
        } else {
            if (this.E.b()) {
                jVar.setTranslationX(Math.max((f / 2) + (this.f1210u - (this.f1215z - f4)), getWidth() - this.f1205p));
            } else {
                float f6 = this.f1215z;
                float f7 = this.f1214y;
                if (f6 > f7) {
                    edgeEffect.onPull(Math.abs(f6 - f7) / getWidth());
                    zIsFinished = true;
                }
            }
            zIsFinished = false;
        }
        float f8 = this.f1215z;
        float f9 = this.f1205p + this.f1208s + this.f1200j;
        boolean z7 = this.A;
        if (f8 > f9) {
            if (!z7) {
                this.A = true;
                if (this.f1211v && this.E.i()) {
                    this.E.getClass();
                    jVar2.a();
                    jVar2.d();
                } else if (this.f1212w && this.E.b()) {
                    this.E.getClass();
                    jVar.a();
                    jVar.d();
                }
            }
        } else if (z7) {
            this.A = false;
            a();
        }
        z4 = zIsFinished;
        if (z4) {
            WeakHashMap weakHashMap2 = p0.f3233a;
            postInvalidateOnAnimation();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setActiveColor(int i4) {
        this.f1201k = i4;
        this.f1197g.setActiveColor(i4);
        this.f.setActiveColor(i4);
    }

    public final void setSwipeNavListener(k kVar) {
        kVar.getClass();
        this.E = kVar;
    }
}
