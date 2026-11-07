package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
final class zzax extends zzba {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzbb zzbbVar, GoogleApiClient googleApiClient, boolean z4) {
        super(googleApiClient);
        this.zza = z4;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        zzdz zzdzVar = (zzdz) anyClient;
        if (this.zza) {
            zzdzVar.zzy(zzbb.zza(this));
        } else {
            zzdzVar.zzz(zzbb.zza(this));
        }
    }
}
