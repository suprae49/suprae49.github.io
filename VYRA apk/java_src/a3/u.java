package a3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f152h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f156e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f157g;

    public u(float f, float f4, float f5, float f6) {
        this.f153b = f;
        this.f154c = f4;
        this.f155d = f5;
        this.f156e = f6;
    }

    @Override // a3.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f160a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f155d;
        float f4 = this.f156e;
        RectF rectF = f152h;
        rectF.set(this.f153b, this.f154c, f, f4);
        path.arcTo(rectF, this.f, this.f157g, false);
        path.transform(matrix);
    }
}
