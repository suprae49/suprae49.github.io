package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class GmsVersion {

    @KeepForSdk
    public static final int VERSION_HALLOUMI = 4100000;

    @KeepForSdk
    public static final int VERSION_JARLSBERG = 4300000;

    @KeepForSdk
    public static final int VERSION_KENAFA = 4400000;

    @KeepForSdk
    public static final int VERSION_LONGHORN = 5000000;

    @KeepForSdk
    public static final int VERSION_MANCHEGO = 6000000;

    @KeepForSdk
    public static final int VERSION_ORLA = 7000000;

    @KeepForSdk
    public static final int VERSION_PARMESAN = 7200000;

    @KeepForSdk
    public static final int VERSION_QUESO = 7500000;

    @KeepForSdk
    public static final int VERSION_REBLOCHON = 7800000;

    @KeepForSdk
    public static final int VERSION_SAGA = 8000000;

    private GmsVersion() {
    }

    @KeepForSdk
    public static boolean isAtLeastFenacho(int i4) {
        return i4 >= 3200000;
    }
}
