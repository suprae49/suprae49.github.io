package z1;

import androidx.fragment.app.q;
import java.util.Locale;
import org.json.JSONObject;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f4873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f4874d;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(JSONObject jSONObject) {
        int i4;
        boolean zOptBoolean = jSONObject.optBoolean("animated", false);
        String strOptString = jSONObject.optString("animationLoop", "infinite");
        strOptString.getClass();
        String upperCase = strOptString.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (upperCase == null) {
            throw new NullPointerException("Name is null");
        }
        if (upperCase.equals("ONCE")) {
            i4 = 1;
        } else if (upperCase.equals("INFINITE")) {
            i4 = 2;
        } else {
            q.q("No enum constant co.median.median_core.dto.Loop.".concat(upperCase));
            i4 = 0;
        }
        this(zOptBoolean, i4, i.I(x1.a.y(jSONObject, "backgroundColor", null)), i.I(x1.a.y(jSONObject, "backgroundColorDark", null)));
    }

    public final Integer a() {
        return this.f4873c;
    }

    public final Integer b() {
        return this.f4874d;
    }

    public final void c(Integer num) {
        this.f4873c = num;
    }

    public final void d(Integer num) {
        this.f4874d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4871a == fVar.f4871a && this.f4872b == fVar.f4872b && r3.g.a(this.f4873c, fVar.f4873c) && r3.g.a(this.f4874d, fVar.f4874d);
    }

    public final int hashCode() {
        int iB = (s.e.b(this.f4872b) + (Boolean.hashCode(this.f4871a) * 31)) * 31;
        Integer num = this.f4873c;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f4874d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str;
        Integer num = this.f4873c;
        Integer num2 = this.f4874d;
        StringBuilder sb = new StringBuilder("SplashScreenConfig(animated=");
        sb.append(this.f4871a);
        sb.append(", loop=");
        int i4 = this.f4872b;
        if (i4 != 1) {
            str = i4 != 2 ? "null" : "INFINITE";
        } else {
            str = "ONCE";
        }
        sb.append(str);
        sb.append(", backgroundColor=");
        sb.append(num);
        sb.append(", backgroundColorDark=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }

    public f() {
        this(false, 2, null, null);
    }

    public f(boolean z4, int i4, Integer num, Integer num2) {
        if (i4 != 0) {
            this.f4871a = z4;
            this.f4872b = i4;
            this.f4873c = num;
            this.f4874d = num2;
            return;
        }
        throw null;
    }
}
