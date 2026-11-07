package v2;

import android.graphics.Matrix;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f4392a = new float[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f4393b = {1.0f, 0.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f4394c = new Matrix();

    public final void a(float f) {
        float[] fArr = this.f4393b;
        float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
        float[] fArr2 = this.f4392a;
        double d5 = f;
        double d6 = fAtan2;
        fArr2[0] = (float) ((Math.cos(d6) * d5) + ((double) fArr2[0]));
        fArr2[1] = (float) ((Math.sin(d6) * d5) + ((double) fArr2[1]));
    }

    public final void b() {
        Arrays.fill(this.f4392a, 0.0f);
        float[] fArr = this.f4393b;
        Arrays.fill(fArr, 0.0f);
        fArr[0] = 1.0f;
        this.f4394c.reset();
    }

    public final void c(float f) {
        Matrix matrix = this.f4394c;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints(this.f4392a);
        matrix.mapPoints(this.f4393b);
    }
}
