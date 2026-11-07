package v2;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;
import k.y2;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends Drawable implements Animatable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y2 f4375r = new y2("growFraction", 12, Float.class);
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f4376g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObjectAnimator f4378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObjectAnimator f4379j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f4381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4382m;
    public float n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4384p;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f4380k = -1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f4383o = new Paint();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f4385q = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f4377h = new a();

    public o(Context context, l lVar) {
        this.f = context;
        this.f4376g = lVar;
        setAlpha(255);
    }

    public final float b() {
        l lVar = this.f4376g;
        if (lVar.f4351g == 0 && lVar.f4352h == 0) {
            return 1.0f;
        }
        return this.n;
    }

    public final float c() {
        float f = this.f4380k;
        if (f > 0.0f) {
            return f;
        }
        boolean z4 = this instanceof m;
        l lVar = this.f4376g;
        if (lVar.a(z4) && lVar.f4357m != 0) {
            a aVar = this.f4377h;
            ContentResolver contentResolver = this.f.getContentResolver();
            aVar.getClass();
            float f4 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f4 > 0.0f) {
                int i4 = (int) ((((z4 ? lVar.f4354j : lVar.f4355k) * 1000.0f) / lVar.f4357m) * f4);
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) i4)) / i4;
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    public final boolean d(boolean z4, boolean z5, boolean z6) {
        a aVar = this.f4377h;
        ContentResolver contentResolver = this.f.getContentResolver();
        aVar.getClass();
        return e(z4, z5, z6 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean e(boolean z4, boolean z5, boolean z6) {
        ObjectAnimator objectAnimator = this.f4378i;
        int i4 = 0;
        y2 y2Var = f4375r;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, y2Var, 0.0f, 1.0f);
            this.f4378i = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f4378i.setInterpolator(b2.a.f1048b);
            ObjectAnimator objectAnimator2 = this.f4378i;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                androidx.fragment.app.q.q("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.f4378i = objectAnimator2;
            objectAnimator2.addListener(new n(this, i4));
        }
        int i5 = 1;
        if (this.f4379j == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, y2Var, 1.0f, 0.0f);
            this.f4379j = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f4379j.setInterpolator(b2.a.f1048b);
            ObjectAnimator objectAnimator3 = this.f4379j;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                androidx.fragment.app.q.q("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.f4379j = objectAnimator3;
            objectAnimator3.addListener(new n(this, i5));
        }
        if (isVisible() || z4) {
            ObjectAnimator objectAnimator4 = z4 ? this.f4378i : this.f4379j;
            ObjectAnimator objectAnimator5 = z4 ? this.f4379j : this.f4378i;
            if (!z6) {
                if (objectAnimator5.isRunning()) {
                    boolean z7 = this.f4382m;
                    this.f4382m = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.f4382m = z7;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z8 = this.f4382m;
                    this.f4382m = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f4382m = z8;
                }
                return super.setVisible(z4, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z9 = !z4 || super.setVisible(z4, false);
                l lVar = this.f4376g;
                if (!z4 ? lVar.f4352h != 0 : lVar.f4351g != 0) {
                    boolean z10 = this.f4382m;
                    this.f4382m = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f4382m = z10;
                    return z9;
                }
                if (z5 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z9;
                }
                objectAnimator4.resume();
                return z9;
            }
        }
        return false;
    }

    public final void f(d dVar) {
        ArrayList arrayList = this.f4381l;
        if (arrayList == null || !arrayList.contains(dVar)) {
            return;
        }
        this.f4381l.remove(dVar);
        if (this.f4381l.isEmpty()) {
            this.f4381l = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4384p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f4378i;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.f4379j;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f4384p = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4383o.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        return d(z4, z5, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
