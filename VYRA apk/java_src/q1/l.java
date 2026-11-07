package q1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f3419p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f3420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f3421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f3422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f3423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f3424e;
    public PathMeasure f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f3425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f3429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f3431m;
    public Boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p.f f3432o;

    public l(l lVar) {
        this.f3422c = new Matrix();
        this.f3426h = 0.0f;
        this.f3427i = 0.0f;
        this.f3428j = 0.0f;
        this.f3429k = 0.0f;
        this.f3430l = 255;
        this.f3431m = null;
        this.n = null;
        p.f fVar = new p.f(0);
        this.f3432o = fVar;
        this.f3425g = new i(lVar.f3425g, fVar);
        this.f3420a = new Path(lVar.f3420a);
        this.f3421b = new Path(lVar.f3421b);
        this.f3426h = lVar.f3426h;
        this.f3427i = lVar.f3427i;
        this.f3428j = lVar.f3428j;
        this.f3429k = lVar.f3429k;
        this.f3430l = lVar.f3430l;
        this.f3431m = lVar.f3431m;
        String str = lVar.f3431m;
        if (str != null) {
            fVar.put(str, this);
        }
        this.n = lVar.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(i iVar, Matrix matrix, Canvas canvas, int i4, int i5) {
        int i6;
        float f;
        int i7;
        Matrix matrix2 = iVar.f3406a;
        ArrayList arrayList = iVar.f3407b;
        matrix2.set(matrix);
        Matrix matrix3 = iVar.f3406a;
        matrix3.preConcat(iVar.f3414j);
        canvas.save();
        char c4 = 0;
        int i8 = 0;
        while (i8 < arrayList.size()) {
            j jVar = (j) arrayList.get(i8);
            if (jVar instanceof i) {
                a((i) jVar, matrix3, canvas, i4, i5);
            } else {
                if (jVar instanceof k) {
                    k kVar = (k) jVar;
                    float f4 = i4 / this.f3428j;
                    float f5 = i5 / this.f3429k;
                    float fMin = Math.min(f4, f5);
                    Matrix matrix4 = this.f3422c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f4, f5);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c4], fArr[1]);
                    boolean z4 = c4;
                    i6 = i8;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f6 = (fArr[z4 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f6) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f3420a;
                        path.reset();
                        f0.d[] dVarArr = kVar.f3416a;
                        if (dVarArr != null) {
                            f0.d.b(dVarArr, path);
                        }
                        Path path2 = this.f3421b;
                        path2.reset();
                        if (kVar instanceof g) {
                            path2.setFillType(kVar.f3418c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            h hVar = (h) kVar;
                            float f7 = hVar.f3401i;
                            if (f7 != 0.0f || hVar.f3402j != 1.0f) {
                                float f8 = hVar.f3403k;
                                float f9 = (f7 + f8) % 1.0f;
                                float f10 = (hVar.f3402j + f8) % 1.0f;
                                if (this.f == null) {
                                    this.f = new PathMeasure();
                                }
                                this.f.setPath(path, z4);
                                float length = this.f.getLength();
                                float f11 = f9 * length;
                                float f12 = f10 * length;
                                path.reset();
                                PathMeasure pathMeasure = this.f;
                                if (f11 > f12) {
                                    pathMeasure.getSegment(f11, length, path, true);
                                    f = 0.0f;
                                    this.f.getSegment(0.0f, f12, path, true);
                                } else {
                                    f = 0.0f;
                                    pathMeasure.getSegment(f11, f12, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            e0.d dVar = hVar.f;
                            float f13 = 255.0f;
                            if (((Shader) dVar.f2014b) == null && dVar.f2013a == 0) {
                                f13 = 255.0f;
                                i7 = 16777215;
                            } else {
                                if (this.f3424e == null) {
                                    i7 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f3424e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i7 = 16777215;
                                }
                                Paint paint2 = this.f3424e;
                                Shader shader = (Shader) dVar.f2014b;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(hVar.f3400h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i9 = dVar.f2013a;
                                    float f14 = hVar.f3400h;
                                    PorterDuff.Mode mode = o.f3445o;
                                    paint2.setColor((i9 & i7) | (((int) (Color.alpha(i9) * f14)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(hVar.f3418c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            e0.d dVar2 = hVar.f3397d;
                            if (((Shader) dVar2.f2014b) != null || dVar2.f2013a != 0) {
                                if (this.f3423d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f3423d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f3423d;
                                Paint.Join join = hVar.f3405m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = hVar.f3404l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(hVar.n);
                                Shader shader2 = (Shader) dVar2.f2014b;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(hVar.f3399g * f13));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i10 = dVar2.f2013a;
                                    float f15 = hVar.f3399g;
                                    PorterDuff.Mode mode2 = o.f3445o;
                                    paint4.setColor((i10 & i7) | (((int) (Color.alpha(i10) * f15)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(hVar.f3398e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i8 = i6 + 1;
                c4 = 0;
            }
            i6 = i8;
            i8 = i6 + 1;
            c4 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f3430l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i4) {
        this.f3430l = i4;
    }

    public l() {
        this.f3422c = new Matrix();
        this.f3426h = 0.0f;
        this.f3427i = 0.0f;
        this.f3428j = 0.0f;
        this.f3429k = 0.0f;
        this.f3430l = 255;
        this.f3431m = null;
        this.n = null;
        this.f3432o = new p.f(0);
        this.f3425g = new i();
        this.f3420a = new Path();
        this.f3421b = new Path();
    }
}
