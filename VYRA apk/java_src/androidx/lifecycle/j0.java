package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1.b f832e;

    public j0(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f828a = linkedHashMap;
        this.f829b = new LinkedHashMap();
        this.f830c = new LinkedHashMap();
        this.f831d = new LinkedHashMap();
        this.f832e = new androidx.activity.f(3, this);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(j0 j0Var) {
        Map mapSingletonMap;
        String str;
        LinkedHashMap linkedHashMap = j0Var.f828a;
        LinkedHashMap linkedHashMap2 = j0Var.f829b;
        linkedHashMap2.getClass();
        int size = linkedHashMap2.size();
        if (size == 0) {
            mapSingletonMap = h3.n.f;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(linkedHashMap2);
        } else {
            Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
            mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            mapSingletonMap.getClass();
        }
        Iterator it = mapSingletonMap.entrySet().iterator();
        do {
            int i4 = 0;
            if (!it.hasNext()) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str2 : setKeySet) {
                    arrayList.add(str2);
                    arrayList2.add(linkedHashMap.get(str2));
                }
                g3.b[] bVarArr = {new g3.b("keys", arrayList), new g3.b("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i4 < 2) {
                    g3.b bVar = bVarArr[i4];
                    String str3 = (String) bVar.f;
                    Object obj = bVar.f2150g;
                    if (obj == null) {
                        bundle.putString(str3, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str3, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str3, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str3, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str3, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str3, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str3, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str3, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str3, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str3, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str3, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str3, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str3, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str3, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str3, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str3, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str3, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str3, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str3, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str3, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        componentType.getClass();
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str3, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str3, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str3, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str3 + '\"');
                            }
                            bundle.putSerializable(str3, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str3, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        bundle.putBinder(str3, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        bundle.putSize(str3, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str3 + '\"');
                        }
                        bundle.putSizeF(str3, (SizeF) obj);
                    }
                    i4++;
                }
                return bundle;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            str = (String) entry2.getKey();
            Bundle bundleA = ((l1.b) entry2.getValue()).a();
            str.getClass();
            if (bundleA != null) {
                while (true) {
                    if (i4 >= 29) {
                        throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
                    }
                    Class cls = f[i4];
                    cls.getClass();
                    if (cls.isInstance(bundleA)) {
                        break;
                    }
                    i4++;
                }
            }
            Object obj2 = j0Var.f830c.get(str);
            a0 a0Var = obj2 instanceof a0 ? (a0) obj2 : null;
            if (a0Var != null) {
                a0Var.e(bundleA);
            } else {
                linkedHashMap.put(str, bundleA);
            }
        } while (j0Var.f831d.get(str) == null);
        androidx.fragment.app.q.c();
        return null;
    }

    public j0() {
        this.f828a = new LinkedHashMap();
        this.f829b = new LinkedHashMap();
        this.f830c = new LinkedHashMap();
        this.f831d = new LinkedHashMap();
        this.f832e = new androidx.activity.f(3, this);
    }
}
