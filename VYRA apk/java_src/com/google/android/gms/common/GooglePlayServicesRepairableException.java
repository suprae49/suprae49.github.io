package com.google.android.gms.common;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i4, String str, Intent intent) {
        super(str, intent);
        this.zza = i4;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
