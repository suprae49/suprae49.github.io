package h3;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends e4.a {
    public static int o0(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        return i4 < 1073741824 ? (int) ((i4 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static Map p0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return n.f;
        }
        int i4 = 0;
        if (size == 1) {
            g3.b bVar = (g3.b) arrayList.get(0);
            bVar.getClass();
            Map mapSingletonMap = Collections.singletonMap(bVar.f, bVar.f2150g);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o0(arrayList.size()));
        int size2 = arrayList.size();
        while (i4 < size2) {
            Object obj = arrayList.get(i4);
            i4++;
            g3.b bVar2 = (g3.b) obj;
            linkedHashMap.put(bVar2.f, bVar2.f2150g);
        }
        return linkedHashMap;
    }
}
