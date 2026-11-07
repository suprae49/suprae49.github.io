package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f2095m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f2096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2100e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f2101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f2105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2106l;

    public b(Context context) {
        Paint paint = new Paint();
        this.f2096a = paint;
        this.f2101g = new Path();
        this.f2103i = false;
        this.f2106l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, d.a.n, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f2105k = (float) (Math.cos(f2095m) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f != z4) {
            this.f = z4;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f2100e) {
            this.f2100e = fRound;
            invalidateSelf();
        }
        this.f2102h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f2098c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f2097b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f2099d = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f, float f4, float f5) {
        return ((f4 - f) * f5) + f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z4 = false;
        int i4 = this.f2106l;
        if (i4 != 0 && (i4 == 1 || (i4 == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z4 = true;
        }
        float f = this.f2097b;
        float fSqrt = (float) Math.sqrt(f * f * 2.0f);
        float f4 = this.f2104j;
        float f5 = this.f2098c;
        float fA = a(f5, fSqrt, f4);
        float fA2 = a(f5, this.f2099d, this.f2104j);
        float fRound = Math.round(a(0.0f, this.f2105k, this.f2104j));
        float fA3 = a(0.0f, f2095m, this.f2104j);
        float fA4 = a(z4 ? 0.0f : -180.0f, z4 ? 180.0f : 0.0f, this.f2104j);
        double d5 = fA;
        double d6 = fA3;
        float fRound2 = Math.round(Math.cos(d6) * d5);
        float fRound3 = Math.round(Math.sin(d6) * d5);
        Path path = this.f2101g;
        path.rewind();
        float f6 = this.f2100e;
        Paint paint = this.f2096a;
        float fA5 = a(f6 + paint.getStrokeWidth(), -this.f2105k, this.f2104j);
        float f7 = (-fA2) / 2.0f;
        path.moveTo(f7 + fRound, 0.0f);
        path.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f7, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f7, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f8 = this.f2100e;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f8 + ((((int) (fHeight - (f8 * 2.0f))) / 4) * 2));
        if (this.f) {
            canvas.rotate(fA4 * (this.f2103i ^ z4 ? -1 : 1));
        } else if (z4) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2102h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2102h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Paint paint = this.f2096a;
        if (i4 != paint.getAlpha()) {
            paint.setAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2096a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
