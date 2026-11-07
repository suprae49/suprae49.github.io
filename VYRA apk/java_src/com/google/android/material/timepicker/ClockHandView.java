package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f1609s = 0;
    public final ValueAnimator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f1613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f1614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f1615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1616m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1617o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f1618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1619q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1620r;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f = valueAnimator;
        this.f1611h = new ArrayList();
        Paint paint = new Paint();
        this.f1614k = paint;
        this.f1615l = new RectF();
        this.f1620r = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a2.a.f20k, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        t2.i.K(context, R.attr.motionDurationLong2, 200);
        t2.i.L(context, R.attr.motionEasingEmphasizedInterpolator, b2.a.f1048b);
        this.f1619q = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1612i = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f1616m = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1613j = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i4 = ClockHandView.f1609s;
                this.f1625a.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final void a(float f) {
        this.f.cancel();
        b(f);
    }

    public final void b(float f) {
        float f4 = f % 360.0f;
        this.n = f4;
        this.f1618p = Math.toRadians(f4 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i4 = this.f1620r;
        int iRound = this.f1619q;
        if (i4 == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f5 = width;
        float f6 = iRound;
        float fCos = (((float) Math.cos(this.f1618p)) * f6) + f5;
        float fSin = (f6 * ((float) Math.sin(this.f1618p))) + height;
        float f7 = this.f1612i;
        this.f1615l.set(fCos - f7, fSin - f7, fCos + f7, fSin + f7);
        ArrayList arrayList = this.f1611h;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.L - f4) > 0.001f) {
                clockFaceView.L = f4;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i4 = this.f1620r;
        int iRound = this.f1619q;
        if (i4 == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f = width;
        float f4 = iRound;
        float fCos = (((float) Math.cos(this.f1618p)) * f4) + f;
        float f5 = height;
        float fSin = (f4 * ((float) Math.sin(this.f1618p))) + f5;
        Paint paint = this.f1614k;
        paint.setStrokeWidth(0.0f);
        int i5 = this.f1612i;
        canvas.drawCircle(fCos, fSin, i5, paint);
        double dSin = Math.sin(this.f1618p);
        double d5 = iRound - i5;
        paint.setStrokeWidth(this.f1616m);
        canvas.drawLine(f, f5, width + ((int) (Math.cos(this.f1618p) * d5)), height + ((int) (d5 * dSin)), paint);
        canvas.drawCircle(f, f5, this.f1613j, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (this.f.isRunning()) {
            return;
        }
        a(this.n);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        boolean z6 = false;
        if (actionMasked == 0) {
            this.f1617o = false;
            z4 = true;
            z5 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z5 = this.f1617o;
            if (this.f1610g) {
                this.f1620r = ((float) Math.hypot((double) (x4 - ((float) (getWidth() / 2))), (double) (y4 - ((float) (getHeight() / 2))))) <= ((float) Math.round(((float) this.f1619q) * 0.66f)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z4 = false;
        } else {
            z5 = false;
            z4 = false;
        }
        boolean z7 = this.f1617o;
        int degrees = (int) Math.toDegrees(Math.atan2(y4 - (getHeight() / 2), x4 - (getWidth() / 2)));
        int i4 = degrees + 90;
        if (i4 < 0) {
            i4 = degrees + 450;
        }
        float f = i4;
        boolean z8 = this.n != f;
        if (z4 && z8) {
            z6 = true;
        } else if (z8 || z5) {
            a(f);
            z6 = true;
        }
        this.f1617o = z7 | z6;
        return true;
    }
}
