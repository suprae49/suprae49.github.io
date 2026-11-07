package z1;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4879e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4880g;

    public g(JSONObject jSONObject) {
        long jOptLong = jSONObject.optLong("delayedTimeInMs", -1L);
        long jOptLong2 = jSONObject.optLong("jsBridgeIntervalTimeInMs", -1L);
        long jOptLong3 = jSONObject.optLong("autoCloseTimeInMs", -1L);
        this.f4875a = jOptLong;
        this.f4876b = jOptLong2;
        this.f4877c = jOptLong3;
        this.f4878d = false;
        this.f4879e = false;
        this.f = 0L;
        this.f4880g = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f4875a == gVar.f4875a && this.f4876b == gVar.f4876b && this.f4877c == gVar.f4877c && this.f4878d == gVar.f4878d && this.f4879e == gVar.f4879e && this.f == gVar.f && this.f4880g == gVar.f4880g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4880g) + ((Long.hashCode(this.f) + ((Boolean.hashCode(this.f4879e) + ((Boolean.hashCode(this.f4878d) + ((Long.hashCode(this.f4877c) + ((Long.hashCode(this.f4876b) + (Long.hashCode(this.f4875a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WidgetConfig(delayedTimeInMs=" + this.f4875a + ", jsBridgeIntervalTimeInMs=" + this.f4876b + ", autoCloseTimeInMs=" + this.f4877c + ", hasCalledShowOnLaunch=" + this.f4878d + ", alreadyShownOnLaunch=" + this.f4879e + ", widgetLastShown=" + this.f + ", isWidgetShowing=" + this.f4880g + ")";
    }
}
