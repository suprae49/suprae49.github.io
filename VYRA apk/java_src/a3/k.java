package a3;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f111a;

    public k(float f) {
        this.f111a = f;
    }

    @Override // a3.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f111a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f111a == ((k) obj).f111a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f111a)});
    }

    public final String toString() {
        return ((int) (this.f111a * 100.0f)) + "%";
    }
}
