package l1;

import android.os.Bundle;
import androidx.fragment.app.q;
import androidx.lifecycle.j;
import e.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import m.f;
import r3.g;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f3007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f3009e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f3005a = new f();
    public boolean f = true;

    public final Bundle a(String str) {
        if (!this.f3008d) {
            q.j("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            return null;
        }
        Bundle bundle = this.f3007c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f3007c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f3007c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f3007c = null;
        return bundle2;
    }

    public final b b() {
        String str;
        b bVar;
        Iterator it = this.f3005a.iterator();
        do {
            m.b bVar2 = (m.b) it;
            if (!bVar2.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) bVar2.next();
            entry.getClass();
            str = (String) entry.getKey();
            bVar = (b) entry.getValue();
        } while (!g.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    public final void c(String str, b bVar) {
        Object obj;
        bVar.getClass();
        f fVar = this.f3005a;
        m.c cVarA = fVar.a(str);
        if (cVarA != null) {
            obj = cVarA.f3043g;
        } else {
            m.c cVar = new m.c(str, bVar);
            fVar.f3050i++;
            m.c cVar2 = fVar.f3048g;
            if (cVar2 == null) {
                fVar.f = cVar;
                fVar.f3048g = cVar;
            } else {
                cVar2.f3044h = cVar;
                cVar.f3045i = cVar2;
                fVar.f3048g = cVar;
            }
            obj = null;
        }
        if (((b) obj) == null) {
            return;
        }
        q.q("SavedStateProvider with the given key is already registered");
    }

    public final void d() {
        if (!this.f) {
            q.j("Can not perform this action after onSaveInstanceState");
            return;
        }
        h hVar = this.f3009e;
        if (hVar == null) {
            hVar = new h(this);
        }
        this.f3009e = hVar;
        try {
            j.class.getDeclaredConstructor(null);
            h hVar2 = this.f3009e;
            if (hVar2 != null) {
                ((LinkedHashSet) hVar2.f1935b).add(j.class.getName());
            }
        } catch (NoSuchMethodException e5) {
            throw new IllegalArgumentException("Class " + j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
        }
    }
}
