package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f812a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f813b;

    public b(HashMap map) {
        this.f813b = map;
        for (Map.Entry entry : map.entrySet()) {
            m mVar = (m) entry.getValue();
            List arrayList = (List) this.f812a.get(mVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f812a.put(mVar, arrayList);
            }
            arrayList.add((c) entry.getKey());
        }
    }

    public static void a(List list, t tVar, m mVar, s sVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f815b;
                try {
                    int i4 = cVar.f814a;
                    if (i4 == 0) {
                        method.invoke(sVar, null);
                    } else if (i4 == 1) {
                        method.invoke(sVar, tVar);
                    } else if (i4 == 2) {
                        method.invoke(sVar, tVar, mVar);
                    }
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                } catch (InvocationTargetException e6) {
                    throw new RuntimeException("Failed to call observer method", e6.getCause());
                }
            }
        }
    }
}
