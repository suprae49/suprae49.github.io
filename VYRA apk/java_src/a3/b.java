package a3;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f41a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f42b;

    public b(float f, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f41a;
            f += ((b) dVar).f42b;
        }
        this.f41a = dVar;
        this.f42b = f;
    }

    @Override // a3.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f41a.a(rectF) + this.f42b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f41a.equals(bVar.f41a) && this.f42b == bVar.f42b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41a, Float.valueOf(this.f42b)});
    }
}
