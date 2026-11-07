package a3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f148c;

    public s(u uVar) {
        this.f148c = uVar;
    }

    @Override // a3.x
    public final void a(Matrix matrix, z2.a aVar, int i4, Canvas canvas) {
        u uVar = this.f148c;
        float f = uVar.f;
        float f4 = uVar.f157g;
        RectF rectF = new RectF(uVar.f153b, uVar.f154c, uVar.f155d, uVar.f156e);
        Paint paint = aVar.f4886b;
        boolean z4 = f4 < 0.0f;
        Path path = aVar.f4890g;
        int[] iArr = z2.a.f4883k;
        if (z4) {
            iArr[0] = 0;
            iArr[1] = aVar.f;
            iArr[2] = aVar.f4889e;
            iArr[3] = aVar.f4888d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f4);
            path.close();
            float f5 = -i4;
            rectF.inset(f5, f5);
            iArr[0] = 0;
            iArr[1] = aVar.f4888d;
            iArr[2] = aVar.f4889e;
            iArr[3] = aVar.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0) {
            return;
        }
        float f6 = 1.0f - (i4 / fWidth);
        float[] fArr = z2.a.f4884l;
        fArr[1] = f6;
        fArr[2] = ((1.0f - f6) / 2.0f) + f6;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z4) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f4891h);
        }
        canvas.drawArc(rectF, f, f4, true, paint);
        canvas.restore();
    }
}
