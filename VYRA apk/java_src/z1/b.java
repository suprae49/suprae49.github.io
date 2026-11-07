package z1;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f4858b;

    public b(JSONObject jSONObject) {
        ArrayList arrayList;
        boolean zOptBoolean = jSONObject.optBoolean("enabled", false);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("linkActions");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            arrayList = new ArrayList(length);
            for (int i4 = 0; i4 < length; i4++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i4));
            }
        } else {
            arrayList = null;
        }
        c cVar = new c(arrayList);
        this.f4857a = zOptBoolean;
        this.f4858b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4857a == bVar.f4857a && r3.g.a(this.f4858b, bVar.f4858b);
    }

    public final int hashCode() {
        return this.f4858b.hashCode() + (Boolean.hashCode(this.f4857a) * 31);
    }

    public final String toString() {
        return "ContextMenuConfig(enabled=" + this.f4857a + ", linkActions=" + this.f4858b + ")";
    }

    public b(boolean z4, c cVar) {
        this.f4857a = z4;
        this.f4858b = cVar;
    }

    public b(boolean z4, JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            arrayList.add(jSONArray.optString(i4));
        }
        c cVar = new c(arrayList);
        this.f4857a = z4;
        this.f4858b = cVar;
    }
}
