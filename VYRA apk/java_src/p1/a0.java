package p1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f3277b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3276a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3278c = new ArrayList();

    public a0(View view) {
        this.f3277b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f3277b == a0Var.f3277b && this.f3276a.equals(a0Var.f3276a);
    }

    public final int hashCode() {
        return this.f3276a.hashCode() + (this.f3277b.hashCode() * 31);
    }

    public final String toString() {
        String strConcat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3277b + "\n").concat("    values:");
        HashMap map = this.f3276a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
