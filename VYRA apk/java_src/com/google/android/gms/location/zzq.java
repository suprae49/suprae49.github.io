package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class zzq {
    public static int zza(int i4) {
        boolean z4 = true;
        if (i4 != 0 && i4 != 1) {
            if (i4 == 2) {
                i4 = 2;
            } else {
                z4 = false;
            }
        }
        Preconditions.checkArgument(z4, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i4));
        return i4;
    }

    public static String zzb(int i4) {
        if (i4 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i4 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i4 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
