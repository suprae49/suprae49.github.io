package a3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f151e;

    public t(v vVar, float f, float f4) {
        this.f149c = vVar;
        this.f150d = f;
        this.f151e = f4;
    }

    @Override // a3.x
    public final void a(Matrix matrix, z2.a aVar, int i4, Canvas canvas) {
        v vVar = this.f149c;
        float f = vVar.f159c;
        float f4 = this.f151e;
        float f5 = vVar.f158b;
        float f6 = this.f150d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f4, f5 - f6), 0.0f);
        Matrix matrix2 = this.f162a;
        matrix2.set(matrix);
        matrix2.preTranslate(f6, f4);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i4;
        rectF.offset(0.0f, -i4);
        int i5 = aVar.f;
        int[] iArr = z2.a.f4881i;
        iArr[0] = i5;
        iArr[1] = aVar.f4889e;
        iArr[2] = aVar.f4888d;
        Paint paint = aVar.f4887c;
        float f7 = rectF.left;
        paint.setShader(new LinearGradient(f7, rectF.top, f7, rectF.bottom, iArr, z2.a.f4882j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        v vVar = this.f149c;
        return (float) Math.toDegrees(Math.atan((vVar.f159c - this.f151e) / (vVar.f158b - this.f150d)));
    }
}
