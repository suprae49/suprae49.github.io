package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class zzan {
    public static int zza(int i4) {
        boolean z4 = true;
        if (i4 != 100 && i4 != 102 && i4 != 104) {
            if (i4 == 105) {
                i4 = 105;
            } else {
                z4 = false;
            }
        }
        Preconditions.checkArgument(z4, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i4));
        return i4;
    }

    public static String zzb(int i4) {
        if (i4 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i4 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i4 == 104) {
            return "LOW_POWER";
        }
        if (i4 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
