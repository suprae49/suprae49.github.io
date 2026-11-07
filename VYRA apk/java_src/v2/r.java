package v2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f4395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f4396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f4397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PathMeasure f4398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f4399e;

    public r(l lVar) {
        Path path = new Path();
        this.f4396b = path;
        this.f4397c = new Path();
        this.f4398d = new PathMeasure(path, false);
        this.f4395a = lVar;
        this.f4399e = new Matrix();
    }

    public abstract void a();

    public final void b(Canvas canvas, Rect rect, float f, boolean z4, boolean z5) {
        this.f4395a.b();
        f fVar = (f) this;
        float fWidth = rect.width() / fVar.g();
        float fHeight = rect.height() / fVar.g();
        l lVar = fVar.f4395a;
        float f4 = (lVar.f4361r / 2.0f) + lVar.f4362s;
        canvas.translate((f4 * fWidth) + rect.left, (f4 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (lVar.f4363t != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f5 = -f4;
        canvas.clipRect(f5, f5, f4, f4);
        int i4 = lVar.f4346a;
        float f6 = i4;
        fVar.f = f6 * f;
        fVar.f4310g = Math.min(i4 / 2, lVar.f4349d ? (int) (f6 * lVar.f4348c) : lVar.f4347b) * f;
        fVar.f4311h = lVar.f4356l * f;
        int i5 = lVar.f4361r;
        int i6 = lVar.f4346a;
        float f7 = (i5 - i6) / 2.0f;
        fVar.f4312i = f7;
        if (z4 || z5) {
            float f8 = ((1.0f - f) * i6) / 2.0f;
            if ((z4 && lVar.f4351g == 2) || (z5 && lVar.f4352h == 1)) {
                fVar.f4312i = f7 + f8;
            } else if ((z4 && lVar.f4351g == 1) || (z5 && lVar.f4352h == 2)) {
                fVar.f4312i = f7 - f8;
            }
        }
        if (z5 && lVar.f4352h == 3) {
            fVar.f4317o = f;
        } else {
            fVar.f4317o = 1.0f;
        }
    }
}
