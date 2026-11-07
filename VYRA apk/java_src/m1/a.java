package m1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.z;
import co.median.android.eeqadjy.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f3065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f3066e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3069c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f3068b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3067a = new HashMap();

    public a(Context context) {
        this.f3069c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f3065d == null) {
            synchronized (f3066e) {
                try {
                    if (f3065d == null) {
                        f3065d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3065d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f3069c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f3068b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e5) {
                throw new z(e5);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = this.f3067a;
        if (e4.a.P()) {
            try {
                e4.a.c(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f3069c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new z(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
