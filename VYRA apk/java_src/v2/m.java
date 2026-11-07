package v2;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o {
    public static final i2.b C = new i2.b(1);
    public TimeInterpolator A;
    public TimeInterpolator B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f4365s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z0.d f4366t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p f4367u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f4368v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ValueAnimator f4370x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ValueAnimator f4371y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TimeInterpolator f4372z;

    public m(Context context, l lVar, f fVar) {
        super(context, lVar);
        this.f4369w = false;
        this.f4365s = fVar;
        p pVar = new p();
        this.f4367u = pVar;
        pVar.f4391g = true;
        z0.d dVar = new z0.d(this, C);
        this.f4366t = dVar;
        z0.e eVar = new z0.e();
        eVar.a(1.0f);
        eVar.b(50.0f);
        dVar.f4843k = eVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f4370x = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new c2.b(this, 2, lVar));
        if (lVar.a(true) && lVar.f4357m != 0) {
            valueAnimator.start();
        }
        if (this.n != 1.0f) {
            this.n = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f4385q)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.f4378i;
            boolean z4 = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f4379j;
            this.f4365s.b(canvas, bounds, fB, z4, objectAnimator2 != null && objectAnimator2.isRunning());
            float fC = c();
            p pVar = this.f4367u;
            pVar.f4390e = fC;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f4383o;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            l lVar = this.f4376g;
            pVar.f4388c = lVar.f4350e[0];
            int i4 = lVar.f4353i;
            if (i4 > 0) {
                this.f4365s.f(canvas, paint, pVar.f4387b, 1.0f, lVar.f, this.f4384p, (int) ((h0.i(pVar.f4387b, 0.0f, 0.01f) * i4) / 0.01f));
            } else {
                this.f4365s.f(canvas, paint, 0.0f, 1.0f, lVar.f, this.f4384p, 0);
            }
            this.f4365s.e(canvas, paint, pVar, this.f4384p);
            int i5 = lVar.f4350e[0];
            this.f4365s.getClass();
            canvas.restore();
        }
    }

    @Override // v2.o
    public final boolean e(boolean z4, boolean z5, boolean z6) {
        boolean zE = super.e(z4, z5, z6);
        a aVar = this.f4377h;
        ContentResolver contentResolver = this.f.getContentResolver();
        aVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.f4369w = true;
            return zE;
        }
        this.f4369w = false;
        this.f4366t.f4843k.b(50.0f / f);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4365s.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4365s.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f4366t.d();
        this.f4367u.f4387b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        float f = i4;
        l lVar = this.f4376g;
        float f4 = (f < lVar.f4358o * 10000.0f || f > lVar.f4359p * 10000.0f) ? 0.0f : 1.0f;
        boolean z4 = this.f4369w;
        p pVar = this.f4367u;
        z0.d dVar = this.f4366t;
        if (z4) {
            dVar.d();
            pVar.f4387b = f / 10000.0f;
            invalidateSelf();
            pVar.f4389d = f4;
            invalidateSelf();
            return true;
        }
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0) {
            float fMin = (float) (10000.0d / (((double) Math.min(iHeight, iWidth)) * 3.141592653589793d));
            if (fMin <= 0.0f) {
                dVar.getClass();
                androidx.fragment.app.q.q("Minimum visible change must be positive.");
                return false;
            }
            dVar.f4840h = fMin;
        }
        dVar.f4835b = pVar.f4387b * 10000.0f;
        dVar.f4836c = true;
        dVar.a(f);
        return true;
    }
}
