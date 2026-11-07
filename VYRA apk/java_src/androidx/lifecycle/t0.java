package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f861a = new LinkedHashMap();

    public final void a() {
        for (p0 p0Var : this.f861a.values()) {
            p0Var.f855c = true;
            HashMap map = p0Var.f853a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = p0Var.f853a.values().iterator();
                        while (it.hasNext()) {
                            p0.a(it.next());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = p0Var.f854b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = p0Var.f854b.iterator();
                        while (it2.hasNext()) {
                            p0.a((Closeable) it2.next());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            p0Var.b();
        }
        this.f861a.clear();
    }
}
