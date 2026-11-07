package p;

import androidx.fragment.app.q;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class j {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final q.b lock;
    private final q.c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public j(int i4) {
        this.maxSize = i4;
        if (i4 <= 0) {
            q.q("maxSize <= 0");
            throw null;
        }
        this.map = new q.c();
        this.lock = new q.b();
    }

    public final int a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public Object create(Object obj) {
        obj.getClass();
        return null;
    }

    public final int createCount() {
        int i4;
        synchronized (this.lock) {
            i4 = this.createCount;
        }
        return i4;
    }

    public void entryRemoved(boolean z4, Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i4;
        synchronized (this.lock) {
            i4 = this.evictionCount;
        }
        return i4;
    }

    public final Object get(Object obj) {
        Object objPut;
        obj.getClass();
        synchronized (this.lock) {
            q.c cVar = this.map;
            cVar.getClass();
            Object obj2 = cVar.f3363a.get(obj);
            if (obj2 != null) {
                this.hitCount++;
                return obj2;
            }
            this.missCount++;
            Object objCreate = create(obj);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    objPut = this.map.f3363a.put(obj, objCreate);
                    if (objPut != null) {
                        this.map.f3363a.put(obj, objPut);
                    } else {
                        this.size += a(obj, objCreate);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                entryRemoved(false, obj, objCreate, objPut);
                return objPut;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final int hitCount() {
        int i4;
        synchronized (this.lock) {
            i4 = this.hitCount;
        }
        return i4;
    }

    public final int maxSize() {
        int i4;
        synchronized (this.lock) {
            i4 = this.maxSize;
        }
        return i4;
    }

    public final int missCount() {
        int i4;
        synchronized (this.lock) {
            i4 = this.missCount;
        }
        return i4;
    }

    public final Object put(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        obj2.getClass();
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(obj, obj2);
            objPut = this.map.f3363a.put(obj, obj2);
            if (objPut != null) {
                this.size -= a(obj, objPut);
            }
        }
        if (objPut != null) {
            entryRemoved(false, obj, objPut, obj2);
        }
        trimToSize(this.maxSize);
        return objPut;
    }

    public final int putCount() {
        int i4;
        synchronized (this.lock) {
            i4 = this.putCount;
        }
        return i4;
    }

    public final Object remove(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.lock) {
            q.c cVar = this.map;
            cVar.getClass();
            objRemove = cVar.f3363a.remove(obj);
            if (objRemove != null) {
                this.size -= a(obj, objRemove);
            }
        }
        if (objRemove != null) {
            entryRemoved(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public void resize(int i4) {
        if (i4 <= 0) {
            q.q("maxSize <= 0");
            return;
        }
        synchronized (this.lock) {
            this.maxSize = i4;
        }
        trimToSize(i4);
    }

    public final int size() {
        int i4;
        synchronized (this.lock) {
            i4 = this.size;
        }
        return i4;
    }

    public int sizeOf(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            Set<Map.Entry> setEntrySet = this.map.f3363a.entrySet();
            setEntrySet.getClass();
            for (Map.Entry entry : setEntrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i4 = this.hitCount;
                int i5 = this.missCount + i4;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i5 != 0 ? (i4 * 100) / i5 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public void trimToSize(int i4) {
        Object next;
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.f3363a.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size > i4 && !this.map.f3363a.isEmpty()) {
                        Set setEntrySet = this.map.f3363a.entrySet();
                        setEntrySet.getClass();
                        if (setEntrySet instanceof List) {
                            List list = (List) setEntrySet;
                            next = list.isEmpty() ? null : list.get(0);
                        } else {
                            Iterator it = setEntrySet.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        q.c cVar = this.map;
                        cVar.getClass();
                        key.getClass();
                        cVar.f3363a.remove(key);
                        this.size -= a(key, value);
                        this.evictionCount++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }
}
