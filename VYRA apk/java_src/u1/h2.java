package u1;

import android.app.Activity;
import android.util.Pair;
import co.median.android.MainActivity;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k.a f3946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f3948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f3949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0.b f3950e;
    public ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashSet f3951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o0 f3952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f3955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3956l;

    public final void a(x1.i iVar) {
        Iterator it = this.f3948c.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.f3948c.get(str) == iVar) {
                it.remove();
                this.f3951g.add(str);
            }
        }
    }

    public final void b(MainActivity mainActivity) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArray = x1.a.u(mainActivity).O0;
        if (jSONArray == null) {
            return;
        }
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("urls")) != null) {
                HashSet hashSet = new HashSet();
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    if (!jSONArrayOptJSONArray.isNull(i5)) {
                        Object objOpt = jSONArrayOptJSONArray.opt(i5);
                        String strOptString = objOpt instanceof String ? (String) objOpt : null;
                        i2 i2Var = i2.f3970i;
                        if (strOptString == null && (objOpt instanceof JSONObject)) {
                            JSONObject jSONObject = (JSONObject) objOpt;
                            strOptString = jSONObject.optString(ImagesContract.URL);
                            String strY = x1.a.y(jSONObject, "disown", null);
                            if (strY != null) {
                                if (strY.equalsIgnoreCase("reload")) {
                                    i2Var = i2.f3968g;
                                } else if (strY.equalsIgnoreCase("never")) {
                                    i2Var = i2.f3969h;
                                } else if (strY.equalsIgnoreCase("always")) {
                                    i2Var = i2.f;
                                }
                            }
                        }
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                            this.f3949d.put(strOptString, i2Var);
                        }
                    }
                }
                this.f.add(hashSet);
            }
        }
        String str = this.f3955k;
        if (str != null) {
            d(str);
        }
        c(mainActivity);
    }

    public final void c(Activity activity) {
        if (this.f3956l || this.f3954j) {
            return;
        }
        if (this.f3952h != null && this.f3953i != null) {
            activity.runOnUiThread(new d3.d0(14, this));
            this.f3954j = true;
        } else {
            if (this.f3951g.isEmpty()) {
                return;
            }
            String str = (String) this.f3951g.iterator().next();
            this.f3953i = str;
            this.f3946a.f2465c = str;
            activity.runOnUiThread(new c2.d(this, activity, str, 2));
        }
    }

    public final Pair d(String str) {
        this.f3955k = str;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Set set = (Set) obj;
            if (set.contains(str)) {
                hashSet.addAll(set);
            }
        }
        if (hashSet.size() > 0) {
            HashSet hashSet2 = new HashSet(hashSet);
            String str2 = this.f3953i;
            if (str2 != null) {
                hashSet2.remove(str2);
            }
            hashSet2.removeAll(this.f3948c.keySet());
            this.f3951g.addAll(hashSet2);
        }
        x1.i iVar = (x1.i) this.f3948c.get(str);
        return iVar == null ? new Pair(null, null) : new Pair(iVar, (i2) this.f3949d.get(str));
    }
}
