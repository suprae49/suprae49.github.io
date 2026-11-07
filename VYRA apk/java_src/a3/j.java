package a3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class j extends Drawable implements z {
    public static final Paint K;
    public static final i[] L;
    public int A;
    public final RectF B;
    public final boolean C;
    public boolean D;
    public o E;
    public z0.e F;
    public final z0.d[] G;
    public float[] H;
    public float[] I;
    public d3.a0 J;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f88g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x[] f89h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x[] f90i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BitSet f91j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f92k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f93l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Matrix f94m;
    public final Path n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Path f95o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RectF f96p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RectF f97q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Region f98r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Region f99s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f100t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Paint f101u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z2.a f102v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g f103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q f104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PorterDuffColorFilter f105y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PorterDuffColorFilter f106z;

    static {
        Paint paint = new Paint(1);
        K = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        L = new i[4];
        int i4 = 0;
        while (true) {
            i[] iVarArr = L;
            if (i4 >= iVarArr.length) {
                return;
            }
            iVarArr[i4] = new i(i4);
            i4++;
        }
    }

    public j(h hVar) {
        this.f = new g(this);
        this.f89h = new x[4];
        this.f90i = new x[4];
        this.f91j = new BitSet(8);
        this.f94m = new Matrix();
        this.n = new Path();
        this.f95o = new Path();
        this.f96p = new RectF();
        this.f97q = new RectF();
        this.f98r = new Region();
        this.f99s = new Region();
        Paint paint = new Paint(1);
        this.f100t = paint;
        Paint paint2 = new Paint(1);
        this.f101u = paint2;
        this.f102v = new z2.a();
        this.f104x = q.b();
        this.B = new RectF();
        this.C = true;
        this.D = true;
        this.G = new z0.d[4];
        this.f88g = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        v();
        t(getState());
        this.f103w = new g(this);
    }

    public final void b(RectF rectF, Path path) {
        this.f104x.a(this.f88g.f70a.c(), this.H, this.f88g.f77i, rectF, this.f103w, path);
        if (this.f88g.f76h != 1.0f) {
            Matrix matrix = this.f94m;
            matrix.reset();
            float f = this.f88g.f76h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.B, true);
    }

    public final float c(RectF rectF, o oVar, float[] fArr) {
        if (fArr == null) {
            if (oVar.j(rectF)) {
                return oVar.f127e.a(rectF);
            }
            return -1.0f;
        }
        if (this.D) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int d(int i4) {
        int i5;
        h hVar = this.f88g;
        float f = hVar.f81m + 0.0f + hVar.f80l;
        p2.a aVar = hVar.f71b;
        if (aVar == null || !aVar.f3356a || f0.b.d(i4, 255) != aVar.f3359d) {
            return i4;
        }
        float f4 = aVar.f3360e;
        float fMin = (f4 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i4);
        int iU = e4.a.U(f0.b.d(i4, 255), aVar.f3357b, fMin);
        if (fMin > 0.0f && (i5 = aVar.f3358c) != 0) {
            iU = f0.b.b(f0.b.d(i5, p2.a.f), iU);
        }
        return f0.b.d(iU, iAlpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f105y;
        Paint paint2 = this.f100t;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i4 = this.f88g.f79k;
        paint2.setAlpha(((i4 + (i4 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f106z;
        Paint paint3 = this.f101u;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f88g.f78j);
        int alpha2 = paint3.getAlpha();
        int i5 = this.f88g.f79k;
        paint3.setAlpha(((i5 + (i5 >>> 7)) * alpha2) >>> 8);
        boolean z4 = l() || !o();
        Paint.Style style = this.f88g.f83p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z5 = this.f92k;
            paint = paint2;
            Path path = this.n;
            if (z5) {
                if (z4) {
                    b(h(), path);
                }
                this.f92k = false;
            }
            if (l()) {
                canvas.save();
                double d5 = 0;
                canvas.translate((int) (((double) this.f88g.f82o) * Math.sin(Math.toRadians(d5))), (int) (Math.cos(Math.toRadians(d5)) * ((double) this.f88g.f82o)));
                if (this.C) {
                    Rect bounds = getBounds();
                    RectF rectF = this.B;
                    int iWidth = (int) (rectF.width() - bounds.width());
                    int iHeight = (int) (rectF.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + iWidth + " extra height: " + iHeight + " path bounds: " + rectF);
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f88g.n * 2) + ((int) rectF.width()) + iWidth, (this.f88g.n * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i6 = bounds.left;
                    int i7 = this.f88g.n;
                    float f = (i6 - i7) - iWidth;
                    float f4 = (bounds.top - i7) - iHeight;
                    canvas2.translate(-f, -f4);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f4, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.f88g.f70a.c(), this.H, h());
        } else {
            paint = paint2;
        }
        if (m()) {
            if (this.f93l) {
                o oVarJ = j();
                n nVarK = oVarJ.k();
                d dVar = oVarJ.f127e;
                g gVar = this.f;
                nVarK.f116e = gVar.a(dVar);
                nVarK.f = gVar.a(oVarJ.f);
                nVarK.f118h = gVar.a(oVarJ.f129h);
                nVarK.f117g = gVar.a(oVarJ.f128g);
                this.E = nVarK.a();
                float[] fArr = this.H;
                if (fArr != null) {
                    if (this.I == null) {
                        this.I = new float[fArr.length];
                    }
                    float fK = k();
                    int i8 = 0;
                    while (true) {
                        float[] fArr2 = this.H;
                        if (i8 >= fArr2.length) {
                            break;
                        }
                        this.I[i8] = Math.max(0.0f, fArr2[i8] - fK);
                        i8++;
                    }
                } else {
                    this.I = null;
                }
                if (z4) {
                    o oVar = this.E;
                    float[] fArr3 = this.I;
                    float f5 = this.f88g.f77i;
                    RectF rectFH = h();
                    RectF rectF2 = this.f97q;
                    rectF2.set(rectFH);
                    float fK2 = k();
                    rectF2.inset(fK2, fK2);
                    this.f104x.a(oVar, fArr3, f5, rectF2, null, this.f95o);
                }
                this.f93l = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f91j.cardinality() > 0) {
            Log.w("j", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i4 = this.f88g.f82o;
        Path path = this.n;
        z2.a aVar = this.f102v;
        if (i4 != 0) {
            canvas.drawPath(path, aVar.f4885a);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            x xVar = this.f89h[i5];
            int i6 = this.f88g.n;
            Matrix matrix = x.f161b;
            xVar.a(matrix, aVar, i6, canvas);
            this.f90i[i5].a(matrix, aVar, this.f88g.n, canvas);
        }
        if (this.C) {
            double d5 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d5)) * ((double) this.f88g.f82o));
            int iCos = (int) (Math.cos(Math.toRadians(d5)) * ((double) this.f88g.f82o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, K);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, o oVar, float[] fArr, RectF rectF) {
        float fC = c(rectF, oVar, fArr);
        if (fC < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fC * this.f88g.f77i;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void g(Canvas canvas) {
        o oVar = this.E;
        float[] fArr = this.I;
        RectF rectFH = h();
        RectF rectF = this.f97q;
        rectF.set(rectFH);
        float fK = k();
        rectF.inset(fK, fK);
        f(canvas, this.f101u, this.f95o, oVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f88g.f79k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f88g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f88g.getClass();
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fC = c(rectFH, this.f88g.f70a.c(), this.H);
        if (fC >= 0.0f) {
            outline.setRoundRect(getBounds(), fC * this.f88g.f77i);
            return;
        }
        boolean z4 = this.f92k;
        Path path = this.n;
        if (z4) {
            b(rectFH, path);
            this.f92k = false;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            o2.b.a(outline, path);
            return;
        }
        if (i4 >= 29) {
            try {
                o2.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            o2.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f88g.f75g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f98r;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.n;
        b(rectFH, path);
        Region region2 = this.f99s;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.f96p;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.H;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        o oVarJ = j();
        q qVar = this.f104x;
        qVar.getClass();
        float fA = oVarJ.f127e.a(rectFH);
        o oVarJ2 = j();
        qVar.getClass();
        float fA2 = oVarJ2.f129h.a(rectFH) + fA;
        o oVarJ3 = j();
        qVar.getClass();
        float fA3 = fA2 - oVarJ3.f128g.a(rectFH);
        o oVarJ4 = j();
        qVar.getClass();
        return (fA3 - oVarJ4.f.a(rectFH)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f92k = true;
        this.f93l = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f88g.f74e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f88g.getClass();
        ColorStateList colorStateList2 = this.f88g.f73d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f88g.f72c;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.f88g.f70a.e();
    }

    public final o j() {
        return this.f88g.f70a.c();
    }

    public final float k() {
        if (m()) {
            return this.f101u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean l() {
        h hVar = this.f88g;
        hVar.getClass();
        return hVar.n > 0 && !o() && !this.n.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public final boolean m() {
        Paint.Style style = this.f88g.f83p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f101u.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f88g = new h(this.f88g);
        return this;
    }

    public final void n(Context context) {
        this.f88g.f71b = new p2.a(context);
        w();
    }

    public final boolean o() {
        if (this.f88g.f70a.b(getState()).j(h())) {
            return this.H == null || this.D;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f92k = true;
        this.f93l = true;
        super.onBoundsChange(rect);
        if (!this.f88g.f70a.e() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        boolean z4 = false;
        for (z0.d dVar : this.G) {
            if (dVar != null && dVar.f) {
                z4 = true;
                break;
            }
        }
        u(state, true ^ z4);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f88g.f70a.e()) {
            u(iArr, false);
        }
        boolean z4 = t(iArr) || v();
        if (z4) {
            invalidateSelf();
        }
        return z4;
    }

    public final void p(z0.e eVar) {
        if (this.F == eVar) {
            return;
        }
        this.F = eVar;
        int i4 = 0;
        while (true) {
            z0.d[] dVarArr = this.G;
            if (i4 >= dVarArr.length) {
                u(getState(), true);
                invalidateSelf();
                return;
            }
            if (dVarArr[i4] == null) {
                dVarArr[i4] = new z0.d(this, L[i4]);
            }
            z0.d dVar = dVarArr[i4];
            z0.e eVar2 = new z0.e();
            eVar2.a((float) eVar.f4847b);
            double d5 = eVar.f4846a;
            eVar2.b((float) (d5 * d5));
            dVar.f4843k = eVar2;
            i4++;
        }
    }

    public final void q(float f) {
        h hVar = this.f88g;
        if (hVar.f81m != f) {
            hVar.f81m = f;
            w();
        }
    }

    public final void r(ColorStateList colorStateList) {
        h hVar = this.f88g;
        if (hVar.f72c != colorStateList) {
            hVar.f72c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void s(m mVar) {
        if (mVar instanceof o) {
            setShapeAppearanceModel((o) mVar);
            return;
        }
        g0 g0Var = (g0) mVar;
        h hVar = this.f88g;
        if (hVar.f70a != g0Var) {
            hVar.f70a = g0Var;
            u(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        h hVar = this.f88g;
        if (hVar.f79k != i4) {
            hVar.f79k = i4;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f88g.getClass();
        super.invalidateSelf();
    }

    @Override // a3.z
    public final void setShapeAppearanceModel(o oVar) {
        this.f88g.f70a = oVar;
        this.H = null;
        this.I = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f88g.f74e = colorStateList;
        v();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.f88g;
        if (hVar.f != mode) {
            hVar.f = mode;
            v();
            super.invalidateSelf();
        }
    }

    public final boolean t(int[] iArr) {
        boolean z4;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f88g.f72c == null || color2 == (colorForState2 = this.f88g.f72c.getColorForState(iArr, (color2 = (paint2 = this.f100t).getColor())))) {
            z4 = false;
        } else {
            paint2.setColor(colorForState2);
            z4 = true;
        }
        if (this.f88g.f73d == null || color == (colorForState = this.f88g.f73d.getColorForState(iArr, (color = (paint = this.f101u).getColor())))) {
            return z4;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    public final void u(int[] iArr, boolean z4) {
        boolean z5;
        d dVar;
        RectF rectFH = h();
        if (!this.f88g.f70a.e() || rectFH.isEmpty()) {
            return;
        }
        int i4 = 0;
        boolean z6 = z4 | (this.F == null);
        if (this.H == null) {
            this.H = new float[4];
        }
        o oVarB = this.f88g.f70a.b(iArr);
        float[] fArr = this.H;
        if (fArr.length > 1) {
            float f = fArr[0];
            int i5 = 1;
            while (true) {
                if (i5 < fArr.length) {
                    if (fArr[i5] == f) {
                        i5++;
                    }
                } else if (oVarB.j(h())) {
                    z5 = true;
                }
                z5 = false;
            }
        } else if (oVarB.j(h())) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.D = z5;
        if (!z5) {
            this.f92k = true;
            this.f93l = true;
        }
        while (i4 < 4) {
            this.f104x.getClass();
            if (i4 == 1) {
                dVar = oVarB.f128g;
            } else if (i4 != 2) {
                dVar = i4 != 3 ? oVarB.f : oVarB.f127e;
            } else {
                dVar = oVarB.f129h;
            }
            float fA = dVar.a(rectFH);
            if (z6) {
                this.H[i4] = fA;
            }
            z0.d[] dVarArr = this.G;
            z0.d dVar2 = dVarArr[i4];
            if (dVar2 != null) {
                dVar2.a(fA);
                if (z6) {
                    dVarArr[i4].d();
                }
            }
            i4++;
        }
        if (z6) {
            invalidateSelf();
        }
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f105y;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f106z;
        h hVar = this.f88g;
        ColorStateList colorStateList = hVar.f74e;
        PorterDuff.Mode mode = hVar.f;
        if (colorStateList == null || mode == null) {
            int color = this.f100t.getColor();
            int iD = d(color);
            this.A = iD;
            porterDuffColorFilter = iD != color ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iD2 = d(colorStateList.getColorForState(getState(), 0));
            this.A = iD2;
            porterDuffColorFilter = new PorterDuffColorFilter(iD2, mode);
        }
        this.f105y = porterDuffColorFilter;
        this.f88g.getClass();
        this.f106z = null;
        this.f88g.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f105y) && Objects.equals(porterDuffColorFilter3, this.f106z)) ? false : true;
    }

    public final void w() {
        h hVar = this.f88g;
        float f = hVar.f81m + 0.0f;
        hVar.n = (int) Math.ceil(0.75f * f);
        this.f88g.f82o = (int) Math.ceil(f * 0.25f);
        v();
        if (l() || !o()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public j(Context context, AttributeSet attributeSet, int i4, int i5) {
        this(o.g(context, attributeSet, i4, i5).a());
    }

    public j(o oVar) {
        this(new h(oVar));
    }

    public j(m mVar) {
        this(new h(mVar));
    }

    public j() {
        this(new o());
    }
}
