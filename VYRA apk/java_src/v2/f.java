package v2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import java.util.ArrayList;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends r {
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f4310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f4311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f4313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f4316m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f4317o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RectF f4318p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Pair f4319q;

    public f(l lVar) {
        super(lVar);
        this.f4318p = new RectF();
        this.f4319q = new Pair(new q(), new q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v2.r
    public final void a() {
        int i4;
        Path path = this.f4396b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = 2;
            if (i6 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i6++;
        }
        Matrix matrix = this.f4399e;
        matrix.reset();
        float f = this.f4312i;
        matrix.setScale(f, f);
        path.transform(matrix);
        l lVar = this.f4395a;
        boolean zA = lVar.a(this.n);
        PathMeasure pathMeasure = this.f4398d;
        if (zA) {
            pathMeasure.setPath(path, false);
            float f4 = this.f4314k;
            path.rewind();
            float length = pathMeasure.getLength();
            float f5 = 2.0f;
            int iMax = Math.max(3, (int) ((length / (this.n ? lVar.f4354j : lVar.f4355k)) / 2.0f)) * 2;
            this.f4313j = length / iMax;
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < iMax; i7++) {
                q qVar = new q();
                float f6 = i7;
                pathMeasure.getPosTan(this.f4313j * f6, qVar.f4392a, qVar.f4393b);
                q qVar2 = new q();
                float f7 = this.f4313j;
                pathMeasure.getPosTan((f7 / 2.0f) + (f6 * f7), qVar2.f4392a, qVar2.f4393b);
                arrayList.add(qVar);
                qVar2.a(f4 * 2.0f);
                arrayList.add(qVar2);
            }
            arrayList.add((q) arrayList.get(0));
            q qVar3 = (q) arrayList.get(0);
            float[] fArr = qVar3.f4392a;
            char c4 = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i8 = 1;
            while (i8 < arrayList.size()) {
                q qVar4 = (q) arrayList.get(i8);
                float f8 = (this.f4313j / f5) * 0.48f;
                float[] fArr2 = qVar3.f4392a;
                float[] fArr3 = qVar3.f4393b;
                float[] fArr4 = new float[i4];
                float[] fArr5 = new float[i4];
                System.arraycopy(fArr2, i5, fArr4, i5, i4);
                System.arraycopy(fArr3, i5, fArr5, i5, i4);
                new Matrix();
                float[] fArr6 = qVar4.f4392a;
                float[] fArr7 = qVar4.f4393b;
                float[] fArr8 = new float[i4];
                float[] fArr9 = new float[i4];
                System.arraycopy(fArr6, i5, fArr8, i5, i4);
                System.arraycopy(fArr7, i5, fArr9, i5, i4);
                new Matrix();
                char c5 = c4;
                float fAtan2 = (float) Math.atan2(fArr5[c4], fArr5[i5]);
                double d5 = fArr4[i5];
                double d6 = f8;
                int i9 = i5;
                double d7 = fAtan2;
                fArr4[i9] = (float) ((Math.cos(d7) * d6) + d5);
                fArr4[c5] = (float) ((Math.sin(d7) * d6) + ((double) fArr4[c5]));
                double d8 = -f8;
                double dAtan2 = (float) Math.atan2(fArr9[c5], fArr9[i9]);
                fArr8[i9] = (float) ((Math.cos(dAtan2) * d8) + ((double) fArr8[i9]));
                float fSin = (float) ((Math.sin(dAtan2) * d8) + ((double) fArr8[c5]));
                fArr8[c5] = fSin;
                float f9 = fArr4[i9];
                float f10 = fArr4[c5];
                float f11 = fArr8[i9];
                float[] fArr10 = qVar4.f4392a;
                path.cubicTo(f9, f10, f11, fSin, fArr10[i9], fArr10[c5]);
                i8++;
                qVar3 = qVar4;
                c4 = c5;
                i5 = i9;
                pathMeasure = pathMeasure;
                i4 = 2;
                f5 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i5);
    }

    public final void c(Canvas canvas, Paint paint, float f, float f4, int i4, int i5, int i6, float f5, float f6, boolean z4) {
        float f7;
        Canvas canvas2;
        float f8 = f4 >= f ? f4 - f : (f4 + 1.0f) - f;
        float f9 = f % 1.0f;
        if (f9 < 0.0f) {
            f9 += 1.0f;
        }
        if (this.f4317o < 1.0f) {
            float f10 = f9 + f8;
            if (f10 > 1.0f) {
                c(canvas, paint, f9, 1.0f, i4, i5, 0, f5, f6, z4);
                c(canvas, paint, 1.0f, f10, i4, 0, i6, f5, f6, z4);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f4310g / this.f4312i);
        float f11 = f8 - 0.99f;
        if (f11 >= 0.0f) {
            float f12 = ((f11 * degrees) / 180.0f) / 0.01f;
            f8 += f12;
            if (!z4) {
                f9 -= f12 / 2.0f;
            }
        }
        float fK = h0.K(1.0f - this.f4317o, 1.0f, f9);
        float fK2 = h0.K(0.0f, this.f4317o, f8);
        float degrees2 = (float) Math.toDegrees(i5 / this.f4312i);
        float degrees3 = ((fK2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i6 / this.f4312i));
        float f13 = (fK * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        l lVar = this.f4395a;
        boolean z5 = lVar.a(this.n) && z4 && f5 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i4);
        paint.setStrokeWidth(this.f);
        float f14 = this.f4310g * 2.0f;
        float f15 = degrees * 2.0f;
        PathMeasure pathMeasure = this.f4398d;
        if (degrees3 < f15) {
            float f16 = degrees3 / f15;
            float f17 = (degrees * f16) + f13;
            q qVar = new q();
            if (z5) {
                float length = (pathMeasure.getLength() * (f17 / 360.0f)) / 2.0f;
                float f18 = this.f4311h * f5;
                float f19 = this.f4312i;
                if (f19 != this.f4316m || f18 != this.f4314k) {
                    this.f4314k = f18;
                    this.f4316m = f19;
                    a();
                }
                pathMeasure.getPosTan(length, qVar.f4392a, qVar.f4393b);
            } else {
                qVar.c(f17 + 90.0f);
                qVar.a(-this.f4312i);
            }
            paint.setStyle(Paint.Style.FILL);
            d(canvas, paint, qVar, f14, this.f, f16);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap((lVar.f4349d && lVar.f4348c == 0.5f) ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f20 = f13 + degrees;
        float f21 = degrees3 - f15;
        Pair pair = this.f4319q;
        ((q) pair.first).b();
        ((q) pair.second).b();
        if (z5) {
            float f22 = f20 / 360.0f;
            float f23 = f21 / 360.0f;
            float f24 = this.f4311h * f5;
            int i7 = this.n ? lVar.f4354j : lVar.f4355k;
            float f25 = this.f4312i;
            if (f25 != this.f4316m || f24 != this.f4314k || i7 != this.f4315l) {
                this.f4314k = f24;
                this.f4315l = i7;
                this.f4316m = f25;
                a();
            }
            Path path = this.f4397c;
            path.rewind();
            float fI = h0.i(f23, 0.0f, 1.0f);
            if (lVar.a(this.n)) {
                float f26 = f6 / ((float) ((((double) this.f4312i) * 6.283185307179586d) / ((double) this.f4313j)));
                f22 += f26;
                f7 = 0.0f - (f26 * 360.0f);
            } else {
                f7 = 0.0f;
            }
            float f27 = f22 % 1.0f;
            float length2 = (pathMeasure.getLength() * f27) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f27 + fI)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            q qVar2 = (q) pair.first;
            qVar2.b();
            pathMeasure.getPosTan(length2, qVar2.f4392a, qVar2.f4393b);
            q qVar3 = (q) pair.second;
            qVar3.b();
            pathMeasure.getPosTan(length3, qVar3.f4392a, qVar3.f4393b);
            Matrix matrix = this.f4399e;
            matrix.reset();
            matrix.setRotate(f7);
            qVar2.c(f7);
            qVar3.c(f7);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((q) pair.first).c(f20 + 90.0f);
            ((q) pair.first).a(-this.f4312i);
            ((q) pair.second).c(f20 + f21 + 90.0f);
            ((q) pair.second).a(-this.f4312i);
            float f28 = this.f4312i;
            float f29 = -f28;
            RectF rectF = this.f4318p;
            rectF.set(f29, f29, f28, f28);
            canvas.drawArc(rectF, f20, f21, false, paint);
            canvas2 = canvas;
        }
        if (!(lVar.f4349d && lVar.f4348c == 0.5f) && this.f4310g > 0.0f) {
            paint.setStyle(Paint.Style.FILL);
            d(canvas2, paint, (q) pair.first, f14, this.f, 1.0f);
            d(canvas, paint, (q) pair.second, f14, this.f, 1.0f);
        }
    }

    public final void d(Canvas canvas, Paint paint, q qVar, float f, float f4, float f5) {
        float fMin = Math.min(f4, this.f);
        float f6 = f / 2.0f;
        float fMin2 = Math.min(f6, (this.f4310g * fMin) / this.f);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f6, fMin / 2.0f);
        canvas.save();
        float[] fArr = qVar.f4392a;
        canvas.translate(fArr[0], fArr[1]);
        float[] fArr2 = qVar.f4393b;
        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr2[1], fArr2[0])));
        canvas.scale(f5, f5);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final void e(Canvas canvas, Paint paint, p pVar, int i4) {
        int iK = e4.a.k(pVar.f4388c, i4);
        canvas.save();
        canvas.rotate(pVar.f);
        this.n = pVar.f4391g;
        c(canvas, paint, pVar.f4386a, pVar.f4387b, iK, 0, 0, pVar.f4389d, pVar.f4390e, true);
        canvas.restore();
    }

    public final void f(Canvas canvas, Paint paint, float f, float f4, int i4, int i5, int i6) {
        int iK = e4.a.k(i4, i5);
        this.n = false;
        c(canvas, paint, f, f4, iK, i6, i6, 0.0f, 0.0f, false);
    }

    public final int g() {
        l lVar = this.f4395a;
        return (lVar.f4362s * 2) + lVar.f4361r;
    }
}
