package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p.f;
import p.g;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k2, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9) {
        Map mapZza = zza(6, false);
        mapZza.put(k2, v4);
        mapZza.put(k4, v5);
        mapZza.put(k5, v6);
        mapZza.put(k6, v7);
        mapZza.put(k7, v8);
        mapZza.put(k8, v9);
        return Collections.unmodifiableMap(mapZza);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZza = zza(length, false);
        for (int i4 = 0; i4 < kArr.length; i4++) {
            mapZza.put(kArr[i4], vArr[i4]);
        }
        return Collections.unmodifiableMap(mapZza);
    }

    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i4) {
        return i4 == 0 ? new g(0) : zzb(i4, true);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t4 = tArr[0];
            T t5 = tArr[1];
            Set setZzb = zzb(2, false);
            setZzb.add(t4);
            setZzb.add(t5);
            return Collections.unmodifiableSet(setZzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZzb2 = zzb(length, false);
            Collections.addAll(setZzb2, tArr);
            return Collections.unmodifiableSet(setZzb2);
        }
        T t6 = tArr[0];
        T t7 = tArr[1];
        T t8 = tArr[2];
        T t9 = tArr[3];
        Set setZzb3 = zzb(4, false);
        setZzb3.add(t6);
        setZzb3.add(t7);
        setZzb3.add(t8);
        setZzb3.add(t9);
        return Collections.unmodifiableSet(setZzb3);
    }

    private static Map zza(int i4, boolean z4) {
        return i4 <= 256 ? new f(i4) : new HashMap(i4, 1.0f);
    }

    private static Set zzb(int i4, boolean z4) {
        if (i4 <= (true != z4 ? 256 : 128)) {
            return new g(i4);
        }
        return new HashSet(i4, true != z4 ? 1.0f : 0.75f);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T t4) {
        return Collections.singletonList(t4);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k2, V v4, K k4, V v5, K k5, V v6) {
        Map mapZza = zza(3, false);
        mapZza.put(k2, v4);
        mapZza.put(k4, v5);
        mapZza.put(k5, v6);
        return Collections.unmodifiableMap(mapZza);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T t4, T t5, T t6) {
        Set setZzb = zzb(3, false);
        setZzb.add(t4);
        setZzb.add(t5);
        setZzb.add(t6);
        return Collections.unmodifiableSet(setZzb);
    }
}
