package b;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import u1.q;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f987a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f988b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f989c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f990d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f991e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f992g = new Bundle();

    public final boolean a(int i4, int i5, Intent intent) {
        String str = (String) this.f987a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f991e.get(str);
        if ((eVar != null ? eVar.f979a : null) != null) {
            ArrayList arrayList = this.f990d;
            if (arrayList.contains(str)) {
                eVar.f979a.a(eVar.f980b.c(i5, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.f992g.putParcelable(str, new ActivityResult(i5, intent));
        return true;
    }

    public abstract void b(int i4, c.a aVar, Object obj);

    public final g c(final String str, t tVar, final c.a aVar, final b bVar) {
        str.getClass();
        aVar.getClass();
        bVar.getClass();
        o lifecycle = tVar.getLifecycle();
        v vVar = (v) lifecycle;
        if (vVar.f866c.compareTo(n.f844i) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(tVar);
            n nVar = vVar.f866c;
            sb.append(" is attempting to register while current state is ");
            sb.append(nVar);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.f989c;
        f fVar = (f) linkedHashMap.get(str);
        if (fVar == null) {
            fVar = new f(lifecycle);
        }
        r rVar = new r() { // from class: b.d
            @Override // androidx.lifecycle.r
            public final void a(t tVar2, m mVar) {
                h hVar = this.f;
                Bundle bundle = hVar.f992g;
                LinkedHashMap linkedHashMap2 = hVar.f991e;
                LinkedHashMap linkedHashMap3 = hVar.f;
                String str2 = str;
                str2.getClass();
                b bVar2 = bVar;
                bVar2.getClass();
                c.a aVar2 = aVar;
                aVar2.getClass();
                if (m.ON_START != mVar) {
                    if (m.ON_STOP == mVar) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (m.ON_DESTROY == mVar) {
                            hVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                linkedHashMap2.put(str2, new e(aVar2, bVar2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bVar2.a(obj);
                }
                ActivityResult activityResult = (ActivityResult) e4.a.G(bundle, str2);
                if (activityResult != null) {
                    bundle.remove(str2);
                    bVar2.a(aVar2.c(activityResult.f, activityResult.f249g));
                }
            }
        };
        fVar.f981a.a(rVar);
        fVar.f982b.add(rVar);
        linkedHashMap.put(str, fVar);
        return new g(this, str, aVar, 0);
    }

    public final g d(String str, c.a aVar, b bVar) {
        e(str);
        this.f991e.put(str, new e(aVar, bVar));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.f992g;
        ActivityResult activityResult = (ActivityResult) e4.a.G(bundle, str);
        if (activityResult != null) {
            bundle.remove(str);
            bVar.a(aVar.c(activityResult.f, activityResult.f249g));
        }
        return new g(this, str, aVar, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f988b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : new x3.a(new h3.e(1, new q(3)))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f987a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.f990d.contains(str) && (num = (Integer) this.f988b.remove(str)) != null) {
            this.f987a.remove(num);
        }
        this.f991e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f992g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) e4.a.G(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f989c;
        f fVar = (f) linkedHashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f982b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                fVar.f981a.b((r) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
