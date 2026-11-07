package p0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class m1 extends l1 {
    public m1(y1 y1Var, WindowInsets windowInsets) {
        super(y1Var, windowInsets);
    }

    @Override // p0.t1
    public y1 a() {
        return y1.h(null, this.f3210c.consumeDisplayCutout());
    }

    @Override // p0.k1, p0.t1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Objects.equals(this.f3210c, m1Var.f3210c) && Objects.equals(this.f3213g, m1Var.f3213g) && k1.J(this.f3214h, m1Var.f3214h);
    }

    @Override // p0.t1
    public h g() {
        DisplayCutout displayCutout = this.f3210c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new h(displayCutout);
    }

    @Override // p0.t1
    public int hashCode() {
        return this.f3210c.hashCode();
    }
}
