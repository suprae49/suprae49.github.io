package n1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable implements Animatable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final LinearInterpolator f3113l = new LinearInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e1.a f3114m = new e1.a(1);
    public static final int[] n = {-16777216};
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Resources f3116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ValueAnimator f3117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3119k;

    public d(Context context) {
        context.getClass();
        this.f3116h = context.getResources();
        c cVar = new c();
        this.f = cVar;
        cVar.f3101i = n;
        cVar.a(0);
        cVar.f3100h = 2.5f;
        cVar.f3095b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f3113l);
        valueAnimatorOfFloat.addListener(new b(this, cVar));
        this.f3117i = valueAnimatorOfFloat;
    }

    public static void d(float f, c cVar) {
        if (f <= 0.75f) {
            cVar.f3112u = cVar.f3101i[cVar.f3102j];
            return;
        }
        float f4 = (f - 0.75f) / 0.25f;
        int[] iArr = cVar.f3101i;
        int i4 = cVar.f3102j;
        int i5 = iArr[i4];
        int i6 = iArr[(i4 + 1) % iArr.length];
        int i7 = (i5 >> 24) & 255;
        int i8 = (i5 >> 16) & 255;
        int i9 = (i5 >> 8) & 255;
        int i10 = i5 & 255;
        cVar.f3112u = ((i7 + ((int) ((((i6 >> 24) & 255) - i7) * f4))) << 24) | ((i8 + ((int) ((((i6 >> 16) & 255) - i8) * f4))) << 16) | ((i9 + ((int) ((((i6 >> 8) & 255) - i9) * f4))) << 8) | (i10 + ((int) (f4 * ((i6 & 255) - i10))));
    }

    public final void a(float f, c cVar, boolean z4) {
        float interpolation;
        if (this.f3119k) {
            d(f, cVar);
            float fFloor = (float) (Math.floor(cVar.f3105m / 0.8f) + 1.0d);
            float f4 = cVar.f3103k;
            float f5 = cVar.f3104l;
            cVar.f3098e = (((f5 - 0.01f) - f4) * f) + f4;
            cVar.f = f5;
            float f6 = cVar.f3105m;
            cVar.f3099g = ((fFloor - f6) * f) + f6;
            return;
        }
        if (f != 1.0f || z4) {
            float f7 = cVar.f3105m;
            float interpolation2 = cVar.f3103k;
            e1.a aVar = f3114m;
            if (f < 0.5f) {
                interpolation = (aVar.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                float f8 = interpolation2 + 0.79f;
                interpolation2 = f8 - (((1.0f - aVar.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f8;
            }
            float f9 = (0.20999998f * f) + f7;
            float f10 = (f + this.f3118j) * 216.0f;
            cVar.f3098e = interpolation2;
            cVar.f = interpolation;
            cVar.f3099g = f9;
            this.f3115g = f10;
        }
    }

    public final void b(float f, float f4, float f5, float f6) {
        float f7 = this.f3116h.getDisplayMetrics().density;
        float f8 = f4 * f7;
        c cVar = this.f;
        cVar.f3100h = f8;
        cVar.f3095b.setStrokeWidth(f8);
        cVar.f3108q = f * f7;
        cVar.a(0);
        cVar.f3109r = (int) (f5 * f7);
        cVar.f3110s = (int) (f6 * f7);
    }

    public final void c(int i4) {
        if (i4 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f3115g, bounds.exactCenterX(), bounds.exactCenterY());
        c cVar = this.f;
        Paint paint = cVar.f3095b;
        RectF rectF = cVar.f3094a;
        float f = cVar.f3108q;
        float fMin = (cVar.f3100h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((cVar.f3109r * cVar.f3107p) / 2.0f, cVar.f3100h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f4 = cVar.f3098e;
        float f5 = cVar.f3099g;
        float f6 = (f4 + f5) * 360.0f;
        float f7 = ((cVar.f + f5) * 360.0f) - f6;
        paint.setColor(cVar.f3112u);
        paint.setAlpha(cVar.f3111t);
        float f8 = cVar.f3100h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, cVar.f3097d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        canvas.drawArc(rectF, f6, f7, false, paint);
        Paint paint2 = cVar.f3096c;
        if (cVar.n) {
            Path path = cVar.f3106o;
            if (path == null) {
                Path path2 = new Path();
                cVar.f3106o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f10 = (cVar.f3109r * cVar.f3107p) / 2.0f;
            cVar.f3106o.moveTo(0.0f, 0.0f);
            cVar.f3106o.lineTo(cVar.f3109r * cVar.f3107p, 0.0f);
            Path path3 = cVar.f3106o;
            float f11 = cVar.f3109r;
            float f12 = cVar.f3107p;
            path3.lineTo((f11 * f12) / 2.0f, cVar.f3110s * f12);
            cVar.f3106o.offset((rectF.centerX() + fMin2) - f10, (cVar.f3100h / 2.0f) + rectF.centerY());
            cVar.f3106o.close();
            paint2.setColor(cVar.f3112u);
            paint2.setAlpha(cVar.f3111t);
            canvas.save();
            canvas.rotate(f6 + f7, rectF.centerX(), rectF.centerY());
            canvas.drawPath(cVar.f3106o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f.f3111t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f3117i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f.f3111t = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.f3095b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f3117i.cancel();
        c cVar = this.f;
        float f = cVar.f3098e;
        cVar.f3103k = f;
        float f4 = cVar.f;
        cVar.f3104l = f4;
        cVar.f3105m = cVar.f3099g;
        if (f4 != f) {
            this.f3119k = true;
            this.f3117i.setDuration(666L);
            this.f3117i.start();
            return;
        }
        cVar.a(0);
        cVar.f3103k = 0.0f;
        cVar.f3104l = 0.0f;
        cVar.f3105m = 0.0f;
        cVar.f3098e = 0.0f;
        cVar.f = 0.0f;
        cVar.f3099g = 0.0f;
        this.f3117i.setDuration(1332L);
        this.f3117i.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f3117i.cancel();
        this.f3115g = 0.0f;
        c cVar = this.f;
        if (cVar.n) {
            cVar.n = false;
        }
        cVar.a(0);
        cVar.f3103k = 0.0f;
        cVar.f3104l = 0.0f;
        cVar.f3105m = 0.0f;
        cVar.f3098e = 0.0f;
        cVar.f = 0.0f;
        cVar.f3099g = 0.0f;
        invalidateSelf();
    }
}
