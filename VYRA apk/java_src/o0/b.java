package o0;

import android.graphics.drawable.Drawable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3132b;

    public b(CharSequence charSequence, Drawable drawable) {
        this.f3131a = charSequence;
        this.f3132b = drawable;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f3131a, this.f3131a) && Objects.equals(bVar.f3132b, this.f3132b);
    }

    public final int hashCode() {
        Object obj = this.f3131a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3132b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f3131a + " " + this.f3132b + "}";
    }
}
