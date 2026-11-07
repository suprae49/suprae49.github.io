package com.google.android.gms.internal.common;

import androidx.fragment.app.u;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@NullMarked
public final class zzah {
    public static Object[] zza(Object[] objArr, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(u.k(i5, "at index "));
            }
        }
        return objArr;
    }
}
