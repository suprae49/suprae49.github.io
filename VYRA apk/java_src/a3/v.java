package a3;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f159c;

    @Override // a3.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f160a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f158b, this.f159c);
        path.transform(matrix);
    }
}
