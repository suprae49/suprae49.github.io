package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m.a f865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f868e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f870h;

    public v(t tVar) {
        new AtomicReference();
        this.f864a = true;
        this.f865b = new m.a();
        this.f866c = n.f842g;
        this.f870h = new ArrayList();
        this.f867d = new WeakReference(tVar);
    }

    @Override // androidx.lifecycle.o
    public final void a(s sVar) {
        r reflectiveGenericLifecycleObserver;
        Object obj;
        t tVar;
        m mVar;
        d("addObserver");
        n nVar = this.f866c;
        n nVar2 = n.f;
        if (nVar != nVar2) {
            nVar2 = n.f842g;
        }
        u uVar = new u();
        HashMap map = w.f871a;
        boolean z4 = sVar instanceof r;
        boolean z5 = sVar instanceof e;
        if (z4 && z5) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((e) sVar, (r) sVar);
        } else if (z5) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((e) sVar, null);
        } else if (z4) {
            reflectiveGenericLifecycleObserver = (r) sVar;
        } else {
            Class<?> cls = sVar.getClass();
            if (w.c(cls) == 2) {
                Object obj2 = w.f872b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    w.a((Constructor) list.get(0), sVar);
                    throw null;
                }
                int size = list.size();
                h[] hVarArr = new h[size];
                if (size > 0) {
                    w.a((Constructor) list.get(0), sVar);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(hVarArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(sVar);
            }
        }
        uVar.f863b = reflectiveGenericLifecycleObserver;
        uVar.f862a = nVar2;
        m.a aVar = this.f865b;
        m.c cVarA = aVar.a(sVar);
        if (cVarA != null) {
            obj = cVarA.f3043g;
        } else {
            HashMap map2 = aVar.f3040j;
            m.c cVar = new m.c(sVar, uVar);
            aVar.f3050i++;
            m.c cVar2 = aVar.f3048g;
            if (cVar2 == null) {
                aVar.f = cVar;
                aVar.f3048g = cVar;
            } else {
                cVar2.f3044h = cVar;
                cVar.f3045i = cVar2;
                aVar.f3048g = cVar;
            }
            map2.put(sVar, cVar);
            obj = null;
        }
        if (((u) obj) == null && (tVar = (t) this.f867d.get()) != null) {
            boolean z6 = this.f868e != 0 || this.f;
            n nVarC = c(sVar);
            this.f868e++;
            while (uVar.f862a.compareTo(nVarC) < 0 && this.f865b.f3040j.containsKey(sVar)) {
                n nVar3 = uVar.f862a;
                ArrayList arrayList = this.f870h;
                arrayList.add(nVar3);
                k kVar = m.Companion;
                n nVar4 = uVar.f862a;
                kVar.getClass();
                nVar4.getClass();
                int iOrdinal = nVar4.ordinal();
                if (iOrdinal == 1) {
                    mVar = m.ON_CREATE;
                } else if (iOrdinal != 2) {
                    mVar = iOrdinal != 3 ? null : m.ON_RESUME;
                } else {
                    mVar = m.ON_START;
                }
                if (mVar == null) {
                    throw new IllegalStateException("no event up from " + uVar.f862a);
                }
                uVar.a(tVar, mVar);
                arrayList.remove(arrayList.size() - 1);
                nVarC = c(sVar);
            }
            if (!z6) {
                g();
            }
            this.f868e--;
        }
    }

    @Override // androidx.lifecycle.o
    public final void b(s sVar) {
        sVar.getClass();
        d("removeObserver");
        this.f865b.b(sVar);
    }

    public final n c(s sVar) {
        u uVar;
        HashMap map = this.f865b.f3040j;
        m.c cVar = map.containsKey(sVar) ? ((m.c) map.get(sVar)).f3045i : null;
        n nVar = (cVar == null || (uVar = (u) cVar.f3043g) == null) ? null : uVar.f862a;
        ArrayList arrayList = this.f870h;
        n nVar2 = arrayList.isEmpty() ? null : (n) arrayList.get(arrayList.size() - 1);
        n nVar3 = this.f866c;
        nVar3.getClass();
        if (nVar == null || nVar.compareTo(nVar3) >= 0) {
            nVar = nVar3;
        }
        return (nVar2 == null || nVar2.compareTo(nVar) >= 0) ? nVar : nVar2;
    }

    public final void d(String str) {
        if (this.f864a) {
            ((l.a) l.a.o0().f2974h).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(androidx.fragment.app.u.m("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(m mVar) {
        mVar.getClass();
        d("handleLifecycleEvent");
        f(mVar.a());
    }

    public final void f(n nVar) {
        n nVar2 = this.f866c;
        if (nVar2 == nVar) {
            return;
        }
        n nVar3 = n.f842g;
        n nVar4 = n.f;
        if (nVar2 == nVar3 && nVar == nVar4) {
            StringBuilder sb = new StringBuilder("no event down from ");
            sb.append(this.f866c);
            Object obj = this.f867d.get();
            sb.append(" in component ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.f866c = nVar;
        if (this.f || this.f868e != 0) {
            this.f869g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.f866c == nVar4) {
            this.f865b = new m.a();
        }
    }

    public final void g() {
        m mVar;
        m mVar2;
        t tVar = (t) this.f867d.get();
        if (tVar == null) {
            androidx.fragment.app.q.j("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            m.a aVar = this.f865b;
            if (aVar.f3050i != 0) {
                m.c cVar = aVar.f;
                cVar.getClass();
                n nVar = ((u) cVar.f3043g).f862a;
                m.c cVar2 = this.f865b.f3048g;
                cVar2.getClass();
                n nVar2 = ((u) cVar2.f3043g).f862a;
                if (nVar == nVar2 && this.f866c == nVar2) {
                    break;
                }
                this.f869g = false;
                n nVar3 = this.f866c;
                m.c cVar3 = this.f865b.f;
                cVar3.getClass();
                int iCompareTo = nVar3.compareTo(((u) cVar3.f3043g).f862a);
                ArrayList arrayList = this.f870h;
                if (iCompareTo < 0) {
                    m.a aVar2 = this.f865b;
                    m.b bVar = new m.b(aVar2.f3048g, aVar2.f, 1);
                    aVar2.f3049h.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f869g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        entry.getClass();
                        s sVar = (s) entry.getKey();
                        u uVar = (u) entry.getValue();
                        while (uVar.f862a.compareTo(this.f866c) > 0 && !this.f869g && this.f865b.f3040j.containsKey(sVar)) {
                            k kVar = m.Companion;
                            n nVar4 = uVar.f862a;
                            kVar.getClass();
                            nVar4.getClass();
                            int iOrdinal = nVar4.ordinal();
                            if (iOrdinal == 2) {
                                mVar2 = m.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                mVar2 = iOrdinal != 4 ? null : m.ON_PAUSE;
                            } else {
                                mVar2 = m.ON_STOP;
                            }
                            if (mVar2 == null) {
                                throw new IllegalStateException("no event down from " + uVar.f862a);
                            }
                            arrayList.add(mVar2.a());
                            uVar.a(tVar, mVar2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                m.c cVar4 = this.f865b.f3048g;
                if (!this.f869g && cVar4 != null && this.f866c.compareTo(((u) cVar4.f3043g).f862a) > 0) {
                    m.a aVar3 = this.f865b;
                    aVar3.getClass();
                    m.d dVar = new m.d(aVar3);
                    aVar3.f3049h.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f869g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        s sVar2 = (s) entry2.getKey();
                        u uVar2 = (u) entry2.getValue();
                        while (uVar2.f862a.compareTo(this.f866c) < 0 && !this.f869g && this.f865b.f3040j.containsKey(sVar2)) {
                            arrayList.add(uVar2.f862a);
                            k kVar2 = m.Companion;
                            n nVar5 = uVar2.f862a;
                            kVar2.getClass();
                            nVar5.getClass();
                            int iOrdinal2 = nVar5.ordinal();
                            if (iOrdinal2 == 1) {
                                mVar = m.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                mVar = iOrdinal2 != 3 ? null : m.ON_RESUME;
                            } else {
                                mVar = m.ON_START;
                            }
                            if (mVar == null) {
                                throw new IllegalStateException("no event up from " + uVar2.f862a);
                            }
                            uVar2.a(tVar, mVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f869g = false;
    }
}
