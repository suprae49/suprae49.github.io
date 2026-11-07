package z1;

import org.json.JSONObject;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f4869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f4870c;

    public e(JSONObject jSONObject) {
        this(jSONObject.optBoolean("animated", false), i.I(x1.a.y(jSONObject, "indicatorColor", null)), i.I(x1.a.y(jSONObject, "indicatorColorDark", null)));
    }

    public final Integer a() {
        return this.f4869b;
    }

    public final Integer b() {
        return this.f4870c;
    }

    public final void c(Integer num) {
        this.f4869b = num;
    }

    public final void d(Integer num) {
        this.f4870c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4868a == eVar.f4868a && r3.g.a(this.f4869b, eVar.f4869b) && r3.g.a(this.f4870c, eVar.f4870c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f4868a) * 31;
        Integer num = this.f4869b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f4870c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "SpinnerConfig(animated=" + this.f4868a + ", progressColor=" + this.f4869b + ", progressColorDark=" + this.f4870c + ")";
    }

    public e(boolean z4, Integer num, Integer num2) {
        this.f4868a = z4;
        this.f4869b = num;
        this.f4870c = num2;
    }

    public e() {
        this(false, null, null);
    }
}
