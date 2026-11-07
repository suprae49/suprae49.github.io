package d3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a3.j {
    public static final /* synthetic */ int N = 0;
    public g M;

    @Override // a3.j
    public final void g(Canvas canvas) {
        if (this.M.f1710q.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.M.f1710q);
        super.g(canvas);
        canvas.restore();
    }

    @Override // a3.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.M = new g(this.M);
        return this;
    }

    public final void x(float f, float f4, float f5, float f6) {
        RectF rectF = this.M.f1710q;
        if (f == rectF.left && f4 == rectF.top && f5 == rectF.right && f6 == rectF.bottom) {
            return;
        }
        rectF.set(f, f4, f5, f6);
        invalidateSelf();
    }
}
